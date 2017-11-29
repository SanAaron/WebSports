/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multMatServer;

import java.rmi.RemoteException;
import java.util.Vector;

/**
 *
 * @author karg
 */
public class matrizImp implements matriz {

    private Double [][] m;
    private Double [][] mr;
    private int c;
    private int [] a;
    public matrizImp(int n,Double[][] v)
    {
        m=v;
        c=n;
        a = new int[2];
        mr=new Double[c][c];
        a[0]=0;
        a[1]=0;
    }

    @Override
    public Double[][] setMatrizC() throws RemoteException {
        
        Double [][] tempo=new Double[c][c];
        tempo[0][0]= (double) a[0];
        tempo[0][1]=(double)a[1];
        tempo[1]=this.getColumna(a[1]);
        tempo[2]=this.getFila(a[0]);
        return tempo;
    }

    @Override
    public void getMatriz(int x,int y, Double b) throws RemoteException {
        this.mr[x][y]=b;
        
    }

    
    public Double[] getColumna(int n) {
        Double [] a=new Double[c];
        for(int i=0;i<c;i++)
        {
            a[i]=m[i][n];
        }
        return a;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

   
    public Double[] getFila(int n) {
        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
 Double [] a=new Double[c];
        for(int i=0;i<c;i++)
        {
            a[i]=m[n][i];
        }
        return a;
    }

  
    
}
