/*
* Copyright (c) 2012, 2013, Oracle and/or its affiliates. All rights reserved.
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
* Copyright (c) 2012, Stephen Colebourne & Michael Nascimento Santos
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
package java.time.temporal;
public enum ChronoField
  implements java.time.temporal.TemporalField
{
ALIGNED_DAY_OF_WEEK_IN_MONTH(),
ALIGNED_DAY_OF_WEEK_IN_YEAR(),
ALIGNED_WEEK_OF_MONTH(),
ALIGNED_WEEK_OF_YEAR(),
AMPM_OF_DAY(),
CLOCK_HOUR_OF_AMPM(),
CLOCK_HOUR_OF_DAY(),
DAY_OF_MONTH(),
DAY_OF_WEEK(),
DAY_OF_YEAR(),
EPOCH_DAY(),
ERA(),
HOUR_OF_AMPM(),
HOUR_OF_DAY(),
INSTANT_SECONDS(),
MICRO_OF_DAY(),
MICRO_OF_SECOND(),
MILLI_OF_DAY(),
MILLI_OF_SECOND(),
MINUTE_OF_DAY(),
MINUTE_OF_HOUR(),
MONTH_OF_YEAR(),
NANO_OF_DAY(),
NANO_OF_SECOND(),
OFFSET_SECONDS(),
PROLEPTIC_MONTH(),
SECOND_OF_DAY(),
SECOND_OF_MINUTE(),
YEAR(),
YEAR_OF_ERA();
public  java.lang.String getDisplayName(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public  java.time.temporal.TemporalUnit getBaseUnit() { throw new RuntimeException("Stub!"); }
public  java.time.temporal.TemporalUnit getRangeUnit() { throw new RuntimeException("Stub!"); }
public  java.time.temporal.ValueRange range() { throw new RuntimeException("Stub!"); }
public  boolean isDateBased() { throw new RuntimeException("Stub!"); }
public  boolean isTimeBased() { throw new RuntimeException("Stub!"); }
public  long checkValidValue(long value) { throw new RuntimeException("Stub!"); }
public  int checkValidIntValue(long value) { throw new RuntimeException("Stub!"); }
public  boolean isSupportedBy(java.time.temporal.TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
public  java.time.temporal.ValueRange rangeRefinedBy(java.time.temporal.TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
public  long getFrom(java.time.temporal.TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
@java.lang.SuppressWarnings(value={"unchecked"})
public <R extends java.time.temporal.Temporal> R adjustInto(R temporal, long newValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
