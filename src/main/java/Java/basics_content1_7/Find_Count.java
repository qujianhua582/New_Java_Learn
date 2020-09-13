package Java.basics_content1_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_Count {
    public static void main(String[] args) {
        System.out.println(appearNumber("1231","1"));
    }

    public static String content(String srcText, String findText){
        int count = appearNumber(srcText,findText);
        String goods_id = "";
        for (int i = 1;i <= count;i++){
            srcText.indexOf(goods_id);
        }
        return "";
    }

    public static int appearNumber(String srcText, String findText) {
        int count = 0;
        //需要找的内容
        Pattern p = Pattern.compile(findText);
        //源文件
        Matcher m = p.matcher(srcText);
        while (m.find()) {
            count++;
        }
        return count;
    }
}

