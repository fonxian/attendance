# Host: 127.0.0.1  (Version 5.7.3-m13)
# Date: 2016-06-05 23:07:26
# Generator: MySQL-Front 5.3  (Build 5.39)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "attend"
#

DROP TABLE IF EXISTS `attend`;
CREATE TABLE `attend` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `lesson_id` int(11) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `student_id` varchar(255) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `reason` varchar(255) DEFAULT '无',
  `classes_id` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;

#
# Data for table "attend"
#

INSERT INTO `attend` VALUES (27,1,1000,'1205010106',1,'点点滴滴','12050101','2016-03-27'),(28,1,1000,'1205010106',3,'','12050101','2016-03-27'),(29,1,1000,'1205010106',2,'玩游戏','12050101','2016-03-27'),(30,1,1000,'1205010106',1,'','12050101','2016-03-27'),(31,1,1000,'1205010106',2,'','12050101','2016-03-27'),(32,1,1000,'1205010106',1,'','12050101','2016-03-27'),(33,1,1000,'1205010120',1,'','12050101','2016-03-27'),(34,1,1000,'1205010120',2,'','12050101','2016-03-27'),(35,1,1000,'1205010120',1,'','12050101','2016-03-27'),(36,1,1000,'1205010120',1,'','12050101','2016-03-27'),(37,1,1000,'1205010120',1,'','12050101','2016-03-27'),(38,1,1000,'1205010121',1,'','12050101','2016-03-27'),(39,1,1000,'1205010121',2,'','12050101','2016-03-27'),(40,1,1000,'1205010201',1,'','12050102','2016-03-27'),(41,1,1000,'1205010201',2,'','12050102','2016-03-27'),(43,1,1000,'1205010106',1,'','12050101','2016-04-08'),(44,1,1000,'1205010106',1,'','12050101','2016-04-08'),(45,1,1000,'1205010106',1,'','12050101','2016-04-08'),(46,1,1000,'1205010106',1,'','12050101','2016-04-08'),(47,1,1000,'1205010106',1,'','12050101','2016-04-08'),(48,1,1000,'1205010106',1,'','12050101','2016-04-08'),(49,1,1000,'1205010120',1,'','12050101','2016-04-08'),(51,1,1000,'1205010115',1,'','12050101','2016-04-08'),(52,1,1000,'1205010106',2,'典型作死，无故翘课','12050101','2016-04-08'),(53,1,1000,'1205010120',2,'','12050101','2016-04-08'),(54,1,1000,'1205010121',3,'作死去了','12050101','2016-04-08'),(55,1,1000,'1205010201',1,'','12050102','2016-04-08'),(57,1,1000,'1205010115',1,'急急急急急','12050101','2016-04-08'),(58,1,1000,'1205010120',3,'','12050101','2016-04-08'),(59,1,1000,'1205010121',2,'泡妹子去了','12050101','2016-04-08'),(60,1,1000,'1205010201',1,'','12050102','2016-04-08'),(61,1,1000,'1205010115',1,'','12050101','2016-04-08'),(63,1,1000,'1205010120',2,'','12050101','2016-04-08'),(64,1,1000,'1205010121',3,'','12050101','2016-04-08'),(65,1,1000,'1205010106',1,'','12050101','2016-04-10'),(66,1,1000,'1205010115',2,'','12050101','2016-04-10'),(67,1,1000,'1205010120',3,'','12050101','2016-04-10'),(68,1,1000,'1205010121',1,'','12050101','2016-04-10'),(69,1,1000,'1205010115',3,'','12050101','2016-04-10'),(70,1,1000,'1205010106',1,'','12050101','2016-04-29'),(71,1,1000,'1205010115',2,'','12050101','2016-04-29'),(72,1,1000,'1205010120',3,'','12050101','2016-04-29'),(73,1,1000,'1205010121',4,'','12050101','2016-04-29'),(74,1,1000,'1205010335',1,'','12050103','2016-04-29'),(75,1,1000,'1205010101',1,'','12050101','2016-05-14'),(76,1,1000,'1205010101',2,'','12050101','2016-05-14'),(77,1,1000,'1205010106',3,'','12050101','2016-05-14');

#
# Structure for table "classes"
#

DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `school_id` int(11) DEFAULT NULL,
  `leader_id` int(11) DEFAULT NULL,
  `student_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=12050105 DEFAULT CHARSET=utf8;

#
# Data for table "classes"
#

INSERT INTO `classes` VALUES (12050101,'计算机一班',5,1000,36),(12050102,'计算机二班',5,1000,36),(12050103,'计算机三班',5,1001,36),(12050104,'计算机四班',5,1001,36);

#
# Structure for table "lesson"
#

DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=53233 DEFAULT CHARSET=utf8;

#
# Data for table "lesson"
#

INSERT INTO `lesson` VALUES (1,'操作系统',1000),(2,'计算机组成原理',1002),(2333,'fdfs',1000),(6543,'gfggf',1017),(53232,'fdsfewr',1000);

#
# Structure for table "lessonhave"
#

DROP TABLE IF EXISTS `lessonhave`;
CREATE TABLE `lessonhave` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `classes_id` int(11) DEFAULT NULL,
  `lesson_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

#
# Data for table "lessonhave"
#

INSERT INTO `lessonhave` VALUES (1,12050101,1),(6,12050101,8),(7,12050101,3),(12,12050101,6543),(20,12050104,6543);

#
# Structure for table "school"
#

DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

#
# Data for table "school"
#

INSERT INTO `school` VALUES (5,'计算机科学与工程');

#
# Structure for table "status"
#

DROP TABLE IF EXISTS `status`;
CREATE TABLE `status` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `result` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "status"
#

INSERT INTO `status` VALUES (1,'正常',NULL),(2,'缺勤',NULL),(3,'请假',NULL),(4,'迟到',NULL);

#
# Structure for table "student"
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `school_id` int(11) DEFAULT NULL,
  `classes_id` int(11) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1205010408 DEFAULT CHARSET=utf8;

#
# Data for table "student"
#

INSERT INTO `student` VALUES (1205010101,'苏益怀',5,12050101,1),(1205010106,'方志杰',5,12050101,1),(1205010217,'发生的热',5,12050101,1),(1205010335,'张三',5,12050103,1),(1205010407,'张三',5,12050101,1);

#
# Structure for table "teacher"
#

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `realname` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `school_id` int(11) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1022 DEFAULT CHARSET=utf8;

#
# Data for table "teacher"
#

INSERT INTO `teacher` VALUES (1000,'杨洪松','yanghongsong@163.com','96e79218965eb72c92a549dd5a330112','18373258260',5,1),(1001,'廖祝华','liaozhuhua','123456','123456',5,1),(1002,'喻楚云','yuchuyun','123456','123456',5,1),(1003,'文一凭','wenyiping','123456','111111',5,1),(1004,'周栋','zhoudong','123456','1233445',5,1),(1005,'周栋','zhoudong','123456','1233445',5,1),(1006,'刘建勋','liujianxun','e10adc3949ba59abbe56e057f20f883e','151222',5,1),(1007,'ree','fgrer@163.com','c3fc34ca43c7fe767baf93b539157ea4','124',5,1),(1008,'fdffd','fonxian@123.com','96e79218965eb72c92a549dd5a330112','13345235',5,1),(1009,'fdfe','fdfsf@fdf','e10adc3949ba59abbe56e057f20f883e','12',5,1),(1010,'fdfe','fdfsf@fdf','e10adc3949ba59abbe56e057f20f883e','12',NULL,1),(1011,'fdfd','fdfd@fdf','96e79218965eb72c92a549dd5a330112','123',NULL,1),(1012,'fdfe','fdfsf@111','698d51a19d8a121ce581499d7b701668','12',5,1),(1013,'fdf','tttt@111','202cb962ac59075b964b07152d234b70','2334',5,1),(1014,'fzj','fonxian2015@163.com','202cb962ac59075b964b07152d234b70','1234',5,1),(1015,'ddd','test@123.com','96e79218965eb72c92a549dd5a330112','4444',5,1),(1016,'fon','test1@123.com','e10adc3949ba59abbe56e057f20f883e','123',5,1),(1017,'ffff','123@123.com','e10adc3949ba59abbe56e057f20f883e','3435',5,1),(1020,'1111','1234@123.com','e10adc3949ba59abbe56e057f20f883e','1111',5,1),(1021,'dddd','5555@122.vom','71f396e4134a1160d90bb1439876df31','33333',5,1);
