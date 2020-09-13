package Java.Other_40_47;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 使用  @Test  测试
 *
 * 在方法名上是运营此测试方法  在其他地方是运行所有的测试方法
 *
 * @Before: 在每个@Test标记的方法之前运行
 * @After: 在每个@Test标记的方法之后运行
 * @BeforeClass: 在类初始化时执行一次 方法必须是静态方法
 * @AfterClass: 在所有方法执行结束之后执行一次 方法必须是静态方法
 *
 * 白盒测试:程序员自测,需明确知道代码功能
 * 黑盒测试:测试人员测,无需明确知道代码功能
 */
public class TestModel41 {
    @BeforeClass
    public static void staticTest(){
        System.out.println("初始化");
    }

    @Before
    public void beforeTest(){
        System.out.println("***************");
    }

    @Test
    public void name(){
        System.out.println("用户名");
    }

    @Test
    public void age(){
        System.out.println("年龄");
    }
}
