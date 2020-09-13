package Java.IO67_77;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * 按行读取 BufferedInputStream   readLine()
 */
public class ReadLine75 {
    public static void main(String[] args) {
        try(
                BufferedReader fis = new BufferedReader(new FileReader("/Users/qujianhua/Documents/无标题.txt"));
                ) {
            String s;

            while ((s = fis.readLine()) != null){
                System.out.println(s);
            }
        }catch (IOException e){
            System.out.println("异常");
        }
    }
}
