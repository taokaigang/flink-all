package day12.cInterfaceTest.two;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/7
 * @Description
 */
class PersonComparatorImplAge implements PersonComparator {
    // 可以在这里定制两个Person对象进行大小比较的规则
    @Override
    public int compare(Person person1, Person person2) {
        return person1.age - person2.age;
    }
}

class PersonComparatorImplHeight implements PersonComparator {
    // 可以在这里定制两个Person对象进行大小比较的规则
    @Override
    public int compare(Person person1, Person person2) {
        return person1.height - person2.height;
    }
}

class PersonComparatorImplWeight implements PersonComparator {
    // 可以在这里定制两个Person对象进行大小比较的规则
    @Override
    public int compare(Person person1, Person person2) {
        return person1.weight - person2.weight;
    }
}
