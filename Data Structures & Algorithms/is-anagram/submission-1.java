class Solution {
   public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = getCharacterIntegerMap(t);
        Map<Character, Integer> tMap = getCharacterIntegerMap(s);
        return tMap.equals(sMap);
    }

    private Map<Character, Integer> getCharacterIntegerMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ints = s.toCharArray();
        for (char c : ints) {
            if (map.containsKey(c)) {
                int cc = map.get(c);
                cc++;
                map.put(c, cc);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
