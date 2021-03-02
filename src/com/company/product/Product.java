package com.company.product;

import com.company.practive.Student;

public class Product implements Comparable<Product> {
    private String nameProduct;
    private String id;
    private double priceProduct;


    public Product(String nameProduct, String id, double priceProduct) {
        this.nameProduct = nameProduct;
        this.id = id;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", id='" + id + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

    public int compareTo(Product o) {
        if (this.priceProduct > o.priceProduct) {
            return 1;
        } else if (this.priceProduct<o.priceProduct){
            return -1;
        } else return 0;
    }
}
