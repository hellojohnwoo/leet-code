class ReverseString {
    public void reverseString(char[] s) {
        int num = s.length;
        if(s == null || num == 0) return;
        for(int i=0; i<num/2; i++) {
            char t;
            t = s[i];
            s[i] = s[num-1-i];
            s[num-1-i] = t;
        }
    }
}