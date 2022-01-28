public class Runner {
	public static void main(String[] args) {
		String list[] ={"Ion", "Tom", "Bill", "Joe", "Jack", "Matt", "George", "Tyler", "Pete", "Elliot", "Nick", "Jose", "Adam"};
		String chart[][] = createSeatingChart(list);

	}
	public static String[][] createSeatingChart(String names[]) {
		int len = names.length - 1;
		int root = (int)Math.sqrt(len) + 1;
		int count = 0;
		String matrix[][] = new String[root][root];
		for (int i = 0; i < root; i++) {
			for (int j = 0; j < root; j++) {
				if(count < len) {
					matrix[i][j] = names[count];
				}
				else {
					matrix[i][j] = " ";
				}
				
				count++;
			}
		}
		print(matrix);
		return matrix;
	}
	public static void print(String m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "   ");
			}
			System.out.print("\n");
		}
	}
}
