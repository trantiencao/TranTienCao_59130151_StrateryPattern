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
public class ThanhToanCOD implements IThanhToan {
    
    @Override
    public double thanhToan(int tienHang) {
        double tienPhaiTra = tienHang;
        if(tienPhaiTra>2000000)
            return tienPhaiTra -= tienPhaiTra*0.02;
        return tienPhaiTra;
    }
    
}
