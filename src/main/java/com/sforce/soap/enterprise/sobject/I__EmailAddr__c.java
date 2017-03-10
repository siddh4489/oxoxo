package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class I__EmailAddr__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public I__EmailAddr__c() {
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
   * element  : i__ContactCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__ContactCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__ContactCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__ContactCt__c__is_set = false;

  private java.lang.Double i__ContactCt__c;

  public java.lang.Double getI__ContactCt__c() {
    return i__ContactCt__c;
  }

  

  public void setI__ContactCt__c(java.lang.Double i__ContactCt__c) {
    this.i__ContactCt__c = i__ContactCt__c;
    i__ContactCt__c__is_set = true;
  }
  
  /**
   * element  : i__Domain__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__Domain__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__Domain__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__Domain__c__is_set = false;

  private java.lang.String i__Domain__c;

  public java.lang.String getI__Domain__c() {
    return i__Domain__c;
  }

  

  public void setI__Domain__c(java.lang.String i__Domain__c) {
    this.i__Domain__c = i__Domain__c;
    i__Domain__c__is_set = true;
  }
  
  /**
   * element  : i__E2EAs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__E2EAs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__E2EAs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__E2EAs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__E2EAs__r;

  public com.sforce.soap.enterprise.QueryResult getI__E2EAs__r() {
    return i__E2EAs__r;
  }

  

  public void setI__E2EAs__r(com.sforce.soap.enterprise.QueryResult i__E2EAs__r) {
    this.i__E2EAs__r = i__E2EAs__r;
    i__E2EAs__r__is_set = true;
  }
  
  /**
   * element  : i__EA2Cs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__EA2Cs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EA2Cs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__EA2Cs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__EA2Cs__r;

  public com.sforce.soap.enterprise.QueryResult getI__EA2Cs__r() {
    return i__EA2Cs__r;
  }

  

  public void setI__EA2Cs__r(com.sforce.soap.enterprise.QueryResult i__EA2Cs__r) {
    this.i__EA2Cs__r = i__EA2Cs__r;
    i__EA2Cs__r__is_set = true;
  }
  
  /**
   * element  : i__EA2Ls__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__EA2Ls__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EA2Ls__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__EA2Ls__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__EA2Ls__r;

  public com.sforce.soap.enterprise.QueryResult getI__EA2Ls__r() {
    return i__EA2Ls__r;
  }

  

  public void setI__EA2Ls__r(com.sforce.soap.enterprise.QueryResult i__EA2Ls__r) {
    this.i__EA2Ls__r = i__EA2Ls__r;
    i__EA2Ls__r__is_set = true;
  }
  
  /**
   * element  : i__EA2Us__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__EA2Us__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EA2Us__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__EA2Us__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__EA2Us__r;

  public com.sforce.soap.enterprise.QueryResult getI__EA2Us__r() {
    return i__EA2Us__r;
  }

  

  public void setI__EA2Us__r(com.sforce.soap.enterprise.QueryResult i__EA2Us__r) {
    this.i__EA2Us__r = i__EA2Us__r;
    i__EA2Us__r__is_set = true;
  }
  
  /**
   * element  : i__EmailCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__EmailCt__c__is_set = false;

  private java.lang.Double i__EmailCt__c;

  public java.lang.Double getI__EmailCt__c() {
    return i__EmailCt__c;
  }

  

  public void setI__EmailCt__c(java.lang.Double i__EmailCt__c) {
    this.i__EmailCt__c = i__EmailCt__c;
    i__EmailCt__c__is_set = true;
  }
  
  /**
   * element  : i__FirstName__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__FirstName__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__FirstName__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__FirstName__c__is_set = false;

  private java.lang.String i__FirstName__c;

  public java.lang.String getI__FirstName__c() {
    return i__FirstName__c;
  }

  

  public void setI__FirstName__c(java.lang.String i__FirstName__c) {
    this.i__FirstName__c = i__FirstName__c;
    i__FirstName__c__is_set = true;
  }
  
  /**
   * element  : i__FullAddr__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__FullAddr__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__FullAddr__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__FullAddr__c__is_set = false;

  private java.lang.String i__FullAddr__c;

  public java.lang.String getI__FullAddr__c() {
    return i__FullAddr__c;
  }

  

  public void setI__FullAddr__c(java.lang.String i__FullAddr__c) {
    this.i__FullAddr__c = i__FullAddr__c;
    i__FullAddr__c__is_set = true;
  }
  
  /**
   * element  : i__InboundEmailCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__InboundEmailCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__InboundEmailCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__InboundEmailCt__c__is_set = false;

  private java.lang.Double i__InboundEmailCt__c;

  public java.lang.Double getI__InboundEmailCt__c() {
    return i__InboundEmailCt__c;
  }

  

  public void setI__InboundEmailCt__c(java.lang.Double i__InboundEmailCt__c) {
    this.i__InboundEmailCt__c = i__InboundEmailCt__c;
    i__InboundEmailCt__c__is_set = true;
  }
  
  /**
   * element  : i__LastName__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastName__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastName__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__LastName__c__is_set = false;

  private java.lang.String i__LastName__c;

  public java.lang.String getI__LastName__c() {
    return i__LastName__c;
  }

  

  public void setI__LastName__c(java.lang.String i__LastName__c) {
    this.i__LastName__c = i__LastName__c;
    i__LastName__c__is_set = true;
  }
  
  /**
   * element  : i__LeadCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__LeadCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LeadCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__LeadCt__c__is_set = false;

  private java.lang.Double i__LeadCt__c;

  public java.lang.Double getI__LeadCt__c() {
    return i__LeadCt__c;
  }

  

  public void setI__LeadCt__c(java.lang.Double i__LeadCt__c) {
    this.i__LeadCt__c = i__LeadCt__c;
    i__LeadCt__c__is_set = true;
  }
  
  /**
   * element  : i__LinkCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__LinkCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LinkCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__LinkCt__c__is_set = false;

  private java.lang.Double i__LinkCt__c;

  public java.lang.Double getI__LinkCt__c() {
    return i__LinkCt__c;
  }

  

  public void setI__LinkCt__c(java.lang.Double i__LinkCt__c) {
    this.i__LinkCt__c = i__LinkCt__c;
    i__LinkCt__c__is_set = true;
  }
  
  /**
   * element  : i__NonUserCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__NonUserCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__NonUserCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__NonUserCt__c__is_set = false;

  private java.lang.Double i__NonUserCt__c;

  public java.lang.Double getI__NonUserCt__c() {
    return i__NonUserCt__c;
  }

  

  public void setI__NonUserCt__c(java.lang.Double i__NonUserCt__c) {
    this.i__NonUserCt__c = i__NonUserCt__c;
    i__NonUserCt__c__is_set = true;
  }
  
  /**
   * element  : i__OutboundEmailCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__OutboundEmailCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__OutboundEmailCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__OutboundEmailCt__c__is_set = false;

  private java.lang.Double i__OutboundEmailCt__c;

  public java.lang.Double getI__OutboundEmailCt__c() {
    return i__OutboundEmailCt__c;
  }

  

  public void setI__OutboundEmailCt__c(java.lang.Double i__OutboundEmailCt__c) {
    this.i__OutboundEmailCt__c = i__OutboundEmailCt__c;
    i__OutboundEmailCt__c__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028QVtEAM__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028QVtEAM__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028QVtEAM__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028QVtEAM__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028QVtEAM__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028QVtEAM__r() {
    return i__R00N700000028QVtEAM__r;
  }

  

  public void setI__R00N700000028QVtEAM__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028QVtEAM__r) {
    this.i__R00N700000028QVtEAM__r = i__R00N700000028QVtEAM__r;
    i__R00N700000028QVtEAM__r__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028QWQEA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028QWQEA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028QWQEA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028QWQEA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028QWQEA2__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028QWQEA2__r() {
    return i__R00N700000028QWQEA2__r;
  }

  

  public void setI__R00N700000028QWQEA2__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028QWQEA2__r) {
    this.i__R00N700000028QWQEA2__r = i__R00N700000028QWQEA2__r;
    i__R00N700000028QWQEA2__r__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028QWVEA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028QWVEA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028QWVEA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028QWVEA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028QWVEA2__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028QWVEA2__r() {
    return i__R00N700000028QWVEA2__r;
  }

  

  public void setI__R00N700000028QWVEA2__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028QWVEA2__r) {
    this.i__R00N700000028QWVEA2__r = i__R00N700000028QWVEA2__r;
    i__R00N700000028QWVEA2__r__is_set = true;
  }
  
  /**
   * element  : i__R00N700000028QWWEA2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__R00N700000028QWWEA2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__R00N700000028QWWEA2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__R00N700000028QWWEA2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__R00N700000028QWWEA2__r;

  public com.sforce.soap.enterprise.QueryResult getI__R00N700000028QWWEA2__r() {
    return i__R00N700000028QWWEA2__r;
  }

  

  public void setI__R00N700000028QWWEA2__r(com.sforce.soap.enterprise.QueryResult i__R00N700000028QWWEA2__r) {
    this.i__R00N700000028QWWEA2__r = i__R00N700000028QWWEA2__r;
    i__R00N700000028QWWEA2__r__is_set = true;
  }
  
  /**
   * element  : i__UserCt__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__UserCt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__UserCt__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__UserCt__c__is_set = false;

  private java.lang.Double i__UserCt__c;

  public java.lang.Double getI__UserCt__c() {
    return i__UserCt__c;
  }

  

  public void setI__UserCt__c(java.lang.Double i__UserCt__c) {
    this.i__UserCt__c = i__UserCt__c;
    i__UserCt__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "i__EmailAddr__c");
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
    __typeMapper.writeObject(__out, i__ContactCt__c__typeInfo, i__ContactCt__c, i__ContactCt__c__is_set);
    __typeMapper.writeString(__out, i__Domain__c__typeInfo, i__Domain__c, i__Domain__c__is_set);
    __typeMapper.writeObject(__out, i__E2EAs__r__typeInfo, i__E2EAs__r, i__E2EAs__r__is_set);
    __typeMapper.writeObject(__out, i__EA2Cs__r__typeInfo, i__EA2Cs__r, i__EA2Cs__r__is_set);
    __typeMapper.writeObject(__out, i__EA2Ls__r__typeInfo, i__EA2Ls__r, i__EA2Ls__r__is_set);
    __typeMapper.writeObject(__out, i__EA2Us__r__typeInfo, i__EA2Us__r, i__EA2Us__r__is_set);
    __typeMapper.writeObject(__out, i__EmailCt__c__typeInfo, i__EmailCt__c, i__EmailCt__c__is_set);
    __typeMapper.writeString(__out, i__FirstName__c__typeInfo, i__FirstName__c, i__FirstName__c__is_set);
    __typeMapper.writeString(__out, i__FullAddr__c__typeInfo, i__FullAddr__c, i__FullAddr__c__is_set);
    __typeMapper.writeObject(__out, i__InboundEmailCt__c__typeInfo, i__InboundEmailCt__c, i__InboundEmailCt__c__is_set);
    __typeMapper.writeString(__out, i__LastName__c__typeInfo, i__LastName__c, i__LastName__c__is_set);
    __typeMapper.writeObject(__out, i__LeadCt__c__typeInfo, i__LeadCt__c, i__LeadCt__c__is_set);
    __typeMapper.writeObject(__out, i__LinkCt__c__typeInfo, i__LinkCt__c, i__LinkCt__c__is_set);
    __typeMapper.writeObject(__out, i__NonUserCt__c__typeInfo, i__NonUserCt__c, i__NonUserCt__c__is_set);
    __typeMapper.writeObject(__out, i__OutboundEmailCt__c__typeInfo, i__OutboundEmailCt__c, i__OutboundEmailCt__c__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028QVtEAM__r__typeInfo, i__R00N700000028QVtEAM__r, i__R00N700000028QVtEAM__r__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028QWQEA2__r__typeInfo, i__R00N700000028QWQEA2__r, i__R00N700000028QWQEA2__r__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028QWVEA2__r__typeInfo, i__R00N700000028QWVEA2__r, i__R00N700000028QWVEA2__r__is_set);
    __typeMapper.writeObject(__out, i__R00N700000028QWWEA2__r__typeInfo, i__R00N700000028QWWEA2__r, i__R00N700000028QWWEA2__r__is_set);
    __typeMapper.writeObject(__out, i__UserCt__c__typeInfo, i__UserCt__c, i__UserCt__c__is_set);
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
    if (__typeMapper.isElement(__in, i__ContactCt__c__typeInfo)) {
      setI__ContactCt__c((java.lang.Double)__typeMapper.readObject(__in, i__ContactCt__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__Domain__c__typeInfo)) {
      setI__Domain__c((java.lang.String)__typeMapper.readString(__in, i__Domain__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__E2EAs__r__typeInfo)) {
      setI__E2EAs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__E2EAs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EA2Cs__r__typeInfo)) {
      setI__EA2Cs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__EA2Cs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EA2Ls__r__typeInfo)) {
      setI__EA2Ls__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__EA2Ls__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EA2Us__r__typeInfo)) {
      setI__EA2Us__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__EA2Us__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailCt__c__typeInfo)) {
      setI__EmailCt__c((java.lang.Double)__typeMapper.readObject(__in, i__EmailCt__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__FirstName__c__typeInfo)) {
      setI__FirstName__c((java.lang.String)__typeMapper.readString(__in, i__FirstName__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__FullAddr__c__typeInfo)) {
      setI__FullAddr__c((java.lang.String)__typeMapper.readString(__in, i__FullAddr__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__InboundEmailCt__c__typeInfo)) {
      setI__InboundEmailCt__c((java.lang.Double)__typeMapper.readObject(__in, i__InboundEmailCt__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastName__c__typeInfo)) {
      setI__LastName__c((java.lang.String)__typeMapper.readString(__in, i__LastName__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LeadCt__c__typeInfo)) {
      setI__LeadCt__c((java.lang.Double)__typeMapper.readObject(__in, i__LeadCt__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LinkCt__c__typeInfo)) {
      setI__LinkCt__c((java.lang.Double)__typeMapper.readObject(__in, i__LinkCt__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__NonUserCt__c__typeInfo)) {
      setI__NonUserCt__c((java.lang.Double)__typeMapper.readObject(__in, i__NonUserCt__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__OutboundEmailCt__c__typeInfo)) {
      setI__OutboundEmailCt__c((java.lang.Double)__typeMapper.readObject(__in, i__OutboundEmailCt__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028QVtEAM__r__typeInfo)) {
      setI__R00N700000028QVtEAM__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028QVtEAM__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028QWQEA2__r__typeInfo)) {
      setI__R00N700000028QWQEA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028QWQEA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028QWVEA2__r__typeInfo)) {
      setI__R00N700000028QWVEA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028QWVEA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__R00N700000028QWWEA2__r__typeInfo)) {
      setI__R00N700000028QWWEA2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__R00N700000028QWWEA2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__UserCt__c__typeInfo)) {
      setI__UserCt__c((java.lang.Double)__typeMapper.readObject(__in, i__UserCt__c__typeInfo, java.lang.Double.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[I__EmailAddr__c ");
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
    sb.append(" i__ContactCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__ContactCt__c)+"'\n");
    sb.append(" i__Domain__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__Domain__c)+"'\n");
    sb.append(" i__E2EAs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__E2EAs__r)+"'\n");
    sb.append(" i__EA2Cs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EA2Cs__r)+"'\n");
    sb.append(" i__EA2Ls__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EA2Ls__r)+"'\n");
    sb.append(" i__EA2Us__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EA2Us__r)+"'\n");
    sb.append(" i__EmailCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailCt__c)+"'\n");
    sb.append(" i__FirstName__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__FirstName__c)+"'\n");
    sb.append(" i__FullAddr__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__FullAddr__c)+"'\n");
    sb.append(" i__InboundEmailCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__InboundEmailCt__c)+"'\n");
    sb.append(" i__LastName__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastName__c)+"'\n");
    sb.append(" i__LeadCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LeadCt__c)+"'\n");
    sb.append(" i__LinkCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LinkCt__c)+"'\n");
    sb.append(" i__NonUserCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__NonUserCt__c)+"'\n");
    sb.append(" i__OutboundEmailCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__OutboundEmailCt__c)+"'\n");
    sb.append(" i__R00N700000028QVtEAM__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028QVtEAM__r)+"'\n");
    sb.append(" i__R00N700000028QWQEA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028QWQEA2__r)+"'\n");
    sb.append(" i__R00N700000028QWVEA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028QWVEA2__r)+"'\n");
    sb.append(" i__R00N700000028QWWEA2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__R00N700000028QWWEA2__r)+"'\n");
    sb.append(" i__UserCt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__UserCt__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}