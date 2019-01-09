/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/opt/net/wifi/service/../../../../../system/connectivity/wificond/aidl/android/net/wifi/IApInterfaceEventCallback.aidl
 */
package android.net.wifi;
// A callback for receiving events related to soft AP.

public interface IApInterfaceEventCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.IApInterfaceEventCallback
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.IApInterfaceEventCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.IApInterfaceEventCallback interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.IApInterfaceEventCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.IApInterfaceEventCallback))) {
return ((android.net.wifi.IApInterfaceEventCallback)iin);
}
return new android.net.wifi.IApInterfaceEventCallback.Stub.Proxy(obj);
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
case TRANSACTION_onNumAssociatedStationsChanged:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.onNumAssociatedStationsChanged(_arg0);
return true;
}
case TRANSACTION_onSoftApChannelSwitched:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onSoftApChannelSwitched(_arg0, _arg1);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements android.net.wifi.IApInterfaceEventCallback
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
// Signals that number of stations associated to this soft Ap has changed.
//
// @param numStations Number of associated stations after change

@Override public void onNumAssociatedStationsChanged(int numStations) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(numStations);
mRemote.transact(Stub.TRANSACTION_onNumAssociatedStationsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Signals a channel switch event for this soft Ap.
//
// @param frequency Represents the frequency of the channel in MHz
// @param bandwidth Bandwidth of the channel, one of the values from |BANDWIDTH_*|

@Override public void onSoftApChannelSwitched(int frequency, int bandwidth) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(frequency);
_data.writeInt(bandwidth);
mRemote.transact(Stub.TRANSACTION_onSoftApChannelSwitched, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onNumAssociatedStationsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSoftApChannelSwitched = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public static final int BANDWIDTH_INVALID = 0;
public static final int BANDWIDTH_20_NOHT = 1;
public static final int BANDWIDTH_20 = 2;
public static final int BANDWIDTH_40 = 3;
public static final int BANDWIDTH_80 = 4;
public static final int BANDWIDTH_80P80 = 5;
public static final int BANDWIDTH_160 = 6;
// Signals that number of stations associated to this soft Ap has changed.
//
// @param numStations Number of associated stations after change

public void onNumAssociatedStationsChanged(int numStations) throws android.os.RemoteException;
// Signals a channel switch event for this soft Ap.
//
// @param frequency Represents the frequency of the channel in MHz
// @param bandwidth Bandwidth of the channel, one of the values from |BANDWIDTH_*|

public void onSoftApChannelSwitched(int frequency, int bandwidth) throws android.os.RemoteException;
}
