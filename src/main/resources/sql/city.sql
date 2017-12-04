CREATE TABLE `city` (
  `id` int(11) unsigned NOT NULL,
  `status` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '1-正常;0-非正常',
  `province_id` int(11) unsigned NOT NULL COMMENT '省ID',
  `code` int(11) unsigned NOT NULL COMMENT '代码',
  `name` varchar(30) DEFAULT NULL COMMENT '名称',
  `create_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_code` (`code`),
  KEY `idx_province_id` (`province_id`),
  KEY `idx_code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;