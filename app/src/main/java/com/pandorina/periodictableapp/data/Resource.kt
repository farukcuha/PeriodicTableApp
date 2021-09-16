package com.pandorina.periodictableapp.data

import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.model.Element
import com.pandorina.periodictableapp.model.LantActi

object Resource {
    fun getTableItems(): ArrayList<Any?> {
        return arrayListOf(
            Element(0, R.drawable.shape_1, "H", "Hydrogen", 1),
            Element(17, R.drawable.shape_2, "He", "Helium", 2),

            Element(18, R.drawable.shape_3, "Li", "Lithium", 3),
            Element(19, R.drawable.shape_4, "Be", "Beryllium", 4),
            Element(30, R.drawable.shape_7, "B", "Boron", 5),
            Element(31, R.drawable.shape_1, "C", "Carbon", 6),
            Element(32, R.drawable.shape_1, "N", "Nitrogen", 7),
            Element(33, R.drawable.shape_1, "O", "Oxygen", 8),
            Element(34, R.drawable.shape_5, "F", "Fluorine", 9),
            Element(35, R.drawable.shape_2, "Ne", "Neon", 10),

            Element(36, R.drawable.shape_3, "Na", "Sodium", 11),
            Element(37, R.drawable.shape_4, "Mg", "Magnesium", 12),
            Element(48, R.drawable.shape_8, "Al", "Aluminium", 13),
            Element(49, R.drawable.shape_7, "Si", "Silicon", 14),
            Element(50, R.drawable.shape_1, "P", "Phosphorus", 15),
            Element(51, R.drawable.shape_1, "S", "Sulfur", 16),
            Element(52, R.drawable.shape_5, "Cl", "Chlorine", 17),
            Element(53, R.drawable.shape_2, "Ar", "Argon", 18),

            Element(54, R.drawable.shape_3, "K", "Potassium", 19),
            Element(55, R.drawable.shape_4, "Ca", "Calcium", 20),
            Element(56, R.drawable.shape_6, "Sc", "Scandium", 21),
            Element(57, R.drawable.shape_6, "Ti", "Titanium", 22),
            Element(58, R.drawable.shape_6, "V", "Vanadium", 23),
            Element(59, R.drawable.shape_6, "Cr", "Chromium", 24),
            Element(60, R.drawable.shape_6, "Mn", "Manganese", 25),
            Element(61, R.drawable.shape_6, "Fe", "Iron", 26),
            Element(62, R.drawable.shape_6, "Co", "Cobalt", 27),
            Element(63, R.drawable.shape_6, "Ni", "Nickel", 28),
            Element(64, R.drawable.shape_6, "Cu", "Copper", 29),
            Element(65, R.drawable.shape_6, "Zn", "Zinc", 30),
            Element(66, R.drawable.shape_8, "Ga", "Gallium", 31),
            Element(67, R.drawable.shape_7, "Ge", "Germanium", 32),
            Element(68, R.drawable.shape_7, "As", "Arsenic", 33),
            Element(69, R.drawable.shape_1, "Se", "Selenium", 34),
            Element(70, R.drawable.shape_5, "Br", "Bromine", 35),
            Element(71, R.drawable.shape_2, "Kr", "Krypton", 36),

            Element(72, R.drawable.shape_3, "Rb", "Rubidium", 37),
            Element(73, R.drawable.shape_4, "Sr", "Strontium", 38),
            Element(74, R.drawable.shape_6, "Y", "Yttrium", 39),
            Element(75, R.drawable.shape_6, "Zr", "Zirconium", 40),
            Element(76, R.drawable.shape_6, "Nb", "Niobium", 41),
            Element(77, R.drawable.shape_6, "Mo", "Molybdenum", 42),
            Element(78, R.drawable.shape_6, "Tc", "Technetium", 43),
            Element(79, R.drawable.shape_6, "Ru", "Ruthenium", 44),
            Element(80, R.drawable.shape_6, "Rh", "Rhodium", 45),
            Element(81, R.drawable.shape_6, "Pd", "Palladium", 46),
            Element(82, R.drawable.shape_6, "Ag", "Silver", 47),
            Element(83, R.drawable.shape_6, "Cd", "Cadmium", 48),
            Element(84, R.drawable.shape_8, "In", "Indium", 49),
            Element(85, R.drawable.shape_8, "Sn", "Tin", 50),
            Element(86, R.drawable.shape_7, "Sb", "Antimony", 51),
            Element(87, R.drawable.shape_7, "Te", "Tellurium", 52),
            Element(88, R.drawable.shape_5, "I", "Iodine", 53),
            Element(89, R.drawable.shape_2, "Xe", "Xenon", 54),

            Element(90, R.drawable.shape_3, "Cs", "Cesium", 55),
            Element(91, R.drawable.shape_4, "Ba", "Barium", 56),
            LantActi(92, R.drawable.shape_7, "57-71", "Lanthanoids"),
            Element(93, R.drawable.shape_6, "Hf", "Hafnium", 72),
            Element(94, R.drawable.shape_6, "Ta", "Tantalum", 73),
            Element(95, R.drawable.shape_6, "W", "Tungsten", 74),
            Element(96, R.drawable.shape_6, "Re", "Rhenium", 75),
            Element(97, R.drawable.shape_6, "Os", "Osmium", 76),
            Element(98, R.drawable.shape_6, "Ir", "Iridium", 77),
            Element(99, R.drawable.shape_6, "Pt", "Platinum", 78),
            Element(100, R.drawable.shape_6, "Au", "Gold", 79),
            Element(101, R.drawable.shape_6, "Hg", "Mercury", 80),
            Element(102, R.drawable.shape_8, "Tl", "Thallium", 81),
            Element(103, R.drawable.shape_8, "Pb", "Lead", 82),
            Element(104, R.drawable.shape_8, "Bi", "Bismuth", 83),
            Element(105, R.drawable.shape_7, "Po", "Polonium", 84),
            Element(106, R.drawable.shape_5, "At", "Astatine", 85),
            Element(107, R.drawable.shape_2, "Rn", "Radon", 86),

            Element(108, R.drawable.shape_3, "Fr", "Cesium", 55),
            Element(109, R.drawable.shape_4, "Ra", "Radium", 56),
            LantActi(110, R.drawable.shape_7, "89-103", "Actinioids"),
            Element(111, R.drawable.shape_6, "Rf", "Rutherfordium", 104),
            Element(112, R.drawable.shape_6, "Db", "Dubnium", 105),
            Element(113, R.drawable.shape_6, "Sg", "Seaborgium", 106),
            Element(114, R.drawable.shape_6, "Bh", "Bohrium", 107),
            Element(115, R.drawable.shape_6, "Hs", "Hassium", 108),
            Element(116, R.drawable.shape_6, "Mt", "Meitnerium", 109),
            Element(117, R.drawable.shape_6, "Ds", "Darmstadtium", 110),
            Element(118, R.drawable.shape_6, "Rg", "Roentgenium", 111),
            Element(119, R.drawable.shape_6, "Cn", "Copernicium", 112),
            Element(120, R.drawable.shape_8, "Uut", "Nihonium", 113),
            Element(121, R.drawable.shape_8, "Fl", "Flerovium", 114),
            Element(122, R.drawable.shape_8, "Uup", "Moscovium", 115),
            Element(123, R.drawable.shape_8, "Lv", "Livermorium", 116),
            Element(124, R.drawable.shape_5, "Uus", "Tenessine", 117),
            Element(125, R.drawable.shape_2, "Uuo", "Oganesson", 118),

            Element(146, R.drawable.shape_7, "La", "Lanthanum", 57),
            Element(147, R.drawable.shape_7, "Ce", "Cerium", 58),
            Element(148, R.drawable.shape_7, "Pr", "Praseodymium", 59),
            Element(149, R.drawable.shape_7, "Nd", "Neodymium", 60),
            Element(150, R.drawable.shape_7, "Pm", "Promethium", 61),
            Element(151, R.drawable.shape_7, "Sm", "Samarium", 62),
            Element(152, R.drawable.shape_7, "Co", "Europium", 63),
            Element(153, R.drawable.shape_7, "Gd", "Gadolinium", 64),
            Element(154, R.drawable.shape_7, "Tb", "Terbium", 65),
            Element(155, R.drawable.shape_7, "Dy", "Dysprosium", 66),
            Element(156, R.drawable.shape_7, "Ho", "Holmium", 67),
            Element(157, R.drawable.shape_7, "Er", "Erbium", 68),
            Element(158, R.drawable.shape_7, "Tm", "Thulium", 69),
            Element(159, R.drawable.shape_7, "Yb", "Ytterbium", 70),
            Element(160, R.drawable.shape_7, "Lu", "Lutetium", 71),

            Element(164, R.drawable.shape_7, "Ac", "Actinium", 89),
            Element(165, R.drawable.shape_7, "Th", "Thorium", 90),
            Element(166, R.drawable.shape_7, "Pa", "Protactinium", 91),
            Element(167, R.drawable.shape_7, "U", "Uranium", 92),
            Element(168, R.drawable.shape_7, "Np", "Neptunium", 93),
            Element(169, R.drawable.shape_7, "Ru", "Plutonium", 94),
            Element(170, R.drawable.shape_7, "Am", "Americium", 95),
            Element(171, R.drawable.shape_7, "Cm", "Curium", 96),
            Element(172, R.drawable.shape_7, "Bk", "Berkelium", 97),
            Element(173, R.drawable.shape_7, "Cf", "Californium", 98),
            Element(174, R.drawable.shape_7, "Es", "Einsteinium", 99),
            Element(175, R.drawable.shape_7, "Fm", "Fermium", 100),
            Element(176, R.drawable.shape_7, "Md", "Mendelevium", 101),
            Element(177, R.drawable.shape_7, "No", "Nobelium", 102),
            Element(178, R.drawable.shape_7, "Lr", "Lawrencium", 103),

            )
    }
}