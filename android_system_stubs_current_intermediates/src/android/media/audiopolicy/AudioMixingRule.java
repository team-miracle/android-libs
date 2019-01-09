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

package android.media.audiopolicy;
public class AudioMixingRule
{
public static class Builder
{
public  Builder() { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMixingRule.Builder addRule(android.media.AudioAttributes attrToMatch, int rule) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMixingRule.Builder excludeRule(android.media.AudioAttributes attrToMatch, int rule) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMixingRule.Builder addMixRule(int rule, java.lang.Object property) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMixingRule.Builder excludeMixRule(int rule, java.lang.Object property) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
public  android.media.audiopolicy.AudioMixingRule build() { throw new RuntimeException("Stub!"); }
}
AudioMixingRule() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public static final int RULE_MATCH_ATTRIBUTE_CAPTURE_PRESET = 2;
public static final int RULE_MATCH_ATTRIBUTE_USAGE = 1;
public static final int RULE_MATCH_UID = 4;
}
