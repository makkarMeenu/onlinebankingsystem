/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;

/**
 *
 * @author makka
 */
public class User {
    private int accountnumber;
    private String datetrans;
    private int amountsent;
    private int amountreceived;
    private int recaccountnumber;
    private int bal;

    public User(int accountnumber, String datetrans, int amountsent, int amountreceived, int recaccountnumber, int bal) {
        this.accountnumber = accountnumber;
        this.datetrans = datetrans;
        this.amountsent = amountsent;
        this.amountreceived = amountreceived;
        this.recaccountnumber = recaccountnumber;
        this.bal = bal;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public String getDatetrans() {
        return datetrans;
    }

    public int getAmountsent() {
        return amountsent;
    }

    public int getAmountreceived() {
        return amountreceived;
    }

    public int getRecaccountnumber() {
        return recaccountnumber;
    }

    public int getBal() {
        return bal;
    }
     
    
    
    
    
}
