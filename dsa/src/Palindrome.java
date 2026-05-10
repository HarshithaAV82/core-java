public class Palindrome {

    public static void main(String[] args) {

        int number = 121;

        int original = number;
        int reverse = 0;

        while (number > 0){
            int remainder = number % 10;

            reverse = reverse * 10 + remainder;

            number = number / 10;

        }

        if(original == reverse){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
