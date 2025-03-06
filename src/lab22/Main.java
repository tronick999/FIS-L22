package lab22;

import java.util.Scanner;

public class Main {
	private static Scanner scan= new Scanner(System.in);
	
	
	public static void main(String[] args){
		
		Ajutor instanta = new Ajutor();
		System.out.print("introduceti mesajul:");
		String mesaj = scan.next();
		System.out.print(mesaj+"\n");
		
		if(mesaj.equals("hello"))
		{
			instanta.Afisare();
		}else if(mesaj.equals("exit")) {
			System.out.println("Programul a iesit din executie");
			System.exit(0);
		}else
		{
			instanta.Info();
		}
	}
}
