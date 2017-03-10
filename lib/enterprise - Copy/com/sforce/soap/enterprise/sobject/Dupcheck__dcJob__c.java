package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Dupcheck__dcJob__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Dupcheck__dcJob__c() {
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
   * element  : dupcheck__Duplicate_Check_Duplicates__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__Duplicate_Check_Duplicates__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__Duplicate_Check_Duplicates__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean dupcheck__Duplicate_Check_Duplicates__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Duplicates__r;

  public com.sforce.soap.enterprise.QueryResult getDupcheck__Duplicate_Check_Duplicates__r() {
    return dupcheck__Duplicate_Check_Duplicates__r;
  }

  

  public void setDupcheck__Duplicate_Check_Duplicates__r(com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Duplicates__r) {
    this.dupcheck__Duplicate_Check_Duplicates__r = dupcheck__Duplicate_Check_Duplicates__r;
    dupcheck__Duplicate_Check_Duplicates__r__is_set = true;
  }
  
  /**
   * element  : dupcheck__Duplicate_Check_Groups__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__Duplicate_Check_Groups__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__Duplicate_Check_Groups__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean dupcheck__Duplicate_Check_Groups__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Groups__r;

  public com.sforce.soap.enterprise.QueryResult getDupcheck__Duplicate_Check_Groups__r() {
    return dupcheck__Duplicate_Check_Groups__r;
  }

  

  public void setDupcheck__Duplicate_Check_Groups__r(com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Groups__r) {
    this.dupcheck__Duplicate_Check_Groups__r = dupcheck__Duplicate_Check_Groups__r;
    dupcheck__Duplicate_Check_Groups__r__is_set = true;
  }
  
  /**
   * element  : dupcheck__Duplicate_Check_Jobs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__Duplicate_Check_Jobs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__Duplicate_Check_Jobs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean dupcheck__Duplicate_Check_Jobs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Jobs__r;

  public com.sforce.soap.enterprise.QueryResult getDupcheck__Duplicate_Check_Jobs__r() {
    return dupcheck__Duplicate_Check_Jobs__r;
  }

  

  public void setDupcheck__Duplicate_Check_Jobs__r(com.sforce.soap.enterprise.QueryResult dupcheck__Duplicate_Check_Jobs__r) {
    this.dupcheck__Duplicate_Check_Jobs__r = dupcheck__Duplicate_Check_Jobs__r;
    dupcheck__Duplicate_Check_Jobs__r__is_set = true;
  }
  
  /**
   * element  : dupcheck__Ended__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__Ended__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__Ended__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean dupcheck__Ended__c__is_set = false;

  private java.util.Calendar dupcheck__Ended__c;

  public java.util.Calendar getDupcheck__Ended__c() {
    return dupcheck__Ended__c;
  }

  

  public void setDupcheck__Ended__c(java.util.Calendar dupcheck__Ended__c) {
    this.dupcheck__Ended__c = dupcheck__Ended__c;
    dupcheck__Ended__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__Started__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__Started__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__Started__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean dupcheck__Started__c__is_set = false;

  private java.util.Calendar dupcheck__Started__c;

  public java.util.Calendar getDupcheck__Started__c() {
    return dupcheck__Started__c;
  }

  

  public void setDupcheck__Started__c(java.util.Calendar dupcheck__Started__c) {
    this.dupcheck__Started__c = dupcheck__Started__c;
    dupcheck__Started__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__apex__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__apex__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__apex__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__apex__c__is_set = false;

  private java.lang.String dupcheck__apex__c;

  public java.lang.String getDupcheck__apex__c() {
    return dupcheck__apex__c;
  }

  

  public void setDupcheck__apex__c(java.lang.String dupcheck__apex__c) {
    this.dupcheck__apex__c = dupcheck__apex__c;
    dupcheck__apex__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__autoProcessConvertOwner__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__autoProcessConvertOwner__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__autoProcessConvertOwner__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__autoProcessConvertOwner__c__is_set = false;

  private java.lang.String dupcheck__autoProcessConvertOwner__c;

  public java.lang.String getDupcheck__autoProcessConvertOwner__c() {
    return dupcheck__autoProcessConvertOwner__c;
  }

  

  public void setDupcheck__autoProcessConvertOwner__c(java.lang.String dupcheck__autoProcessConvertOwner__c) {
    this.dupcheck__autoProcessConvertOwner__c = dupcheck__autoProcessConvertOwner__c;
    dupcheck__autoProcessConvertOwner__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__autoProcessConvertStatus__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__autoProcessConvertStatus__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__autoProcessConvertStatus__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__autoProcessConvertStatus__c__is_set = false;

  private java.lang.String dupcheck__autoProcessConvertStatus__c;

  public java.lang.String getDupcheck__autoProcessConvertStatus__c() {
    return dupcheck__autoProcessConvertStatus__c;
  }

  

  public void setDupcheck__autoProcessConvertStatus__c(java.lang.String dupcheck__autoProcessConvertStatus__c) {
    this.dupcheck__autoProcessConvertStatus__c = dupcheck__autoProcessConvertStatus__c;
    dupcheck__autoProcessConvertStatus__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__autoProcessThreshold__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__autoProcessThreshold__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__autoProcessThreshold__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean dupcheck__autoProcessThreshold__c__is_set = false;

  private java.lang.Double dupcheck__autoProcessThreshold__c;

  public java.lang.Double getDupcheck__autoProcessThreshold__c() {
    return dupcheck__autoProcessThreshold__c;
  }

  

  public void setDupcheck__autoProcessThreshold__c(java.lang.Double dupcheck__autoProcessThreshold__c) {
    this.dupcheck__autoProcessThreshold__c = dupcheck__autoProcessThreshold__c;
    dupcheck__autoProcessThreshold__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__autoProcessType__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__autoProcessType__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__autoProcessType__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__autoProcessType__c__is_set = false;

  private java.lang.String dupcheck__autoProcessType__c;

  public java.lang.String getDupcheck__autoProcessType__c() {
    return dupcheck__autoProcessType__c;
  }

  

  public void setDupcheck__autoProcessType__c(java.lang.String dupcheck__autoProcessType__c) {
    this.dupcheck__autoProcessType__c = dupcheck__autoProcessType__c;
    dupcheck__autoProcessType__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__avgScore__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__avgScore__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__avgScore__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean dupcheck__avgScore__c__is_set = false;

  private java.lang.Double dupcheck__avgScore__c;

  public java.lang.Double getDupcheck__avgScore__c() {
    return dupcheck__avgScore__c;
  }

  

  public void setDupcheck__avgScore__c(java.lang.Double dupcheck__avgScore__c) {
    this.dupcheck__avgScore__c = dupcheck__avgScore__c;
    dupcheck__avgScore__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__duplicateCount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__duplicateCount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__duplicateCount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean dupcheck__duplicateCount__c__is_set = false;

  private java.lang.Double dupcheck__duplicateCount__c;

  public java.lang.Double getDupcheck__duplicateCount__c() {
    return dupcheck__duplicateCount__c;
  }

  

  public void setDupcheck__duplicateCount__c(java.lang.Double dupcheck__duplicateCount__c) {
    this.dupcheck__duplicateCount__c = dupcheck__duplicateCount__c;
    dupcheck__duplicateCount__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__errorMessage__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__errorMessage__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__errorMessage__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__errorMessage__c__is_set = false;

  private java.lang.String dupcheck__errorMessage__c;

  public java.lang.String getDupcheck__errorMessage__c() {
    return dupcheck__errorMessage__c;
  }

  

  public void setDupcheck__errorMessage__c(java.lang.String dupcheck__errorMessage__c) {
    this.dupcheck__errorMessage__c = dupcheck__errorMessage__c;
    dupcheck__errorMessage__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__filter__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__filter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__filter__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__filter__c__is_set = false;

  private java.lang.String dupcheck__filter__c;

  public java.lang.String getDupcheck__filter__c() {
    return dupcheck__filter__c;
  }

  

  public void setDupcheck__filter__c(java.lang.String dupcheck__filter__c) {
    this.dupcheck__filter__c = dupcheck__filter__c;
    dupcheck__filter__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__groupCounter__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__groupCounter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__groupCounter__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean dupcheck__groupCounter__c__is_set = false;

  private java.lang.Double dupcheck__groupCounter__c;

  public java.lang.Double getDupcheck__groupCounter__c() {
    return dupcheck__groupCounter__c;
  }

  

  public void setDupcheck__groupCounter__c(java.lang.Double dupcheck__groupCounter__c) {
    this.dupcheck__groupCounter__c = dupcheck__groupCounter__c;
    dupcheck__groupCounter__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__lowScore__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__lowScore__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__lowScore__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean dupcheck__lowScore__c__is_set = false;

  private java.lang.Double dupcheck__lowScore__c;

  public java.lang.Double getDupcheck__lowScore__c() {
    return dupcheck__lowScore__c;
  }

  

  public void setDupcheck__lowScore__c(java.lang.Double dupcheck__lowScore__c) {
    this.dupcheck__lowScore__c = dupcheck__lowScore__c;
    dupcheck__lowScore__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__matchObject__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__matchObject__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__matchObject__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__matchObject__c__is_set = false;

  private java.lang.String dupcheck__matchObject__c;

  public java.lang.String getDupcheck__matchObject__c() {
    return dupcheck__matchObject__c;
  }

  

  public void setDupcheck__matchObject__c(java.lang.String dupcheck__matchObject__c) {
    this.dupcheck__matchObject__c = dupcheck__matchObject__c;
    dupcheck__matchObject__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__name__c__is_set = false;

  private java.lang.String dupcheck__name__c;

  public java.lang.String getDupcheck__name__c() {
    return dupcheck__name__c;
  }

  

  public void setDupcheck__name__c(java.lang.String dupcheck__name__c) {
    this.dupcheck__name__c = dupcheck__name__c;
    dupcheck__name__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__parent__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__parent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__parent__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean dupcheck__parent__c__is_set = false;

  private java.lang.String dupcheck__parent__c;

  public java.lang.String getDupcheck__parent__c() {
    return dupcheck__parent__c;
  }

  

  public void setDupcheck__parent__c(java.lang.String dupcheck__parent__c) {
    this.dupcheck__parent__c = dupcheck__parent__c;
    dupcheck__parent__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__parent__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__parent__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__parent__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean dupcheck__parent__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult dupcheck__parent__r;

  public com.sforce.soap.enterprise.QueryResult getDupcheck__parent__r() {
    return dupcheck__parent__r;
  }

  

  public void setDupcheck__parent__r(com.sforce.soap.enterprise.QueryResult dupcheck__parent__r) {
    this.dupcheck__parent__r = dupcheck__parent__r;
    dupcheck__parent__r__is_set = true;
  }
  
  /**
   * element  : dupcheck__scenario__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__scenario__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__scenario__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__scenario__c__is_set = false;

  private java.lang.String dupcheck__scenario__c;

  public java.lang.String getDupcheck__scenario__c() {
    return dupcheck__scenario__c;
  }

  

  public void setDupcheck__scenario__c(java.lang.String dupcheck__scenario__c) {
    this.dupcheck__scenario__c = dupcheck__scenario__c;
    dupcheck__scenario__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__schedule__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__schedule__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__schedule__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__schedule__c__is_set = false;

  private java.lang.String dupcheck__schedule__c;

  public java.lang.String getDupcheck__schedule__c() {
    return dupcheck__schedule__c;
  }

  

  public void setDupcheck__schedule__c(java.lang.String dupcheck__schedule__c) {
    this.dupcheck__schedule__c = dupcheck__schedule__c;
    dupcheck__schedule__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__sourceObject__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__sourceObject__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__sourceObject__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__sourceObject__c__is_set = false;

  private java.lang.String dupcheck__sourceObject__c;

  public java.lang.String getDupcheck__sourceObject__c() {
    return dupcheck__sourceObject__c;
  }

  

  public void setDupcheck__sourceObject__c(java.lang.String dupcheck__sourceObject__c) {
    this.dupcheck__sourceObject__c = dupcheck__sourceObject__c;
    dupcheck__sourceObject__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__status__c__is_set = false;

  private java.lang.String dupcheck__status__c;

  public java.lang.String getDupcheck__status__c() {
    return dupcheck__status__c;
  }

  

  public void setDupcheck__status__c(java.lang.String dupcheck__status__c) {
    this.dupcheck__status__c = dupcheck__status__c;
    dupcheck__status__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__sumScore__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__sumScore__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__sumScore__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean dupcheck__sumScore__c__is_set = false;

  private java.lang.Double dupcheck__sumScore__c;

  public java.lang.Double getDupcheck__sumScore__c() {
    return dupcheck__sumScore__c;
  }

  

  public void setDupcheck__sumScore__c(java.lang.Double dupcheck__sumScore__c) {
    this.dupcheck__sumScore__c = dupcheck__sumScore__c;
    dupcheck__sumScore__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__type__c__is_set = false;

  private java.lang.String dupcheck__type__c;

  public java.lang.String getDupcheck__type__c() {
    return dupcheck__type__c;
  }

  

  public void setDupcheck__type__c(java.lang.String dupcheck__type__c) {
    this.dupcheck__type__c = dupcheck__type__c;
    dupcheck__type__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "dupcheck__dcJob__c");
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
    __typeMapper.writeObject(__out, dupcheck__Duplicate_Check_Duplicates__r__typeInfo, dupcheck__Duplicate_Check_Duplicates__r, dupcheck__Duplicate_Check_Duplicates__r__is_set);
    __typeMapper.writeObject(__out, dupcheck__Duplicate_Check_Groups__r__typeInfo, dupcheck__Duplicate_Check_Groups__r, dupcheck__Duplicate_Check_Groups__r__is_set);
    __typeMapper.writeObject(__out, dupcheck__Duplicate_Check_Jobs__r__typeInfo, dupcheck__Duplicate_Check_Jobs__r, dupcheck__Duplicate_Check_Jobs__r__is_set);
    __typeMapper.writeObject(__out, dupcheck__Ended__c__typeInfo, dupcheck__Ended__c, dupcheck__Ended__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__Started__c__typeInfo, dupcheck__Started__c, dupcheck__Started__c__is_set);
    __typeMapper.writeString(__out, dupcheck__apex__c__typeInfo, dupcheck__apex__c, dupcheck__apex__c__is_set);
    __typeMapper.writeString(__out, dupcheck__autoProcessConvertOwner__c__typeInfo, dupcheck__autoProcessConvertOwner__c, dupcheck__autoProcessConvertOwner__c__is_set);
    __typeMapper.writeString(__out, dupcheck__autoProcessConvertStatus__c__typeInfo, dupcheck__autoProcessConvertStatus__c, dupcheck__autoProcessConvertStatus__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__autoProcessThreshold__c__typeInfo, dupcheck__autoProcessThreshold__c, dupcheck__autoProcessThreshold__c__is_set);
    __typeMapper.writeString(__out, dupcheck__autoProcessType__c__typeInfo, dupcheck__autoProcessType__c, dupcheck__autoProcessType__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__avgScore__c__typeInfo, dupcheck__avgScore__c, dupcheck__avgScore__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__duplicateCount__c__typeInfo, dupcheck__duplicateCount__c, dupcheck__duplicateCount__c__is_set);
    __typeMapper.writeString(__out, dupcheck__errorMessage__c__typeInfo, dupcheck__errorMessage__c, dupcheck__errorMessage__c__is_set);
    __typeMapper.writeString(__out, dupcheck__filter__c__typeInfo, dupcheck__filter__c, dupcheck__filter__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__groupCounter__c__typeInfo, dupcheck__groupCounter__c, dupcheck__groupCounter__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__lowScore__c__typeInfo, dupcheck__lowScore__c, dupcheck__lowScore__c__is_set);
    __typeMapper.writeString(__out, dupcheck__matchObject__c__typeInfo, dupcheck__matchObject__c, dupcheck__matchObject__c__is_set);
    __typeMapper.writeString(__out, dupcheck__name__c__typeInfo, dupcheck__name__c, dupcheck__name__c__is_set);
    __typeMapper.writeString(__out, dupcheck__parent__c__typeInfo, dupcheck__parent__c, dupcheck__parent__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__parent__r__typeInfo, dupcheck__parent__r, dupcheck__parent__r__is_set);
    __typeMapper.writeString(__out, dupcheck__scenario__c__typeInfo, dupcheck__scenario__c, dupcheck__scenario__c__is_set);
    __typeMapper.writeString(__out, dupcheck__schedule__c__typeInfo, dupcheck__schedule__c, dupcheck__schedule__c__is_set);
    __typeMapper.writeString(__out, dupcheck__sourceObject__c__typeInfo, dupcheck__sourceObject__c, dupcheck__sourceObject__c__is_set);
    __typeMapper.writeString(__out, dupcheck__status__c__typeInfo, dupcheck__status__c, dupcheck__status__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__sumScore__c__typeInfo, dupcheck__sumScore__c, dupcheck__sumScore__c__is_set);
    __typeMapper.writeString(__out, dupcheck__type__c__typeInfo, dupcheck__type__c, dupcheck__type__c__is_set);
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
    if (__typeMapper.isElement(__in, dupcheck__Duplicate_Check_Duplicates__r__typeInfo)) {
      setDupcheck__Duplicate_Check_Duplicates__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, dupcheck__Duplicate_Check_Duplicates__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__Duplicate_Check_Groups__r__typeInfo)) {
      setDupcheck__Duplicate_Check_Groups__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, dupcheck__Duplicate_Check_Groups__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__Duplicate_Check_Jobs__r__typeInfo)) {
      setDupcheck__Duplicate_Check_Jobs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, dupcheck__Duplicate_Check_Jobs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__Ended__c__typeInfo)) {
      setDupcheck__Ended__c((java.util.Calendar)__typeMapper.readObject(__in, dupcheck__Ended__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__Started__c__typeInfo)) {
      setDupcheck__Started__c((java.util.Calendar)__typeMapper.readObject(__in, dupcheck__Started__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__apex__c__typeInfo)) {
      setDupcheck__apex__c((java.lang.String)__typeMapper.readString(__in, dupcheck__apex__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__autoProcessConvertOwner__c__typeInfo)) {
      setDupcheck__autoProcessConvertOwner__c((java.lang.String)__typeMapper.readString(__in, dupcheck__autoProcessConvertOwner__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__autoProcessConvertStatus__c__typeInfo)) {
      setDupcheck__autoProcessConvertStatus__c((java.lang.String)__typeMapper.readString(__in, dupcheck__autoProcessConvertStatus__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__autoProcessThreshold__c__typeInfo)) {
      setDupcheck__autoProcessThreshold__c((java.lang.Double)__typeMapper.readObject(__in, dupcheck__autoProcessThreshold__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__autoProcessType__c__typeInfo)) {
      setDupcheck__autoProcessType__c((java.lang.String)__typeMapper.readString(__in, dupcheck__autoProcessType__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__avgScore__c__typeInfo)) {
      setDupcheck__avgScore__c((java.lang.Double)__typeMapper.readObject(__in, dupcheck__avgScore__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__duplicateCount__c__typeInfo)) {
      setDupcheck__duplicateCount__c((java.lang.Double)__typeMapper.readObject(__in, dupcheck__duplicateCount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__errorMessage__c__typeInfo)) {
      setDupcheck__errorMessage__c((java.lang.String)__typeMapper.readString(__in, dupcheck__errorMessage__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__filter__c__typeInfo)) {
      setDupcheck__filter__c((java.lang.String)__typeMapper.readString(__in, dupcheck__filter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__groupCounter__c__typeInfo)) {
      setDupcheck__groupCounter__c((java.lang.Double)__typeMapper.readObject(__in, dupcheck__groupCounter__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__lowScore__c__typeInfo)) {
      setDupcheck__lowScore__c((java.lang.Double)__typeMapper.readObject(__in, dupcheck__lowScore__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__matchObject__c__typeInfo)) {
      setDupcheck__matchObject__c((java.lang.String)__typeMapper.readString(__in, dupcheck__matchObject__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__name__c__typeInfo)) {
      setDupcheck__name__c((java.lang.String)__typeMapper.readString(__in, dupcheck__name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__parent__c__typeInfo)) {
      setDupcheck__parent__c((java.lang.String)__typeMapper.readString(__in, dupcheck__parent__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__parent__r__typeInfo)) {
      setDupcheck__parent__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, dupcheck__parent__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__scenario__c__typeInfo)) {
      setDupcheck__scenario__c((java.lang.String)__typeMapper.readString(__in, dupcheck__scenario__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__schedule__c__typeInfo)) {
      setDupcheck__schedule__c((java.lang.String)__typeMapper.readString(__in, dupcheck__schedule__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__sourceObject__c__typeInfo)) {
      setDupcheck__sourceObject__c((java.lang.String)__typeMapper.readString(__in, dupcheck__sourceObject__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__status__c__typeInfo)) {
      setDupcheck__status__c((java.lang.String)__typeMapper.readString(__in, dupcheck__status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__sumScore__c__typeInfo)) {
      setDupcheck__sumScore__c((java.lang.Double)__typeMapper.readObject(__in, dupcheck__sumScore__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__type__c__typeInfo)) {
      setDupcheck__type__c((java.lang.String)__typeMapper.readString(__in, dupcheck__type__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Dupcheck__dcJob__c ");
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
    sb.append(" dupcheck__Duplicate_Check_Duplicates__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__Duplicate_Check_Duplicates__r)+"'\n");
    sb.append(" dupcheck__Duplicate_Check_Groups__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__Duplicate_Check_Groups__r)+"'\n");
    sb.append(" dupcheck__Duplicate_Check_Jobs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__Duplicate_Check_Jobs__r)+"'\n");
    sb.append(" dupcheck__Ended__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__Ended__c)+"'\n");
    sb.append(" dupcheck__Started__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__Started__c)+"'\n");
    sb.append(" dupcheck__apex__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__apex__c)+"'\n");
    sb.append(" dupcheck__autoProcessConvertOwner__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__autoProcessConvertOwner__c)+"'\n");
    sb.append(" dupcheck__autoProcessConvertStatus__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__autoProcessConvertStatus__c)+"'\n");
    sb.append(" dupcheck__autoProcessThreshold__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__autoProcessThreshold__c)+"'\n");
    sb.append(" dupcheck__autoProcessType__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__autoProcessType__c)+"'\n");
    sb.append(" dupcheck__avgScore__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__avgScore__c)+"'\n");
    sb.append(" dupcheck__duplicateCount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__duplicateCount__c)+"'\n");
    sb.append(" dupcheck__errorMessage__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__errorMessage__c)+"'\n");
    sb.append(" dupcheck__filter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__filter__c)+"'\n");
    sb.append(" dupcheck__groupCounter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__groupCounter__c)+"'\n");
    sb.append(" dupcheck__lowScore__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__lowScore__c)+"'\n");
    sb.append(" dupcheck__matchObject__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__matchObject__c)+"'\n");
    sb.append(" dupcheck__name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__name__c)+"'\n");
    sb.append(" dupcheck__parent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__parent__c)+"'\n");
    sb.append(" dupcheck__parent__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__parent__r)+"'\n");
    sb.append(" dupcheck__scenario__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__scenario__c)+"'\n");
    sb.append(" dupcheck__schedule__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__schedule__c)+"'\n");
    sb.append(" dupcheck__sourceObject__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__sourceObject__c)+"'\n");
    sb.append(" dupcheck__status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__status__c)+"'\n");
    sb.append(" dupcheck__sumScore__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__sumScore__c)+"'\n");
    sb.append(" dupcheck__type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__type__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}