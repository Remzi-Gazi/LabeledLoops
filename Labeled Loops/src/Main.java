
public class Main {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 2, 1, 3, 4, 5, 6, 2, 8, 9, 10 },
				{ 1, 2, 1, 9, 2, 6, 7, 8, 9, 10 }, { 2, 2, 3, 2, 5, 6, 3, 8, 9, 10 } };

		callLoops(arr);

	}

	static void callLoops(int[][] arr) {
		
		// Label names can be anything(except keywords)
		// You may rename them as you wish
		// It gives you control over loops
		
		
		// Normal Loop
		System.out.println("Normal Loop");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		// Break inner loop if you find 9 with inner label
		System.out.println("Break inner loop if you find 9 with inner label");
		for (int i = 0; i < arr.length; i++) {
			inner://Controls the inner loop nothing changes if you delete inner labels normal break does the same job
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==9) {
					break inner;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		// Break inner loop if you find 9 without inner label
		System.out.println("Break inner loop if you find 9 without inner label");
		for (int i = 0; i < arr.length; i++) {	
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==9) {
					break;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
				
		System.out.println();
		
		
		
		
		// Break outer loop if you find 9
		System.out.println("Break outer loop if you find 9");
		outer://Controls the outer loop if you delete outer labels break will affect the inner loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==9) {
					break outer;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		// Continue inner loop if you find 9 with inner label
		System.out.println("Continue inner loop if you find 9 with inner label");
		for (int i = 0; i < arr.length; i++) {
			inner:
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==9) {
					continue inner;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		
		// Continue inner loop if you find 9 without inner label
		System.out.println("Continue inner loop if you find 9 without inner label");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==9) {
					continue;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		// Continue outer loop if you find 9
		System.out.println("Continue outer loop if you find 9");
		outer:
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==9) {
					continue outer;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
