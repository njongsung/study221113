package prac221113;

import java.util.Scanner;

public class PrintStrars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;



        System.out.println("*을 n개만큼 출력하되, w개 마다 줄을 바꿔서 출력합니다.");
        do{
            System.out.print("n값: ");
            n=sc.nextInt();
        }while(n<=0);

        do{
            System.out.print("w값: ");
            w=sc.nextInt();
        }while(w<=0||w>n);

//        for (int i=0;i<n;i++){
//            System.out.print("*");
//            if(i%w==w-1)
//                System.out.println();
//        }
//        if(n%w!=0)
//            System.out.println();

        for (int i=0; i<n/w; i++)
            System.out.println("*".repeat(w));

        int rest = n%w;
        if(rest!=0)
            System.out.println("*".repeat(rest));
    }
}
