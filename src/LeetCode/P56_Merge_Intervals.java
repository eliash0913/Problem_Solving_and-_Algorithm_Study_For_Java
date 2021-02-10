package LeetCode;

import javafx.util.Pair;

import java.util.*;
//https://leetcode.com/problems/merge-intervals/submissions/
public class P56_Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<Pair<Integer,Integer>> al = new ArrayList<>();
        for(int[] interval : intervals){
            al.add(new Pair(interval[0],interval[1]));
        }
//        ArrayList<Pair<Integer,Integer>> test = new ArrayList<>();
//        test.add(new Pair<>(1,2));
//        System.out.println(test.contains(new Pair<>(1,2)));
//        ArrayList<int[]> al = new ArrayList<>(Arrays.asList(intervals));
        ArrayList<Pair<Integer,Integer>> newAl = new ArrayList<>();
        boolean updated = true;
        System.out.println("START");
        while(updated){
            updated=false;
            for(int i = 0; i < al.size();i++){
                for(int j = 0; j < al.size();j++){

                    if(i!=j){
                        System.out.println("i : " + i + "    j : " + j);
                        if(al.get(i).equals(al.get(j))){
                            if(i > j){
                                al.remove(al.get(i));
                            } else {
                                al.remove(al.get(j));
                            }
                        } else if(al.get(i).getKey() <= al.get(j).getKey() && al.get(i).getValue() <= al.get(j).getValue()) {
                            if(al.get(i).getValue() >= al.get(j).getKey()){
                                Pair<Integer,Integer> newPair = new Pair(al.get(i).getKey(),al.get(j).getValue());
                                if(!newAl.contains(newPair)) {
                                    System.out.printf("1[%d,%d]\n",al.get(i).getKey(),al.get(j).getValue());
                                    if(i > j){
                                        al.remove(al.get(i));
                                        al.remove(al.get(j));
                                    } else {
                                        al.remove(al.get(j));
                                        al.remove(al.get(i));
                                    }
                                    newAl.add(newPair);
                                    updated = true;
                                    i=0;
                                    j=0;
                                }
                            } else {
                                if(!newAl.contains(al.get(i))) {
                                    System.out.printf("2[%d,%d]\n",al.get(i).getKey(),al.get(i).getValue());
                                    newAl.add(al.get(i));
                                    al.remove(al.get(i));
                                    i=0;
                                }

//                                if(!newAl.contains(al.get(j))) {
//                                    newAl.add(al.get(j));
////                                    al.remove(j);
//
//                                    System.out.printf("2[%d,%d]\n",al.get(j).getKey(),al.get(j).getValue());
//                                }

                            }
                        } else if(al.get(i).getKey() >= al.get(j).getKey() && al.get(i).getValue() >= al.get(j).getValue()) {
                            if(al.get(i).getKey() <= al.get(j).getValue()) {
                                Pair<Integer,Integer> newPair = new Pair(al.get(j).getKey(), al.get(i).getValue());
                                if(!newAl.contains(newPair)) {
                                    System.out.printf("3[%d,%d]\n",al.get(j).getKey(),al.get(i).getValue());
                                    if(i > j){
                                        al.remove(al.get(i));
                                        al.remove(al.get(j));
                                    } else {
                                        al.remove(al.get(j));
                                        al.remove(al.get(i));
                                    }

                                    newAl.add(newPair);
                                    updated = true;
                                    i=0;
                                    j=0;

                                }
                            } else {
                                if(!newAl.contains(al.get(i))) {
                                    System.out.printf("2[%d,%d]\n",al.get(i).getKey(),al.get(i).getValue());
                                    newAl.add(al.get(i));
                                    al.remove(al.get(i));
                                    i=0;
//                                    al.remove(i);
//
                                }

//                                if(!newAl.contains(al.get(j))) {
//                                    newAl.add(al.get(j));
////                                    al.remove(j);
//
//                                    System.out.printf("2[%d,%d]\n",al.get(j).getKey(),al.get(j).getValue());
//                                }
                            }
                        } else if(al.get(i).getKey()<=al.get(j).getKey() && al.get(i).getValue()>=al.get(j).getValue()) {
                            if(!newAl.contains(al.get(i))) {
                                System.out.printf("2[%d,%d]\n",al.get(i).getKey(),al.get(i).getValue());
                                newAl.add(al.get(i));
                                al.remove(al.get(i));
                                i=0;
//                                al.remove(i);
                            }
                        } else if(al.get(i).getKey()>=al.get(j).getKey() && al.get(i).getValue()<=al.get(j).getValue()) {
                            if(!newAl.contains(al.get(j))) {
                                System.out.printf("2[%d,%d]\n",al.get(j).getKey(),al.get(j).getValue());
                                newAl.add(al.get(j));
                                al.remove(al.get(j));
                                j=0;
//                                al.remove(j);

                            }
                        }
                        if(al.size() == 1) {
                            newAl.add(al.get(0));
                        }
                        System.out.println("current al is:");
                        for(Pair<Integer, Integer> x: al){
                            System.out.printf("%d,%d\n",x.getKey(),x.getValue());
                        }
                        System.out.println("current newAl is:");
                        for(Pair<Integer, Integer> x: newAl){
                            System.out.printf("%d,%d\n",x.getKey(),x.getValue());
                        }
                    }
                }
            }
            al=newAl;

        }
        int index = 0;
        int[][] result = new int[al.size()][2];
        System.out.println("RESULT===========================");
        for(Pair<Integer, Integer> x: al){
            System.out.printf("%d,%d\n",x.getKey(),x.getValue());
            result[index][0] = x.getKey();
            result[index++][1] = x.getValue();
        }
        return result;
    }
}
//        Queue<int[]> queue = new LinkedList<>(Arrays.asList(intervals));
//        boolean updated = true;
//        while(updated){
//            updated=false;
//            int[] first = queue.poll();
//
//            int qSize = queue.size();
//            for(int i = 0; i < qSize-1; i++){
//                int[] m = queue.poll();
//                System.out.printf("first: [%d,%d]   m: [%d,%d]\n",first[0],first[1],m[0],m[1]);
//                if(first[0] <= m[0] && first[1] <= m[1]) {
//                    if(first[1] >= m[0]){
//                        System.out.printf("1[%d,%d]\n",first[0],m[1]);
//                        queue.add(new int[]{first[0],m[1]});
//                        updated=true;
//                    } else {
////                        if(queue.size()==0){
////                            updated=false;
////                        }
//                        queue.add(first);
//                        System.out.printf("2[%d,%d]\n",first[0],first[1]);
//                        queue.add(m);
//                        System.out.printf("2[%d,%d]\n",m[0],m[1]);
//                    }
//                } else if(first[0] >= m[0] && first[1] >= m[1]) {
//                    if(first[0] <= m[1]) {
//                        queue.add(new int[]{m[0], first[1]});
//                        System.out.printf("3[%d,%d]\n",m[0],first[1]);
//                        updated=true;
//                    } else {
//                        queue.add(first);
//                        System.out.printf("4[%d,%d]\n",first[0],first[1]);
//                        queue.add(m);
//                        System.out.printf("4[%d,%d]\n",m[0],m[1]);
//                    }
//                } else if(first[0]<=m[0] && first[1]>=m[1]) {
//                    queue.add(first);
//                    System.out.printf("5[%d,%d]\n",first[0],first[1]);
//                } else if(first[0]>=m[0] && first[1]<=m[1]) {
//                    queue.add(m);
//                    System.out.printf("6[%d,%d]\n",m[0],m[1]);
//                }
//
//            }
//
//        }
//        int[][] result = new int[queue.size()][2];
//        int idx = 0;
//        for(int[] x: queue){
//            result[idx++]=x;
//            System.out.printf("%d,%d\n",x[0],x[1]);
//        }
//        return result;
//    }
//}

















