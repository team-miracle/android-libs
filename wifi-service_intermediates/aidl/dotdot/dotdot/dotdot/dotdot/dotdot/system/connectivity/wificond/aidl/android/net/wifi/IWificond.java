/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IWificond.aidl
 */
package android.net.wifi;
// Service interface that exposes primitives for controlling the WiFi
// subsystems of a device.

public interface IWificond extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IWificond
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IWificond";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IWificond interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IWificond asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IWificond))) {
return ((android.net.wifi.IWificond)iin);
}
return new android.net.wifi.IWificond.Stub.Proxy(obj);
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
case TRANSACTION_createApInterface:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.wifi.IApInterface _result = this.createApInterface(_arg0);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_createClientInterface:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
android.net.wifi.IClientInterface _result = this.createClientInterface(_arg0);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_tearDownApInterface:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.tearDownApInterface(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_tearDownClientInterface:
{
data.enforceInterface(descriptor);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.tearDownClientInterface(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_tearDownInterfaces:
{
data.enforceInterface(descriptor);
this.tearDownInterfaces();
reply.writeNoException();
return true;
}
case TRANSACTION_GetClientInterfaces:
{
data.enforceInterface(descriptor);
java.util.List<android.os.IBinder> _result = this.GetClientInterfaces();
reply.writeNoException();
reply.writeBinderList(_result);
return true;
}
case TRANSACTION_GetApInterfaces:
{
data.enforceInterface(descriptor);
java.util.List<android.os.IBinder> _result = this.GetApInterfaces();
reply.writeNoException();
reply.writeBinderList(_result);
return true;
}
case TRANSACTION_getAvailable2gChannels:
{
data.enforceInterface(descriptor);
int[] _result = this.getAvailable2gChannels();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getAvailable5gNonDFSChannels:
{
data.enforceInterface(descriptor);
int[] _result = this.getAvailable5gNonDFSChannels();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getAvailableDFSChannels:
{
data.enforceInterface(descriptor);
int[] _result = this.getAvailableDFSChannels();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_enableSupplicant:
{
data.enforceInterface(descriptor);
boolean _result = this.enableSupplicant();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableSupplicant:
{
data.enforceInterface(descriptor);
boolean _result = this.disableSupplicant();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_RegisterCallback:
{
data.enforceInterface(descriptor);
android.net.wifi.IInterfaceEventCallback _arg0;
_arg0 = android.net.wifi.IInterfaceEventCallback.Stub.asInterface(data.readStrongBinder());
this.RegisterCallback(_arg0);
return true;
}
case TRANSACTION_UnregisterCallback:
{
data.enforceInterface(descriptor);
android.net.wifi.IInterfaceEventCallback _arg0;
_arg0 = android.net.wifi.IInterfaceEventCallback.Stub.asInterface(data.readStrongBinder());
this.UnregisterCallback(_arg0);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.net.wifi.IWificond
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
@Override public android.net.wifi.IApInterface createApInterface(java.lang.String iface_name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.IApInterface _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface_name);
mRemote.transact(Stub.TRANSACTION_createApInterface, _data, _reply, 0);
_reply.readException();
_result = android.net.wifi.IApInterface.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.net.wifi.IClientInterface createClientInterface(java.lang.String iface_name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.wifi.IClientInterface _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface_name);
mRemote.transact(Stub.TRANSACTION_createClientInterface, _data, _reply, 0);
_reply.readException();
_result = android.net.wifi.IClientInterface.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Remove a previously created AP network interface.

@Override public boolean tearDownApInterface(java.lang.String iface_name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface_name);
mRemote.transact(Stub.TRANSACTION_tearDownApInterface, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Remove a previously created STA network interface.

@Override public boolean tearDownClientInterface(java.lang.String iface_name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(iface_name);
mRemote.transact(Stub.TRANSACTION_tearDownClientInterface, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Tear down all existing interfaces.  This should enable clients to create
// future interfaces immediately after this method returns.

@Override public void tearDownInterfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_tearDownInterfaces, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// @return list of the currently configured IClientInterface instances.

@Override public java.util.List<android.os.IBinder> GetClientInterfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.os.IBinder> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_GetClientInterfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createBinderArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// @return list of the currently configured IApInterface instances.

@Override public java.util.List<android.os.IBinder> GetApInterfaces() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.os.IBinder> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_GetApInterfaces, _data, _reply, 0);
_reply.readException();
_result = _reply.createBinderArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getAvailable2gChannels() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAvailable2gChannels, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getAvailable5gNonDFSChannels() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAvailable5gNonDFSChannels, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] getAvailableDFSChannels() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAvailableDFSChannels, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Enable wpa_supplicant.
// Returns true if supplicant was successfully enabled,
// or is already enabled.

@Override public boolean enableSupplicant() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enableSupplicant, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Disable wpa_supplicant.
// Returns true if supplicant was successfully disabled,
// or is already disabled.

@Override public boolean disableSupplicant() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disableSupplicant, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Register a callback to receive interface status updates.
//
// Multiple callbacks can be registered simultaneously.
// Duplicate registrations of the same callback will be ignored.
//
// @param callback object to add to the set of registered callbacks.

@Override public void RegisterCallback(android.net.wifi.IInterfaceEventCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_RegisterCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Remove a callback from the set of registered callbacks.
//
// This must be the same instance as previously registered.
// Requests to remove unknown callbacks will be ignored.
//
// @param callback object to remove from the set of registered callbacks.

@Override public void UnregisterCallback(android.net.wifi.IInterfaceEventCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_UnregisterCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_createApInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_createClientInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_tearDownApInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_tearDownClientInterface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_tearDownInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_GetClientInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_GetApInterfaces = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getAvailable2gChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getAvailable5gNonDFSChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getAvailableDFSChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_enableSupplicant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_disableSupplicant = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_RegisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_UnregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
}
public android.net.wifi.IApInterface createApInterface(java.lang.String iface_name) throws android.os.RemoteException;
public android.net.wifi.IClientInterface createClientInterface(java.lang.String iface_name) throws android.os.RemoteException;
// Remove a previously created AP network interface.

public boolean tearDownApInterface(java.lang.String iface_name) throws android.os.RemoteException;
// Remove a previously created STA network interface.

public boolean tearDownClientInterface(java.lang.String iface_name) throws android.os.RemoteException;
// Tear down all existing interfaces.  This should enable clients to create
// future interfaces immediately after this method returns.

public void tearDownInterfaces() throws android.os.RemoteException;
// @return list of the currently configured IClientInterface instances.

public java.util.List<android.os.IBinder> GetClientInterfaces() throws android.os.RemoteException;
// @return list of the currently configured IApInterface instances.

public java.util.List<android.os.IBinder> GetApInterfaces() throws android.os.RemoteException;
public int[] getAvailable2gChannels() throws android.os.RemoteException;
public int[] getAvailable5gNonDFSChannels() throws android.os.RemoteException;
public int[] getAvailableDFSChannels() throws android.os.RemoteException;
// Enable wpa_supplicant.
// Returns true if supplicant was successfully enabled,
// or is already enabled.

public boolean enableSupplicant() throws android.os.RemoteException;
// Disable wpa_supplicant.
// Returns true if supplicant was successfully disabled,
// or is already disabled.

public boolean disableSupplicant() throws android.os.RemoteException;
// Register a callback to receive interface status updates.
//
// Multiple callbacks can be registered simultaneously.
// Duplicate registrations of the same callback will be ignored.
//
// @param callback object to add to the set of registered callbacks.

public void RegisterCallback(android.net.wifi.IInterfaceEventCallback callback) throws android.os.RemoteException;
// Remove a callback from the set of registered callbacks.
//
// This must be the same instance as previously registered.
// Requests to remove unknown callbacks will be ignored.
//
// @param callback object to remove from the set of registered callbacks.

public void UnregisterCallback(android.net.wifi.IInterfaceEventCallback callback) throws android.os.RemoteException;
}
