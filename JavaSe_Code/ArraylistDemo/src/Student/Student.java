package Student;

import java.security.PrivateKey;

public class Student {
    private String name;
    private String ages;

    public Student(){
    }

    public Student(String name,String ages){
            this.name = name;
            this.ages = ages;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAges(String ages){
        this.ages = ages;
    }

    public String getAges(){
        return ages;
    }
}
