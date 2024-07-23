public class kadansAlgorithm {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1};
        int n=arr.length;
        int i=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        while (i<n) {
            sum=sum+arr[i];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            i++;
        }
        System.out.println(max);
    }
}
