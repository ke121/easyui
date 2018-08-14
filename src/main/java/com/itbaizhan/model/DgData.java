package com.itbaizhan.model;

import java.io.Serializable;
import java.util.List;

public class DgData implements Serializable {
    private  Integer total ;
    private List<?> rows ;

    public DgData() {
    }

    public DgData(Integer total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }


}
