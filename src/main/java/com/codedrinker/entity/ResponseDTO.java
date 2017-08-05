package com.codedrinker.entity;

/**
 * Created by codedrinker on 23/07/2017.
 */
public class ResponseDTO {
    private int status = 200;
    private String message;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

    public static ResponseDTO ok(Object o) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setData(o);
        responseDTO.setStatus(200);
        responseDTO.setMessage("success");
        return responseDTO;
    }

    public static ResponseDTO error(String message) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(400);
        responseDTO.setMessage(message);
        return responseDTO;
    }

    public static ResponseDTO unauthorized() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(401);
        responseDTO.setMessage("unauthorized");
        return responseDTO;
    }

    public boolean isOK() {
        return this.status == 200;
    }

    public static ResponseDTO notFound() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(404);
        responseDTO.setMessage("not found");
        return responseDTO;
    }

    public static ResponseDTO exist() {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatus(302);
        responseDTO.setMessage("exist");
        return responseDTO;
    }
}
