package com.spmjava.commons;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;

/**
 * @author qi-wei-chao
 * @description: 各个操作的结果返回
 * @date 2017-12-07 10:29
 * @since 1.0.0
 **/
public class OperationResult<T> implements Serializable {

    public OperationResult() {
    }

     public static enum OperationResultCode {
        /**成功*/
        SUCCESS("1"),
        /**失败*/
        FAIL("0");

        private String value;

        private OperationResultCode(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        /**
         * 解析操作编码
         *
         * @param value
         */
        public static OperationResultCode resolve(String value) {
            switch (value) {
                case "1":
                    return SUCCESS;

                case "2":
                    return FAIL;

                default:
                    return null;
            }
        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }

        public String getCodeValue() {
            switch (this.value) {
                case "1":
                    return "SUCCESS";

                case "2":
                    return "FAIL";

                default:
                    return null;
            }
        }
    }

    private static final long serialVersionUID = 1L;

    /**
     * 操作结果
     */
    private OperationResultCode code;

    /**
     * 操作相关描述
     */
    private String description;

    /**
     * 返回的结果数据
     */
    private T data;

    /**
     * pagination相关信息
     */
    private PageInfo<?> page;



    /**
     * 使用属性域构造对象
     *
     * @param code        操作结果码
     * @param description 结果描述
     * @param data        具体数据
     */
    public OperationResult(OperationResultCode code, String description, T data) {
        super();
        this.code = code;
        this.description = description;
        this.data = data;
    }

    /**
     * 使用异常信息创建对象
     *
     * @param e
     */
    public OperationResult(Exception e) {
        super();
        this.code = OperationResultCode.FAIL;
        this.description = e.getMessage();
    }

    public OperationResultCode getCode() {
        return code;
    }

    public void setCode(OperationResultCode code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public PageInfo<?> getPage() {
        return page;
    }

    public void setPage(PageInfo<?> page) {
        this.page = page;
    }

    /**
     * 设置错误信息和错误码
     *
     * @param description 错误信息
     */
    public void fail(String description) {
        this.description = description;
        this.code = OperationResultCode.FAIL;
    }
}
