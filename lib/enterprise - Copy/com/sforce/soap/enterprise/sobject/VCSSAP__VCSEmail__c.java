package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class VCSSAP__VCSEmail__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public VCSSAP__VCSEmail__c() {
  }
    
  
  /**
   * element  : ActivityHistories of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ActivityHistories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityHistories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ActivityHistories__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ActivityHistories;

  public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
    return ActivityHistories;
  }

  

  public void setActivityHistories(com.sforce.soap.enterprise.QueryResult ActivityHistories) {
    this.ActivityHistories = ActivityHistories;
    ActivityHistories__is_set = true;
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
   * element  : Events of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Events__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Events","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Events__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Events;

  public com.sforce.soap.enterprise.QueryResult getEvents() {
    return Events;
  }

  

  public void setEvents(com.sforce.soap.enterprise.QueryResult Events) {
    this.Events = Events;
    Events__is_set = true;
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
   * element  : Histories of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Histories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Histories","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Histories__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Histories;

  public com.sforce.soap.enterprise.QueryResult getHistories() {
    return Histories;
  }

  

  public void setHistories(com.sforce.soap.enterprise.QueryResult Histories) {
    this.Histories = Histories;
    Histories__is_set = true;
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
   * element  : LastActivityDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastActivityDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastActivityDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean LastActivityDate__is_set = false;

  private java.util.Calendar LastActivityDate;

  public java.util.Calendar getLastActivityDate() {
    return LastActivityDate;
  }

  

  public void setLastActivityDate(java.util.Calendar LastActivityDate) {
    this.LastActivityDate = LastActivityDate;
    LastActivityDate__is_set = true;
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
   * element  : OpenActivities of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpenActivities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpenActivities","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpenActivities__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpenActivities;

  public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
    return OpenActivities;
  }

  

  public void setOpenActivities(com.sforce.soap.enterprise.QueryResult OpenActivities) {
    this.OpenActivities = OpenActivities;
    OpenActivities__is_set = true;
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
   * element  : Tasks of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Tasks__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tasks","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Tasks__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Tasks;

  public com.sforce.soap.enterprise.QueryResult getTasks() {
    return Tasks;
  }

  

  public void setTasks(com.sforce.soap.enterprise.QueryResult Tasks) {
    this.Tasks = Tasks;
    Tasks__is_set = true;
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
   * element  : VCSSAP__Account__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Account__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Account__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean VCSSAP__Account__c__is_set = false;

  private java.lang.String VCSSAP__Account__c;

  public java.lang.String getVCSSAP__Account__c() {
    return VCSSAP__Account__c;
  }

  

  public void setVCSSAP__Account__c(java.lang.String VCSSAP__Account__c) {
    this.VCSSAP__Account__c = VCSSAP__Account__c;
    VCSSAP__Account__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Account__r of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Account__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Account__r","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean VCSSAP__Account__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account VCSSAP__Account__r;

  public com.sforce.soap.enterprise.sobject.Account getVCSSAP__Account__r() {
    return VCSSAP__Account__r;
  }

  

  public void setVCSSAP__Account__r(com.sforce.soap.enterprise.sobject.Account VCSSAP__Account__r) {
    this.VCSSAP__Account__r = VCSSAP__Account__r;
    VCSSAP__Account__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Bcc__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Bcc__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Bcc__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Bcc__c__is_set = false;

  private java.lang.String VCSSAP__Bcc__c;

  public java.lang.String getVCSSAP__Bcc__c() {
    return VCSSAP__Bcc__c;
  }

  

  public void setVCSSAP__Bcc__c(java.lang.String VCSSAP__Bcc__c) {
    this.VCSSAP__Bcc__c = VCSSAP__Bcc__c;
    VCSSAP__Bcc__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Case__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Case__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Case__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean VCSSAP__Case__c__is_set = false;

  private java.lang.String VCSSAP__Case__c;

  public java.lang.String getVCSSAP__Case__c() {
    return VCSSAP__Case__c;
  }

  

  public void setVCSSAP__Case__c(java.lang.String VCSSAP__Case__c) {
    this.VCSSAP__Case__c = VCSSAP__Case__c;
    VCSSAP__Case__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Case__r of type {urn:sobject.enterprise.soap.sforce.com}Case
   * java type: com.sforce.soap.enterprise.sobject.Case
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Case__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Case__r","urn:sobject.enterprise.soap.sforce.com","Case",0,1,true);

  private boolean VCSSAP__Case__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Case VCSSAP__Case__r;

  public com.sforce.soap.enterprise.sobject.Case getVCSSAP__Case__r() {
    return VCSSAP__Case__r;
  }

  

  public void setVCSSAP__Case__r(com.sforce.soap.enterprise.sobject.Case VCSSAP__Case__r) {
    this.VCSSAP__Case__r = VCSSAP__Case__r;
    VCSSAP__Case__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Cc__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Cc__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Cc__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Cc__c__is_set = false;

  private java.lang.String VCSSAP__Cc__c;

  public java.lang.String getVCSSAP__Cc__c() {
    return VCSSAP__Cc__c;
  }

  

  public void setVCSSAP__Cc__c(java.lang.String VCSSAP__Cc__c) {
    this.VCSSAP__Cc__c = VCSSAP__Cc__c;
    VCSSAP__Cc__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Contact__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Contact__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean VCSSAP__Contact__c__is_set = false;

  private java.lang.String VCSSAP__Contact__c;

  public java.lang.String getVCSSAP__Contact__c() {
    return VCSSAP__Contact__c;
  }

  

  public void setVCSSAP__Contact__c(java.lang.String VCSSAP__Contact__c) {
    this.VCSSAP__Contact__c = VCSSAP__Contact__c;
    VCSSAP__Contact__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Contact__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Contact__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Contact__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean VCSSAP__Contact__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact VCSSAP__Contact__r;

  public com.sforce.soap.enterprise.sobject.Contact getVCSSAP__Contact__r() {
    return VCSSAP__Contact__r;
  }

  

  public void setVCSSAP__Contact__r(com.sforce.soap.enterprise.sobject.Contact VCSSAP__Contact__r) {
    this.VCSSAP__Contact__r = VCSSAP__Contact__r;
    VCSSAP__Contact__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Date__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Date__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean VCSSAP__Date__c__is_set = false;

  private java.util.Calendar VCSSAP__Date__c;

  public java.util.Calendar getVCSSAP__Date__c() {
    return VCSSAP__Date__c;
  }

  

  public void setVCSSAP__Date__c(java.util.Calendar VCSSAP__Date__c) {
    this.VCSSAP__Date__c = VCSSAP__Date__c;
    VCSSAP__Date__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Domain__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Domain__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Domain__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Domain__c__is_set = false;

  private java.lang.String VCSSAP__Domain__c;

  public java.lang.String getVCSSAP__Domain__c() {
    return VCSSAP__Domain__c;
  }

  

  public void setVCSSAP__Domain__c(java.lang.String VCSSAP__Domain__c) {
    this.VCSSAP__Domain__c = VCSSAP__Domain__c;
    VCSSAP__Domain__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__EmailTemplate__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__EmailTemplate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__EmailTemplate__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__EmailTemplate__c__is_set = false;

  private java.lang.String VCSSAP__EmailTemplate__c;

  public java.lang.String getVCSSAP__EmailTemplate__c() {
    return VCSSAP__EmailTemplate__c;
  }

  

  public void setVCSSAP__EmailTemplate__c(java.lang.String VCSSAP__EmailTemplate__c) {
    this.VCSSAP__EmailTemplate__c = VCSSAP__EmailTemplate__c;
    VCSSAP__EmailTemplate__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Event__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Event__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Event__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Event__c__is_set = false;

  private java.lang.String VCSSAP__Event__c;

  public java.lang.String getVCSSAP__Event__c() {
    return VCSSAP__Event__c;
  }

  

  public void setVCSSAP__Event__c(java.lang.String VCSSAP__Event__c) {
    this.VCSSAP__Event__c = VCSSAP__Event__c;
    VCSSAP__Event__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__From_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__From_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__From_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__From_Name__c__is_set = false;

  private java.lang.String VCSSAP__From_Name__c;

  public java.lang.String getVCSSAP__From_Name__c() {
    return VCSSAP__From_Name__c;
  }

  

  public void setVCSSAP__From_Name__c(java.lang.String VCSSAP__From_Name__c) {
    this.VCSSAP__From_Name__c = VCSSAP__From_Name__c;
    VCSSAP__From_Name__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__From_SFDC_User__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__From_SFDC_User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__From_SFDC_User__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__From_SFDC_User__c__is_set = false;

  private java.lang.Boolean VCSSAP__From_SFDC_User__c;

  public java.lang.Boolean getVCSSAP__From_SFDC_User__c() {
    return VCSSAP__From_SFDC_User__c;
  }

  

  public void setVCSSAP__From_SFDC_User__c(java.lang.Boolean VCSSAP__From_SFDC_User__c) {
    this.VCSSAP__From_SFDC_User__c = VCSSAP__From_SFDC_User__c;
    VCSSAP__From_SFDC_User__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__From__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__From__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__From__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__From__c__is_set = false;

  private java.lang.String VCSSAP__From__c;

  public java.lang.String getVCSSAP__From__c() {
    return VCSSAP__From__c;
  }

  

  public void setVCSSAP__From__c(java.lang.String VCSSAP__From__c) {
    this.VCSSAP__From__c = VCSSAP__From__c;
    VCSSAP__From__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Has_Attachments__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Has_Attachments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Has_Attachments__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Has_Attachments__c__is_set = false;

  private java.lang.Boolean VCSSAP__Has_Attachments__c;

  public java.lang.Boolean getVCSSAP__Has_Attachments__c() {
    return VCSSAP__Has_Attachments__c;
  }

  

  public void setVCSSAP__Has_Attachments__c(java.lang.Boolean VCSSAP__Has_Attachments__c) {
    this.VCSSAP__Has_Attachments__c = VCSSAP__Has_Attachments__c;
    VCSSAP__Has_Attachments__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Html_Body__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Html_Body__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Html_Body__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Html_Body__c__is_set = false;

  private java.lang.String VCSSAP__Html_Body__c;

  public java.lang.String getVCSSAP__Html_Body__c() {
    return VCSSAP__Html_Body__c;
  }

  

  public void setVCSSAP__Html_Body__c(java.lang.String VCSSAP__Html_Body__c) {
    this.VCSSAP__Html_Body__c = VCSSAP__Html_Body__c;
    VCSSAP__Html_Body__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Incoming__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Incoming__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Incoming__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Incoming__c__is_set = false;

  private java.lang.Boolean VCSSAP__Incoming__c;

  public java.lang.Boolean getVCSSAP__Incoming__c() {
    return VCSSAP__Incoming__c;
  }

  

  public void setVCSSAP__Incoming__c(java.lang.Boolean VCSSAP__Incoming__c) {
    this.VCSSAP__Incoming__c = VCSSAP__Incoming__c;
    VCSSAP__Incoming__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Lead__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Lead__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Lead__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean VCSSAP__Lead__c__is_set = false;

  private java.lang.String VCSSAP__Lead__c;

  public java.lang.String getVCSSAP__Lead__c() {
    return VCSSAP__Lead__c;
  }

  

  public void setVCSSAP__Lead__c(java.lang.String VCSSAP__Lead__c) {
    this.VCSSAP__Lead__c = VCSSAP__Lead__c;
    VCSSAP__Lead__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Lead__r of type {urn:sobject.enterprise.soap.sforce.com}Lead
   * java type: com.sforce.soap.enterprise.sobject.Lead
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Lead__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Lead__r","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

  private boolean VCSSAP__Lead__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Lead VCSSAP__Lead__r;

  public com.sforce.soap.enterprise.sobject.Lead getVCSSAP__Lead__r() {
    return VCSSAP__Lead__r;
  }

  

  public void setVCSSAP__Lead__r(com.sforce.soap.enterprise.sobject.Lead VCSSAP__Lead__r) {
    this.VCSSAP__Lead__r = VCSSAP__Lead__r;
    VCSSAP__Lead__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Message_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Message_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Message_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Message_ID__c__is_set = false;

  private java.lang.String VCSSAP__Message_ID__c;

  public java.lang.String getVCSSAP__Message_ID__c() {
    return VCSSAP__Message_ID__c;
  }

  

  public void setVCSSAP__Message_ID__c(java.lang.String VCSSAP__Message_ID__c) {
    this.VCSSAP__Message_ID__c = VCSSAP__Message_ID__c;
    VCSSAP__Message_ID__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Opportunity__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Opportunity__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Opportunity__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean VCSSAP__Opportunity__c__is_set = false;

  private java.lang.String VCSSAP__Opportunity__c;

  public java.lang.String getVCSSAP__Opportunity__c() {
    return VCSSAP__Opportunity__c;
  }

  

  public void setVCSSAP__Opportunity__c(java.lang.String VCSSAP__Opportunity__c) {
    this.VCSSAP__Opportunity__c = VCSSAP__Opportunity__c;
    VCSSAP__Opportunity__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Opportunity__r of type {urn:sobject.enterprise.soap.sforce.com}Opportunity
   * java type: com.sforce.soap.enterprise.sobject.Opportunity
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Opportunity__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Opportunity__r","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true);

  private boolean VCSSAP__Opportunity__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Opportunity VCSSAP__Opportunity__r;

  public com.sforce.soap.enterprise.sobject.Opportunity getVCSSAP__Opportunity__r() {
    return VCSSAP__Opportunity__r;
  }

  

  public void setVCSSAP__Opportunity__r(com.sforce.soap.enterprise.sobject.Opportunity VCSSAP__Opportunity__r) {
    this.VCSSAP__Opportunity__r = VCSSAP__Opportunity__r;
    VCSSAP__Opportunity__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Read__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Read__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Read__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Read__c__is_set = false;

  private java.lang.Boolean VCSSAP__Read__c;

  public java.lang.Boolean getVCSSAP__Read__c() {
    return VCSSAP__Read__c;
  }

  

  public void setVCSSAP__Read__c(java.lang.Boolean VCSSAP__Read__c) {
    this.VCSSAP__Read__c = VCSSAP__Read__c;
    VCSSAP__Read__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__RepliedBy__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__RepliedBy__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__RepliedBy__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean VCSSAP__RepliedBy__c__is_set = false;

  private java.lang.String VCSSAP__RepliedBy__c;

  public java.lang.String getVCSSAP__RepliedBy__c() {
    return VCSSAP__RepliedBy__c;
  }

  

  public void setVCSSAP__RepliedBy__c(java.lang.String VCSSAP__RepliedBy__c) {
    this.VCSSAP__RepliedBy__c = VCSSAP__RepliedBy__c;
    VCSSAP__RepliedBy__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__RepliedBy__r of type {urn:sobject.enterprise.soap.sforce.com}VCSSAP__VCSEmail__c
   * java type: com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__RepliedBy__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__RepliedBy__r","urn:sobject.enterprise.soap.sforce.com","VCSSAP__VCSEmail__c",0,1,true);

  private boolean VCSSAP__RepliedBy__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c VCSSAP__RepliedBy__r;

  public com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c getVCSSAP__RepliedBy__r() {
    return VCSSAP__RepliedBy__r;
  }

  

  public void setVCSSAP__RepliedBy__r(com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c VCSSAP__RepliedBy__r) {
    this.VCSSAP__RepliedBy__r = VCSSAP__RepliedBy__r;
    VCSSAP__RepliedBy__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__RepliesTo__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__RepliesTo__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__RepliesTo__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean VCSSAP__RepliesTo__c__is_set = false;

  private java.lang.String VCSSAP__RepliesTo__c;

  public java.lang.String getVCSSAP__RepliesTo__c() {
    return VCSSAP__RepliesTo__c;
  }

  

  public void setVCSSAP__RepliesTo__c(java.lang.String VCSSAP__RepliesTo__c) {
    this.VCSSAP__RepliesTo__c = VCSSAP__RepliesTo__c;
    VCSSAP__RepliesTo__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__RepliesTo__r of type {urn:sobject.enterprise.soap.sforce.com}VCSSAP__VCSEmail__c
   * java type: com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__RepliesTo__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__RepliesTo__r","urn:sobject.enterprise.soap.sforce.com","VCSSAP__VCSEmail__c",0,1,true);

  private boolean VCSSAP__RepliesTo__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c VCSSAP__RepliesTo__r;

  public com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c getVCSSAP__RepliesTo__r() {
    return VCSSAP__RepliesTo__r;
  }

  

  public void setVCSSAP__RepliesTo__r(com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c VCSSAP__RepliesTo__r) {
    this.VCSSAP__RepliesTo__r = VCSSAP__RepliesTo__r;
    VCSSAP__RepliesTo__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Reply_To__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Reply_To__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Reply_To__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Reply_To__c__is_set = false;

  private java.lang.String VCSSAP__Reply_To__c;

  public java.lang.String getVCSSAP__Reply_To__c() {
    return VCSSAP__Reply_To__c;
  }

  

  public void setVCSSAP__Reply_To__c(java.lang.String VCSSAP__Reply_To__c) {
    this.VCSSAP__Reply_To__c = VCSSAP__Reply_To__c;
    VCSSAP__Reply_To__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__State__c__is_set = false;

  private java.lang.String VCSSAP__State__c;

  public java.lang.String getVCSSAP__State__c() {
    return VCSSAP__State__c;
  }

  

  public void setVCSSAP__State__c(java.lang.String VCSSAP__State__c) {
    this.VCSSAP__State__c = VCSSAP__State__c;
    VCSSAP__State__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Subject__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Subject__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Subject__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Subject__c__is_set = false;

  private java.lang.String VCSSAP__Subject__c;

  public java.lang.String getVCSSAP__Subject__c() {
    return VCSSAP__Subject__c;
  }

  

  public void setVCSSAP__Subject__c(java.lang.String VCSSAP__Subject__c) {
    this.VCSSAP__Subject__c = VCSSAP__Subject__c;
    VCSSAP__Subject__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Tags__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Tags__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Tags__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Tags__c__is_set = false;

  private java.lang.String VCSSAP__Tags__c;

  public java.lang.String getVCSSAP__Tags__c() {
    return VCSSAP__Tags__c;
  }

  

  public void setVCSSAP__Tags__c(java.lang.String VCSSAP__Tags__c) {
    this.VCSSAP__Tags__c = VCSSAP__Tags__c;
    VCSSAP__Tags__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Task__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Task__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Task__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Task__c__is_set = false;

  private java.lang.String VCSSAP__Task__c;

  public java.lang.String getVCSSAP__Task__c() {
    return VCSSAP__Task__c;
  }

  

  public void setVCSSAP__Task__c(java.lang.String VCSSAP__Task__c) {
    this.VCSSAP__Task__c = VCSSAP__Task__c;
    VCSSAP__Task__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Text_Body__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Text_Body__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Text_Body__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Text_Body__c__is_set = false;

  private java.lang.String VCSSAP__Text_Body__c;

  public java.lang.String getVCSSAP__Text_Body__c() {
    return VCSSAP__Text_Body__c;
  }

  

  public void setVCSSAP__Text_Body__c(java.lang.String VCSSAP__Text_Body__c) {
    this.VCSSAP__Text_Body__c = VCSSAP__Text_Body__c;
    VCSSAP__Text_Body__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__To__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__To__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__To__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__To__c__is_set = false;

  private java.lang.String VCSSAP__To__c;

  public java.lang.String getVCSSAP__To__c() {
    return VCSSAP__To__c;
  }

  

  public void setVCSSAP__To__c(java.lang.String VCSSAP__To__c) {
    this.VCSSAP__To__c = VCSSAP__To__c;
    VCSSAP__To__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__VCSEmail__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__VCSEmail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__VCSEmail__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean VCSSAP__VCSEmail__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmail__r;

  public com.sforce.soap.enterprise.QueryResult getVCSSAP__VCSEmail__r() {
    return VCSSAP__VCSEmail__r;
  }

  

  public void setVCSSAP__VCSEmail__r(com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmail__r) {
    this.VCSSAP__VCSEmail__r = VCSSAP__VCSEmail__r;
    VCSSAP__VCSEmail__r__is_set = true;
  }
  
  /**
   * element  : VCSSAP__VCSEmails__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__VCSEmails__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__VCSEmails__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean VCSSAP__VCSEmails__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmails__r;

  public com.sforce.soap.enterprise.QueryResult getVCSSAP__VCSEmails__r() {
    return VCSSAP__VCSEmails__r;
  }

  

  public void setVCSSAP__VCSEmails__r(com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmails__r) {
    this.VCSSAP__VCSEmails__r = VCSSAP__VCSEmails__r;
    VCSSAP__VCSEmails__r__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "VCSSAP__VCSEmail__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
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
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeString(__out, VCSSAP__Account__c__typeInfo, VCSSAP__Account__c, VCSSAP__Account__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Account__r__typeInfo, VCSSAP__Account__r, VCSSAP__Account__r__is_set);
    __typeMapper.writeString(__out, VCSSAP__Bcc__c__typeInfo, VCSSAP__Bcc__c, VCSSAP__Bcc__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Case__c__typeInfo, VCSSAP__Case__c, VCSSAP__Case__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Case__r__typeInfo, VCSSAP__Case__r, VCSSAP__Case__r__is_set);
    __typeMapper.writeString(__out, VCSSAP__Cc__c__typeInfo, VCSSAP__Cc__c, VCSSAP__Cc__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Contact__c__typeInfo, VCSSAP__Contact__c, VCSSAP__Contact__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Contact__r__typeInfo, VCSSAP__Contact__r, VCSSAP__Contact__r__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Date__c__typeInfo, VCSSAP__Date__c, VCSSAP__Date__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Domain__c__typeInfo, VCSSAP__Domain__c, VCSSAP__Domain__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__EmailTemplate__c__typeInfo, VCSSAP__EmailTemplate__c, VCSSAP__EmailTemplate__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Event__c__typeInfo, VCSSAP__Event__c, VCSSAP__Event__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__From_Name__c__typeInfo, VCSSAP__From_Name__c, VCSSAP__From_Name__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__From_SFDC_User__c__typeInfo, VCSSAP__From_SFDC_User__c, VCSSAP__From_SFDC_User__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__From__c__typeInfo, VCSSAP__From__c, VCSSAP__From__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Has_Attachments__c__typeInfo, VCSSAP__Has_Attachments__c, VCSSAP__Has_Attachments__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Html_Body__c__typeInfo, VCSSAP__Html_Body__c, VCSSAP__Html_Body__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Incoming__c__typeInfo, VCSSAP__Incoming__c, VCSSAP__Incoming__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Lead__c__typeInfo, VCSSAP__Lead__c, VCSSAP__Lead__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Lead__r__typeInfo, VCSSAP__Lead__r, VCSSAP__Lead__r__is_set);
    __typeMapper.writeString(__out, VCSSAP__Message_ID__c__typeInfo, VCSSAP__Message_ID__c, VCSSAP__Message_ID__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Opportunity__c__typeInfo, VCSSAP__Opportunity__c, VCSSAP__Opportunity__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Opportunity__r__typeInfo, VCSSAP__Opportunity__r, VCSSAP__Opportunity__r__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Read__c__typeInfo, VCSSAP__Read__c, VCSSAP__Read__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__RepliedBy__c__typeInfo, VCSSAP__RepliedBy__c, VCSSAP__RepliedBy__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__RepliedBy__r__typeInfo, VCSSAP__RepliedBy__r, VCSSAP__RepliedBy__r__is_set);
    __typeMapper.writeString(__out, VCSSAP__RepliesTo__c__typeInfo, VCSSAP__RepliesTo__c, VCSSAP__RepliesTo__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__RepliesTo__r__typeInfo, VCSSAP__RepliesTo__r, VCSSAP__RepliesTo__r__is_set);
    __typeMapper.writeString(__out, VCSSAP__Reply_To__c__typeInfo, VCSSAP__Reply_To__c, VCSSAP__Reply_To__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__State__c__typeInfo, VCSSAP__State__c, VCSSAP__State__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Subject__c__typeInfo, VCSSAP__Subject__c, VCSSAP__Subject__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Tags__c__typeInfo, VCSSAP__Tags__c, VCSSAP__Tags__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Task__c__typeInfo, VCSSAP__Task__c, VCSSAP__Task__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Text_Body__c__typeInfo, VCSSAP__Text_Body__c, VCSSAP__Text_Body__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__To__c__typeInfo, VCSSAP__To__c, VCSSAP__To__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__VCSEmail__r__typeInfo, VCSSAP__VCSEmail__r, VCSSAP__VCSEmail__r__is_set);
    __typeMapper.writeObject(__out, VCSSAP__VCSEmails__r__typeInfo, VCSSAP__VCSEmails__r, VCSSAP__VCSEmails__r__is_set);
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
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Events__typeInfo)) {
      setEvents((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Events__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastActivityDate__typeInfo)) {
      setLastActivityDate((java.util.Calendar)__typeMapper.readObject(__in, LastActivityDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Tasks__typeInfo)) {
      setTasks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Tasks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, VCSSAP__Account__c__typeInfo)) {
      setVCSSAP__Account__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Account__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Account__r__typeInfo)) {
      setVCSSAP__Account__r((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, VCSSAP__Account__r__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Bcc__c__typeInfo)) {
      setVCSSAP__Bcc__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Bcc__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Case__c__typeInfo)) {
      setVCSSAP__Case__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Case__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Case__r__typeInfo)) {
      setVCSSAP__Case__r((com.sforce.soap.enterprise.sobject.Case)__typeMapper.readObject(__in, VCSSAP__Case__r__typeInfo, com.sforce.soap.enterprise.sobject.Case.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Cc__c__typeInfo)) {
      setVCSSAP__Cc__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Cc__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Contact__c__typeInfo)) {
      setVCSSAP__Contact__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Contact__r__typeInfo)) {
      setVCSSAP__Contact__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, VCSSAP__Contact__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Date__c__typeInfo)) {
      setVCSSAP__Date__c((java.util.Calendar)__typeMapper.readObject(__in, VCSSAP__Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Domain__c__typeInfo)) {
      setVCSSAP__Domain__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Domain__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__EmailTemplate__c__typeInfo)) {
      setVCSSAP__EmailTemplate__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__EmailTemplate__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Event__c__typeInfo)) {
      setVCSSAP__Event__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Event__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__From_Name__c__typeInfo)) {
      setVCSSAP__From_Name__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__From_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__From_SFDC_User__c__typeInfo)) {
      setVCSSAP__From_SFDC_User__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__From_SFDC_User__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__From__c__typeInfo)) {
      setVCSSAP__From__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__From__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Has_Attachments__c__typeInfo)) {
      setVCSSAP__Has_Attachments__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Has_Attachments__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Html_Body__c__typeInfo)) {
      setVCSSAP__Html_Body__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Html_Body__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Incoming__c__typeInfo)) {
      setVCSSAP__Incoming__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Incoming__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Lead__c__typeInfo)) {
      setVCSSAP__Lead__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Lead__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Lead__r__typeInfo)) {
      setVCSSAP__Lead__r((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, VCSSAP__Lead__r__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Message_ID__c__typeInfo)) {
      setVCSSAP__Message_ID__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Message_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Opportunity__c__typeInfo)) {
      setVCSSAP__Opportunity__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Opportunity__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Opportunity__r__typeInfo)) {
      setVCSSAP__Opportunity__r((com.sforce.soap.enterprise.sobject.Opportunity)__typeMapper.readObject(__in, VCSSAP__Opportunity__r__typeInfo, com.sforce.soap.enterprise.sobject.Opportunity.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Read__c__typeInfo)) {
      setVCSSAP__Read__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Read__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__RepliedBy__c__typeInfo)) {
      setVCSSAP__RepliedBy__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__RepliedBy__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__RepliedBy__r__typeInfo)) {
      setVCSSAP__RepliedBy__r((com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c)__typeMapper.readObject(__in, VCSSAP__RepliedBy__r__typeInfo, com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__RepliesTo__c__typeInfo)) {
      setVCSSAP__RepliesTo__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__RepliesTo__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__RepliesTo__r__typeInfo)) {
      setVCSSAP__RepliesTo__r((com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c)__typeMapper.readObject(__in, VCSSAP__RepliesTo__r__typeInfo, com.sforce.soap.enterprise.sobject.VCSSAP__VCSEmail__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Reply_To__c__typeInfo)) {
      setVCSSAP__Reply_To__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Reply_To__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__State__c__typeInfo)) {
      setVCSSAP__State__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Subject__c__typeInfo)) {
      setVCSSAP__Subject__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Subject__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Tags__c__typeInfo)) {
      setVCSSAP__Tags__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Tags__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Task__c__typeInfo)) {
      setVCSSAP__Task__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Task__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Text_Body__c__typeInfo)) {
      setVCSSAP__Text_Body__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Text_Body__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__To__c__typeInfo)) {
      setVCSSAP__To__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__To__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__VCSEmail__r__typeInfo)) {
      setVCSSAP__VCSEmail__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VCSSAP__VCSEmail__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__VCSEmails__r__typeInfo)) {
      setVCSSAP__VCSEmails__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VCSSAP__VCSEmails__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[VCSSAP__VCSEmail__c ");
    sb.append(super.toString());
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
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
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastActivityDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastActivityDate)+"'\n");
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
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
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
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" VCSSAP__Account__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Account__c)+"'\n");
    sb.append(" VCSSAP__Account__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Account__r)+"'\n");
    sb.append(" VCSSAP__Bcc__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Bcc__c)+"'\n");
    sb.append(" VCSSAP__Case__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Case__c)+"'\n");
    sb.append(" VCSSAP__Case__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Case__r)+"'\n");
    sb.append(" VCSSAP__Cc__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Cc__c)+"'\n");
    sb.append(" VCSSAP__Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Contact__c)+"'\n");
    sb.append(" VCSSAP__Contact__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Contact__r)+"'\n");
    sb.append(" VCSSAP__Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Date__c)+"'\n");
    sb.append(" VCSSAP__Domain__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Domain__c)+"'\n");
    sb.append(" VCSSAP__EmailTemplate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__EmailTemplate__c)+"'\n");
    sb.append(" VCSSAP__Event__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Event__c)+"'\n");
    sb.append(" VCSSAP__From_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__From_Name__c)+"'\n");
    sb.append(" VCSSAP__From_SFDC_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__From_SFDC_User__c)+"'\n");
    sb.append(" VCSSAP__From__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__From__c)+"'\n");
    sb.append(" VCSSAP__Has_Attachments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Has_Attachments__c)+"'\n");
    sb.append(" VCSSAP__Html_Body__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Html_Body__c)+"'\n");
    sb.append(" VCSSAP__Incoming__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Incoming__c)+"'\n");
    sb.append(" VCSSAP__Lead__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Lead__c)+"'\n");
    sb.append(" VCSSAP__Lead__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Lead__r)+"'\n");
    sb.append(" VCSSAP__Message_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Message_ID__c)+"'\n");
    sb.append(" VCSSAP__Opportunity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Opportunity__c)+"'\n");
    sb.append(" VCSSAP__Opportunity__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Opportunity__r)+"'\n");
    sb.append(" VCSSAP__Read__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Read__c)+"'\n");
    sb.append(" VCSSAP__RepliedBy__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__RepliedBy__c)+"'\n");
    sb.append(" VCSSAP__RepliedBy__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__RepliedBy__r)+"'\n");
    sb.append(" VCSSAP__RepliesTo__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__RepliesTo__c)+"'\n");
    sb.append(" VCSSAP__RepliesTo__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__RepliesTo__r)+"'\n");
    sb.append(" VCSSAP__Reply_To__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Reply_To__c)+"'\n");
    sb.append(" VCSSAP__State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__State__c)+"'\n");
    sb.append(" VCSSAP__Subject__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Subject__c)+"'\n");
    sb.append(" VCSSAP__Tags__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Tags__c)+"'\n");
    sb.append(" VCSSAP__Task__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Task__c)+"'\n");
    sb.append(" VCSSAP__Text_Body__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Text_Body__c)+"'\n");
    sb.append(" VCSSAP__To__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__To__c)+"'\n");
    sb.append(" VCSSAP__VCSEmail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__VCSEmail__r)+"'\n");
    sb.append(" VCSSAP__VCSEmails__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__VCSEmails__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}