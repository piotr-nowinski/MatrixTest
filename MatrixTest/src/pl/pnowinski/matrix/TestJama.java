package pl.pnowinski.matrix;

import Jama.Matrix;

public class TestJama {

	/**
	 * @param args
	 */
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
		Matrix A = new Jama.Matrix(lhsArray);
		A.print(1, 1);
		
		// matrix object right hand side
		Matrix B = new Jama.Matrix(rhsArray, 2);
		B.print(1, 1);
		
		// Calculate Solved Matrix x
		Matrix x = A.solve(B);
		
		x.print(1, 1);
		
		// Print Answers
	    System.out.println("x = " + x.get(0, 0));
	    System.out.println("y = " + x.get(1, 0));
	}
}
