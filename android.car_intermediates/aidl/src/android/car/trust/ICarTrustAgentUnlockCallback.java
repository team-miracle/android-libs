/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/trust/ICarTrustAgentUnlockCallback.aidl
 */
package android.car.trust;
/**
 * Callback interface for CarTrustAgentService unlock.
 *
 * @hide
 */
public interface ICarTrustAgentUnlockCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.trust.ICarTrustAgentUnlockCallback
{
private static final java.lang.String DESCRIPTOR = "android.car.trust.ICarTrustAgentUnlockCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.trust.ICarTrustAgentUnlockCallback interface,
 * generating a proxy if needed.
 */
public static android.car.trust.ICarTrustAgentUnlockCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.trust.ICarTrustAgentUnlockCallback))) {
return ((android.car.trust.ICarTrustAgentUnlockCallback)iin);
}
return new android.car.trust.ICarTrustAgentUnlockCallback.Stub.Proxy(obj);
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
case TRANSACTION_onUnlockDataReceived:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
long _arg1;
_arg1 = data.readLong();
this.onUnlockDataReceived(_arg0, _arg1);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.trust.ICarTrustAgentUnlockCallback
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
/** Called when the unlock token is received */
@Override public void onUnlockDataReceived(byte[] token, long handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(token);
_data.writeLong(handle);
mRemote.transact(Stub.TRANSACTION_onUnlockDataReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onUnlockDataReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/** Called when the unlock token is received */
public void onUnlockDataReceived(byte[] token, long handle) throws android.os.RemoteException;
}
