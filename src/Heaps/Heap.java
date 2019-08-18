package Heaps;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> data = new ArrayList<>() ;
	
	public int size ()
	{
		return this.data.size() ;
	}
	
	public boolean IsEmpty()
	{
		return this.data.size() == 0 ; 
	}
	
	public void add ( int item )
	{
		
		this.data.add(item) ;
		upheapify(this.data.size() - 1) ;
		
	}

	private void upheapify( int ci ) 
	{
		
		int pi = (ci - 1) / 2 ;
		
		if ( this.data.get(pi) > this.data.get(ci) )
		{
			swap(pi,ci) ;
			upheapify(pi);
		}
		
		
	}

	private void swap(int i, int j) 
	{
		
		int ith = this.data.get(i) ;
		int jth = this.data.get(j) ;
		
		this.data.set(i, jth) ;
		this.data.set(j, ith) ;
		
	}
	
	public void display()
	{
		System.out.println(this.data);
	}
	
	public int remove()
	{
		
		swap(0,this.data.size() - 1) ;
		int rv = this.data.remove(this.data.size() - 1 ) ;
		downheapify(0) ;
		
		return rv ;
		
	}

	private void downheapify(int pi) 
	{
		
		int lci = 2 * pi + 1 ;
		int rci = 2 * pi + 2 ;
		int mini = pi ;
		
		if ( lci < this.data.size() && this.data.get(lci) < this.data.get(mini) )
		{
			mini = lci ;
		}
		
		if ( rci < this.data.size() && this.data.get(rci) < this.data.get(mini) )
		{
			mini = rci ;
		}
		
		if ( pi != mini )
		{
		    swap(pi,mini) ;
		    downheapify(mini);
		}
	}
	
	public int getHP()
	{
		return this.data.get(0) ;
	}
	
	
	
}
