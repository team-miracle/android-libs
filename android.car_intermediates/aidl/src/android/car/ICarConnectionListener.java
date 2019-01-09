/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICarConnectionListener.aidl
 */
package android.car;
/**
 * Binder callback for CarConnectionListener.
 * @hide
 */
public interface ICarConnectionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarConnectionListener
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarConnectionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarConnectionListener interface,
 * generating a proxy if needed.
 */
public static android.car.ICarConnectionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarConnectionListener))) {
return ((android.car.ICarConnectionListener)iin);
}
return new android.car.ICarConnectionListener.Stub.Proxy(obj);
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
case TRANSACTION_onConnected:
{
data.enforceInterface(descriptor);
this.onConnected();
return true;
}
case TRANSACTION_onDisconnected:
{
data.enforceInterface(descriptor);
this.onDisconnected();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICarConnectionListener
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
@Override public void onConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onDisconnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onDisconnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onConnected() throws android.os.RemoteException;
public void onDisconnected() throws android.os.RemoteException;
}
