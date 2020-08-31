/**
 * ReturnToOrigin
 */
public class ReturnToOrigin {

    public static void main(String[] args) {
        System.out.println(judgeCircle("UDLLRR"));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    break;
            }
        }
        return (x == 0) && (y == 0);
    }
}