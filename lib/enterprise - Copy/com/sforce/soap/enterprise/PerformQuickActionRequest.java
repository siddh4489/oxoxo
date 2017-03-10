package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class PerformQuickActionRequest implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public PerformQuickActionRequest() {
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
   * element  : quickActionName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo quickActionName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","quickActionName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean quickActionName__is_set = false;

  private java.lang.String quickActionName;

  public java.lang.String getQuickActionName() {
    return quickActionName;
  }

  

  public void setQuickActionName(java.lang.String quickActionName) {
    this.quickActionName = quickActionName;
    quickActionName__is_set = true;
  }
  
  /**
   * element  : records of type {urn:sobject.enterprise.soap.sforce.com}sObject
   * java type: com.sforce.soap.enterprise.sobject.SObject[]
   */
  private static final com.sforce.ws.bind.TypeInfo records__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","records","urn:sobject.enterprise.soap.sforce.com","sObject",0,-1,true);

  private boolean records__is_set = false;

  private com.sforce.soap.enterprise.sobject.SObject[] records = new com.sforce.soap.enterprise.sobject.SObject[0];

  public com.sforce.soap.enterprise.sobject.SObject[] getRecords() {
    return records;
  }

  

  public void setRecords(com.sforce.soap.enterprise.sobject.SObject[] records) {
    this.records = records;
    records__is_set = true;
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
   
    __typeMapper.writeString(__out, contextId__typeInfo, contextId, contextId__is_set);
    __typeMapper.writeString(__out, quickActionName__typeInfo, quickActionName, quickActionName__is_set);
    __typeMapper.writeObject(__out, records__typeInfo, records, records__is_set);
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
    if (__typeMapper.verifyElement(__in, contextId__typeInfo)) {
      setContextId((java.lang.String)__typeMapper.readString(__in, contextId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, quickActionName__typeInfo)) {
      setQuickActionName((java.lang.String)__typeMapper.readString(__in, quickActionName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, records__typeInfo)) {
      setRecords((com.sforce.soap.enterprise.sobject.SObject[])__typeMapper.readObject(__in, records__typeInfo, com.sforce.soap.enterprise.sobject.SObject[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PerformQuickActionRequest ");
    
    sb.append(" contextId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contextId)+"'\n");
    sb.append(" quickActionName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(quickActionName)+"'\n");
    sb.append(" records=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(records)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}