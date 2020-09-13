package Java.IO67_77;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * InputStream: 标准字节输入流
 * OutputStream: 标准字节输出流
 * Reader: 字符输入流
 * Writer: 字符输出流
 *
 * 文件:
 * FileInputStream: 文件字节输入流
 * FileOutputStream: 文件字节输出流
 * FileReader: 文件字符输入流
 * FileWriter: 文件字符输出流
 *
 * 缓冲:
 * BufferedInputStream: 字节缓冲输入流
 * BufferedOutputStream: 字节缓冲输出流
 * BufferedReader: 字符缓冲输入流
 * BufferedWriter: 字符缓冲输出流
 *
 * 打印流(只有输出):
 * PrintStream: 字节打印流
 * PrintWriter: 字符打印流
 *
 * InputStreamReader: 将字符按指定编码转为字节
 * OutputStreamWriter: 将字节按指定解码转为字符
 *
 * DataInputStream: 数据输入流
 * DataOutputStream: 数据输出流
 *
 * ObjectInputStream: 对象输入流
 * ObjectOutputStream: 对象输出流
 */
public class FileInputStream68 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/qujianhua/Documents/无标题.txt"); //填文件路径 或 File对象
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //创建字节数组
        byte[] bytes = new byte[1024];
        //定义变量,标记每次读的字节长度
        int len;
        //调用输入流的read()方法 开始循环读取文件,如果读取结束,read()方法返回-1
        //每读一次将上次读取的字节数组内容覆盖,每次读取的长度赋值给len
        while ((len = fis.read(bytes)) != -1){
            //从数组下标0开始,到len长度,将字节数组转成String
            String s = new String(bytes,0,len);
            System.out.print(s);
        }

        //关闭流
        fis.close();
    }
}
