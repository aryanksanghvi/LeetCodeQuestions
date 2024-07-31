class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        String f = strs[0];
        String l = strs[strs.length - 1];
        int n = Math.min(f.length(), l.length());
        for(int i = 0; i < n; i++){
            if(f.charAt(i) != l.charAt(i)){
                return ans.toString();
            }
            ans.append(f.charAt(i));
        }
        return ans.toString();
    }
}