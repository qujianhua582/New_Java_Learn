package Java.IO67_77;

import java.io.*;

/**
 * 数据输入流 DataInputStream
 * 数据输出流 DataOutputStream
 *
 * 将数据写入文件 是序列化
 * 从文件中解析出 是反序列化
 *
 * DataInputStream / DataOutputStream
 * 数据写入顺序和读取顺序必须一致
 */
public class DataInOutStream76 {
    public static void main(String[] args) {
        String name = "张三";
        int age = 18;
        char gender = '男';

        try( //将数据写入文件 是序列化
             DataOutputStream dis = new DataOutputStream(new FileOutputStream("/Users/qujianhua/shjjj.txt"));
                ){
                dis.writeUTF(name);
                dis.writeInt(age);
                dis.writeChar(gender);
        }catch (IOException e){
            System.err.println("异常");
        }

        //反序列化
        try( //将数据写入文件 是序列化
             DataInputStream dis = new DataInputStream(new FileInputStream("/Users/qujianhua/shjjj.txt"));
        ){
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
        }catch (IOException e){
            System.err.println("异常");
        }
    }
}