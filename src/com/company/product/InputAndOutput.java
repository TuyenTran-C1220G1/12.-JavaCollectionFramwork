package com.company.product;

import java.util.Scanner;

public class InputAndOutput {
    static Scanner scanner = new Scanner(System.in);

    static String getId() {
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        return id;
    }

    static Product getProduct() {
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        String id = getId();

        System.out.println("Nhập giá sản phẩm: ");
        Double price = scanner.nextDouble();
        return new Product(name, id, price);
    }
}
