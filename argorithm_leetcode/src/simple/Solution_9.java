package simple;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_9 {
    /*
        判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        你能不将整数转为字符串来解决这个问题吗？
        思路1: 转换为字符串
        思路2: 拆分
     */
    public boolean isPalindrome(int x) {
        // 负数, 不是
        if (x < 0) {
            return false;
        }
        // 正数: <10
        if (x < 10) {
            return true;
        }
        // 整数 >=10
        int tmp = x;
        // 将每一位拆分出来放到ArrayList里面
        ArrayList<Integer> intList = new ArrayList<>();
        while (x > 0) {
            intList.add(x % 10);
            x /= 10;
        }
        // 组装一个新的数组
        int size = intList.size();
        for (int i = 0; i < size / 2; i++) {
            if (intList.get(i) != intList.get(size - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        //翻转半就可以了

        if (x < 0) {
            return false;
        }
        int reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x/=10;
            if (x == reverse) {
                return true;
            }else if(x<reverse){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution_9 soulution = new Solution_9();
        System.out.println(soulution.isPalindrome(323));
    }
}
