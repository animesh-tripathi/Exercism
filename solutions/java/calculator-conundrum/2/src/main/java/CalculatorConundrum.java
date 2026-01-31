class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String ans=operand1+" "+operation+" "+operand2+" = ";
        int result=0;
        if(operation==null)
                    throw new IllegalArgumentException("Operation cannot be null");
        switch(operation){
            case "+":
                result=operand1+operand2;
                break;
            case "*":
                result=operand1*operand2;
                break;
            case "/":
               try{
                result=operand1/operand2;
               }
                catch(ArithmeticException e)
                   {
                       throw new IllegalOperationException("Division by zero is not allowed",e);
                   }
                break;
            default:
                if(operation.isEmpty())
                    throw new IllegalArgumentException("Operation cannot be empty");
                else
                    throw new IllegalOperationException (String.format(
                        "Operation '%s' does not exist",operation
                    ));
        }
        return ans+result;
    }
}
