/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICar.aidl
 */
package android.car;
/** @hide */
public interface ICar extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICar
{
private static final java.lang.String DESCRIPTOR = "android.car.ICar";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICar interface,
 * generating a proxy if needed.
 */
public static android.car.ICar asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICar))) {
return ((android.car.ICar)iin);
}
return new android.car.ICar.Stub.Proxy(obj);
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
case TRANSACTION_setCarServiceHelper:
{
data.enforceInterface(descriptor);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.setCarServiceHelper(_arg0);
return true;
}
case TRANSACTION_getCarService:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.IBinder _result = this.getCarService(_arg0);
reply.writeNoException();
reply.writeStrongBinder(_result);
return true;
}
case TRANSACTION_getCarConnectionType:
{
data.enforceInterface(descriptor);
int _result = this.getCarConnectionType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICar
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
     * IBinder is ICarServiceHelper but passed as IBinder due to aidl hidden.
     * Only this method is oneway as it is called from system server.
     * This should be the 1st method. Do not change the order.
     */
@Override public void setCarServiceHelper(android.os.IBinder helper) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(helper);
mRemote.transact(Stub.TRANSACTION_setCarServiceHelper, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public android.os.IBinder getCarService(java.lang.String serviceName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.IBinder _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(serviceName);
mRemote.transact(Stub.TRANSACTION_getCarService, _data, _reply, 0);
_reply.readException();
_result = _reply.readStrongBinder();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCarConnectionType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCarConnectionType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_setCarServiceHelper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getCarService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getCarConnectionType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * IBinder is ICarServiceHelper but passed as IBinder due to aidl hidden.
     * Only this method is oneway as it is called from system server.
     * This should be the 1st method. Do not change the order.
     */
public void setCarServiceHelper(android.os.IBinder helper) throws android.os.RemoteException;
public android.os.IBinder getCarService(java.lang.String serviceName) throws android.os.RemoteException;
public int getCarConnectionType() throws android.os.RemoteException;
}
