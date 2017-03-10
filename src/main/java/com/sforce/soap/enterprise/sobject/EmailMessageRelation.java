package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EmailMessageRelation extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EmailMessageRelation() {
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
   * element  : EmailMessage of type {urn:sobject.enterprise.soap.sforce.com}EmailMessage
   * java type: com.sforce.soap.enterprise.sobject.EmailMessage
   */
  private static final com.sforce.ws.bind.TypeInfo EmailMessage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailMessage","urn:sobject.enterprise.soap.sforce.com","EmailMessage",0,1,true);

  private boolean EmailMessage__is_set = false;

  private com.sforce.soap.enterprise.sobject.EmailMessage EmailMessage;

  public com.sforce.soap.enterprise.sobject.EmailMessage getEmailMessage() {
    return EmailMessage;
  }

  

  public void setEmailMessage(com.sforce.soap.enterprise.sobject.EmailMessage EmailMessage) {
    this.EmailMessage = EmailMessage;
    EmailMessage__is_set = true;
  }
  
  /**
   * element  : EmailMessageId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EmailMessageId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailMessageId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean EmailMessageId__is_set = false;

  private java.lang.String EmailMessageId;

  public java.lang.String getEmailMessageId() {
    return EmailMessageId;
  }

  

  public void setEmailMessageId(java.lang.String EmailMessageId) {
    this.EmailMessageId = EmailMessageId;
    EmailMessageId__is_set = true;
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
   * element  : Relation of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo Relation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Relation","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean Relation__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name Relation;

  public com.sforce.soap.enterprise.sobject.Name getRelation() {
    return Relation;
  }

  

  public void setRelation(com.sforce.soap.enterprise.sobject.Name Relation) {
    this.Relation = Relation;
    Relation__is_set = true;
  }
  
  /**
   * element  : RelationAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelationAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelationAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RelationAddress__is_set = false;

  private java.lang.String RelationAddress;

  public java.lang.String getRelationAddress() {
    return RelationAddress;
  }

  

  public void setRelationAddress(java.lang.String RelationAddress) {
    this.RelationAddress = RelationAddress;
    RelationAddress__is_set = true;
  }
  
  /**
   * element  : RelationId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelationId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelationId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RelationId__is_set = false;

  private java.lang.String RelationId;

  public java.lang.String getRelationId() {
    return RelationId;
  }

  

  public void setRelationId(java.lang.String RelationId) {
    this.RelationId = RelationId;
    RelationId__is_set = true;
  }
  
  /**
   * element  : RelationObjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelationObjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelationObjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RelationObjectType__is_set = false;

  private java.lang.String RelationObjectType;

  public java.lang.String getRelationObjectType() {
    return RelationObjectType;
  }

  

  public void setRelationObjectType(java.lang.String RelationObjectType) {
    this.RelationObjectType = RelationObjectType;
    RelationObjectType__is_set = true;
  }
  
  /**
   * element  : RelationType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RelationType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RelationType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RelationType__is_set = false;

  private java.lang.String RelationType;

  public java.lang.String getRelationType() {
    return RelationType;
  }

  

  public void setRelationType(java.lang.String RelationType) {
    this.RelationType = RelationType;
    RelationType__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EmailMessageRelation");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, EmailMessage__typeInfo, EmailMessage, EmailMessage__is_set);
    __typeMapper.writeString(__out, EmailMessageId__typeInfo, EmailMessageId, EmailMessageId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, Relation__typeInfo, Relation, Relation__is_set);
    __typeMapper.writeString(__out, RelationAddress__typeInfo, RelationAddress, RelationAddress__is_set);
    __typeMapper.writeString(__out, RelationId__typeInfo, RelationId, RelationId__is_set);
    __typeMapper.writeString(__out, RelationObjectType__typeInfo, RelationObjectType, RelationObjectType__is_set);
    __typeMapper.writeString(__out, RelationType__typeInfo, RelationType, RelationType__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
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
    if (__typeMapper.isElement(__in, EmailMessage__typeInfo)) {
      setEmailMessage((com.sforce.soap.enterprise.sobject.EmailMessage)__typeMapper.readObject(__in, EmailMessage__typeInfo, com.sforce.soap.enterprise.sobject.EmailMessage.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailMessageId__typeInfo)) {
      setEmailMessageId((java.lang.String)__typeMapper.readString(__in, EmailMessageId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Relation__typeInfo)) {
      setRelation((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Relation__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationAddress__typeInfo)) {
      setRelationAddress((java.lang.String)__typeMapper.readString(__in, RelationAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationId__typeInfo)) {
      setRelationId((java.lang.String)__typeMapper.readString(__in, RelationId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationObjectType__typeInfo)) {
      setRelationObjectType((java.lang.String)__typeMapper.readString(__in, RelationObjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationType__typeInfo)) {
      setRelationType((java.lang.String)__typeMapper.readString(__in, RelationType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EmailMessageRelation ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" EmailMessage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailMessage)+"'\n");
    sb.append(" EmailMessageId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailMessageId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Relation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Relation)+"'\n");
    sb.append(" RelationAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationAddress)+"'\n");
    sb.append(" RelationId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationId)+"'\n");
    sb.append(" RelationObjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationObjectType)+"'\n");
    sb.append(" RelationType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationType)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}