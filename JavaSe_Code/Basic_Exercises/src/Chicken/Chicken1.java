package Chicken;

public class Chicken1 {
    public static void main(String[] args) {
        int money = 0;
        int num = 0;
        for (int cock = 0; cock <= 20; cock++)
            for(int hen = 0;hen<=33;hen++)
                for (int chick= 0;chick<=300;chick+=3){
                    money = 5*cock+3*hen+chick/3;
                    num = cock+hen+chick;
                    if(money == 100 && num == 100){
                        System.out.println("公鸡的数量为："+cock);
                        System.out.println("母鸡的数量为："+hen);
                        System.out.println("小鸡的数量为："+chick);
                        System.out.println("-------------------");
                    }
                }
    }
}
