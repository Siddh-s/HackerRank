public class bubblesorrt {
    public static void bubbleSort (int input[]){
        for(int i = 0 ; i< input.length -1 ; i++){
            for(int j = 0 ; j< input.length -i -1; j++){
                if(input[j]> input[j+1]){
                    int temp = input[j];
                    input[j]= input[j+1];
                    input[j+1]= temp;/*bubble sort */
                }
            }
        }

    }
    public static void main (String args[]){
        int[] input ={54,2,34,50} ;
        bubbleSort(input);
        for(int i = 0; i<input.length ;i++){
            System.out.println(input[i]);
        }
    }
    
}
