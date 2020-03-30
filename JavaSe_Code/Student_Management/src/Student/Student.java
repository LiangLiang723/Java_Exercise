package Student;

public class Student {
    private String sid;
    private String name;
    private String ages;
    private String address;

    public Student(){
    }

    public Student(String sid, String name, String ages, String address) {
        this.sid = sid;
        this.name = name;
        this.ages = ages;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAges() {
        return ages;
    }

    public void setAges(String ages) {
        this.ages = ages;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
