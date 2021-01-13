package LeetCode_Mock_Interview;

import SortingAlgorithm.InsertionSort;

import java.util.ArrayList;

public class Trie {
    Node root;
    int offset = 'a';

    public Trie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(root.children[word.charAt(0)-offset]==null)
            root.children[word.charAt(0)-offset] = new Node(word.charAt(0));
        Node currentNode = root.children[word.charAt(0)-offset];
        for(int i = 1; i < word.length(); i++) {
            if(currentNode.children[word.charAt(i)-offset] == null)
                currentNode.children[word.charAt(i)-offset] = new Node(word.charAt(i));
            currentNode = currentNode.children[word.charAt(i)-offset];
        }
        currentNode.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node currentNode = root;
        for(int i = 0; i < word.length(); i++) {
            if(currentNode.children[word.charAt(i)-offset]==null)
                return false;
            else
                currentNode = currentNode.children[word.charAt(i)-offset];
        }
        if(currentNode.getEnd())
            return true;
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node currentNode = root;
        for(int i = 0; i < prefix.length(); i++) {
            if(currentNode.children[prefix.charAt(i)-offset]!=null)
                currentNode = currentNode.children[prefix.charAt(i)-offset];
            else
                return false;
        }
        return true;
    }
}

class Node {
    char value;
    Node[] children = new Node[26];
    boolean isEnd = false;

    public Node () {};
    public Node(char value) {
        this.value = value;
    }

    void setEnd() {
        isEnd = true;
    }

    boolean getEnd() {
        return isEnd;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

//class TrieNode {
//
//    // R links to node children
//    private TrieNode[] links;
//
//    private final int R = 26;
//
//    private boolean isEnd;
//
//    public TrieNode() {
//        links = new TrieNode[R];
//    }
//
//    public boolean containsKey(char ch) {
//        return links[ch -'a'] != null;
//    }
//    public TrieNode get(char ch) {
//        return links[ch -'a'];
//    }
//    public void put(char ch, TrieNode node) {
//        links[ch -'a'] = node;
//    }
//    public void setEnd() {
//        isEnd = true;
//    }
//    public boolean isEnd() {
//        return isEnd;
//    }
//}
//
//class Trie {
//    private TrieNode root;
//
//    public Trie() {
//        root = new TrieNode();
//    }
//
//    // Inserts a word into the trie.
//    public void insert(String word) {
//        TrieNode node = root;
//        for (int i = 0; i < word.length(); i++) {
//            char currentChar = word.charAt(i);
//            if (!node.containsKey(currentChar)) {
//                node.put(currentChar, new TrieNode());
//            }
//            node = node.get(currentChar);
//        }
//        node.setEnd();
//    }
//    // search a prefix or whole key in trie and
//    // returns the node where search ends
//    private TrieNode searchPrefix(String word) {
//        TrieNode node = root;
//        for (int i = 0; i < word.length(); i++) {
//            char curLetter = word.charAt(i);
//            if (node.containsKey(curLetter)) {
//                node = node.get(curLetter);
//            } else {
//                return null;
//            }
//        }
//        return node;
//    }
//
//    // Returns if the word is in the trie.
//    public boolean search(String word) {
//        TrieNode node = searchPrefix(word);
//        return node != null && node.isEnd();
//    }
//
//    public boolean startsWith(String prefix) {
//        TrieNode node = searchPrefix(prefix);
//        return node != null;
//    }
//}
