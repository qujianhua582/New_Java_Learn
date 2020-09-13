package redis;

import redis.clients.jedis.Jedis;


/**
 * 产生一个6位数字的验证码 1分钟有效
 * 输入验证码 确认验证码是否有效
 */
public class JedisWork2 {
    public static void main(String[] args) {
        String random = "";
        for (int i = 0; i < 6; i++) {
            random+=(int)(Math.random()*10);
        }

        Jedis jedis = new Jedis("127.0.0.1",6379);
        //设置key和vaule 并设置key过期时间
        jedis.setex("18353089300", 60, String.valueOf(random));

        //判断是否有效 需判断redis中的value和输入的value是否一致
    }
}
