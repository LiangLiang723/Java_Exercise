package Student;

public class Student {
    private String name;
    private int ages;

    public Student(){

    }

    public Student(String name, int ages){
        this.name = name;
        this.ages = ages;
    }

    public void setAges(int ages) {
        if (ages < 1 || ages > 120) {
            System.out.println("您输入的年龄有误！");
        } else {
            this.ages = ages;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAges() {
        return ages;
    }

    public void study() {
        System.out.println("好好学习，天天向上！");
    }

    public void doHomeWork() {

    }

    public void show() {
        System.out.println(name + "   " + ages);
    }
}
