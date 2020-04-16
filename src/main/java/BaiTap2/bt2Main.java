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
public class bt2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Tạo các hàng hóa
        HangHoa tuLanh = new HangHoa("Tủ lạnh", 5000000, "Nhét vừa con bò");
        HangHoa loNuong = new HangHoa("Lò nướng", 2000000, "3 Kg");
        HangHoa noiAS = new HangHoa("Nồi cơm áp suất", 1500000, "Nhét vừa con gà");
        HangHoa chen = new HangHoa("Chén", 50000, "Chén sứ cao cấp");
        HangHoa dua = new HangHoa("Đủa", 50000, "Đủa bạc");
        
        // Giỏ hàng 1
        GioHang gh1 = new GioHang();
        gh1.setHinhThucTT(new ThanhToanCOD());
        gh1.them(noiAS);
        gh1.them(chen);
        gh1.them(chen);
        gh1.them(chen);
        gh1.them(chen);
        gh1.them(chen);
        gh1.them(chen);
        gh1.them(dua);
        gh1.them(dua);
        gh1.them(dua);
        gh1.them(dua);
        gh1.them(dua);
        gh1.them(dua);
        gh1.indsHH();
        System.out.println("Thanh toán COD");
        System.out.println("Tiền hàng: "+gh1.tienHang());
        System.out.println("Tổng tiền phải trả: "+gh1.tongTienPhaiTra());
        
        System.out.println("\n");
        
        // Giỏ hàng 2
        GioHang gh2 = new GioHang();
        gh2.setHinhThucTT(new ThanhToanOnline());
        gh2.them(tuLanh);
        gh2.them(loNuong);
        gh2.indsHH();
        System.out.println("Thanh toán Online");
        System.out.println("Tiền hàng: "+gh2.tienHang());
        System.out.println("Tổng tiền phải trả: "+gh2.tongTienPhaiTra());
        
    }
    
}
