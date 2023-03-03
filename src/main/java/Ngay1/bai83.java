package Ngay1;

import java.util.Scanner;

public class bai83 {
    public static void main(String[] args) {
        //Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng
        //dấu hay không.
        float a,b;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a,b:\n");
        a = in.nextFloat();
        b = in.nextFloat();
        in.close();
        if(a * b > 0)
            System.out.printf("\n%.1f và %.1f cùng dấu", a, b);
        else
            System.out.printf("\n%.1f và %.1f không cùng dấu", a, b);
    }
}
