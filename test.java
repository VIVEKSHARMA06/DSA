public class test {
    public static void main(String[] args) {
        int n = 0;
        int target = 3;
        int steps = 1;
        int count = 0;
        while (n!=target) {
            if (n+steps==target) {
                n+=steps;
            }
            else if (n-steps==target) {
                n-=steps;
            }
            else if (n+steps<target) {
                n+=steps;
            }
            else {
                n-=steps;
            }
            count++;
            steps++;
        }
        System.out.println(count);
    }
}
