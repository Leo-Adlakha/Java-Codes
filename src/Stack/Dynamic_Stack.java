package Stack;

public class Dynamic_Stack extends Stack_Class {

	
	@Override
	public void push ( int item ) throws Exception
	{
		
		if ( isfull() )
		{
			
			int[] oa = this.data ;
			int[] na = new int[this.data.length * 2 ] ;
			
			for ( int i = 0 ; i < this.data.length ; i++ )
			{
				na[i] = oa[i] ;
			}
			
			this.data = na ;
			
			
		}	
		super.push(item);
		
	}
	
	
	
	
}
