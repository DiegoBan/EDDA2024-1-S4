import java.util.Scanner;

public class Palindromo {
    public static boolean palindromo(String word, int start, int last){
        if(last < start) return true;
        if(word.charAt(start) == word.charAt(last)){
            return (true && palindromo(word, start+1, last-1));
        }else return false;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresar palabra: ");
        String word = scan.nextLine();
        System.out.printf("Palindromo: %s %n", palindromo(word, 0, word.length()-1));
        scan.close();
    }
}
