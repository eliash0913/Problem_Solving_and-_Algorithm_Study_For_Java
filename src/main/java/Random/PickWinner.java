package Random;

import java.util.*;

public class PickWinner {
    void pick(Iterator<Entry> itr){
        Map<Integer, String> entries = new LinkedHashMap<>();
        while(itr.hasNext()){
            Entry current = itr.next();
            Integer entry = current.entry;
            String name = current.name;
            if(entries.keySet().contains(entry)){
                entries.remove(entry);
            } else {
                entries.put(entry, name);
            }
        }
        for(Map.Entry<Integer, String> e : entries.entrySet())
            System.out.println(e);
    }

//    void pick(Iterator<Entry> itr){
//        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
//        HashSet<Integer> drops = new HashSet<>();
//        while(itr.hasNext()){
//            Entry currentEntry = itr.next();
//            if(!drops.contains(currentEntry.entry)){
//                if(!hm.containsKey(currentEntry.entry)) {
//                    hm.put(currentEntry.entry, currentEntry.name);
//                } else {
//                    hm.remove(currentEntry.entry);
//                    drops.add(currentEntry.entry);
//                }
//            }
//        }
//        System.out.println(hm.get(hm.keySet().toArray()[0]));
//    }

    public static void main(String[] args){
        PickWinner t = new PickWinner();
        ArrayList<Entry> al = new ArrayList<>();
        al.add(new Entry("A", 1111));
        al.add(new Entry("B", 3333));
        al.add(new Entry("C", 1111));
        al.add(new Entry("D", 3333));
        al.add(new Entry("E", 5555));
        al.add(new Entry("F", 4444));
        al.add(new Entry("G", 7777));
        al.add(new Entry("H", 1111));
        Iterator<Entry> itr = al.iterator();
        t.pick(itr);
    }

}

class Entry{
    public String name;
    public Integer entry;
    public Entry(String name, Integer entry){
        this.entry = entry;
        this.name = name;
    }
}

