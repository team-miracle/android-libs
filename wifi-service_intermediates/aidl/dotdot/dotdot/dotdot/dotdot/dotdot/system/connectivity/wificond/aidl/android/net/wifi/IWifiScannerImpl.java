/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IWifiScannerImpl.aidl
 */
package android.net.wifi;
public interface IWifiScannerImpl extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IWifiScannerImpl
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IWifiScannerImpl";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IWifiScannerImpl interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IWifiScannerImpl asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IWifiScannerImpl))) {
return ((android.net.wifi.IWifiScannerImpl)iin);
}
return new android.net.wifi.IWifiScannerImpl.Stub.Proxy(obj);
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
case TRANSACTION_getScanResults:
{
data.enforceInterface(descriptor);
com.android.server.wifi.wificond.NativeScanResult[] _result = this.getScanResults();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getPnoScanResults:
{
data.enforceInterface(descriptor);
com.android.server.wifi.wificond.NativeScanResult[] _result = this.getPnoScanResults();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_scan:
{
data.enforceInterface(descriptor);
com.android.server.wifi.wificond.SingleScanSettings _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.server.wifi.wificond.SingleScanSettings.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.scan(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_subscribeScanEvents:
{
data.enforceInterface(descriptor);
android.net.wifi.IScanEvent _arg0;
_arg0 = android.net.wifi.IScanEvent.Stub.asInterface(data.readStrongBinder());
this.subscribeScanEvents(_arg0);
return true;
}
case TRANSACTION_unsubscribeScanEvents:
{
data.enforceInterface(descriptor);
this.unsubscribeScanEvents();
return true;
}
case TRANSACTION_subscribePnoScanEvents:
{
data.enforceInterface(descriptor);
android.net.wifi.IPnoScanEvent _arg0;
_arg0 = android.net.wifi.IPnoScanEvent.Stub.asInterface(data.readStrongBinder());
this.subscribePnoScanEvents(_arg0);
return true;
}
case TRANSACTION_unsubscribePnoScanEvents:
{
data.enforceInterface(descriptor);
this.unsubscribePnoScanEvents();
return true;
}
case TRANSACTION_startPnoScan:
{
data.enforceInterface(descriptor);
com.android.server.wifi.wificond.PnoSettings _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.server.wifi.wificond.PnoSettings.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.startPnoScan(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopPnoScan:
{
data.enforceInterface(descriptor);
boolean _result = this.stopPnoScan();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_abortScan:
{
data.enforceInterface(descriptor);
this.abortScan();
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.net.wifi.IWifiScannerImpl
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
// Get the latest single scan results from kernel.

@Override public com.android.server.wifi.wificond.NativeScanResult[] getScanResults() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.server.wifi.wificond.NativeScanResult[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getScanResults, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(com.android.server.wifi.wificond.NativeScanResult.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get the latest pno scan results from the interface which has most recently
// completed disconnected mode PNO scans

@Override public com.android.server.wifi.wificond.NativeScanResult[] getPnoScanResults() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.server.wifi.wificond.NativeScanResult[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPnoScanResults, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(com.android.server.wifi.wificond.NativeScanResult.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Request a single scan using a SingleScanSettings parcelable object.

@Override public boolean scan(com.android.server.wifi.wificond.SingleScanSettings scanSettings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((scanSettings!=null)) {
_data.writeInt(1);
scanSettings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_scan, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Subscribe single scanning events.
// Scanner assumes there is only one subscriber.
// This call will replace any existing |handler|.

@Override public void subscribeScanEvents(android.net.wifi.IScanEvent handler) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((handler!=null))?(handler.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_subscribeScanEvents, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Unsubscribe single scanning events .

@Override public void unsubscribeScanEvents() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_unsubscribeScanEvents, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Subscribe Pno scanning events.
// Scanner assumes there is only one subscriber.
// This call will replace any existing |handler|.

@Override public void subscribePnoScanEvents(android.net.wifi.IPnoScanEvent handler) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((handler!=null))?(handler.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_subscribePnoScanEvents, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Unsubscribe Pno scanning events .

@Override public void unsubscribePnoScanEvents() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_unsubscribePnoScanEvents, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Request a scheduled scan.

@Override public boolean startPnoScan(com.android.server.wifi.wificond.PnoSettings pnoSettings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((pnoSettings!=null)) {
_data.writeInt(1);
pnoSettings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startPnoScan, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Stop any existing scheduled scan.
// Returns true on success.
// Returns false on failure or there is no existing scheduled scan.

@Override public boolean stopPnoScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopPnoScan, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Abort ongoing scan.

@Override public void abortScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_abortScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getScanResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPnoScanResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_scan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_subscribeScanEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unsubscribeScanEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_subscribePnoScanEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_unsubscribePnoScanEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_startPnoScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_stopPnoScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_abortScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public static final int SCAN_TYPE_LOW_SPAN = 0;
public static final int SCAN_TYPE_LOW_POWER = 1;
public static final int SCAN_TYPE_HIGH_ACCURACY = 2;
public static final int SCAN_TYPE_DEFAULT = -1;
// Get the latest single scan results from kernel.

public com.android.server.wifi.wificond.NativeScanResult[] getScanResults() throws android.os.RemoteException;
// Get the latest pno scan results from the interface which has most recently
// completed disconnected mode PNO scans

public com.android.server.wifi.wificond.NativeScanResult[] getPnoScanResults() throws android.os.RemoteException;
// Request a single scan using a SingleScanSettings parcelable object.

public boolean scan(com.android.server.wifi.wificond.SingleScanSettings scanSettings) throws android.os.RemoteException;
// Subscribe single scanning events.
// Scanner assumes there is only one subscriber.
// This call will replace any existing |handler|.

public void subscribeScanEvents(android.net.wifi.IScanEvent handler) throws android.os.RemoteException;
// Unsubscribe single scanning events .

public void unsubscribeScanEvents() throws android.os.RemoteException;
// Subscribe Pno scanning events.
// Scanner assumes there is only one subscriber.
// This call will replace any existing |handler|.

public void subscribePnoScanEvents(android.net.wifi.IPnoScanEvent handler) throws android.os.RemoteException;
// Unsubscribe Pno scanning events .

public void unsubscribePnoScanEvents() throws android.os.RemoteException;
// Request a scheduled scan.

public boolean startPnoScan(com.android.server.wifi.wificond.PnoSettings pnoSettings) throws android.os.RemoteException;
// Stop any existing scheduled scan.
// Returns true on success.
// Returns false on failure or there is no existing scheduled scan.

public boolean stopPnoScan() throws android.os.RemoteException;
// Abort ongoing scan.

public void abortScan() throws android.os.RemoteException;
}
