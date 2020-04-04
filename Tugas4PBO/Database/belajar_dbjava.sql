-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Apr 2020 pada 09.00
-- Versi server: 10.4.8-MariaDB
-- Versi PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `belajar_dbjava`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nim` varchar(9) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`, `alamat`) VALUES
('123180100', 'Bayu Saputra', 'Jln Hayam Huruk No 99'),
('123180122', 'Torangto Situngkir', 'Jln Dirgantara III No 77'),
('123180129', 'Axel Frans', 'Jln Km 3'),
('123190024', 'Sandhika Galih', 'Jln Kenangan no 22'),
('123190100', 'Michael Subandio', 'Jln Pahlawan No 99'),
('123190112', 'Rini Salsabila', 'Jln Persada no 86');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
