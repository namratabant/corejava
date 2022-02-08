package test;

public class loopexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop to print number 1 to 10//
		
		int num1 = 1;
	 while (num1<=10)
	{
		 if(num1==5) {
				num1 = num1+1;
				continue;
			}
			
			System.out.println(num1);
			num1 = num1+1;	
			
		}
	
	



// for loop to type from 1to 10//
       

 for(int count=1;count<=10;count++) {
	
	if(count==5) {
		break;
	}
	
	System.out.println("inside for loop " + count);
}
	// for loop to type 10 to 0//
 for (int count=10;count>=1;count--)
 {
	 System.out.println("count the value=" + count); 
 }
	
	


//Arrays with Loop

		int[] array1 = {20,30,40,50,60};
		
		for(int index=0;index<array1.length;index++) {
			
			System.out.println("Value inside array " + array1[index]);
		}
		
		for(int var1:array1) {
			
			System.out.println(var1);
		}
		
		
	}

}


	
