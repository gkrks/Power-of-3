
public class Solution {
    public boolean isPowerOfThree(int n) {
        int num = n;
        int sum = 0;
        while(n > 1){
            int r = n % 3;
            sum = sum + r;
            n = n/3;
        }
        if(sum == 0 && num >0 ){
            return true;
        }
        else{
            return false;
            
            
        }
        
    }
}
