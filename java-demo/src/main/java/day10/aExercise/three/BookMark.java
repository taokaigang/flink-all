package day10.aExercise.three;

/**
 * @Author 千锋大数据教学团队
 * @Company 千锋好程序员大数据
 * @Date 2020/4/2
 * @Description
 */
public class BookMark {
    private String name;    // 书签备注
    private int page;       // 书签页码

    public BookMark() {

    }
    public BookMark(String name, int page) {
        this.name = name;
        this.setPage(page);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        if (page > 0) {
            this.page = page;
        }
    }

    public int getPage() {
        return page;
    }

    public int compareTo(BookMark bookMark) {
        if (this.page > bookMark.page) {
            return 1;
        }
        else if (this.page < bookMark.page) {
            return -1;
        }
        return 0;
    }

    public String info() {
        return "书签备注：" + name + "，页码：" + page;
    }
}
