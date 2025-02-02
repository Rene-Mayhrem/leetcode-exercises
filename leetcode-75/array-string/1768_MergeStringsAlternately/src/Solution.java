public class Solution {
  public String mergeAlternately (String word1, String word2) {
    StringBuilder mergedString = new StringBuilder();
    int p1 = 0, p2 = 0; //? pointer for word2
    // ? Iterate until both indices have reached the end of their respective strings
    while (p1 < word1.length() || p2 < word2.length()) {
      // ? Append characters if the indices are between bounds
      if (p1 < word1.length()) mergedString.append(word1.charAt(p1++));
      if (p2 < word2.length()) mergedString.append(word2.charAt(p2++));
    }
    return mergedString.toString();
  }
}
