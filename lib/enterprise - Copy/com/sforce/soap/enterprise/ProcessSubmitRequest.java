package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ProcessSubmitRequest extends com.sforce.soap.enterprise.ProcessRequest {
  /**
   * Constructor
   */
  public ProcessSubmitRequest() {
  }
    
  
  /**
   * element  : objectId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo objectId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","objectId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean objectId__is_set = false;

  private java.lang.String objectId;

  public java.lang.String getObjectId() {
    return objectId;
  }

  

  public void setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    objectId__is_set = true;
  }
  
  /**
   * element  : submitterId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo submitterId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","submitterId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean submitterId__is_set = false;

  private java.lang.String submitterId;

  public java.lang.String getSubmitterId() {
    return submitterId;
  }

  

  public void setSubmitterId(java.lang.String submitterId) {
    this.submitterId = submitterId;
    submitterId__is_set = true;
  }
  
  /**
   * element  : processDefinitionNameOrId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo processDefinitionNameOrId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","processDefinitionNameOrId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean processDefinitionNameOrId__is_set = false;

  private java.lang.String processDefinitionNameOrId;

  public java.lang.String getProcessDefinitionNameOrId() {
    return processDefinitionNameOrId;
  }

  

  public void setProcessDefinitionNameOrId(java.lang.String processDefinitionNameOrId) {
    this.processDefinitionNameOrId = processDefinitionNameOrId;
    processDefinitionNameOrId__is_set = true;
  }
  
  /**
   * element  : skipEntryCriteria of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo skipEntryCriteria__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","skipEntryCriteria","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean skipEntryCriteria__is_set = false;

  private java.lang.Boolean skipEntryCriteria;

  public java.lang.Boolean getSkipEntryCriteria() {
    return skipEntryCriteria;
  }

  

  public void setSkipEntryCriteria(java.lang.Boolean skipEntryCriteria) {
    this.skipEntryCriteria = skipEntryCriteria;
    skipEntryCriteria__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "ProcessSubmitRequest");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, objectId__typeInfo, objectId, objectId__is_set);
    __typeMapper.writeString(__out, submitterId__typeInfo, submitterId, submitterId__is_set);
    __typeMapper.writeString(__out, processDefinitionNameOrId__typeInfo, processDefinitionNameOrId, processDefinitionNameOrId__is_set);
    __typeMapper.writeObject(__out, skipEntryCriteria__typeInfo, skipEntryCriteria, skipEntryCriteria__is_set);
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
    if (__typeMapper.verifyElement(__in, objectId__typeInfo)) {
      setObjectId((java.lang.String)__typeMapper.readString(__in, objectId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, submitterId__typeInfo)) {
      setSubmitterId((java.lang.String)__typeMapper.readString(__in, submitterId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, processDefinitionNameOrId__typeInfo)) {
      setProcessDefinitionNameOrId((java.lang.String)__typeMapper.readString(__in, processDefinitionNameOrId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, skipEntryCriteria__typeInfo)) {
      setSkipEntryCriteria((java.lang.Boolean)__typeMapper.readObject(__in, skipEntryCriteria__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ProcessSubmitRequest ");
    sb.append(super.toString());
    sb.append(" objectId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(objectId)+"'\n");
    sb.append(" submitterId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(submitterId)+"'\n");
    sb.append(" processDefinitionNameOrId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(processDefinitionNameOrId)+"'\n");
    sb.append(" skipEntryCriteria=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(skipEntryCriteria)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}