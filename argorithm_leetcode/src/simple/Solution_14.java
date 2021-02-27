package simple;

public class Solution_14 {
    public String longestCommonPrefix(String[] strs) {
            //1, 数组长度为0
        if (strs.length == 0) {
            return "";
            //2, 数组长度为1
        } else if(strs.length==1) {
            return strs[0];
        }else{
            // 3, 数组长度>1
            String theOne = strs[0];
            for (int i = 0; i < theOne.length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    String next = strs[j];
                    if(next.length()-1>=i && next.charAt(i)==theOne.charAt(i)){

                    }else{
                        return theOne.substring(0,i);
                    }
                }
            }
            return theOne;
        }
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flower","flower","flower"};
//        String[] strs = new String[]{""};
        Solution_14 solution = new Solution_14();
        String prefix = solution.longestCommonPrefix(strs);
        System.out.println(prefix);
//        System.out.println("123".substring(0,1));

    }
}
