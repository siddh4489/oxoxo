package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Timesheet__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Timesheet__c() {
  }
    
  
  /**
   * element  : Approved_By__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Approved_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Approved_By__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Approved_By__c__is_set = false;

  private java.lang.String Approved_By__c;

  public java.lang.String getApproved_By__c() {
    return Approved_By__c;
  }

  

  public void setApproved_By__c(java.lang.String Approved_By__c) {
    this.Approved_By__c = Approved_By__c;
    Approved_By__c__is_set = true;
  }
  
  /**
   * element  : Approved_By__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Approved_By__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Approved_By__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Approved_By__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Approved_By__r;

  public com.sforce.soap.enterprise.sobject.User getApproved_By__r() {
    return Approved_By__r;
  }

  

  public void setApproved_By__r(com.sforce.soap.enterprise.sobject.User Approved_By__r) {
    this.Approved_By__r = Approved_By__r;
    Approved_By__r__is_set = true;
  }
  
  /**
   * element  : Assignment__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assignment__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignment__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assignment__c__is_set = false;

  private java.lang.String Assignment__c;

  public java.lang.String getAssignment__c() {
    return Assignment__c;
  }

  

  public void setAssignment__c(java.lang.String Assignment__c) {
    this.Assignment__c = Assignment__c;
    Assignment__c__is_set = true;
  }
  
  /**
   * element  : Assignment__r of type {urn:sobject.enterprise.soap.sforce.com}Assignment__c
   * java type: com.sforce.soap.enterprise.sobject.Assignment__c
   */
  private static final com.sforce.ws.bind.TypeInfo Assignment__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignment__r","urn:sobject.enterprise.soap.sforce.com","Assignment__c",0,1,true);

  private boolean Assignment__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Assignment__c Assignment__r;

  public com.sforce.soap.enterprise.sobject.Assignment__c getAssignment__r() {
    return Assignment__r;
  }

  

  public void setAssignment__r(com.sforce.soap.enterprise.sobject.Assignment__c Assignment__r) {
    this.Assignment__r = Assignment__r;
    Assignment__r__is_set = true;
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
   * element  : Candidate_Employee__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Employee__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Employee__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Candidate_Employee__c__is_set = false;

  private java.lang.String Candidate_Employee__c;

  public java.lang.String getCandidate_Employee__c() {
    return Candidate_Employee__c;
  }

  

  public void setCandidate_Employee__c(java.lang.String Candidate_Employee__c) {
    this.Candidate_Employee__c = Candidate_Employee__c;
    Candidate_Employee__c__is_set = true;
  }
  
  /**
   * element  : Candidate_Employee__r of type {urn:sobject.enterprise.soap.sforce.com}Candidate_Employee__c
   * java type: com.sforce.soap.enterprise.sobject.Candidate_Employee__c
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Employee__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Employee__r","urn:sobject.enterprise.soap.sforce.com","Candidate_Employee__c",0,1,true);

  private boolean Candidate_Employee__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Candidate_Employee__c Candidate_Employee__r;

  public com.sforce.soap.enterprise.sobject.Candidate_Employee__c getCandidate_Employee__r() {
    return Candidate_Employee__r;
  }

  

  public void setCandidate_Employee__r(com.sforce.soap.enterprise.sobject.Candidate_Employee__c Candidate_Employee__r) {
    this.Candidate_Employee__r = Candidate_Employee__r;
    Candidate_Employee__r__is_set = true;
  }
  
  /**
   * element  : Carrier__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Carrier__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Carrier__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Carrier__c__is_set = false;

  private java.lang.String Carrier__c;

  public java.lang.String getCarrier__c() {
    return Carrier__c;
  }

  

  public void setCarrier__c(java.lang.String Carrier__c) {
    this.Carrier__c = Carrier__c;
    Carrier__c__is_set = true;
  }
  
  /**
   * element  : Check_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Check_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Check_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Check_Date__c__is_set = false;

  private java.util.Calendar Check_Date__c;

  public java.util.Calendar getCheck_Date__c() {
    return Check_Date__c;
  }

  

  public void setCheck_Date__c(java.util.Calendar Check_Date__c) {
    this.Check_Date__c = Check_Date__c;
    Check_Date__c__is_set = true;
  }
  
  /**
   * element  : Client__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Client__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Client__c__is_set = false;

  private java.lang.String Client__c;

  public java.lang.String getClient__c() {
    return Client__c;
  }

  

  public void setClient__c(java.lang.String Client__c) {
    this.Client__c = Client__c;
    Client__c__is_set = true;
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
   * element  : Comments__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Comments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Comments__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Comments__c__is_set = false;

  private java.lang.String Comments__c;

  public java.lang.String getComments__c() {
    return Comments__c;
  }

  

  public void setComments__c(java.lang.String Comments__c) {
    this.Comments__c = Comments__c;
    Comments__c__is_set = true;
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
   * element  : Contractor__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Contractor__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contractor__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Contractor__c__is_set = false;

  private java.lang.String Contractor__c;

  public java.lang.String getContractor__c() {
    return Contractor__c;
  }

  

  public void setContractor__c(java.lang.String Contractor__c) {
    this.Contractor__c = Contractor__c;
    Contractor__c__is_set = true;
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
   * element  : Division__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Division__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Division__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Division__c__is_set = false;

  private java.lang.String Division__c;

  public java.lang.String getDivision__c() {
    return Division__c;
  }

  

  public void setDivision__c(java.lang.String Division__c) {
    this.Division__c = Division__c;
    Division__c__is_set = true;
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
   * element  : Employee_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_ID__c__is_set = false;

  private java.lang.String Employee_ID__c;

  public java.lang.String getEmployee_ID__c() {
    return Employee_ID__c;
  }

  

  public void setEmployee_ID__c(java.lang.String Employee_ID__c) {
    this.Employee_ID__c = Employee_ID__c;
    Employee_ID__c__is_set = true;
  }
  
  /**
   * element  : Employee_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_Rating__c__is_set = false;

  private java.lang.String Employee_Rating__c;

  public java.lang.String getEmployee_Rating__c() {
    return Employee_Rating__c;
  }

  

  public void setEmployee_Rating__c(java.lang.String Employee_Rating__c) {
    this.Employee_Rating__c = Employee_Rating__c;
    Employee_Rating__c__is_set = true;
  }
  
  /**
   * element  : Entries__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Entries__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Entries__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Entries__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Entries__r;

  public com.sforce.soap.enterprise.QueryResult getEntries__r() {
    return Entries__r;
  }

  

  public void setEntries__r(com.sforce.soap.enterprise.QueryResult Entries__r) {
    this.Entries__r = Entries__r;
    Entries__r__is_set = true;
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
   * element  : Export_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Export_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Export_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Export_Date__c__is_set = false;

  private java.util.Calendar Export_Date__c;

  public java.util.Calendar getExport_Date__c() {
    return Export_Date__c;
  }

  

  public void setExport_Date__c(java.util.Calendar Export_Date__c) {
    this.Export_Date__c = Export_Date__c;
    Export_Date__c__is_set = true;
  }
  
  /**
   * element  : Export_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Export_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Export_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Export_ID__c__is_set = false;

  private java.lang.String Export_ID__c;

  public java.lang.String getExport_ID__c() {
    return Export_ID__c;
  }

  

  public void setExport_ID__c(java.lang.String Export_ID__c) {
    this.Export_ID__c = Export_ID__c;
    Export_ID__c__is_set = true;
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
   * element  : Order_City__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order_City__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_City__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Order_City__c__is_set = false;

  private java.lang.String Order_City__c;

  public java.lang.String getOrder_City__c() {
    return Order_City__c;
  }

  

  public void setOrder_City__c(java.lang.String Order_City__c) {
    this.Order_City__c = Order_City__c;
    Order_City__c__is_set = true;
  }
  
  /**
   * element  : Order_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Order_Name__c__is_set = false;

  private java.lang.String Order_Name__c;

  public java.lang.String getOrder_Name__c() {
    return Order_Name__c;
  }

  

  public void setOrder_Name__c(java.lang.String Order_Name__c) {
    this.Order_Name__c = Order_Name__c;
    Order_Name__c__is_set = true;
  }
  
  /**
   * element  : Order_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Order_Number__c__is_set = false;

  private java.lang.String Order_Number__c;

  public java.lang.String getOrder_Number__c() {
    return Order_Number__c;
  }

  

  public void setOrder_Number__c(java.lang.String Order_Number__c) {
    this.Order_Number__c = Order_Number__c;
    Order_Number__c__is_set = true;
  }
  
  /**
   * element  : Order_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Order_State__c__is_set = false;

  private java.lang.String Order_State__c;

  public java.lang.String getOrder_State__c() {
    return Order_State__c;
  }

  

  public void setOrder_State__c(java.lang.String Order_State__c) {
    this.Order_State__c = Order_State__c;
    Order_State__c__is_set = true;
  }
  
  /**
   * element  : Override_Validation_Rules__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Override_Validation_Rules__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Override_Validation_Rules__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Override_Validation_Rules__c__is_set = false;

  private java.lang.Boolean Override_Validation_Rules__c;

  public java.lang.Boolean getOverride_Validation_Rules__c() {
    return Override_Validation_Rules__c;
  }

  

  public void setOverride_Validation_Rules__c(java.lang.Boolean Override_Validation_Rules__c) {
    this.Override_Validation_Rules__c = Override_Validation_Rules__c;
    Override_Validation_Rules__c__is_set = true;
  }
  
  /**
   * element  : Pay_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pay_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pay_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Pay_Code__c__is_set = false;

  private java.lang.String Pay_Code__c;

  public java.lang.String getPay_Code__c() {
    return Pay_Code__c;
  }

  

  public void setPay_Code__c(java.lang.String Pay_Code__c) {
    this.Pay_Code__c = Pay_Code__c;
    Pay_Code__c__is_set = true;
  }
  
  /**
   * element  : Prevailing_Wage_Assignment__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Prevailing_Wage_Assignment__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Prevailing_Wage_Assignment__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Prevailing_Wage_Assignment__c__is_set = false;

  private java.lang.Boolean Prevailing_Wage_Assignment__c;

  public java.lang.Boolean getPrevailing_Wage_Assignment__c() {
    return Prevailing_Wage_Assignment__c;
  }

  

  public void setPrevailing_Wage_Assignment__c(java.lang.Boolean Prevailing_Wage_Assignment__c) {
    this.Prevailing_Wage_Assignment__c = Prevailing_Wage_Assignment__c;
    Prevailing_Wage_Assignment__c__is_set = true;
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
   * element  : Region__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Region__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Region__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Region__c__is_set = false;

  private java.lang.String Region__c;

  public java.lang.String getRegion__c() {
    return Region__c;
  }

  

  public void setRegion__c(java.lang.String Region__c) {
    this.Region__c = Region__c;
    Region__c__is_set = true;
  }
  
  /**
   * element  : Regular_Hours__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Regular_Hours__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regular_Hours__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Regular_Hours__c__is_set = false;

  private java.lang.Double Regular_Hours__c;

  public java.lang.Double getRegular_Hours__c() {
    return Regular_Hours__c;
  }

  

  public void setRegular_Hours__c(java.lang.Double Regular_Hours__c) {
    this.Regular_Hours__c = Regular_Hours__c;
    Regular_Hours__c__is_set = true;
  }
  
  /**
   * element  : SF_Week_Ending__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo SF_Week_Ending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SF_Week_Ending__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean SF_Week_Ending__c__is_set = false;

  private java.util.Calendar SF_Week_Ending__c;

  public java.util.Calendar getSF_Week_Ending__c() {
    return SF_Week_Ending__c;
  }

  

  public void setSF_Week_Ending__c(java.util.Calendar SF_Week_Ending__c) {
    this.SF_Week_Ending__c = SF_Week_Ending__c;
    SF_Week_Ending__c__is_set = true;
  }
  
  /**
   * element  : Submitted_By__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Submitted_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Submitted_By__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Submitted_By__c__is_set = false;

  private java.lang.String Submitted_By__c;

  public java.lang.String getSubmitted_By__c() {
    return Submitted_By__c;
  }

  

  public void setSubmitted_By__c(java.lang.String Submitted_By__c) {
    this.Submitted_By__c = Submitted_By__c;
    Submitted_By__c__is_set = true;
  }
  
  /**
   * element  : Submitted_By__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Submitted_By__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Submitted_By__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Submitted_By__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Submitted_By__r;

  public com.sforce.soap.enterprise.sobject.User getSubmitted_By__r() {
    return Submitted_By__r;
  }

  

  public void setSubmitted_By__r(com.sforce.soap.enterprise.sobject.User Submitted_By__r) {
    this.Submitted_By__r = Submitted_By__r;
    Submitted_By__r__is_set = true;
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
   * element  : Timesheet_Accounting__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Timesheet_Accounting__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Timesheet_Accounting__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Timesheet_Accounting__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Timesheet_Accounting__r;

  public com.sforce.soap.enterprise.QueryResult getTimesheet_Accounting__r() {
    return Timesheet_Accounting__r;
  }

  

  public void setTimesheet_Accounting__r(com.sforce.soap.enterprise.QueryResult Timesheet_Accounting__r) {
    this.Timesheet_Accounting__r = Timesheet_Accounting__r;
    Timesheet_Accounting__r__is_set = true;
  }
  
  /**
   * element  : Timesheet_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Timesheet_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Timesheet_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Timesheet_Status__c__is_set = false;

  private java.lang.String Timesheet_Status__c;

  public java.lang.String getTimesheet_Status__c() {
    return Timesheet_Status__c;
  }

  

  public void setTimesheet_Status__c(java.lang.String Timesheet_Status__c) {
    this.Timesheet_Status__c = Timesheet_Status__c;
    Timesheet_Status__c__is_set = true;
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
   * element  : Total_Hours_Worked__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Hours_Worked__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Hours_Worked__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Hours_Worked__c__is_set = false;

  private java.lang.Double Total_Hours_Worked__c;

  public java.lang.Double getTotal_Hours_Worked__c() {
    return Total_Hours_Worked__c;
  }

  

  public void setTotal_Hours_Worked__c(java.lang.Double Total_Hours_Worked__c) {
    this.Total_Hours_Worked__c = Total_Hours_Worked__c;
    Total_Hours_Worked__c__is_set = true;
  }
  
  /**
   * element  : Tracking_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Tracking_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tracking_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Tracking_ID__c__is_set = false;

  private java.lang.String Tracking_ID__c;

  public java.lang.String getTracking_ID__c() {
    return Tracking_ID__c;
  }

  

  public void setTracking_ID__c(java.lang.String Tracking_ID__c) {
    this.Tracking_ID__c = Tracking_ID__c;
    Tracking_ID__c__is_set = true;
  }
  
  /**
   * element  : Trade__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Trade__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trade__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Trade__c__is_set = false;

  private java.lang.String Trade__c;

  public java.lang.String getTrade__c() {
    return Trade__c;
  }

  

  public void setTrade__c(java.lang.String Trade__c) {
    this.Trade__c = Trade__c;
    Trade__c__is_set = true;
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
   * element  : Week_Ending__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Week_Ending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Week_Ending__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Week_Ending__c__is_set = false;

  private java.util.Calendar Week_Ending__c;

  public java.util.Calendar getWeek_Ending__c() {
    return Week_Ending__c;
  }

  

  public void setWeek_Ending__c(java.util.Calendar Week_Ending__c) {
    this.Week_Ending__c = Week_Ending__c;
    Week_Ending__c__is_set = true;
  }
  
  /**
   * element  : Work_City__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Work_City__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_City__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Work_City__c__is_set = false;

  private java.lang.String Work_City__c;

  public java.lang.String getWork_City__c() {
    return Work_City__c;
  }

  

  public void setWork_City__c(java.lang.String Work_City__c) {
    this.Work_City__c = Work_City__c;
    Work_City__c__is_set = true;
  }
  
  /**
   * element  : Work_End__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Work_End__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_End__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Work_End__c__is_set = false;

  private java.util.Calendar Work_End__c;

  public java.util.Calendar getWork_End__c() {
    return Work_End__c;
  }

  

  public void setWork_End__c(java.util.Calendar Work_End__c) {
    this.Work_End__c = Work_End__c;
    Work_End__c__is_set = true;
  }
  
  /**
   * element  : Work_Start__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Work_Start__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_Start__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Work_Start__c__is_set = false;

  private java.util.Calendar Work_Start__c;

  public java.util.Calendar getWork_Start__c() {
    return Work_Start__c;
  }

  

  public void setWork_Start__c(java.util.Calendar Work_Start__c) {
    this.Work_Start__c = Work_Start__c;
    Work_Start__c__is_set = true;
  }
  
  /**
   * element  : Work_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Work_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Work_State__c__is_set = false;

  private java.lang.String Work_State__c;

  public java.lang.String getWork_State__c() {
    return Work_State__c;
  }

  

  public void setWork_State__c(java.lang.String Work_State__c) {
    this.Work_State__c = Work_State__c;
    Work_State__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Timesheet__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Approved_By__c__typeInfo, Approved_By__c, Approved_By__c__is_set);
    __typeMapper.writeObject(__out, Approved_By__r__typeInfo, Approved_By__r, Approved_By__r__is_set);
    __typeMapper.writeString(__out, Assignment__c__typeInfo, Assignment__c, Assignment__c__is_set);
    __typeMapper.writeObject(__out, Assignment__r__typeInfo, Assignment__r, Assignment__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Candidate_Employee__c__typeInfo, Candidate_Employee__c, Candidate_Employee__c__is_set);
    __typeMapper.writeObject(__out, Candidate_Employee__r__typeInfo, Candidate_Employee__r, Candidate_Employee__r__is_set);
    __typeMapper.writeString(__out, Carrier__c__typeInfo, Carrier__c, Carrier__c__is_set);
    __typeMapper.writeObject(__out, Check_Date__c__typeInfo, Check_Date__c, Check_Date__c__is_set);
    __typeMapper.writeString(__out, Client__c__typeInfo, Client__c, Client__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, Comments__c__typeInfo, Comments__c, Comments__c__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeString(__out, Contractor__c__typeInfo, Contractor__c, Contractor__c__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Division__c__typeInfo, Division__c, Division__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeString(__out, Employee_ID__c__typeInfo, Employee_ID__c, Employee_ID__c__is_set);
    __typeMapper.writeString(__out, Employee_Rating__c__typeInfo, Employee_Rating__c, Employee_Rating__c__is_set);
    __typeMapper.writeObject(__out, Entries__r__typeInfo, Entries__r, Entries__r__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Export_Date__c__typeInfo, Export_Date__c, Export_Date__c__is_set);
    __typeMapper.writeString(__out, Export_ID__c__typeInfo, Export_ID__c, Export_ID__c__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
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
    __typeMapper.writeString(__out, Order_City__c__typeInfo, Order_City__c, Order_City__c__is_set);
    __typeMapper.writeString(__out, Order_Name__c__typeInfo, Order_Name__c, Order_Name__c__is_set);
    __typeMapper.writeString(__out, Order_Number__c__typeInfo, Order_Number__c, Order_Number__c__is_set);
    __typeMapper.writeString(__out, Order_State__c__typeInfo, Order_State__c, Order_State__c__is_set);
    __typeMapper.writeObject(__out, Override_Validation_Rules__c__typeInfo, Override_Validation_Rules__c, Override_Validation_Rules__c__is_set);
    __typeMapper.writeString(__out, Pay_Code__c__typeInfo, Pay_Code__c, Pay_Code__c__is_set);
    __typeMapper.writeObject(__out, Prevailing_Wage_Assignment__c__typeInfo, Prevailing_Wage_Assignment__c, Prevailing_Wage_Assignment__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeString(__out, Region__c__typeInfo, Region__c, Region__c__is_set);
    __typeMapper.writeObject(__out, Regular_Hours__c__typeInfo, Regular_Hours__c, Regular_Hours__c__is_set);
    __typeMapper.writeObject(__out, SF_Week_Ending__c__typeInfo, SF_Week_Ending__c, SF_Week_Ending__c__is_set);
    __typeMapper.writeString(__out, Submitted_By__c__typeInfo, Submitted_By__c, Submitted_By__c__is_set);
    __typeMapper.writeObject(__out, Submitted_By__r__typeInfo, Submitted_By__r, Submitted_By__r__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Timesheet_Accounting__r__typeInfo, Timesheet_Accounting__r, Timesheet_Accounting__r__is_set);
    __typeMapper.writeString(__out, Timesheet_Status__c__typeInfo, Timesheet_Status__c, Timesheet_Status__c__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, Total_Hours_Worked__c__typeInfo, Total_Hours_Worked__c, Total_Hours_Worked__c__is_set);
    __typeMapper.writeString(__out, Tracking_ID__c__typeInfo, Tracking_ID__c, Tracking_ID__c__is_set);
    __typeMapper.writeString(__out, Trade__c__typeInfo, Trade__c, Trade__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, Week_Ending__c__typeInfo, Week_Ending__c, Week_Ending__c__is_set);
    __typeMapper.writeString(__out, Work_City__c__typeInfo, Work_City__c, Work_City__c__is_set);
    __typeMapper.writeObject(__out, Work_End__c__typeInfo, Work_End__c, Work_End__c__is_set);
    __typeMapper.writeObject(__out, Work_Start__c__typeInfo, Work_Start__c, Work_Start__c__is_set);
    __typeMapper.writeString(__out, Work_State__c__typeInfo, Work_State__c, Work_State__c__is_set);
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
    if (__typeMapper.isElement(__in, Approved_By__c__typeInfo)) {
      setApproved_By__c((java.lang.String)__typeMapper.readString(__in, Approved_By__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Approved_By__r__typeInfo)) {
      setApproved_By__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Approved_By__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignment__c__typeInfo)) {
      setAssignment__c((java.lang.String)__typeMapper.readString(__in, Assignment__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignment__r__typeInfo)) {
      setAssignment__r((com.sforce.soap.enterprise.sobject.Assignment__c)__typeMapper.readObject(__in, Assignment__r__typeInfo, com.sforce.soap.enterprise.sobject.Assignment__c.class));
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
    if (__typeMapper.isElement(__in, Candidate_Employee__c__typeInfo)) {
      setCandidate_Employee__c((java.lang.String)__typeMapper.readString(__in, Candidate_Employee__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Employee__r__typeInfo)) {
      setCandidate_Employee__r((com.sforce.soap.enterprise.sobject.Candidate_Employee__c)__typeMapper.readObject(__in, Candidate_Employee__r__typeInfo, com.sforce.soap.enterprise.sobject.Candidate_Employee__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Carrier__c__typeInfo)) {
      setCarrier__c((java.lang.String)__typeMapper.readString(__in, Carrier__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Check_Date__c__typeInfo)) {
      setCheck_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Check_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client__c__typeInfo)) {
      setClient__c((java.lang.String)__typeMapper.readString(__in, Client__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Comments__c__typeInfo)) {
      setComments__c((java.lang.String)__typeMapper.readString(__in, Comments__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contractor__c__typeInfo)) {
      setContractor__c((java.lang.String)__typeMapper.readString(__in, Contractor__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Division__c__typeInfo)) {
      setDivision__c((java.lang.String)__typeMapper.readString(__in, Division__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Employee_ID__c__typeInfo)) {
      setEmployee_ID__c((java.lang.String)__typeMapper.readString(__in, Employee_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee_Rating__c__typeInfo)) {
      setEmployee_Rating__c((java.lang.String)__typeMapper.readString(__in, Employee_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Entries__r__typeInfo)) {
      setEntries__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Entries__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Export_Date__c__typeInfo)) {
      setExport_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Export_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Export_ID__c__typeInfo)) {
      setExport_ID__c((java.lang.String)__typeMapper.readString(__in, Export_ID__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Order_City__c__typeInfo)) {
      setOrder_City__c((java.lang.String)__typeMapper.readString(__in, Order_City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Name__c__typeInfo)) {
      setOrder_Name__c((java.lang.String)__typeMapper.readString(__in, Order_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Number__c__typeInfo)) {
      setOrder_Number__c((java.lang.String)__typeMapper.readString(__in, Order_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_State__c__typeInfo)) {
      setOrder_State__c((java.lang.String)__typeMapper.readString(__in, Order_State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Override_Validation_Rules__c__typeInfo)) {
      setOverride_Validation_Rules__c((java.lang.Boolean)__typeMapper.readObject(__in, Override_Validation_Rules__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pay_Code__c__typeInfo)) {
      setPay_Code__c((java.lang.String)__typeMapper.readString(__in, Pay_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Prevailing_Wage_Assignment__c__typeInfo)) {
      setPrevailing_Wage_Assignment__c((java.lang.Boolean)__typeMapper.readObject(__in, Prevailing_Wage_Assignment__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Region__c__typeInfo)) {
      setRegion__c((java.lang.String)__typeMapper.readString(__in, Region__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regular_Hours__c__typeInfo)) {
      setRegular_Hours__c((java.lang.Double)__typeMapper.readObject(__in, Regular_Hours__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SF_Week_Ending__c__typeInfo)) {
      setSF_Week_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, SF_Week_Ending__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Submitted_By__c__typeInfo)) {
      setSubmitted_By__c((java.lang.String)__typeMapper.readString(__in, Submitted_By__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Submitted_By__r__typeInfo)) {
      setSubmitted_By__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Submitted_By__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
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
    if (__typeMapper.isElement(__in, Timesheet_Accounting__r__typeInfo)) {
      setTimesheet_Accounting__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Timesheet_Accounting__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Timesheet_Status__c__typeInfo)) {
      setTimesheet_Status__c((java.lang.String)__typeMapper.readString(__in, Timesheet_Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Hours_Worked__c__typeInfo)) {
      setTotal_Hours_Worked__c((java.lang.Double)__typeMapper.readObject(__in, Total_Hours_Worked__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tracking_ID__c__typeInfo)) {
      setTracking_ID__c((java.lang.String)__typeMapper.readString(__in, Tracking_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Trade__c__typeInfo)) {
      setTrade__c((java.lang.String)__typeMapper.readString(__in, Trade__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Week_Ending__c__typeInfo)) {
      setWeek_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, Week_Ending__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_City__c__typeInfo)) {
      setWork_City__c((java.lang.String)__typeMapper.readString(__in, Work_City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_End__c__typeInfo)) {
      setWork_End__c((java.util.Calendar)__typeMapper.readObject(__in, Work_End__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_Start__c__typeInfo)) {
      setWork_Start__c((java.util.Calendar)__typeMapper.readObject(__in, Work_Start__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_State__c__typeInfo)) {
      setWork_State__c((java.lang.String)__typeMapper.readString(__in, Work_State__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Timesheet__c ");
    sb.append(super.toString());
    sb.append(" Approved_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Approved_By__c)+"'\n");
    sb.append(" Approved_By__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Approved_By__r)+"'\n");
    sb.append(" Assignment__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignment__c)+"'\n");
    sb.append(" Assignment__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignment__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Candidate_Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__c)+"'\n");
    sb.append(" Candidate_Employee__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__r)+"'\n");
    sb.append(" Carrier__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Carrier__c)+"'\n");
    sb.append(" Check_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Check_Date__c)+"'\n");
    sb.append(" Client__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Comments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Comments__c)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" Contractor__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contractor__c)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Division__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employee_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_ID__c)+"'\n");
    sb.append(" Employee_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Rating__c)+"'\n");
    sb.append(" Entries__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Entries__r)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Export_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Export_Date__c)+"'\n");
    sb.append(" Export_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Export_ID__c)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
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
    sb.append(" Order_City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_City__c)+"'\n");
    sb.append(" Order_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Name__c)+"'\n");
    sb.append(" Order_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Number__c)+"'\n");
    sb.append(" Order_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_State__c)+"'\n");
    sb.append(" Override_Validation_Rules__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Override_Validation_Rules__c)+"'\n");
    sb.append(" Pay_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pay_Code__c)+"'\n");
    sb.append(" Prevailing_Wage_Assignment__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Prevailing_Wage_Assignment__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Region__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Region__c)+"'\n");
    sb.append(" Regular_Hours__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regular_Hours__c)+"'\n");
    sb.append(" SF_Week_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SF_Week_Ending__c)+"'\n");
    sb.append(" Submitted_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Submitted_By__c)+"'\n");
    sb.append(" Submitted_By__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Submitted_By__r)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Timesheet_Accounting__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Timesheet_Accounting__r)+"'\n");
    sb.append(" Timesheet_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Timesheet_Status__c)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Total_Hours_Worked__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Hours_Worked__c)+"'\n");
    sb.append(" Tracking_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tracking_ID__c)+"'\n");
    sb.append(" Trade__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" Week_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Week_Ending__c)+"'\n");
    sb.append(" Work_City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_City__c)+"'\n");
    sb.append(" Work_End__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_End__c)+"'\n");
    sb.append(" Work_Start__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_Start__c)+"'\n");
    sb.append(" Work_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_State__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}