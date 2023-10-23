/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrmi;


import entities.Salle;
import dao.IDao;
import entities.Machine;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ClientRMI {
    public static void main(String[] args) {
        try {
            IDao<Machine> dao1= (IDao<Machine>) Naming.lookup("rmi://localhost:1099/dao1");
            IDao<Salle> daoo= (IDao<Salle>) Naming.lookup("rmi://localhost:1099/daoo");
            Salle s= new Salle("B2");
            daoo.create(s);
            for(Salle s2: daoo.findAll())
                System.out.println(s2);
            dao1.create(new Machine("XPS 13 9310","Dell",1199,s));
            dao1.create(new Machine("MacBook Air M2","Apple",1099,s)) ;    
            dao1.create(new Machine(" ThinkPad X1 Carbon Gen 9","Lenovo",1299,s));
            
            for(Machine m: dao1.findAll())
                System.out.println(m);
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
