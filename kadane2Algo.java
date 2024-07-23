public class kadane2Algo {
    public static void main(String[] args) {

        int arr[] = { 1,-2,6,-1,3};
        int n = arr.length;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int i=0;
        while (i<n) {
            sum=sum+arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
            i++;
        }
        System.out.println("maxsum : "+maxSum);
    }
}
