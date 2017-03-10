package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeQuickActions_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeQuickActions_element() {
  }
    
  
  /**
   * element  : quickActions of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo quickActions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","quickActions","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

  private boolean quickActions__is_set = false;

  private java.lang.String[] quickActions = new java.lang.String[0];

  public java.lang.String[] getQuickActions() {
    return quickActions;
  }

  

  public void setQuickActions(java.lang.String[] quickActions) {
    this.quickActions = quickActions;
    quickActions__is_set = true;
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
   
    __typeMapper.writeObject(__out, quickActions__typeInfo, quickActions, quickActions__is_set);
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
    if (__typeMapper.isElement(__in, quickActions__typeInfo)) {
      setQuickActions((java.lang.String[])__typeMapper.readObject(__in, quickActions__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeQuickActions_element ");
    
    sb.append(" quickActions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(quickActions)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}