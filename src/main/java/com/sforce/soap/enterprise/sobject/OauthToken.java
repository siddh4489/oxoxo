package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class OauthToken extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public OauthToken() {
  }
    
  
  /**
   * element  : AccessToken of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccessToken__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccessToken","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AccessToken__is_set = false;

  private java.lang.String AccessToken;

  public java.lang.String getAccessToken() {
    return AccessToken;
  }

  

  public void setAccessToken(java.lang.String AccessToken) {
    this.AccessToken = AccessToken;
    AccessToken__is_set = true;
  }
  
  /**
   * element  : AppMenuItem of type {urn:sobject.enterprise.soap.sforce.com}AppMenuItem
   * java type: com.sforce.soap.enterprise.sobject.AppMenuItem
   */
  private static final com.sforce.ws.bind.TypeInfo AppMenuItem__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AppMenuItem","urn:sobject.enterprise.soap.sforce.com","AppMenuItem",0,1,true);

  private boolean AppMenuItem__is_set = false;

  private com.sforce.soap.enterprise.sobject.AppMenuItem AppMenuItem;

  public com.sforce.soap.enterprise.sobject.AppMenuItem getAppMenuItem() {
    return AppMenuItem;
  }

  

  public void setAppMenuItem(com.sforce.soap.enterprise.sobject.AppMenuItem AppMenuItem) {
    this.AppMenuItem = AppMenuItem;
    AppMenuItem__is_set = true;
  }
  
  /**
   * element  : AppMenuItemId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AppMenuItemId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AppMenuItemId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AppMenuItemId__is_set = false;

  private java.lang.String AppMenuItemId;

  public java.lang.String getAppMenuItemId() {
    return AppMenuItemId;
  }

  

  public void setAppMenuItemId(java.lang.String AppMenuItemId) {
    this.AppMenuItemId = AppMenuItemId;
    AppMenuItemId__is_set = true;
  }
  
  /**
   * element  : AppName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AppName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AppName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AppName__is_set = false;

  private java.lang.String AppName;

  public java.lang.String getAppName() {
    return AppName;
  }

  

  public void setAppName(java.lang.String AppName) {
    this.AppName = AppName;
    AppName__is_set = true;
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
   * element  : DeleteToken of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DeleteToken__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeleteToken","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DeleteToken__is_set = false;

  private java.lang.String DeleteToken;

  public java.lang.String getDeleteToken() {
    return DeleteToken;
  }

  

  public void setDeleteToken(java.lang.String DeleteToken) {
    this.DeleteToken = DeleteToken;
    DeleteToken__is_set = true;
  }
  
  /**
   * element  : LastUsedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastUsedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastUsedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastUsedDate__is_set = false;

  private java.util.Calendar LastUsedDate;

  public java.util.Calendar getLastUsedDate() {
    return LastUsedDate;
  }

  

  public void setLastUsedDate(java.util.Calendar LastUsedDate) {
    this.LastUsedDate = LastUsedDate;
    LastUsedDate__is_set = true;
  }
  
  /**
   * element  : RequestToken of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RequestToken__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RequestToken","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RequestToken__is_set = false;

  private java.lang.String RequestToken;

  public java.lang.String getRequestToken() {
    return RequestToken;
  }

  

  public void setRequestToken(java.lang.String RequestToken) {
    this.RequestToken = RequestToken;
    RequestToken__is_set = true;
  }
  
  /**
   * element  : UseCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo UseCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UseCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean UseCount__is_set = false;

  private java.lang.Integer UseCount;

  public java.lang.Integer getUseCount() {
    return UseCount;
  }

  

  public void setUseCount(java.lang.Integer UseCount) {
    this.UseCount = UseCount;
    UseCount__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "OauthToken");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AccessToken__typeInfo, AccessToken, AccessToken__is_set);
    __typeMapper.writeObject(__out, AppMenuItem__typeInfo, AppMenuItem, AppMenuItem__is_set);
    __typeMapper.writeString(__out, AppMenuItemId__typeInfo, AppMenuItemId, AppMenuItemId__is_set);
    __typeMapper.writeString(__out, AppName__typeInfo, AppName, AppName__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, DeleteToken__typeInfo, DeleteToken, DeleteToken__is_set);
    __typeMapper.writeObject(__out, LastUsedDate__typeInfo, LastUsedDate, LastUsedDate__is_set);
    __typeMapper.writeString(__out, RequestToken__typeInfo, RequestToken, RequestToken__is_set);
    __typeMapper.writeObject(__out, UseCount__typeInfo, UseCount, UseCount__is_set);
    __typeMapper.writeObject(__out, User__typeInfo, User, User__is_set);
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
    if (__typeMapper.isElement(__in, AccessToken__typeInfo)) {
      setAccessToken((java.lang.String)__typeMapper.readString(__in, AccessToken__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AppMenuItem__typeInfo)) {
      setAppMenuItem((com.sforce.soap.enterprise.sobject.AppMenuItem)__typeMapper.readObject(__in, AppMenuItem__typeInfo, com.sforce.soap.enterprise.sobject.AppMenuItem.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AppMenuItemId__typeInfo)) {
      setAppMenuItemId((java.lang.String)__typeMapper.readString(__in, AppMenuItemId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AppName__typeInfo)) {
      setAppName((java.lang.String)__typeMapper.readString(__in, AppName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeleteToken__typeInfo)) {
      setDeleteToken((java.lang.String)__typeMapper.readString(__in, DeleteToken__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastUsedDate__typeInfo)) {
      setLastUsedDate((java.util.Calendar)__typeMapper.readObject(__in, LastUsedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RequestToken__typeInfo)) {
      setRequestToken((java.lang.String)__typeMapper.readString(__in, RequestToken__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UseCount__typeInfo)) {
      setUseCount((java.lang.Integer)__typeMapper.readObject(__in, UseCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User__typeInfo)) {
      setUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, User__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, UserId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[OauthToken ");
    sb.append(super.toString());
    sb.append(" AccessToken=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccessToken)+"'\n");
    sb.append(" AppMenuItem=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AppMenuItem)+"'\n");
    sb.append(" AppMenuItemId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AppMenuItemId)+"'\n");
    sb.append(" AppName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AppName)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DeleteToken=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeleteToken)+"'\n");
    sb.append(" LastUsedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastUsedDate)+"'\n");
    sb.append(" RequestToken=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RequestToken)+"'\n");
    sb.append(" UseCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UseCount)+"'\n");
    sb.append(" User=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}