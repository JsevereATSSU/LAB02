class Lab01
{ 
/*
   //Please print your name as a test for this file
    public static void main(String args[]) 
    { 
        //1.	Fill 2D array with values from the user.
        //2.	Write method sum which accepts a 2D array of integers and returns the sum of all of the elements. Use row-column traversal method.
                rowSum: rowSum accepts two parameters: a 2D array of integers and an integer row. rowSum returns the sum of the integers of elements in the row given by row. 
                colSum: colSum accepts two parameters: a 2D array of integers and an integer col. colSum returns the sum of the integers of elements in the column given by col. 
                sum2: This method is the same as sum above, but you must use rowSum method in your code. 

       // 3.	printTranspose: Given 2D array of integers, print the transpose of the array. The transpose of a 2D array is the array whose rows are the columns of the original array. 
                Do not create a new array, instead, use for loops to traverse the original array. 
                  If mat={{1,2,3},
                          {4,5,6}}; 
                   printTranspose(mat) 
                      will print: 
                   1 4
                   2 5
                   3 6
*/
   
	
		public static void main(String[] args)
		{
			
			int [] []mat= {{5,4,3},{2,3,4}};
			
			Rowsum(mat);
			Rowcol(mat);
		///////////////
			
			
		
			}	
		
				public static void Rowsum(int [] [] mat)
				{
					int sum=0;
					
					for(int col =0; col < 2; col++)
					{
						for(int row=0; row < 3; row++)
						{
							sum = sum + mat[col][row];
							
		
				}
						System.out.println(sum); 		
						sum=0;
					}
				}
					
					public static void Rowcol(int [] [] mat)
						{
							int sum =0;
							
					for(int row=0; row < 3; row++)
					{
						
					for(int col=0; col < 2; col++)
					{
					sum = sum + mat[col][row];
					}			
					System.out.println(sum); 		
					sum=0;
}
}
				}

    } 
