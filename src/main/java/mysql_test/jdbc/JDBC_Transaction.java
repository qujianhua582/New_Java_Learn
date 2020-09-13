package mysql_test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC处理事务
 *
 * 多个更新语句必须在同一个Connection中才算是同一个事务 , 所以必须保证Connection唯一
 *
 * connection.setAutoCommit(false); 设置取消自动提交
 *
 */
public class JDBC_Transaction {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection connection = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studyDB","root","123456");;
            //设置取消自动提交
            connection.setAutoCommit(false);

            insert(connection,ps);
            update(connection,ps);

            //提交事务
            connection.commit();
            System.out.println("执行成功");
        } catch (SQLException e) {
            try {
                //回滚事务
                connection.rollback();
                //回滚之后重新设回自动提交
                connection.setAutoCommit(true);
                System.out.println("执行失败,已回滚事务");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    /**
     * 插入语句 抛出异常 在主函数如果接收到异常 则需要回滚事务
     * @param connection
     * @throws SQLException
     */
    public static void insert(Connection connection,PreparedStatement ps) throws SQLException {
        ps = connection.prepareStatement("insert into emp values (null,?,?,?)");
        ps.setString(1,"fanershisi");
        ps.setString(2,"s");
        ps.setString(3,null);

        ps.executeUpdate();
        ps.close();
    }

    /**
     * 更新语句 抛出异常 在主函数如果接收到异常 则需要回滚事务
     * @param connection
     * @throws SQLException
     */
    public static void update(Connection connection,PreparedStatement ps) throws SQLException {
        ps = connection.prepareStatement("update emp set sex = 'n' where name = ?");
        ps.setString(1,"heershiyi");

        ps.executeUpdate();
    }
}
