        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multMatServer;
import java.rmi.*;
import java.util.Vector;

/**
 *
 * @author karg
 */
public interface matriz extends Remote{
    
    public Double [][] setMatrizC() throws RemoteException;
    public void getMatriz(int a,int c,Double b) throws RemoteException;
    //public Double [] getColumna(int n);
    //public Double [] getFila(int n);
    
    
}
