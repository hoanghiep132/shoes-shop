

import connectionjdbc.bill.BillTransaction;
import java.util.List;
import model.Bill;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hiepnguyen
 */
public class Test {

   

    public static void main(String[] args) {
        List<Bill> bills = new BillTransaction().getListApproving();
        bills.forEach(b -> {
            System.out.println(b.getCustomer().getName());
        });
    }
}

