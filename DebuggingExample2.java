/**
 * DebuggingExample2 class
 * <p>
 * Quick example with a purposeful bug for illustrating Eclipse debugging 
 */

public class DebuggingExample2 {
  
  public static void main(String[] args){ 
    //FizzBuzz
    int maxValue = 15;
    fizz(maxValue);
    buzz(maxValue);
    fizzBuzz(maxValue);

  }
  //Print Fizz for every multiple of 3 up to a number
  private static void fizz(int end){
    for(int i = 0; i <= end; i++){
      if(i % 3 == 0){
        System.out.println("Fizz");
      }
    }
  }
  //Print Buzz for every multiple of 5 up to a number
  private static void buzz(int end){
    for(int i = 0; i <= end; i++){
      if(i % 5 == 0){
        System.out.println("Buzz");
      }
    } 
  }
  //Print FizzBuzz for every multiple of 5 and 3
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
