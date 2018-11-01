package Generics;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericFns_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] car = new Car[5] ;
		car[0] = new Car(1000,100,"Red") ;
		car[1] = new Car(200,2,"Blue") ;
		car[2] = new Car(3000,3000,"Green") ;
		car[3] = new Car(40,4,"Black") ;
		car[4] = new Car(5000,500,"White") ;
		
		display(car) ;
		bubble(car) ;
		display(car) ;
		bubble( car, new CarSpeedComparator() ) ;
		display(car) ;
		bubble( car, new CarPriceComparator() ) ;
		display(car) ;
		bubble( car, new CarColorComparator() ) ;
		display(car) ;
		
	}
	
	public static <T> void display (T[] arr )
	{
		for ( T val : arr )
		{
			System.out.println(val);
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> void bubble ( T[] a )
	{
		for ( int i = 0 ; i < a.length - 1 ; i++ )
		{
			for ( int j = 0 ; j < a.length - i - 1 ; j++ )
			{
				if ( a[j].compareTo(a[j+1]) > 0 )
				{
					
					T t = a[j];
					a[j] = a[j+1] ;
					a[j+1] = t ;
				}
			}
		}
	}
	
	public static <T> void bubble ( T[] a, Comparator<T> comparator )
	{
		for ( int i = 0 ; i < a.length - 1 ; i++ )
		{
			for ( int j = 0 ; j < a.length - i - 1 ; j++ )
			{
				if ( comparator.compare(a[j], a[j+1]) > 0 )
				{
					
					T t = a[j];
					a[j] = a[j+1] ;
					a[j+1] = t ;
				}
			}
		}
	}
	

}
