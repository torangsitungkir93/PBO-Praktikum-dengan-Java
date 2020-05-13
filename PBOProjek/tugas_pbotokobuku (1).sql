-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Bulan Mei 2020 pada 09.14
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
-- Database: `tugas_pbotokobuku`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
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
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`id`, `judul`, `kategori`, `penerbit`, `ISBN`, `suplier`, `tahun`, `harga`, `stok`) VALUES
(1, 'Fisika Kuantum II', 'Sains', 'Erlangga', '978-3-16-148410-0', 1, '2017', 77000, 0),
(2, 'ROBIN HOOD', 'Fiksi', 'Elex Media Komputindo', '9789792763379', 1, '2012', 80000, 3),
(3, 'Musashi', 'Fiksi', 'Elex Media Komputindo', '979-655-603-0', 1, '2001', 67000, 2),
(4, 'Samudra di Ujung Jalan Setapak', 'Fabel', 'Gramedia Pustaka Utama', '978-979-22-9768-3', 2, '2007', 65500, 1),
(5, 'God Explained in a Taxi Ride', 'Non Fiksi', 'Perigee', '979-655-603-0', 3, '2009', 53000, 7),


-- --------------------------------------------------------

--
-- Struktur dari tabel `catatan_transaksi`
--

CREATE TABLE `catatan_transaksi` (
  `id` int(11) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `id_buku` int(40) NOT NULL,
  `buyer` varchar(50) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `harga` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `catatan_transaksi`
--

INSERT INTO `catatan_transaksi` (`id`, `tanggal`, `id_buku`, `buyer`, `jumlah`, `harga`, `total`) VALUES
(1, '12-05-2000', 1, 'Rifky Wahyu', 3, 12000, 36000),
(2, '13-05-2020', 1, 'Torangto Situngkir', 2, 4, 154000),
(3, '13-05-2020', 1, 'Torangto Situngkir', 2, 4, 154000),
(4, '13-05-2020', 1, 'Torangto Situngkir', 2, 4, 154000),
(5, '13-05-2020', 1, 'Atta Halilintar', 2, 4, 154000),
(6, '13-05-2020', 1, '1', 4, 4, 308000),
(7, '14-05-2000', 1, 'Rifky Wahyu', 4, 12000, 48000),
(8, '14-05-2000', 3, 'Julian Wahyu', 2, 67000, 134000);


-- --------------------------------------------------------

--
-- Struktur dari tabel `hak_akses`
--

CREATE TABLE `hak_akses` (
  `id` int(11) NOT NULL,
  `jabatan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `hak_akses`
--

INSERT INTO `hak_akses` (`id`, `jabatan`) VALUES
(1, 'Admin'),
(2, 'Kasir');

-- --------------------------------------------------------

--
-- Struktur dari tabel `suplier`
--

CREATE TABLE `suplier` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_hp` varchar(50) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `suplier`
--

INSERT INTO `suplier` (`id`, `nama`, `no_hp`, `alamat`) VALUES
(1, 'PT. Cahaya Simpati Grafika', '081397752892', 'Jln KI Hajar Dewantara'),
(2, 'CV. Media Wacana', '081372549622', 'Jl pemuda'),
(3, 'PT. Citra Menara Sakti', '083776285621', 'Jl. Rungkut Asri I/7, Surabaya, Jawa Timur, Indonesia'),
(4, 'PT Thea Theo Stationary', '081647628464', 'Gedung SME Tower (SMESCO) Lt. 10 Jl. Jendral'),
(5, 'CV. Rg Promosindo Pratama', '081649675839', 'Kawasan Milenium Industrial Estate Blok O2 No. 2A'),
(6, 'PT Kreasi Senifika Mandiri', '082657738574', 'Jambu VIII/G59 Waru - Sidoarjo, Sidoarjo, Jawa Timur'),
(7, 'PT Thea Theo Stationary', '081647628464', 'Gedung SME Tower (SMESCO) Lt. 10 Jl. Jendral'),
(16, 'PT Thea Theo Stationary', '081647628464', 'Gedung SME Tower (SMESCO) Lt. 10 Jl. Jendral');


-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
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
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `nama`, `gender`, `password`, `level`, `no_hp`, `alamat`) VALUES
('admin', 'Torangto Situngkir', 'L', 'admin', 1, '081397752892', 'Jln Pemuda'),
('kasir', 'Putri', 'P', 'kasir', 2, '08139664821', 'Jln Kenangan');


--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id`),
  ADD KEY `suplier` (`suplier`);

--
-- Indeks untuk tabel `catatan_transaksi`
--
ALTER TABLE `catatan_transaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_buku` (`id_buku`);

--
-- Indeks untuk tabel `hak_akses`
--
ALTER TABLE `hak_akses`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`),
  ADD KEY `level` (`level`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `buku`
--
ALTER TABLE `buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `catatan_transaksi`
--
ALTER TABLE `catatan_transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `hak_akses`
--
ALTER TABLE `hak_akses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `suplier`
--
ALTER TABLE `suplier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `buku`
--
ALTER TABLE `buku`
  ADD CONSTRAINT `buku_ibfk_1` FOREIGN KEY (`suplier`) REFERENCES `suplier` (`id`);

--
-- Ketidakleluasaan untuk tabel `catatan_transaksi`
--
ALTER TABLE `catatan_transaksi`
  ADD CONSTRAINT `catatan_transaksi_ibfk_1` FOREIGN KEY (`id_buku`) REFERENCES `buku` (`id`);

--
-- Ketidakleluasaan untuk tabel `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`level`) REFERENCES `hak_akses` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
CREATE TABLE `buku` (   `id` int(11) NOT NULL,   `judul` varchar(50) NOT NULL,   `kategori` varchar(50) NOT NULL,   `penerbit` varchar(50) NOT NULL,   `ISBN` varchar(50) NOT NULL,   `suplier` int(11) NOT NULL,   `tahun` varchar(50) NOT NULL,   `harga` int(11) NOT NULL,   `stok` int(11) NOT NULL ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4
