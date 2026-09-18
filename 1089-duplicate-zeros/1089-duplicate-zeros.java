class Solution {
    public void duplicateZeros(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int count=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                stack.push(arr[i]);
                stack.push(0);
                count++;
            }
            else{
                stack.push(arr[i]);
            }
        }
        for(int i=0;i<count;i++){
            stack.pop();
        }
        for(int i =0;i<arr.length;i++){
            arr[arr.length-1-i]=stack.pop();
        }
    }
}