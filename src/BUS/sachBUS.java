/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;

import DAO.sachDAO;
import DTO.nhanvienDTO;
import DTO.sachDTO;
import interfaces.QueryCallBack;
import java.util.ArrayList;

/**
 *
 * @author cdphuc
 */
public class sachBUS {

    public static ArrayList<sachDTO> getSach(){
        return sachDAO.getSach();
    }
    public static void themSach(sachDTO s,QueryCallBack q){
        sachDAO.themSach(s,q);
    }
    public static void xoaSach(String masach,QueryCallBack q){
        sachDAO.xoaSach(masach,q);
    }
    public static void suaSach(sachDTO s,QueryCallBack q){
        sachDAO.suaSach(s,q);
    }
    public static ArrayList<sachDTO> timkiemSach(String key,String query){
        ArrayList<sachDTO> temp=new ArrayList<>();
        ArrayList<sachDTO> nv = getSach();
        if(key.equals("Mã Sách")){
            for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getMaSach().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
          if(key.equals("Tên Sách")){
               for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getTenSach().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
            if(key.equals("Tên Tác Giả")){
                 for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getTenTacGia().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
              if(key.equals("Thể Loại")){
                   for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getTheLoai().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
                if(key.equals("Nhà Xuất Bản")){
                     for (int i = 0; i < nv.size(); i++) {
                if(nv.get(i).getNhaXuatBan().toLowerCase().contains(query)){
                    temp.add(nv.get(i));
                }
                
            }
            return temp;
        }
            return null;
            
 
    }
   

}
