

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String longest = "";
        String curr = "";
        boolean newSubstring = true;
        for (int i = 0; i < (s.length() - longest.length()+1); i++) {
            if (newSubstring) {
                curr = "";
                newSubstring = false;
            }

            char currChar = s.charAt(i);

            if (curr.indexOf(currChar) != -1) {
                newSubstring = true;
            }

            if (curr.indexOf(currChar) == -1){
                curr = curr + currChar;
                for (int j = i+1; j< s.length()- 1; j++) {
                       char innerChar = s.charAt(j);
                       if (curr.indexOf(innerChar) != -1) {
                           newSubstring = true;
                           break;
                       } else {
                           curr = curr + innerChar;
                       }
                }

                if (curr.length() > longest.length()) {
                    longest = curr;
                }
            }

            newSubstring = true;
        }

        return longest.length();

    }
}