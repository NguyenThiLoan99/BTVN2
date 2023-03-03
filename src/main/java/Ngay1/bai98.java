package Ngay1;
import java.util.Scanner;
public class bai98 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b,c,d,e,f;
        System.out.print("Nhap a,b,c,d,e,f: ");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        d = in.nextFloat();
        e = in.nextFloat();
        f = in.nextFloat();
        in.close();

        float x,y,D,Dx,Dy;
        D = a * e - d * b;
        Dx = c * e - f * b;
        Dy = a * f - d * c;
        if(D != 0) {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("Hệ có nghiệm duy nhất x=%.1f, y =%.1f)", x, y);
        }
        else {
            if (Dx != 0 || Dy != 0) {
                System.out.print("Hệ vô nghiệm");
            } else {
                    System.out.print("Hệ có vô số nghiệm");
            }
        }

        }
    }
