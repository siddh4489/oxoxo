package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeVisualForceResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeVisualForceResult() {
  }
    
  
  /**
   * element  : domain of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo domain__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","domain","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean domain__is_set = false;

  private java.lang.String domain;

  public java.lang.String getDomain() {
    return domain;
  }

  

  public void setDomain(java.lang.String domain) {
    this.domain = domain;
    domain__is_set = true;
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
   
    __typeMapper.writeString(__out, domain__typeInfo, domain, domain__is_set);
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
    if (__typeMapper.verifyElement(__in, domain__typeInfo)) {
      setDomain((java.lang.String)__typeMapper.readString(__in, domain__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeVisualForceResult ");
    
    sb.append(" domain=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(domain)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}