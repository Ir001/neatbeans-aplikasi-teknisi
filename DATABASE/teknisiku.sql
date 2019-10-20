-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 20, 2019 at 07:14 AM
-- Server version: 10.2.3-MariaDB-log
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teknisiku`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`) VALUES
(1, 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `jasa`
--

CREATE TABLE `jasa` (
  `id_jasa` int(11) NOT NULL,
  `nama_jasa` varchar(255) DEFAULT NULL,
  `harga_jasa` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jasa`
--

INSERT INTO `jasa` (`id_jasa`, `nama_jasa`, `harga_jasa`) VALUES
(1, 'Tidak ada', 0),
(2, 'Servis ringan', 20000),
(3, 'Servis sedang', 50000),
(4, 'Servis berat', 80000),
(5, 'Ganti LCD', 100000),
(6, 'Ganti keyboard', 50000),
(7, 'Ganti mousepad', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `orderan`
--

CREATE TABLE `orderan` (
  `id_order` int(11) NOT NULL,
  `id_teknisi` int(11) NOT NULL DEFAULT 0,
  `kode` varchar(50) DEFAULT NULL,
  `nama_pelanggan` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `phone` varchar(88) DEFAULT NULL,
  `nama_barang` varchar(255) DEFAULT NULL,
  `keluhan` varchar(255) DEFAULT NULL,
  `tgl_order` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` int(11) NOT NULL,
  `id_reparasi` int(11) DEFAULT NULL,
  `id_admin` int(11) DEFAULT NULL,
  `tgl_bayar` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reparasi`
--

CREATE TABLE `reparasi` (
  `id_reparasi` int(11) NOT NULL,
  `id_order` int(11) DEFAULT NULL,
  `id_sparepart` int(11) DEFAULT NULL,
  `id_jasa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `sparepart`
--

CREATE TABLE `sparepart` (
  `id_sparepart` int(11) NOT NULL,
  `nama_part` varchar(255) DEFAULT NULL,
  `harga_part` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sparepart`
--

INSERT INTO `sparepart` (`id_sparepart`, `nama_part`, `harga_part`) VALUES
(1, 'Keyboard', 120000),
(2, 'LCD', 600000),
(3, 'Mousepad', 120000),
(4, 'Speaker', 50000),
(5, 'Driver', 40000);

-- --------------------------------------------------------

--
-- Table structure for table `teknisi`
--

CREATE TABLE `teknisi` (
  `id_teknisi` int(11) NOT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `spesialis` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teknisi`
--

INSERT INTO `teknisi` (`id_teknisi`, `fullname`, `spesialis`) VALUES
(1, 'Teknisi 1', 'LCD'),
(2, 'Teknisi 2', 'HDD');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `jasa`
--
ALTER TABLE `jasa`
  ADD PRIMARY KEY (`id_jasa`);

--
-- Indexes for table `orderan`
--
ALTER TABLE `orderan`
  ADD PRIMARY KEY (`id_order`),
  ADD KEY `FK_orderan_teknisi` (`id_teknisi`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `FK_pembayaran_reparasi` (`id_reparasi`),
  ADD KEY `FK_pembayaran_admin` (`id_admin`);

--
-- Indexes for table `reparasi`
--
ALTER TABLE `reparasi`
  ADD PRIMARY KEY (`id_reparasi`),
  ADD KEY `FK_reparasi_orderan` (`id_order`),
  ADD KEY `FK_reparasi_sparepart` (`id_sparepart`),
  ADD KEY `FK_reparasi_jasa` (`id_jasa`);

--
-- Indexes for table `sparepart`
--
ALTER TABLE `sparepart`
  ADD PRIMARY KEY (`id_sparepart`);

--
-- Indexes for table `teknisi`
--
ALTER TABLE `teknisi`
  ADD PRIMARY KEY (`id_teknisi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `jasa`
--
ALTER TABLE `jasa`
  MODIFY `id_jasa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `orderan`
--
ALTER TABLE `orderan`
  MODIFY `id_order` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id_pembayaran` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reparasi`
--
ALTER TABLE `reparasi`
  MODIFY `id_reparasi` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sparepart`
--
ALTER TABLE `sparepart`
  MODIFY `id_sparepart` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `teknisi`
--
ALTER TABLE `teknisi`
  MODIFY `id_teknisi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orderan`
--
ALTER TABLE `orderan`
  ADD CONSTRAINT `FK_orderan_teknisi` FOREIGN KEY (`id_teknisi`) REFERENCES `teknisi` (`id_teknisi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `FK_pembayaran_admin` FOREIGN KEY (`id_admin`) REFERENCES `admin` (`id_admin`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_pembayaran_reparasi` FOREIGN KEY (`id_reparasi`) REFERENCES `reparasi` (`id_reparasi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reparasi`
--
ALTER TABLE `reparasi`
  ADD CONSTRAINT `FK_reparasi_jasa` FOREIGN KEY (`id_jasa`) REFERENCES `jasa` (`id_jasa`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_reparasi_orderan` FOREIGN KEY (`id_order`) REFERENCES `orderan` (`id_order`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_reparasi_sparepart` FOREIGN KEY (`id_sparepart`) REFERENCES `sparepart` (`id_sparepart`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
