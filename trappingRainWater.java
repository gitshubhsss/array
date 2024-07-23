public class trappingRainWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        int n=arr.length;
        int maxLeft=0;
        int maxRight=0;
        int volume=0;
        int i=0;
        while (i<n) {
            
           if(i==0){
            maxLeft=arr[i];
           }
           else{
            //finding the max left
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    maxLeft=arr[j];
                }
              
            }
             //finding the right max
             for(int k=i+1;k<n;k++){
                    if(arr[k]>arr[i]){
                        maxRight=arr[k];
                        break;
                    }
             }
           }
            int watertapping=Math.min(maxRight, maxLeft);
            volume=volume+(watertapping-arr[i]);
            System.out.print(volume+" ");
            
            i++;
           
        }
        System.out.println(volume);
    }
}
