package Ngay1;

import java.util.Scanner;

public class bai97 {
    public static void main(String[] args) {
        float a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a,b,c lần lượt là 3 cạnh của tam giác:");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        in.close();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.print("\n 3 cạnh trên không tạo được tam giác");
        }
        else {
            if ((a == b) && (b == c)) {
                System.out.print("\nĐây là tam giác đều ");
            } else {
                if (a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c) {
                    System.out.print("\nĐây là tam giác vuông ");
                }
                if (a == b || a == c || b == c) {
                    System.out.print("\nĐây là tam giác cân ");
                } else {
                    System.out.print("\nĐây là tam giác thường ");
                }
            }
        }
    }
}
