/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teknisi;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "orderan", catalog = "teknisiku", schema = "")
@NamedQueries({
    @NamedQuery(name = "Orderan.findAll", query = "SELECT o FROM Orderan o")
    , @NamedQuery(name = "Orderan.findByIdOrder", query = "SELECT o FROM Orderan o WHERE o.idOrder = :idOrder")
    , @NamedQuery(name = "Orderan.findByIdTeknisi", query = "SELECT o FROM Orderan o WHERE o.idTeknisi = :idTeknisi")
    , @NamedQuery(name = "Orderan.findByKode", query = "SELECT o FROM Orderan o WHERE o.kode = :kode")
    , @NamedQuery(name = "Orderan.findByNamaPelanggan", query = "SELECT o FROM Orderan o WHERE o.namaPelanggan = :namaPelanggan")
    , @NamedQuery(name = "Orderan.findByAlamat", query = "SELECT o FROM Orderan o WHERE o.alamat = :alamat")
    , @NamedQuery(name = "Orderan.findByPhone", query = "SELECT o FROM Orderan o WHERE o.phone = :phone")
    , @NamedQuery(name = "Orderan.findByNamaBarang", query = "SELECT o FROM Orderan o WHERE o.namaBarang = :namaBarang")
    , @NamedQuery(name = "Orderan.findByKeluhan", query = "SELECT o FROM Orderan o WHERE o.keluhan = :keluhan")
    , @NamedQuery(name = "Orderan.findByTglOrder", query = "SELECT o FROM Orderan o WHERE o.tglOrder = :tglOrder")})
public class Orderan implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order")
    private Integer idOrder;
    @Basic(optional = false)
    @Column(name = "id_teknisi")
    private int idTeknisi;
    @Column(name = "kode")
    private String kode;
    @Column(name = "nama_pelanggan")
    private String namaPelanggan;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "phone")
    private String phone;
    @Column(name = "nama_barang")
    private String namaBarang;
    @Column(name = "keluhan")
    private String keluhan;
    @Column(name = "tgl_order")
    @Temporal(TemporalType.DATE)
    private Date tglOrder;

    public Orderan() {
    }

    public Orderan(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Orderan(Integer idOrder, int idTeknisi) {
        this.idOrder = idOrder;
        this.idTeknisi = idTeknisi;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        Integer oldIdOrder = this.idOrder;
        this.idOrder = idOrder;
        changeSupport.firePropertyChange("idOrder", oldIdOrder, idOrder);
    }

    public int getIdTeknisi() {
        return idTeknisi;
    }

    public void setIdTeknisi(int idTeknisi) {
        int oldIdTeknisi = this.idTeknisi;
        this.idTeknisi = idTeknisi;
        changeSupport.firePropertyChange("idTeknisi", oldIdTeknisi, idTeknisi);
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        String oldKode = this.kode;
        this.kode = kode;
        changeSupport.firePropertyChange("kode", oldKode, kode);
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        String oldNamaPelanggan = this.namaPelanggan;
        this.namaPelanggan = namaPelanggan;
        changeSupport.firePropertyChange("namaPelanggan", oldNamaPelanggan, namaPelanggan);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        String oldNamaBarang = this.namaBarang;
        this.namaBarang = namaBarang;
        changeSupport.firePropertyChange("namaBarang", oldNamaBarang, namaBarang);
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        String oldKeluhan = this.keluhan;
        this.keluhan = keluhan;
        changeSupport.firePropertyChange("keluhan", oldKeluhan, keluhan);
    }

    public Date getTglOrder() {
        return tglOrder;
    }

    public void setTglOrder(Date tglOrder) {
        Date oldTglOrder = this.tglOrder;
        this.tglOrder = tglOrder;
        changeSupport.firePropertyChange("tglOrder", oldTglOrder, tglOrder);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrder != null ? idOrder.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderan)) {
            return false;
        }
        Orderan other = (Orderan) object;
        if ((this.idOrder == null && other.idOrder != null) || (this.idOrder != null && !this.idOrder.equals(other.idOrder))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "teknisi.Orderan[ idOrder=" + idOrder + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