//        ArrayList<int[]> rAl = new ArrayList<>();
//        for(int i = 0; i < intervals.length; i++){
//            int[] tmp = intervals[i];
//            int j = i;
//            while(j< intervals.length-1) {
//                j++;
//                System.out.printf("tmp: [%d,%d]\n",tmp[0],tmp[1]);
//                System.out.printf("interval: [%d,%d]\n",intervals[j][0],intervals[j][1]);
//                if(tmp[1]>=intervals[j][0] && tmp[0]<=intervals[j][0] && tmp[1]<=intervals[j][1]){
//                    tmp[1]=intervals[j][1];
//                    i=j;
//                    System.out.println("BREAK1");
//                } else if(tmp[1]>=intervals[j][0] && tmp[0]<=intervals[j][0] && tmp[1]>=intervals[j][1]){
//                    i=j;
//                    System.out.println("BREAK2");
//                } else if(tmp[1]<=intervals[j][0] && tmp[0]>=intervals[j][0]) {
//                    tmp[0] = intervals[j][0];
//                    tmp[1] = intervals[j][1];
//                    i=j;
//                    System.out.println("BREAK3");
//                } else if(tmp[0]>=intervals[j][0] && tmp[1]<=intervals[j][1]) {
//                    tmp[0] = intervals[j][0];
//                    tmp[1] = intervals[j][1];
//                    i=j;
//                    System.out.println("BREAK4");
//                } else if(tmp[0] >= intervals[j][0] && intervals[j][1] <= tmp[1] && tmp[0] <= intervals[j][1]) {
//                    tmp[0] = intervals[j][0];
//                    i=j;
//                    System.out.println("BREAK5");
//                }
//            }
//            rAl.add(tmp);
//        }
//        int[][] result = new int[rAl.size()][2];
//        int idx=0;
//        for(int[] x:rAl){
//            System.out.printf("x: [%d,%d]\n",x[0],x[1]);
//            result[idx++]=x;
//        }
//        return result;
//    }
//}
