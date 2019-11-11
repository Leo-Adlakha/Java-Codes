package CEC07;

import java.util.ArrayList;
import java.util.Scanner;

public class SQL_Helper {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("WELCOME TO QUERY BUILDER!!!");
		char ch = 'Y' ;
		String t_name ;
		do {
			System.out.println("Lets Start our Query!!");
			System.out.println("1. CREATE");
			System.out.println("2. INSERT");
			System.out.println("3. SELECT");
			char c = scn.next().charAt(0) ;
			switch(c) {
			
			case '1':
				String create = "CREATE TABLE " ;
				System.out.print("Table Name: ");
				t_name = scn.next() ;
				create += t_name + " ( \n";
				System.out.println("How Many Attributes do you want in your Table ?");
				int n = scn.nextInt() ;
				System.out.println("Enter your attributes with features: ");
				for ( int i = 1 ; i <= n + 1 ; i++ ) {
					if ( i != 1 ) {
						create += "\t" ;
					}
					create += scn.nextLine() ;
					if ( i != n + 1 && i != 1 ) {
						create += ",\n" ;
					}
					else if ( i == n + 1 ) {
						create += "\n);";
					}
				}
				System.out.println("\n\nYour Query is \n\n" + create + "\n\n");
				break ; 
			case '2':
				String insert = "INSERT INTO " ;
				System.out.print("Table Name: ");
				t_name = scn.next() ;
				insert += t_name + " VALUES ( \n";
				System.out.println("How Many Values do you want in your Table ?");
				int m = scn.nextInt() ;
				System.out.println("Enter your values: ");
				for ( int i = 1 ; i <= m + 1 ; i++ ) {
					if ( i != 1 ) {
						insert += "\t(" ;
					}
					insert += scn.nextLine() ;
					if ( i != m + 1 && i != 1 ) {
						insert += "),\n" ;
					}
					else if ( i == m + 1 ) {
						insert += ")\n);";
					}
				}
				System.out.println("\n\nYour Query is \n\n" + insert + "\n\n");
				break ;
			case '3':
				System.out.println("ENTER TABLE NAME AND ALL THE ATTRIBUTES");
				scn.nextLine() ;
				t_name = scn.nextLine() ;
				String at_name = scn.nextLine() ; 
				ArrayList<String> a_name = new ArrayList<>() ;
				int k = 0 ;
				for ( int i = 0 ; i < at_name.length() ; i++ ) {
					if ( at_name.charAt(i) == ' ') {
						a_name.add(at_name.substring(k, i-1)) ;
						k = i + 1 ;
					}
				}
				a_name.add(at_name.substring(k)) ;
				Query_Builder q = new Query_Builder(t_name, a_name) ;
				String group_by, having, agg_fn, where ;
				ArrayList<String> attr_reqd = new ArrayList<>() ;
				System.out.println("Attributes Required ??");
				String at_reqd = scn.nextLine() ;
				System.out.println(at_reqd);
				k = 0 ;
				for ( int i = 0 ; i < at_reqd.length() ; i++ ) {
					if ( at_reqd.charAt(i) == ' ') {
						attr_reqd.add(at_reqd.substring(k, i-1)) ;
						k = i + 1 ;
					}
				}
				attr_reqd.add(at_reqd.substring(k)) ;
				System.out.println(attr_reqd);
				System.out.println("Where ?");
				where = scn.nextLine() ;
				System.out.println("Aggregate Functions if any ?");
				agg_fn = scn.nextLine() ;
				System.out.println("Grouping by ?");
				group_by = scn.nextLine() ;
				System.out.println("Having ?");
				having = scn.nextLine() ;
				q.Build_Query(attr_reqd, group_by, where, agg_fn, having);
				System.out.println("\n\nYour Query is \n\n" + q + "\n\n");
				break ;
			default:
				System.out.println("You've hit the wrong road!!");
			
			}
			
			System.out.println("Want to write another query ??");
			ch = scn.next().charAt(0) ;
		}while(ch == 'Y' || ch == 'y' ) ;
		
	}
	
	
}
