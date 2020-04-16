/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Cao's Laptop
 */
public class ThanhToanOnline implements IThanhToan  {

    double tienHang;
    @Override
    public double thanhToan(int tienHang) {
        this.tienHang = tienHang;
        if(this.tienHang<1000000)
            return this.tienHang-=this.tienHang*0.05;
        return this.tienHang-=this.tienHang*0.07;
    }
    
}
