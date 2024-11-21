package com.cataloge.com.cataloge;

public class Product {
    private String name;
    private String diskription;
    private int id;
    private int price;

    public Product(String name, String diskription, int id, int price) {
        this.name = name;
        this.diskription = diskription;
        this.id = id;
        this.price = price;
        System.out.println(id);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getDiskription() {

        return diskription;



    }




}


