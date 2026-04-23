class EvenOdd{

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("oddSum = " + oddSum);
        System.out.println("evenSum = " + evenSum);
    }
}