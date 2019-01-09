/*
* Copyright (C) 2006 The Android Open Source Project
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
public interface AttributeSet
{
public abstract  int getAttributeCount();
default public  java.lang.String getAttributeNamespace(int index) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.String getAttributeName(int index);
public abstract  java.lang.String getAttributeValue(int index);
public abstract  java.lang.String getAttributeValue(java.lang.String namespace, java.lang.String name);
public abstract  java.lang.String getPositionDescription();
public abstract  int getAttributeNameResource(int index);
public abstract  int getAttributeListValue(java.lang.String namespace, java.lang.String attribute, java.lang.String[] options, int defaultValue);
public abstract  boolean getAttributeBooleanValue(java.lang.String namespace, java.lang.String attribute, boolean defaultValue);
public abstract  int getAttributeResourceValue(java.lang.String namespace, java.lang.String attribute, int defaultValue);
public abstract  int getAttributeIntValue(java.lang.String namespace, java.lang.String attribute, int defaultValue);
public abstract  int getAttributeUnsignedIntValue(java.lang.String namespace, java.lang.String attribute, int defaultValue);
public abstract  float getAttributeFloatValue(java.lang.String namespace, java.lang.String attribute, float defaultValue);
public abstract  int getAttributeListValue(int index, java.lang.String[] options, int defaultValue);
public abstract  boolean getAttributeBooleanValue(int index, boolean defaultValue);
public abstract  int getAttributeResourceValue(int index, int defaultValue);
public abstract  int getAttributeIntValue(int index, int defaultValue);
public abstract  int getAttributeUnsignedIntValue(int index, int defaultValue);
public abstract  float getAttributeFloatValue(int index, float defaultValue);
public abstract  java.lang.String getIdAttribute();
public abstract  java.lang.String getClassAttribute();
public abstract  int getIdAttributeResourceValue(int defaultValue);
public abstract  int getStyleAttribute();
}
