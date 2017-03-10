package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeAvailableQuickActions_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeAvailableQuickActions_element() {
  }
    
  
  /**
   * element  : contextType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo contextType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contextType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean contextType__is_set = false;

  private java.lang.String contextType;

  public java.lang.String getContextType() {
    return contextType;
  }

  

  public void setContextType(java.lang.String contextType) {
    this.contextType = contextType;
    contextType__is_set = true;
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
   
    __typeMapper.writeString(__out, contextType__typeInfo, contextType, contextType__is_set);
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
    if (__typeMapper.verifyElement(__in, contextType__typeInfo)) {
      setContextType((java.lang.String)__typeMapper.readString(__in, contextType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeAvailableQuickActions_element ");
    
    sb.append(" contextType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contextType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}