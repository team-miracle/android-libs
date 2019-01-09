/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/services/Car/car-lib/src/android/car/ICarProjectionCallback.aidl
 */
package android.car;
/**
 * @hide
 */
public interface ICarProjectionCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarProjectionCallback
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarProjectionCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarProjectionCallback interface,
 * generating a proxy if needed.
 */
public static android.car.ICarProjectionCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarProjectionCallback))) {
return ((android.car.ICarProjectionCallback)iin);
}
return new android.car.ICarProjectionCallback.Stub.Proxy(obj);
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
case TRANSACTION_onVoiceAssistantRequest:
{
data.enforceInterface(descriptor);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onVoiceAssistantRequest(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.car.ICarProjectionCallback
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
@Override public void onVoiceAssistantRequest(boolean fromLongPress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((fromLongPress)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onVoiceAssistantRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onVoiceAssistantRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onVoiceAssistantRequest(boolean fromLongPress) throws android.os.RemoteException;
}
