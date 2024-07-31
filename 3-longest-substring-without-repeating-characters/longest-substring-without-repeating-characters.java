class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int m = 0;
        HashSet<Character> a = new HashSet<>();
        for(int r = 0; r < n; r++){
            if(!a.contains(s.charAt(r))){
                a.add(s.charAt(r));
                m = Math.max(m, r - l + 1);
            }
            else{
                while(a.contains(s.charAt(r))){
                    a.remove(s.charAt(l));
                    l++;
                }
                a.add(s.charAt(r));
            }
        }
        return m;
    }
}