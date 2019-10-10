-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Oct 10, 2019 at 10:42 AM
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

--
-- Dumping data for table `orderan`
--

INSERT INTO `orderan` (`id_order`, `id_teknisi`, `kode`, `nama_pelanggan`, `alamat`, `phone`, `nama_barang`, `keluhan`, `tgl_order`) VALUES
(1, 1, 'N-34207', 'Irwan Gans', 'Banjarsari Kidul', '082243440959', 'Laptop ASUS ROG', 'Keyboard mati', '2019-10-04');

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
  `barang` varchar(255) DEFAULT NULL,
  `layanan` varchar(255) DEFAULT NULL,
  `harga_layanan` float DEFAULT NULL,
  `harga_barang` float DEFAULT NULL,
  `status` enum('tinjau','proses','selesai','refund') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reparasi`
--

INSERT INTO `reparasi` (`id_reparasi`, `id_order`, `barang`, `layanan`, `harga_layanan`, `harga_barang`, `status`) VALUES
(7, 1, 'Ganti Keyboard', 'Pasang Keyboard', 15000, 105000, 'selesai');

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

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `fullname`, `alamat`, `phone`) VALUES
(1, 'Irwan', 'Banjarsari Sokaraja, Banyunas', '082243440959'),
(2, 'Irwan', 'Banjarsari', '082243440959');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

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
  ADD KEY `FK_pembayaran_reparasi` (`id_reparasi`);

--
-- Indexes for table `reparasi`
--
ALTER TABLE `reparasi`
  ADD PRIMARY KEY (`id_reparasi`),
  ADD KEY `orderan` (`id_order`);

--
-- Indexes for table `teknisi`
--
ALTER TABLE `teknisi`
  ADD PRIMARY KEY (`id_teknisi`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `orderan`
--
ALTER TABLE `orderan`
  MODIFY `id_order` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id_pembayaran` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reparasi`
--
ALTER TABLE `reparasi`
  MODIFY `id_reparasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `teknisi`
--
ALTER TABLE `teknisi`
  MODIFY `id_teknisi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
  ADD CONSTRAINT `FK_pembayaran_reparasi` FOREIGN KEY (`id_reparasi`) REFERENCES `reparasi` (`id_reparasi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reparasi`
--
ALTER TABLE `reparasi`
  ADD CONSTRAINT `orderan` FOREIGN KEY (`id_order`) REFERENCES `orderan` (`id_order`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
