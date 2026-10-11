
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1){
            return false;
        }

        int perfect = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                perfect += i;
                int another = num / i;
                if(i == another){
                    continue;
                }
                perfect += another;
            }
        }

        perfect -= num;

        if(perfect == num){
            return true;
        }
        return false;
    }
}
