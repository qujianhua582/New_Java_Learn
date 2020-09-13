package mysql_test.jdbc;

import java.sql.*;

/**
 * JDBC获取自增ID   ? id 直接填null
 *
 * connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)
 *
 * Statement.RETURN_GENERATED_KEYS 常量值
 * 表示执行sql结束后需要将自增长值带回来 默认是 NO_GENERATED_KEYS
 *
 * 需要手动获取自增长值 Statement对象.getGeneratedKeys() 返回ResultSet集合 一行一列
 */
public class JDBC_AUTO_Crement {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studyDB","root","123456");
            ps = connection.prepareStatement("insert into emp values (null,?,?,null)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,"songershi");
            ps.setString(2,"s");

            ps.executeUpdate();

            ResultSet gKeys = ps.getGeneratedKeys();
            while (gKeys.next()) {
                int generatedKeys = gKeys.getInt(1);
                System.out.println(generatedKeys);
            }
            gKeys.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {

            ps.close();
            connection.close();
        }
    }
}
