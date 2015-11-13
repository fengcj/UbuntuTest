package com.fcj.cache;

import net.spy.memcached.MemcachedClient;

import java.io.IOException;
import java.net.InetSocketAddress;

/**
 * Created by fcj on 11/13/15.
 */
public class SpyMemCached {


    public static void main(String[] args){

        MemcachedClient c= null;
        try {
            c = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Store a value (async) for one hour
        c.set("someKey", 3600, "123");
        // Retrieve a value (synchronously).
        Object myObject=c.get("someKey");
        System.out.print(myObject);


    }


}
