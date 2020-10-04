package org.SOCTest.service;

public class ReturnExamesProxy implements org.SOCTest.service.ReturnExames {
  private String _endpoint = null;
  private org.SOCTest.service.ReturnExames returnExames = null;
  
  public ReturnExamesProxy() {
    _initReturnExamesProxy();
  }
  
  public ReturnExamesProxy(String endpoint) {
    _endpoint = endpoint;
    _initReturnExamesProxy();
  }
  
  private void _initReturnExamesProxy() {
    try {
      returnExames = (new org.SOCTest.service.ReturnExamesServiceLocator()).getReturnExames();
      if (returnExames != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)returnExames)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)returnExames)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (returnExames != null)
      ((javax.xml.rpc.Stub)returnExames)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.SOCTest.service.ReturnExames getReturnExames() {
    if (returnExames == null)
      _initReturnExamesProxy();
    return returnExames;
  }
  
  public java.lang.String returnData(int id) throws java.rmi.RemoteException{
    if (returnExames == null)
      _initReturnExamesProxy();
    return returnExames.returnData(id);
  }
  
  
}