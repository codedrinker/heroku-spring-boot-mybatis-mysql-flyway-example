CREATE TABLE authorization
(
  id INT(10) unsigned PRIMARY KEY NOT NULL,
  token CHAR(40) NOT NULL,
  utime INT(10) unsigned DEFAULT '0' NOT NULL,
  ctime INT(10) unsigned DEFAULT '0' NOT NULL,
  status TINYINT(1) DEFAULT '1' NOT NULL,
  website VARCHAR(50) NOT NULL
);