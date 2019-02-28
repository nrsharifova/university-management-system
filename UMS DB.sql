-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.13


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema sims
--

CREATE DATABASE IF NOT EXISTS sims;
USE sims;

--
-- Definition of table `faculty`
--

DROP TABLE IF EXISTS `faculty`;
CREATE TABLE `faculty` (
  `idFaculty` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`idFaculty`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `faculty`
--

/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` (`idFaculty`,`name`) VALUES 
 (1,'Engineering and Applied Science'),
 (2,'Economics and Management'),
 (3,'Humanities and Social Sciences'),
 (4,'Education');
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;


--
-- Definition of table `lesson`
--

DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson` (
  `idLesson` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `code` varchar(45) NOT NULL,
  `idTeacher` int(10) unsigned NOT NULL,
  `idFaculty` int(10) unsigned NOT NULL,
  `credit` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idLesson`),
  KEY `FK_lesson_idTeacher` (`idTeacher`),
  KEY `FK_lesson_idFaculty` (`idFaculty`),
  CONSTRAINT `FK_lesson_idFaculty` FOREIGN KEY (`idFaculty`) REFERENCES `faculty` (`idFaculty`),
  CONSTRAINT `FK_lesson_idTeacher` FOREIGN KEY (`idTeacher`) REFERENCES `teacher` (`idTeacher`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `lesson`
--

/*!40000 ALTER TABLE `lesson` DISABLE KEYS */;
INSERT INTO `lesson` (`idLesson`,`name`,`code`,`idTeacher`,`idFaculty`,`credit`) VALUES 
 (1,'Calculus 1 A','MATH 101',8,1,3),
 (2,'Electrical Power Supply','ETR 660',15,1,4),
 (3,'Database','CMS 660',5,1,3),
 (4,'Calculus 1 B','MATH 101',8,1,3),
 (5,'Calculus 2 A','MATH 102',9,1,3),
 (6,'Calculus 2 B','MATH 102',10,1,3),
 (7,'Applied Linear Algebra','MATH 231',9,1,3),
 (8,'Physics 2 B','PHSC 112',11,1,3),
 (9,'Azerbaijani Language A','AZLL101',1,1,3),
 (10,'Korean Language 1','KOR 201',6,1,3),
 (11,'Life Science','MED315',13,1,3),
 (12,'Introduction to Economics','ECON 101',14,1,3),
 (13,'Object Oriented Programming A','CMS 205',1,1,3),
 (14,'Web Programming 1 A','CMS 220',4,1,3),
 (15,'History','AZH104',16,1,3);
/*!40000 ALTER TABLE `lesson` ENABLE KEYS */;


--
-- Definition of table `major`
--

DROP TABLE IF EXISTS `major`;
CREATE TABLE `major` (
  `idMajor` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`idMajor`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `major`
--

/*!40000 ALTER TABLE `major` DISABLE KEYS */;
INSERT INTO `major` (`idMajor`,`name`) VALUES 
 (1,'Computer Engineering'),
 (2,'Chemical Engineering'),
 (3,'Mechanical Engineering'),
 (4,'Petroleum Engineering'),
 (5,'Civil Engineering'),
 (6,' Biomedical Engineering');
/*!40000 ALTER TABLE `major` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `idStudent` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `birth` varchar(45) NOT NULL,
  `idFaculty` int(10) unsigned NOT NULL,
  `idMajor` int(10) unsigned NOT NULL,
  `Password` varchar(45) NOT NULL DEFAULT '123456',
  PRIMARY KEY (`idStudent`),
  KEY `FK_student_idFaculty` (`idFaculty`),
  KEY `FK_student_idMajor` (`idMajor`),
  CONSTRAINT `FK_student_idFaculty` FOREIGN KEY (`idFaculty`) REFERENCES `faculty` (`idFaculty`),
  CONSTRAINT `FK_student_idMajor` FOREIGN KEY (`idMajor`) REFERENCES `major` (`idMajor`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`idStudent`,`name`,`surname`,`birth`,`idFaculty`,`idMajor`,`Password`) VALUES 
 (1,'Taleh','Rzayev','21.02.1981',2,2,'123456'),
 (2,'Pusta','Calalova','10.06.1997',1,1,'123456'),
 (3,'Khayala','Aliyeva','08.05.1998',1,1,'123456'),
 (4,'Nuray','Ismayilova','08.11.1997',1,1,'123456'),
 (5,'Elshan','Akberov','16.08.1997',1,1,'123456'),
 (7,'Nicat','Gasimli','18.08.1997',1,4,'123456'),
 (8,'Logman','Karimli','20.08.1998',1,3,'123456'),
 (9,'Sanar','Gasimov','20.12.1997',1,1,'123456'),
 (10,'Ayshan','Yariyeva','20.11.1997',1,1,'123456'),
 (11,'Aliya','Hatamova','10.06.1998',1,2,'123456'),
 (12,'David','Yaqubov','14.08.1997',1,4,'123456'),
 (13,'Mursal','Zeynalli','08.08.1997',1,4,'123456'),
 (14,'Malak','Agayeva','21.07.1997',1,4,'123456'),
 (15,'Vurghun','Yusubov','22.06.1997',1,3,'123456'),
 (16,'Laman','Mammadova','15.10.1997',1,1,'123456'),
 (17,'Naila','Sharifova','24.09.1998',1,1,'2419'),
 (18,'Farid','Huseynov','19.04.1996',1,3,'1924');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Definition of table `studentlesson`
--

DROP TABLE IF EXISTS `studentlesson`;
CREATE TABLE `studentlesson` (
  `idStudentLesson` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idStudent` int(10) unsigned NOT NULL COMMENT 'Student from Student table',
  `idLesson` int(10) unsigned NOT NULL COMMENT 'Which lesson student takes',
  `isActive` int(10) unsigned NOT NULL DEFAULT '1' COMMENT 'if this lesson is exist',
  `isPassed` int(10) unsigned NOT NULL COMMENT 'if passed it will be 1',
  PRIMARY KEY (`idStudentLesson`,`isPassed`) USING BTREE,
  KEY `FK_studentlesson_idStudent` (`idStudent`),
  KEY `FK_studentlesson_idLesson` (`idLesson`),
  CONSTRAINT `FK_studentlesson_idLesson` FOREIGN KEY (`idLesson`) REFERENCES `lesson` (`idLesson`),
  CONSTRAINT `FK_studentlesson_idStudent` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idStudent`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `studentlesson`
--

/*!40000 ALTER TABLE `studentlesson` DISABLE KEYS */;
INSERT INTO `studentlesson` (`idStudentLesson`,`idStudent`,`idLesson`,`isActive`,`isPassed`) VALUES 
 (1,3,6,0,1),
 (2,5,1,1,0),
 (3,2,6,1,1),
 (4,4,13,0,1),
 (5,9,6,1,0),
 (6,2,11,1,0),
 (7,8,12,0,1),
 (8,10,13,1,1),
 (9,14,1,1,0),
 (10,15,14,1,1),
 (11,9,13,1,0),
 (12,4,13,0,1),
 (13,11,5,0,1),
 (14,3,7,1,0),
 (15,5,6,1,0),
 (16,14,5,0,1),
 (17,13,14,1,0),
 (18,5,8,1,0),
 (19,5,7,0,0),
 (20,7,8,1,0),
 (21,8,4,0,1),
 (22,9,10,0,1),
 (24,3,6,0,1),
 (25,1,6,1,0),
 (26,1,6,1,0),
 (28,13,6,1,0),
 (29,17,5,1,0),
 (30,17,6,1,0),
 (31,17,1,1,0),
 (32,17,3,1,0),
 (33,17,2,0,0),
 (34,17,4,1,0),
 (35,1,1,1,0),
 (36,1,2,1,0),
 (37,1,3,1,0),
 (38,18,15,0,1),
 (39,18,5,1,0),
 (40,9,7,1,0),
 (41,9,11,1,0),
 (42,2,8,1,0),
 (43,17,7,1,1);
/*!40000 ALTER TABLE `studentlesson` ENABLE KEYS */;


--
-- Definition of table `studentpoints`
--

DROP TABLE IF EXISTS `studentpoints`;
CREATE TABLE `studentpoints` (
  `idStudentPoints` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idStudent` int(10) unsigned NOT NULL,
  `idLesson` int(10) unsigned NOT NULL,
  `Mid` int(10) unsigned NOT NULL,
  `Quiz` int(10) unsigned NOT NULL,
  `Activity` int(10) unsigned NOT NULL,
  `Fin` int(10) unsigned NOT NULL,
  `Total` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idStudentPoints`) USING BTREE,
  KEY `FK_studentpoints_idLesson` (`idLesson`),
  KEY `FK_studentpoints_idStudent` (`idStudent`),
  CONSTRAINT `FK_studentpoints_idLesson` FOREIGN KEY (`idLesson`) REFERENCES `lesson` (`idLesson`),
  CONSTRAINT `FK_studentpoints_idStudent` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idStudent`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `studentpoints`
--

/*!40000 ALTER TABLE `studentpoints` DISABLE KEYS */;
INSERT INTO `studentpoints` (`idStudentPoints`,`idStudent`,`idLesson`,`Mid`,`Quiz`,`Activity`,`Fin`,`Total`) VALUES 
 (1,3,6,20,10,10,28,68),
 (2,5,7,19,10,8,19,56),
 (3,2,1,18,8,10,31,67),
 (4,4,13,21,16,8,34,79),
 (5,9,10,25,19,10,34,88),
 (6,11,5,29,20,10,38,97),
 (7,14,5,20,10,8,30,68),
 (8,8,12,27,10,8,33,88),
 (9,5,7,11,10,10,15,46),
 (10,5,7,14,19,10,32,75),
 (11,8,4,13,12,12,23,60),
 (12,18,3,28,18,10,38,94),
 (13,17,2,14,14,4,24,56),
 (14,18,15,15,5,29,40,89),
 (15,17,2,29,19,9,40,97),
 (16,17,7,24,19,10,28,81);
/*!40000 ALTER TABLE `studentpoints` ENABLE KEYS */;


--
-- Definition of table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `idTeacher` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `birth` varchar(45) NOT NULL,
  `number` varchar(45) NOT NULL,
  PRIMARY KEY (`idTeacher`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `teacher`
--

/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` (`idTeacher`,`name`,`surname`,`birth`,`number`) VALUES 
 (1,'Reshad','Khaliqov','26.07.1991','+994556548976'),
 (2,'Elsever','Semedov','18.09.1974','+994512346785'),
 (3,'Nuru','Seferov','14.03.1968','+994706543726'),
 (4,'Mehemmed','Sherifov','12.07.1971','+994779870534'),
 (5,'Cestin','Mandumpal','27.03.1966','+994501589238'),
 (6,'Konul','Kamilzade','11.01.1981','+994556759801'),
 (7,'Reyhan','Memmedova','27.02.1965','+994512578267'),
 (8,'Javanshir','Azizov','12.03.1981','+994516273846'),
 (9,'Ali','Huseynli','13.03.1983','+994518762563'),
 (10,'Lala','Jafarova','16.06.1986','+994703462689'),
 (11,'Faxranda','Alimardanova','16.03.1981','+994772346527'),
 (12,'Reyhan','Madatova','18.09.1968','+994501678273'),
 (13,'Parvana','Baxshaliyeva','17.07.1977','+994778276797'),
 (14,'Fuad','Rasulov','19.09.1969','+994517658909'),
 (15,'Sevda','Garibova','02.07.1977','+994518726905'),
 (16,'Roza','Yaqubova','12.05.1956','+994515238460');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;


--
-- Definition of table `teacherlesson`
--

DROP TABLE IF EXISTS `teacherlesson`;
CREATE TABLE `teacherlesson` (
  `idteacherlesson` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idTeacher` int(10) unsigned NOT NULL,
  `idLesson` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idteacherlesson`),
  KEY `FK_teacherlesson_idTeacher` (`idTeacher`),
  KEY `FK_teacherlesson_idLesson` (`idLesson`),
  CONSTRAINT `FK_teacherlesson_idLesson` FOREIGN KEY (`idLesson`) REFERENCES `lesson` (`idLesson`),
  CONSTRAINT `FK_teacherlesson_idTeacher` FOREIGN KEY (`idTeacher`) REFERENCES `teacher` (`idTeacher`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `teacherlesson`
--

/*!40000 ALTER TABLE `teacherlesson` DISABLE KEYS */;
INSERT INTO `teacherlesson` (`idteacherlesson`,`idTeacher`,`idLesson`) VALUES 
 (1,5,7),
 (2,1,13),
 (3,3,8),
 (4,7,9),
 (5,9,6),
 (6,3,2),
 (7,8,3),
 (8,14,11),
 (9,16,15);
/*!40000 ALTER TABLE `teacherlesson` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
