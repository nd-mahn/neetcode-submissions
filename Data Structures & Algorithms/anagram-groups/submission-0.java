class Solution {
 public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String c : strs) {
            checkAnagrams(c, map);
        }
        if (!map.isEmpty()) {
            return new ArrayList<>(map.values());
        }
        return Collections.emptyList();
    }

    public void checkAnagrams(String ar1, Map<String, List<String>> map) {
        char[] charAr1 = ar1.toCharArray();
        Arrays.sort(charAr1);
        String s = new String(charAr1);
        if (map.containsKey(s)) {
            List<String> strings = map.get(s);
            strings.add(ar1);
        } else {
            List<String> strings = new ArrayList<>();
            strings.add(ar1);
            map.put(s, strings);
        }
    }
}
