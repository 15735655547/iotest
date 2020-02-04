package com.io;

import java.io.*;

public class Test5 {
    public static void main(String[] args) {
        File readerFile=new File("E:\\视频or图片\\text.txt");
        File writeFile=new File("E:\\视频or图片\\a.txt");
        BufferedReader reader=null;
        OutputStream writer=null;
        try {
            reader=new BufferedReader(new FileReader(readerFile));
            writer=new FileOutputStream(writeFile);
            String str=null;
            int a=1;
            while ((str=reader.readLine())!=null){
                System.out.println(a+str);
                a++;
            }reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
