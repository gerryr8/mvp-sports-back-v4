-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 01-04-2022 a las 03:30:15
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mvp-sports`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categories_products`
--

DROP TABLE IF EXISTS `categories_products`;
CREATE TABLE IF NOT EXISTS `categories_products` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `product_number` int(10) NOT NULL,
  `id_category` int(10) NOT NULL,
  `category` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `name` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `price` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `stock` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `description` varchar(255) COLLATE utf8_spanish2_ci NOT NULL,
  `thumbnail` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `image` varchar(600) COLLATE utf8_spanish2_ci NOT NULL,
  `weight` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `categories_products`
--

INSERT INTO `categories_products` (`id`, `product_number`, `id_category`, `category`, `name`, `price`, `stock`, `description`, `thumbnail`, `image`, `weight`) VALUES
(1, 1, 1, 'Tenis', 'Nike Alpha Max Trainer', '1399', '65', 'Tenis de entrenamiento', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiNsvowSpRbII3mkNFGcQNYv5TEuzVZVr-S1C60gNeJWm5ediQ1-VlDImx3vi468kIDPDrQaHhlU4PoEuvtoL8xAE-AJUOZ2n9xZrhiWC0ui4X6kDbgihS7TIsPObaeQRfvHLYmZsag_6PWhe42ojHWP8NkQ_1cQtfD5nXzv3P2iXZ7jEI3mi5LQYbZ/s320/ALPHAMAXTRAINERS.png', '700.0'),
(2, 2, 1, 'Tenis', 'Nike Tanjun', '1299', '32', 'Tenis para uso diaro', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhFTufX4ktvn21sdTLJgjyVZKvZI1gSd10fGSnjPF9-8MXiPRPyLvLB0QfLHo-Y_taBJUAI1RYkSWaAnaJxprzv8J68RPRZ8cRMdFFsv4cEtZFkD6VH85FpNy3ewDWBmvRhbB-FHwai7PBP4689Poor62BsR5MhgUgJE7J0TzK9UeVtj3wtGLULZrjM/s459/NIKETANJUM.jpg', '700.0'),
(3, 3, 1, 'Tenis', 'UA Charged Bandit 6', '1199', '34', 'Tenis para hombre', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhL7IlQjVHQzfrKwOmmnqBASd4ou1Hd5FVgDb08RWmetKvAu_wdzXmeDaU47TB-8W8QwsKKC5RjjOYK-DO4j-4BkZIAOW07GW_RcUvyUIiQqGqFHhVTVXt11_kamL-xIFLR-GoNogfLwOZYCfmNVc0kUjls8pA0l-L3RXTzdkhceQ8qneJjd-rqgryq/s451/UA-CHARGER-BANDIT6.jpg', '700.0'),
(4, 4, 1, 'Tenis', 'UA Running Surge', '1299', '26', 'Tenis para correr', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhbSRh58LqwE6YW8MpaBHbkKPkXZvB-yczNd4KzHfHe_hW3A-3DIRxuMDKVV701dinZICFIXzd38dJ5T_KLyFq1bwrUQay6A5ic0v3BwmixmFMjmsmP0Y_v8gH1syBU6hqcglvW8vQp6OOrYn665oPR6MeZrE2aeRBJBTcS_j4rPHvn1-14AR3gxUiF/s459/UAjpg.jpg', '400'),
(20, 20, 2, 'Camisas', 'UA Quick Dry', '699', '42', 'Camisa de secado rápido', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgfvZcYynyAhJUSiG_hpd1Ta-isS78wPlxtmIll5a6Yn-34aCANgJX-g0Rt7IUEs8WRlpjG_LMQPm-u255TOlSln6GK-3tIUYYgveQi70Kpz2EwMGvv5oqm-gOhcH1Cn3ujFWEIJX321LGA3ARZbweGjjc8sAQOrPkHm48fRu_-yFuklhp4d63Esew_/s250/Uaquickdry.jpg ', ''),
(22, 22, 2, 'Camisas', 'Nike Dry Fit', '599', '', 'Sudadera de secado rápido', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjYMvJht6SOy0-WYeWGt2uDDV50Vx0riAdhCrgxFUEvMdGMbOGkxZXX9-m95JIBQzDjTDaudspAyopqPeD3OsjcEQ9m6-uo-MvXB5do-runDXakbunMz5AtnlufbwnsnDsJ5yEjN-dHeSBmI8rc_WeR4cITmRee8HrOf2au-uLZip7_4eAe6dDASr6N/s1600/nikedryfit.jpg', ''),
(23, 23, 3, 'Shorts', 'Nike Run Division Flex Stride', '899', '', 'Short flexible para entrenamiento', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgFiYRK8rmS8uFvK0-YUJvcOVjU3DC94nF-hfskUtR2OkawSEdJYaY4d3atL2HNCK34h5PnkqAMSlF2_s7Tpt3qZFw-z4KhJ-w88gEJdwRKkwru7Ll9JIoCPPY9cc2__gvmCNfM12pFeU2pdUZ2hRRp3IvvDO9z6Yqy6XlNndEXCyw6gILiH1TFg41V/s250/rundivision.jpg', ''),
(24, 24, 3, 'Shorts', 'Nike Wild Run Flex Stride', '999', '', 'Short para correr', 'a', 'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgc8eQtKIUl_kSt9swz5q9WIGzHBI45zp8YVBXrlO9DQhId6FgEuoqd0xRxOjEqWsR-inLBOCvKlHE5T-aNgjv0vRbiA_u8O_-Mh8XO4Qlo2IoHPJY5SLFPGQx5LZU9K3wUSlZX1FVTGIvSNF0Jf-bN9yKpJsWpCoV3_bloMwfIEi2HHi60idvT0BY9/s250/nikeflexride.jpg', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
