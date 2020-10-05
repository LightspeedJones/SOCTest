/**
 * ReturnExamesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.SOCTest.service;

public class ReturnExamesServiceLocator extends org.apache.axis.client.Service implements org.SOCTest.service.ReturnExamesService {

    public ReturnExamesServiceLocator() {
    }


    public ReturnExamesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReturnExamesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReturnExames
    private java.lang.String ReturnExames_address = "http://localhost:8080/SOCTest_project/services/ReturnExames";

    public java.lang.String getReturnExamesAddress() {
        return ReturnExames_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReturnExamesWSDDServiceName = "ReturnExames";

    public java.lang.String getReturnExamesWSDDServiceName() {
        return ReturnExamesWSDDServiceName;
    }

    public void setReturnExamesWSDDServiceName(java.lang.String name) {
        ReturnExamesWSDDServiceName = name;
    }

    public org.SOCTest.service.ReturnExames getReturnExames() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReturnExames_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReturnExames(endpoint);
    }

    public org.SOCTest.service.ReturnExames getReturnExames(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.SOCTest.service.ReturnExamesSoapBindingStub _stub = new org.SOCTest.service.ReturnExamesSoapBindingStub(portAddress, this);
            _stub.setPortName(getReturnExamesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReturnExamesEndpointAddress(java.lang.String address) {
        ReturnExames_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.SOCTest.service.ReturnExames.class.isAssignableFrom(serviceEndpointInterface)) {
                org.SOCTest.service.ReturnExamesSoapBindingStub _stub = new org.SOCTest.service.ReturnExamesSoapBindingStub(new java.net.URL(ReturnExames_address), this);
                _stub.setPortName(getReturnExamesWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ReturnExames".equals(inputPortName)) {
            return getReturnExames();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.SOCTest.org", "ReturnExamesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.SOCTest.org", "ReturnExames"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReturnExames".equals(portName)) {
            setReturnExamesEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
