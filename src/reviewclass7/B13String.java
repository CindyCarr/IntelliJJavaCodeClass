package reviewclass7;

public class B13String {
    private String str;

    public B13String(String str) {
        this.str = str;
    }

    public int countChars(char c) {
        int counter = 0;
        char[] arr = this.str.toCharArray();
        char[] var4 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            char cha = var4[var6];
            if (cha == c) {
                ++counter;
            }
        }

        return counter;
    }

    public void printChars(char c) {
        int counter = 0;

        for(int i = 0; i < this.str.length(); ++i) {
            if (this.str.charAt(i) == c) {
                ++counter;
            }
        }

        System.out.println(c + " has appeared " + counter + " times inside this string " + this.str);
    }
}
