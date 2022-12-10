import java.util.Scanner;




public class arrays1 {

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int input[] = new int[size];
        for(int i = 0  ;i<size ; i++){
            input[i]=sc.nextInt();
        }
        for (int i = 0 ; i<size ; i++){
            System.out.print(input[i]+ " ");
        }
        System.out.println();
       
    }

}
