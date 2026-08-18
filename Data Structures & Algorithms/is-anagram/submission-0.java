class Solution {
   public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        char[] ints = s.toCharArray();
        for (char c : ints) {
            if (sMap.containsKey(c)) {
                int cc = sMap.get(c);
                cc++;
                sMap.put(c, cc);
            } else {
                sMap.put(c, 1);
            }
        }
        char[] chars = t.toCharArray();
        for (char c : chars) {
            if (tMap.containsKey(c)) {
                int cc = tMap.get(c);
                cc++;
                tMap.put(c, cc);
            } else {
                tMap.put(c, 1);
            }
        }

        return tMap.equals(sMap);
    }
}
