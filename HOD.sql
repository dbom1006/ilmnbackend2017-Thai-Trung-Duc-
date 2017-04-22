-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2017 at 07:26 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `HOD`
--

-- --------------------------------------------------------

--
-- Table structure for table `availability`
--

CREATE TABLE `availability` (
  `id` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `day` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `time` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `available` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `availability`
--

INSERT INTO `availability` (`id`, `idUser`, `day`, `time`, `available`) VALUES
(2, 1, 'MON', '7-9', 1),
(3, 1, 'MON', '9-10', 1),
(4, 1, 'THU', '10-10.5', 1),
(1, 1, 'TUE', '7-9', 0),
(5, 2, 'THU', '10-10.5', 1),
(6, 3, 'WED', '9-10', 1),
(7, 4, 'SUN', '15-17', 1),
(15, 5, 'MON', '7-9', 1),
(8, 5, 'SAT', '10.5-15', 1),
(9, 6, 'FRI', '7-9', 1),
(10, 7, 'MON', '7-9', 0),
(11, 8, 'TUE', '9-10', 1),
(12, 9, 'THU', '9-10', 1),
(14, 10, 'SAT', '10-10.5', 1),
(13, 10, 'THU', '9-10', 0);

-- --------------------------------------------------------

--
-- Table structure for table `contract`
--

CREATE TABLE `contract` (
  `id` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  `idAvailability` int(11) NOT NULL,
  `timeCreate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `contract`
--

INSERT INTO `contract` (`id`, `idUser`, `idAvailability`, `timeCreate`) VALUES
(1, 11, 15, '2017-04-22');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstName` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `lastName` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `isSeller` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `firstName`, `lastName`, `isSeller`) VALUES
(1, 'Đức', 'Thái Trung', 1),
(2, 'Tuấn', 'Phạm Như Ngọc', 1),
(3, '1', 'Nguyen Van', 1),
(4, '2', 'Nguyen Van', 1),
(5, '3', 'Nguyen Van', 1),
(6, '4', 'Nguyen Van', 1),
(7, '5', 'Nguyen Van', 1),
(8, '6', 'Nguyen Van', 1),
(9, '7', 'Nguyen Van', 1),
(10, '8', 'Nguyen Van', 1),
(11, 'Buyer', 'New', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `availability`
--
ALTER TABLE `availability`
  ADD PRIMARY KEY (`idUser`,`day`,`time`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `contract`
--
ALTER TABLE `contract`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `availability`
--
ALTER TABLE `availability`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `contract`
--
ALTER TABLE `contract`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
