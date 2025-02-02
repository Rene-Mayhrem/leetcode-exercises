public class Solution {
  public String mergeAlternately (String word1, String word2) {
    StringBuilder mergedString = new StringBuilder();
    int p1 = 0; //? pointer for word1
    int p2 = 0; //? pointer for word2
    // ? Iterate until both pointer have reached the end of their respective strings
    while (p1 < word1.length() || p2 < word2.length()) {
      // ? Check if pointer 1 is fit to append values to the string builder
      if (p1 < word1.length()) mergedString.append(word1.charAt(p1));
      // ? Check if pointer 2 is fit to append values to the string builder
      if (p2 < word2.length()) mergedString.append(word2.charAt(p2));
      p1++;
      p2++;
    }
    return mergedString.toString();
  }
}
