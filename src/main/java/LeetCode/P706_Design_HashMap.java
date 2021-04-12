package LeetCode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

class P706_Design_HashMap {
    final int mod = 1000;
    ArrayList<Pair<Integer,Integer>>[] hashmap;
    /** Initialize your data structure here. */
    public P706_Design_HashMap() {
        hashmap = new ArrayList[mod];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        boolean found = false;
        if(hashmap[key%mod]!=null){//&& hashmap[key%mod].size()!=0){
            for(Pair<Integer,Integer> pair : hashmap[key%mod]){
                if(pair.getKey()==key/mod){
                    hashmap[key%mod].remove(pair);
                    hashmap[key%mod].add(new Pair<>(key/mod, value));
                    found = true;
                    break;
                }
            }
            if(!found)
                hashmap[key%mod].add(new Pair<>(key/mod, value));
        } else {
            hashmap[key%mod]=new ArrayList<>();
            hashmap[key%mod].add(new Pair(key/mod,value));
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(hashmap[key%mod]!=null && hashmap[key%mod].size()!=0){
            for(Pair<Integer,Integer> pair : hashmap[key%mod]){
                if(pair.getKey()==key/mod){
                    return pair.getValue();
                }
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(hashmap[key%mod]!=null && hashmap[key%mod].size()!=0){
            for(Pair<Integer,Integer> pair : hashmap[key%mod]){
                if(pair.getKey()==key/mod){
                    hashmap[key%mod].remove(pair);
                    break;
                }
            }
        }
    }
}
