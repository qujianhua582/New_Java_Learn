package mysql_test.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 读取图片 将图片插入数据库的某个字段
 */
public class JDBC_Test3_Prepare {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            FileInputStream fis = new FileInputStream("/Users/qujianhua/Pictures/pap.er/BAjgWBrVpRY.jpg");

            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studyDB","root","123456");

            ps = connection.prepareStatement("insert into emp (sex) values (?,?,?,?)");

            ps.setObject(1,18);
            ps.setObject(2,"linshiba");
            ps.setString(3,"n");
            ps.setBlob(4,fis);

            int i = ps.executeUpdate();
            System.out.println(i > 0 ? "添加成功" : "添加失败");

        } catch (FileNotFoundException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
