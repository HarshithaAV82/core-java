class NumberStringOperations{

    void findEvenOddSum(int[] arr) {

        int evenSum = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Odd Sum = " + oddSum);
        System.out.println("Even Sum = " + evenSum);
    }

    String reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    boolean isPalindrome(int number) {

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return original == reverse;
    }

    int findTotalSum(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
}