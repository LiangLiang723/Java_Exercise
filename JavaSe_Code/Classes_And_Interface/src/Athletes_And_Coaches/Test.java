package Athletes_And_Coaches;

public class Test {
    public static void main(String[] args) {
        /*
            计算当前时间与1970年1月1日差了多少年
        */
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365);
        /*
            计算程序消耗时间
        */
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时" + (end - start) + "毫秒");
    }
}
