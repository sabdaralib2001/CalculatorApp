class Calculator
{
   int first;
   int second;
   
   int sumResult;
   int subResult;
   int mulResult;
   double divResult;
   int remResult;
   
   Calculator(int a,int b)
   { 
     first=a;
     second=b;
   }
   public void performAdd()
   {
     sumResult = first + second;
   }
   public void performSubstraction()
   {
     subResult = first - second;
   }
   public void performMultiplication()
   {
     mulResult = first * second;
   }
   public void performDivision()
   {
     divResult = first / second;
   }
   public void performRemainder()
   {
     remResult = first % second;
   }
}

class CalculatorManager
{
  public static void main(String[] args)
  {
   Calculator c1 = new Calculator(5,3);
    c1.performAdd();
    c1.performSubstraction();
    c1.performMultiolication();
    c1.performDivision(); 
    c1.perforRemainder(); 
  }
}
