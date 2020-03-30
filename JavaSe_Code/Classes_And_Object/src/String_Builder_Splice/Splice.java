package String_Builder_Splice;

public class Splice {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 9, 3, 0, 10, 12};
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s.append(arr[i]);
            } else {
                s.append(arr[i]+", ");
            }
        }
        s.append("]");
        String ss = s.toString();
        System.out.println(s);
        System.out.println(ss);
    }
}
