package Test.读取文件;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @Author: Lance
 * @Date: 2018/8/10 15:24
 */
public class Test
{
    public static void main(String[] args) throws Exception
    {
        String file = args[0];
        String outFile = args[1];

        createFile(outFile);
        readTxt(file, outFile);

    }

    public static void readTxt(String file, String outFile) throws Exception
    {
        List<String> allLines = Files.readAllLines(Paths.get(file));
        for (String line : allLines)
        {
            String[] temp = line.split("：：：");
            System.out.println(temp.length);
            write(outFile, temp);
        }
    }

    public static void write(String outFile, String[] temp) throws Exception
    {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile, true)));
        bufferedWriter.write("CDSS_" + temp[0] + "(" + temp[0] + "," + "\"" + temp[1] + "\"" + "," + "\"" + temp[2] + "\"" + ")" + "," + "\r\n");
        bufferedWriter.close();

    }

    private static void createFile(String filePath) throws IOException
    {
        File file = new File(filePath);
        if (file.exists())
        {
            file.delete();
        }

        file.createNewFile();

    }

}
