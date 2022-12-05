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
    public static boolean checkPrime2 ( int n){

        int div = 2 ;
        boolean isPrime = true ;
        while ( div <= n/2){
            if (n % div == 0){
                isPrime = false ;
                break;
            }
            div = div + 1 ;
        }
        if (isPrime){
            return true ; 
        }
        else{
            return false ;
        }
    } 
      public static void main (String [] args){
        int n ;
        Scanner s = new Scanner (System.in);
        n = s.nextInt();
        boolean isPrime = checkPrime2(n);
        System.out.println(isPrime); 
      }
      

}
