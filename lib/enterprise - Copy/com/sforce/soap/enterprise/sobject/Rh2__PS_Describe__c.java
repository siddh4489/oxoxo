package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Rh2__PS_Describe__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Rh2__PS_Describe__c() {
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
   * element  : Notes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Notes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Notes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Notes;

  public com.sforce.soap.enterprise.QueryResult getNotes() {
    return Notes;
  }

  

  public void setNotes(com.sforce.soap.enterprise.QueryResult Notes) {
    this.Notes = Notes;
    Notes__is_set = true;
  }
  
  /**
   * element  : NotesAndAttachments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo NotesAndAttachments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NotesAndAttachments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean NotesAndAttachments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult NotesAndAttachments;

  public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
    return NotesAndAttachments;
  }

  

  public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult NotesAndAttachments) {
    this.NotesAndAttachments = NotesAndAttachments;
    NotesAndAttachments__is_set = true;
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
   * element  : rh2__Account__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Account__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Account__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean rh2__Account__c__is_set = false;

  private java.lang.String rh2__Account__c;

  public java.lang.String getRh2__Account__c() {
    return rh2__Account__c;
  }

  

  public void setRh2__Account__c(java.lang.String rh2__Account__c) {
    this.rh2__Account__c = rh2__Account__c;
    rh2__Account__c__is_set = true;
  }
  
  /**
   * element  : rh2__Account__r of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Account__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Account__r","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean rh2__Account__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account rh2__Account__r;

  public com.sforce.soap.enterprise.sobject.Account getRh2__Account__r() {
    return rh2__Account__r;
  }

  

  public void setRh2__Account__r(com.sforce.soap.enterprise.sobject.Account rh2__Account__r) {
    this.rh2__Account__r = rh2__Account__r;
    rh2__Account__r__is_set = true;
  }
  
  /**
   * element  : rh2__Asynchronous__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Asynchronous__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Asynchronous__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__Asynchronous__c__is_set = false;

  private java.lang.Boolean rh2__Asynchronous__c;

  public java.lang.Boolean getRh2__Asynchronous__c() {
    return rh2__Asynchronous__c;
  }

  

  public void setRh2__Asynchronous__c(java.lang.Boolean rh2__Asynchronous__c) {
    this.rh2__Asynchronous__c = rh2__Asynchronous__c;
    rh2__Asynchronous__c__is_set = true;
  }
  
  /**
   * element  : rh2__Contact2__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Contact2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Contact2__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean rh2__Contact2__c__is_set = false;

  private java.lang.String rh2__Contact2__c;

  public java.lang.String getRh2__Contact2__c() {
    return rh2__Contact2__c;
  }

  

  public void setRh2__Contact2__c(java.lang.String rh2__Contact2__c) {
    this.rh2__Contact2__c = rh2__Contact2__c;
    rh2__Contact2__c__is_set = true;
  }
  
  /**
   * element  : rh2__Contact2__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Contact2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Contact2__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean rh2__Contact2__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact rh2__Contact2__r;

  public com.sforce.soap.enterprise.sobject.Contact getRh2__Contact2__r() {
    return rh2__Contact2__r;
  }

  

  public void setRh2__Contact2__r(com.sforce.soap.enterprise.sobject.Contact rh2__Contact2__r) {
    this.rh2__Contact2__r = rh2__Contact2__r;
    rh2__Contact2__r__is_set = true;
  }
  
  /**
   * element  : rh2__Contact__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Contact__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean rh2__Contact__c__is_set = false;

  private java.lang.String rh2__Contact__c;

  public java.lang.String getRh2__Contact__c() {
    return rh2__Contact__c;
  }

  

  public void setRh2__Contact__c(java.lang.String rh2__Contact__c) {
    this.rh2__Contact__c = rh2__Contact__c;
    rh2__Contact__c__is_set = true;
  }
  
  /**
   * element  : rh2__Contact__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Contact__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Contact__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean rh2__Contact__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact rh2__Contact__r;

  public com.sforce.soap.enterprise.sobject.Contact getRh2__Contact__r() {
    return rh2__Contact__r;
  }

  

  public void setRh2__Contact__r(com.sforce.soap.enterprise.sobject.Contact rh2__Contact__r) {
    this.rh2__Contact__r = rh2__Contact__r;
    rh2__Contact__r__is_set = true;
  }
  
  /**
   * element  : rh2__Contacts__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Contacts__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Contacts__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Contacts__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Contacts__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Contacts__r() {
    return rh2__Contacts__r;
  }

  

  public void setRh2__Contacts__r(com.sforce.soap.enterprise.QueryResult rh2__Contacts__r) {
    this.rh2__Contacts__r = rh2__Contacts__r;
    rh2__Contacts__r__is_set = true;
  }
  
  /**
   * element  : rh2__Data_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Data_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Data_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Data_Type__c__is_set = false;

  private java.lang.String rh2__Data_Type__c;

  public java.lang.String getRh2__Data_Type__c() {
    return rh2__Data_Type__c;
  }

  

  public void setRh2__Data_Type__c(java.lang.String rh2__Data_Type__c) {
    this.rh2__Data_Type__c = rh2__Data_Type__c;
    rh2__Data_Type__c__is_set = true;
  }
  
  /**
   * element  : rh2__Describes1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Describes1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Describes1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Describes1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Describes1__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Describes1__r() {
    return rh2__Describes1__r;
  }

  

  public void setRh2__Describes1__r(com.sforce.soap.enterprise.QueryResult rh2__Describes1__r) {
    this.rh2__Describes1__r = rh2__Describes1__r;
    rh2__Describes1__r__is_set = true;
  }
  
  /**
   * element  : rh2__Describes__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Describes__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Describes__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Describes__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Describes__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Describes__r() {
    return rh2__Describes__r;
  }

  

  public void setRh2__Describes__r(com.sforce.soap.enterprise.QueryResult rh2__Describes__r) {
    this.rh2__Describes__r = rh2__Describes__r;
    rh2__Describes__r__is_set = true;
  }
  
  /**
   * element  : rh2__Foreign_Key_Test_Currency__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Foreign_Key_Test_Currency__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Foreign_Key_Test_Currency__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Foreign_Key_Test_Currency__c__is_set = false;

  private java.lang.Double rh2__Foreign_Key_Test_Currency__c;

  public java.lang.Double getRh2__Foreign_Key_Test_Currency__c() {
    return rh2__Foreign_Key_Test_Currency__c;
  }

  

  public void setRh2__Foreign_Key_Test_Currency__c(java.lang.Double rh2__Foreign_Key_Test_Currency__c) {
    this.rh2__Foreign_Key_Test_Currency__c = rh2__Foreign_Key_Test_Currency__c;
    rh2__Foreign_Key_Test_Currency__c__is_set = true;
  }
  
  /**
   * element  : rh2__Hierarchy_Test_2__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Hierarchy_Test_2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Hierarchy_Test_2__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean rh2__Hierarchy_Test_2__c__is_set = false;

  private java.lang.String rh2__Hierarchy_Test_2__c;

  public java.lang.String getRh2__Hierarchy_Test_2__c() {
    return rh2__Hierarchy_Test_2__c;
  }

  

  public void setRh2__Hierarchy_Test_2__c(java.lang.String rh2__Hierarchy_Test_2__c) {
    this.rh2__Hierarchy_Test_2__c = rh2__Hierarchy_Test_2__c;
    rh2__Hierarchy_Test_2__c__is_set = true;
  }
  
  /**
   * element  : rh2__Hierarchy_Test_2__r of type {urn:sobject.enterprise.soap.sforce.com}rh2__PS_Describe__c
   * java type: com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Hierarchy_Test_2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Hierarchy_Test_2__r","urn:sobject.enterprise.soap.sforce.com","rh2__PS_Describe__c",0,1,true);

  private boolean rh2__Hierarchy_Test_2__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c rh2__Hierarchy_Test_2__r;

  public com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c getRh2__Hierarchy_Test_2__r() {
    return rh2__Hierarchy_Test_2__r;
  }

  

  public void setRh2__Hierarchy_Test_2__r(com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c rh2__Hierarchy_Test_2__r) {
    this.rh2__Hierarchy_Test_2__r = rh2__Hierarchy_Test_2__r;
    rh2__Hierarchy_Test_2__r__is_set = true;
  }
  
  /**
   * element  : rh2__Hierarchy_Test__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Hierarchy_Test__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Hierarchy_Test__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean rh2__Hierarchy_Test__c__is_set = false;

  private java.lang.String rh2__Hierarchy_Test__c;

  public java.lang.String getRh2__Hierarchy_Test__c() {
    return rh2__Hierarchy_Test__c;
  }

  

  public void setRh2__Hierarchy_Test__c(java.lang.String rh2__Hierarchy_Test__c) {
    this.rh2__Hierarchy_Test__c = rh2__Hierarchy_Test__c;
    rh2__Hierarchy_Test__c__is_set = true;
  }
  
  /**
   * element  : rh2__Hierarchy_Test__r of type {urn:sobject.enterprise.soap.sforce.com}rh2__PS_Describe__c
   * java type: com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Hierarchy_Test__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Hierarchy_Test__r","urn:sobject.enterprise.soap.sforce.com","rh2__PS_Describe__c",0,1,true);

  private boolean rh2__Hierarchy_Test__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c rh2__Hierarchy_Test__r;

  public com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c getRh2__Hierarchy_Test__r() {
    return rh2__Hierarchy_Test__r;
  }

  

  public void setRh2__Hierarchy_Test__r(com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c rh2__Hierarchy_Test__r) {
    this.rh2__Hierarchy_Test__r = rh2__Hierarchy_Test__r;
    rh2__Hierarchy_Test__r__is_set = true;
  }
  
  /**
   * element  : rh2__Label__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Label__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Label__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Label__c__is_set = false;

  private java.lang.String rh2__Label__c;

  public java.lang.String getRh2__Label__c() {
    return rh2__Label__c;
  }

  

  public void setRh2__Label__c(java.lang.String rh2__Label__c) {
    this.rh2__Label__c = rh2__Label__c;
    rh2__Label__c__is_set = true;
  }
  
  /**
   * element  : rh2__Object__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Object__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Object__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Object__c__is_set = false;

  private java.lang.String rh2__Object__c;

  public java.lang.String getRh2__Object__c() {
    return rh2__Object__c;
  }

  

  public void setRh2__Object__c(java.lang.String rh2__Object__c) {
    this.rh2__Object__c = rh2__Object__c;
    rh2__Object__c__is_set = true;
  }
  
  /**
   * element  : rh2__Real_Time__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Real_Time__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Real_Time__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__Real_Time__c__is_set = false;

  private java.lang.Boolean rh2__Real_Time__c;

  public java.lang.Boolean getRh2__Real_Time__c() {
    return rh2__Real_Time__c;
  }

  

  public void setRh2__Real_Time__c(java.lang.Boolean rh2__Real_Time__c) {
    this.rh2__Real_Time__c = rh2__Real_Time__c;
    rh2__Real_Time__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_10__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_10__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_10__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_10__c__is_set = false;

  private java.lang.String rh2__Rollup_10__c;

  public java.lang.String getRh2__Rollup_10__c() {
    return rh2__Rollup_10__c;
  }

  

  public void setRh2__Rollup_10__c(java.lang.String rh2__Rollup_10__c) {
    this.rh2__Rollup_10__c = rh2__Rollup_10__c;
    rh2__Rollup_10__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_11__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_11__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_11__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_11__c__is_set = false;

  private java.lang.String rh2__Rollup_11__c;

  public java.lang.String getRh2__Rollup_11__c() {
    return rh2__Rollup_11__c;
  }

  

  public void setRh2__Rollup_11__c(java.lang.String rh2__Rollup_11__c) {
    this.rh2__Rollup_11__c = rh2__Rollup_11__c;
    rh2__Rollup_11__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_12__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_12__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_12__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_12__c__is_set = false;

  private java.lang.String rh2__Rollup_12__c;

  public java.lang.String getRh2__Rollup_12__c() {
    return rh2__Rollup_12__c;
  }

  

  public void setRh2__Rollup_12__c(java.lang.String rh2__Rollup_12__c) {
    this.rh2__Rollup_12__c = rh2__Rollup_12__c;
    rh2__Rollup_12__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_13__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_13__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_13__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_13__c__is_set = false;

  private java.lang.String rh2__Rollup_13__c;

  public java.lang.String getRh2__Rollup_13__c() {
    return rh2__Rollup_13__c;
  }

  

  public void setRh2__Rollup_13__c(java.lang.String rh2__Rollup_13__c) {
    this.rh2__Rollup_13__c = rh2__Rollup_13__c;
    rh2__Rollup_13__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_14__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_14__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_14__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_14__c__is_set = false;

  private java.lang.String rh2__Rollup_14__c;

  public java.lang.String getRh2__Rollup_14__c() {
    return rh2__Rollup_14__c;
  }

  

  public void setRh2__Rollup_14__c(java.lang.String rh2__Rollup_14__c) {
    this.rh2__Rollup_14__c = rh2__Rollup_14__c;
    rh2__Rollup_14__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_15__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_15__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_15__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_15__c__is_set = false;

  private java.lang.String rh2__Rollup_15__c;

  public java.lang.String getRh2__Rollup_15__c() {
    return rh2__Rollup_15__c;
  }

  

  public void setRh2__Rollup_15__c(java.lang.String rh2__Rollup_15__c) {
    this.rh2__Rollup_15__c = rh2__Rollup_15__c;
    rh2__Rollup_15__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_16__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_16__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_16__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_16__c__is_set = false;

  private java.lang.String rh2__Rollup_16__c;

  public java.lang.String getRh2__Rollup_16__c() {
    return rh2__Rollup_16__c;
  }

  

  public void setRh2__Rollup_16__c(java.lang.String rh2__Rollup_16__c) {
    this.rh2__Rollup_16__c = rh2__Rollup_16__c;
    rh2__Rollup_16__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_17__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_17__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_17__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_17__c__is_set = false;

  private java.lang.String rh2__Rollup_17__c;

  public java.lang.String getRh2__Rollup_17__c() {
    return rh2__Rollup_17__c;
  }

  

  public void setRh2__Rollup_17__c(java.lang.String rh2__Rollup_17__c) {
    this.rh2__Rollup_17__c = rh2__Rollup_17__c;
    rh2__Rollup_17__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_18__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_18__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_18__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_18__c__is_set = false;

  private java.lang.String rh2__Rollup_18__c;

  public java.lang.String getRh2__Rollup_18__c() {
    return rh2__Rollup_18__c;
  }

  

  public void setRh2__Rollup_18__c(java.lang.String rh2__Rollup_18__c) {
    this.rh2__Rollup_18__c = rh2__Rollup_18__c;
    rh2__Rollup_18__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_19__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_19__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_19__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_19__c__is_set = false;

  private java.lang.String rh2__Rollup_19__c;

  public java.lang.String getRh2__Rollup_19__c() {
    return rh2__Rollup_19__c;
  }

  

  public void setRh2__Rollup_19__c(java.lang.String rh2__Rollup_19__c) {
    this.rh2__Rollup_19__c = rh2__Rollup_19__c;
    rh2__Rollup_19__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_1__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_1__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_1__c__is_set = false;

  private java.lang.String rh2__Rollup_1__c;

  public java.lang.String getRh2__Rollup_1__c() {
    return rh2__Rollup_1__c;
  }

  

  public void setRh2__Rollup_1__c(java.lang.String rh2__Rollup_1__c) {
    this.rh2__Rollup_1__c = rh2__Rollup_1__c;
    rh2__Rollup_1__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_20__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_20__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_20__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_20__c__is_set = false;

  private java.lang.String rh2__Rollup_20__c;

  public java.lang.String getRh2__Rollup_20__c() {
    return rh2__Rollup_20__c;
  }

  

  public void setRh2__Rollup_20__c(java.lang.String rh2__Rollup_20__c) {
    this.rh2__Rollup_20__c = rh2__Rollup_20__c;
    rh2__Rollup_20__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_21__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_21__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_21__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_21__c__is_set = false;

  private java.lang.String rh2__Rollup_21__c;

  public java.lang.String getRh2__Rollup_21__c() {
    return rh2__Rollup_21__c;
  }

  

  public void setRh2__Rollup_21__c(java.lang.String rh2__Rollup_21__c) {
    this.rh2__Rollup_21__c = rh2__Rollup_21__c;
    rh2__Rollup_21__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_22__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_22__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_22__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_22__c__is_set = false;

  private java.lang.String rh2__Rollup_22__c;

  public java.lang.String getRh2__Rollup_22__c() {
    return rh2__Rollup_22__c;
  }

  

  public void setRh2__Rollup_22__c(java.lang.String rh2__Rollup_22__c) {
    this.rh2__Rollup_22__c = rh2__Rollup_22__c;
    rh2__Rollup_22__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_23__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_23__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_23__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_23__c__is_set = false;

  private java.lang.String rh2__Rollup_23__c;

  public java.lang.String getRh2__Rollup_23__c() {
    return rh2__Rollup_23__c;
  }

  

  public void setRh2__Rollup_23__c(java.lang.String rh2__Rollup_23__c) {
    this.rh2__Rollup_23__c = rh2__Rollup_23__c;
    rh2__Rollup_23__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_24__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_24__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_24__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_24__c__is_set = false;

  private java.lang.String rh2__Rollup_24__c;

  public java.lang.String getRh2__Rollup_24__c() {
    return rh2__Rollup_24__c;
  }

  

  public void setRh2__Rollup_24__c(java.lang.String rh2__Rollup_24__c) {
    this.rh2__Rollup_24__c = rh2__Rollup_24__c;
    rh2__Rollup_24__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_25__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_25__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_25__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_25__c__is_set = false;

  private java.lang.String rh2__Rollup_25__c;

  public java.lang.String getRh2__Rollup_25__c() {
    return rh2__Rollup_25__c;
  }

  

  public void setRh2__Rollup_25__c(java.lang.String rh2__Rollup_25__c) {
    this.rh2__Rollup_25__c = rh2__Rollup_25__c;
    rh2__Rollup_25__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_26__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_26__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_26__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_26__c__is_set = false;

  private java.lang.String rh2__Rollup_26__c;

  public java.lang.String getRh2__Rollup_26__c() {
    return rh2__Rollup_26__c;
  }

  

  public void setRh2__Rollup_26__c(java.lang.String rh2__Rollup_26__c) {
    this.rh2__Rollup_26__c = rh2__Rollup_26__c;
    rh2__Rollup_26__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_27__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_27__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_27__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_27__c__is_set = false;

  private java.lang.String rh2__Rollup_27__c;

  public java.lang.String getRh2__Rollup_27__c() {
    return rh2__Rollup_27__c;
  }

  

  public void setRh2__Rollup_27__c(java.lang.String rh2__Rollup_27__c) {
    this.rh2__Rollup_27__c = rh2__Rollup_27__c;
    rh2__Rollup_27__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_28__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_28__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_28__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_28__c__is_set = false;

  private java.lang.String rh2__Rollup_28__c;

  public java.lang.String getRh2__Rollup_28__c() {
    return rh2__Rollup_28__c;
  }

  

  public void setRh2__Rollup_28__c(java.lang.String rh2__Rollup_28__c) {
    this.rh2__Rollup_28__c = rh2__Rollup_28__c;
    rh2__Rollup_28__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_29__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_29__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_29__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_29__c__is_set = false;

  private java.lang.String rh2__Rollup_29__c;

  public java.lang.String getRh2__Rollup_29__c() {
    return rh2__Rollup_29__c;
  }

  

  public void setRh2__Rollup_29__c(java.lang.String rh2__Rollup_29__c) {
    this.rh2__Rollup_29__c = rh2__Rollup_29__c;
    rh2__Rollup_29__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_2__c__is_set = false;

  private java.lang.String rh2__Rollup_2__c;

  public java.lang.String getRh2__Rollup_2__c() {
    return rh2__Rollup_2__c;
  }

  

  public void setRh2__Rollup_2__c(java.lang.String rh2__Rollup_2__c) {
    this.rh2__Rollup_2__c = rh2__Rollup_2__c;
    rh2__Rollup_2__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_30__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_30__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_30__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_30__c__is_set = false;

  private java.lang.String rh2__Rollup_30__c;

  public java.lang.String getRh2__Rollup_30__c() {
    return rh2__Rollup_30__c;
  }

  

  public void setRh2__Rollup_30__c(java.lang.String rh2__Rollup_30__c) {
    this.rh2__Rollup_30__c = rh2__Rollup_30__c;
    rh2__Rollup_30__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_31__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_31__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_31__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_31__c__is_set = false;

  private java.lang.String rh2__Rollup_31__c;

  public java.lang.String getRh2__Rollup_31__c() {
    return rh2__Rollup_31__c;
  }

  

  public void setRh2__Rollup_31__c(java.lang.String rh2__Rollup_31__c) {
    this.rh2__Rollup_31__c = rh2__Rollup_31__c;
    rh2__Rollup_31__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_32__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_32__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_32__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_32__c__is_set = false;

  private java.lang.String rh2__Rollup_32__c;

  public java.lang.String getRh2__Rollup_32__c() {
    return rh2__Rollup_32__c;
  }

  

  public void setRh2__Rollup_32__c(java.lang.String rh2__Rollup_32__c) {
    this.rh2__Rollup_32__c = rh2__Rollup_32__c;
    rh2__Rollup_32__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_33__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_33__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_33__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_33__c__is_set = false;

  private java.lang.String rh2__Rollup_33__c;

  public java.lang.String getRh2__Rollup_33__c() {
    return rh2__Rollup_33__c;
  }

  

  public void setRh2__Rollup_33__c(java.lang.String rh2__Rollup_33__c) {
    this.rh2__Rollup_33__c = rh2__Rollup_33__c;
    rh2__Rollup_33__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_34__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_34__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_34__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_34__c__is_set = false;

  private java.lang.String rh2__Rollup_34__c;

  public java.lang.String getRh2__Rollup_34__c() {
    return rh2__Rollup_34__c;
  }

  

  public void setRh2__Rollup_34__c(java.lang.String rh2__Rollup_34__c) {
    this.rh2__Rollup_34__c = rh2__Rollup_34__c;
    rh2__Rollup_34__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_35__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_35__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_35__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_35__c__is_set = false;

  private java.lang.String rh2__Rollup_35__c;

  public java.lang.String getRh2__Rollup_35__c() {
    return rh2__Rollup_35__c;
  }

  

  public void setRh2__Rollup_35__c(java.lang.String rh2__Rollup_35__c) {
    this.rh2__Rollup_35__c = rh2__Rollup_35__c;
    rh2__Rollup_35__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_36__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_36__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_36__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_36__c__is_set = false;

  private java.lang.String rh2__Rollup_36__c;

  public java.lang.String getRh2__Rollup_36__c() {
    return rh2__Rollup_36__c;
  }

  

  public void setRh2__Rollup_36__c(java.lang.String rh2__Rollup_36__c) {
    this.rh2__Rollup_36__c = rh2__Rollup_36__c;
    rh2__Rollup_36__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_37__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_37__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_37__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_37__c__is_set = false;

  private java.lang.String rh2__Rollup_37__c;

  public java.lang.String getRh2__Rollup_37__c() {
    return rh2__Rollup_37__c;
  }

  

  public void setRh2__Rollup_37__c(java.lang.String rh2__Rollup_37__c) {
    this.rh2__Rollup_37__c = rh2__Rollup_37__c;
    rh2__Rollup_37__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_38__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_38__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_38__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_38__c__is_set = false;

  private java.lang.String rh2__Rollup_38__c;

  public java.lang.String getRh2__Rollup_38__c() {
    return rh2__Rollup_38__c;
  }

  

  public void setRh2__Rollup_38__c(java.lang.String rh2__Rollup_38__c) {
    this.rh2__Rollup_38__c = rh2__Rollup_38__c;
    rh2__Rollup_38__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_39__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_39__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_39__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_39__c__is_set = false;

  private java.lang.String rh2__Rollup_39__c;

  public java.lang.String getRh2__Rollup_39__c() {
    return rh2__Rollup_39__c;
  }

  

  public void setRh2__Rollup_39__c(java.lang.String rh2__Rollup_39__c) {
    this.rh2__Rollup_39__c = rh2__Rollup_39__c;
    rh2__Rollup_39__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_3__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_3__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_3__c__is_set = false;

  private java.lang.String rh2__Rollup_3__c;

  public java.lang.String getRh2__Rollup_3__c() {
    return rh2__Rollup_3__c;
  }

  

  public void setRh2__Rollup_3__c(java.lang.String rh2__Rollup_3__c) {
    this.rh2__Rollup_3__c = rh2__Rollup_3__c;
    rh2__Rollup_3__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_40__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_40__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_40__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_40__c__is_set = false;

  private java.lang.String rh2__Rollup_40__c;

  public java.lang.String getRh2__Rollup_40__c() {
    return rh2__Rollup_40__c;
  }

  

  public void setRh2__Rollup_40__c(java.lang.String rh2__Rollup_40__c) {
    this.rh2__Rollup_40__c = rh2__Rollup_40__c;
    rh2__Rollup_40__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_4__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_4__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_4__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_4__c__is_set = false;

  private java.lang.String rh2__Rollup_4__c;

  public java.lang.String getRh2__Rollup_4__c() {
    return rh2__Rollup_4__c;
  }

  

  public void setRh2__Rollup_4__c(java.lang.String rh2__Rollup_4__c) {
    this.rh2__Rollup_4__c = rh2__Rollup_4__c;
    rh2__Rollup_4__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_5__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_5__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_5__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_5__c__is_set = false;

  private java.lang.String rh2__Rollup_5__c;

  public java.lang.String getRh2__Rollup_5__c() {
    return rh2__Rollup_5__c;
  }

  

  public void setRh2__Rollup_5__c(java.lang.String rh2__Rollup_5__c) {
    this.rh2__Rollup_5__c = rh2__Rollup_5__c;
    rh2__Rollup_5__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_6__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_6__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_6__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_6__c__is_set = false;

  private java.lang.String rh2__Rollup_6__c;

  public java.lang.String getRh2__Rollup_6__c() {
    return rh2__Rollup_6__c;
  }

  

  public void setRh2__Rollup_6__c(java.lang.String rh2__Rollup_6__c) {
    this.rh2__Rollup_6__c = rh2__Rollup_6__c;
    rh2__Rollup_6__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_7__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_7__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_7__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_7__c__is_set = false;

  private java.lang.String rh2__Rollup_7__c;

  public java.lang.String getRh2__Rollup_7__c() {
    return rh2__Rollup_7__c;
  }

  

  public void setRh2__Rollup_7__c(java.lang.String rh2__Rollup_7__c) {
    this.rh2__Rollup_7__c = rh2__Rollup_7__c;
    rh2__Rollup_7__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_8__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_8__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_8__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_8__c__is_set = false;

  private java.lang.String rh2__Rollup_8__c;

  public java.lang.String getRh2__Rollup_8__c() {
    return rh2__Rollup_8__c;
  }

  

  public void setRh2__Rollup_8__c(java.lang.String rh2__Rollup_8__c) {
    this.rh2__Rollup_8__c = rh2__Rollup_8__c;
    rh2__Rollup_8__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_9__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_9__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_9__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Rollup_9__c__is_set = false;

  private java.lang.String rh2__Rollup_9__c;

  public java.lang.String getRh2__Rollup_9__c() {
    return rh2__Rollup_9__c;
  }

  

  public void setRh2__Rollup_9__c(java.lang.String rh2__Rollup_9__c) {
    this.rh2__Rollup_9__c = rh2__Rollup_9__c;
    rh2__Rollup_9__c__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_Conditions__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_Conditions__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_Conditions__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Rollup_Conditions__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Rollup_Conditions__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Rollup_Conditions__r() {
    return rh2__Rollup_Conditions__r;
  }

  

  public void setRh2__Rollup_Conditions__r(com.sforce.soap.enterprise.QueryResult rh2__Rollup_Conditions__r) {
    this.rh2__Rollup_Conditions__r = rh2__Rollup_Conditions__r;
    rh2__Rollup_Conditions__r__is_set = true;
  }
  
  /**
   * element  : rh2__Selected__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Selected__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Selected__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean rh2__Selected__c__is_set = false;

  private java.lang.Boolean rh2__Selected__c;

  public java.lang.Boolean getRh2__Selected__c() {
    return rh2__Selected__c;
  }

  

  public void setRh2__Selected__c(java.lang.Boolean rh2__Selected__c) {
    this.rh2__Selected__c = rh2__Selected__c;
    rh2__Selected__c__is_set = true;
  }
  
  /**
   * element  : rh2__Sum_Integer_Double__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Sum_Integer_Double__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Sum_Integer_Double__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Sum_Integer_Double__c__is_set = false;

  private java.lang.Double rh2__Sum_Integer_Double__c;

  public java.lang.Double getRh2__Sum_Integer_Double__c() {
    return rh2__Sum_Integer_Double__c;
  }

  

  public void setRh2__Sum_Integer_Double__c(java.lang.Double rh2__Sum_Integer_Double__c) {
    this.rh2__Sum_Integer_Double__c = rh2__Sum_Integer_Double__c;
    rh2__Sum_Integer_Double__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Currency__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Currency__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Currency__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Test_Currency__c__is_set = false;

  private java.lang.Double rh2__Test_Currency__c;

  public java.lang.Double getRh2__Test_Currency__c() {
    return rh2__Test_Currency__c;
  }

  

  public void setRh2__Test_Currency__c(java.lang.Double rh2__Test_Currency__c) {
    this.rh2__Test_Currency__c = rh2__Test_Currency__c;
    rh2__Test_Currency__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Date_Time__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Date_Time__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Date_Time__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean rh2__Test_Date_Time__c__is_set = false;

  private java.util.Calendar rh2__Test_Date_Time__c;

  public java.util.Calendar getRh2__Test_Date_Time__c() {
    return rh2__Test_Date_Time__c;
  }

  

  public void setRh2__Test_Date_Time__c(java.util.Calendar rh2__Test_Date_Time__c) {
    this.rh2__Test_Date_Time__c = rh2__Test_Date_Time__c;
    rh2__Test_Date_Time__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean rh2__Test_Date__c__is_set = false;

  private java.util.Calendar rh2__Test_Date__c;

  public java.util.Calendar getRh2__Test_Date__c() {
    return rh2__Test_Date__c;
  }

  

  public void setRh2__Test_Date__c(java.util.Calendar rh2__Test_Date__c) {
    this.rh2__Test_Date__c = rh2__Test_Date__c;
    rh2__Test_Date__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Double__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Double__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Double__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Test_Double__c__is_set = false;

  private java.lang.Double rh2__Test_Double__c;

  public java.lang.Double getRh2__Test_Double__c() {
    return rh2__Test_Double__c;
  }

  

  public void setRh2__Test_Double__c(java.lang.Double rh2__Test_Double__c) {
    this.rh2__Test_Double__c = rh2__Test_Double__c;
    rh2__Test_Double__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean rh2__Test_End_Date__c__is_set = false;

  private java.util.Calendar rh2__Test_End_Date__c;

  public java.util.Calendar getRh2__Test_End_Date__c() {
    return rh2__Test_End_Date__c;
  }

  

  public void setRh2__Test_End_Date__c(java.util.Calendar rh2__Test_End_Date__c) {
    this.rh2__Test_End_Date__c = rh2__Test_End_Date__c;
    rh2__Test_End_Date__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Formula_FK_Currency__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Formula_FK_Currency__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Formula_FK_Currency__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Test_Formula_FK_Currency__c__is_set = false;

  private java.lang.Double rh2__Test_Formula_FK_Currency__c;

  public java.lang.Double getRh2__Test_Formula_FK_Currency__c() {
    return rh2__Test_Formula_FK_Currency__c;
  }

  

  public void setRh2__Test_Formula_FK_Currency__c(java.lang.Double rh2__Test_Formula_FK_Currency__c) {
    this.rh2__Test_Formula_FK_Currency__c = rh2__Test_Formula_FK_Currency__c;
    rh2__Test_Formula_FK_Currency__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Formula__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Formula__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Formula__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Test_Formula__c__is_set = false;

  private java.lang.Double rh2__Test_Formula__c;

  public java.lang.Double getRh2__Test_Formula__c() {
    return rh2__Test_Formula__c;
  }

  

  public void setRh2__Test_Formula__c(java.lang.Double rh2__Test_Formula__c) {
    this.rh2__Test_Formula__c = rh2__Test_Formula__c;
    rh2__Test_Formula__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Integer2__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Integer2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Integer2__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Test_Integer2__c__is_set = false;

  private java.lang.Double rh2__Test_Integer2__c;

  public java.lang.Double getRh2__Test_Integer2__c() {
    return rh2__Test_Integer2__c;
  }

  

  public void setRh2__Test_Integer2__c(java.lang.Double rh2__Test_Integer2__c) {
    this.rh2__Test_Integer2__c = rh2__Test_Integer2__c;
    rh2__Test_Integer2__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Integer__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Integer__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Integer__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Test_Integer__c__is_set = false;

  private java.lang.Double rh2__Test_Integer__c;

  public java.lang.Double getRh2__Test_Integer__c() {
    return rh2__Test_Integer__c;
  }

  

  public void setRh2__Test_Integer__c(java.lang.Double rh2__Test_Integer__c) {
    this.rh2__Test_Integer__c = rh2__Test_Integer__c;
    rh2__Test_Integer__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Long_Text__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Long_Text__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Long_Text__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Test_Long_Text__c__is_set = false;

  private java.lang.String rh2__Test_Long_Text__c;

  public java.lang.String getRh2__Test_Long_Text__c() {
    return rh2__Test_Long_Text__c;
  }

  

  public void setRh2__Test_Long_Text__c(java.lang.String rh2__Test_Long_Text__c) {
    this.rh2__Test_Long_Text__c = rh2__Test_Long_Text__c;
    rh2__Test_Long_Text__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Multi_Picklist__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Multi_Picklist__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Multi_Picklist__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Test_Multi_Picklist__c__is_set = false;

  private java.lang.String rh2__Test_Multi_Picklist__c;

  public java.lang.String getRh2__Test_Multi_Picklist__c() {
    return rh2__Test_Multi_Picklist__c;
  }

  

  public void setRh2__Test_Multi_Picklist__c(java.lang.String rh2__Test_Multi_Picklist__c) {
    this.rh2__Test_Multi_Picklist__c = rh2__Test_Multi_Picklist__c;
    rh2__Test_Multi_Picklist__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Picklist__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Picklist__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Picklist__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Test_Picklist__c__is_set = false;

  private java.lang.String rh2__Test_Picklist__c;

  public java.lang.String getRh2__Test_Picklist__c() {
    return rh2__Test_Picklist__c;
  }

  

  public void setRh2__Test_Picklist__c(java.lang.String rh2__Test_Picklist__c) {
    this.rh2__Test_Picklist__c = rh2__Test_Picklist__c;
    rh2__Test_Picklist__c__is_set = true;
  }
  
  /**
   * element  : rh2__Test_Rich_Text__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Test_Rich_Text__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Test_Rich_Text__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean rh2__Test_Rich_Text__c__is_set = false;

  private java.lang.String rh2__Test_Rich_Text__c;

  public java.lang.String getRh2__Test_Rich_Text__c() {
    return rh2__Test_Rich_Text__c;
  }

  

  public void setRh2__Test_Rich_Text__c(java.lang.String rh2__Test_Rich_Text__c) {
    this.rh2__Test_Rich_Text__c = rh2__Test_Rich_Text__c;
    rh2__Test_Rich_Text__c__is_set = true;
  }
  
  /**
   * element  : rh2__User__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__User__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean rh2__User__c__is_set = false;

  private java.lang.String rh2__User__c;

  public java.lang.String getRh2__User__c() {
    return rh2__User__c;
  }

  

  public void setRh2__User__c(java.lang.String rh2__User__c) {
    this.rh2__User__c = rh2__User__c;
    rh2__User__c__is_set = true;
  }
  
  /**
   * element  : rh2__User__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__User__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__User__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean rh2__User__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User rh2__User__r;

  public com.sforce.soap.enterprise.sobject.User getRh2__User__r() {
    return rh2__User__r;
  }

  

  public void setRh2__User__r(com.sforce.soap.enterprise.sobject.User rh2__User__r) {
    this.rh2__User__r = rh2__User__r;
    rh2__User__r__is_set = true;
  }
  
  /**
   * element  : rh2__Validation_Test_Int__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Validation_Test_Int__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Validation_Test_Int__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean rh2__Validation_Test_Int__c__is_set = false;

  private java.lang.Double rh2__Validation_Test_Int__c;

  public java.lang.Double getRh2__Validation_Test_Int__c() {
    return rh2__Validation_Test_Int__c;
  }

  

  public void setRh2__Validation_Test_Int__c(java.lang.Double rh2__Validation_Test_Int__c) {
    this.rh2__Validation_Test_Int__c = rh2__Validation_Test_Int__c;
    rh2__Validation_Test_Int__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "rh2__PS_Describe__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
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
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeString(__out, rh2__Account__c__typeInfo, rh2__Account__c, rh2__Account__c__is_set);
    __typeMapper.writeObject(__out, rh2__Account__r__typeInfo, rh2__Account__r, rh2__Account__r__is_set);
    __typeMapper.writeObject(__out, rh2__Asynchronous__c__typeInfo, rh2__Asynchronous__c, rh2__Asynchronous__c__is_set);
    __typeMapper.writeString(__out, rh2__Contact2__c__typeInfo, rh2__Contact2__c, rh2__Contact2__c__is_set);
    __typeMapper.writeObject(__out, rh2__Contact2__r__typeInfo, rh2__Contact2__r, rh2__Contact2__r__is_set);
    __typeMapper.writeString(__out, rh2__Contact__c__typeInfo, rh2__Contact__c, rh2__Contact__c__is_set);
    __typeMapper.writeObject(__out, rh2__Contact__r__typeInfo, rh2__Contact__r, rh2__Contact__r__is_set);
    __typeMapper.writeObject(__out, rh2__Contacts__r__typeInfo, rh2__Contacts__r, rh2__Contacts__r__is_set);
    __typeMapper.writeString(__out, rh2__Data_Type__c__typeInfo, rh2__Data_Type__c, rh2__Data_Type__c__is_set);
    __typeMapper.writeObject(__out, rh2__Describes1__r__typeInfo, rh2__Describes1__r, rh2__Describes1__r__is_set);
    __typeMapper.writeObject(__out, rh2__Describes__r__typeInfo, rh2__Describes__r, rh2__Describes__r__is_set);
    __typeMapper.writeObject(__out, rh2__Foreign_Key_Test_Currency__c__typeInfo, rh2__Foreign_Key_Test_Currency__c, rh2__Foreign_Key_Test_Currency__c__is_set);
    __typeMapper.writeString(__out, rh2__Hierarchy_Test_2__c__typeInfo, rh2__Hierarchy_Test_2__c, rh2__Hierarchy_Test_2__c__is_set);
    __typeMapper.writeObject(__out, rh2__Hierarchy_Test_2__r__typeInfo, rh2__Hierarchy_Test_2__r, rh2__Hierarchy_Test_2__r__is_set);
    __typeMapper.writeString(__out, rh2__Hierarchy_Test__c__typeInfo, rh2__Hierarchy_Test__c, rh2__Hierarchy_Test__c__is_set);
    __typeMapper.writeObject(__out, rh2__Hierarchy_Test__r__typeInfo, rh2__Hierarchy_Test__r, rh2__Hierarchy_Test__r__is_set);
    __typeMapper.writeString(__out, rh2__Label__c__typeInfo, rh2__Label__c, rh2__Label__c__is_set);
    __typeMapper.writeString(__out, rh2__Object__c__typeInfo, rh2__Object__c, rh2__Object__c__is_set);
    __typeMapper.writeObject(__out, rh2__Real_Time__c__typeInfo, rh2__Real_Time__c, rh2__Real_Time__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_10__c__typeInfo, rh2__Rollup_10__c, rh2__Rollup_10__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_11__c__typeInfo, rh2__Rollup_11__c, rh2__Rollup_11__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_12__c__typeInfo, rh2__Rollup_12__c, rh2__Rollup_12__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_13__c__typeInfo, rh2__Rollup_13__c, rh2__Rollup_13__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_14__c__typeInfo, rh2__Rollup_14__c, rh2__Rollup_14__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_15__c__typeInfo, rh2__Rollup_15__c, rh2__Rollup_15__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_16__c__typeInfo, rh2__Rollup_16__c, rh2__Rollup_16__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_17__c__typeInfo, rh2__Rollup_17__c, rh2__Rollup_17__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_18__c__typeInfo, rh2__Rollup_18__c, rh2__Rollup_18__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_19__c__typeInfo, rh2__Rollup_19__c, rh2__Rollup_19__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_1__c__typeInfo, rh2__Rollup_1__c, rh2__Rollup_1__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_20__c__typeInfo, rh2__Rollup_20__c, rh2__Rollup_20__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_21__c__typeInfo, rh2__Rollup_21__c, rh2__Rollup_21__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_22__c__typeInfo, rh2__Rollup_22__c, rh2__Rollup_22__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_23__c__typeInfo, rh2__Rollup_23__c, rh2__Rollup_23__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_24__c__typeInfo, rh2__Rollup_24__c, rh2__Rollup_24__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_25__c__typeInfo, rh2__Rollup_25__c, rh2__Rollup_25__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_26__c__typeInfo, rh2__Rollup_26__c, rh2__Rollup_26__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_27__c__typeInfo, rh2__Rollup_27__c, rh2__Rollup_27__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_28__c__typeInfo, rh2__Rollup_28__c, rh2__Rollup_28__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_29__c__typeInfo, rh2__Rollup_29__c, rh2__Rollup_29__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_2__c__typeInfo, rh2__Rollup_2__c, rh2__Rollup_2__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_30__c__typeInfo, rh2__Rollup_30__c, rh2__Rollup_30__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_31__c__typeInfo, rh2__Rollup_31__c, rh2__Rollup_31__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_32__c__typeInfo, rh2__Rollup_32__c, rh2__Rollup_32__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_33__c__typeInfo, rh2__Rollup_33__c, rh2__Rollup_33__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_34__c__typeInfo, rh2__Rollup_34__c, rh2__Rollup_34__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_35__c__typeInfo, rh2__Rollup_35__c, rh2__Rollup_35__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_36__c__typeInfo, rh2__Rollup_36__c, rh2__Rollup_36__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_37__c__typeInfo, rh2__Rollup_37__c, rh2__Rollup_37__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_38__c__typeInfo, rh2__Rollup_38__c, rh2__Rollup_38__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_39__c__typeInfo, rh2__Rollup_39__c, rh2__Rollup_39__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_3__c__typeInfo, rh2__Rollup_3__c, rh2__Rollup_3__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_40__c__typeInfo, rh2__Rollup_40__c, rh2__Rollup_40__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_4__c__typeInfo, rh2__Rollup_4__c, rh2__Rollup_4__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_5__c__typeInfo, rh2__Rollup_5__c, rh2__Rollup_5__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_6__c__typeInfo, rh2__Rollup_6__c, rh2__Rollup_6__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_7__c__typeInfo, rh2__Rollup_7__c, rh2__Rollup_7__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_8__c__typeInfo, rh2__Rollup_8__c, rh2__Rollup_8__c__is_set);
    __typeMapper.writeString(__out, rh2__Rollup_9__c__typeInfo, rh2__Rollup_9__c, rh2__Rollup_9__c__is_set);
    __typeMapper.writeObject(__out, rh2__Rollup_Conditions__r__typeInfo, rh2__Rollup_Conditions__r, rh2__Rollup_Conditions__r__is_set);
    __typeMapper.writeObject(__out, rh2__Selected__c__typeInfo, rh2__Selected__c, rh2__Selected__c__is_set);
    __typeMapper.writeObject(__out, rh2__Sum_Integer_Double__c__typeInfo, rh2__Sum_Integer_Double__c, rh2__Sum_Integer_Double__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Currency__c__typeInfo, rh2__Test_Currency__c, rh2__Test_Currency__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Date_Time__c__typeInfo, rh2__Test_Date_Time__c, rh2__Test_Date_Time__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Date__c__typeInfo, rh2__Test_Date__c, rh2__Test_Date__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Double__c__typeInfo, rh2__Test_Double__c, rh2__Test_Double__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_End_Date__c__typeInfo, rh2__Test_End_Date__c, rh2__Test_End_Date__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Formula_FK_Currency__c__typeInfo, rh2__Test_Formula_FK_Currency__c, rh2__Test_Formula_FK_Currency__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Formula__c__typeInfo, rh2__Test_Formula__c, rh2__Test_Formula__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Integer2__c__typeInfo, rh2__Test_Integer2__c, rh2__Test_Integer2__c__is_set);
    __typeMapper.writeObject(__out, rh2__Test_Integer__c__typeInfo, rh2__Test_Integer__c, rh2__Test_Integer__c__is_set);
    __typeMapper.writeString(__out, rh2__Test_Long_Text__c__typeInfo, rh2__Test_Long_Text__c, rh2__Test_Long_Text__c__is_set);
    __typeMapper.writeString(__out, rh2__Test_Multi_Picklist__c__typeInfo, rh2__Test_Multi_Picklist__c, rh2__Test_Multi_Picklist__c__is_set);
    __typeMapper.writeString(__out, rh2__Test_Picklist__c__typeInfo, rh2__Test_Picklist__c, rh2__Test_Picklist__c__is_set);
    __typeMapper.writeString(__out, rh2__Test_Rich_Text__c__typeInfo, rh2__Test_Rich_Text__c, rh2__Test_Rich_Text__c__is_set);
    __typeMapper.writeString(__out, rh2__User__c__typeInfo, rh2__User__c, rh2__User__c__is_set);
    __typeMapper.writeObject(__out, rh2__User__r__typeInfo, rh2__User__r, rh2__User__r__is_set);
    __typeMapper.writeObject(__out, rh2__Validation_Test_Int__c__typeInfo, rh2__Validation_Test_Int__c, rh2__Validation_Test_Int__c__is_set);
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
    if (__typeMapper.isElement(__in, Attachments__typeInfo)) {
      setAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Attachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Notes__typeInfo)) {
      setNotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Notes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NotesAndAttachments__typeInfo)) {
      setNotesAndAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, NotesAndAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, rh2__Account__c__typeInfo)) {
      setRh2__Account__c((java.lang.String)__typeMapper.readString(__in, rh2__Account__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Account__r__typeInfo)) {
      setRh2__Account__r((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, rh2__Account__r__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Asynchronous__c__typeInfo)) {
      setRh2__Asynchronous__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__Asynchronous__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Contact2__c__typeInfo)) {
      setRh2__Contact2__c((java.lang.String)__typeMapper.readString(__in, rh2__Contact2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Contact2__r__typeInfo)) {
      setRh2__Contact2__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, rh2__Contact2__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Contact__c__typeInfo)) {
      setRh2__Contact__c((java.lang.String)__typeMapper.readString(__in, rh2__Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Contact__r__typeInfo)) {
      setRh2__Contact__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, rh2__Contact__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Contacts__r__typeInfo)) {
      setRh2__Contacts__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Contacts__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Data_Type__c__typeInfo)) {
      setRh2__Data_Type__c((java.lang.String)__typeMapper.readString(__in, rh2__Data_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Describes1__r__typeInfo)) {
      setRh2__Describes1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Describes1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Describes__r__typeInfo)) {
      setRh2__Describes__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Describes__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Foreign_Key_Test_Currency__c__typeInfo)) {
      setRh2__Foreign_Key_Test_Currency__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Foreign_Key_Test_Currency__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Hierarchy_Test_2__c__typeInfo)) {
      setRh2__Hierarchy_Test_2__c((java.lang.String)__typeMapper.readString(__in, rh2__Hierarchy_Test_2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Hierarchy_Test_2__r__typeInfo)) {
      setRh2__Hierarchy_Test_2__r((com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c)__typeMapper.readObject(__in, rh2__Hierarchy_Test_2__r__typeInfo, com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Hierarchy_Test__c__typeInfo)) {
      setRh2__Hierarchy_Test__c((java.lang.String)__typeMapper.readString(__in, rh2__Hierarchy_Test__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Hierarchy_Test__r__typeInfo)) {
      setRh2__Hierarchy_Test__r((com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c)__typeMapper.readObject(__in, rh2__Hierarchy_Test__r__typeInfo, com.sforce.soap.enterprise.sobject.Rh2__PS_Describe__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Label__c__typeInfo)) {
      setRh2__Label__c((java.lang.String)__typeMapper.readString(__in, rh2__Label__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Object__c__typeInfo)) {
      setRh2__Object__c((java.lang.String)__typeMapper.readString(__in, rh2__Object__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Real_Time__c__typeInfo)) {
      setRh2__Real_Time__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__Real_Time__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_10__c__typeInfo)) {
      setRh2__Rollup_10__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_10__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_11__c__typeInfo)) {
      setRh2__Rollup_11__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_11__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_12__c__typeInfo)) {
      setRh2__Rollup_12__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_12__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_13__c__typeInfo)) {
      setRh2__Rollup_13__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_13__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_14__c__typeInfo)) {
      setRh2__Rollup_14__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_14__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_15__c__typeInfo)) {
      setRh2__Rollup_15__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_15__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_16__c__typeInfo)) {
      setRh2__Rollup_16__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_16__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_17__c__typeInfo)) {
      setRh2__Rollup_17__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_17__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_18__c__typeInfo)) {
      setRh2__Rollup_18__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_18__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_19__c__typeInfo)) {
      setRh2__Rollup_19__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_19__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_1__c__typeInfo)) {
      setRh2__Rollup_1__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_1__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_20__c__typeInfo)) {
      setRh2__Rollup_20__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_20__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_21__c__typeInfo)) {
      setRh2__Rollup_21__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_21__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_22__c__typeInfo)) {
      setRh2__Rollup_22__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_22__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_23__c__typeInfo)) {
      setRh2__Rollup_23__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_23__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_24__c__typeInfo)) {
      setRh2__Rollup_24__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_24__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_25__c__typeInfo)) {
      setRh2__Rollup_25__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_25__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_26__c__typeInfo)) {
      setRh2__Rollup_26__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_26__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_27__c__typeInfo)) {
      setRh2__Rollup_27__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_27__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_28__c__typeInfo)) {
      setRh2__Rollup_28__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_28__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_29__c__typeInfo)) {
      setRh2__Rollup_29__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_29__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_2__c__typeInfo)) {
      setRh2__Rollup_2__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_30__c__typeInfo)) {
      setRh2__Rollup_30__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_30__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_31__c__typeInfo)) {
      setRh2__Rollup_31__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_31__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_32__c__typeInfo)) {
      setRh2__Rollup_32__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_32__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_33__c__typeInfo)) {
      setRh2__Rollup_33__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_33__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_34__c__typeInfo)) {
      setRh2__Rollup_34__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_34__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_35__c__typeInfo)) {
      setRh2__Rollup_35__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_35__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_36__c__typeInfo)) {
      setRh2__Rollup_36__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_36__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_37__c__typeInfo)) {
      setRh2__Rollup_37__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_37__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_38__c__typeInfo)) {
      setRh2__Rollup_38__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_38__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_39__c__typeInfo)) {
      setRh2__Rollup_39__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_39__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_3__c__typeInfo)) {
      setRh2__Rollup_3__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_40__c__typeInfo)) {
      setRh2__Rollup_40__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_40__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_4__c__typeInfo)) {
      setRh2__Rollup_4__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_4__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_5__c__typeInfo)) {
      setRh2__Rollup_5__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_5__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_6__c__typeInfo)) {
      setRh2__Rollup_6__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_6__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_7__c__typeInfo)) {
      setRh2__Rollup_7__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_7__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_8__c__typeInfo)) {
      setRh2__Rollup_8__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_8__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_9__c__typeInfo)) {
      setRh2__Rollup_9__c((java.lang.String)__typeMapper.readString(__in, rh2__Rollup_9__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_Conditions__r__typeInfo)) {
      setRh2__Rollup_Conditions__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Rollup_Conditions__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Selected__c__typeInfo)) {
      setRh2__Selected__c((java.lang.Boolean)__typeMapper.readObject(__in, rh2__Selected__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Sum_Integer_Double__c__typeInfo)) {
      setRh2__Sum_Integer_Double__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Sum_Integer_Double__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Currency__c__typeInfo)) {
      setRh2__Test_Currency__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Test_Currency__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Date_Time__c__typeInfo)) {
      setRh2__Test_Date_Time__c((java.util.Calendar)__typeMapper.readObject(__in, rh2__Test_Date_Time__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Date__c__typeInfo)) {
      setRh2__Test_Date__c((java.util.Calendar)__typeMapper.readObject(__in, rh2__Test_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Double__c__typeInfo)) {
      setRh2__Test_Double__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Test_Double__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_End_Date__c__typeInfo)) {
      setRh2__Test_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, rh2__Test_End_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Formula_FK_Currency__c__typeInfo)) {
      setRh2__Test_Formula_FK_Currency__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Test_Formula_FK_Currency__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Formula__c__typeInfo)) {
      setRh2__Test_Formula__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Test_Formula__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Integer2__c__typeInfo)) {
      setRh2__Test_Integer2__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Test_Integer2__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Integer__c__typeInfo)) {
      setRh2__Test_Integer__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Test_Integer__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Long_Text__c__typeInfo)) {
      setRh2__Test_Long_Text__c((java.lang.String)__typeMapper.readString(__in, rh2__Test_Long_Text__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Multi_Picklist__c__typeInfo)) {
      setRh2__Test_Multi_Picklist__c((java.lang.String)__typeMapper.readString(__in, rh2__Test_Multi_Picklist__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Picklist__c__typeInfo)) {
      setRh2__Test_Picklist__c((java.lang.String)__typeMapper.readString(__in, rh2__Test_Picklist__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Test_Rich_Text__c__typeInfo)) {
      setRh2__Test_Rich_Text__c((java.lang.String)__typeMapper.readString(__in, rh2__Test_Rich_Text__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__User__c__typeInfo)) {
      setRh2__User__c((java.lang.String)__typeMapper.readString(__in, rh2__User__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__User__r__typeInfo)) {
      setRh2__User__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, rh2__User__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Validation_Test_Int__c__typeInfo)) {
      setRh2__Validation_Test_Int__c((java.lang.Double)__typeMapper.readObject(__in, rh2__Validation_Test_Int__c__typeInfo, java.lang.Double.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Rh2__PS_Describe__c ");
    sb.append(super.toString());
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
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
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
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
    sb.append(" rh2__Account__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Account__c)+"'\n");
    sb.append(" rh2__Account__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Account__r)+"'\n");
    sb.append(" rh2__Asynchronous__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Asynchronous__c)+"'\n");
    sb.append(" rh2__Contact2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Contact2__c)+"'\n");
    sb.append(" rh2__Contact2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Contact2__r)+"'\n");
    sb.append(" rh2__Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Contact__c)+"'\n");
    sb.append(" rh2__Contact__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Contact__r)+"'\n");
    sb.append(" rh2__Contacts__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Contacts__r)+"'\n");
    sb.append(" rh2__Data_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Data_Type__c)+"'\n");
    sb.append(" rh2__Describes1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Describes1__r)+"'\n");
    sb.append(" rh2__Describes__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Describes__r)+"'\n");
    sb.append(" rh2__Foreign_Key_Test_Currency__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Foreign_Key_Test_Currency__c)+"'\n");
    sb.append(" rh2__Hierarchy_Test_2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Hierarchy_Test_2__c)+"'\n");
    sb.append(" rh2__Hierarchy_Test_2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Hierarchy_Test_2__r)+"'\n");
    sb.append(" rh2__Hierarchy_Test__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Hierarchy_Test__c)+"'\n");
    sb.append(" rh2__Hierarchy_Test__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Hierarchy_Test__r)+"'\n");
    sb.append(" rh2__Label__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Label__c)+"'\n");
    sb.append(" rh2__Object__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Object__c)+"'\n");
    sb.append(" rh2__Real_Time__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Real_Time__c)+"'\n");
    sb.append(" rh2__Rollup_10__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_10__c)+"'\n");
    sb.append(" rh2__Rollup_11__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_11__c)+"'\n");
    sb.append(" rh2__Rollup_12__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_12__c)+"'\n");
    sb.append(" rh2__Rollup_13__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_13__c)+"'\n");
    sb.append(" rh2__Rollup_14__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_14__c)+"'\n");
    sb.append(" rh2__Rollup_15__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_15__c)+"'\n");
    sb.append(" rh2__Rollup_16__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_16__c)+"'\n");
    sb.append(" rh2__Rollup_17__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_17__c)+"'\n");
    sb.append(" rh2__Rollup_18__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_18__c)+"'\n");
    sb.append(" rh2__Rollup_19__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_19__c)+"'\n");
    sb.append(" rh2__Rollup_1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_1__c)+"'\n");
    sb.append(" rh2__Rollup_20__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_20__c)+"'\n");
    sb.append(" rh2__Rollup_21__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_21__c)+"'\n");
    sb.append(" rh2__Rollup_22__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_22__c)+"'\n");
    sb.append(" rh2__Rollup_23__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_23__c)+"'\n");
    sb.append(" rh2__Rollup_24__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_24__c)+"'\n");
    sb.append(" rh2__Rollup_25__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_25__c)+"'\n");
    sb.append(" rh2__Rollup_26__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_26__c)+"'\n");
    sb.append(" rh2__Rollup_27__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_27__c)+"'\n");
    sb.append(" rh2__Rollup_28__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_28__c)+"'\n");
    sb.append(" rh2__Rollup_29__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_29__c)+"'\n");
    sb.append(" rh2__Rollup_2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_2__c)+"'\n");
    sb.append(" rh2__Rollup_30__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_30__c)+"'\n");
    sb.append(" rh2__Rollup_31__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_31__c)+"'\n");
    sb.append(" rh2__Rollup_32__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_32__c)+"'\n");
    sb.append(" rh2__Rollup_33__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_33__c)+"'\n");
    sb.append(" rh2__Rollup_34__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_34__c)+"'\n");
    sb.append(" rh2__Rollup_35__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_35__c)+"'\n");
    sb.append(" rh2__Rollup_36__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_36__c)+"'\n");
    sb.append(" rh2__Rollup_37__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_37__c)+"'\n");
    sb.append(" rh2__Rollup_38__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_38__c)+"'\n");
    sb.append(" rh2__Rollup_39__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_39__c)+"'\n");
    sb.append(" rh2__Rollup_3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_3__c)+"'\n");
    sb.append(" rh2__Rollup_40__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_40__c)+"'\n");
    sb.append(" rh2__Rollup_4__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_4__c)+"'\n");
    sb.append(" rh2__Rollup_5__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_5__c)+"'\n");
    sb.append(" rh2__Rollup_6__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_6__c)+"'\n");
    sb.append(" rh2__Rollup_7__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_7__c)+"'\n");
    sb.append(" rh2__Rollup_8__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_8__c)+"'\n");
    sb.append(" rh2__Rollup_9__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_9__c)+"'\n");
    sb.append(" rh2__Rollup_Conditions__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_Conditions__r)+"'\n");
    sb.append(" rh2__Selected__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Selected__c)+"'\n");
    sb.append(" rh2__Sum_Integer_Double__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Sum_Integer_Double__c)+"'\n");
    sb.append(" rh2__Test_Currency__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Currency__c)+"'\n");
    sb.append(" rh2__Test_Date_Time__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Date_Time__c)+"'\n");
    sb.append(" rh2__Test_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Date__c)+"'\n");
    sb.append(" rh2__Test_Double__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Double__c)+"'\n");
    sb.append(" rh2__Test_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_End_Date__c)+"'\n");
    sb.append(" rh2__Test_Formula_FK_Currency__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Formula_FK_Currency__c)+"'\n");
    sb.append(" rh2__Test_Formula__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Formula__c)+"'\n");
    sb.append(" rh2__Test_Integer2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Integer2__c)+"'\n");
    sb.append(" rh2__Test_Integer__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Integer__c)+"'\n");
    sb.append(" rh2__Test_Long_Text__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Long_Text__c)+"'\n");
    sb.append(" rh2__Test_Multi_Picklist__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Multi_Picklist__c)+"'\n");
    sb.append(" rh2__Test_Picklist__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Picklist__c)+"'\n");
    sb.append(" rh2__Test_Rich_Text__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Test_Rich_Text__c)+"'\n");
    sb.append(" rh2__User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__User__c)+"'\n");
    sb.append(" rh2__User__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__User__r)+"'\n");
    sb.append(" rh2__Validation_Test_Int__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Validation_Test_Int__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}