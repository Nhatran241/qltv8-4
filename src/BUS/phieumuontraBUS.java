/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.phieumuontraDAO;
import DTO.phieumuontraDTO;
import interfaces.QueryCallBack;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class phieumuontraBUS {
    public static ArrayList<phieumuontraDTO> getPhieuMuonTra(){
        return phieumuontraDAO.getPhieuMuonTra();
    }
    public static void themPhieuMuonTra(phieumuontraDTO pmt,QueryCallBack q){
        phieumuontraDAO.themPhieuMuonTra(pmt, q);
    }
    public static void xoaPhieuMuonTra(String mamuontra,QueryCallBack q){
        phieumuontraDAO.xoaPhieuMuonTra(mamuontra, q);
    }
    public static void suaPhieuMuonTra(phieumuontraDTO pmt,QueryCallBack q){
        phieumuontraDAO.suaPhieuMuonTra(pmt, q);
    }
    public static ArrayList<phieumuontraDTO> timkiemPhieuMuonTra(String key,String query){
        ArrayList<phieumuontraDTO> temp=new ArrayList<>();
        ArrayList<phieumuontraDTO> nv = getPhieuMuonTra();
        if(key.equals("Mã Mượn Trả")){
            for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getMaMuonTra().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
          if(key.equals("Mã Đọc Giả")){
               for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getMaDocGia().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
            if(key.equals("Mã Nhân Viên")){
                 for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getMaNhanVien().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
              if(key.equals("Ngày Mượn")){
                   for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getNgayMuon().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
                if(key.equals("Ngày Trả")){
                     for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getNgayTra().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
                if(key.equals("Ghi Chú")){
                     for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getGhiChu().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
            return null;
            
 
    }
   

}
