//Sankalp
bool isPalindrome(int x) {
    if(x<0){
        return false;
    }
    else if(x==0){
        return true;
    }
    else{
        long long reverse=0;
        int original=x;
        while(x!=0){
            int remainder = x%10;
            reverse=(reverse*10)+remainder;
            x=x/10;
        }
        if (reverse==original){
            return true;
        }
        else{
            return false;
        }
        return false;
    }
}