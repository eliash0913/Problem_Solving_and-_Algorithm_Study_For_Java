package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {
    Trie trie = new Trie();

    @Test
    void Test1() {
        trie.insert("apple");
        assertEquals(true, trie.search("apple"));
    }

    @Test
    void Test2() {
        assertEquals(false, trie.search("app"));
    }

    @Test
    void Test3() {
        trie.insert("apple");
        assertEquals(true, trie.startsWith("app"));
    }

    @Test
    void Test4() {
        trie.insert("app");
        assertEquals(true, trie.search("app"));
    }

    @Test
    void Test5() {
        trie.insert("hello");
        assertEquals(false, trie.search("hell"));
        assertEquals(false, trie.search("helloa"));
        assertEquals(true, trie.search("hello"));
        assertEquals(true, trie.startsWith("hell"));
        assertEquals(false, trie.startsWith("helloa"));
        assertEquals(true, trie.startsWith("hello"));
        assertEquals(false, trie.startsWith("hellx"));
        trie.insert("jam");
        assertEquals(false, trie.startsWith("jan"));
    }

    @Test
    void Test6() {
        trie.insert("a");
        assertEquals(true, trie.search("a"));
        assertEquals(true, trie.startsWith("a"));
    }

    @Test
    void Test7() {
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        assertEquals(false, trie.search("apps"));
        assertEquals(true, trie.search("app"));
        assertEquals(false, trie.search("ad"));
        assertEquals(false, trie.search("applepie"));
        assertEquals(false, trie.search("rest"));
        assertEquals(false, trie.search("jan"));
        assertEquals(false, trie.search("rent"));
        assertEquals(true, trie.search("beer"));
        assertEquals(true, trie.search("jam"));
        assertEquals(false, trie.startsWith("apps"));
        assertEquals(true, trie.startsWith("app"));
        assertEquals(true, trie.startsWith("ad"));
        assertEquals(false, trie.startsWith("applepie"));
        assertEquals(false, trie.startsWith("rest"));
        assertEquals(false, trie.startsWith("jan"));
        assertEquals(true, trie.startsWith("rent"));
        assertEquals(true, trie.startsWith("beer"));
        assertEquals(true, trie.startsWith("jam"));
    }
}