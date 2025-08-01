class Solution {
    public boolean isHappy(int n){
        int fast =n;
        int slow=n;
        //fast and slow pointers jus like linkedlist cycle problems
        //if both meets cycle is there and it is not a happy number
        do{
            slow = findSquare((slow));
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
        
    }
    private int findSquare(int num){
        int ans=0;
        while(num > 0){
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }
        return ans;
    }
}
