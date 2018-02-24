package main;

import Servelet.MyServlet;

public class Servlet1 implements MyServlet {

	@Override
	public void service() {
		 // TODO Auto-generated method stub  
        System.out.println("Hellow I'm the servlet.");  
        System.out.println("Now let's start our web http travel.");  
        try {  
            Thread.sleep(3000);  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        Operate1 dao = new Operate1("oracle");  
        try {  
            dao.operate();  
        } catch (InterruptedException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        System.out.println("Now I will beleave the web world...");  
        System.out.println("Bye-bye.");
		
	}

}
