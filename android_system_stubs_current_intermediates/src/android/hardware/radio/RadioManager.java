/**
* Copyright (C) 2015 The Android Open Source Project
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

package android.hardware.radio;
public class RadioManager
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface Band
{
}
public static class ModuleProperties
  implements android.os.Parcelable
{
ModuleProperties() { throw new RuntimeException("Stub!"); }
public  int getId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getServiceName() { throw new RuntimeException("Stub!"); }
public  int getClassId() { throw new RuntimeException("Stub!"); }
public  java.lang.String getImplementor() { throw new RuntimeException("Stub!"); }
public  java.lang.String getProduct() { throw new RuntimeException("Stub!"); }
public  java.lang.String getVersion() { throw new RuntimeException("Stub!"); }
public  java.lang.String getSerial() { throw new RuntimeException("Stub!"); }
public  int getNumTuners() { throw new RuntimeException("Stub!"); }
public  int getNumAudioSources() { throw new RuntimeException("Stub!"); }
public  boolean isInitializationRequired() { throw new RuntimeException("Stub!"); }
public  boolean isCaptureSupported() { throw new RuntimeException("Stub!"); }
public  boolean isBackgroundScanningSupported() { throw new RuntimeException("Stub!"); }
public  boolean isProgramTypeSupported(@android.hardware.radio.ProgramSelector.ProgramType()
int type) { throw new RuntimeException("Stub!"); }
public  boolean isProgramIdentifierSupported(@android.hardware.radio.ProgramSelector.IdentifierType()
int type) { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.Integer> getDabFrequencyTable() { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> getVendorInfo() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.BandDescriptor[] getBands() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.ModuleProperties> CREATOR;
static { CREATOR = null; }
}
public static class BandDescriptor
  implements android.os.Parcelable
{
BandDescriptor() { throw new RuntimeException("Stub!"); }
public  int getRegion() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  boolean isAmBand() { throw new RuntimeException("Stub!"); }
public  boolean isFmBand() { throw new RuntimeException("Stub!"); }
public  int getLowerLimit() { throw new RuntimeException("Stub!"); }
public  int getUpperLimit() { throw new RuntimeException("Stub!"); }
public  int getSpacing() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.BandDescriptor> CREATOR;
static { CREATOR = null; }
}
public static class FmBandDescriptor
  extends android.hardware.radio.RadioManager.BandDescriptor
{
FmBandDescriptor() { throw new RuntimeException("Stub!"); }
public  boolean isStereoSupported() { throw new RuntimeException("Stub!"); }
public  boolean isRdsSupported() { throw new RuntimeException("Stub!"); }
public  boolean isTaSupported() { throw new RuntimeException("Stub!"); }
public  boolean isAfSupported() { throw new RuntimeException("Stub!"); }
public  boolean isEaSupported() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.FmBandDescriptor> CREATOR;
static { CREATOR = null; }
}
public static class AmBandDescriptor
  extends android.hardware.radio.RadioManager.BandDescriptor
{
AmBandDescriptor() { throw new RuntimeException("Stub!"); }
public  boolean isStereoSupported() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.AmBandDescriptor> CREATOR;
static { CREATOR = null; }
}
public static class BandConfig
  implements android.os.Parcelable
{
BandConfig() { throw new RuntimeException("Stub!"); }
public  int getRegion() { throw new RuntimeException("Stub!"); }
public  int getType() { throw new RuntimeException("Stub!"); }
public  int getLowerLimit() { throw new RuntimeException("Stub!"); }
public  int getUpperLimit() { throw new RuntimeException("Stub!"); }
public  int getSpacing() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.BandConfig> CREATOR;
static { CREATOR = null; }
}
public static class FmBandConfig
  extends android.hardware.radio.RadioManager.BandConfig
{
public static class Builder
{
public  Builder(android.hardware.radio.RadioManager.FmBandDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public  Builder(android.hardware.radio.RadioManager.FmBandConfig config) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.FmBandConfig build() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.FmBandConfig.Builder setStereo(boolean state) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.FmBandConfig.Builder setRds(boolean state) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.FmBandConfig.Builder setTa(boolean state) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.FmBandConfig.Builder setAf(boolean state) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.FmBandConfig.Builder setEa(boolean state) { throw new RuntimeException("Stub!"); }
}
FmBandConfig() { throw new RuntimeException("Stub!"); }
public  boolean getStereo() { throw new RuntimeException("Stub!"); }
public  boolean getRds() { throw new RuntimeException("Stub!"); }
public  boolean getTa() { throw new RuntimeException("Stub!"); }
public  boolean getAf() { throw new RuntimeException("Stub!"); }
public  boolean getEa() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.FmBandConfig> CREATOR;
static { CREATOR = null; }
}
public static class AmBandConfig
  extends android.hardware.radio.RadioManager.BandConfig
{
public static class Builder
{
public  Builder(android.hardware.radio.RadioManager.AmBandDescriptor descriptor) { throw new RuntimeException("Stub!"); }
public  Builder(android.hardware.radio.RadioManager.AmBandConfig config) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.AmBandConfig build() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioManager.AmBandConfig.Builder setStereo(boolean state) { throw new RuntimeException("Stub!"); }
}
AmBandConfig() { throw new RuntimeException("Stub!"); }
public  boolean getStereo() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.AmBandConfig> CREATOR;
static { CREATOR = null; }
}
public static class ProgramInfo
  implements android.os.Parcelable
{
ProgramInfo() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector getSelector() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector.Identifier getLogicallyTunedTo() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.ProgramSelector.Identifier getPhysicallyTunedTo() { throw new RuntimeException("Stub!"); }
public  java.util.Collection<android.hardware.radio.ProgramSelector.Identifier> getRelatedContent() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getChannel() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  int getSubChannel() { throw new RuntimeException("Stub!"); }
public  boolean isTuned() { throw new RuntimeException("Stub!"); }
public  boolean isStereo() { throw new RuntimeException("Stub!"); }
@java.lang.Deprecated()
public  boolean isDigital() { throw new RuntimeException("Stub!"); }
public  boolean isLive() { throw new RuntimeException("Stub!"); }
public  boolean isMuted() { throw new RuntimeException("Stub!"); }
public  boolean isTrafficProgram() { throw new RuntimeException("Stub!"); }
public  boolean isTrafficAnnouncementActive() { throw new RuntimeException("Stub!"); }
public  int getSignalStrength() { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioMetadata getMetadata() { throw new RuntimeException("Stub!"); }
public  java.util.Map<java.lang.String, java.lang.String> getVendorInfo() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public static final android.os.Parcelable.Creator<android.hardware.radio.RadioManager.ProgramInfo> CREATOR;
static { CREATOR = null; }
}
RadioManager() { throw new RuntimeException("Stub!"); }
public  int listModules(java.util.List<android.hardware.radio.RadioManager.ModuleProperties> modules) { throw new RuntimeException("Stub!"); }
public  android.hardware.radio.RadioTuner openTuner(int moduleId, android.hardware.radio.RadioManager.BandConfig config, boolean withAudio, android.hardware.radio.RadioTuner.Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
public  void addAnnouncementListener(java.util.Set<java.lang.Integer> enabledAnnouncementTypes, android.hardware.radio.Announcement.OnListUpdatedListener listener) { throw new RuntimeException("Stub!"); }
public  void addAnnouncementListener(java.util.concurrent.Executor executor, java.util.Set<java.lang.Integer> enabledAnnouncementTypes, android.hardware.radio.Announcement.OnListUpdatedListener listener) { throw new RuntimeException("Stub!"); }
public  void removeAnnouncementListener(android.hardware.radio.Announcement.OnListUpdatedListener listener) { throw new RuntimeException("Stub!"); }
public static final int BAND_AM = 0;
public static final int BAND_AM_HD = 3;
public static final int BAND_FM = 1;
public static final int BAND_FM_HD = 2;
public static final int BAND_INVALID = -1;
public static final int CLASS_AM_FM = 0;
public static final int CLASS_DT = 2;
public static final int CLASS_SAT = 1;
public static final int CONFIG_DAB_DAB_LINKING = 6;
public static final int CONFIG_DAB_DAB_SOFT_LINKING = 8;
public static final int CONFIG_DAB_FM_LINKING = 7;
public static final int CONFIG_DAB_FM_SOFT_LINKING = 9;
public static final int CONFIG_FORCE_ANALOG = 2;
public static final int CONFIG_FORCE_DIGITAL = 3;
public static final int CONFIG_FORCE_MONO = 1;
public static final int CONFIG_RDS_AF = 4;
public static final int CONFIG_RDS_REG = 5;
public static final int REGION_ITU_1 = 0;
public static final int REGION_ITU_2 = 1;
public static final int REGION_JAPAN = 3;
public static final int REGION_KOREA = 4;
public static final int REGION_OIRT = 2;
public static final int STATUS_BAD_VALUE = -22;
public static final int STATUS_DEAD_OBJECT = -32;
public static final int STATUS_ERROR = -2147483648;
public static final int STATUS_INVALID_OPERATION = -38;
public static final int STATUS_NO_INIT = -19;
public static final int STATUS_OK = 0;
public static final int STATUS_PERMISSION_DENIED = -1;
public static final int STATUS_TIMED_OUT = -110;
}
