package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String path = "c://temp//candidatos.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> votes = new LinkedHashMap<>();
			
			String line = br.readLine();
			int sum = 0;
			
			while(line != null) {
				
				String [] fields = line.split(",");
			
				if (votes.containsKey(fields[0])) {
					
					sum = Integer.parseInt(fields[1]);
					votes.put(fields[0], votes.get(fields[0])+sum);
					
				}else {
					votes.put(fields[0], Integer.parseInt(fields[1]));
				}
				
				line = br.readLine();
			}
			
		for(String key: votes.keySet()) {
			System.out.println(key + ": " + votes.get(key));
		}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		

		sc.close();

	}

}
