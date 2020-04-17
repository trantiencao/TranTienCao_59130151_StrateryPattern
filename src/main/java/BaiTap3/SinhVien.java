/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Cao's Laptop
 */
public class SinhVien {
    public String hoTen;
    public Date ngaySinh;
    public float diemTB;
    
    SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
    
    public SinhVien() {
        
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    public String getThongTin() {
        return "Họ tên: "+this.hoTen+", Ngày sinh: "+formaterDate.format(this.ngaySinh)
               +", Điểm TB: "+this.diemTB;
    }
    
}
