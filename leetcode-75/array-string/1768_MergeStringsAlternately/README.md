# Intuition

Iteration seems ti be the best option. Iterate through the longest length of both words, appending one character from each word alternately. It is important to handle cases where the strings have different lengths.

# Approach

The first approach is to take consideration of the pointer of every word. So, let's get started by:

1. **String Builder**: Using a `StringBuilder` is efficient because is mutable, unlike a regular `string` which is immutable. This helps in reducing the time complexity.
2. **Pointers**: Pointers are used to keep track of the current index of each word.
3. **Conditionals**: Conditionals are used to append characters only if there are characters left to be added.

# Complexity
- **Time complexity:** O(n), where **n** is the length of the longer string.
- **Space complexity:** O(1), as no additional space proportional to the input size is used.

# Code
```java []
class Solution {
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
}
```