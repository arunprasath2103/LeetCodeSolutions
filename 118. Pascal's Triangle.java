class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ptri = new ArrayList<>();
        if(numRows == 0){
            return ptri;
        }
        ptri.add(Arrays.asList(1));
        if(numRows == 1) {
            return ptri;
        }
        ptri.add(Arrays.asList(1, 1));
        List<Integer> temp = new ArrayList<>();
        for(int i = 1; i < numRows - 1; i++) {
            temp.add(1);
            for(int j = 0; j < i; j++) {
                temp.add((int) (ptri.get(i).get(j) + ptri.get(i).get(j + 1)));
            }
            temp.add(1);
            ptri.add(new ArrayList<>(temp));
            temp.clear();
        }
        return ptri;
    }
}