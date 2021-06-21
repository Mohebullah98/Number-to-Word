class Main {
  public static void convert(int number){
    String n = Integer.toString(number);
    int digit;
    char digitChar;
    String word ="";
    boolean Teen= false;
    for(int i=0;i<n.length();i++){
      digitChar=n.charAt(i);
      digit= Character.getNumericValue(digitChar);
      if(n.length()-i==6){
        switch(digit){
          case 0:word="";
          break;
          case 1: word="one hundred";
          break;
          case 2: word="Two hundred";
          break;
          case 3: word ="Three hundred";
          break;
          case 4: word ="Four Hundred";
          break;
          case 5:word ="Five Hundred";
          break;
          case 6: word ="Six Hundred";
          break;
          case 7: word ="Seven Hundred";
          break;
          case 8: word="Eight Hundred";
          break;
          case 9: word ="Nine Hundred";break;
        }
        System.out.print(word+" ");
      }
      if(n.length()-i==5){
        switch(digit){
          case 0:word= "";
          break;
          case 1: Teen =true;
          word="";
          break;
          case 2: word="Twenty";
          break;
          case 3: word="Thirty";
          break;
          case 4: word= "Forty";
          break;
          case 5: word="Fifty";
          break;
          case 6: word="Sixty";
          break;
          case 7:word ="Seventy";
          break;
          case 8:word="Eighty";
          break;
          case 9:word="Ninety";
          break;
        }
        
        System.out.print(word+" ");
      }
      if(n.length()-i==4&&Teen==false){
        switch(digit){
          case 0: word="Thousand";break;
          case 1: word="One thousand";break;
          case 2: word ="Two thousand";break;
          case 3: word ="Three thousand";break;
          case 4: word ="Four thousand";break;
          case 5: word="Five thousand";break;
          case 6:word="Six thousand";break;
          case 7:word="Seven thousand";break;
          case 8:word ="Eight thousand";break;
          case 9:word="Nine thousand";break;
        }
        System.out.print(word+" ");
      }
      if(n.length()-i==4 && Teen==true){
        switch(digit){
          case 0: word="Ten";
          break;
          case 1:word ="Eleven";
          break;
          case 2:word="Twelve";break;
          case 3:word ="Thirteen";break;
          case 4: word="Fourteen";break;
          case 5:word="Fifteen";break;
          case 6:word="Sixteen";break;
          case 7:word="Seventeen";break;
          case 8:word="Eighteen";break;
          case 9:word="Nineteen";break;
        }
        Teen=false;
        System.out.print(word+"");
      }
      
      if(n.length()-i==3){
        switch(digit){
          case 0:word="";
          break;
          case 1: word="one hundred";
          break;
          case 2: word="Two hundred";
          break;
          case 3: word ="Three hundred";
          break;
          case 4: word ="Four Hundred";
          break;
          case 5:word ="Five Hundred";
          break;
          case 6: word ="Six Hundred";
          break;
          case 7: word ="Seven Hundred";
          break;
          case 8: word="Eight Hundred";
          break;
          case 9: word ="Nine Hundred";
          break;
        }
        System.out.print(word+ " ");
      }
      if(n.length()-i==2){
        switch(digit){
          case 0:word= "";
          break;
          case 1: Teen =true;
          word="";
          break;
          case 2: word="Twenty";
          break;
          case 3: word="Thirty";
          break;
          case 4: word= "Forty";
          break;
          case 5: word="Fifty";
          break;
          case 6: word="Sixty";
          break;
          case 7:word ="Seventy";
          break;
          case 8:word="Eighty";
          break;
          case 9:word="Ninety";
          break;
        }
        System.out.print(word+"");
      }
      if(n.length()-i==1 &&Teen ==false){
        switch(digit){
          case 0: word="";break;
          case 1: word="One";break;
          case 2: word ="Two";break;
          case 3: word ="Three";break;
          case 4: word ="Four";break;
          case 5: word="Five";break;
          case 6:word="Six";break;
          case 7:word="Seven";break;
          case 8:word ="Eight";break;
          case 9:word="Nine";break;
        }
        System.out.print(word+"");
      }
      if(n.length()-i==1 &&Teen==true){
        switch(digit){
          case 0: word="Ten";
          break;
          case 1:word ="Eleven";
          break;
          case 2:word="Twelve";break;
          case 3:word ="Thirteen";break;
          case 4: word="Fourteen";break;
          case 5:word="Fifteen";break;
          case 6:word="Sixteen";break;
          case 7:word="Seventeen";break;
          case 8:word="Eighteen";break;
          case 9:word="Nineteen";break;
        }
        Teen =false;
        System.out.print(word+"");
      }
    }
  }
  public static void main(String[] args) {
    int n;
    for(int i=0;i<args.length;i++){
      n= Integer.parseInt(args[i]);
      convert(n);
      System.out.print("\n");
    }
  }
}