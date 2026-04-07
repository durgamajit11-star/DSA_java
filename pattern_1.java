import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello , Pattern !");
        // pattern 1
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}