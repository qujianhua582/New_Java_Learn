package redis;

import redis.clients.jedis.Jedis;

import java.util.Iterator;
import java.util.Set;

public class JedisTest1 {
    public static void main(String[] args) {
        //连接本地Redis服务
        Jedis jedis = new Jedis("127.0.0.1",6379);

        Set<String> keys = jedis.keys("*");
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //关闭jedis
        jedis.close();
    }
}
