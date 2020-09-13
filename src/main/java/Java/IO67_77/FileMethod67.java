package Java.IO67_77;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类
 *
 * I/O : Input / Output
 */
public class FileMethod67 {
    public static void main(String[] args) throws IOException, ParseException {
        String separator = File.separator; //表示 '/'


        //创建文件 参数为路径名
        File file = new File("/Users/qujianhua/Documents/pom.xml");
        File file1 = new File("/Users/qujianhua/Documents/pom.xml");

        File newFile = new File("/Users/qujianhua/Documents/JavaIO/data");

        //在文件夹下创建文件
        //newFile.createNewFile();

        //在文件夹下创建文件夹 如果上级目录不存在则无法创建
        newFile.mkdir();

        //在文件夹下创建文件夹 如果上级目录不存在则先创建上级目录
        newFile.mkdirs();

        //删除文件
        newFile.delete();

        //路径是否存在
        file.exists(); //true

        //是否为文件
        file.isFile(); //true

        //是否为文件夹
        file.isDirectory(); //false

        //重命名文件
        file.renameTo(file1);

        //获取文件字节大小 不能获取文件夹大小
        file.length();

        //获取文件名
        System.out.println(file.getName()); //pom.xml

        //获取文件路径 ..会省略
        System.out.println(file.getPath());

        //获取路径 规范路径 ..不省略
        System.out.println(file.getCanonicalPath());

        //获取文件父类路径(不包含文件名)
        System.out.println(file.getParent());


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        System.out.println(simpleDateFormat.parse("2020-01-01"));

        //调用查询大小方法
        long l = dirLength(new File("/Users/qujianhua/Documents/IO测试"));
        System.out.println(l);

        //调用删除文件夹方法
        deleteDir(new File("/Users/qujianhua/Documents/IO测试"));
    }

    /**
     * 递归查询文件夹大小
     */
    public static long dirLength(File file){

        //判断是否为文件夹 如果不是直接返回大小
        if (file.isFile()){
            return file.length();
        }else if (file.isDirectory()){
            //如果是文件夹 获取子文件夹的内容,递归查询
            File[] files = file.listFiles();
            long sum = 0;

            for (File f : files){
                sum += dirLength(f);
            }
            return sum;
        }else return 0;
    }

    /**
     * 递归删除文件夹中的文件并删除此文件夹
     */
    public static void deleteDir(File file){
        if (file.isFile()){
            file.delete();
        }else if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f:files){
                deleteDir(f);
            }
        }
        file.delete();
    }
}
