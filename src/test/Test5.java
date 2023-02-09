package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }

        System.out.print("만들어진 숫자 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        arr[0] = a;
        arr[1] = b;
        arr[3] = c;
        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");


        boolean isFind = false;
        boolean isRun =true;
        int strike =0;
        int ball = 0;

        while (isRun) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

            for(int i =0; i< 100; i++) {
                System.out.print(i+" >> " + num1 + " " + num2 + " " + num3);
            }
            for(int i =0; i< arr.length; i++){
                if(arr[i] == num1){
                    a = num1;
                    if(arr[i] == num2){
                        b = num2;
                    }else{
                        c = num3;
                    }
                    strike++;
                    System.out.print(strike + "스트라이크 "+ ball + "볼");

                } else if (arr[i] != num1) {
                      a = num2;
                      a = num3;
                    if(arr[i] != num2){
                        b = num1;
                        b = num3;
                    }else{
                        c = num1;
                        c = num2;
                    }
                    ball++;
                    System.out.print(strike + "스트라이크 "+ ball + "볼");
                }
                else{

                    System.out.print(strike + "스트라이크 "+ ball + "볼");

                }

            }
            isFind = true;
            isRun =false;
            System.out.print(strike + "스트라이크 "+ ball + "볼");
        }

    }
}
