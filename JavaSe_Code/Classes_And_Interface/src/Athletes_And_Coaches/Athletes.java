package Athletes_And_Coaches;

public abstract class Athletes extends People{

    public Athletes() {
    }

    public Athletes(String name, String age) {
        super(name, age);
    }

    public abstract void study();

}
