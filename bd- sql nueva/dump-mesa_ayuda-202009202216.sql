-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: mesa_ayuda
-- ------------------------------------------------------
-- Server version	5.5.5-10.5.5-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `configuracion_tipocaso`
--

DROP TABLE IF EXISTS `configuracion_tipocaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuracion_tipocaso` (
  `OIDConfiguracionTipoCaso` varchar(100) NOT NULL,
  `nroConfig` int(11) NOT NULL,
  `fechaInicioVigencia` date DEFAULT NULL,
  `fechaFinVigencia` date DEFAULT NULL,
  `fechaVerificacion` date DEFAULT NULL,
  `OIDTipoCaso` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDConfiguracionTipoCaso`),
  KEY `configuracion_tipocaso_FK` (`OIDTipoCaso`),
  CONSTRAINT `configuracion_tipocaso_FK` FOREIGN KEY (`OIDTipoCaso`) REFERENCES `tipocaso` (`OIDTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `configuracion_tipocaso`
--

LOCK TABLES `configuracion_tipocaso` WRITE;
/*!40000 ALTER TABLE `configuracion_tipocaso` DISABLE KEYS */;
INSERT INTO `configuracion_tipocaso` VALUES ('08723f33-1f06-48e0-9888-7d692735355b',789,NULL,NULL,NULL,'949619b9-f535-4f0b-8a49-7ee22e4d2b70'),('81f1b1e9-0a5c-47fc-ac0d-0393d4a43562',789,NULL,NULL,NULL,'dcd43e63-ea8e-46d0-b327-a56a5e17ef31'),('e7feb82a-97bd-4128-a58b-fa503eb1b3d1',789,NULL,NULL,NULL,'befee8b4-d482-4630-8d1b-016ee774523a'),('ed4199b6-d4e5-4ee8-9111-74d87914f412',7,NULL,NULL,NULL,'04dd8fa8-3d2e-4bff-ae4a-5358bd13f1f7'),('ff654c7a-cc11-4584-a477-ed147673de75',789,NULL,NULL,NULL,'dd1cfee7-0736-4907-9127-8eee466b6a39');
/*!40000 ALTER TABLE `configuracion_tipocaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sector`
--

DROP TABLE IF EXISTS `sector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sector` (
  `OIDSector` varchar(100) NOT NULL,
  `codSector` int(11) NOT NULL,
  `nombreSector` varchar(100) NOT NULL,
  `descripcionSector` varchar(100) DEFAULT NULL,
  `fechaHoraFinVigenciaSector` date DEFAULT NULL,
  PRIMARY KEY (`OIDSector`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sector`
--

LOCK TABLES `sector` WRITE;
/*!40000 ALTER TABLE `sector` DISABLE KEYS */;
INSERT INTO `sector` VALUES ('251ae668-aa3e-418e-a1a5-6d2896e3202f',98,'software',NULL,NULL),('4b415680-20cc-474d-9424-4b78ae18ba87',98,'444',NULL,NULL),('548c788e-6f71-43eb-852d-82fe7fe46023',98,'software',NULL,NULL),('63a5520b-fe3a-4dfd-9228-1af440ffcb6f',98,'software',NULL,NULL),('7e667381-46d6-4967-97e9-b4463d727914',98,'software',NULL,NULL),('8c168aca-52ff-4ac9-ad77-4f790cb877c8',98,'software',NULL,NULL),('9c2ec909-8830-4fd6-bce9-742953aec997',98,'software',NULL,NULL),('b99f7568-8e2f-42ba-90c6-6085e65f512c',98,'software',NULL,NULL),('c0ceaca2-5340-4e5b-ad25-b4eee6605640',98,'software',NULL,NULL),('d2f7819a-7675-423c-8698-6159ef388eba',98,'software',NULL,NULL),('ee9cf75a-4f9b-4a6a-9585-a19dc5028f9a',98,'software',NULL,NULL);
/*!40000 ALTER TABLE `sector` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipocaso`
--

DROP TABLE IF EXISTS `tipocaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipocaso` (
  `OIDTipoCaso` varchar(100) NOT NULL,
  `codTipoCaso` int(11) NOT NULL,
  `nombreTipoCaso` varchar(100) NOT NULL,
  `fechaFinVigenciaTipoCaso` date DEFAULT NULL,
  PRIMARY KEY (`OIDTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipocaso`
--

LOCK TABLES `tipocaso` WRITE;
/*!40000 ALTER TABLE `tipocaso` DISABLE KEYS */;
INSERT INTO `tipocaso` VALUES ('04dd8fa8-3d2e-4bff-ae4a-5358bd13f1f7',777,'Falla',NULL),('949619b9-f535-4f0b-8a49-7ee22e4d2b70',777,'Falla',NULL),('9c25facc-c3da-4d0d-8253-5988f7e74245',777,'Falla',NULL),('befee8b4-d482-4630-8d1b-016ee774523a',777,'Falla',NULL),('dcd43e63-ea8e-46d0-b327-a56a5e17ef31',777,'Falla',NULL),('dd1cfee7-0736-4907-9127-8eee466b6a39',777,'Falla',NULL);
/*!40000 ALTER TABLE `tipocaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipocaso_tipoinstancia`
--

DROP TABLE IF EXISTS `tipocaso_tipoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipocaso_tipoinstancia` (
  `OIDTipoCasoTipoInstancia` varchar(100) NOT NULL,
  `minutosMaximoResolucion` int(11) DEFAULT NULL,
  `ordenTipoCasoTipoInstancia` int(11) DEFAULT NULL,
  `OIDTipoInstancia` varchar(100) NOT NULL,
  `OIDConfiguracionTipoCaso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`OIDTipoCasoTipoInstancia`),
  KEY `tipocaso_tipoinstacia_FK` (`OIDTipoInstancia`),
  KEY `tipocaso_tipoinstancia_FK` (`OIDConfiguracionTipoCaso`),
  CONSTRAINT `tipocaso_tipoinstacia_FK` FOREIGN KEY (`OIDTipoInstancia`) REFERENCES `tipoinstancia` (`OIDTipoInstancia`),
  CONSTRAINT `tipocaso_tipoinstancia_FK` FOREIGN KEY (`OIDConfiguracionTipoCaso`) REFERENCES `configuracion_tipocaso` (`OIDConfiguracionTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipocaso_tipoinstancia`
--

LOCK TABLES `tipocaso_tipoinstancia` WRITE;
/*!40000 ALTER TABLE `tipocaso_tipoinstancia` DISABLE KEYS */;
INSERT INTO `tipocaso_tipoinstancia` VALUES ('15a88194-a189-4da6-af10-b5921ead0b91',0,5555,'facec86b-350f-40ea-9c81-7e03c8cb823f',NULL),('2bf2cf68-3731-4da6-9a9a-149c6c273451',0,5555,'4e4ffdcf-1ade-4b7f-944e-016c6d110bd7','e7feb82a-97bd-4128-a58b-fa503eb1b3d1'),('ca2bd68a-8a04-4637-a009-be2d1edb8dee',0,5555,'12dd521a-04a3-45f8-9cfe-eb98c3162249','81f1b1e9-0a5c-47fc-ac0d-0393d4a43562'),('fddf9923-a579-4111-b55a-b6b4fa7c59c0',0,55,'c4974cc0-1d14-47fa-961f-e78b2a0ba65e','ed4199b6-d4e5-4ee8-9111-74d87914f412');
/*!40000 ALTER TABLE `tipocaso_tipoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoinstancia`
--

DROP TABLE IF EXISTS `tipoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoinstancia` (
  `OIDTipoInstancia` varchar(100) NOT NULL,
  `codTipoInstancia` int(11) NOT NULL,
  `nombreTipoInstancia` varchar(100) DEFAULT NULL,
  `fechaHoraFinVigenciaTipoInstancia` date DEFAULT NULL,
  `OIDSector` varchar(100) NOT NULL,
  `OIDTipoTarea` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDTipoInstancia`),
  KEY `tipoinstancia_FK` (`OIDSector`),
  KEY `tipoinstancia_FK_1` (`OIDTipoTarea`),
  CONSTRAINT `tipoinstancia_FK` FOREIGN KEY (`OIDSector`) REFERENCES `sector` (`OIDSector`),
  CONSTRAINT `tipoinstancia_FK_1` FOREIGN KEY (`OIDTipoTarea`) REFERENCES `tipotarea` (`OIDTipoTarea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoinstancia`
--

LOCK TABLES `tipoinstancia` WRITE;
/*!40000 ALTER TABLE `tipoinstancia` DISABLE KEYS */;
INSERT INTO `tipoinstancia` VALUES ('12dd521a-04a3-45f8-9cfe-eb98c3162249',999,'prueba',NULL,'ee9cf75a-4f9b-4a6a-9585-a19dc5028f9a','6665102b-4200-4ab9-a0b6-49f76e7534a8'),('33b93b9d-58db-4bfe-9483-b0bd8043301c',999,'prueba',NULL,'63a5520b-fe3a-4dfd-9228-1af440ffcb6f','d9668a24-1996-477f-81ab-bd10881ecc43'),('4e4ffdcf-1ade-4b7f-944e-016c6d110bd7',999,'prueba',NULL,'8c168aca-52ff-4ac9-ad77-4f790cb877c8','127eca05-a940-4865-8cdb-98666daff851'),('6ccc2a19-fe33-481e-b8ab-c2ee489d654b',999,'prueba',NULL,'251ae668-aa3e-418e-a1a5-6d2896e3202f','650f6b2d-7078-4c72-8be6-0f533d22e7cb'),('99afdbed-55af-4dc9-a5e4-4ff5f72873fe',999,'prueba',NULL,'9c2ec909-8830-4fd6-bce9-742953aec997','f850b89b-cb05-440a-8edc-6495539ce3ea'),('c4974cc0-1d14-47fa-961f-e78b2a0ba65e',999,'prueba',NULL,'c0ceaca2-5340-4e5b-ad25-b4eee6605640','374b8d11-224c-4890-99b0-1011028d510d'),('dd99e0a1-2e8f-4624-9e63-e9fae73f1393',999,'prueba',NULL,'b99f7568-8e2f-42ba-90c6-6085e65f512c','111bc6d6-3256-4473-9179-a2790faa8bfc'),('facec86b-350f-40ea-9c81-7e03c8cb823f',999,'prueba',NULL,'548c788e-6f71-43eb-852d-82fe7fe46023','4ce74d72-9f3b-4a59-a9f7-2be830e57f1f');
/*!40000 ALTER TABLE `tipoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipotarea`
--

DROP TABLE IF EXISTS `tipotarea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipotarea` (
  `OIDTipoTarea` varchar(100) NOT NULL,
  `codTipoTarea` int(11) NOT NULL,
  `nombreTipoTarea` varchar(100) NOT NULL,
  `descripcionTipoTarea` varchar(100) DEFAULT NULL,
  `fechaFinVigenciaTipoTarea` date DEFAULT NULL,
  `fechaHoraFinVigenciaTipoTarea` date DEFAULT NULL,
  PRIMARY KEY (`OIDTipoTarea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipotarea`
--

LOCK TABLES `tipotarea` WRITE;
/*!40000 ALTER TABLE `tipotarea` DISABLE KEYS */;
INSERT INTO `tipotarea` VALUES ('111bc6d6-3256-4473-9179-a2790faa8bfc',44,'Alquilar',NULL,NULL,NULL),('127eca05-a940-4865-8cdb-98666daff851',44,'Alquilar',NULL,NULL,NULL),('374b8d11-224c-4890-99b0-1011028d510d',44,'Alquilar',NULL,NULL,NULL),('4ce74d72-9f3b-4a59-a9f7-2be830e57f1f',44,'Alquilar',NULL,NULL,NULL),('5822cf3c-3cf8-48fd-a790-00050dc752eb',44,'Alquilar',NULL,NULL,NULL),('650f6b2d-7078-4c72-8be6-0f533d22e7cb',44,'Alquilar',NULL,NULL,NULL),('6665102b-4200-4ab9-a0b6-49f76e7534a8',44,'Alquilar',NULL,NULL,NULL),('d9668a24-1996-477f-81ab-bd10881ecc43',44,'Alquilar',NULL,NULL,NULL),('f850b89b-cb05-440a-8edc-6495539ce3ea',44,'Alquilar',NULL,NULL,NULL);
/*!40000 ALTER TABLE `tipotarea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'mesa_ayuda'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-09-20 22:16:29
