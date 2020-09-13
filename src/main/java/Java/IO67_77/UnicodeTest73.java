package Java.IO67_77;

import java.io.*;

/**
 * IO流字符的编码和解码  只有为中文文本时会出现乱码问题
 *
 * 编码: 将字符转为字节数组
 *  ① InputStreamReader(字节流,"字符编码")
 *  ② new String(byte[] bytes, int offset, int count,"字符编码")
 *
 * 解码: 将字节数组转为字符
 *  ① OutputStreamWriter(字节流,"字符编码")
 *  ② new String(byte[] bytes, int offset, int count,"字符编码")
 *
 * InputStreamReader: 将字符按指定编码转为字节
 * OutputStreamWriter: 将字节按指定解码转为字符
 */
public class UnicodeTest73 {
    public static void main(String[] args) {
        //将UTF-8格式的文件 赋值 并转为GBK格式
        try(
           FileInputStream fis = new FileInputStream("/Users/qujianhua/Documents/无标题.txt");
           FileOutputStream fos = new FileOutputStream("/Users/qujianhua/Downloads/无标题.txt");
           //按什么编码写入 由 UTF-8 --> GBK
           InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
           OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
           ){
            char[] chars = new char[1024];
            int len;

            while ((len = isr.read(chars)) != -1){
                osw.write(chars,0,len);
            }
        }catch (IOException o){
            System.out.println("复制失败");
        }
    }
}
