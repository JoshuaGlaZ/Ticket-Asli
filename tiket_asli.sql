-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: kresnayangasli.my.id:47780
-- Generation Time: Jul 11, 2024 at 10:27 AM
-- Server version: 11.2.2-MariaDB-1:11.2.2+maria~ubu2204
-- PHP Version: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiket_asli`
--

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` text DEFAULT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `available_ticket` int(11) NOT NULL,
  `location` varchar(50) CHARACTER SET big5 COLLATE big5_chinese_ci DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`id`, `name`, `description`, `start_date`, `end_date`, `available_ticket`, `location`, `created_at`) VALUES
(1, 'Bali Arts Festival', 'Annual celebration of Balinese culture', '2024-06-15', '2024-07-13', 3, 'Denpasar, Bali', '2024-01-01 00:00:00'),
(2, 'Jakarta Fair', 'Largest trade fair in Indonesia', '2024-06-14', '2024-07-16', 100, 'Jakarta International Expo', '2024-01-05 00:00:00'),
(3, 'Yogyakarta Gamelan Festival', 'Festival showcasing traditional Javanese music', '2024-08-01', '2024-08-07', 30, 'Yogyakarta', '2024-03-12 00:00:00'),
(4, 'Ubud Writers & Readers Festival', 'International literary event', '2024-10-24', '2024-10-28', 10, 'Ubud, Bali', '2024-04-18 00:00:00'),
(5, 'Java Jazz Festival', 'One of the largest jazz festivals in the world', '2024-03-01', '2024-03-03', 20, 'Jakarta', '2024-02-01 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `eventtickets`
--

CREATE TABLE `eventtickets` (
  `id` int(11) NOT NULL,
  `event_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `reservation_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `harga` int(20) DEFAULT 0,
  `jenis_tiket` varchar(10) DEFAULT NULL,
  `claimed` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `eventtickets`
--

INSERT INTO `eventtickets` (`id`, `event_id`, `user_id`, `reservation_date`, `harga`, `jenis_tiket`, `claimed`) VALUES
(1, 1, 2, '2024-07-11 09:00:34', 15000, 'Basic', 0),
(2, 1, 2, '2024-07-11 09:00:44', 15000, 'Basic', 0),
(3, 1, 2, '2024-07-11 09:00:49', 15000, 'Basic', 0),
(4, 5, 4, '2024-07-11 09:01:25', 15000, 'Basic', 0),
(5, 5, 4, '2024-07-11 09:01:31', 15000, 'Basic', 0),
(6, 4, 2, '2024-10-24 00:00:00', 80000, 'VIP', 1),
(7, 4, 2, '2024-10-25 00:00:00', 50000, 'Premium', 1);

-- --------------------------------------------------------

--
-- Table structure for table `parkinglots`
--

CREATE TABLE `parkinglots` (
  `id` int(11) NOT NULL,
  `venue_name` varchar(100) NOT NULL,
  `location` varchar(255) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `available_lots` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkinglots`
--

INSERT INTO `parkinglots` (`id`, `venue_name`, `location`, `start_date`, `end_date`, `available_lots`, `created_at`) VALUES
(1, 'Kenjeran Park', 'Parkir Utara', '2024-07-09', '2024-07-13', 10, '2024-07-04 05:32:28'),
(2, 'Kenjeran Park', 'Parkir Timur', '2024-07-09', '2024-07-13', 5, '2024-07-04 05:32:43'),
(3, 'Kenjeran Park', 'Parkir Selatan', '2024-07-09', '2024-07-13', 5, '2024-07-04 05:32:53'),
(4, 'Kota Lama Surabaya', 'Krembangan', '2024-07-26', '2024-07-28', 5, '2024-07-09 08:49:12'),
(5, 'Surabaya Carnival Park', 'Parkir Selatan', '2024-07-10', '2024-07-24', 10, '2024-07-09 08:50:03'),
(6, 'Surabaya Carnival Park', 'Parkir Barat', '2024-07-10', '2024-07-24', 7, '2024-07-09 08:50:33'),
(7, 'Surabaya Carnival Park', 'Parkir Timur', '2024-07-01', '2024-07-05', 8, '2024-07-10 14:10:55');

-- --------------------------------------------------------

--
-- Table structure for table `parkingreservations`
--

CREATE TABLE `parkingreservations` (
  `id` int(11) NOT NULL,
  `parking_lot_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `reservation_date` date NOT NULL,
  `lot_number` int(11) NOT NULL,
  `harga` int(20) DEFAULT NULL,
  `jenis_tiket` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `parkingreservations`
--

INSERT INTO `parkingreservations` (`id`, `parking_lot_id`, `user_id`, `reservation_date`, `lot_number`, `harga`, `jenis_tiket`) VALUES
(1, 1, 1, '2024-07-10', 5, 40000, 'Premium'),
(2, 1, 2, '2024-07-10', 10, 40000, 'Premium'),
(3, 1, 2, '2024-07-11', 10, 40000, 'Premium'),
(4, 2, 3, '2024-07-12', 2, 10000, 'Basic'),
(5, 1, 4, '2024-07-13', 4, 10000, 'Basic'),
(6, 6, 6, '2024-07-16', 6, 10000, 'Basic'),
(7, 5, 6, '2024-07-19', 7, 40000, 'Premium'),
(8, 6, 1, '2024-07-11', 6, 10000, 'Basic'),
(9, 4, 1, '2024-07-27', 2, 40000, 'Premium'),
(10, 6, 2, '2024-07-16', 1, 10000, 'Basic'),
(11, 6, 2, '2024-07-16', 5, 40000, 'Premium'),
(12, 2, 8, '2024-07-13', 3, 40000, 'Premium'),
(13, 4, 1, '2024-07-26', 4, 10000, 'Basic');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `email`, `created_at`) VALUES
(1, 'kresna', '3fafc4cb634f90bd1a8e4e733fdea9ab', 'kresna@yang.asli', '2024-07-02 04:12:05'),
(2, 'joshua', '3fafc4cb634f90bd1a8e4e733fdea9ab', 'joshua@yang.asli', '2024-07-02 04:12:35'),
(3, 'christopher', '3fafc4cb634f90bd1a8e4e733fdea9ab', 'christopher@yang.asli', '2024-07-02 04:13:00'),
(4, 'louis', '3fafc4cb634f90bd1a8e4e733fdea9ab', 'louis@yang.asli', '2024-07-02 04:13:17'),
(5, 'matthew', '3fafc4cb634f90bd1a8e4e733fdea9ab', 'mat@yang.asli', '2024-07-02 04:30:27'),
(6, 'rama', '3fafc4cb634f90bd1a8e4e733fdea9ab', 'rama@me.com', '2024-07-09 06:51:53'),
(7, 'maya', 'b2693d9c2124f3ca9547b897794ac6a1', 'mauya', '2024-07-09 12:04:48'),
(8, 'mas_adi', '38b9a3e83625e8d4d2b91f185edfddac', 'mas_adi@email.com', '2024-07-09 17:00:30');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `eventtickets`
--
ALTER TABLE `eventtickets`
  ADD PRIMARY KEY (`id`),
  ADD KEY `event_id` (`event_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `parkinglots`
--
ALTER TABLE `parkinglots`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `parkingreservations`
--
ALTER TABLE `parkingreservations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `parking_lot_id` (`parking_lot_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `events`
--
ALTER TABLE `events`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `eventtickets`
--
ALTER TABLE `eventtickets`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `parkinglots`
--
ALTER TABLE `parkinglots`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `parkingreservations`
--
ALTER TABLE `parkingreservations`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `eventtickets`
--
ALTER TABLE `eventtickets`
  ADD CONSTRAINT `EventTickets_ibfk_1` FOREIGN KEY (`event_id`) REFERENCES `events` (`id`),
  ADD CONSTRAINT `EventTickets_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `parkingreservations`
--
ALTER TABLE `parkingreservations`
  ADD CONSTRAINT `ParkingReservations_ibfk_1` FOREIGN KEY (`parking_lot_id`) REFERENCES `parkinglots` (`id`),
  ADD CONSTRAINT `ParkingReservations_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
