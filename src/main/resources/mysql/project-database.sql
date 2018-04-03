CREATE DATABASE spring_boot;

USE spring_boot;

CREATE TABLE user(
  id         INT AUTO_INCREMENT PRIMARY KEY,
  name       VARCHAR(100) NULL,
  last_name  VARCHAR(100) NULL,
  birth_date DATETIME     NULL
);

INSERT INTO user VALUES (null, 'Ricardo', 'Damasceno', '1988-03-17 09:30:00');
INSERT INTO user VALUES (null, 'Sara', 'Damasceno', '1992-04-08 09:30:00');
INSERT INTO user VALUES (null, 'Alexandre', 'Damasceno', '2016-04-12 09:30:00');