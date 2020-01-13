package club.banyuan.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class PageInfo {

    @NotNull
    @Min(1)
    private int page;
    @NotNull
    @Min(10)
    private int size;


    public PageInfo(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
