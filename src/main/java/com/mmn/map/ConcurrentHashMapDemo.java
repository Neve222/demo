package com.mmn.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mmn
 * @date 2019-10-24 16:56
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap(16, 0.75f, 1);
        concurrentHashMap.put(1, "1");
        concurrentHashMap.put(2, "2");
        concurrentHashMap.put(null, "3");
        concurrentHashMap.put(4, null);

        concurrentHashMap.get(1);




        for (Map.Entry<Integer, String> map : concurrentHashMap.entrySet() ) {
            System.out.println(map.getKey() + "--------" + map.getValue());
        }
    }
}
