package com.fcj.cache; /**
 * Created by fcj on 10/27/15.
 */

import redis.clients.jedis.Jedis;

public class RedisCached {

    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server sucessfully");
        //check whether server is running or not
        System.out.println("Server is running: " + jedis.ping());

    }

}
