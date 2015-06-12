DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bookId` int(11) NOT NULL AUTO_INCREMENT,
  `tourId` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;

INSERT INTO `book` (`bookId`, `tourId`, `userId`, `amount`)
VALUES
	(2,2,3,4),
	(3,1,2,1),
	(4,10,2,4),
	(5,1,2,1),
	(6,11,2,3);

/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `tour`;

CREATE TABLE `tour` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cost` double DEFAULT NULL,
  `transport` text,
  `date_from` date DEFAULT NULL,
  `date_to` date DEFAULT NULL,
  `country` char(50) DEFAULT NULL,
  `hotel` int(11) DEFAULT NULL,
  `type_of_trip` text,
  `free_places` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `tour` WRITE;
/*!40000 ALTER TABLE `tour` DISABLE KEYS */;

INSERT INTO `tour` (`id`, `cost`, `transport`, `date_from`, `date_to`, `country`, `hotel`, `type_of_trip`, `free_places`)
VALUES
	(2,950,'plane','2015-01-05','2015-01-20','Austria',5,'mountains',23),
	(3,430,'plane','2014-12-24','2015-01-03','Czech Republic',1,'mountains',60),
	(4,300,'plane','2014-12-24','2014-12-28','Czech Republic',3,'mountains',30),
	(5,900,'plane','2015-02-20','2015-02-27','Italy',5,'mountains',35),
	(6,750,'plane','2015-02-20','2015-02-27','Italy',4,'mountains',20),
	(7,700,'plane','2015-01-30','2015-02-08','Andorra',3,'mountains',55),
	(8,915,'plane','2015-03-18','2015-03-28','Greece',4,'sea',88),
	(9,1200,'plane','2015-02-18','2015-02-28','Greece',5,'sea',7),
	(10,500,'plane','2015-08-13','2015-08-21','Bulgaria',3,'sea',4),
	(11,730,'plane','2015-06-02','2015-06-13','Bulgaria',5,'sea',0),
	(12,950,'plane','2015-02-10','2015-02-20','Turkey',5,'sea',11),
	(13,800,'plane','2015-03-18','2015-03-28','Turkey',4,'sea',8),
	(14,400,'bus','2015-02-13','2015-02-20','France',4,'excursion',8),
	(15,600,'bus','2015-02-18','2015-02-28','France',4,'excursion',10),
	(16,700,'bus','2015-03-01','2015-03-05','France',5,'excursion',3),
	(17,400,'bus','2015-03-01','2015-03-04','Germany',3,'excursion',20),
	(18,550,'bus','2015-02-18','2015-02-23','Germany',4,'excursion',15),
	(19,730,'bus','2015-03-06','2015-03-10','Germany',5,'excursion',10),
	(20,400,'bus','2015-02-08','2015-02-11','Czech Republic',4,'excursion',12),
	(21,500,'bus','2015-03-14','2015-03-19','Czech Republic',5,'excursion',16),
	(22,480,'bus','2015-02-28','2015-03-02','Switzerland',4,'excursion',8),
	(23,560,'bus','2015-03-03','2015-03-10','Switzerland',4,'excursion',5),
	(24,100,'bus','2015-02-18','2015-02-21','France',0,'shopping',5),
	(25,80,'bus','2015-02-21','2015-02-24','Poland',0,'shopping',25),
	(26,90,'bus','2015-02-24','2015-02-27','Lithuania',0,'shopping',15),
	(27,666,'bus','2015-01-19','2015-01-23','hui',3,'sea',8);

/*!40000 ALTER TABLE `tour` ENABLE KEYS */;
UNLOCK TABLES;


DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `surname` tinytext,
  `name` tinytext,
  `role` tinytext,
  `sum_of_trip` int(11) DEFAULT NULL,
  `discount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`id`, `surname`, `name`, `role`, `sum_of_trip`, `discount`)
VALUES
	(2,'Sidorov','Ivan','user',3,0),
	(3,'Ivanova','Olga','user',5,1),
	(4,'Havag','Nik','user',1,0),
	(5,'Drozdova','Elena','user',2,0),
	(6,'Gryzd','Maria','user',9,1),
	(7,'Voron','Vit','admin',1,0),
	(8,'hui','huikavich','user',0,0);

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
