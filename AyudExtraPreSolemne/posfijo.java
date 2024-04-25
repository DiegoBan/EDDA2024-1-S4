import java.util.Stack;

public class posfijo{
    public static int solve(String input){
        Stack<Integer> stack = new Stack<>();
        String[] arr = input.split(" ");
        for(int i = 0 ; i < arr.length ; i++){
            if(isNumber(arr[i])){
                stack.push(Integer.parseInt(arr[i]));
            }else{
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch(arr[i]){
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1-num2);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                    case "/":
                        stack.push(num1/num2);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static boolean isNumber(String x){
        if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        String in = "2 3 + 3 3 + *";
        System.out.println(solve(in));
    }
}
