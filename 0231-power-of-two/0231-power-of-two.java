class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n==3||n==0||n<0){
            return false;
        }
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        if(binary.charAt(0)=='1'){
            for(int i =1;i<binary.length();i++){
                if(binary.charAt(i)=='1'){
                    return false;
                }
            }
        }
        return true;
    }
}