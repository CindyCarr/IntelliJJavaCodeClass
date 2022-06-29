package Class12;

public class StringDemo7 {
    public StringDemo7() {
    }

    public static void main(String[] args) {
        String str = " I am always confused";
        System.out.println(str.indexOf("am"));
        System.out.println(str.indexOf("always"));
        System.out.println(str.indexOf(97));
        System.out.println(str.indexOf(32));
        System.out.println(str.indexOf(122));
    }
}
