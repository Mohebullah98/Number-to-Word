class Main {
  public static void converter(long number){
    String n = Long.toString(number);
    int digit;
    char digitChar;
    String word ="";
    boolean Teen= false;
    for(int i=0;i<n.length();i++){//split number into digits to convert each digit to word
      digitChar=n.charAt(i);
      digit= Character.getNumericValue(digitChar);
      if((n.length()-i)%3==0){
        switch(digit){
          case 0:word="";
          break;
          case 1: word="One hundred";
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
  if((n.length()-i)%3==2){
        switch(digit){
          case 0:word= "";
          break;
          case 1: Teen =true;
          word="";
          break;
          case 2: word="Twenty ";
          break;
          case 3: word="Thirty ";
          break;
          case 4: word= "Forty ";
          break;
          case 5: word="Fifty ";
          break;
          case 6: word="Sixty ";
          break;
          case 7:word ="Seventy ";
          break;
          case 8:word="Eighty ";
          break;
          case 9:word="Ninety ";
          break;
        }
        
        System.out.print(word+"");
      }
      if((n.length()-i)%3==1&&Teen==false){
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
       if(n.length()-i==10){
         System.out.print(word+" Billion ");
         continue;}
       if(n.length()-i==7){
         if(n.length()>8){
            if(n.charAt(i-1)!='0'&&n.charAt(i-2)!='0'){
              System.out.print(word+" Million ");
              continue;
            }
            else{ 
              System.out.print(word+"");
              continue;
          }
          }
         System.out.print(word+" Million ");
         continue;}
       if(n.length()-i==4){
         if(n.length()>5){
            if(n.charAt(i-1)!='0'&&n.charAt(i-2)!='0'){
              System.out.print(word+" Thousand ");
              continue;
            }
            else{ 
              System.out.print(word+"");
              continue;
          }
          }
         System.out.print(word+" Thousand ");
         continue;}
        System.out.print(word+"");
      }
      if((n.length()-i)%3==1 && Teen==true){
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
        if(n.length()-i==10){
         System.out.print(word+" Billion ");
         continue;}
        if(n.length()-i==7){
          if(n.length()>8){
            if(n.charAt(i-1)!='0'&&n.charAt(i-2)!='0'){
              System.out.print(word+" Million ");
              continue;
            }
            else{ 
              System.out.print(word+"");
              continue;
          }
          }
          System.out.print(word+" Million ");
          continue;
        }
        if(n.length()-i==4){
          if(n.length()>5){
            if(n.charAt(i-1)!='0'&&n.charAt(i-2)!='0'){
              System.out.print(word+" Thousand ");
              continue;
            }
            else{ 
              System.out.print(word+"");
              continue;
          }
          }
          System.out.print(word+" Thousand ");
          continue;
        }
         System.out.print(word+"");
      }
    }
  }
  public static void main(String[] args) {
    long n;
    for(int i=0;i<args.length;i++){
      n= Long.parseLong(args[i]);
      converter(n);
      System.out.print("\n");
    }
  }
}