package Athletes_And_Coaches;

public class BasketballCoach extends Coaches {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, String age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("篮球教练教篮球");
    }

    public void eat(){
        System.out.println("篮球教练吃空心菜");
    }
}
