class SumOfDigits{

    public static void main(String[] args) {

        int a = 12345;
        int sum = 0;

        while (a > 0) {

            int digit = a % 10;   // get last digit
            sum = sum + digit;    // add to sum
            a = a / 10;          // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
    }
}