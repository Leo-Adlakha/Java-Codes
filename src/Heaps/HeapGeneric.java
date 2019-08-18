package Heaps;

import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>> {

private ArrayList<T> data = new ArrayList<>() ;
	
	public int size ()
	{
		return this.data.size() ;
	}
	
	public boolean IsEmpty()
	{
		return this.data.size() == 0 ; 
	}
	
	public void add ( T item )
	{
		
		this.data.add(item) ;
		upheapify(this.data.size() - 1) ;
		
	}

	private void upheapify( int ci ) 
	{
		
		int pi = (ci - 1) / 2 ;
		
		if ( isLarger(this.data.get(ci), this.data.get(pi)) > 0 )
		{
			swap(pi,ci) ;
			upheapify(pi);
		}
		
		
	}

	private void swap(int i, int j) 
	{
		
		T ith = this.data.get(i) ;
		T jth = this.data.get(j) ;
		
		this.data.set(i, jth) ;
		this.data.set(j, ith) ;
		
	}
	
	public void display()
	{
		System.out.println(this.data);
	}
	
	public T remove()
	{
		
		swap(0,this.data.size() - 1) ;
		T rv = this.data.remove(this.data.size() - 1 ) ;
		downheapify(0) ;
		
		return rv ;
		
	}

	private void downheapify(int pi) 
	{
		
		int lci = 2 * pi + 1 ;
		int rci = 2 * pi + 2 ;
		int mini = pi ;
		
		if ( lci < this.data.size() && isLarger(this.data.get(lci), this.data.get(mini)) > 0 )
		{
			mini = lci ;
		}
		
		if ( rci < this.data.size() && isLarger(this.data.get(rci), this.data.get(mini)) > 0 )
		{
			mini = rci ;
		}
		
		if ( pi != mini )
		{
		    swap(pi,mini) ;
		    downheapify(mini);
		}
	}
	
	public T getHP()
	{
		return this.data.get(0) ;
	}
	
	private int isLarger ( T t, T o)
	{
		return t.compareTo(o) ;
	}
	
	
	
	
	
}
