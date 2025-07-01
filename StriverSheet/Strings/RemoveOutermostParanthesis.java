//LC1021
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder strb = new StringBuilder();
        int count = 0 ;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count != 0){
                    strb.append(ch);
                }
                count++;
            }
            else{
                if(count>1){
                    strb.append(ch);
                    
                }
                count--;
            }
        }
        return strb.toString();
    }
}
