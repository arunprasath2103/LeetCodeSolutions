class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ptri = new ArrayList<>();
        ptri.add(Arrays.asList(1));
        if(rowIndex == 0) {
            return ptri.get(rowIndex);
        }
        ptri.add(Arrays.asList(1, 1));
        List<Integer> temp = new ArrayList<>();
        for(int i = 1; i < rowIndex; i++) {
            temp.add(1);
            for(int j = 0; j < i; j++) {
                temp.add((int) (ptri.get(i).get(j) + ptri.get(i).get(j + 1)));
            }
            temp.add(1);
            ptri.add(new ArrayList<>(temp));
            temp.clear();
        }
        return ptri.get(rowIndex);
    }
}
