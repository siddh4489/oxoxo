package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class DataStatistics extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public DataStatistics() {
  }
    
  
  /**
   * element  : ExternalId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalId__is_set = false;

  private java.lang.String ExternalId;

  public java.lang.String getExternalId() {
    return ExternalId;
  }

  

  public void setExternalId(java.lang.String ExternalId) {
    this.ExternalId = ExternalId;
    ExternalId__is_set = true;
  }
  
  /**
   * element  : StatType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StatType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StatType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StatType__is_set = false;

  private java.lang.String StatType;

  public java.lang.String getStatType() {
    return StatType;
  }

  

  public void setStatType(java.lang.String StatType) {
    this.StatType = StatType;
    StatType__is_set = true;
  }
  
  /**
   * element  : StatValue of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo StatValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StatValue","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean StatValue__is_set = false;

  private java.lang.Integer StatValue;

  public java.lang.Integer getStatValue() {
    return StatValue;
  }

  

  public void setStatValue(java.lang.Integer StatValue) {
    this.StatValue = StatValue;
    StatValue__is_set = true;
  }
  
  /**
   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type__is_set = false;

  private java.lang.String Type;

  public java.lang.String getType() {
    return Type;
  }

  

  public void setType(java.lang.String Type) {
    this.Type = Type;
    Type__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "DataStatistics");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ExternalId__typeInfo, ExternalId, ExternalId__is_set);
    __typeMapper.writeString(__out, StatType__typeInfo, StatType, StatType__is_set);
    __typeMapper.writeObject(__out, StatValue__typeInfo, StatValue, StatValue__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
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
    if (__typeMapper.isElement(__in, ExternalId__typeInfo)) {
      setExternalId((java.lang.String)__typeMapper.readString(__in, ExternalId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StatType__typeInfo)) {
      setStatType((java.lang.String)__typeMapper.readString(__in, StatType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StatValue__typeInfo)) {
      setStatValue((java.lang.Integer)__typeMapper.readObject(__in, StatValue__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
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
    sb.append("[DataStatistics ");
    sb.append(super.toString());
    sb.append(" ExternalId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalId)+"'\n");
    sb.append(" StatType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StatType)+"'\n");
    sb.append(" StatValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StatValue)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" User=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}