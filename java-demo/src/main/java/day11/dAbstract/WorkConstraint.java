package day11.dAbstract;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/3
 * @Description  劳动合同
 */
public abstract class WorkConstraint {
    public abstract void work();
    public abstract void pay();
}

class Worker extends WorkConstraint {

    @Override
    public void work() {

    }

    @Override
    public void pay() {

    }
}
