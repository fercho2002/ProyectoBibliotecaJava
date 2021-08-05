-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-08-2021 a las 04:33:53
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectosenabiblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `computadores`
--

CREATE TABLE `computadores` (
  `noidentif` int(11) NOT NULL,
  `marca` varchar(400) DEFAULT NULL,
  `serialequipo` varchar(45) NOT NULL,
  `estado` varchar(450) DEFAULT NULL,
  `observacion` varchar(750) DEFAULT NULL,
  `modelo` varchar(450) DEFAULT NULL,
  `actualmente` varchar(450) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `computadorespre`
--

CREATE TABLE `computadorespre` (
  `idusuariopre` int(11) NOT NULL,
  `idbibliotecario` int(11) NOT NULL,
  `fechadeprestamo` varchar(45) DEFAULT NULL,
  `fechadeentregado` varchar(45) DEFAULT NULL,
  `actualmente` varchar(45) DEFAULT NULL,
  `marca` varchar(405) DEFAULT NULL,
  `serialequipo` varchar(45) NOT NULL,
  `modelo` varchar(405) DEFAULT NULL,
  `estado` varchar(405) DEFAULT NULL,
  `observacion` varchar(900) DEFAULT NULL,
  `retrazo` varchar(905) DEFAULT NULL,
  `control` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `noidentif` int(11) NOT NULL,
  `nombrelibro` varchar(400) DEFAULT NULL,
  `genero` varchar(500) DEFAULT NULL,
  `autor` varchar(450) DEFAULT NULL,
  `materia` varchar(450) DEFAULT NULL,
  `estado` varchar(450) DEFAULT NULL,
  `observacion` varchar(800) DEFAULT NULL,
  `idlibro` int(11) NOT NULL,
  `actualmente` varchar(450) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`noidentif`, `nombrelibro`, `genero`, `autor`, `materia`, `estado`, `observacion`, `idlibro`, `actualmente`) VALUES
(100243838, 'El Señor De Los Anillos La Comunidad De El Anillo', 'Ciencia Ficcion', 'J.R.R.Tolkien', 'Literatura', 'bueno', '', 1, 'prestado'),
(100243838, 'Cien Años De Solidaridad', 'Literario', 'Gabo', 'Español', 'bueno', '', 2, 'disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `librospre`
--

CREATE TABLE `librospre` (
  `idusuariopre` int(11) NOT NULL,
  `idbibliotecario` int(11) NOT NULL,
  `fechadeprestamo` varchar(45) DEFAULT NULL,
  `fechadeentregado` varchar(45) DEFAULT NULL,
  `actualmente` varchar(45) DEFAULT NULL,
  `nombrelibro` varchar(405) DEFAULT NULL,
  `genero` varchar(405) DEFAULT NULL,
  `autor` varchar(405) DEFAULT NULL,
  `materia` varchar(485) DEFAULT NULL,
  `idlibro` int(11) NOT NULL,
  `estado` varchar(450) DEFAULT NULL,
  `observacion` varchar(700) DEFAULT NULL,
  `retrazo` varchar(900) DEFAULT NULL,
  `control` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `librospre`
--

INSERT INTO `librospre` (`idusuariopre`, `idbibliotecario`, `fechadeprestamo`, `fechadeentregado`, `actualmente`, `nombrelibro`, `genero`, `autor`, `materia`, `idlibro`, `estado`, `observacion`, `retrazo`, `control`) VALUES
(2, 100243838, '2021-08-04', '2021-08-19', 'devuelto', 'El Señor De Los Anillos La Comunidad De El Anillo', 'Ciencia Ficcion', 'J.R.R.Tolkien', 'Literatura', 1, 'bueno', '', '', 1),
(2, 100243838, '04/08/2021', '28/08/2021', 'devuelto', 'Cien Años De Solidaridad', 'Literario', 'Gabo', 'Español', 2, 'bueno', '', '', 2),
(2, 100243838, '2021-08-04', '2021-08-25', 'prestado', 'El Señor De Los Anillos La Comunidad De El Anillo', 'Ciencia Ficcion', 'J.R.R.Tolkien', 'Literatura', 1, 'bueno', '', NULL, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `tipoident` varchar(50) DEFAULT NULL,
  `noidentif` int(11) NOT NULL,
  `nombres` varchar(200) DEFAULT NULL,
  `apellidos` varchar(500) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `rol` varchar(45) DEFAULT NULL,
  `nik` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `ficha` varchar(45) DEFAULT NULL,
  `programaf` varchar(45) DEFAULT NULL,
  `fechainicio` varchar(45) DEFAULT NULL,
  `fechafin` varchar(45) DEFAULT NULL,
  `jornada` varchar(45) DEFAULT NULL,
  `acudiente` varchar(45) DEFAULT NULL,
  `telefonoacudiente` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`tipoident`, `noidentif`, `nombres`, `apellidos`, `telefono`, `correo`, `direccion`, `rol`, `nik`, `password`, `ficha`, `programaf`, `fechainicio`, `fechafin`, `jornada`, `acudiente`, `telefonoacudiente`) VALUES
('cc', 2, 'Dayneris', 'Targeryan', '432423', NULL, NULL, 'aprendiz', NULL, NULL, '43534543', 'ADSI', NULL, NULL, NULL, NULL, '2312321321312'),
('cc', 100243838, 'Fercho', 'Torres', '3115476890', 'fercho@gmail.com', 'puente nacional santander', 'bibliotecario', 'fercho@gmail.com', 'fercho1234', '45345', '', NULL, NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `computadores`
--
ALTER TABLE `computadores`
  ADD PRIMARY KEY (`serialequipo`),
  ADD KEY `fk_computadores_usuarios1` (`noidentif`);

--
-- Indices de la tabla `computadorespre`
--
ALTER TABLE `computadorespre`
  ADD PRIMARY KEY (`control`),
  ADD KEY `fk_computadorespre_usuarios1_idx` (`idusuariopre`),
  ADD KEY `fk_computadorespre_usuarios2_idx` (`idbibliotecario`),
  ADD KEY `fk_computadorespre_computadores1_idx` (`serialequipo`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`idlibro`),
  ADD KEY `fk_libros_usuarios_idx` (`noidentif`);

--
-- Indices de la tabla `librospre`
--
ALTER TABLE `librospre`
  ADD PRIMARY KEY (`control`),
  ADD KEY `fk_librospre_libros1_idx` (`idlibro`),
  ADD KEY `fk_librospre_usuarios1_idx` (`idusuariopre`),
  ADD KEY `fk_librospre_usuarios2_idx` (`idbibliotecario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`noidentif`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `computadorespre`
--
ALTER TABLE `computadorespre`
  MODIFY `control` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `librospre`
--
ALTER TABLE `librospre`
  MODIFY `control` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `computadores`
--
ALTER TABLE `computadores`
  ADD CONSTRAINT `fk_computadores_usuarios1` FOREIGN KEY (`noidentif`) REFERENCES `usuarios` (`noidentif`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `computadorespre`
--
ALTER TABLE `computadorespre`
  ADD CONSTRAINT `fk_computadorespre_computadores1` FOREIGN KEY (`serialequipo`) REFERENCES `computadores` (`serialequipo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_computadorespre_usuarios1` FOREIGN KEY (`idusuariopre`) REFERENCES `usuarios` (`noidentif`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_computadorespre_usuarios2` FOREIGN KEY (`idbibliotecario`) REFERENCES `usuarios` (`noidentif`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `fk_libros_usuarios` FOREIGN KEY (`noidentif`) REFERENCES `usuarios` (`noidentif`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `librospre`
--
ALTER TABLE `librospre`
  ADD CONSTRAINT `fk_librospre_libros1` FOREIGN KEY (`idlibro`) REFERENCES `libros` (`idlibro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_librospre_usuarios1` FOREIGN KEY (`idusuariopre`) REFERENCES `usuarios` (`noidentif`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_librospre_usuarios2` FOREIGN KEY (`idbibliotecario`) REFERENCES `usuarios` (`noidentif`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
