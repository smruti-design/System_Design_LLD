package com.smruti.cache;

public class Cache<Key, Value> {
    private final EvictionPolicy<Key> evictionPolicy;
    private final Storage<Key , Value> storage ;

    public Cache(EvictionPolicy<Key> evictionPolicy , Storage<Key, Value> storage) {
        this.evictionPolicy = evictionPolicy ;
        this.storage = storage;
    }


}
