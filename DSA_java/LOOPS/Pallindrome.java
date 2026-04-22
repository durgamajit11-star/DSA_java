public class Palindrome {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}