/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eandd.tungbt94.Control;

import eandd.tungbt94.Model.DiemHienMau;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Bui Thanh Tung
 */
public class DHMCtr {
    private Connection connection;
    private ArrayList<DiemHienMau> arrDHM = new ArrayList<DiemHienMau>();
    
    public DHMCtr(String url) {
        connection = new Connection();
        arrDHM = connection.getListDiemHienMau(url);
    }
    
    public void showListDiemHienMau(){
        for(DiemHienMau dhm: arrDHM){
            System.out.println(dhm.toString()+"----------------------------------------------------------------------");
        }
    }

    public ArrayList<DiemHienMau> getArrDHM() {
        return arrDHM;
    }

}
