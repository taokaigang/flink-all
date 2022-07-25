package self.day33.aExercise.four;

public class Adapter implements USB{
    private PS2 PS2Device;
    public Adapter(PS2 PS2Device){
        this.PS2Device=PS2Device;
    }

    @Override
    public String getUSBDeviceInfo() {
        return this.PS2Device.getPS2DeviceInfo();
    }
}
