package android.hardware.hdmi;
public abstract class HdmiClient
{
HdmiClient() { throw new RuntimeException("Stub!"); }
public  android.hardware.hdmi.HdmiDeviceInfo getActiveSource() { throw new RuntimeException("Stub!"); }
public  void sendKeyEvent(int keyCode, boolean isPressed) { throw new RuntimeException("Stub!"); }
public  void sendVendorCommand(int targetAddress, byte[] params, boolean hasVendorId) { throw new RuntimeException("Stub!"); }
public  void setVendorCommandListener(android.hardware.hdmi.HdmiControlManager.VendorCommandListener listener) { throw new RuntimeException("Stub!"); }
}
