public class P1{
  public static void main(String[] args){
    String[] x = {
      "","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"
    };

    String[] tens = {
      "",
      "",
      "Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"
    };

    int number = 4119;
    int temp = number;
    String Ans = "";

    while(number != 0){
      
      if(number>1000){
        Ans = Ans + x[(int)(number / 1000)] + " Thousand " ;
        number = number % 1000;
        System.out.println(Ans);
      }

      if(number > 100){
        Ans = Ans + x[(int)(number / 100)] + " Hundred ";
        number = number %100;
        System.out.println(Ans);
      }

      if(number > 0){
        if(number < 20){
          Ans = Ans + x[number] + " ";
          number = 0;
          System.out.println(Ans);
        }
        else{
          if(number > 20){
            Ans = Ans + tens[(int)(number / 10)] + " ";
            number = number % 10;
          }
        }
      }

    }

    System.out.println(temp + "=" + Ans);

  }

}