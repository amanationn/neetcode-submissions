class Solution {
    public int heightChecker(int[] heights) {
        //trying counting sort - https://www.youtube.com/watch?v=OKd534EWcdk
        //https://medium.com/@vishalini.sharma/d93c838ebc92

        int minv = 100, maxv = 1;
        for(int h: heights) {
            minv = Math.min(minv, h);
            maxv = Math.max(maxv, h);
        }
        int k = maxv - minv + 1; //count array window

        int[] count = new int[k];
        for(int h: heights) { //counting each occurrence
            count[h - minv] += 1;
        }
        for(int i=1; i<count.length-1; ++i) { //cumulative sum
            count[i] += count[i-1];
        }
        for(int i=count.length-1; i>0; --i) { //shift one position for index
            count[i] = count[i-1];
        }
        count[0] = 0;

        //build sorted arr
        int[] sorted_heights = new int[heights.length];
        for(int h: heights) {
            sorted_heights[count[h - minv]] = h;
            count[h - minv] += 1;
        }
        
        int ans = 0;
        for(int i=0; i<heights.length; ++i) {
            if(heights[i] != sorted_heights[i])
                ans += 1;
        }
        return ans;
    }
}