/**
 * DebuggingExample class
 * <p>
 * Quick example with a purposeful bug for tracing and print statements.
 */

public class DebuggingExample {
  
  public static void main(String[] args){ 
    iteratePrint([3, 4, 5]);
  }
  private static void iteratePrint(int[] arr){
    for(int i = 0; i <= arr.length; i++){
      System.out.println(arr[i]);
    } 
  }
}
