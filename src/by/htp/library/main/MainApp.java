package by.htp.library.main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		while(!(name.equals("L") | name.equals("R"))) {
		try {
			
		Scanner in = new Scanner(System.in);
		System.out.println("Hello! Are you librarian or reader? If librarian enter L, if reader enter R");
		 name = in.nextLine();
		 if((name.equals("R")) )
				System.out.println("Hello, Reader. Please, log in");
				else if((name.equals("L") ))
					System.out.println("Hello, Librarian. Please, log in");
				else{
		throw new Exception("You should enter 'L' or 'R' ");	
		}
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
			
		}

	}
	
}