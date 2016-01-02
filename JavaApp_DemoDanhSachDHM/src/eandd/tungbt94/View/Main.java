/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eandd.tungbt94.View;

import eandd.tungbt94.Control.DHMCtr;


/**
 *
 * @author Bui Thanh Tung
 */
public class Main {
    public static void main(String[] args) {
        String url = "http://www.hienmau.vn/DonateBloodWeb/BloodBank/Event/ListPosWebsite.aspx";
        DHMCtr control = new DHMCtr(url);
        control.showListDiemHienMau();
    }
}
