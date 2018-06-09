package net.zarski.conference.ci.plantshop;

import java.util.HashMap;

public class Session {
    HashMap<String, Object> hashMap = new HashMap<>();

    public void put(String key, Object object) {
        hashMap.put(key, object);
    }

    public Object get(String key) {
        return hashMap.get(key);
    }
}
