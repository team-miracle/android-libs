/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/input/ICarInputListener.aidl
 */
package android.car.input;
/**
 * Binder API for Input Service.
 *
 * @hide
 */
public interface ICarInputListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.input.ICarInputListener
{
private static final java.lang.String DESCRIPTOR = "android.car.input.ICarInputListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.input.ICarInputListener interface,
 * generating a proxy if needed.
 */
public static android.car.input.ICarInputListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.input.ICarInputListener))) {
return ((android.car.input.ICarInputListener)iin);
}
return new android.car.input.ICarInputListener.Stub.Proxy(obj);
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
case TRANSACTION_onKeyEvent:
{
data.enforceInterface(descriptor);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.onKeyEvent(_arg0, _arg1);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.input.ICarInputListener
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
/** Called when key event has been received. */
@Override public void onKeyEvent(android.view.KeyEvent keyEvent, int targetDisplay) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((keyEvent!=null)) {
_data.writeInt(1);
keyEvent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(targetDisplay);
mRemote.transact(Stub.TRANSACTION_onKeyEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onKeyEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
/** Called when key event has been received. */
public void onKeyEvent(android.view.KeyEvent keyEvent, int targetDisplay) throws android.os.RemoteException;
}
