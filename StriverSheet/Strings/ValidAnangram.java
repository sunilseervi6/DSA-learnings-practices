class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character , Integer > mapS = new HashMap<>();
         
        for(int i=0 ;i<s.length() ; i++){
            char cs = s.charAt(i);
            mapS.put(cs , mapS.getOrDefault(cs,0)+1);
        }
        for(int i=0 ;i<t.length();i++){
            char ct = t.charAt(i);
            if(!mapS.containsKey(ct) || mapS.get(ct) == 0){
                return false;
            }
            mapS.put(ct,mapS.get(ct)-1);
            
        }
        return true;
         


    }
}
