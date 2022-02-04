/*
Navicat MySQL Data Transfer

Source Server         : aliyun
Source Server Version : 50560
Source Host           : 39.97.167.227:3306
Source Database       : hr

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-04-01 11:40:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for achives
-- ----------------------------
DROP TABLE IF EXISTS `achives`;
CREATE TABLE `achives` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '档案表编号',
  `emp_name` varchar(20) DEFAULT NULL,
  `emp_sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `emp_address` varchar(50) DEFAULT NULL COMMENT '地址',
  `emp_birth` datetime DEFAULT NULL,
  `emp_card` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `entry_time` datetime DEFAULT NULL COMMENT '入职时间',
  `emp_titles` varchar(20) DEFAULT NULL COMMENT '职称',
  `mobile` varchar(12) DEFAULT NULL COMMENT '手机号',
  `graduation_time` datetime DEFAULT NULL COMMENT '毕业时间',
  `graduation_shcool` varchar(20) DEFAULT NULL COMMENT '毕业院校',
  `education` int(11) DEFAULT NULL COMMENT '学历（1专科2本科3硕士4博士）',
  `emp_depart` int(11) DEFAULT NULL COMMENT '部门编号',
  `emp_status` int(11) DEFAULT '1' COMMENT '状态（1在职，2离职 ）',
  `ext_a` varchar(200) DEFAULT NULL,
  `ext_b` varchar(200) DEFAULT NULL,
  `ext_c` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='档案表';

-- ----------------------------
-- Records of achives
-- ----------------------------
INSERT INTO `achives` VALUES ('1', '张三', '男', '河南省郑州市', '1994-03-24 11:48:05', '41078214578585', '2019-03-24 11:48:33', 'Java开发', '15745454747', '2019-03-24 12:16:30', '新乡学院', '2', '1', '1', '', null, null);
INSERT INTO `achives` VALUES ('2', '李四的打断点', '男', '河南新乡', '1990-12-01 20:12:06', '410727199607259514', '2019-03-26 00:00:00', 'Java开发工程师1', '15736978787', '2019-03-26 00:00:00', '新乡学院', '2', '1', '1', null, null, null);
INSERT INTO `achives` VALUES ('3', '刘阿斗', '男', '三国水浒大乱斗', '1999-03-26 20:15:06', '474154198707279607', '2019-03-26 00:00:00', '算法工程师', '15787878787', '2019-03-26 00:00:00', '三国大学', '4', '1', '1', null, null, null);

-- ----------------------------
-- Table structure for asessment
-- ----------------------------
DROP TABLE IF EXISTS `asessment`;
CREATE TABLE `asessment` (
  `asessment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '考勤编号',
  `asessment_date` datetime DEFAULT NULL COMMENT '考勤时间',
  `emp_id` int(11) DEFAULT NULL COMMENT '员工编号',
  `asessment_type` int(11) DEFAULT NULL COMMENT '1迟到 2早退 3旷工',
  `deduction_salary` double DEFAULT NULL COMMENT '扣除薪资',
  `asessment_status` int(11) DEFAULT '1' COMMENT '状态 1正常 2删除',
  `ext_a` varchar(200) DEFAULT NULL,
  `ext_b` varchar(200) DEFAULT NULL,
  `ext_c` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`asessment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='考勤表';

-- ----------------------------
-- Records of asessment
-- ----------------------------
INSERT INTO `asessment` VALUES ('1', '2019-03-28 17:23:48', '1', '1', '20', '1', null, null, null);
INSERT INTO `asessment` VALUES ('2', '2019-03-28 00:00:00', '2', '1', '20', '1', null, null, null);
INSERT INTO `asessment` VALUES ('3', '2019-03-28 00:00:00', '3', '1', '2', '1', null, null, null);
INSERT INTO `asessment` VALUES ('4', '2019-03-29 00:00:00', '1', '1', '10', '1', null, null, null);
INSERT INTO `asessment` VALUES ('5', '2019-03-30 00:00:00', '3', '2', '10', '1', null, null, null);
INSERT INTO `asessment` VALUES ('6', '2019-03-30 00:00:00', '2', '2', '51', '1', null, null, null);

-- ----------------------------
-- Table structure for depart
-- ----------------------------
DROP TABLE IF EXISTS `depart`;
CREATE TABLE `depart` (
  `depart_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `depart_name` varchar(20) DEFAULT NULL COMMENT '部门名称',
  `depart_status` int(11) DEFAULT '1' COMMENT '状态（1正常）',
  `create_time` datetime DEFAULT NULL COMMENT '成立时间',
  `ext_a` varchar(200) DEFAULT NULL,
  `ext_b` varchar(200) DEFAULT NULL,
  `ext_c` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`depart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='部门表';

-- ----------------------------
-- Records of depart
-- ----------------------------
INSERT INTO `depart` VALUES ('1', '技术支持部1', '1', '2019-03-24 00:00:00', null, null, null);
INSERT INTO `depart` VALUES ('2', '前端资源组1', '1', '2019-03-27 00:00:00', '', '', '');

-- ----------------------------
-- Table structure for recruit
-- ----------------------------
DROP TABLE IF EXISTS `recruit`;
CREATE TABLE `recruit` (
  `recruit_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '招聘编号',
  `person_name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `person_sex` int(11) DEFAULT NULL COMMENT '性别（1男 2 女）',
  `recruit_date` datetime DEFAULT NULL COMMENT '面试时间',
  `graduation_school` varchar(20) DEFAULT NULL COMMENT '毕业院校',
  `graduation_date` date DEFAULT NULL COMMENT '毕业时间',
  `education` int(11) DEFAULT NULL COMMENT '学历（1专科2本科3硕士4博士）',
  `recruit_result` int(11) DEFAULT NULL COMMENT '1未处理 2已通过 3未通过',
  `recruit_status` int(11) DEFAULT NULL COMMENT '状态 1正常 2删除',
  `ext_a` varchar(200) DEFAULT NULL,
  `ext_b` varchar(200) DEFAULT NULL,
  `ext_c` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`recruit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='招聘信息表（面试登记表）';

-- ----------------------------
-- Records of recruit
-- ----------------------------
INSERT INTO `recruit` VALUES ('1', 'Jack', '1', '2019-03-30 15:36:28', '新乡学院', '2018-06-01', '2', '2', '1', '', '', '');
INSERT INTO `recruit` VALUES ('2', 'Tom', '1', '2018-08-28 00:00:00', '新乡学院', '2019-03-30', '2', '1', '1', null, null, null);
INSERT INTO `recruit` VALUES ('3', 'DD', '1', '2018-03-30 00:00:00', '河南科技学院', '2019-03-30', '4', '1', '1', '', '', '');

-- ----------------------------
-- Table structure for salary
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `salary_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '薪资单编号',
  `emp_id` int(11) DEFAULT NULL COMMENT '员工编号',
  `base_salary` double DEFAULT NULL COMMENT '基本工资',
  `achievements` double DEFAULT NULL COMMENT '绩效',
  `bonus` double DEFAULT NULL COMMENT '项目奖金',
  `check_deduction` double DEFAULT NULL COMMENT '考勤扣除',
  `sum_salary` double DEFAULT NULL COMMENT '实发工资',
  `salary_month` date DEFAULT NULL COMMENT '薪资月份',
  `salary_status` int(11) DEFAULT NULL COMMENT '薪资状态(1未发放2已发放)',
  `ext_a` varchar(200) DEFAULT NULL,
  `ext_b` varchar(200) DEFAULT NULL,
  `ext_c` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`salary_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary
-- ----------------------------
INSERT INTO `salary` VALUES ('4', '1', '2000', '20', '50', '30', '2040', '2019-03-01', '1', null, null, null);
INSERT INTO `salary` VALUES ('5', '2', '5000', '20', '20', '20', '5020', '2019-03-01', '2', '', '', '');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(20) DEFAULT NULL,
  `user_password` varchar(20) DEFAULT NULL,
  `role` int(11) DEFAULT NULL COMMENT '1超管 2 普通管理员',
  `create_time` datetime DEFAULT NULL,
  `user_status` int(11) DEFAULT '1' COMMENT '1正常 2 锁定 3删除',
  `ext_a` varchar(200) DEFAULT NULL,
  `ext_b` varchar(200) DEFAULT NULL,
  `ext_c` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'superadmin', 'superadmin', '1', '2019-03-22 23:04:13', '1', null, null, null);
INSERT INTO `user` VALUES ('2', 'lisi', 'lisi123456', '2', '2019-03-22 23:04:01', '1', null, null, null);
INSERT INTO `user` VALUES ('3', 'zhangsan', '123456', '2', '2019-03-23 11:23:33', '2', null, null, null);
INSERT INTO `user` VALUES ('4', 'wangwu', '1234563', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('5', 'maliu', '1234563', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('6', 'fengqi', '123456', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('7', 'zhangba', '123456', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('8', 'mijiu', '123456', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('9', 'gaoshi', '123456', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('10', 'zhaogao', '1234564', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('11', 'lizhi', '123456', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('12', 'huangsan', '123456', '2', '2019-03-23 11:23:33', '1', null, null, null);
INSERT INTO `user` VALUES ('13', 'liuzexuan', 'liuzexuan', '2', '2019-03-24 10:32:50', '1', null, null, null);
INSERT INTO `user` VALUES ('14', 'hahah', 'hahah', '2', '2019-03-24 10:37:53', '2', null, null, null);
