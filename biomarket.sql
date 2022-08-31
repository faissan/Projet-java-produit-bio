-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 30 août 2022 à 22:46
-- Version du serveur : 8.0.27
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `biomarket`
--

-- --------------------------------------------------------

--
-- Structure de la table `cat_produit`
--

DROP TABLE IF EXISTS `cat_produit`;
CREATE TABLE IF NOT EXISTS `cat_produit` (
  `id_cat` int NOT NULL AUTO_INCREMENT,
  `libelle_cat` varchar(30) NOT NULL,
  PRIMARY KEY (`id_cat`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `cat_produit`
--

INSERT INTO `cat_produit` (`id_cat`, `libelle_cat`) VALUES
(1, 'Fruits'),
(2, 'Légumes'),
(3, 'Céréales'),
(4, 'Oeufs');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `ref_client` int NOT NULL AUTO_INCREMENT,
  `nom_prenoms_client` varchar(60) NOT NULL,
  `email_client` varchar(60) NOT NULL,
  `telephone_client` varchar(25) NOT NULL,
  `point_client` double NOT NULL,
  PRIMARY KEY (`ref_client`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`ref_client`, `nom_prenoms_client`, `email_client`, `telephone_client`, `point_client`) VALUES
(1, 'HOUESSOU Dénis', 'houessou@gmail.com', '+221 78 678 8990', 77.313),
(2, 'DIOP Ibrahima', 'idiop@outlook.com', '221 78 901 23 40', 35.264100000000006),
(3, 'OGOU Gildas Alain', 'ogoualain@gmail.com', '+221789073245', 34.42),
(4, 'AMADOU FALL', 'a.fall@gmail.com', '221789805643', 6.6610000000000005),
(5, 'Rodolphe AGUEMON', 'raguemon@gmail.com', '+221 78 980 8765', 6.239000000000001),
(6, 'Miraide AUGUSTO BASSAM', 'mire@gmail.com', '221 77 199 81 29', 8.383000000000001);

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

DROP TABLE IF EXISTS `fournisseur`;
CREATE TABLE IF NOT EXISTS `fournisseur` (
  `reference_fournisseur` int NOT NULL AUTO_INCREMENT,
  `nom_fournisseur` varchar(50) NOT NULL,
  `adresse_fournisseur` varchar(30) NOT NULL,
  `telephone_fournisseur` varchar(30) NOT NULL,
  PRIMARY KEY (`reference_fournisseur`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `fournisseur`
--

INSERT INTO `fournisseur` (`reference_fournisseur`, `nom_fournisseur`, `adresse_fournisseur`, `telephone_fournisseur`) VALUES
(1, 'CASINO1s', 'Dakar Plateau', '+221 33 825 57 19'),
(5, 'Zena Exotic Fruits SA', 'Dakar Region 2547', '+221 33 821 69 96'),
(6, 'British Council Senegal', 'Dakar Region 10700', '+221 33 869 27 00'),
(7, 'Artea Dakar', '9999 Diamniadio Dakar', '+221770259202');

-- --------------------------------------------------------

--
-- Structure de la table `livraison`
--

DROP TABLE IF EXISTS `livraison`;
CREATE TABLE IF NOT EXISTS `livraison` (
  `ref_livraison` int NOT NULL AUTO_INCREMENT,
  `prod_liv` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `fournisseur_liv` int NOT NULL,
  `quantite_liv` double NOT NULL,
  `date_liv` varchar(35) NOT NULL,
  PRIMARY KEY (`ref_livraison`),
  KEY `prod_liv` (`prod_liv`),
  KEY `fournisseur_liv` (`fournisseur_liv`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `livraison`
--

INSERT INTO `livraison` (`ref_livraison`, `prod_liv`, `fournisseur_liv`, `quantite_liv`, `date_liv`) VALUES
(1, 'Ban-TR88', 1, 56, '29/08/22 13:30');

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

DROP TABLE IF EXISTS `produit`;
CREATE TABLE IF NOT EXISTS `produit` (
  `ref_produit` varchar(25) NOT NULL,
  `lib_produit` varchar(50) NOT NULL,
  `date_production` varchar(35) NOT NULL,
  `date_expiration` varchar(35) NOT NULL,
  `quantite` double NOT NULL,
  `quantite_alerte` double NOT NULL,
  `prix_vente` double NOT NULL,
  `categorie_produit` int NOT NULL,
  PRIMARY KEY (`ref_produit`),
  KEY `categorie_produit` (`categorie_produit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`ref_produit`, `lib_produit`, `date_production`, `date_expiration`, `quantite`, `quantite_alerte`, `prix_vente`, `categorie_produit`) VALUES
('Ban-TR88', 'Banane plantain ', '08/02/2024', '09/06/2022', 3522, 15, 325, 1),
('Citr-009H', 'Citron vert', '05/08/2022', '31/08/2022', 0, 12, 215, 1),
('co-0067', 'Concombre', '05/08/2022', '31/08/2022', 3, 10, 240, 2),
('FR-0002-22', 'Mangue', '22/08/2022', '06/10/2022', 745, 20, 200, 1),
('LEG-001', 'Choux verte', '03/08/2022', '29/10/2022', 156, 10, 500, 1),
('Org-SF09', 'Orange Ben', '08/06/2022', '03/08/2022', 815, 50, 290, 1),
('OUEF-0076', 'OEUFS DE POULE', '10/08/2022', '14/12/2022', 7, 50, 765, 4),
('pom-0983', 'Pomme fruit', '08/11/2022', '09/09/2023', 6832, 12, 200, 1),
('rai-949600', 'Raisin vert', '19/08/2022', '29/09/2022', 214, 30, 540, 1);

-- --------------------------------------------------------

--
-- Structure de la table `produits_vendus`
--

DROP TABLE IF EXISTS `produits_vendus`;
CREATE TABLE IF NOT EXISTS `produits_vendus` (
  `id_prod` int NOT NULL AUTO_INCREMENT,
  `ref_vente` varchar(30) NOT NULL,
  `ref_prod` varchar(30) NOT NULL,
  `qte` double NOT NULL,
  PRIMARY KEY (`id_prod`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `produits_vendus`
--

INSERT INTO `produits_vendus` (`id_prod`, `ref_vente`, `ref_prod`, `qte`) VALUES
(17, 'BK-0001-22', 'Banane plantain ', 123),
(18, 'BK-0002-22', 'Choux verte', 6),
(19, 'BK-0002-22', 'Concombre', 5),
(20, 'BK-0002-22', 'Mangue', 3),
(21, 'BK-0002-22', 'Concombre', 5),
(22, 'BK-0002-22', 'Mangue', 3),
(23, 'BK-0002-22', 'Concombre', 5),
(24, 'BK-0002-22', 'Mangue', 3),
(25, 'BK-0002-22', 'Concombre', 5),
(26, 'BK-0002-22', 'Mangue', 3),
(27, 'BK-0002-22', 'Concombre', 5),
(28, 'BK-0002-22', 'Mangue', 3),
(29, 'BK-0002-22', 'Citron vert', 4),
(30, 'BK-0002-22', 'Concombre', 5),
(31, 'BK-0002-22', 'Mangue', 3),
(32, 'BK-0002-22', 'Citron vert', 4),
(33, 'BK-0003-22', 'Banane plantain ', 22),
(34, 'BK-0003-22', 'Banane plantain ', 554),
(35, 'BK-0004-22', 'Banane plantain ', 23),
(36, 'BK-0004-22', 'Mangue', 5),
(37, 'BK-0004-22', 'Orange Ben', 56),
(38, 'BK-0004-22', 'OEUFS DE POULE', 2),
(39, 'BK-0005-22', 'Choux verte', 12),
(40, 'BK-0005-22', 'Orange Ben', 34),
(41, 'BK-0005-22', 'OEUFS DE POULE', 34),
(42, 'BK-0006-22', 'Citron vert', 1),
(43, 'BK-0006-22', 'Mangue', 234),
(44, 'BK-0006-22', 'OEUFS DE POULE', 3),
(45, 'BK-0006-22', 'Banane plantain ', 345),
(46, 'BK-0007-22', 'Banane plantain ', 54),
(47, 'BK-0008-22', 'Choux verte', 10),
(48, 'BK-0008-22', 'Banane plantain ', 324),
(49, 'BK-0008-22', 'Orange Ben', 20),
(50, 'BK-0009-22', 'OEUFS DE POULE', 2),
(51, 'BK-00010-22', 'Orange Ben', 542),
(52, 'BK-00010-22', 'Banane plantain ', 21),
(53, 'BK-00010-22', 'Pomme fruit', 70),
(54, 'BK-00011-22', 'OEUFS DE POULE', 2),
(55, 'BK-00011-22', 'Mangue', 43),
(56, 'BK-00011-22', 'Pomme fruit', 89),
(57, 'BK-00011-22', 'Orange Ben', 54),
(58, 'BK-00011-22', 'Choux verte', 12),
(59, 'BK-00012-22', 'Banane plantain ', 12),
(60, 'BK-00012-22', 'Concombre', 7),
(61, 'BK-00012-22', 'Mangue', 7),
(62, 'BK-00012-22', 'Choux verte', 4),
(63, 'BK-00012-22', 'Orange Ben', 10),
(64, 'BK-00012-22', 'Pomme fruit', 9);

-- --------------------------------------------------------

--
-- Structure de la table `profil_user`
--

DROP TABLE IF EXISTS `profil_user`;
CREATE TABLE IF NOT EXISTS `profil_user` (
  `ref_profil` int NOT NULL AUTO_INCREMENT,
  `lib_profil` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`ref_profil`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `profil_user`
--

INSERT INTO `profil_user` (`ref_profil`, `lib_profil`) VALUES
(1, 'Administrateur'),
(2, 'Gestionnaire'),
(3, 'Agent commercial'),
(4, 'Comptable');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `ref_utilisateur` int NOT NULL AUTO_INCREMENT,
  `nom_utilisateur` varchar(30) NOT NULL,
  `prenom_utilisateur` varchar(50) NOT NULL,
  `login_utilisateur` varchar(30) NOT NULL,
  `pwd_utilisateur` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `profil_utilisateur` int NOT NULL,
  PRIMARY KEY (`ref_utilisateur`),
  KEY `profil_utilisateur` (`profil_utilisateur`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`ref_utilisateur`, `nom_utilisateur`, `prenom_utilisateur`, `login_utilisateur`, `pwd_utilisateur`, `profil_utilisateur`) VALUES
(1, 'AISSAN', 'François', 'faissan', 'faissan', 1),
(2, 'GALLEDOU', 'Ngoundo', 'goundo', 'goundo', 2),
(3, 'SAWADOGO', 'Lionnel', 'slionnel', 'slionnel', 3),
(4, 'Hadilou', 'ADAM', 'hadam', 'hadam', 1),
(5, 'AGUEMON', 'Rodolphe', 'raguemon', 'raguemon', 1);

-- --------------------------------------------------------

--
-- Structure de la table `vente`
--

DROP TABLE IF EXISTS `vente`;
CREATE TABLE IF NOT EXISTS `vente` (
  `id_vente` int NOT NULL AUTO_INCREMENT,
  `ref_vente` varchar(25) NOT NULL,
  `ref_client` int NOT NULL,
  `date_vente` varchar(30) NOT NULL,
  `montant_total` double DEFAULT NULL,
  `reduction` double DEFAULT NULL,
  `montant_net` double NOT NULL,
  PRIMARY KEY (`id_vente`),
  UNIQUE KEY `ref_vente` (`ref_vente`),
  KEY `clientfk` (`ref_client`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `vente`
--

INSERT INTO `vente` (`id_vente`, `ref_vente`, `ref_client`, `date_vente`, `montant_total`, `reduction`, `montant_net`) VALUES
(1, 'BK-0001-22', 1, '30/08/22 16:09', 39975, 0, 39975),
(2, 'BK-0002-22', 2, '30/08/22 16:21', 3000, 0, 3000),
(9, 'BK-0003-22', 1, '30/08/22 16:23', 7150, 0, 7150),
(11, 'BK-0004-22', 5, '30/08/22 16:25', 26245, 0, 26245),
(12, 'BK-0005-22', 2, '30/08/22 16:28', 41870, 0, 41870),
(13, 'BK-0006-22', 1, '30/08/22 16:39', 161435, 0, 161435),
(14, 'BK-0007-22', 2, '30/08/22 16:49', 17550, 0, 17550),
(15, 'BK-0008-22', 3, '30/08/22 16:52', 116100, 0, 116100),
(16, 'BK-0009-22', 4, '30/08/22 16:53', 1530, 0, 1530),
(17, 'BK-00010-22', 1, '30/08/22 16:54', 178005, 0, 178005),
(18, 'BK-00011-22', 2, '30/08/22 16:55', 49590, 0, 49590),
(19, 'BK-00012-22', 6, '30/08/22 18:01', 13680, 0, 13680);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `livraison`
--
ALTER TABLE `livraison`
  ADD CONSTRAINT `livraison_ibfk_1` FOREIGN KEY (`prod_liv`) REFERENCES `produit` (`ref_produit`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  ADD CONSTRAINT `livraison_ibfk_2` FOREIGN KEY (`fournisseur_liv`) REFERENCES `fournisseur` (`reference_fournisseur`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `produit_ibfk_1` FOREIGN KEY (`categorie_produit`) REFERENCES `cat_produit` (`id_cat`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD CONSTRAINT `utilisateur_ibfk_1` FOREIGN KEY (`profil_utilisateur`) REFERENCES `profil_user` (`ref_profil`) ON DELETE RESTRICT ON UPDATE RESTRICT;

--
-- Contraintes pour la table `vente`
--
ALTER TABLE `vente`
  ADD CONSTRAINT `clientfk` FOREIGN KEY (`ref_client`) REFERENCES `client` (`ref_client`) ON DELETE RESTRICT ON UPDATE RESTRICT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
