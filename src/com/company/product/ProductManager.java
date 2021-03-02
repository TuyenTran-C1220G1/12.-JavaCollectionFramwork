package com.company.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    static List<Product> listProduct = new ArrayList<>();
//boolean
    public void add(Product product) {
        listProduct.add(product);
    }
//
    public void delete(String id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id.equals(listProduct.get(i).getId())) {
                listProduct.remove(i);
            }
        }
    }
//
    public void edit(String id, Product product) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId().equals(id)) {
                listProduct.set(i,product);
            }
        }
    }

    public void display(){
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i));
        }
    }

    public void search(String id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id.equals(listProduct.get(i).getId())) {
                System.out.println(listProduct.get(i));
            }
        }
    }

    public void sort(){
        Collections.sort(listProduct);
    }
}
