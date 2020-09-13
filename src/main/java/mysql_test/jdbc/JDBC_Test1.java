package mysql_test.jdbc;

import java.sql.*;

/**
 * JDBC测试 Java DataBase Connectivity
 *
 * 步骤:
 *      ① 加载驱动 -> Class.forName("com.mysql.jdbc.Driver")
 *      ② 使用驱动管理者 与 URL和用户名,密码建立mysql服务器连接 -> url: jdbc:mysql://localhost:3306/数据库名
 *         DriverManager.getConnection(url,username,password)
 *      ③ 创建Statement对象 -> 连接对象名.createStament()
 *      ④ 编写sql insert,update,delete是调用executeUpdate() , select调用executeQuery()
 *         Statement对象名.executeUpdate() / executeQuery()
 *         executeUpdate()返回值是int类型  大于0成功, 否则失败
 *         executeQuery()返回值是ResultSet集合,需遍历 next() -> hashNext() getObject() -> next()
 *         遍历时 getObject(XXX) 可以使用列数获取值(从1开始)  也可使用列名获取
 *      ⑤ 关闭连接
 *         ResultSet()的连接 (如果使用到)
 *         Statement的连接
 *         Connnection的连接
 */
public class JDBC_Test1 {
    public static void main(String[] args) {

        try {
            //① 加载mysql jdbc的驱动
            Class.forName("com.mysql.jdbc.Driver");

            //② url 用户名 密码
            String url = "jdbc:mysql://localhost:3306/studyDB";
            String username = "root";
            String password = "123456";

            //③ 使用驱动管理者建立连接
            Connection connection = DriverManager.getConnection(url, username, password);

            //④ 创建 Statement对象
            Statement st = connection.createStatement();

            //⑤ 编写sql
            String update = "insert into emp values (15,'shangguanshiwu','s')";
            String select = "select * from emp";

            //⑥ 执行sql insert,update,delete 都是executeUpdate 查询是executeQuery
            int resUpdate = st.executeUpdate(update);
            ResultSet resSelect = st.executeQuery(select); //需要遍历

            //判断是否执行成功 executeUpdate的返回值是int >0 添加成功, 否则失败
            System.out.println(resUpdate > 0 ? "添加成功" : "添加失败");
            //判断是否执行成功
            // executeQuery的返回值是集合 需要遍历 next相当于iterator的hasNext() getXXX相当于next()
            while(resSelect.next()){
                System.out.print(resSelect.getObject(1));
                System.out.print("---");
                System.out.print(resSelect.getObject("name"));
                System.out.print("---");
                System.out.print(resSelect.getObject(3));
                System.out.println();
            }

            //⑧ 关闭连接
            resSelect.close();
            st.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
        }
    }
}
