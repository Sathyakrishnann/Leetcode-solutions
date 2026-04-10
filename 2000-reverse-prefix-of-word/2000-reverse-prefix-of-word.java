class Solution {
    public String reversePrefix(String word, char ch) {
        int right = word.indexOf(ch);
        if(right == -1 || right == 0) {
            return word;
        }
        char[] words = word.toCharArray();
        int left = 0;
        while(left<right) {
            char temp = words[right];
            words[right] = words [left];
            words[left] = temp;
            left++;
            right--;
        }
        return new String(words);
    }
}