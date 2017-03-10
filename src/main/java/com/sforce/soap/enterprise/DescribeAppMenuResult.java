package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeAppMenuResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeAppMenuResult() {
  }
    
  
  /**
   * element  : appMenuItems of type {urn:enterprise.soap.sforce.com}DescribeAppMenuItem
   * java type: com.sforce.soap.enterprise.DescribeAppMenuItem[]
   */
  private static final com.sforce.ws.bind.TypeInfo appMenuItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","appMenuItems","urn:enterprise.soap.sforce.com","DescribeAppMenuItem",0,-1,true);

  private boolean appMenuItems__is_set = false;

  private com.sforce.soap.enterprise.DescribeAppMenuItem[] appMenuItems = new com.sforce.soap.enterprise.DescribeAppMenuItem[0];

  public com.sforce.soap.enterprise.DescribeAppMenuItem[] getAppMenuItems() {
    return appMenuItems;
  }

  

  public void setAppMenuItems(com.sforce.soap.enterprise.DescribeAppMenuItem[] appMenuItems) {
    this.appMenuItems = appMenuItems;
    appMenuItems__is_set = true;
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
   
    __typeMapper.writeObject(__out, appMenuItems__typeInfo, appMenuItems, appMenuItems__is_set);
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
    if (__typeMapper.isElement(__in, appMenuItems__typeInfo)) {
      setAppMenuItems((com.sforce.soap.enterprise.DescribeAppMenuItem[])__typeMapper.readObject(__in, appMenuItems__typeInfo, com.sforce.soap.enterprise.DescribeAppMenuItem[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeAppMenuResult ");
    
    sb.append(" appMenuItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(appMenuItems)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}