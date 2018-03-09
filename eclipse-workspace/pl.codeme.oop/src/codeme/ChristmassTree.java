package codeme;

public class ChristmassTree {

	public static void main(String[] args) {
		drawTree(12);
	}

	public static void drawTree(int height) {
		int x, y;
		for (y=1; y<=height; y++) {
			for (x=1; x<=y; x++)
				System.out.print('*');
			System.out.println();
		}
	}
}
