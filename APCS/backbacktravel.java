import java.util.*;

public class backbacktravel {
  public static int sum=0;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter (x, y) coordinates as two integers separated by a space: ");
        int targetX = console.nextInt();
        int targetY = console.nextInt();
        explore(targetX, targetY, 0, 0, "");
        System.out.println("Number of paths = " + sum);
    }
    public static void explore(int targetX, int targetY, int currX, int currY, String path){
        if(currX==targetX && currY == targetY) {
            System.out.print("moves:");
            System.out.println(path);
            sum++;
        }
        else if(currX <= targetX && currY <= targetY){
            explore(targetX,targetY,currX,currY+1,path+" N");
            explore(targetX,targetY,currX+1,currY+1,path+" NE");
            explore(targetX,targetY,currX+1,currY,path+" E");
        }
    }
}
