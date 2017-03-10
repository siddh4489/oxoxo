package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class I__AAConfig__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public I__AAConfig__c() {
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
   * element  : Shares of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Shares__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Shares","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Shares__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Shares;

  public com.sforce.soap.enterprise.QueryResult getShares() {
    return Shares;
  }

  

  public void setShares(com.sforce.soap.enterprise.QueryResult Shares) {
    this.Shares = Shares;
    Shares__is_set = true;
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
   * element  : i__AALogLifespan__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__AALogLifespan__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__AALogLifespan__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__AALogLifespan__c__is_set = false;

  private java.lang.Double i__AALogLifespan__c;

  public java.lang.Double getI__AALogLifespan__c() {
    return i__AALogLifespan__c;
  }

  

  public void setI__AALogLifespan__c(java.lang.Double i__AALogLifespan__c) {
    this.i__AALogLifespan__c = i__AALogLifespan__c;
    i__AALogLifespan__c__is_set = true;
  }
  
  /**
   * element  : i__AllowInternalMail2Case__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__AllowInternalMail2Case__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__AllowInternalMail2Case__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__AllowInternalMail2Case__c__is_set = false;

  private java.lang.Boolean i__AllowInternalMail2Case__c;

  public java.lang.Boolean getI__AllowInternalMail2Case__c() {
    return i__AllowInternalMail2Case__c;
  }

  

  public void setI__AllowInternalMail2Case__c(java.lang.Boolean i__AllowInternalMail2Case__c) {
    this.i__AllowInternalMail2Case__c = i__AllowInternalMail2Case__c;
    i__AllowInternalMail2Case__c__is_set = true;
  }
  
  /**
   * element  : i__AllowPortalAccess__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__AllowPortalAccess__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__AllowPortalAccess__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__AllowPortalAccess__c__is_set = false;

  private java.lang.Boolean i__AllowPortalAccess__c;

  public java.lang.Boolean getI__AllowPortalAccess__c() {
    return i__AllowPortalAccess__c;
  }

  

  public void setI__AllowPortalAccess__c(java.lang.Boolean i__AllowPortalAccess__c) {
    this.i__AllowPortalAccess__c = i__AllowPortalAccess__c;
    i__AllowPortalAccess__c__is_set = true;
  }
  
  /**
   * element  : i__AttKeepAllForCases__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__AttKeepAllForCases__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__AttKeepAllForCases__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__AttKeepAllForCases__c__is_set = false;

  private java.lang.Boolean i__AttKeepAllForCases__c;

  public java.lang.Boolean getI__AttKeepAllForCases__c() {
    return i__AttKeepAllForCases__c;
  }

  

  public void setI__AttKeepAllForCases__c(java.lang.Boolean i__AttKeepAllForCases__c) {
    this.i__AttKeepAllForCases__c = i__AttKeepAllForCases__c;
    i__AttKeepAllForCases__c__is_set = true;
  }
  
  /**
   * element  : i__AttMinImgSize__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__AttMinImgSize__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__AttMinImgSize__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__AttMinImgSize__c__is_set = false;

  private java.lang.Double i__AttMinImgSize__c;

  public java.lang.Double getI__AttMinImgSize__c() {
    return i__AttMinImgSize__c;
  }

  

  public void setI__AttMinImgSize__c(java.lang.Double i__AttMinImgSize__c) {
    this.i__AttMinImgSize__c = i__AttMinImgSize__c;
    i__AttMinImgSize__c__is_set = true;
  }
  
  /**
   * element  : i__AttSkipExts__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__AttSkipExts__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__AttSkipExts__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__AttSkipExts__c__is_set = false;

  private java.lang.String i__AttSkipExts__c;

  public java.lang.String getI__AttSkipExts__c() {
    return i__AttSkipExts__c;
  }

  

  public void setI__AttSkipExts__c(java.lang.String i__AttSkipExts__c) {
    this.i__AttSkipExts__c = i__AttSkipExts__c;
    i__AttSkipExts__c__is_set = true;
  }
  
  /**
   * element  : i__BaseURL__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__BaseURL__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__BaseURL__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__BaseURL__c__is_set = false;

  private java.lang.String i__BaseURL__c;

  public java.lang.String getI__BaseURL__c() {
    return i__BaseURL__c;
  }

  

  public void setI__BaseURL__c(java.lang.String i__BaseURL__c) {
    this.i__BaseURL__c = i__BaseURL__c;
    i__BaseURL__c__is_set = true;
  }
  
  /**
   * element  : i__CasePatterns__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__CasePatterns__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__CasePatterns__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__CasePatterns__c__is_set = false;

  private java.lang.String i__CasePatterns__c;

  public java.lang.String getI__CasePatterns__c() {
    return i__CasePatterns__c;
  }

  

  public void setI__CasePatterns__c(java.lang.String i__CasePatterns__c) {
    this.i__CasePatterns__c = i__CasePatterns__c;
    i__CasePatterns__c__is_set = true;
  }
  
  /**
   * element  : i__CheckCustomPages__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__CheckCustomPages__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__CheckCustomPages__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__CheckCustomPages__c__is_set = false;

  private java.lang.Boolean i__CheckCustomPages__c;

  public java.lang.Boolean getI__CheckCustomPages__c() {
    return i__CheckCustomPages__c;
  }

  

  public void setI__CheckCustomPages__c(java.lang.Boolean i__CheckCustomPages__c) {
    this.i__CheckCustomPages__c = i__CheckCustomPages__c;
    i__CheckCustomPages__c__is_set = true;
  }
  
  /**
   * element  : i__CopyAttachmentsToTasks__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__CopyAttachmentsToTasks__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__CopyAttachmentsToTasks__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__CopyAttachmentsToTasks__c__is_set = false;

  private java.lang.Boolean i__CopyAttachmentsToTasks__c;

  public java.lang.Boolean getI__CopyAttachmentsToTasks__c() {
    return i__CopyAttachmentsToTasks__c;
  }

  

  public void setI__CopyAttachmentsToTasks__c(java.lang.Boolean i__CopyAttachmentsToTasks__c) {
    this.i__CopyAttachmentsToTasks__c = i__CopyAttachmentsToTasks__c;
    i__CopyAttachmentsToTasks__c__is_set = true;
  }
  
  /**
   * element  : i__CopyEmailsToTasks__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__CopyEmailsToTasks__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__CopyEmailsToTasks__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__CopyEmailsToTasks__c__is_set = false;

  private java.lang.Boolean i__CopyEmailsToTasks__c;

  public java.lang.Boolean getI__CopyEmailsToTasks__c() {
    return i__CopyEmailsToTasks__c;
  }

  

  public void setI__CopyEmailsToTasks__c(java.lang.Boolean i__CopyEmailsToTasks__c) {
    this.i__CopyEmailsToTasks__c = i__CopyEmailsToTasks__c;
    i__CopyEmailsToTasks__c__is_set = true;
  }
  
  /**
   * element  : i__DataVersion__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__DataVersion__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__DataVersion__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__DataVersion__c__is_set = false;

  private java.lang.String i__DataVersion__c;

  public java.lang.String getI__DataVersion__c() {
    return i__DataVersion__c;
  }

  

  public void setI__DataVersion__c(java.lang.String i__DataVersion__c) {
    this.i__DataVersion__c = i__DataVersion__c;
    i__DataVersion__c__is_set = true;
  }
  
  /**
   * element  : i__EmailLifespanOnLinked__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailLifespanOnLinked__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailLifespanOnLinked__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__EmailLifespanOnLinked__c__is_set = false;

  private java.lang.Boolean i__EmailLifespanOnLinked__c;

  public java.lang.Boolean getI__EmailLifespanOnLinked__c() {
    return i__EmailLifespanOnLinked__c;
  }

  

  public void setI__EmailLifespanOnLinked__c(java.lang.Boolean i__EmailLifespanOnLinked__c) {
    this.i__EmailLifespanOnLinked__c = i__EmailLifespanOnLinked__c;
    i__EmailLifespanOnLinked__c__is_set = true;
  }
  
  /**
   * element  : i__EmailLifespan__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailLifespan__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailLifespan__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__EmailLifespan__c__is_set = false;

  private java.lang.Double i__EmailLifespan__c;

  public java.lang.Double getI__EmailLifespan__c() {
    return i__EmailLifespan__c;
  }

  

  public void setI__EmailLifespan__c(java.lang.Double i__EmailLifespan__c) {
    this.i__EmailLifespan__c = i__EmailLifespan__c;
    i__EmailLifespan__c__is_set = true;
  }
  
  /**
   * element  : i__EmailLookups__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailLookups__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailLookups__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__EmailLookups__c__is_set = false;

  private java.lang.String i__EmailLookups__c;

  public java.lang.String getI__EmailLookups__c() {
    return i__EmailLookups__c;
  }

  

  public void setI__EmailLookups__c(java.lang.String i__EmailLookups__c) {
    this.i__EmailLookups__c = i__EmailLookups__c;
    i__EmailLookups__c__is_set = true;
  }
  
  /**
   * element  : i__EmailToTaskPriority__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailToTaskPriority__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailToTaskPriority__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__EmailToTaskPriority__c__is_set = false;

  private java.lang.String i__EmailToTaskPriority__c;

  public java.lang.String getI__EmailToTaskPriority__c() {
    return i__EmailToTaskPriority__c;
  }

  

  public void setI__EmailToTaskPriority__c(java.lang.String i__EmailToTaskPriority__c) {
    this.i__EmailToTaskPriority__c = i__EmailToTaskPriority__c;
    i__EmailToTaskPriority__c__is_set = true;
  }
  
  /**
   * element  : i__EmailToTaskStatus__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailToTaskStatus__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailToTaskStatus__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__EmailToTaskStatus__c__is_set = false;

  private java.lang.String i__EmailToTaskStatus__c;

  public java.lang.String getI__EmailToTaskStatus__c() {
    return i__EmailToTaskStatus__c;
  }

  

  public void setI__EmailToTaskStatus__c(java.lang.String i__EmailToTaskStatus__c) {
    this.i__EmailToTaskStatus__c = i__EmailToTaskStatus__c;
    i__EmailToTaskStatus__c__is_set = true;
  }
  
  /**
   * element  : i__EmailToTaskTarget__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailToTaskTarget__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailToTaskTarget__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__EmailToTaskTarget__c__is_set = false;

  private java.lang.String i__EmailToTaskTarget__c;

  public java.lang.String getI__EmailToTaskTarget__c() {
    return i__EmailToTaskTarget__c;
  }

  

  public void setI__EmailToTaskTarget__c(java.lang.String i__EmailToTaskTarget__c) {
    this.i__EmailToTaskTarget__c = i__EmailToTaskTarget__c;
    i__EmailToTaskTarget__c__is_set = true;
  }
  
  /**
   * element  : i__EmailToTaskType__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailToTaskType__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailToTaskType__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__EmailToTaskType__c__is_set = false;

  private java.lang.String i__EmailToTaskType__c;

  public java.lang.String getI__EmailToTaskType__c() {
    return i__EmailToTaskType__c;
  }

  

  public void setI__EmailToTaskType__c(java.lang.String i__EmailToTaskType__c) {
    this.i__EmailToTaskType__c = i__EmailToTaskType__c;
    i__EmailToTaskType__c__is_set = true;
  }
  
  /**
   * element  : i__EncryptLinkedMsgs__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__EncryptLinkedMsgs__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EncryptLinkedMsgs__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__EncryptLinkedMsgs__c__is_set = false;

  private java.lang.Boolean i__EncryptLinkedMsgs__c;

  public java.lang.Boolean getI__EncryptLinkedMsgs__c() {
    return i__EncryptLinkedMsgs__c;
  }

  

  public void setI__EncryptLinkedMsgs__c(java.lang.Boolean i__EncryptLinkedMsgs__c) {
    this.i__EncryptLinkedMsgs__c = i__EncryptLinkedMsgs__c;
    i__EncryptLinkedMsgs__c__is_set = true;
  }
  
  /**
   * element  : i__EncryptionKey__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__EncryptionKey__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EncryptionKey__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__EncryptionKey__c__is_set = false;

  private java.lang.String i__EncryptionKey__c;

  public java.lang.String getI__EncryptionKey__c() {
    return i__EncryptionKey__c;
  }

  

  public void setI__EncryptionKey__c(java.lang.String i__EncryptionKey__c) {
    this.i__EncryptionKey__c = i__EncryptionKey__c;
    i__EncryptionKey__c__is_set = true;
  }
  
  /**
   * element  : i__ISPDomains__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__ISPDomains__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__ISPDomains__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__ISPDomains__c__is_set = false;

  private java.lang.String i__ISPDomains__c;

  public java.lang.String getI__ISPDomains__c() {
    return i__ISPDomains__c;
  }

  

  public void setI__ISPDomains__c(java.lang.String i__ISPDomains__c) {
    this.i__ISPDomains__c = i__ISPDomains__c;
    i__ISPDomains__c__is_set = true;
  }
  
  /**
   * element  : i__InstallContacts__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__InstallContacts__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InstallContacts__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__InstallContacts__c__is_set = false;

  private java.lang.String i__InstallContacts__c;

  public java.lang.String getI__InstallContacts__c() {
    return i__InstallContacts__c;
  }

  

  public void setI__InstallContacts__c(java.lang.String i__InstallContacts__c) {
    this.i__InstallContacts__c = i__InstallContacts__c;
    i__InstallContacts__c__is_set = true;
  }
  
  /**
   * element  : i__InstallLeads__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__InstallLeads__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InstallLeads__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__InstallLeads__c__is_set = false;

  private java.lang.String i__InstallLeads__c;

  public java.lang.String getI__InstallLeads__c() {
    return i__InstallLeads__c;
  }

  

  public void setI__InstallLeads__c(java.lang.String i__InstallLeads__c) {
    this.i__InstallLeads__c = i__InstallLeads__c;
    i__InstallLeads__c__is_set = true;
  }
  
  /**
   * element  : i__InstallPageLayouts__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__InstallPageLayouts__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InstallPageLayouts__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__InstallPageLayouts__c__is_set = false;

  private java.lang.String i__InstallPageLayouts__c;

  public java.lang.String getI__InstallPageLayouts__c() {
    return i__InstallPageLayouts__c;
  }

  

  public void setI__InstallPageLayouts__c(java.lang.String i__InstallPageLayouts__c) {
    this.i__InstallPageLayouts__c = i__InstallPageLayouts__c;
    i__InstallPageLayouts__c__is_set = true;
  }
  
  /**
   * element  : i__InstallPages__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__InstallPages__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InstallPages__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__InstallPages__c__is_set = false;

  private java.lang.String i__InstallPages__c;

  public java.lang.String getI__InstallPages__c() {
    return i__InstallPages__c;
  }

  

  public void setI__InstallPages__c(java.lang.String i__InstallPages__c) {
    this.i__InstallPages__c = i__InstallPages__c;
    i__InstallPages__c__is_set = true;
  }
  
  /**
   * element  : i__InstallSkipAddrs__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__InstallSkipAddrs__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InstallSkipAddrs__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__InstallSkipAddrs__c__is_set = false;

  private java.lang.String i__InstallSkipAddrs__c;

  public java.lang.String getI__InstallSkipAddrs__c() {
    return i__InstallSkipAddrs__c;
  }

  

  public void setI__InstallSkipAddrs__c(java.lang.String i__InstallSkipAddrs__c) {
    this.i__InstallSkipAddrs__c = i__InstallSkipAddrs__c;
    i__InstallSkipAddrs__c__is_set = true;
  }
  
  /**
   * element  : i__InstallUsers__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__InstallUsers__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InstallUsers__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__InstallUsers__c__is_set = false;

  private java.lang.String i__InstallUsers__c;

  public java.lang.String getI__InstallUsers__c() {
    return i__InstallUsers__c;
  }

  

  public void setI__InstallUsers__c(java.lang.String i__InstallUsers__c) {
    this.i__InstallUsers__c = i__InstallUsers__c;
    i__InstallUsers__c__is_set = true;
  }
  
  /**
   * element  : i__InternalDomains__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__InternalDomains__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InternalDomains__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__InternalDomains__c__is_set = false;

  private java.lang.String i__InternalDomains__c;

  public java.lang.String getI__InternalDomains__c() {
    return i__InternalDomains__c;
  }

  

  public void setI__InternalDomains__c(java.lang.String i__InternalDomains__c) {
    this.i__InternalDomains__c = i__InternalDomains__c;
    i__InternalDomains__c__is_set = true;
  }
  
  /**
   * element  : i__LastMaintenance__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMaintenance__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMaintenance__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastMaintenance__c__is_set = false;

  private java.util.Calendar i__LastMaintenance__c;

  public java.util.Calendar getI__LastMaintenance__c() {
    return i__LastMaintenance__c;
  }

  

  public void setI__LastMaintenance__c(java.util.Calendar i__LastMaintenance__c) {
    this.i__LastMaintenance__c = i__LastMaintenance__c;
    i__LastMaintenance__c__is_set = true;
  }
  
  /**
   * element  : i__LastUsagePing__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastUsagePing__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastUsagePing__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastUsagePing__c__is_set = false;

  private java.util.Calendar i__LastUsagePing__c;

  public java.util.Calendar getI__LastUsagePing__c() {
    return i__LastUsagePing__c;
  }

  

  public void setI__LastUsagePing__c(java.util.Calendar i__LastUsagePing__c) {
    this.i__LastUsagePing__c = i__LastUsagePing__c;
    i__LastUsagePing__c__is_set = true;
  }
  
  /**
   * element  : i__Mail2CaseAddrs__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__Mail2CaseAddrs__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__Mail2CaseAddrs__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__Mail2CaseAddrs__c__is_set = false;

  private java.lang.String i__Mail2CaseAddrs__c;

  public java.lang.String getI__Mail2CaseAddrs__c() {
    return i__Mail2CaseAddrs__c;
  }

  

  public void setI__Mail2CaseAddrs__c(java.lang.String i__Mail2CaseAddrs__c) {
    this.i__Mail2CaseAddrs__c = i__Mail2CaseAddrs__c;
    i__Mail2CaseAddrs__c__is_set = true;
  }
  
  /**
   * element  : i__MaintenanceCronId__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__MaintenanceCronId__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__MaintenanceCronId__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__MaintenanceCronId__c__is_set = false;

  private java.lang.String i__MaintenanceCronId__c;

  public java.lang.String getI__MaintenanceCronId__c() {
    return i__MaintenanceCronId__c;
  }

  

  public void setI__MaintenanceCronId__c(java.lang.String i__MaintenanceCronId__c) {
    this.i__MaintenanceCronId__c = i__MaintenanceCronId__c;
    i__MaintenanceCronId__c__is_set = true;
  }
  
  /**
   * element  : i__NewCase_triggerAutoResponseEmail__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NewCase_triggerAutoResponseEmail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NewCase_triggerAutoResponseEmail__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NewCase_triggerAutoResponseEmail__c__is_set = false;

  private java.lang.Boolean i__NewCase_triggerAutoResponseEmail__c;

  public java.lang.Boolean getI__NewCase_triggerAutoResponseEmail__c() {
    return i__NewCase_triggerAutoResponseEmail__c;
  }

  

  public void setI__NewCase_triggerAutoResponseEmail__c(java.lang.Boolean i__NewCase_triggerAutoResponseEmail__c) {
    this.i__NewCase_triggerAutoResponseEmail__c = i__NewCase_triggerAutoResponseEmail__c;
    i__NewCase_triggerAutoResponseEmail__c__is_set = true;
  }
  
  /**
   * element  : i__NewCase_triggerUserEmail__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NewCase_triggerUserEmail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NewCase_triggerUserEmail__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NewCase_triggerUserEmail__c__is_set = false;

  private java.lang.Boolean i__NewCase_triggerUserEmail__c;

  public java.lang.Boolean getI__NewCase_triggerUserEmail__c() {
    return i__NewCase_triggerUserEmail__c;
  }

  

  public void setI__NewCase_triggerUserEmail__c(java.lang.Boolean i__NewCase_triggerUserEmail__c) {
    this.i__NewCase_triggerUserEmail__c = i__NewCase_triggerUserEmail__c;
    i__NewCase_triggerUserEmail__c__is_set = true;
  }
  
  /**
   * element  : i__NewCase_useDefaultAssignmentRule__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NewCase_useDefaultAssignmentRule__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NewCase_useDefaultAssignmentRule__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NewCase_useDefaultAssignmentRule__c__is_set = false;

  private java.lang.Boolean i__NewCase_useDefaultAssignmentRule__c;

  public java.lang.Boolean getI__NewCase_useDefaultAssignmentRule__c() {
    return i__NewCase_useDefaultAssignmentRule__c;
  }

  

  public void setI__NewCase_useDefaultAssignmentRule__c(java.lang.Boolean i__NewCase_useDefaultAssignmentRule__c) {
    this.i__NewCase_useDefaultAssignmentRule__c = i__NewCase_useDefaultAssignmentRule__c;
    i__NewCase_useDefaultAssignmentRule__c__is_set = true;
  }
  
  /**
   * element  : i__NewLead_triggerAutoResponseEmail__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NewLead_triggerAutoResponseEmail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NewLead_triggerAutoResponseEmail__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NewLead_triggerAutoResponseEmail__c__is_set = false;

  private java.lang.Boolean i__NewLead_triggerAutoResponseEmail__c;

  public java.lang.Boolean getI__NewLead_triggerAutoResponseEmail__c() {
    return i__NewLead_triggerAutoResponseEmail__c;
  }

  

  public void setI__NewLead_triggerAutoResponseEmail__c(java.lang.Boolean i__NewLead_triggerAutoResponseEmail__c) {
    this.i__NewLead_triggerAutoResponseEmail__c = i__NewLead_triggerAutoResponseEmail__c;
    i__NewLead_triggerAutoResponseEmail__c__is_set = true;
  }
  
  /**
   * element  : i__NewLead_triggerUserEmail__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NewLead_triggerUserEmail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NewLead_triggerUserEmail__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NewLead_triggerUserEmail__c__is_set = false;

  private java.lang.Boolean i__NewLead_triggerUserEmail__c;

  public java.lang.Boolean getI__NewLead_triggerUserEmail__c() {
    return i__NewLead_triggerUserEmail__c;
  }

  

  public void setI__NewLead_triggerUserEmail__c(java.lang.Boolean i__NewLead_triggerUserEmail__c) {
    this.i__NewLead_triggerUserEmail__c = i__NewLead_triggerUserEmail__c;
    i__NewLead_triggerUserEmail__c__is_set = true;
  }
  
  /**
   * element  : i__NewLead_useDefaultAssignmentRule__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NewLead_useDefaultAssignmentRule__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NewLead_useDefaultAssignmentRule__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NewLead_useDefaultAssignmentRule__c__is_set = false;

  private java.lang.Boolean i__NewLead_useDefaultAssignmentRule__c;

  public java.lang.Boolean getI__NewLead_useDefaultAssignmentRule__c() {
    return i__NewLead_useDefaultAssignmentRule__c;
  }

  

  public void setI__NewLead_useDefaultAssignmentRule__c(java.lang.Boolean i__NewLead_useDefaultAssignmentRule__c) {
    this.i__NewLead_useDefaultAssignmentRule__c = i__NewLead_useDefaultAssignmentRule__c;
    i__NewLead_useDefaultAssignmentRule__c__is_set = true;
  }
  
  /**
   * element  : i__NoLogContentStatic__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NoLogContentStatic__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NoLogContentStatic__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NoLogContentStatic__c__is_set = false;

  private java.lang.Boolean i__NoLogContentStatic__c;

  public java.lang.Boolean getI__NoLogContentStatic__c() {
    return i__NoLogContentStatic__c;
  }

  

  public void setI__NoLogContentStatic__c(java.lang.Boolean i__NoLogContentStatic__c) {
    this.i__NoLogContentStatic__c = i__NoLogContentStatic__c;
    i__NoLogContentStatic__c__is_set = true;
  }
  
  /**
   * element  : i__NoLogContent__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__NoLogContent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NoLogContent__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__NoLogContent__c__is_set = false;

  private java.lang.String i__NoLogContent__c;

  public java.lang.String getI__NoLogContent__c() {
    return i__NoLogContent__c;
  }

  

  public void setI__NoLogContent__c(java.lang.String i__NoLogContent__c) {
    this.i__NoLogContent__c = i__NoLogContent__c;
    i__NoLogContent__c__is_set = true;
  }
  
  /**
   * element  : i__NoPending__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__NoPending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NoPending__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__NoPending__c__is_set = false;

  private java.lang.Boolean i__NoPending__c;

  public java.lang.Boolean getI__NoPending__c() {
    return i__NoPending__c;
  }

  

  public void setI__NoPending__c(java.lang.Boolean i__NoPending__c) {
    this.i__NoPending__c = i__NoPending__c;
    i__NoPending__c__is_set = true;
  }
  
  /**
   * element  : i__PendingLifespan__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__PendingLifespan__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__PendingLifespan__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__PendingLifespan__c__is_set = false;

  private java.lang.Double i__PendingLifespan__c;

  public java.lang.Double getI__PendingLifespan__c() {
    return i__PendingLifespan__c;
  }

  

  public void setI__PendingLifespan__c(java.lang.Double i__PendingLifespan__c) {
    this.i__PendingLifespan__c = i__PendingLifespan__c;
    i__PendingLifespan__c__is_set = true;
  }
  
  /**
   * element  : i__SetLastEmailFields__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__SetLastEmailFields__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SetLastEmailFields__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__SetLastEmailFields__c__is_set = false;

  private java.lang.Boolean i__SetLastEmailFields__c;

  public java.lang.Boolean getI__SetLastEmailFields__c() {
    return i__SetLastEmailFields__c;
  }

  

  public void setI__SetLastEmailFields__c(java.lang.Boolean i__SetLastEmailFields__c) {
    this.i__SetLastEmailFields__c = i__SetLastEmailFields__c;
    i__SetLastEmailFields__c__is_set = true;
  }
  
  /**
   * element  : i__ShowOpportunityLinkage__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__ShowOpportunityLinkage__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__ShowOpportunityLinkage__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__ShowOpportunityLinkage__c__is_set = false;

  private java.lang.Boolean i__ShowOpportunityLinkage__c;

  public java.lang.Boolean getI__ShowOpportunityLinkage__c() {
    return i__ShowOpportunityLinkage__c;
  }

  

  public void setI__ShowOpportunityLinkage__c(java.lang.Boolean i__ShowOpportunityLinkage__c) {
    this.i__ShowOpportunityLinkage__c = i__ShowOpportunityLinkage__c;
    i__ShowOpportunityLinkage__c__is_set = true;
  }
  
  /**
   * element  : i__ShowOpportunityLookup__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__ShowOpportunityLookup__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__ShowOpportunityLookup__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__ShowOpportunityLookup__c__is_set = false;

  private java.lang.Boolean i__ShowOpportunityLookup__c;

  public java.lang.Boolean getI__ShowOpportunityLookup__c() {
    return i__ShowOpportunityLookup__c;
  }

  

  public void setI__ShowOpportunityLookup__c(java.lang.Boolean i__ShowOpportunityLookup__c) {
    this.i__ShowOpportunityLookup__c = i__ShowOpportunityLookup__c;
    i__ShowOpportunityLookup__c__is_set = true;
  }
  
  /**
   * element  : i__SkipBodyRE__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkipBodyRE__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkipBodyRE__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__SkipBodyRE__c__is_set = false;

  private java.lang.Boolean i__SkipBodyRE__c;

  public java.lang.Boolean getI__SkipBodyRE__c() {
    return i__SkipBodyRE__c;
  }

  

  public void setI__SkipBodyRE__c(java.lang.Boolean i__SkipBodyRE__c) {
    this.i__SkipBodyRE__c = i__SkipBodyRE__c;
    i__SkipBodyRE__c__is_set = true;
  }
  
  /**
   * element  : i__SkipBody__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkipBody__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkipBody__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__SkipBody__c__is_set = false;

  private java.lang.String i__SkipBody__c;

  public java.lang.String getI__SkipBody__c() {
    return i__SkipBody__c;
  }

  

  public void setI__SkipBody__c(java.lang.String i__SkipBody__c) {
    this.i__SkipBody__c = i__SkipBody__c;
    i__SkipBody__c__is_set = true;
  }
  
  /**
   * element  : i__SkipHdrsRE__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkipHdrsRE__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkipHdrsRE__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__SkipHdrsRE__c__is_set = false;

  private java.lang.Boolean i__SkipHdrsRE__c;

  public java.lang.Boolean getI__SkipHdrsRE__c() {
    return i__SkipHdrsRE__c;
  }

  

  public void setI__SkipHdrsRE__c(java.lang.Boolean i__SkipHdrsRE__c) {
    this.i__SkipHdrsRE__c = i__SkipHdrsRE__c;
    i__SkipHdrsRE__c__is_set = true;
  }
  
  /**
   * element  : i__SkipHdrs__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkipHdrs__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkipHdrs__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__SkipHdrs__c__is_set = false;

  private java.lang.String i__SkipHdrs__c;

  public java.lang.String getI__SkipHdrs__c() {
    return i__SkipHdrs__c;
  }

  

  public void setI__SkipHdrs__c(java.lang.String i__SkipHdrs__c) {
    this.i__SkipHdrs__c = i__SkipHdrs__c;
    i__SkipHdrs__c__is_set = true;
  }
  
  /**
   * element  : i__SkipSubjRE__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkipSubjRE__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkipSubjRE__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__SkipSubjRE__c__is_set = false;

  private java.lang.Boolean i__SkipSubjRE__c;

  public java.lang.Boolean getI__SkipSubjRE__c() {
    return i__SkipSubjRE__c;
  }

  

  public void setI__SkipSubjRE__c(java.lang.Boolean i__SkipSubjRE__c) {
    this.i__SkipSubjRE__c = i__SkipSubjRE__c;
    i__SkipSubjRE__c__is_set = true;
  }
  
  /**
   * element  : i__SkipSubj__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkipSubj__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkipSubj__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__SkipSubj__c__is_set = false;

  private java.lang.String i__SkipSubj__c;

  public java.lang.String getI__SkipSubj__c() {
    return i__SkipSubj__c;
  }

  

  public void setI__SkipSubj__c(java.lang.String i__SkipSubj__c) {
    this.i__SkipSubj__c = i__SkipSubj__c;
    i__SkipSubj__c__is_set = true;
  }
  
  /**
   * element  : i__SkippableAccContactRoles__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkippableAccContactRoles__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkippableAccContactRoles__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__SkippableAccContactRoles__c__is_set = false;

  private java.lang.String i__SkippableAccContactRoles__c;

  public java.lang.String getI__SkippableAccContactRoles__c() {
    return i__SkippableAccContactRoles__c;
  }

  

  public void setI__SkippableAccContactRoles__c(java.lang.String i__SkippableAccContactRoles__c) {
    this.i__SkippableAccContactRoles__c = i__SkippableAccContactRoles__c;
    i__SkippableAccContactRoles__c__is_set = true;
  }
  
  /**
   * element  : i__SkippableOppContactRoles__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__SkippableOppContactRoles__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__SkippableOppContactRoles__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__SkippableOppContactRoles__c__is_set = false;

  private java.lang.String i__SkippableOppContactRoles__c;

  public java.lang.String getI__SkippableOppContactRoles__c() {
    return i__SkippableOppContactRoles__c;
  }

  

  public void setI__SkippableOppContactRoles__c(java.lang.String i__SkippableOppContactRoles__c) {
    this.i__SkippableOppContactRoles__c = i__SkippableOppContactRoles__c;
    i__SkippableOppContactRoles__c__is_set = true;
  }
  
  /**
   * element  : i__UIKey__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__UIKey__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__UIKey__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__UIKey__c__is_set = false;

  private java.lang.String i__UIKey__c;

  public java.lang.String getI__UIKey__c() {
    return i__UIKey__c;
  }

  

  public void setI__UIKey__c(java.lang.String i__UIKey__c) {
    this.i__UIKey__c = i__UIKey__c;
    i__UIKey__c__is_set = true;
  }
  
  /**
   * element  : i__UpdCase_triggerOtherEmail__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__UpdCase_triggerOtherEmail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__UpdCase_triggerOtherEmail__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__UpdCase_triggerOtherEmail__c__is_set = false;

  private java.lang.Boolean i__UpdCase_triggerOtherEmail__c;

  public java.lang.Boolean getI__UpdCase_triggerOtherEmail__c() {
    return i__UpdCase_triggerOtherEmail__c;
  }

  

  public void setI__UpdCase_triggerOtherEmail__c(java.lang.Boolean i__UpdCase_triggerOtherEmail__c) {
    this.i__UpdCase_triggerOtherEmail__c = i__UpdCase_triggerOtherEmail__c;
    i__UpdCase_triggerOtherEmail__c__is_set = true;
  }
  
  /**
   * element  : i__UseAccContactRoles__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo i__UseAccContactRoles__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__UseAccContactRoles__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean i__UseAccContactRoles__c__is_set = false;

  private java.lang.Boolean i__UseAccContactRoles__c;

  public java.lang.Boolean getI__UseAccContactRoles__c() {
    return i__UseAccContactRoles__c;
  }

  

  public void setI__UseAccContactRoles__c(java.lang.Boolean i__UseAccContactRoles__c) {
    this.i__UseAccContactRoles__c = i__UseAccContactRoles__c;
    i__UseAccContactRoles__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "i__AAConfig__c");
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
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, i__AALogLifespan__c__typeInfo, i__AALogLifespan__c, i__AALogLifespan__c__is_set);
    __typeMapper.writeObject(__out, i__AllowInternalMail2Case__c__typeInfo, i__AllowInternalMail2Case__c, i__AllowInternalMail2Case__c__is_set);
    __typeMapper.writeObject(__out, i__AllowPortalAccess__c__typeInfo, i__AllowPortalAccess__c, i__AllowPortalAccess__c__is_set);
    __typeMapper.writeObject(__out, i__AttKeepAllForCases__c__typeInfo, i__AttKeepAllForCases__c, i__AttKeepAllForCases__c__is_set);
    __typeMapper.writeObject(__out, i__AttMinImgSize__c__typeInfo, i__AttMinImgSize__c, i__AttMinImgSize__c__is_set);
    __typeMapper.writeString(__out, i__AttSkipExts__c__typeInfo, i__AttSkipExts__c, i__AttSkipExts__c__is_set);
    __typeMapper.writeString(__out, i__BaseURL__c__typeInfo, i__BaseURL__c, i__BaseURL__c__is_set);
    __typeMapper.writeString(__out, i__CasePatterns__c__typeInfo, i__CasePatterns__c, i__CasePatterns__c__is_set);
    __typeMapper.writeObject(__out, i__CheckCustomPages__c__typeInfo, i__CheckCustomPages__c, i__CheckCustomPages__c__is_set);
    __typeMapper.writeObject(__out, i__CopyAttachmentsToTasks__c__typeInfo, i__CopyAttachmentsToTasks__c, i__CopyAttachmentsToTasks__c__is_set);
    __typeMapper.writeObject(__out, i__CopyEmailsToTasks__c__typeInfo, i__CopyEmailsToTasks__c, i__CopyEmailsToTasks__c__is_set);
    __typeMapper.writeString(__out, i__DataVersion__c__typeInfo, i__DataVersion__c, i__DataVersion__c__is_set);
    __typeMapper.writeObject(__out, i__EmailLifespanOnLinked__c__typeInfo, i__EmailLifespanOnLinked__c, i__EmailLifespanOnLinked__c__is_set);
    __typeMapper.writeObject(__out, i__EmailLifespan__c__typeInfo, i__EmailLifespan__c, i__EmailLifespan__c__is_set);
    __typeMapper.writeString(__out, i__EmailLookups__c__typeInfo, i__EmailLookups__c, i__EmailLookups__c__is_set);
    __typeMapper.writeString(__out, i__EmailToTaskPriority__c__typeInfo, i__EmailToTaskPriority__c, i__EmailToTaskPriority__c__is_set);
    __typeMapper.writeString(__out, i__EmailToTaskStatus__c__typeInfo, i__EmailToTaskStatus__c, i__EmailToTaskStatus__c__is_set);
    __typeMapper.writeString(__out, i__EmailToTaskTarget__c__typeInfo, i__EmailToTaskTarget__c, i__EmailToTaskTarget__c__is_set);
    __typeMapper.writeString(__out, i__EmailToTaskType__c__typeInfo, i__EmailToTaskType__c, i__EmailToTaskType__c__is_set);
    __typeMapper.writeObject(__out, i__EncryptLinkedMsgs__c__typeInfo, i__EncryptLinkedMsgs__c, i__EncryptLinkedMsgs__c__is_set);
    __typeMapper.writeString(__out, i__EncryptionKey__c__typeInfo, i__EncryptionKey__c, i__EncryptionKey__c__is_set);
    __typeMapper.writeString(__out, i__ISPDomains__c__typeInfo, i__ISPDomains__c, i__ISPDomains__c__is_set);
    __typeMapper.writeString(__out, i__InstallContacts__c__typeInfo, i__InstallContacts__c, i__InstallContacts__c__is_set);
    __typeMapper.writeString(__out, i__InstallLeads__c__typeInfo, i__InstallLeads__c, i__InstallLeads__c__is_set);
    __typeMapper.writeString(__out, i__InstallPageLayouts__c__typeInfo, i__InstallPageLayouts__c, i__InstallPageLayouts__c__is_set);
    __typeMapper.writeString(__out, i__InstallPages__c__typeInfo, i__InstallPages__c, i__InstallPages__c__is_set);
    __typeMapper.writeString(__out, i__InstallSkipAddrs__c__typeInfo, i__InstallSkipAddrs__c, i__InstallSkipAddrs__c__is_set);
    __typeMapper.writeString(__out, i__InstallUsers__c__typeInfo, i__InstallUsers__c, i__InstallUsers__c__is_set);
    __typeMapper.writeString(__out, i__InternalDomains__c__typeInfo, i__InternalDomains__c, i__InternalDomains__c__is_set);
    __typeMapper.writeObject(__out, i__LastMaintenance__c__typeInfo, i__LastMaintenance__c, i__LastMaintenance__c__is_set);
    __typeMapper.writeObject(__out, i__LastUsagePing__c__typeInfo, i__LastUsagePing__c, i__LastUsagePing__c__is_set);
    __typeMapper.writeString(__out, i__Mail2CaseAddrs__c__typeInfo, i__Mail2CaseAddrs__c, i__Mail2CaseAddrs__c__is_set);
    __typeMapper.writeString(__out, i__MaintenanceCronId__c__typeInfo, i__MaintenanceCronId__c, i__MaintenanceCronId__c__is_set);
    __typeMapper.writeObject(__out, i__NewCase_triggerAutoResponseEmail__c__typeInfo, i__NewCase_triggerAutoResponseEmail__c, i__NewCase_triggerAutoResponseEmail__c__is_set);
    __typeMapper.writeObject(__out, i__NewCase_triggerUserEmail__c__typeInfo, i__NewCase_triggerUserEmail__c, i__NewCase_triggerUserEmail__c__is_set);
    __typeMapper.writeObject(__out, i__NewCase_useDefaultAssignmentRule__c__typeInfo, i__NewCase_useDefaultAssignmentRule__c, i__NewCase_useDefaultAssignmentRule__c__is_set);
    __typeMapper.writeObject(__out, i__NewLead_triggerAutoResponseEmail__c__typeInfo, i__NewLead_triggerAutoResponseEmail__c, i__NewLead_triggerAutoResponseEmail__c__is_set);
    __typeMapper.writeObject(__out, i__NewLead_triggerUserEmail__c__typeInfo, i__NewLead_triggerUserEmail__c, i__NewLead_triggerUserEmail__c__is_set);
    __typeMapper.writeObject(__out, i__NewLead_useDefaultAssignmentRule__c__typeInfo, i__NewLead_useDefaultAssignmentRule__c, i__NewLead_useDefaultAssignmentRule__c__is_set);
    __typeMapper.writeObject(__out, i__NoLogContentStatic__c__typeInfo, i__NoLogContentStatic__c, i__NoLogContentStatic__c__is_set);
    __typeMapper.writeString(__out, i__NoLogContent__c__typeInfo, i__NoLogContent__c, i__NoLogContent__c__is_set);
    __typeMapper.writeObject(__out, i__NoPending__c__typeInfo, i__NoPending__c, i__NoPending__c__is_set);
    __typeMapper.writeObject(__out, i__PendingLifespan__c__typeInfo, i__PendingLifespan__c, i__PendingLifespan__c__is_set);
    __typeMapper.writeObject(__out, i__SetLastEmailFields__c__typeInfo, i__SetLastEmailFields__c, i__SetLastEmailFields__c__is_set);
    __typeMapper.writeObject(__out, i__ShowOpportunityLinkage__c__typeInfo, i__ShowOpportunityLinkage__c, i__ShowOpportunityLinkage__c__is_set);
    __typeMapper.writeObject(__out, i__ShowOpportunityLookup__c__typeInfo, i__ShowOpportunityLookup__c, i__ShowOpportunityLookup__c__is_set);
    __typeMapper.writeObject(__out, i__SkipBodyRE__c__typeInfo, i__SkipBodyRE__c, i__SkipBodyRE__c__is_set);
    __typeMapper.writeString(__out, i__SkipBody__c__typeInfo, i__SkipBody__c, i__SkipBody__c__is_set);
    __typeMapper.writeObject(__out, i__SkipHdrsRE__c__typeInfo, i__SkipHdrsRE__c, i__SkipHdrsRE__c__is_set);
    __typeMapper.writeString(__out, i__SkipHdrs__c__typeInfo, i__SkipHdrs__c, i__SkipHdrs__c__is_set);
    __typeMapper.writeObject(__out, i__SkipSubjRE__c__typeInfo, i__SkipSubjRE__c, i__SkipSubjRE__c__is_set);
    __typeMapper.writeString(__out, i__SkipSubj__c__typeInfo, i__SkipSubj__c, i__SkipSubj__c__is_set);
    __typeMapper.writeString(__out, i__SkippableAccContactRoles__c__typeInfo, i__SkippableAccContactRoles__c, i__SkippableAccContactRoles__c__is_set);
    __typeMapper.writeString(__out, i__SkippableOppContactRoles__c__typeInfo, i__SkippableOppContactRoles__c, i__SkippableOppContactRoles__c__is_set);
    __typeMapper.writeString(__out, i__UIKey__c__typeInfo, i__UIKey__c, i__UIKey__c__is_set);
    __typeMapper.writeObject(__out, i__UpdCase_triggerOtherEmail__c__typeInfo, i__UpdCase_triggerOtherEmail__c, i__UpdCase_triggerOtherEmail__c__is_set);
    __typeMapper.writeObject(__out, i__UseAccContactRoles__c__typeInfo, i__UseAccContactRoles__c, i__UseAccContactRoles__c__is_set);
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
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, i__AALogLifespan__c__typeInfo)) {
      setI__AALogLifespan__c((java.lang.Double)__typeMapper.readObject(__in, i__AALogLifespan__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__AllowInternalMail2Case__c__typeInfo)) {
      setI__AllowInternalMail2Case__c((java.lang.Boolean)__typeMapper.readObject(__in, i__AllowInternalMail2Case__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__AllowPortalAccess__c__typeInfo)) {
      setI__AllowPortalAccess__c((java.lang.Boolean)__typeMapper.readObject(__in, i__AllowPortalAccess__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__AttKeepAllForCases__c__typeInfo)) {
      setI__AttKeepAllForCases__c((java.lang.Boolean)__typeMapper.readObject(__in, i__AttKeepAllForCases__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__AttMinImgSize__c__typeInfo)) {
      setI__AttMinImgSize__c((java.lang.Double)__typeMapper.readObject(__in, i__AttMinImgSize__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__AttSkipExts__c__typeInfo)) {
      setI__AttSkipExts__c((java.lang.String)__typeMapper.readString(__in, i__AttSkipExts__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__BaseURL__c__typeInfo)) {
      setI__BaseURL__c((java.lang.String)__typeMapper.readString(__in, i__BaseURL__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__CasePatterns__c__typeInfo)) {
      setI__CasePatterns__c((java.lang.String)__typeMapper.readString(__in, i__CasePatterns__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__CheckCustomPages__c__typeInfo)) {
      setI__CheckCustomPages__c((java.lang.Boolean)__typeMapper.readObject(__in, i__CheckCustomPages__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__CopyAttachmentsToTasks__c__typeInfo)) {
      setI__CopyAttachmentsToTasks__c((java.lang.Boolean)__typeMapper.readObject(__in, i__CopyAttachmentsToTasks__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__CopyEmailsToTasks__c__typeInfo)) {
      setI__CopyEmailsToTasks__c((java.lang.Boolean)__typeMapper.readObject(__in, i__CopyEmailsToTasks__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__DataVersion__c__typeInfo)) {
      setI__DataVersion__c((java.lang.String)__typeMapper.readString(__in, i__DataVersion__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailLifespanOnLinked__c__typeInfo)) {
      setI__EmailLifespanOnLinked__c((java.lang.Boolean)__typeMapper.readObject(__in, i__EmailLifespanOnLinked__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailLifespan__c__typeInfo)) {
      setI__EmailLifespan__c((java.lang.Double)__typeMapper.readObject(__in, i__EmailLifespan__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailLookups__c__typeInfo)) {
      setI__EmailLookups__c((java.lang.String)__typeMapper.readString(__in, i__EmailLookups__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailToTaskPriority__c__typeInfo)) {
      setI__EmailToTaskPriority__c((java.lang.String)__typeMapper.readString(__in, i__EmailToTaskPriority__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailToTaskStatus__c__typeInfo)) {
      setI__EmailToTaskStatus__c((java.lang.String)__typeMapper.readString(__in, i__EmailToTaskStatus__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailToTaskTarget__c__typeInfo)) {
      setI__EmailToTaskTarget__c((java.lang.String)__typeMapper.readString(__in, i__EmailToTaskTarget__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailToTaskType__c__typeInfo)) {
      setI__EmailToTaskType__c((java.lang.String)__typeMapper.readString(__in, i__EmailToTaskType__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EncryptLinkedMsgs__c__typeInfo)) {
      setI__EncryptLinkedMsgs__c((java.lang.Boolean)__typeMapper.readObject(__in, i__EncryptLinkedMsgs__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EncryptionKey__c__typeInfo)) {
      setI__EncryptionKey__c((java.lang.String)__typeMapper.readString(__in, i__EncryptionKey__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__ISPDomains__c__typeInfo)) {
      setI__ISPDomains__c((java.lang.String)__typeMapper.readString(__in, i__ISPDomains__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InstallContacts__c__typeInfo)) {
      setI__InstallContacts__c((java.lang.String)__typeMapper.readString(__in, i__InstallContacts__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InstallLeads__c__typeInfo)) {
      setI__InstallLeads__c((java.lang.String)__typeMapper.readString(__in, i__InstallLeads__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InstallPageLayouts__c__typeInfo)) {
      setI__InstallPageLayouts__c((java.lang.String)__typeMapper.readString(__in, i__InstallPageLayouts__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InstallPages__c__typeInfo)) {
      setI__InstallPages__c((java.lang.String)__typeMapper.readString(__in, i__InstallPages__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InstallSkipAddrs__c__typeInfo)) {
      setI__InstallSkipAddrs__c((java.lang.String)__typeMapper.readString(__in, i__InstallSkipAddrs__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InstallUsers__c__typeInfo)) {
      setI__InstallUsers__c((java.lang.String)__typeMapper.readString(__in, i__InstallUsers__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InternalDomains__c__typeInfo)) {
      setI__InternalDomains__c((java.lang.String)__typeMapper.readString(__in, i__InternalDomains__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMaintenance__c__typeInfo)) {
      setI__LastMaintenance__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastMaintenance__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastUsagePing__c__typeInfo)) {
      setI__LastUsagePing__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastUsagePing__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__Mail2CaseAddrs__c__typeInfo)) {
      setI__Mail2CaseAddrs__c((java.lang.String)__typeMapper.readString(__in, i__Mail2CaseAddrs__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__MaintenanceCronId__c__typeInfo)) {
      setI__MaintenanceCronId__c((java.lang.String)__typeMapper.readString(__in, i__MaintenanceCronId__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NewCase_triggerAutoResponseEmail__c__typeInfo)) {
      setI__NewCase_triggerAutoResponseEmail__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NewCase_triggerAutoResponseEmail__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NewCase_triggerUserEmail__c__typeInfo)) {
      setI__NewCase_triggerUserEmail__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NewCase_triggerUserEmail__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NewCase_useDefaultAssignmentRule__c__typeInfo)) {
      setI__NewCase_useDefaultAssignmentRule__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NewCase_useDefaultAssignmentRule__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NewLead_triggerAutoResponseEmail__c__typeInfo)) {
      setI__NewLead_triggerAutoResponseEmail__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NewLead_triggerAutoResponseEmail__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NewLead_triggerUserEmail__c__typeInfo)) {
      setI__NewLead_triggerUserEmail__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NewLead_triggerUserEmail__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NewLead_useDefaultAssignmentRule__c__typeInfo)) {
      setI__NewLead_useDefaultAssignmentRule__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NewLead_useDefaultAssignmentRule__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NoLogContentStatic__c__typeInfo)) {
      setI__NoLogContentStatic__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NoLogContentStatic__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NoLogContent__c__typeInfo)) {
      setI__NoLogContent__c((java.lang.String)__typeMapper.readString(__in, i__NoLogContent__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NoPending__c__typeInfo)) {
      setI__NoPending__c((java.lang.Boolean)__typeMapper.readObject(__in, i__NoPending__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__PendingLifespan__c__typeInfo)) {
      setI__PendingLifespan__c((java.lang.Double)__typeMapper.readObject(__in, i__PendingLifespan__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SetLastEmailFields__c__typeInfo)) {
      setI__SetLastEmailFields__c((java.lang.Boolean)__typeMapper.readObject(__in, i__SetLastEmailFields__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__ShowOpportunityLinkage__c__typeInfo)) {
      setI__ShowOpportunityLinkage__c((java.lang.Boolean)__typeMapper.readObject(__in, i__ShowOpportunityLinkage__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__ShowOpportunityLookup__c__typeInfo)) {
      setI__ShowOpportunityLookup__c((java.lang.Boolean)__typeMapper.readObject(__in, i__ShowOpportunityLookup__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkipBodyRE__c__typeInfo)) {
      setI__SkipBodyRE__c((java.lang.Boolean)__typeMapper.readObject(__in, i__SkipBodyRE__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkipBody__c__typeInfo)) {
      setI__SkipBody__c((java.lang.String)__typeMapper.readString(__in, i__SkipBody__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkipHdrsRE__c__typeInfo)) {
      setI__SkipHdrsRE__c((java.lang.Boolean)__typeMapper.readObject(__in, i__SkipHdrsRE__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkipHdrs__c__typeInfo)) {
      setI__SkipHdrs__c((java.lang.String)__typeMapper.readString(__in, i__SkipHdrs__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkipSubjRE__c__typeInfo)) {
      setI__SkipSubjRE__c((java.lang.Boolean)__typeMapper.readObject(__in, i__SkipSubjRE__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkipSubj__c__typeInfo)) {
      setI__SkipSubj__c((java.lang.String)__typeMapper.readString(__in, i__SkipSubj__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkippableAccContactRoles__c__typeInfo)) {
      setI__SkippableAccContactRoles__c((java.lang.String)__typeMapper.readString(__in, i__SkippableAccContactRoles__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__SkippableOppContactRoles__c__typeInfo)) {
      setI__SkippableOppContactRoles__c((java.lang.String)__typeMapper.readString(__in, i__SkippableOppContactRoles__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__UIKey__c__typeInfo)) {
      setI__UIKey__c((java.lang.String)__typeMapper.readString(__in, i__UIKey__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__UpdCase_triggerOtherEmail__c__typeInfo)) {
      setI__UpdCase_triggerOtherEmail__c((java.lang.Boolean)__typeMapper.readObject(__in, i__UpdCase_triggerOtherEmail__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__UseAccContactRoles__c__typeInfo)) {
      setI__UseAccContactRoles__c((java.lang.Boolean)__typeMapper.readObject(__in, i__UseAccContactRoles__c__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[I__AAConfig__c ");
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
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
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
    sb.append(" i__AALogLifespan__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__AALogLifespan__c)+"'\n");
    sb.append(" i__AllowInternalMail2Case__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__AllowInternalMail2Case__c)+"'\n");
    sb.append(" i__AllowPortalAccess__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__AllowPortalAccess__c)+"'\n");
    sb.append(" i__AttKeepAllForCases__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__AttKeepAllForCases__c)+"'\n");
    sb.append(" i__AttMinImgSize__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__AttMinImgSize__c)+"'\n");
    sb.append(" i__AttSkipExts__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__AttSkipExts__c)+"'\n");
    sb.append(" i__BaseURL__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__BaseURL__c)+"'\n");
    sb.append(" i__CasePatterns__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__CasePatterns__c)+"'\n");
    sb.append(" i__CheckCustomPages__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__CheckCustomPages__c)+"'\n");
    sb.append(" i__CopyAttachmentsToTasks__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__CopyAttachmentsToTasks__c)+"'\n");
    sb.append(" i__CopyEmailsToTasks__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__CopyEmailsToTasks__c)+"'\n");
    sb.append(" i__DataVersion__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__DataVersion__c)+"'\n");
    sb.append(" i__EmailLifespanOnLinked__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailLifespanOnLinked__c)+"'\n");
    sb.append(" i__EmailLifespan__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailLifespan__c)+"'\n");
    sb.append(" i__EmailLookups__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailLookups__c)+"'\n");
    sb.append(" i__EmailToTaskPriority__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailToTaskPriority__c)+"'\n");
    sb.append(" i__EmailToTaskStatus__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailToTaskStatus__c)+"'\n");
    sb.append(" i__EmailToTaskTarget__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailToTaskTarget__c)+"'\n");
    sb.append(" i__EmailToTaskType__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailToTaskType__c)+"'\n");
    sb.append(" i__EncryptLinkedMsgs__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EncryptLinkedMsgs__c)+"'\n");
    sb.append(" i__EncryptionKey__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EncryptionKey__c)+"'\n");
    sb.append(" i__ISPDomains__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__ISPDomains__c)+"'\n");
    sb.append(" i__InstallContacts__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InstallContacts__c)+"'\n");
    sb.append(" i__InstallLeads__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InstallLeads__c)+"'\n");
    sb.append(" i__InstallPageLayouts__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InstallPageLayouts__c)+"'\n");
    sb.append(" i__InstallPages__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InstallPages__c)+"'\n");
    sb.append(" i__InstallSkipAddrs__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InstallSkipAddrs__c)+"'\n");
    sb.append(" i__InstallUsers__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InstallUsers__c)+"'\n");
    sb.append(" i__InternalDomains__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InternalDomains__c)+"'\n");
    sb.append(" i__LastMaintenance__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMaintenance__c)+"'\n");
    sb.append(" i__LastUsagePing__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastUsagePing__c)+"'\n");
    sb.append(" i__Mail2CaseAddrs__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__Mail2CaseAddrs__c)+"'\n");
    sb.append(" i__MaintenanceCronId__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__MaintenanceCronId__c)+"'\n");
    sb.append(" i__NewCase_triggerAutoResponseEmail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NewCase_triggerAutoResponseEmail__c)+"'\n");
    sb.append(" i__NewCase_triggerUserEmail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NewCase_triggerUserEmail__c)+"'\n");
    sb.append(" i__NewCase_useDefaultAssignmentRule__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NewCase_useDefaultAssignmentRule__c)+"'\n");
    sb.append(" i__NewLead_triggerAutoResponseEmail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NewLead_triggerAutoResponseEmail__c)+"'\n");
    sb.append(" i__NewLead_triggerUserEmail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NewLead_triggerUserEmail__c)+"'\n");
    sb.append(" i__NewLead_useDefaultAssignmentRule__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NewLead_useDefaultAssignmentRule__c)+"'\n");
    sb.append(" i__NoLogContentStatic__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NoLogContentStatic__c)+"'\n");
    sb.append(" i__NoLogContent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NoLogContent__c)+"'\n");
    sb.append(" i__NoPending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NoPending__c)+"'\n");
    sb.append(" i__PendingLifespan__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__PendingLifespan__c)+"'\n");
    sb.append(" i__SetLastEmailFields__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SetLastEmailFields__c)+"'\n");
    sb.append(" i__ShowOpportunityLinkage__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__ShowOpportunityLinkage__c)+"'\n");
    sb.append(" i__ShowOpportunityLookup__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__ShowOpportunityLookup__c)+"'\n");
    sb.append(" i__SkipBodyRE__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkipBodyRE__c)+"'\n");
    sb.append(" i__SkipBody__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkipBody__c)+"'\n");
    sb.append(" i__SkipHdrsRE__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkipHdrsRE__c)+"'\n");
    sb.append(" i__SkipHdrs__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkipHdrs__c)+"'\n");
    sb.append(" i__SkipSubjRE__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkipSubjRE__c)+"'\n");
    sb.append(" i__SkipSubj__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkipSubj__c)+"'\n");
    sb.append(" i__SkippableAccContactRoles__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkippableAccContactRoles__c)+"'\n");
    sb.append(" i__SkippableOppContactRoles__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__SkippableOppContactRoles__c)+"'\n");
    sb.append(" i__UIKey__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__UIKey__c)+"'\n");
    sb.append(" i__UpdCase_triggerOtherEmail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__UpdCase_triggerOtherEmail__c)+"'\n");
    sb.append(" i__UseAccContactRoles__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__UseAccContactRoles__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}