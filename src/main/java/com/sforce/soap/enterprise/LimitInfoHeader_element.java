package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class LimitInfoHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public LimitInfoHeader_element() {
  }
    
  
  /**
   * element  : limitInfo of type {urn:enterprise.soap.sforce.com}LimitInfo
   * java type: com.sforce.soap.enterprise.LimitInfo[]
   */
  private static final com.sforce.ws.bind.TypeInfo limitInfo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","limitInfo","urn:enterprise.soap.sforce.com","LimitInfo",0,-1,true);

  private boolean limitInfo__is_set = false;

  private com.sforce.soap.enterprise.LimitInfo[] limitInfo = new com.sforce.soap.enterprise.LimitInfo[0];

  public com.sforce.soap.enterprise.LimitInfo[] getLimitInfo() {
    return limitInfo;
  }

  

  public void setLimitInfo(com.sforce.soap.enterprise.LimitInfo[] limitInfo) {
    this.limitInfo = limitInfo;
    limitInfo__is_set = true;
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
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, limitInfo__typeInfo, limitInfo, limitInfo__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, limitInfo__typeInfo)) {
      setLimitInfo((com.sforce.soap.enterprise.LimitInfo[])__typeMapper.readObject(__in, limitInfo__typeInfo, com.sforce.soap.enterprise.LimitInfo[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LimitInfoHeader_element ");
    sb.append(super.toString());
    sb.append(" limitInfo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(limitInfo)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}