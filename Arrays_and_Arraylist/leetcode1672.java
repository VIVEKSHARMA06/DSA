package Arrays_and_Arraylist;
public class leetcode1672 {
    public static void main(String[] args) {
        int [][] accounts = {{1,5},{7,3},{3,5}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i=0;i<accounts.length;i++) {
            int wealth=0;
            for (int j=0;j<accounts[i].length;j++) {
                wealth+=accounts[i][j];
            }
            if (wealth>max) {
                max=wealth;
            }
        }
        return max;
    }
}
