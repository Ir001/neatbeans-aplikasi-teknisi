/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknisi;

import java.sql.*;

/**
 *
 * @author ASUS
 */
class session {
    private static String id_admin;
    private static String id_order;
     private static String kode;
    public static String getId(){
        return id_admin;
    }
    public static String setId(String id_admin){
        session.id_admin = id_admin;
        return null;
    }
    public static String getId_order(){
        return id_order;
    }
    public static String setId_order(String id_order){
        session.id_order = id_order;
        return null;
    }
     public static String getKode(){
        return kode;
    }
    public static String setKode(String kode){
        session.kode = kode;
        return null;
    }
    private static String[] dataOrder;
    public static String setDataOrder(String[] data){        
        session.dataOrder = data;
        return null;
    }
    public static String[] getDataOrder(){
        return session.dataOrder;
    }
    
    
}
