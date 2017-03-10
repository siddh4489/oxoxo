package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class OpenActivity extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public OpenActivity() {
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
   * element  : ActivityDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ActivityDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean ActivityDate__is_set = false;

  private java.util.Calendar ActivityDate;

  public java.util.Calendar getActivityDate() {
    return ActivityDate;
  }

  

  public void setActivityDate(java.util.Calendar ActivityDate) {
    this.ActivityDate = ActivityDate;
    ActivityDate__is_set = true;
  }
  
  /**
   * element  : ActivitySubtype of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ActivitySubtype__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivitySubtype","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ActivitySubtype__is_set = false;

  private java.lang.String ActivitySubtype;

  public java.lang.String getActivitySubtype() {
    return ActivitySubtype;
  }

  

  public void setActivitySubtype(java.lang.String ActivitySubtype) {
    this.ActivitySubtype = ActivitySubtype;
    ActivitySubtype__is_set = true;
  }
  
  /**
   * element  : ActivityType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ActivityType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ActivityType__is_set = false;

  private java.lang.String ActivityType;

  public java.lang.String getActivityType() {
    return ActivityType;
  }

  

  public void setActivityType(java.lang.String ActivityType) {
    this.ActivityType = ActivityType;
    ActivityType__is_set = true;
  }
  
  /**
   * element  : ActivityWeek_Ending__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ActivityWeek_Ending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityWeek_Ending__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean ActivityWeek_Ending__c__is_set = false;

  private java.util.Calendar ActivityWeek_Ending__c;

  public java.util.Calendar getActivityWeek_Ending__c() {
    return ActivityWeek_Ending__c;
  }

  

  public void setActivityWeek_Ending__c(java.util.Calendar ActivityWeek_Ending__c) {
    this.ActivityWeek_Ending__c = ActivityWeek_Ending__c;
    ActivityWeek_Ending__c__is_set = true;
  }
  
  /**
   * element  : Activity_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Activity_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Activity_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Activity_Notes__c__is_set = false;

  private java.lang.String Activity_Notes__c;

  public java.lang.String getActivity_Notes__c() {
    return Activity_Notes__c;
  }

  

  public void setActivity_Notes__c(java.lang.String Activity_Notes__c) {
    this.Activity_Notes__c = Activity_Notes__c;
    Activity_Notes__c__is_set = true;
  }
  
  /**
   * element  : Activity_Value__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Activity_Value__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Activity_Value__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Activity_Value__c__is_set = false;

  private java.lang.Double Activity_Value__c;

  public java.lang.Double getActivity_Value__c() {
    return Activity_Value__c;
  }

  

  public void setActivity_Value__c(java.lang.Double Activity_Value__c) {
    this.Activity_Value__c = Activity_Value__c;
    Activity_Value__c__is_set = true;
  }
  
  /**
   * element  : AlternateDetail of type {urn:sobject.enterprise.soap.sforce.com}EmailMessage
   * java type: com.sforce.soap.enterprise.sobject.EmailMessage
   */
  private static final com.sforce.ws.bind.TypeInfo AlternateDetail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AlternateDetail","urn:sobject.enterprise.soap.sforce.com","EmailMessage",0,1,true);

  private boolean AlternateDetail__is_set = false;

  private com.sforce.soap.enterprise.sobject.EmailMessage AlternateDetail;

  public com.sforce.soap.enterprise.sobject.EmailMessage getAlternateDetail() {
    return AlternateDetail;
  }

  

  public void setAlternateDetail(com.sforce.soap.enterprise.sobject.EmailMessage AlternateDetail) {
    this.AlternateDetail = AlternateDetail;
    AlternateDetail__is_set = true;
  }
  
  /**
   * element  : AlternateDetailId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AlternateDetailId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AlternateDetailId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AlternateDetailId__is_set = false;

  private java.lang.String AlternateDetailId;

  public java.lang.String getAlternateDetailId() {
    return AlternateDetailId;
  }

  

  public void setAlternateDetailId(java.lang.String AlternateDetailId) {
    this.AlternateDetailId = AlternateDetailId;
    AlternateDetailId__is_set = true;
  }
  
  /**
   * element  : CallDisposition of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CallDisposition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CallDisposition","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CallDisposition__is_set = false;

  private java.lang.String CallDisposition;

  public java.lang.String getCallDisposition() {
    return CallDisposition;
  }

  

  public void setCallDisposition(java.lang.String CallDisposition) {
    this.CallDisposition = CallDisposition;
    CallDisposition__is_set = true;
  }
  
  /**
   * element  : CallDurationInSeconds of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo CallDurationInSeconds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CallDurationInSeconds","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean CallDurationInSeconds__is_set = false;

  private java.lang.Integer CallDurationInSeconds;

  public java.lang.Integer getCallDurationInSeconds() {
    return CallDurationInSeconds;
  }

  

  public void setCallDurationInSeconds(java.lang.Integer CallDurationInSeconds) {
    this.CallDurationInSeconds = CallDurationInSeconds;
    CallDurationInSeconds__is_set = true;
  }
  
  /**
   * element  : CallObject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CallObject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CallObject","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CallObject__is_set = false;

  private java.lang.String CallObject;

  public java.lang.String getCallObject() {
    return CallObject;
  }

  

  public void setCallObject(java.lang.String CallObject) {
    this.CallObject = CallObject;
    CallObject__is_set = true;
  }
  
  /**
   * element  : CallType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CallType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CallType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CallType__is_set = false;

  private java.lang.String CallType;

  public java.lang.String getCallType() {
    return CallType;
  }

  

  public void setCallType(java.lang.String CallType) {
    this.CallType = CallType;
    CallType__is_set = true;
  }
  
  /**
   * element  : Call_Result__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Call_Result__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Call_Result__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Call_Result__c__is_set = false;

  private java.lang.String Call_Result__c;

  public java.lang.String getCall_Result__c() {
    return Call_Result__c;
  }

  

  public void setCall_Result__c(java.lang.String Call_Result__c) {
    this.Call_Result__c = Call_Result__c;
    Call_Result__c__is_set = true;
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
   * element  : Decision_Maker_Response__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Decision_Maker_Response__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Decision_Maker_Response__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Decision_Maker_Response__c__is_set = false;

  private java.lang.String Decision_Maker_Response__c;

  public java.lang.String getDecision_Maker_Response__c() {
    return Decision_Maker_Response__c;
  }

  

  public void setDecision_Maker_Response__c(java.lang.String Decision_Maker_Response__c) {
    this.Decision_Maker_Response__c = Decision_Maker_Response__c;
    Decision_Maker_Response__c__is_set = true;
  }
  
  /**
   * element  : Description of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Description__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Description__is_set = false;

  private java.lang.String Description;

  public java.lang.String getDescription() {
    return Description;
  }

  

  public void setDescription(java.lang.String Description) {
    this.Description = Description;
    Description__is_set = true;
  }
  
  /**
   * element  : DurationInMinutes of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DurationInMinutes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DurationInMinutes","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DurationInMinutes__is_set = false;

  private java.lang.Integer DurationInMinutes;

  public java.lang.Integer getDurationInMinutes() {
    return DurationInMinutes;
  }

  

  public void setDurationInMinutes(java.lang.Integer DurationInMinutes) {
    this.DurationInMinutes = DurationInMinutes;
    DurationInMinutes__is_set = true;
  }
  
  /**
   * element  : EndDateTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EndDateTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EndDateTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean EndDateTime__is_set = false;

  private java.util.Calendar EndDateTime;

  public java.util.Calendar getEndDateTime() {
    return EndDateTime;
  }

  

  public void setEndDateTime(java.util.Calendar EndDateTime) {
    this.EndDateTime = EndDateTime;
    EndDateTime__is_set = true;
  }
  
  /**
   * element  : IsAllDayEvent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAllDayEvent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAllDayEvent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAllDayEvent__is_set = false;

  private java.lang.Boolean IsAllDayEvent;

  public java.lang.Boolean getIsAllDayEvent() {
    return IsAllDayEvent;
  }

  

  public void setIsAllDayEvent(java.lang.Boolean IsAllDayEvent) {
    this.IsAllDayEvent = IsAllDayEvent;
    IsAllDayEvent__is_set = true;
  }
  
  /**
   * element  : IsClosed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsClosed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsClosed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsClosed__is_set = false;

  private java.lang.Boolean IsClosed;

  public java.lang.Boolean getIsClosed() {
    return IsClosed;
  }

  

  public void setIsClosed(java.lang.Boolean IsClosed) {
    this.IsClosed = IsClosed;
    IsClosed__is_set = true;
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
   * element  : IsHighPriority of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsHighPriority__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsHighPriority","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsHighPriority__is_set = false;

  private java.lang.Boolean IsHighPriority;

  public java.lang.Boolean getIsHighPriority() {
    return IsHighPriority;
  }

  

  public void setIsHighPriority(java.lang.Boolean IsHighPriority) {
    this.IsHighPriority = IsHighPriority;
    IsHighPriority__is_set = true;
  }
  
  /**
   * element  : IsReminderSet of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsReminderSet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsReminderSet","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsReminderSet__is_set = false;

  private java.lang.Boolean IsReminderSet;

  public java.lang.Boolean getIsReminderSet() {
    return IsReminderSet;
  }

  

  public void setIsReminderSet(java.lang.Boolean IsReminderSet) {
    this.IsReminderSet = IsReminderSet;
    IsReminderSet__is_set = true;
  }
  
  /**
   * element  : IsTask of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsTask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsTask","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsTask__is_set = false;

  private java.lang.Boolean IsTask;

  public java.lang.Boolean getIsTask() {
    return IsTask;
  }

  

  public void setIsTask(java.lang.Boolean IsTask) {
    this.IsTask = IsTask;
    IsTask__is_set = true;
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
   * element  : Location of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Location__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Location","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Location__is_set = false;

  private java.lang.String Location;

  public java.lang.String getLocation() {
    return Location;
  }

  

  public void setLocation(java.lang.String Location) {
    this.Location = Location;
    Location__is_set = true;
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
   * element  : PrimaryAccount of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo PrimaryAccount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PrimaryAccount","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean PrimaryAccount__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account PrimaryAccount;

  public com.sforce.soap.enterprise.sobject.Account getPrimaryAccount() {
    return PrimaryAccount;
  }

  

  public void setPrimaryAccount(com.sforce.soap.enterprise.sobject.Account PrimaryAccount) {
    this.PrimaryAccount = PrimaryAccount;
    PrimaryAccount__is_set = true;
  }
  
  /**
   * element  : PrimaryAccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PrimaryAccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PrimaryAccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PrimaryAccountId__is_set = false;

  private java.lang.String PrimaryAccountId;

  public java.lang.String getPrimaryAccountId() {
    return PrimaryAccountId;
  }

  

  public void setPrimaryAccountId(java.lang.String PrimaryAccountId) {
    this.PrimaryAccountId = PrimaryAccountId;
    PrimaryAccountId__is_set = true;
  }
  
  /**
   * element  : PrimaryWho of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo PrimaryWho__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PrimaryWho","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean PrimaryWho__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name PrimaryWho;

  public com.sforce.soap.enterprise.sobject.Name getPrimaryWho() {
    return PrimaryWho;
  }

  

  public void setPrimaryWho(com.sforce.soap.enterprise.sobject.Name PrimaryWho) {
    this.PrimaryWho = PrimaryWho;
    PrimaryWho__is_set = true;
  }
  
  /**
   * element  : PrimaryWhoId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PrimaryWhoId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PrimaryWhoId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PrimaryWhoId__is_set = false;

  private java.lang.String PrimaryWhoId;

  public java.lang.String getPrimaryWhoId() {
    return PrimaryWhoId;
  }

  

  public void setPrimaryWhoId(java.lang.String PrimaryWhoId) {
    this.PrimaryWhoId = PrimaryWhoId;
    PrimaryWhoId__is_set = true;
  }
  
  /**
   * element  : Priority of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Priority__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Priority","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Priority__is_set = false;

  private java.lang.String Priority;

  public java.lang.String getPriority() {
    return Priority;
  }

  

  public void setPriority(java.lang.String Priority) {
    this.Priority = Priority;
    Priority__is_set = true;
  }
  
  /**
   * element  : Related_Created__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Related_Created__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Related_Created__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Related_Created__c__is_set = false;

  private java.util.Calendar Related_Created__c;

  public java.util.Calendar getRelated_Created__c() {
    return Related_Created__c;
  }

  

  public void setRelated_Created__c(java.util.Calendar Related_Created__c) {
    this.Related_Created__c = Related_Created__c;
    Related_Created__c__is_set = true;
  }
  
  /**
   * element  : Related_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Related_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Related_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Related_ID__c__is_set = false;

  private java.lang.String Related_ID__c;

  public java.lang.String getRelated_ID__c() {
    return Related_ID__c;
  }

  

  public void setRelated_ID__c(java.lang.String Related_ID__c) {
    this.Related_ID__c = Related_ID__c;
    Related_ID__c__is_set = true;
  }
  
  /**
   * element  : ReminderDateTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ReminderDateTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReminderDateTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ReminderDateTime__is_set = false;

  private java.util.Calendar ReminderDateTime;

  public java.util.Calendar getReminderDateTime() {
    return ReminderDateTime;
  }

  

  public void setReminderDateTime(java.util.Calendar ReminderDateTime) {
    this.ReminderDateTime = ReminderDateTime;
    ReminderDateTime__is_set = true;
  }
  
  /**
   * element  : S4STEO__Transferring_History__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo S4STEO__Transferring_History__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","S4STEO__Transferring_History__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean S4STEO__Transferring_History__c__is_set = false;

  private java.lang.String S4STEO__Transferring_History__c;

  public java.lang.String getS4STEO__Transferring_History__c() {
    return S4STEO__Transferring_History__c;
  }

  

  public void setS4STEO__Transferring_History__c(java.lang.String S4STEO__Transferring_History__c) {
    this.S4STEO__Transferring_History__c = S4STEO__Transferring_History__c;
    S4STEO__Transferring_History__c__is_set = true;
  }
  
  /**
   * element  : StartDateTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo StartDateTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartDateTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean StartDateTime__is_set = false;

  private java.util.Calendar StartDateTime;

  public java.util.Calendar getStartDateTime() {
    return StartDateTime;
  }

  

  public void setStartDateTime(java.util.Calendar StartDateTime) {
    this.StartDateTime = StartDateTime;
    StartDateTime__is_set = true;
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
   * element  : Subject of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Subject__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Subject","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Subject__is_set = false;

  private java.lang.String Subject;

  public java.lang.String getSubject() {
    return Subject;
  }

  

  public void setSubject(java.lang.String Subject) {
    this.Subject = Subject;
    Subject__is_set = true;
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
   * element  : User_Department__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo User_Department__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User_Department__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean User_Department__c__is_set = false;

  private java.lang.String User_Department__c;

  public java.lang.String getUser_Department__c() {
    return User_Department__c;
  }

  

  public void setUser_Department__c(java.lang.String User_Department__c) {
    this.User_Department__c = User_Department__c;
    User_Department__c__is_set = true;
  }
  
  /**
   * element  : What of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo What__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","What","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean What__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name What;

  public com.sforce.soap.enterprise.sobject.Name getWhat() {
    return What;
  }

  

  public void setWhat(com.sforce.soap.enterprise.sobject.Name What) {
    this.What = What;
    What__is_set = true;
  }
  
  /**
   * element  : WhatId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo WhatId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WhatId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean WhatId__is_set = false;

  private java.lang.String WhatId;

  public java.lang.String getWhatId() {
    return WhatId;
  }

  

  public void setWhatId(java.lang.String WhatId) {
    this.WhatId = WhatId;
    WhatId__is_set = true;
  }
  
  /**
   * element  : Who of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo Who__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Who","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean Who__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name Who;

  public com.sforce.soap.enterprise.sobject.Name getWho() {
    return Who;
  }

  

  public void setWho(com.sforce.soap.enterprise.sobject.Name Who) {
    this.Who = Who;
    Who__is_set = true;
  }
  
  /**
   * element  : WhoId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo WhoId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WhoId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean WhoId__is_set = false;

  private java.lang.String WhoId;

  public java.lang.String getWhoId() {
    return WhoId;
  }

  

  public void setWhoId(java.lang.String WhoId) {
    this.WhoId = WhoId;
    WhoId__is_set = true;
  }
  
  /**
   * element  : aos__Activity_Optimizer_System__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo aos__Activity_Optimizer_System__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","aos__Activity_Optimizer_System__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean aos__Activity_Optimizer_System__c__is_set = false;

  private java.lang.String aos__Activity_Optimizer_System__c;

  public java.lang.String getAos__Activity_Optimizer_System__c() {
    return aos__Activity_Optimizer_System__c;
  }

  

  public void setAos__Activity_Optimizer_System__c(java.lang.String aos__Activity_Optimizer_System__c) {
    this.aos__Activity_Optimizer_System__c = aos__Activity_Optimizer_System__c;
    aos__Activity_Optimizer_System__c__is_set = true;
  }
  
  /**
   * element  : aos__Activity_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo aos__Activity_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","aos__Activity_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean aos__Activity_Type__c__is_set = false;

  private java.lang.String aos__Activity_Type__c;

  public java.lang.String getAos__Activity_Type__c() {
    return aos__Activity_Type__c;
  }

  

  public void setAos__Activity_Type__c(java.lang.String aos__Activity_Type__c) {
    this.aos__Activity_Type__c = aos__Activity_Type__c;
    aos__Activity_Type__c__is_set = true;
  }
  
  /**
   * element  : aos__Hours__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo aos__Hours__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","aos__Hours__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean aos__Hours__c__is_set = false;

  private java.lang.Double aos__Hours__c;

  public java.lang.Double getAos__Hours__c() {
    return aos__Hours__c;
  }

  

  public void setAos__Hours__c(java.lang.Double aos__Hours__c) {
    this.aos__Hours__c = aos__Hours__c;
    aos__Hours__c__is_set = true;
  }
  
  /**
   * element  : aos__Minutes__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo aos__Minutes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","aos__Minutes__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean aos__Minutes__c__is_set = false;

  private java.lang.Double aos__Minutes__c;

  public java.lang.Double getAos__Minutes__c() {
    return aos__Minutes__c;
  }

  

  public void setAos__Minutes__c(java.lang.Double aos__Minutes__c) {
    this.aos__Minutes__c = aos__Minutes__c;
    aos__Minutes__c__is_set = true;
  }
  
  /**
   * element  : aos__Value__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo aos__Value__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","aos__Value__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean aos__Value__c__is_set = false;

  private java.lang.Double aos__Value__c;

  public java.lang.Double getAos__Value__c() {
    return aos__Value__c;
  }

  

  public void setAos__Value__c(java.lang.Double aos__Value__c) {
    this.aos__Value__c = aos__Value__c;
    aos__Value__c__is_set = true;
  }
  
  /**
   * element  : i__EmailHasAttachments__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailHasAttachments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailHasAttachments__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__EmailHasAttachments__c__is_set = false;

  private java.lang.Boolean i__EmailHasAttachments__c;

  public java.lang.Boolean getI__EmailHasAttachments__c() {
    return i__EmailHasAttachments__c;
  }

  

  public void setI__EmailHasAttachments__c(java.lang.Boolean i__EmailHasAttachments__c) {
    this.i__EmailHasAttachments__c = i__EmailHasAttachments__c;
    i__EmailHasAttachments__c__is_set = true;
  }
  
  /**
   * element  : i__EmailId__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailId__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailId__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__EmailId__c__is_set = false;

  private java.lang.String i__EmailId__c;

  public java.lang.String getI__EmailId__c() {
    return i__EmailId__c;
  }

  

  public void setI__EmailId__c(java.lang.String i__EmailId__c) {
    this.i__EmailId__c = i__EmailId__c;
    i__EmailId__c__is_set = true;
  }
  
  /**
   * element  : i__Email__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__Email__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__Email__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__Email__c__is_set = false;

  private java.lang.String i__Email__c;

  public java.lang.String getI__Email__c() {
    return i__Email__c;
  }

  

  public void setI__Email__c(java.lang.String i__Email__c) {
    this.i__Email__c = i__Email__c;
    i__Email__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "OpenActivity");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeObject(__out, ActivityDate__typeInfo, ActivityDate, ActivityDate__is_set);
    __typeMapper.writeString(__out, ActivitySubtype__typeInfo, ActivitySubtype, ActivitySubtype__is_set);
    __typeMapper.writeString(__out, ActivityType__typeInfo, ActivityType, ActivityType__is_set);
    __typeMapper.writeObject(__out, ActivityWeek_Ending__c__typeInfo, ActivityWeek_Ending__c, ActivityWeek_Ending__c__is_set);
    __typeMapper.writeString(__out, Activity_Notes__c__typeInfo, Activity_Notes__c, Activity_Notes__c__is_set);
    __typeMapper.writeObject(__out, Activity_Value__c__typeInfo, Activity_Value__c, Activity_Value__c__is_set);
    __typeMapper.writeObject(__out, AlternateDetail__typeInfo, AlternateDetail, AlternateDetail__is_set);
    __typeMapper.writeString(__out, AlternateDetailId__typeInfo, AlternateDetailId, AlternateDetailId__is_set);
    __typeMapper.writeString(__out, CallDisposition__typeInfo, CallDisposition, CallDisposition__is_set);
    __typeMapper.writeObject(__out, CallDurationInSeconds__typeInfo, CallDurationInSeconds, CallDurationInSeconds__is_set);
    __typeMapper.writeString(__out, CallObject__typeInfo, CallObject, CallObject__is_set);
    __typeMapper.writeString(__out, CallType__typeInfo, CallType, CallType__is_set);
    __typeMapper.writeString(__out, Call_Result__c__typeInfo, Call_Result__c, Call_Result__c__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Decision_Maker_Response__c__typeInfo, Decision_Maker_Response__c, Decision_Maker_Response__c__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, DurationInMinutes__typeInfo, DurationInMinutes, DurationInMinutes__is_set);
    __typeMapper.writeObject(__out, EndDateTime__typeInfo, EndDateTime, EndDateTime__is_set);
    __typeMapper.writeObject(__out, IsAllDayEvent__typeInfo, IsAllDayEvent, IsAllDayEvent__is_set);
    __typeMapper.writeObject(__out, IsClosed__typeInfo, IsClosed, IsClosed__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsHighPriority__typeInfo, IsHighPriority, IsHighPriority__is_set);
    __typeMapper.writeObject(__out, IsReminderSet__typeInfo, IsReminderSet, IsReminderSet__is_set);
    __typeMapper.writeObject(__out, IsTask__typeInfo, IsTask, IsTask__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, Location__typeInfo, Location, Location__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, PrimaryAccount__typeInfo, PrimaryAccount, PrimaryAccount__is_set);
    __typeMapper.writeString(__out, PrimaryAccountId__typeInfo, PrimaryAccountId, PrimaryAccountId__is_set);
    __typeMapper.writeObject(__out, PrimaryWho__typeInfo, PrimaryWho, PrimaryWho__is_set);
    __typeMapper.writeString(__out, PrimaryWhoId__typeInfo, PrimaryWhoId, PrimaryWhoId__is_set);
    __typeMapper.writeString(__out, Priority__typeInfo, Priority, Priority__is_set);
    __typeMapper.writeObject(__out, Related_Created__c__typeInfo, Related_Created__c, Related_Created__c__is_set);
    __typeMapper.writeString(__out, Related_ID__c__typeInfo, Related_ID__c, Related_ID__c__is_set);
    __typeMapper.writeObject(__out, ReminderDateTime__typeInfo, ReminderDateTime, ReminderDateTime__is_set);
    __typeMapper.writeString(__out, S4STEO__Transferring_History__c__typeInfo, S4STEO__Transferring_History__c, S4STEO__Transferring_History__c__is_set);
    __typeMapper.writeObject(__out, StartDateTime__typeInfo, StartDateTime, StartDateTime__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, Subject__typeInfo, Subject, Subject__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, User_Department__c__typeInfo, User_Department__c, User_Department__c__is_set);
    __typeMapper.writeObject(__out, What__typeInfo, What, What__is_set);
    __typeMapper.writeString(__out, WhatId__typeInfo, WhatId, WhatId__is_set);
    __typeMapper.writeObject(__out, Who__typeInfo, Who, Who__is_set);
    __typeMapper.writeString(__out, WhoId__typeInfo, WhoId, WhoId__is_set);
    __typeMapper.writeString(__out, aos__Activity_Optimizer_System__c__typeInfo, aos__Activity_Optimizer_System__c, aos__Activity_Optimizer_System__c__is_set);
    __typeMapper.writeString(__out, aos__Activity_Type__c__typeInfo, aos__Activity_Type__c, aos__Activity_Type__c__is_set);
    __typeMapper.writeObject(__out, aos__Hours__c__typeInfo, aos__Hours__c, aos__Hours__c__is_set);
    __typeMapper.writeObject(__out, aos__Minutes__c__typeInfo, aos__Minutes__c, aos__Minutes__c__is_set);
    __typeMapper.writeObject(__out, aos__Value__c__typeInfo, aos__Value__c, aos__Value__c__is_set);
    __typeMapper.writeObject(__out, i__EmailHasAttachments__c__typeInfo, i__EmailHasAttachments__c, i__EmailHasAttachments__c__is_set);
    __typeMapper.writeString(__out, i__EmailId__c__typeInfo, i__EmailId__c, i__EmailId__c__is_set);
    __typeMapper.writeString(__out, i__Email__c__typeInfo, i__Email__c, i__Email__c__is_set);
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
    if (__typeMapper.isElement(__in, ActivityDate__typeInfo)) {
      setActivityDate((java.util.Calendar)__typeMapper.readObject(__in, ActivityDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivitySubtype__typeInfo)) {
      setActivitySubtype((java.lang.String)__typeMapper.readString(__in, ActivitySubtype__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityType__typeInfo)) {
      setActivityType((java.lang.String)__typeMapper.readString(__in, ActivityType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityWeek_Ending__c__typeInfo)) {
      setActivityWeek_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, ActivityWeek_Ending__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Activity_Notes__c__typeInfo)) {
      setActivity_Notes__c((java.lang.String)__typeMapper.readString(__in, Activity_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Activity_Value__c__typeInfo)) {
      setActivity_Value__c((java.lang.Double)__typeMapper.readObject(__in, Activity_Value__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AlternateDetail__typeInfo)) {
      setAlternateDetail((com.sforce.soap.enterprise.sobject.EmailMessage)__typeMapper.readObject(__in, AlternateDetail__typeInfo, com.sforce.soap.enterprise.sobject.EmailMessage.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AlternateDetailId__typeInfo)) {
      setAlternateDetailId((java.lang.String)__typeMapper.readString(__in, AlternateDetailId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CallDisposition__typeInfo)) {
      setCallDisposition((java.lang.String)__typeMapper.readString(__in, CallDisposition__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CallDurationInSeconds__typeInfo)) {
      setCallDurationInSeconds((java.lang.Integer)__typeMapper.readObject(__in, CallDurationInSeconds__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CallObject__typeInfo)) {
      setCallObject((java.lang.String)__typeMapper.readString(__in, CallObject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CallType__typeInfo)) {
      setCallType((java.lang.String)__typeMapper.readString(__in, CallType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Call_Result__c__typeInfo)) {
      setCall_Result__c((java.lang.String)__typeMapper.readString(__in, Call_Result__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Decision_Maker_Response__c__typeInfo)) {
      setDecision_Maker_Response__c((java.lang.String)__typeMapper.readString(__in, Decision_Maker_Response__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DurationInMinutes__typeInfo)) {
      setDurationInMinutes((java.lang.Integer)__typeMapper.readObject(__in, DurationInMinutes__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndDateTime__typeInfo)) {
      setEndDateTime((java.util.Calendar)__typeMapper.readObject(__in, EndDateTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAllDayEvent__typeInfo)) {
      setIsAllDayEvent((java.lang.Boolean)__typeMapper.readObject(__in, IsAllDayEvent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsClosed__typeInfo)) {
      setIsClosed((java.lang.Boolean)__typeMapper.readObject(__in, IsClosed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsHighPriority__typeInfo)) {
      setIsHighPriority((java.lang.Boolean)__typeMapper.readObject(__in, IsHighPriority__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsReminderSet__typeInfo)) {
      setIsReminderSet((java.lang.Boolean)__typeMapper.readObject(__in, IsReminderSet__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsTask__typeInfo)) {
      setIsTask((java.lang.Boolean)__typeMapper.readObject(__in, IsTask__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Location__typeInfo)) {
      setLocation((java.lang.String)__typeMapper.readString(__in, Location__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, PrimaryAccount__typeInfo)) {
      setPrimaryAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, PrimaryAccount__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PrimaryAccountId__typeInfo)) {
      setPrimaryAccountId((java.lang.String)__typeMapper.readString(__in, PrimaryAccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PrimaryWho__typeInfo)) {
      setPrimaryWho((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, PrimaryWho__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PrimaryWhoId__typeInfo)) {
      setPrimaryWhoId((java.lang.String)__typeMapper.readString(__in, PrimaryWhoId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Priority__typeInfo)) {
      setPriority((java.lang.String)__typeMapper.readString(__in, Priority__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Related_Created__c__typeInfo)) {
      setRelated_Created__c((java.util.Calendar)__typeMapper.readObject(__in, Related_Created__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Related_ID__c__typeInfo)) {
      setRelated_ID__c((java.lang.String)__typeMapper.readString(__in, Related_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReminderDateTime__typeInfo)) {
      setReminderDateTime((java.util.Calendar)__typeMapper.readObject(__in, ReminderDateTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, S4STEO__Transferring_History__c__typeInfo)) {
      setS4STEO__Transferring_History__c((java.lang.String)__typeMapper.readString(__in, S4STEO__Transferring_History__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartDateTime__typeInfo)) {
      setStartDateTime((java.util.Calendar)__typeMapper.readObject(__in, StartDateTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Subject__typeInfo)) {
      setSubject((java.lang.String)__typeMapper.readString(__in, Subject__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User_Department__c__typeInfo)) {
      setUser_Department__c((java.lang.String)__typeMapper.readString(__in, User_Department__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, What__typeInfo)) {
      setWhat((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, What__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WhatId__typeInfo)) {
      setWhatId((java.lang.String)__typeMapper.readString(__in, WhatId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Who__typeInfo)) {
      setWho((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Who__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WhoId__typeInfo)) {
      setWhoId((java.lang.String)__typeMapper.readString(__in, WhoId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, aos__Activity_Optimizer_System__c__typeInfo)) {
      setAos__Activity_Optimizer_System__c((java.lang.String)__typeMapper.readString(__in, aos__Activity_Optimizer_System__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, aos__Activity_Type__c__typeInfo)) {
      setAos__Activity_Type__c((java.lang.String)__typeMapper.readString(__in, aos__Activity_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, aos__Hours__c__typeInfo)) {
      setAos__Hours__c((java.lang.Double)__typeMapper.readObject(__in, aos__Hours__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, aos__Minutes__c__typeInfo)) {
      setAos__Minutes__c((java.lang.Double)__typeMapper.readObject(__in, aos__Minutes__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, aos__Value__c__typeInfo)) {
      setAos__Value__c((java.lang.Double)__typeMapper.readObject(__in, aos__Value__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailHasAttachments__c__typeInfo)) {
      setI__EmailHasAttachments__c((java.lang.Boolean)__typeMapper.readObject(__in, i__EmailHasAttachments__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailId__c__typeInfo)) {
      setI__EmailId__c((java.lang.String)__typeMapper.readString(__in, i__EmailId__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__Email__c__typeInfo)) {
      setI__Email__c((java.lang.String)__typeMapper.readString(__in, i__Email__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[OpenActivity ");
    sb.append(super.toString());
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" ActivityDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityDate)+"'\n");
    sb.append(" ActivitySubtype=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivitySubtype)+"'\n");
    sb.append(" ActivityType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityType)+"'\n");
    sb.append(" ActivityWeek_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityWeek_Ending__c)+"'\n");
    sb.append(" Activity_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Activity_Notes__c)+"'\n");
    sb.append(" Activity_Value__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Activity_Value__c)+"'\n");
    sb.append(" AlternateDetail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AlternateDetail)+"'\n");
    sb.append(" AlternateDetailId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AlternateDetailId)+"'\n");
    sb.append(" CallDisposition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CallDisposition)+"'\n");
    sb.append(" CallDurationInSeconds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CallDurationInSeconds)+"'\n");
    sb.append(" CallObject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CallObject)+"'\n");
    sb.append(" CallType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CallType)+"'\n");
    sb.append(" Call_Result__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Call_Result__c)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Decision_Maker_Response__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Decision_Maker_Response__c)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" DurationInMinutes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurationInMinutes)+"'\n");
    sb.append(" EndDateTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndDateTime)+"'\n");
    sb.append(" IsAllDayEvent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAllDayEvent)+"'\n");
    sb.append(" IsClosed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsClosed)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsHighPriority=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHighPriority)+"'\n");
    sb.append(" IsReminderSet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsReminderSet)+"'\n");
    sb.append(" IsTask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsTask)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Location=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Location)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" PrimaryAccount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PrimaryAccount)+"'\n");
    sb.append(" PrimaryAccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PrimaryAccountId)+"'\n");
    sb.append(" PrimaryWho=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PrimaryWho)+"'\n");
    sb.append(" PrimaryWhoId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PrimaryWhoId)+"'\n");
    sb.append(" Priority=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Priority)+"'\n");
    sb.append(" Related_Created__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Related_Created__c)+"'\n");
    sb.append(" Related_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Related_ID__c)+"'\n");
    sb.append(" ReminderDateTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReminderDateTime)+"'\n");
    sb.append(" S4STEO__Transferring_History__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(S4STEO__Transferring_History__c)+"'\n");
    sb.append(" StartDateTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartDateTime)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Subject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subject)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" User_Department__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User_Department__c)+"'\n");
    sb.append(" What=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(What)+"'\n");
    sb.append(" WhatId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WhatId)+"'\n");
    sb.append(" Who=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Who)+"'\n");
    sb.append(" WhoId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WhoId)+"'\n");
    sb.append(" aos__Activity_Optimizer_System__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(aos__Activity_Optimizer_System__c)+"'\n");
    sb.append(" aos__Activity_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(aos__Activity_Type__c)+"'\n");
    sb.append(" aos__Hours__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(aos__Hours__c)+"'\n");
    sb.append(" aos__Minutes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(aos__Minutes__c)+"'\n");
    sb.append(" aos__Value__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(aos__Value__c)+"'\n");
    sb.append(" i__EmailHasAttachments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailHasAttachments__c)+"'\n");
    sb.append(" i__EmailId__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailId__c)+"'\n");
    sb.append(" i__Email__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__Email__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}