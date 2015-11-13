//package com.fcj.cache; /**
// * Created by fcj on 10/27/15.
// */
//
//import com.danga.MemCached.MemCachedClient;
//import com.danga.MemCached.SockIOPool;
//
//import java.util.Date;
//
//
//public class MemCached
//{
//    // The only instance created global
//    private static MemCachedClient mcc = new MemCachedClient();
//
//    private static MemCached memCached = null;
//
//    // Connection pool is arranged with the cache server
//    static {
//        // The list of servers and their weights
//        String[] servers = {"127.0.0.1:11211"};
//        Integer[] weights = {3};
//
//        // Gets the socke connection pool object instance
//        SockIOPool pool = SockIOPool.getInstance();
//
//        // Setting up the server information
//        pool.setServers( servers );
//        pool.setWeights( weights );
//
//        // Set the initial number of connections, the minimum and maximum number of connections and the maximum processing time
//        pool.setInitConn( 5 );
//        pool.setMinConn( 5 );
//        pool.setMaxConn( 250 );
//        pool.setMaxIdle( 1000 * 60 * 60 * 6 );
//
//        // Set the main thread to sleep
//        pool.setMaintSleep( 30 );
//
//        // Set the TCP parameter, connection timeout
//        pool.setNagle( false );
//        pool.setSocketTO( 3000 );
//        pool.setSocketConnectTO( 0 );
//
//        // Initialize the connection pool
//        pool.initialize();
//
//        // The compression settings, exceeds the specified size (unit K) data will be compressed
//        //mcc.setCompressEnable( true );
//        //mcc.setCompressThreshold( 64 * 1024 );
//    }
//
//    /**
//     * The structure method of protection, do not allow instantiation！
//     *
//     */
//    private MemCached()
//    {
//
//    }
//
//    /**
//     * Gets a unique instance
//     * @return
//     */
//    public static MemCached getInstance()
//    {
//        synchronized (MemCached.class) {
//            if(null == memCached){
//                memCached = new MemCached();
//            }
//
//            return memCached;
//        }
//    }
//
//    /**
//     * Add a specified value into the cache
//     * @param key
//     * @param value
//     * @return
//     */
//    public boolean add(String key, Object value)
//    {
//        return mcc.add(key, value);
//    }
//
//    public boolean add(String key, Object value, Date expiry)
//    {
//        return mcc.add(key, value, expiry);
//    }
//
//    public boolean replace(String key, Object value)
//    {
//        return mcc.replace(key, value);
//    }
//
//    public boolean replace(String key, Object value, Date expiry)
//    {
//        return mcc.replace(key, value, expiry);
//    }
//
//    public boolean delete(String key){
//        return mcc.delete(key);
//    }
//
//    public boolean set(String key, Object value){
//        return mcc.set(key, value);
//    }
//
//    public boolean set(String key, Object value, Date expiry){
//        return mcc.set(key, value, expiry);
//    }
//
//    /**
//     * According to the specified keyword access to objects
//     * @param key
//     * @return
//     */
//    public Object get(String key)
//    {
//        return mcc.get(key);
//    }
//
//    public static void main(String[] args)
//    {
//        MemCached cache = MemCached.getInstance();
//        cache.add("hello", 234);
//        System.out.println("get value : " + cache.get("hello"));
//
//        cache.delete("hello");
//
//        System.out.println("get value : " + cache.get("hello"));
//
//        cache.set("hi", "Hello, Chinese");
//
//        System.out.println("get value : " + cache.get("hi"));
//
//    }
//}
