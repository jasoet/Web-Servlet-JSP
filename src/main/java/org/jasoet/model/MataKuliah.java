/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoet.model;

/**
 *
 * @author jasoet
 */
public class MataKuliah {

    private int id;
    private String kode;
    private String nama;
    private Dosen dosen;

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
