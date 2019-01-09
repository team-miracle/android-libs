/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICarInfo.aidl
 */
package android.car;
/** @hide */
public interface ICarInfo extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarInfo
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarInfo";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarInfo interface,
 * generating a proxy if needed.
 */
public static android.car.ICarInfo asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarInfo))) {
return ((android.car.ICarInfo)iin);
}
return new android.car.ICarInfo.Stub.Proxy(obj);
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
case TRANSACTION_getBasicInfo:
{
data.enforceInterface(descriptor);
android.os.Bundle _result = this.getBasicInfo();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getStringInfo:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getStringInfo(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICarInfo
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
@Override public android.os.Bundle getBasicInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBasicInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getStringInfo(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_getStringInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getBasicInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getStringInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public android.os.Bundle getBasicInfo() throws android.os.RemoteException;
public java.lang.String getStringInfo(java.lang.String key) throws android.os.RemoteException;
}
