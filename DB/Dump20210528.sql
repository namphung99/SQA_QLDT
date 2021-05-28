-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: sqa
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `classic`
--

DROP TABLE IF EXISTS `classic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classic` (
  `Id` varchar(255) NOT NULL,
  `SubjectId` varchar(255) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `FKClassíc639126` (`SubjectId`),
  CONSTRAINT `FKClassíc639126` FOREIGN KEY (`SubjectId`) REFERENCES `subject` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classic`
--

LOCK TABLES `classic` WRITE;
/*!40000 ALTER TABLE `classic` DISABLE KEYS */;
INSERT INTO `classic` VALUES ('1','1','INT-01','D17_SQA01'),('2','1','INT-02','D17_SQA02'),('3','2','INH-01','D18_ENGLISH01'),('4','2','INM-03','D18_ENGLISH02');
/*!40000 ALTER TABLE `classic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phantramdiem`
--

DROP TABLE IF EXISTS `phantramdiem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phantramdiem` (
  `Id` varchar(255) NOT NULL,
  `SubjectId` varchar(255) NOT NULL,
  `PhantramCC` float DEFAULT NULL,
  `PhantramTP1` float DEFAULT NULL,
  `PhantramTP2` float DEFAULT NULL,
  `PhantramDT` float DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `FKPhanTramDi567127` (`SubjectId`),
  CONSTRAINT `FKPhanTramDi567127` FOREIGN KEY (`SubjectId`) REFERENCES `subject` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phantramdiem`
--

LOCK TABLES `phantramdiem` WRITE;
/*!40000 ALTER TABLE `phantramdiem` DISABLE KEYS */;
INSERT INTO `phantramdiem` VALUES ('1','1',10,10,10,70),('2','2',10,20,20,50);
/*!40000 ALTER TABLE `phantramdiem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `point`
--

DROP TABLE IF EXISTS `point`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `point` (
  `Id` varchar(255) NOT NULL,
  `ClassicId` varchar(255) NOT NULL,
  `studentId` varchar(255) NOT NULL,
  `Chuyencan` float DEFAULT NULL,
  `TP1` float DEFAULT NULL,
  `TP2` float DEFAULT NULL,
  `Diemthi` float DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `FKpoint702625` (`studentId`),
  KEY `FKpoint976042` (`ClassicId`),
  CONSTRAINT `FKpoint702625` FOREIGN KEY (`studentId`) REFERENCES `student` (`Id`),
  CONSTRAINT `FKpoint976042` FOREIGN KEY (`ClassicId`) REFERENCES `classic` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `point`
--

LOCK TABLES `point` WRITE;
/*!40000 ALTER TABLE `point` DISABLE KEYS */;
INSERT INTO `point` VALUES ('1','1','1',10,9,10,8),('10','4','10',10,4,9,3),('11','4','11',10,1,2,0),('12','1','12',10,10,8,9),('13','1','13',10,3,7,10),('14','1','14',8,4,8,8),('15','1','15',9,6,6,6),('16','1','16',7,7,5,7),('17','2','17',7,8,6,5),('18','2','18',8,9,7,4),('19','2','19',6,8,8,4),('2','1','2',6.7,7,0,9),('20','2','20',7,7,5,3),('21','2','21',8,8,6,5),('22','3','22',9,7,5,6),('23','3','23',6,7,6,7),('24','3','24',7,8,7,8),('25','4','25',8,6,6,10),('26','4','26',9,6,7,8),('27','4','27',5,5,5,7),('28','4','28',6,7,8,9),('3','2','3',9,8,9,10),('4','2','4',10,8,8,10),('5','3','5',6,8,8,10),('6','3','6',10,8,8,6),('7','3','7',6,5.5,8,6),('8','3','8',7,5,8,7),('9','4','9',9,9.5,8,4);
/*!40000 ALTER TABLE `point` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `Id` varchar(255) NOT NULL,
  `userId` varchar(255) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `MaSV` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `FKstudent393718` (`userId`),
  CONSTRAINT `FKstudent393718` FOREIGN KEY (`userId`) REFERENCES `user` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('1','2','Trần Hoài Nam','B17DCCN452'),('10','11','Nguyễn Đức Nam','B17DCCN472'),('11','12','Bùi Văn Hòa','B17DCCN092'),('12','13','Nguyễn Thạc Dương','B17DCCN642'),('13','14','Trịnh Việt Hoàng','B17DCCN666'),('14','15','Đặng Anh Quân','B17DCCN071'),('15','16','Trần Trọng Hoàng Hà','B17DCCN164'),('16','17','Nguyễn Văn Tú','B17DCCN510'),('17','18','Phùng Đình Tùng','B17DCCN462'),('18','19','Hà Đăng Biên','B17DCCN570'),('19','20','Trần Ngọc Dũng','B17DCCN546'),('2','3','Nguyễn Thế Nghị','B17DCCN877'),('20','21','Lê Minh Hiếu','B17DCCN298'),('21','22','Nguyễn Minh Quang','B17DCCN490'),('22','23','Nguyễn Huy Nghĩa','B17DCCN562'),('23','24','Hoàng Thế Quyền','B17DCCN318'),('24','25','Nguyễn Văn Thành','B17DCCN041'),('25','26','Lê Khắc Phúc','B17DCCN149'),('26','27','Nguyễn Đức Thắng','B17DCCN310'),('27','28','Đỗ Xuân Sang','B17DCCN334'),('28','29','Nguyễn Văn Toàn','B17DCCN286'),('3','4','Phùng Xuân Nam','B17DCCN871'),('4','5','Trần Văn Độ','B17DCCN111'),('5','6','Nguyễn Thế Quyền','B17DCCN231'),('6','7','Đào Đức Long','B17DCCN763'),('7','8','Nguyễn Xuân Phúc','B17DCCN078'),('8','9','Kim Văn Trường','B17DCCN113'),('9','10','Đỗ Minh Tiến','B17DCCN362');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `Id` varchar(255) NOT NULL,
  `teacherId` varchar(255) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `FKSubject947562` (`teacherId`),
  CONSTRAINT `FKSubject947562` FOREIGN KEY (`teacherId`) REFERENCES `teacher` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('1','1','SQA'),('2','1','English');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `Id` varchar(255) NOT NULL,
  `userId` varchar(255) NOT NULL,
  `Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `FKteacher962964` (`userId`),
  CONSTRAINT `FKteacher962964` FOREIGN KEY (`userId`) REFERENCES `user` (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('1','1','NamTC');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `Id` varchar(255) NOT NULL,
  `Username` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Potion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('1','demo','1234567','teacher'),('10','nam','1','student'),('11','9','9','student'),('12','10','10','student'),('13','8','8','student'),('14','9','9','student'),('15','10','10','student'),('16','11','11','student'),('17','12','12','student'),('18','13','13','student'),('19','14','14','student'),('2','thao','1','student'),('20','15','15','student'),('21','16','16','student'),('22','17','17','student'),('23','18','18','student'),('24','19','19','student'),('25','20','20','student'),('26','21','21','student'),('27','22','22','student'),('28','23','23','student'),('29','24','24','student'),('3','lol','2','student'),('4','2','1','student'),('5','3','3','student'),('6','4','4','student'),('7','5','5','student'),('8','6','6','student'),('9','7','7','student');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sqa'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-28 15:51:57
