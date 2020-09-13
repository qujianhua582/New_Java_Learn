package Java.IO67_77;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * try with   会自动关闭
 * 语法格式:
 *
 * try(
 *  资源列表
 * ){
 *     ....代码
 * }catch (异常 e){
 *     ....
 * }
 */
public class TryWith72 {
    public static void main(String[] args) {

        try(
            FileInputStream fis = new FileInputStream("/Users/qujianhua/Documents/无标题.txt");
            FileOutputStream fos = new FileOutputStream("/Users/qujianhua/Downloads/无标题.txt");
            ) {
            byte[] bytes = new byte[1024];
            int len;

            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
