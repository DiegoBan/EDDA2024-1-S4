import java.util.Scanner;
import java.util.Stack;

public class parentesis{
    public static boolean verificacion(String p){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < p.length() ; i++){
            if(p.charAt(i) == '(' || p.charAt(i) == '[' || p.charAt(i) == '{'){
                stack.push(p.charAt(i));
            }else if(p.charAt(i) == ')' || p.charAt(i) == ']' || p.charAt(i) == '}'){
                if(stack.isEmpty()) return false;
                switch(p.charAt(i)){
                    case ')':
                        if(stack.peek() == '(') stack.pop();
                        else return false;
                        break;
                    case ']':
                        if(stack.peek() == '[') stack.pop();
                        else return false;
                        break;
                    case '}':
                        if(stack.peek() == '{') stack.pop();
                        else return false;
                        break;
                }
            }else return false;
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese String: ");
        String p = scan.nextLine();
        System.out.println(verificacion(p));
        scan.close();
    }
}
