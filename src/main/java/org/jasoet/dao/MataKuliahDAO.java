/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jasoet.dao;

import java.sql.SQLException;
import java.util.List;
import org.jasoet.model.MataKuliah;

/**
 *
 * @author jasoet
 */
public interface MataKuliahDAO {

    public List<MataKuliah> getAll() throws SQLException;

    public List<MataKuliah> getByNama(String nama) throws SQLException;

    public int insert(MataKuliah d) throws SQLException;

    public int delete(int id) throws SQLException;

    public int update(int id, MataKuliah newMataKuliah) throws SQLException;
}
