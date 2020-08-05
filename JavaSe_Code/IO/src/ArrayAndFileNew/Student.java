package ArrayAndFileNew;

public class Student {
    private String number;
    private String name;
    private int age;
    private String home;

    public Student() {
    }

    public Student(String number, String name, int age, String home) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return getNumber()+"，"+getName()+"，"+getAge()+"，"+getHome();
    }

}
