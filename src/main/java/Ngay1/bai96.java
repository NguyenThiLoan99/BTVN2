package Ngay1;

import java.util.Scanner;

public class bai96 {
    public static void main(String[] args) {
        float x;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập x:");
        x = in.nextFloat();
        in.close();
        float kq;
        if(x>=5){
            kq=2*x*x + 5*x + 9;
        }
        else{
            kq=-2*x*x + 4*x - 9;
        }
        System.out.printf("Kết quả +%.1f",kq);

    }
}
