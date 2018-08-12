-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 24, 2015 at 08:58 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `airlinedatabase`
--
CREATE DATABASE `airlinedatabase` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `airlinedatabase`;

-- --------------------------------------------------------

--
-- Table structure for table `cancelseat`
--

CREATE TABLE IF NOT EXISTS `cancelseat` (
  `tnumber` bigint(100) NOT NULL,
  `flightid` bigint(100) NOT NULL,
  `custid` bigint(100) NOT NULL,
  `noofseats` int(100) NOT NULL,
  PRIMARY KEY (`tnumber`,`flightid`,`custid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `custdetail`
--

CREATE TABLE IF NOT EXISTS `custdetail` (
  `custid` bigint(100) NOT NULL,
  `custname` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `address` varchar(100) NOT NULL,
  `images` varchar(100) NOT NULL,
  PRIMARY KEY (`custid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `custdetail`
--

INSERT INTO `custdetail` (`custid`, `custname`, `fname`, `gender`, `dob`, `address`, `images`) VALUES
(105, 'Vegeta', 'Akira Toriyama', 'Male', '2004-07-01', 'IN Animes of DBZ', 'images\\1437580149097_Vegetapass.png'),
(106, 'Goku', 'Akira Toriyam', 'Male', '2004-07-01', 'IN Animes of DBZ', 'images\\1437580423738_Goku.png'),
(107, 'Katrina Kaif', 'xyz', 'Female', '1990-07-12', 'Top Secret', 'images\\1437720704827_KK.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `destination`
--

CREATE TABLE IF NOT EXISTS `destination` (
  `destination` varchar(100) NOT NULL,
  PRIMARY KEY (`destination`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `destination`
--

INSERT INTO `destination` (`destination`) VALUES
('Amritsar'),
('Auckland'),
('Bangkok'),
('Canada'),
('Chennai'),
('Dubai'),
('Goa'),
('Gurgaon'),
('Kerala'),
('London'),
('Melbourne'),
('New Delhi'),
('Papatoye'),
('Perth'),
('Rome'),
('Toronto');

-- --------------------------------------------------------

--
-- Table structure for table `employeetable`
--

CREATE TABLE IF NOT EXISTS `employeetable` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `images` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeetable`
--

INSERT INTO `employeetable` (`username`, `password`, `images`) VALUES
('rahul', '123', 'images\\default.JPG');

-- --------------------------------------------------------

--
-- Table structure for table `flightdetail`
--

CREATE TABLE IF NOT EXISTS `flightdetail` (
  `flighid` bigint(100) NOT NULL,
  `flightname` varchar(100) NOT NULL,
  `source` varchar(100) NOT NULL,
  `dept` varchar(100) NOT NULL,
  `fligchrges` int(100) NOT NULL,
  `dest` varchar(100) NOT NULL,
  `arrtym` varchar(100) NOT NULL,
  `dod` date NOT NULL,
  PRIMARY KEY (`flighid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `flightdetail`
--

INSERT INTO `flightdetail` (`flighid`, `flightname`, `source`, `dept`, `fligchrges`, `dest`, `arrtym`, `dod`) VALUES
(4000, 'Emirates', 'New Delhi', '1pm', 32000, 'Perth', '6am', '2015-07-25'),
(4001, 'Spice Jet', 'Bangalore', '2am', 36000, 'Toronto', '10pm', '2015-07-31'),
(4002, 'Emirates', 'Amritsar', '10pm', 29000, 'Melbourne', '9am', '2015-07-29'),
(4003, 'Indian Airlines', 'Chennai', '2am', 33000, 'Perth', '5pm', '2015-08-01'),
(4004, 'Spice Jet', 'Gurgaon', '2pm', 2400, 'Amritsar', '5pm', '2015-07-27'),
(4005, 'Kingfisher', 'Amritsar', '9 AM', 10000, 'Auckland', '6 AM', '2015-07-24'),
(4006, 'Rajdhani Express', 'New Delhi', '9 AM', 50000, 'Canada', '6 AM', '2015-07-30');

-- --------------------------------------------------------

--
-- Table structure for table `flightinfo`
--

CREATE TABLE IF NOT EXISTS `flightinfo` (
  `flid` bigint(100) NOT NULL,
  `flightname` varchar(100) NOT NULL,
  `source` varchar(100) NOT NULL,
  `departure` int(100) NOT NULL,
  `fcharges` int(100) NOT NULL,
  `seat` int(100) NOT NULL,
  `dest` varchar(100) NOT NULL,
  `arrtym` int(100) NOT NULL,
  PRIMARY KEY (`flid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `flist`
--

CREATE TABLE IF NOT EXISTS `flist` (
  `source` varchar(100) NOT NULL,
  `dest` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `newuser`
--

CREATE TABLE IF NOT EXISTS `newuser` (
  `username` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `newuser`
--

INSERT INTO `newuser` (`username`, `pwd`) VALUES
('aman', '123');

-- --------------------------------------------------------

--
-- Table structure for table `passlist`
--

CREATE TABLE IF NOT EXISTS `passlist` (
  `fligid` bigint(100) NOT NULL,
  PRIMARY KEY (`fligid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `paybycredit`
--

CREATE TABLE IF NOT EXISTS `paybycredit` (
  `credcardno` bigint(100) NOT NULL,
  `cvv` int(100) NOT NULL,
  `expiryyr` int(100) NOT NULL,
  `cardtype` varchar(100) NOT NULL,
  PRIMARY KEY (`credcardno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paybycredit`
--

INSERT INTO `paybycredit` (`credcardno`, `cvv`, `expiryyr`, `cardtype`) VALUES
(21, 34, 123213, 'MASTER CARD'),
(102, 2432, 2050, 'MASTER CARD'),
(123324, 23423, 24332, 'MASTER CARD'),
(145678912, 786, 2026, 'VISA');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE IF NOT EXISTS `payment` (
  `tcktno` bigint(100) NOT NULL,
  `custid` bigint(20) NOT NULL,
  `flightid` bigint(20) NOT NULL,
  `amount` int(100) NOT NULL,
  `pmode` varchar(100) NOT NULL,
  PRIMARY KEY (`tcktno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`tcktno`, `custid`, `flightid`, `amount`, `pmode`) VALUES
(10000, 101, 4000, 32000, 'CASH'),
(10001, 100, 4001, 36000, 'CREDIT CARD'),
(10003, 105, 2121, 35000, 'CREDIT CARD'),
(10004, 107, 4006, 50000, 'CREDIT CARD');

-- --------------------------------------------------------

--
-- Table structure for table `sourcetable`
--

CREATE TABLE IF NOT EXISTS `sourcetable` (
  `source` varchar(100) NOT NULL,
  PRIMARY KEY (`source`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sourcetable`
--

INSERT INTO `sourcetable` (`source`) VALUES
('Amritsar'),
('Bangalore'),
('Chennai'),
('Gurgaon'),
('New Delhi'),
('UAE'),
('USA');

-- --------------------------------------------------------

--
-- Table structure for table `ticketenquiry`
--

CREATE TABLE IF NOT EXISTS `ticketenquiry` (
  `custid` bigint(100) NOT NULL,
  `ticketid` bigint(100) NOT NULL,
  `flightid` bigint(100) NOT NULL,
  `flightname` varchar(100) NOT NULL,
  `seatno` int(100) NOT NULL,
  `fare` int(100) NOT NULL,
  `dateofjour` varchar(100) NOT NULL,
  PRIMARY KEY (`custid`,`flightid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `treser`
--

CREATE TABLE IF NOT EXISTS `treser` (
  `source` varchar(100) NOT NULL,
  `dest` varchar(100) NOT NULL,
  `tno` int(100) NOT NULL,
  `custid1` bigint(100) NOT NULL,
  `custname1` varchar(100) NOT NULL,
  `fname1` varchar(100) NOT NULL,
  `gender1` varchar(100) NOT NULL,
  `dob1` varchar(100) NOT NULL,
  `address1` varchar(100) NOT NULL,
  `flid` bigint(100) NOT NULL,
  `departuretime` varchar(100) NOT NULL,
  `flightname` varchar(100) NOT NULL,
  `doj` date NOT NULL,
  `flightcharges` int(100) NOT NULL,
  `flightclass` varchar(100) NOT NULL,
  `seatno` int(100) NOT NULL,
  PRIMARY KEY (`tno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `treser`
--

INSERT INTO `treser` (`source`, `dest`, `tno`, `custid1`, `custname1`, `fname1`, `gender1`, `dob1`, `address1`, `flid`, `departuretime`, `flightname`, `doj`, `flightcharges`, `flightclass`, `seatno`) VALUES
('New Delhi', 'Perth', 10000, 101, 'Kavinder Singh', 'S.Surinder Singh', 'Male', '1993-02-20', 'Miani,Punjab', 4000, '1pm', 'Emirates', '2015-07-25', 32000, 'Bussiness', 1),
('Bangalore', 'Toronto', 10001, 100, 'Harmeet Singh', 'S.Gurvinder Singh', 'Male', '1994-08-13', 'Jalandhar,Punjab', 4001, '2am', 'Spice Jet', '2015-07-31', 36000, 'Bussiness', 1),
('New Delhi', 'Perth', 10002, 102, 'Harman Saini', 'S.Saini', 'Male', '1993-06-21', 'Bhangala,Punjab', 4000, '1pm', 'Emirates', '2015-07-25', 32000, 'buss', 3),
('Amritsar', 'Auckland', 10003, 106, 'Goku', 'Akira Toriyam', 'Male', '2004-07-01', 'IN Animes of DBZ', 234, '123', 'dfdgdf3', '2015-07-09', 342342, 'bus', 3),
('New Delhi', 'Canada', 10004, 107, 'Katrina Kaif', 'xyz', 'Female', '1990-07-12', 'Top Secret', 4006, '9 AM', 'Rajdhani Express', '2015-07-30', 50000, 'bussiness', 2);

-- --------------------------------------------------------

--
-- Table structure for table `updation`
--

CREATE TABLE IF NOT EXISTS `updation` (
  `custid` bigint(100) NOT NULL,
  `custname` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  PRIMARY KEY (`custid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `viewcust`
--

CREATE TABLE IF NOT EXISTS `viewcust` (
  `custid` bigint(100) NOT NULL,
  `custname` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `pno` int(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  PRIMARY KEY (`custid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
