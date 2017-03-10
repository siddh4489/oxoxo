package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserProvAccountStaging extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserProvAccountStaging() {
  }
    
  
  /**
   * element  : ConnectedApp of type {urn:sobject.enterprise.soap.sforce.com}ConnectedApplication
   * java type: com.sforce.soap.enterprise.sobject.ConnectedApplication
   */
  private static final com.sforce.ws.bind.TypeInfo ConnectedApp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConnectedApp","urn:sobject.enterprise.soap.sforce.com","ConnectedApplication",0,1,true);

  private boolean ConnectedApp__is_set = false;

  private com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp;

  public com.sforce.soap.enterprise.sobject.ConnectedApplication getConnectedApp() {
    return ConnectedApp;
  }

  

  public void setConnectedApp(com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp) {
    this.ConnectedApp = ConnectedApp;
    ConnectedApp__is_set = true;
  }
  
  /**
   * element  : ConnectedAppId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConnectedAppId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConnectedAppId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ConnectedAppId__is_set = false;

  private java.lang.String ConnectedAppId;

  public java.lang.String getConnectedAppId() {
    return ConnectedAppId;
  }

  

  public void setConnectedAppId(java.lang.String ConnectedAppId) {
    this.ConnectedAppId = ConnectedAppId;
    ConnectedAppId__is_set = true;
  }
  
  /**
   * element  : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean CreatedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User CreatedBy;

  public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
    return CreatedBy;
  }

  

  public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {
    this.CreatedBy = CreatedBy;
    CreatedBy__is_set = true;
  }
  
  /**
   * element  : CreatedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CreatedById__is_set = false;

  private java.lang.String CreatedById;

  public java.lang.String getCreatedById() {
    return CreatedById;
  }

  

  public void setCreatedById(java.lang.String CreatedById) {
    this.CreatedById = CreatedById;
    CreatedById__is_set = true;
  }
  
  /**
   * element  : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean CreatedDate__is_set = false;

  private java.util.Calendar CreatedDate;

  public java.util.Calendar getCreatedDate() {
    return CreatedDate;
  }

  

  public void setCreatedDate(java.util.Calendar CreatedDate) {
    this.CreatedDate = CreatedDate;
    CreatedDate__is_set = true;
  }
  
  /**
   * element  : ExternalEmail of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalEmail","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalEmail__is_set = false;

  private java.lang.String ExternalEmail;

  public java.lang.String getExternalEmail() {
    return ExternalEmail;
  }

  

  public void setExternalEmail(java.lang.String ExternalEmail) {
    this.ExternalEmail = ExternalEmail;
    ExternalEmail__is_set = true;
  }
  
  /**
   * element  : ExternalFirstName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalFirstName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalFirstName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalFirstName__is_set = false;

  private java.lang.String ExternalFirstName;

  public java.lang.String getExternalFirstName() {
    return ExternalFirstName;
  }

  

  public void setExternalFirstName(java.lang.String ExternalFirstName) {
    this.ExternalFirstName = ExternalFirstName;
    ExternalFirstName__is_set = true;
  }
  
  /**
   * element  : ExternalLastName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalLastName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalLastName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalLastName__is_set = false;

  private java.lang.String ExternalLastName;

  public java.lang.String getExternalLastName() {
    return ExternalLastName;
  }

  

  public void setExternalLastName(java.lang.String ExternalLastName) {
    this.ExternalLastName = ExternalLastName;
    ExternalLastName__is_set = true;
  }
  
  /**
   * element  : ExternalUserId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalUserId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalUserId__is_set = false;

  private java.lang.String ExternalUserId;

  public java.lang.String getExternalUserId() {
    return ExternalUserId;
  }

  

  public void setExternalUserId(java.lang.String ExternalUserId) {
    this.ExternalUserId = ExternalUserId;
    ExternalUserId__is_set = true;
  }
  
  /**
   * element  : ExternalUsername of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalUsername__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalUsername","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalUsername__is_set = false;

  private java.lang.String ExternalUsername;

  public java.lang.String getExternalUsername() {
    return ExternalUsername;
  }

  

  public void setExternalUsername(java.lang.String ExternalUsername) {
    this.ExternalUsername = ExternalUsername;
    ExternalUsername__is_set = true;
  }
  
  /**
   * element  : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDeleted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDeleted__is_set = false;

  private java.lang.Boolean IsDeleted;

  public java.lang.Boolean getIsDeleted() {
    return IsDeleted;
  }

  

  public void setIsDeleted(java.lang.Boolean IsDeleted) {
    this.IsDeleted = IsDeleted;
    IsDeleted__is_set = true;
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
   * element  : LinkState of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LinkState__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LinkState","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LinkState__is_set = false;

  private java.lang.String LinkState;

  public java.lang.String getLinkState() {
    return LinkState;
  }

  

  public void setLinkState(java.lang.String LinkState) {
    this.LinkState = LinkState;
    LinkState__is_set = true;
  }
  
  /**
   * element  : Name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Name__is_set = false;

  private java.lang.String Name;

  public java.lang.String getName() {
    return Name;
  }

  

  public void setName(java.lang.String Name) {
    this.Name = Name;
    Name__is_set = true;
  }
  
  /**
   * element  : SalesforceUser of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo SalesforceUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SalesforceUser","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean SalesforceUser__is_set = false;

  private com.sforce.soap.enterprise.sobject.User SalesforceUser;

  public com.sforce.soap.enterprise.sobject.User getSalesforceUser() {
    return SalesforceUser;
  }

  

  public void setSalesforceUser(com.sforce.soap.enterprise.sobject.User SalesforceUser) {
    this.SalesforceUser = SalesforceUser;
    SalesforceUser__is_set = true;
  }
  
  /**
   * element  : SalesforceUserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SalesforceUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SalesforceUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SalesforceUserId__is_set = false;

  private java.lang.String SalesforceUserId;

  public java.lang.String getSalesforceUserId() {
    return SalesforceUserId;
  }

  

  public void setSalesforceUserId(java.lang.String SalesforceUserId) {
    this.SalesforceUserId = SalesforceUserId;
    SalesforceUserId__is_set = true;
  }
  
  /**
   * element  : Status of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Status__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Status__is_set = false;

  private java.lang.String Status;

  public java.lang.String getStatus() {
    return Status;
  }

  

  public void setStatus(java.lang.String Status) {
    this.Status = Status;
    Status__is_set = true;
  }
  
  /**
   * element  : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo SystemModstamp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean SystemModstamp__is_set = false;

  private java.util.Calendar SystemModstamp;

  public java.util.Calendar getSystemModstamp() {
    return SystemModstamp;
  }

  

  public void setSystemModstamp(java.util.Calendar SystemModstamp) {
    this.SystemModstamp = SystemModstamp;
    SystemModstamp__is_set = true;
  }
  
  /**
   * element  : UserRecordAccess of type {urn:sobject.enterprise.soap.sforce.com}UserRecordAccess
   * java type: com.sforce.soap.enterprise.sobject.UserRecordAccess
   */
  private static final com.sforce.ws.bind.TypeInfo UserRecordAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true);

  private boolean UserRecordAccess__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess;

  public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
    return UserRecordAccess;
  }

  

  public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess) {
    this.UserRecordAccess = UserRecordAccess;
    UserRecordAccess__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserProvAccountStaging");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ConnectedApp__typeInfo, ConnectedApp, ConnectedApp__is_set);
    __typeMapper.writeString(__out, ConnectedAppId__typeInfo, ConnectedAppId, ConnectedAppId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, ExternalEmail__typeInfo, ExternalEmail, ExternalEmail__is_set);
    __typeMapper.writeString(__out, ExternalFirstName__typeInfo, ExternalFirstName, ExternalFirstName__is_set);
    __typeMapper.writeString(__out, ExternalLastName__typeInfo, ExternalLastName, ExternalLastName__is_set);
    __typeMapper.writeString(__out, ExternalUserId__typeInfo, ExternalUserId, ExternalUserId__is_set);
    __typeMapper.writeString(__out, ExternalUsername__typeInfo, ExternalUsername, ExternalUsername__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LinkState__typeInfo, LinkState, LinkState__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, SalesforceUser__typeInfo, SalesforceUser, SalesforceUser__is_set);
    __typeMapper.writeString(__out, SalesforceUserId__typeInfo, SalesforceUserId, SalesforceUserId__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
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
    if (__typeMapper.isElement(__in, ConnectedApp__typeInfo)) {
      setConnectedApp((com.sforce.soap.enterprise.sobject.ConnectedApplication)__typeMapper.readObject(__in, ConnectedApp__typeInfo, com.sforce.soap.enterprise.sobject.ConnectedApplication.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConnectedAppId__typeInfo)) {
      setConnectedAppId((java.lang.String)__typeMapper.readString(__in, ConnectedAppId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {
      setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
      setCreatedById((java.lang.String)__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalEmail__typeInfo)) {
      setExternalEmail((java.lang.String)__typeMapper.readString(__in, ExternalEmail__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalFirstName__typeInfo)) {
      setExternalFirstName((java.lang.String)__typeMapper.readString(__in, ExternalFirstName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalLastName__typeInfo)) {
      setExternalLastName((java.lang.String)__typeMapper.readString(__in, ExternalLastName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalUserId__typeInfo)) {
      setExternalUserId((java.lang.String)__typeMapper.readString(__in, ExternalUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalUsername__typeInfo)) {
      setExternalUsername((java.lang.String)__typeMapper.readString(__in, ExternalUsername__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LinkState__typeInfo)) {
      setLinkState((java.lang.String)__typeMapper.readString(__in, LinkState__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SalesforceUser__typeInfo)) {
      setSalesforceUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, SalesforceUser__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SalesforceUserId__typeInfo)) {
      setSalesforceUserId((java.lang.String)__typeMapper.readString(__in, SalesforceUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserProvAccountStaging ");
    sb.append(super.toString());
    sb.append(" ConnectedApp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConnectedApp)+"'\n");
    sb.append(" ConnectedAppId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConnectedAppId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ExternalEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalEmail)+"'\n");
    sb.append(" ExternalFirstName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalFirstName)+"'\n");
    sb.append(" ExternalLastName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalLastName)+"'\n");
    sb.append(" ExternalUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalUserId)+"'\n");
    sb.append(" ExternalUsername=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalUsername)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LinkState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LinkState)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" SalesforceUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SalesforceUser)+"'\n");
    sb.append(" SalesforceUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SalesforceUserId)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}