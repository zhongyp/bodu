package com.bodu.redis.connection;

import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2017/11/28.
 */
public class RedisConnection {

    public static void main(String[] args){
        Jedis jedis = new Jedis("localhost");

        System.out.print("连接状态：" + jedis.ping());
    }
}
