CREATE TABLE `area` (
  `id` int(11) unsigned NOT NULL,
  `status` tinyint(4) unsigned NOT NULL COMMENT '1-正常;0-非正常',
  `city_id` int(11) unsigned NOT NULL COMMENT '市ID',
  `code` int(11) unsigned NOT NULL COMMENT '代码',
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '名称',
  `create_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_code` (`code`),
  KEY `idx_code` (`code`),
  KEY `idx_city_id` (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;