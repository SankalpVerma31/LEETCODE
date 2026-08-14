class Solution {
    public String toLowerCase(String s) {
        char[] array = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if (Character.isUpperCase(array[i])) {
                array[i] = Character.toLowerCase(array[i]);
            }
            else{
                continue;
            }
        }
        return new String(array);
    }
}