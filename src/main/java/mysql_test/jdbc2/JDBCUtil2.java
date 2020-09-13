package mysql_test.jdbc2;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil2 {
    private static DataSource ds;
    private static ThreadLocal<Connection> tl;

    static {
        try {
            Properties properties = new Properties();
            properties.load(JDBCUtil2.class.getClassLoader().getResourceAsStream("druid.properties"));

            ds = DruidDataSourceFactory.createDataSource(properties);
            tl = new ThreadLocal<>();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection connection = tl.get();
        if (connection == null){
            try {
                connection = ds.getConnection();
                tl.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection(){
        Connection connection = tl.get();

        try {
            if (connection == null){
                tl.remove();
                connection.setAutoCommit(true);
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
