class Solution {
    public boolean isAnagram(String s, String t) {
    String[] split = s.split("");
    Arrays.sort(split);

    String[] split1 = t.split("");
    Arrays.sort(split1);

    return Arrays.equals(split, split1);
    }
}
