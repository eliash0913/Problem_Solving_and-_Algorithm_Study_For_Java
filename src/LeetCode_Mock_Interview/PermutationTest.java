package LeetCode_Mock_Interview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {
    Permutation p = new Permutation();
    @Test
    void permute() {
        List<List<Integer>> results = new ArrayList<>();
        results.add(Arrays.asList(1,2,3));
        results.add(Arrays.asList(1,3,2));
        results.add(Arrays.asList(2,1,3));
        results.add(Arrays.asList(2,3,1));
        results.add(Arrays.asList(3,2,1));
        results.add(Arrays.asList(3,1,2));
        assertEquals(results, p.permute(new int[]{1,2,3}));
    }
}