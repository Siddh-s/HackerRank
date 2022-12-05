import java.util.Scanner;
public class checkPrime {

    public  static boolean checkPrime1 (int n){
          int div = 2;
          while(div <= n/2){
            if(n%div == 0){
                  return false ;
            }
            div = div +1 ;
          }
          return true ; 
    }
      public static void main (String [] args){
        int n ;
        Scanner s = new Scanner (System.in);
        n = s.nextInt();
        boolean isPrime = checkPrime1(n);
        System.out.println(isPrime); 
      }
      

}
