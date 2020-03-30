package Athletes_And_Coaches;

public class TableTennisPlayer extends Athletes implements StudyEnglish {

    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, String age) {
        super(name, age);
    }

    public void study(){
        System.out.println("乒乓球运动员学乒乓球");
    }

    public void eat(){
        System.out.println("乒乓球运动员吃羊肉");
    }

    public void studyEnglish(){
        System.out.println("乒乓球运动员要学英语");
    }

    public static void english(){
        System.out.println("乒乓球运动员要学英语");
    }
}
