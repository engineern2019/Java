class reversewords{
    public static main(String [] args){
        char[] str = "Reverse these words please".toCharArray();
        reverse(str);
        System.out.println(str);
    }
    public static void reverse(char[] str){
        int n = str.length;
        int start = 0;
        for (int i = 0; 1 < n; i++){
            if(str[i] == ' ' && i >0){
                callback(str, start, i-1);
                start=i+1;
            } else if(i == n-1){
                callback(str, start, i);
            }
        }
        callback(str, 0, n-1);
    }
    public static void callback(char[] str, int start, int end){
        while(start < end){
            change(str, start, end);
            start++;
            end--;
        }
    }
    public static void change(char[] str, int start, int end){
        char tmp = str[start];
        str[start] = str[end];
        str[end] = tmp;
        }
}