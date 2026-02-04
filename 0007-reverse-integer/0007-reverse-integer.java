class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0){
            int dig =x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && dig > 7))
                return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && dig < -8))
                return 0;
            reverse = reverse * 10 + dig;
            x /= 10;
        }
        return reverse;
    }
}