//********************************************************************
//Garrett McCue 	
//
//7/27/20
//
//CPSC-501-Lab4Ex1
//**********************************************************************

public class Box {

	// -----------------------------------------------------------------
	// A modified version of Box.java from lab3. This uses an overloaded
	// method for printBox with the parameters char c instead of '*'
	// -----------------------------------------------------------------
	private static int size = 0;

	// constructor
	public Box(int size) {
	}

	public static void main(String[] args) {
		Box.size = 5;

		// invokes the fist printBox method
		Box box1 = new Box(size);
		box1.printBox();

		// invokes the second printBox and prints out the
		// character 'c' instead of '*'
		Box box2 = new Box(size);
		box2.printBox('c');
	}

	// print a set of "*" characters w/ size rows and columns
	public void printBox() {

		for (int i = 0; i < size; i++) {
			for (int x = 0; x < size; x++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		System.out.println();
		
	}

	// operates the same as the printBox method above, but
	// uses a character instead of "*".
	public void printBox(char c) {
		for (int i = 0; i < size; i++) {
			for (int x = 0; x < size; x++) {
				System.out.print(c);
			}
			System.out.println("");
		}
	}

}
