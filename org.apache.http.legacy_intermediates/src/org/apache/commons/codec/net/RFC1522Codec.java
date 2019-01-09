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
 abstract class RFC1522Codec
{
RFC1522Codec() { throw new RuntimeException("Stub!"); }
protected  java.lang.String encodeText(java.lang.String text, java.lang.String charset) throws org.apache.commons.codec.EncoderException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
protected  java.lang.String decodeText(java.lang.String text) throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
protected abstract  java.lang.String getEncoding();
protected abstract  byte[] doEncoding(byte[] bytes) throws org.apache.commons.codec.EncoderException;
protected abstract  byte[] doDecoding(byte[] bytes) throws org.apache.commons.codec.DecoderException;
}
