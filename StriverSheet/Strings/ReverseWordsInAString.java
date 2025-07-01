//LC151
class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        s=s.trim();
        StringBuilder strb = new StringBuilder();
        for(int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                strb.append(ch); 
                
            }
            else if (strb.length() > 0){
                stack.push(strb.toString());
                strb.setLength(0);
            }
            
        }
        if(strb.length() > 0){
            stack.push(strb.toString());
        }
        StringBuilder ans = new StringBuilder();
        while(stack.size() > 0){
            ans.append(stack.pop());
            if (!stack.isEmpty()) ans.append(" ");
            
        }
        return ans.toString();
        
    }
}
