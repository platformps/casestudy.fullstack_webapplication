-- -----------------------------------------------------
-- Schema full-stack-ecommerce
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `full-stack-ecommerce`;

CREATE SCHEMA `full-stack-ecommerce`;
USE `full-stack-ecommerce` ;

-- -----------------------------------------------------
-- Table `full-stack-ecommerce`.`product_category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `full-stack-ecommerce`.`product_category` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `category_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `full-stack-ecommerce`.`product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `full-stack-ecommerce`.`product` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) DEFAULT NULL,
  `description` VARCHAR(255) DEFAULT NULL,
  `unit_price` DECIMAL(13,2) DEFAULT NULL,
  `image_url` VARCHAR(255) DEFAULT NULL,
  `units_in_stock` INT(11) DEFAULT NULL,
   `date_created` DATETIME(6) DEFAULT NULL,
   `brand` VARCHAR(255) DEFAULT NULL,
  `category_id` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_category` (`category_id`),
  CONSTRAINT `fk_category` FOREIGN KEY (`category_id`) REFERENCES `product_category` (`id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;
-- -----------------------------------------------------
-- Add sample data
-- -----------------------------------------------------
INSERT INTO PRODUCT_CATEGORY(CATEGORY_NAME) VALUES ('SMARTPHONE');
INSERT INTO PRODUCT_CATEGORY(CATEGORY_NAME) VALUES ('CAMERA');
INSERT INTO PRODUCT_CATEGORY(CATEGORY_NAME) VALUES ('COMPUTER');
INSERT INTO PRODUCT_CATEGORY(CATEGORY_NAME) VALUES ('TV');



-- smartphone



INSERT INTO PRODUCT (NAME, DESCRIPTION, IMAGE_URL, BRAND, UNITS_IN_STOCK,
UNIT_PRICE, CATEGORY_ID, DATE_CREATED)

VALUES ('BOOK-TECH-1000', 'JavaScript - The Fun Parts',
'assets/images/products/placeholder.png','DD'
,100,19.99,1, NOW());

INSERT INTO PRODUCT (NAME, DESCRIPTION, UNIT_PRICE, IMAGE_URL, UNITS_IN_STOCK, BRAND, CATEGORY_ID, DATE_CREATED)
VALUES ('iphone', 'iphone 11 64 Go', 999.99, 'assets/images/products/iphone1164Go.png', 50, 'iphone',1, NOW());


