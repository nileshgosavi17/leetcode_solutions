/*
Given an integer n, return the number of trailing zeroes in n!.

Follow up: Could you write a solution that works in logarithmic time complexity?*/

class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0)
        {
            n /=5;
            count +=n;
            
        }
        return count;
    }
}
