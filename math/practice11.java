import java.util.Scanner;




public class arrays2 {
    public static int[] takeInput(){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int input[] = new int[size];
        for(int i = 0  ;i<size ; i++){
            input[i]=sc.nextInt();
    }
    return input ;
}
    public static void toPrint ( int input[]){
        int size = input.length;
        for (int i = 0 ; i<size ; i++){
            System.out.print(input[i]+ " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int arr[] = takeInput();
        System.out.println(arr); 
       
    }

}

