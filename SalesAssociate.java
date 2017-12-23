//Cory Fink
//TA: Michael Arboleda
//Project 4
//Section: I dont know my section and I couldn't find it on canvas

public class SalesAssociate extends Employee{

	        private int numClients;
	        private String[] products;
	        private RegionalManager supervisor;

	SalesAssociate(int IDNumber, String name, Task[] taskList, int numClients, String[] products, RegionalManager supervisor){
		super(IDNumber, name, taskList);
		this.numClients = numClients;
		this.products = products;
		this.supervisor = supervisor;
	}
	
	public void setNumClients(int numClients){
		this.numClients = numClients;
	}
	
	public int getNumClients(){
		return numClients;
	}
	
	public void setProducts(String[]products){
		this.products = products;
	}
	
	public String[]getProducts(){
		return products;
	}
	
	public void setSupervisor(RegionalManager supervisor){
		this.supervisor = supervisor;
	}
	
	public RegionalManager getSupervisor(){
		return supervisor;
	}
	
	//prints a toString method that includes the super toString (basic employee info) as well as the other SalesAssociate related information
	public String toString(){
		String sales = "Sales Associate\n" + super.toString() + "\n"+"Regional Manager: " + supervisor.getName() + "\n"+"Number of clients: " + getNumClients() + "\n"+"Products to sell: "+"\n\t";
		for(int i =0; i<products.length; i++){
			sales+=products[i].toString();
			//once the loop arrives at the last product it doesn't add another tab and new line
			if(i!=products.length-1){
				sales+= "\n\t";
			}
		}
     	return sales;

	}

	//equals method. Do not edit!
	public boolean equals(SalesAssociate s){
		boolean equal = super.equals(s);
		equal = equal && (s.getNumClients() == numClients);
		equal = equal && (s.getSupervisor().equals(supervisor));
		
		for(int i = 0; i < products.length; i++){
			equal = equal && (products[i].equals(s.getProducts()[i]));
		}
		return equal;
	}
	
}