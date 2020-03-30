package Athletes_And_Coaches;

public class TableTennisCoaches extends Coaches implements StudyEnglish {

    public TableTennisCoaches() {
    }

    public TableTennisCoaches(String name, String age) {
        super(name, age);
    }

    public void teach(){
        System.out.println("乒乓球教练教乒乓球");
    }

    public void eat(){
        System.out.println("乒乓球教练吃大白菜");
    }
    public void studyEnglish(){

        System.out.println("乒乓球教练要学英语");
    }
}
