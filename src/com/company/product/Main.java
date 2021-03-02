package com.company.product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        int selector;
        do {
            System.out.println("---Quản lý sản phẩm---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("6. Hiển thị danh sách sản phẩm ");
            System.out.println("0. Thoát chương trình");
            System.out.println("Vui lòng chọn phương án: ");
            selector = scanner.nextInt();
            switch (selector) {
                case 1:
                    manager.add(InputAndOutput.getProduct());
                    break;
                case 2:
                    manager.delete(InputAndOutput.getId());
                    break;
                case 3:
                    manager.edit(InputAndOutput.getId(), InputAndOutput.getProduct());
                    break;
                case 4:
                    manager.search(InputAndOutput.getId());
                    break;
                case 5:
                    manager.sort();
                    break;
                case 6:
                    manager.display();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập không đúng");
            }
        } while (selector != 0);
    }
}
