/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IApInterface.aidl
 */
package android.net.wifi;
// IApInterface represents a network interface configured to act as a
// WiFi access point.

public interface IApInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IApInterface
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IApInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IApInterface interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IApInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IApInterface))) {
return ((android.net.wifi.IApInterface)iin);
}
return new android.net.wifi.IApInterface.Stub.Proxy(obj);
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
case TRANSACTION_startHostapd:
{
data.enforceInterface(descriptor);
android.net.wifi.IApInterfaceEventCallback _arg0;
_arg0 = android.net.wifi.IApInterfaceEventCallback.Stub.asInterface(data.readStrongBinder());
boolean _result = this.startHostapd(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopHostapd:
{
data.enforceInterface(descriptor);
boolean _result = this.stopHostapd();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getInterfaceName:
{
data.enforceInterface(descriptor);
java.lang.String _result = this.getInterfaceName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getNumberOfAssociatedStations:
{
data.enforceInterface(descriptor);
int _result = this.getNumberOfAssociatedStations();
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
private static class Proxy implements android.net.wifi.IApInterface
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
// Start up an instance of hostapd associated with this interface.
//
// @param callback Object to add a set of event callbacks.
// @return true on success.

@Override public boolean startHostapd(android.net.wifi.IApInterfaceEventCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startHostapd, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Stop a previously started instance of hostapd.
// @return true on success.

@Override public boolean stopHostapd() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopHostapd, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getInterfaceName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getInterfaceName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNumberOfAssociatedStations() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNumberOfAssociatedStations, _data, _reply, 0);
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
static final int TRANSACTION_startHostapd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopHostapd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getInterfaceName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getNumberOfAssociatedStations = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public static final int ENCRYPTION_TYPE_NONE = 0;
public static final int ENCRYPTION_TYPE_WPA = 1;
public static final int ENCRYPTION_TYPE_WPA2 = 2;
// Start up an instance of hostapd associated with this interface.
//
// @param callback Object to add a set of event callbacks.
// @return true on success.

public boolean startHostapd(android.net.wifi.IApInterfaceEventCallback callback) throws android.os.RemoteException;
// Stop a previously started instance of hostapd.
// @return true on success.

public boolean stopHostapd() throws android.os.RemoteException;
public java.lang.String getInterfaceName() throws android.os.RemoteException;
public int getNumberOfAssociatedStations() throws android.os.RemoteException;
}
