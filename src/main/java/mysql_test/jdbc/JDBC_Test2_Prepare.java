package mysql_test.jdbc;

import java.sql.*;

/**
 * PreparedStatement
 *
 * Statement 是 PerparedStatement的父类
 */
public class JDBC_Test2_Prepare {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet s = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //创建连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studyDB","root","123456");

            //创建PreparedStatement对象
            ps = connection.prepareStatement("select * from emp where name = ?");

            //为占位符赋值
            ps.setObject(1,"qujianhua");

            //执行sql
            s = ps.executeQuery();

            //遍历结果
            while (s.next()){
                System.out.println(s.getObject(1) + "\t" + s.getObject(2) + "\t" + s.getObject(3));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭连接
            try {
                connection.close();
                s.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
