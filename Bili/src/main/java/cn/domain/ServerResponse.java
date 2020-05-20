package cn.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.omg.CORBA.INTERNAL;

/**
 * 封装后端返回的Json数据
 */

//保证序列化json时，如果是null的对象，key也会消失
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> {

    //状态码
    private int code;
    //数据
    private T data;
    //描述信息
    private String msg;
    //数据长度
    private Integer count;

    //setter、getter方法
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    //构造函数
    /**
     * 操作成功时，返回数据
     * @param code
     * @param data
     * @param msg
     */
    public ServerResponse(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 查询操作时，返回数据和数据长度
     * @param code
     * @param data
     * @param msg
     * @param count
     */
    public ServerResponse(int code, T data, String msg, Integer count) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.count = count;
    }

    public ServerResponse(int code) {
        this.code = code;
    }

    /**
     * 操作失败时，不返回数据
     * @param code
     * @param msg
     */
    public ServerResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //使之不在序列化结果中
    @JsonIgnore
    public boolean checkIsSuccess(){
        return this.code==ResponseCode.SUCCESS.getCode();
    }
    //泛型方法

    /**
     * 操作成功返回数据
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createBySuccess(String msg,T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data,msg);
    }

    /**
     * 查询成功返回数据
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createBySuccess(String msg,T data,Integer count){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data,msg,count);
    }

    /**
     * 返回错误信息
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ServerResponse<T> createByError(String msg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),msg);
    }

    @Override
    public String toString() {
        return "ServerResponse{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
