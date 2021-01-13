package LeetCode;

public class P42_Trapping_Rain_Water {
    public int trap(int[] height) {
        int size = height.length;
        if (size < 2)
            return 0;
        int center = 0;
        int result = 0;

        int maxIndex = 0;
        for(int i = 0; i < size; i++) {
            if(height[maxIndex] < height[i])
                maxIndex = i;
        }

        for(int i = 0; i < size; i++) {
            if(height[maxIndex] < height[i])
                maxIndex = i;
        }


        while (center < size + 1) {
            int k = 0;
            int L = 0;
            int R = 0;
            while (center - k - 1 >= 0 && center + k + 1 < size && height[center - k - 1] > height[center - k] && height[center + k] < height[center + k + 1]) {
                k++;
            }

            while (center - k - L > 0 && center + k + R < size && height[center - k - L] < height[center + k + R] && height[center - k - L - 1] >= height[center + k + R]) {
                L++;
            }

            //System.out.println((center - k - L) + ":" + (center + k + R));

            while (center + k + R < size - 1 && center - k - L >= 0 &&height[center - k - L] > height[center + k + R] && height[center + k + R + 1] >= height[center - k - L]) {
                R++;
            }

            int from = center - k - L;
            int to = center + k + R;
            System.out.println(from + ":" + to);
            if (to - from >= 2) {
                int h = height[from] > height[to] ? height[to] : height[from];
                for (int i = from; i < to; i++) {
                    if ((h - height[i]) > 0) {
                        result += (h - height[i]);
                    }
                }
            }
            center = center + k + 1;
        }
        return result;
    }

//    public int trap(int[] height) {
//        int size = height.length;
//        if (size < 2)
//            return 0;
//        int center = 1;
//        int result = 0;
//        while (center < size + 1) {
//            int k = 0;
//            while (center - k - 1 >= 0 && center + k + 1 < size && height[center - k - 1] > height[center - k] && height[center + k] < height[center + k + 1]) {
//                k++;
//            }
//
//            int from = center - k;
//            int to = center + k;
//            if (to - from >= 2) {
//                int h = height[from] > height[to] ? height[to] : height[from];
//                for (int i = from; i < to; i++) {
//                    if ((h - height[i]) > 0) {
//                        result += (h - height[i]);
//                    }
//                }
//            }
//            center = center + k + 1;
//        }
//        return result;
//    }
}

