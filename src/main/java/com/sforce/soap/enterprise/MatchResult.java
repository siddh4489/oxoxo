package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class MatchResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public MatchResult() {
  }
    
  
  /**
   * element  : entityType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo entityType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","entityType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean entityType__is_set = false;

  private java.lang.String entityType;

  public java.lang.String getEntityType() {
    return entityType;
  }

  

  public void setEntityType(java.lang.String entityType) {
    this.entityType = entityType;
    entityType__is_set = true;
  }
  
  /**
   * element  : errors of type {urn:enterprise.soap.sforce.com}Error
   * java type: com.sforce.soap.enterprise.Error[]
   */
  private static final com.sforce.ws.bind.TypeInfo errors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true);

  private boolean errors__is_set = false;

  private com.sforce.soap.enterprise.Error[] errors = new com.sforce.soap.enterprise.Error[0];

  public com.sforce.soap.enterprise.Error[] getErrors() {
    return errors;
  }

  

  public void setErrors(com.sforce.soap.enterprise.Error[] errors) {
    this.errors = errors;
    errors__is_set = true;
  }
  
  /**
   * element  : matchEngine of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo matchEngine__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","matchEngine","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean matchEngine__is_set = false;

  private java.lang.String matchEngine;

  public java.lang.String getMatchEngine() {
    return matchEngine;
  }

  

  public void setMatchEngine(java.lang.String matchEngine) {
    this.matchEngine = matchEngine;
    matchEngine__is_set = true;
  }
  
  /**
   * element  : matchRecords of type {urn:enterprise.soap.sforce.com}MatchRecord
   * java type: com.sforce.soap.enterprise.MatchRecord[]
   */
  private static final com.sforce.ws.bind.TypeInfo matchRecords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","matchRecords","urn:enterprise.soap.sforce.com","MatchRecord",0,-1,true);

  private boolean matchRecords__is_set = false;

  private com.sforce.soap.enterprise.MatchRecord[] matchRecords = new com.sforce.soap.enterprise.MatchRecord[0];

  public com.sforce.soap.enterprise.MatchRecord[] getMatchRecords() {
    return matchRecords;
  }

  

  public void setMatchRecords(com.sforce.soap.enterprise.MatchRecord[] matchRecords) {
    this.matchRecords = matchRecords;
    matchRecords__is_set = true;
  }
  
  /**
   * element  : rule of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rule__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","rule","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean rule__is_set = false;

  private java.lang.String rule;

  public java.lang.String getRule() {
    return rule;
  }

  

  public void setRule(java.lang.String rule) {
    this.rule = rule;
    rule__is_set = true;
  }
  
  /**
   * element  : size of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo size__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","size","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean size__is_set = false;

  private int size;

  public int getSize() {
    return size;
  }

  

  public void setSize(int size) {
    this.size = size;
    size__is_set = true;
  }
  
  /**
   * element  : success of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo success__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean success__is_set = false;

  private boolean success;

  public boolean getSuccess() {
    return success;
  }

  

  public boolean isSuccess() {
    return success;
  }

  

  public void setSuccess(boolean success) {
    this.success = success;
    success__is_set = true;
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
   
    __typeMapper.writeString(__out, entityType__typeInfo, entityType, entityType__is_set);
    __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
    __typeMapper.writeString(__out, matchEngine__typeInfo, matchEngine, matchEngine__is_set);
    __typeMapper.writeObject(__out, matchRecords__typeInfo, matchRecords, matchRecords__is_set);
    __typeMapper.writeString(__out, rule__typeInfo, rule, rule__is_set);
    __typeMapper.writeInt(__out, size__typeInfo, size, size__is_set);
    __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
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
    if (__typeMapper.verifyElement(__in, entityType__typeInfo)) {
      setEntityType((java.lang.String)__typeMapper.readString(__in, entityType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, errors__typeInfo)) {
      setErrors((com.sforce.soap.enterprise.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.sforce.soap.enterprise.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, matchEngine__typeInfo)) {
      setMatchEngine((java.lang.String)__typeMapper.readString(__in, matchEngine__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, matchRecords__typeInfo)) {
      setMatchRecords((com.sforce.soap.enterprise.MatchRecord[])__typeMapper.readObject(__in, matchRecords__typeInfo, com.sforce.soap.enterprise.MatchRecord[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, rule__typeInfo)) {
      setRule((java.lang.String)__typeMapper.readString(__in, rule__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, size__typeInfo)) {
      setSize((int)__typeMapper.readInt(__in, size__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[MatchResult ");
    
    sb.append(" entityType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(entityType)+"'\n");
    sb.append(" errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errors)+"'\n");
    sb.append(" matchEngine=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(matchEngine)+"'\n");
    sb.append(" matchRecords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(matchRecords)+"'\n");
    sb.append(" rule=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rule)+"'\n");
    sb.append(" size=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(size)+"'\n");
    sb.append(" success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(success)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}