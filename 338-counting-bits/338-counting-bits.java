class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        if(n==0)
            return arr;
        arr[1]=1;
         for(int num=2; num<=n; num++){
        if(num % 2 == 0)    
                arr[num] = arr[num/2];
        else
                arr[num] = 1+ arr[num/2];  
    }
    return arr;
}
}