//Cory Fink
//TA: Michael Arboleda
//Project 4
//Section: I dont know my section and I couldn't find it on canvas

public class Sorter{

	public Sorter(){
		
	}
	public static Employee[] sort(Employee[]workers){
		
		 Employee temp=null; //this is a dummy variable used to catch the temp value and trace through to create ABC order
		 
		 for(int i=0;i<workers.length-1;i++){
			 for(int j=0; j<workers.length-1;j++){
				 if(workers[j].getName().charAt(0)>workers[j+1].getName().charAt(0))
					 //switches the order according to the comparison ^^
					 temp=workers[j+1];
				 	 workers[j+1]=workers[j];
				 	 workers[j]=temp;
			 }
		  
		 }
		 return workers; 
	}
	
	
}
