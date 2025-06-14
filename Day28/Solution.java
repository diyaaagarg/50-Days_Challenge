//Problem-> 2470. Number of Subarrays With LCM Equal to K
class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int l=nums[i];
            if(l==k)count++;
            for(int j=i+1;j<nums.length;j++){
                l=lcm(l,nums[j]);
                if(l==k)count++;
                if(l>k)break;
            }
        }
        return count;
    }
    int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
