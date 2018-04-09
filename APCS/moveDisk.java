import java.util.*;
public class moveDisk{
  public static int count = 0;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of disks: ");
    int number = scan.nextInt();
    System.out.print("Enter destination post: ");
    char dest = scan.next().charAt(0);
    char temp;
    if(dest == 'B'){
      temp = 'C';
    } else {
      temp = 'B';
    }
    System.out.println("Moves:");
    moveDisks(number, 'A', dest, temp);
    System.out.println("Number of moves: " + count);
  }
  public static void moveDisks(int n, char source, char dest, char temp){
    if(n==1){
      moveOneDisk(source, dest);
    }
    else {
      moveDisks(n-1, source, temp, dest);
      moveOneDisk(source, dest);
      moveDisks(n-1, temp, dest, source);
    }
  }
  public static void moveOneDisk(char source, char dest){
    count++;
    System.out.println(source + " -> "+ dest);
  }
}
