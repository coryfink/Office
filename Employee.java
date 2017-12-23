public abstract class Employee {	
	
	private int IDNumber;
    private String name;
    private Task[] taskList;
  
  
    Employee(){
    	
    }
    public Employee(int IDNumber, String name, Task[] taskList){
    	

    	this.IDNumber = IDNumber;
    	this.name = name;
    	this.taskList = taskList;
    	
    }
    
    public void setIDNumber(int IDNumber){
    	
    	this.IDNumber = IDNumber;
    	
    }
    
    public int getIDNumber(){
    	return IDNumber;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return name;
    }
    
    public void setTaskList(Task[] taskList){
    	this.taskList = taskList;
    }
    
    public Task[] getTaskList(){
    	return taskList;
    }
    
    public String toString(){
    	String employee = "Name: "+getName()+"\nID: "+getIDNumber()+"\nTask List: ";
    	for(int i =0;i<taskList.length;i++){
    		employee+="\n"+taskList[i].toString();
    	}
    	return employee;
    }
	//equals method. Do not edit!
	public boolean equals(Employee e){
		boolean equal = true;
		equal = equal && (e.getIDNumber() == IDNumber);
		equal = equal && (e.getName().equals(name));
		for(int i = 0; i < taskList.length; i++){
			equal = equal && (taskList[i].equals(e.getTaskList()[i]));
		}
		return equal;
	}
}