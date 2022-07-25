package self.day12.aExercise.one;

public class One {
    /**
     * 1. 【易】已知圆通快递可以发陆运，EMS可以发空运，顺丰快递既可以发空运、也可以发陆运。小明需要
     * 发快递，设计两个方法，分别用来发送空运和陆运
     * @param args
     */
    public static void main(String[] args) {
            Person xiaoming=new Person("小明");
            xiaoming.AirDelivery(new EMSExpress(), "书包");
            xiaoming.AirDelivery(new SFExpress(), "书包");
            xiaoming.LandDelivery(new YTOExpress(),"行李箱");
            xiaoming.LandDelivery(new SFExpress(),"行李箱");
    }
}
