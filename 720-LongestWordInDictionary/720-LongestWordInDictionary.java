// Last updated: 13/08/2026, 09:37:32
class Solution {
    class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    Node root = new Node();
    String ans = "";
    private void insert(String word) {
        Node curr = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    private void getLongestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {

                char ch = (char) (i + 'a');
                temp.append(ch);

                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }

                getLongestWord(root.children[i], temp);

                temp.deleteCharAt(temp.length() - 1); // backtrack
            }
        }
    }

    public String longestWord(String[] words) {
         for (String word : words) {
            insert(word);
        }
        getLongestWord(root, new StringBuilder(""));

        return ans;
    }
}