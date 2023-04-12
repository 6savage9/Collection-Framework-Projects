package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class bookStore {
	
	Scanner sc=new Scanner(System.in);
	List l=new LinkedList<>();
	List l1=new LinkedList<>();
	List clist=new ArrayList<>();
			
	
	Map m=new TreeMap(Collections.reverseOrder());
	
	book b;

	public void addBook() {
		
		System.out.println("Enter Book Name: ");
		String name=sc.next();
		System.out.println("Enter Book Id: ");
		int id=sc.nextInt();
		System.out.println("Enter Release Year");
		int year=sc.nextInt();
		System.out.println("Enter Release Month");
		int month=sc.nextInt();
		System.out.println("Enter Release Date");
		int day=sc.nextInt();
		
		b=new book(name, id, year, month, day);
		l.add(b);
		l1.add(b);
	}
	
	
	public void listOfAllAvailableBooks() {
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	
	public void compare() {
		
	/*	for(int i=0; i<l1.size(); i++) {
			System.err.println(l1.get(i));
		} */
		
		for(int i=0; i<l1.size(); i++) {
			book b1=(book)l1.get(i);
			//System.out.println(b1.name+" "+b1.id+" "+b1.day+"-"+b1.month+"-"+b1.year);
			Date d1=new Date(b1.year, b1.month, b1.day);
			
			for(int j=i+1; j<l1.size(); j++) {
				book b2=(book)l1.get(j);
				Date d2=new Date(b2.year, b2.month, b2.day);
				
				if(b2.name.equals(b1.name)) {
					if(d1.after(d2)) {
						l1.remove(j);
					}
					else if(d1.before(d2)) {
						l1.remove(i);
						//i--;
						//break;
					}
					else if(d1.equals(d2)) {
						l1.remove(j);
					}
				}
			
			}
		}
		
	/*	for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}*/
		
		
		
		for(int i=0; i<l1.size(); i++) {
			book b1=(book)l1.get(i);
			Date d1=new Date(b1.year, b1.month, b1.day);
			int count=1;
			
			for(int j=0; j<l1.size(); j++) {
				book b2=(book)l1.get(j);
				Date d2=new Date(b2.year, b2.month, b2.day);
				
				if(d1.after(d2)) {
					count++;
				}
			}
			clist.add(count);
			m.put(count, b1.name+" "+b1.day+"-"+b1.month+"-"+b1.year);
			
		}	
		
	//	System.out.println("MAP: "+m);
		
		Set set=m.entrySet();
		Iterator i=set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
         //   System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
		}
		
	}
}
