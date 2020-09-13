package mysql_test.jdbc2;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC连接池 Druid
 */
public class JDBCUtil {
    //创建连接池
    private static DataSource ds;
    private static ThreadLocal<Connection> tl;

    static {
        //创建properties对象
        Properties properties = new Properties();

        try {
            //加载配置文件 load方法是从文件中读取属性列表（键和元素对）
            properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties"));

            ds = DruidDataSourceFactory.createDataSource(properties);

            tl = new ThreadLocal<>();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建连接
     * @return
     */
    public static Connection getConnection(){
        //获取连接
        Connection connection = tl.get();
        //如果不为空,则此类加载过连接,其余线程如果使用无需重新获取其他连接,为空则通过连接池获取新的连接
        if (connection == null){
            try {
                connection = ds.getConnection();

                //将获取的连接加载到线程中
                tl.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        if (connection == null){
            //事务设为自动提交
            connection.setAutoCommit(true);

            //将连接返还给数据连接池
            tl.remove();

            //关闭连接
            connection.close();
        }
    }
}
