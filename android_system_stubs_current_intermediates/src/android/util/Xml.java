/*
* Copyright (C) 2007 The Android Open Source Project
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

package android.util;
public class Xml
{
public static enum Encoding
{
ISO_8859_1(),
US_ASCII(),
UTF_16(),
UTF_8();
}
Xml() { throw new RuntimeException("Stub!"); }
public static  void parse(java.lang.String xml, org.xml.sax.ContentHandler contentHandler) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public static  void parse(java.io.Reader in, org.xml.sax.ContentHandler contentHandler) throws java.io.IOException, org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public static  void parse(java.io.InputStream in, android.util.Xml.Encoding encoding, org.xml.sax.ContentHandler contentHandler) throws java.io.IOException, org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
public static  org.xmlpull.v1.XmlPullParser newPullParser() { throw new RuntimeException("Stub!"); }
public static  org.xmlpull.v1.XmlSerializer newSerializer() { throw new RuntimeException("Stub!"); }
public static  android.util.Xml.Encoding findEncodingByName(java.lang.String encodingName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
public static  android.util.AttributeSet asAttributeSet(org.xmlpull.v1.XmlPullParser parser) { throw new RuntimeException("Stub!"); }
public static java.lang.String FEATURE_RELAXED;
}
