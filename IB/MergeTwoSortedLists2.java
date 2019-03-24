public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                result.add(a.get(i));
                i++;
            } else {
                result.add(b.get(j));
                j++;
            }
        }
        for (int k = i; k < a.size(); k++) {
            result.add(a.get(i++));
        }
        for (int k = j; k < b.size(); k++) {
            result.add(b.get(j++));
        }
        a.clear();
        a.addAll(result);
    }
}
