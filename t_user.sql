/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2015-08-03 13:17:57
*/
USE TEST
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(45) DEFAULT NULL,
  password varchar(45) DEFAULT NULL,
  phone varchar(45) DEFAULT NULL,
  email varchar(45) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

