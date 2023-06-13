package in.ineuron.assignment02;

class Solution5 {
	
	public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for(int n : nums) {
            // to get the minimum two numbers
            if(n<min1) {
                min2 = min1;
                min1 = n;
            } else if (n<min2) {
                min2 = n;
            }
            // to get the maximum 3 numbers
            if(n>max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if(n>max2) {
                max3 = max2;
                max2 = n;
            } else if(n>max3) {
                max3 = n;
            }
        }
        return Math.max(max1*max2*max3 , min1*min2*max1);
    }
}