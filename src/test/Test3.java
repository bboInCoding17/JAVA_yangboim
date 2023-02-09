package test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {5, 11, 20 ,40, 30};
        int max = arr[0];
        int min = arr[0];

        for(int num : arr){
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }

        System.out.print("가장 큰 값 : "+ max + ", 가장 작은 값 : " + min );




    }
}
