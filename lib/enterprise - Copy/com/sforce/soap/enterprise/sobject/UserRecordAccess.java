package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserRecordAccess extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserRecordAccess() {
  }
    
  
  /**
   * element  : HasAllAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasAllAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasAllAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasAllAccess__is_set = false;

  private java.lang.Boolean HasAllAccess;

  public java.lang.Boolean getHasAllAccess() {
    return HasAllAccess;
  }

  

  public void setHasAllAccess(java.lang.Boolean HasAllAccess) {
    this.HasAllAccess = HasAllAccess;
    HasAllAccess__is_set = true;
  }
  
  /**
   * element  : HasDeleteAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasDeleteAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasDeleteAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasDeleteAccess__is_set = false;

  private java.lang.Boolean HasDeleteAccess;

  public java.lang.Boolean getHasDeleteAccess() {
    return HasDeleteAccess;
  }

  

  public void setHasDeleteAccess(java.lang.Boolean HasDeleteAccess) {
    this.HasDeleteAccess = HasDeleteAccess;
    HasDeleteAccess__is_set = true;
  }
  
  /**
   * element  : HasEditAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasEditAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasEditAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasEditAccess__is_set = false;

  private java.lang.Boolean HasEditAccess;

  public java.lang.Boolean getHasEditAccess() {
    return HasEditAccess;
  }

  

  public void setHasEditAccess(java.lang.Boolean HasEditAccess) {
    this.HasEditAccess = HasEditAccess;
    HasEditAccess__is_set = true;
  }
  
  /**
   * element  : HasReadAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasReadAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasReadAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasReadAccess__is_set = false;

  private java.lang.Boolean HasReadAccess;

  public java.lang.Boolean getHasReadAccess() {
    return HasReadAccess;
  }

  

  public void setHasReadAccess(java.lang.Boolean HasReadAccess) {
    this.HasReadAccess = HasReadAccess;
    HasReadAccess__is_set = true;
  }
  
  /**
   * element  : HasTransferAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasTransferAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasTransferAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasTransferAccess__is_set = false;

  private java.lang.Boolean HasTransferAccess;

  public java.lang.Boolean getHasTransferAccess() {
    return HasTransferAccess;
  }

  

  public void setHasTransferAccess(java.lang.Boolean HasTransferAccess) {
    this.HasTransferAccess = HasTransferAccess;
    HasTransferAccess__is_set = true;
  }
  
  /**
   * element  : MaxAccessLevel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MaxAccessLevel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaxAccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MaxAccessLevel__is_set = false;

  private java.lang.String MaxAccessLevel;

  public java.lang.String getMaxAccessLevel() {
    return MaxAccessLevel;
  }

  

  public void setMaxAccessLevel(java.lang.String MaxAccessLevel) {
    this.MaxAccessLevel = MaxAccessLevel;
    MaxAccessLevel__is_set = true;
  }
  
  /**
   * element  : RecordId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecordId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecordId__is_set = false;

  private java.lang.String RecordId;

  public java.lang.String getRecordId() {
    return RecordId;
  }

  

  public void setRecordId(java.lang.String RecordId) {
    this.RecordId = RecordId;
    RecordId__is_set = true;
  }
  
  /**
   * element  : UserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserId__is_set = false;

  private java.lang.String UserId;

  public java.lang.String getUserId() {
    return UserId;
  }

  

  public void setUserId(java.lang.String UserId) {
    this.UserId = UserId;
    UserId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, HasAllAccess__typeInfo, HasAllAccess, HasAllAccess__is_set);
    __typeMapper.writeObject(__out, HasDeleteAccess__typeInfo, HasDeleteAccess, HasDeleteAccess__is_set);
    __typeMapper.writeObject(__out, HasEditAccess__typeInfo, HasEditAccess, HasEditAccess__is_set);
    __typeMapper.writeObject(__out, HasReadAccess__typeInfo, HasReadAccess, HasReadAccess__is_set);
    __typeMapper.writeObject(__out, HasTransferAccess__typeInfo, HasTransferAccess, HasTransferAccess__is_set);
    __typeMapper.writeString(__out, MaxAccessLevel__typeInfo, MaxAccessLevel, MaxAccessLevel__is_set);
    __typeMapper.writeString(__out, RecordId__typeInfo, RecordId, RecordId__is_set);
    __typeMapper.writeString(__out, UserId__typeInfo, UserId, UserId__is_set);
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
    if (__typeMapper.isElement(__in, HasAllAccess__typeInfo)) {
      setHasAllAccess((java.lang.Boolean)__typeMapper.readObject(__in, HasAllAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasDeleteAccess__typeInfo)) {
      setHasDeleteAccess((java.lang.Boolean)__typeMapper.readObject(__in, HasDeleteAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasEditAccess__typeInfo)) {
      setHasEditAccess((java.lang.Boolean)__typeMapper.readObject(__in, HasEditAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasReadAccess__typeInfo)) {
      setHasReadAccess((java.lang.Boolean)__typeMapper.readObject(__in, HasReadAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasTransferAccess__typeInfo)) {
      setHasTransferAccess((java.lang.Boolean)__typeMapper.readObject(__in, HasTransferAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaxAccessLevel__typeInfo)) {
      setMaxAccessLevel((java.lang.String)__typeMapper.readString(__in, MaxAccessLevel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordId__typeInfo)) {
      setRecordId((java.lang.String)__typeMapper.readString(__in, RecordId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, UserId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserRecordAccess ");
    sb.append(super.toString());
    sb.append(" HasAllAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasAllAccess)+"'\n");
    sb.append(" HasDeleteAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasDeleteAccess)+"'\n");
    sb.append(" HasEditAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasEditAccess)+"'\n");
    sb.append(" HasReadAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasReadAccess)+"'\n");
    sb.append(" HasTransferAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasTransferAccess)+"'\n");
    sb.append(" MaxAccessLevel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaxAccessLevel)+"'\n");
    sb.append(" RecordId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordId)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}