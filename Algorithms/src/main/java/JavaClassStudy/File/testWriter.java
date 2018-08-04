package JavaClassStudy.File;

import java.io.*;

/**
 * @Author: Lance
 * @Date: 2018/7/19 16:11
 */
public class testWriter {
    public static void main(String[] args) {
        write02("F:\\1.txt","123","456");
        write02("F:\\1.txt","123","456");
    }

    public static void write02(String file, String valueOfJOut, String valueOfCOut) {

        try {
            BufferedWriter input = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            input.write("JavaOutput: " + valueOfJOut + "\r\n");
            input.write("COutput: " + valueOfCOut + "\r\n");
            input.newLine();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
