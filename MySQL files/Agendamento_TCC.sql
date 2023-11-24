SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Agendamento_TCC
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Agendamento_TCC
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS Agendamento_TCC DEFAULT CHARACTER SET utf8mb4 ;
USE Agendamento_TCC ;

-- -----------------------------------------------------
-- Table Agendamento_TCC.Professor
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Agendamento_TCC.Professor (
  CPF VARCHAR(11) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  instituicao VARCHAR(45) NOT NULL,
  externno VARCHAR(45) NULL,
  PRIMARY KEY (CPF))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Agendamento_TCC.Alunos
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Agendamento_TCC.Alunos (
  nome VARCHAR(45) NOT NULL,
  matricula VARCHAR(45) NOT NULL,
  PRIMARY KEY (matricula))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Agendamento_TCC.Sala_Defesa
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Agendamento_TCC.Sala_Defesa (
  codigo_sala INT NOT NULL,
  nome_sala VARCHAR(45) NOT NULL,
  local VARCHAR(45) NOT NULL,
  hora time NOT NULL DEFAULT '12:00',
  reservado varchar(45) NOT NULL ,
  PRIMARY KEY (codigo_sala))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Agendamento_TCC.Agenda_Defesa
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Agendamento_TCC.Agenda_Defesa (
  codigo_agendamento INT NOT NULL AUTO_INCREMENT,
  CPF_banca2 VARCHAR(11) NOT NULL,
  CPF_banca1 VARCHAR(11) NOT NULL,
  CPF_banca3 VARCHAR(11) NOT NULL,
  CPF_banca4 VARCHAR(11) NOT NULL,
  Professor_CPF VARCHAR(11) NOT NULL,
  Sala_Defesa_codigo_sala INT NOT NULL,
  Alunos_matricula VARCHAR(45) NOT NULL,
  PRIMARY KEY (codigo_agendamento))
ENGINE = InnoDB;

CREATE INDEX fk_Agenda_Defesa_Professor_idx ON Agendamento_TCC.Agenda_Defesa (Professor_CPF ASC) VISIBLE;

CREATE INDEX fk_Agenda_Defesa_Sala_Defesa1_idx ON Agendamento_TCC.Agenda_Defesa (Sala_Defesa_codigo_sala ASC) VISIBLE;

CREATE INDEX fk_Agenda_Defesa_Alunos1_idx ON Agendamento_TCC.Agenda_Defesa (Alunos_matricula ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



/* Foi feito um alter table para alterar o formato de uma coluna
 para que fosse capaz de distinguir e conseguir rodar um update ou delete com mais segurança*/
ALTER TABLE sala_defesa
MODIFY codigo_sala INT AUTO_INCREMENT;



/* ------------- View para visualizar dpeois. -----------------  */
CREATE VIEW AgendaView AS
SELECT
    ag.codigo_agendamento AS Codigo_Agendamento,
    sd.nome_sala AS Nome_Sala,
    sd.local AS Local,
    sd.hora AS Hora,
    DATE_FORMAT(sd.data, '%d/%m/%Y') AS Data,
    p.nome AS Nome_Orientador,
    a.nome AS Nome_Aluno
FROM
    agenda_defesa ag
    JOIN sala_defesa sd ON ag.Sala_Defesa_codigo_sala = sd.codigo_sala
    JOIN professor p ON ag.Professor_CPF = p.CPF
    JOIN alunos a ON ag.Alunos_matricula = a.matricula;
