package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserProvisioningRequest extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserProvisioningRequest() {
  }
    
  
  /**
   * element  : AppName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AppName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AppName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AppName__is_set = false;

  private java.lang.String AppName;

  public java.lang.String getAppName() {
    return AppName;
  }

  

  public void setAppName(java.lang.String AppName) {
    this.AppName = AppName;
    AppName__is_set = true;
  }
  
  /**
   * element  : ApprovalStatus of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApprovalStatus__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApprovalStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ApprovalStatus__is_set = false;

  private java.lang.String ApprovalStatus;

  public java.lang.String getApprovalStatus() {
    return ApprovalStatus;
  }

  

  public void setApprovalStatus(java.lang.String ApprovalStatus) {
    this.ApprovalStatus = ApprovalStatus;
    ApprovalStatus__is_set = true;
  }
  
  /**
   * element  : ConnectedApp of type {urn:sobject.enterprise.soap.sforce.com}ConnectedApplication
   * java type: com.sforce.soap.enterprise.sobject.ConnectedApplication
   */
  private static final com.sforce.ws.bind.TypeInfo ConnectedApp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConnectedApp","urn:sobject.enterprise.soap.sforce.com","ConnectedApplication",0,1,true);

  private boolean ConnectedApp__is_set = false;

  private com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp;

  public com.sforce.soap.enterprise.sobject.ConnectedApplication getConnectedApp() {
    return ConnectedApp;
  }

  

  public void setConnectedApp(com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp) {
    this.ConnectedApp = ConnectedApp;
    ConnectedApp__is_set = true;
  }
  
  /**
   * element  : ConnectedAppId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConnectedAppId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConnectedAppId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ConnectedAppId__is_set = false;

  private java.lang.String ConnectedAppId;

  public java.lang.String getConnectedAppId() {
    return ConnectedAppId;
  }

  

  public void setConnectedAppId(java.lang.String ConnectedAppId) {
    this.ConnectedAppId = ConnectedAppId;
    ConnectedAppId__is_set = true;
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
   * element  : ExternalUserId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalUserId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalUserId__is_set = false;

  private java.lang.String ExternalUserId;

  public java.lang.String getExternalUserId() {
    return ExternalUserId;
  }

  

  public void setExternalUserId(java.lang.String ExternalUserId) {
    this.ExternalUserId = ExternalUserId;
    ExternalUserId__is_set = true;
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
   * element  : Manager of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Manager__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Manager","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Manager__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Manager;

  public com.sforce.soap.enterprise.sobject.User getManager() {
    return Manager;
  }

  

  public void setManager(com.sforce.soap.enterprise.sobject.User Manager) {
    this.Manager = Manager;
    Manager__is_set = true;
  }
  
  /**
   * element  : ManagerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ManagerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ManagerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ManagerId__is_set = false;

  private java.lang.String ManagerId;

  public java.lang.String getManagerId() {
    return ManagerId;
  }

  

  public void setManagerId(java.lang.String ManagerId) {
    this.ManagerId = ManagerId;
    ManagerId__is_set = true;
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
   * element  : Operation of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Operation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Operation","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Operation__is_set = false;

  private java.lang.String Operation;

  public java.lang.String getOperation() {
    return Operation;
  }

  

  public void setOperation(java.lang.String Operation) {
    this.Operation = Operation;
    Operation__is_set = true;
  }
  
  /**
   * element  : Owner of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo Owner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean Owner__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name Owner;

  public com.sforce.soap.enterprise.sobject.Name getOwner() {
    return Owner;
  }

  

  public void setOwner(com.sforce.soap.enterprise.sobject.Name Owner) {
    this.Owner = Owner;
    Owner__is_set = true;
  }
  
  /**
   * element  : OwnerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OwnerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean OwnerId__is_set = false;

  private java.lang.String OwnerId;

  public java.lang.String getOwnerId() {
    return OwnerId;
  }

  

  public void setOwnerId(java.lang.String OwnerId) {
    this.OwnerId = OwnerId;
    OwnerId__is_set = true;
  }
  
  /**
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}UserProvisioningRequest
   * java type: com.sforce.soap.enterprise.sobject.UserProvisioningRequest
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","UserProvisioningRequest",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserProvisioningRequest Parent;

  public com.sforce.soap.enterprise.sobject.UserProvisioningRequest getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.UserProvisioningRequest Parent) {
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
   * element  : ProcessInstances of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessInstances__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessInstances","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ProcessInstances__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ProcessInstances;

  public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
    return ProcessInstances;
  }

  

  public void setProcessInstances(com.sforce.soap.enterprise.QueryResult ProcessInstances) {
    this.ProcessInstances = ProcessInstances;
    ProcessInstances__is_set = true;
  }
  
  /**
   * element  : ProcessSteps of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessSteps__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProcessSteps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ProcessSteps__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ProcessSteps;

  public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
    return ProcessSteps;
  }

  

  public void setProcessSteps(com.sforce.soap.enterprise.QueryResult ProcessSteps) {
    this.ProcessSteps = ProcessSteps;
    ProcessSteps__is_set = true;
  }
  
  /**
   * element  : RetryCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RetryCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RetryCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RetryCount__is_set = false;

  private java.lang.Integer RetryCount;

  public java.lang.Integer getRetryCount() {
    return RetryCount;
  }

  

  public void setRetryCount(java.lang.Integer RetryCount) {
    this.RetryCount = RetryCount;
    RetryCount__is_set = true;
  }
  
  /**
   * element  : SalesforceUser of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo SalesforceUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SalesforceUser","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean SalesforceUser__is_set = false;

  private com.sforce.soap.enterprise.sobject.User SalesforceUser;

  public com.sforce.soap.enterprise.sobject.User getSalesforceUser() {
    return SalesforceUser;
  }

  

  public void setSalesforceUser(com.sforce.soap.enterprise.sobject.User SalesforceUser) {
    this.SalesforceUser = SalesforceUser;
    SalesforceUser__is_set = true;
  }
  
  /**
   * element  : SalesforceUserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SalesforceUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SalesforceUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SalesforceUserId__is_set = false;

  private java.lang.String SalesforceUserId;

  public java.lang.String getSalesforceUserId() {
    return SalesforceUserId;
  }

  

  public void setSalesforceUserId(java.lang.String SalesforceUserId) {
    this.SalesforceUserId = SalesforceUserId;
    SalesforceUserId__is_set = true;
  }
  
  /**
   * element  : ScheduleDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ScheduleDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ScheduleDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ScheduleDate__is_set = false;

  private java.util.Calendar ScheduleDate;

  public java.util.Calendar getScheduleDate() {
    return ScheduleDate;
  }

  

  public void setScheduleDate(java.util.Calendar ScheduleDate) {
    this.ScheduleDate = ScheduleDate;
    ScheduleDate__is_set = true;
  }
  
  /**
   * element  : State of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State__is_set = false;

  private java.lang.String State;

  public java.lang.String getState() {
    return State;
  }

  

  public void setState(java.lang.String State) {
    this.State = State;
    State__is_set = true;
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
   * element  : UserProvAccount of type {urn:sobject.enterprise.soap.sforce.com}UserProvAccount
   * java type: com.sforce.soap.enterprise.sobject.UserProvAccount
   */
  private static final com.sforce.ws.bind.TypeInfo UserProvAccount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserProvAccount","urn:sobject.enterprise.soap.sforce.com","UserProvAccount",0,1,true);

  private boolean UserProvAccount__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserProvAccount UserProvAccount;

  public com.sforce.soap.enterprise.sobject.UserProvAccount getUserProvAccount() {
    return UserProvAccount;
  }

  

  public void setUserProvAccount(com.sforce.soap.enterprise.sobject.UserProvAccount UserProvAccount) {
    this.UserProvAccount = UserProvAccount;
    UserProvAccount__is_set = true;
  }
  
  /**
   * element  : UserProvAccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserProvAccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserProvAccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserProvAccountId__is_set = false;

  private java.lang.String UserProvAccountId;

  public java.lang.String getUserProvAccountId() {
    return UserProvAccountId;
  }

  

  public void setUserProvAccountId(java.lang.String UserProvAccountId) {
    this.UserProvAccountId = UserProvAccountId;
    UserProvAccountId__is_set = true;
  }
  
  /**
   * element  : UserProvConfig of type {urn:sobject.enterprise.soap.sforce.com}UserProvisioningConfig
   * java type: com.sforce.soap.enterprise.sobject.UserProvisioningConfig
   */
  private static final com.sforce.ws.bind.TypeInfo UserProvConfig__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserProvConfig","urn:sobject.enterprise.soap.sforce.com","UserProvisioningConfig",0,1,true);

  private boolean UserProvConfig__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserProvisioningConfig UserProvConfig;

  public com.sforce.soap.enterprise.sobject.UserProvisioningConfig getUserProvConfig() {
    return UserProvConfig;
  }

  

  public void setUserProvConfig(com.sforce.soap.enterprise.sobject.UserProvisioningConfig UserProvConfig) {
    this.UserProvConfig = UserProvConfig;
    UserProvConfig__is_set = true;
  }
  
  /**
   * element  : UserProvConfigId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserProvConfigId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserProvConfigId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserProvConfigId__is_set = false;

  private java.lang.String UserProvConfigId;

  public java.lang.String getUserProvConfigId() {
    return UserProvConfigId;
  }

  

  public void setUserProvConfigId(java.lang.String UserProvConfigId) {
    this.UserProvConfigId = UserProvConfigId;
    UserProvConfigId__is_set = true;
  }
  
  /**
   * element  : UserRecordAccess of type {urn:sobject.enterprise.soap.sforce.com}UserRecordAccess
   * java type: com.sforce.soap.enterprise.sobject.UserRecordAccess
   */
  private static final com.sforce.ws.bind.TypeInfo UserRecordAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserRecordAccess","urn:sobject.enterprise.soap.sforce.com","UserRecordAccess",0,1,true);

  private boolean UserRecordAccess__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess;

  public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
    return UserRecordAccess;
  }

  

  public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess UserRecordAccess) {
    this.UserRecordAccess = UserRecordAccess;
    UserRecordAccess__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserProvisioningRequest");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AppName__typeInfo, AppName, AppName__is_set);
    __typeMapper.writeString(__out, ApprovalStatus__typeInfo, ApprovalStatus, ApprovalStatus__is_set);
    __typeMapper.writeObject(__out, ConnectedApp__typeInfo, ConnectedApp, ConnectedApp__is_set);
    __typeMapper.writeString(__out, ConnectedAppId__typeInfo, ConnectedAppId, ConnectedAppId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, ExternalUserId__typeInfo, ExternalUserId, ExternalUserId__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Manager__typeInfo, Manager, Manager__is_set);
    __typeMapper.writeString(__out, ManagerId__typeInfo, ManagerId, ManagerId__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, Operation__typeInfo, Operation, Operation__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RetryCount__typeInfo, RetryCount, RetryCount__is_set);
    __typeMapper.writeObject(__out, SalesforceUser__typeInfo, SalesforceUser, SalesforceUser__is_set);
    __typeMapper.writeString(__out, SalesforceUserId__typeInfo, SalesforceUserId, SalesforceUserId__is_set);
    __typeMapper.writeObject(__out, ScheduleDate__typeInfo, ScheduleDate, ScheduleDate__is_set);
    __typeMapper.writeString(__out, State__typeInfo, State, State__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UserProvAccount__typeInfo, UserProvAccount, UserProvAccount__is_set);
    __typeMapper.writeString(__out, UserProvAccountId__typeInfo, UserProvAccountId, UserProvAccountId__is_set);
    __typeMapper.writeObject(__out, UserProvConfig__typeInfo, UserProvConfig, UserProvConfig__is_set);
    __typeMapper.writeString(__out, UserProvConfigId__typeInfo, UserProvConfigId, UserProvConfigId__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
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
    if (__typeMapper.isElement(__in, AppName__typeInfo)) {
      setAppName((java.lang.String)__typeMapper.readString(__in, AppName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ApprovalStatus__typeInfo)) {
      setApprovalStatus((java.lang.String)__typeMapper.readString(__in, ApprovalStatus__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConnectedApp__typeInfo)) {
      setConnectedApp((com.sforce.soap.enterprise.sobject.ConnectedApplication)__typeMapper.readObject(__in, ConnectedApp__typeInfo, com.sforce.soap.enterprise.sobject.ConnectedApplication.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConnectedAppId__typeInfo)) {
      setConnectedAppId((java.lang.String)__typeMapper.readString(__in, ConnectedAppId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ExternalUserId__typeInfo)) {
      setExternalUserId((java.lang.String)__typeMapper.readString(__in, ExternalUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Manager__typeInfo)) {
      setManager((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Manager__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ManagerId__typeInfo)) {
      setManagerId((java.lang.String)__typeMapper.readString(__in, ManagerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Operation__typeInfo)) {
      setOperation((java.lang.String)__typeMapper.readString(__in, Operation__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Owner__typeInfo)) {
      setOwner((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Owner__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
      setOwnerId((java.lang.String)__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.UserProvisioningRequest)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.UserProvisioningRequest.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessInstances__typeInfo)) {
      setProcessInstances((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessInstances__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessSteps__typeInfo)) {
      setProcessSteps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ProcessSteps__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RetryCount__typeInfo)) {
      setRetryCount((java.lang.Integer)__typeMapper.readObject(__in, RetryCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SalesforceUser__typeInfo)) {
      setSalesforceUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, SalesforceUser__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SalesforceUserId__typeInfo)) {
      setSalesforceUserId((java.lang.String)__typeMapper.readString(__in, SalesforceUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ScheduleDate__typeInfo)) {
      setScheduleDate((java.util.Calendar)__typeMapper.readObject(__in, ScheduleDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__typeInfo)) {
      setState((java.lang.String)__typeMapper.readString(__in, State__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserProvAccount__typeInfo)) {
      setUserProvAccount((com.sforce.soap.enterprise.sobject.UserProvAccount)__typeMapper.readObject(__in, UserProvAccount__typeInfo, com.sforce.soap.enterprise.sobject.UserProvAccount.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserProvAccountId__typeInfo)) {
      setUserProvAccountId((java.lang.String)__typeMapper.readString(__in, UserProvAccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserProvConfig__typeInfo)) {
      setUserProvConfig((com.sforce.soap.enterprise.sobject.UserProvisioningConfig)__typeMapper.readObject(__in, UserProvConfig__typeInfo, com.sforce.soap.enterprise.sobject.UserProvisioningConfig.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserProvConfigId__typeInfo)) {
      setUserProvConfigId((java.lang.String)__typeMapper.readString(__in, UserProvConfigId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserProvisioningRequest ");
    sb.append(super.toString());
    sb.append(" AppName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AppName)+"'\n");
    sb.append(" ApprovalStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApprovalStatus)+"'\n");
    sb.append(" ConnectedApp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConnectedApp)+"'\n");
    sb.append(" ConnectedAppId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConnectedAppId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ExternalUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalUserId)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Manager=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Manager)+"'\n");
    sb.append(" ManagerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ManagerId)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Operation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Operation)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RetryCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RetryCount)+"'\n");
    sb.append(" SalesforceUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SalesforceUser)+"'\n");
    sb.append(" SalesforceUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SalesforceUserId)+"'\n");
    sb.append(" ScheduleDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ScheduleDate)+"'\n");
    sb.append(" State=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserProvAccount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserProvAccount)+"'\n");
    sb.append(" UserProvAccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserProvAccountId)+"'\n");
    sb.append(" UserProvConfig=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserProvConfig)+"'\n");
    sb.append(" UserProvConfigId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserProvConfigId)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}