package DouDIZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class DouDiZhuDemo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                hashMap.put(index, color + number);
                arrayList.add(index);
                index++;
            }
        }

        arrayList.add(index);
        hashMap.put(index, "小王");
        index++;
        arrayList.add(index);
        hashMap.put(index, "大王");

        Collections.shuffle(arrayList);

        TreeSet<Integer> player1 = new TreeSet<Integer>();
        TreeSet<Integer> player2 = new TreeSet<Integer>();
        TreeSet<Integer> player3 = new TreeSet<Integer>();
        TreeSet<Integer> dp = new TreeSet<Integer>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (i >= arrayList.size() - 3) {
                dp.add(arrayList.get(i));
            } else if(i%3==0) {
                player1.add(arrayList.get(i));
            } else if(i%3==1) {
                player2.add(arrayList.get(i));
            } else if(i%3==2) {
                player3.add(arrayList.get(i));
            }
        }

        lookPoker("玩家1",player1,hashMap);
        lookPoker("玩家2",player2,hashMap);
        lookPoker("玩家3",player3,hashMap);
        lookPoker("底牌",dp,hashMap);

    }

    public static void lookPoker(String name,TreeSet<Integer> poker,HashMap<Integer,String> hashMap) {
        System.out.print(name+"：");
        for(Integer key : poker){
            String value = hashMap.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
