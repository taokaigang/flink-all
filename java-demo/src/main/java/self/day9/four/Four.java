package self.day9.four;

public class Four {
    /**
     * 4. 在一个数组中，存储了5个书签（BookMark，直接使用上一题的类即可）。输出所有的页码范围在[20,
     * 50]范围内的书签，输出格式如下     书签备注：三打白骨精，页码：10
     * @param args
     */
    public static void main(String[] args) {
        /*BookMark[] bookMarks=new BookMark[5];

        String[] names={"三打白骨精","孙行者大脑五庄观","女儿国","真假孙悟空","魔主"};
        int[] pages={10,25,54,27,85};

        for (int i = 0; i < bookMarks.length; i++) {
            bookMarks[i]=new BookMark();
            bookMarks[i].setName(names[i]);
            bookMarks[i].setPage(pages[i]);
        }*/

        BookMark[] bookMarks={
                new BookMark("四圣",15),
                new BookMark("s圣",110),
                new BookMark("d圣",10),
                new BookMark("d圣",25),
                new BookMark("d圣",35)

        };

        for (int i = 0; i < bookMarks.length; i++) {
            if (bookMarks[i].getPage()>=20 && bookMarks[i].getPage()<=50){
                System.out.println("书签备注："+bookMarks[i].getName()+"，页码："+bookMarks[i].getPage());
            }
        }

    }
}
