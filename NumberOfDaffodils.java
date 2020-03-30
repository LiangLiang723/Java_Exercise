class NumberOfDaffodils {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (((i % 10) * (i % 10) * (i % 10) + (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10)
                    + (i / 100) * (i / 100) * (i / 100)) == i) {
                System.out.println(i);
            }
        }
    }
}