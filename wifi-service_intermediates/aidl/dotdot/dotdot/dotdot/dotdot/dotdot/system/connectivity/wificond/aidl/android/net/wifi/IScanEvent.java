/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IScanEvent.aidl
 */
package android.net.wifi;
// A callback for receiving scanning events.

public interface IScanEvent extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IScanEvent
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IScanEvent";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IScanEvent interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IScanEvent asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IScanEvent))) {
return ((android.net.wifi.IScanEvent)iin);
}
return new android.net.wifi.IScanEvent.Stub.Proxy(obj);
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
case TRANSACTION_OnScanResultReady:
{
data.enforceInterface(descriptor);
this.OnScanResultReady();
return true;
}
case TRANSACTION_OnScanFailed:
{
data.enforceInterface(descriptor);
this.OnScanFailed();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.net.wifi.IScanEvent
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
@Override public void OnScanResultReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_OnScanResultReady, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void OnScanFailed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_OnScanFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_OnScanResultReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_OnScanFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void OnScanResultReady() throws android.os.RemoteException;
public void OnScanFailed() throws android.os.RemoteException;
}
