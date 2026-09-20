class Solution {
    public int reverseDegree(String s) {
        int reverseDegree = 0;
        for(int i =1;i<=s.length();i++){
            reverseDegree+=(123-s.charAt(i-1))*(i);
        }
        return reverseDegree;
    }
}