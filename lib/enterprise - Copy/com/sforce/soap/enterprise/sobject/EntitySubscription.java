package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EntitySubscription extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EntitySubscription() {
  }
    
  
  /**
   * element  : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean CreatedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name CreatedBy;

  public com.sforce.soap.enterprise.sobject.Name getCreatedBy() {
    return CreatedBy;
  }

  

  public void setCreatedBy(com.sforce.soap.enterprise.sobject.Name CreatedBy) {
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
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name Parent;

  public com.sforce.soap.enterprise.sobject.Name getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.Name Parent) {
    this.Parent = Parent;
    Parent__is_set = true;
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
   * element  : Subscriber of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Subscriber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Subscriber","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Subscriber__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Subscriber;

  public com.sforce.soap.enterprise.sobject.User getSubscriber() {
    return Subscriber;
  }

  

  public void setSubscriber(com.sforce.soap.enterprise.sobject.User Subscriber) {
    this.Subscriber = Subscriber;
    Subscriber__is_set = true;
  }
  
  /**
   * element  : SubscriberId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SubscriberId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SubscriberId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SubscriberId__is_set = false;

  private java.lang.String SubscriberId;

  public java.lang.String getSubscriberId() {
    return SubscriberId;
  }

  

  public void setSubscriberId(java.lang.String SubscriberId) {
    this.SubscriberId = SubscriberId;
    SubscriberId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EntitySubscription");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, Subscriber__typeInfo, Subscriber, Subscriber__is_set);
    __typeMapper.writeString(__out, SubscriberId__typeInfo, SubscriberId, SubscriberId__is_set);
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
      setCreatedBy((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
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
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Subscriber__typeInfo)) {
      setSubscriber((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Subscriber__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscriberId__typeInfo)) {
      setSubscriberId((java.lang.String)__typeMapper.readString(__in, SubscriberId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EntitySubscription ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" Subscriber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subscriber)+"'\n");
    sb.append(" SubscriberId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubscriberId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}