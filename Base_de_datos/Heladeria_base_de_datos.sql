-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: Heladeria
-- ------------------------------------------------------
-- Server version	8.0.25-0ubuntu0.20.04.1

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
-- Table structure for table `Ventas`
--

DROP TABLE IF EXISTS `Ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Ventas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo_helado` varchar(45) NOT NULL,
  `empleado` varchar(45) NOT NULL,
  `caja` int NOT NULL,
  `fecha_venta` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ventas`
--

LOCK TABLES `Ventas` WRITE;
/*!40000 ALTER TABLE `Ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (2);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `id_venta` int NOT NULL AUTO_INCREMENT,
  `empleado` varchar(255) DEFAULT NULL,
  `caja` int NOT NULL,
  `fecha_venta` varchar(255) DEFAULT NULL,
  `tipo_helado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_venta`)
) ENGINE=InnoDB AUTO_INCREMENT=135 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,'Martin',0,'2021/06/04','2 kilo'),(2,'Mariana',1,'2021/06/04','1 kilo'),(3,'Mariana',2,'2021/06/04','cono'),(4,'Mariana',2,'2021/06/04','1/4 kilo'),(5,'Leonel',1,'2021/06/05','1/4 kilo'),(6,'Mariana',1,'2021/06/05','1 kilo'),(7,'Maria',1,'2021/06/05','1 kilo'),(8,'Mariana',1,'2021/06/05','2 kilos'),(9,'Leonel',1,'2021/06/05','1 kilo'),(10,'Leonel',2,'2021/06/05','2 kilos'),(11,'Mariana',2,'2021/06/05','1/4 kilo'),(12,'Mariana',1,'2021/06/05','1/2 kilo'),(13,'Mariana',1,'2021/06/05','1/8 kilo'),(14,'Mariana',1,'2021/06/05','1/4 kilo'),(15,'Mariana',1,'2021/06/05','1/8 kilo'),(16,'Mariana',1,'2021/06/05','1/2 kilo'),(17,'Mariana',1,'2021/06/05','1/8 kilo'),(18,'Mariana',1,'2021/06/05','1/4 kilo'),(19,'Mariana',1,'2021/06/05','1/2 kilo'),(20,'Mariana',1,'2021/06/05','1/6 kilo'),(21,'Mariana',1,'2021/06/05','1/7 kilo'),(22,'Mariana',1,'2021/06/05','1/8 kilo'),(23,'Mariana',2,'2021/06/05','1/12 kilo'),(24,'Mariana',2,'2021/06/05','1 kilo'),(25,'Mariana',2,'2021/06/05','2 kilos'),(26,'Mariana',2,'2021/06/05','3 kilos'),(27,'Mariana',2,'2021/06/05','4 kilos'),(28,'Mariana',2,'2021/06/05','5 kilos'),(29,'Mariana',2,'2021/06/05','6 kilos'),(30,'Mariana',2,'2021/06/05','7 kilos'),(31,'Mariana',2,'2021/06/05','8 kilos'),(32,'Mariana',2,'2021/06/05','9 kilos'),(33,'Mariana',3,'2021/06/05','10 kilos'),(34,'Mariana',3,'2021/06/05','12 kilos'),(35,'Mariana',3,'2021/06/05','12 kilos'),(36,'Mariana',3,'2021/06/05','13 kilos'),(37,'Mariana',3,'2021/06/05','14 kilos'),(38,'Mariana',3,'2021/06/05','15 kilos'),(39,'Mariana',3,'2021/06/05','16 kilos'),(40,'Mariana',3,'2021/06/05','17 kilos'),(41,'Mariana',3,'2021/06/05','18 kilos'),(42,'Mariana',3,'2021/06/05','19 kilos'),(43,'Mariana',3,'2021/06/05','20 kilos'),(44,'Mariana',3,'2021/06/05','21 kilos'),(45,'Mariana',3,'2021/06/05','22 kilos'),(46,'Mariana',3,'2021/06/05','23 kilos'),(47,'Mariana',3,'2021/06/05','24 kilos'),(48,'Mariana',1,'2021/06/06','25asdasd kilos'),(49,'Mariana',1,'2021/06/06','26 kilos'),(50,'Mariana',1,'2021/06/06','27 kilos'),(51,'Mariana',1,'2021/06/06','28 kilos'),(52,'Mariana',1,'2021/06/06','29 kilos'),(53,'Mariana',1,'2021/06/06','30 kilos'),(54,'Esteban',1,'2021/06/06','{\n    \"tipoHelado\":\"1 kilo\"\n}'),(55,'Sebastian',1,'2021/06/06','{\n    \"tipoHelado\":\"1/4 kilo\"\n}'),(56,'Sebastian',1,'2021/06/06','1/4 kilo'),(57,'Sebastian',1,'2021/06/06','1/8 kilo'),(58,'Juana',1,'2021/06/06','1/2 kilo'),(59,'Sebastian',1,'2021/06/06','2 kilos'),(60,'Juana',1,'2021/06/06','1 kilos'),(61,'Juana',2,'2021/06/06','3 kilos'),(62,'Sebastian',2,'2021/06/06','1 kilo'),(63,'Sebastian',2,'2021/06/06','1 kilo'),(64,'Sebastian',2,'2021/06/06','1 kilo'),(65,'Esteban',2,'2021/06/06','1 kilo'),(66,'Sebastian',2,'2021/06/06','1/2 kilo'),(67,'Esteban',2,'2021/06/06','1/4 kilo'),(68,'Esteban',2,'2021/06/06','1/4 kilo'),(69,'Sebastian',2,'2021/06/06','1/4 kilo'),(70,'Juana',1,'2021/06/07','1 kilo'),(71,'Esteban',1,'2021/06/07','Cono'),(72,'Sebastian',1,'2021/06/07','Cono'),(73,'Sebastian',1,'2021/06/07','Cono'),(74,'Juana',1,'2021/06/07','Cono'),(75,'Sebastian',2,'2021/06/07','Cono'),(76,'Sebastian',2,'2021/06/07','Cono'),(77,'Sebastian',2,'2021/06/07','Cono'),(78,'Sebastian',2,'2021/06/07','Cono'),(79,'Sebastian',2,'2021/06/07','Cono'),(80,'Sebastian',2,'2021/06/07','Cono'),(81,'Esteban',2,'2021/06/07','Cono'),(82,'Juana',2,'2021/06/07','Cono'),(83,'Esteban',2,'2021/06/07','Cono'),(84,'Juana',2,'2021/06/07','Cono'),(85,'Sebastian',3,'2021/06/07','Cono'),(86,'Sebastian',3,'2021/06/07','1/4kg'),(87,'Esteban',3,'2021/06/07','kilo'),(88,'Esteban',1,'2021/06/07','kilo'),(89,'Juana',1,'2021/06/07','kilo'),(90,'Sebastian',1,'2021/06/07','kilo'),(91,'Sebastian',1,'2021/06/07','kilo'),(92,'Juana',1,'2021/06/07','Cono'),(93,'Juana',1,'2021/06/07','1/4kg'),(94,'Esteban',1,'2021/06/07','1/4kg'),(95,'Sebastian',1,'2021/06/07','Cono'),(96,'Sebastian',1,'2021/06/07','Cono'),(97,'Esteban',2,'2021/06/07','Cono'),(98,'Juana',2,'2021/06/07','kilo'),(99,'Sebastian',2,'2021/06/07','kilo'),(100,'Esteban',2,'2021/06/07','kilo'),(101,'Sebastian',2,'2021/06/07','1 kilo'),(102,'Sebastian',2,'2021/06/07','1 kilo'),(103,'Esteban',2,'2021/06/07','1 kilo'),(104,'Esteban',2,'2021/06/07','1 kilo'),(105,'Esteban',2,'2021/06/07','1 kilo'),(106,'Sebastian',2,'2021/06/07','1 kilo'),(107,'Sebastian',3,'2021/06/07','1 kilo'),(108,'Sebastian',3,'2021/06/07','1 kilo'),(109,'Esteban',3,'2021/06/07','1 kilo'),(110,'Juana',3,'2021/06/07','1 kilo'),(111,'Sebastian',3,'2021/06/07','1 kilo'),(112,'Esteban',3,'2021/06/07','1 kilo'),(113,'Esteban',3,'2021/06/07','1 kilo'),(114,'Juana',3,'2021/06/07','1 kilo'),(115,'Sebastian',3,'2021/06/07','1 kilo'),(116,'Esteban',3,'2021/06/07','1 kilo'),(117,'Juana',3,'2021/06/07','1 kilo'),(118,'Juana',3,'2021/06/07','1 kilo'),(119,'Juana',3,'2021/06/07','1 kilo'),(120,'Juana',3,'2021/06/07','1 kilo'),(121,'Juana',3,'2021/06/07','1 kilo'),(122,'Juana',1,'2021/06/07','kilo'),(123,'Juana',1,'2021/06/07','1 kilo'),(124,'Esteban',1,'2021/06/07','1 kilo'),(125,'Sebastian',1,'2021/06/07','1/4kg'),(126,'Sebastian',1,'2021/06/07','1/4kg'),(127,'Sebastian',1,'2021/06/07','1/4kg'),(128,'Micaela',2,'2021/06/07','Cono'),(129,'Sebastian',2,'2021/06/07','1/4kg'),(130,'Juana',2,'2021/06/07','1/4kg'),(131,'Sebastian',2,'2021/06/07','kilo'),(132,'Esteban',2,'2021/06/07','kilo'),(133,'Juana',2,'2021/06/07','1/4kg'),(134,'Micaela',2,'2021/06/07','Cono');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-07 17:23:49
