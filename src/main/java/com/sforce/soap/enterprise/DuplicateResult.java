package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DuplicateResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DuplicateResult() {
  }
    
  
  /**
   * element  : allowSave of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo allowSave__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","allowSave","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean allowSave__is_set = false;

  private boolean allowSave;

  public boolean getAllowSave() {
    return allowSave;
  }

  

  public boolean isAllowSave() {
    return allowSave;
  }

  

  public void setAllowSave(boolean allowSave) {
    this.allowSave = allowSave;
    allowSave__is_set = true;
  }
  
  /**
   * element  : duplicateRule of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo duplicateRule__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","duplicateRule","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean duplicateRule__is_set = false;

  private java.lang.String duplicateRule;

  public java.lang.String getDuplicateRule() {
    return duplicateRule;
  }

  

  public void setDuplicateRule(java.lang.String duplicateRule) {
    this.duplicateRule = duplicateRule;
    duplicateRule__is_set = true;
  }
  
  /**
   * element  : duplicateRuleEntityType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo duplicateRuleEntityType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","duplicateRuleEntityType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean duplicateRuleEntityType__is_set = false;

  private java.lang.String duplicateRuleEntityType;

  public java.lang.String getDuplicateRuleEntityType() {
    return duplicateRuleEntityType;
  }

  

  public void setDuplicateRuleEntityType(java.lang.String duplicateRuleEntityType) {
    this.duplicateRuleEntityType = duplicateRuleEntityType;
    duplicateRuleEntityType__is_set = true;
  }
  
  /**
   * element  : errorMessage of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo errorMessage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","errorMessage","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean errorMessage__is_set = false;

  private java.lang.String errorMessage;

  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  

  public void setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    errorMessage__is_set = true;
  }
  
  /**
   * element  : matchResults of type {urn:enterprise.soap.sforce.com}MatchResult
   * java type: com.sforce.soap.enterprise.MatchResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo matchResults__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","matchResults","urn:enterprise.soap.sforce.com","MatchResult",0,-1,true);

  private boolean matchResults__is_set = false;

  private com.sforce.soap.enterprise.MatchResult[] matchResults = new com.sforce.soap.enterprise.MatchResult[0];

  public com.sforce.soap.enterprise.MatchResult[] getMatchResults() {
    return matchResults;
  }

  

  public void setMatchResults(com.sforce.soap.enterprise.MatchResult[] matchResults) {
    this.matchResults = matchResults;
    matchResults__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, allowSave__typeInfo, allowSave, allowSave__is_set);
    __typeMapper.writeString(__out, duplicateRule__typeInfo, duplicateRule, duplicateRule__is_set);
    __typeMapper.writeString(__out, duplicateRuleEntityType__typeInfo, duplicateRuleEntityType, duplicateRuleEntityType__is_set);
    __typeMapper.writeString(__out, errorMessage__typeInfo, errorMessage, errorMessage__is_set);
    __typeMapper.writeObject(__out, matchResults__typeInfo, matchResults, matchResults__is_set);
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
    if (__typeMapper.verifyElement(__in, allowSave__typeInfo)) {
      setAllowSave((boolean)__typeMapper.readBoolean(__in, allowSave__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, duplicateRule__typeInfo)) {
      setDuplicateRule((java.lang.String)__typeMapper.readString(__in, duplicateRule__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, duplicateRuleEntityType__typeInfo)) {
      setDuplicateRuleEntityType((java.lang.String)__typeMapper.readString(__in, duplicateRuleEntityType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, errorMessage__typeInfo)) {
      setErrorMessage((java.lang.String)__typeMapper.readString(__in, errorMessage__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, matchResults__typeInfo)) {
      setMatchResults((com.sforce.soap.enterprise.MatchResult[])__typeMapper.readObject(__in, matchResults__typeInfo, com.sforce.soap.enterprise.MatchResult[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DuplicateResult ");
    
    sb.append(" allowSave=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(allowSave)+"'\n");
    sb.append(" duplicateRule=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(duplicateRule)+"'\n");
    sb.append(" duplicateRuleEntityType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(duplicateRuleEntityType)+"'\n");
    sb.append(" errorMessage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errorMessage)+"'\n");
    sb.append(" matchResults=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(matchResults)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}