package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ForecastShare extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ForecastShare() {
  }
    
  
  /**
   * element  : AccessLevel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccessLevel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccessLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AccessLevel__is_set = false;

  private java.lang.String AccessLevel;

  public java.lang.String getAccessLevel() {
    return AccessLevel;
  }

  

  public void setAccessLevel(java.lang.String AccessLevel) {
    this.AccessLevel = AccessLevel;
    AccessLevel__is_set = true;
  }
  
  /**
   * element  : CanSubmit of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo CanSubmit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CanSubmit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean CanSubmit__is_set = false;

  private java.lang.Boolean CanSubmit;

  public java.lang.Boolean getCanSubmit() {
    return CanSubmit;
  }

  

  public void setCanSubmit(java.lang.Boolean CanSubmit) {
    this.CanSubmit = CanSubmit;
    CanSubmit__is_set = true;
  }
  
  /**
   * element  : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean LastModifiedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

  public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
    return LastModifiedBy;
  }

  

  public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
    this.LastModifiedBy = LastModifiedBy;
    LastModifiedBy__is_set = true;
  }
  
  /**
   * element  : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastModifiedById__is_set = false;

  private java.lang.String LastModifiedById;

  public java.lang.String getLastModifiedById() {
    return LastModifiedById;
  }

  

  public void setLastModifiedById(java.lang.String LastModifiedById) {
    this.LastModifiedById = LastModifiedById;
    LastModifiedById__is_set = true;
  }
  
  /**
   * element  : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastModifiedDate__is_set = false;

  private java.util.Calendar LastModifiedDate;

  public java.util.Calendar getLastModifiedDate() {
    return LastModifiedDate;
  }

  

  public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
    this.LastModifiedDate = LastModifiedDate;
    LastModifiedDate__is_set = true;
  }
  
  /**
   * element  : RowCause of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RowCause__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RowCause","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RowCause__is_set = false;

  private java.lang.String RowCause;

  public java.lang.String getRowCause() {
    return RowCause;
  }

  

  public void setRowCause(java.lang.String RowCause) {
    this.RowCause = RowCause;
    RowCause__is_set = true;
  }
  
  /**
   * element  : UserOrGroupId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserOrGroupId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserOrGroupId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserOrGroupId__is_set = false;

  private java.lang.String UserOrGroupId;

  public java.lang.String getUserOrGroupId() {
    return UserOrGroupId;
  }

  

  public void setUserOrGroupId(java.lang.String UserOrGroupId) {
    this.UserOrGroupId = UserOrGroupId;
    UserOrGroupId__is_set = true;
  }
  
  /**
   * element  : UserRoleId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserRoleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserRoleId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserRoleId__is_set = false;

  private java.lang.String UserRoleId;

  public java.lang.String getUserRoleId() {
    return UserRoleId;
  }

  

  public void setUserRoleId(java.lang.String UserRoleId) {
    this.UserRoleId = UserRoleId;
    UserRoleId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ForecastShare");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AccessLevel__typeInfo, AccessLevel, AccessLevel__is_set);
    __typeMapper.writeObject(__out, CanSubmit__typeInfo, CanSubmit, CanSubmit__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, RowCause__typeInfo, RowCause, RowCause__is_set);
    __typeMapper.writeString(__out, UserOrGroupId__typeInfo, UserOrGroupId, UserOrGroupId__is_set);
    __typeMapper.writeString(__out, UserRoleId__typeInfo, UserRoleId, UserRoleId__is_set);
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
    if (__typeMapper.isElement(__in, AccessLevel__typeInfo)) {
      setAccessLevel((java.lang.String)__typeMapper.readString(__in, AccessLevel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CanSubmit__typeInfo)) {
      setCanSubmit((java.lang.Boolean)__typeMapper.readObject(__in, CanSubmit__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedBy__typeInfo)) {
      setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, LastModifiedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedById__typeInfo)) {
      setLastModifiedById((java.lang.String)__typeMapper.readString(__in, LastModifiedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RowCause__typeInfo)) {
      setRowCause((java.lang.String)__typeMapper.readString(__in, RowCause__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserOrGroupId__typeInfo)) {
      setUserOrGroupId((java.lang.String)__typeMapper.readString(__in, UserOrGroupId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRoleId__typeInfo)) {
      setUserRoleId((java.lang.String)__typeMapper.readString(__in, UserRoleId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ForecastShare ");
    sb.append(super.toString());
    sb.append(" AccessLevel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccessLevel)+"'\n");
    sb.append(" CanSubmit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CanSubmit)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" RowCause=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RowCause)+"'\n");
    sb.append(" UserOrGroupId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserOrGroupId)+"'\n");
    sb.append(" UserRoleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRoleId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}