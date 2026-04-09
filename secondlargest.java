import java.util.*;

public class secondlargest {
    public static void main(String[] args) {
      // System.out.println("Hello, World!");
      int[] arr = {10,20,4,45,99};
      int first = Integer.MIN_VALUE;
      int second = Integer.MIN_VALUE;
      
      for(int i=0;i<arr.length;i++){
        if (arr[i] > first)
        {
          second = first;
          first = arr[i];
        }
        else if(arr[i] > second && arr[i] != first){
          second = arr[i];
        }
          
      }
      System.out.println("second largest = " + second);
     
    }
}
