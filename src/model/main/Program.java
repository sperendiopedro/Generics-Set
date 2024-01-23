package model.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogIn;

public class Program {
	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the full path: ");
		String strPath = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			Set<LogIn> set = new HashSet<>();
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String userName = fields[0];
				Date time = Date.from(Instant.parse(fields[1]));
				set.add(new LogIn(userName, time));
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}
}
