class Solution {
    public String truncateSentence(String s, int k) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (k != 1) {
            if (s.charAt(i) == ' ') {
                k--;
            }
            sb.append(s.charAt(i));
            i++;
        }
        while (i < s.length() && s.charAt(i) != ' ') {
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}