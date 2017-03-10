package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserRole extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserRole() {
  }
    
  
  /**
   * element  : CaseAccessForAccountOwner of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CaseAccessForAccountOwner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CaseAccessForAccountOwner","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CaseAccessForAccountOwner__is_set = false;

  private java.lang.String CaseAccessForAccountOwner;

  public java.lang.String getCaseAccessForAccountOwner() {
    return CaseAccessForAccountOwner;
  }

  

  public void setCaseAccessForAccountOwner(java.lang.String CaseAccessForAccountOwner) {
    this.CaseAccessForAccountOwner = CaseAccessForAccountOwner;
    CaseAccessForAccountOwner__is_set = true;
  }
  
  /**
   * element  : ContactAccessForAccountOwner of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContactAccessForAccountOwner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContactAccessForAccountOwner","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ContactAccessForAccountOwner__is_set = false;

  private java.lang.String ContactAccessForAccountOwner;

  public java.lang.String getContactAccessForAccountOwner() {
    return ContactAccessForAccountOwner;
  }

  

  public void setContactAccessForAccountOwner(java.lang.String ContactAccessForAccountOwner) {
    this.ContactAccessForAccountOwner = ContactAccessForAccountOwner;
    ContactAccessForAccountOwner__is_set = true;
  }
  
  /**
   * element  : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DeveloperName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DeveloperName__is_set = false;

  private java.lang.String DeveloperName;

  public java.lang.String getDeveloperName() {
    return DeveloperName;
  }

  

  public void setDeveloperName(java.lang.String DeveloperName) {
    this.DeveloperName = DeveloperName;
    DeveloperName__is_set = true;
  }
  
  /**
   * element  : ForecastUserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ForecastUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ForecastUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ForecastUserId__is_set = false;

  private java.lang.String ForecastUserId;

  public java.lang.String getForecastUserId() {
    return ForecastUserId;
  }

  

  public void setForecastUserId(java.lang.String ForecastUserId) {
    this.ForecastUserId = ForecastUserId;
    ForecastUserId__is_set = true;
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
   * element  : MayForecastManagerShare of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MayForecastManagerShare__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MayForecastManagerShare","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MayForecastManagerShare__is_set = false;

  private java.lang.Boolean MayForecastManagerShare;

  public java.lang.Boolean getMayForecastManagerShare() {
    return MayForecastManagerShare;
  }

  

  public void setMayForecastManagerShare(java.lang.Boolean MayForecastManagerShare) {
    this.MayForecastManagerShare = MayForecastManagerShare;
    MayForecastManagerShare__is_set = true;
  }
  
  /**
   * element  : Name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Name__is_set = false;

  private java.lang.String Name;

  public java.lang.String getName() {
    return Name;
  }

  

  public void setName(java.lang.String Name) {
    this.Name = Name;
    Name__is_set = true;
  }
  
  /**
   * element  : OpportunityAccessForAccountOwner of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityAccessForAccountOwner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityAccessForAccountOwner","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean OpportunityAccessForAccountOwner__is_set = false;

  private java.lang.String OpportunityAccessForAccountOwner;

  public java.lang.String getOpportunityAccessForAccountOwner() {
    return OpportunityAccessForAccountOwner;
  }

  

  public void setOpportunityAccessForAccountOwner(java.lang.String OpportunityAccessForAccountOwner) {
    this.OpportunityAccessForAccountOwner = OpportunityAccessForAccountOwner;
    OpportunityAccessForAccountOwner__is_set = true;
  }
  
  /**
   * element  : ParentRoleId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentRoleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentRoleId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentRoleId__is_set = false;

  private java.lang.String ParentRoleId;

  public java.lang.String getParentRoleId() {
    return ParentRoleId;
  }

  

  public void setParentRoleId(java.lang.String ParentRoleId) {
    this.ParentRoleId = ParentRoleId;
    ParentRoleId__is_set = true;
  }
  
  /**
   * element  : PortalAccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PortalAccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PortalAccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PortalAccountId__is_set = false;

  private java.lang.String PortalAccountId;

  public java.lang.String getPortalAccountId() {
    return PortalAccountId;
  }

  

  public void setPortalAccountId(java.lang.String PortalAccountId) {
    this.PortalAccountId = PortalAccountId;
    PortalAccountId__is_set = true;
  }
  
  /**
   * element  : PortalAccountOwnerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PortalAccountOwnerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PortalAccountOwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PortalAccountOwnerId__is_set = false;

  private java.lang.String PortalAccountOwnerId;

  public java.lang.String getPortalAccountOwnerId() {
    return PortalAccountOwnerId;
  }

  

  public void setPortalAccountOwnerId(java.lang.String PortalAccountOwnerId) {
    this.PortalAccountOwnerId = PortalAccountOwnerId;
    PortalAccountOwnerId__is_set = true;
  }
  
  /**
   * element  : PortalRole of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PortalRole__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PortalRole","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PortalRole__is_set = false;

  private java.lang.String PortalRole;

  public java.lang.String getPortalRole() {
    return PortalRole;
  }

  

  public void setPortalRole(java.lang.String PortalRole) {
    this.PortalRole = PortalRole;
    PortalRole__is_set = true;
  }
  
  /**
   * element  : PortalType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PortalType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PortalType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PortalType__is_set = false;

  private java.lang.String PortalType;

  public java.lang.String getPortalType() {
    return PortalType;
  }

  

  public void setPortalType(java.lang.String PortalType) {
    this.PortalType = PortalType;
    PortalType__is_set = true;
  }
  
  /**
   * element  : RollupDescription of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RollupDescription__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RollupDescription","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RollupDescription__is_set = false;

  private java.lang.String RollupDescription;

  public java.lang.String getRollupDescription() {
    return RollupDescription;
  }

  

  public void setRollupDescription(java.lang.String RollupDescription) {
    this.RollupDescription = RollupDescription;
    RollupDescription__is_set = true;
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
   * element  : Users of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Users__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Users","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Users__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Users;

  public com.sforce.soap.enterprise.QueryResult getUsers() {
    return Users;
  }

  

  public void setUsers(com.sforce.soap.enterprise.QueryResult Users) {
    this.Users = Users;
    Users__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserRole");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, CaseAccessForAccountOwner__typeInfo, CaseAccessForAccountOwner, CaseAccessForAccountOwner__is_set);
    __typeMapper.writeString(__out, ContactAccessForAccountOwner__typeInfo, ContactAccessForAccountOwner, ContactAccessForAccountOwner__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeString(__out, ForecastUserId__typeInfo, ForecastUserId, ForecastUserId__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, MayForecastManagerShare__typeInfo, MayForecastManagerShare, MayForecastManagerShare__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, OpportunityAccessForAccountOwner__typeInfo, OpportunityAccessForAccountOwner, OpportunityAccessForAccountOwner__is_set);
    __typeMapper.writeString(__out, ParentRoleId__typeInfo, ParentRoleId, ParentRoleId__is_set);
    __typeMapper.writeString(__out, PortalAccountId__typeInfo, PortalAccountId, PortalAccountId__is_set);
    __typeMapper.writeString(__out, PortalAccountOwnerId__typeInfo, PortalAccountOwnerId, PortalAccountOwnerId__is_set);
    __typeMapper.writeString(__out, PortalRole__typeInfo, PortalRole, PortalRole__is_set);
    __typeMapper.writeString(__out, PortalType__typeInfo, PortalType, PortalType__is_set);
    __typeMapper.writeString(__out, RollupDescription__typeInfo, RollupDescription, RollupDescription__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Users__typeInfo, Users, Users__is_set);
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
    if (__typeMapper.isElement(__in, CaseAccessForAccountOwner__typeInfo)) {
      setCaseAccessForAccountOwner((java.lang.String)__typeMapper.readString(__in, CaseAccessForAccountOwner__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContactAccessForAccountOwner__typeInfo)) {
      setContactAccessForAccountOwner((java.lang.String)__typeMapper.readString(__in, ContactAccessForAccountOwner__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ForecastUserId__typeInfo)) {
      setForecastUserId((java.lang.String)__typeMapper.readString(__in, ForecastUserId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, MayForecastManagerShare__typeInfo)) {
      setMayForecastManagerShare((java.lang.Boolean)__typeMapper.readObject(__in, MayForecastManagerShare__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityAccessForAccountOwner__typeInfo)) {
      setOpportunityAccessForAccountOwner((java.lang.String)__typeMapper.readString(__in, OpportunityAccessForAccountOwner__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentRoleId__typeInfo)) {
      setParentRoleId((java.lang.String)__typeMapper.readString(__in, ParentRoleId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PortalAccountId__typeInfo)) {
      setPortalAccountId((java.lang.String)__typeMapper.readString(__in, PortalAccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PortalAccountOwnerId__typeInfo)) {
      setPortalAccountOwnerId((java.lang.String)__typeMapper.readString(__in, PortalAccountOwnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PortalRole__typeInfo)) {
      setPortalRole((java.lang.String)__typeMapper.readString(__in, PortalRole__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PortalType__typeInfo)) {
      setPortalType((java.lang.String)__typeMapper.readString(__in, PortalType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RollupDescription__typeInfo)) {
      setRollupDescription((java.lang.String)__typeMapper.readString(__in, RollupDescription__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Users__typeInfo)) {
      setUsers((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Users__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserRole ");
    sb.append(super.toString());
    sb.append(" CaseAccessForAccountOwner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CaseAccessForAccountOwner)+"'\n");
    sb.append(" ContactAccessForAccountOwner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContactAccessForAccountOwner)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" ForecastUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ForecastUserId)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MayForecastManagerShare=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MayForecastManagerShare)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" OpportunityAccessForAccountOwner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityAccessForAccountOwner)+"'\n");
    sb.append(" ParentRoleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentRoleId)+"'\n");
    sb.append(" PortalAccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PortalAccountId)+"'\n");
    sb.append(" PortalAccountOwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PortalAccountOwnerId)+"'\n");
    sb.append(" PortalRole=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PortalRole)+"'\n");
    sb.append(" PortalType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PortalType)+"'\n");
    sb.append(" RollupDescription=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RollupDescription)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Users=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Users)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}