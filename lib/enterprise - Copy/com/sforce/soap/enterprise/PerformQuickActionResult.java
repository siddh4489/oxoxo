package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class PerformQuickActionResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public PerformQuickActionResult() {
  }
    
  
  /**
   * element  : contextId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo contextId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contextId","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : created of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo created__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","created","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean created__is_set = false;

  private boolean created;

  public boolean getCreated() {
    return created;
  }

  

  public boolean isCreated() {
    return created;
  }

  

  public void setCreated(boolean created) {
    this.created = created;
    created__is_set = true;
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
   * element  : feedItemIds of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo feedItemIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","feedItemIds","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean feedItemIds__is_set = false;

  private java.lang.String[] feedItemIds = new java.lang.String[0];

  public java.lang.String[] getFeedItemIds() {
    return feedItemIds;
  }

  

  public void setFeedItemIds(java.lang.String[] feedItemIds) {
    this.feedItemIds = feedItemIds;
    feedItemIds__is_set = true;
  }
  
  /**
   * element  : ids of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo ids__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","ids","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean ids__is_set = false;

  private java.lang.String[] ids = new java.lang.String[0];

  public java.lang.String[] getIds() {
    return ids;
  }

  

  public void setIds(java.lang.String[] ids) {
    this.ids = ids;
    ids__is_set = true;
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
   * element  : successMessage of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo successMessage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","successMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean successMessage__is_set = false;

  private java.lang.String successMessage;

  public java.lang.String getSuccessMessage() {
    return successMessage;
  }

  

  public void setSuccessMessage(java.lang.String successMessage) {
    this.successMessage = successMessage;
    successMessage__is_set = true;
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
    __typeMapper.writeBoolean(__out, created__typeInfo, created, created__is_set);
    __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
    __typeMapper.writeObject(__out, feedItemIds__typeInfo, feedItemIds, feedItemIds__is_set);
    __typeMapper.writeObject(__out, ids__typeInfo, ids, ids__is_set);
    __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
    __typeMapper.writeString(__out, successMessage__typeInfo, successMessage, successMessage__is_set);
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
    if (__typeMapper.isElement(__in, contextId__typeInfo)) {
      setContextId((java.lang.String)__typeMapper.readString(__in, contextId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, created__typeInfo)) {
      setCreated((boolean)__typeMapper.readBoolean(__in, created__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, errors__typeInfo)) {
      setErrors((com.sforce.soap.enterprise.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.sforce.soap.enterprise.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, feedItemIds__typeInfo)) {
      setFeedItemIds((java.lang.String[])__typeMapper.readObject(__in, feedItemIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ids__typeInfo)) {
      setIds((java.lang.String[])__typeMapper.readObject(__in, ids__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, successMessage__typeInfo)) {
      setSuccessMessage((java.lang.String)__typeMapper.readString(__in, successMessage__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PerformQuickActionResult ");
    
    sb.append(" contextId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contextId)+"'\n");
    sb.append(" created=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(created)+"'\n");
    sb.append(" errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errors)+"'\n");
    sb.append(" feedItemIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(feedItemIds)+"'\n");
    sb.append(" ids=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ids)+"'\n");
    sb.append(" success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(success)+"'\n");
    sb.append(" successMessage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(successMessage)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}