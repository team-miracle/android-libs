/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IInterfaceEventCallback.aidl
 */
package android.net.wifi;
// A callback for receiving events related to this chip.

public interface IInterfaceEventCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IInterfaceEventCallback
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IInterfaceEventCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IInterfaceEventCallback interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IInterfaceEventCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IInterfaceEventCallback))) {
return ((android.net.wifi.IInterfaceEventCallback)iin);
}
return new android.net.wifi.IInterfaceEventCallback.Stub.Proxy(obj);
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
case TRANSACTION_OnClientInterfaceReady:
{
data.enforceInterface(descriptor);
android.net.wifi.IClientInterface _arg0;
_arg0 = android.net.wifi.IClientInterface.Stub.asInterface(data.readStrongBinder());
this.OnClientInterfaceReady(_arg0);
return true;
}
case TRANSACTION_OnApInterfaceReady:
{
data.enforceInterface(descriptor);
android.net.wifi.IApInterface _arg0;
_arg0 = android.net.wifi.IApInterface.Stub.asInterface(data.readStrongBinder());
this.OnApInterfaceReady(_arg0);
return true;
}
case TRANSACTION_OnClientTorndownEvent:
{
data.enforceInterface(descriptor);
android.net.wifi.IClientInterface _arg0;
_arg0 = android.net.wifi.IClientInterface.Stub.asInterface(data.readStrongBinder());
this.OnClientTorndownEvent(_arg0);
return true;
}
case TRANSACTION_OnApTorndownEvent:
{
data.enforceInterface(descriptor);
android.net.wifi.IApInterface _arg0;
_arg0 = android.net.wifi.IApInterface.Stub.asInterface(data.readStrongBinder());
this.OnApTorndownEvent(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.net.wifi.IInterfaceEventCallback
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
// Signals that the provided interface is ready for future commands.

@Override public void OnClientInterfaceReady(android.net.wifi.IClientInterface network_interface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((network_interface!=null))?(network_interface.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_OnClientInterfaceReady, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void OnApInterfaceReady(android.net.wifi.IApInterface network_interface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((network_interface!=null))?(network_interface.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_OnApInterfaceReady, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Signals that an interface was torn down.
// No future callbacks will be delivered via this callback, and the callback
// is automatically unregistered.

@Override public void OnClientTorndownEvent(android.net.wifi.IClientInterface network_interface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((network_interface!=null))?(network_interface.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_OnClientTorndownEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void OnApTorndownEvent(android.net.wifi.IApInterface network_interface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((network_interface!=null))?(network_interface.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_OnApTorndownEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_OnClientInterfaceReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_OnApInterfaceReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_OnClientTorndownEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_OnApTorndownEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
// Signals that the provided interface is ready for future commands.

public void OnClientInterfaceReady(android.net.wifi.IClientInterface network_interface) throws android.os.RemoteException;
public void OnApInterfaceReady(android.net.wifi.IApInterface network_interface) throws android.os.RemoteException;
// Signals that an interface was torn down.
// No future callbacks will be delivered via this callback, and the callback
// is automatically unregistered.

public void OnClientTorndownEvent(android.net.wifi.IClientInterface network_interface) throws android.os.RemoteException;
public void OnApTorndownEvent(android.net.wifi.IApInterface network_interface) throws android.os.RemoteException;
}
