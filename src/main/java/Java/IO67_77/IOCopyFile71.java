package Java.IO67_77;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用IO流 copy文件
 */
public class IOCopyFile71 {
    public static void main(String[] args) throws IOException {
        //创建输入流
        FileInputStream fis = new FileInputStream("/Users/qujianhua/Documents/无标题.txt");
        //创建输出流
        FileOutputStream fos = new FileOutputStream("/Users/qujianhua/Downloads/IO无标题.txt");

        byte[] bytes = new byte[1024];
        int len;
        //开始读取
        while ((len = fis.read(bytes)) != -1){
            //开始写入 调用write()方法
            fos.write(bytes,0,len);
        }
        //刷
        fos.flush();

        //关闭流
        fis.close();
        fos.close();
    }
}
