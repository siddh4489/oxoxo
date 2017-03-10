package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeAppMenu_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeAppMenu_element() {
  }
    
  
  /**
   * element  : appMenuType of type {urn:enterprise.soap.sforce.com}AppMenuType
   * java type: com.sforce.soap.enterprise.AppMenuType
   */
  private static final com.sforce.ws.bind.TypeInfo appMenuType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","appMenuType","urn:enterprise.soap.sforce.com","AppMenuType",1,1,true);

  private boolean appMenuType__is_set = false;

  private com.sforce.soap.enterprise.AppMenuType appMenuType;

  public com.sforce.soap.enterprise.AppMenuType getAppMenuType() {
    return appMenuType;
  }

  

  public void setAppMenuType(com.sforce.soap.enterprise.AppMenuType appMenuType) {
    this.appMenuType = appMenuType;
    appMenuType__is_set = true;
  }
  
  /**
   * element  : networkId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo networkId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","networkId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean networkId__is_set = false;

  private java.lang.String networkId;

  public java.lang.String getNetworkId() {
    return networkId;
  }

  

  public void setNetworkId(java.lang.String networkId) {
    this.networkId = networkId;
    networkId__is_set = true;
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
   
    __typeMapper.writeObject(__out, appMenuType__typeInfo, appMenuType, appMenuType__is_set);
    __typeMapper.writeString(__out, networkId__typeInfo, networkId, networkId__is_set);
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
    if (__typeMapper.verifyElement(__in, appMenuType__typeInfo)) {
      setAppMenuType((com.sforce.soap.enterprise.AppMenuType)__typeMapper.readObject(__in, appMenuType__typeInfo, com.sforce.soap.enterprise.AppMenuType.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, networkId__typeInfo)) {
      setNetworkId((java.lang.String)__typeMapper.readString(__in, networkId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeAppMenu_element ");
    
    sb.append(" appMenuType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(appMenuType)+"'\n");
    sb.append(" networkId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(networkId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}