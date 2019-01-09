/* GENERATED SOURCE. DO NOT MODIFY. */
// © 2017 and later: Unicode, Inc. and others.
// License & terms of use: http://www.unicode.org/copyright.html#License
package android.icu.text;
public class DecimalFormat
  extends android.icu.text.NumberFormat
{
public  DecimalFormat() { throw new RuntimeException("Stub!"); }
public  DecimalFormat(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public  DecimalFormat(java.lang.String pattern, android.icu.text.DecimalFormatSymbols symbols) { throw new RuntimeException("Stub!"); }
public  DecimalFormat(java.lang.String pattern, android.icu.text.DecimalFormatSymbols symbols, android.icu.text.CurrencyPluralInfo infoInput, int style) { throw new RuntimeException("Stub!"); }
public synchronized  void applyPattern(java.lang.String pattern) { throw new RuntimeException("Stub!"); }
public synchronized  void applyLocalizedPattern(java.lang.String localizedPattern) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(double number, java.lang.StringBuffer result, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(long number, java.lang.StringBuffer result, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(java.math.BigInteger number, java.lang.StringBuffer result, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(java.math.BigDecimal number, java.lang.StringBuffer result, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(android.icu.math.BigDecimal number, java.lang.StringBuffer result, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
public  java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  java.lang.StringBuffer format(android.icu.util.CurrencyAmount currAmt, java.lang.StringBuffer toAppendTo, java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }
public  java.lang.Number parse(java.lang.String text, java.text.ParsePosition parsePosition) { throw new RuntimeException("Stub!"); }
public  android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence text, java.text.ParsePosition parsePosition) { throw new RuntimeException("Stub!"); }
public synchronized  android.icu.text.DecimalFormatSymbols getDecimalFormatSymbols() { throw new RuntimeException("Stub!"); }
public synchronized  void setDecimalFormatSymbols(android.icu.text.DecimalFormatSymbols newSymbols) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getPositivePrefix() { throw new RuntimeException("Stub!"); }
public synchronized  void setPositivePrefix(java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getNegativePrefix() { throw new RuntimeException("Stub!"); }
public synchronized  void setNegativePrefix(java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getPositiveSuffix() { throw new RuntimeException("Stub!"); }
public synchronized  void setPositiveSuffix(java.lang.String suffix) { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String getNegativeSuffix() { throw new RuntimeException("Stub!"); }
public synchronized  void setNegativeSuffix(java.lang.String suffix) { throw new RuntimeException("Stub!"); }
public synchronized  int getMultiplier() { throw new RuntimeException("Stub!"); }
public synchronized  void setMultiplier(int multiplier) { throw new RuntimeException("Stub!"); }
public synchronized  java.math.BigDecimal getRoundingIncrement() { throw new RuntimeException("Stub!"); }
public synchronized  void setRoundingIncrement(java.math.BigDecimal increment) { throw new RuntimeException("Stub!"); }
public synchronized  void setRoundingIncrement(android.icu.math.BigDecimal increment) { throw new RuntimeException("Stub!"); }
public synchronized  void setRoundingIncrement(double increment) { throw new RuntimeException("Stub!"); }
public synchronized  int getRoundingMode() { throw new RuntimeException("Stub!"); }
public synchronized  void setRoundingMode(int roundingMode) { throw new RuntimeException("Stub!"); }
public synchronized  java.math.MathContext getMathContext() { throw new RuntimeException("Stub!"); }
public synchronized  void setMathContext(java.math.MathContext mathContext) { throw new RuntimeException("Stub!"); }
public synchronized  android.icu.math.MathContext getMathContextICU() { throw new RuntimeException("Stub!"); }
public synchronized  void setMathContextICU(android.icu.math.MathContext mathContextICU) { throw new RuntimeException("Stub!"); }
public synchronized  int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }
public synchronized  void setMinimumIntegerDigits(int value) { throw new RuntimeException("Stub!"); }
public synchronized  int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }
public synchronized  void setMaximumIntegerDigits(int value) { throw new RuntimeException("Stub!"); }
public synchronized  int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }
public synchronized  void setMinimumFractionDigits(int value) { throw new RuntimeException("Stub!"); }
public synchronized  int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }
public synchronized  void setMaximumFractionDigits(int value) { throw new RuntimeException("Stub!"); }
public synchronized  boolean areSignificantDigitsUsed() { throw new RuntimeException("Stub!"); }
public synchronized  void setSignificantDigitsUsed(boolean useSignificantDigits) { throw new RuntimeException("Stub!"); }
public synchronized  int getMinimumSignificantDigits() { throw new RuntimeException("Stub!"); }
public synchronized  void setMinimumSignificantDigits(int value) { throw new RuntimeException("Stub!"); }
public synchronized  int getMaximumSignificantDigits() { throw new RuntimeException("Stub!"); }
public synchronized  void setMaximumSignificantDigits(int value) { throw new RuntimeException("Stub!"); }
public synchronized  int getFormatWidth() { throw new RuntimeException("Stub!"); }
public synchronized  void setFormatWidth(int width) { throw new RuntimeException("Stub!"); }
public synchronized  char getPadCharacter() { throw new RuntimeException("Stub!"); }
public synchronized  void setPadCharacter(char padChar) { throw new RuntimeException("Stub!"); }
public synchronized  int getPadPosition() { throw new RuntimeException("Stub!"); }
public synchronized  void setPadPosition(int padPos) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isScientificNotation() { throw new RuntimeException("Stub!"); }
public synchronized  void setScientificNotation(boolean useScientific) { throw new RuntimeException("Stub!"); }
public synchronized  byte getMinimumExponentDigits() { throw new RuntimeException("Stub!"); }
public synchronized  void setMinimumExponentDigits(byte minExpDig) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isExponentSignAlwaysShown() { throw new RuntimeException("Stub!"); }
public synchronized  void setExponentSignAlwaysShown(boolean expSignAlways) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }
public synchronized  void setGroupingUsed(boolean enabled) { throw new RuntimeException("Stub!"); }
public synchronized  int getGroupingSize() { throw new RuntimeException("Stub!"); }
public synchronized  void setGroupingSize(int width) { throw new RuntimeException("Stub!"); }
public synchronized  int getSecondaryGroupingSize() { throw new RuntimeException("Stub!"); }
public synchronized  void setSecondaryGroupingSize(int width) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isDecimalSeparatorAlwaysShown() { throw new RuntimeException("Stub!"); }
public synchronized  void setDecimalSeparatorAlwaysShown(boolean value) { throw new RuntimeException("Stub!"); }
public synchronized  android.icu.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }
public synchronized  void setCurrency(android.icu.util.Currency currency) { throw new RuntimeException("Stub!"); }
public synchronized  android.icu.util.Currency.CurrencyUsage getCurrencyUsage() { throw new RuntimeException("Stub!"); }
public synchronized  void setCurrencyUsage(android.icu.util.Currency.CurrencyUsage usage) { throw new RuntimeException("Stub!"); }
public synchronized  android.icu.text.CurrencyPluralInfo getCurrencyPluralInfo() { throw new RuntimeException("Stub!"); }
public synchronized  void setCurrencyPluralInfo(android.icu.text.CurrencyPluralInfo newInfo) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isParseBigDecimal() { throw new RuntimeException("Stub!"); }
public synchronized  void setParseBigDecimal(boolean value) { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getParseMaxDigits() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  void setParseMaxDigits(int maxDigits) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isParseStrict() { throw new RuntimeException("Stub!"); }
public synchronized  void setParseStrict(boolean parseStrict) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }
public synchronized  void setParseIntegerOnly(boolean parseIntegerOnly) { throw new RuntimeException("Stub!"); }
public synchronized  boolean isDecimalPatternMatchRequired() { throw new RuntimeException("Stub!"); }
public synchronized  void setDecimalPatternMatchRequired(boolean value) { throw new RuntimeException("Stub!"); }
public synchronized  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public synchronized  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toPattern() { throw new RuntimeException("Stub!"); }
public synchronized  java.lang.String toLocalizedPattern() { throw new RuntimeException("Stub!"); }
public static final int PAD_AFTER_PREFIX = 1;
public static final int PAD_AFTER_SUFFIX = 3;
public static final int PAD_BEFORE_PREFIX = 0;
public static final int PAD_BEFORE_SUFFIX = 2;
}
