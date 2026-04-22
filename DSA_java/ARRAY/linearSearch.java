import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
      int[] arr = {20,54,30,75};
      int key = 30;
    
    for(int i=0;i> arr.length; i++){
      if(arr[i] == key){
        System.out.println("Found At Index : " + i);
      }
      System.out.println("Not Found !");
    }
    }
}
