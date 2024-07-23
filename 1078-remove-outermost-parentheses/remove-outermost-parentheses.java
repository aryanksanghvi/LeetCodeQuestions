class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder a = new StringBuilder();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '(' && count == 0){
                count++;
            }
            else if(s.charAt(i) == '(' && count >= 1){
                a.append(s.charAt(i));
                count++;
            }
            else if(s.charAt(i) == ')' && count > 1){
                a.append(s.charAt(i));
                count--;
            }
            else if(s.charAt(i) == ')' && count == 1){
                count--;
            }
        }
        String b = a.toString();
        return b;
    }
}