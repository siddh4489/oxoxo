package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class LoginIp extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public LoginIp() {
  }
    
  
  /**
   * element  : ChallengeMethod of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ChallengeMethod__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ChallengeMethod","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ChallengeMethod__is_set = false;

  private java.lang.String ChallengeMethod;

  public java.lang.String getChallengeMethod() {
    return ChallengeMethod;
  }

  

  public void setChallengeMethod(java.lang.String ChallengeMethod) {
    this.ChallengeMethod = ChallengeMethod;
    ChallengeMethod__is_set = true;
  }
  
  /**
   * element  : ChallengeSentDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ChallengeSentDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ChallengeSentDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ChallengeSentDate__is_set = false;

  private java.util.Calendar ChallengeSentDate;

  public java.util.Calendar getChallengeSentDate() {
    return ChallengeSentDate;
  }

  

  public void setChallengeSentDate(java.util.Calendar ChallengeSentDate) {
    this.ChallengeSentDate = ChallengeSentDate;
    ChallengeSentDate__is_set = true;
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
   * element  : IsAuthenticated of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAuthenticated__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAuthenticated","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAuthenticated__is_set = false;

  private java.lang.Boolean IsAuthenticated;

  public java.lang.Boolean getIsAuthenticated() {
    return IsAuthenticated;
  }

  

  public void setIsAuthenticated(java.lang.Boolean IsAuthenticated) {
    this.IsAuthenticated = IsAuthenticated;
    IsAuthenticated__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "LoginIp");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ChallengeMethod__typeInfo, ChallengeMethod, ChallengeMethod__is_set);
    __typeMapper.writeObject(__out, ChallengeSentDate__typeInfo, ChallengeSentDate, ChallengeSentDate__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsAuthenticated__typeInfo, IsAuthenticated, IsAuthenticated__is_set);
    __typeMapper.writeString(__out, SourceIp__typeInfo, SourceIp, SourceIp__is_set);
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
    if (__typeMapper.isElement(__in, ChallengeMethod__typeInfo)) {
      setChallengeMethod((java.lang.String)__typeMapper.readString(__in, ChallengeMethod__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ChallengeSentDate__typeInfo)) {
      setChallengeSentDate((java.util.Calendar)__typeMapper.readObject(__in, ChallengeSentDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAuthenticated__typeInfo)) {
      setIsAuthenticated((java.lang.Boolean)__typeMapper.readObject(__in, IsAuthenticated__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SourceIp__typeInfo)) {
      setSourceIp((java.lang.String)__typeMapper.readString(__in, SourceIp__typeInfo, java.lang.String.class));
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
    sb.append("[LoginIp ");
    sb.append(super.toString());
    sb.append(" ChallengeMethod=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ChallengeMethod)+"'\n");
    sb.append(" ChallengeSentDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ChallengeSentDate)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsAuthenticated=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAuthenticated)+"'\n");
    sb.append(" SourceIp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceIp)+"'\n");
    sb.append(" Users=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Users)+"'\n");
    sb.append(" UsersId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsersId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}