package myUtil;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.stat.StatUtils;


public class Converters {
	
	static String array2DtoString(int[][] counts) {
		String str = "";
		for (int row = 0; row < counts.length; row++) {
			str += (Arrays.toString(counts[row]) + "\n");
		}
		return str;
	}

	static String list2Str(List<double[]> ld) {
		String res = "";
		for (double[] entry : ld) {
			res += (Arrays.toString(entry) + "\n");
		}
		return res;
	}

	static double[] toDoubles(String[] valueStr) {
		
		double[] values = new double[valueStr.length];
		for (int i = 0; i < values.length; i++) {
			values[i] = Double.parseDouble(valueStr[i].trim());
		}
		return values;
	}

	static double[] toDoubles(int[] intArr) {
		double[] arr = new double[intArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = intArr[i];
		}
		
		return arr;
	}
	
	public static double[][] to2D_array(List<double[]> vectors) {
		
		double[][] arr = new double[vectors.size()][vectors.get(0).length];
		for (int row = 0; row < arr.length; row++) {
			arr[row] = vectors.get(row);
		}
		
		return arr;
	}

	public static Array2DRowRealMatrix toMat(List<double[]> vectors) {
		
		return new Array2DRowRealMatrix(to2D_array(vectors));
	}

	static RealVector toVector(double[] doubles) {
		return new ArrayRealVector(doubles);
	}
	
	public static double[] normalize(RealVector v) {
		
		double sum = StatUtils.sum(v.toArray());
		return v.mapDivide(sum).toArray();
	}
}
