package ThinkingInJava;

import java.io.File;

/**
 * @Author: Lance
 * @Date: 2018/7/21 11:36
 */

public class FileFilter {

    public static void main(String[] args) {

        File file = new File("F:\\test");

        File[] filelist = file.listFiles(new MyFileFilter());

        for (File f : filelist) {

            System.out.println(f);

        }

    }

}
