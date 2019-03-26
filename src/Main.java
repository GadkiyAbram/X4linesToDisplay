public class Main {

    public static void main(String[] args) {

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++){
            arr[i] = i;
        }

        int i = 0;

        while (i < 100){
            for (int j = 0; j < 4; j++, i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
