package com.dorjear.ralf.db.service.util;

import java.util.List;

/**
 * This class is for Pagination
 */
@SuppressWarnings("unchecked")
public class PaginationSupport {
    public final static int PAGESIZE = 10;

    private int pageSize = PAGESIZE;

    private List items;

    private int totalCount;

    private int[] indexes = new int[0];

    private int startIndex = 0;

    public PaginationSupport(List items, int totalCount) {
        setPageSize(PAGESIZE);
        setTotalCount(totalCount);
        setItems(items);
        setStartIndex(0);
    }

    public PaginationSupport(List items, int totalCount, int startIndex) {
        setPageSize(PAGESIZE);
        setTotalCount(totalCount);
        setItems(items);
        setStartIndex(startIndex);
    }

    public PaginationSupport(List items, int totalCount, int pageSize, int startIndex) {
        setPageSize(pageSize);
        setTotalCount(totalCount);
        setItems(items);
        setStartIndex(startIndex);
    }

    /**
     * get startIndex by page NO
     */
    public static int convertFromPageToStartIndex(int pageNo) {
        return (pageNo - 1) * PAGESIZE;
    }
    
    /**
     * get startIndex by page NO and page size
     */
    public static int convertFromPageToStartIndex(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    /**
     * get startIndex for each page by total data count
     */
    public void setTotalCount(int totalCount) {
        if (totalCount > 0) {
            this.totalCount = totalCount;
            int count = totalCount / pageSize;
            if (totalCount % pageSize > 0)
                count++;
            indexes = new int[count];
            for (int i = 0; i < count; i++) {
                indexes[i] = pageSize * i;
            }
        } else {
            this.totalCount = 0;
        }
    }

    public int[] getIndexes() {
        return indexes;
    }

    public void setIndexes(int[] indexes) {
        this.indexes = indexes;
    }

    public int getStartIndex() {
        return startIndex;
    }

    /**
     * set start index
     */
    public void setStartIndex(int startIndex) {
        if (totalCount <= 0)
            this.startIndex = 0;
        else if (startIndex >= totalCount)
            this.startIndex = indexes[indexes.length - 1];
        else if (startIndex < 0)
            this.startIndex = 0;
        else {
            this.startIndex = indexes[startIndex / pageSize];
        }
    }

    /**
     * get start index of next page
     */
    public int getNextIndex() {
        int nextIndex = getStartIndex() + pageSize;
        if (nextIndex >= totalCount)
            return getStartIndex();
        else
            return nextIndex;
    }

    /**
     * get start index of previous page
     */
    public int getPreviousIndex() {
        int previousIndex = getStartIndex() - pageSize;
        if (previousIndex < 0)
            return 0;
        else
            return previousIndex;
    }

    /**
     * get total page count
     */
    public long getTotalPageCount() {
        if (totalCount % pageSize == 0)
            return totalCount / pageSize;
        else
            return totalCount / pageSize + 1;
    }

    /**
     * get current page No, which starts from 1
     */
    public long getCurrentPageNo() {
        return startIndex / pageSize + 1;
    }

    /**
     * if current page has next page
     */
    public boolean hasNextPage() {
        return this.getCurrentPageNo() < this.getTotalPageCount() - 1;
    }

    /**
     * if current page has previous page
     */
    public boolean hasPreviousPage() {
        return this.getCurrentPageNo() > 1;
    }
}
