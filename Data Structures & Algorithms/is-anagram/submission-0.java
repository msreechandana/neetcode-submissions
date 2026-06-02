class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1= s.toCharArray();
        char[] str2= t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        String str3 = new String(str1);
        String str4 = new String(str2);

        if(str3.equals(str4))
        return true;

        return false;
    }
}
