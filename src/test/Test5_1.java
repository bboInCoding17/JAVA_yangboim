package test;

import java.util.Scanner;

public class Test5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //0~9까지의 랜덤한 정수가 저장될 배열 생성
        int[] baseball = new int[3];




        //키보드로 입력한 정수가 저장될 배열 생성
        int [] answer = new int[3];

        //baseball 배열에 중복없이 랜덤 수를 저장
        for(int i =0 ; i< baseball.length; i++){
            //0~9의 랜덤수 생성 및 저장
            int rand = (int)(Math.random()*10);
            baseball[i] = rand;

            //**** 중복 값 제거 **** / 반복 수는 변하니 잘 설정해야 한다.
            //중복 값은 i의 자리수 만큼 반복한다.
            //i가 0일 때는 j는 작동 안한다. - 비교할 수가 없음, i가 1부터 0번째와 비교 시작
            for(int j =0 ; j < i; i++){
                //만약에 i 번째 값과 j 번째 값이 중복일 때 어떻게 할 것인지 조건을 달아준다
                if(baseball[i] == baseball[j]){
                    i--;
                    break; // i 번째 수 만큼 반복할 때, 반복 수가 발견되면 i 번째 만큼 진행하지 않고 다시 위에 for문으로 간다
                }
            }



        }
        //만들어진 배열 출력
        System.out.print("만들어진 숫자 : ");
        for(int e : baseball){
            System.out.print(e + " ");
        }
        System.out.println();

        //게임 시작
        int tryCnt =0;
        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");
        while(true){
            System.out.print(++tryCnt + " >> ");

            //answer 배열에 키보드로 입력받은 데이터 저장
            for(int i =0; i < answer.length; i++){
                answer[i] = sc.nextInt();
            }

            //strike, ball 계산
            int strike =0, ball =0;
            //for문으로 배열의 크기 만큼 baseball 배열과 answer배열 자리끼리 비교
            for(int i =0; i < baseball.length; i++){
                for(int j =0; j < answer.length; j++){
                    if(baseball[i] == answer[j] && i == j){
                        strike++;
                    }
                    if(baseball[i] == answer[j] && i != j){
                        ball++;
                    }
                }

            }

            //결과 출력
            System.out.println(strike + "스트라이크 "+ ball+ "볼");

            //스트라이크가 3일때 while문 벗어난다
            if(strike == 3){
                break;
            }//스트라이크가 3이 아닐때, strike 값과 ball값을 초기화 하고 다시 while문 시작
            else {
               strike =0;
               ball =0;
            }
        }
        System.out.println(tryCnt + "번 만에 정답을 맞췄습니다.");

    }
}
