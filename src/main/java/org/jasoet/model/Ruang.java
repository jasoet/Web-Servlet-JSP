/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoet.model;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jasoet
 */
public class Ruang {

    private int id;
    private String nama;
    private String keterangan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
