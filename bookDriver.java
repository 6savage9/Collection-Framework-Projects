package book;

import java.util.Scanner;

public class bookDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		bookStore bs=new bookStore();
		
		for(;;) {
			
			System.out.println("1. ADD    2. All Avaible Books  3. Books With Latest Release  4.EXIT");
			int a=sc.nextInt();
			
			switch(a) {
			
			case 1:{
				bs.addBook();
				break;
			}
			
			case 2:{
				bs.listOfAllAvailableBooks();
				break;
			}
			
			case 3:{
				bs.compare();
				break;
			}
			
			case 4:{
				System.out.println("app closed");
				System.exit(0);
				
			}
			}
		}
		
	}
}
