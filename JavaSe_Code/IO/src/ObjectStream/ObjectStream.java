package ObjectStream;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) {
        write();
        read();

    }

    private static void read() {
        Student s = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO\\src\\ObjectStream\\Student.txt"))) {

            s = (Student) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }

        System.out.println(s.toString());
    }

    private static void write() {
        try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("IO\\src\\ObjectStream\\Student.txt"))) {

            Student s = new Student("林青霞", 30, "福建", 159879654);
            ois.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
