-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2020 at 07:48 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `website_2`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `username`, `password`) VALUES
(1, 'TAMAL', '654884'),
(2, 'ASHIK', '6783939'),
(3, 'SHUVO', '7899494'),
(4, 'RAHIM', '7589444'),
(5, 'MARUFUL', '96868985'),
(6, 'RAHMAN', '67585995'),
(7, 'SAHA', '2574848'),
(8, 'JAMAL', '8990955'),
(10, 'aaa', ' 22222'),
(11, 'Eren Yeager', '1234567'),
(12, 'Armin', '123456'),
(14, 'Lelouch Vi Beitinnia', '030303');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `food_item` varchar(80) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `contact` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `name`, `food_item`, `price`, `contact`) VALUES
(1, 'TAMAL', 'Chicken Tawa Jhal Fry', 180, ' +880191111111'),
(2, 'ASHIK', 'Chicken Liver Tawa JHAL Fry', 190, '+880194444223'),
(3, 'SHUVO', 'Mutton Tawa Jhal Fry', 210, '+880193333333'),
(7, ' SAHA', 'Chicken Roll  ', 140, '012655322');

-- --------------------------------------------------------

--
-- Table structure for table `restuarant`
--

CREATE TABLE `restuarant` (
  `id` int(11) NOT NULL,
  `food_item` varchar(100) DEFAULT NULL,
  `quantity` varchar(80) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `special_discount` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `restuarant`
--

INSERT INTO `restuarant` (`id`, `food_item`, `quantity`, `price`, `special_discount`) VALUES
(1, 'Chicken Tawa Jhal Fry', 'One Plate', 180, 'Twenty Taka'),
(2, 'Chicken Liver Tawa JHAL Fry', 'One Plate', 190, ' Fifteen Taka'),
(3, 'Mutton Tawa Jhal Fry', 'One Plate', 210, 'Twenty Taka'),
(4, ' Rupchanda Fish Kabab', 'One Piece', 250, 'Ten  Taka'),
(5, ' Beef Roll', 'One Piece', 120, 'Twenty Taka'),
(6, 'Mutton Khiri Kabab', 'One Sheek', 110, 'Ten  Taka'),
(7, 'Ichiraku Ramen', 'One Bowl', 555, 'Fifty Taka'),
(8, 'Ramen Noodles Soup', 'two piece', 2222, 'zero');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `restuarant`
--
ALTER TABLE `restuarant`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customer`
--
ALTER TABLE `customer`
  ADD CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`id`) REFERENCES `account` (`id`);

--
-- Constraints for table `restuarant`
--
ALTER TABLE `restuarant`
  ADD CONSTRAINT `fk_id` FOREIGN KEY (`id`) REFERENCES `account` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
