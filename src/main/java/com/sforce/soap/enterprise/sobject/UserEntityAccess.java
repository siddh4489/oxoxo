package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserEntityAccess extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserEntityAccess() {
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
   * element  : IsActivateable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsActivateable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsActivateable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsActivateable__is_set = false;

  private java.lang.Boolean IsActivateable;

  public java.lang.Boolean getIsActivateable() {
    return IsActivateable;
  }

  

  public void setIsActivateable(java.lang.Boolean IsActivateable) {
    this.IsActivateable = IsActivateable;
    IsActivateable__is_set = true;
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
   * element  : IsDeletable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDeletable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeletable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDeletable__is_set = false;

  private java.lang.Boolean IsDeletable;

  public java.lang.Boolean getIsDeletable() {
    return IsDeletable;
  }

  

  public void setIsDeletable(java.lang.Boolean IsDeletable) {
    this.IsDeletable = IsDeletable;
    IsDeletable__is_set = true;
  }
  
  /**
   * element  : IsEditable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsEditable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsEditable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsEditable__is_set = false;

  private java.lang.Boolean IsEditable;

  public java.lang.Boolean getIsEditable() {
    return IsEditable;
  }

  

  public void setIsEditable(java.lang.Boolean IsEditable) {
    this.IsEditable = IsEditable;
    IsEditable__is_set = true;
  }
  
  /**
   * element  : IsFlsUpdatable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsFlsUpdatable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsFlsUpdatable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsFlsUpdatable__is_set = false;

  private java.lang.Boolean IsFlsUpdatable;

  public java.lang.Boolean getIsFlsUpdatable() {
    return IsFlsUpdatable;
  }

  

  public void setIsFlsUpdatable(java.lang.Boolean IsFlsUpdatable) {
    this.IsFlsUpdatable = IsFlsUpdatable;
    IsFlsUpdatable__is_set = true;
  }
  
  /**
   * element  : IsMergeable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsMergeable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsMergeable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsMergeable__is_set = false;

  private java.lang.Boolean IsMergeable;

  public java.lang.Boolean getIsMergeable() {
    return IsMergeable;
  }

  

  public void setIsMergeable(java.lang.Boolean IsMergeable) {
    this.IsMergeable = IsMergeable;
    IsMergeable__is_set = true;
  }
  
  /**
   * element  : IsReadable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsReadable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsReadable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsReadable__is_set = false;

  private java.lang.Boolean IsReadable;

  public java.lang.Boolean getIsReadable() {
    return IsReadable;
  }

  

  public void setIsReadable(java.lang.Boolean IsReadable) {
    this.IsReadable = IsReadable;
    IsReadable__is_set = true;
  }
  
  /**
   * element  : IsUndeletable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsUndeletable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsUndeletable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsUndeletable__is_set = false;

  private java.lang.Boolean IsUndeletable;

  public java.lang.Boolean getIsUndeletable() {
    return IsUndeletable;
  }

  

  public void setIsUndeletable(java.lang.Boolean IsUndeletable) {
    this.IsUndeletable = IsUndeletable;
    IsUndeletable__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserEntityAccess");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, EntityDefinition__typeInfo, EntityDefinition, EntityDefinition__is_set);
    __typeMapper.writeString(__out, EntityDefinitionId__typeInfo, EntityDefinitionId, EntityDefinitionId__is_set);
    __typeMapper.writeObject(__out, IsActivateable__typeInfo, IsActivateable, IsActivateable__is_set);
    __typeMapper.writeObject(__out, IsCreatable__typeInfo, IsCreatable, IsCreatable__is_set);
    __typeMapper.writeObject(__out, IsDeletable__typeInfo, IsDeletable, IsDeletable__is_set);
    __typeMapper.writeObject(__out, IsEditable__typeInfo, IsEditable, IsEditable__is_set);
    __typeMapper.writeObject(__out, IsFlsUpdatable__typeInfo, IsFlsUpdatable, IsFlsUpdatable__is_set);
    __typeMapper.writeObject(__out, IsMergeable__typeInfo, IsMergeable, IsMergeable__is_set);
    __typeMapper.writeObject(__out, IsReadable__typeInfo, IsReadable, IsReadable__is_set);
    __typeMapper.writeObject(__out, IsUndeletable__typeInfo, IsUndeletable, IsUndeletable__is_set);
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
    if (__typeMapper.isElement(__in, IsActivateable__typeInfo)) {
      setIsActivateable((java.lang.Boolean)__typeMapper.readObject(__in, IsActivateable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsCreatable__typeInfo)) {
      setIsCreatable((java.lang.Boolean)__typeMapper.readObject(__in, IsCreatable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeletable__typeInfo)) {
      setIsDeletable((java.lang.Boolean)__typeMapper.readObject(__in, IsDeletable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsEditable__typeInfo)) {
      setIsEditable((java.lang.Boolean)__typeMapper.readObject(__in, IsEditable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsFlsUpdatable__typeInfo)) {
      setIsFlsUpdatable((java.lang.Boolean)__typeMapper.readObject(__in, IsFlsUpdatable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsMergeable__typeInfo)) {
      setIsMergeable((java.lang.Boolean)__typeMapper.readObject(__in, IsMergeable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsReadable__typeInfo)) {
      setIsReadable((java.lang.Boolean)__typeMapper.readObject(__in, IsReadable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsUndeletable__typeInfo)) {
      setIsUndeletable((java.lang.Boolean)__typeMapper.readObject(__in, IsUndeletable__typeInfo, java.lang.Boolean.class));
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
    sb.append("[UserEntityAccess ");
    sb.append(super.toString());
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" EntityDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinition)+"'\n");
    sb.append(" EntityDefinitionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityDefinitionId)+"'\n");
    sb.append(" IsActivateable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActivateable)+"'\n");
    sb.append(" IsCreatable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsCreatable)+"'\n");
    sb.append(" IsDeletable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeletable)+"'\n");
    sb.append(" IsEditable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsEditable)+"'\n");
    sb.append(" IsFlsUpdatable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsFlsUpdatable)+"'\n");
    sb.append(" IsMergeable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsMergeable)+"'\n");
    sb.append(" IsReadable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsReadable)+"'\n");
    sb.append(" IsUndeletable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsUndeletable)+"'\n");
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