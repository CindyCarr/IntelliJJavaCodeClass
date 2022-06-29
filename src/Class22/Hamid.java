package Class22;

import Class19.Parent;

class Hamid extends Parent {
    Hamid() {
    }

    public void getMarried() {
        super.getMarried();
        System.out.println("I want to try on Tara First");
    }

    public static void main(String[] args) {
        Hamid hamid = new Hamid();
        hamid.getMarried();
    }
}
