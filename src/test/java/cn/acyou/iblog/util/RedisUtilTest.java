package cn.acyou.iblog.util;

import redis.clients.jedis.Jedis;

public class RedisUtilTest {
	public static void main(String[] args) {
		Jedis jedis = RedisUtil.getJedis();
		System.out.println(jedis);
	}

}
