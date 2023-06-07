/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP;

/**
 *
 * @author ASUS
 */
public class TestBank {
    public static void main(String[] args) {
        //Account a1=new Account ("Aldo",12345,500000);
        Account a2=new Account();
        Account a3=new Account();
        a2.setAccountName("Arisya Riani");
        a2.setAccountNum(12345678);
        a2.setBalance(100000);
        
        a3.setAccountName("Riani");
        a3.setAccountNum(1234899);
        a3.setBalance(150000);
        
        a2.print();
        System.out.println("");
        a3.print();
        System.out.println("");
    }
}
