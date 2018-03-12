package com.ppdai.framework.raptor.codegen.core.swagger.type;

/**
 * Created by zhangyicong on 18-2-27.
 */
public class MethodType {
    private String name;
    private String FQPN;
    private String inputType;
    private String outputType;
    private String leadingComments;
    private String trailingComments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFQPN() {
        return FQPN;
    }

    public void setFQPN(String FQPN) {
        this.FQPN = FQPN;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    public String getLeadingComments() {
        return leadingComments;
    }

    public void setLeadingComments(String leadingComments) {
        this.leadingComments = leadingComments;
    }

    public String getTrailingComments() {
        return trailingComments;
    }

    public void setTrailingComments(String trailingComments) {
        this.trailingComments = trailingComments;
    }
}