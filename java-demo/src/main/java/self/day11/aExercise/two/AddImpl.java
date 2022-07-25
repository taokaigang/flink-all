package self.day11.aExercise.two;

public class AddImpl implements Compute {
    @Override
    public int compute(int a, int b) {
        return a+b;
    }
}

class SubImpl implements Compute{

    @Override
    public int compute(int a, int b) {
        return a-b;
    }
}

class MulImpl implements Compute{

    @Override
    public int compute(int a, int b) {
        return a*b;
    }
}

class DivImpl implements Compute{

    @Override
    public int compute(int a, int b) {
        if (b==0){
            System.out.println("分母不能为0");
            return 0;
        }else {
            return a/b;
        }
    }
}
