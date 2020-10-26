package com.zjl.study.week4;

import java.io.*;

/**
 * @ClassName FileCopyDemo
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/26
 **/
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("C:/Users/zjl/Pictures/1.png");
        InputStream is = new FileInputStream(inputFile);
        byte[] b = new byte[(int) inputFile.length()];
        is.read(b);
        File outputFile = new File("C:/Users/zjl/Pictures/111.png");
        OutputStream os = new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}
