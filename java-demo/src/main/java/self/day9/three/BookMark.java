package self.day9.three;

public class BookMark {
    private String name;
    private int age;
    private int page;

    public BookMark() {
    }

    public BookMark(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getPage() {//灰色？
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int compareTo(BookMark bookMark){

        if (this.page>bookMark.page){
            return 1;
        }else if (this.page==bookMark.page){
            return 0;
        }else {
            return -1;
        }

    }


}
