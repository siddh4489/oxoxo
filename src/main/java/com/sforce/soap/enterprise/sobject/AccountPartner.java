package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class AccountPartner extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public AccountPartner() {
  }
    
  
  /**
   * element  : AccountFrom of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo AccountFrom__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountFrom","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean AccountFrom__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account AccountFrom;

  public com.sforce.soap.enterprise.sobject.Account getAccountFrom() {
    return AccountFrom;
  }

  

  public void setAccountFrom(com.sforce.soap.enterprise.sobject.Account AccountFrom) {
    this.AccountFrom = AccountFrom;
    AccountFrom__is_set = true;
  }
  
  /**
   * element  : AccountFromId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountFromId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountFromId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AccountFromId__is_set = false;

  private java.lang.String AccountFromId;

  public java.lang.String getAccountFromId() {
    return AccountFromId;
  }

  

  public void setAccountFromId(java.lang.String AccountFromId) {
    this.AccountFromId = AccountFromId;
    AccountFromId__is_set = true;
  }
  
  /**
   * element  : AccountTo of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo AccountTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountTo","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean AccountTo__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account AccountTo;

  public com.sforce.soap.enterprise.sobject.Account getAccountTo() {
    return AccountTo;
  }

  

  public void setAccountTo(com.sforce.soap.enterprise.sobject.Account AccountTo) {
    this.AccountTo = AccountTo;
    AccountTo__is_set = true;
  }
  
  /**
   * element  : AccountToId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountToId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountToId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AccountToId__is_set = false;

  private java.lang.String AccountToId;

  public java.lang.String getAccountToId() {
    return AccountToId;
  }

  

  public void setAccountToId(java.lang.String AccountToId) {
    this.AccountToId = AccountToId;
    AccountToId__is_set = true;
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
   * element  : IsPrimary of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsPrimary__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsPrimary","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsPrimary__is_set = false;

  private java.lang.Boolean IsPrimary;

  public java.lang.Boolean getIsPrimary() {
    return IsPrimary;
  }

  

  public void setIsPrimary(java.lang.Boolean IsPrimary) {
    this.IsPrimary = IsPrimary;
    IsPrimary__is_set = true;
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
   * element  : Opportunity of type {urn:sobject.enterprise.soap.sforce.com}Opportunity
   * java type: com.sforce.soap.enterprise.sobject.Opportunity
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunity","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true);

  private boolean Opportunity__is_set = false;

  private com.sforce.soap.enterprise.sobject.Opportunity Opportunity;

  public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity() {
    return Opportunity;
  }

  

  public void setOpportunity(com.sforce.soap.enterprise.sobject.Opportunity Opportunity) {
    this.Opportunity = Opportunity;
    Opportunity__is_set = true;
  }
  
  /**
   * element  : OpportunityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean OpportunityId__is_set = false;

  private java.lang.String OpportunityId;

  public java.lang.String getOpportunityId() {
    return OpportunityId;
  }

  

  public void setOpportunityId(java.lang.String OpportunityId) {
    this.OpportunityId = OpportunityId;
    OpportunityId__is_set = true;
  }
  
  /**
   * element  : ReversePartnerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ReversePartnerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReversePartnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ReversePartnerId__is_set = false;

  private java.lang.String ReversePartnerId;

  public java.lang.String getReversePartnerId() {
    return ReversePartnerId;
  }

  

  public void setReversePartnerId(java.lang.String ReversePartnerId) {
    this.ReversePartnerId = ReversePartnerId;
    ReversePartnerId__is_set = true;
  }
  
  /**
   * element  : Role of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Role__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Role","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Role__is_set = false;

  private java.lang.String Role;

  public java.lang.String getRole() {
    return Role;
  }

  

  public void setRole(java.lang.String Role) {
    this.Role = Role;
    Role__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AccountPartner");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AccountFrom__typeInfo, AccountFrom, AccountFrom__is_set);
    __typeMapper.writeString(__out, AccountFromId__typeInfo, AccountFromId, AccountFromId__is_set);
    __typeMapper.writeObject(__out, AccountTo__typeInfo, AccountTo, AccountTo__is_set);
    __typeMapper.writeString(__out, AccountToId__typeInfo, AccountToId, AccountToId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsPrimary__typeInfo, IsPrimary, IsPrimary__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Opportunity__typeInfo, Opportunity, Opportunity__is_set);
    __typeMapper.writeString(__out, OpportunityId__typeInfo, OpportunityId, OpportunityId__is_set);
    __typeMapper.writeString(__out, ReversePartnerId__typeInfo, ReversePartnerId, ReversePartnerId__is_set);
    __typeMapper.writeString(__out, Role__typeInfo, Role, Role__is_set);
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
    if (__typeMapper.isElement(__in, AccountFrom__typeInfo)) {
      setAccountFrom((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, AccountFrom__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountFromId__typeInfo)) {
      setAccountFromId((java.lang.String)__typeMapper.readString(__in, AccountFromId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountTo__typeInfo)) {
      setAccountTo((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, AccountTo__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountToId__typeInfo)) {
      setAccountToId((java.lang.String)__typeMapper.readString(__in, AccountToId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsPrimary__typeInfo)) {
      setIsPrimary((java.lang.Boolean)__typeMapper.readObject(__in, IsPrimary__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Opportunity__typeInfo)) {
      setOpportunity((com.sforce.soap.enterprise.sobject.Opportunity)__typeMapper.readObject(__in, Opportunity__typeInfo, com.sforce.soap.enterprise.sobject.Opportunity.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityId__typeInfo)) {
      setOpportunityId((java.lang.String)__typeMapper.readString(__in, OpportunityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReversePartnerId__typeInfo)) {
      setReversePartnerId((java.lang.String)__typeMapper.readString(__in, ReversePartnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Role__typeInfo)) {
      setRole((java.lang.String)__typeMapper.readString(__in, Role__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AccountPartner ");
    sb.append(super.toString());
    sb.append(" AccountFrom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountFrom)+"'\n");
    sb.append(" AccountFromId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountFromId)+"'\n");
    sb.append(" AccountTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountTo)+"'\n");
    sb.append(" AccountToId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountToId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsPrimary=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsPrimary)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Opportunity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunity)+"'\n");
    sb.append(" OpportunityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityId)+"'\n");
    sb.append(" ReversePartnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReversePartnerId)+"'\n");
    sb.append(" Role=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Role)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}