class NumberStringRunner{

    public static void main(String[] args) {

        NumberStringOperations obj = new NumberStringOperations();

        int[] arr1 = {1, 2, 3, 4};
        obj.findEvenOddSum(arr1);

        System.out.println("Reversed String: " + obj.reverseString("hello"));

        System.out.println("Is 121 Palindrome? " + obj.isPalindrome(121));

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println("Total Sum: " + obj.findTotalSum(arr2));
    }
}