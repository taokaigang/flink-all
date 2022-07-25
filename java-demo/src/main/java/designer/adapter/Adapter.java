package designer.adapter;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 实现了 USB-Lighting 的转换
 */
public class Adapter implements USB {
    // 需要在这个类的内部维护一个Lighting接口的引用
    // 维护一个需要进行接口转换的对象
    private Lighting lightingDevice;
    // 实例化适配器对象的时候，已经完成了内部的属性的赋值
    public Adapter(Lighting lightingDevice) {
        this.lightingDevice = lightingDevice;
    }

    // 这个方法，是USB接口中的方法，目的是需要向电脑汇报自己的设备信息
    // 但是此时，需要汇报给电脑的并不是这个适配器的信息，而是这个适配器连接的Lighting设备的信息
    // 适配器只是一个中间件，完成了由Lighting到USB的接口转换
    @Override
    public String getUSBDeviceInfo() {
        // 询问Lighting设备的信息，并且将结果直接汇报给电脑即可
        return this.lightingDevice.getLightingDeviceInfo();
    }
}
