class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tr = new ArrayList<>();

        tr.add(new ArrayList<>(List.of(1)));
        if(numRows == 1) //0
            return tr;

        tr.add(new ArrayList<>(List.of(1, 1)));
        if(numRows == 2) //1
            return tr;
        
        int k = 2;
        while(k < numRows) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            int i = 1;
            List<Integer> prev = tr.get(k - 1);
            
            while(i < k) {
                temp.add(prev.get(i) + prev.get(i - 1));
                i++;
            }

            temp.add(1);
            
            tr.add(temp);
            k++;
        }

        return tr;
    }
}