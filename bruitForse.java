public class bruitForse {
    public static void main(String[] args) {
        //bruit force
        int arr[]={1,-2,6,-1,3};
        int sum=0;
        int maxSubSum=0;
        int n=arr.length;
        int i=0;
        while (i<n) {
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print(" = "+sum);

                if(sum>maxSubSum){
                    maxSubSum=sum;
                }
                sum=0;
                System.out.println();
            }
            System.out.println();
            i++;
        }
        System.out.println("maxSunsum : "+8);
    }
}
