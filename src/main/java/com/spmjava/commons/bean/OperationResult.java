package com.spmjava.commons.bean;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;

/**
 * @author 齐伟超
 * @date 2018-02-25 15:52
 * @since 1.0.0
 **/
public class OperationResult<T> implements Serializable {
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

    public OperationResult() {
    }

    public enum OperationResultCode {
        /**
         * 成功
         */
        SUCCESS("1"),
        /**
         * 失败
         */
        FAIL("2");

        private String value;

         OperationResultCode(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        /**
         * 返回操作
         */
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
}
