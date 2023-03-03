package Ngay1;
import java.util.Scanner;
public class bai82 {
    //Viết chương trình tìm số lớn nhất trong ba số thực a, b, c.
    public static void main(String[] args) {
        float a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a,b,c:\n");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        in.close();
        if( a >= b && a >= c)
            System.out.println(a+" là số lớn nhất");

        else if (b >= a && b >= c)
            System.out.println(b+" là số lớn nhất!!");
        else
            System.out.println(c+" là số lớn nhất!!");
    }
}
