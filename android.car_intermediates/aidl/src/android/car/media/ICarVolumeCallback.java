/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/media/ICarVolumeCallback.aidl
 */
package android.car.media;
/**
 * Binder interface to callback the volume key events.
 *
 * @hide
 */
public interface ICarVolumeCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.media.ICarVolumeCallback
{
private static final java.lang.String DESCRIPTOR = "android.car.media.ICarVolumeCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.media.ICarVolumeCallback interface,
 * generating a proxy if needed.
 */
public static android.car.media.ICarVolumeCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.media.ICarVolumeCallback))) {
return ((android.car.media.ICarVolumeCallback)iin);
}
return new android.car.media.ICarVolumeCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_onGroupVolumeChanged:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onGroupVolumeChanged(_arg0, _arg1);
return true;
}
case TRANSACTION_onMasterMuteChanged:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.onMasterMuteChanged(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.media.ICarVolumeCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * This is called whenever a group volume is changed.
     * The changed-to volume index is not included, the caller is encouraged to
     * get the current group volume index via CarAudioManager.
     */
@Override public void onGroupVolumeChanged(int groupId, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(groupId);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_onGroupVolumeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * This is called whenever the master mute state is changed.
     * The changed-to master mute state is not included, the caller is encouraged to
     * get the current master mute state via AudioManager.
     */
@Override public void onMasterMuteChanged(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_onMasterMuteChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onGroupVolumeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onMasterMuteChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/**
     * This is called whenever a group volume is changed.
     * The changed-to volume index is not included, the caller is encouraged to
     * get the current group volume index via CarAudioManager.
     */
public void onGroupVolumeChanged(int groupId, int flags) throws android.os.RemoteException;
/**
     * This is called whenever the master mute state is changed.
     * The changed-to master mute state is not included, the caller is encouraged to
     * get the current master mute state via AudioManager.
     */
public void onMasterMuteChanged(int flags) throws android.os.RemoteException;
}
