package test;

public class Test2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for(int i =0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random()*45)+1;
        }
        System.out.print("로또 번호는 : ");
        for(int i =0; i < lotto.length; i++){
            System.out.print(lotto[i] + " ");
        }

    }
}
