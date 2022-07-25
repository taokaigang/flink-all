package self.day33.aExercise.four;

public class Four {
    /**
     * 4. 一个采用了PS2接口的鼠标，通过一个PS2转USB的转接器，连接到了电脑的USB接口上。
     * @param args
     */
    public static void main(String[] args) {
        Computer computer=new Computer();

        Mouse mouse = new Mouse();

        computer.setUsb1(new Adapter(mouse));

        computer.showDeviceInfo();
    }
}
