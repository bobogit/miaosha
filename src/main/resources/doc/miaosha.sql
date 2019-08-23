/*
 Navicat Premium Data Transfer

 Source Server         : 秒杀
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : 192.168.1.48:3306
 Source Schema         : miaosha

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 23/08/2019 17:50:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `gender` tinyint(4) NOT NULL DEFAULT 0,
  `age` int(11) NOT NULL,
  `telphone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `register_mode` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `third_party_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (1, '第一个用户', 1, 30, '13636699338', 'byPhone', '');

-- ----------------------------
-- Table structure for user_password
-- ----------------------------
DROP TABLE IF EXISTS `user_password`;
CREATE TABLE `user_password`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `encrpt_password` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_password
-- ----------------------------
INSERT INTO `user_password` VALUES (1, 'fdafdsafda', 1);

SET FOREIGN_KEY_CHECKS = 1;
