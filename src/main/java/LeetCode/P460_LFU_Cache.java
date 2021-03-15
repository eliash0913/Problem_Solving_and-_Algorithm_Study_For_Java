package LeetCode;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.*;

public class P460_LFU_Cache {
    //
//    LFUCache obj = new LFUCache(capacity);
//    int param_1 = obj.get(key);
//    obj.put(key,value);
    ArrayList<Integer> helper(ArrayList<String> strAL, ArrayList<ArrayList<Integer>> intAL) {
        ArrayList<Integer> result = new ArrayList<>();
        LFUCache lfuCache = new LFUCache(0);
        for (int i = 0; i < strAL.size(); i++) {
            switch (strAL.get(i)) {
                case "LFUCache":
                    lfuCache = new LFUCache(intAL.get(i).get(0));
                    result.add(null);
                    break;
                case "put":
                    lfuCache.put(intAL.get(i).get(0), intAL.get(i).get(1));
                    result.add(null);
                    break;
                case "get":
                    result.add(lfuCache.get(intAL.get(i).get(0)));
                    break;
            }
//            System.out.printf("%s %s \t Cache: %s \t Order: %s \t History: %s\n",strAL.get(i), intAL.get(i),lfuCache.cache,lfuCache.counter,lfuCache.history);
//            if(i>515 && i < 530)
                System.out.printf("%d: %s %s \t Cache: %s \t Counter: %s \t CacheMap: %s\n",i,strAL.get(i), intAL.get(i),lfuCache.cache,lfuCache.counter,lfuCache.cacheMap);
        }
        return result;
    }
}

class LFUCache {
    HashMap<Integer,Integer> cacheMap;
    LinkedHashMap<Integer,Integer> counter;
    ArrayList<Integer> cache;
    int capacity;
    public LFUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new HashMap<>();
        counter = new LinkedHashMap<>();
        cache = new ArrayList<>();
    }

    public int get(int key) {
        if(capacity != 0 && cache.contains(key)){
            int count = counter.get(key)+1;
            counter.replace(key, count);
            int keyIndex = cache.indexOf(key);
            cache.remove(keyIndex);
            for(int index = keyIndex;index < cache.size(); index++){
                if(counter.get(cache.get(index))>count) {
                    cache.add(index, key);
                    break;
                }
            }
            if(cache.size()!=cacheMap.size())
                cache.add(key);
            return cacheMap.get(key);
        } else
            return -1;
    }

    public void put(int key, int value) {
        if(cache.contains(key)){
            cacheMap.replace(key,value);
        } else {
            if(capacity!=0 && cache.size()>=capacity){
                int leastKey = cache.get(0);
                cacheMap.remove(leastKey);
                counter.remove(leastKey);
                cache.remove(0);
            }
            cacheMap.put(key,value);
            counter.put(key,0);
            cache.add(0,key);
        }
        get(key);
    }
}

//class LFUCache {
//    HashMap<Integer,Integer> cache;
//    HashMap<Integer,Integer> counter;
//    int capacity;
//    ArrayList<Integer> history;
//    public LFUCache(int capacity) {
//        this.capacity = capacity;
//        history = new ArrayList<>();
//        cache = new HashMap<>();
//        counter = new HashMap<>();
//    }
//
//    public int get(int key) {
//        if(cache.containsKey(key) && capacity > 0) {
//            incCount(key);
//            updateHistory(key);
//            return cache.get(key);
//        }
//        else
//            return -1;
//    }
//
//    public void put(int key, int value) {
//        if(capacity>0) {
//            if(cache.containsKey(key)) {
//                cache.replace(key, value);
//                incCount(key);
//            } else {
//                if (cache.size() >= capacity) {
//                    drop(getLeast());
//                }
//                cache.put(key,value);
//                initCount(key);
//            }
//        }
//        updateHistory(key);
//    }
//
//    void updateHistory(int key){
//        int currentOrder = history.indexOf(key);
//        for(int idx = currentOrder + 1; idx < history.size(); idx++) {
//            if(getCount(history.get(idx))<=getCount(history.get(currentOrder))){
//                history.set(currentOrder, history.get(idx));
//                history.set(idx, key);
//                currentOrder = idx;
//            } else {
//                break;
//            }
//        }
//    }
//
//    void drop(int key){
//        cache.remove(key);
//        counter.remove(key);
//        history.remove(history.indexOf(key));
//    }
//
//    int getCount(int key){
//        return counter.get(key);
//    }
//
//    void initCount(int key){
//        if(counter.containsKey(key))
//            counter.replace(key,1);
//        else {
//            counter.put(key, 1);
//            history.add(0,key);
//        }
//    }
//
//    void incCount(int key){
//        counter.replace(key,counter.get(key)+1);
//    }
//
//    int getLeast(){
//        return history.get(0);
//    }
//}

//public class LFUCache {
//    HashMap<Integer, Integer> vals;
//    HashMap<Integer, Integer> counts;
//    HashMap<Integer, LinkedHashSet<Integer>> lists;
//    int cap;
//    int min = -1;
//    public LFUCache(int capacity) {
//        cap = capacity;
//        vals = new HashMap<>();
//        counts = new HashMap<>();
//        lists = new HashMap<>();
//        lists.put(1, new LinkedHashSet<>());
//    }
//
//    public int get(int key) {
//        if(!vals.containsKey(key))
//            return -1;
//        int count = counts.get(key);
//        counts.put(key, count+1);
//        lists.get(count).remove(key);
//        if(count==min && lists.get(count).size()==0)
//            min++;
//        if(!lists.containsKey(count+1))
//            lists.put(count+1, new LinkedHashSet<>());
//        lists.get(count+1).add(key);
//        return vals.get(key);
//    }
//
//    public void put(int key, int value) {
//        if(cap<=0)
//            return;
//        if(vals.containsKey(key)) {
//            vals.put(key, value);
//            get(key);
//            return;
//        }
//        if(vals.size() >= cap) {
//            int evit = lists.get(min).iterator().next();
//            lists.get(min).remove(evit);
//            vals.remove(evit);
//        }
//        vals.put(key, value);
//        counts.put(key, 1);
//        min = 1;
//        lists.get(1).add(key);
//    }
//}