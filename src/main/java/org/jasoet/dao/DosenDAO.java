/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoet.dao;

import java.sql.SQLException;
import java.util.List;

import org.jasoet.model.Dosen;

/**
 * @author jasoet
 */
public interface DosenDAO {

    public Dosen getByNiy(String niy) throws SQLException;

    public List<Dosen> getAll() throws SQLException;

    public List<Dosen> getByNama(String nama) throws SQLException;

    public int insert(Dosen d) throws SQLException;

    public int delete(int id) throws SQLException;

    public int update(int id, Dosen newDosen) throws SQLException;
}
