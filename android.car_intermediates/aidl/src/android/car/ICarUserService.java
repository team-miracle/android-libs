/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICarUserService.aidl
 */
package android.car;
/** @hide */
public interface ICarUserService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarUserService
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarUserService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarUserService interface,
 * generating a proxy if needed.
 */
public static android.car.ICarUserService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarUserService))) {
return ((android.car.ICarUserService)iin);
}
return new android.car.ICarUserService.Stub.Proxy(obj);
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
case TRANSACTION_getBluetoothUserService:
{
data.enforceInterface(descriptor);
android.car.ICarBluetoothUserService _result = this.getBluetoothUserService();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICarUserService
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
@Override public android.car.ICarBluetoothUserService getBluetoothUserService() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.ICarBluetoothUserService _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBluetoothUserService, _data, _reply, 0);
_reply.readException();
_result = android.car.ICarBluetoothUserService.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getBluetoothUserService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.car.ICarBluetoothUserService getBluetoothUserService() throws android.os.RemoteException;
}
