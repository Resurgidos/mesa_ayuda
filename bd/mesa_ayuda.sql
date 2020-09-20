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
-- Table structure for table `caso`
--

DROP TABLE IF EXISTS `caso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caso` (
  `OIDCaso` varchar(100) NOT NULL ,
  `numeroCaso` int(11) NOT NULL,
  `fechaHoraFinCaso` date DEFAULT NULL,
  `fechaHoraIngresoCaso` date DEFAULT NULL,
  `fechaHoraCaducidadCaso` date DEFAULT NULL,
  `observacionesCaso` varchar(100) DEFAULT NULL,
  `OIDTipoCaso` varchar(100) NOT NULL,
  `OIDEstadoCaso` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDCaso`),
  KEY `caso_FK_1` (`OIDTipoCaso`),
  KEY `caso_FK` (`OIDEstadoCaso`),
  CONSTRAINT `caso_FK` FOREIGN KEY (`OIDEstadoCaso`) REFERENCES `estadocaso` (`OIDEstadoCaso`),
  CONSTRAINT `caso_FK_1` FOREIGN KEY (`OIDTipoCaso`) REFERENCES `tipocaso` (`OIDTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caso`
--

LOCK TABLES `caso` WRITE;
/*!40000 ALTER TABLE `caso` DISABLE KEYS */;
/*!40000 ALTER TABLE `caso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `casoinstancia`
--

DROP TABLE IF EXISTS `casoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `casoinstancia` (
  `OIDCasoInstancia` varchar(100) NOT NULL ,
  `fechaHoraInicioPlanificada` date DEFAULT NULL,
  `fechaHoraFinPlanificada` date DEFAULT NULL,
  `fechaHoraInicioReal` date DEFAULT NULL,
  `fechaHoraFinReal` date DEFAULT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  `ordenCasoInstancia` varchar(100) DEFAULT NULL,
  `OIDCaso` varchar(100) NOT NULL,
  `OIDTipoInstancia` varchar(100) NOT NULL,
  `OIDEstadoCasoInstancia` varchar(100) NOT NULL,
  `OIDEspecialista` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDCasoInstancia`),
  KEY `casoinstacia_FK` (`OIDCaso`),
  KEY `casoinstacia_FK_1` (`OIDTipoInstancia`),
  KEY `casoinstacia_FK_2` (`OIDEstadoCasoInstancia`),
  KEY `casoinstacia_FK_3` (`OIDEspecialista`),
  CONSTRAINT `casoinstacia_FK` FOREIGN KEY (`OIDCaso`) REFERENCES `caso` (`OIDCaso`),
  CONSTRAINT `casoinstacia_FK_1` FOREIGN KEY (`OIDTipoInstancia`) REFERENCES `tipoinstancia` (`OIDTipoInstancia`),
  CONSTRAINT `casoinstacia_FK_3` FOREIGN KEY (`OIDEspecialista`) REFERENCES `especialista` (`OIDEspecialista`),
  CONSTRAINT `casoinstancia_FK` FOREIGN KEY (`OIDEstadoCasoInstancia`) REFERENCES `estadocasoinstancia` (`OIDEstadoCasoInstancia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `casoinstancia`
--

LOCK TABLES `casoinstancia` WRITE;
/*!40000 ALTER TABLE `casoinstancia` DISABLE KEYS */;
/*!40000 ALTER TABLE `casoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `casoinstanciatarea`
--

DROP TABLE IF EXISTS `casoinstanciatarea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `casoinstanciatarea` (
  `OIDCasoInstanciaTarea` varchar(100) NOT NULL ,
  `fechaHoraFinCasoInstanciaTarea` date DEFAULT NULL,
  `fechaHoraInicioCasoInstanciaTarea` date DEFAULT NULL,
  `OIDTipoTarea` varchar(100) NOT NULL,
  `OIDCasoInstancia` varchar(100) NOT NULL,
  `observacionesCasoInstanciaTarea` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`OIDCasoInstanciaTarea`),
  KEY `casoinstanciatarea_FK` (`OIDTipoTarea`),
  KEY `casoinstanciatarea_FK_1` (`OIDCasoInstancia`),
  CONSTRAINT `casoinstanciatarea_FK` FOREIGN KEY (`OIDTipoTarea`) REFERENCES `tipotarea` (`OIDTipoTarea`),
  CONSTRAINT `casoinstanciatarea_FK_1` FOREIGN KEY (`OIDCasoInstancia`) REFERENCES `casoinstancia` (`OIDCasoInstancia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `casoinstanciatarea`
--

LOCK TABLES `casoinstanciatarea` WRITE;
/*!40000 ALTER TABLE `casoinstanciatarea` DISABLE KEYS */;
/*!40000 ALTER TABLE `casoinstanciatarea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `configuracion_tipocaso`
--

DROP TABLE IF EXISTS `configuracion_tipocaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `configuracion_tipocaso` (
  `OIDConfiguracionTipoCaso` varchar(100) NOT NULL ,
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
/*!40000 ALTER TABLE `configuracion_tipocaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialista`
--

DROP TABLE IF EXISTS `especialista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especialista` (
  `OIDEspecialista` varchar(100) NOT NULL,
  `nroLegajoEspecialista` int(11) NOT NULL,
  `cuitEspecialista` int(11) DEFAULT NULL,
  `nombreApellidoEspecialista` varchar(100) DEFAULT NULL,
  `fechaHoraFinVigenciaEspecialista` date DEFAULT NULL,
  `OIDSector` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDEspecialista`),
  KEY `especialista_FK` (`OIDSector`),
  CONSTRAINT `especialista_FK` FOREIGN KEY (`OIDSector`) REFERENCES `sector` (`OIDSector`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialista`
--

LOCK TABLES `especialista` WRITE;
/*!40000 ALTER TABLE `especialista` DISABLE KEYS */;
/*!40000 ALTER TABLE `especialista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadocaso`
--

DROP TABLE IF EXISTS `estadocaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadocaso` (
  `OIDEstadoCaso` varchar(100) NOT NULL ,
  `codEstadoCaso` int(11) NOT NULL,
  `nombreEstadoCaso` varchar(100) NOT NULL,
  `fechaHoraFinVigenciaEC` date DEFAULT NULL,
  PRIMARY KEY (`OIDEstadoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadocaso`
--

LOCK TABLES `estadocaso` WRITE;
/*!40000 ALTER TABLE `estadocaso` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadocaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadocasoinstancia`
--

DROP TABLE IF EXISTS `estadocasoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadocasoinstancia` (
  `OIDEstadoCasoInstancia` varchar(100) NOT NULL ,
  `codEstadoCasoInstancia` int(11) NOT NULL,
  `nombreEstadoCasoInstancia` varchar(100) DEFAULT NULL,
  `fechaHoraFinVigenciaECI` date DEFAULT NULL,
  PRIMARY KEY (`OIDEstadoCasoInstancia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadocasoinstancia`
--

LOCK TABLES `estadocasoinstancia` WRITE;
/*!40000 ALTER TABLE `estadocasoinstancia` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadocasoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sector`
--

DROP TABLE IF EXISTS `sector`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sector` (
  `OIDSector` varchar(100) NOT NULL ,
  `codSector` int(11) NOT NULL,
  `nombreSector` int(11) NOT NULL,
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
/*!40000 ALTER TABLE `sector` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipocaso`
--

DROP TABLE IF EXISTS `tipocaso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipocaso` (
  `OIDTipoCaso` varchar(100) NOT NULL ,
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
/*!40000 ALTER TABLE `tipocaso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipocaso_tipoinstancia`
--

DROP TABLE IF EXISTS `tipocaso_tipoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipocaso_tipoinstancia` (
  `OIDTipoCasoTipoInstancia` varchar(100) NOT NULL ,
  `minutosMaximoResolucion` int(11) DEFAULT NULL,
  `ordenTipoCasoTipoInstancia` int(11) DEFAULT NULL,
  `OIDConfiguracionTipoCaso` varchar(100) NOT NULL,
  `OIDTipoInstancia` varchar(100) NOT NULL,
  PRIMARY KEY (`OIDTipoCasoTipoInstancia`),
  KEY `tipocaso_tipoinstacia_FK` (`OIDTipoInstancia`),
  KEY `tipocaso_tipoinstacia_FK_1` (`OIDConfiguracionTipoCaso`),
  CONSTRAINT `tipocaso_tipoinstacia_FK` FOREIGN KEY (`OIDTipoInstancia`) REFERENCES `tipoinstancia` (`OIDTipoInstancia`),
  CONSTRAINT `tipocaso_tipoinstacia_FK_1` FOREIGN KEY (`OIDConfiguracionTipoCaso`) REFERENCES `configuracion_tipocaso` (`OIDConfiguracionTipoCaso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipocaso_tipoinstancia`
--

LOCK TABLES `tipocaso_tipoinstancia` WRITE;
/*!40000 ALTER TABLE `tipocaso_tipoinstancia` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipocaso_tipoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoinstancia`
--

DROP TABLE IF EXISTS `tipoinstancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoinstancia` (
  `OIDTipoInstancia` varchar(100) NOT NULL ,
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
/*!40000 ALTER TABLE `tipoinstancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipotarea`
--

DROP TABLE IF EXISTS `tipotarea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipotarea` (
  `OIDTipoTarea` varchar(100) NOT NULL ,
  `codTipoTarea` int(11) NOT NULL,
  `nombreTipoTarea` varchar(100) NOT NULL,
  `descripcionTipoTarea` varchar(100) DEFAULT NULL,
  `fechaFinVigenciaTipoTarea` date DEFAULT NULL,
  PRIMARY KEY (`OIDTipoTarea`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipotarea`
--

LOCK TABLES `tipotarea` WRITE;
/*!40000 ALTER TABLE `tipotarea` DISABLE KEYS */;
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

-- Dump completed on 2020-09-19 18:39:23
