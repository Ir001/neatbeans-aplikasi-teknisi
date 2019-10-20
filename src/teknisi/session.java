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
   
    // ID Admin
    private static String id_admin;
    public static String getId(){
        return id_admin;
    }
    public static String setId(String id_admin){
        session.id_admin = id_admin;
        return null;
    }
    
    //ID Order
        private static String id_order;

    public static String getId_order(){
        return id_order;
    }
    public static String setId_order(String id_order){
        session.id_order = id_order;
        return null;
    }
    //Kode Nota
    private static String kode;

    public static String getKode(){
        return kode;
    }
    public static String setKode(String kode){
        session.kode = kode;
        return null;
    }
    //ID Reparasi
    private static String id_reparasi;
    public static String setId_reparasi(String id_reparasi){
        session.id_reparasi = id_reparasi;
        return null;
    }
    public static String getId_reparasi(){
        return id_reparasi;
    }
    //Nama Pelanggan
    private static String nama_pelanggan;
    public static String set_nama_pelanggan(String nama_pelanggan){
        session.nama_pelanggan = nama_pelanggan;
        return null;
    }
    public static String get_nama_pelanggan(){
        return nama_pelanggan;
    }
    //Nama Teknisi
    private static String nama_teknisi;
    public static String set_nama_teknisi(String nama_teknisi){
        session.nama_teknisi = nama_teknisi;
        return null;
    }
    public static String get_nama_teknisi(){
        return nama_teknisi;
    }
    //Keluhan
    private static String keluhan;
    public static String set_keluhan(String keluhan){
        session.keluhan = keluhan;
        return null;
    }
    public static String get_keluhan(){
        return keluhan;
    }
    //Nama Barang
    private static String nama_barang;
    public static String set_nama_barang(String nama_barang){
        session.nama_barang = nama_barang;
        return null;
    }
    public static String get_nama_barang(){
        return nama_barang;
    }
    //Nama Jasa
    private static String jasa;
    public static String set_jasa(String jasa){
        session.jasa = jasa;
        return null;
    }
    public static String get_jasa(){
        return jasa;
    }
    //Harga Jasa
    private static int harga_jasa;
    public static int set_harga_jasa(int harga_jasa){
        session.harga_jasa = harga_jasa;
        return 0;
    }
    public static int get_harga_jasa(){
        return harga_jasa;
    }
    //Nama Part
    private static String part;
    public static String set_part(String part){
        session.part = part;
        return null;
    }
    public static String get_part(){
        return part;
    }
    //Harga Part
    private static int harga_part;
    public static int set_harga_part(int harga_part){
        session.harga_part = harga_part;
        return 0;
    }
    public static int get_harga_part(){
        return harga_part;
    }
    //Total Tagihan
    private static int total;
     public static int set_total(int total){
        session.total = total;
        return 0;
    }
    public static int get_total(){
        return total;
    }
    //Total Bayar
    private static int bayar;
    public static int set_bayar(int bayar){
        session.bayar = bayar;
        return 0;
    }
    public static int get_bayar(){
        return bayar;
    }
    //Total Kembalian
    private static int kembalian;
    public static int set_kembalian(int kembalian){
        session.kembalian = kembalian;
        return 0;
    }
    public static int get_kembalian(){
        return kembalian;
    }
    
    //
    private static String id_part;
    public static String set_id_part(String id){
        session.id_part = id;
        return null;
    }
    public static String get_id_part(){
        return id_part;
    }
    private static String id_jasa;
    public static String set_id_jasa(String id){
        session.id_jasa = id;
        return null;
    }
    public static String get_id_jasa(){
        return id_jasa;
    }
    
    
    
    
}
