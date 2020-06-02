package com.mmn.map;

import java.util.HashMap;

/**
 * 入口
 */
public class ConcurrentHashMapDebugDemo {

    public static void main(String[] args) {
        ConcurrentHashMapDebug hashMap = new ConcurrentHashMapDebug();

        hashMap.putAll(new ConcurrentHashMapDebug());
        hashMap.put(1, 2);

        new HashMap();

    }
}
