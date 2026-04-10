class Solution {
    public String firstPalindrome(String[] words) {
        /*for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            if(word.equals(sb.reverse().toString())) {
                return word;
            }
        }
        return"";*/
        for(int i=0;i<words.length;i++){
            if(new StringBuilder(words[i]).reverse().toString().equals(words[i])){
                  return words[i];
            }
        }
        return "";
    }
}