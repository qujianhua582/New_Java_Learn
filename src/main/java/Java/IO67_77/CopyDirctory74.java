package Java.IO67_77;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用IO流复制文件夹
 */
public class CopyDirctory74 {
    public static void main(String[] args) {

        copyDir(new File("/Users/qujianhua/Music"),new File("/Users/qujianhua/Downloads"));
    }

    /**
     * 递归复制文件夹
     */
    public static void copyDir(File srcDir,File destDir){
        //如果srcDir是文件,直接复制到destDir
        if (srcDir.isFile()){
            //在目的文件夹中创建一个文件
            String file = destDir.getPath()+File.separator+srcDir.getName();
            try(
                FileInputStream fis = new FileInputStream(srcDir);
                FileOutputStream fos = new FileOutputStream(file);
                ) {
                byte[] bytes = new byte[1024];
                int len;

                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
            }catch (IOException e){
                System.out.println("失败");
            }
            //如果是文件夹
        }else if (srcDir.isDirectory()){
            String dir = destDir.getPath()+File.separator+srcDir.getName();
            File file = new File(dir);
            //创建文件夹
            file.mkdir();

            //查看源文件夹中是否有子文件夹或文件
            File[] files = srcDir.listFiles();

            //遍历
            for (File f:files){
                //使用递归
                copyDir(f,file);
            }
        }
    }
}
