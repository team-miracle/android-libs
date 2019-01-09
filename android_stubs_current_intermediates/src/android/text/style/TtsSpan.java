/*
* Copyright (C) 2014 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package android.text.style;
public class TtsSpan
  implements android.text.ParcelableSpan
{
public static class Builder<C extends android.text.style.TtsSpan.Builder<?>>
{
public  Builder(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan build() { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  C setStringArgument(java.lang.String arg, java.lang.String value) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  C setIntArgument(java.lang.String arg, int value) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public  C setLongArgument(java.lang.String arg, long value) { throw new RuntimeException("Stub!"); }
}
public static class SemioticClassBuilder<C extends android.text.style.TtsSpan.SemioticClassBuilder<?>>
  extends android.text.style.TtsSpan.Builder<C>
{
public  SemioticClassBuilder(java.lang.String type) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  C setGender(java.lang.String gender) { throw new RuntimeException("Stub!"); }
public  C setAnimacy(java.lang.String animacy) { throw new RuntimeException("Stub!"); }
public  C setMultiplicity(java.lang.String multiplicity) { throw new RuntimeException("Stub!"); }
public  C setCase(java.lang.String grammaticalCase) { throw new RuntimeException("Stub!"); }
}
public static class TextBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.TextBuilder>
{
public  TextBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  TextBuilder(java.lang.String text) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.TextBuilder setText(java.lang.String text) { throw new RuntimeException("Stub!"); }
}
public static class CardinalBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.CardinalBuilder>
{
public  CardinalBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  CardinalBuilder(long number) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  CardinalBuilder(java.lang.String number) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.CardinalBuilder setNumber(long number) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.CardinalBuilder setNumber(java.lang.String number) { throw new RuntimeException("Stub!"); }
}
public static class OrdinalBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.OrdinalBuilder>
{
public  OrdinalBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  OrdinalBuilder(long number) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  OrdinalBuilder(java.lang.String number) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.OrdinalBuilder setNumber(long number) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.OrdinalBuilder setNumber(java.lang.String number) { throw new RuntimeException("Stub!"); }
}
public static class DecimalBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.DecimalBuilder>
{
public  DecimalBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  DecimalBuilder(double number, int minimumFractionDigits, int maximumFractionDigits) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  DecimalBuilder(java.lang.String integerPart, java.lang.String fractionalPart) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DecimalBuilder setArgumentsFromDouble(double number, int minimumFractionDigits, int maximumFractionDigits) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DecimalBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DecimalBuilder setIntegerPart(java.lang.String integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DecimalBuilder setFractionalPart(java.lang.String fractionalPart) { throw new RuntimeException("Stub!"); }
}
public static class FractionBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.FractionBuilder>
{
public  FractionBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  FractionBuilder(long integerPart, long numerator, long denominator) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.FractionBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.FractionBuilder setIntegerPart(java.lang.String integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.FractionBuilder setNumerator(long numerator) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.FractionBuilder setNumerator(java.lang.String numerator) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.FractionBuilder setDenominator(long denominator) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.FractionBuilder setDenominator(java.lang.String denominator) { throw new RuntimeException("Stub!"); }
}
public static class MeasureBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.MeasureBuilder>
{
public  MeasureBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setNumber(long number) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setNumber(java.lang.String number) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setIntegerPart(java.lang.String integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setFractionalPart(java.lang.String fractionalPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setNumerator(long numerator) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setNumerator(java.lang.String numerator) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setDenominator(long denominator) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setDenominator(java.lang.String denominator) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MeasureBuilder setUnit(java.lang.String unit) { throw new RuntimeException("Stub!"); }
}
public static class TimeBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.TimeBuilder>
{
public  TimeBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  TimeBuilder(int hours, int minutes) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.TimeBuilder setHours(int hours) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.TimeBuilder setMinutes(int minutes) { throw new RuntimeException("Stub!"); }
}
public static class DateBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.DateBuilder>
{
public  DateBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  DateBuilder(java.lang.Integer weekday, java.lang.Integer day, java.lang.Integer month, java.lang.Integer year) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DateBuilder setWeekday(int weekday) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DateBuilder setDay(int day) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DateBuilder setMonth(int month) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DateBuilder setYear(int year) { throw new RuntimeException("Stub!"); }
}
public static class MoneyBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.MoneyBuilder>
{
public  MoneyBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MoneyBuilder setIntegerPart(long integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MoneyBuilder setIntegerPart(java.lang.String integerPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MoneyBuilder setFractionalPart(java.lang.String fractionalPart) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MoneyBuilder setCurrency(java.lang.String currency) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.MoneyBuilder setQuantity(java.lang.String quantity) { throw new RuntimeException("Stub!"); }
}
public static class TelephoneBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.TelephoneBuilder>
{
public  TelephoneBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  TelephoneBuilder(java.lang.String numberParts) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.TelephoneBuilder setCountryCode(java.lang.String countryCode) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.TelephoneBuilder setNumberParts(java.lang.String numberParts) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.TelephoneBuilder setExtension(java.lang.String extension) { throw new RuntimeException("Stub!"); }
}
public static class ElectronicBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.ElectronicBuilder>
{
public  ElectronicBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setEmailArguments(java.lang.String username, java.lang.String domain) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setProtocol(java.lang.String protocol) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setUsername(java.lang.String username) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setPassword(java.lang.String password) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setDomain(java.lang.String domain) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setPort(int port) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setPath(java.lang.String path) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setQueryString(java.lang.String queryString) { throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.ElectronicBuilder setFragmentId(java.lang.String fragmentId) { throw new RuntimeException("Stub!"); }
}
public static class DigitsBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.DigitsBuilder>
{
public  DigitsBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  DigitsBuilder(java.lang.String digits) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.DigitsBuilder setDigits(java.lang.String digits) { throw new RuntimeException("Stub!"); }
}
public static class VerbatimBuilder
  extends android.text.style.TtsSpan.SemioticClassBuilder<android.text.style.TtsSpan.VerbatimBuilder>
{
public  VerbatimBuilder() { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  VerbatimBuilder(java.lang.String verbatim) { super((java.lang.String)null); throw new RuntimeException("Stub!"); }
public  android.text.style.TtsSpan.VerbatimBuilder setVerbatim(java.lang.String verbatim) { throw new RuntimeException("Stub!"); }
}
public  TtsSpan(java.lang.String type, android.os.PersistableBundle args) { throw new RuntimeException("Stub!"); }
public  TtsSpan(android.os.Parcel src) { throw new RuntimeException("Stub!"); }
public  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  android.os.PersistableBundle getArgs() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int getSpanTypeId() { throw new RuntimeException("Stub!"); }
public static final java.lang.String ANIMACY_ANIMATE = "android.animate";
public static final java.lang.String ANIMACY_INANIMATE = "android.inanimate";
public static final java.lang.String ARG_ANIMACY = "android.arg.animacy";
public static final java.lang.String ARG_CASE = "android.arg.case";
public static final java.lang.String ARG_COUNTRY_CODE = "android.arg.country_code";
public static final java.lang.String ARG_CURRENCY = "android.arg.money";
public static final java.lang.String ARG_DAY = "android.arg.day";
public static final java.lang.String ARG_DENOMINATOR = "android.arg.denominator";
public static final java.lang.String ARG_DIGITS = "android.arg.digits";
public static final java.lang.String ARG_DOMAIN = "android.arg.domain";
public static final java.lang.String ARG_EXTENSION = "android.arg.extension";
public static final java.lang.String ARG_FRACTIONAL_PART = "android.arg.fractional_part";
public static final java.lang.String ARG_FRAGMENT_ID = "android.arg.fragment_id";
public static final java.lang.String ARG_GENDER = "android.arg.gender";
public static final java.lang.String ARG_HOURS = "android.arg.hours";
public static final java.lang.String ARG_INTEGER_PART = "android.arg.integer_part";
public static final java.lang.String ARG_MINUTES = "android.arg.minutes";
public static final java.lang.String ARG_MONTH = "android.arg.month";
public static final java.lang.String ARG_MULTIPLICITY = "android.arg.multiplicity";
public static final java.lang.String ARG_NUMBER = "android.arg.number";
public static final java.lang.String ARG_NUMBER_PARTS = "android.arg.number_parts";
public static final java.lang.String ARG_NUMERATOR = "android.arg.numerator";
public static final java.lang.String ARG_PASSWORD = "android.arg.password";
public static final java.lang.String ARG_PATH = "android.arg.path";
public static final java.lang.String ARG_PORT = "android.arg.port";
public static final java.lang.String ARG_PROTOCOL = "android.arg.protocol";
public static final java.lang.String ARG_QUANTITY = "android.arg.quantity";
public static final java.lang.String ARG_QUERY_STRING = "android.arg.query_string";
public static final java.lang.String ARG_TEXT = "android.arg.text";
public static final java.lang.String ARG_UNIT = "android.arg.unit";
public static final java.lang.String ARG_USERNAME = "android.arg.username";
public static final java.lang.String ARG_VERBATIM = "android.arg.verbatim";
public static final java.lang.String ARG_WEEKDAY = "android.arg.weekday";
public static final java.lang.String ARG_YEAR = "android.arg.year";
public static final java.lang.String CASE_ABLATIVE = "android.ablative";
public static final java.lang.String CASE_ACCUSATIVE = "android.accusative";
public static final java.lang.String CASE_DATIVE = "android.dative";
public static final java.lang.String CASE_GENITIVE = "android.genitive";
public static final java.lang.String CASE_INSTRUMENTAL = "android.instrumental";
public static final java.lang.String CASE_LOCATIVE = "android.locative";
public static final java.lang.String CASE_NOMINATIVE = "android.nominative";
public static final java.lang.String CASE_VOCATIVE = "android.vocative";
public static final java.lang.String GENDER_FEMALE = "android.female";
public static final java.lang.String GENDER_MALE = "android.male";
public static final java.lang.String GENDER_NEUTRAL = "android.neutral";
public static final int MONTH_APRIL = 3;
public static final int MONTH_AUGUST = 7;
public static final int MONTH_DECEMBER = 11;
public static final int MONTH_FEBRUARY = 1;
public static final int MONTH_JANUARY = 0;
public static final int MONTH_JULY = 6;
public static final int MONTH_JUNE = 5;
public static final int MONTH_MARCH = 2;
public static final int MONTH_MAY = 4;
public static final int MONTH_NOVEMBER = 10;
public static final int MONTH_OCTOBER = 9;
public static final int MONTH_SEPTEMBER = 8;
public static final java.lang.String MULTIPLICITY_DUAL = "android.dual";
public static final java.lang.String MULTIPLICITY_PLURAL = "android.plural";
public static final java.lang.String MULTIPLICITY_SINGLE = "android.single";
public static final java.lang.String TYPE_CARDINAL = "android.type.cardinal";
public static final java.lang.String TYPE_DATE = "android.type.date";
public static final java.lang.String TYPE_DECIMAL = "android.type.decimal";
public static final java.lang.String TYPE_DIGITS = "android.type.digits";
public static final java.lang.String TYPE_ELECTRONIC = "android.type.electronic";
public static final java.lang.String TYPE_FRACTION = "android.type.fraction";
public static final java.lang.String TYPE_MEASURE = "android.type.measure";
public static final java.lang.String TYPE_MONEY = "android.type.money";
public static final java.lang.String TYPE_ORDINAL = "android.type.ordinal";
public static final java.lang.String TYPE_TELEPHONE = "android.type.telephone";
public static final java.lang.String TYPE_TEXT = "android.type.text";
public static final java.lang.String TYPE_TIME = "android.type.time";
public static final java.lang.String TYPE_VERBATIM = "android.type.verbatim";
public static final int WEEKDAY_FRIDAY = 6;
public static final int WEEKDAY_MONDAY = 2;
public static final int WEEKDAY_SATURDAY = 7;
public static final int WEEKDAY_SUNDAY = 1;
public static final int WEEKDAY_THURSDAY = 5;
public static final int WEEKDAY_TUESDAY = 3;
public static final int WEEKDAY_WEDNESDAY = 4;
}
