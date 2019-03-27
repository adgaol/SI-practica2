-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-03-2019 a las 18:34:55
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `test`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `servicioid` bigint(20) NOT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `duracion` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `userid` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`servicioid`, `categoria`, `descripcion`, `duracion`, `nombre`, `precio`, `userid`) VALUES
(8, 'Electricista', 'Cambiamos tus enchufes', 2, 'Cambios de enchufes', 30.25, 1),
(9, 'Fontanería', 'Desantrancamos donde sea', 3, 'Desatranques pepa', 50, 2),
(10, 'Alimentación', 'Llevamos pan a domicilio', 2, 'Reparto de pan', 30.25, 7),
(11, 'Electricista', 'Instalamos redes eléctricas', 72, 'Instalación de red eléctrica', 150.03, 1),
(12, 'Fontanería', 'Instalamos retretes', 5, 'Instalación de retretes', 70.25, 2),
(13, 'Alimentación', 'Si estas ocupado te llevamos el café con churros a la oficina', 2, 'Café a domicilio', 30.25, 7),
(14, 'Electricista', 'Si queires cambiar el cuadro electrico o instalarlo llamanos', 8, 'Instalamos cuadros eléctricos', 200.25, 1),
(15, 'Fontanería', 'Saneamos tus tuberías', 5, 'Saneamientos de tuberías', 85.25, 2),
(16, 'Fontanería', 'Instalamos grifos ¡Sorpresa!', 2, 'Instalación de grifos', 30.25, 2),
(17, 'Alimentación', 'Llevamos tu tortilla de patata y una cerveza directamente a tu mesa,para 4 personas', 1, 'Comida a domicilio', 30.25, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitud`
--

CREATE TABLE `solicitud` (
  `solicitudid` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `servicio_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `solicitud`
--

INSERT INTO `solicitud` (`solicitudid`, `descripcion`, `direccion`, `estado`, `fecha`, `importe`, `user_id`, `servicio_id`) VALUES
(18, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '12/12/2018', 50, 6, 15),
(19, '', 'Calle del medio, Madrid', 'COMPLETADO', '01/01/2019', 50, 4, 15),
(20, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '02/01/2019', 50, 5, 15),
(21, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '03/01/2019', 50, 4, 12),
(22, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '04/01/2019', 50, 5, 12),
(23, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '05/01/2019', 50, 6, 8),
(24, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '06/01/2019', 50, 5, 10),
(25, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '07/01/2019', 50, 4, 11),
(26, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '08/01/2019', 50, 6, 12),
(27, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '09/01/2019', 50, 5, 16),
(28, '', 'Calle ibañez, Mostoles', 'COMPLETADO', '10/01/2019', 50, 4, 14);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `userid` bigint(20) NOT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `fechadenacimiento` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `perfil` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`userid`, `apellidos`, `ciudad`, `correo`, `fechadenacimiento`, `nombre`, `password`, `perfil`) VALUES
(1, 'Gómez Pérez', 'Madrid', 'pepe@gmail.com', '25/08/1979', 'Pepe', 'profesional1', 'PROFESIONAL'),
(2, 'Ruiz Sanz', 'Barcelona', 'pepa@gmail.com', '19/06/1985', 'Pepa', 'profesional2', 'PROFESIONAL'),
(3, 'García Martínez', 'Sevilla', 'manuel@gmail.com', '23/05/1988', 'Manuel', 'analista1', 'ANALYST'),
(4, 'Salvador Ortega', 'Madrid', 'antonio@gmail.com', '19/09/1982', 'Antonio', 'cliente1', 'CUSTOMER'),
(5, 'Sanchez Ramirez', 'Barcelona', 'laura@gmail.com', '23/05/1988', 'Laura', 'cliente2', 'CUSTOMER'),
(6, 'Baltasar Alonso', 'Badajoz', 'clara@gmail.com', '09/06/1997', 'Clara María', 'cliente3', 'CUSTOMER'),
(7, 'García Gonzalez', 'Sevilla', 'eldelbar@gmail.com', '06/02/1995', 'Eldelbar', 'profesional3', 'PROFESIONAL');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`servicioid`),
  ADD KEY `FKqvaojykt2usn2rgm2i4rbgjr6` (`userid`);

--
-- Indices de la tabla `solicitud`
--
ALTER TABLE `solicitud`
  ADD PRIMARY KEY (`solicitudid`),
  ADD KEY `FKpilnoqjjmpdb677wphmd9hl4p` (`user_id`),
  ADD KEY `FKabmh4gx7ta0ot6o3kf1v7tsje` (`servicio_id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`userid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
