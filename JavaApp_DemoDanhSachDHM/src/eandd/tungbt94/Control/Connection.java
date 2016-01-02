/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eandd.tungbt94.Control;

import eandd.tungbt94.Model.DiemHienMau;
import eandd.tungbt94.View.Main;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Bui Thanh Tung
 */
public class Connection {

    public ArrayList<DiemHienMau> getListDiemHienMau(String url) {
        ArrayList<DiemHienMau> arrDHM = new ArrayList<DiemHienMau>();
        Document document = null;
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Element element = document.getElementById("UG_ListPosWeb");
        Elements arrElement = element.getElementsByTag("span");

        int soDiemHienMau = arrElement.size() / 5;
        int index = 0;
        for (int i = 0; i < soDiemHienMau; i++) {
            DiemHienMau dhm = new DiemHienMau(arrElement.get(index).text(), arrElement.get(index + 1).text(), arrElement.get(index + 2).text(), arrElement.get(index + 3).text(), arrElement.get(index + 4).text());
            index+=5;
            arrDHM.add(dhm);
        }
        return arrDHM;
    }

}
