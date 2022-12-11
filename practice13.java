import java.util.Scanner ;
public class linearsearch {
    public static int linearSearch(int arr[] , int value ){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]== value){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int N = sc.nextInt();
        
        System.out.println("Enter elements:");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
          arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element");
        int value = sc.nextInt();
        int search = linearSearch(arr, value);
        System.out.println("The element is present at index"+ search);   
}
}
