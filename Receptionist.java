public class Receptionist extends Employee{
	
	 private AssistantRegionalManager supervisor;
     private int maxTaskComplexityLevel;
    
     Receptionist(int IDNumber, String name, Task[] taskList, AssistantRegionalManager supervisor, int maxTaskComplexityLevel){
    	 super(IDNumber,name,taskList);
    	 this.supervisor = supervisor;
    	 this.maxTaskComplexityLevel = maxTaskComplexityLevel;
     }
     
     public void setSupervisor(AssistantRegionalManager supervisor){
    	 this.supervisor = supervisor;
     }
     
     public AssistantRegionalManager getSupervisor(){
    	 return supervisor;
     }
     
     public void setMaxTaskComplexityLevel(int maxTaskComplexityLevel){
    	 this.maxTaskComplexityLevel = maxTaskComplexityLevel;
     }
     
     public int getMaxTaskComplexityLevel(){
    	 return maxTaskComplexityLevel;
     }
 	//prints a toString method that includes the super toString (basic employee info) and other Receptionist-related information
     public String toString(){
     	return "Receptionist"+"\n"+ super.toString() + "\nAssistant Regional Manager: "+supervisor.getName() + "\nMax Task Level: " + getMaxTaskComplexityLevel();

     }
	//equals method. Do not edit!
	public boolean equals(Receptionist r){
		boolean equal = super.equals(r);
		equal = equal && (r.getSupervisor().equals(supervisor));
		equal = equal && (r.getMaxTaskComplexityLevel() == maxTaskComplexityLevel);
		return equal;
	}
}