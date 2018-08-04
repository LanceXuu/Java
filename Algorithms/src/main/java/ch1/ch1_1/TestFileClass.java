package ch1.ch1_1;

import ThinkingInJava.IOException;

import java.io.File;

/**
 * @Author: Lance
 * @Date: 2018/7/19 10:00
 */
public class TestFileClass {

    public static void main(String[] args) throws java.io.IOException {
        new TestFileClass().function_1();
    }

    public void function_1() throws java.io.IOException {
        File file = new File("F:\\File");
        if (file.exists()) {
            file.listFiles();
            for (File f : file.listFiles()) {
                System.out.println(f);
                File file1 = new File("F:\\File\\新建文本文檔");
                System.out.println(file1.delete());
            }
            file.delete();
        }
        System.out.println(file.createNewFile());
    }
}
