package myUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Savers {

	public static void save(List<Double> dl, String fout, String header) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fout));
		if (header != null) {
			bw.write(header + "\n");
		}
		
		for (int i=0; i < dl.size(); i++) {
			bw.write(i + "," + dl.get(i) + "\n");
		}
		bw.close();
	}

	public static void save(int[][] counts, String fout, String header) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fout));
		for (int row = 0; row < counts.length; row++) {
			bw.write(Arrays.toString(counts[row]) + "\n");
		}
		bw.close();
	}

	public static void save(String str, String fout) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fout));
		bw.write(str);
		bw.close();
	}

}
