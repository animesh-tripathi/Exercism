class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String ans=operand1+" "+operation+" "+operand2+" = ";
        if(operation==null)
                    throw new IllegalArgumentException("Operation cannot be null");
        int result = switch (operation) {
    case "+" -> operand1 + operand2;
    case "*" -> operand1 * operand2;
    case "/" -> {
        try {
            yield operand1 / operand2;
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
    default -> {
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        } else {
            throw new IllegalOperationException(
                String.format("Operation '%s' does not exist", operation)
            );
        }
    }
};

        return ans+result;
    }
}
