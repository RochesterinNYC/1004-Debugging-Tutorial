/**
 * DebuggingExample2 class
 * <p>
 * Quick example with a purposeful bug for illustrating Eclipse and 
 * print debugging.
 */

public class DebuggingExample2 {
  
  public static void main(String[] args){ 

    //FizzBuzz
    int maxValue = 15;
    fizz(maxValue);
    buzz(maxValue);
    fizzBuzz(maxValue);

  }
  //Print 3 for every 
  private static void fizz(int end){
    for(int i = 0; i <= end; i++){
      if(i % 3 == 0){
        System.out.println("Fizz");
      }
    }
  }
  //
  private static void buzz(int end){
    for(int i = 0; i <= end; i++){
      if(i % 5 == 0){
        System.out.println("Buzz");
      }
    } 
  }
  //  
  private static void fizzBuzz(int end){
    for(int i = 0; i < end; i++){
      if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
      } 
      else if(i % 3 == 0){
        System.out.println("Fizz");
      } 
      else if(i % 5 == 0){
        System.out.println("Buzz");
      }
    } 
  }
}
