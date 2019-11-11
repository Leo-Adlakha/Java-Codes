import java.util.Scanner;

public class DBMS_Converter {
	
	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "http://192.168.64.2/" ;
		String php_file = "DBMS/Testi.php" ;
		String str = "SELECT Login_ID.Category FROM Login_ID WHERE Login_ID.Username='leoadlakha' and Login_ID.Password='123'" ;
		
		for ( int i = 0 ; i < str.length() ; i++ ) {
			
			if ( str.charAt(i) == ' ' ) {
				str = str.substring(0, i) + "%20" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == '"' ) {
				str = str.substring(0, i) + "%22" + str.substring(i+1) ;
			} 
//			else if ( str.charAt(i) == '%' ) {
//				str = str.substring(0, i) + "%25" + str.substring(i+1) ;
//			} 
			else if ( str.charAt(i) == '&' ) {
				str = str.substring(0, i) + "%26" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == '(' ) {
				str = str.substring(0, i) + "%28" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == ')' ) {
				str = str.substring(0, i) + "%29" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == '*' ) {
				str = str.substring(0, i) + "%2A" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == '+' ) {
				str = str.substring(0, i) + "%2B" + str.substring(i+1) ;
			} 
//			else if ( str.charAt(i) == ',' ) {
//				str = str.substring(0, i) + "%2C" + str.substring(i+1) ;
//			} 
//			else if ( str.charAt(i) == '-' ) {
//				str = str.substring(0, i) + "%2D" + str.substring(i+1) ;
//			} 
			else if ( str.charAt(i) == '/' ) {
				str = str.substring(0, i) + "%2F" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == '<' ) {
				str = str.substring(0, i) + "%3C" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == '=' ) {
				str = str.substring(0, i) + "%3D" + str.substring(i+1) ;
			} 
			else if ( str.charAt(i) == '>' ) {
				str = str.substring(0, i) + "%3E" + str.substring(i+1) ;
			} 
			else {
				continue ;
			}
		}
		
		System.out.println(url + php_file + "?query=" + str);
		
	}

}
