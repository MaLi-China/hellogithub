package geektime.package11_sort;

import org.junit.Test;

/**
 * 插入排序
 *
 * @Author Mark
 * @Date 2021/2/14
 */
public class InsertSort2 {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            //寻找插入位置
            for (int j = i - 1; j >= 0; j--) {
                // 将未排序中的元素依次取出, 与已排序中的元素挨个比对,
                if (tmp < array[j]) {
                    // 未排序元素比已排序中的元当前元素小, 则向右移动已排序元素
                    array[j + 1] = array[j];
                } else {
                    // 未排序元素比已排序中的元素大, 则插入, 跳出循环
                    array[j + 1] = tmp;
                    break;
                }
                //没有跳出, 则索引到达数组起始位置
                array[j] = tmp;
            }
        }
    }

    @Test
    public void testMethod() {
        int[] array = new int[]{4, 5, 6, 1, 3, 2};
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
