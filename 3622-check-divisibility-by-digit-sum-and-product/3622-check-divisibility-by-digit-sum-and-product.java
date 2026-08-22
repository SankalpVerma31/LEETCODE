class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1;
        int sum=0;
        int temp=n;
        while(temp!=0){
            int rev=temp%10;
            prod*=rev;
            sum+=rev;
            temp/=10;
        }
        if(n%(prod+sum)==0){
            return true;
        }
        else{
            return false;
        }
    }
}