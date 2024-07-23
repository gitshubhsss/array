public class kadaneAlgo {
    public static void main(String[] args) {
        // kadane states that if we get a sum in negative number
        // make the sum as 0

        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = arr.length;
        int i = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (i < n) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    if (sum < 0) {
                        sum = 0;
                    }
                    System.out.print(arr[k] + " ");
                }
                System.out.print(" = " + sum);
                System.out.println();
                if (sum > maxSum) {
                    maxSum = sum;
                }
                sum = 0;
            }
            System.out.println();
            i++;
        }
        System.out.println("maxsum : " + maxSum);
    }
}
