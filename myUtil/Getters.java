package myUtil;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.linear.AbstractRealMatrix;
import org.apache.commons.math3.stat.StatUtils;

public class Getters {

	static double getMeanNorm(AbstractRealMatrix mat) {
		
		int numRow = mat.getRowDimension();
		double[] sums = new double[numRow];
		for (int r=0; r < numRow; r++) {
			sums[r] = StatUtils.sum(Getters.getAbs(mat.getRow(r)));
		}
		return StatUtils.mean(sums);
	}

	static double[] getAbs(double[] row) {
		double[] abs_values = new double[row.length];
		for (int i = 0; i < abs_values.length; i++) {
			abs_values[i] = Math.abs(row[i]);
		}
		
		return abs_values;
	}

	static <T> List<T> getNonZeros(List<T> list) {
		List<T> nonZeroEntries = new ArrayList<T>();
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(0))	nonZeroEntries.add(list.get(i));
		}
		
		return nonZeroEntries;
	}

	public static List<Integer> getNonZeros(int[] arr) {
		List<Integer> nonZeroList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) 	nonZeroList.add(arr[i]);	
		}
		
		return nonZeroList;
	}

}
