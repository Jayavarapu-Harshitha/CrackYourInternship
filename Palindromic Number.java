class Solution {
    public boolean isPalindrome(int x) {
        int rev=0, i=1, y=x;
        while( x != 0 ) {
            int res = x % 10; 
            rev = res + ( rev * i );
            x = x / 10;
            i = 10;
        }
        if( y  == rev && y >= 0 ) {
            return true;
        }
        return false;
    }
}
