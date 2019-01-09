/*
* Copyright (c) 2012, 2015, Oracle and/or its affiliates. All rights reserved.
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

/*
* This file is available under and governed by the GNU General Public
* License version 2 only, as published by the Free Software Foundation.
* However, the following notice accompanied the original version of this
* file:
*
* Copyright (c) 2008-2012, Stephen Colebourne & Michael Nascimento Santos
*
* All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*
*  * Redistributions of source code must retain the above copyright notice,
*    this list of conditions and the following disclaimer.
*
*  * Redistributions in binary form must reproduce the above copyright notice,
*    this list of conditions and the following disclaimer in the documentation
*    and/or other materials provided with the distribution.
*
*  * Neither the name of JSR-310 nor the names of its contributors
*    may be used to endorse or promote products derived from this software
*    without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
* LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
* A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
* EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
* PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
* PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
* LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
* SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package java.time;
public final class Period
  implements java.time.chrono.ChronoPeriod, java.io.Serializable
{
Period() { throw new RuntimeException("Stub!"); }
public static  java.time.Period ofYears(int years) { throw new RuntimeException("Stub!"); }
public static  java.time.Period ofMonths(int months) { throw new RuntimeException("Stub!"); }
public static  java.time.Period ofWeeks(int weeks) { throw new RuntimeException("Stub!"); }
public static  java.time.Period ofDays(int days) { throw new RuntimeException("Stub!"); }
public static  java.time.Period of(int years, int months, int days) { throw new RuntimeException("Stub!"); }
public static  java.time.Period from(java.time.temporal.TemporalAmount amount) { throw new RuntimeException("Stub!"); }
public static  java.time.Period parse(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }
public static  java.time.Period between(java.time.LocalDate startDateInclusive, java.time.LocalDate endDateExclusive) { throw new RuntimeException("Stub!"); }
public  long get(java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }
public  java.util.List<java.time.temporal.TemporalUnit> getUnits() { throw new RuntimeException("Stub!"); }
public  java.time.chrono.IsoChronology getChronology() { throw new RuntimeException("Stub!"); }
public  boolean isZero() { throw new RuntimeException("Stub!"); }
public  boolean isNegative() { throw new RuntimeException("Stub!"); }
public  int getYears() { throw new RuntimeException("Stub!"); }
public  int getMonths() { throw new RuntimeException("Stub!"); }
public  int getDays() { throw new RuntimeException("Stub!"); }
public  java.time.Period withYears(int years) { throw new RuntimeException("Stub!"); }
public  java.time.Period withMonths(int months) { throw new RuntimeException("Stub!"); }
public  java.time.Period withDays(int days) { throw new RuntimeException("Stub!"); }
public  java.time.Period plus(java.time.temporal.TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Period plusYears(long yearsToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Period plusMonths(long monthsToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Period plusDays(long daysToAdd) { throw new RuntimeException("Stub!"); }
public  java.time.Period minus(java.time.temporal.TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.Period minusYears(long yearsToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.Period minusMonths(long monthsToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.Period minusDays(long daysToSubtract) { throw new RuntimeException("Stub!"); }
public  java.time.Period multipliedBy(int scalar) { throw new RuntimeException("Stub!"); }
public  java.time.Period negated() { throw new RuntimeException("Stub!"); }
public  java.time.Period normalized() { throw new RuntimeException("Stub!"); }
public  long toTotalMonths() { throw new RuntimeException("Stub!"); }
public  java.time.temporal.Temporal addTo(java.time.temporal.Temporal temporal) { throw new RuntimeException("Stub!"); }
public  java.time.temporal.Temporal subtractFrom(java.time.temporal.Temporal temporal) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public static final java.time.Period ZERO;
static { ZERO = null; }
}
