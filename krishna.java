package com.excetionhandling;
public class krishna {
    String name;
    String priceofproduct;
    String quantityofproduct;
    int salary;
    public static void main(String[] args) {
        krishna obj = new krishna("hari", "ten", "good", 10);
        obj.test();
    }

     krishna(String g, String m, String p, int a) {
        name = g;
        priceofproduct = m;
        quantityofproduct = p;
        salary = a;
    }

    void test() {
        System.out.println(name+" "+priceofproduct +" "+quantityofproduct+" "+salary);
    }

}
