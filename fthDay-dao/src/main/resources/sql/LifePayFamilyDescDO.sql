-- auto Generated on 2017-09-09 13:04:48 
-- DROP TABLE IF EXISTS `life_pay_family_desc`; 
CREATE TABLE `life_pay_family_desc`(
    `desc_id` INT (11) NOT NULL AUTO_INCREMENT COMMENT 'descId',
    `content` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'Content',
    PRIMARY KEY (`desc_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`life_pay_family_desc`';
