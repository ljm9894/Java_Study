package kr.hs.dgsw.java.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class IdiotFileReader implements MyFileReader{
    @Override
    public byte[] read(File file) {
        InputStream is = null;

        try{
            is = new FileInputStream(file);
            long length = file.length();
            byte[] result = new byte[(int)length];

            for(int i=0;i<length;i++){
                result[i] = (byte)is.read();
            }

        }catch(Exception e){
            throw new RuntimeException(e);
        }finally {
            if(is!=null){
                try{
                    is.close();
                }catch (Exception e){}
            }
        }

        return new byte[0];
    }

    public static void main(String[] args) {
        MyFileReader reader = new IdiotFileReader();
        File file = new File("C:\\java\\대소고.txt");
        byte[] bytes = reader.read(file);
        System.out.println(Arrays.toString(bytes));
        String str = new String(bytes);
        System.out.println(str);
    }
}
