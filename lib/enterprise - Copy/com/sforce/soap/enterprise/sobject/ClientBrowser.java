package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ClientBrowser extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ClientBrowser() {
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
   * element  : FullUserAgent of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FullUserAgent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FullUserAgent","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FullUserAgent__is_set = false;

  private java.lang.String FullUserAgent;

  public java.lang.String getFullUserAgent() {
    return FullUserAgent;
  }

  

  public void setFullUserAgent(java.lang.String FullUserAgent) {
    this.FullUserAgent = FullUserAgent;
    FullUserAgent__is_set = true;
  }
  
  /**
   * element  : LastUpdate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastUpdate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastUpdate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastUpdate__is_set = false;

  private java.util.Calendar LastUpdate;

  public java.util.Calendar getLastUpdate() {
    return LastUpdate;
  }

  

  public void setLastUpdate(java.util.Calendar LastUpdate) {
    this.LastUpdate = LastUpdate;
    LastUpdate__is_set = true;
  }
  
  /**
   * element  : ProxyInfo of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProxyInfo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProxyInfo","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ProxyInfo__is_set = false;

  private java.lang.String ProxyInfo;

  public java.lang.String getProxyInfo() {
    return ProxyInfo;
  }

  

  public void setProxyInfo(java.lang.String ProxyInfo) {
    this.ProxyInfo = ProxyInfo;
    ProxyInfo__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ClientBrowser");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, FullUserAgent__typeInfo, FullUserAgent, FullUserAgent__is_set);
    __typeMapper.writeObject(__out, LastUpdate__typeInfo, LastUpdate, LastUpdate__is_set);
    __typeMapper.writeString(__out, ProxyInfo__typeInfo, ProxyInfo, ProxyInfo__is_set);
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
    if (__typeMapper.isElement(__in, FullUserAgent__typeInfo)) {
      setFullUserAgent((java.lang.String)__typeMapper.readString(__in, FullUserAgent__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastUpdate__typeInfo)) {
      setLastUpdate((java.util.Calendar)__typeMapper.readObject(__in, LastUpdate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProxyInfo__typeInfo)) {
      setProxyInfo((java.lang.String)__typeMapper.readString(__in, ProxyInfo__typeInfo, java.lang.String.class));
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
    sb.append("[ClientBrowser ");
    sb.append(super.toString());
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" FullUserAgent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FullUserAgent)+"'\n");
    sb.append(" LastUpdate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastUpdate)+"'\n");
    sb.append(" ProxyInfo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProxyInfo)+"'\n");
    sb.append(" Users=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Users)+"'\n");
    sb.append(" UsersId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsersId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}