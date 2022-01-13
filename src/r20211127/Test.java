package r20211127;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整形数字：");
        int i = scanner.nextInt();

        m1(i);

        System.out.println("请输入一个字符：");
        String string = scanner.next();

        char c = string.charAt(0);
        m2(c);


    }

    public static void m1(Object c){

        System.out.println(c+"二进制是："+Integer.toBinaryString((int)c));
        System.out.println(c+"十六进制是："+Integer.toHexString((int)c));
        System.out.println( c+"地址为："+Integer.toHexString(System.identityHashCode(c)));
    }

    public static void m2(char c)
    {
        System.out.println("二进制是："+Integer.toBinaryString(c));
        System.out.println("十六进制是："+Integer.toHexString(c));
        System.out.println( "地址为："+Integer.toHexString(System.identityHashCode(c)));
    }


}
