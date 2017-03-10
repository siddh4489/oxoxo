package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Echosign_dev1__SIGN_Agreement__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Echosign_dev1__SIGN_Agreement__c() {
  }
    
  
  /**
   * element  : Admin_Employee__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Admin_Employee__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Admin_Employee__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Admin_Employee__c__is_set = false;

  private java.lang.String Admin_Employee__c;

  public java.lang.String getAdmin_Employee__c() {
    return Admin_Employee__c;
  }

  

  public void setAdmin_Employee__c(java.lang.String Admin_Employee__c) {
    this.Admin_Employee__c = Admin_Employee__c;
    Admin_Employee__c__is_set = true;
  }
  
  /**
   * element  : Admin_Employee__r of type {urn:sobject.enterprise.soap.sforce.com}SFDC_Employee__c
   * java type: com.sforce.soap.enterprise.sobject.SFDC_Employee__c
   */
  private static final com.sforce.ws.bind.TypeInfo Admin_Employee__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Admin_Employee__r","urn:sobject.enterprise.soap.sforce.com","SFDC_Employee__c",0,1,true);

  private boolean Admin_Employee__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.SFDC_Employee__c Admin_Employee__r;

  public com.sforce.soap.enterprise.sobject.SFDC_Employee__c getAdmin_Employee__r() {
    return Admin_Employee__r;
  }

  

  public void setAdmin_Employee__r(com.sforce.soap.enterprise.sobject.SFDC_Employee__c Admin_Employee__r) {
    this.Admin_Employee__r = Admin_Employee__r;
    Admin_Employee__r__is_set = true;
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
   * element  : Contact__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Contact__c__is_set = false;

  private java.lang.String Contact__c;

  public java.lang.String getContact__c() {
    return Contact__c;
  }

  

  public void setContact__c(java.lang.String Contact__c) {
    this.Contact__c = Contact__c;
    Contact__c__is_set = true;
  }
  
  /**
   * element  : Contact__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo Contact__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean Contact__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact Contact__r;

  public com.sforce.soap.enterprise.sobject.Contact getContact__r() {
    return Contact__r;
  }

  

  public void setContact__r(com.sforce.soap.enterprise.sobject.Contact Contact__r) {
    this.Contact__r = Contact__r;
    Contact__r__is_set = true;
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
   * element  : Employee__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Employee__c__is_set = false;

  private java.lang.String Employee__c;

  public java.lang.String getEmployee__c() {
    return Employee__c;
  }

  

  public void setEmployee__c(java.lang.String Employee__c) {
    this.Employee__c = Employee__c;
    Employee__c__is_set = true;
  }
  
  /**
   * element  : Employee__r of type {urn:sobject.enterprise.soap.sforce.com}Candidate_Employee__c
   * java type: com.sforce.soap.enterprise.sobject.Candidate_Employee__c
   */
  private static final com.sforce.ws.bind.TypeInfo Employee__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee__r","urn:sobject.enterprise.soap.sforce.com","Candidate_Employee__c",0,1,true);

  private boolean Employee__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Candidate_Employee__c Employee__r;

  public com.sforce.soap.enterprise.sobject.Candidate_Employee__c getEmployee__r() {
    return Employee__r;
  }

  

  public void setEmployee__r(com.sforce.soap.enterprise.sobject.Candidate_Employee__c Employee__r) {
    this.Employee__r = Employee__r;
    Employee__r__is_set = true;
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
   * element  : echosign_dev1__Account__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Account__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Account__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Account__c__is_set = false;

  private java.lang.String echosign_dev1__Account__c;

  public java.lang.String getEchosign_dev1__Account__c() {
    return echosign_dev1__Account__c;
  }

  

  public void setEchosign_dev1__Account__c(java.lang.String echosign_dev1__Account__c) {
    this.echosign_dev1__Account__c = echosign_dev1__Account__c;
    echosign_dev1__Account__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Account__r of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Account__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Account__r","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean echosign_dev1__Account__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account echosign_dev1__Account__r;

  public com.sforce.soap.enterprise.sobject.Account getEchosign_dev1__Account__r() {
    return echosign_dev1__Account__r;
  }

  

  public void setEchosign_dev1__Account__r(com.sforce.soap.enterprise.sobject.Account echosign_dev1__Account__r) {
    this.echosign_dev1__Account__r = echosign_dev1__Account__r;
    echosign_dev1__Account__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__AdditionalOptions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__AdditionalOptions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__AdditionalOptions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__AdditionalOptions__c__is_set = false;

  private java.lang.String echosign_dev1__AdditionalOptions__c;

  public java.lang.String getEchosign_dev1__AdditionalOptions__c() {
    return echosign_dev1__AdditionalOptions__c;
  }

  

  public void setEchosign_dev1__AdditionalOptions__c(java.lang.String echosign_dev1__AdditionalOptions__c) {
    this.echosign_dev1__AdditionalOptions__c = echosign_dev1__AdditionalOptions__c;
    echosign_dev1__AdditionalOptions__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Additional_Recipient_1_User__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Additional_Recipient_1_User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Additional_Recipient_1_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Additional_Recipient_1_User__c__is_set = false;

  private java.lang.String echosign_dev1__Additional_Recipient_1_User__c;

  public java.lang.String getEchosign_dev1__Additional_Recipient_1_User__c() {
    return echosign_dev1__Additional_Recipient_1_User__c;
  }

  

  public void setEchosign_dev1__Additional_Recipient_1_User__c(java.lang.String echosign_dev1__Additional_Recipient_1_User__c) {
    this.echosign_dev1__Additional_Recipient_1_User__c = echosign_dev1__Additional_Recipient_1_User__c;
    echosign_dev1__Additional_Recipient_1_User__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Additional_Recipient_1_User__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Additional_Recipient_1_User__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Additional_Recipient_1_User__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean echosign_dev1__Additional_Recipient_1_User__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User echosign_dev1__Additional_Recipient_1_User__r;

  public com.sforce.soap.enterprise.sobject.User getEchosign_dev1__Additional_Recipient_1_User__r() {
    return echosign_dev1__Additional_Recipient_1_User__r;
  }

  

  public void setEchosign_dev1__Additional_Recipient_1_User__r(com.sforce.soap.enterprise.sobject.User echosign_dev1__Additional_Recipient_1_User__r) {
    this.echosign_dev1__Additional_Recipient_1_User__r = echosign_dev1__Additional_Recipient_1_User__r;
    echosign_dev1__Additional_Recipient_1_User__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Additional_Recipient_2_User__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Additional_Recipient_2_User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Additional_Recipient_2_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Additional_Recipient_2_User__c__is_set = false;

  private java.lang.String echosign_dev1__Additional_Recipient_2_User__c;

  public java.lang.String getEchosign_dev1__Additional_Recipient_2_User__c() {
    return echosign_dev1__Additional_Recipient_2_User__c;
  }

  

  public void setEchosign_dev1__Additional_Recipient_2_User__c(java.lang.String echosign_dev1__Additional_Recipient_2_User__c) {
    this.echosign_dev1__Additional_Recipient_2_User__c = echosign_dev1__Additional_Recipient_2_User__c;
    echosign_dev1__Additional_Recipient_2_User__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Additional_Recipient_2_User__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Additional_Recipient_2_User__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Additional_Recipient_2_User__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean echosign_dev1__Additional_Recipient_2_User__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User echosign_dev1__Additional_Recipient_2_User__r;

  public com.sforce.soap.enterprise.sobject.User getEchosign_dev1__Additional_Recipient_2_User__r() {
    return echosign_dev1__Additional_Recipient_2_User__r;
  }

  

  public void setEchosign_dev1__Additional_Recipient_2_User__r(com.sforce.soap.enterprise.sobject.User echosign_dev1__Additional_Recipient_2_User__r) {
    this.echosign_dev1__Additional_Recipient_2_User__r = echosign_dev1__Additional_Recipient_2_User__r;
    echosign_dev1__Additional_Recipient_2_User__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Additional_Recipient_3_User__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Additional_Recipient_3_User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Additional_Recipient_3_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Additional_Recipient_3_User__c__is_set = false;

  private java.lang.String echosign_dev1__Additional_Recipient_3_User__c;

  public java.lang.String getEchosign_dev1__Additional_Recipient_3_User__c() {
    return echosign_dev1__Additional_Recipient_3_User__c;
  }

  

  public void setEchosign_dev1__Additional_Recipient_3_User__c(java.lang.String echosign_dev1__Additional_Recipient_3_User__c) {
    this.echosign_dev1__Additional_Recipient_3_User__c = echosign_dev1__Additional_Recipient_3_User__c;
    echosign_dev1__Additional_Recipient_3_User__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Additional_Recipient_3_User__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Additional_Recipient_3_User__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Additional_Recipient_3_User__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean echosign_dev1__Additional_Recipient_3_User__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User echosign_dev1__Additional_Recipient_3_User__r;

  public com.sforce.soap.enterprise.sobject.User getEchosign_dev1__Additional_Recipient_3_User__r() {
    return echosign_dev1__Additional_Recipient_3_User__r;
  }

  

  public void setEchosign_dev1__Additional_Recipient_3_User__r(com.sforce.soap.enterprise.sobject.User echosign_dev1__Additional_Recipient_3_User__r) {
    this.echosign_dev1__Additional_Recipient_3_User__r = echosign_dev1__Additional_Recipient_3_User__r;
    echosign_dev1__Additional_Recipient_3_User__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__AgreementLocale__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__AgreementLocale__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__AgreementLocale__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__AgreementLocale__c__is_set = false;

  private java.lang.String echosign_dev1__AgreementLocale__c;

  public java.lang.String getEchosign_dev1__AgreementLocale__c() {
    return echosign_dev1__AgreementLocale__c;
  }

  

  public void setEchosign_dev1__AgreementLocale__c(java.lang.String echosign_dev1__AgreementLocale__c) {
    this.echosign_dev1__AgreementLocale__c = echosign_dev1__AgreementLocale__c;
    echosign_dev1__AgreementLocale__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Attachment_ID_Order__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Attachment_ID_Order__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Attachment_ID_Order__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Attachment_ID_Order__c__is_set = false;

  private java.lang.String echosign_dev1__Attachment_ID_Order__c;

  public java.lang.String getEchosign_dev1__Attachment_ID_Order__c() {
    return echosign_dev1__Attachment_ID_Order__c;
  }

  

  public void setEchosign_dev1__Attachment_ID_Order__c(java.lang.String echosign_dev1__Attachment_ID_Order__c) {
    this.echosign_dev1__Attachment_ID_Order__c = echosign_dev1__Attachment_ID_Order__c;
    echosign_dev1__Attachment_ID_Order__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Attachment_Service_Invocation_Count__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Attachment_Service_Invocation_Count__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Attachment_Service_Invocation_Count__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Attachment_Service_Invocation_Count__c__is_set = false;

  private java.lang.String echosign_dev1__Attachment_Service_Invocation_Count__c;

  public java.lang.String getEchosign_dev1__Attachment_Service_Invocation_Count__c() {
    return echosign_dev1__Attachment_Service_Invocation_Count__c;
  }

  

  public void setEchosign_dev1__Attachment_Service_Invocation_Count__c(java.lang.String echosign_dev1__Attachment_Service_Invocation_Count__c) {
    this.echosign_dev1__Attachment_Service_Invocation_Count__c = echosign_dev1__Attachment_Service_Invocation_Count__c;
    echosign_dev1__Attachment_Service_Invocation_Count__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Authoring__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Authoring__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Authoring__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__Authoring__c__is_set = false;

  private java.lang.Boolean echosign_dev1__Authoring__c;

  public java.lang.Boolean getEchosign_dev1__Authoring__c() {
    return echosign_dev1__Authoring__c;
  }

  

  public void setEchosign_dev1__Authoring__c(java.lang.Boolean echosign_dev1__Authoring__c) {
    this.echosign_dev1__Authoring__c = echosign_dev1__Authoring__c;
    echosign_dev1__Authoring__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__AutoUpdate__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__AutoUpdate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__AutoUpdate__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__AutoUpdate__c__is_set = false;

  private java.lang.Boolean echosign_dev1__AutoUpdate__c;

  public java.lang.Boolean getEchosign_dev1__AutoUpdate__c() {
    return echosign_dev1__AutoUpdate__c;
  }

  

  public void setEchosign_dev1__AutoUpdate__c(java.lang.Boolean echosign_dev1__AutoUpdate__c) {
    this.echosign_dev1__AutoUpdate__c = echosign_dev1__AutoUpdate__c;
    echosign_dev1__AutoUpdate__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Background_Action__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Background_Action__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Background_Action__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Background_Action__c__is_set = false;

  private java.lang.String echosign_dev1__Background_Action__c;

  public java.lang.String getEchosign_dev1__Background_Action__c() {
    return echosign_dev1__Background_Action__c;
  }

  

  public void setEchosign_dev1__Background_Action__c(java.lang.String echosign_dev1__Background_Action__c) {
    this.echosign_dev1__Background_Action__c = echosign_dev1__Background_Action__c;
    echosign_dev1__Background_Action__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Cancel_Delete_Reason__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Cancel_Delete_Reason__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Cancel_Delete_Reason__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Cancel_Delete_Reason__c__is_set = false;

  private java.lang.String echosign_dev1__Cancel_Delete_Reason__c;

  public java.lang.String getEchosign_dev1__Cancel_Delete_Reason__c() {
    return echosign_dev1__Cancel_Delete_Reason__c;
  }

  

  public void setEchosign_dev1__Cancel_Delete_Reason__c(java.lang.String echosign_dev1__Cancel_Delete_Reason__c) {
    this.echosign_dev1__Cancel_Delete_Reason__c = echosign_dev1__Cancel_Delete_Reason__c;
    echosign_dev1__Cancel_Delete_Reason__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Cc__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Cc__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Cc__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Cc__c__is_set = false;

  private java.lang.String echosign_dev1__Cc__c;

  public java.lang.String getEchosign_dev1__Cc__c() {
    return echosign_dev1__Cc__c;
  }

  

  public void setEchosign_dev1__Cc__c(java.lang.String echosign_dev1__Cc__c) {
    this.echosign_dev1__Cc__c = echosign_dev1__Cc__c;
    echosign_dev1__Cc__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Contract__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Contract__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Contract__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Contract__c__is_set = false;

  private java.lang.String echosign_dev1__Contract__c;

  public java.lang.String getEchosign_dev1__Contract__c() {
    return echosign_dev1__Contract__c;
  }

  

  public void setEchosign_dev1__Contract__c(java.lang.String echosign_dev1__Contract__c) {
    this.echosign_dev1__Contract__c = echosign_dev1__Contract__c;
    echosign_dev1__Contract__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Contract__r of type {urn:sobject.enterprise.soap.sforce.com}Contract
   * java type: com.sforce.soap.enterprise.sobject.Contract
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Contract__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Contract__r","urn:sobject.enterprise.soap.sforce.com","Contract",0,1,true);

  private boolean echosign_dev1__Contract__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contract echosign_dev1__Contract__r;

  public com.sforce.soap.enterprise.sobject.Contract getEchosign_dev1__Contract__r() {
    return echosign_dev1__Contract__r;
  }

  

  public void setEchosign_dev1__Contract__r(com.sforce.soap.enterprise.sobject.Contract echosign_dev1__Contract__r) {
    this.echosign_dev1__Contract__r = echosign_dev1__Contract__r;
    echosign_dev1__Contract__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Data_Mapping_Error__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Data_Mapping_Error__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Data_Mapping_Error__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Data_Mapping_Error__c__is_set = false;

  private java.lang.String echosign_dev1__Data_Mapping_Error__c;

  public java.lang.String getEchosign_dev1__Data_Mapping_Error__c() {
    return echosign_dev1__Data_Mapping_Error__c;
  }

  

  public void setEchosign_dev1__Data_Mapping_Error__c(java.lang.String echosign_dev1__Data_Mapping_Error__c) {
    this.echosign_dev1__Data_Mapping_Error__c = echosign_dev1__Data_Mapping_Error__c;
    echosign_dev1__Data_Mapping_Error__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Data_Mapping_Result__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Data_Mapping_Result__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Data_Mapping_Result__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Data_Mapping_Result__c__is_set = false;

  private java.lang.String echosign_dev1__Data_Mapping_Result__c;

  public java.lang.String getEchosign_dev1__Data_Mapping_Result__c() {
    return echosign_dev1__Data_Mapping_Result__c;
  }

  

  public void setEchosign_dev1__Data_Mapping_Result__c(java.lang.String echosign_dev1__Data_Mapping_Result__c) {
    this.echosign_dev1__Data_Mapping_Result__c = echosign_dev1__Data_Mapping_Result__c;
    echosign_dev1__Data_Mapping_Result__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DateSentDate__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DateSentDate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DateSentDate__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean echosign_dev1__DateSentDate__c__is_set = false;

  private java.util.Calendar echosign_dev1__DateSentDate__c;

  public java.util.Calendar getEchosign_dev1__DateSentDate__c() {
    return echosign_dev1__DateSentDate__c;
  }

  

  public void setEchosign_dev1__DateSentDate__c(java.util.Calendar echosign_dev1__DateSentDate__c) {
    this.echosign_dev1__DateSentDate__c = echosign_dev1__DateSentDate__c;
    echosign_dev1__DateSentDate__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DateSent__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DateSent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DateSent__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean echosign_dev1__DateSent__c__is_set = false;

  private java.util.Calendar echosign_dev1__DateSent__c;

  public java.util.Calendar getEchosign_dev1__DateSent__c() {
    return echosign_dev1__DateSent__c;
  }

  

  public void setEchosign_dev1__DateSent__c(java.util.Calendar echosign_dev1__DateSent__c) {
    this.echosign_dev1__DateSent__c = echosign_dev1__DateSent__c;
    echosign_dev1__DateSent__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DateSignedDate__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DateSignedDate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DateSignedDate__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean echosign_dev1__DateSignedDate__c__is_set = false;

  private java.util.Calendar echosign_dev1__DateSignedDate__c;

  public java.util.Calendar getEchosign_dev1__DateSignedDate__c() {
    return echosign_dev1__DateSignedDate__c;
  }

  

  public void setEchosign_dev1__DateSignedDate__c(java.util.Calendar echosign_dev1__DateSignedDate__c) {
    this.echosign_dev1__DateSignedDate__c = echosign_dev1__DateSignedDate__c;
    echosign_dev1__DateSignedDate__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DateSigned__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DateSigned__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DateSigned__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean echosign_dev1__DateSigned__c__is_set = false;

  private java.util.Calendar echosign_dev1__DateSigned__c;

  public java.util.Calendar getEchosign_dev1__DateSigned__c() {
    return echosign_dev1__DateSigned__c;
  }

  

  public void setEchosign_dev1__DateSigned__c(java.util.Calendar echosign_dev1__DateSigned__c) {
    this.echosign_dev1__DateSigned__c = echosign_dev1__DateSigned__c;
    echosign_dev1__DateSigned__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DateViewedDate__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DateViewedDate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DateViewedDate__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean echosign_dev1__DateViewedDate__c__is_set = false;

  private java.util.Calendar echosign_dev1__DateViewedDate__c;

  public java.util.Calendar getEchosign_dev1__DateViewedDate__c() {
    return echosign_dev1__DateViewedDate__c;
  }

  

  public void setEchosign_dev1__DateViewedDate__c(java.util.Calendar echosign_dev1__DateViewedDate__c) {
    this.echosign_dev1__DateViewedDate__c = echosign_dev1__DateViewedDate__c;
    echosign_dev1__DateViewedDate__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DateViewed__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DateViewed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DateViewed__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean echosign_dev1__DateViewed__c__is_set = false;

  private java.util.Calendar echosign_dev1__DateViewed__c;

  public java.util.Calendar getEchosign_dev1__DateViewed__c() {
    return echosign_dev1__DateViewed__c;
  }

  

  public void setEchosign_dev1__DateViewed__c(java.util.Calendar echosign_dev1__DateViewed__c) {
    this.echosign_dev1__DateViewed__c = echosign_dev1__DateViewed__c;
    echosign_dev1__DateViewed__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DaysUnsigned__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DaysUnsigned__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DaysUnsigned__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean echosign_dev1__DaysUnsigned__c__is_set = false;

  private java.lang.Double echosign_dev1__DaysUnsigned__c;

  public java.lang.Double getEchosign_dev1__DaysUnsigned__c() {
    return echosign_dev1__DaysUnsigned__c;
  }

  

  public void setEchosign_dev1__DaysUnsigned__c(java.lang.Double echosign_dev1__DaysUnsigned__c) {
    this.echosign_dev1__DaysUnsigned__c = echosign_dev1__DaysUnsigned__c;
    echosign_dev1__DaysUnsigned__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DaysUntilSigned__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DaysUntilSigned__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DaysUntilSigned__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean echosign_dev1__DaysUntilSigned__c__is_set = false;

  private java.lang.Double echosign_dev1__DaysUntilSigned__c;

  public java.lang.Double getEchosign_dev1__DaysUntilSigned__c() {
    return echosign_dev1__DaysUntilSigned__c;
  }

  

  public void setEchosign_dev1__DaysUntilSigned__c(java.lang.Double echosign_dev1__DaysUntilSigned__c) {
    this.echosign_dev1__DaysUntilSigned__c = echosign_dev1__DaysUntilSigned__c;
    echosign_dev1__DaysUntilSigned__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__DaysUntilSigningDeadline__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__DaysUntilSigningDeadline__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__DaysUntilSigningDeadline__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean echosign_dev1__DaysUntilSigningDeadline__c__is_set = false;

  private java.lang.Double echosign_dev1__DaysUntilSigningDeadline__c;

  public java.lang.Double getEchosign_dev1__DaysUntilSigningDeadline__c() {
    return echosign_dev1__DaysUntilSigningDeadline__c;
  }

  

  public void setEchosign_dev1__DaysUntilSigningDeadline__c(java.lang.Double echosign_dev1__DaysUntilSigningDeadline__c) {
    this.echosign_dev1__DaysUntilSigningDeadline__c = echosign_dev1__DaysUntilSigningDeadline__c;
    echosign_dev1__DaysUntilSigningDeadline__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Document_Key__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Document_Key__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Document_Key__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Document_Key__c__is_set = false;

  private java.lang.String echosign_dev1__Document_Key__c;

  public java.lang.String getEchosign_dev1__Document_Key__c() {
    return echosign_dev1__Document_Key__c;
  }

  

  public void setEchosign_dev1__Document_Key__c(java.lang.String echosign_dev1__Document_Key__c) {
    this.echosign_dev1__Document_Key__c = echosign_dev1__Document_Key__c;
    echosign_dev1__Document_Key__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Document__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Document__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Document__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Document__c__is_set = false;

  private java.lang.String echosign_dev1__Document__c;

  public java.lang.String getEchosign_dev1__Document__c() {
    return echosign_dev1__Document__c;
  }

  

  public void setEchosign_dev1__Document__c(java.lang.String echosign_dev1__Document__c) {
    this.echosign_dev1__Document__c = echosign_dev1__Document__c;
    echosign_dev1__Document__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__EchoSign_Form_Field_Imports__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__EchoSign_Form_Field_Imports__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__EchoSign_Form_Field_Imports__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__EchoSign_Form_Field_Imports__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__EchoSign_Form_Field_Imports__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__EchoSign_Form_Field_Imports__r() {
    return echosign_dev1__EchoSign_Form_Field_Imports__r;
  }

  

  public void setEchosign_dev1__EchoSign_Form_Field_Imports__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__EchoSign_Form_Field_Imports__r) {
    this.echosign_dev1__EchoSign_Form_Field_Imports__r = echosign_dev1__EchoSign_Form_Field_Imports__r;
    echosign_dev1__EchoSign_Form_Field_Imports__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__EchoSign_Triggers__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__EchoSign_Triggers__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__EchoSign_Triggers__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__EchoSign_Triggers__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__EchoSign_Triggers__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__EchoSign_Triggers__r() {
    return echosign_dev1__EchoSign_Triggers__r;
  }

  

  public void setEchosign_dev1__EchoSign_Triggers__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__EchoSign_Triggers__r) {
    this.echosign_dev1__EchoSign_Triggers__r = echosign_dev1__EchoSign_Triggers__r;
    echosign_dev1__EchoSign_Triggers__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Echosign_Recipients__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Echosign_Recipients__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Echosign_Recipients__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Echosign_Recipients__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Echosign_Recipients__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Echosign_Recipients__r() {
    return echosign_dev1__Echosign_Recipients__r;
  }

  

  public void setEchosign_dev1__Echosign_Recipients__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Echosign_Recipients__r) {
    this.echosign_dev1__Echosign_Recipients__r = echosign_dev1__Echosign_Recipients__r;
    echosign_dev1__Echosign_Recipients__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Enable_Automatic_Reminders__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Enable_Automatic_Reminders__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Enable_Automatic_Reminders__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__Enable_Automatic_Reminders__c__is_set = false;

  private java.lang.Boolean echosign_dev1__Enable_Automatic_Reminders__c;

  public java.lang.Boolean getEchosign_dev1__Enable_Automatic_Reminders__c() {
    return echosign_dev1__Enable_Automatic_Reminders__c;
  }

  

  public void setEchosign_dev1__Enable_Automatic_Reminders__c(java.lang.Boolean echosign_dev1__Enable_Automatic_Reminders__c) {
    this.echosign_dev1__Enable_Automatic_Reminders__c = echosign_dev1__Enable_Automatic_Reminders__c;
    echosign_dev1__Enable_Automatic_Reminders__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Enable_Hosted_Signing__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Enable_Hosted_Signing__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Enable_Hosted_Signing__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__Enable_Hosted_Signing__c__is_set = false;

  private java.lang.Boolean echosign_dev1__Enable_Hosted_Signing__c;

  public java.lang.Boolean getEchosign_dev1__Enable_Hosted_Signing__c() {
    return echosign_dev1__Enable_Hosted_Signing__c;
  }

  

  public void setEchosign_dev1__Enable_Hosted_Signing__c(java.lang.Boolean echosign_dev1__Enable_Hosted_Signing__c) {
    this.echosign_dev1__Enable_Hosted_Signing__c = echosign_dev1__Enable_Hosted_Signing__c;
    echosign_dev1__Enable_Hosted_Signing__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Enable_Revisions__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Enable_Revisions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Enable_Revisions__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__Enable_Revisions__c__is_set = false;

  private java.lang.Boolean echosign_dev1__Enable_Revisions__c;

  public java.lang.Boolean getEchosign_dev1__Enable_Revisions__c() {
    return echosign_dev1__Enable_Revisions__c;
  }

  

  public void setEchosign_dev1__Enable_Revisions__c(java.lang.Boolean echosign_dev1__Enable_Revisions__c) {
    this.echosign_dev1__Enable_Revisions__c = echosign_dev1__Enable_Revisions__c;
    echosign_dev1__Enable_Revisions__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__EncodedPassword__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__EncodedPassword__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__EncodedPassword__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__EncodedPassword__c__is_set = false;

  private java.lang.String echosign_dev1__EncodedPassword__c;

  public java.lang.String getEchosign_dev1__EncodedPassword__c() {
    return echosign_dev1__EncodedPassword__c;
  }

  

  public void setEchosign_dev1__EncodedPassword__c(java.lang.String echosign_dev1__EncodedPassword__c) {
    this.echosign_dev1__EncodedPassword__c = echosign_dev1__EncodedPassword__c;
    echosign_dev1__EncodedPassword__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__ErrorMessage__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__ErrorMessage__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__ErrorMessage__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__ErrorMessage__c__is_set = false;

  private java.lang.String echosign_dev1__ErrorMessage__c;

  public java.lang.String getEchosign_dev1__ErrorMessage__c() {
    return echosign_dev1__ErrorMessage__c;
  }

  

  public void setEchosign_dev1__ErrorMessage__c(java.lang.String echosign_dev1__ErrorMessage__c) {
    this.echosign_dev1__ErrorMessage__c = echosign_dev1__ErrorMessage__c;
    echosign_dev1__ErrorMessage__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__External_Signers_Verification_Method__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__External_Signers_Verification_Method__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__External_Signers_Verification_Method__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__External_Signers_Verification_Method__c__is_set = false;

  private java.lang.String echosign_dev1__External_Signers_Verification_Method__c;

  public java.lang.String getEchosign_dev1__External_Signers_Verification_Method__c() {
    return echosign_dev1__External_Signers_Verification_Method__c;
  }

  

  public void setEchosign_dev1__External_Signers_Verification_Method__c(java.lang.String echosign_dev1__External_Signers_Verification_Method__c) {
    this.echosign_dev1__External_Signers_Verification_Method__c = echosign_dev1__External_Signers_Verification_Method__c;
    echosign_dev1__External_Signers_Verification_Method__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Internal_Signers_Verification_Method__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Internal_Signers_Verification_Method__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Internal_Signers_Verification_Method__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Internal_Signers_Verification_Method__c__is_set = false;

  private java.lang.String echosign_dev1__Internal_Signers_Verification_Method__c;

  public java.lang.String getEchosign_dev1__Internal_Signers_Verification_Method__c() {
    return echosign_dev1__Internal_Signers_Verification_Method__c;
  }

  

  public void setEchosign_dev1__Internal_Signers_Verification_Method__c(java.lang.String echosign_dev1__Internal_Signers_Verification_Method__c) {
    this.echosign_dev1__Internal_Signers_Verification_Method__c = echosign_dev1__Internal_Signers_Verification_Method__c;
    echosign_dev1__Internal_Signers_Verification_Method__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__LastEventId__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__LastEventId__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__LastEventId__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__LastEventId__c__is_set = false;

  private java.lang.String echosign_dev1__LastEventId__c;

  public java.lang.String getEchosign_dev1__LastEventId__c() {
    return echosign_dev1__LastEventId__c;
  }

  

  public void setEchosign_dev1__LastEventId__c(java.lang.String echosign_dev1__LastEventId__c) {
    this.echosign_dev1__LastEventId__c = echosign_dev1__LastEventId__c;
    echosign_dev1__LastEventId__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Legacy_Record_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Legacy_Record_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Legacy_Record_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Legacy_Record_ID__c__is_set = false;

  private java.lang.String echosign_dev1__Legacy_Record_ID__c;

  public java.lang.String getEchosign_dev1__Legacy_Record_ID__c() {
    return echosign_dev1__Legacy_Record_ID__c;
  }

  

  public void setEchosign_dev1__Legacy_Record_ID__c(java.lang.String echosign_dev1__Legacy_Record_ID__c) {
    this.echosign_dev1__Legacy_Record_ID__c = echosign_dev1__Legacy_Record_ID__c;
    echosign_dev1__Legacy_Record_ID__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Merge_Mapping_Error__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Merge_Mapping_Error__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Merge_Mapping_Error__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Merge_Mapping_Error__c__is_set = false;

  private java.lang.String echosign_dev1__Merge_Mapping_Error__c;

  public java.lang.String getEchosign_dev1__Merge_Mapping_Error__c() {
    return echosign_dev1__Merge_Mapping_Error__c;
  }

  

  public void setEchosign_dev1__Merge_Mapping_Error__c(java.lang.String echosign_dev1__Merge_Mapping_Error__c) {
    this.echosign_dev1__Merge_Mapping_Error__c = echosign_dev1__Merge_Mapping_Error__c;
    echosign_dev1__Merge_Mapping_Error__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Merge_Mapping_Result__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Merge_Mapping_Result__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Merge_Mapping_Result__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Merge_Mapping_Result__c__is_set = false;

  private java.lang.String echosign_dev1__Merge_Mapping_Result__c;

  public java.lang.String getEchosign_dev1__Merge_Mapping_Result__c() {
    return echosign_dev1__Merge_Mapping_Result__c;
  }

  

  public void setEchosign_dev1__Merge_Mapping_Result__c(java.lang.String echosign_dev1__Merge_Mapping_Result__c) {
    this.echosign_dev1__Merge_Mapping_Result__c = echosign_dev1__Merge_Mapping_Result__c;
    echosign_dev1__Merge_Mapping_Result__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Merge_Mapping__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Merge_Mapping__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Merge_Mapping__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Merge_Mapping__c__is_set = false;

  private java.lang.String echosign_dev1__Merge_Mapping__c;

  public java.lang.String getEchosign_dev1__Merge_Mapping__c() {
    return echosign_dev1__Merge_Mapping__c;
  }

  

  public void setEchosign_dev1__Merge_Mapping__c(java.lang.String echosign_dev1__Merge_Mapping__c) {
    this.echosign_dev1__Merge_Mapping__c = echosign_dev1__Merge_Mapping__c;
    echosign_dev1__Merge_Mapping__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Merge_Mapping__r of type {urn:sobject.enterprise.soap.sforce.com}echosign_dev1__SIGN_Merge_Mapping__c
   * java type: com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Merge_Mapping__c
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Merge_Mapping__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Merge_Mapping__r","urn:sobject.enterprise.soap.sforce.com","echosign_dev1__SIGN_Merge_Mapping__c",0,1,true);

  private boolean echosign_dev1__Merge_Mapping__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Merge_Mapping__c echosign_dev1__Merge_Mapping__r;

  public com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Merge_Mapping__c getEchosign_dev1__Merge_Mapping__r() {
    return echosign_dev1__Merge_Mapping__r;
  }

  

  public void setEchosign_dev1__Merge_Mapping__r(com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Merge_Mapping__c echosign_dev1__Merge_Mapping__r) {
    this.echosign_dev1__Merge_Mapping__r = echosign_dev1__Merge_Mapping__r;
    echosign_dev1__Merge_Mapping__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Merge__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Merge__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Merge__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Merge__c__is_set = false;

  private java.lang.String echosign_dev1__Merge__c;

  public java.lang.String getEchosign_dev1__Merge__c() {
    return echosign_dev1__Merge__c;
  }

  

  public void setEchosign_dev1__Merge__c(java.lang.String echosign_dev1__Merge__c) {
    this.echosign_dev1__Merge__c = echosign_dev1__Merge__c;
    echosign_dev1__Merge__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Message__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Message__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Message__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Message__c__is_set = false;

  private java.lang.String echosign_dev1__Message__c;

  public java.lang.String getEchosign_dev1__Message__c() {
    return echosign_dev1__Message__c;
  }

  

  public void setEchosign_dev1__Message__c(java.lang.String echosign_dev1__Message__c) {
    this.echosign_dev1__Message__c = echosign_dev1__Message__c;
    echosign_dev1__Message__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Minutes_Until_Signed__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Minutes_Until_Signed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Minutes_Until_Signed__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean echosign_dev1__Minutes_Until_Signed__c__is_set = false;

  private java.lang.Double echosign_dev1__Minutes_Until_Signed__c;

  public java.lang.Double getEchosign_dev1__Minutes_Until_Signed__c() {
    return echosign_dev1__Minutes_Until_Signed__c;
  }

  

  public void setEchosign_dev1__Minutes_Until_Signed__c(java.lang.Double echosign_dev1__Minutes_Until_Signed__c) {
    this.echosign_dev1__Minutes_Until_Signed__c = echosign_dev1__Minutes_Until_Signed__c;
    echosign_dev1__Minutes_Until_Signed__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__More_Recipients__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__More_Recipients__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__More_Recipients__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__More_Recipients__c__is_set = false;

  private java.lang.String echosign_dev1__More_Recipients__c;

  public java.lang.String getEchosign_dev1__More_Recipients__c() {
    return echosign_dev1__More_Recipients__c;
  }

  

  public void setEchosign_dev1__More_Recipients__c(java.lang.String echosign_dev1__More_Recipients__c) {
    this.echosign_dev1__More_Recipients__c = echosign_dev1__More_Recipients__c;
    echosign_dev1__More_Recipients__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Name__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Name__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Name__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Name__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Name__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Name__r() {
    return echosign_dev1__Name__r;
  }

  

  public void setEchosign_dev1__Name__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Name__r) {
    this.echosign_dev1__Name__r = echosign_dev1__Name__r;
    echosign_dev1__Name__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__NewPassword__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__NewPassword__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__NewPassword__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__NewPassword__c__is_set = false;

  private java.lang.String echosign_dev1__NewPassword__c;

  public java.lang.String getEchosign_dev1__NewPassword__c() {
    return echosign_dev1__NewPassword__c;
  }

  

  public void setEchosign_dev1__NewPassword__c(java.lang.String echosign_dev1__NewPassword__c) {
    this.echosign_dev1__NewPassword__c = echosign_dev1__NewPassword__c;
    echosign_dev1__NewPassword__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__On_Load_Action__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__On_Load_Action__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__On_Load_Action__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__On_Load_Action__c__is_set = false;

  private java.lang.String echosign_dev1__On_Load_Action__c;

  public java.lang.String getEchosign_dev1__On_Load_Action__c() {
    return echosign_dev1__On_Load_Action__c;
  }

  

  public void setEchosign_dev1__On_Load_Action__c(java.lang.String echosign_dev1__On_Load_Action__c) {
    this.echosign_dev1__On_Load_Action__c = echosign_dev1__On_Load_Action__c;
    echosign_dev1__On_Load_Action__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Opportunity__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Opportunity__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Opportunity__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Opportunity__c__is_set = false;

  private java.lang.String echosign_dev1__Opportunity__c;

  public java.lang.String getEchosign_dev1__Opportunity__c() {
    return echosign_dev1__Opportunity__c;
  }

  

  public void setEchosign_dev1__Opportunity__c(java.lang.String echosign_dev1__Opportunity__c) {
    this.echosign_dev1__Opportunity__c = echosign_dev1__Opportunity__c;
    echosign_dev1__Opportunity__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Opportunity__r of type {urn:sobject.enterprise.soap.sforce.com}Opportunity
   * java type: com.sforce.soap.enterprise.sobject.Opportunity
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Opportunity__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Opportunity__r","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true);

  private boolean echosign_dev1__Opportunity__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Opportunity echosign_dev1__Opportunity__r;

  public com.sforce.soap.enterprise.sobject.Opportunity getEchosign_dev1__Opportunity__r() {
    return echosign_dev1__Opportunity__r;
  }

  

  public void setEchosign_dev1__Opportunity__r(com.sforce.soap.enterprise.sobject.Opportunity echosign_dev1__Opportunity__r) {
    this.echosign_dev1__Opportunity__r = echosign_dev1__Opportunity__r;
    echosign_dev1__Opportunity__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Partner_Server_URL__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Partner_Server_URL__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Partner_Server_URL__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Partner_Server_URL__c__is_set = false;

  private java.lang.String echosign_dev1__Partner_Server_URL__c;

  public java.lang.String getEchosign_dev1__Partner_Server_URL__c() {
    return echosign_dev1__Partner_Server_URL__c;
  }

  

  public void setEchosign_dev1__Partner_Server_URL__c(java.lang.String echosign_dev1__Partner_Server_URL__c) {
    this.echosign_dev1__Partner_Server_URL__c = echosign_dev1__Partner_Server_URL__c;
    echosign_dev1__Partner_Server_URL__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__PasswordProtectPDF__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__PasswordProtectPDF__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__PasswordProtectPDF__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__PasswordProtectPDF__c__is_set = false;

  private java.lang.Boolean echosign_dev1__PasswordProtectPDF__c;

  public java.lang.Boolean getEchosign_dev1__PasswordProtectPDF__c() {
    return echosign_dev1__PasswordProtectPDF__c;
  }

  

  public void setEchosign_dev1__PasswordProtectPDF__c(java.lang.Boolean echosign_dev1__PasswordProtectPDF__c) {
    this.echosign_dev1__PasswordProtectPDF__c = echosign_dev1__PasswordProtectPDF__c;
    echosign_dev1__PasswordProtectPDF__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__PasswordProtectSign__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__PasswordProtectSign__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__PasswordProtectSign__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__PasswordProtectSign__c__is_set = false;

  private java.lang.Boolean echosign_dev1__PasswordProtectSign__c;

  public java.lang.Boolean getEchosign_dev1__PasswordProtectSign__c() {
    return echosign_dev1__PasswordProtectSign__c;
  }

  

  public void setEchosign_dev1__PasswordProtectSign__c(java.lang.Boolean echosign_dev1__PasswordProtectSign__c) {
    this.echosign_dev1__PasswordProtectSign__c = echosign_dev1__PasswordProtectSign__c;
    echosign_dev1__PasswordProtectSign__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Password__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Password__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Password__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Password__c__is_set = false;

  private java.lang.String echosign_dev1__Password__c;

  public java.lang.String getEchosign_dev1__Password__c() {
    return echosign_dev1__Password__c;
  }

  

  public void setEchosign_dev1__Password__c(java.lang.String echosign_dev1__Password__c) {
    this.echosign_dev1__Password__c = echosign_dev1__Password__c;
    echosign_dev1__Password__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Percent_Signed__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Percent_Signed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Percent_Signed__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean echosign_dev1__Percent_Signed__c__is_set = false;

  private java.lang.Double echosign_dev1__Percent_Signed__c;

  public java.lang.Double getEchosign_dev1__Percent_Signed__c() {
    return echosign_dev1__Percent_Signed__c;
  }

  

  public void setEchosign_dev1__Percent_Signed__c(java.lang.Double echosign_dev1__Percent_Signed__c) {
    this.echosign_dev1__Percent_Signed__c = echosign_dev1__Percent_Signed__c;
    echosign_dev1__Percent_Signed__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__PreferFax__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__PreferFax__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__PreferFax__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__PreferFax__c__is_set = false;

  private java.lang.Boolean echosign_dev1__PreferFax__c;

  public java.lang.Boolean getEchosign_dev1__PreferFax__c() {
    return echosign_dev1__PreferFax__c;
  }

  

  public void setEchosign_dev1__PreferFax__c(java.lang.Boolean echosign_dev1__PreferFax__c) {
    this.echosign_dev1__PreferFax__c = echosign_dev1__PreferFax__c;
    echosign_dev1__PreferFax__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Process_Template__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Process_Template__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Process_Template__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Process_Template__c__is_set = false;

  private java.lang.String echosign_dev1__Process_Template__c;

  public java.lang.String getEchosign_dev1__Process_Template__c() {
    return echosign_dev1__Process_Template__c;
  }

  

  public void setEchosign_dev1__Process_Template__c(java.lang.String echosign_dev1__Process_Template__c) {
    this.echosign_dev1__Process_Template__c = echosign_dev1__Process_Template__c;
    echosign_dev1__Process_Template__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Process_Template__r of type {urn:sobject.enterprise.soap.sforce.com}echosign_dev1__SIGN_Data_Mapping__c
   * java type: com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Data_Mapping__c
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Process_Template__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Process_Template__r","urn:sobject.enterprise.soap.sforce.com","echosign_dev1__SIGN_Data_Mapping__c",0,1,true);

  private boolean echosign_dev1__Process_Template__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Data_Mapping__c echosign_dev1__Process_Template__r;

  public com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Data_Mapping__c getEchosign_dev1__Process_Template__r() {
    return echosign_dev1__Process_Template__r;
  }

  

  public void setEchosign_dev1__Process_Template__r(com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Data_Mapping__c echosign_dev1__Process_Template__r) {
    this.echosign_dev1__Process_Template__r = echosign_dev1__Process_Template__r;
    echosign_dev1__Process_Template__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Rebuild_Recipient_List__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Rebuild_Recipient_List__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Rebuild_Recipient_List__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__Rebuild_Recipient_List__c__is_set = false;

  private java.lang.Boolean echosign_dev1__Rebuild_Recipient_List__c;

  public java.lang.Boolean getEchosign_dev1__Rebuild_Recipient_List__c() {
    return echosign_dev1__Rebuild_Recipient_List__c;
  }

  

  public void setEchosign_dev1__Rebuild_Recipient_List__c(java.lang.Boolean echosign_dev1__Rebuild_Recipient_List__c) {
    this.echosign_dev1__Rebuild_Recipient_List__c = echosign_dev1__Rebuild_Recipient_List__c;
    echosign_dev1__Rebuild_Recipient_List__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient2__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient2__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient2__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient2__c;

  public java.lang.String getEchosign_dev1__Recipient2__c() {
    return echosign_dev1__Recipient2__c;
  }

  

  public void setEchosign_dev1__Recipient2__c(java.lang.String echosign_dev1__Recipient2__c) {
    this.echosign_dev1__Recipient2__c = echosign_dev1__Recipient2__c;
    echosign_dev1__Recipient2__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient2__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient2__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean echosign_dev1__Recipient2__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient2__r;

  public com.sforce.soap.enterprise.sobject.Contact getEchosign_dev1__Recipient2__r() {
    return echosign_dev1__Recipient2__r;
  }

  

  public void setEchosign_dev1__Recipient2__r(com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient2__r) {
    this.echosign_dev1__Recipient2__r = echosign_dev1__Recipient2__r;
    echosign_dev1__Recipient2__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient3__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient3__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient3__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient3__c;

  public java.lang.String getEchosign_dev1__Recipient3__c() {
    return echosign_dev1__Recipient3__c;
  }

  

  public void setEchosign_dev1__Recipient3__c(java.lang.String echosign_dev1__Recipient3__c) {
    this.echosign_dev1__Recipient3__c = echosign_dev1__Recipient3__c;
    echosign_dev1__Recipient3__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient3__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient3__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient3__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean echosign_dev1__Recipient3__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient3__r;

  public com.sforce.soap.enterprise.sobject.Contact getEchosign_dev1__Recipient3__r() {
    return echosign_dev1__Recipient3__r;
  }

  

  public void setEchosign_dev1__Recipient3__r(com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient3__r) {
    this.echosign_dev1__Recipient3__r = echosign_dev1__Recipient3__r;
    echosign_dev1__Recipient3__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient4__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient4__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient4__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient4__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient4__c;

  public java.lang.String getEchosign_dev1__Recipient4__c() {
    return echosign_dev1__Recipient4__c;
  }

  

  public void setEchosign_dev1__Recipient4__c(java.lang.String echosign_dev1__Recipient4__c) {
    this.echosign_dev1__Recipient4__c = echosign_dev1__Recipient4__c;
    echosign_dev1__Recipient4__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient4__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient4__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient4__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean echosign_dev1__Recipient4__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient4__r;

  public com.sforce.soap.enterprise.sobject.Contact getEchosign_dev1__Recipient4__r() {
    return echosign_dev1__Recipient4__r;
  }

  

  public void setEchosign_dev1__Recipient4__r(com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient4__r) {
    this.echosign_dev1__Recipient4__r = echosign_dev1__Recipient4__r;
    echosign_dev1__Recipient4__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Addresses__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Addresses__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Addresses__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Recipient_Addresses__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient_Addresses__c;

  public java.lang.String getEchosign_dev1__Recipient_Addresses__c() {
    return echosign_dev1__Recipient_Addresses__c;
  }

  

  public void setEchosign_dev1__Recipient_Addresses__c(java.lang.String echosign_dev1__Recipient_Addresses__c) {
    this.echosign_dev1__Recipient_Addresses__c = echosign_dev1__Recipient_Addresses__c;
    echosign_dev1__Recipient_Addresses__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead2__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead2__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient_Lead2__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient_Lead2__c;

  public java.lang.String getEchosign_dev1__Recipient_Lead2__c() {
    return echosign_dev1__Recipient_Lead2__c;
  }

  

  public void setEchosign_dev1__Recipient_Lead2__c(java.lang.String echosign_dev1__Recipient_Lead2__c) {
    this.echosign_dev1__Recipient_Lead2__c = echosign_dev1__Recipient_Lead2__c;
    echosign_dev1__Recipient_Lead2__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead2__r of type {urn:sobject.enterprise.soap.sforce.com}Lead
   * java type: com.sforce.soap.enterprise.sobject.Lead
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead2__r","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

  private boolean echosign_dev1__Recipient_Lead2__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead2__r;

  public com.sforce.soap.enterprise.sobject.Lead getEchosign_dev1__Recipient_Lead2__r() {
    return echosign_dev1__Recipient_Lead2__r;
  }

  

  public void setEchosign_dev1__Recipient_Lead2__r(com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead2__r) {
    this.echosign_dev1__Recipient_Lead2__r = echosign_dev1__Recipient_Lead2__r;
    echosign_dev1__Recipient_Lead2__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead3__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead3__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient_Lead3__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient_Lead3__c;

  public java.lang.String getEchosign_dev1__Recipient_Lead3__c() {
    return echosign_dev1__Recipient_Lead3__c;
  }

  

  public void setEchosign_dev1__Recipient_Lead3__c(java.lang.String echosign_dev1__Recipient_Lead3__c) {
    this.echosign_dev1__Recipient_Lead3__c = echosign_dev1__Recipient_Lead3__c;
    echosign_dev1__Recipient_Lead3__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead3__r of type {urn:sobject.enterprise.soap.sforce.com}Lead
   * java type: com.sforce.soap.enterprise.sobject.Lead
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead3__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead3__r","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

  private boolean echosign_dev1__Recipient_Lead3__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead3__r;

  public com.sforce.soap.enterprise.sobject.Lead getEchosign_dev1__Recipient_Lead3__r() {
    return echosign_dev1__Recipient_Lead3__r;
  }

  

  public void setEchosign_dev1__Recipient_Lead3__r(com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead3__r) {
    this.echosign_dev1__Recipient_Lead3__r = echosign_dev1__Recipient_Lead3__r;
    echosign_dev1__Recipient_Lead3__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead4__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead4__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead4__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient_Lead4__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient_Lead4__c;

  public java.lang.String getEchosign_dev1__Recipient_Lead4__c() {
    return echosign_dev1__Recipient_Lead4__c;
  }

  

  public void setEchosign_dev1__Recipient_Lead4__c(java.lang.String echosign_dev1__Recipient_Lead4__c) {
    this.echosign_dev1__Recipient_Lead4__c = echosign_dev1__Recipient_Lead4__c;
    echosign_dev1__Recipient_Lead4__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead4__r of type {urn:sobject.enterprise.soap.sforce.com}Lead
   * java type: com.sforce.soap.enterprise.sobject.Lead
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead4__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead4__r","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

  private boolean echosign_dev1__Recipient_Lead4__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead4__r;

  public com.sforce.soap.enterprise.sobject.Lead getEchosign_dev1__Recipient_Lead4__r() {
    return echosign_dev1__Recipient_Lead4__r;
  }

  

  public void setEchosign_dev1__Recipient_Lead4__r(com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead4__r) {
    this.echosign_dev1__Recipient_Lead4__r = echosign_dev1__Recipient_Lead4__r;
    echosign_dev1__Recipient_Lead4__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient_Lead__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient_Lead__c;

  public java.lang.String getEchosign_dev1__Recipient_Lead__c() {
    return echosign_dev1__Recipient_Lead__c;
  }

  

  public void setEchosign_dev1__Recipient_Lead__c(java.lang.String echosign_dev1__Recipient_Lead__c) {
    this.echosign_dev1__Recipient_Lead__c = echosign_dev1__Recipient_Lead__c;
    echosign_dev1__Recipient_Lead__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Lead__r of type {urn:sobject.enterprise.soap.sforce.com}Lead
   * java type: com.sforce.soap.enterprise.sobject.Lead
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Lead__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Lead__r","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

  private boolean echosign_dev1__Recipient_Lead__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead__r;

  public com.sforce.soap.enterprise.sobject.Lead getEchosign_dev1__Recipient_Lead__r() {
    return echosign_dev1__Recipient_Lead__r;
  }

  

  public void setEchosign_dev1__Recipient_Lead__r(com.sforce.soap.enterprise.sobject.Lead echosign_dev1__Recipient_Lead__r) {
    this.echosign_dev1__Recipient_Lead__r = echosign_dev1__Recipient_Lead__r;
    echosign_dev1__Recipient_Lead__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_Signing_Order__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Signing_Order__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Signing_Order__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Recipient_Signing_Order__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient_Signing_Order__c;

  public java.lang.String getEchosign_dev1__Recipient_Signing_Order__c() {
    return echosign_dev1__Recipient_Signing_Order__c;
  }

  

  public void setEchosign_dev1__Recipient_Signing_Order__c(java.lang.String echosign_dev1__Recipient_Signing_Order__c) {
    this.echosign_dev1__Recipient_Signing_Order__c = echosign_dev1__Recipient_Signing_Order__c;
    echosign_dev1__Recipient_Signing_Order__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_User__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient_User__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient_User__c;

  public java.lang.String getEchosign_dev1__Recipient_User__c() {
    return echosign_dev1__Recipient_User__c;
  }

  

  public void setEchosign_dev1__Recipient_User__c(java.lang.String echosign_dev1__Recipient_User__c) {
    this.echosign_dev1__Recipient_User__c = echosign_dev1__Recipient_User__c;
    echosign_dev1__Recipient_User__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient_User__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_User__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_User__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean echosign_dev1__Recipient_User__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User echosign_dev1__Recipient_User__r;

  public com.sforce.soap.enterprise.sobject.User getEchosign_dev1__Recipient_User__r() {
    return echosign_dev1__Recipient_User__r;
  }

  

  public void setEchosign_dev1__Recipient_User__r(com.sforce.soap.enterprise.sobject.User echosign_dev1__Recipient_User__r) {
    this.echosign_dev1__Recipient_User__r = echosign_dev1__Recipient_User__r;
    echosign_dev1__Recipient_User__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Recipient__c__is_set = false;

  private java.lang.String echosign_dev1__Recipient__c;

  public java.lang.String getEchosign_dev1__Recipient__c() {
    return echosign_dev1__Recipient__c;
  }

  

  public void setEchosign_dev1__Recipient__c(java.lang.String echosign_dev1__Recipient__c) {
    this.echosign_dev1__Recipient__c = echosign_dev1__Recipient__c;
    echosign_dev1__Recipient__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Recipient__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean echosign_dev1__Recipient__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient__r;

  public com.sforce.soap.enterprise.sobject.Contact getEchosign_dev1__Recipient__r() {
    return echosign_dev1__Recipient__r;
  }

  

  public void setEchosign_dev1__Recipient__r(com.sforce.soap.enterprise.sobject.Contact echosign_dev1__Recipient__r) {
    this.echosign_dev1__Recipient__r = echosign_dev1__Recipient__r;
    echosign_dev1__Recipient__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__RemindRecipient__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__RemindRecipient__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__RemindRecipient__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__RemindRecipient__c__is_set = false;

  private java.lang.String echosign_dev1__RemindRecipient__c;

  public java.lang.String getEchosign_dev1__RemindRecipient__c() {
    return echosign_dev1__RemindRecipient__c;
  }

  

  public void setEchosign_dev1__RemindRecipient__c(java.lang.String echosign_dev1__RemindRecipient__c) {
    this.echosign_dev1__RemindRecipient__c = echosign_dev1__RemindRecipient__c;
    echosign_dev1__RemindRecipient__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Result__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Result__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Result__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Result__c__is_set = false;

  private java.lang.String echosign_dev1__Result__c;

  public java.lang.String getEchosign_dev1__Result__c() {
    return echosign_dev1__Result__c;
  }

  

  public void setEchosign_dev1__Result__c(java.lang.String echosign_dev1__Result__c) {
    this.echosign_dev1__Result__c = echosign_dev1__Result__c;
    echosign_dev1__Result__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__ReturnURL_Text__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__ReturnURL_Text__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__ReturnURL_Text__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__ReturnURL_Text__c__is_set = false;

  private java.lang.String echosign_dev1__ReturnURL_Text__c;

  public java.lang.String getEchosign_dev1__ReturnURL_Text__c() {
    return echosign_dev1__ReturnURL_Text__c;
  }

  

  public void setEchosign_dev1__ReturnURL_Text__c(java.lang.String echosign_dev1__ReturnURL_Text__c) {
    this.echosign_dev1__ReturnURL_Text__c = echosign_dev1__ReturnURL_Text__c;
    echosign_dev1__ReturnURL_Text__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__ReturnURL__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__ReturnURL__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__ReturnURL__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__ReturnURL__c__is_set = false;

  private java.lang.String echosign_dev1__ReturnURL__c;

  public java.lang.String getEchosign_dev1__ReturnURL__c() {
    return echosign_dev1__ReturnURL__c;
  }

  

  public void setEchosign_dev1__ReturnURL__c(java.lang.String echosign_dev1__ReturnURL__c) {
    this.echosign_dev1__ReturnURL__c = echosign_dev1__ReturnURL__c;
    echosign_dev1__ReturnURL__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__SenderSigns__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__SenderSigns__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__SenderSigns__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__SenderSigns__c__is_set = false;

  private java.lang.Boolean echosign_dev1__SenderSigns__c;

  public java.lang.Boolean getEchosign_dev1__SenderSigns__c() {
    return echosign_dev1__SenderSigns__c;
  }

  

  public void setEchosign_dev1__SenderSigns__c(java.lang.Boolean echosign_dev1__SenderSigns__c) {
    this.echosign_dev1__SenderSigns__c = echosign_dev1__SenderSigns__c;
    echosign_dev1__SenderSigns__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Sender_User__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Sender_User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Sender_User__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean echosign_dev1__Sender_User__c__is_set = false;

  private java.lang.String echosign_dev1__Sender_User__c;

  public java.lang.String getEchosign_dev1__Sender_User__c() {
    return echosign_dev1__Sender_User__c;
  }

  

  public void setEchosign_dev1__Sender_User__c(java.lang.String echosign_dev1__Sender_User__c) {
    this.echosign_dev1__Sender_User__c = echosign_dev1__Sender_User__c;
    echosign_dev1__Sender_User__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Sender_User__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Sender_User__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Sender_User__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean echosign_dev1__Sender_User__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User echosign_dev1__Sender_User__r;

  public com.sforce.soap.enterprise.sobject.User getEchosign_dev1__Sender_User__r() {
    return echosign_dev1__Sender_User__r;
  }

  

  public void setEchosign_dev1__Sender_User__r(com.sforce.soap.enterprise.sobject.User echosign_dev1__Sender_User__r) {
    this.echosign_dev1__Sender_User__r = echosign_dev1__Sender_User__r;
    echosign_dev1__Sender_User__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__SignatureOrder__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__SignatureOrder__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__SignatureOrder__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__SignatureOrder__c__is_set = false;

  private java.lang.String echosign_dev1__SignatureOrder__c;

  public java.lang.String getEchosign_dev1__SignatureOrder__c() {
    return echosign_dev1__SignatureOrder__c;
  }

  

  public void setEchosign_dev1__SignatureOrder__c(java.lang.String echosign_dev1__SignatureOrder__c) {
    this.echosign_dev1__SignatureOrder__c = echosign_dev1__SignatureOrder__c;
    echosign_dev1__SignatureOrder__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__SignatureType__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__SignatureType__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__SignatureType__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__SignatureType__c__is_set = false;

  private java.lang.String echosign_dev1__SignatureType__c;

  public java.lang.String getEchosign_dev1__SignatureType__c() {
    return echosign_dev1__SignatureType__c;
  }

  

  public void setEchosign_dev1__SignatureType__c(java.lang.String echosign_dev1__SignatureType__c) {
    this.echosign_dev1__SignatureType__c = echosign_dev1__SignatureType__c;
    echosign_dev1__SignatureType__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__SignedPDF__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__SignedPDF__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__SignedPDF__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__SignedPDF__c__is_set = false;

  private java.lang.String echosign_dev1__SignedPDF__c;

  public java.lang.String getEchosign_dev1__SignedPDF__c() {
    return echosign_dev1__SignedPDF__c;
  }

  

  public void setEchosign_dev1__SignedPDF__c(java.lang.String echosign_dev1__SignedPDF__c) {
    this.echosign_dev1__SignedPDF__c = echosign_dev1__SignedPDF__c;
    echosign_dev1__SignedPDF__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Signed_Agreements__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Signed_Agreements__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Signed_Agreements__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Signed_Agreements__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Signed_Agreements__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Signed_Agreements__r() {
    return echosign_dev1__Signed_Agreements__r;
  }

  

  public void setEchosign_dev1__Signed_Agreements__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Signed_Agreements__r) {
    this.echosign_dev1__Signed_Agreements__r = echosign_dev1__Signed_Agreements__r;
    echosign_dev1__Signed_Agreements__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Signing_URL__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Signing_URL__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Signing_URL__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Signing_URL__c__is_set = false;

  private java.lang.String echosign_dev1__Signing_URL__c;

  public java.lang.String getEchosign_dev1__Signing_URL__c() {
    return echosign_dev1__Signing_URL__c;
  }

  

  public void setEchosign_dev1__Signing_URL__c(java.lang.String echosign_dev1__Signing_URL__c) {
    this.echosign_dev1__Signing_URL__c = echosign_dev1__Signing_URL__c;
    echosign_dev1__Signing_URL__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__StatusVisible__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__StatusVisible__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__StatusVisible__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__StatusVisible__c__is_set = false;

  private java.lang.String echosign_dev1__StatusVisible__c;

  public java.lang.String getEchosign_dev1__StatusVisible__c() {
    return echosign_dev1__StatusVisible__c;
  }

  

  public void setEchosign_dev1__StatusVisible__c(java.lang.String echosign_dev1__StatusVisible__c) {
    this.echosign_dev1__StatusVisible__c = echosign_dev1__StatusVisible__c;
    echosign_dev1__StatusVisible__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean echosign_dev1__Status__c__is_set = false;

  private java.lang.String echosign_dev1__Status__c;

  public java.lang.String getEchosign_dev1__Status__c() {
    return echosign_dev1__Status__c;
  }

  

  public void setEchosign_dev1__Status__c(java.lang.String echosign_dev1__Status__c) {
    this.echosign_dev1__Status__c = echosign_dev1__Status__c;
    echosign_dev1__Status__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Sync_Data_Mapping__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Sync_Data_Mapping__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Sync_Data_Mapping__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__Sync_Data_Mapping__c__is_set = false;

  private java.lang.Boolean echosign_dev1__Sync_Data_Mapping__c;

  public java.lang.Boolean getEchosign_dev1__Sync_Data_Mapping__c() {
    return echosign_dev1__Sync_Data_Mapping__c;
  }

  

  public void setEchosign_dev1__Sync_Data_Mapping__c(java.lang.Boolean echosign_dev1__Sync_Data_Mapping__c) {
    this.echosign_dev1__Sync_Data_Mapping__c = echosign_dev1__Sync_Data_Mapping__c;
    echosign_dev1__Sync_Data_Mapping__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Trigger_Process_Template__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Trigger_Process_Template__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Trigger_Process_Template__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean echosign_dev1__Trigger_Process_Template__c__is_set = false;

  private java.lang.Boolean echosign_dev1__Trigger_Process_Template__c;

  public java.lang.Boolean getEchosign_dev1__Trigger_Process_Template__c() {
    return echosign_dev1__Trigger_Process_Template__c;
  }

  

  public void setEchosign_dev1__Trigger_Process_Template__c(java.lang.Boolean echosign_dev1__Trigger_Process_Template__c) {
    this.echosign_dev1__Trigger_Process_Template__c = echosign_dev1__Trigger_Process_Template__c;
    echosign_dev1__Trigger_Process_Template__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "echosign_dev1__SIGN_Agreement__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Admin_Employee__c__typeInfo, Admin_Employee__c, Admin_Employee__c__is_set);
    __typeMapper.writeObject(__out, Admin_Employee__r__typeInfo, Admin_Employee__r, Admin_Employee__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, Contact__c__typeInfo, Contact__c, Contact__c__is_set);
    __typeMapper.writeObject(__out, Contact__r__typeInfo, Contact__r, Contact__r__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeString(__out, Employee__c__typeInfo, Employee__c, Employee__c__is_set);
    __typeMapper.writeObject(__out, Employee__r__typeInfo, Employee__r, Employee__r__is_set);
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
    __typeMapper.writeString(__out, echosign_dev1__Account__c__typeInfo, echosign_dev1__Account__c, echosign_dev1__Account__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Account__r__typeInfo, echosign_dev1__Account__r, echosign_dev1__Account__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__AdditionalOptions__c__typeInfo, echosign_dev1__AdditionalOptions__c, echosign_dev1__AdditionalOptions__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Additional_Recipient_1_User__c__typeInfo, echosign_dev1__Additional_Recipient_1_User__c, echosign_dev1__Additional_Recipient_1_User__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Additional_Recipient_1_User__r__typeInfo, echosign_dev1__Additional_Recipient_1_User__r, echosign_dev1__Additional_Recipient_1_User__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Additional_Recipient_2_User__c__typeInfo, echosign_dev1__Additional_Recipient_2_User__c, echosign_dev1__Additional_Recipient_2_User__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Additional_Recipient_2_User__r__typeInfo, echosign_dev1__Additional_Recipient_2_User__r, echosign_dev1__Additional_Recipient_2_User__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Additional_Recipient_3_User__c__typeInfo, echosign_dev1__Additional_Recipient_3_User__c, echosign_dev1__Additional_Recipient_3_User__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Additional_Recipient_3_User__r__typeInfo, echosign_dev1__Additional_Recipient_3_User__r, echosign_dev1__Additional_Recipient_3_User__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__AgreementLocale__c__typeInfo, echosign_dev1__AgreementLocale__c, echosign_dev1__AgreementLocale__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Attachment_ID_Order__c__typeInfo, echosign_dev1__Attachment_ID_Order__c, echosign_dev1__Attachment_ID_Order__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Attachment_Service_Invocation_Count__c__typeInfo, echosign_dev1__Attachment_Service_Invocation_Count__c, echosign_dev1__Attachment_Service_Invocation_Count__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Authoring__c__typeInfo, echosign_dev1__Authoring__c, echosign_dev1__Authoring__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__AutoUpdate__c__typeInfo, echosign_dev1__AutoUpdate__c, echosign_dev1__AutoUpdate__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Background_Action__c__typeInfo, echosign_dev1__Background_Action__c, echosign_dev1__Background_Action__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Cancel_Delete_Reason__c__typeInfo, echosign_dev1__Cancel_Delete_Reason__c, echosign_dev1__Cancel_Delete_Reason__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Cc__c__typeInfo, echosign_dev1__Cc__c, echosign_dev1__Cc__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Contract__c__typeInfo, echosign_dev1__Contract__c, echosign_dev1__Contract__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Contract__r__typeInfo, echosign_dev1__Contract__r, echosign_dev1__Contract__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Data_Mapping_Error__c__typeInfo, echosign_dev1__Data_Mapping_Error__c, echosign_dev1__Data_Mapping_Error__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Data_Mapping_Result__c__typeInfo, echosign_dev1__Data_Mapping_Result__c, echosign_dev1__Data_Mapping_Result__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DateSentDate__c__typeInfo, echosign_dev1__DateSentDate__c, echosign_dev1__DateSentDate__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DateSent__c__typeInfo, echosign_dev1__DateSent__c, echosign_dev1__DateSent__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DateSignedDate__c__typeInfo, echosign_dev1__DateSignedDate__c, echosign_dev1__DateSignedDate__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DateSigned__c__typeInfo, echosign_dev1__DateSigned__c, echosign_dev1__DateSigned__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DateViewedDate__c__typeInfo, echosign_dev1__DateViewedDate__c, echosign_dev1__DateViewedDate__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DateViewed__c__typeInfo, echosign_dev1__DateViewed__c, echosign_dev1__DateViewed__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DaysUnsigned__c__typeInfo, echosign_dev1__DaysUnsigned__c, echosign_dev1__DaysUnsigned__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DaysUntilSigned__c__typeInfo, echosign_dev1__DaysUntilSigned__c, echosign_dev1__DaysUntilSigned__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__DaysUntilSigningDeadline__c__typeInfo, echosign_dev1__DaysUntilSigningDeadline__c, echosign_dev1__DaysUntilSigningDeadline__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Document_Key__c__typeInfo, echosign_dev1__Document_Key__c, echosign_dev1__Document_Key__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Document__c__typeInfo, echosign_dev1__Document__c, echosign_dev1__Document__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__EchoSign_Form_Field_Imports__r__typeInfo, echosign_dev1__EchoSign_Form_Field_Imports__r, echosign_dev1__EchoSign_Form_Field_Imports__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__EchoSign_Triggers__r__typeInfo, echosign_dev1__EchoSign_Triggers__r, echosign_dev1__EchoSign_Triggers__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Echosign_Recipients__r__typeInfo, echosign_dev1__Echosign_Recipients__r, echosign_dev1__Echosign_Recipients__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Enable_Automatic_Reminders__c__typeInfo, echosign_dev1__Enable_Automatic_Reminders__c, echosign_dev1__Enable_Automatic_Reminders__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Enable_Hosted_Signing__c__typeInfo, echosign_dev1__Enable_Hosted_Signing__c, echosign_dev1__Enable_Hosted_Signing__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Enable_Revisions__c__typeInfo, echosign_dev1__Enable_Revisions__c, echosign_dev1__Enable_Revisions__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__EncodedPassword__c__typeInfo, echosign_dev1__EncodedPassword__c, echosign_dev1__EncodedPassword__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__ErrorMessage__c__typeInfo, echosign_dev1__ErrorMessage__c, echosign_dev1__ErrorMessage__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__External_Signers_Verification_Method__c__typeInfo, echosign_dev1__External_Signers_Verification_Method__c, echosign_dev1__External_Signers_Verification_Method__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Internal_Signers_Verification_Method__c__typeInfo, echosign_dev1__Internal_Signers_Verification_Method__c, echosign_dev1__Internal_Signers_Verification_Method__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__LastEventId__c__typeInfo, echosign_dev1__LastEventId__c, echosign_dev1__LastEventId__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Legacy_Record_ID__c__typeInfo, echosign_dev1__Legacy_Record_ID__c, echosign_dev1__Legacy_Record_ID__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Merge_Mapping_Error__c__typeInfo, echosign_dev1__Merge_Mapping_Error__c, echosign_dev1__Merge_Mapping_Error__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Merge_Mapping_Result__c__typeInfo, echosign_dev1__Merge_Mapping_Result__c, echosign_dev1__Merge_Mapping_Result__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Merge_Mapping__c__typeInfo, echosign_dev1__Merge_Mapping__c, echosign_dev1__Merge_Mapping__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Merge_Mapping__r__typeInfo, echosign_dev1__Merge_Mapping__r, echosign_dev1__Merge_Mapping__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Merge__c__typeInfo, echosign_dev1__Merge__c, echosign_dev1__Merge__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Message__c__typeInfo, echosign_dev1__Message__c, echosign_dev1__Message__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Minutes_Until_Signed__c__typeInfo, echosign_dev1__Minutes_Until_Signed__c, echosign_dev1__Minutes_Until_Signed__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__More_Recipients__c__typeInfo, echosign_dev1__More_Recipients__c, echosign_dev1__More_Recipients__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Name__r__typeInfo, echosign_dev1__Name__r, echosign_dev1__Name__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__NewPassword__c__typeInfo, echosign_dev1__NewPassword__c, echosign_dev1__NewPassword__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__On_Load_Action__c__typeInfo, echosign_dev1__On_Load_Action__c, echosign_dev1__On_Load_Action__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Opportunity__c__typeInfo, echosign_dev1__Opportunity__c, echosign_dev1__Opportunity__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Opportunity__r__typeInfo, echosign_dev1__Opportunity__r, echosign_dev1__Opportunity__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Partner_Server_URL__c__typeInfo, echosign_dev1__Partner_Server_URL__c, echosign_dev1__Partner_Server_URL__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__PasswordProtectPDF__c__typeInfo, echosign_dev1__PasswordProtectPDF__c, echosign_dev1__PasswordProtectPDF__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__PasswordProtectSign__c__typeInfo, echosign_dev1__PasswordProtectSign__c, echosign_dev1__PasswordProtectSign__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Password__c__typeInfo, echosign_dev1__Password__c, echosign_dev1__Password__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Percent_Signed__c__typeInfo, echosign_dev1__Percent_Signed__c, echosign_dev1__Percent_Signed__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__PreferFax__c__typeInfo, echosign_dev1__PreferFax__c, echosign_dev1__PreferFax__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Process_Template__c__typeInfo, echosign_dev1__Process_Template__c, echosign_dev1__Process_Template__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Process_Template__r__typeInfo, echosign_dev1__Process_Template__r, echosign_dev1__Process_Template__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Rebuild_Recipient_List__c__typeInfo, echosign_dev1__Rebuild_Recipient_List__c, echosign_dev1__Rebuild_Recipient_List__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient2__c__typeInfo, echosign_dev1__Recipient2__c, echosign_dev1__Recipient2__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient2__r__typeInfo, echosign_dev1__Recipient2__r, echosign_dev1__Recipient2__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient3__c__typeInfo, echosign_dev1__Recipient3__c, echosign_dev1__Recipient3__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient3__r__typeInfo, echosign_dev1__Recipient3__r, echosign_dev1__Recipient3__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient4__c__typeInfo, echosign_dev1__Recipient4__c, echosign_dev1__Recipient4__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient4__r__typeInfo, echosign_dev1__Recipient4__r, echosign_dev1__Recipient4__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient_Addresses__c__typeInfo, echosign_dev1__Recipient_Addresses__c, echosign_dev1__Recipient_Addresses__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient_Lead2__c__typeInfo, echosign_dev1__Recipient_Lead2__c, echosign_dev1__Recipient_Lead2__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient_Lead2__r__typeInfo, echosign_dev1__Recipient_Lead2__r, echosign_dev1__Recipient_Lead2__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient_Lead3__c__typeInfo, echosign_dev1__Recipient_Lead3__c, echosign_dev1__Recipient_Lead3__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient_Lead3__r__typeInfo, echosign_dev1__Recipient_Lead3__r, echosign_dev1__Recipient_Lead3__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient_Lead4__c__typeInfo, echosign_dev1__Recipient_Lead4__c, echosign_dev1__Recipient_Lead4__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient_Lead4__r__typeInfo, echosign_dev1__Recipient_Lead4__r, echosign_dev1__Recipient_Lead4__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient_Lead__c__typeInfo, echosign_dev1__Recipient_Lead__c, echosign_dev1__Recipient_Lead__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient_Lead__r__typeInfo, echosign_dev1__Recipient_Lead__r, echosign_dev1__Recipient_Lead__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient_Signing_Order__c__typeInfo, echosign_dev1__Recipient_Signing_Order__c, echosign_dev1__Recipient_Signing_Order__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient_User__c__typeInfo, echosign_dev1__Recipient_User__c, echosign_dev1__Recipient_User__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient_User__r__typeInfo, echosign_dev1__Recipient_User__r, echosign_dev1__Recipient_User__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Recipient__c__typeInfo, echosign_dev1__Recipient__c, echosign_dev1__Recipient__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient__r__typeInfo, echosign_dev1__Recipient__r, echosign_dev1__Recipient__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__RemindRecipient__c__typeInfo, echosign_dev1__RemindRecipient__c, echosign_dev1__RemindRecipient__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Result__c__typeInfo, echosign_dev1__Result__c, echosign_dev1__Result__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__ReturnURL_Text__c__typeInfo, echosign_dev1__ReturnURL_Text__c, echosign_dev1__ReturnURL_Text__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__ReturnURL__c__typeInfo, echosign_dev1__ReturnURL__c, echosign_dev1__ReturnURL__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__SenderSigns__c__typeInfo, echosign_dev1__SenderSigns__c, echosign_dev1__SenderSigns__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Sender_User__c__typeInfo, echosign_dev1__Sender_User__c, echosign_dev1__Sender_User__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Sender_User__r__typeInfo, echosign_dev1__Sender_User__r, echosign_dev1__Sender_User__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__SignatureOrder__c__typeInfo, echosign_dev1__SignatureOrder__c, echosign_dev1__SignatureOrder__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__SignatureType__c__typeInfo, echosign_dev1__SignatureType__c, echosign_dev1__SignatureType__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__SignedPDF__c__typeInfo, echosign_dev1__SignedPDF__c, echosign_dev1__SignedPDF__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Signed_Agreements__r__typeInfo, echosign_dev1__Signed_Agreements__r, echosign_dev1__Signed_Agreements__r__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Signing_URL__c__typeInfo, echosign_dev1__Signing_URL__c, echosign_dev1__Signing_URL__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__StatusVisible__c__typeInfo, echosign_dev1__StatusVisible__c, echosign_dev1__StatusVisible__c__is_set);
    __typeMapper.writeString(__out, echosign_dev1__Status__c__typeInfo, echosign_dev1__Status__c, echosign_dev1__Status__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Sync_Data_Mapping__c__typeInfo, echosign_dev1__Sync_Data_Mapping__c, echosign_dev1__Sync_Data_Mapping__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Trigger_Process_Template__c__typeInfo, echosign_dev1__Trigger_Process_Template__c, echosign_dev1__Trigger_Process_Template__c__is_set);
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
    if (__typeMapper.isElement(__in, Admin_Employee__c__typeInfo)) {
      setAdmin_Employee__c((java.lang.String)__typeMapper.readString(__in, Admin_Employee__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Admin_Employee__r__typeInfo)) {
      setAdmin_Employee__r((com.sforce.soap.enterprise.sobject.SFDC_Employee__c)__typeMapper.readObject(__in, Admin_Employee__r__typeInfo, com.sforce.soap.enterprise.sobject.SFDC_Employee__c.class));
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
    if (__typeMapper.isElement(__in, Contact__c__typeInfo)) {
      setContact__c((java.lang.String)__typeMapper.readString(__in, Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contact__r__typeInfo)) {
      setContact__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, Contact__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
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
    if (__typeMapper.isElement(__in, Employee__c__typeInfo)) {
      setEmployee__c((java.lang.String)__typeMapper.readString(__in, Employee__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee__r__typeInfo)) {
      setEmployee__r((com.sforce.soap.enterprise.sobject.Candidate_Employee__c)__typeMapper.readObject(__in, Employee__r__typeInfo, com.sforce.soap.enterprise.sobject.Candidate_Employee__c.class));
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
    if (__typeMapper.isElement(__in, echosign_dev1__Account__c__typeInfo)) {
      setEchosign_dev1__Account__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Account__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Account__r__typeInfo)) {
      setEchosign_dev1__Account__r((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, echosign_dev1__Account__r__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__AdditionalOptions__c__typeInfo)) {
      setEchosign_dev1__AdditionalOptions__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__AdditionalOptions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Additional_Recipient_1_User__c__typeInfo)) {
      setEchosign_dev1__Additional_Recipient_1_User__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Additional_Recipient_1_User__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Additional_Recipient_1_User__r__typeInfo)) {
      setEchosign_dev1__Additional_Recipient_1_User__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, echosign_dev1__Additional_Recipient_1_User__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Additional_Recipient_2_User__c__typeInfo)) {
      setEchosign_dev1__Additional_Recipient_2_User__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Additional_Recipient_2_User__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Additional_Recipient_2_User__r__typeInfo)) {
      setEchosign_dev1__Additional_Recipient_2_User__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, echosign_dev1__Additional_Recipient_2_User__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Additional_Recipient_3_User__c__typeInfo)) {
      setEchosign_dev1__Additional_Recipient_3_User__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Additional_Recipient_3_User__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Additional_Recipient_3_User__r__typeInfo)) {
      setEchosign_dev1__Additional_Recipient_3_User__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, echosign_dev1__Additional_Recipient_3_User__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__AgreementLocale__c__typeInfo)) {
      setEchosign_dev1__AgreementLocale__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__AgreementLocale__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Attachment_ID_Order__c__typeInfo)) {
      setEchosign_dev1__Attachment_ID_Order__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Attachment_ID_Order__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Attachment_Service_Invocation_Count__c__typeInfo)) {
      setEchosign_dev1__Attachment_Service_Invocation_Count__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Attachment_Service_Invocation_Count__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Authoring__c__typeInfo)) {
      setEchosign_dev1__Authoring__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__Authoring__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__AutoUpdate__c__typeInfo)) {
      setEchosign_dev1__AutoUpdate__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__AutoUpdate__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Background_Action__c__typeInfo)) {
      setEchosign_dev1__Background_Action__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Background_Action__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Cancel_Delete_Reason__c__typeInfo)) {
      setEchosign_dev1__Cancel_Delete_Reason__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Cancel_Delete_Reason__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Cc__c__typeInfo)) {
      setEchosign_dev1__Cc__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Cc__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Contract__c__typeInfo)) {
      setEchosign_dev1__Contract__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Contract__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Contract__r__typeInfo)) {
      setEchosign_dev1__Contract__r((com.sforce.soap.enterprise.sobject.Contract)__typeMapper.readObject(__in, echosign_dev1__Contract__r__typeInfo, com.sforce.soap.enterprise.sobject.Contract.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Data_Mapping_Error__c__typeInfo)) {
      setEchosign_dev1__Data_Mapping_Error__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Data_Mapping_Error__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Data_Mapping_Result__c__typeInfo)) {
      setEchosign_dev1__Data_Mapping_Result__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Data_Mapping_Result__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DateSentDate__c__typeInfo)) {
      setEchosign_dev1__DateSentDate__c((java.util.Calendar)__typeMapper.readObject(__in, echosign_dev1__DateSentDate__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DateSent__c__typeInfo)) {
      setEchosign_dev1__DateSent__c((java.util.Calendar)__typeMapper.readObject(__in, echosign_dev1__DateSent__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DateSignedDate__c__typeInfo)) {
      setEchosign_dev1__DateSignedDate__c((java.util.Calendar)__typeMapper.readObject(__in, echosign_dev1__DateSignedDate__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DateSigned__c__typeInfo)) {
      setEchosign_dev1__DateSigned__c((java.util.Calendar)__typeMapper.readObject(__in, echosign_dev1__DateSigned__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DateViewedDate__c__typeInfo)) {
      setEchosign_dev1__DateViewedDate__c((java.util.Calendar)__typeMapper.readObject(__in, echosign_dev1__DateViewedDate__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DateViewed__c__typeInfo)) {
      setEchosign_dev1__DateViewed__c((java.util.Calendar)__typeMapper.readObject(__in, echosign_dev1__DateViewed__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DaysUnsigned__c__typeInfo)) {
      setEchosign_dev1__DaysUnsigned__c((java.lang.Double)__typeMapper.readObject(__in, echosign_dev1__DaysUnsigned__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DaysUntilSigned__c__typeInfo)) {
      setEchosign_dev1__DaysUntilSigned__c((java.lang.Double)__typeMapper.readObject(__in, echosign_dev1__DaysUntilSigned__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__DaysUntilSigningDeadline__c__typeInfo)) {
      setEchosign_dev1__DaysUntilSigningDeadline__c((java.lang.Double)__typeMapper.readObject(__in, echosign_dev1__DaysUntilSigningDeadline__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Document_Key__c__typeInfo)) {
      setEchosign_dev1__Document_Key__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Document_Key__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Document__c__typeInfo)) {
      setEchosign_dev1__Document__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Document__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__EchoSign_Form_Field_Imports__r__typeInfo)) {
      setEchosign_dev1__EchoSign_Form_Field_Imports__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__EchoSign_Form_Field_Imports__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__EchoSign_Triggers__r__typeInfo)) {
      setEchosign_dev1__EchoSign_Triggers__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__EchoSign_Triggers__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Echosign_Recipients__r__typeInfo)) {
      setEchosign_dev1__Echosign_Recipients__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Echosign_Recipients__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Enable_Automatic_Reminders__c__typeInfo)) {
      setEchosign_dev1__Enable_Automatic_Reminders__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__Enable_Automatic_Reminders__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Enable_Hosted_Signing__c__typeInfo)) {
      setEchosign_dev1__Enable_Hosted_Signing__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__Enable_Hosted_Signing__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Enable_Revisions__c__typeInfo)) {
      setEchosign_dev1__Enable_Revisions__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__Enable_Revisions__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__EncodedPassword__c__typeInfo)) {
      setEchosign_dev1__EncodedPassword__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__EncodedPassword__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__ErrorMessage__c__typeInfo)) {
      setEchosign_dev1__ErrorMessage__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__ErrorMessage__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__External_Signers_Verification_Method__c__typeInfo)) {
      setEchosign_dev1__External_Signers_Verification_Method__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__External_Signers_Verification_Method__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Internal_Signers_Verification_Method__c__typeInfo)) {
      setEchosign_dev1__Internal_Signers_Verification_Method__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Internal_Signers_Verification_Method__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__LastEventId__c__typeInfo)) {
      setEchosign_dev1__LastEventId__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__LastEventId__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Legacy_Record_ID__c__typeInfo)) {
      setEchosign_dev1__Legacy_Record_ID__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Legacy_Record_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Merge_Mapping_Error__c__typeInfo)) {
      setEchosign_dev1__Merge_Mapping_Error__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Merge_Mapping_Error__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Merge_Mapping_Result__c__typeInfo)) {
      setEchosign_dev1__Merge_Mapping_Result__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Merge_Mapping_Result__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Merge_Mapping__c__typeInfo)) {
      setEchosign_dev1__Merge_Mapping__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Merge_Mapping__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Merge_Mapping__r__typeInfo)) {
      setEchosign_dev1__Merge_Mapping__r((com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Merge_Mapping__c)__typeMapper.readObject(__in, echosign_dev1__Merge_Mapping__r__typeInfo, com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Merge_Mapping__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Merge__c__typeInfo)) {
      setEchosign_dev1__Merge__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Merge__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Message__c__typeInfo)) {
      setEchosign_dev1__Message__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Message__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Minutes_Until_Signed__c__typeInfo)) {
      setEchosign_dev1__Minutes_Until_Signed__c((java.lang.Double)__typeMapper.readObject(__in, echosign_dev1__Minutes_Until_Signed__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__More_Recipients__c__typeInfo)) {
      setEchosign_dev1__More_Recipients__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__More_Recipients__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Name__r__typeInfo)) {
      setEchosign_dev1__Name__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Name__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__NewPassword__c__typeInfo)) {
      setEchosign_dev1__NewPassword__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__NewPassword__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__On_Load_Action__c__typeInfo)) {
      setEchosign_dev1__On_Load_Action__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__On_Load_Action__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Opportunity__c__typeInfo)) {
      setEchosign_dev1__Opportunity__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Opportunity__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Opportunity__r__typeInfo)) {
      setEchosign_dev1__Opportunity__r((com.sforce.soap.enterprise.sobject.Opportunity)__typeMapper.readObject(__in, echosign_dev1__Opportunity__r__typeInfo, com.sforce.soap.enterprise.sobject.Opportunity.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Partner_Server_URL__c__typeInfo)) {
      setEchosign_dev1__Partner_Server_URL__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Partner_Server_URL__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__PasswordProtectPDF__c__typeInfo)) {
      setEchosign_dev1__PasswordProtectPDF__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__PasswordProtectPDF__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__PasswordProtectSign__c__typeInfo)) {
      setEchosign_dev1__PasswordProtectSign__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__PasswordProtectSign__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Password__c__typeInfo)) {
      setEchosign_dev1__Password__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Password__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Percent_Signed__c__typeInfo)) {
      setEchosign_dev1__Percent_Signed__c((java.lang.Double)__typeMapper.readObject(__in, echosign_dev1__Percent_Signed__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__PreferFax__c__typeInfo)) {
      setEchosign_dev1__PreferFax__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__PreferFax__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Process_Template__c__typeInfo)) {
      setEchosign_dev1__Process_Template__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Process_Template__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Process_Template__r__typeInfo)) {
      setEchosign_dev1__Process_Template__r((com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Data_Mapping__c)__typeMapper.readObject(__in, echosign_dev1__Process_Template__r__typeInfo, com.sforce.soap.enterprise.sobject.Echosign_dev1__SIGN_Data_Mapping__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Rebuild_Recipient_List__c__typeInfo)) {
      setEchosign_dev1__Rebuild_Recipient_List__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__Rebuild_Recipient_List__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient2__c__typeInfo)) {
      setEchosign_dev1__Recipient2__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient2__r__typeInfo)) {
      setEchosign_dev1__Recipient2__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, echosign_dev1__Recipient2__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient3__c__typeInfo)) {
      setEchosign_dev1__Recipient3__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient3__r__typeInfo)) {
      setEchosign_dev1__Recipient3__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, echosign_dev1__Recipient3__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient4__c__typeInfo)) {
      setEchosign_dev1__Recipient4__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient4__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient4__r__typeInfo)) {
      setEchosign_dev1__Recipient4__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, echosign_dev1__Recipient4__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Addresses__c__typeInfo)) {
      setEchosign_dev1__Recipient_Addresses__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient_Addresses__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead2__c__typeInfo)) {
      setEchosign_dev1__Recipient_Lead2__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient_Lead2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead2__r__typeInfo)) {
      setEchosign_dev1__Recipient_Lead2__r((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, echosign_dev1__Recipient_Lead2__r__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead3__c__typeInfo)) {
      setEchosign_dev1__Recipient_Lead3__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient_Lead3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead3__r__typeInfo)) {
      setEchosign_dev1__Recipient_Lead3__r((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, echosign_dev1__Recipient_Lead3__r__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead4__c__typeInfo)) {
      setEchosign_dev1__Recipient_Lead4__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient_Lead4__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead4__r__typeInfo)) {
      setEchosign_dev1__Recipient_Lead4__r((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, echosign_dev1__Recipient_Lead4__r__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead__c__typeInfo)) {
      setEchosign_dev1__Recipient_Lead__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient_Lead__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Lead__r__typeInfo)) {
      setEchosign_dev1__Recipient_Lead__r((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, echosign_dev1__Recipient_Lead__r__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Signing_Order__c__typeInfo)) {
      setEchosign_dev1__Recipient_Signing_Order__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient_Signing_Order__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_User__c__typeInfo)) {
      setEchosign_dev1__Recipient_User__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient_User__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_User__r__typeInfo)) {
      setEchosign_dev1__Recipient_User__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, echosign_dev1__Recipient_User__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient__c__typeInfo)) {
      setEchosign_dev1__Recipient__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Recipient__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient__r__typeInfo)) {
      setEchosign_dev1__Recipient__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, echosign_dev1__Recipient__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__RemindRecipient__c__typeInfo)) {
      setEchosign_dev1__RemindRecipient__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__RemindRecipient__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Result__c__typeInfo)) {
      setEchosign_dev1__Result__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Result__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__ReturnURL_Text__c__typeInfo)) {
      setEchosign_dev1__ReturnURL_Text__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__ReturnURL_Text__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__ReturnURL__c__typeInfo)) {
      setEchosign_dev1__ReturnURL__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__ReturnURL__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__SenderSigns__c__typeInfo)) {
      setEchosign_dev1__SenderSigns__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__SenderSigns__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Sender_User__c__typeInfo)) {
      setEchosign_dev1__Sender_User__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Sender_User__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Sender_User__r__typeInfo)) {
      setEchosign_dev1__Sender_User__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, echosign_dev1__Sender_User__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__SignatureOrder__c__typeInfo)) {
      setEchosign_dev1__SignatureOrder__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__SignatureOrder__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__SignatureType__c__typeInfo)) {
      setEchosign_dev1__SignatureType__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__SignatureType__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__SignedPDF__c__typeInfo)) {
      setEchosign_dev1__SignedPDF__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__SignedPDF__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Signed_Agreements__r__typeInfo)) {
      setEchosign_dev1__Signed_Agreements__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Signed_Agreements__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Signing_URL__c__typeInfo)) {
      setEchosign_dev1__Signing_URL__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Signing_URL__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__StatusVisible__c__typeInfo)) {
      setEchosign_dev1__StatusVisible__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__StatusVisible__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Status__c__typeInfo)) {
      setEchosign_dev1__Status__c((java.lang.String)__typeMapper.readString(__in, echosign_dev1__Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Sync_Data_Mapping__c__typeInfo)) {
      setEchosign_dev1__Sync_Data_Mapping__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__Sync_Data_Mapping__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Trigger_Process_Template__c__typeInfo)) {
      setEchosign_dev1__Trigger_Process_Template__c((java.lang.Boolean)__typeMapper.readObject(__in, echosign_dev1__Trigger_Process_Template__c__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Echosign_dev1__SIGN_Agreement__c ");
    sb.append(super.toString());
    sb.append(" Admin_Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Admin_Employee__c)+"'\n");
    sb.append(" Admin_Employee__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Admin_Employee__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact__c)+"'\n");
    sb.append(" Contact__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact__r)+"'\n");
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
    sb.append(" Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee__c)+"'\n");
    sb.append(" Employee__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee__r)+"'\n");
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
    sb.append(" echosign_dev1__Account__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Account__c)+"'\n");
    sb.append(" echosign_dev1__Account__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Account__r)+"'\n");
    sb.append(" echosign_dev1__AdditionalOptions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__AdditionalOptions__c)+"'\n");
    sb.append(" echosign_dev1__Additional_Recipient_1_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Additional_Recipient_1_User__c)+"'\n");
    sb.append(" echosign_dev1__Additional_Recipient_1_User__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Additional_Recipient_1_User__r)+"'\n");
    sb.append(" echosign_dev1__Additional_Recipient_2_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Additional_Recipient_2_User__c)+"'\n");
    sb.append(" echosign_dev1__Additional_Recipient_2_User__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Additional_Recipient_2_User__r)+"'\n");
    sb.append(" echosign_dev1__Additional_Recipient_3_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Additional_Recipient_3_User__c)+"'\n");
    sb.append(" echosign_dev1__Additional_Recipient_3_User__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Additional_Recipient_3_User__r)+"'\n");
    sb.append(" echosign_dev1__AgreementLocale__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__AgreementLocale__c)+"'\n");
    sb.append(" echosign_dev1__Attachment_ID_Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Attachment_ID_Order__c)+"'\n");
    sb.append(" echosign_dev1__Attachment_Service_Invocation_Count__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Attachment_Service_Invocation_Count__c)+"'\n");
    sb.append(" echosign_dev1__Authoring__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Authoring__c)+"'\n");
    sb.append(" echosign_dev1__AutoUpdate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__AutoUpdate__c)+"'\n");
    sb.append(" echosign_dev1__Background_Action__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Background_Action__c)+"'\n");
    sb.append(" echosign_dev1__Cancel_Delete_Reason__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Cancel_Delete_Reason__c)+"'\n");
    sb.append(" echosign_dev1__Cc__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Cc__c)+"'\n");
    sb.append(" echosign_dev1__Contract__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Contract__c)+"'\n");
    sb.append(" echosign_dev1__Contract__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Contract__r)+"'\n");
    sb.append(" echosign_dev1__Data_Mapping_Error__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Data_Mapping_Error__c)+"'\n");
    sb.append(" echosign_dev1__Data_Mapping_Result__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Data_Mapping_Result__c)+"'\n");
    sb.append(" echosign_dev1__DateSentDate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DateSentDate__c)+"'\n");
    sb.append(" echosign_dev1__DateSent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DateSent__c)+"'\n");
    sb.append(" echosign_dev1__DateSignedDate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DateSignedDate__c)+"'\n");
    sb.append(" echosign_dev1__DateSigned__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DateSigned__c)+"'\n");
    sb.append(" echosign_dev1__DateViewedDate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DateViewedDate__c)+"'\n");
    sb.append(" echosign_dev1__DateViewed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DateViewed__c)+"'\n");
    sb.append(" echosign_dev1__DaysUnsigned__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DaysUnsigned__c)+"'\n");
    sb.append(" echosign_dev1__DaysUntilSigned__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DaysUntilSigned__c)+"'\n");
    sb.append(" echosign_dev1__DaysUntilSigningDeadline__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__DaysUntilSigningDeadline__c)+"'\n");
    sb.append(" echosign_dev1__Document_Key__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Document_Key__c)+"'\n");
    sb.append(" echosign_dev1__Document__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Document__c)+"'\n");
    sb.append(" echosign_dev1__EchoSign_Form_Field_Imports__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__EchoSign_Form_Field_Imports__r)+"'\n");
    sb.append(" echosign_dev1__EchoSign_Triggers__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__EchoSign_Triggers__r)+"'\n");
    sb.append(" echosign_dev1__Echosign_Recipients__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Echosign_Recipients__r)+"'\n");
    sb.append(" echosign_dev1__Enable_Automatic_Reminders__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Enable_Automatic_Reminders__c)+"'\n");
    sb.append(" echosign_dev1__Enable_Hosted_Signing__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Enable_Hosted_Signing__c)+"'\n");
    sb.append(" echosign_dev1__Enable_Revisions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Enable_Revisions__c)+"'\n");
    sb.append(" echosign_dev1__EncodedPassword__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__EncodedPassword__c)+"'\n");
    sb.append(" echosign_dev1__ErrorMessage__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__ErrorMessage__c)+"'\n");
    sb.append(" echosign_dev1__External_Signers_Verification_Method__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__External_Signers_Verification_Method__c)+"'\n");
    sb.append(" echosign_dev1__Internal_Signers_Verification_Method__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Internal_Signers_Verification_Method__c)+"'\n");
    sb.append(" echosign_dev1__LastEventId__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__LastEventId__c)+"'\n");
    sb.append(" echosign_dev1__Legacy_Record_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Legacy_Record_ID__c)+"'\n");
    sb.append(" echosign_dev1__Merge_Mapping_Error__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Merge_Mapping_Error__c)+"'\n");
    sb.append(" echosign_dev1__Merge_Mapping_Result__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Merge_Mapping_Result__c)+"'\n");
    sb.append(" echosign_dev1__Merge_Mapping__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Merge_Mapping__c)+"'\n");
    sb.append(" echosign_dev1__Merge_Mapping__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Merge_Mapping__r)+"'\n");
    sb.append(" echosign_dev1__Merge__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Merge__c)+"'\n");
    sb.append(" echosign_dev1__Message__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Message__c)+"'\n");
    sb.append(" echosign_dev1__Minutes_Until_Signed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Minutes_Until_Signed__c)+"'\n");
    sb.append(" echosign_dev1__More_Recipients__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__More_Recipients__c)+"'\n");
    sb.append(" echosign_dev1__Name__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Name__r)+"'\n");
    sb.append(" echosign_dev1__NewPassword__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__NewPassword__c)+"'\n");
    sb.append(" echosign_dev1__On_Load_Action__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__On_Load_Action__c)+"'\n");
    sb.append(" echosign_dev1__Opportunity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Opportunity__c)+"'\n");
    sb.append(" echosign_dev1__Opportunity__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Opportunity__r)+"'\n");
    sb.append(" echosign_dev1__Partner_Server_URL__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Partner_Server_URL__c)+"'\n");
    sb.append(" echosign_dev1__PasswordProtectPDF__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__PasswordProtectPDF__c)+"'\n");
    sb.append(" echosign_dev1__PasswordProtectSign__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__PasswordProtectSign__c)+"'\n");
    sb.append(" echosign_dev1__Password__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Password__c)+"'\n");
    sb.append(" echosign_dev1__Percent_Signed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Percent_Signed__c)+"'\n");
    sb.append(" echosign_dev1__PreferFax__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__PreferFax__c)+"'\n");
    sb.append(" echosign_dev1__Process_Template__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Process_Template__c)+"'\n");
    sb.append(" echosign_dev1__Process_Template__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Process_Template__r)+"'\n");
    sb.append(" echosign_dev1__Rebuild_Recipient_List__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Rebuild_Recipient_List__c)+"'\n");
    sb.append(" echosign_dev1__Recipient2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient2__c)+"'\n");
    sb.append(" echosign_dev1__Recipient2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient2__r)+"'\n");
    sb.append(" echosign_dev1__Recipient3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient3__c)+"'\n");
    sb.append(" echosign_dev1__Recipient3__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient3__r)+"'\n");
    sb.append(" echosign_dev1__Recipient4__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient4__c)+"'\n");
    sb.append(" echosign_dev1__Recipient4__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient4__r)+"'\n");
    sb.append(" echosign_dev1__Recipient_Addresses__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Addresses__c)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead2__c)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead2__r)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead3__c)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead3__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead3__r)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead4__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead4__c)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead4__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead4__r)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead__c)+"'\n");
    sb.append(" echosign_dev1__Recipient_Lead__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Lead__r)+"'\n");
    sb.append(" echosign_dev1__Recipient_Signing_Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Signing_Order__c)+"'\n");
    sb.append(" echosign_dev1__Recipient_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_User__c)+"'\n");
    sb.append(" echosign_dev1__Recipient_User__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_User__r)+"'\n");
    sb.append(" echosign_dev1__Recipient__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient__c)+"'\n");
    sb.append(" echosign_dev1__Recipient__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient__r)+"'\n");
    sb.append(" echosign_dev1__RemindRecipient__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__RemindRecipient__c)+"'\n");
    sb.append(" echosign_dev1__Result__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Result__c)+"'\n");
    sb.append(" echosign_dev1__ReturnURL_Text__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__ReturnURL_Text__c)+"'\n");
    sb.append(" echosign_dev1__ReturnURL__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__ReturnURL__c)+"'\n");
    sb.append(" echosign_dev1__SenderSigns__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__SenderSigns__c)+"'\n");
    sb.append(" echosign_dev1__Sender_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Sender_User__c)+"'\n");
    sb.append(" echosign_dev1__Sender_User__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Sender_User__r)+"'\n");
    sb.append(" echosign_dev1__SignatureOrder__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__SignatureOrder__c)+"'\n");
    sb.append(" echosign_dev1__SignatureType__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__SignatureType__c)+"'\n");
    sb.append(" echosign_dev1__SignedPDF__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__SignedPDF__c)+"'\n");
    sb.append(" echosign_dev1__Signed_Agreements__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Signed_Agreements__r)+"'\n");
    sb.append(" echosign_dev1__Signing_URL__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Signing_URL__c)+"'\n");
    sb.append(" echosign_dev1__StatusVisible__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__StatusVisible__c)+"'\n");
    sb.append(" echosign_dev1__Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Status__c)+"'\n");
    sb.append(" echosign_dev1__Sync_Data_Mapping__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Sync_Data_Mapping__c)+"'\n");
    sb.append(" echosign_dev1__Trigger_Process_Template__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Trigger_Process_Template__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}