package ArrayAndFile;

public class Student {
    private String number;
    private String name;
    private String age;
    private String home;

    public Student() {
    }


    public Student(String number, String name, String age, String home) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
