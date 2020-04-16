/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Cao's Laptop
 */
public class bt1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        context ctxt = new context();
        
        // tính 75+12
        ctxt.setTinhToan(new Cong());
        System.out.println("tính 75+12 bằng "+ctxt.tinh(75, 12));
        
        // tính 54-78
        ctxt.setTinhToan(new Tru());
        System.out.println("\ntính 54-78 bằng "+ctxt.tinh(54, 78));
    }
    
}
