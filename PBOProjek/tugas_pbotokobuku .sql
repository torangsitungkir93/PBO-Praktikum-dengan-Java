-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2020 at 08:58 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tugas_pbotokobuku`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id` int(11) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `ISBN` varchar(50) NOT NULL,
  `suplier` int(11) NOT NULL,
  `tahun` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id`, `judul`, `kategori`, `penerbit`, `ISBN`, `suplier`, `tahun`, `harga`, `stok`) VALUES
(1, 'Fisika Kuantum II', 'Sains', 'Erlangga', '978-3-16-148410-0', 1, '2017', 77000, 5),
(3, 'Journey to The Center of The Earth', 'Sains-Fiksi', 'Pustaka Lebah', '978-602-8798-81-5', 16, '2016', 212000, 3),
(4, 'Cosmos', 'Sains-Fiksi', 'CV Global Indo', '978-602-424-224-4', 3, '2016', 170000, 10),
(5, 'The Magic of Reality', 'Sains-Fiksi', 'CV Global Indo', '978-602-53696-0-5', 3, '2018', 240000, 11),
(6, 'The Da Vinci Code', 'Sains-Fiksi', 'Bentang Pustaka', '978-602-291-184-5', 5, '2016', 150000, 7),
(7, 'The Hobbit', 'Fiksi', 'PT. Gramedia', '978-602-06-1737-4', 5, '2018', 180000, 7),
(8, 'Dear Nathan', 'Romance', 'PT. Melvana Media', '978-602-7870-41-3', 2, '2014', 110000, 15),
(9, 'Laskar Pelangi', 'Fiksi', 'Bentang Pustaka', '978-602-291-662-8', 4, '2013', 120000, 9),
(10, 'Sang Pemimpi', 'Fiksi', 'Bentang Pustaka', '978-602-291-663-5', 4, '2015', 135000, 5),
(11, 'Harry Potter and The Cursed Child', 'Fiksi', 'PT. Gramedia', '978-602-03-8620-1', 7, '2005', 95000, 13);

-- --------------------------------------------------------

--
-- Table structure for table `catatan_transaksi`
--

CREATE TABLE `catatan_transaksi` (
  `id` int(11) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `id_buku` int(11) NOT NULL,
  `buyer` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `catatan_transaksi`
--

INSERT INTO `catatan_transaksi` (`id`, `tanggal`, `id_buku`, `buyer`, `jumlah`, `harga`, `total`) VALUES
(1, '12-05-2000', 1, 'Rifky Wahyu', 3, 12000, 36000),
(2, '13-05-2020', 1, 'Torangto Situngkir', 2, 4, 154000),
(3, '13-05-2020', 1, 'Torangto Situngkir', 2, 4, 154000),
(4, '13-05-2020', 1, 'Torangto Situngkir', 2, 4, 154000),
(5, '13-05-2020', 1, 'Atta Halilintar', 2, 4, 154000),
(6, '13-05-2020', 1, '1', 4, 4, 308000),
(7, '13-05-2020', 1, 'Yanthol', 3, 5, 231000);

-- --------------------------------------------------------

--
-- Table structure for table `hak_akses`
--

CREATE TABLE `hak_akses` (
  `id` int(11) NOT NULL,
  `jabatan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hak_akses`
--

INSERT INTO `hak_akses` (`id`, `jabatan`) VALUES
(1, 'Admin'),
(2, 'Kasir');

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_hp` varchar(50) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `suplier`
--

INSERT INTO `suplier` (`id`, `nama`, `no_hp`, `alamat`) VALUES
(1, 'PT. Cahaya Simpati Grafika', '081397752892', 'Jln KI Hajar Dewantara'),
(2, 'CV. Media Wacana', '081372549622', 'Jl pemuda'),
(3, 'PT. Citra Menara Sakti', '083776285621', 'Jl. Rungkut Asri I/7, Surabaya, Jawa Timur, Indonesia'),
(4, 'PT Thea Theo Stationary', '081647628464', 'Gedung SME Tower (SMESCO) Lt. 10 Jl. Jendral'),
(5, 'CV. Rg Promosindo Pratama', '081649675839', 'Kawasan Milenium Industrial Estate Blok O2 No. 2A'),
(6, 'PT Kreasi Senifika Mandiri', '082657738574', 'Jambu VIII/G59 Waru - Sidoarjo, Sidoarjo, Jawa Timur'),
(7, 'PT Thea Theo Stationary', '081647628464', 'Gedung SME Tower (SMESCO) Lt. 10 Jl. Jendral'),
(16, 'PT Thea Theo Stationary', '081647628464', 'Gedung SME Tower (SMESCO) Lt. 10 Jl. Jendral'),
(17, 'Toko Buku Togamas', '(0274) 544626', 'Jl. Affandi No.5'),
(18, 'Periplus Malioboro Mall', '087792966072', 'Malioboro Mall Lantai LG Kav. 9--11');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(12) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `gender` varchar(3) NOT NULL,
  `password` varchar(50) NOT NULL DEFAULT '123',
  `level` int(11) NOT NULL,
  `no_hp` varchar(50) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `nama`, `gender`, `password`, `level`, `no_hp`, `alamat`) VALUES
('admin', 'Torangto Situngkir', 'L', 'admin', 1, '081397752892', 'Jln Pemuda'),
('amiras', 'Amira Salsabila', 'P', '123', 2, '083344556677', 'Jl. Sembarang'),
('joolianw', 'Julian Wahyu', 'L', '123', 2, '087766449922', 'Jl. Kuda'),
('kasir', 'Putri', 'P', 'kasir', 2, '08139664821', 'Jln Kenangan'),
('mantap', 'Ganteng Sekali', 'L', '123', 2, '080822224444', 'Jln Flamboyan'),
('rangtorang', 'Torangto S', 'L', '123', 2, '082244556666', 'Jl. Kudanil'),
('rifqy', 'Rifqy Wahyu', 'L', '123', 2, '080888882222', 'Jl. Cendana');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id`),
  ADD KEY `suplier` (`suplier`);

--
-- Indexes for table `catatan_transaksi`
--
ALTER TABLE `catatan_transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_buku` (`id_buku`);

--
-- Indexes for table `hak_akses`
--
ALTER TABLE `hak_akses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`),
  ADD KEY `level` (`level`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `catatan_transaksi`
--
ALTER TABLE `catatan_transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `hak_akses`
--
ALTER TABLE `hak_akses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `suplier`
--
ALTER TABLE `suplier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `buku_ibfk_1` FOREIGN KEY (`suplier`) REFERENCES `suplier` (`id`);

--
-- Constraints for table `catatan_transaksi`
--
ALTER TABLE `catatan_transaksi`
  ADD CONSTRAINT `catatan_transaksi_ibfk_1` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`level`) REFERENCES `hak_akses` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
