package designer.decoration.example;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/5/8
 * @Description 所有的装饰器的父类
 */
public abstract class AbstractDecorator implements Decorator {
    // 表示被装饰的对象
    protected Decorator decorator;
    //
    public AbstractDecorator(Decorator decorator) {
        this.decorator = decorator;
    }
}

class ShoesDecorator extends AbstractDecorator {
    public ShoesDecorator(Decorator decorator) {
        super(decorator);
    }
    @Override
    public void show() {
        this.decorator.show();
        System.out.println("穿了一双鞋");
    }
}

class TshirtDecorator extends AbstractDecorator {
    public TshirtDecorator(Decorator decorator) {
        super(decorator);
    }
    @Override
    public void show() {
        this.decorator.show();
        System.out.println("穿了一个T恤衫");
    }
}

class TrousersDecorator extends AbstractDecorator {
    public TrousersDecorator(Decorator decorator) {
        super(decorator);
    }
    @Override
    public void show() {
        this.decorator.show();
        System.out.println("穿了一条裤子");
    }
}
