package mysql_test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC批处理
 *
 * 例如: 从excel文件中,将数据迁移至数据库
 *
 * addBatch(): 把mysql添加到批处理命令中缓存起来 , 最后一起使用 execute 执行
 * 如果缓冲区满了之后 会先执行一批 然后等满了再执行下一批
 *
 * Statement对象名.addBatch() 添加批处理
 * Statement对象名.executeBatch() 执行批处理  返回值是int数组
 *
 * JDBC 默认是关闭批处理的 开启批处理需要在url中添加参数 ?rewriteBatchedStatements=true
 *
 * value 不支持批处理 需要使用 values
 */
public class JDBC_Batch {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement ps = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studyDB?rewriteBatchedStatements=true","root","123456");
            ps = connection.prepareStatement("insert into emp values (null,?,?,null)");
            for (int i = 0; i < 100; i++) {
                ps.setString(1,"a"+i);
                ps.setString(2,String.valueOf(i));

                //批处理添加
                ps.addBatch();
            }
            //执行批处理
            int[] res = ps.executeBatch();
            for (int i = 0; i < res.length; i++) {
                System.out.println(i > 0 ? "添加成功" : "添加失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            ps.close();
            connection.close();
        }
    }
}
