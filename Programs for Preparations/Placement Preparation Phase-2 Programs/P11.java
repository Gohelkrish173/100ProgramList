import java.util.Scanner;

public class P11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int index = 1;
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        int temp = n;

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<i+1;j++){
                System.out.print(index + " ");
                index = index + n-1;
                n--;
            }
            index = i+1;
            n = temp;
            System.out.println();
        }

    }
}