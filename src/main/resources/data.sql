DROP TABLE IF EXISTS publication;

CREATE TABLE publication (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  type VARCHAR(250) NOT NULL,
  title VARCHAR(250) NOT NULL,
  publicher VARCHAR(250) NOT NULL,
  annee VARCHAR(250) NOT NULL,
  URL_ISBN VARCHAR(250) NOT NULL,
  volume VARCHAR(250) DEFAULT '',
  maison_edit VARCHAR(250) DEFAULT '',
  ifact VARCHAR(250) DEFAULT '',
  Q VARCHAR(250) DEFAULT ''
);

INSERT INTO publication(type, title, publicher, annee, URL_ISBN, ifact, Q) VALUES
("zdefthry", "azefrg", "azefdsdbg", 2015, "qfdsvcgqrsd", "qfsdfvdbgtsgdf", "qesfdgbg"),
("zfgbnsdfg", "azARFBNRYJSHefrg", "RSGFHTSRDHFNYDT", 2010, "ergfhrtdb", "qrgfbnsgfxvnc", "qdgcbsgfhvcb");