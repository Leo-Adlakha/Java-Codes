package Queue;

public class Dynamic_Queue extends Queue_Class {

	
	@Override
	public void enqueue ( int item ) throws Exception
	{
		
		if ( isfull() )
		{
			
			int[] oa = this.data ;
			int[] na = new int[this.data.length*2] ;
			int j = 0 ;
			
			for ( int i = 0 ; i < size ; i++ )
			{
				na[j] = oa[this.front] ;
				if ( this.front < oa.length - 1 )
				{
					this.front++ ;
				}
				else
				{
					this.front = 0 ;
				}
				j++ ;
				
			}
			
			this.data = na ;
			this.front = 0 ;
			
		}
		
		super.enqueue(item);
		
		
	}
	
	
	
	
}
