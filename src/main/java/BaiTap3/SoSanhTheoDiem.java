/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Cao's Laptop
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>    {

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if (o1.diemTB > o2.diemTB) {
            return 1;
        }
        if (o1.diemTB < o2.diemTB) {
            return -1;
        }
        return 0;
    }
}
