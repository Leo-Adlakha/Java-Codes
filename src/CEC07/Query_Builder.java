package CEC07;

import java.util.ArrayList;

public class Query_Builder {

	String str ;
	String table_name ;
	ArrayList<String> attr ;
	
	Query_Builder(){
		this.str = "" ;	
		this.table_name = "" ;
		this.attr = new ArrayList<>()  ;
	}
	
	Query_Builder(String t_name, ArrayList<String> attr){
		this.str = "" ;	
		this.table_name = t_name ;
		this.attr = attr  ;
	}
	
	public void Build_Query(ArrayList<String> attr_reqd, String group_by, String where, String agg_fn, String having){
		
		this.str += "SELECT " ;
		for( String val : attr_reqd ) {
			str += val + ", ";
		}
		if( agg_fn.length() == 0 ) {
			this.str = this.str.substring(0,this.str.length()-2) + " ";
		}else {
			this.str += agg_fn.toUpperCase() + " ";
		}
		this.str += "FROM " + this.table_name + " " ;
		if( where.length() != 0 ) {
			this.str += "WHERE " + where + " "; 
		}
		if( group_by.length() != 0 ) {
			this.str += "GROUP BY " + group_by + " "; 
		}
		if( having.length() != 0 ) {
			this.str += "HAVING " + having + " " ;
		}
		
		this.str += ";" ;
		this.toString() ;
	}

	@Override
	public String toString() {
		
		return this.str ;
		
	}
	
}
