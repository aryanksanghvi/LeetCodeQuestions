class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] prev = intervals[0];
        List<int[]> ans = new ArrayList<>();
        for(int i = 1; i < intervals.length; i++){
            int[] inter = intervals[i];
            if(inter[0] <= prev[1]){
                prev[1] = Math.max(prev[1], inter[1]);
            }
            else{
                ans.add(prev);
                prev = inter;
            }
        }
        ans.add(prev);
        int[][] fin = ans.toArray(new int[ans.size()][]);
        return fin;
    }
}