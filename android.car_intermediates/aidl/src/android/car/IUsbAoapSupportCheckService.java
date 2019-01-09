/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/IUsbAoapSupportCheckService.aidl
 */
package android.car;
/**
 * Binder interface for service to check USB AOAP mode support.
 *
 * @hide
 */
public interface IUsbAoapSupportCheckService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.IUsbAoapSupportCheckService
{
private static final java.lang.String DESCRIPTOR = "android.car.IUsbAoapSupportCheckService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.IUsbAoapSupportCheckService interface,
 * generating a proxy if needed.
 */
public static android.car.IUsbAoapSupportCheckService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.IUsbAoapSupportCheckService))) {
return ((android.car.IUsbAoapSupportCheckService)iin);
}
return new android.car.IUsbAoapSupportCheckService.Stub.Proxy(obj);
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
case TRANSACTION_isDeviceSupported:
{
data.enforceInterface(descriptor);
android.hardware.usb.UsbDevice _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.usb.UsbDevice.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.isDeviceSupported(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.IUsbAoapSupportCheckService
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
@Override public boolean isDeviceSupported(android.hardware.usb.UsbDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_isDeviceSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isDeviceSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public boolean isDeviceSupported(android.hardware.usb.UsbDevice device) throws android.os.RemoteException;
}
