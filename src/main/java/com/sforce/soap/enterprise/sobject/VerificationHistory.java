package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class VerificationHistory extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public VerificationHistory() {
  }
    
  
  /**
   * element  : Activity of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Activity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Activity","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Activity__is_set = false;

  private java.lang.String Activity;

  public java.lang.String getActivity() {
    return Activity;
  }

  

  public void setActivity(java.lang.String Activity) {
    this.Activity = Activity;
    Activity__is_set = true;
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
   * element  : EventGroup of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo EventGroup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EventGroup","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean EventGroup__is_set = false;

  private java.lang.Integer EventGroup;

  public java.lang.Integer getEventGroup() {
    return EventGroup;
  }

  

  public void setEventGroup(java.lang.Integer EventGroup) {
    this.EventGroup = EventGroup;
    EventGroup__is_set = true;
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
   * element  : LoginGeo of type {urn:sobject.enterprise.soap.sforce.com}LoginGeo
   * java type: com.sforce.soap.enterprise.sobject.LoginGeo
   */
  private static final com.sforce.ws.bind.TypeInfo LoginGeo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginGeo","urn:sobject.enterprise.soap.sforce.com","LoginGeo",0,1,true);

  private boolean LoginGeo__is_set = false;

  private com.sforce.soap.enterprise.sobject.LoginGeo LoginGeo;

  public com.sforce.soap.enterprise.sobject.LoginGeo getLoginGeo() {
    return LoginGeo;
  }

  

  public void setLoginGeo(com.sforce.soap.enterprise.sobject.LoginGeo LoginGeo) {
    this.LoginGeo = LoginGeo;
    LoginGeo__is_set = true;
  }
  
  /**
   * element  : LoginGeoId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LoginGeoId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginGeoId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LoginGeoId__is_set = false;

  private java.lang.String LoginGeoId;

  public java.lang.String getLoginGeoId() {
    return LoginGeoId;
  }

  

  public void setLoginGeoId(java.lang.String LoginGeoId) {
    this.LoginGeoId = LoginGeoId;
    LoginGeoId__is_set = true;
  }
  
  /**
   * element  : LoginHistory of type {urn:sobject.enterprise.soap.sforce.com}LoginHistory
   * java type: com.sforce.soap.enterprise.sobject.LoginHistory
   */
  private static final com.sforce.ws.bind.TypeInfo LoginHistory__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginHistory","urn:sobject.enterprise.soap.sforce.com","LoginHistory",0,1,true);

  private boolean LoginHistory__is_set = false;

  private com.sforce.soap.enterprise.sobject.LoginHistory LoginHistory;

  public com.sforce.soap.enterprise.sobject.LoginHistory getLoginHistory() {
    return LoginHistory;
  }

  

  public void setLoginHistory(com.sforce.soap.enterprise.sobject.LoginHistory LoginHistory) {
    this.LoginHistory = LoginHistory;
    LoginHistory__is_set = true;
  }
  
  /**
   * element  : LoginHistoryId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LoginHistoryId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginHistoryId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LoginHistoryId__is_set = false;

  private java.lang.String LoginHistoryId;

  public java.lang.String getLoginHistoryId() {
    return LoginHistoryId;
  }

  

  public void setLoginHistoryId(java.lang.String LoginHistoryId) {
    this.LoginHistoryId = LoginHistoryId;
    LoginHistoryId__is_set = true;
  }
  
  /**
   * element  : Policy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Policy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Policy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Policy__is_set = false;

  private java.lang.String Policy;

  public java.lang.String getPolicy() {
    return Policy;
  }

  

  public void setPolicy(java.lang.String Policy) {
    this.Policy = Policy;
    Policy__is_set = true;
  }
  
  /**
   * element  : Remarks of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Remarks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Remarks","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Remarks__is_set = false;

  private java.lang.String Remarks;

  public java.lang.String getRemarks() {
    return Remarks;
  }

  

  public void setRemarks(java.lang.String Remarks) {
    this.Remarks = Remarks;
    Remarks__is_set = true;
  }
  
  /**
   * element  : Resource of type {urn:sobject.enterprise.soap.sforce.com}ConnectedApplication
   * java type: com.sforce.soap.enterprise.sobject.ConnectedApplication
   */
  private static final com.sforce.ws.bind.TypeInfo Resource__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Resource","urn:sobject.enterprise.soap.sforce.com","ConnectedApplication",0,1,true);

  private boolean Resource__is_set = false;

  private com.sforce.soap.enterprise.sobject.ConnectedApplication Resource;

  public com.sforce.soap.enterprise.sobject.ConnectedApplication getResource() {
    return Resource;
  }

  

  public void setResource(com.sforce.soap.enterprise.sobject.ConnectedApplication Resource) {
    this.Resource = Resource;
    Resource__is_set = true;
  }
  
  /**
   * element  : ResourceId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ResourceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ResourceId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ResourceId__is_set = false;

  private java.lang.String ResourceId;

  public java.lang.String getResourceId() {
    return ResourceId;
  }

  

  public void setResourceId(java.lang.String ResourceId) {
    this.ResourceId = ResourceId;
    ResourceId__is_set = true;
  }
  
  /**
   * element  : SourceIp of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SourceIp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SourceIp","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SourceIp__is_set = false;

  private java.lang.String SourceIp;

  public java.lang.String getSourceIp() {
    return SourceIp;
  }

  

  public void setSourceIp(java.lang.String SourceIp) {
    this.SourceIp = SourceIp;
    SourceIp__is_set = true;
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
   * element  : User of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo User__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean User__is_set = false;

  private com.sforce.soap.enterprise.sobject.User User;

  public com.sforce.soap.enterprise.sobject.User getUser() {
    return User;
  }

  

  public void setUser(com.sforce.soap.enterprise.sobject.User User) {
    this.User = User;
    User__is_set = true;
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
   * element  : VerificationMethod of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VerificationMethod__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VerificationMethod","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VerificationMethod__is_set = false;

  private java.lang.String VerificationMethod;

  public java.lang.String getVerificationMethod() {
    return VerificationMethod;
  }

  

  public void setVerificationMethod(java.lang.String VerificationMethod) {
    this.VerificationMethod = VerificationMethod;
    VerificationMethod__is_set = true;
  }
  
  /**
   * element  : VerificationTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo VerificationTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VerificationTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean VerificationTime__is_set = false;

  private java.util.Calendar VerificationTime;

  public java.util.Calendar getVerificationTime() {
    return VerificationTime;
  }

  

  public void setVerificationTime(java.util.Calendar VerificationTime) {
    this.VerificationTime = VerificationTime;
    VerificationTime__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "VerificationHistory");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Activity__typeInfo, Activity, Activity__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, EventGroup__typeInfo, EventGroup, EventGroup__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LoginGeo__typeInfo, LoginGeo, LoginGeo__is_set);
    __typeMapper.writeString(__out, LoginGeoId__typeInfo, LoginGeoId, LoginGeoId__is_set);
    __typeMapper.writeObject(__out, LoginHistory__typeInfo, LoginHistory, LoginHistory__is_set);
    __typeMapper.writeString(__out, LoginHistoryId__typeInfo, LoginHistoryId, LoginHistoryId__is_set);
    __typeMapper.writeString(__out, Policy__typeInfo, Policy, Policy__is_set);
    __typeMapper.writeString(__out, Remarks__typeInfo, Remarks, Remarks__is_set);
    __typeMapper.writeObject(__out, Resource__typeInfo, Resource, Resource__is_set);
    __typeMapper.writeString(__out, ResourceId__typeInfo, ResourceId, ResourceId__is_set);
    __typeMapper.writeString(__out, SourceIp__typeInfo, SourceIp, SourceIp__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, User__typeInfo, User, User__is_set);
    __typeMapper.writeString(__out, UserId__typeInfo, UserId, UserId__is_set);
    __typeMapper.writeString(__out, VerificationMethod__typeInfo, VerificationMethod, VerificationMethod__is_set);
    __typeMapper.writeObject(__out, VerificationTime__typeInfo, VerificationTime, VerificationTime__is_set);
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
    if (__typeMapper.isElement(__in, Activity__typeInfo)) {
      setActivity((java.lang.String)__typeMapper.readString(__in, Activity__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, EventGroup__typeInfo)) {
      setEventGroup((java.lang.Integer)__typeMapper.readObject(__in, EventGroup__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, LoginGeo__typeInfo)) {
      setLoginGeo((com.sforce.soap.enterprise.sobject.LoginGeo)__typeMapper.readObject(__in, LoginGeo__typeInfo, com.sforce.soap.enterprise.sobject.LoginGeo.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginGeoId__typeInfo)) {
      setLoginGeoId((java.lang.String)__typeMapper.readString(__in, LoginGeoId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginHistory__typeInfo)) {
      setLoginHistory((com.sforce.soap.enterprise.sobject.LoginHistory)__typeMapper.readObject(__in, LoginHistory__typeInfo, com.sforce.soap.enterprise.sobject.LoginHistory.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginHistoryId__typeInfo)) {
      setLoginHistoryId((java.lang.String)__typeMapper.readString(__in, LoginHistoryId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Policy__typeInfo)) {
      setPolicy((java.lang.String)__typeMapper.readString(__in, Policy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Remarks__typeInfo)) {
      setRemarks((java.lang.String)__typeMapper.readString(__in, Remarks__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Resource__typeInfo)) {
      setResource((com.sforce.soap.enterprise.sobject.ConnectedApplication)__typeMapper.readObject(__in, Resource__typeInfo, com.sforce.soap.enterprise.sobject.ConnectedApplication.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ResourceId__typeInfo)) {
      setResourceId((java.lang.String)__typeMapper.readString(__in, ResourceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SourceIp__typeInfo)) {
      setSourceIp((java.lang.String)__typeMapper.readString(__in, SourceIp__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, User__typeInfo)) {
      setUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, User__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, UserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VerificationMethod__typeInfo)) {
      setVerificationMethod((java.lang.String)__typeMapper.readString(__in, VerificationMethod__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VerificationTime__typeInfo)) {
      setVerificationTime((java.util.Calendar)__typeMapper.readObject(__in, VerificationTime__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[VerificationHistory ");
    sb.append(super.toString());
    sb.append(" Activity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Activity)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" EventGroup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventGroup)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LoginGeo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginGeo)+"'\n");
    sb.append(" LoginGeoId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginGeoId)+"'\n");
    sb.append(" LoginHistory=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginHistory)+"'\n");
    sb.append(" LoginHistoryId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginHistoryId)+"'\n");
    sb.append(" Policy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Policy)+"'\n");
    sb.append(" Remarks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Remarks)+"'\n");
    sb.append(" Resource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Resource)+"'\n");
    sb.append(" ResourceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ResourceId)+"'\n");
    sb.append(" SourceIp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceIp)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" User=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append(" VerificationMethod=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VerificationMethod)+"'\n");
    sb.append(" VerificationTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VerificationTime)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}