/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IClientInterface.aidl
 */
package android.net.wifi;
// IClientInterface represents a network interface that can be used to connect
// to access points and obtain internet connectivity.

public interface IClientInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IClientInterface
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IClientInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IClientInterface interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IClientInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IClientInterface))) {
return ((android.net.wifi.IClientInterface)iin);
}
return new android.net.wifi.IClientInterface.Stub.Proxy(obj);
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
case TRANSACTION_getPacketCounters:
{
data.enforceInterface(descriptor);
int[] _result = this.getPacketCounters();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_signalPoll:
{
data.enforceInterface(descriptor);
int[] _result = this.signalPoll();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getMacAddress:
{
data.enforceInterface(descriptor);
byte[] _result = this.getMacAddress();
reply.writeNoException();
reply.writeByteArray(_result);
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
case TRANSACTION_getWifiScannerImpl:
{
data.enforceInterface(descriptor);
android.net.wifi.IWifiScannerImpl _result = this.getWifiScannerImpl();
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_setMacAddress:
{
data.enforceInterface(descriptor);
byte[] _arg0;
_arg0 = data.createByteArray();
boolean _result = this.setMacAddress(_arg0);
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
private static class Proxy implements android.net.wifi.IClientInterface
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
@Override public int[] getPacketCounters() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPacketCounters, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] signalPoll() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_signalPoll, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get the MAC address of this interface.

@Override public byte[] getMacAddress() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMacAddress, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
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
@Override public android.net.wifi.IWifiScannerImpl getWifiScannerImpl() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.IWifiScannerImpl _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getWifiScannerImpl, _data, _reply, 0);
_reply.readException();
_result = android.net.wifi.IWifiScannerImpl.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Set the MAC address of this interface
// Returns true if the set was successful

@Override public boolean setMacAddress(byte[] mac) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(mac);
mRemote.transact(Stub.TRANSACTION_setMacAddress, _data, _reply, 0);
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
static final int TRANSACTION_getPacketCounters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_signalPoll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getMacAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getInterfaceName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getWifiScannerImpl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setMacAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public int[] getPacketCounters() throws android.os.RemoteException;
public int[] signalPoll() throws android.os.RemoteException;
// Get the MAC address of this interface.

public byte[] getMacAddress() throws android.os.RemoteException;
public java.lang.String getInterfaceName() throws android.os.RemoteException;
public android.net.wifi.IWifiScannerImpl getWifiScannerImpl() throws android.os.RemoteException;
// Set the MAC address of this interface
// Returns true if the set was successful

public boolean setMacAddress(byte[] mac) throws android.os.RemoteException;
}
