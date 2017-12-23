//Cory Fink
//TA: Michael Arboleda
//Project 4
//Section: I dont know my section and I couldn't find it on canvas

public class RegionalManager extends Employee {
	
	   private int RegionNum;
       private Employee[] subordinates;
       private int minimumTask;
       
       RegionalManager(int IDNumber, String name, Task[] taskList, int RegionNum, int minimumTask){
    	   
    	   super(IDNumber,name,taskList);
    	   this.RegionNum = RegionNum;
    	   this.minimumTask = minimumTask;
    	   
       }
       RegionalManager(int IDNumber, String name, Task[] taskList, int RegionNum, Employee[] subordinates, int minimumTask){
    	   
    	   
    	   super(IDNumber,name,taskList);
    	   this.RegionNum = RegionNum;
    	   this.subordinates = subordinates;
    	   this.minimumTask = minimumTask;
       }
       
       public void setRegionNum(int RegionNum){
    	   this.RegionNum = RegionNum;
       }
       
       public int getRegionNum(){
    	   return RegionNum;
       }
       
       public void setSubordinates(Employee[]subordinates){
    	   this.subordinates = subordinates;
       }
       
       public Employee[] getSubordinates(){
    	   return subordinates;
       }
       
       public void setMinimumTask(int minimumTask){
    	   this.minimumTask = minimumTask;
       }
       
       public int getMinimumTask(){
    	   return minimumTask;
       }
   		//prints a toString method that includes the super toString (basic employee info) and other RegionalManager-related information
       public String toString(){
    	   String reg = "Regional Manager"+"\n"+super.toString()+"\n"+"Region Number: "+getRegionNum() + "\n"+"Minimum Task Level: " + getMinimumTask()+ "\n"+"Employees: "+"\n";
    	   for(int i =0;i<subordinates.length;i++){
    		//once the loop gets to the last subordinate it doesn't add another newline
       		reg+=subordinates[i].toString();
       		if(i!=subordinates.length-1)
       			reg+= "\n";
       	}
    	   return reg;
       }
	//equals method. Do not edit!
	public boolean equals(RegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getRegionNum() == RegionNum);
		equal = equal && (r.getMinimumTask() == minimumTask);
		for(int i = 0; i < subordinates.length; i++){
			equal = equal && (subordinates[i].equals(r.getSubordinates()[i]));
		}
		return equal;
	}
}