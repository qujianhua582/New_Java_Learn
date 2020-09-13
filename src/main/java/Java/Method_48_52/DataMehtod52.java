package Java.Method_48_52;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date  第一版
 * Calendar 第二版
 * SimpleDataFormat 第三版
 */
public class DataMehtod52 {
    /**
     * Date
     */
    @Test
    public void test1(){
        Date date = new Date();

        //返回当前系统时间  Tue Aug 04 23:32:08 CST 2020
        System.out.println(date);

        //返回当前系统时间的时间戳  毫秒级
        System.out.println(date.getTime());

        //时间戳转系统时间  毫秒时间是 long
        System.out.println(new Date(1596555165302L));
    }

    /**
     * Calendar
     */
    @Test
    public void test2(){
        //按默认时区获取当前时间  可以指定时区
        Calendar calendar = Calendar.getInstance();

        //时间详细信息
        //java.util.GregorianCalendar[time=1596555373303,areFieldsSet=true,areAllFieldsSet=true....
        System.out.println(calendar);

        //Tue Aug 04 23:32:08 CST 2020
        System.out.println(calendar.getTime());

        //获取年,月,日
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)); //月份从0开始
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

    }

    /**
     * 日期格式化问题1 2020-08-04 02:01:34 345 转为时间戳 或 Tue Aug 04 23:32:08 CST 2020
     */
    @Test
    public void test3() throws ParseException {
        String s = "2020-08-04 02:01:34 345";

        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

        //转Tue Aug 04 23:32:08 CST 2020
        Date date = DateFormat.parse(s);

        //转时间戳
        System.out.println(date.getTime());

        System.out.println(date);
    }

    /**
     * 日期格式化问题2 时间戳 或 Tue Aug 04 23:32:08 CST 2020 转为 2020-08-04 02:01:34 345
     */
    @Test
    public void test4() throws ParseException {
        Long time = 1596477694345L;

        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");

        //格式化 先转Date 再格式化
        String date = DateFormat.format(new Date(time));

        System.out.println(date);
    }
}
