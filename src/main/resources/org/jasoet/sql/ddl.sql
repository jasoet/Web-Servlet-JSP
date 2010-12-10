
DROP TABLE IF EXISTS  mata_kuliah ;
DROP TABLE IF EXISTS  dosen ;
DROP TABLE IF EXISTS  ruang ;

CREATE TABLE  dosen (
                dosen_id INT(10) AUTO_INCREMENT NOT NULL,
                niy VARCHAR(10) NOT NULL UNIQUE,
                nama VARCHAR(55) NOT NULL,
                PRIMARY KEY (dosen_id)
)Engine=InnoDB;


CREATE TABLE  mata_kuliah (
                mata_kuliah_id INT(10) AUTO_INCREMENT NOT NULL,
                kode VARCHAR(10) NOT NULL UNIQUE,
                nama VARCHAR(55) NOT NULL,
                dosen_id INT(10) NOT NULL,
                PRIMARY KEY (mata_kuliah_id)
)Engine=InnoDB;


CREATE TABLE ruang (
                ruang_id INT(10) AUTO_INCREMENT NOT NULL,
                nama VARCHAR(10) NOT NULL UNIQUE,
                keterangan VARCHAR(155) NOT NULL,
                PRIMARY KEY (ruang_id)
)Engine=InnoDB;

ALTER TABLE kuliah.mata_kuliah ADD CONSTRAINT dosen_mata_kuliah_fk
FOREIGN KEY (dosen_id)
REFERENCES kuliah.dosen (dosen_id)
ON DELETE CASCADE
ON UPDATE CASCADE;
