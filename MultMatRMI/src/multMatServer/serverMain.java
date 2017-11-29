/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multMatServer;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import java.util.*;

/**
 *
 * @author karg
 */
public class serverMain {
    public static void main (String[] argv) {
    try {
	    	
 
                Double [][] mimatriz= new Double [4][4];
                mimatriz[0][0]=4.5;
                mimatriz[1][0]=4.5;
                mimatriz[2][0]=4.5;
                mimatriz[3][0]=4.5;
                mimatriz[0][1]=4.5;
                mimatriz[1][1]=4.5;
                mimatriz[2][1]=4.5;
                mimatriz[3][1]=4.5;
                mimatriz[0][2]=4.5;
                mimatriz[1][2]=4.5;
                mimatriz[2][2]=4.5;
                mimatriz[3][2]=4.5;
                mimatriz[0][3]=4.5;
                mimatriz[1][3]=4.5;
                mimatriz[2][3]=4.5;
                mimatriz[3][3]=4.5;
                
                
	    	matrizImp server = new matrizImp(4,mimatriz);	
                
                matriz stub = (matriz) UnicastRemoteObject.exportObject(server, 0);
                 Registry registry = LocateRegistry.getRegistry();
            registry.bind("ServerMatriz", stub);

            System.err.println("Server ready");
 
	    	Naming.rebind("rmi://localhost/ABC", server);
 
	    	System.out.println("[System] Chat Remote Object is ready:");
 
	    	while(true){
	    			
	    	}
 
    	}catch (Exception e) {
    		System.out.println("[System] Server failed: " + e);
    	}
	}
}
