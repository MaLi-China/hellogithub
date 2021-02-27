package simple;

import org.junit.Test;

public class Solution_1672 {
    public int maximumWealth(int[][] accounts) {
        //返回最大的值:
//        int index = 0;
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < accounts.length; i++) {
            tmp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tmp += accounts[i][j];
                result = result < tmp ? tmp : result;
            }
        }
        return result;
    }
    @Test
    public void testMethod(){
        Solution_1672 solution = new Solution_1672();
        int[][] account = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(solution.maximumWealth(account));
    }
}
