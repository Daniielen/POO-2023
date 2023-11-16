
CREATE DATABASE IF NOT EXISTS papelaria;

USE papelaria;

CREATE TABLE canetas (codigo INT AUTO_INCREMENT PRIMARY KEY, modelo VARCHAR(50), cor VARCHAR(50), ponta DECIMAL(2,1), carga INT, tampada BOOLEAN);

INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Bic', 'Verde', 1.0, 100, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Pilot', 'Azul', 0.7, 50, false);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Faber-Castell', 'Preto', 0.5, 80, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Stabilo', 'Rosa', 1.2, 20, false);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Sharpie', 'Amarelo', 0.8, 60, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Paper Mate', 'Laranja', 1.4, 40, false);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Uniball', 'Vermelho', 0.5, 70, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Pentel', 'Azul', 1.0, 90, false);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Zebra', 'Verde', 0.7, 30, true);
INSERT INTO canetas (modelo, cor, ponta, carga, tampada) VALUES ('Copic', 'Preto', 0.5, 50, false);