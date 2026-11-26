class Solution {
    public int fib(int n) {
        int[] m = new int[n+1];
        Arrays.fill(m, -1);

        return solve(n, m);
    }

    public int solve(int n, int[] m) {
        if(n <= 1) {
            return n;
        }

        if(m[n] != -1) {
            return m[n];
        }

        m[n] = solve(n-1, m) + solve(n-2, m);

        return m[n];
    }
}