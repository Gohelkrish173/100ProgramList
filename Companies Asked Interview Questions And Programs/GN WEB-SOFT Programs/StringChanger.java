public class StringChanger{
    public static String change(String s){
        String main = "";

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' ||
               s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' ||
               s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9'
            ){
                for(int j = Integer.valueOf(String.valueOf(s.charAt(i)));j>0;j--){
                    main = main+s.charAt(i+1);
                }
                i = i+1;
            }
            else{
                main = main + s.charAt(i);
            }
        }

        return main;
    }

    public static void main(String[] args){
        String x1 = "2b5c3z4a";
        String x2 = "a5d7ekf4z";

        System.out.println(change(x1));
        System.out.println(change(x2));
    }
}