package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ManipulaArquivos {

	public static void main(String[] args) {
		String path = "C:\\temp\\generic_food.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			
				while(line != null) {
					if(line.contains("Tropical fruits")) {
						System.out.println(line);
					}
					line = br.readLine();
				}
			
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
