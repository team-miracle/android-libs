/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IPnoScanEvent.aidl
 */
package android.net.wifi;
// A callback for receiving pno scanning events.

public interface IPnoScanEvent extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IPnoScanEvent
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IPnoScanEvent";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IPnoScanEvent interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IPnoScanEvent asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IPnoScanEvent))) {
return ((android.net.wifi.IPnoScanEvent)iin);
}
return new android.net.wifi.IPnoScanEvent.Stub.Proxy(obj);
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
case TRANSACTION_OnPnoNetworkFound:
{
data.enforceInterface(descriptor);
this.OnPnoNetworkFound();
return true;
}
case TRANSACTION_OnPnoScanFailed:
{
data.enforceInterface(descriptor);
this.OnPnoScanFailed();
return true;
}
case TRANSACTION_OnPnoScanOverOffloadStarted:
{
data.enforceInterface(descriptor);
this.OnPnoScanOverOffloadStarted();
return true;
}
case TRANSACTION_OnPnoScanOverOffloadFailed:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.OnPnoScanOverOffloadFailed(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.net.wifi.IPnoScanEvent
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
@Override public void OnPnoNetworkFound() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_OnPnoNetworkFound, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void OnPnoScanFailed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_OnPnoScanFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Callback notifying the framework that PNO scan is started over Offload HAL
// interface, this is meant for metrics collection only

@Override public void OnPnoScanOverOffloadStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_OnPnoScanOverOffloadStarted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Callback notifying the framework that a PNO scan running over Offload HAL
// has failed, this is meant for metrics collection only

@Override public void OnPnoScanOverOffloadFailed(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_OnPnoScanOverOffloadFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_OnPnoNetworkFound = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_OnPnoScanFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_OnPnoScanOverOffloadStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_OnPnoScanOverOffloadFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public static final int PNO_SCAN_OVER_OFFLOAD_BINDER_FAILURE = 0;
public static final int PNO_SCAN_OVER_OFFLOAD_REMOTE_FAILURE = 1;
public void OnPnoNetworkFound() throws android.os.RemoteException;
public void OnPnoScanFailed() throws android.os.RemoteException;
// Callback notifying the framework that PNO scan is started over Offload HAL
// interface, this is meant for metrics collection only

public void OnPnoScanOverOffloadStarted() throws android.os.RemoteException;
// Callback notifying the framework that a PNO scan running over Offload HAL
// has failed, this is meant for metrics collection only

public void OnPnoScanOverOffloadFailed(int reason) throws android.os.RemoteException;
}
