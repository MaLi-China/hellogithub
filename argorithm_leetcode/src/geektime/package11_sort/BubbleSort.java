package geektime.package11_sort;

import org.junit.Test;

/**
 * @Author Mark
 * @Date 2021/2/9
 */
public class BubbleSort {
    /**
     * 执行冒泡排序
     *
     * @param arrays 待排序数组
     * @param order  正序or逆序
     * @return
     */
    public static int[] sort(int[] arrays, boolean order) {
        // 1, 特殊情况, 数组的长度小于等于1, 没有必要排序, 直接返回
        if (arrays.length <= 1) {
            return arrays;
        }
        // 2, 根据order确定是正序, 还是倒序拍你
        int flag = order ? 1 : -1;
        // 3, 数据交换标志位
        boolean change = false;
        int temp = 0;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (flag * (arrays[j] - arrays[j + 1]) > 0) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    change = true;
                }
            }
            // 优化, 如果没有数据交换, 则提前退出
            if (!change) {
                break;
            }
        }
        return arrays;
    }


    /**
     * 执行冒泡排序
     *
     * @param arrays 待排序数组
     * @return
     */
    public static int[] sort(int[] arrays) {
        return sort(arrays, true);
    }

    /**
     * 冒泡排序: 小到大
     *
     * @param arrays
     * @return
     */
    public static int[] sort_exercise(int[] arrays) {
        //1, 遍历array集合的每一个元素与下一个元素的值
        int length = arrays.length;
        int tmp = 0;
        //设定冒泡几次
        for (int i = 0; i < length - 1; i++) {
            //2, 和后面的元素比, 如果this>next --> 交换
            // 设定比较的范围: 第0个和第1个比较, ...
            for (int j = i; j < length - 1; j++) {
                // array[j]
                if (arrays[j]>arrays[j+1]){
                    tmp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = tmp;
                }
            }
        }
        return arrays;
    }

    @Test
    public void testMethod(){
        int[] arrays = {1, 5, 2, 6, 3};
        arrays = sort_exercise(arrays);
        for (int element : arrays) {
            System.out.println(element);
        }
    }


}