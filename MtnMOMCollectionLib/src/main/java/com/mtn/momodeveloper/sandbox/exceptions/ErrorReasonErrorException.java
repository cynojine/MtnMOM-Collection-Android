/*
 * MtnMOMCollectionLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.mtn.momodeveloper.sandbox.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.mtn.momodeveloper.sandbox.http.client.HttpContext;
import com.mtn.momodeveloper.sandbox.models.*;

public class ErrorReasonErrorException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 8613657445376351405L;
    private CodeEnum code;
    private String message;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("code")
    public CodeEnum getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    private void setCode (CodeEnum value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("message")
    private void setMessage (String value) { 
        this.message = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public ErrorReasonErrorException(String reason, HttpContext context) {
        super(reason, context);
    }
}
