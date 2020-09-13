package Java.Method_48_52;

/**
 * 字符串是常量,内容不可以被更改  如果更改,地址值会发生变化
 * 字符串不可以被继承,是final修饰的
 *
 * UTF-8 3个字节
 * GBK 2个字节
 */
public class StringMethod48 {
    public static void main(String[] args) {
        String s = "qujianhua";
        String s1 = "qujianhuA";

        //比较字符串是否相同
        s.equals(s1);

        //比较字符串是否相同较 不区分大小写
        s.equalsIgnoreCase(s1);

        //转大写
        s.toUpperCase();

        //转小写
        s.toLowerCase();

        //比较两个字符串的大小 按字典顺序比较两个字符串 相等返回0 大于返回正数 小于返回负数
        s.compareTo(s1);

        //比较两个字符串的大小(不区分大小写) 按字典顺序比较两个字符串 相等返回0 大于返回正数 小于返回负数
        s.compareToIgnoreCase(s1);

        //获取指定位置的字符
        s.charAt(0);

        //拼接
        s.concat(s1);

        //是否包含
        s.contains(s1);

        //是否已xx开头
        s.startsWith("q");

        //是否已xx结尾
        s.endsWith("a");

        //返回hash码
        s.hashCode();

        //第一次出现的下标
        s.indexOf("a");

        //最后一次出现的下标
        s.lastIndexOf("a");

        //是否为空
        s.isEmpty();

        //字符串长度
        s.length();

        //将指定第一次出现的字符串替换为给定字符串
        s.replaceFirst("u","ac");

        //将指定字符串替换为给定字符串
        s.replace("u","ac");

        //按指定字符串切割 返回数组
        s.split("u",-1);

        //去除开头和结尾的空格
        s.trim();

        //截取 左闭右开
        s.substring(0,1);

        //使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        s.getBytes(); //转字节编码

        //格式化
        String.format(s, "%");

    }
}
