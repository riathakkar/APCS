import java.util.*;
public class mice {
	public static String go = "NO";
	public static int mapX;
	public static int mapY;
	public static int mouseX;
	public static int mouseY;
	public static char[][] map;
	public static int[][] map2;
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter number of rows and columns, then enter map.");
		mapX = console.nextInt();
		mapY = console.nextInt();
		map = new char[mapX][mapY];
		for (int i = 0 ; i < mapX ; i ++) {
			String temp = console.next();
			for (int k = 0 ; k < mapY ; k ++) {
				map[i][k] = temp.charAt(k);
				if (map[i][k] == 77) {
					mouseX = i;
					mouseY = k;
				}
			}
		}
		map2 = new int[mapX][mapY];
		for (int i = 0 ; i < mapX ; i ++) {
			for (int k = 0 ; k < mapY ; k ++) {
				map2[i][k] = 0;
			}
		}
		map2[0][0] = 1;
		search(0, 0);
		System.out.println(go);
	}
	public static void search(int x, int y) {
		if (x == mouseX && y == mouseY) {
			go = "YES";
		} else {
			if (x > 0) {
				if (map2[x - 1][y] == 0 && map[x - 1][y] != 43) {
					map2[x - 1][y] = 1;
					search(x -1, y);
				}
			}
			if (x < mapX - 1) {
				if (map2[x + 1][y] == 0 && map[x + 1][y] != 43) {
					map2[x + 1][y] = 1;
					search(x + 1, y);
				}
			}
			if (y > 0) {
				if (map2[x][y - 1] == 0 && map[x][y - 1] != 43) {
					map2[x][y - 1] = 1;
					search(x, y - 1);
				}
			}
			if (y < mapY - 1) {
				if (map2[x][y + 1] == 0 && map[x][y + 1] != 43) {
					map2[x][y + 1] = 1;
					search(x, y + 1);
				}
			}
		}
	}
}
