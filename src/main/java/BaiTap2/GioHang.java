/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author Cao's Laptop
 */
public class GioHang {
    //  đối tượng hinhThucTT kiểu IThanhToan 
    IThanhToan hinhThucTT;
    
    //  một danh sách các hàng hoá
    ArrayList<HangHoa> dsHH = new ArrayList<>();
    
    public void setHinhThucTT(IThanhToan hinhThucTT)  {
        this.hinhThucTT = hinhThucTT;
    }
        
    public void them(HangHoa HH) {
        dsHH.add(HH);
    }
    
    public int tienHang() {
        int tienHang=0;
        for (HangHoa HH : dsHH) {
            tienHang+=HH.gia;
        }
        return tienHang;
    }
    
    public double tongTienPhaiTra()    {
        return hinhThucTT.thanhToan(tienHang());
    }
    
    public void indsHH() {
        dsHH.forEach(HH -> System.out.println(HH.thongTinHH()));
    }
}
