/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.docgiaDTO;
import DTO.phieumuontraDTO;
import interfaces.QueryCallBack;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import untils.MysqlDataAccessHelper;

/**
 *
 * @author Administrator
 */
public class docgiaDAO {
    public static ArrayList<docgiaDTO> getDocGia(){

        ArrayList<docgiaDTO> arr = new ArrayList<docgiaDTO>();
        String sql = "select * from docgia";
        MysqlDataAccessHelper my = new MysqlDataAccessHelper();
      
        try {
            ResultSet rs = my.excuteQuery(sql);
            while(rs.next()){
                docgiaDTO dg=new docgiaDTO();
                dg.setMaDocGia(rs.getString("madocgia"));
                dg.setTenDocGia(rs.getString("tendocgia"));
                dg.setDiaChi(rs.getString("diachi"));
                dg.setSdt(rs.getString("sdt"));
                dg.setSoThe(rs.getString("sothe"));
                dg.setNgayCap(rs.getString("ngaycap"));
                dg.setGhiChu(rs.getString("ghichu"));
                arr.add(dg);
            }
        } catch (SQLException ex) {
            my.displayError(ex);
        } finally{
            my.close();
        }
        return arr;
    }

    public static void themDocGia(docgiaDTO dg,QueryCallBack q) {
           // create the mysql insert preparedstatement
           ArrayList<docgiaDTO> arr =getDocGia();
           for (int i = 0; i < arr.size(); i++) {
               if(arr.get(i).getMaDocGia().equals(dg.getMaDocGia())){
                   q.onFailed("Mã đọc giả đã tồn tại");
                   return;
               }
        }
      String sql = "insert into docgia (madocgia,tendocgia,diachi,sdt,sothe,ngaycap,ghichu) values (?, ?, ?, ?, ?,?,?)";
      MysqlDataAccessHelper my = new MysqlDataAccessHelper();
      PreparedStatement preparedStmt;
        try {
            preparedStmt = my.conn.prepareStatement(sql);
            preparedStmt.setString(1,dg.getMaDocGia());
            preparedStmt.setString(2,dg.getTenDocGia());
            preparedStmt.setString(3,dg.getDiaChi());
            preparedStmt.setString(4,dg.getSdt());
            preparedStmt.setString(5,dg.getSoThe());
            preparedStmt.setString(6,dg.getNgayCap());
            preparedStmt.setString(7,dg.getGhiChu());
            preparedStmt.execute();
            q.onSuccess();
        } catch (SQLException ex) {
            my.displayError(ex);
            q.onFailed(ex.toString());
        }finally{
            my.close();
        }

    }
     public static void xoaDocGia(String madocgia,QueryCallBack q) {
           // create the mysql insert preparedstatement
      String query = "delete from sach where madocgia=?";
      MysqlDataAccessHelper my = new MysqlDataAccessHelper();
      PreparedStatement preparedStmt;
       try {
            preparedStmt = my.conn.prepareStatement(query);
            preparedStmt.setString(1,madocgia);
            preparedStmt.execute();
            q.onSuccess();
        } catch (SQLException ex) {
            my.displayError(ex);
            q.onFailed(ex.toString());
        }finally{
            my.close();
        }
    }
       public static void suaDocGia(docgiaDTO dg,QueryCallBack q) {
           // create the mysql insert preparedstatement
      String query = "UPDATE sach SET tendocgia = ?, diachi = ?, sdt = ?, sothe = ?, ngaycap = ?,ghichu = ? WHERE madocgia = ?";
  
      MysqlDataAccessHelper my = new MysqlDataAccessHelper();
      PreparedStatement preparedStmt;
       try {
            preparedStmt = my.conn.prepareStatement(query);
            preparedStmt.setString(1,dg.getMaDocGia());
            preparedStmt.setString(2,dg.getTenDocGia());
            preparedStmt.setString(3,dg.getDiaChi());
            preparedStmt.setString(4,dg.getSdt());
            preparedStmt.setString(5,dg.getSoThe());
            preparedStmt.setString(6,dg.getNgayCap());
            preparedStmt.setString(7,dg.getGhiChu());
            preparedStmt.execute();
            q.onSuccess();
        } catch (SQLException ex) {
            my.displayError(ex);
            q.onFailed(ex.toString());
        }finally{
            my.close();
        }
    }
}
