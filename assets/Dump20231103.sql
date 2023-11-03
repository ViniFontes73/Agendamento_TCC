CREATE DATABASE  IF NOT EXISTS `agendamento_tcc` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `agendamento_tcc`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: agendamento_tcc
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agenda_defesa`
--

DROP TABLE IF EXISTS `agenda_defesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agenda_defesa` (
  `codigo_agendamento` int NOT NULL AUTO_INCREMENT,
  `CPF_banca2` varchar(11) NOT NULL,
  `CPF_banca1` varchar(11) NOT NULL,
  `CPF_banca3` varchar(11) NOT NULL,
  `CPF_banca4` varchar(11) NOT NULL,
  `Professor_CPF` varchar(11) NOT NULL,
  `Sala_Defesa_codigo_sala` int NOT NULL,
  `Alunos_matricula` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_agendamento`),
  KEY `fk_Agenda_Defesa_Professor_idx` (`Professor_CPF`),
  KEY `fk_Agenda_Defesa_Sala_Defesa1_idx` (`Sala_Defesa_codigo_sala`),
  KEY `fk_Agenda_Defesa_Alunos1_idx` (`Alunos_matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenda_defesa`
--

LOCK TABLES `agenda_defesa` WRITE;
/*!40000 ALTER TABLE `agenda_defesa` DISABLE KEYS */;
/*!40000 ALTER TABLE `agenda_defesa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alunos`
--

DROP TABLE IF EXISTS `alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alunos` (
  `nome` varchar(45) NOT NULL,
  `matricula` varchar(45) NOT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alunos`
--

LOCK TABLES `alunos` WRITE;
/*!40000 ALTER TABLE `alunos` DISABLE KEYS */;
/*!40000 ALTER TABLE `alunos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `CPF` varchar(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `instituicao` varchar(45) NOT NULL,
  `externno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CPF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sala_defesa`
--

DROP TABLE IF EXISTS `sala_defesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sala_defesa` (
  `codigo_sala` int NOT NULL,
  `nome_sala` varchar(45) NOT NULL,
  `local` varchar(45) NOT NULL,
  `hora` time NOT NULL DEFAULT '12:00:00',
  `reservado` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo_sala`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sala_defesa`
--

LOCK TABLES `sala_defesa` WRITE;
/*!40000 ALTER TABLE `sala_defesa` DISABLE KEYS */;
/*!40000 ALTER TABLE `sala_defesa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'agendamento_tcc'
--

--
-- Dumping routines for database 'agendamento_tcc'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-03 20:15:32
