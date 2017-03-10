package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class PerformQuickActions_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public PerformQuickActions_element() {
  }
    
  
  /**
   * element  : quickActions of type {urn:enterprise.soap.sforce.com}PerformQuickActionRequest
   * java type: com.sforce.soap.enterprise.PerformQuickActionRequest[]
   */
  private static final com.sforce.ws.bind.TypeInfo quickActions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","quickActions","urn:enterprise.soap.sforce.com","PerformQuickActionRequest",0,-1,true);

  private boolean quickActions__is_set = false;

  private com.sforce.soap.enterprise.PerformQuickActionRequest[] quickActions = new com.sforce.soap.enterprise.PerformQuickActionRequest[0];

  public com.sforce.soap.enterprise.PerformQuickActionRequest[] getQuickActions() {
    return quickActions;
  }

  

  public void setQuickActions(com.sforce.soap.enterprise.PerformQuickActionRequest[] quickActions) {
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
      setQuickActions((com.sforce.soap.enterprise.PerformQuickActionRequest[])__typeMapper.readObject(__in, quickActions__typeInfo, com.sforce.soap.enterprise.PerformQuickActionRequest[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PerformQuickActions_element ");
    
    sb.append(" quickActions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(quickActions)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}