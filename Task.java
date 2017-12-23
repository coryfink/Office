public class Task {
	
	   private String name;
       private int level;
       
    Task(String name, int level){
    	this.name = name;
    	this.level = level;
    }
    
    public String getName(){
    	return name;
    }
    
    public int getLevel(){
    	return level;
    }
    //toString that prints that task followed by the level
    public String toString(){
    	return "\tTask: "+getName()+"\tLevel: "+getLevel();
    }
	//equals method. Do not edit!
	public boolean equals(Task t){
		return ((t.getLevel() == level) && (t.getName().equals(name)));
	}
}