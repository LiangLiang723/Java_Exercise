package GemericDemo;

//泛型
/*
public class Gemeric<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


}*/

/*public class Gemeric<T> {
    public void show(T t) {
        System.out.println(t);
    }
}*/

//泛型方法
public class Gemeric {
    public <T> void show(T t) {
        System.out.println(t);
    }
}
