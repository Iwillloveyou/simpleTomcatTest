package main;

public class Operate1 {

	private String name;  
    public Operate1(String _name)  
    {  
        name = _name;  
    }  
    public void operate() throws InterruptedException  
    {  
        System.out.println("I will do much work...");  
        Thread.sleep(3000);  
        System.out.println(name + "DAOOperator exec succeed.");  
    }  
}
