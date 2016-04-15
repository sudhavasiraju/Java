package com.sample.general;

import java.util.LinkedList;

/**
 * Created by sudhakar.vasiraju on 4/14/16.
 */
public class HashMapImpl<K, V> {
    LinkedList<Entry<K, V>>[] items;

    public HashMapImpl(int capacity) {
        items = (LinkedList<Entry<K, V>>[]) new LinkedList[capacity];
    }

    public void put(K key, V value) {
        int hash = getHash(key);

        if (items[hash] == null) {
            items[hash] = new LinkedList<Entry<K, V>>();
        }

        LinkedList<Entry<K, V>> collision = items[hash];

        for (Entry<K, V> entry:collision) {
            if (entry.isEquals(key)) {
                collision.remove(entry);
                break;
            }
        }

        Entry<K, V> newItem = new Entry<>(key, value);
        collision.add(newItem);

    }

    public V get(K key){
        int hash = getHash(key);
        if (items[hash] == null)
            return null;
        LinkedList<Entry<K, V>> entries = items[hash];
        for (Entry<K, V> entry:entries) {
            if (entry.isEquals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int getHash(K key) {
        return key.toString().length() % items.length;
    }


}

class Entry<K, V>{
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return  key;
    }

    public V getValue(){
        return value;
    }

    public boolean isEquals(K key){
        return this.key.equals(key);
    }

}
