package pl.pnowinski.matrix;

public class TestMatrix {

	public static void main(String[] args) {
		/*
		 Solving two variable linear equation system
		  3x + y = 6
		 -2x + y = 3
		*/
		
		// arrays representing equations
		double[][] lhsArray = { { 3, 1}, { -2, 1 } };	// left hand side
		double[] rhsArray = { 6, 3 };					// right hand side
		
		// matrix object left hand side
		Matrix A = new Matrix(lhsArray);
		A.show();
		System.out.println();
		
		// matrix object right hand side
		Matrix B = new Matrix(rhsArray, 2);
		B.show();
		System.out.println();
		
		// Calculate Solved Matrix x
		Matrix x = A.solve(B);
		
		x.show();
		
		// Print Answers
	    System.out.println("x = " + x.get(0, 0));
	    System.out.println("y = " + x.get(1, 0));
	}

}
