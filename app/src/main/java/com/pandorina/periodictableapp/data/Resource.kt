package com.pandorina.periodictableapp.data

import android.content.Context
import com.pandorina.periodictableapp.R
import com.pandorina.periodictableapp.data.model.Element
import com.pandorina.periodictableapp.data.model.LantActi

object Resource {
    fun getElementList(context: Context): ArrayList<Any?> {
        return context.run {
            arrayListOf(
                Element(
                    0,
                    R.drawable.shape_1,
                    "H",
                    "Hydrogen",
                    getString(R.string.hydrogen),
                    1,
                    "1,008",
                    "1",
                    "2,20",
                    "-259,1",
                    "-252,9",
                    getString(R.string.desc_hydrogen)
                ),
                Element(
                    17,
                    R.drawable.shape_2,
                    "He",
                    "Helium",
                    getString(R.string.helium),
                    2,
                    "4,002602",
                    "2",
                    null,
                    null,
                    "-269",
                    getString(R.string.desc_helium)
                ),

                Element(
                    18,
                    R.drawable.shape_3,
                    "Li",
                    "Lithium",
                    getString(R.string.lithium),
                    3,
                    "6,94",
                    "2, 1",
                    "0,98",
                    "180,54",
                    "1.342",
                    getString(R.string.desc_lithium)
                ),
                Element(
                    19,
                    R.drawable.shape_4,
                    "Be",
                    "Beryllium",
                    getString(R.string.beryllium),
                    4,
                    "9,0121831",
                    "2, 2",
                    "1,57",
                    "1.287",
                    "2.470",
                    getString(R.string.desc_beryllium)
                ),
                Element(
                    30,
                    R.drawable.shape_7,
                    "B",
                    "Boron",
                    getString(R.string.boron),
                    5,
                    "10,81",
                    "2, 3",
                    "2,04",
                    "2.075",
                    "4.000",
                    getString(R.string.desc_boron)
                ),
                Element(
                    31,
                    R.drawable.shape_1,
                    "C",
                    "Carbon",
                    getString(R.string.carbon),
                    6,
                    "12,011",
                    "2, 4",
                    "2,55",
                    "3,642",
                    "3,642",
                    getString(R.string.desc_carbon)
                ),
                Element(
                    32,
                    R.drawable.shape_1,
                    "N",
                    "Nitrogen",
                    getString(R.string.nitrogen),
                    7,
                    "14,007",
                    "2, 5",
                    "3,04",
                    "-210,1",
                    "-195,8",
                    getString(R.string.desc_nitrogen)
                ),
                Element(
                    33,
                    R.drawable.shape_1,
                    "O",
                    "Oxygen",
                    getString(R.string.oxygen),
                    8,
                    "15,999",
                    "2, 6",
                    "3,44",
                    "-218",
                    "-183",
                    getString(R.string.desc_oxygen)
                ),
                Element(
                    34,
                    R.drawable.shape_5,
                    "F",
                    "Fluorine",
                    getString(R.string.fluorine),
                    9,
                    "18,998403163",
                    "2, 7",
                    "3,98",
                    "-220",
                    "-188,1",
                    getString(R.string.desc_fluorine)
                ),
                Element(
                    35,
                    R.drawable.shape_2,
                    "Ne",
                    "Neon",
                    getString(R.string.neon),
                    10,
                    "20,1797",
                    "2, 8",
                    null,
                    "-248,6",
                    "-246,1",
                    getString(R.string.desc_neon)
                ),
                Element(
                    36,
                    R.drawable.shape_3,
                    "Na",
                    "Sodium",
                    getString(R.string.sodium),
                    11,
                    "22,98976928",
                    "2, 8, 1",
                    "0,93",
                    "97,720",
                    "882,9",
                    getString(R.string.desc_sodium)
                ),
                Element(
                    37,
                    R.drawable.shape_4,
                    "Mg",
                    "Magnesium",
                    getString(R.string.magnesium),
                    12,
                    "24,305",
                    "2, 8, 2",
                    "1,31",
                    "650",
                    "1,090",
                    getString(R.string.desc_magnesium)
                ),
                Element(
                    48,
                    R.drawable.shape_8,
                    "Al",
                    "Aluminium",
                    getString(R.string.aluminum),
                    13,
                    "26,9815385",
                    "2, 8, 3",
                    "1,31",
                    "660,32",
                    "2,519",
                    getString(R.string.desc_aluminum)
                ),
                Element(
                    49,
                    R.drawable.shape_7,
                    "Si",
                    "Silicon",
                    getString(R.string.silicon),
                    14,
                    "28,085",
                    "2, 8, 4",
                    "1,90",
                    "1.414",
                    "2.900",
                    getString(R.string.desc_silicon)
                ),
                Element(
                    50,
                    R.drawable.shape_1,
                    "P",
                    "Phosphorus",
                    getString(R.string.phosphorus),
                    15,
                    "30,973761998",
                    "2, 8, 5",
                    "2,19",
                    "44,15",
                    "280,5",
                    getString(R.string.desc_phosphorus)
                ),
                Element(
                    51,
                    R.drawable.shape_1,
                    "S",
                    "Sulfur",
                    getString(R.string.sulfur),
                    16,
                    "32,06",
                    "2, 8, 6",
                    "2,58",
                    "115,21",
                    "444,72",
                    getString(R.string.desc_sulfur)
                ),
                Element(
                    52,
                    R.drawable.shape_5,
                    "Cl",
                    "Chlorine",
                    getString(R.string.chlorine),
                    17,
                    "35,45",
                    "2, 8, 7",
                    "3,16",
                    "-101,5",
                    "-34,040",
                    getString(R.string.desc_chlorine)
                ),
                Element(
                    53,
                    R.drawable.shape_2,
                    "Ar",
                    "Argon",
                    getString(R.string.argon),
                    18,
                    "39,948",
                    "2, 8, 8",
                    null,
                    "-189",
                    "-186",
                    getString(R.string.desc_argon)
                ),

                Element(
                    54,
                    R.drawable.shape_3,
                    "K",
                    "Potassium",
                    getString(R.string.potassium),
                    19,
                    "39,0983",
                    "2, 8, 8, 1",
                    "0,82",
                    "63,380",
                    "758,9",
                    getString(R.string.desc_potassium)
                ),

                Element(
                    55,
                    R.drawable.shape_4,
                    "Ca",
                    "Calcium",
                    getString(R.string.calcium),
                    20,
                    "40,078",
                    "2, 8, 8, 2",
                    "1,0",
                    "841,9",
                    "1.484",
                    getString(R.string.desc_calcium)
                ),

                Element(
                    56,
                    R.drawable.shape_6,
                    "Sc",
                    "Scandium",
                    getString(R.string.scandium),
                    21,
                    "44,955908",
                    "2, 8, 9, 2",
                    "1,36",
                    "1.541",
                    "2.830",
                    getString(R.string.desc_scandium)
                ),

                Element(
                    57,
                    R.drawable.shape_6,
                    "Ti",
                    "Titanium",
                    getString(R.string.titanium),
                    22,
                    "47,867",
                    "2, 8, 10, 2",
                    "1,54",
                    "1.668",
                    "3.287",
                    getString(R.string.desc_titanium)
                ),

                Element(
                    58,
                    R.drawable.shape_6,
                    "V",
                    "Vanadium",
                    getString(R.string.vanadium),
                    23,
                    "50,9415",
                    "2, 8, 11, 2",
                    "1,63",
                    "1.910",
                    "3.407",
                    getString(R.string.desc_vanadium)
                ),

                Element(
                    59,
                    R.drawable.shape_6,
                    "Cr",
                    "Chromium",
                    getString(R.string.chromium),
                    24,
                    "51,9961",
                    "2, 8, 13, 1",
                    "1,66",
                    "1.907",
                    "2.671",
                    getString(R.string.desc_chromium)
                ),

                Element(
                    60,
                    R.drawable.shape_6,
                    "Mn",
                    "Manganese",
                    getString(R.string.manganese),
                    25,
                    "54,938044",
                    "2, 8, 13, 2",
                    "1,55",
                    "1.246",
                    "2.061",
                    getString(R.string.desc_manganese)
                ),

                Element(
                    61,
                    R.drawable.shape_6,
                    "Fe",
                    "Iron",
                    getString(R.string.iron),
                    26,
                    "55,845",
                    "2, 8, 14, 2",
                    "1,83",
                    "1.538",
                    "2.861",
                    getString(R.string.desc_iron)
                ),

                Element(
                    62,
                    R.drawable.shape_6,
                    "Co",
                    "Cobalt",
                    getString(R.string.cobalt),
                    27,
                    "58,933194",
                    "2, 8, 15, 2",
                    "1,88",
                    "1.495",
                    "2.900",
                    getString(R.string.desc_cobalt)
                ),

                Element(
                    63,
                    R.drawable.shape_6,
                    "Ni",
                    "Nickel",
                    getString(R.string.nickel),
                    28,
                    "58,6934",
                    "2, 8, 16, 2",
                    "1,91",
                    "1.455",
                    "2.913",
                    getString(R.string.desc_nickel)
                ),

                Element(
                    64,
                    R.drawable.shape_6,
                    "Cu",
                    "Copper",
                    getString(R.string.copper),
                    29,
                    "63,546",
                    "2, 8, 18, 1",
                    "1,90",
                    "1.084,62",
                    "2.562",
                    getString(R.string.desc_copper)
                ),

                Element(
                    65,
                    R.drawable.shape_6,
                    "Zn",
                    "Zinc",
                    getString(R.string.zinc),
                    30,
                    "65,38",
                    "2, 8, 18, 2",
                    "1,65",
                    "419,53",
                    "906,9",
                    getString(R.string.desc_zinc)
                ),

                Element(
                    66,
                    R.drawable.shape_8,
                    "Ga",
                    "Gallium",
                    getString(R.string.gallium),
                    31,
                    "69,723",
                    "2, 8, 18, 3",
                    "1,81",
                    "29,760",
                    "2.204",
                    getString(R.string.desc_gallium)
                ),

                Element(
                    67,
                    R.drawable.shape_7,
                    "Ge",
                    "Germanium",
                    getString(R.string.germanium),
                    32,
                    "72,63",
                    "2, 8, 18, 4",
                    "2,01",
                    "938,25",
                    "2.820",
                    getString(R.string.desc_germanium)
                ),

                Element(
                    68,
                    R.drawable.shape_7,
                    "As",
                    "Arsenic",
                    getString(R.string.arsenic),
                    33,
                    "74,921595",
                    "2, 8, 18, 5",
                    "2,18",
                    "816,9",
                    "614",
                    getString(R.string.desc_arsenic)
                ),

                Element(
                    69,
                    R.drawable.shape_1,
                    "Se",
                    "Selenium",
                    getString(R.string.selenium),
                    34,
                    "78,971",
                    "2, 8, 18, 6",
                    "2,55",
                    "221",
                    "685",
                    getString(R.string.desc_selenium)
                ),

                Element(
                    70,
                    R.drawable.shape_5,
                    "Br",
                    "Bromine",
                    getString(R.string.bromine),
                    35,
                    "79,904",
                    "2, 8, 18, 7",
                    "2,96",
                    "-7,350",
                    "58,9",
                    getString(R.string.desc_bromine)
                ),

                Element(
                    71,
                    R.drawable.shape_2,
                    "Kr",
                    "Krypton",
                    getString(R.string.krypton),
                    36,
                    "83,798",
                    "2, 8, 18, 8",
                    "3,0",
                    "-157,36",
                    "-153,22",
                    getString(R.string.desc_krypton)
                ),

                Element(
                    72,
                    R.drawable.shape_3,
                    "Rb",
                    "Rubidium",
                    getString(R.string.rubidium),
                    37,
                    "85,4678",
                    "2, 8, 18, 8, 1",
                    "0,82",
                    "39,310",
                    "688",
                    getString(R.string.desc_rubidium)
                ),

                Element(
                    73,
                    R.drawable.shape_4,
                    "Sr",
                    "Strontium",
                    getString(R.string.strontium),
                    38,
                    "87,62",
                    "2, 8, 18, 8, 2",
                    "0,95",
                    "776,9",
                    "1.382",
                    getString(R.string.desc_strontium)
                ),

                Element(
                    74,
                    R.drawable.shape_6,
                    "Y",
                    "Yttrium",
                    getString(R.string.yttrium),
                    39,
                    "88,90584",
                    "2, 8, 18, 9, 2",
                    "1,22",
                    "1.526",
                    "3.345",
                    getString(R.string.desc_yttrium)
                ),

                Element(
                    75,
                    R.drawable.shape_6,
                    "Zr",
                    "Zirconium",
                    getString(R.string.zirconium),
                    40,
                    "91,224",
                    "2, 8, 18, 10, 2",
                    "1,33",
                    "1.855",
                    "4.409",
                    getString(R.string.desc_zirconium)
                ),

                Element(
                    76,
                    R.drawable.shape_6,
                    "Nb",
                    "Niobium",
                    getString(R.string.niobium),
                    41,
                    "92,90637",
                    "2, 8, 18, 12, 1",
                    "1,6",
                    "2.477",
                    "4.744",
                    getString(R.string.desc_niobium)
                ),

                Element(
                    77,
                    R.drawable.shape_6,
                    "Mo",
                    "Molybdenum",
                    getString(R.string.molybdenum),
                    42,
                    "95,95",
                    "2, 8, 18, 13, 1",
                    "2,16",
                    "2.623",
                    "4.639",
                    getString(R.string.desc_molybdenum)
                ),

                Element(
                    78,
                    R.drawable.shape_6,
                    "Tc",
                    "Technetium",
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
                    "Ruthenium",
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
                    "Rhodium",
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
                    "Palladium",
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
                    "Silver",
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
                    "Cadmium",
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
                    "Indium",
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
                    "Tin",
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
                    "Antimony",
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
                    "Tellurium",
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
                    "Iodine",
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
                    "Xenon",
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
                    "Cesium",
                    getString(R.string.cesium),
                    87,
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
                    "Barium",
                    getString(R.string.barium),
                    88,
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
                    getString(R.string.lanthanoids)
                ),

                Element(
                    93,
                    R.drawable.shape_6,
                    "Hf",
                    "Hafnium",
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
                    "Tantalum",
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
                    "Tungsten",
                    getString(R.string.tungsten),
                    74,
                    "183,84",
                    "2, 8, 18, 32, 12, 2",
                    "2,36",
                    "3.422",
                    "5.555",
                    getString(R.string.desc_tungsten)
                ),

                Element(
                    96,
                    R.drawable.shape_6,
                    "Re",
                    "Rhenium",
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
                    "Osmium",
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
                    "Iridium",
                    getString(R.string.iridium),
                    77,
                    "192,217",
                    "2, 8, 18, 32, 15, 2",
                    "2,20",
                    "2.466",
                    "4.428",
                    getString(R.string.desc_iridium)
                ),

                Element(
                    99,
                    R.drawable.shape_6,
                    "Pt",
                    "Platinum",
                    getString(R.string.platinum),
                    78,
                    "195,084",
                    "2, 8, 18, 32, 17, 1",
                    "2,28",
                    "1.768,3",
                    "3.825",
                    getString(R.string.desc_platinum)
                ),

                Element(
                    100,
                    R.drawable.shape_6,
                    "Au",
                    "Gold",
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
                    "Mercury",
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
                    "Thallium",
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
                    "Lead",
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
                    "Bismuth",
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
                    "Polonium",
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
                    "Astatine",
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
                    "Radon",
                    getString(R.string.radon),
                    86,
                    "222",
                    "2, 8, 18, 32, 18, 8",
                    null,
                    "-71,1",
                    "-61,85",
                    getString(R.string.desc_radon)
                ),

                Element(
                    108,
                    R.drawable.shape_3,
                    "Fr",
                    "Francium",
                    getString(R.string.francium),
                    55,
                    "223",
                    "2, 8, 18, 32, 18, 8, 1",
                    "0,7",
                    "20,9",
                    "650",
                    getString(R.string.desc_francium)
                ),

                Element(
                    109,
                    R.drawable.shape_4,
                    "Ra",
                    "Radium",
                    getString(R.string.radium),
                    56,
                    "226",
                    "2, 8, 18, 32, 18, 8, 2",
                    "0,9",
                    "700",
                    "1.737",
                    getString(R.string.desc_radium)
                ),

                LantActi(
                    110,
                    R.drawable.shape_7,
                    "89-103",
                    getString(R.string.actinioids)
                ),

                Element(
                    111,
                    R.drawable.shape_6,
                    "Rf",
                    "Rutherfordium",
                    getString(R.string.rutherfordium),
                    104,
                    "267",
                    "2, 8, 18, 32, 32, 10, 2",
                    null,
                    null,
                    null,
                    getString(R.string.desc_rutherfordium)
                ),

                Element(
                    112,
                    R.drawable.shape_6,
                    "Db",
                    "Dubnium",
                    getString(R.string.dubnium),
                    105,
                    "268",
                    "2, 8, 18, 32, 32, 11, 2",
                    null,
                    null,
                    null,
                    getString(R.string.desc_dubnium)
                ),

                Element(
                    113,
                    R.drawable.shape_6,
                    "Sg",
                    "Seaborgium",
                    getString(R.string.seaborgium),
                    106,
                    "269",
                    "2, 8, 18, 32, 32, 12, 2",
                    null,
                    null,
                    null,
                    getString(R.string.desc_seaborgium)
                ),

                Element(
                    114,
                    R.drawable.shape_6,
                    "Bh",
                    "Bohrium",
                    getString(R.string.bohrium),
                    107,
                    "270",
                    "2, 8, 18, 32, 32, 13, 2",
                    null,
                    null,
                    null,
                    getString(R.string.desc_bohrium)
                ),

                Element(
                    115,
                    R.drawable.shape_6,
                    "Hs",
                    "Hassium",
                    getString(R.string.hassium),
                    108,
                    "270",
                    "2, 8, 18, 32, 32, 14, 2",
                    null,
                    null,
                    null,
                    getString(R.string.desc_hassium)
                ),

                Element(
                    116,
                    R.drawable.shape_6,
                    "Mt",
                    "Meitnerium",
                    getString(R.string.meitnerium),
                    109,
                    "278",
                    "2, 8, 18, 32, 32, 15, 2",
                    null,
                    null,
                    null,
                    getString(R.string.desc_meitnerium)
                ),

                Element(
                    117,
                    R.drawable.shape_6,
                    "Ds",
                    "Darmstadtium",
                    getString(R.string.darmstadtium),
                    110,
                    "281",
                    "2, 8, 18, 32, 32, 17, 1",
                    null,
                    null,
                    null,
                    getString(R.string.desc_darmstadtium)
                ),

                Element(
                    118,
                    R.drawable.shape_6,
                    "Rg",
                    "Roentgenium",
                    getString(R.string.roentgenium),
                    111,
                    "281",
                    "2, 8, 18, 32, 32, 17, 1",
                    null,
                    null,
                    null,
                    getString(R.string.desc_roentgenium)
                ),

                Element(
                    119,
                    R.drawable.shape_6,
                    "Cn",
                    "Copernicium",
                    getString(R.string.copernicium),
                    112,
                    "285",
                    "2, 8, 18, 32, 32, 18, 2",
                    null,
                    null,
                    null,
                    getString(R.string.desc_copernicium)
                ),

                Element(
                    120,
                    R.drawable.shape_8,
                    "Nh",
                    "Nihonium",
                    getString(R.string.nihonium),
                    113,
                    "286",
                    "2, 8, 18, 32, 32, 18, 3",
                    null,
                    null,
                    null,
                    getString(R.string.desc_nihonium)
                ),

                Element(
                    121,
                    R.drawable.shape_8,
                    "Fl",
                    "Flerovium",
                    getString(R.string.flerovium),
                    114,
                    "289",
                    "2, 8, 18, 32, 32, 18, 4",
                    null,
                    null,
                    null,
                    getString(R.string.desc_flerovium)
                ),

                Element(
                    122,
                    R.drawable.shape_8,
                    "Mc",
                    "Moscovium",
                    getString(R.string.moscovium),
                    115,
                    "290",
                    "2, 8, 18, 32, 32, 18, 5",
                    null,
                    null,
                    null,
                    getString(R.string.desc_moscovium)
                ),

                Element(
                    123,
                    R.drawable.shape_8,
                    "Lv",
                    "Livermorium",
                    getString(R.string.livermorium),
                    116,
                    "293",
                    "2, 8, 18, 32, 32, 18, 6",
                    null,
                    null,
                    null,
                    getString(R.string.desc_livermorium)
                ),

                Element(
                    124,
                    R.drawable.shape_5,
                    "Ts",
                    "Tenessine",
                    getString(R.string.tenessine),
                    117,
                    "294",
                    "2, 8, 18, 32, 32, 18, 7",
                    null,
                    null,
                    null,
                    getString(R.string.desc_tenessine)
                ),

                Element(
                    125,
                    R.drawable.shape_2,
                    "Og",
                    "Oganesson",
                    getString(R.string.oganesson),
                    118,
                    "294",
                    "2, 8, 18, 32, 32, 18, 8",
                    null,
                    null,
                    null,
                    getString(R.string.desc_oganesson)
                ),

                Element(
                    146,
                    R.drawable.shape_7,
                    "La",
                    "Lanthanum",
                    getString(R.string.lanthanum),
                    57,
                    "138,90547",
                    "2, 8, 18, 18, 9, 2",
                    "1,10",
                    "919,9",
                    "3.464",
                    getString(R.string.desc_lanthanum)
                ),

                Element(
                    147,
                    R.drawable.shape_7,
                    "Ce",
                    "Cerium",
                    getString(R.string.cerium),
                    58,
                    "140,116",
                    "2, 8, 18, 19, 9, 2",
                    "1,12",
                    "797,9",
                    "3.360",
                    getString(R.string.desc_cerium)
                ),

                Element(
                    148,
                    R.drawable.shape_7,
                    "Pr",
                    "Praseodymium",
                    getString(R.string.praseodymium),
                    59,
                    "140,90766",
                    "2, 8, 18, 21, 8, 2",
                    "1,13",
                    "930,9",
                    "3.290",
                    getString(R.string.desc_praseodymium)
                ),

                Element(
                    149,
                    R.drawable.shape_7,
                    "Nd",
                    "Neodymium",
                    getString(R.string.neodymium),
                    60,
                    "144,242",
                    "2, 8, 18, 22, 8, 2",
                    "1,14",
                    "1.021",
                    "3.100",
                    getString(R.string.desc_neodymium)
                ),

                Element(
                    150,
                    R.drawable.shape_7,
                    "Pm",
                    "Promethium",
                    getString(R.string.promethium),
                    61,
                    "145",
                    "2, 8, 18, 23, 8, 2",
                    null,
                    "1.100",
                    "3.000",
                    getString(R.string.desc_promethium)
                ),

                Element(
                    151,
                    R.drawable.shape_7,
                    "Sm",
                    "Samarium",
                    getString(R.string.samarium),
                    62,
                    "150,36",
                    "2, 8, 18, 24, 8, 2",
                    "1,17",
                    "1.072",
                    "1.803",
                    getString(R.string.desc_samarium)
                ),

                Element(
                    152,
                    R.drawable.shape_7,
                    "Eu",
                    "Europium",
                    getString(R.string.europium),
                    63,
                    "151,964",
                    "2, 8, 18, 25, 8, 2",
                    null,
                    "821,9",
                    "1.500",
                    getString(R.string.desc_europium)
                ),

                Element(
                    153,
                    R.drawable.shape_7,
                    "Gd",
                    "Gadolinium",
                    getString(R.string.gadolinium),
                    64,
                    "157,25",
                    "2, 8, 18, 25, 9, 2",
                    "1,20",
                    "1.313",
                    "3.250",
                    getString(R.string.desc_gadolinium)
                ),

                Element(
                    154,
                    R.drawable.shape_7,
                    "Tb",
                    "Terbium",
                    getString(R.string.terbium),
                    65,
                    "158,92535",
                    "2, 8, 18, 27, 8, 2",
                    null,
                    "1.356",
                    "3.230",
                    getString(R.string.desc_terbium)
                ),

                Element(
                    155,
                    R.drawable.shape_7,
                    "Dy",
                    "Dysprosium",
                    getString(R.string.dysprosium),
                    66,
                    "162,500",
                    "2, 8, 18, 28, 8, 2",
                    "1,22",
                    "1.412",
                    "2.567",
                    getString(R.string.desc_dysprosium)
                ),

                Element(
                    156,
                    R.drawable.shape_7,
                    "Ho",
                    "Holmium",
                    getString(R.string.holmium),
                    67,
                    "164,93033",
                    "2, 8, 18, 29, 8, 2",
                    "1,23",
                    "1.474",
                    "2.700",
                    getString(R.string.desc_holmium)
                ),

                Element(
                    157,
                    R.drawable.shape_7,
                    "Er",
                    "Erbium",
                    getString(R.string.erbium),
                    68,
                    "167,259",
                    "2, 8, 18, 30, 8, 2",
                    "1,24",
                    "1.497",
                    "2.868",
                    getString(R.string.desc_erbium)
                ),

                Element(
                    158,
                    R.drawable.shape_7,
                    "Tm",
                    "Thulium",
                    getString(R.string.thulium),
                    69,
                    "168,93422",
                    "2, 8, 18, 31, 8, 2",
                    "1,25",
                    "1.545",
                    "1.950",
                    getString(R.string.desc_thulium)
                ),

                Element(
                    159,
                    R.drawable.shape_7,
                    "Yb",
                    "Ytterbium",
                    getString(R.string.ytterbium),
                    70,
                    "173,045",
                    "2, 8, 18, 32, 8, 2",
                    null,
                    "818,9",
                    "1.196",
                    getString(R.string.desc_ytterbium)
                ),

                Element(
                    160,
                    R.drawable.shape_7,
                    "Lu",
                    "Lutetium",
                    getString(R.string.lutetium),
                    71,
                    "174,9668",
                    "2, 8, 18, 32, 9, 2",
                    "1,27",
                    "1.663",
                    "3.402",
                    getString(R.string.desc_lutetium)
                ),

                Element(
                    164,
                    R.drawable.shape_7,
                    "Ac",
                    "Actinium",
                    getString(R.string.actinium),
                    89,
                    "227",
                    "2, 8, 18, 32, 18, 9, 2",
                    "1,1",
                    "1.050",
                    "3.200",
                    getString(R.string.desc_actinium)
                ),

                Element(
                    165,
                    R.drawable.shape_7,
                    "Th",
                    "Thorium",
                    getString(R.string.thorium),
                    90,
                    "232,0377",
                    "2, 8, 18, 32, 18, 10, 2",
                    "1,3",
                    "1.750",
                    "4.820",
                    getString(R.string.desc_thorium)
                ),

                Element(
                    166,
                    R.drawable.shape_7,
                    "Pa",
                    "Protactinium",
                    getString(R.string.protactinium),
                    91,
                    "231,03588",
                    "2, 8, 18, 32, 20, 9, 2",
                    "1,5",
                    "1.572",
                    "4.000",
                    getString(R.string.desc_protactinium)
                ),

                Element(
                    167,
                    R.drawable.shape_7,
                    "U",
                    "Uranium",
                    getString(R.string.uranium),
                    92,
                    "238,02891",
                    "2, 8, 18, 32, 21, 9, 2",
                    "1,38",
                    "1.135",
                    "3.900",
                    getString(R.string.desc_uranium)
                ),

                Element(
                    168,
                    R.drawable.shape_7,
                    "Np",
                    "Neptunium",
                    getString(R.string.neptunium),
                    93,
                    "237",
                    "2, 8, 18, 32, 22, 9, 2",
                    "1,36",
                    "644",
                    "4.000",
                    getString(R.string.desc_neptunium)
                ),

                Element(
                    169,
                    R.drawable.shape_7,
                    "Pu",
                    "Plutonium",
                    getString(R.string.plutonium),
                    94,
                    "244",
                    "2, 8, 18, 32, 24, 8, 2",
                    "1,28",
                    "640",
                    "3.230",
                    getString(R.string.desc_plutonium)
                ),

                Element(
                    170,
                    R.drawable.shape_7,
                    "Am",
                    "Americium",
                    getString(R.string.americium),
                    95,
                    "243",
                    "2, 8, 18, 32, 25, 8, 2",
                    "1,3",
                    "1.176",
                    "2.011",
                    getString(R.string.desc_americium)
                ),

                Element(
                    171,
                    R.drawable.shape_7,
                    "Cm",
                    "Curium",
                    getString(R.string.curium),
                    96,
                    "247",
                    "2, 8, 18, 32, 25, 9, 2",
                    "1,3",
                    "1.345",
                    "3.110",
                    getString(R.string.desc_curium)
                ),

                Element(
                    172,
                    R.drawable.shape_7,
                    "Bk",
                    "Berkelium",
                    getString(R.string.berkelium),
                    97,
                    "247",
                    "2, 8, 18, 32, 27, 8, 2",
                    "1,3",
                    "1.050",
                    null,
                    getString(R.string.desc_berkelium)
                ),

                Element(
                    173,
                    R.drawable.shape_7,
                    "Cf",
                    "Californium",
                    getString(R.string.californium),
                    98,
                    "251",
                    "2, 8, 18, 32, 28, 8, 2",
                    "1,3",
                    "899,9",
                    null,
                    getString(R.string.desc_californium)
                ),

                Element(
                    174,
                    R.drawable.shape_7,
                    "Es",
                    "Einsteinium",
                    getString(R.string.einsteinium),
                    99,
                    "252",
                    "2, 8, 18, 32, 29, 8, 2",
                    "1,3",
                    "859,9",
                    null,
                    getString(R.string.desc_einsteinium)
                ),

                Element(
                    175,
                    R.drawable.shape_7,
                    "Fm",
                    "Fermium",
                    getString(R.string.fermium),
                    100,
                    "257",
                    "2, 8, 18, 32, 30, 8, 2",
                    "1,3",
                    "1.500",
                    null,
                    getString(R.string.desc_fermium)
                ),

                Element(
                    176,
                    R.drawable.shape_7,
                    "Md",
                    "Mendelevium",
                    getString(R.string.mendelevium),
                    101,
                    "258",
                    "2, 8, 18, 32, 31, 8, 2",
                    "1,3",
                    "830",
                    null,
                    getString(R.string.desc_mendelevium)
                ),

                Element(
                    177,
                    R.drawable.shape_7,
                    "No",
                    "Nobelium",
                    getString(R.string.nobelium),
                    102,
                    "259",
                    "2, 8, 18, 32, 32, 8, 2",
                    "1,3",
                    "830",
                    null,
                    getString(R.string.desc_nobelium)
                ),

                Element(
                    178,
                    R.drawable.shape_7,
                    "Lr",
                    "Lawrencium",
                    getString(R.string.lawrencium),
                    103,
                    "266",
                    "2, 8, 18, 32, 32, 8, 3",
                    null,
                    "1.600",
                    null,
                    getString(R.string.desc_lawrencium)
                )
            )
        }
    }
}