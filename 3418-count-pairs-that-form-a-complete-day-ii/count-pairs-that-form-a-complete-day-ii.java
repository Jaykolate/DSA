class Solution {
    public long countCompleteDayPairs(int[] hours) {
        int count[] = new int[24];

        long ans = 0;

        for(int h:hours){

            int rem = h%24;
            int need  = (24-rem)%24;

            ans+= count[need];

            count[rem]++;
        }
        return ans;
    }
}