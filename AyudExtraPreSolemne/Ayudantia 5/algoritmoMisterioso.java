import java.util.Queue;
import java.util.LinkedList;

public class algoritmoMisterioso {
    public static String algoritmoMisterioso(String players) {
        Queue<Integer> c = new LinkedList<>();
        Queue<Integer> u = new LinkedList<>();
    
        for (int i = 0; i < players.length(); i++) {
            if (players.charAt(i) == 'C') {
                c.offer(1);
            } else {
                u.offer(i);
            }
        }
        while (!c.isEmpty() && !u.isEmpty()) {
            int p1 = u.poll();
            int p2 = c.poll();
            if(p1 < p2){
                c.offer(players.length() + p1);
            }else{
                u.offer(players.length() + p2);
            }
        }

        if (c.isEmpty()) {
            return "Colo-Colo";
        } else {
            return "Universidad de Chile";
        }
    }

    public static void main(String[] args) {
        String input1="CCUUUC";
        String input2="UUUCCCCC";
        System.out.println(algoritmoMisterioso(input1));
        System.out.println(algoritmoMisterioso(input2));
    }
}
    

