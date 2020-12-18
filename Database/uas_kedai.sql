-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2020 at 08:31 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas_kedai`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(20) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `kondisi` enum('Baik','Rusak') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `jumlah`, `kondisi`) VALUES
(1, 'Jam Dinding', 1, 'Baik');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `kode_menu` varchar(10) NOT NULL,
  `kategori` enum('Makanan','Minuman') NOT NULL,
  `nama_menu` varchar(30) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`kode_menu`, `kategori`, `nama_menu`, `harga`, `stok`) VALUES
('JUSAPK', 'Minuman', 'Jus Alpukat', 10000, 30),
('JUSAPL', 'Minuman', 'Jus Apel', 10000, 40),
('JUSJMB', 'Minuman', 'Jus Jambu', 10000, 15),
('JUSJRK', 'Minuman', 'Jus Jeruk', 10000, 20),
('JUSMGA', 'Minuman', 'Jus Mangga', 10000, 20),
('KTGGRG', 'Makanan', 'Kentang Goreng', 9000, 40),
('MIEGRG', 'Makanan', 'Mie Goreng', 15000, 60),
('OTKOTK', 'Makanan', 'Otak-otak', 8000, 80),
('PSGBKR', 'Makanan', 'Pisang Bakar', 10000, 50),
('RTBKR', 'Makanan', 'Roti Bakar', 12000, 70),
('SOSBKR', 'Makanan', 'Sosis Bakar', 12000, 50);

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails`
--

CREATE TABLE `orderdetails` (
  `id_order` int(11) NOT NULL,
  `no_faktur` varchar(20) NOT NULL,
  `nama_menu` varchar(30) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `jumlah` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orderdetails`
--

INSERT INTO `orderdetails` (`id_order`, `no_faktur`, `nama_menu`, `harga`, `jumlah`) VALUES
(1, 'FKT-0001', 'Pisang Bakar', 10000, 2),
(2, 'FKT-0001', 'Kentang Goreng', 9000, 2),
(3, 'FKT-0001', 'Jusel Apel', 10000, 1),
(4, 'FKT-0001', 'Jus Mangga', 10000, 1),
(12, 'FKT-0004', 'Jus Jeruk', 10000, 2),
(13, 'FKT-0004', 'Mie Goreng', 15000, 3),
(14, 'FKT-0004', 'Otak-otak', 8000, 1),
(15, 'FKT-0005', 'Jus Apel', 10000, 2),
(16, 'FKT-0005', 'Jus Mangga', 10000, 2),
(17, 'FKT-0005', 'Mie Goreng', 15000, 2),
(18, 'FKT-0005', 'Sosis Bakar', 12000, 4),
(19, 'FKT-0006', 'Jus Apel', 10000, 2),
(20, 'FKT-0006', 'Kentang Goreng', 9000, 2),
(21, 'FKT-0006', 'Mie Goreng', 15000, 2),
(22, 'FKT-0007', 'Kentang Goreng', 9000, 2),
(23, 'FKT-0007', 'Jus Jeruk', 10000, 3),
(24, 'FKT-0008', 'Jus Alpukat', 10000, 2),
(25, 'FKT-0008', 'Jus Jeruk', 10000, 2),
(26, 'FKT-0008', 'Kentang Goreng', 9000, 4);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `no_faktur` varchar(10) NOT NULL,
  `nama_kasir` varchar(20) NOT NULL,
  `nama_customer` varchar(20) NOT NULL,
  `tgl_order` date NOT NULL,
  `total` bigint(20) NOT NULL,
  `bayar` bigint(20) NOT NULL,
  `kembalian` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`no_faktur`, `nama_kasir`, `nama_customer`, `tgl_order`, `total`, `bayar`, `kembalian`) VALUES
('FKT-0001', 'Kasirudin', 'Launa', '2020-12-12', 50000, 100000, 50000),
('FKT-0002', 'Kasirudin', 'Rania', '2020-12-12', 80000, 100000, 20000),
('FKT-0003', 'Kasirudin', 'Kasir', '2020-12-18', 20000, 100000, 80000),
('FKT-0004', 'Kasirudin', 'Efron', '2020-12-16', 73000, 100000, 27000),
('FKT-0005', 'Arya Dwi Putra', 'Efronius', '2020-12-17', 118000, 150000, 32000),
('FKT-0006', 'Arya Dwi Putra', 'Lina', '2020-12-18', 68000, 100000, 32000),
('FKT-0007', 'Arya Dwi Putra', 'M. Ridwan', '2020-12-18', 48000, 50000, 2000),
('FKT-0008', 'Admin', 'Efron', '2020-12-18', 76000, 100000, 24000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `id_profile` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `level` enum('admin','kasir') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `id_profile`, `username`, `password`, `level`) VALUES
(500, 500, 'aryadptr', '123', 'admin'),
(501, 501, 'efron', '123', 'admin'),
(502, 502, 'aulia', '123', 'admin'),
(503, 503, 'kasir', '123', 'kasir'),
(504, 504, 'admin', '123', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `user_profile`
--

CREATE TABLE `user_profile` (
  `id_profile` int(11) NOT NULL,
  `nama_lengkap` varchar(30) NOT NULL,
  `jenis_kelamin` enum('Laki-laki','Perempuan') NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_profile`
--

INSERT INTO `user_profile` (`id_profile`, `nama_lengkap`, `jenis_kelamin`, `alamat`) VALUES
(9, 'admin', 'Laki-laki', 'Kopi Kita'),
(10, 'kasir', 'Laki-laki', 'Kopi Kita'),
(500, 'Arya Dwi Putra', 'Laki-laki', 'De Paris Residence'),
(501, 'Efronius Paduansi', 'Laki-laki', 'Manggarai Timur'),
(502, 'Ahmad Aulia Rahman Habibi', 'Laki-laki', 'Pagedangan'),
(503, 'Kasir', 'Laki-laki', 'Kopi Kita'),
(504, 'Admin', 'Laki-laki', 'Kopi Kita');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`kode_menu`);

--
-- Indexes for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD PRIMARY KEY (`id_order`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`no_faktur`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `user_profile`
--
ALTER TABLE `user_profile`
  ADD PRIMARY KEY (`id_profile`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `orderdetails`
--
ALTER TABLE `orderdetails`
  MODIFY `id_order` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=505;

--
-- AUTO_INCREMENT for table `user_profile`
--
ALTER TABLE `user_profile`
  MODIFY `id_profile` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=505;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
