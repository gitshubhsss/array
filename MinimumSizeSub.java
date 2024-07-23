public class MinimumSizeSub {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int sum=0;
        int count=0;
        int target=11;
        boolean isMin=true;
        int minCout=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                    count++;
                }
                if(sum==target){
                    System.out.print(" = "+sum);
                    if(minCout>count){
                        minCout=count;
                    }
                    isMin=false;  
                }
                count = 0;
                sum=0;

                System.out.println();
            }
            System.out.println();
        }
        if(isMin==true){
            minCout=0;
        }
        System.out.println("mimimum count is "+minCout);
    }
}
