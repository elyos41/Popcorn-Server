-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 22 Mars 2017 à 23:58
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `popcorn`
--

-- --------------------------------------------------------

--
-- Structure de la table `age`
--

DROP TABLE IF EXISTS `age`;
CREATE TABLE IF NOT EXISTS `age` (
  `AgeId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `MinAge` int(10) unsigned DEFAULT NULL,
  `MaxAge` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`AgeId`),
  UNIQUE KEY `AgeId_UNIQUE` (`AgeId`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=57 ;

--
-- Vider la table avant d'insérer `age`
--

TRUNCATE TABLE `age`;
--
-- Contenu de la table `age`
--

INSERT INTO `age` (`AgeId`, `MinAge`, `MaxAge`) VALUES
(1, 0, 17),
(18, 18, 24),
(25, 25, 34),
(35, 35, 44),
(45, 45, 49),
(50, 50, 55),
(56, 56, 999);
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
