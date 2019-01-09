/*
* Copyright (c) 2002, 2013, Oracle and/or its affiliates. All rights reserved.
* DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
*
* This code is free software; you can redistribute it and/or modify it
* under the terms of the GNU General Public License version 2 only, as
* published by the Free Software Foundation.  Oracle designates this
* particular file as subject to the "Classpath" exception as provided
* by Oracle in the LICENSE file that accompanied this code.
*
* This code is distributed in the hope that it will be useful, but WITHOUT
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
* FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
* version 2 for more details (a copy is included in the LICENSE file that
* accompanied this code).
*
* You should have received a copy of the GNU General Public License version
* 2 along with this work; if not, write to the Free Software Foundation,
* Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
*
* Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
* or visit www.oracle.com if you need additional information or have any
* questions.
*/

package java.lang;
public final class Character
  implements java.io.Serializable, java.lang.Comparable<java.lang.Character>
{
public static class Subset
{
protected  Subset(java.lang.String name) { throw new RuntimeException("Stub!"); }
public final  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public final  int hashCode() { throw new RuntimeException("Stub!"); }
public final  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static final class UnicodeBlock
  extends java.lang.Character.Subset
{
UnicodeBlock() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public static  java.lang.Character.UnicodeBlock of(char c) { throw new RuntimeException("Stub!"); }
public static  java.lang.Character.UnicodeBlock of(int codePoint) { throw new RuntimeException("Stub!"); }
public static  java.lang.Character.UnicodeBlock forName(java.lang.String blockName) { throw new RuntimeException("Stub!"); }
public static final java.lang.Character.UnicodeBlock AEGEAN_NUMBERS;
public static final java.lang.Character.UnicodeBlock ALCHEMICAL_SYMBOLS;
public static final java.lang.Character.UnicodeBlock ALPHABETIC_PRESENTATION_FORMS;
public static final java.lang.Character.UnicodeBlock ANCIENT_GREEK_MUSICAL_NOTATION;
public static final java.lang.Character.UnicodeBlock ANCIENT_GREEK_NUMBERS;
public static final java.lang.Character.UnicodeBlock ANCIENT_SYMBOLS;
public static final java.lang.Character.UnicodeBlock ARABIC;
public static final java.lang.Character.UnicodeBlock ARABIC_EXTENDED_A;
public static final java.lang.Character.UnicodeBlock ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS;
public static final java.lang.Character.UnicodeBlock ARABIC_PRESENTATION_FORMS_A;
public static final java.lang.Character.UnicodeBlock ARABIC_PRESENTATION_FORMS_B;
public static final java.lang.Character.UnicodeBlock ARABIC_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock ARMENIAN;
public static final java.lang.Character.UnicodeBlock ARROWS;
public static final java.lang.Character.UnicodeBlock AVESTAN;
public static final java.lang.Character.UnicodeBlock BALINESE;
public static final java.lang.Character.UnicodeBlock BAMUM;
public static final java.lang.Character.UnicodeBlock BAMUM_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock BASIC_LATIN;
public static final java.lang.Character.UnicodeBlock BATAK;
public static final java.lang.Character.UnicodeBlock BENGALI;
public static final java.lang.Character.UnicodeBlock BLOCK_ELEMENTS;
public static final java.lang.Character.UnicodeBlock BOPOMOFO;
public static final java.lang.Character.UnicodeBlock BOPOMOFO_EXTENDED;
public static final java.lang.Character.UnicodeBlock BOX_DRAWING;
public static final java.lang.Character.UnicodeBlock BRAHMI;
public static final java.lang.Character.UnicodeBlock BRAILLE_PATTERNS;
public static final java.lang.Character.UnicodeBlock BUGINESE;
public static final java.lang.Character.UnicodeBlock BUHID;
public static final java.lang.Character.UnicodeBlock BYZANTINE_MUSICAL_SYMBOLS;
public static final java.lang.Character.UnicodeBlock CARIAN;
public static final java.lang.Character.UnicodeBlock CHAKMA;
public static final java.lang.Character.UnicodeBlock CHAM;
public static final java.lang.Character.UnicodeBlock CHEROKEE;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY_FORMS;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS;
public static final java.lang.Character.UnicodeBlock CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock CJK_RADICALS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock CJK_STROKES;
public static final java.lang.Character.UnicodeBlock CJK_SYMBOLS_AND_PUNCTUATION;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C;
public static final java.lang.Character.UnicodeBlock CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D;
public static final java.lang.Character.UnicodeBlock COMBINING_DIACRITICAL_MARKS;
public static final java.lang.Character.UnicodeBlock COMBINING_DIACRITICAL_MARKS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock COMBINING_HALF_MARKS;
public static final java.lang.Character.UnicodeBlock COMBINING_MARKS_FOR_SYMBOLS;
public static final java.lang.Character.UnicodeBlock COMMON_INDIC_NUMBER_FORMS;
public static final java.lang.Character.UnicodeBlock CONTROL_PICTURES;
public static final java.lang.Character.UnicodeBlock COPTIC;
public static final java.lang.Character.UnicodeBlock COUNTING_ROD_NUMERALS;
public static final java.lang.Character.UnicodeBlock CUNEIFORM;
public static final java.lang.Character.UnicodeBlock CUNEIFORM_NUMBERS_AND_PUNCTUATION;
public static final java.lang.Character.UnicodeBlock CURRENCY_SYMBOLS;
public static final java.lang.Character.UnicodeBlock CYPRIOT_SYLLABARY;
public static final java.lang.Character.UnicodeBlock CYRILLIC;
public static final java.lang.Character.UnicodeBlock CYRILLIC_EXTENDED_A;
public static final java.lang.Character.UnicodeBlock CYRILLIC_EXTENDED_B;
public static final java.lang.Character.UnicodeBlock CYRILLIC_SUPPLEMENTARY;
public static final java.lang.Character.UnicodeBlock DESERET;
public static final java.lang.Character.UnicodeBlock DEVANAGARI;
public static final java.lang.Character.UnicodeBlock DEVANAGARI_EXTENDED;
public static final java.lang.Character.UnicodeBlock DINGBATS;
public static final java.lang.Character.UnicodeBlock DOMINO_TILES;
public static final java.lang.Character.UnicodeBlock EGYPTIAN_HIEROGLYPHS;
public static final java.lang.Character.UnicodeBlock EMOTICONS;
public static final java.lang.Character.UnicodeBlock ENCLOSED_ALPHANUMERICS;
public static final java.lang.Character.UnicodeBlock ENCLOSED_ALPHANUMERIC_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock ENCLOSED_CJK_LETTERS_AND_MONTHS;
public static final java.lang.Character.UnicodeBlock ENCLOSED_IDEOGRAPHIC_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock ETHIOPIC;
public static final java.lang.Character.UnicodeBlock ETHIOPIC_EXTENDED;
public static final java.lang.Character.UnicodeBlock ETHIOPIC_EXTENDED_A;
public static final java.lang.Character.UnicodeBlock ETHIOPIC_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock GENERAL_PUNCTUATION;
public static final java.lang.Character.UnicodeBlock GEOMETRIC_SHAPES;
public static final java.lang.Character.UnicodeBlock GEORGIAN;
public static final java.lang.Character.UnicodeBlock GEORGIAN_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock GLAGOLITIC;
public static final java.lang.Character.UnicodeBlock GOTHIC;
public static final java.lang.Character.UnicodeBlock GREEK;
public static final java.lang.Character.UnicodeBlock GREEK_EXTENDED;
public static final java.lang.Character.UnicodeBlock GUJARATI;
public static final java.lang.Character.UnicodeBlock GURMUKHI;
public static final java.lang.Character.UnicodeBlock HALFWIDTH_AND_FULLWIDTH_FORMS;
public static final java.lang.Character.UnicodeBlock HANGUL_COMPATIBILITY_JAMO;
public static final java.lang.Character.UnicodeBlock HANGUL_JAMO;
public static final java.lang.Character.UnicodeBlock HANGUL_JAMO_EXTENDED_A;
public static final java.lang.Character.UnicodeBlock HANGUL_JAMO_EXTENDED_B;
public static final java.lang.Character.UnicodeBlock HANGUL_SYLLABLES;
public static final java.lang.Character.UnicodeBlock HANUNOO;
public static final java.lang.Character.UnicodeBlock HEBREW;
public static final java.lang.Character.UnicodeBlock HIGH_PRIVATE_USE_SURROGATES;
public static final java.lang.Character.UnicodeBlock HIGH_SURROGATES;
public static final java.lang.Character.UnicodeBlock HIRAGANA;
public static final java.lang.Character.UnicodeBlock IDEOGRAPHIC_DESCRIPTION_CHARACTERS;
public static final java.lang.Character.UnicodeBlock IMPERIAL_ARAMAIC;
public static final java.lang.Character.UnicodeBlock INSCRIPTIONAL_PAHLAVI;
public static final java.lang.Character.UnicodeBlock INSCRIPTIONAL_PARTHIAN;
public static final java.lang.Character.UnicodeBlock IPA_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock JAVANESE;
public static final java.lang.Character.UnicodeBlock KAITHI;
public static final java.lang.Character.UnicodeBlock KANA_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock KANBUN;
public static final java.lang.Character.UnicodeBlock KANGXI_RADICALS;
public static final java.lang.Character.UnicodeBlock KANNADA;
public static final java.lang.Character.UnicodeBlock KATAKANA;
public static final java.lang.Character.UnicodeBlock KATAKANA_PHONETIC_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock KAYAH_LI;
public static final java.lang.Character.UnicodeBlock KHAROSHTHI;
public static final java.lang.Character.UnicodeBlock KHMER;
public static final java.lang.Character.UnicodeBlock KHMER_SYMBOLS;
public static final java.lang.Character.UnicodeBlock LAO;
public static final java.lang.Character.UnicodeBlock LATIN_1_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_A;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_ADDITIONAL;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_B;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_C;
public static final java.lang.Character.UnicodeBlock LATIN_EXTENDED_D;
public static final java.lang.Character.UnicodeBlock LEPCHA;
public static final java.lang.Character.UnicodeBlock LETTERLIKE_SYMBOLS;
public static final java.lang.Character.UnicodeBlock LIMBU;
public static final java.lang.Character.UnicodeBlock LINEAR_B_IDEOGRAMS;
public static final java.lang.Character.UnicodeBlock LINEAR_B_SYLLABARY;
public static final java.lang.Character.UnicodeBlock LISU;
public static final java.lang.Character.UnicodeBlock LOW_SURROGATES;
public static final java.lang.Character.UnicodeBlock LYCIAN;
public static final java.lang.Character.UnicodeBlock LYDIAN;
public static final java.lang.Character.UnicodeBlock MAHJONG_TILES;
public static final java.lang.Character.UnicodeBlock MALAYALAM;
public static final java.lang.Character.UnicodeBlock MANDAIC;
public static final java.lang.Character.UnicodeBlock MATHEMATICAL_ALPHANUMERIC_SYMBOLS;
public static final java.lang.Character.UnicodeBlock MATHEMATICAL_OPERATORS;
public static final java.lang.Character.UnicodeBlock MEETEI_MAYEK;
public static final java.lang.Character.UnicodeBlock MEETEI_MAYEK_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock MEROITIC_CURSIVE;
public static final java.lang.Character.UnicodeBlock MEROITIC_HIEROGLYPHS;
public static final java.lang.Character.UnicodeBlock MIAO;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_SYMBOLS;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_ARROWS;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS;
public static final java.lang.Character.UnicodeBlock MISCELLANEOUS_TECHNICAL;
public static final java.lang.Character.UnicodeBlock MODIFIER_TONE_LETTERS;
public static final java.lang.Character.UnicodeBlock MONGOLIAN;
public static final java.lang.Character.UnicodeBlock MUSICAL_SYMBOLS;
public static final java.lang.Character.UnicodeBlock MYANMAR;
public static final java.lang.Character.UnicodeBlock MYANMAR_EXTENDED_A;
public static final java.lang.Character.UnicodeBlock NEW_TAI_LUE;
public static final java.lang.Character.UnicodeBlock NKO;
public static final java.lang.Character.UnicodeBlock NUMBER_FORMS;
public static final java.lang.Character.UnicodeBlock OGHAM;
public static final java.lang.Character.UnicodeBlock OLD_ITALIC;
public static final java.lang.Character.UnicodeBlock OLD_PERSIAN;
public static final java.lang.Character.UnicodeBlock OLD_SOUTH_ARABIAN;
public static final java.lang.Character.UnicodeBlock OLD_TURKIC;
public static final java.lang.Character.UnicodeBlock OL_CHIKI;
public static final java.lang.Character.UnicodeBlock OPTICAL_CHARACTER_RECOGNITION;
public static final java.lang.Character.UnicodeBlock ORIYA;
public static final java.lang.Character.UnicodeBlock OSMANYA;
public static final java.lang.Character.UnicodeBlock PHAGS_PA;
public static final java.lang.Character.UnicodeBlock PHAISTOS_DISC;
public static final java.lang.Character.UnicodeBlock PHOENICIAN;
public static final java.lang.Character.UnicodeBlock PHONETIC_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock PHONETIC_EXTENSIONS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock PLAYING_CARDS;
public static final java.lang.Character.UnicodeBlock PRIVATE_USE_AREA;
public static final java.lang.Character.UnicodeBlock REJANG;
public static final java.lang.Character.UnicodeBlock RUMI_NUMERAL_SYMBOLS;
public static final java.lang.Character.UnicodeBlock RUNIC;
public static final java.lang.Character.UnicodeBlock SAMARITAN;
public static final java.lang.Character.UnicodeBlock SAURASHTRA;
public static final java.lang.Character.UnicodeBlock SHARADA;
public static final java.lang.Character.UnicodeBlock SHAVIAN;
public static final java.lang.Character.UnicodeBlock SINHALA;
public static final java.lang.Character.UnicodeBlock SMALL_FORM_VARIANTS;
public static final java.lang.Character.UnicodeBlock SORA_SOMPENG;
public static final java.lang.Character.UnicodeBlock SPACING_MODIFIER_LETTERS;
public static final java.lang.Character.UnicodeBlock SPECIALS;
public static final java.lang.Character.UnicodeBlock SUNDANESE;
public static final java.lang.Character.UnicodeBlock SUNDANESE_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock SUPERSCRIPTS_AND_SUBSCRIPTS;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTAL_ARROWS_A;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTAL_ARROWS_B;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTAL_MATHEMATICAL_OPERATORS;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTAL_PUNCTUATION;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_A;
public static final java.lang.Character.UnicodeBlock SUPPLEMENTARY_PRIVATE_USE_AREA_B;
@java.lang.Deprecated()
public static final java.lang.Character.UnicodeBlock SURROGATES_AREA;
public static final java.lang.Character.UnicodeBlock SYLOTI_NAGRI;
public static final java.lang.Character.UnicodeBlock SYRIAC;
public static final java.lang.Character.UnicodeBlock TAGALOG;
public static final java.lang.Character.UnicodeBlock TAGBANWA;
public static final java.lang.Character.UnicodeBlock TAGS;
public static final java.lang.Character.UnicodeBlock TAI_LE;
public static final java.lang.Character.UnicodeBlock TAI_THAM;
public static final java.lang.Character.UnicodeBlock TAI_VIET;
public static final java.lang.Character.UnicodeBlock TAI_XUAN_JING_SYMBOLS;
public static final java.lang.Character.UnicodeBlock TAKRI;
public static final java.lang.Character.UnicodeBlock TAMIL;
public static final java.lang.Character.UnicodeBlock TELUGU;
public static final java.lang.Character.UnicodeBlock THAANA;
public static final java.lang.Character.UnicodeBlock THAI;
public static final java.lang.Character.UnicodeBlock TIBETAN;
public static final java.lang.Character.UnicodeBlock TIFINAGH;
public static final java.lang.Character.UnicodeBlock TRANSPORT_AND_MAP_SYMBOLS;
public static final java.lang.Character.UnicodeBlock UGARITIC;
public static final java.lang.Character.UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS;
public static final java.lang.Character.UnicodeBlock UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED;
public static final java.lang.Character.UnicodeBlock VAI;
public static final java.lang.Character.UnicodeBlock VARIATION_SELECTORS;
public static final java.lang.Character.UnicodeBlock VARIATION_SELECTORS_SUPPLEMENT;
public static final java.lang.Character.UnicodeBlock VEDIC_EXTENSIONS;
public static final java.lang.Character.UnicodeBlock VERTICAL_FORMS;
public static final java.lang.Character.UnicodeBlock YIJING_HEXAGRAM_SYMBOLS;
public static final java.lang.Character.UnicodeBlock YI_RADICALS;
public static final java.lang.Character.UnicodeBlock YI_SYLLABLES;
static { AEGEAN_NUMBERS = null; ALCHEMICAL_SYMBOLS = null; ALPHABETIC_PRESENTATION_FORMS = null; ANCIENT_GREEK_MUSICAL_NOTATION = null; ANCIENT_GREEK_NUMBERS = null; ANCIENT_SYMBOLS = null; ARABIC = null; ARABIC_EXTENDED_A = null; ARABIC_MATHEMATICAL_ALPHABETIC_SYMBOLS = null; ARABIC_PRESENTATION_FORMS_A = null; ARABIC_PRESENTATION_FORMS_B = null; ARABIC_SUPPLEMENT = null; ARMENIAN = null; ARROWS = null; AVESTAN = null; BALINESE = null; BAMUM = null; BAMUM_SUPPLEMENT = null; BASIC_LATIN = null; BATAK = null; BENGALI = null; BLOCK_ELEMENTS = null; BOPOMOFO = null; BOPOMOFO_EXTENDED = null; BOX_DRAWING = null; BRAHMI = null; BRAILLE_PATTERNS = null; BUGINESE = null; BUHID = null; BYZANTINE_MUSICAL_SYMBOLS = null; CARIAN = null; CHAKMA = null; CHAM = null; CHEROKEE = null; CJK_COMPATIBILITY = null; CJK_COMPATIBILITY_FORMS = null; CJK_COMPATIBILITY_IDEOGRAPHS = null; CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT = null; CJK_RADICALS_SUPPLEMENT = null; CJK_STROKES = null; CJK_SYMBOLS_AND_PUNCTUATION = null; CJK_UNIFIED_IDEOGRAPHS = null; CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A = null; CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B = null; CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C = null; CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D = null; COMBINING_DIACRITICAL_MARKS = null; COMBINING_DIACRITICAL_MARKS_SUPPLEMENT = null; COMBINING_HALF_MARKS = null; COMBINING_MARKS_FOR_SYMBOLS = null; COMMON_INDIC_NUMBER_FORMS = null; CONTROL_PICTURES = null; COPTIC = null; COUNTING_ROD_NUMERALS = null; CUNEIFORM = null; CUNEIFORM_NUMBERS_AND_PUNCTUATION = null; CURRENCY_SYMBOLS = null; CYPRIOT_SYLLABARY = null; CYRILLIC = null; CYRILLIC_EXTENDED_A = null; CYRILLIC_EXTENDED_B = null; CYRILLIC_SUPPLEMENTARY = null; DESERET = null; DEVANAGARI = null; DEVANAGARI_EXTENDED = null; DINGBATS = null; DOMINO_TILES = null; EGYPTIAN_HIEROGLYPHS = null; EMOTICONS = null; ENCLOSED_ALPHANUMERICS = null; ENCLOSED_ALPHANUMERIC_SUPPLEMENT = null; ENCLOSED_CJK_LETTERS_AND_MONTHS = null; ENCLOSED_IDEOGRAPHIC_SUPPLEMENT = null; ETHIOPIC = null; ETHIOPIC_EXTENDED = null; ETHIOPIC_EXTENDED_A = null; ETHIOPIC_SUPPLEMENT = null; GENERAL_PUNCTUATION = null; GEOMETRIC_SHAPES = null; GEORGIAN = null; GEORGIAN_SUPPLEMENT = null; GLAGOLITIC = null; GOTHIC = null; GREEK = null; GREEK_EXTENDED = null; GUJARATI = null; GURMUKHI = null; HALFWIDTH_AND_FULLWIDTH_FORMS = null; HANGUL_COMPATIBILITY_JAMO = null; HANGUL_JAMO = null; HANGUL_JAMO_EXTENDED_A = null; HANGUL_JAMO_EXTENDED_B = null; HANGUL_SYLLABLES = null; HANUNOO = null; HEBREW = null; HIGH_PRIVATE_USE_SURROGATES = null; HIGH_SURROGATES = null; HIRAGANA = null; IDEOGRAPHIC_DESCRIPTION_CHARACTERS = null; IMPERIAL_ARAMAIC = null; INSCRIPTIONAL_PAHLAVI = null; INSCRIPTIONAL_PARTHIAN = null; IPA_EXTENSIONS = null; JAVANESE = null; KAITHI = null; KANA_SUPPLEMENT = null; KANBUN = null; KANGXI_RADICALS = null; KANNADA = null; KATAKANA = null; KATAKANA_PHONETIC_EXTENSIONS = null; KAYAH_LI = null; KHAROSHTHI = null; KHMER = null; KHMER_SYMBOLS = null; LAO = null; LATIN_1_SUPPLEMENT = null; LATIN_EXTENDED_A = null; LATIN_EXTENDED_ADDITIONAL = null; LATIN_EXTENDED_B = null; LATIN_EXTENDED_C = null; LATIN_EXTENDED_D = null; LEPCHA = null; LETTERLIKE_SYMBOLS = null; LIMBU = null; LINEAR_B_IDEOGRAMS = null; LINEAR_B_SYLLABARY = null; LISU = null; LOW_SURROGATES = null; LYCIAN = null; LYDIAN = null; MAHJONG_TILES = null; MALAYALAM = null; MANDAIC = null; MATHEMATICAL_ALPHANUMERIC_SYMBOLS = null; MATHEMATICAL_OPERATORS = null; MEETEI_MAYEK = null; MEETEI_MAYEK_EXTENSIONS = null; MEROITIC_CURSIVE = null; MEROITIC_HIEROGLYPHS = null; MIAO = null; MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A = null; MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B = null; MISCELLANEOUS_SYMBOLS = null; MISCELLANEOUS_SYMBOLS_AND_ARROWS = null; MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS = null; MISCELLANEOUS_TECHNICAL = null; MODIFIER_TONE_LETTERS = null; MONGOLIAN = null; MUSICAL_SYMBOLS = null; MYANMAR = null; MYANMAR_EXTENDED_A = null; NEW_TAI_LUE = null; NKO = null; NUMBER_FORMS = null; OGHAM = null; OLD_ITALIC = null; OLD_PERSIAN = null; OLD_SOUTH_ARABIAN = null; OLD_TURKIC = null; OL_CHIKI = null; OPTICAL_CHARACTER_RECOGNITION = null; ORIYA = null; OSMANYA = null; PHAGS_PA = null; PHAISTOS_DISC = null; PHOENICIAN = null; PHONETIC_EXTENSIONS = null; PHONETIC_EXTENSIONS_SUPPLEMENT = null; PLAYING_CARDS = null; PRIVATE_USE_AREA = null; REJANG = null; RUMI_NUMERAL_SYMBOLS = null; RUNIC = null; SAMARITAN = null; SAURASHTRA = null; SHARADA = null; SHAVIAN = null; SINHALA = null; SMALL_FORM_VARIANTS = null; SORA_SOMPENG = null; SPACING_MODIFIER_LETTERS = null; SPECIALS = null; SUNDANESE = null; SUNDANESE_SUPPLEMENT = null; SUPERSCRIPTS_AND_SUBSCRIPTS = null; SUPPLEMENTAL_ARROWS_A = null; SUPPLEMENTAL_ARROWS_B = null; SUPPLEMENTAL_MATHEMATICAL_OPERATORS = null; SUPPLEMENTAL_PUNCTUATION = null; SUPPLEMENTARY_PRIVATE_USE_AREA_A = null; SUPPLEMENTARY_PRIVATE_USE_AREA_B = null; SURROGATES_AREA = null; SYLOTI_NAGRI = null; SYRIAC = null; TAGALOG = null; TAGBANWA = null; TAGS = null; TAI_LE = null; TAI_THAM = null; TAI_VIET = null; TAI_XUAN_JING_SYMBOLS = null; TAKRI = null; TAMIL = null; TELUGU = null; THAANA = null; THAI = null; TIBETAN = null; TIFINAGH = null; TRANSPORT_AND_MAP_SYMBOLS = null; UGARITIC = null; UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS = null; UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED = null; VAI = null; VARIATION_SELECTORS = null; VARIATION_SELECTORS_SUPPLEMENT = null; VEDIC_EXTENSIONS = null; VERTICAL_FORMS = null; YIJING_HEXAGRAM_SYMBOLS = null; YI_RADICALS = null; YI_SYLLABLES = null; }
}
public static enum UnicodeScript
{
ARABIC(),
ARMENIAN(),
AVESTAN(),
BALINESE(),
BAMUM(),
BATAK(),
BENGALI(),
BOPOMOFO(),
BRAHMI(),
BRAILLE(),
BUGINESE(),
BUHID(),
CANADIAN_ABORIGINAL(),
CARIAN(),
CHAKMA(),
CHAM(),
CHEROKEE(),
COMMON(),
COPTIC(),
CUNEIFORM(),
CYPRIOT(),
CYRILLIC(),
DESERET(),
DEVANAGARI(),
EGYPTIAN_HIEROGLYPHS(),
ETHIOPIC(),
GEORGIAN(),
GLAGOLITIC(),
GOTHIC(),
GREEK(),
GUJARATI(),
GURMUKHI(),
HAN(),
HANGUL(),
HANUNOO(),
HEBREW(),
HIRAGANA(),
IMPERIAL_ARAMAIC(),
INHERITED(),
INSCRIPTIONAL_PAHLAVI(),
INSCRIPTIONAL_PARTHIAN(),
JAVANESE(),
KAITHI(),
KANNADA(),
KATAKANA(),
KAYAH_LI(),
KHAROSHTHI(),
KHMER(),
LAO(),
LATIN(),
LEPCHA(),
LIMBU(),
LINEAR_B(),
LISU(),
LYCIAN(),
LYDIAN(),
MALAYALAM(),
MANDAIC(),
MEETEI_MAYEK(),
MEROITIC_CURSIVE(),
MEROITIC_HIEROGLYPHS(),
MIAO(),
MONGOLIAN(),
MYANMAR(),
NEW_TAI_LUE(),
NKO(),
OGHAM(),
OLD_ITALIC(),
OLD_PERSIAN(),
OLD_SOUTH_ARABIAN(),
OLD_TURKIC(),
OL_CHIKI(),
ORIYA(),
OSMANYA(),
PHAGS_PA(),
PHOENICIAN(),
REJANG(),
RUNIC(),
SAMARITAN(),
SAURASHTRA(),
SHARADA(),
SHAVIAN(),
SINHALA(),
SORA_SOMPENG(),
SUNDANESE(),
SYLOTI_NAGRI(),
SYRIAC(),
TAGALOG(),
TAGBANWA(),
TAI_LE(),
TAI_THAM(),
TAI_VIET(),
TAKRI(),
TAMIL(),
TELUGU(),
THAANA(),
THAI(),
TIBETAN(),
TIFINAGH(),
UGARITIC(),
UNKNOWN(),
VAI(),
YI();
public static  java.lang.Character.UnicodeScript of(int codePoint) { throw new RuntimeException("Stub!"); }
public static  java.lang.Character.UnicodeScript forName(java.lang.String scriptName) { throw new RuntimeException("Stub!"); }
}
public  Character(char value) { throw new RuntimeException("Stub!"); }
public static  java.lang.Character valueOf(char c) { throw new RuntimeException("Stub!"); }
public  char charValue() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static  int hashCode(char value) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static  java.lang.String toString(char c) { throw new RuntimeException("Stub!"); }
public static  boolean isValidCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isBmpCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isSupplementaryCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isHighSurrogate(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isLowSurrogate(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isSurrogate(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isSurrogatePair(char high, char low) { throw new RuntimeException("Stub!"); }
public static  int charCount(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int toCodePoint(char high, char low) { throw new RuntimeException("Stub!"); }
public static  int codePointAt(java.lang.CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointAt(char[] a, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointAt(char[] a, int index, int limit) { throw new RuntimeException("Stub!"); }
public static  int codePointBefore(java.lang.CharSequence seq, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointBefore(char[] a, int index) { throw new RuntimeException("Stub!"); }
public static  int codePointBefore(char[] a, int index, int start) { throw new RuntimeException("Stub!"); }
public static  char highSurrogate(int codePoint) { throw new RuntimeException("Stub!"); }
public static  char lowSurrogate(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int toChars(int codePoint, char[] dst, int dstIndex) { throw new RuntimeException("Stub!"); }
public static  char[] toChars(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int codePointCount(java.lang.CharSequence seq, int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
public static  int codePointCount(char[] a, int offset, int count) { throw new RuntimeException("Stub!"); }
public static  int offsetByCodePoints(java.lang.CharSequence seq, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
public static  int offsetByCodePoints(char[] a, int start, int count, int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
public static  boolean isLowerCase(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isLowerCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isUpperCase(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isUpperCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isTitleCase(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isTitleCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isDigit(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isDigit(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isDefined(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isDefined(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isLetter(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isLetter(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isLetterOrDigit(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isLetterOrDigit(int codePoint) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean isJavaLetter(char ch) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean isJavaLetterOrDigit(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isAlphabetic(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isIdeographic(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierStart(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierPart(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isJavaIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierStart(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierStart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierPart(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isUnicodeIdentifierPart(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isIdentifierIgnorable(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isIdentifierIgnorable(int codePoint) { throw new RuntimeException("Stub!"); }
public static  char toLowerCase(char ch) { throw new RuntimeException("Stub!"); }
public static  int toLowerCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  char toUpperCase(char ch) { throw new RuntimeException("Stub!"); }
public static  int toUpperCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  char toTitleCase(char ch) { throw new RuntimeException("Stub!"); }
public static  int toTitleCase(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int digit(char ch, int radix) { throw new RuntimeException("Stub!"); }
public static  int digit(int codePoint, int radix) { throw new RuntimeException("Stub!"); }
public static  int getNumericValue(char ch) { throw new RuntimeException("Stub!"); }
public static  int getNumericValue(int codePoint) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public static  boolean isSpace(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isSpaceChar(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isSpaceChar(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isWhitespace(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isWhitespace(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isISOControl(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isISOControl(int codePoint) { throw new RuntimeException("Stub!"); }
public static  int getType(char ch) { throw new RuntimeException("Stub!"); }
public static  int getType(int codePoint) { throw new RuntimeException("Stub!"); }
public static  char forDigit(int digit, int radix) { throw new RuntimeException("Stub!"); }
public static  byte getDirectionality(char ch) { throw new RuntimeException("Stub!"); }
public static  byte getDirectionality(int codePoint) { throw new RuntimeException("Stub!"); }
public static  boolean isMirrored(char ch) { throw new RuntimeException("Stub!"); }
public static  boolean isMirrored(int codePoint) { throw new RuntimeException("Stub!"); }
public  int compareTo(java.lang.Character anotherCharacter) { throw new RuntimeException("Stub!"); }
public static  int compare(char x, char y) { throw new RuntimeException("Stub!"); }
public static  char reverseBytes(char ch) { throw new RuntimeException("Stub!"); }
public static  java.lang.String getName(int codePoint) { throw new RuntimeException("Stub!"); }
public static final int BYTES = 2;
public static final byte COMBINING_SPACING_MARK = 8;
public static final byte CONNECTOR_PUNCTUATION = 23;
public static final byte CONTROL = 15;
public static final byte CURRENCY_SYMBOL = 26;
public static final byte DASH_PUNCTUATION = 20;
public static final byte DECIMAL_DIGIT_NUMBER = 9;
public static final byte DIRECTIONALITY_ARABIC_NUMBER = 6;
public static final byte DIRECTIONALITY_BOUNDARY_NEUTRAL = 9;
public static final byte DIRECTIONALITY_COMMON_NUMBER_SEPARATOR = 7;
public static final byte DIRECTIONALITY_EUROPEAN_NUMBER = 3;
public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_SEPARATOR = 4;
public static final byte DIRECTIONALITY_EUROPEAN_NUMBER_TERMINATOR = 5;
public static final byte DIRECTIONALITY_LEFT_TO_RIGHT = 0;
public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_EMBEDDING = 14;
public static final byte DIRECTIONALITY_LEFT_TO_RIGHT_OVERRIDE = 15;
public static final byte DIRECTIONALITY_NONSPACING_MARK = 8;
public static final byte DIRECTIONALITY_OTHER_NEUTRALS = 13;
public static final byte DIRECTIONALITY_PARAGRAPH_SEPARATOR = 10;
public static final byte DIRECTIONALITY_POP_DIRECTIONAL_FORMAT = 18;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT = 1;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC = 2;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_EMBEDDING = 16;
public static final byte DIRECTIONALITY_RIGHT_TO_LEFT_OVERRIDE = 17;
public static final byte DIRECTIONALITY_SEGMENT_SEPARATOR = 11;
public static final byte DIRECTIONALITY_UNDEFINED = -1;
public static final byte DIRECTIONALITY_WHITESPACE = 12;
public static final byte ENCLOSING_MARK = 7;
public static final byte END_PUNCTUATION = 22;
public static final byte FINAL_QUOTE_PUNCTUATION = 30;
public static final byte FORMAT = 16;
public static final byte INITIAL_QUOTE_PUNCTUATION = 29;
public static final byte LETTER_NUMBER = 10;
public static final byte LINE_SEPARATOR = 13;
public static final byte LOWERCASE_LETTER = 2;
public static final byte MATH_SYMBOL = 25;
public static final int MAX_CODE_POINT = 1114111;
public static final char MAX_HIGH_SURROGATE = 56319;
public static final char MAX_LOW_SURROGATE = 57343;
public static final int MAX_RADIX = 36;
public static final char MAX_SURROGATE = 57343;
public static final char MAX_VALUE = 65535;
public static final int MIN_CODE_POINT = 0;
public static final char MIN_HIGH_SURROGATE = 55296;
public static final char MIN_LOW_SURROGATE = 56320;
public static final int MIN_RADIX = 2;
public static final int MIN_SUPPLEMENTARY_CODE_POINT = 65536;
public static final char MIN_SURROGATE = 55296;
public static final char MIN_VALUE = 0;
public static final byte MODIFIER_LETTER = 4;
public static final byte MODIFIER_SYMBOL = 27;
public static final byte NON_SPACING_MARK = 6;
public static final byte OTHER_LETTER = 5;
public static final byte OTHER_NUMBER = 11;
public static final byte OTHER_PUNCTUATION = 24;
public static final byte OTHER_SYMBOL = 28;
public static final byte PARAGRAPH_SEPARATOR = 14;
public static final byte PRIVATE_USE = 18;
public static final int SIZE = 16;
public static final byte SPACE_SEPARATOR = 12;
public static final byte START_PUNCTUATION = 21;
public static final byte SURROGATE = 19;
public static final byte TITLECASE_LETTER = 3;
@java.lang.SuppressWarnings(value={"unchecked"})
public static final java.lang.Class<java.lang.Character> TYPE;
public static final byte UNASSIGNED = 0;
public static final byte UPPERCASE_LETTER = 1;
static { TYPE = null; }
}
