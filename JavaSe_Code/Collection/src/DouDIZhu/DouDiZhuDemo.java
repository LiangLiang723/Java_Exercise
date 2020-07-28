package DouDIZhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhuDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");

        Collections.shuffle(array);

        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dp = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dp.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }

        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
        lookPoker("底牌",dp);
    }

    public  static void lookPoker (String name,ArrayList<String> array){
        System.out.print(name+"：");
        for(String poker : array){
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
