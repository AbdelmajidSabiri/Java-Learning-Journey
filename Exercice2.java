import java.util.Random;

public class Exercice2 {

 public static void main(String[] args) {
  
  Random random = new Random();
  
  int x = random.nextInt(6); // random number between 0 and 5
  double y = random.nextDouble(); // random number between 0 and 1
  boolean z = random.nextBoolean(); // True or false

  
  System.out.println(x);
  System.out.println(z);
  System.out.println(y);
    
 }
}