package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class VCSSAP__VCS_MailBox_Config__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public VCSSAP__VCS_MailBox_Config__c() {
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
   * element  : VCSSAP__Alert_new_emails__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Alert_new_emails__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Alert_new_emails__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Alert_new_emails__c__is_set = false;

  private java.lang.Boolean VCSSAP__Alert_new_emails__c;

  public java.lang.Boolean getVCSSAP__Alert_new_emails__c() {
    return VCSSAP__Alert_new_emails__c;
  }

  

  public void setVCSSAP__Alert_new_emails__c(java.lang.Boolean VCSSAP__Alert_new_emails__c) {
    this.VCSSAP__Alert_new_emails__c = VCSSAP__Alert_new_emails__c;
    VCSSAP__Alert_new_emails__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Auto_Create_Leads__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Auto_Create_Leads__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Auto_Create_Leads__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Auto_Create_Leads__c__is_set = false;

  private java.lang.Boolean VCSSAP__Auto_Create_Leads__c;

  public java.lang.Boolean getVCSSAP__Auto_Create_Leads__c() {
    return VCSSAP__Auto_Create_Leads__c;
  }

  

  public void setVCSSAP__Auto_Create_Leads__c(java.lang.Boolean VCSSAP__Auto_Create_Leads__c) {
    this.VCSSAP__Auto_Create_Leads__c = VCSSAP__Auto_Create_Leads__c;
    VCSSAP__Auto_Create_Leads__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Filter_rules__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Filter_rules__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Filter_rules__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Filter_rules__c__is_set = false;

  private java.lang.String VCSSAP__Filter_rules__c;

  public java.lang.String getVCSSAP__Filter_rules__c() {
    return VCSSAP__Filter_rules__c;
  }

  

  public void setVCSSAP__Filter_rules__c(java.lang.String VCSSAP__Filter_rules__c) {
    this.VCSSAP__Filter_rules__c = VCSSAP__Filter_rules__c;
    VCSSAP__Filter_rules__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__HideHelpPage__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__HideHelpPage__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__HideHelpPage__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__HideHelpPage__c__is_set = false;

  private java.lang.Boolean VCSSAP__HideHelpPage__c;

  public java.lang.Boolean getVCSSAP__HideHelpPage__c() {
    return VCSSAP__HideHelpPage__c;
  }

  

  public void setVCSSAP__HideHelpPage__c(java.lang.Boolean VCSSAP__HideHelpPage__c) {
    this.VCSSAP__HideHelpPage__c = VCSSAP__HideHelpPage__c;
    VCSSAP__HideHelpPage__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Inbox_autorefresh__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Inbox_autorefresh__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Inbox_autorefresh__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Inbox_autorefresh__c__is_set = false;

  private java.lang.Boolean VCSSAP__Inbox_autorefresh__c;

  public java.lang.Boolean getVCSSAP__Inbox_autorefresh__c() {
    return VCSSAP__Inbox_autorefresh__c;
  }

  

  public void setVCSSAP__Inbox_autorefresh__c(java.lang.Boolean VCSSAP__Inbox_autorefresh__c) {
    this.VCSSAP__Inbox_autorefresh__c = VCSSAP__Inbox_autorefresh__c;
    VCSSAP__Inbox_autorefresh__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Inbox_autorefresh_interval__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Inbox_autorefresh_interval__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Inbox_autorefresh_interval__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Inbox_autorefresh_interval__c__is_set = false;

  private java.lang.String VCSSAP__Inbox_autorefresh_interval__c;

  public java.lang.String getVCSSAP__Inbox_autorefresh_interval__c() {
    return VCSSAP__Inbox_autorefresh_interval__c;
  }

  

  public void setVCSSAP__Inbox_autorefresh_interval__c(java.lang.String VCSSAP__Inbox_autorefresh_interval__c) {
    this.VCSSAP__Inbox_autorefresh_interval__c = VCSSAP__Inbox_autorefresh_interval__c;
    VCSSAP__Inbox_autorefresh_interval__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Log_Outgoings_Email__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Log_Outgoings_Email__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Log_Outgoings_Email__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Log_Outgoings_Email__c__is_set = false;

  private java.lang.String VCSSAP__Log_Outgoings_Email__c;

  public java.lang.String getVCSSAP__Log_Outgoings_Email__c() {
    return VCSSAP__Log_Outgoings_Email__c;
  }

  

  public void setVCSSAP__Log_Outgoings_Email__c(java.lang.String VCSSAP__Log_Outgoings_Email__c) {
    this.VCSSAP__Log_Outgoings_Email__c = VCSSAP__Log_Outgoings_Email__c;
    VCSSAP__Log_Outgoings_Email__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Log_Outgoings__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Log_Outgoings__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Log_Outgoings__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Log_Outgoings__c__is_set = false;

  private java.lang.Boolean VCSSAP__Log_Outgoings__c;

  public java.lang.Boolean getVCSSAP__Log_Outgoings__c() {
    return VCSSAP__Log_Outgoings__c;
  }

  

  public void setVCSSAP__Log_Outgoings__c(java.lang.Boolean VCSSAP__Log_Outgoings__c) {
    this.VCSSAP__Log_Outgoings__c = VCSSAP__Log_Outgoings__c;
    VCSSAP__Log_Outgoings__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__New_Emails__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__New_Emails__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__New_Emails__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__New_Emails__c__is_set = false;

  private java.lang.Boolean VCSSAP__New_Emails__c;

  public java.lang.Boolean getVCSSAP__New_Emails__c() {
    return VCSSAP__New_Emails__c;
  }

  

  public void setVCSSAP__New_Emails__c(java.lang.Boolean VCSSAP__New_Emails__c) {
    this.VCSSAP__New_Emails__c = VCSSAP__New_Emails__c;
    VCSSAP__New_Emails__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Only_Match_Leads_Contacts__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Only_Match_Leads_Contacts__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Only_Match_Leads_Contacts__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Only_Match_Leads_Contacts__c__is_set = false;

  private java.lang.Boolean VCSSAP__Only_Match_Leads_Contacts__c;

  public java.lang.Boolean getVCSSAP__Only_Match_Leads_Contacts__c() {
    return VCSSAP__Only_Match_Leads_Contacts__c;
  }

  

  public void setVCSSAP__Only_Match_Leads_Contacts__c(java.lang.Boolean VCSSAP__Only_Match_Leads_Contacts__c) {
    this.VCSSAP__Only_Match_Leads_Contacts__c = VCSSAP__Only_Match_Leads_Contacts__c;
    VCSSAP__Only_Match_Leads_Contacts__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Page_size__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Page_size__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Page_size__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Page_size__c__is_set = false;

  private java.lang.String VCSSAP__Page_size__c;

  public java.lang.String getVCSSAP__Page_size__c() {
    return VCSSAP__Page_size__c;
  }

  

  public void setVCSSAP__Page_size__c(java.lang.String VCSSAP__Page_size__c) {
    this.VCSSAP__Page_size__c = VCSSAP__Page_size__c;
    VCSSAP__Page_size__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Quit_VCS_branding__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Quit_VCS_branding__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Quit_VCS_branding__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Quit_VCS_branding__c__is_set = false;

  private java.lang.Boolean VCSSAP__Quit_VCS_branding__c;

  public java.lang.Boolean getVCSSAP__Quit_VCS_branding__c() {
    return VCSSAP__Quit_VCS_branding__c;
  }

  

  public void setVCSSAP__Quit_VCS_branding__c(java.lang.Boolean VCSSAP__Quit_VCS_branding__c) {
    this.VCSSAP__Quit_VCS_branding__c = VCSSAP__Quit_VCS_branding__c;
    VCSSAP__Quit_VCS_branding__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Related_Hover_Links__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Related_Hover_Links__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Related_Hover_Links__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Related_Hover_Links__c__is_set = false;

  private java.lang.Boolean VCSSAP__Related_Hover_Links__c;

  public java.lang.Boolean getVCSSAP__Related_Hover_Links__c() {
    return VCSSAP__Related_Hover_Links__c;
  }

  

  public void setVCSSAP__Related_Hover_Links__c(java.lang.Boolean VCSSAP__Related_Hover_Links__c) {
    this.VCSSAP__Related_Hover_Links__c = VCSSAP__Related_Hover_Links__c;
    VCSSAP__Related_Hover_Links__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Save_all_as_Activity__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Save_all_as_Activity__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Save_all_as_Activity__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Save_all_as_Activity__c__is_set = false;

  private java.lang.Boolean VCSSAP__Save_all_as_Activity__c;

  public java.lang.Boolean getVCSSAP__Save_all_as_Activity__c() {
    return VCSSAP__Save_all_as_Activity__c;
  }

  

  public void setVCSSAP__Save_all_as_Activity__c(java.lang.Boolean VCSSAP__Save_all_as_Activity__c) {
    this.VCSSAP__Save_all_as_Activity__c = VCSSAP__Save_all_as_Activity__c;
    VCSSAP__Save_all_as_Activity__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Show_inbox_column__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Show_inbox_column__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Show_inbox_column__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Show_inbox_column__c__is_set = false;

  private java.lang.Boolean VCSSAP__Show_inbox_column__c;

  public java.lang.Boolean getVCSSAP__Show_inbox_column__c() {
    return VCSSAP__Show_inbox_column__c;
  }

  

  public void setVCSSAP__Show_inbox_column__c(java.lang.Boolean VCSSAP__Show_inbox_column__c) {
    this.VCSSAP__Show_inbox_column__c = VCSSAP__Show_inbox_column__c;
    VCSSAP__Show_inbox_column__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Signature_Above_Reply__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Signature_Above_Reply__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Signature_Above_Reply__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Signature_Above_Reply__c__is_set = false;

  private java.lang.Boolean VCSSAP__Signature_Above_Reply__c;

  public java.lang.Boolean getVCSSAP__Signature_Above_Reply__c() {
    return VCSSAP__Signature_Above_Reply__c;
  }

  

  public void setVCSSAP__Signature_Above_Reply__c(java.lang.Boolean VCSSAP__Signature_Above_Reply__c) {
    this.VCSSAP__Signature_Above_Reply__c = VCSSAP__Signature_Above_Reply__c;
    VCSSAP__Signature_Above_Reply__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Signature_Picture__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Signature_Picture__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Signature_Picture__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Signature_Picture__c__is_set = false;

  private java.lang.String VCSSAP__Signature_Picture__c;

  public java.lang.String getVCSSAP__Signature_Picture__c() {
    return VCSSAP__Signature_Picture__c;
  }

  

  public void setVCSSAP__Signature_Picture__c(java.lang.String VCSSAP__Signature_Picture__c) {
    this.VCSSAP__Signature_Picture__c = VCSSAP__Signature_Picture__c;
    VCSSAP__Signature_Picture__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Signature__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Signature__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Signature__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Signature__c__is_set = false;

  private java.lang.String VCSSAP__Signature__c;

  public java.lang.String getVCSSAP__Signature__c() {
    return VCSSAP__Signature__c;
  }

  

  public void setVCSSAP__Signature__c(java.lang.String VCSSAP__Signature__c) {
    this.VCSSAP__Signature__c = VCSSAP__Signature__c;
    VCSSAP__Signature__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Tags2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Tags2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Tags2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean VCSSAP__Tags2__c__is_set = false;

  private java.lang.String VCSSAP__Tags2__c;

  public java.lang.String getVCSSAP__Tags2__c() {
    return VCSSAP__Tags2__c;
  }

  

  public void setVCSSAP__Tags2__c(java.lang.String VCSSAP__Tags2__c) {
    this.VCSSAP__Tags2__c = VCSSAP__Tags2__c;
    VCSSAP__Tags2__c__is_set = true;
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
   * element  : VCSSAP__Use_Cases__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Use_Cases__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Use_Cases__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Use_Cases__c__is_set = false;

  private java.lang.Boolean VCSSAP__Use_Cases__c;

  public java.lang.Boolean getVCSSAP__Use_Cases__c() {
    return VCSSAP__Use_Cases__c;
  }

  

  public void setVCSSAP__Use_Cases__c(java.lang.Boolean VCSSAP__Use_Cases__c) {
    this.VCSSAP__Use_Cases__c = VCSSAP__Use_Cases__c;
    VCSSAP__Use_Cases__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Use_Contacts__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Use_Contacts__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Use_Contacts__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Use_Contacts__c__is_set = false;

  private java.lang.Boolean VCSSAP__Use_Contacts__c;

  public java.lang.Boolean getVCSSAP__Use_Contacts__c() {
    return VCSSAP__Use_Contacts__c;
  }

  

  public void setVCSSAP__Use_Contacts__c(java.lang.Boolean VCSSAP__Use_Contacts__c) {
    this.VCSSAP__Use_Contacts__c = VCSSAP__Use_Contacts__c;
    VCSSAP__Use_Contacts__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Use_Leads__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Use_Leads__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Use_Leads__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Use_Leads__c__is_set = false;

  private java.lang.Boolean VCSSAP__Use_Leads__c;

  public java.lang.Boolean getVCSSAP__Use_Leads__c() {
    return VCSSAP__Use_Leads__c;
  }

  

  public void setVCSSAP__Use_Leads__c(java.lang.Boolean VCSSAP__Use_Leads__c) {
    this.VCSSAP__Use_Leads__c = VCSSAP__Use_Leads__c;
    VCSSAP__Use_Leads__c__is_set = true;
  }
  
  /**
   * element  : VCSSAP__Use_Opportunities__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__Use_Opportunities__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__Use_Opportunities__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean VCSSAP__Use_Opportunities__c__is_set = false;

  private java.lang.Boolean VCSSAP__Use_Opportunities__c;

  public java.lang.Boolean getVCSSAP__Use_Opportunities__c() {
    return VCSSAP__Use_Opportunities__c;
  }

  

  public void setVCSSAP__Use_Opportunities__c(java.lang.Boolean VCSSAP__Use_Opportunities__c) {
    this.VCSSAP__Use_Opportunities__c = VCSSAP__Use_Opportunities__c;
    VCSSAP__Use_Opportunities__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "VCSSAP__VCS_MailBox_Config__c");
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
    __typeMapper.writeObject(__out, VCSSAP__Alert_new_emails__c__typeInfo, VCSSAP__Alert_new_emails__c, VCSSAP__Alert_new_emails__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Auto_Create_Leads__c__typeInfo, VCSSAP__Auto_Create_Leads__c, VCSSAP__Auto_Create_Leads__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Filter_rules__c__typeInfo, VCSSAP__Filter_rules__c, VCSSAP__Filter_rules__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__HideHelpPage__c__typeInfo, VCSSAP__HideHelpPage__c, VCSSAP__HideHelpPage__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Inbox_autorefresh__c__typeInfo, VCSSAP__Inbox_autorefresh__c, VCSSAP__Inbox_autorefresh__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Inbox_autorefresh_interval__c__typeInfo, VCSSAP__Inbox_autorefresh_interval__c, VCSSAP__Inbox_autorefresh_interval__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Log_Outgoings_Email__c__typeInfo, VCSSAP__Log_Outgoings_Email__c, VCSSAP__Log_Outgoings_Email__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Log_Outgoings__c__typeInfo, VCSSAP__Log_Outgoings__c, VCSSAP__Log_Outgoings__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__New_Emails__c__typeInfo, VCSSAP__New_Emails__c, VCSSAP__New_Emails__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Only_Match_Leads_Contacts__c__typeInfo, VCSSAP__Only_Match_Leads_Contacts__c, VCSSAP__Only_Match_Leads_Contacts__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Page_size__c__typeInfo, VCSSAP__Page_size__c, VCSSAP__Page_size__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Quit_VCS_branding__c__typeInfo, VCSSAP__Quit_VCS_branding__c, VCSSAP__Quit_VCS_branding__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Related_Hover_Links__c__typeInfo, VCSSAP__Related_Hover_Links__c, VCSSAP__Related_Hover_Links__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Save_all_as_Activity__c__typeInfo, VCSSAP__Save_all_as_Activity__c, VCSSAP__Save_all_as_Activity__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Show_inbox_column__c__typeInfo, VCSSAP__Show_inbox_column__c, VCSSAP__Show_inbox_column__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Signature_Above_Reply__c__typeInfo, VCSSAP__Signature_Above_Reply__c, VCSSAP__Signature_Above_Reply__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Signature_Picture__c__typeInfo, VCSSAP__Signature_Picture__c, VCSSAP__Signature_Picture__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Signature__c__typeInfo, VCSSAP__Signature__c, VCSSAP__Signature__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Tags2__c__typeInfo, VCSSAP__Tags2__c, VCSSAP__Tags2__c__is_set);
    __typeMapper.writeString(__out, VCSSAP__Tags__c__typeInfo, VCSSAP__Tags__c, VCSSAP__Tags__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Use_Cases__c__typeInfo, VCSSAP__Use_Cases__c, VCSSAP__Use_Cases__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Use_Contacts__c__typeInfo, VCSSAP__Use_Contacts__c, VCSSAP__Use_Contacts__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Use_Leads__c__typeInfo, VCSSAP__Use_Leads__c, VCSSAP__Use_Leads__c__is_set);
    __typeMapper.writeObject(__out, VCSSAP__Use_Opportunities__c__typeInfo, VCSSAP__Use_Opportunities__c, VCSSAP__Use_Opportunities__c__is_set);
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
    if (__typeMapper.isElement(__in, VCSSAP__Alert_new_emails__c__typeInfo)) {
      setVCSSAP__Alert_new_emails__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Alert_new_emails__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Auto_Create_Leads__c__typeInfo)) {
      setVCSSAP__Auto_Create_Leads__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Auto_Create_Leads__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Filter_rules__c__typeInfo)) {
      setVCSSAP__Filter_rules__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Filter_rules__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__HideHelpPage__c__typeInfo)) {
      setVCSSAP__HideHelpPage__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__HideHelpPage__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Inbox_autorefresh__c__typeInfo)) {
      setVCSSAP__Inbox_autorefresh__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Inbox_autorefresh__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Inbox_autorefresh_interval__c__typeInfo)) {
      setVCSSAP__Inbox_autorefresh_interval__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Inbox_autorefresh_interval__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Log_Outgoings_Email__c__typeInfo)) {
      setVCSSAP__Log_Outgoings_Email__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Log_Outgoings_Email__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Log_Outgoings__c__typeInfo)) {
      setVCSSAP__Log_Outgoings__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Log_Outgoings__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__New_Emails__c__typeInfo)) {
      setVCSSAP__New_Emails__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__New_Emails__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Only_Match_Leads_Contacts__c__typeInfo)) {
      setVCSSAP__Only_Match_Leads_Contacts__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Only_Match_Leads_Contacts__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Page_size__c__typeInfo)) {
      setVCSSAP__Page_size__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Page_size__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Quit_VCS_branding__c__typeInfo)) {
      setVCSSAP__Quit_VCS_branding__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Quit_VCS_branding__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Related_Hover_Links__c__typeInfo)) {
      setVCSSAP__Related_Hover_Links__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Related_Hover_Links__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Save_all_as_Activity__c__typeInfo)) {
      setVCSSAP__Save_all_as_Activity__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Save_all_as_Activity__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Show_inbox_column__c__typeInfo)) {
      setVCSSAP__Show_inbox_column__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Show_inbox_column__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Signature_Above_Reply__c__typeInfo)) {
      setVCSSAP__Signature_Above_Reply__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Signature_Above_Reply__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Signature_Picture__c__typeInfo)) {
      setVCSSAP__Signature_Picture__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Signature_Picture__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Signature__c__typeInfo)) {
      setVCSSAP__Signature__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Signature__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Tags2__c__typeInfo)) {
      setVCSSAP__Tags2__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Tags2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Tags__c__typeInfo)) {
      setVCSSAP__Tags__c((java.lang.String)__typeMapper.readString(__in, VCSSAP__Tags__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Use_Cases__c__typeInfo)) {
      setVCSSAP__Use_Cases__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Use_Cases__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Use_Contacts__c__typeInfo)) {
      setVCSSAP__Use_Contacts__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Use_Contacts__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Use_Leads__c__typeInfo)) {
      setVCSSAP__Use_Leads__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Use_Leads__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__Use_Opportunities__c__typeInfo)) {
      setVCSSAP__Use_Opportunities__c((java.lang.Boolean)__typeMapper.readObject(__in, VCSSAP__Use_Opportunities__c__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[VCSSAP__VCS_MailBox_Config__c ");
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
    sb.append(" VCSSAP__Alert_new_emails__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Alert_new_emails__c)+"'\n");
    sb.append(" VCSSAP__Auto_Create_Leads__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Auto_Create_Leads__c)+"'\n");
    sb.append(" VCSSAP__Filter_rules__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Filter_rules__c)+"'\n");
    sb.append(" VCSSAP__HideHelpPage__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__HideHelpPage__c)+"'\n");
    sb.append(" VCSSAP__Inbox_autorefresh__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Inbox_autorefresh__c)+"'\n");
    sb.append(" VCSSAP__Inbox_autorefresh_interval__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Inbox_autorefresh_interval__c)+"'\n");
    sb.append(" VCSSAP__Log_Outgoings_Email__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Log_Outgoings_Email__c)+"'\n");
    sb.append(" VCSSAP__Log_Outgoings__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Log_Outgoings__c)+"'\n");
    sb.append(" VCSSAP__New_Emails__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__New_Emails__c)+"'\n");
    sb.append(" VCSSAP__Only_Match_Leads_Contacts__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Only_Match_Leads_Contacts__c)+"'\n");
    sb.append(" VCSSAP__Page_size__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Page_size__c)+"'\n");
    sb.append(" VCSSAP__Quit_VCS_branding__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Quit_VCS_branding__c)+"'\n");
    sb.append(" VCSSAP__Related_Hover_Links__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Related_Hover_Links__c)+"'\n");
    sb.append(" VCSSAP__Save_all_as_Activity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Save_all_as_Activity__c)+"'\n");
    sb.append(" VCSSAP__Show_inbox_column__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Show_inbox_column__c)+"'\n");
    sb.append(" VCSSAP__Signature_Above_Reply__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Signature_Above_Reply__c)+"'\n");
    sb.append(" VCSSAP__Signature_Picture__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Signature_Picture__c)+"'\n");
    sb.append(" VCSSAP__Signature__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Signature__c)+"'\n");
    sb.append(" VCSSAP__Tags2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Tags2__c)+"'\n");
    sb.append(" VCSSAP__Tags__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Tags__c)+"'\n");
    sb.append(" VCSSAP__Use_Cases__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Use_Cases__c)+"'\n");
    sb.append(" VCSSAP__Use_Contacts__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Use_Contacts__c)+"'\n");
    sb.append(" VCSSAP__Use_Leads__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Use_Leads__c)+"'\n");
    sb.append(" VCSSAP__Use_Opportunities__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__Use_Opportunities__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}