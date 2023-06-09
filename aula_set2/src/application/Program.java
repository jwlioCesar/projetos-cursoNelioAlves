package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "c://temp//in.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			
			Set<LogEntry> set = new HashSet<>();
			String line = br.readLine();
			
			
			while(line != null) {
				String[]fields = line.split(" ");
				String username = fields[0];
				Date instant = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, instant));
				line = br.readLine();
			}
			
			System.out.println("numero de usuarios: " + set.size());
			
			
		}catch(IOException e){
			e.getMessage();
		}
			
		sc.close();
				
	
	}

}