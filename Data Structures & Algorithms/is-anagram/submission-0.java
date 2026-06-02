class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //string---> Array
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        //sorting the array
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
