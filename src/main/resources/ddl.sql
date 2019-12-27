CREATE TABLE `dianpingdb`.`Untitled`  (
  `id` int(0) NOT NULL,
  `created_at` datetime(255) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `updated_at` datetime(0) NOT NULL DEFAULT '0000-00-00 00:00:00',
  `telphone` varchar(40) NOT NULL DEFAULT '',
  `password` varchar(200) NOT NULL DEFAULT '',
  `nick_name` varchar(40) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `telphone_nuique_index`(`telphone`) USING BTREE
);