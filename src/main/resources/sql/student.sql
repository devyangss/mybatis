CREATE TABLE `student` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL COMMENT '姓名',
  `gender` tinyint(1) unsigned NOT NULL COMMENT '性别,1-男;2-女',
  `age` tinyint(4) unsigned NOT NULL COMMENT '年龄',
  `idcard` varchar(18) NOT NULL COMMENT '身份证号',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_idcard` (`idcard`),
  KEY `idx_type` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='学生信息表';