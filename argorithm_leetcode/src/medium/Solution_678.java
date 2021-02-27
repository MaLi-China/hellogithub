package medium;

import org.junit.Test;

public class Solution_678 {
    /*
    给定一个只包含三种字符的字符串：（ ，） 和 *，写一个函数来检验这个字符串是否为有效字符串。有效字符串具有如下规则：

        1, 任何左括号 ( 必须有相应的右括号 )。
        2, 任何右括号 ) 必须有相应的左括号 ( 。
        3, 左括号 ( 必须在对应的右括号之前 )。
        4, * 可以被视为单个右括号 ) ，或单个左括号 ( ，或一个空字符串。
        5, 一个空字符串也被视为有效字符串。

    思路: 拆分字符串, 翻转数组,
        偶数: 对应的首尾索引位置上的元素必须互相对应
        奇数: 中间位置必须是*
        空字符串也是合法的
    ()****()*()*()
    ()(())
    (())
    )(
    1, 对应
    2,
     */
    @Test
    public boolean checkValidString(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            char c = s.charAt(i);
            if (c != '(' && c != '*') {
                return false;
            }
            char c2 = s.charAt(s.length() - i - 1);
            if (c2 != ')' && c2 != '*') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution_678 solution = new Solution_678();
        boolean result = solution.checkValidString("()(*))");
        System.out.println(result);
    }

}
