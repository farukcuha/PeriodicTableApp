package com.pandorina.periodictableapp.data

import android.content.Context
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi

object Resource {
    fun getElementList(context: Context): ArrayList<Any?> {
        context.apply {
            val list = arrayListOf(
                Element(0,
                    R.drawable.shape_1,
                    "H",
                    getString(R.string.hydrogen),
                    1,
                    "1,008",
                    "1",
                    "2,20",
                    "-259,1",
                    "-252,9",
                    getString(R.string.desc_hydrogen)
                ),
                Element(17,
                    R.drawable.shape_2,
                    "He",
                    getString(R.string.helium),
                    2,
                    "4,002602",
                    "2",
                    null,
                    null,
                    "-269",
                    getString(R.string.desc_helium)
                ),

                Element(18,
                    R.drawable.shape_3,
                    "Li",
                    getString(R.string.lithium),
                    3,
                    "6,94",
                    "2, 1",
                    "0,98",
                    "180,54",
                    "1.342",
                    getString(R.string.desc_lithium)
                ),
                Element(19,
                    R.drawable.shape_4,
                    "Be",
                    getString(R.string.beryllium),
                    4,
                    "9,0121831",
                    "2, 2",
                    "1,57",
                    "1.287",
                    "2.470",
                    getString(R.string.desc_beryllium)
                ),
                Element(30,
                    R.drawable.shape_7,
                    "B",
                    getString(R.string.boron),
                    5,
                    "10,81",
                    "2, 3",
                    "2,04",
                    "2.075",
                    "4.000",
                    getString(R.string.desc_boron)
                ),
                Element(31,
                    R.drawable.shape_1,
                    "C",
                    getString(R.string.carbon),
                    6,
                    "12,011",
                    "2, 4",
                    "2,55",
                    "3,642",
                    "3,642",
                    getString(R.string.desc_carbon)
                ),
                Element(32,
                    R.drawable.shape_1,
                    "N",
                    getString(R.string.nitrogen),
                    7,
                    "14,007",
                    "2, 5",
                    "3,04",
                    "-210,1",
                    "-195,8",
                    getString(R.string.desc_nitrogen)
                ),
                Element(33,
                    R.drawable.shape_1,
                    "O",
                    getString(R.string.oxygen),
                    8,
                    "15,999",
                    "2, 6",
                    "3,44",
                    "-218",
                    "-183",
                    getString(R.string.desc_oxygen)
                ),
                Element(34,
                    R.drawable.shape_5,
                    "F",
                    getString(R.string.fluorine),
                    9,
                    "18,998403163",
                    "2, 7",
                    "3,98",
                    "-220",
                    "-188,1",
                    getString(R.string.desc_fluorine)
                ),
                Element(35,
                    R.drawable.shape_2,
                    "Ne",
                    getString(R.string.neon),
                    10,
                    "20,1797",
                    "2, 8",
                    null,
                    "-248,6",
                    "-246,1",
                    getString(R.string.desc_neon)
                ),
                Element(36,
                    R.drawable.shape_3,
                    "Na",
                    getString(R.string.sodium),
                    11,
                    "22,98976928",
                    "2, 8, 1",
                    "0,93",
                    "97,720",
                    "882,9",
                    getString(R.string.sodium)
                ),
                Element(37,
                    R.drawable.shape_4,
                    "Mg",
                    getString(R.string.magnesium),
                    12,
                    "24,305",
                    "2, 8, 2",
                    "1,31",
                    "650",
                    "1,090",
                    getString(R.string.magnesium)
                ),
                Element(48,
                    R.drawable.shape_8,
                    "Al",
                    getString(R.string.aluminum),
                    13,
                    "26,9815385",
                    "2, 8, 3",
                    "1,31",
                    "660,32",
                    "2,519",
                    getString(R.string.desc_aluminum)
                ),
                Element(49,
                    R.drawable.shape_7,
                    "Si",
                    getString(R.string.silicon),
                    14,
                    "28,085",
                    "2, 8, 4",
                    "1,90",
                    "1.414",
                    "2.900",
                    getString(R.string.desc_silicon)),
                Element(50,
                    R.drawable.shape_1,
                    "P",
                    getString(R.string.phosphorus),
                    15,
                    "30,973761998",
                    "2, 8, 5",
                    "2,19",
                    "44,15",
                    "280,5",
                    getString(R.string.desc_phosphorus)),
                Element(51,
                    R.drawable.shape_1,
                    "S",
                    getString(R.string.sulfur),
                    16,
                    "32,06",
                    "2, 8, 6",
                    "2,58",
                    "115,21",
                    "444,72",
                    getString(R.string.desc_sulfur)),
                Element(52,
                    R.drawable.shape_5,
                    "Cl",
                    getString(R.string.chlorine),
                    17,
                    "35,45",
                    "2, 8, 7",
                    "3,16",
                    "-101,5",
                    "-34,040",
                    getString(R.string.desc_chlorine)),
                Element(53,
                    R.drawable.shape_2,
                    "Ar",
                    getString(R.string.argon),
                    18,
                    "39,948",
                    "2, 8, 8",
                    null,
                    "-189",
                    "-186",
                getString(R.string.desc_argon)),

                Element(54,
                    R.drawable.shape_3,
                    "K",
                    getString(R.string.potassium),
                    19,
                    "39,0983",
                    "2, 8, 8, 1",
                    "0,82",
                    "63,380",
                    "758,9",
                    getString(R.string.desc_potassium)),

                Element(55,
                    R.drawable.shape_4,
                    "Ca",
                    getString(R.string.calcium),
                    20,
                    "40,078",
                    "2, 8, 8, 2",
                    "1,0",
                    "841,9",
                    "1.484",
                getString(R.string.desc_calcium)),

                Element(56,
                    R.drawable.shape_6,
                    "Sc",
                    getString(R.string.scandium),
                    21,
                    "44,955908",
                    "2, 8, 9, 2",
                    "1,36",
                    "1.541",
                    "2.830",
                getString(R.string.desc_scandium)),

                Element(57,
                    R.drawable.shape_6,
                    "Ti",
                    getString(R.string.titanium),
                    22,
                    "47,867",
                    "2, 8, 10, 2",
                    "1,54",
                    "1.668",
                    "3.287",
                getString(R.string.desc_titanium)),

                Element(58,
                    R.drawable.shape_6,
                    "V",
                    getString(R.string.vanadium),
                    23,
                    "50,9415",
                    "2, 8, 11, 2",
                    "1,63",
                    "1.910",
                    "3.407",
                getString(R.string.desc_vanadium)),

                Element(59,
                    R.drawable.shape_6,
                    "Cr",
                    getString(R.string.chromium),
                    24,
                    "51,9961",
                    "2, 8, 13, 1",
                    "1,66",
                    "1.907",
                    "2.671",
                    getString(R.string.desc_chromium)),

                Element(60,
                    R.drawable.shape_6,
                    "Mn",
                    getString(R.string.manganese),
                    25,
                    "54,938044",
                    "2, 8, 13, 2",
                    "1,55",
                    "1.246",
                    "2.061",
                    getString(R.string.desc_manganese)),

                Element(61,
                    R.drawable.shape_6,
                    "Fe",
                    getString(R.string.iron),
                    26,
                    "55,845",
                    "2, 8, 14, 2",
                    "1,83",
                    "1.538",
                    "2.861",
                    getString(R.string.desc_iron)),

                Element(62,
                    R.drawable.shape_6,
                    "Co",
                    getString(R.string.cobalt),
                    27,
                    "58,933194",
                    "2, 8, 15, 2",
                    "1,88",
                    "1.495",
                    "2.900",
                    getString(R.string.desc_cobalt)),

                Element(63,
                    R.drawable.shape_6,
                    "Ni",
                    getString(R.string.nickel),
                    28,
                    "58,6934",
                    "2, 8, 16, 2",
                    "1,91",
                    "1.455",
                    "2.913",
                    getString(R.string.desc_nickel)),

                Element(64,
                    R.drawable.shape_6,
                    "Cu",
                    getString(R.string.copper),
                    29,
                    "63,546",
                    "2, 8, 18, 1",
                    "1,90",
                    "1.084,62",
                    "2.562",
                    getString(R.string.desc_copper)),

                Element(65,
                    R.drawable.shape_6,
                    "Zn",
                    getString(R.string.zinc),
                    30,
                    "65,38",
                    "2, 8, 18, 2",
                    "1,65",
                    "419,53",
                    "906,9",
                    getString(R.string.desc_zinc)),

                Element(66,
                    R.drawable.shape_8,
                    "Ga",
                    getString(R.string.gallium),
                    31,
                    "69,723",
                    "2, 8, 18, 3",
                    "1,81",
                    "29,760",
                    "2.204",
                    getString(R.string.desc_gallium)),

                Element(67,
                    R.drawable.shape_7,
                    "Ge",
                    getString(R.string.germanium),
                    32,
                    "72,63",
                    "2, 8, 18, 4",
                    "2,01",
                    "938,25",
                    "2.820",
                    getString(R.string.desc_germanium)),

                Element(68,
                    R.drawable.shape_7,
                    "As",
                    getString(R.string.arsenic),
                    33,
                    "74,921595",
                    "2, 8, 18, 5",
                    "2,18",
                    "816,9",
                    "614",
                    getString(R.string.desc_arsenic)),

                Element(69,
                    R.drawable.shape_1,
                    "Se",
                    getString(R.string.selenium),
                    34,
                    "78,971",
                    "2, 8, 18, 6",
                    "2,55",
                    "221",
                    "685",
                    getString(R.string.desc_selenium)),

                Element(70,
                    R.drawable.shape_5,
                    "Br",
                    getString(R.string.bromine),
                    35,
                    "79,904",
                    "2, 8, 18, 7",
                    "2,96",
                    "-7,350",
                    "58,9",
                    getString(R.string.desc_bromine)),

                Element(71,
                    R.drawable.shape_2,
                    "Kr",
                    getString(R.string.krypton),
                    36,
                    "83,798",
                    "2, 8, 18, 8",
                    "3,0",
                    "-157,36",
                    "-153,22",
                    getString(R.string.desc_krypton)),

                Element(72,
                    R.drawable.shape_3,
                    "Rb",
                    getString(R.string.rubidium),
                    37,
                    "85,4678",
                    "2, 8, 18, 8, 1",
                    "0,82",
                    "39,310",
                    "688",
                getString(R.string.desc_rubidium)),

                Element(
                    73,
                    R.drawable.shape_4,
                    "Sr",
                    getString(R.string.strontium),
                    38,
                    "87,62",
                    "2, 8, 18, 8, 2",
                    "0,95",
                    "776,9",
                    "1.382",
                    getString(R.string.desc_strontium)
                ),

                Element(74,
                    R.drawable.shape_6,
                    "Y",
                    getString(R.string.yttrium),
                    39,
                    "88,90584",
                    "2, 8, 18, 9, 2",
                    "1,22",
                    "1.526",
                    "3.345",
                    getString(R.string.desc_yttrium)),

                Element(75,
                    R.drawable.shape_6,
                    "Zr",
                    getString(R.string.zirconium),
                    40,
                    "91,224",
                    "2, 8, 18, 10, 2",
                    "1,33",
                    "1.855",
                    "4.409",
                    getString(R.string.desc_zirconium)),

                Element(76,
                    R.drawable.shape_6,
                    "Nb",
                    getString(R.string.niobium),
                    41,
                    "92,90637",
                    "2, 8, 18, 12, 1",
                    "1,6",
                    "2.477",
                    "4.744",
                    getString(R.string.desc_niobium)),

                Element(77,
                    R.drawable.shape_6,
                    "Mo",
                    getString(R.string.molybdenum),
                    42,
                    "95,95",
                    "2, 8, 18, 13, 1",
                    "2,16",
                    "2.623",
                    "4.639",
                    getString(R.string.desc_molybdenum)),

                Element(78,
                    R.drawable.shape_6,
                    "Tc",
                    getString(R.string.technetium),
                    43,
                    "98",
                    "2, 8, 18, 13, 2",
                    "1,9",
                    "2.157",
                    "4.265",
                    getString(R.string.desc_technetium)
                ),

                Element(
                    79,
                    R.drawable.shape_6,
                    "Ru",
                    getString(R.string.ruthenium),
                    44,
                    "101,07",
                    "2, 8, 18, 15, 1",
                    "2,2",
                    "2.334",
                    "4.150",
                    getString(R.string.desc_ruthenium)
                ),

                Element(
                    80,
                    R.drawable.shape_6,
                    "Rh",
                    getString(R.string.rhodium),
                    45,
                    "102,90550",
                    "2, 8, 18, 16, 1",
                    "2,28",
                    "1.964",
                    "3.695",
                    getString(R.string.desc_rhodium)
                ),

                Element(
                    81,
                    R.drawable.shape_6,
                    "Pd",
                    getString(R.string.palladium),
                    46,
                    "106,42",
                    "2, 8, 18, 18",
                    "2,20",
                    "1.554,90",
                    "2.963",
                    getString(R.string.desc_palladium)
                ),

                Element(
                    82,
                    R.drawable.shape_6,
                    "Ag",
                    getString(R.string.silver),
                    47,
                    "107,8682",
                    "2, 8, 18, 18, 1",
                    "1,93",
                    "961,780",
                    "2.162",
                    getString(R.string.desc_silver)
                ),

                Element(
                    83,
                    R.drawable.shape_6,
                    "Cd",
                    getString(R.string.cadmium),
                    48,
                    "112,414",
                    "2, 8, 18, 18, 2",
                    "1,69",
                    "321,07",
                    "766,9",
                    getString(R.string.desc_cadmium)
                ),

                Element(
                    84,
                    R.drawable.shape_8,
                    "In",
                    getString(R.string.indium),
                    49,
                    "114,818",
                    "2, 8, 18, 18, 3",
                    "1,78",
                    "156,60",
                    "2.072",
                    getString(R.string.desc_indium)
                ),

                Element(
                    85,
                    R.drawable.shape_8,
                    "Sn",
                    getString(R.string.tin),
                    50,
                    "118,710",
                    "2, 8, 18, 18, 4",
                    "1,96",
                    "231,93",
                    "2.602",
                    getString(R.string.desc_tin)
                ),

                Element(
                    86,
                    R.drawable.shape_7,
                    "Sb",
                    getString(R.string.antimony),
                    51,
                    "121,760",
                    "2, 8, 18, 18, 5",
                    "2,05",
                    "630,63",
                    "1.587",
                    getString(R.string.desc_antimony)
                ),

                Element(
                    87,
                    R.drawable.shape_7,
                    "Te",
                    getString(R.string.tellurium),
                    52,
                    "127,60",
                    "2, 8, 18, 18, 6",
                    "2,1",
                    "449,51",
                    "987,9",
                    getString(R.string.desc_tellurium)
                ),

                Element(
                    88,
                    R.drawable.shape_5,
                    "I",
                    getString(R.string.iodine),
                    53,
                    "126,90447",
                    "2, 8, 18, 18, 7",
                    "2,66",
                    "113,70",
                    "184,3",
                    getString(R.string.desc_iodine)
                ),

                Element(
                    89,
                    R.drawable.shape_2,
                    "Xe",
                    getString(R.string.xenon),
                    54,
                    "131,293",
                    "2, 8, 18, 18, 8",
                    "2,6",
                    "111,8",
                    "108,0",
                    getString(R.string.desc_xenon)
                ),

                Element(
                    90,
                    R.drawable.shape_3,
                    "Cs",
                    getString(R.string.cesium),
                    55,
                    "132,90545196",
                    "2, 8, 18, 18, 8, 1",
                    "0,79",
                    "28,440",
                    "671",
                    getString(R.string.desc_cesium)
                ),

                Element(
                    91,
                    R.drawable.shape_4,
                    "Ba",
                    getString(R.string.barium),
                    56,
                    "137,327",
                    "2, 8, 18, 18, 8, 2",
                    "0,89",
                    "730",
                    "1.870",
                    getString(R.string.desc_barium)
                ),

                LantActi(
                    92,
                    R.drawable.shape_7,
                    "57-71",
                    "Lanthanoids"
                ),

                Element(
                    93,
                    R.drawable.shape_6,
                    "Hf",
                    getString(R.string.hafnium),
                    72,
                    "178,486",
                    "2, 8, 18, 32, 10, 2",
                    "1,3",
                    "2.233",
                    "4.603",
                    getString(R.string.desc_hafnium)
                ),

                Element(
                    94,
                    R.drawable.shape_6,
                    "Ta",
                    getString(R.string.tantalum),
                    73,
                    "178,486",
                    "2, 8, 18, 32, 10, 2",
                    "1,3",
                    "2.233",
                    "4.603",
                    getString(R.string.desc_tantalum)
                ),

                Element(
                    95,
                    R.drawable.shape_6,
                    "W",
                    getString(R.string.tungsten),
                    74,
                    "183,84",
                    "2, 8, 18, 32, 12, 2",
                    "2,36",
                    "3.422",
                    "5.555",
                    getString(R.string.desc_tungsten)),

                Element(
                    96,
                    R.drawable.shape_6,
                    "Re",
                    getString(R.string.rhenium),
                    75,
                    "186,207",
                    "2, 8, 18, 32, 13, 2",
                    "1,9",
                    "3.186",
                    "5.596",
                    getString(R.string.desc_rhenium)
                ),

                Element(
                    97,
                    R.drawable.shape_6,
                    "Os",
                    getString(R.string.osmium),
                    76,
                    "190,23",
                    "2, 8, 18, 32, 14, 2",
                    "2,2",
                    "3.033",
                    "5.012",
                    getString(R.string.desc_osmium)
                ),

                Element(
                    98,
                    R.drawable.shape_6,
                    "Ir",
                    getString(R.string.iridium),
                    77,
                    "192,217",
                    "2, 8, 18, 32, 15, 2",
                    "2,20",
                    "2.466",
                    "4.428",
                    getString(R.string.desc_iridium)),

                Element(
                    99,
                    R.drawable.shape_6,
                    "Pt",
                    getString(R.string.platinum),
                    78,
                    "195,084",
                    "2, 8, 18, 32, 17, 1",
                    "2,28",
                    "1.768,3",
                    "3.825",
                    getString(R.string.desc_platinum)),

                Element(
                    100,
                    R.drawable.shape_6,
                    "Au",
                    getString(R.string.gold),
                    79,
                    "196,966569",
                    "2, 8, 18, 32, 18, 1",
                    "2,54",
                    "1.064,18",
                    "2.856",
                    getString(R.string.desc_gold)
                ),

                Element(
                    101,
                    R.drawable.shape_6,
                    "Hg",
                    getString(R.string.mercury),
                    80,
                    "200,59",
                    "2, 8, 18, 32, 18, 2",
                    "2,0",
                    "38,830",
                    "356,73",
                    getString(R.string.desc_mercury)
                ),

                Element(
                    102,
                    R.drawable.shape_8,
                    "Tl",
                    getString(R.string.thallium),
                    81,
                    "204,38",
                    "2, 8, 18, 32, 18, 3",
                    "1,62",
                    "304",
                    "1.473",
                    getString(R.string.desc_thallium)
                ),

                Element(
                    103,
                    R.drawable.shape_8,
                    "Pb",
                    getString(R.string.lead),
                    82,
                    "207,2",
                    "2, 8, 18, 32, 18, 4",
                    "2,33",
                    "327,46",
                    "1.749",
                    getString(R.string.desc_lead)
                ),

                Element(
                    104,
                    R.drawable.shape_8,
                    "Bi",
                    getString(R.string.bismuth),
                    83,
                    "208,98040",
                    "2, 8, 18, 32, 18, 5",
                    "2,02",
                    "271,3",
                    "1.564",
                    getString(R.string.desc_bismuth)
                ),

                Element(
                    105,
                    R.drawable.shape_7,
                    "Po",
                    getString(R.string.polonium),
                    84,
                    "209",
                    "2, 8, 18, 32, 18, 6",
                    "2,0",
                    "255",
                    "961,9",
                    getString(R.string.desc_polonium)
                ),

                Element(
                    106,
                    R.drawable.shape_5,
                    "At",
                    getString(R.string.astatine),
                    85,
                    "210",
                    "2, 8, 18, 32, 18, 7",
                    "2,2",
                    "302",
                    "350",
                    getString(R.string.desc_astatine)
                ),

                Element(
                    107,
                    R.drawable.shape_2,
                    "Rn",
                    getString(R.string.radon),
                    86,
                    "222",
                    "2, 8, 18, 32, 18, 8",
                    null,
                    "-71,1",
                    "-61,85",
                    getString(R.string.desc_radon)),

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


        /*val elementList = arrayListOf<Any?>()

        for (i in 0..178) {
            elementList.add(null)
        }

        for (item in list) {
            when (item) {
                is Element -> {
                    elementList[item.index] = item
                }
                is LantActi -> {
                    elementList[item.index] = item
                }
            }
        }*/
        return elementList
    }
}