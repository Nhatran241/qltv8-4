/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;

import static BUS.sachBUS.getSach;
import DAO.nhanvienDAO;
import DAO.phieumuontraDAO;
import DTO.nhanvienDTO;
import DTO.phieumuontraDTO;
import DTO.sachDTO;
import interfaces.QueryCallBack;
import java.util.ArrayList;

/**
 *
 * @author cdphuc
 */
public class nhanvienBUS {

    public static ArrayList<nhanvienDTO> getNhanVien(){
        return nhanvienDAO.getNhanVien();
    }
    public static int kiemtradangnhap(String manv,String password){
        ArrayList<nhanvienDTO> arr = getNhanVien();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).getMaNV().trim().toLowerCase().equals(manv.trim().toLowerCase())){
                if(arr.get(i).getPassword().trim().equals(password.trim())){
                    
                    return arr.get(i).getRole();
                }
            }
            
        }
        return -1;
    }
    public static void themNhanVien(nhanvienDTO nv,QueryCallBack q){
        nhanvienDAO.themNhanVien(nv, q);
    }
    public static void xoaNhanVien(int manv,QueryCallBack q){
        nhanvienDAO.xoaNhanVien(manv, q);
    }
    public static void suaNhanVien(nhanvienDTO nv,QueryCallBack q){
        nhanvienDAO.suaNhanVien(nv, q);
    }
    
     public static ArrayList<nhanvienDTO> timkiemnhanvien(String key,String query){
        ArrayList<nhanvienDTO> temp=new ArrayList<>();
        ArrayList<nhanvienDTO> nv = getNhanVien();
        if(key.equals("Mã Nhân Viên")){
            for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getMaNV().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
          if(key.equals("Tên Nhân Viên")){
               for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getTenNhanVien().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
            if(key.equals("Ngày Sinh")){
                 for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getNgaysinh().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
              if(key.equals("SĐT")){
                   for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getSdt().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
                if(key.equals("Địa Chỉ")){
                     for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getDiaChi().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
            return null;
            
 
    }
   
   

}
