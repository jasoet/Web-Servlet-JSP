/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.jasoet.dao.MataKuliahDAO;
import org.jasoet.model.Dosen;
import org.jasoet.model.MataKuliah;

/**
 *
 * @author jasoet
 */
public class MataKuliahDAOImpl implements MataKuliahDAO {

    private Connection connection;

    public MataKuliahDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<MataKuliah> getAll() throws SQLException {
        String sql = "SELECT mk.mata_kuliah_id as id,mk.kode,mk.nama, "
                + " d.dosen_id,d.niy as dosen_niy,d.nama as dosen_nama "
                + " FROM mata_kuliah mk  "
                + " INNER JOIN dosen d ON (mk.dosen_id = d.dosen_id)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        List<MataKuliah> data = new ArrayList<MataKuliah>();
        while (rs.next()) {
            Dosen d = new Dosen();
            d.setId(rs.getInt("dosen_id"));
            d.setNama(rs.getString("dosen_nama"));
            d.setNiy(rs.getString("dosen_niy"));

            MataKuliah mk = new MataKuliah();
            mk.setId(rs.getInt("Id"));
            mk.setNama(rs.getString("nama"));
            mk.setKode(rs.getString("kode"));
            mk.setDosen(d);

            data.add(mk);
        }
        return data;
    }

    public List<MataKuliah> getByNama(String nama) throws SQLException {
        String sql = "SELECT mk.mata_kuliah_id as id,mk.kode,mk.nama, "
                + " d.dosen_id,d.niy as dosen_niy,d.nama as dosen_nama "
                + " FROM mata_kuliah mk  "
                + " INNER JOIN dosen d ON (mk.dosen_id = d.dosen_id)"
                + " WHERE mk.nama LIKE ? ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + nama + "%");
        ResultSet rs = ps.executeQuery();

        List<MataKuliah> data = new ArrayList<MataKuliah>();
        while (rs.next()) {
            Dosen d = new Dosen();
            d.setId(rs.getInt("dosen_id"));
            d.setNama(rs.getString("dosen_nama"));
            d.setNiy(rs.getString("dosen_niy"));

            MataKuliah mk = new MataKuliah();
            mk.setId(rs.getInt("Id"));
            mk.setNama(rs.getString("nama"));
            mk.setKode(rs.getString("kode"));
            mk.setDosen(d);

            data.add(mk);
        }
        return data;
    }

    public int insert(MataKuliah d) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int update(int id, MataKuliah newMataKuliah) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
