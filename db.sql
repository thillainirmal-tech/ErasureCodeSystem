/*
SQLyog - Free MySQL GUI v5.13
Host - 5.0.22-community-nt : Database - erasurecode
*********************************************************************
Server version : 5.0.22-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `erasurecode`;

USE `erasurecode`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert into `admin` (`username`,`password`) values ('deva','deva');

/*Table structure for table `gender` */

DROP TABLE IF EXISTS `gender`;

CREATE TABLE `gender` (
  `Gender` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `gender` */

insert into `gender` (`Gender`) values ('Male');
insert into `gender` (`Gender`) values ('Female');

/*Table structure for table `ownerprofile` */

DROP TABLE IF EXISTS `ownerprofile`;

CREATE TABLE `ownerprofile` (
  `UserName` varchar(35) default NULL,
  `groupname` varchar(35) default NULL,
  `filename` varchar(700) NOT NULL,
  `server1` varchar(100) default NULL,
  `server2` varchar(100) default NULL,
  `server3` varchar(100) default NULL,
  `server4` varchar(100) default NULL,
  PRIMARY KEY  (`filename`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ownerprofile` */

insert into `ownerprofile` (`UserName`,`groupname`,`filename`,`server1`,`server2`,`server3`,`server4`) values ('ramya','ramya','imagesq.jpg','dd86a2c454b641c8c99c8165892a4dd76a5b5434','dd86a2c454b641c8c99c8165892a4dd76a5b5434key1','dd86a2c454b641c8c99c8165892a4dd76a5b5434key2','dd86a2c454b641c8c99c8165892a4dd76a5b5434key3');

/*Table structure for table `registration` */

DROP TABLE IF EXISTS `registration`;

CREATE TABLE `registration` (
  `username` varchar(30) default NULL,
  `password` varchar(30) default NULL,
  `gender` varchar(20) default NULL,
  `email` varchar(50) default NULL,
  `phoneno` varchar(50) default NULL,
  `userproductkey` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `registration` */

insert into `registration` (`username`,`password`,`gender`,`email`,`phoneno`,`userproductkey`) values ('ramya','ramya','male','ramya@gmail.ocm','1234123412','asdfasdfasdfasdf');

SET SQL_MODE=@OLD_SQL_MODE;