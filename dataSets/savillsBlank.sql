-- MySQL dump 10.13  Distrib 5.1.45, for Win32 (ia32)
--
-- Host: localhost    Database: savillstest
-- ------------------------------------------------------
-- Server version	5.1.45-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `com_fpdsavills_pr_address`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_address` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `postcode_` varchar(255) DEFAULT NULL,
  `line4_` varchar(255) DEFAULT NULL,
  `line3_` varchar(255) DEFAULT NULL,
  `line2_` varchar(255) DEFAULT NULL,
  `line1_` varchar(255) DEFAULT NULL,
  `country_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9208485891119933923 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_asset`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_asset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_asset` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_audience`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_audience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_audience` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `description_` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `size_` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_company`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_company` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `mainContact_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk to Contactable from company` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9207562194824509742 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_contactable`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_contactable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_contactable` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `notes_` varchar(255) DEFAULT NULL,
  `mainGroup_` bigint(20) DEFAULT NULL,
  `address_` bigint(20) DEFAULT NULL,
  `phone1_` bigint(20) DEFAULT NULL,
  `phone2_` bigint(20) DEFAULT NULL,
  `mobile_` bigint(20) DEFAULT NULL,
  `fax_` bigint(20) DEFAULT NULL,
  `email_` varchar(255) DEFAULT NULL,
  `www_` varchar(255) DEFAULT NULL,
  `status_` bigint(20) DEFAULT NULL,
  `created_` bigint(20) DEFAULT NULL,
  `lastUpdate_` bigint(20) DEFAULT NULL,
  `accountManager_` bigint(20) DEFAULT NULL,
  `knownAs_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `address fk` (`address_`),
  KEY `contactGr fk` (`mainGroup_`),
  KEY `contactst` (`status_`),
  KEY `fax fk` (`fax_`),
  KEY `mobile fk` (`mobile_`),
  KEY `phone1 fk` (`phone1_`),
  KEY `phone2 fk` (`phone2_`),
  CONSTRAINT `address fk` FOREIGN KEY (`address_`) REFERENCES `com_fpdsavills_pr_address` (`ID`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `contactGr fk` FOREIGN KEY (`mainGroup_`) REFERENCES `com_fpdsavills_pr_contactgroup` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `contactst` FOREIGN KEY (`status_`) REFERENCES `com_fpdsavills_pr_contactstatus` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fax fk` FOREIGN KEY (`fax_`) REFERENCES `com_fpdsavills_pr_phonenumber` (`ID`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `mobile fk` FOREIGN KEY (`mobile_`) REFERENCES `com_fpdsavills_pr_phonenumber` (`ID`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `phone1 fk` FOREIGN KEY (`phone1_`) REFERENCES `com_fpdsavills_pr_phonenumber` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `phone2 fk` FOREIGN KEY (`phone2_`) REFERENCES `com_fpdsavills_pr_phonenumber` (`ID`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9219063072954340678 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_contactable$to$contactevent`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_contactable$to$contactevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_contactable$to$contactevent` (
  `contactableID` bigint(20) NOT NULL,
  `contactEvent_` bigint(20) NOT NULL,
  PRIMARY KEY (`contactableID`,`contactEvent_`),
  KEY `fk to contactable` (`contactableID`),
  KEY `fk to ContactEvent` (`contactEvent_`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_contactevent`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_contactevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_contactevent` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `type_` bigint(20) DEFAULT NULL,
  `ourContact_` bigint(20) DEFAULT NULL,
  `theirContact_` bigint(20) DEFAULT NULL,
  `whenPlanned_` bigint(20) DEFAULT NULL,
  `whenHappened_` bigint(20) DEFAULT NULL,
  `content_` varchar(255) DEFAULT NULL,
  `title_` varchar(255) DEFAULT NULL,
  `followup_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=123456324234291 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_contacteventtype`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_contacteventtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_contacteventtype` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `code_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9483289428347929 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_contactgiventype`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_contactgiventype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_contactgiventype` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `telephone_` tinyint(1) DEFAULT NULL,
  `website_` tinyint(1) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9196690189977210960 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_contactgroup`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_contactgroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_contactgroup` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `description_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_contactstatus`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_contactstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_contactstatus` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `code_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_country`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_country` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `isoCode_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9135491446460223554 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_coverage`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_coverage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_coverage` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `story_` bigint(20) DEFAULT NULL,
  `publication_` bigint(20) DEFAULT NULL,
  `journalist_` bigint(20) DEFAULT NULL,
  `publicationDate_` bigint(20) DEFAULT NULL,
  `filename_` varchar(255) DEFAULT NULL,
  `content_` varchar(255) DEFAULT NULL,
  `title_` varchar(255) DEFAULT NULL,
  `evaluation_` float DEFAULT NULL,
  `centimetres_` float(13,10) DEFAULT NULL,
  `feature_` text,
  `contactDetails_` tinyint(1) DEFAULT NULL,
  `dateRead_` bigint(20) DEFAULT NULL,
  `comments_` varchar(255) DEFAULT NULL,
  `pictureDescription_` text,
  `pictureFile_` text,
  `mentionType_` bigint(20) DEFAULT NULL,
  `propertyNamed_` text,
  `office_` bigint(20) DEFAULT NULL,
  `division_` bigint(20) DEFAULT NULL,
  `researchReports_` tinyint(1) DEFAULT NULL,
  `marketComment_` tinyint(1) DEFAULT NULL,
  `contactGivenType_` bigint(20) DEFAULT NULL,
  `personNamed_` text,
  `pictureUsed_` tinyint(1) DEFAULT NULL,
  `pubDate` varchar(50) DEFAULT NULL,
  `national` int(11) DEFAULT NULL,
  `pubDate2` date DEFAULT NULL,
  `prManager_` bigint(20) DEFAULT NULL,
  `featureType_` bigint(20) DEFAULT NULL,
  `country_` bigint(20) DEFAULT NULL,
  `sequenceNumber_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9223188453633320472 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_coverage$to$quotedperson`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_coverage$to$quotedperson`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_coverage$to$quotedperson` (
  `coverageID` bigint(20) DEFAULT NULL,
  `quotedPerson_` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_division`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_division`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_division` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` text,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=8342444529561090829 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_employee`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_employee` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `current_` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk to Person From Employee` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5923606798335476372 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_featuretype`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_featuretype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_featuretype` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `code_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=4845302559418924805 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_journalist`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_journalist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_journalist` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `publication_` bigint(20) DEFAULT NULL,
  `frequency_` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk to PersonFromJournalist` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9219063072954340678 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_mappingtool`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_mappingtool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_mappingtool` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `internalValue_` varchar(255) DEFAULT NULL,
  `externalValue_` varchar(255) DEFAULT NULL,
  `attributeName_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9210566125201680477 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_mentiontype`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_mentiontype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_mentiontype` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` text,
  `code_` text,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5958157851729842092 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_message`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_message` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `description_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_office`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_office`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_office` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `description_` varchar(255) DEFAULT NULL,
  `name_` text,
  `region_` bigint(20) DEFAULT NULL,
  `managedBy_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk to Contactable from Office` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=8879731860407234272 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_office$to$allmanager`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_office$to$allmanager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_office$to$allmanager` (
  `officeID` bigint(20) DEFAULT NULL,
  `allManager_` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_person`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_person` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `company_` bigint(20) DEFAULT NULL,
  `jobTitle_` varchar(255) DEFAULT NULL,
  `lastName_` varchar(255) DEFAULT NULL,
  `title_` varchar(255) DEFAULT NULL,
  `firstName_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk to Contactable from person` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9219063072954340678 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_phonenumber`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_phonenumber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_phonenumber` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `areaCode_` varchar(255) DEFAULT NULL,
  `theNumber_` varchar(255) DEFAULT NULL,
  `countryCode_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9157723509991944743 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_pressrelease`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_pressrelease`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_pressrelease` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `story_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_prmanager`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_prmanager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_prmanager` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `fullName_` text,
  PRIMARY KEY (`ID`),
  KEY `fk to Person from PRManager` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=8269432452018398568 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_publication`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_publication`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_publication` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `description_` varchar(255) DEFAULT NULL,
  `publicationName_` varchar(255) DEFAULT NULL,
  `type_` bigint(20) DEFAULT NULL,
  `value_` float(13,10) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk to publicationtype` (`type_`),
  KEY `fk to Company from Publication` (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9207562194824509742 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_publication$to$audience`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_publication$to$audience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_publication$to$audience` (
  `publicationID` bigint(20) NOT NULL,
  `audience_` bigint(20) NOT NULL,
  PRIMARY KEY (`publicationID`,`audience_`),
  KEY `fk to Audience` (`audience_`),
  KEY `fk to publication` (`publicationID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_publicationtype`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_publicationtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_publicationtype` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` varchar(255) DEFAULT NULL,
  `code_` varchar(255) DEFAULT NULL,
  `value_` float(13,10) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9107102122869802756 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_region`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_region` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `name_` text,
  `code_` text,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6933970026811986390 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_sequencenumber`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_sequencenumber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_sequencenumber` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `suffix_` varchar(255) DEFAULT NULL,
  `prefix_` varchar(255) DEFAULT NULL,
  `digits_` int(11) DEFAULT NULL,
  `last_` int(11) DEFAULT NULL,
  `lastString_` varchar(255) DEFAULT NULL,
  `description_` text,
  `name_` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=5993980017393795575 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `com_fpdsavills_pr_story`
--

DROP TABLE IF EXISTS `com_fpdsavills_pr_story`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `com_fpdsavills_pr_story` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EntityName` varchar(255) DEFAULT NULL,
  `message_` bigint(20) DEFAULT NULL,
  `title_` varchar(255) DEFAULT NULL,
  `description_` varchar(255) DEFAULT NULL,
  `client_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2010-05-08 14:11:13
