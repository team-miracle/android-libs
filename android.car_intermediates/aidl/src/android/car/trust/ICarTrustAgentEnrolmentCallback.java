/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/trust/ICarTrustAgentEnrolmentCallback.aidl
 */
package android.car.trust;
/**
 * Callback interface for CarTrustAgentService enrolment.
 *
 * @hide
 */
public interface ICarTrustAgentEnrolmentCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.trust.ICarTrustAgentEnrolmentCallback
{
private static final java.lang.String DESCRIPTOR = "android.car.trust.ICarTrustAgentEnrolmentCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.trust.ICarTrustAgentEnrolmentCallback interface,
 * generating a proxy if needed.
 */
public static android.car.trust.ICarTrustAgentEnrolmentCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.trust.ICarTrustAgentEnrolmentCallback))) {
return ((android.car.trust.ICarTrustAgentEnrolmentCallback)iin);
}
return new android.car.trust.ICarTrustAgentEnrolmentCallback.Stub.Proxy(obj);
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
case TRANSACTION_onEnrolmentDataReceived:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
this.onEnrolmentDataReceived(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.trust.ICarTrustAgentEnrolmentCallback
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
/** Called when the enrolment data is received */
@Override public void onEnrolmentDataReceived(byte[] token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(token);
mRemote.transact(Stub.TRANSACTION_onEnrolmentDataReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onEnrolmentDataReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/** Called when the enrolment data is received */
public void onEnrolmentDataReceived(byte[] token) throws android.os.RemoteException;
}
