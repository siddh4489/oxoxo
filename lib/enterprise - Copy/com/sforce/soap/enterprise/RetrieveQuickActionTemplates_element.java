package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class RetrieveQuickActionTemplates_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public RetrieveQuickActionTemplates_element() {
  }
    
  
  /**
   * element  : quickActionNames of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo quickActionNames__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","quickActionNames","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

  private boolean quickActionNames__is_set = false;

  private java.lang.String[] quickActionNames = new java.lang.String[0];

  public java.lang.String[] getQuickActionNames() {
    return quickActionNames;
  }

  

  public void setQuickActionNames(java.lang.String[] quickActionNames) {
    this.quickActionNames = quickActionNames;
    quickActionNames__is_set = true;
  }
  
  /**
   * element  : contextId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo contextId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contextId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean contextId__is_set = false;

  private java.lang.String contextId;

  public java.lang.String getContextId() {
    return contextId;
  }

  

  public void setContextId(java.lang.String contextId) {
    this.contextId = contextId;
    contextId__is_set = true;
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
   
    __typeMapper.writeObject(__out, quickActionNames__typeInfo, quickActionNames, quickActionNames__is_set);
    __typeMapper.writeString(__out, contextId__typeInfo, contextId, contextId__is_set);
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
    if (__typeMapper.isElement(__in, quickActionNames__typeInfo)) {
      setQuickActionNames((java.lang.String[])__typeMapper.readObject(__in, quickActionNames__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, contextId__typeInfo)) {
      setContextId((java.lang.String)__typeMapper.readString(__in, contextId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RetrieveQuickActionTemplates_element ");
    
    sb.append(" quickActionNames=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(quickActionNames)+"'\n");
    sb.append(" contextId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contextId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}