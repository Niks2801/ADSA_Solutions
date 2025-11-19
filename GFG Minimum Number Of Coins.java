class Solution {
    public int findMin(int n) {
        // code here
          int totalCoins=0;
         totalCoins+=(n/10);
        n=n%10;
        totalCoins+=(n/5);
        n=n%5;
        totalCoins+=(n/2);
        n=n%2;
        totalCoins+=(n/1);
        n=n%1;
        
        return totalCoins;
    }
    
}
