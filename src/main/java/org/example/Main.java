package org.example;


import java.util.Scanner;

public class Main {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====motivation 실행=====");
       for (int i = 1; i <= 10; i++) {
        System.out.print("명령어)");
        String command =  sc.nextLine();
        if(command.equals("등록")) {
            upload();
        }
        else if (command.equals("목록")) {
            list();
        }
       }
    }
    static void upload(){
        Scanner sc = new Scanner(System.in);
        sum++;
        System.out.print("motivation :");
        String motivation = sc.nextLine();
        System.out.print("source :");
        String source = sc.nextLine();
        System.out.println(sum + " 번" + "motivation이 등록되었습니다.");
        return ;
    }
    static void list(){
        Scanner sc = new Scanner(System.in);


    }
class number{
        
}
}