/*
* Copyright (C) 2018 The Android Open Source Project
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

package android.media.audiofx;
public final class DynamicsProcessing
  extends android.media.audiofx.AudioEffect
{
public static class Stage
{
public  Stage(boolean inUse, boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  boolean isInUse() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static class BandStage
  extends android.media.audiofx.DynamicsProcessing.Stage
{
public  BandStage(boolean inUse, boolean enabled, int bandCount) { super(false,false); throw new RuntimeException("Stub!"); }
public  int getBandCount() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
public static class BandBase
{
public  BandBase(boolean enabled, float cutoffFrequency) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  boolean isEnabled() { throw new RuntimeException("Stub!"); }
public  void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
public  float getCutoffFrequency() { throw new RuntimeException("Stub!"); }
public  void setCutoffFrequency(float frequency) { throw new RuntimeException("Stub!"); }
}
public static final class EqBand
  extends android.media.audiofx.DynamicsProcessing.BandBase
{
public  EqBand(boolean enabled, float cutoffFrequency, float gain) { super(false,0); throw new RuntimeException("Stub!"); }
public  EqBand(android.media.audiofx.DynamicsProcessing.EqBand cfg) { super(false,0); throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  float getGain() { throw new RuntimeException("Stub!"); }
public  void setGain(float gain) { throw new RuntimeException("Stub!"); }
}
public static final class MbcBand
  extends android.media.audiofx.DynamicsProcessing.BandBase
{
public  MbcBand(boolean enabled, float cutoffFrequency, float attackTime, float releaseTime, float ratio, float threshold, float kneeWidth, float noiseGateThreshold, float expanderRatio, float preGain, float postGain) { super(false,0); throw new RuntimeException("Stub!"); }
public  MbcBand(android.media.audiofx.DynamicsProcessing.MbcBand cfg) { super(false,0); throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  float getAttackTime() { throw new RuntimeException("Stub!"); }
public  void setAttackTime(float attackTime) { throw new RuntimeException("Stub!"); }
public  float getReleaseTime() { throw new RuntimeException("Stub!"); }
public  void setReleaseTime(float releaseTime) { throw new RuntimeException("Stub!"); }
public  float getRatio() { throw new RuntimeException("Stub!"); }
public  void setRatio(float ratio) { throw new RuntimeException("Stub!"); }
public  float getThreshold() { throw new RuntimeException("Stub!"); }
public  void setThreshold(float threshold) { throw new RuntimeException("Stub!"); }
public  float getKneeWidth() { throw new RuntimeException("Stub!"); }
public  void setKneeWidth(float kneeWidth) { throw new RuntimeException("Stub!"); }
public  float getNoiseGateThreshold() { throw new RuntimeException("Stub!"); }
public  void setNoiseGateThreshold(float noiseGateThreshold) { throw new RuntimeException("Stub!"); }
public  float getExpanderRatio() { throw new RuntimeException("Stub!"); }
public  void setExpanderRatio(float expanderRatio) { throw new RuntimeException("Stub!"); }
public  float getPreGain() { throw new RuntimeException("Stub!"); }
public  void setPreGain(float preGain) { throw new RuntimeException("Stub!"); }
public  float getPostGain() { throw new RuntimeException("Stub!"); }
public  void setPostGain(float postGain) { throw new RuntimeException("Stub!"); }
}
public static final class Eq
  extends android.media.audiofx.DynamicsProcessing.BandStage
{
public  Eq(boolean inUse, boolean enabled, int bandCount) { super(false,false,0); throw new RuntimeException("Stub!"); }
public  Eq(android.media.audiofx.DynamicsProcessing.Eq cfg) { super(false,false,0); throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void setBand(int band, android.media.audiofx.DynamicsProcessing.EqBand bandCfg) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.EqBand getBand(int band) { throw new RuntimeException("Stub!"); }
}
public static final class Mbc
  extends android.media.audiofx.DynamicsProcessing.BandStage
{
public  Mbc(boolean inUse, boolean enabled, int bandCount) { super(false,false,0); throw new RuntimeException("Stub!"); }
public  Mbc(android.media.audiofx.DynamicsProcessing.Mbc cfg) { super(false,false,0); throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  void setBand(int band, android.media.audiofx.DynamicsProcessing.MbcBand bandCfg) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.MbcBand getBand(int band) { throw new RuntimeException("Stub!"); }
}
public static final class Limiter
  extends android.media.audiofx.DynamicsProcessing.Stage
{
public  Limiter(boolean inUse, boolean enabled, int linkGroup, float attackTime, float releaseTime, float ratio, float threshold, float postGain) { super(false,false); throw new RuntimeException("Stub!"); }
public  Limiter(android.media.audiofx.DynamicsProcessing.Limiter cfg) { super(false,false); throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getLinkGroup() { throw new RuntimeException("Stub!"); }
public  void setLinkGroup(int linkGroup) { throw new RuntimeException("Stub!"); }
public  float getAttackTime() { throw new RuntimeException("Stub!"); }
public  void setAttackTime(float attackTime) { throw new RuntimeException("Stub!"); }
public  float getReleaseTime() { throw new RuntimeException("Stub!"); }
public  void setReleaseTime(float releaseTime) { throw new RuntimeException("Stub!"); }
public  float getRatio() { throw new RuntimeException("Stub!"); }
public  void setRatio(float ratio) { throw new RuntimeException("Stub!"); }
public  float getThreshold() { throw new RuntimeException("Stub!"); }
public  void setThreshold(float threshold) { throw new RuntimeException("Stub!"); }
public  float getPostGain() { throw new RuntimeException("Stub!"); }
public  void setPostGain(float postGain) { throw new RuntimeException("Stub!"); }
}
public static final class Channel
{
public  Channel(float inputGain, boolean preEqInUse, int preEqBandCount, boolean mbcInUse, int mbcBandCount, boolean postEqInUse, int postEqBandCount, boolean limiterInUse) { throw new RuntimeException("Stub!"); }
public  Channel(android.media.audiofx.DynamicsProcessing.Channel cfg) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  float getInputGain() { throw new RuntimeException("Stub!"); }
public  void setInputGain(float inputGain) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Eq getPreEq() { throw new RuntimeException("Stub!"); }
public  void setPreEq(android.media.audiofx.DynamicsProcessing.Eq preEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.EqBand getPreEqBand(int band) { throw new RuntimeException("Stub!"); }
public  void setPreEqBand(int band, android.media.audiofx.DynamicsProcessing.EqBand preEqBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Mbc getMbc() { throw new RuntimeException("Stub!"); }
public  void setMbc(android.media.audiofx.DynamicsProcessing.Mbc mbc) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.MbcBand getMbcBand(int band) { throw new RuntimeException("Stub!"); }
public  void setMbcBand(int band, android.media.audiofx.DynamicsProcessing.MbcBand mbcBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Eq getPostEq() { throw new RuntimeException("Stub!"); }
public  void setPostEq(android.media.audiofx.DynamicsProcessing.Eq postEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.EqBand getPostEqBand(int band) { throw new RuntimeException("Stub!"); }
public  void setPostEqBand(int band, android.media.audiofx.DynamicsProcessing.EqBand postEqBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Limiter getLimiter() { throw new RuntimeException("Stub!"); }
public  void setLimiter(android.media.audiofx.DynamicsProcessing.Limiter limiter) { throw new RuntimeException("Stub!"); }
}
public static final class Config
{
public static final class Builder
{
public  Builder(int variant, int channelCount, boolean preEqInUse, int preEqBandCount, boolean mbcInUse, int mbcBandCount, boolean postEqInUse, int postEqBandCount, boolean limiterInUse) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setPreferredFrameDuration(float frameDuration) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainByChannelIndex(int channelIndex, float inputGain) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setInputGainAllChannelsTo(float inputGain) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setChannelTo(int channelIndex, android.media.audiofx.DynamicsProcessing.Channel channel) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setAllChannelsTo(android.media.audiofx.DynamicsProcessing.Channel channel) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Eq preEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setPreEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq preEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setMbcByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Mbc mbc) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setMbcAllChannelsTo(android.media.audiofx.DynamicsProcessing.Mbc mbc) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Eq postEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setPostEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq postEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Limiter limiter) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config.Builder setLimiterAllChannelsTo(android.media.audiofx.DynamicsProcessing.Limiter limiter) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config build() { throw new RuntimeException("Stub!"); }
}
Config() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int getVariant() { throw new RuntimeException("Stub!"); }
public  float getPreferredFrameDuration() { throw new RuntimeException("Stub!"); }
public  boolean isPreEqInUse() { throw new RuntimeException("Stub!"); }
public  int getPreEqBandCount() { throw new RuntimeException("Stub!"); }
public  boolean isMbcInUse() { throw new RuntimeException("Stub!"); }
public  int getMbcBandCount() { throw new RuntimeException("Stub!"); }
public  boolean isPostEqInUse() { throw new RuntimeException("Stub!"); }
public  int getPostEqBandCount() { throw new RuntimeException("Stub!"); }
public  boolean isLimiterInUse() { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setChannelTo(int channelIndex, android.media.audiofx.DynamicsProcessing.Channel channel) { throw new RuntimeException("Stub!"); }
public  void setAllChannelsTo(android.media.audiofx.DynamicsProcessing.Channel channel) { throw new RuntimeException("Stub!"); }
public  float getInputGainByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setInputGainByChannelIndex(int channelIndex, float inputGain) { throw new RuntimeException("Stub!"); }
public  void setInputGainAllChannelsTo(float inputGain) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setPreEqByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Eq preEq) { throw new RuntimeException("Stub!"); }
public  void setPreEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq preEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int channelIndex, int band) { throw new RuntimeException("Stub!"); }
public  void setPreEqBandByChannelIndex(int channelIndex, int band, android.media.audiofx.DynamicsProcessing.EqBand preEqBand) { throw new RuntimeException("Stub!"); }
public  void setPreEqBandAllChannelsTo(int band, android.media.audiofx.DynamicsProcessing.EqBand preEqBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setMbcByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Mbc mbc) { throw new RuntimeException("Stub!"); }
public  void setMbcAllChannelsTo(android.media.audiofx.DynamicsProcessing.Mbc mbc) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int channelIndex, int band) { throw new RuntimeException("Stub!"); }
public  void setMbcBandByChannelIndex(int channelIndex, int band, android.media.audiofx.DynamicsProcessing.MbcBand mbcBand) { throw new RuntimeException("Stub!"); }
public  void setMbcBandAllChannelsTo(int band, android.media.audiofx.DynamicsProcessing.MbcBand mbcBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setPostEqByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Eq postEq) { throw new RuntimeException("Stub!"); }
public  void setPostEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq postEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int channelIndex, int band) { throw new RuntimeException("Stub!"); }
public  void setPostEqBandByChannelIndex(int channelIndex, int band, android.media.audiofx.DynamicsProcessing.EqBand postEqBand) { throw new RuntimeException("Stub!"); }
public  void setPostEqBandAllChannelsTo(int band, android.media.audiofx.DynamicsProcessing.EqBand postEqBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setLimiterByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Limiter limiter) { throw new RuntimeException("Stub!"); }
public  void setLimiterAllChannelsTo(android.media.audiofx.DynamicsProcessing.Limiter limiter) { throw new RuntimeException("Stub!"); }
}
public  DynamicsProcessing(int audioSession) { throw new RuntimeException("Stub!"); }
public  DynamicsProcessing(int priority, int audioSession, android.media.audiofx.DynamicsProcessing.Config cfg) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Config getConfig() { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Channel getChannelByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setChannelTo(int channelIndex, android.media.audiofx.DynamicsProcessing.Channel channel) { throw new RuntimeException("Stub!"); }
public  void setAllChannelsTo(android.media.audiofx.DynamicsProcessing.Channel channel) { throw new RuntimeException("Stub!"); }
public  float getInputGainByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setInputGainbyChannel(int channelIndex, float inputGain) { throw new RuntimeException("Stub!"); }
public  void setInputGainAllChannelsTo(float inputGain) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Eq getPreEqByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setPreEqByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Eq preEq) { throw new RuntimeException("Stub!"); }
public  void setPreEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq preEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int channelIndex, int band) { throw new RuntimeException("Stub!"); }
public  void setPreEqBandByChannelIndex(int channelIndex, int band, android.media.audiofx.DynamicsProcessing.EqBand preEqBand) { throw new RuntimeException("Stub!"); }
public  void setPreEqBandAllChannelsTo(int band, android.media.audiofx.DynamicsProcessing.EqBand preEqBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Mbc getMbcByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setMbcByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Mbc mbc) { throw new RuntimeException("Stub!"); }
public  void setMbcAllChannelsTo(android.media.audiofx.DynamicsProcessing.Mbc mbc) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int channelIndex, int band) { throw new RuntimeException("Stub!"); }
public  void setMbcBandByChannelIndex(int channelIndex, int band, android.media.audiofx.DynamicsProcessing.MbcBand mbcBand) { throw new RuntimeException("Stub!"); }
public  void setMbcBandAllChannelsTo(int band, android.media.audiofx.DynamicsProcessing.MbcBand mbcBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Eq getPostEqByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setPostEqByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Eq postEq) { throw new RuntimeException("Stub!"); }
public  void setPostEqAllChannelsTo(android.media.audiofx.DynamicsProcessing.Eq postEq) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int channelIndex, int band) { throw new RuntimeException("Stub!"); }
public  void setPostEqBandByChannelIndex(int channelIndex, int band, android.media.audiofx.DynamicsProcessing.EqBand postEqBand) { throw new RuntimeException("Stub!"); }
public  void setPostEqBandAllChannelsTo(int band, android.media.audiofx.DynamicsProcessing.EqBand postEqBand) { throw new RuntimeException("Stub!"); }
public  android.media.audiofx.DynamicsProcessing.Limiter getLimiterByChannelIndex(int channelIndex) { throw new RuntimeException("Stub!"); }
public  void setLimiterByChannelIndex(int channelIndex, android.media.audiofx.DynamicsProcessing.Limiter limiter) { throw new RuntimeException("Stub!"); }
public  void setLimiterAllChannelsTo(android.media.audiofx.DynamicsProcessing.Limiter limiter) { throw new RuntimeException("Stub!"); }
public  int getChannelCount() { throw new RuntimeException("Stub!"); }
public static final int VARIANT_FAVOR_FREQUENCY_RESOLUTION = 0;
public static final int VARIANT_FAVOR_TIME_RESOLUTION = 1;
}
