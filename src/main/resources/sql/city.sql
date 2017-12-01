CREATE TABLE `province` (
  `id` int(11) unsigned NOT NULL,
  `status` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '1-正常;0-非正常',
  `type` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '1-省;2-直辖市;3-特别行政区;4-自治区',
  `code` int(11) unsigned NOT NULL COMMENT '代码',
  `name` varchar(30) NOT NULL DEFAULT '' COMMENT '名称',
  `create_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_code` (`code`),
  KEY `idx_code` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;