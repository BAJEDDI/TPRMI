/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Hibernate;
import service.MachineService;
import service.SalleService;
import util.HibernateUtil;

/**
 *
 * @author USER
 */
public class Test {
    public static void main(String[] args)  {
       //   HibernateUtil.getSessionFactory().openSession();
        try {
           
            IDao<Salle> daoo= new SalleService();
            Salle s= new Salle("B2");
            daoo.create(s);
            IDao<Machine> dao1 = new MachineService();
            dao1.create(new Machine("XPS 13 9310","Dell",1199,s));
            dao1.create(new Machine("MacBook Air M2","Apple",1099,s)) ;    
            dao1.create(new Machine(" ThinkPad X1 Carbon Gen 9","Lenovo",1299,s));
            
            for(Machine m: dao1.findAll())
                System.out.println(m);
        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);}
       
          
    }
}
    

    