Import java.util.scanner;
Public class calculator_20190528
 {
        Public static void main(string []  args)
            {
              Scanner input = new scanner (System.in);
              Int num1;
              Int num2;
              String X;
             System.out.println("enter operation");
              X =input.nextLine();
              System.out.println("enter first number");
              Num1 =input.nextInt ();
              System.out.println("enter second number");
              Num2 =input.nextInt ();
              if(X=="+")
                      System.out.println(num1 "+" num2 "=" num1+num2);
                 if(X=="-")
                      System.out.println(num1 "-" num2 "=" num1-num2);
                   if(X=="*")
                      System.out.println(num1 "*" num2 "=" num1*num2);
                      if(X=="/")
                      System.out.println(num1 "/" num2 "=" num1/num2);
                      
              

              
              
              
           
       
            }



}