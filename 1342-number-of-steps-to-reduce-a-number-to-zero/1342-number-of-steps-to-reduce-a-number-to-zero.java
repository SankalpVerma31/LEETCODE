class Solution {
    public int even(int num,int count){
        if(num==0){
            return count;
        }
        num/=2;
        count++;
        if(num%2==0){
            return even(num,count);
        }
        return odd(num,count);
    }
    public int odd(int num,int count){
        num-=1;
        count++;
        if(num==0){
            return count;
        }
        return even(num,count);
    }
    public int numberOfSteps(int num) {
        if(num%2==0){
            return even(num,0);
        }
        return odd(num,0);
    }
}