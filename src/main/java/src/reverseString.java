package src;

public class reverseString {
    //왜 mid가 같아야 하는가?
    public static void reverseString(char[] s) {
        int j = 0;
        for (int i = s.length-1; i >=  s.length / 2; i--) {
            char tmp = s[j];
            s[j++] = s[i];
            s[i] = tmp;
        }
    }


    public static void main(String[] args) {
        char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ' ,'c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        reverseString(s);

    }
}
