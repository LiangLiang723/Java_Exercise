package Athletes_And_Coaches;

public abstract class Coaches extends People{

    public Coaches() {
    }

    public Coaches(String name, String age) {
        super(name, age);
    }

    public abstract void teach();
}
