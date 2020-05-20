/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.17-log : Database - bb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bb`;

/*Table structure for table `anchor` */

DROP TABLE IF EXISTS `anchor`;

CREATE TABLE `anchor` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nickname` VARCHAR(20) NOT NULL,
  `uid` INT(8) NOT NULL,
  `uname` VARCHAR(30) NOT NULL,
  `address` VARCHAR(50) NOT NULL,
  `cid` INT(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `anchor` */

INSERT  INTO `anchor`(`id`,`nickname`,`uid`,`uname`,`address`,`cid`) VALUES 
(1,'庄jazz',995883135,'小庄的直播间','https://www.bilibili.com/995883135',8),
(2,'爱做饭的芋头SAMA',92703634,'芋头SAMA','https://live.bilibili.com/92703634',1),
(3,'LexBurner',584465938,'全员内鬼','https://live.bilibili.com/584465938',4),
(4,'半佛仙人',31047019,'这世界有bug','https://live.bilibili.com/31047019',8);

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `cname` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `category` */

INSERT  INTO `category`(`id`,`cname`) VALUES 
(1,'生活'),
(2,'动画'),
(3,'游戏'),
(4,'科技'),
(5,'音乐');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
