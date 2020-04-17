/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;

/**
 *
 * @author Cao's Laptop
 */
public class QLSV {
    ArrayList<SinhVien> dsSV = new ArrayList<>();
    ISoSanh soSanh;
    
    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    // Thêm các đối tượng SinhVien vào danh sách
    public void them(SinhVien sv)  {
        dsSV.add(sv);
    }
    
    // Sắp xếp danh sách các đối tượng SinhVien
    public void sapXep() {
        dsSV.sort((o1, o2) -> soSanh.soSanh((SinhVien)o1, (SinhVien)o2));
    }
    // In danh sách các SinhVien
    public void indsSV() {
        dsSV.forEach(SinhVien -> System.out.println("Sinh viên: " + SinhVien.getThongTin()));
    }
}
