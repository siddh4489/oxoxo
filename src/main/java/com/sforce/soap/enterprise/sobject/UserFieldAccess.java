package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserFieldAccess extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserFieldAccess() {
  }
    
  
  /**
   * element  : DurableId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DurableId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DurableId__is_set = false;

  private java.lang.String DurableId;

  public java.lang.String getDurableId() {
    return DurableId;
  }

  

  public void setDurableId(java.lang.String DurableId) {
    this.DurableId = DurableId;
    DurableId__is_set = true;
  }
  
  /**
   * element  : EntityDefinition of type {urn:sobject.enterprise.soap.sforce.com}EntityDefinition
   * java type: com.sforce.soap.enterprise.sobject.EntityDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo EntityDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityDefinition","urn:sobject.enterprise.soap.sforce.com","EntityDefinition",0,1,true);

  private boolean EntityDefinition__is_set = false;

  private com.sforce.soap.enterprise.sobject.EntityDefinition EntityDefinition;

  public com.sforce.soap.enterprise.sobject.EntityDefinition getEntityDefinition() {
    return EntityDefinition;
  }

  

  public void setEntityDefinition(com.sforce.soap.enterprise.sobject.EntityDefinition EntityDefinition) {
    this.EntityDefinition = EntityDefinition;
    EntityDefinition__is_set = true;
  }
  
  /**
   * element  : EntityDefinitionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EntityDefinitionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EntityDefinitionId__is_set = false;

  private java.lang.String EntityDefinitionId;

  public java.lang.String getEntityDefinitionId() {
    return EntityDefinitionId;
  }

  

  public void setEntityDefinitionId(java.lang.String EntityDefinitionId) {
    this.EntityDefinitionId = EntityDefinitionId;
    EntityDefinitionId__is_set = true;
  }
  
  /**
   * element  : FieldDefinition of type {urn:sobject.enterprise.soap.sforce.com}FieldDefinition
   * java type: com.sforce.soap.enterprise.sobject.FieldDefinition
   */
  private static final com.sforce.ws.bind.TypeInfo FieldDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldDefinition","urn:sobject.enterprise.soap.sforce.com","FieldDefinition",0,1,true);

  private boolean FieldDefinition__is_set = false;

  private com.sforce.soap.enterprise.sobject.FieldDefinition FieldDefinition;

  public com.sforce.soap.enterprise.sobject.FieldDefinition getFieldDefinition() {
    return FieldDefinition;
  }

  

  public void setFieldDefinition(com.sforce.soap.enterprise.sobject.FieldDefinition FieldDefinition) {
    this.FieldDefinition = FieldDefinition;
    FieldDefinition__is_set = true;
  }
  
  /**
   * element  : FieldDefinitionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FieldDefinitionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FieldDefinitionId__is_set = false;

  private java.lang.String FieldDefinitionId;

  public java.lang.String getFieldDefinitionId() {
    return FieldDefinitionId;
  }

  

  public void setFieldDefinitionId(java.lang.String FieldDefinitionId) {
    this.FieldDefinitionId = FieldDefinitionId;
    FieldDefinitionId__is_set = true;
  }
  
  /**
   * element  : IsAccessible of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAccessible__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAccessible","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAccessible__is_set = false;

  private java.lang.Boolean IsAccessible;

  public java.lang.Boolean getIsAccessible() {
    return IsAccessible;
  }

  

  public void setIsAccessible(java.lang.Boolean IsAccessible) {
    this.IsAccessible = IsAccessible;
    IsAccessible__is_set = true;
  }
  
  /**
   * element  : IsCreatable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsCreatable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsCreatable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsCreatable__is_set = false;

  private java.lang.Boolean IsCreatable;

  public java.lang.Boolean getIsCreatable() {
    return IsCreatable;
  }

  

  public void setIsCreatable(java.lang.Boolean IsCreatable) {
    this.IsCreatable = IsCreatable;
    IsCreatable__is_set = true;
  }
  
  /**
   * element  : IsUpdatable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsUpdatable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsUpdatable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsUpdatable__is_set = false;

  private java.lang.Boolean IsUpdatable;

  public java.lang.Boolean getIsUpdatable() {
    return IsUpdatable;
  }

  

  public void setIsUpdatable(java.lang.Boolean IsUpdatable) {
    this.IsUpdatable = IsUpdatable;
    IsUpdatable__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserFieldAccess");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, EntityDefinition__typeInfo, EntityDefinition, EntityDefinition__is_set);
    __typeMapper.writeString(__out, EntityDefinitionId__typeInfo, EntityDefinitionId, EntityDefinitionId__is_set);
    __typeMapper.writeObject(__out, FieldDefinition__typeInfo, FieldDefinition, FieldDefinition__is_set);
    __typeMapper.writeString(__out, FieldDefinitionId__typeInfo, FieldDefinitionId, FieldDefinitionId__is_set);
    __typeMapper.writeObject(__out, IsAccessible__typeInfo, IsAccessible, IsAccessible__is_set);
    __typeMapper.writeObject(__out, IsCreatable__typeInfo, IsCreatable, IsCreatable__is_set);
    __typeMapper.writeObject(__out, IsUpdatable__typeInfo, IsUpdatable, IsUpdatable__is_set);
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
    if (__typeMapper.isElement(__in, DurableId__typeInfo)) {
      setDurableId((java.lang.String)__typeMapper.readString(__in, DurableId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityDefinition__typeInfo)) {
      setEntityDefinition((com.sforce.soap.enterprise.sobject.EntityDefinition)__typeMapper.readObject(__in, EntityDefinition__typeInfo, com.sforce.soap.enterprise.sobject.EntityDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityDefinitionId__typeInfo)) {
      setEntityDefinitionId((java.lang.String)__typeMapper.readString(__in, EntityDefinitionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FieldDefinition__typeInfo)) {
      setFieldDefinition((com.sforce.soap.enterprise.sobject.FieldDefinition)__typeMapper.readObject(__in, FieldDefinition__typeInfo, com.sforce.soap.enterprise.sobject.FieldDefinition.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FieldDefinitionId__typeInfo)) {
      setFieldDefinitionId((java.lang.String)__typeMapper.readString(__in, FieldDefinitionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAccessible__typeInfo)) {
      setIsAccessible((java.lang.Boolean)__typeMapper.readObject(__in, IsAccessible__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCreatable__typeInfo)) {
      setIsCreatable((java.lang.Boolean)__typeMapper.readObject(__in, IsCreatable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsUpdatable__typeInfo)) {
      setIsUpdatable((java.lang.Boolean)__typeMapper.readObject(__in, IsUpdatable__typeInfo, java.lang.Boolean.class));
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
    sb.append("[UserFieldAccess ");
    sb.append(super.toString());
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" EntityDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinition)+"'\n");
    sb.append(" EntityDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinitionId)+"'\n");
    sb.append(" FieldDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldDefinition)+"'\n");
    sb.append(" FieldDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldDefinitionId)+"'\n");
    sb.append(" IsAccessible=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAccessible)+"'\n");
    sb.append(" IsCreatable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCreatable)+"'\n");
    sb.append(" IsUpdatable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsUpdatable)+"'\n");
    sb.append(" User=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}