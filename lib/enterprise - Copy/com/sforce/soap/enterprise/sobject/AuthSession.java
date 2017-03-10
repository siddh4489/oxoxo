package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class AuthSession extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public AuthSession() {
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
   * element  : IsCurrent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCurrent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCurrent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCurrent__is_set = false;

  private java.lang.Boolean IsCurrent;

  public java.lang.Boolean getIsCurrent() {
    return IsCurrent;
  }

  

  public void setIsCurrent(java.lang.Boolean IsCurrent) {
    this.IsCurrent = IsCurrent;
    IsCurrent__is_set = true;
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
   * element  : LoginType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LoginType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LoginType__is_set = false;

  private java.lang.String LoginType;

  public java.lang.String getLoginType() {
    return LoginType;
  }

  

  public void setLoginType(java.lang.String LoginType) {
    this.LoginType = LoginType;
    LoginType__is_set = true;
  }
  
  /**
   * element  : LogoutUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LogoutUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogoutUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LogoutUrl__is_set = false;

  private java.lang.String LogoutUrl;

  public java.lang.String getLogoutUrl() {
    return LogoutUrl;
  }

  

  public void setLogoutUrl(java.lang.String LogoutUrl) {
    this.LogoutUrl = LogoutUrl;
    LogoutUrl__is_set = true;
  }
  
  /**
   * element  : NumSecondsValid of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumSecondsValid__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumSecondsValid","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumSecondsValid__is_set = false;

  private java.lang.Integer NumSecondsValid;

  public java.lang.Integer getNumSecondsValid() {
    return NumSecondsValid;
  }

  

  public void setNumSecondsValid(java.lang.Integer NumSecondsValid) {
    this.NumSecondsValid = NumSecondsValid;
    NumSecondsValid__is_set = true;
  }
  
  /**
   * element  : ParentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentId__is_set = false;

  private java.lang.String ParentId;

  public java.lang.String getParentId() {
    return ParentId;
  }

  

  public void setParentId(java.lang.String ParentId) {
    this.ParentId = ParentId;
    ParentId__is_set = true;
  }
  
  /**
   * element  : SessionSecurityLevel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SessionSecurityLevel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SessionSecurityLevel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SessionSecurityLevel__is_set = false;

  private java.lang.String SessionSecurityLevel;

  public java.lang.String getSessionSecurityLevel() {
    return SessionSecurityLevel;
  }

  

  public void setSessionSecurityLevel(java.lang.String SessionSecurityLevel) {
    this.SessionSecurityLevel = SessionSecurityLevel;
    SessionSecurityLevel__is_set = true;
  }
  
  /**
   * element  : SessionType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SessionType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SessionType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SessionType__is_set = false;

  private java.lang.String SessionType;

  public java.lang.String getSessionType() {
    return SessionType;
  }

  

  public void setSessionType(java.lang.String SessionType) {
    this.SessionType = SessionType;
    SessionType__is_set = true;
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
   * element  : UserType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UserType__is_set = false;

  private java.lang.String UserType;

  public java.lang.String getUserType() {
    return UserType;
  }

  

  public void setUserType(java.lang.String UserType) {
    this.UserType = UserType;
    UserType__is_set = true;
  }
  
  /**
   * element  : Users of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Users__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Users","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Users__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Users;

  public com.sforce.soap.enterprise.sobject.User getUsers() {
    return Users;
  }

  

  public void setUsers(com.sforce.soap.enterprise.sobject.User Users) {
    this.Users = Users;
    Users__is_set = true;
  }
  
  /**
   * element  : UsersId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UsersId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsersId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UsersId__is_set = false;

  private java.lang.String UsersId;

  public java.lang.String getUsersId() {
    return UsersId;
  }

  

  public void setUsersId(java.lang.String UsersId) {
    this.UsersId = UsersId;
    UsersId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AuthSession");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsCurrent__typeInfo, IsCurrent, IsCurrent__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LoginGeo__typeInfo, LoginGeo, LoginGeo__is_set);
    __typeMapper.writeString(__out, LoginGeoId__typeInfo, LoginGeoId, LoginGeoId__is_set);
    __typeMapper.writeObject(__out, LoginHistory__typeInfo, LoginHistory, LoginHistory__is_set);
    __typeMapper.writeString(__out, LoginHistoryId__typeInfo, LoginHistoryId, LoginHistoryId__is_set);
    __typeMapper.writeString(__out, LoginType__typeInfo, LoginType, LoginType__is_set);
    __typeMapper.writeString(__out, LogoutUrl__typeInfo, LogoutUrl, LogoutUrl__is_set);
    __typeMapper.writeObject(__out, NumSecondsValid__typeInfo, NumSecondsValid, NumSecondsValid__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeString(__out, SessionSecurityLevel__typeInfo, SessionSecurityLevel, SessionSecurityLevel__is_set);
    __typeMapper.writeString(__out, SessionType__typeInfo, SessionType, SessionType__is_set);
    __typeMapper.writeString(__out, SourceIp__typeInfo, SourceIp, SourceIp__is_set);
    __typeMapper.writeString(__out, UserType__typeInfo, UserType, UserType__is_set);
    __typeMapper.writeObject(__out, Users__typeInfo, Users, Users__is_set);
    __typeMapper.writeString(__out, UsersId__typeInfo, UsersId, UsersId__is_set);
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
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCurrent__typeInfo)) {
      setIsCurrent((java.lang.Boolean)__typeMapper.readObject(__in, IsCurrent__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LoginType__typeInfo)) {
      setLoginType((java.lang.String)__typeMapper.readString(__in, LoginType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogoutUrl__typeInfo)) {
      setLogoutUrl((java.lang.String)__typeMapper.readString(__in, LogoutUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumSecondsValid__typeInfo)) {
      setNumSecondsValid((java.lang.Integer)__typeMapper.readObject(__in, NumSecondsValid__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SessionSecurityLevel__typeInfo)) {
      setSessionSecurityLevel((java.lang.String)__typeMapper.readString(__in, SessionSecurityLevel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SessionType__typeInfo)) {
      setSessionType((java.lang.String)__typeMapper.readString(__in, SessionType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SourceIp__typeInfo)) {
      setSourceIp((java.lang.String)__typeMapper.readString(__in, SourceIp__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserType__typeInfo)) {
      setUserType((java.lang.String)__typeMapper.readString(__in, UserType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Users__typeInfo)) {
      setUsers((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Users__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsersId__typeInfo)) {
      setUsersId((java.lang.String)__typeMapper.readString(__in, UsersId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AuthSession ");
    sb.append(super.toString());
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsCurrent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCurrent)+"'\n");
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
    sb.append(" LoginType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginType)+"'\n");
    sb.append(" LogoutUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogoutUrl)+"'\n");
    sb.append(" NumSecondsValid=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumSecondsValid)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" SessionSecurityLevel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SessionSecurityLevel)+"'\n");
    sb.append(" SessionType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SessionType)+"'\n");
    sb.append(" SourceIp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceIp)+"'\n");
    sb.append(" UserType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserType)+"'\n");
    sb.append(" Users=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Users)+"'\n");
    sb.append(" UsersId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsersId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}