CREATE TABLE `dianpingdb`. `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_at` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `update_at` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `telphone` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `password` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `nick_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `gender` int(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `telphone_unique_index`(`telphone`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

CREATE TABLE `dianpingdb`.`seller`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) NOT NULL DEFAULT '',
  `created_at` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `remark_score` decimal(2, 1) NOT NULL DEFAULT 0,
  `disabled_flag` decimal(0, 0) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
);