/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50622
Source Host           : 127.0.0.1:3306
Source Database       : 515_project

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2019-05-20 12:25:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `commodity_id` int(11) NOT NULL AUTO_INCREMENT,
  `commodity_name` varchar(255) NOT NULL,
  `commodity_name_abbreviation` varchar(255) NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `full_box` int(11) NOT NULL,
  `the_remaining_number` int(11) NOT NULL,
  `total_box` int(11) NOT NULL,
  PRIMARY KEY (`commodity_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('1', 'b-1', 'b-1', '515', '12', '3', '23');

-- ----------------------------
-- Table structure for depository
-- ----------------------------
DROP TABLE IF EXISTS `depository`;
CREATE TABLE `depository` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `depository_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of depository
-- ----------------------------
INSERT INTO `depository` VALUES ('0', '管理员');

-- ----------------------------
-- Table structure for intermediate_table
-- ----------------------------
DROP TABLE IF EXISTS `intermediate_table`;
CREATE TABLE `intermediate_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodity_id` int(11) NOT NULL,
  `logistics_id` int(11) NOT NULL,
  `merchants_id` int(11) NOT NULL,
  `UUID` varchar(255) NOT NULL,
  `flow_bottle` int(11) NOT NULL,
  `flow_box` int(11) NOT NULL,
  `count_box` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of intermediate_table
-- ----------------------------
INSERT INTO `intermediate_table` VALUES ('1', '1', '1', '1', '1112', '1', '12', '0', '0');

-- ----------------------------
-- Table structure for logistics
-- ----------------------------
DROP TABLE IF EXISTS `logistics`;
CREATE TABLE `logistics` (
  `logistics_id` int(11) NOT NULL AUTO_INCREMENT,
  `logistics_name` varchar(255) NOT NULL,
  `logistics_abbreviation` varchar(255) NOT NULL,
  PRIMARY KEY (`logistics_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of logistics
-- ----------------------------
INSERT INTO `logistics` VALUES ('1', '东方大道515', 'dfdd515');

-- ----------------------------
-- Table structure for merchants
-- ----------------------------
DROP TABLE IF EXISTS `merchants`;
CREATE TABLE `merchants` (
  `merchants_id` int(11) NOT NULL AUTO_INCREMENT,
  `merchants_name` varchar(255) NOT NULL,
  `merchants_abbreviation` varchar(255) NOT NULL,
  PRIMARY KEY (`merchants_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of merchants
-- ----------------------------
INSERT INTO `merchants` VALUES ('1', '艺博', 'yb');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `UUID` varchar(255) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1112', '2019-05-08');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `depository_id` int(11) NOT NULL,
  `online` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0', 'admin', 'qaz123456', '0', '0');
