package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Task extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Task() {
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
   * element  : AttachedContentDocuments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AttachedContentDocuments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AttachedContentDocuments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AttachedContentDocuments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AttachedContentDocuments;

  public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
    return AttachedContentDocuments;
  }

  

  public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult AttachedContentDocuments) {
    this.AttachedContentDocuments = AttachedContentDocuments;
    AttachedContentDocuments__is_set = true;
  }
  
  /**
   * element  : AttachedContentNotes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AttachedContentNotes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AttachedContentNotes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AttachedContentNotes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AttachedContentNotes;

  public com.sforce.soap.enterprise.QueryResult getAttachedContentNotes() {
    return AttachedContentNotes;
  }

  

  public void setAttachedContentNotes(com.sforce.soap.enterprise.QueryResult AttachedContentNotes) {
    this.AttachedContentNotes = AttachedContentNotes;
    AttachedContentNotes__is_set = true;
  }
  
  /**
   * element  : Attachments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Attachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Attachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Attachments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Attachments;

  public com.sforce.soap.enterprise.QueryResult getAttachments() {
    return Attachments;
  }

  

  public void setAttachments(com.sforce.soap.enterprise.QueryResult Attachments) {
    this.Attachments = Attachments;
    Attachments__is_set = true;
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
   * element  : CombinedAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo CombinedAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CombinedAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean CombinedAttachments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult CombinedAttachments;

  public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
    return CombinedAttachments;
  }

  

  public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult CombinedAttachments) {
    this.CombinedAttachments = CombinedAttachments;
    CombinedAttachments__is_set = true;
  }
  
  /**
   * element  : ContentDocumentLinks of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ContentDocumentLinks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContentDocumentLinks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ContentDocumentLinks__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ContentDocumentLinks;

  public com.sforce.soap.enterprise.QueryResult getContentDocumentLinks() {
    return ContentDocumentLinks;
  }

  

  public void setContentDocumentLinks(com.sforce.soap.enterprise.QueryResult ContentDocumentLinks) {
    this.ContentDocumentLinks = ContentDocumentLinks;
    ContentDocumentLinks__is_set = true;
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
   * element  : FeedSubscriptionsForEntity of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FeedSubscriptionsForEntity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FeedSubscriptionsForEntity","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FeedSubscriptionsForEntity__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FeedSubscriptionsForEntity;

  public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
    return FeedSubscriptionsForEntity;
  }

  

  public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult FeedSubscriptionsForEntity) {
    this.FeedSubscriptionsForEntity = FeedSubscriptionsForEntity;
    FeedSubscriptionsForEntity__is_set = true;
  }
  
  /**
   * element  : Feeds of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Feeds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Feeds","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Feeds__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Feeds;

  public com.sforce.soap.enterprise.QueryResult getFeeds() {
    return Feeds;
  }

  

  public void setFeeds(com.sforce.soap.enterprise.QueryResult Feeds) {
    this.Feeds = Feeds;
    Feeds__is_set = true;
  }
  
  /**
   * element  : IsArchived of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsArchived__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsArchived","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsArchived__is_set = false;

  private java.lang.Boolean IsArchived;

  public java.lang.Boolean getIsArchived() {
    return IsArchived;
  }

  

  public void setIsArchived(java.lang.Boolean IsArchived) {
    this.IsArchived = IsArchived;
    IsArchived__is_set = true;
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
   * element  : IsRecurrence of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsRecurrence__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsRecurrence","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsRecurrence__is_set = false;

  private java.lang.Boolean IsRecurrence;

  public java.lang.Boolean getIsRecurrence() {
    return IsRecurrence;
  }

  

  public void setIsRecurrence(java.lang.Boolean IsRecurrence) {
    this.IsRecurrence = IsRecurrence;
    IsRecurrence__is_set = true;
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
   * element  : RecurrenceActivityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceActivityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceActivityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RecurrenceActivityId__is_set = false;

  private java.lang.String RecurrenceActivityId;

  public java.lang.String getRecurrenceActivityId() {
    return RecurrenceActivityId;
  }

  

  public void setRecurrenceActivityId(java.lang.String RecurrenceActivityId) {
    this.RecurrenceActivityId = RecurrenceActivityId;
    RecurrenceActivityId__is_set = true;
  }
  
  /**
   * element  : RecurrenceDayOfMonth of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceDayOfMonth__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceDayOfMonth","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RecurrenceDayOfMonth__is_set = false;

  private java.lang.Integer RecurrenceDayOfMonth;

  public java.lang.Integer getRecurrenceDayOfMonth() {
    return RecurrenceDayOfMonth;
  }

  

  public void setRecurrenceDayOfMonth(java.lang.Integer RecurrenceDayOfMonth) {
    this.RecurrenceDayOfMonth = RecurrenceDayOfMonth;
    RecurrenceDayOfMonth__is_set = true;
  }
  
  /**
   * element  : RecurrenceDayOfWeekMask of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceDayOfWeekMask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceDayOfWeekMask","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RecurrenceDayOfWeekMask__is_set = false;

  private java.lang.Integer RecurrenceDayOfWeekMask;

  public java.lang.Integer getRecurrenceDayOfWeekMask() {
    return RecurrenceDayOfWeekMask;
  }

  

  public void setRecurrenceDayOfWeekMask(java.lang.Integer RecurrenceDayOfWeekMask) {
    this.RecurrenceDayOfWeekMask = RecurrenceDayOfWeekMask;
    RecurrenceDayOfWeekMask__is_set = true;
  }
  
  /**
   * element  : RecurrenceEndDateOnly of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceEndDateOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceEndDateOnly","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean RecurrenceEndDateOnly__is_set = false;

  private java.util.Calendar RecurrenceEndDateOnly;

  public java.util.Calendar getRecurrenceEndDateOnly() {
    return RecurrenceEndDateOnly;
  }

  

  public void setRecurrenceEndDateOnly(java.util.Calendar RecurrenceEndDateOnly) {
    this.RecurrenceEndDateOnly = RecurrenceEndDateOnly;
    RecurrenceEndDateOnly__is_set = true;
  }
  
  /**
   * element  : RecurrenceInstance of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceInstance__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceInstance","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceInstance__is_set = false;

  private java.lang.String RecurrenceInstance;

  public java.lang.String getRecurrenceInstance() {
    return RecurrenceInstance;
  }

  

  public void setRecurrenceInstance(java.lang.String RecurrenceInstance) {
    this.RecurrenceInstance = RecurrenceInstance;
    RecurrenceInstance__is_set = true;
  }
  
  /**
   * element  : RecurrenceInterval of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceInterval__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceInterval","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RecurrenceInterval__is_set = false;

  private java.lang.Integer RecurrenceInterval;

  public java.lang.Integer getRecurrenceInterval() {
    return RecurrenceInterval;
  }

  

  public void setRecurrenceInterval(java.lang.Integer RecurrenceInterval) {
    this.RecurrenceInterval = RecurrenceInterval;
    RecurrenceInterval__is_set = true;
  }
  
  /**
   * element  : RecurrenceMonthOfYear of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceMonthOfYear__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceMonthOfYear","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceMonthOfYear__is_set = false;

  private java.lang.String RecurrenceMonthOfYear;

  public java.lang.String getRecurrenceMonthOfYear() {
    return RecurrenceMonthOfYear;
  }

  

  public void setRecurrenceMonthOfYear(java.lang.String RecurrenceMonthOfYear) {
    this.RecurrenceMonthOfYear = RecurrenceMonthOfYear;
    RecurrenceMonthOfYear__is_set = true;
  }
  
  /**
   * element  : RecurrenceRegeneratedType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceRegeneratedType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceRegeneratedType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceRegeneratedType__is_set = false;

  private java.lang.String RecurrenceRegeneratedType;

  public java.lang.String getRecurrenceRegeneratedType() {
    return RecurrenceRegeneratedType;
  }

  

  public void setRecurrenceRegeneratedType(java.lang.String RecurrenceRegeneratedType) {
    this.RecurrenceRegeneratedType = RecurrenceRegeneratedType;
    RecurrenceRegeneratedType__is_set = true;
  }
  
  /**
   * element  : RecurrenceStartDateOnly of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceStartDateOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceStartDateOnly","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean RecurrenceStartDateOnly__is_set = false;

  private java.util.Calendar RecurrenceStartDateOnly;

  public java.util.Calendar getRecurrenceStartDateOnly() {
    return RecurrenceStartDateOnly;
  }

  

  public void setRecurrenceStartDateOnly(java.util.Calendar RecurrenceStartDateOnly) {
    this.RecurrenceStartDateOnly = RecurrenceStartDateOnly;
    RecurrenceStartDateOnly__is_set = true;
  }
  
  /**
   * element  : RecurrenceTimeZoneSidKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceTimeZoneSidKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceTimeZoneSidKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceTimeZoneSidKey__is_set = false;

  private java.lang.String RecurrenceTimeZoneSidKey;

  public java.lang.String getRecurrenceTimeZoneSidKey() {
    return RecurrenceTimeZoneSidKey;
  }

  

  public void setRecurrenceTimeZoneSidKey(java.lang.String RecurrenceTimeZoneSidKey) {
    this.RecurrenceTimeZoneSidKey = RecurrenceTimeZoneSidKey;
    RecurrenceTimeZoneSidKey__is_set = true;
  }
  
  /**
   * element  : RecurrenceType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceType__is_set = false;

  private java.lang.String RecurrenceType;

  public java.lang.String getRecurrenceType() {
    return RecurrenceType;
  }

  

  public void setRecurrenceType(java.lang.String RecurrenceType) {
    this.RecurrenceType = RecurrenceType;
    RecurrenceType__is_set = true;
  }
  
  /**
   * element  : RecurringTasks of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo RecurringTasks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurringTasks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean RecurringTasks__is_set = false;

  private com.sforce.soap.enterprise.QueryResult RecurringTasks;

  public com.sforce.soap.enterprise.QueryResult getRecurringTasks() {
    return RecurringTasks;
  }

  

  public void setRecurringTasks(com.sforce.soap.enterprise.QueryResult RecurringTasks) {
    this.RecurringTasks = RecurringTasks;
    RecurringTasks__is_set = true;
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
   * element  : Tags of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Tags__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tags","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Tags__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Tags;

  public com.sforce.soap.enterprise.QueryResult getTags() {
    return Tags;
  }

  

  public void setTags(com.sforce.soap.enterprise.QueryResult Tags) {
    this.Tags = Tags;
    Tags__is_set = true;
  }
  
  /**
   * element  : TaskRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TaskRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TaskRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TaskRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TaskRelations;

  public com.sforce.soap.enterprise.QueryResult getTaskRelations() {
    return TaskRelations;
  }

  

  public void setTaskRelations(com.sforce.soap.enterprise.QueryResult TaskRelations) {
    this.TaskRelations = TaskRelations;
    TaskRelations__is_set = true;
  }
  
  /**
   * element  : TaskSubtype of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TaskSubtype__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TaskSubtype","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TaskSubtype__is_set = false;

  private java.lang.String TaskSubtype;

  public java.lang.String getTaskSubtype() {
    return TaskSubtype;
  }

  

  public void setTaskSubtype(java.lang.String TaskSubtype) {
    this.TaskSubtype = TaskSubtype;
    TaskSubtype__is_set = true;
  }
  
  /**
   * element  : TaskWhoIds of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo TaskWhoIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TaskWhoIds","urn:enterprise.soap.sforce.com","ID",0,-1,true);

  private boolean TaskWhoIds__is_set = false;

  private java.lang.String[] TaskWhoIds = new java.lang.String[0];

  public java.lang.String[] getTaskWhoIds() {
    return TaskWhoIds;
  }

  

  public void setTaskWhoIds(java.lang.String[] TaskWhoIds) {
    this.TaskWhoIds = TaskWhoIds;
    TaskWhoIds__is_set = true;
  }
  
  /**
   * element  : TaskWhoRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TaskWhoRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TaskWhoRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TaskWhoRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TaskWhoRelations;

  public com.sforce.soap.enterprise.QueryResult getTaskWhoRelations() {
    return TaskWhoRelations;
  }

  

  public void setTaskWhoRelations(com.sforce.soap.enterprise.QueryResult TaskWhoRelations) {
    this.TaskWhoRelations = TaskWhoRelations;
    TaskWhoRelations__is_set = true;
  }
  
  /**
   * element  : TopicAssignments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TopicAssignments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TopicAssignments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TopicAssignments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TopicAssignments;

  public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
    return TopicAssignments;
  }

  

  public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult TopicAssignments) {
    this.TopicAssignments = TopicAssignments;
    TopicAssignments__is_set = true;
  }
  
  /**
   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type__is_set = false;

  private java.lang.String Type;

  public java.lang.String getType() {
    return Type;
  }

  

  public void setType(java.lang.String Type) {
    this.Type = Type;
    Type__is_set = true;
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
   * element  : WhatCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo WhatCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WhatCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean WhatCount__is_set = false;

  private java.lang.Integer WhatCount;

  public java.lang.Integer getWhatCount() {
    return WhatCount;
  }

  

  public void setWhatCount(java.lang.Integer WhatCount) {
    this.WhatCount = WhatCount;
    WhatCount__is_set = true;
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
   * element  : WhoCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo WhoCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WhoCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean WhoCount__is_set = false;

  private java.lang.Integer WhoCount;

  public java.lang.Integer getWhoCount() {
    return WhoCount;
  }

  

  public void setWhoCount(java.lang.Integer WhoCount) {
    this.WhoCount = WhoCount;
    WhoCount__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Task");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeObject(__out, ActivityDate__typeInfo, ActivityDate, ActivityDate__is_set);
    __typeMapper.writeObject(__out, ActivityWeek_Ending__c__typeInfo, ActivityWeek_Ending__c, ActivityWeek_Ending__c__is_set);
    __typeMapper.writeString(__out, Activity_Notes__c__typeInfo, Activity_Notes__c, Activity_Notes__c__is_set);
    __typeMapper.writeObject(__out, Activity_Value__c__typeInfo, Activity_Value__c, Activity_Value__c__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, CallDisposition__typeInfo, CallDisposition, CallDisposition__is_set);
    __typeMapper.writeObject(__out, CallDurationInSeconds__typeInfo, CallDurationInSeconds, CallDurationInSeconds__is_set);
    __typeMapper.writeString(__out, CallObject__typeInfo, CallObject, CallObject__is_set);
    __typeMapper.writeString(__out, CallType__typeInfo, CallType, CallType__is_set);
    __typeMapper.writeString(__out, Call_Result__c__typeInfo, Call_Result__c, Call_Result__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Decision_Maker_Response__c__typeInfo, Decision_Maker_Response__c, Decision_Maker_Response__c__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, IsArchived__typeInfo, IsArchived, IsArchived__is_set);
    __typeMapper.writeObject(__out, IsClosed__typeInfo, IsClosed, IsClosed__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsHighPriority__typeInfo, IsHighPriority, IsHighPriority__is_set);
    __typeMapper.writeObject(__out, IsRecurrence__typeInfo, IsRecurrence, IsRecurrence__is_set);
    __typeMapper.writeObject(__out, IsReminderSet__typeInfo, IsReminderSet, IsReminderSet__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Priority__typeInfo, Priority, Priority__is_set);
    __typeMapper.writeString(__out, RecurrenceActivityId__typeInfo, RecurrenceActivityId, RecurrenceActivityId__is_set);
    __typeMapper.writeObject(__out, RecurrenceDayOfMonth__typeInfo, RecurrenceDayOfMonth, RecurrenceDayOfMonth__is_set);
    __typeMapper.writeObject(__out, RecurrenceDayOfWeekMask__typeInfo, RecurrenceDayOfWeekMask, RecurrenceDayOfWeekMask__is_set);
    __typeMapper.writeObject(__out, RecurrenceEndDateOnly__typeInfo, RecurrenceEndDateOnly, RecurrenceEndDateOnly__is_set);
    __typeMapper.writeString(__out, RecurrenceInstance__typeInfo, RecurrenceInstance, RecurrenceInstance__is_set);
    __typeMapper.writeObject(__out, RecurrenceInterval__typeInfo, RecurrenceInterval, RecurrenceInterval__is_set);
    __typeMapper.writeString(__out, RecurrenceMonthOfYear__typeInfo, RecurrenceMonthOfYear, RecurrenceMonthOfYear__is_set);
    __typeMapper.writeString(__out, RecurrenceRegeneratedType__typeInfo, RecurrenceRegeneratedType, RecurrenceRegeneratedType__is_set);
    __typeMapper.writeObject(__out, RecurrenceStartDateOnly__typeInfo, RecurrenceStartDateOnly, RecurrenceStartDateOnly__is_set);
    __typeMapper.writeString(__out, RecurrenceTimeZoneSidKey__typeInfo, RecurrenceTimeZoneSidKey, RecurrenceTimeZoneSidKey__is_set);
    __typeMapper.writeString(__out, RecurrenceType__typeInfo, RecurrenceType, RecurrenceType__is_set);
    __typeMapper.writeObject(__out, RecurringTasks__typeInfo, RecurringTasks, RecurringTasks__is_set);
    __typeMapper.writeObject(__out, Related_Created__c__typeInfo, Related_Created__c, Related_Created__c__is_set);
    __typeMapper.writeString(__out, Related_ID__c__typeInfo, Related_ID__c, Related_ID__c__is_set);
    __typeMapper.writeObject(__out, ReminderDateTime__typeInfo, ReminderDateTime, ReminderDateTime__is_set);
    __typeMapper.writeString(__out, S4STEO__Transferring_History__c__typeInfo, S4STEO__Transferring_History__c, S4STEO__Transferring_History__c__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, Subject__typeInfo, Subject, Subject__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeString(__out, TaskSubtype__typeInfo, TaskSubtype, TaskSubtype__is_set);
    __typeMapper.writeObject(__out, TaskWhoIds__typeInfo, TaskWhoIds, TaskWhoIds__is_set);
    __typeMapper.writeObject(__out, TaskWhoRelations__typeInfo, TaskWhoRelations, TaskWhoRelations__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeString(__out, User_Department__c__typeInfo, User_Department__c, User_Department__c__is_set);
    __typeMapper.writeObject(__out, What__typeInfo, What, What__is_set);
    __typeMapper.writeObject(__out, WhatCount__typeInfo, WhatCount, WhatCount__is_set);
    __typeMapper.writeString(__out, WhatId__typeInfo, WhatId, WhatId__is_set);
    __typeMapper.writeObject(__out, Who__typeInfo, Who, Who__is_set);
    __typeMapper.writeObject(__out, WhoCount__typeInfo, WhoCount, WhoCount__is_set);
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
    if (__typeMapper.isElement(__in, AttachedContentDocuments__typeInfo)) {
      setAttachedContentDocuments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentDocuments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AttachedContentNotes__typeInfo)) {
      setAttachedContentNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentNotes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Attachments__typeInfo)) {
      setAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Attachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Feeds__typeInfo)) {
      setFeeds((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feeds__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsArchived__typeInfo)) {
      setIsArchived((java.lang.Boolean)__typeMapper.readObject(__in, IsArchived__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, IsRecurrence__typeInfo)) {
      setIsRecurrence((java.lang.Boolean)__typeMapper.readObject(__in, IsRecurrence__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsReminderSet__typeInfo)) {
      setIsReminderSet((java.lang.Boolean)__typeMapper.readObject(__in, IsReminderSet__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Owner__typeInfo)) {
      setOwner((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, Owner__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
      setOwnerId((java.lang.String)__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Priority__typeInfo)) {
      setPriority((java.lang.String)__typeMapper.readString(__in, Priority__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceActivityId__typeInfo)) {
      setRecurrenceActivityId((java.lang.String)__typeMapper.readString(__in, RecurrenceActivityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceDayOfMonth__typeInfo)) {
      setRecurrenceDayOfMonth((java.lang.Integer)__typeMapper.readObject(__in, RecurrenceDayOfMonth__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceDayOfWeekMask__typeInfo)) {
      setRecurrenceDayOfWeekMask((java.lang.Integer)__typeMapper.readObject(__in, RecurrenceDayOfWeekMask__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceEndDateOnly__typeInfo)) {
      setRecurrenceEndDateOnly((java.util.Calendar)__typeMapper.readObject(__in, RecurrenceEndDateOnly__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceInstance__typeInfo)) {
      setRecurrenceInstance((java.lang.String)__typeMapper.readString(__in, RecurrenceInstance__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceInterval__typeInfo)) {
      setRecurrenceInterval((java.lang.Integer)__typeMapper.readObject(__in, RecurrenceInterval__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceMonthOfYear__typeInfo)) {
      setRecurrenceMonthOfYear((java.lang.String)__typeMapper.readString(__in, RecurrenceMonthOfYear__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceRegeneratedType__typeInfo)) {
      setRecurrenceRegeneratedType((java.lang.String)__typeMapper.readString(__in, RecurrenceRegeneratedType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceStartDateOnly__typeInfo)) {
      setRecurrenceStartDateOnly((java.util.Calendar)__typeMapper.readObject(__in, RecurrenceStartDateOnly__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceTimeZoneSidKey__typeInfo)) {
      setRecurrenceTimeZoneSidKey((java.lang.String)__typeMapper.readString(__in, RecurrenceTimeZoneSidKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceType__typeInfo)) {
      setRecurrenceType((java.lang.String)__typeMapper.readString(__in, RecurrenceType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurringTasks__typeInfo)) {
      setRecurringTasks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecurringTasks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Tags__typeInfo)) {
      setTags((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Tags__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaskRelations__typeInfo)) {
      setTaskRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TaskRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaskSubtype__typeInfo)) {
      setTaskSubtype((java.lang.String)__typeMapper.readString(__in, TaskSubtype__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaskWhoIds__typeInfo)) {
      setTaskWhoIds((java.lang.String[])__typeMapper.readObject(__in, TaskWhoIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaskWhoRelations__typeInfo)) {
      setTaskWhoRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TaskWhoRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, WhatCount__typeInfo)) {
      setWhatCount((java.lang.Integer)__typeMapper.readObject(__in, WhatCount__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, WhoCount__typeInfo)) {
      setWhoCount((java.lang.Integer)__typeMapper.readObject(__in, WhoCount__typeInfo, java.lang.Integer.class));
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
    sb.append("[Task ");
    sb.append(super.toString());
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" ActivityDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityDate)+"'\n");
    sb.append(" ActivityWeek_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityWeek_Ending__c)+"'\n");
    sb.append(" Activity_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Activity_Notes__c)+"'\n");
    sb.append(" Activity_Value__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Activity_Value__c)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
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
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
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
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" IsArchived=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsArchived)+"'\n");
    sb.append(" IsClosed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsClosed)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsHighPriority=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsHighPriority)+"'\n");
    sb.append(" IsRecurrence=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsRecurrence)+"'\n");
    sb.append(" IsReminderSet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsReminderSet)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Priority=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Priority)+"'\n");
    sb.append(" RecurrenceActivityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceActivityId)+"'\n");
    sb.append(" RecurrenceDayOfMonth=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceDayOfMonth)+"'\n");
    sb.append(" RecurrenceDayOfWeekMask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceDayOfWeekMask)+"'\n");
    sb.append(" RecurrenceEndDateOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceEndDateOnly)+"'\n");
    sb.append(" RecurrenceInstance=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceInstance)+"'\n");
    sb.append(" RecurrenceInterval=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceInterval)+"'\n");
    sb.append(" RecurrenceMonthOfYear=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceMonthOfYear)+"'\n");
    sb.append(" RecurrenceRegeneratedType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceRegeneratedType)+"'\n");
    sb.append(" RecurrenceStartDateOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceStartDateOnly)+"'\n");
    sb.append(" RecurrenceTimeZoneSidKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceTimeZoneSidKey)+"'\n");
    sb.append(" RecurrenceType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceType)+"'\n");
    sb.append(" RecurringTasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurringTasks)+"'\n");
    sb.append(" Related_Created__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Related_Created__c)+"'\n");
    sb.append(" Related_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Related_ID__c)+"'\n");
    sb.append(" ReminderDateTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReminderDateTime)+"'\n");
    sb.append(" S4STEO__Transferring_History__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(S4STEO__Transferring_History__c)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Subject=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subject)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" TaskSubtype=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskSubtype)+"'\n");
    sb.append(" TaskWhoIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskWhoIds)+"'\n");
    sb.append(" TaskWhoRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskWhoRelations)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" User_Department__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User_Department__c)+"'\n");
    sb.append(" What=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(What)+"'\n");
    sb.append(" WhatCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WhatCount)+"'\n");
    sb.append(" WhatId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WhatId)+"'\n");
    sb.append(" Who=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Who)+"'\n");
    sb.append(" WhoCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WhoCount)+"'\n");
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