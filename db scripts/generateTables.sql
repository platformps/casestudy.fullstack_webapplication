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


INSERT INTO PRODUCT (NAME, DESCRIPTION, UNIT_PRICE, IMAGE_URL, UNITS_IN_STOCK, BRAND, CATEGORY_ID, DATE_CREATED)
VALUES ('iphone', 'iphone 11 64 Go', 799.99, 'assets/images/products/iphone1164Go.png', 50, 'iphone',1, NOW());

INSERT INTO PRODUCT (NAME, DESCRIPTION, UNIT_PRICE, IMAGE_URL, UNITS_IN_STOCK, BRAND, CATEGORY_ID, DATE_CREATED)
VALUES ('iphone', 'iphone 11 128 Go', 999.99, 'assets/images/products/iphone11128Go.png', 50, 'iphone',1, NOW());

INSERT INTO PRODUCT (NAME, DESCRIPTION, UNIT_PRICE, IMAGE_URL, UNITS_IN_STOCK, BRAND, CATEGORY_ID, DATE_CREATED)
VALUES ('samsung', 'Samsung - Galaxy Note20 5G 128GB (Unlocked) - Mystic Gray', 999.99, 'assets/images/products/Samsung-GalaxyNote205G128GB.png', 50, 'samsung',1, NOW());


-- ---------------------
--  cameras
-- ---------------------


INSERT INTO PRODUCT (NAME, DESCRIPTION, UNIT_PRICE, IMAGE_URL, UNITS_IN_STOCK, BRAND, CATEGORY_ID, DATE_CREATED)
VALUES ('camera', 'Nikon - D3500 DSLR Video Two Lens Kit with AF-P DX NIKKOR 18-55mm f/3.5-5.6G VR & AF-P DX NIKKOR 70-300mm f/4.5-6.3G ED - Black',
 599.99, 'assets/images/products/NikonD3500.png', 50, 'nikon', 2, NOW());

INSERT INTO PRODUCT (NAME, DESCRIPTION, UNIT_PRICE, IMAGE_URL, UNITS_IN_STOCK, BRAND, CATEGORY_ID, DATE_CREATED)
VALUES ('camera', 'Canon - EOS Rebel T7 DSLR Video Two Lens Kit with EF-S 18-55mm and EF 75-300mm Lenses', 
599.99, 'assets/images/products/Canon-EOSRebel.png', 50, 'canon',1, NOW());

INSERT INTO PRODUCT (NAME, DESCRIPTION, UNIT_PRICE, IMAGE_URL, UNITS_IN_STOCK, BRAND, CATEGORY_ID, DATE_CREATED)
VALUES ('camera', 'Sony - Alpha a6000 Mirrorless Camera Two Lens Kit with 16-50mm and 55-210mm Lenses - Black',
 999.99, 'assets/images/products/sony-alpha.jpg', 50, 'sony',1, NOW());

