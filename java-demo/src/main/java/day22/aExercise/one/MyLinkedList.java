package day22.aExercise.one;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/21
 * @Description 使用链表数据结构实现一个自定义的集合(模拟LinkedList)
 */
public class MyLinkedList<E> {
    // 链表中，元素是以节点的形式存储的
    // 内部类，表示一个节点
    private class Node {
        E element;      // 表示这个节点需要存储的元素
        Node previous;  // 上一个节点的地址
        Node next;      // 下一个节点的地址
        Node(E element) {
            this.element = element;
        }
    }

    private Node first;     // 描述链表中的首节点
    private Node last;      // 描述链表中的尾结点
    private int count;      // 描述链表中节点数量

    /**
     * 在当前集合中添加一个元素
     * @param element 要添加的元素
     */
    public void add(E element) {
        // 1. 实例化一个节点，用来存储这个节点要存储的元素
        Node node = new Node(element);
        // 2. 判断当前的链表是否是空链表
        if (count == 0) {
            // 说明当前链表是一个空链表
            this.first = node;
        }
        else {
            // 说明当前链表不是一个空链表
            // 需要把当前节点挂在尾结点的后面
            this.last.next = node;
            node.previous = this.last;
        }
        this.last = node;   // 新增的这个节点，就是当前链表中的新的尾结点
        count++;            // 节点数量+1
    }

    /**
     * 在链表中，指定的下标位置插入一个元素
     * @param index 指定的下标位
     * @param element 需要插入的元素
     */
    public void add(int index, E element) {
        // 1. 实例化一个新的节点
        Node node = new Node(element);
        // 2. 节点关联
        if (index == 0) {
            // 说明在首位插入一个新的节点
            this.first.previous = node;
            node.next = this.first;
            // 这个节点就是新的首节点
            this.first = node;
        }
        else if (index == count) {
            // 说明在尾结点插入一个新的节点
            this.last.next = node;
            node.previous = this.last;
            // 这个新的节点就是新的尾结点
            this.last = node;
        }
        else {
            // 说明在中间节点插入一个元素
            // 1. 获取指定下标的节点
            Node target = getNode(index);
            // 节点关联
            node.next = target;
            node.previous = target.previous;
            target.previous.next = node;
            // 这个节点设置需要在后面
            target.previous = node;
        }
        count++;
    }

    /**
     * 删除指定下标位的元素
     * @param index 指定的下标位
     * @return 刚刚被删除的元素
     */
    public E remove(int index) {
        // 1. 获取需要被删除的这个节点
        Node node = getNode(index);
        // 2. 删除节点
        removeNode(node);

        return node.element;
    }

    /**
     * 删除一个节点
     * @param node 需要被删除的节点
     */
    private void removeNode(Node node) {
        // 当一个链表中有且只有一个节点的情况
        if (count == 1) {
            this.first = null;
            this.last = null;
            count--;
            return;
        }
        // 判断是否删除的是首节点
        if (node == this.first) {
            this.first = this.first.next;       // 设置新的首节点
            // 取消新的首节点与上一个节点的关联
            this.first.previous.next = null;
            this.first.previous = null;
        }
        else if (node == this.last) {
            // 设置新的尾结点
            this.last = this.last.previous;
            // 取消新的尾结点与下一个节点的关联
            this.last.next.previous = null;
            this.last.next = null;
        }
        else {
            // 删除的是中间节点
            node.previous.next = node.next;
            node.next.previous = node.previous;
            node.previous = null;
            node.next = null;
        }
        count--;
    }

    /**
     * 通过下标获取指定的节点
     * @param index 指定的下标
     * @return 下标对应的节点
     */
    private Node getNode(int index) {
        // 1. 判断下标的合法性
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("size() = " + count + ", index = " + index);
        }
        // 2. 循环向下查找指定的节点
        Node node = this.first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    /**
     * 删除链表中指定的元素
     * @param element 要删除的元素
     * @return 删除的结果(是否删除，如果删除了数据，返回true)
     */
    public boolean remove(E element) {
        // 1. 通过元素获取指定的节点
        Node node = getNode(element);
        // 2. 判断这个节点是否存在
        if (node == null) {
            // 说明这个节点不存在
            return false;
        }
        // 3. 删除节点
        removeNode(node);
        return true;
    }

    /**
     * 通过元素获取节点
     * @param element 元素
     * @return 节点
     */
    private Node getNode(E element) {
        Node node = this.first;
        while (node != null) {
            if (node.element.equals(element)) {
                return node;
            }
            node = node.next;
        }
        // 如果找不到这个元素
        return null;
    }

    /**
     * 清空链表中的所有的数据
     */
    public void clear() {
        this.first = null;
        this.last = null;
        count = 0;
    }

    /**
     * 将链表中指定下标位的元素，修改成新的元素
     * @param index 要修改元素的下标
     * @param element 新的元素
     * @return 被覆盖的，修改之前的数据
     */
    public E set(int index, E element) {
        // 1. 通过下标获取指定的节点
        Node node = getNode(index);
        // 2. 备份一次原来的元素
        E ele = node.element;
        // 3. 设置这个节点新的元素
        node.element = element;
        // 4. 返回覆盖之前的数据
        return ele;
    }

    /**
     * 获取链表中指定下标位的元素
     * @param index 下标位
     * @return 指定的元素
     */
    public E get(int index) {
        // 1. 获取指定的节点
        Node node = getNode(index);
        // 2. 返回这个节点的数据
        return node.element;
    }

    public int size() {
        return count;
    }

    /**
     * 判断一个链表中是否包含指定的元素
     * @param element 查询的元素
     * @return 是否包含
     */
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    /**
     * 查询链表中某一个元素第一次出现的下标
     * @param element 查询的元素
     * @return 下标
     */
    public int indexOf(E element) {
        // 从首节点开始，遍历每一个元素
        Node node = this.first;
        for (int i = 0; i < count; i++) {
            // 判断当前遍历的这个节点，是否是要查询的节点
            if (node.element.equals(element)) {
                return i;
            }
            // 遍历下一个节点
            node = node.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        if (count == 0) {
            return "[]";
        }

        // 1. 实例化一个StringBuilder进行字符串的拼接
        StringBuilder stringBuilder = new StringBuilder("[");
        // 2. 遍历每一个节点
        Node node = this.first;
        for (int i = 0; i < count; i++) {
            // 元素的拼接
            stringBuilder.append(node.element).append(", ");
            // 节点向后指向
            node = node.next;
        }
        // 3. 将最后两位替换成 ]
        stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "]");

        return stringBuilder.toString();
    }
}
