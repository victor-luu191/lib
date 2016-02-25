package myUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Loader {

	public static ArrayList<double[]> loadMatFromCSV(String fin) throws IOException {
		
		ArrayList<double[]> mat = new ArrayList<double[]>();
		BufferedReader br = new BufferedReader(new FileReader(fin));
		
		String line = br.readLine();	// skip header
		while ((line = br.readLine()) != null) {
			String[] valueStr = line.split(",");
			mat.add(Converters.toDoubles(valueStr));
		}
		
		br.close();
		return mat;
	}

}
