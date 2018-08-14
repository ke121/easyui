package com.itbaizhan.model;

import javax.xml.ws.Response;
import java.io.Serializable;

public class ResponseData implements Serializable {
    private Integer status ;
    private  String message ;
    private  Object data ;

    public  static ResponseData ok(String message ,  Object data){
            return new ResponseData(200 ,message,data) ;
    }

    public ResponseData(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
    public ResponseData(){

    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
