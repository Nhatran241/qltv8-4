/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.docgiaDAO;
import DAO.phieumuontraDAO;
import DTO.docgiaDTO;
import DTO.phieumuontraDTO;
import interfaces.QueryCallBack;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class docgiaBUS {
     public static ArrayList<docgiaDTO> getDocGia(){
        return docgiaDAO.getDocGia();
    }
    public static void themDocGia(docgiaDTO dg,QueryCallBack q){
        docgiaDAO.themDocGia(dg, q);
    }
    public static void xoaDocGia(String madocgia,QueryCallBack q){
        docgiaDAO.xoaDocGia(madocgia, q);
    }
    public static void suaDocGia(docgiaDTO dg,QueryCallBack q){
        docgiaDAO.suaDocGia(dg, q);
    }
    public static ArrayList<docgiaDTO> timkiemDocGia(String key,String query){
        ArrayList<docgiaDTO> temp=new ArrayList<>();
        ArrayList<docgiaDTO> nv = getDocGia();
        if(key.equals("Mã Đọc Giả")){
            for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getMaDocGia().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
          if(key.equals("Tên Đọc Giả")){
               for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getTenDocGia().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
            if(key.equals("Địa Chỉ")){
                 for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getDiaChi().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
              if(key.equals("Sđt")){
                   for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getSdt().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
                if(key.equals("Số Thẻ")){
                     for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getSoThe().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
                 if(key.equals("Ngày Cấp")){
                     for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getNgayCap().contains(query)){
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
