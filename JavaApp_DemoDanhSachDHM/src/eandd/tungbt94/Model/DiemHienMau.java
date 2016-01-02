/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eandd.tungbt94.Model;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bui Thanh Tung
 */
public class DiemHienMau implements Serializable {

    private String ngayToChuc;
    private String thoiGian;
    private String tenDiem;
    private String diaChi;
    private String tinhThanh;

    public DiemHienMau() {
    }

    public DiemHienMau(String ngayToChuc, String thoiGian, String tenDiem, String diaChi, String tinhThanh) {
        this.ngayToChuc = ngayToChuc;
        this.thoiGian = thoiGian;
        this.tenDiem = tenDiem;
        this.diaChi = diaChi;
        this.tinhThanh = tinhThanh;
    }

    public String getNgayToChuc() {
        return ngayToChuc;
    }

    public void setNgayToChuc(String ngayToChuc) {
        this.ngayToChuc = ngayToChuc;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getTenDiem() {
        return tenDiem;
    }

    public void setTenDiem(String tenDiem) {
        this.tenDiem = tenDiem;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    @Override
    public String toString() {
        String result = "";
        result += ngayToChuc + "\n";
        result += thoiGian + "\n";
        result += tenDiem + "\n";
        result += diaChi + "\n";
        result += tinhThanh + "\n";
        return result;
    }

}
