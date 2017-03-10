package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class TopicAssignment extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public TopicAssignment() {
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
   * element  : Entity of type {urn:sobject.enterprise.soap.sforce.com}Contract
   * java type: com.sforce.soap.enterprise.sobject.Contract
   */
  private static final com.sforce.ws.bind.TypeInfo Entity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Entity","urn:sobject.enterprise.soap.sforce.com","Contract",0,1,true);

  private boolean Entity__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contract Entity;

  public com.sforce.soap.enterprise.sobject.Contract getEntity() {
    return Entity;
  }

  

  public void setEntity(com.sforce.soap.enterprise.sobject.Contract Entity) {
    this.Entity = Entity;
    Entity__is_set = true;
  }
  
  /**
   * element  : EntityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EntityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean EntityId__is_set = false;

  private java.lang.String EntityId;

  public java.lang.String getEntityId() {
    return EntityId;
  }

  

  public void setEntityId(java.lang.String EntityId) {
    this.EntityId = EntityId;
    EntityId__is_set = true;
  }
  
  /**
   * element  : EntityKeyPrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EntityKeyPrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityKeyPrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EntityKeyPrefix__is_set = false;

  private java.lang.String EntityKeyPrefix;

  public java.lang.String getEntityKeyPrefix() {
    return EntityKeyPrefix;
  }

  

  public void setEntityKeyPrefix(java.lang.String EntityKeyPrefix) {
    this.EntityKeyPrefix = EntityKeyPrefix;
    EntityKeyPrefix__is_set = true;
  }
  
  /**
   * element  : EntityType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EntityType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EntityType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EntityType__is_set = false;

  private java.lang.String EntityType;

  public java.lang.String getEntityType() {
    return EntityType;
  }

  

  public void setEntityType(java.lang.String EntityType) {
    this.EntityType = EntityType;
    EntityType__is_set = true;
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
   * element  : Topic of type {urn:sobject.enterprise.soap.sforce.com}Topic
   * java type: com.sforce.soap.enterprise.sobject.Topic
   */
  private static final com.sforce.ws.bind.TypeInfo Topic__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Topic","urn:sobject.enterprise.soap.sforce.com","Topic",0,1,true);

  private boolean Topic__is_set = false;

  private com.sforce.soap.enterprise.sobject.Topic Topic;

  public com.sforce.soap.enterprise.sobject.Topic getTopic() {
    return Topic;
  }

  

  public void setTopic(com.sforce.soap.enterprise.sobject.Topic Topic) {
    this.Topic = Topic;
    Topic__is_set = true;
  }
  
  /**
   * element  : TopicId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TopicId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TopicId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean TopicId__is_set = false;

  private java.lang.String TopicId;

  public java.lang.String getTopicId() {
    return TopicId;
  }

  

  public void setTopicId(java.lang.String TopicId) {
    this.TopicId = TopicId;
    TopicId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "TopicAssignment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Entity__typeInfo, Entity, Entity__is_set);
    __typeMapper.writeString(__out, EntityId__typeInfo, EntityId, EntityId__is_set);
    __typeMapper.writeString(__out, EntityKeyPrefix__typeInfo, EntityKeyPrefix, EntityKeyPrefix__is_set);
    __typeMapper.writeString(__out, EntityType__typeInfo, EntityType, EntityType__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Topic__typeInfo, Topic, Topic__is_set);
    __typeMapper.writeString(__out, TopicId__typeInfo, TopicId, TopicId__is_set);
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
    if (__typeMapper.isElement(__in, Entity__typeInfo)) {
      setEntity((com.sforce.soap.enterprise.sobject.Contract)__typeMapper.readObject(__in, Entity__typeInfo, com.sforce.soap.enterprise.sobject.Contract.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityId__typeInfo)) {
      setEntityId((java.lang.String)__typeMapper.readString(__in, EntityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityKeyPrefix__typeInfo)) {
      setEntityKeyPrefix((java.lang.String)__typeMapper.readString(__in, EntityKeyPrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EntityType__typeInfo)) {
      setEntityType((java.lang.String)__typeMapper.readString(__in, EntityType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Topic__typeInfo)) {
      setTopic((com.sforce.soap.enterprise.sobject.Topic)__typeMapper.readObject(__in, Topic__typeInfo, com.sforce.soap.enterprise.sobject.Topic.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicId__typeInfo)) {
      setTopicId((java.lang.String)__typeMapper.readString(__in, TopicId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[TopicAssignment ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Entity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Entity)+"'\n");
    sb.append(" EntityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityId)+"'\n");
    sb.append(" EntityKeyPrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityKeyPrefix)+"'\n");
    sb.append(" EntityType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EntityType)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Topic=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Topic)+"'\n");
    sb.append(" TopicId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}