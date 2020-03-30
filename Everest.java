class Everest {
    
    public static void main(String[] args) {
        
        double thickness = 0.1;
        int everestHeight = 8844430;
        int num = 0;
       
        while (thickness <= 8844430) {
            thickness *= 2;
            num++;
        }
        
        System.out.println("折叠的次数为："+num);
    }
}