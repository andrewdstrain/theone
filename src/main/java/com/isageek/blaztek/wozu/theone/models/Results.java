package com.isageek.blaztek.wozu.theone.models;

public class Results {
    private Character[] docs;
    private Integer total;
    private Integer limit;
    private Integer offset;
    private Integer page;
    private Integer pages;

    public Results(Character[] docs, Integer total, Integer limit, Integer offset, Integer page, Integer pages) {
        this.docs = docs;
        this.total = total;
        this.limit = limit;
        this.offset = offset;
        this.page = page;
        this.pages = pages;
    }

    public Results() {}

    public Character[] getDocs() {
        return docs;
    }

    public void setDocs(Character[] docs) {
        this.docs = docs;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
