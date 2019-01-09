/*
* Copyright 2001-2004 The Apache Software Foundation.
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

package org.apache.commons.codec.language;
@java.lang.Deprecated()
public class DoubleMetaphone
  implements org.apache.commons.codec.StringEncoder
{
public class DoubleMetaphoneResult
{
public  DoubleMetaphoneResult(int maxLength) { throw new RuntimeException("Stub!"); }
public  void append(char value) { throw new RuntimeException("Stub!"); }
public  void append(char primary, char alternate) { throw new RuntimeException("Stub!"); }
public  void appendPrimary(char value) { throw new RuntimeException("Stub!"); }
public  void appendAlternate(char value) { throw new RuntimeException("Stub!"); }
public  void append(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void append(java.lang.String primary, java.lang.String alternate) { throw new RuntimeException("Stub!"); }
public  void appendPrimary(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  void appendAlternate(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String getPrimary() { throw new RuntimeException("Stub!"); }
public  java.lang.String getAlternate() { throw new RuntimeException("Stub!"); }
public  boolean isComplete() { throw new RuntimeException("Stub!"); }
}
public  DoubleMetaphone() { throw new RuntimeException("Stub!"); }
public  java.lang.String doubleMetaphone(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  java.lang.String doubleMetaphone(java.lang.String value, boolean alternate) { throw new RuntimeException("Stub!"); }
public  java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException { throw new RuntimeException("Stub!"); }
public  java.lang.String encode(java.lang.String value) { throw new RuntimeException("Stub!"); }
public  boolean isDoubleMetaphoneEqual(java.lang.String value1, java.lang.String value2) { throw new RuntimeException("Stub!"); }
public  boolean isDoubleMetaphoneEqual(java.lang.String value1, java.lang.String value2, boolean alternate) { throw new RuntimeException("Stub!"); }
public  int getMaxCodeLen() { throw new RuntimeException("Stub!"); }
public  void setMaxCodeLen(int maxCodeLen) { throw new RuntimeException("Stub!"); }
protected  char charAt(java.lang.String value, int index) { throw new RuntimeException("Stub!"); }
protected static  boolean contains(java.lang.String value, int start, int length, java.lang.String[] criteria) { throw new RuntimeException("Stub!"); }
protected int maxCodeLen;
}
