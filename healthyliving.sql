DROP DATABASE IF EXISTS `healthyliving`;
CREATE DATABASE `healthyliving`;

USE `healthyliving`;
DROP TABLE IF EXISTS `customers`;

CREATE TABLE `customers` (
  `customerId` int(11) NOT NULL Primary Key,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `street` varchar(80) NOT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(50) DEFAULT NULL,
  `zip` varchar(15) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) not null
 );
 DROP TABLE IF EXISTS `members`;

CREATE TABLE `members` (
  `memberId` int(11) NOT NULL Primary Key,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `street` varchar(80) NOT NULL,
  `city` varchar(50) NOT NULL,
  `state` varchar(50) DEFAULT NULL,
  `zip` varchar(15) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `phone` varchar(50) not null,
  `member_since` varchar(50) not null,
  `serviceId` int(10) not null
 );
CREATE TABLE `products` (
  `productId` int(11) NOT NULL Primary Key,
  `product_name` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL,
  `unit_cost` integer(10) NOT NULL,
  `quantity_in_hand` varchar(50) NOT NULL);
  
  CREATE TABLE `points` (
  `pointId` int(11) NOT NULL Primary Key,
  `memberId` int(10) NOT NULL,
  `points` int(10) NOT NULL,
  `member_date` varchar(10) NOT NULL,
  CONSTRAINT `member_id` FOREIGN KEY (`memberId`) REFERENCES `members` (`memberId`)) ;
  
  CREATE TABLE `invoice` (
  `invoiceId` int(11) NOT NULL Primary Key,
  `customerId` int(10) NOT NULL,
  `purchase_date` datetime NOT NULL,
  CONSTRAINT `customer_id` FOREIGN KEY (`customerId`) REFERENCES `customers` (`customerId`)) ;
 
 create table `inventory` (
 `inventoryId` int(10) not null Primary key,
 `productId` int(10) not null,
 `quantity` int(10),
 constraint `product_Id` FOREIGN KEY (`productId`) REFERENCES `products` (`productId`)) ;
 
  CREATE TABLE `cart` (
  `cartId` int(11) NOT NULL Primary Key,
  `invoiceId` int(10) NOT NULL,
   `inventoryId` int(10) NOT NULL,
  `quantity` int(10) NOT NULL,
  `unit_Price` varchar(10) NOT NULL,
  `discount` varchar(10),
  `total` varchar(30) not null,
   CONSTRAINT `invoice_id` FOREIGN KEY (`invoiceId`) REFERENCES `invoice` (`invoiceId`),
  CONSTRAINT `inventory_id` FOREIGN KEY (`inventoryId`) REFERENCES `inventory` (`inventoryId`)) ;