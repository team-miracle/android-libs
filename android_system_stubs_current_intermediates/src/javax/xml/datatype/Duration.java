/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

//$Id: Duration.java 759828 2009-03-30 01:26:29Z mrglavas $

package javax.xml.datatype;
public abstract class Duration
{
public  Duration() { throw new RuntimeException("Stub!"); }
public  javax.xml.namespace.QName getXMLSchemaType() { throw new RuntimeException("Stub!"); }
public abstract  int getSign();
public  int getYears() { throw new RuntimeException("Stub!"); }
public  int getMonths() { throw new RuntimeException("Stub!"); }
public  int getDays() { throw new RuntimeException("Stub!"); }
public  int getHours() { throw new RuntimeException("Stub!"); }
public  int getMinutes() { throw new RuntimeException("Stub!"); }
public  int getSeconds() { throw new RuntimeException("Stub!"); }
public  long getTimeInMillis(java.util.Calendar startInstant) { throw new RuntimeException("Stub!"); }
public  long getTimeInMillis(java.util.Date startInstant) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Number getField(javax.xml.datatype.DatatypeConstants.Field field);
public abstract  boolean isSet(javax.xml.datatype.DatatypeConstants.Field field);
public abstract  javax.xml.datatype.Duration add(javax.xml.datatype.Duration rhs);
public abstract  void addTo(java.util.Calendar calendar);
public  void addTo(java.util.Date date) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration subtract(javax.xml.datatype.Duration rhs) { throw new RuntimeException("Stub!"); }
public  javax.xml.datatype.Duration multiply(int factor) { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.datatype.Duration multiply(java.math.BigDecimal factor);
public abstract  javax.xml.datatype.Duration negate();
public abstract  javax.xml.datatype.Duration normalizeWith(java.util.Calendar startTimeInstant);
public abstract  int compare(javax.xml.datatype.Duration duration);
public  boolean isLongerThan(javax.xml.datatype.Duration duration) { throw new RuntimeException("Stub!"); }
public  boolean isShorterThan(javax.xml.datatype.Duration duration) { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object duration) { throw new RuntimeException("Stub!"); }
public abstract  int hashCode();
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
