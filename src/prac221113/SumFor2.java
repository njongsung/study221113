package prac221113;

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do{
            System.out.print("값: ");
            n = sc.nextInt();

            if(n<0) System.out.println("양의 정수를 입력하세요");
        }while (n<=0);

        int sum=0;

        for (int i=1; i<=n;i++)
            sum+=i;

        System.out.print("1부터 "+n+"의 값은 "+sum+"입니다.");
    }
}
