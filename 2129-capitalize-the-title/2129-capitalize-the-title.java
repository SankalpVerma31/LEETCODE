class Solution {
    public String capitalizeTitle(String title) {
        int word = 0;
        int start = 0;
        int end = 0;

        char[] arr = title.toCharArray();

        for (int i = 0; i < title.length(); i++) {

            if (arr[end] != ' ') {
                arr[end] = Character.toLowerCase(arr[end]);
                end++;
                word++;
            }

            else if (arr[end] == ' ' && word > 2) {
                arr[start] = Character.toUpperCase(arr[start]);

                start = end + 1;
                end++;
                word = 0;
            }

            else if (arr[end] == ' ' && word <= 2) {
                for (int j = 0; j < word+1; j++) {
                    arr[start] = Character.toLowerCase(arr[start]);
                    start++;
                }

                end++;
                word = 0;
            }
        }
        if (word > 2) {
            arr[start] = Character.toUpperCase(arr[start]);
        }

        return new String(arr);
    }
}