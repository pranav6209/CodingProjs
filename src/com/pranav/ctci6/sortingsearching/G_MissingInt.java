package com.pranav.ctci6.sortingsearching;

public class G_MissingInt {
	
	
/*		http://vojtechruzicka.com/bit-manipulation-java-bitwise-bit-shift-operations/
		
		https://www.careercup.com/question?id=3058
		
		from book 
		
		
		lets say i/p file has 
		
		1,2,3,4,5,6,6,7,9,10,11,12.........4B
		
		
		initialize bit vector from 1 to w billion.  
		
		1 -->0						9 -->0			4B -->0
		2 -->0						10 -->0	
		3 -->0						11 -->0
		4 -->0						12 -->0
		5 -->0						13 -->0
		6 -->0						14 -->0
		7 -->0						15 -->0
		8 -->0						16 -->0
	
	scan the file, for the num in file set the flag to 1 in vector
	
	
		1 -->1						9 -->1			
		2 -->1						10 -->1	
		3 -->1						11 -->1
		4 -->1						12 -->1
		5 -->1								|
		6 -->1								|
		7 -->1								|
		8 -->0 					4B -->1
		
		8 is zero as it is not in the file 
		
		
		now iterate through bit vector from first index, when we see first zero for as a value that integer 
		is not in the list.
		
		for example here 8 is missing from thr file.
*/
}
