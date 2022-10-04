package cn.nwnu.pojo;

/**
 * @author TurnHug
 * @date 2022/10/3 9:30
 */
public class Result {
    private Object data;
    private Integer code;


    public Result(Object data) {
        this.data = data;
    }

    public Result(int code){
        this.code =code;
    }

    public Result(Object data, int code) {
        this.data = data;
        this.code = code;

    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


}
