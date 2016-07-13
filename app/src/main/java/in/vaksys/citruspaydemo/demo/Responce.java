package in.vaksys.citruspaydemo.demo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Harsh on 12-07-2016.
 */
public class Responce {

    /**
     * error_id : 0
     * error_category : application
     * error_description : Invalid user
     * auth_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhY2Nlc3Nfa2V5IjoiYWJoaWplZXQiLCJleHBpcmVzIjoiMjAxNS0wNy0yN1QxMzoxNjo0Mi45NjRaIiwiYWRtaW5fZ3JhbnQiOnRydWV9.xoUYe6G0LDODL12FzGIEmXG2SIKVO03fJ3PEk5FAMnc
     */

    @SerializedName("error_id")
    private String errorId;
    @SerializedName("error_category")
    private String errorCategory;
    @SerializedName("error_description")
    private String errorDescription;
    @SerializedName("auth_token")
    private String authToken;
    /**
     * sellerid : 454
     */

    @SerializedName("sellerid")
    private int sellerid;
    /**
     * property : instance.active
     * message : is not of a type(s) number
     * schema : {"type":"number","required":true,"enum":[0,1]}
     * instance : 1
     * stack : instance.active is not of a type(s) number
     */

    @SerializedName("property")
    private String property;
    @SerializedName("message")
    private String message;
    /**
     * type : number
     * required : true
     * enum : [0,1]
     */

    @SerializedName("schema")
    private SchemaEntity schema;
    @SerializedName("instance")
    private String instance;
    @SerializedName("stack")
    private String stack;

    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public String getErrorCategory() {
        return errorCategory;
    }

    public void setErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SchemaEntity getSchema() {
        return schema;
    }

    public void setSchema(SchemaEntity schema) {
        this.schema = schema;
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public static class SchemaEntity {
        @SerializedName("type")
        private String type;
        @SerializedName("required")
        private boolean required;
        @SerializedName("enum")
        private List<Integer> enumX;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isRequired() {
            return required;
        }

        public void setRequired(boolean required) {
            this.required = required;
        }

        public List<Integer> getEnumX() {
            return enumX;
        }

        public void setEnumX(List<Integer> enumX) {
            this.enumX = enumX;
        }
    }
}
