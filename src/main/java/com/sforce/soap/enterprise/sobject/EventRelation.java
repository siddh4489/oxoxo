package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class EventRelation extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public EventRelation() {
  }
    
  
  /**
   * element  : Account of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Account__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Account","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean Account__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account Account;

  public com.sforce.soap.enterprise.sobject.Account getAccount() {
    return Account;
  }

  

  public void setAccount(com.sforce.soap.enterprise.sobject.Account Account) {
    this.Account = Account;
    Account__is_set = true;
  }
  
  /**
   * element  : AccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AccountId__is_set = false;

  private java.lang.String AccountId;

  public java.lang.String getAccountId() {
    return AccountId;
  }

  

  public void setAccountId(java.lang.String AccountId) {
    this.AccountId = AccountId;
    AccountId__is_set = true;
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
   * element  : Event of type {urn:sobject.enterprise.soap.sforce.com}Event
   * java type: com.sforce.soap.enterprise.sobject.Event
   */
  private static final com.sforce.ws.bind.TypeInfo Event__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Event","urn:sobject.enterprise.soap.sforce.com","Event",0,1,true);

  private boolean Event__is_set = false;

  private com.sforce.soap.enterprise.sobject.Event Event;

  public com.sforce.soap.enterprise.sobject.Event getEvent() {
    return Event;
  }

  

  public void setEvent(com.sforce.soap.enterprise.sobject.Event Event) {
    this.Event = Event;
    Event__is_set = true;
  }
  
  /**
   * element  : EventId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EventId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EventId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean EventId__is_set = false;

  private java.lang.String EventId;

  public java.lang.String getEventId() {
    return EventId;
  }

  

  public void setEventId(java.lang.String EventId) {
    this.EventId = EventId;
    EventId__is_set = true;
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
   * element  : IsInvitee of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsInvitee__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsInvitee","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsInvitee__is_set = false;

  private java.lang.Boolean IsInvitee;

  public java.lang.Boolean getIsInvitee() {
    return IsInvitee;
  }

  

  public void setIsInvitee(java.lang.Boolean IsInvitee) {
    this.IsInvitee = IsInvitee;
    IsInvitee__is_set = true;
  }
  
  /**
   * element  : IsParent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsParent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsParent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsParent__is_set = false;

  private java.lang.Boolean IsParent;

  public java.lang.Boolean getIsParent() {
    return IsParent;
  }

  

  public void setIsParent(java.lang.Boolean IsParent) {
    this.IsParent = IsParent;
    IsParent__is_set = true;
  }
  
  /**
   * element  : IsWhat of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsWhat__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsWhat","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsWhat__is_set = false;

  private java.lang.Boolean IsWhat;

  public java.lang.Boolean getIsWhat() {
    return IsWhat;
  }

  

  public void setIsWhat(java.lang.Boolean IsWhat) {
    this.IsWhat = IsWhat;
    IsWhat__is_set = true;
  }
  
  /**
   * element  : LastModifiedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean LastModifiedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User LastModifiedBy;

  public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
    return LastModifiedBy;
  }

  

  public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User LastModifiedBy) {
    this.LastModifiedBy = LastModifiedBy;
    LastModifiedBy__is_set = true;
  }
  
  /**
   * element  : LastModifiedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastModifiedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastModifiedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LastModifiedById__is_set = false;

  private java.lang.String LastModifiedById;

  public java.lang.String getLastModifiedById() {
    return LastModifiedById;
  }

  

  public void setLastModifiedById(java.lang.String LastModifiedById) {
    this.LastModifiedById = LastModifiedById;
    LastModifiedById__is_set = true;
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
   * element  : RespondedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo RespondedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RespondedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean RespondedDate__is_set = false;

  private java.util.Calendar RespondedDate;

  public java.util.Calendar getRespondedDate() {
    return RespondedDate;
  }

  

  public void setRespondedDate(java.util.Calendar RespondedDate) {
    this.RespondedDate = RespondedDate;
    RespondedDate__is_set = true;
  }
  
  /**
   * element  : Response of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Response__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Response","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Response__is_set = false;

  private java.lang.String Response;

  public java.lang.String getResponse() {
    return Response;
  }

  

  public void setResponse(java.lang.String Response) {
    this.Response = Response;
    Response__is_set = true;
  }
  
  /**
   * element  : Status of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Status__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Status__is_set = false;

  private java.lang.String Status;

  public java.lang.String getStatus() {
    return Status;
  }

  

  public void setStatus(java.lang.String Status) {
    this.Status = Status;
    Status__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "EventRelation");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Event__typeInfo, Event, Event__is_set);
    __typeMapper.writeString(__out, EventId__typeInfo, EventId, EventId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsInvitee__typeInfo, IsInvitee, IsInvitee__is_set);
    __typeMapper.writeObject(__out, IsParent__typeInfo, IsParent, IsParent__is_set);
    __typeMapper.writeObject(__out, IsWhat__typeInfo, IsWhat, IsWhat__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Relation__typeInfo, Relation, Relation__is_set);
    __typeMapper.writeString(__out, RelationId__typeInfo, RelationId, RelationId__is_set);
    __typeMapper.writeObject(__out, RespondedDate__typeInfo, RespondedDate, RespondedDate__is_set);
    __typeMapper.writeString(__out, Response__typeInfo, Response, Response__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
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
    if (__typeMapper.isElement(__in, Account__typeInfo)) {
      setAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Account__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountId__typeInfo)) {
      setAccountId((java.lang.String)__typeMapper.readString(__in, AccountId__typeInfo, java.lang.String.class));
    }
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
    if (__typeMapper.isElement(__in, Event__typeInfo)) {
      setEvent((com.sforce.soap.enterprise.sobject.Event)__typeMapper.readObject(__in, Event__typeInfo, com.sforce.soap.enterprise.sobject.Event.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventId__typeInfo)) {
      setEventId((java.lang.String)__typeMapper.readString(__in, EventId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsInvitee__typeInfo)) {
      setIsInvitee((java.lang.Boolean)__typeMapper.readObject(__in, IsInvitee__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsParent__typeInfo)) {
      setIsParent((java.lang.Boolean)__typeMapper.readObject(__in, IsParent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsWhat__typeInfo)) {
      setIsWhat((java.lang.Boolean)__typeMapper.readObject(__in, IsWhat__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedBy__typeInfo)) {
      setLastModifiedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, LastModifiedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedById__typeInfo)) {
      setLastModifiedById((java.lang.String)__typeMapper.readString(__in, LastModifiedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Relation__typeInfo)) {
      setRelation((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Relation__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RelationId__typeInfo)) {
      setRelationId((java.lang.String)__typeMapper.readString(__in, RelationId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RespondedDate__typeInfo)) {
      setRespondedDate((java.util.Calendar)__typeMapper.readObject(__in, RespondedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Response__typeInfo)) {
      setResponse((java.lang.String)__typeMapper.readString(__in, Response__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[EventRelation ");
    sb.append(super.toString());
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Event=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Event)+"'\n");
    sb.append(" EventId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsInvitee=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsInvitee)+"'\n");
    sb.append(" IsParent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsParent)+"'\n");
    sb.append(" IsWhat=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsWhat)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Relation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Relation)+"'\n");
    sb.append(" RelationId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RelationId)+"'\n");
    sb.append(" RespondedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RespondedDate)+"'\n");
    sb.append(" Response=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Response)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}