/*
* Copyright (C) 2016 The Android Open Source Project
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

package android.os;
public interface IHwBinder
{
public static interface DeathRecipient
{
public abstract  void serviceDied(long cookie);
}
public abstract  void transact(int code, android.os.HwParcel request, android.os.HwParcel reply, int flags) throws android.os.RemoteException;
public abstract  android.os.IHwInterface queryLocalInterface(java.lang.String descriptor);
public abstract  boolean linkToDeath(android.os.IHwBinder.DeathRecipient recipient, long cookie);
public abstract  boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient recipient);
}
