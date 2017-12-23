//Cory Fink
//TA: Michael Arboleda
//Project 4
//Section: I dont know my section and I couldn't find it on canvas

public class AssistantRegionalManager extends Employee{
	
	private RegionalManager manager;
    private int minimumTask;
	
    AssistantRegionalManager(int IDNumber, String name, Task[] taskList, RegionalManager manager, int minimumTask){
    	super(IDNumber, name, taskList);
    	this.manager = manager;
    	this.minimumTask = minimumTask;
    }
    
    public void setManager(RegionalManager manager){
    	this.manager = manager;
    }
    
    public RegionalManager getManager(){
    	return manager;
    }
    
    public void setMinimumTask(int minimumTask){
    	this.minimumTask = minimumTask;
    }
    
    public int getMinimumTask(){
    	return minimumTask;
    }
	//prints a toString method that includes the super toString (basic employee info) and other Assistant-related information
    public String toString(){
    	return "Assistant Regional Manager"+"\n"+super.toString()+"\nRegional Manager: "+manager.getName()+"\nMinimum Task Level: "+getMinimumTask();
    			
    }
	//equals method. Do not edit!
	public boolean equals(AssistantRegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getMinimumTask() == minimumTask);
		equal = equal && (r.getManager().equals(manager));
		return equal;
	}
}