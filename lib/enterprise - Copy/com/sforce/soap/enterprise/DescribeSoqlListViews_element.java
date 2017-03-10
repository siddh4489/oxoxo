package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeSoqlListViews_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeSoqlListViews_element() {
  }
    
  
  /**
   * element  : request of type {urn:enterprise.soap.sforce.com}DescribeSoqlListViewsRequest
   * java type: com.sforce.soap.enterprise.DescribeSoqlListViewsRequest
   */
  private static final com.sforce.ws.bind.TypeInfo request__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","request","urn:enterprise.soap.sforce.com","DescribeSoqlListViewsRequest",1,1,true);

  private boolean request__is_set = false;

  private com.sforce.soap.enterprise.DescribeSoqlListViewsRequest request;

  public com.sforce.soap.enterprise.DescribeSoqlListViewsRequest getRequest() {
    return request;
  }

  

  public void setRequest(com.sforce.soap.enterprise.DescribeSoqlListViewsRequest request) {
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
      setRequest((com.sforce.soap.enterprise.DescribeSoqlListViewsRequest)__typeMapper.readObject(__in, request__typeInfo, com.sforce.soap.enterprise.DescribeSoqlListViewsRequest.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSoqlListViews_element ");
    
    sb.append(" request=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(request)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}