/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Cao's Laptop
 */
public class bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        // Tạo đối tượng QLSV
        QLSV qlsv = new QLSV();
        // tạo sinh viên
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        SinhVien sv3 = new SinhVien();
        
        SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy");
        
        sv1.setHoTen("Trần Tiến Cao");
        sv1.setNgaySinh(formaterDate.parse("1/1/1999"));
        sv1.setDiemTB(7.2f);
        
        sv2.setHoTen("Trần Dần");
        sv2.setNgaySinh(formaterDate.parse("11/10/1999"));
        sv2.setDiemTB(7.8f);
        
        sv3.setHoTen("Trần Mẹo");
        sv3.setNgaySinh(formaterDate.parse("17/3/1999"));
        sv3.setDiemTB(7.5f);
        
        qlsv.them(sv1);
        qlsv.them(sv2);
        qlsv.them(sv3);
        
        System.out.println("Danh sách các sinh viên trong danh sách quản lý:");
        qlsv.indsSV();
        
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        System.out.println("Danh sách các sinh viên sau khi sắp xếp theo điểm:");
        qlsv.indsSV();
        
        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        System.out.println("Danh sách các sinh viên sau khi sắp xếp theo tên:");
        qlsv.indsSV();
    }
    
}
