import java.util.Random;

class RandomDemo{
    
    public static void main(String[] args){
        Random r = new Random();
        
        
        for (int i = 0; i < 5; i++) {
            
            int number = r.nextInt(100);
            System.out.println(number);
        }
    }
}