import java.util.Stack;

public class ParentesisSimple {
    public static boolean parentesis(String string)
    {
        char[] arr = string.toCharArray();
        Stack<Character> pila = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == '(')
            {
                pila.push('(');
            }
            else if(arr[i] == ')')
            {
                if(pila.isEmpty())
                {
                    return false;
                }
                pila.pop();
            }
        }
        if(!pila.isEmpty())
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        //creacion variables
        String ingreso1 = "()()(())";
        String ingreso2 = "((())()";
        //verificacion
        System.out.println(parentesis(ingreso1));
        System.out.println(parentesis(ingreso2));
    }
}