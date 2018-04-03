CREATE DATABASE spring_boot;

USE spring_boot;

CREATE TABLE user(
  id         INT AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(100) NULL,
  last_name  VARCHAR(100) NULL,
  birth_date DATETIME     NULL
);

INSERT INTO user VALUES (null, 'Hurin', 'Thalion', '1988-03-17 09:30:00');
INSERT INTO user VALUES (null, 'Turin', 'Turambar', '1992-04-08 09:30:00');
INSERT INTO user VALUES (null, 'Arwen', 'Undomiel', '2016-04-12 09:30:00');