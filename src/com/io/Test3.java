package com.io;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        File file=new File("E:\\视频or图片\\text.txt");
        char[] chars=new char[78945];
        Reader reader=null;
        Writer writer=null;
        try {
            reader=new FileReader(file);
            writer=new FileWriter(file);
            int a=reader.read(chars);
            while (a!=1){
                writer.write(new String(chars),0,a);
                a=reader.read(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
