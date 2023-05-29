package string_calculator;

public class Calculator {
    private char prevOperator;
    private int prevOperand;

    public Calculator() {
        this.prevOperand = ' ';
        this.prevOperand = -1;
    }

    public int run(String str){
        String[] elements=str.split(" ");
        for(int i=0;i<elements.length;i++){
            // 숫자인 경우,
            if(i%2==0){
                int curOperand = Integer.parseInt(elements[i]);
                if(prevOperand == -1){
                    prevOperand = curOperand;
                    continue;
                }
                prevOperand = calculate(curOperand);
                continue;
            }
            prevOperator = elements[i].charAt(0);
        }
        return prevOperand;
    }

    private int calculate(int curOperand){
        switch(prevOperator){
            case '+':
                return prevOperand + curOperand;
            case '-':
                return prevOperand - curOperand;
            case '*':
                return prevOperand * curOperand;
            case '/':
                return prevOperand / curOperand;
            default:
                return 0;
        }
    }
}
