package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ExecuteListView_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ExecuteListView_element() {
  }
    
  
  /**
   * element  : request of type {urn:enterprise.soap.sforce.com}ExecuteListViewRequest
   * java type: com.sforce.soap.enterprise.ExecuteListViewRequest
   */
  private static final com.sforce.ws.bind.TypeInfo request__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","request","urn:enterprise.soap.sforce.com","ExecuteListViewRequest",1,1,true);

  private boolean request__is_set = false;

  private com.sforce.soap.enterprise.ExecuteListViewRequest request;

  public com.sforce.soap.enterprise.ExecuteListViewRequest getRequest() {
    return request;
  }

  

  public void setRequest(com.sforce.soap.enterprise.ExecuteListViewRequest request) {
    this.request = request;
    request__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeObject(__out, request__typeInfo, request, request__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, request__typeInfo)) {
      setRequest((com.sforce.soap.enterprise.ExecuteListViewRequest)__typeMapper.readObject(__in, request__typeInfo, com.sforce.soap.enterprise.ExecuteListViewRequest.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ExecuteListView_element ");
    
    sb.append(" request=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(request)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}