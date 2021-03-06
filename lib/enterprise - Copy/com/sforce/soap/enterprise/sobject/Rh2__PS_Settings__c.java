package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Rh2__PS_Settings__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Rh2__PS_Settings__c() {
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
   * element  : DuplicateRecordItems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DuplicateRecordItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DuplicateRecordItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DuplicateRecordItems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DuplicateRecordItems;

  public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
    return DuplicateRecordItems;
  }

  

  public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult DuplicateRecordItems) {
    this.DuplicateRecordItems = DuplicateRecordItems;
    DuplicateRecordItems__is_set = true;
  }
  
  /**
   * element  : Emails of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Emails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Emails","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Emails__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Emails;

  public com.sforce.soap.enterprise.QueryResult getEmails() {
    return Emails;
  }

  

  public void setEmails(com.sforce.soap.enterprise.QueryResult Emails) {
    this.Emails = Emails;
    Emails__is_set = true;
  }
  
  /**
   * element  : EventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo EventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean EventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult EventRelations;

  public com.sforce.soap.enterprise.QueryResult getEventRelations() {
    return EventRelations;
  }

  

  public void setEventRelations(com.sforce.soap.enterprise.QueryResult EventRelations) {
    this.EventRelations = EventRelations;
    EventRelations__is_set = true;
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
   * element  : LookedUpFromActivities of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo LookedUpFromActivities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LookedUpFromActivities","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean LookedUpFromActivities__is_set = false;

  private com.sforce.soap.enterprise.QueryResult LookedUpFromActivities;

  public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
    return LookedUpFromActivities;
  }

  

  public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult LookedUpFromActivities) {
    this.LookedUpFromActivities = LookedUpFromActivities;
    LookedUpFromActivities__is_set = true;
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
   * element  : RecordAssociatedGroups of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo RecordAssociatedGroups__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordAssociatedGroups","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean RecordAssociatedGroups__is_set = false;

  private com.sforce.soap.enterprise.QueryResult RecordAssociatedGroups;

  public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
    return RecordAssociatedGroups;
  }

  

  public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult RecordAssociatedGroups) {
    this.RecordAssociatedGroups = RecordAssociatedGroups;
    RecordAssociatedGroups__is_set = true;
  }
  
  /**
   * element  : SetupOwner of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo SetupOwner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SetupOwner","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean SetupOwner__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name SetupOwner;

  public com.sforce.soap.enterprise.sobject.Name getSetupOwner() {
    return SetupOwner;
  }

  

  public void setSetupOwner(com.sforce.soap.enterprise.sobject.Name SetupOwner) {
    this.SetupOwner = SetupOwner;
    SetupOwner__is_set = true;
  }
  
  /**
   * element  : SetupOwnerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SetupOwnerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SetupOwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SetupOwnerId__is_set = false;

  private java.lang.String SetupOwnerId;

  public java.lang.String getSetupOwnerId() {
    return SetupOwnerId;
  }

  

  public void setSetupOwnerId(java.lang.String SetupOwnerId) {
    this.SetupOwnerId = SetupOwnerId;
    SetupOwnerId__is_set = true;
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
   * element  : rh2__Advanced_Currency__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Advanced_Currency__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Advanced_Currency__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__Advanced_Currency__c__is_set = false;

  private java.lang.Boolean rh2__Advanced_Currency__c;

  public java.lang.Boolean getRh2__Advanced_Currency__c() {
    return rh2__Advanced_Currency__c;
  }

  

  public void setRh2__Advanced_Currency__c(java.lang.Boolean rh2__Advanced_Currency__c) {
    this.rh2__Advanced_Currency__c = rh2__Advanced_Currency__c;
    rh2__Advanced_Currency__c__is_set = true;
  }
  
  /**
   * element  : rh2__Batch_Agent_Id__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Batch_Agent_Id__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Batch_Agent_Id__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Batch_Agent_Id__c__is_set = false;

  private java.lang.String rh2__Batch_Agent_Id__c;

  public java.lang.String getRh2__Batch_Agent_Id__c() {
    return rh2__Batch_Agent_Id__c;
  }

  

  public void setRh2__Batch_Agent_Id__c(java.lang.String rh2__Batch_Agent_Id__c) {
    this.rh2__Batch_Agent_Id__c = rh2__Batch_Agent_Id__c;
    rh2__Batch_Agent_Id__c__is_set = true;
  }
  
  /**
   * element  : rh2__Disable_Advanced_Currency__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Disable_Advanced_Currency__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Disable_Advanced_Currency__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__Disable_Advanced_Currency__c__is_set = false;

  private java.lang.Boolean rh2__Disable_Advanced_Currency__c;

  public java.lang.Boolean getRh2__Disable_Advanced_Currency__c() {
    return rh2__Disable_Advanced_Currency__c;
  }

  

  public void setRh2__Disable_Advanced_Currency__c(java.lang.Boolean rh2__Disable_Advanced_Currency__c) {
    this.rh2__Disable_Advanced_Currency__c = rh2__Disable_Advanced_Currency__c;
    rh2__Disable_Advanced_Currency__c__is_set = true;
  }
  
  /**
   * element  : rh2__Enable_Validation_Rule_Helper__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Enable_Validation_Rule_Helper__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Enable_Validation_Rule_Helper__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__Enable_Validation_Rule_Helper__c__is_set = false;

  private java.lang.Boolean rh2__Enable_Validation_Rule_Helper__c;

  public java.lang.Boolean getRh2__Enable_Validation_Rule_Helper__c() {
    return rh2__Enable_Validation_Rule_Helper__c;
  }

  

  public void setRh2__Enable_Validation_Rule_Helper__c(java.lang.Boolean rh2__Enable_Validation_Rule_Helper__c) {
    this.rh2__Enable_Validation_Rule_Helper__c = rh2__Enable_Validation_Rule_Helper__c;
    rh2__Enable_Validation_Rule_Helper__c__is_set = true;
  }
  
  /**
   * element  : rh2__MaxBatch__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__MaxBatch__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__MaxBatch__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__MaxBatch__c__is_set = false;

  private java.lang.Double rh2__MaxBatch__c;

  public java.lang.Double getRh2__MaxBatch__c() {
    return rh2__MaxBatch__c;
  }

  

  public void setRh2__MaxBatch__c(java.lang.Double rh2__MaxBatch__c) {
    this.rh2__MaxBatch__c = rh2__MaxBatch__c;
    rh2__MaxBatch__c__is_set = true;
  }
  
  /**
   * element  : rh2__MaxFuture__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__MaxFuture__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__MaxFuture__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__MaxFuture__c__is_set = false;

  private java.lang.Double rh2__MaxFuture__c;

  public java.lang.Double getRh2__MaxFuture__c() {
    return rh2__MaxFuture__c;
  }

  

  public void setRh2__MaxFuture__c(java.lang.Double rh2__MaxFuture__c) {
    this.rh2__MaxFuture__c = rh2__MaxFuture__c;
    rh2__MaxFuture__c__is_set = true;
  }
  
  /**
   * element  : rh2__Max_Batch__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Max_Batch__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Max_Batch__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Max_Batch__c__is_set = false;

  private java.lang.Double rh2__Max_Batch__c;

  public java.lang.Double getRh2__Max_Batch__c() {
    return rh2__Max_Batch__c;
  }

  

  public void setRh2__Max_Batch__c(java.lang.Double rh2__Max_Batch__c) {
    this.rh2__Max_Batch__c = rh2__Max_Batch__c;
    rh2__Max_Batch__c__is_set = true;
  }
  
  /**
   * element  : rh2__Max_Future__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Max_Future__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Max_Future__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Max_Future__c__is_set = false;

  private java.lang.Double rh2__Max_Future__c;

  public java.lang.Double getRh2__Max_Future__c() {
    return rh2__Max_Future__c;
  }

  

  public void setRh2__Max_Future__c(java.lang.Double rh2__Max_Future__c) {
    this.rh2__Max_Future__c = rh2__Max_Future__c;
    rh2__Max_Future__c__is_set = true;
  }
  
  /**
   * element  : rh2__Parent_Sync_Job_Id__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Parent_Sync_Job_Id__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Parent_Sync_Job_Id__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Parent_Sync_Job_Id__c__is_set = false;

  private java.lang.String rh2__Parent_Sync_Job_Id__c;

  public java.lang.String getRh2__Parent_Sync_Job_Id__c() {
    return rh2__Parent_Sync_Job_Id__c;
  }

  

  public void setRh2__Parent_Sync_Job_Id__c(java.lang.String rh2__Parent_Sync_Job_Id__c) {
    this.rh2__Parent_Sync_Job_Id__c = rh2__Parent_Sync_Job_Id__c;
    rh2__Parent_Sync_Job_Id__c__is_set = true;
  }
  
  /**
   * element  : rh2__Premium_Key__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Premium_Key__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Premium_Key__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Premium_Key__c__is_set = false;

  private java.lang.String rh2__Premium_Key__c;

  public java.lang.String getRh2__Premium_Key__c() {
    return rh2__Premium_Key__c;
  }

  

  public void setRh2__Premium_Key__c(java.lang.String rh2__Premium_Key__c) {
    this.rh2__Premium_Key__c = rh2__Premium_Key__c;
    rh2__Premium_Key__c__is_set = true;
  }
  
  /**
   * element  : rh2__RecordScope__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__RecordScope__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__RecordScope__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__RecordScope__c__is_set = false;

  private java.lang.Double rh2__RecordScope__c;

  public java.lang.Double getRh2__RecordScope__c() {
    return rh2__RecordScope__c;
  }

  

  public void setRh2__RecordScope__c(java.lang.Double rh2__RecordScope__c) {
    this.rh2__RecordScope__c = rh2__RecordScope__c;
    rh2__RecordScope__c__is_set = true;
  }
  
  /**
   * element  : rh2__Record_Size__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Record_Size__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Record_Size__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Record_Size__c__is_set = false;

  private java.lang.Double rh2__Record_Size__c;

  public java.lang.Double getRh2__Record_Size__c() {
    return rh2__Record_Size__c;
  }

  

  public void setRh2__Record_Size__c(java.lang.Double rh2__Record_Size__c) {
    this.rh2__Record_Size__c = rh2__Record_Size__c;
    rh2__Record_Size__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollups_Per_Async__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollups_Per_Async__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollups_Per_Async__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Rollups_Per_Async__c__is_set = false;

  private java.lang.Double rh2__Rollups_Per_Async__c;

  public java.lang.Double getRh2__Rollups_Per_Async__c() {
    return rh2__Rollups_Per_Async__c;
  }

  

  public void setRh2__Rollups_Per_Async__c(java.lang.Double rh2__Rollups_Per_Async__c) {
    this.rh2__Rollups_Per_Async__c = rh2__Rollups_Per_Async__c;
    rh2__Rollups_Per_Async__c__is_set = true;
  }
  
  /**
   * element  : rh2__Run_Validation_Rule__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Run_Validation_Rule__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Run_Validation_Rule__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__Run_Validation_Rule__c__is_set = false;

  private java.lang.Boolean rh2__Run_Validation_Rule__c;

  public java.lang.Boolean getRh2__Run_Validation_Rule__c() {
    return rh2__Run_Validation_Rule__c;
  }

  

  public void setRh2__Run_Validation_Rule__c(java.lang.Boolean rh2__Run_Validation_Rule__c) {
    this.rh2__Run_Validation_Rule__c = rh2__Run_Validation_Rule__c;
    rh2__Run_Validation_Rule__c__is_set = true;
  }
  
  /**
   * element  : rh2__runAsModifyingUserOnly__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__runAsModifyingUserOnly__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__runAsModifyingUserOnly__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__runAsModifyingUserOnly__c__is_set = false;

  private java.lang.Boolean rh2__runAsModifyingUserOnly__c;

  public java.lang.Boolean getRh2__runAsModifyingUserOnly__c() {
    return rh2__runAsModifyingUserOnly__c;
  }

  

  public void setRh2__runAsModifyingUserOnly__c(java.lang.Boolean rh2__runAsModifyingUserOnly__c) {
    this.rh2__runAsModifyingUserOnly__c = rh2__runAsModifyingUserOnly__c;
    rh2__runAsModifyingUserOnly__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "rh2__PS_Settings__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, SetupOwner__typeInfo, SetupOwner, SetupOwner__is_set);
    __typeMapper.writeString(__out, SetupOwnerId__typeInfo, SetupOwnerId, SetupOwnerId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, rh2__Advanced_Currency__c__typeInfo, rh2__Advanced_Currency__c, rh2__Advanced_Currency__c__is_set);
    __typeMapper.writeString(__out, rh2__Batch_Agent_Id__c__typeInfo, rh2__Batch_Agent_Id__c, rh2__Batch_Agent_Id__c__is_set);
    __typeMapper.writeObject(__out, rh2__Disable_Advanced_Currency__c__typeInfo, rh2__Disable_Advanced_Currency__c, rh2__Disable_Advanced_Currency__c__is_set);
    __typeMapper.writeObject(__out, rh2__Enable_Validation_Rule_Helper__c__typeInfo, rh2__Enable_Validation_Rule_Helper__c, rh2__Enable_Validation_Rule_Helper__c__is_set);
    __typeMapper.writeObject(__out, rh2__MaxBatch__c__typeInfo, rh2__MaxBatch__c, rh2__MaxBatch__c__is_set);
    __typeMapper.writeObject(__out, rh2__MaxFuture__c__typeInfo, rh2__MaxFuture__c, rh2__MaxFuture__c__is_set);
    __typeMapper.writeObject(__out, rh2__Max_Batch__c__typeInfo, rh2__Max_Batch__c, rh2__Max_Batch__c__is_set);
    __typeMapper.writeObject(__out, rh2__Max_Future__c__typeInfo, rh2__Max_Future__c, rh2__Max_Future__c__is_set);
    __typeMapper.writeString(__out, rh2__Parent_Sync_Job_Id__c__typeInfo, rh2__Parent_Sync_Job_Id__c, rh2__Parent_Sync_Job_Id__c__is_set);
    __typeMapper.writeString(__out, rh2__Premium_Key__c__typeInfo, rh2__Premium_Key__c, rh2__Premium_Key__c__is_set);
    __typeMapper.writeObject(__out, rh2__RecordScope__c__typeInfo, rh2__RecordScope__c, rh2__RecordScope__c__is_set);
    __typeMapper.writeObject(__out, rh2__Record_Size__c__typeInfo, rh2__Record_Size__c, rh2__Record_Size__c__is_set);
    __typeMapper.writeObject(__out, rh2__Rollups_Per_Async__c__typeInfo, rh2__Rollups_Per_Async__c, rh2__Rollups_Per_Async__c__is_set);
    __typeMapper.writeObject(__out, rh2__Run_Validation_Rule__c__typeInfo, rh2__Run_Validation_Rule__c, rh2__Run_Validation_Rule__c__is_set);
    __typeMapper.writeObject(__out, rh2__runAsModifyingUserOnly__c__typeInfo, rh2__runAsModifyingUserOnly__c, rh2__runAsModifyingUserOnly__c__is_set);
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
    if (__typeMapper.isElement(__in, AttachedContentDocuments__typeInfo)) {
      setAttachedContentDocuments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentDocuments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AttachedContentNotes__typeInfo)) {
      setAttachedContentNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AttachedContentNotes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, DuplicateRecordItems__typeInfo)) {
      setDuplicateRecordItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DuplicateRecordItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, RecordAssociatedGroups__typeInfo)) {
      setRecordAssociatedGroups((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecordAssociatedGroups__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupOwner__typeInfo)) {
      setSetupOwner((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, SetupOwner__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupOwnerId__typeInfo)) {
      setSetupOwnerId((java.lang.String)__typeMapper.readString(__in, SetupOwnerId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Advanced_Currency__c__typeInfo)) {
      setRh2__Advanced_Currency__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__Advanced_Currency__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Batch_Agent_Id__c__typeInfo)) {
      setRh2__Batch_Agent_Id__c((java.lang.String)__typeMapper.readString(__in, rh2__Batch_Agent_Id__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Disable_Advanced_Currency__c__typeInfo)) {
      setRh2__Disable_Advanced_Currency__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__Disable_Advanced_Currency__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Enable_Validation_Rule_Helper__c__typeInfo)) {
      setRh2__Enable_Validation_Rule_Helper__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__Enable_Validation_Rule_Helper__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__MaxBatch__c__typeInfo)) {
      setRh2__MaxBatch__c((java.lang.Double)__typeMapper.readObject(__in, rh2__MaxBatch__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__MaxFuture__c__typeInfo)) {
      setRh2__MaxFuture__c((java.lang.Double)__typeMapper.readObject(__in, rh2__MaxFuture__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Max_Batch__c__typeInfo)) {
      setRh2__Max_Batch__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Max_Batch__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Max_Future__c__typeInfo)) {
      setRh2__Max_Future__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Max_Future__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Parent_Sync_Job_Id__c__typeInfo)) {
      setRh2__Parent_Sync_Job_Id__c((java.lang.String)__typeMapper.readString(__in, rh2__Parent_Sync_Job_Id__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Premium_Key__c__typeInfo)) {
      setRh2__Premium_Key__c((java.lang.String)__typeMapper.readString(__in, rh2__Premium_Key__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__RecordScope__c__typeInfo)) {
      setRh2__RecordScope__c((java.lang.Double)__typeMapper.readObject(__in, rh2__RecordScope__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Record_Size__c__typeInfo)) {
      setRh2__Record_Size__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Record_Size__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollups_Per_Async__c__typeInfo)) {
      setRh2__Rollups_Per_Async__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Rollups_Per_Async__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Run_Validation_Rule__c__typeInfo)) {
      setRh2__Run_Validation_Rule__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__Run_Validation_Rule__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__runAsModifyingUserOnly__c__typeInfo)) {
      setRh2__runAsModifyingUserOnly__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__runAsModifyingUserOnly__c__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Rh2__PS_Settings__c ");
    sb.append(super.toString());
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
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
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" SetupOwner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupOwner)+"'\n");
    sb.append(" SetupOwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupOwnerId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" rh2__Advanced_Currency__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Advanced_Currency__c)+"'\n");
    sb.append(" rh2__Batch_Agent_Id__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Batch_Agent_Id__c)+"'\n");
    sb.append(" rh2__Disable_Advanced_Currency__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Disable_Advanced_Currency__c)+"'\n");
    sb.append(" rh2__Enable_Validation_Rule_Helper__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Enable_Validation_Rule_Helper__c)+"'\n");
    sb.append(" rh2__MaxBatch__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__MaxBatch__c)+"'\n");
    sb.append(" rh2__MaxFuture__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__MaxFuture__c)+"'\n");
    sb.append(" rh2__Max_Batch__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Max_Batch__c)+"'\n");
    sb.append(" rh2__Max_Future__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Max_Future__c)+"'\n");
    sb.append(" rh2__Parent_Sync_Job_Id__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Parent_Sync_Job_Id__c)+"'\n");
    sb.append(" rh2__Premium_Key__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Premium_Key__c)+"'\n");
    sb.append(" rh2__RecordScope__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__RecordScope__c)+"'\n");
    sb.append(" rh2__Record_Size__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Record_Size__c)+"'\n");
    sb.append(" rh2__Rollups_Per_Async__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollups_Per_Async__c)+"'\n");
    sb.append(" rh2__Run_Validation_Rule__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Run_Validation_Rule__c)+"'\n");
    sb.append(" rh2__runAsModifyingUserOnly__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__runAsModifyingUserOnly__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}