package com.Prototype;

public class Demo {
    public static void main(String[] args) throws Exception{
        BookShop bs = new BookShop();
        bs.loadData();
        bs.setShopName("Gayan Sagar");
        System.out.println(bs);

        BookShop bs1 = bs.clone();
        bs1.setShopName("A1");
        System.out.println(bs1);
    }
}
