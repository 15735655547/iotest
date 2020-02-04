package com.io;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        File file=new File("E:\\视频or图片\\text.txt");
        //字符流输出
       /* Writer writer=null;
        try {
            writer = new FileWriter(file,true);
            writer.write("zhcuz,挖坑的胡");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
       //字符流输入
        Reader reader=null;
        try {
            reader=new FileReader(file);
            char[] chars=new char[(int)file.length()];
            reader.read(chars);
            System.out.println(new String(chars));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
