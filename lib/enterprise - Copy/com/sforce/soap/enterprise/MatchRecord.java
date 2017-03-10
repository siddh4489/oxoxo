package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class MatchRecord implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public MatchRecord() {
  }
    
  
  /**
   * element  : additionalInformation of type {urn:enterprise.soap.sforce.com}AdditionalInformationMap
   * java type: com.sforce.soap.enterprise.AdditionalInformationMap[]
   */
  private static final com.sforce.ws.bind.TypeInfo additionalInformation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","additionalInformation","urn:enterprise.soap.sforce.com","AdditionalInformationMap",0,-1,true);

  private boolean additionalInformation__is_set = false;

  private com.sforce.soap.enterprise.AdditionalInformationMap[] additionalInformation = new com.sforce.soap.enterprise.AdditionalInformationMap[0];

  public com.sforce.soap.enterprise.AdditionalInformationMap[] getAdditionalInformation() {
    return additionalInformation;
  }

  

  public void setAdditionalInformation(com.sforce.soap.enterprise.AdditionalInformationMap[] additionalInformation) {
    this.additionalInformation = additionalInformation;
    additionalInformation__is_set = true;
  }
  
  /**
   * element  : fieldDiffs of type {urn:enterprise.soap.sforce.com}FieldDiff
   * java type: com.sforce.soap.enterprise.FieldDiff[]
   */
  private static final com.sforce.ws.bind.TypeInfo fieldDiffs__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","fieldDiffs","urn:enterprise.soap.sforce.com","FieldDiff",0,-1,true);

  private boolean fieldDiffs__is_set = false;

  private com.sforce.soap.enterprise.FieldDiff[] fieldDiffs = new com.sforce.soap.enterprise.FieldDiff[0];

  public com.sforce.soap.enterprise.FieldDiff[] getFieldDiffs() {
    return fieldDiffs;
  }

  

  public void setFieldDiffs(com.sforce.soap.enterprise.FieldDiff[] fieldDiffs) {
    this.fieldDiffs = fieldDiffs;
    fieldDiffs__is_set = true;
  }
  
  /**
   * element  : matchConfidence of type {http://www.w3.org/2001/XMLSchema}double
   * java type: double
   */
  private static final com.sforce.ws.bind.TypeInfo matchConfidence__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","matchConfidence","http://www.w3.org/2001/XMLSchema","double",1,1,true);

  private boolean matchConfidence__is_set = false;

  private double matchConfidence;

  public double getMatchConfidence() {
    return matchConfidence;
  }

  

  public void setMatchConfidence(double matchConfidence) {
    this.matchConfidence = matchConfidence;
    matchConfidence__is_set = true;
  }
  
  /**
   * element  : record of type {urn:sobject.enterprise.soap.sforce.com}sObject
   * java type: com.sforce.soap.enterprise.sobject.SObject
   */
  private static final com.sforce.ws.bind.TypeInfo record__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","record","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true);

  private boolean record__is_set = false;

  private com.sforce.soap.enterprise.sobject.SObject record;

  public com.sforce.soap.enterprise.sobject.SObject getRecord() {
    return record;
  }

  

  public void setRecord(com.sforce.soap.enterprise.sobject.SObject record) {
    this.record = record;
    record__is_set = true;
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
   
    __typeMapper.writeObject(__out, additionalInformation__typeInfo, additionalInformation, additionalInformation__is_set);
    __typeMapper.writeObject(__out, fieldDiffs__typeInfo, fieldDiffs, fieldDiffs__is_set);
    __typeMapper.writeDouble(__out, matchConfidence__typeInfo, matchConfidence, matchConfidence__is_set);
    __typeMapper.writeObject(__out, record__typeInfo, record, record__is_set);
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
    if (__typeMapper.isElement(__in, additionalInformation__typeInfo)) {
      setAdditionalInformation((com.sforce.soap.enterprise.AdditionalInformationMap[])__typeMapper.readObject(__in, additionalInformation__typeInfo, com.sforce.soap.enterprise.AdditionalInformationMap[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, fieldDiffs__typeInfo)) {
      setFieldDiffs((com.sforce.soap.enterprise.FieldDiff[])__typeMapper.readObject(__in, fieldDiffs__typeInfo, com.sforce.soap.enterprise.FieldDiff[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, matchConfidence__typeInfo)) {
      setMatchConfidence((double)__typeMapper.readDouble(__in, matchConfidence__typeInfo, double.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, record__typeInfo)) {
      setRecord((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, record__typeInfo, com.sforce.soap.enterprise.sobject.SObject.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[MatchRecord ");
    
    sb.append(" additionalInformation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(additionalInformation)+"'\n");
    sb.append(" fieldDiffs=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldDiffs)+"'\n");
    sb.append(" matchConfidence=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(matchConfidence)+"'\n");
    sb.append(" record=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(record)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}