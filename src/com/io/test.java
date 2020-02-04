package com.io;

import java.io.*;
import java.nio.charset.Charset;

public class test {
    public static void main(String[] args) {
        //字节流输入
        File file=new File("E:\\视频or图片\\text.txt");
        InputStream is=null;
        /*try {
            is=new FileInputStream(file);
            byte[] bytes=new byte[(int)file.length()];
            is.read(bytes);
            System.out.println(new String(bytes, Charset.forName("utf-8")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        //字节输出流
        OutputStream outputStream=null;
        try {
            outputStream=new FileOutputStream(file,true);
            outputStream.write("asdsad".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  }

