public class Pattern1{
    public static void main(String[] args){

        int index = 1;
        int n = 5;

        for(int i = 1;i<=5;i++){
            for(int j = 1;j<i+1;j++){
                System.out.print(index + " ");
                index = index + n-1;
                n--;
            }
            index = i+1;
            n = 5;
            System.out.println();
        }

    }
}