public class binarysearch {
    public static int binarySearch ( int[] input , int elem ){
int start = 0 ;
int end   = input.length - 1 ;
while(start<= end){
    int mid = (start+ end)/ 2 ;
    if(elem > input[mid]){
        start = mid + 1;
    }else if(elem == input[mid]){
        return mid ;
    }else{
        end = mid - 1 ;
    }
}
return -1 ;

    }
    public static void  main (String args[] ){
        int[] input = {2,4,6,9,13,15} ;
        int search = binarySearch(input, 13);
        System.out.println(search);

    }
}
