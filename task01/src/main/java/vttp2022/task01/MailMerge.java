package vttp2022.task01;

import java.io.*;

public class MailMerge {

	public static void readCSVFile(String csvFile, String delimiter) {
		try {
			File file = new File(csvFile);
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line = "";

			String[] columnsStr;
			while ((line = br.readLine()) != null) {
				if(line.indexOf("id")>=0){
					continue;
				}
				columnsStr = line.split(delimiter);
				for (int i=0;i<columnsStr.length;i++){
					System.out.print(columnsStr[i] + " ");
				}
				System.out.println();
			}
			br.close();

		} catch (IOException ex) {
			System.out.println("IOException: "+ex.toString());
		}

	}

	public static void main(String[] args) {
	
		String csvFile = "C:\\Users\\muham\\OneDrive\\Desktop\\thankyou.csv";
		String delim = ",";
		MailMerge.readCSVFile(csvFile, delim);
	}

}