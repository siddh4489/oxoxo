package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Dlrs__LookupRollupSummary__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Dlrs__LookupRollupSummary__c() {
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
   * element  : LastReferencedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastReferencedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReferencedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastReferencedDate__is_set = false;

  private java.util.Calendar LastReferencedDate;

  public java.util.Calendar getLastReferencedDate() {
    return LastReferencedDate;
  }

  

  public void setLastReferencedDate(java.util.Calendar LastReferencedDate) {
    this.LastReferencedDate = LastReferencedDate;
    LastReferencedDate__is_set = true;
  }
  
  /**
   * element  : LastViewedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastViewedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastViewedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastViewedDate__is_set = false;

  private java.util.Calendar LastViewedDate;

  public java.util.Calendar getLastViewedDate() {
    return LastViewedDate;
  }

  

  public void setLastViewedDate(java.util.Calendar LastViewedDate) {
    this.LastViewedDate = LastViewedDate;
    LastViewedDate__is_set = true;
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
   * element  : dlrs__Active__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__Active__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__Active__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean dlrs__Active__c__is_set = false;

  private java.lang.Boolean dlrs__Active__c;

  public java.lang.Boolean getDlrs__Active__c() {
    return dlrs__Active__c;
  }

  

  public void setDlrs__Active__c(java.lang.Boolean dlrs__Active__c) {
    this.dlrs__Active__c = dlrs__Active__c;
    dlrs__Active__c__is_set = true;
  }
  
  /**
   * element  : dlrs__AggregateOperation__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__AggregateOperation__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__AggregateOperation__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__AggregateOperation__c__is_set = false;

  private java.lang.String dlrs__AggregateOperation__c;

  public java.lang.String getDlrs__AggregateOperation__c() {
    return dlrs__AggregateOperation__c;
  }

  

  public void setDlrs__AggregateOperation__c(java.lang.String dlrs__AggregateOperation__c) {
    this.dlrs__AggregateOperation__c = dlrs__AggregateOperation__c;
    dlrs__AggregateOperation__c__is_set = true;
  }
  
  /**
   * element  : dlrs__AggregateResultField__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__AggregateResultField__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__AggregateResultField__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__AggregateResultField__c__is_set = false;

  private java.lang.String dlrs__AggregateResultField__c;

  public java.lang.String getDlrs__AggregateResultField__c() {
    return dlrs__AggregateResultField__c;
  }

  

  public void setDlrs__AggregateResultField__c(java.lang.String dlrs__AggregateResultField__c) {
    this.dlrs__AggregateResultField__c = dlrs__AggregateResultField__c;
    dlrs__AggregateResultField__c__is_set = true;
  }
  
  /**
   * element  : dlrs__CalculateJobId__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__CalculateJobId__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__CalculateJobId__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__CalculateJobId__c__is_set = false;

  private java.lang.String dlrs__CalculateJobId__c;

  public java.lang.String getDlrs__CalculateJobId__c() {
    return dlrs__CalculateJobId__c;
  }

  

  public void setDlrs__CalculateJobId__c(java.lang.String dlrs__CalculateJobId__c) {
    this.dlrs__CalculateJobId__c = dlrs__CalculateJobId__c;
    dlrs__CalculateJobId__c__is_set = true;
  }
  
  /**
   * element  : dlrs__CalculationMode__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__CalculationMode__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__CalculationMode__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__CalculationMode__c__is_set = false;

  private java.lang.String dlrs__CalculationMode__c;

  public java.lang.String getDlrs__CalculationMode__c() {
    return dlrs__CalculationMode__c;
  }

  

  public void setDlrs__CalculationMode__c(java.lang.String dlrs__CalculationMode__c) {
    this.dlrs__CalculationMode__c = dlrs__CalculationMode__c;
    dlrs__CalculationMode__c__is_set = true;
  }
  
  /**
   * element  : dlrs__CalculationSharingMode__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__CalculationSharingMode__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__CalculationSharingMode__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__CalculationSharingMode__c__is_set = false;

  private java.lang.String dlrs__CalculationSharingMode__c;

  public java.lang.String getDlrs__CalculationSharingMode__c() {
    return dlrs__CalculationSharingMode__c;
  }

  

  public void setDlrs__CalculationSharingMode__c(java.lang.String dlrs__CalculationSharingMode__c) {
    this.dlrs__CalculationSharingMode__c = dlrs__CalculationSharingMode__c;
    dlrs__CalculationSharingMode__c__is_set = true;
  }
  
  /**
   * element  : dlrs__ChildObject__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__ChildObject__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__ChildObject__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__ChildObject__c__is_set = false;

  private java.lang.String dlrs__ChildObject__c;

  public java.lang.String getDlrs__ChildObject__c() {
    return dlrs__ChildObject__c;
  }

  

  public void setDlrs__ChildObject__c(java.lang.String dlrs__ChildObject__c) {
    this.dlrs__ChildObject__c = dlrs__ChildObject__c;
    dlrs__ChildObject__c__is_set = true;
  }
  
  /**
   * element  : dlrs__ConcatenateDelimiter__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__ConcatenateDelimiter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__ConcatenateDelimiter__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__ConcatenateDelimiter__c__is_set = false;

  private java.lang.String dlrs__ConcatenateDelimiter__c;

  public java.lang.String getDlrs__ConcatenateDelimiter__c() {
    return dlrs__ConcatenateDelimiter__c;
  }

  

  public void setDlrs__ConcatenateDelimiter__c(java.lang.String dlrs__ConcatenateDelimiter__c) {
    this.dlrs__ConcatenateDelimiter__c = dlrs__ConcatenateDelimiter__c;
    dlrs__ConcatenateDelimiter__c__is_set = true;
  }
  
  /**
   * element  : dlrs__Description__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__Description__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__Description__c__is_set = false;

  private java.lang.String dlrs__Description__c;

  public java.lang.String getDlrs__Description__c() {
    return dlrs__Description__c;
  }

  

  public void setDlrs__Description__c(java.lang.String dlrs__Description__c) {
    this.dlrs__Description__c = dlrs__Description__c;
    dlrs__Description__c__is_set = true;
  }
  
  /**
   * element  : dlrs__FieldToAggregate__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__FieldToAggregate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__FieldToAggregate__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__FieldToAggregate__c__is_set = false;

  private java.lang.String dlrs__FieldToAggregate__c;

  public java.lang.String getDlrs__FieldToAggregate__c() {
    return dlrs__FieldToAggregate__c;
  }

  

  public void setDlrs__FieldToAggregate__c(java.lang.String dlrs__FieldToAggregate__c) {
    this.dlrs__FieldToAggregate__c = dlrs__FieldToAggregate__c;
    dlrs__FieldToAggregate__c__is_set = true;
  }
  
  /**
   * element  : dlrs__FieldToOrderBy__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__FieldToOrderBy__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__FieldToOrderBy__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__FieldToOrderBy__c__is_set = false;

  private java.lang.String dlrs__FieldToOrderBy__c;

  public java.lang.String getDlrs__FieldToOrderBy__c() {
    return dlrs__FieldToOrderBy__c;
  }

  

  public void setDlrs__FieldToOrderBy__c(java.lang.String dlrs__FieldToOrderBy__c) {
    this.dlrs__FieldToOrderBy__c = dlrs__FieldToOrderBy__c;
    dlrs__FieldToOrderBy__c__is_set = true;
  }
  
  /**
   * element  : dlrs__LookupRollupSummaryScheduleQueues__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__LookupRollupSummaryScheduleQueues__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__LookupRollupSummaryScheduleQueues__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean dlrs__LookupRollupSummaryScheduleQueues__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult dlrs__LookupRollupSummaryScheduleQueues__r;

  public com.sforce.soap.enterprise.QueryResult getDlrs__LookupRollupSummaryScheduleQueues__r() {
    return dlrs__LookupRollupSummaryScheduleQueues__r;
  }

  

  public void setDlrs__LookupRollupSummaryScheduleQueues__r(com.sforce.soap.enterprise.QueryResult dlrs__LookupRollupSummaryScheduleQueues__r) {
    this.dlrs__LookupRollupSummaryScheduleQueues__r = dlrs__LookupRollupSummaryScheduleQueues__r;
    dlrs__LookupRollupSummaryScheduleQueues__r__is_set = true;
  }
  
  /**
   * element  : dlrs__ParentObject__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__ParentObject__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__ParentObject__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__ParentObject__c__is_set = false;

  private java.lang.String dlrs__ParentObject__c;

  public java.lang.String getDlrs__ParentObject__c() {
    return dlrs__ParentObject__c;
  }

  

  public void setDlrs__ParentObject__c(java.lang.String dlrs__ParentObject__c) {
    this.dlrs__ParentObject__c = dlrs__ParentObject__c;
    dlrs__ParentObject__c__is_set = true;
  }
  
  /**
   * element  : dlrs__RelationshipCriteriaFields__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__RelationshipCriteriaFields__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__RelationshipCriteriaFields__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__RelationshipCriteriaFields__c__is_set = false;

  private java.lang.String dlrs__RelationshipCriteriaFields__c;

  public java.lang.String getDlrs__RelationshipCriteriaFields__c() {
    return dlrs__RelationshipCriteriaFields__c;
  }

  

  public void setDlrs__RelationshipCriteriaFields__c(java.lang.String dlrs__RelationshipCriteriaFields__c) {
    this.dlrs__RelationshipCriteriaFields__c = dlrs__RelationshipCriteriaFields__c;
    dlrs__RelationshipCriteriaFields__c__is_set = true;
  }
  
  /**
   * element  : dlrs__RelationshipCriteria__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__RelationshipCriteria__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__RelationshipCriteria__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__RelationshipCriteria__c__is_set = false;

  private java.lang.String dlrs__RelationshipCriteria__c;

  public java.lang.String getDlrs__RelationshipCriteria__c() {
    return dlrs__RelationshipCriteria__c;
  }

  

  public void setDlrs__RelationshipCriteria__c(java.lang.String dlrs__RelationshipCriteria__c) {
    this.dlrs__RelationshipCriteria__c = dlrs__RelationshipCriteria__c;
    dlrs__RelationshipCriteria__c__is_set = true;
  }
  
  /**
   * element  : dlrs__RelationshipField__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__RelationshipField__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__RelationshipField__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__RelationshipField__c__is_set = false;

  private java.lang.String dlrs__RelationshipField__c;

  public java.lang.String getDlrs__RelationshipField__c() {
    return dlrs__RelationshipField__c;
  }

  

  public void setDlrs__RelationshipField__c(java.lang.String dlrs__RelationshipField__c) {
    this.dlrs__RelationshipField__c = dlrs__RelationshipField__c;
    dlrs__RelationshipField__c__is_set = true;
  }
  
  /**
   * element  : dlrs__TestCodeSeeAllData__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__TestCodeSeeAllData__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__TestCodeSeeAllData__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean dlrs__TestCodeSeeAllData__c__is_set = false;

  private java.lang.Boolean dlrs__TestCodeSeeAllData__c;

  public java.lang.Boolean getDlrs__TestCodeSeeAllData__c() {
    return dlrs__TestCodeSeeAllData__c;
  }

  

  public void setDlrs__TestCodeSeeAllData__c(java.lang.Boolean dlrs__TestCodeSeeAllData__c) {
    this.dlrs__TestCodeSeeAllData__c = dlrs__TestCodeSeeAllData__c;
    dlrs__TestCodeSeeAllData__c__is_set = true;
  }
  
  /**
   * element  : dlrs__TestCode__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__TestCode__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__TestCode__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__TestCode__c__is_set = false;

  private java.lang.String dlrs__TestCode__c;

  public java.lang.String getDlrs__TestCode__c() {
    return dlrs__TestCode__c;
  }

  

  public void setDlrs__TestCode__c(java.lang.String dlrs__TestCode__c) {
    this.dlrs__TestCode__c = dlrs__TestCode__c;
    dlrs__TestCode__c__is_set = true;
  }
  
  /**
   * element  : dlrs__UniqueName__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dlrs__UniqueName__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dlrs__UniqueName__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dlrs__UniqueName__c__is_set = false;

  private java.lang.String dlrs__UniqueName__c;

  public java.lang.String getDlrs__UniqueName__c() {
    return dlrs__UniqueName__c;
  }

  

  public void setDlrs__UniqueName__c(java.lang.String dlrs__UniqueName__c) {
    this.dlrs__UniqueName__c = dlrs__UniqueName__c;
    dlrs__UniqueName__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "dlrs__LookupRollupSummary__c");
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
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
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
    __typeMapper.writeObject(__out, dlrs__Active__c__typeInfo, dlrs__Active__c, dlrs__Active__c__is_set);
    __typeMapper.writeString(__out, dlrs__AggregateOperation__c__typeInfo, dlrs__AggregateOperation__c, dlrs__AggregateOperation__c__is_set);
    __typeMapper.writeString(__out, dlrs__AggregateResultField__c__typeInfo, dlrs__AggregateResultField__c, dlrs__AggregateResultField__c__is_set);
    __typeMapper.writeString(__out, dlrs__CalculateJobId__c__typeInfo, dlrs__CalculateJobId__c, dlrs__CalculateJobId__c__is_set);
    __typeMapper.writeString(__out, dlrs__CalculationMode__c__typeInfo, dlrs__CalculationMode__c, dlrs__CalculationMode__c__is_set);
    __typeMapper.writeString(__out, dlrs__CalculationSharingMode__c__typeInfo, dlrs__CalculationSharingMode__c, dlrs__CalculationSharingMode__c__is_set);
    __typeMapper.writeString(__out, dlrs__ChildObject__c__typeInfo, dlrs__ChildObject__c, dlrs__ChildObject__c__is_set);
    __typeMapper.writeString(__out, dlrs__ConcatenateDelimiter__c__typeInfo, dlrs__ConcatenateDelimiter__c, dlrs__ConcatenateDelimiter__c__is_set);
    __typeMapper.writeString(__out, dlrs__Description__c__typeInfo, dlrs__Description__c, dlrs__Description__c__is_set);
    __typeMapper.writeString(__out, dlrs__FieldToAggregate__c__typeInfo, dlrs__FieldToAggregate__c, dlrs__FieldToAggregate__c__is_set);
    __typeMapper.writeString(__out, dlrs__FieldToOrderBy__c__typeInfo, dlrs__FieldToOrderBy__c, dlrs__FieldToOrderBy__c__is_set);
    __typeMapper.writeObject(__out, dlrs__LookupRollupSummaryScheduleQueues__r__typeInfo, dlrs__LookupRollupSummaryScheduleQueues__r, dlrs__LookupRollupSummaryScheduleQueues__r__is_set);
    __typeMapper.writeString(__out, dlrs__ParentObject__c__typeInfo, dlrs__ParentObject__c, dlrs__ParentObject__c__is_set);
    __typeMapper.writeString(__out, dlrs__RelationshipCriteriaFields__c__typeInfo, dlrs__RelationshipCriteriaFields__c, dlrs__RelationshipCriteriaFields__c__is_set);
    __typeMapper.writeString(__out, dlrs__RelationshipCriteria__c__typeInfo, dlrs__RelationshipCriteria__c, dlrs__RelationshipCriteria__c__is_set);
    __typeMapper.writeString(__out, dlrs__RelationshipField__c__typeInfo, dlrs__RelationshipField__c, dlrs__RelationshipField__c__is_set);
    __typeMapper.writeObject(__out, dlrs__TestCodeSeeAllData__c__typeInfo, dlrs__TestCodeSeeAllData__c, dlrs__TestCodeSeeAllData__c__is_set);
    __typeMapper.writeString(__out, dlrs__TestCode__c__typeInfo, dlrs__TestCode__c, dlrs__TestCode__c__is_set);
    __typeMapper.writeString(__out, dlrs__UniqueName__c__typeInfo, dlrs__UniqueName__c, dlrs__UniqueName__c__is_set);
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
    if (__typeMapper.isElement(__in, LastReferencedDate__typeInfo)) {
      setLastReferencedDate((java.util.Calendar)__typeMapper.readObject(__in, LastReferencedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastViewedDate__typeInfo)) {
      setLastViewedDate((java.util.Calendar)__typeMapper.readObject(__in, LastViewedDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, dlrs__Active__c__typeInfo)) {
      setDlrs__Active__c((java.lang.Boolean)__typeMapper.readObject(__in, dlrs__Active__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__AggregateOperation__c__typeInfo)) {
      setDlrs__AggregateOperation__c((java.lang.String)__typeMapper.readString(__in, dlrs__AggregateOperation__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__AggregateResultField__c__typeInfo)) {
      setDlrs__AggregateResultField__c((java.lang.String)__typeMapper.readString(__in, dlrs__AggregateResultField__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__CalculateJobId__c__typeInfo)) {
      setDlrs__CalculateJobId__c((java.lang.String)__typeMapper.readString(__in, dlrs__CalculateJobId__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__CalculationMode__c__typeInfo)) {
      setDlrs__CalculationMode__c((java.lang.String)__typeMapper.readString(__in, dlrs__CalculationMode__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__CalculationSharingMode__c__typeInfo)) {
      setDlrs__CalculationSharingMode__c((java.lang.String)__typeMapper.readString(__in, dlrs__CalculationSharingMode__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__ChildObject__c__typeInfo)) {
      setDlrs__ChildObject__c((java.lang.String)__typeMapper.readString(__in, dlrs__ChildObject__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__ConcatenateDelimiter__c__typeInfo)) {
      setDlrs__ConcatenateDelimiter__c((java.lang.String)__typeMapper.readString(__in, dlrs__ConcatenateDelimiter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__Description__c__typeInfo)) {
      setDlrs__Description__c((java.lang.String)__typeMapper.readString(__in, dlrs__Description__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__FieldToAggregate__c__typeInfo)) {
      setDlrs__FieldToAggregate__c((java.lang.String)__typeMapper.readString(__in, dlrs__FieldToAggregate__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__FieldToOrderBy__c__typeInfo)) {
      setDlrs__FieldToOrderBy__c((java.lang.String)__typeMapper.readString(__in, dlrs__FieldToOrderBy__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__LookupRollupSummaryScheduleQueues__r__typeInfo)) {
      setDlrs__LookupRollupSummaryScheduleQueues__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, dlrs__LookupRollupSummaryScheduleQueues__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__ParentObject__c__typeInfo)) {
      setDlrs__ParentObject__c((java.lang.String)__typeMapper.readString(__in, dlrs__ParentObject__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__RelationshipCriteriaFields__c__typeInfo)) {
      setDlrs__RelationshipCriteriaFields__c((java.lang.String)__typeMapper.readString(__in, dlrs__RelationshipCriteriaFields__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__RelationshipCriteria__c__typeInfo)) {
      setDlrs__RelationshipCriteria__c((java.lang.String)__typeMapper.readString(__in, dlrs__RelationshipCriteria__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__RelationshipField__c__typeInfo)) {
      setDlrs__RelationshipField__c((java.lang.String)__typeMapper.readString(__in, dlrs__RelationshipField__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__TestCodeSeeAllData__c__typeInfo)) {
      setDlrs__TestCodeSeeAllData__c((java.lang.Boolean)__typeMapper.readObject(__in, dlrs__TestCodeSeeAllData__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__TestCode__c__typeInfo)) {
      setDlrs__TestCode__c((java.lang.String)__typeMapper.readString(__in, dlrs__TestCode__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dlrs__UniqueName__c__typeInfo)) {
      setDlrs__UniqueName__c((java.lang.String)__typeMapper.readString(__in, dlrs__UniqueName__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Dlrs__LookupRollupSummary__c ");
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
    sb.append(" LastReferencedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
    sb.append(" LastViewedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
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
    sb.append(" dlrs__Active__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__Active__c)+"'\n");
    sb.append(" dlrs__AggregateOperation__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__AggregateOperation__c)+"'\n");
    sb.append(" dlrs__AggregateResultField__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__AggregateResultField__c)+"'\n");
    sb.append(" dlrs__CalculateJobId__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__CalculateJobId__c)+"'\n");
    sb.append(" dlrs__CalculationMode__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__CalculationMode__c)+"'\n");
    sb.append(" dlrs__CalculationSharingMode__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__CalculationSharingMode__c)+"'\n");
    sb.append(" dlrs__ChildObject__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__ChildObject__c)+"'\n");
    sb.append(" dlrs__ConcatenateDelimiter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__ConcatenateDelimiter__c)+"'\n");
    sb.append(" dlrs__Description__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__Description__c)+"'\n");
    sb.append(" dlrs__FieldToAggregate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__FieldToAggregate__c)+"'\n");
    sb.append(" dlrs__FieldToOrderBy__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__FieldToOrderBy__c)+"'\n");
    sb.append(" dlrs__LookupRollupSummaryScheduleQueues__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__LookupRollupSummaryScheduleQueues__r)+"'\n");
    sb.append(" dlrs__ParentObject__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__ParentObject__c)+"'\n");
    sb.append(" dlrs__RelationshipCriteriaFields__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__RelationshipCriteriaFields__c)+"'\n");
    sb.append(" dlrs__RelationshipCriteria__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__RelationshipCriteria__c)+"'\n");
    sb.append(" dlrs__RelationshipField__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__RelationshipField__c)+"'\n");
    sb.append(" dlrs__TestCodeSeeAllData__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__TestCodeSeeAllData__c)+"'\n");
    sb.append(" dlrs__TestCode__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__TestCode__c)+"'\n");
    sb.append(" dlrs__UniqueName__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dlrs__UniqueName__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}