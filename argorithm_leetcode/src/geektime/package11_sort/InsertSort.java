package geektime.package11_sort;

import org.junit.Test;

/**
 * @Author Mark
 * @Date 2021/2/10
 */
public class InsertSort {
    public static int[] insertSort(int[] arrays) {
        // 元素的比较 与 移动

        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j > 0 && j < arrays.length; j--) {
                int tmp = arrays[j];
                //1, 依次比较
                if (arrays[j] < arrays[j - 1]) {
                    //2, 移动
                    arrays[j] = arrays[j - 1];
                    arrays[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
        return arrays;
    }

    @Test
    public void testMethods() {
        int[] arrays = insertSort(new int[]{5, 4, 3, 2, 1});
        for (int element : arrays) {
            System.out.println(element);
        }
    }
}
