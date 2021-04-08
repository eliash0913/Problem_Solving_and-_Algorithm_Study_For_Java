package LeetCode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P811_Subdomain_Visit_CountTest {
    P811_Subdomain_Visit_Count p811 = new P811_Subdomain_Visit_Count();

    @Test
    void test1(){
        String[] input = new String[]{"9001 discuss.leetcode.com"};
        List<String> expected = new ArrayList<>(Arrays.asList("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"));
        assertIterableEquals(expected, p811.subdomainVisits(input));
    }

    @Test
    void test2(){
        String[] input = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> expected = new ArrayList<>(Arrays.asList("901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"));
        assertIterableEquals(expected, p811.subdomainVisits(input));
    }
}