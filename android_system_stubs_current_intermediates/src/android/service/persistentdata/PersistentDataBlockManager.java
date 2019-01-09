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

package android.service.persistentdata;
public class PersistentDataBlockManager
{
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.SOURCE)
public static @interface FlashLockState
{
}
PersistentDataBlockManager() { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  int write(byte[] data) { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  byte[] read() { throw new RuntimeException("Stub!"); }
public  int getDataBlockSize() { throw new RuntimeException("Stub!"); }
@android.annotation.SuppressLint(value={"Doclava125"})
public  long getMaximumDataBlockSize() { throw new RuntimeException("Stub!"); }
public  void wipe() { throw new RuntimeException("Stub!"); }
@Deprecated
public  void setOemUnlockEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
@Deprecated
public  boolean getOemUnlockEnabled() { throw new RuntimeException("Stub!"); }
@android.service.persistentdata.PersistentDataBlockManager.FlashLockState()
public  int getFlashLockState() { throw new RuntimeException("Stub!"); }
public static final int FLASH_LOCK_LOCKED = 1;
public static final int FLASH_LOCK_UNKNOWN = -1;
public static final int FLASH_LOCK_UNLOCKED = 0;
}
