package ThinkingInJava;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Author: Lance
 * @Date: 2018/7/21 14:49
 */
class MyFileFilter implements FilenameFilter {
    @Override
    public  boolean accept(File dir,String name){

        return name.endsWith(".java");

    }

}
