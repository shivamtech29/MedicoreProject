-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 24, 2021 at 12:17 PM
-- Server version: 8.0.27
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `production`
--

-- --------------------------------------------------------

--
-- Table structure for table `ambulance`
--

DROP TABLE IF EXISTS `ambulance`;
CREATE TABLE IF NOT EXISTS `ambulance` (
  `Vehicle ID` varchar(10) NOT NULL,
  `Driver` varchar(30) NOT NULL,
  `Capacity` varchar(1) NOT NULL,
  PRIMARY KEY (`Vehicle ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE IF NOT EXISTS `appointment` (
  `ID` varchar(15) NOT NULL,
  `Token` varchar(15) DEFAULT NULL,
  `Date` varchar(10) NOT NULL,
  `Issue` varchar(15) NOT NULL,
  `Bill Amt` varchar(6) NOT NULL,
  `Details` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `patientreg`
--

DROP TABLE IF EXISTS `patientreg`;
CREATE TABLE IF NOT EXISTS `patientreg` (
  `ID` varchar(15) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `DOB` varchar(10) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Phone No` varchar(10) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `ID` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Type` varchar(15) NOT NULL,
  `Qualification` varchar(50) NOT NULL,
  `Specialization` varchar(50) DEFAULT NULL,
  `DOB` varchar(10) NOT NULL,
  `DOJ` varchar(10) NOT NULL,
  `Experience` varchar(2) NOT NULL,
  `Gender` varchar(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`ID`, `Password`, `Name`, `Type`, `Qualification`, `Specialization`, `DOB`, `DOJ`, `Experience`, `Gender`) VALUES
('admin', 'adm123', 'shivam', 'Admin', 'BTech', 'CSE', '10/10/1010', '11/11/1111', '1', 'M');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
