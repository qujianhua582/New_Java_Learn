package mysql_test.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil_Test {
    public static void main(String[] args) throws SQLException {
        //使用连接池创建连接
        Connection connection = JDBCUtil2.getConnection();

        //创建PreparedStatement
        PreparedStatement ps = connection.prepareStatement("select * from emp where id > ?");

        //设置参数
        ps.setInt(1,0);

        //执行sql
        ResultSet resultSet = ps.executeQuery();

        //遍历结果
        while (resultSet.next()){
            System.out.print(resultSet.getObject(1)+"\t"+resultSet.getObject(2)+"\n");
        }

        //关闭连接
        resultSet.close();
        //调用连接池关闭连接
        JDBCUtil2.closeConnection();
    }
}
