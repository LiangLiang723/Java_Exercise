package Athletes_And_Coaches;

public class BasketballPlayer extends Athletes {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, String age) {
        super(name, age);
    }

    public void study() {
        System.out.println("篮球运动员学篮球");
    }

    public void eat(){
        System.out.println("篮球运动员吃牛肉");
    }
}
