
package com.omgm.speedy.eps.soap.model;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "InvalidSessionException", targetNamespace = "http://ver01.eps.speedy.sirma.com/")
public class InvalidSessionException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidSessionException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public InvalidSessionException_Exception(String message, InvalidSessionException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public InvalidSessionException_Exception(String message, InvalidSessionException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.omgm.speedy.eps.soap.model.InvalidSessionException
     */
    public InvalidSessionException getFaultInfo() {
        return faultInfo;
    }

}
