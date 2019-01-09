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

package org.apache.commons.codec.net;
@java.lang.Deprecated()
public class URLCodec
  implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder
{
public  URLCodec() { throw new RuntimeException("Stub!"); }
public  URLCodec(java.lang.String charset) { throw new RuntimeException("Stub!"); }
public static final  byte[] encodeUrl(java.util.BitSet urlsafe, byte[] bytes) { throw new RuntimeException("Stub!"); }
public static final  byte[] decodeUrl(byte[] bytes) throws org.apache.commons.codec.DecoderException { throw new RuntimeException("Stub!"); }
public  byte[] encode(byte[] bytes) { throw new RuntimeException("Stub!"); }
public  byte[] decode(byte[] bytes) throws org.apache.commons.codec.DecoderException { throw new RuntimeException("Stub!"); }
public  java.lang.String encode(java.lang.String pString, java.lang.String charset) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  java.lang.String encode(java.lang.String pString) throws org.apache.commons.codec.EncoderException { throw new RuntimeException("Stub!"); }
public  java.lang.String decode(java.lang.String pString, java.lang.String charset) throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public  java.lang.String decode(java.lang.String pString) throws org.apache.commons.codec.DecoderException { throw new RuntimeException("Stub!"); }
public  java.lang.Object encode(java.lang.Object pObject) throws org.apache.commons.codec.EncoderException { throw new RuntimeException("Stub!"); }
public  java.lang.Object decode(java.lang.Object pObject) throws org.apache.commons.codec.DecoderException { throw new RuntimeException("Stub!"); }
@Deprecated
public  java.lang.String getEncoding() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDefaultCharset() { throw new RuntimeException("Stub!"); }
protected static byte ESCAPE_CHAR;
protected static final java.util.BitSet WWW_FORM_URL;
protected java.lang.String charset;
static { WWW_FORM_URL = null; }
}
