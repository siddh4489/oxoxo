package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Adjustments__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Adjustments__c() {
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
   * element  : Adjusted_Item__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Adjusted_Item__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Adjusted_Item__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Adjusted_Item__c__is_set = false;

  private java.lang.String Adjusted_Item__c;

  public java.lang.String getAdjusted_Item__c() {
    return Adjusted_Item__c;
  }

  

  public void setAdjusted_Item__c(java.lang.String Adjusted_Item__c) {
    this.Adjusted_Item__c = Adjusted_Item__c;
    Adjusted_Item__c__is_set = true;
  }
  
  /**
   * element  : Adjustment_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Adjustment_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Adjustment_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Adjustment_Type__c__is_set = false;

  private java.lang.String Adjustment_Type__c;

  public java.lang.String getAdjustment_Type__c() {
    return Adjustment_Type__c;
  }

  

  public void setAdjustment_Type__c(java.lang.String Adjustment_Type__c) {
    this.Adjustment_Type__c = Adjustment_Type__c;
    Adjustment_Type__c__is_set = true;
  }
  
  /**
   * element  : Amount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Amount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Amount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Amount__c__is_set = false;

  private java.lang.Double Amount__c;

  public java.lang.Double getAmount__c() {
    return Amount__c;
  }

  

  public void setAmount__c(java.lang.Double Amount__c) {
    this.Amount__c = Amount__c;
    Amount__c__is_set = true;
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
   * element  : Check_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Check_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Check_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Check_Number__c__is_set = false;

  private java.lang.String Check_Number__c;

  public java.lang.String getCheck_Number__c() {
    return Check_Number__c;
  }

  

  public void setCheck_Number__c(java.lang.String Check_Number__c) {
    this.Check_Number__c = Check_Number__c;
    Check_Number__c__is_set = true;
  }
  
  /**
   * element  : Client__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Client__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : Client__r of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Client__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client__r","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean Client__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account Client__r;

  public com.sforce.soap.enterprise.sobject.Account getClient__r() {
    return Client__r;
  }

  

  public void setClient__r(com.sforce.soap.enterprise.sobject.Account Client__r) {
    this.Client__r = Client__r;
    Client__r__is_set = true;
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
   * element  : Field_Employee__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Field_Employee__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Field_Employee__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Field_Employee__c__is_set = false;

  private java.lang.String Field_Employee__c;

  public java.lang.String getField_Employee__c() {
    return Field_Employee__c;
  }

  

  public void setField_Employee__c(java.lang.String Field_Employee__c) {
    this.Field_Employee__c = Field_Employee__c;
    Field_Employee__c__is_set = true;
  }
  
  /**
   * element  : GP_Invoice_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo GP_Invoice_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GP_Invoice_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean GP_Invoice_Number__c__is_set = false;

  private java.lang.String GP_Invoice_Number__c;

  public java.lang.String getGP_Invoice_Number__c() {
    return GP_Invoice_Number__c;
  }

  

  public void setGP_Invoice_Number__c(java.lang.String GP_Invoice_Number__c) {
    this.GP_Invoice_Number__c = GP_Invoice_Number__c;
    GP_Invoice_Number__c__is_set = true;
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
   * element  : Invoice_Adjustment_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Invoice_Adjustment_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoice_Adjustment_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Invoice_Adjustment_Type__c__is_set = false;

  private java.lang.String Invoice_Adjustment_Type__c;

  public java.lang.String getInvoice_Adjustment_Type__c() {
    return Invoice_Adjustment_Type__c;
  }

  

  public void setInvoice_Adjustment_Type__c(java.lang.String Invoice_Adjustment_Type__c) {
    this.Invoice_Adjustment_Type__c = Invoice_Adjustment_Type__c;
    Invoice_Adjustment_Type__c__is_set = true;
  }
  
  /**
   * element  : Invoice_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Invoice_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoice_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Invoice_Number__c__is_set = false;

  private java.lang.String Invoice_Number__c;

  public java.lang.String getInvoice_Number__c() {
    return Invoice_Number__c;
  }

  

  public void setInvoice_Number__c(java.lang.String Invoice_Number__c) {
    this.Invoice_Number__c = Invoice_Number__c;
    Invoice_Number__c__is_set = true;
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
   * element  : Manual_Invoice_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Manual_Invoice_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Manual_Invoice_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Manual_Invoice_Number__c__is_set = false;

  private java.lang.String Manual_Invoice_Number__c;

  public java.lang.String getManual_Invoice_Number__c() {
    return Manual_Invoice_Number__c;
  }

  

  public void setManual_Invoice_Number__c(java.lang.String Manual_Invoice_Number__c) {
    this.Manual_Invoice_Number__c = Manual_Invoice_Number__c;
    Manual_Invoice_Number__c__is_set = true;
  }
  
  /**
   * element  : Manually_Billed_to_Client__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Manually_Billed_to_Client__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Manually_Billed_to_Client__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Manually_Billed_to_Client__c__is_set = false;

  private java.lang.Boolean Manually_Billed_to_Client__c;

  public java.lang.Boolean getManually_Billed_to_Client__c() {
    return Manually_Billed_to_Client__c;
  }

  

  public void setManually_Billed_to_Client__c(java.lang.Boolean Manually_Billed_to_Client__c) {
    this.Manually_Billed_to_Client__c = Manually_Billed_to_Client__c;
    Manually_Billed_to_Client__c__is_set = true;
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
   * element  : Notes_Description__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Notes_Description__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes_Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Notes_Description__c__is_set = false;

  private java.lang.String Notes_Description__c;

  public java.lang.String getNotes_Description__c() {
    return Notes_Description__c;
  }

  

  public void setNotes_Description__c(java.lang.String Notes_Description__c) {
    this.Notes_Description__c = Notes_Description__c;
    Notes_Description__c__is_set = true;
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
   * element  : Order__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Order__c__is_set = false;

  private java.lang.String Order__c;

  public java.lang.String getOrder__c() {
    return Order__c;
  }

  

  public void setOrder__c(java.lang.String Order__c) {
    this.Order__c = Order__c;
    Order__c__is_set = true;
  }
  
  /**
   * element  : Order__r of type {urn:sobject.enterprise.soap.sforce.com}Order__c
   * java type: com.sforce.soap.enterprise.sobject.Order__c
   */
  private static final com.sforce.ws.bind.TypeInfo Order__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order__r","urn:sobject.enterprise.soap.sforce.com","Order__c",0,1,true);

  private boolean Order__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Order__c Order__r;

  public com.sforce.soap.enterprise.sobject.Order__c getOrder__r() {
    return Order__r;
  }

  

  public void setOrder__r(com.sforce.soap.enterprise.sobject.Order__c Order__r) {
    this.Order__r = Order__r;
    Order__r__is_set = true;
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
   * element  : Pmnt_Received_and_Inv_Nmbrs_Reconciled__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Pmnt_Received_and_Inv_Nmbrs_Reconciled__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pmnt_Received_and_Inv_Nmbrs_Reconciled__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Pmnt_Received_and_Inv_Nmbrs_Reconciled__c__is_set = false;

  private java.lang.Boolean Pmnt_Received_and_Inv_Nmbrs_Reconciled__c;

  public java.lang.Boolean getPmnt_Received_and_Inv_Nmbrs_Reconciled__c() {
    return Pmnt_Received_and_Inv_Nmbrs_Reconciled__c;
  }

  

  public void setPmnt_Received_and_Inv_Nmbrs_Reconciled__c(java.lang.Boolean Pmnt_Received_and_Inv_Nmbrs_Reconciled__c) {
    this.Pmnt_Received_and_Inv_Nmbrs_Reconciled__c = Pmnt_Received_and_Inv_Nmbrs_Reconciled__c;
    Pmnt_Received_and_Inv_Nmbrs_Reconciled__c__is_set = true;
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
   * element  : Reason__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Reason__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Reason__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Reason__c__is_set = false;

  private java.lang.String Reason__c;

  public java.lang.String getReason__c() {
    return Reason__c;
  }

  

  public void setReason__c(java.lang.String Reason__c) {
    this.Reason__c = Reason__c;
    Reason__c__is_set = true;
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
   * element  : Recruiter__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter__c__is_set = false;

  private java.lang.String Recruiter__c;

  public java.lang.String getRecruiter__c() {
    return Recruiter__c;
  }

  

  public void setRecruiter__c(java.lang.String Recruiter__c) {
    this.Recruiter__c = Recruiter__c;
    Recruiter__c__is_set = true;
  }
  
  /**
   * element  : Salesperson__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Salesperson__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Salesperson__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Salesperson__c__is_set = false;

  private java.lang.String Salesperson__c;

  public java.lang.String getSalesperson__c() {
    return Salesperson__c;
  }

  

  public void setSalesperson__c(java.lang.String Salesperson__c) {
    this.Salesperson__c = Salesperson__c;
    Salesperson__c__is_set = true;
  }
  
  /**
   * element  : Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Status__c__is_set = false;

  private java.lang.String Status__c;

  public java.lang.String getStatus__c() {
    return Status__c;
  }

  

  public void setStatus__c(java.lang.String Status__c) {
    this.Status__c = Status__c;
    Status__c__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Adjustments__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeString(__out, Adjusted_Item__c__typeInfo, Adjusted_Item__c, Adjusted_Item__c__is_set);
    __typeMapper.writeString(__out, Adjustment_Type__c__typeInfo, Adjustment_Type__c, Adjustment_Type__c__is_set);
    __typeMapper.writeObject(__out, Amount__c__typeInfo, Amount__c, Amount__c__is_set);
    __typeMapper.writeString(__out, Assignment__c__typeInfo, Assignment__c, Assignment__c__is_set);
    __typeMapper.writeObject(__out, Assignment__r__typeInfo, Assignment__r, Assignment__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Check_Number__c__typeInfo, Check_Number__c, Check_Number__c__is_set);
    __typeMapper.writeString(__out, Client__c__typeInfo, Client__c, Client__c__is_set);
    __typeMapper.writeObject(__out, Client__r__typeInfo, Client__r, Client__r__is_set);
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
    __typeMapper.writeString(__out, Field_Employee__c__typeInfo, Field_Employee__c, Field_Employee__c__is_set);
    __typeMapper.writeString(__out, GP_Invoice_Number__c__typeInfo, GP_Invoice_Number__c, GP_Invoice_Number__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, Invoice_Adjustment_Type__c__typeInfo, Invoice_Adjustment_Type__c, Invoice_Adjustment_Type__c__is_set);
    __typeMapper.writeString(__out, Invoice_Number__c__typeInfo, Invoice_Number__c, Invoice_Number__c__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Manual_Invoice_Number__c__typeInfo, Manual_Invoice_Number__c, Manual_Invoice_Number__c__is_set);
    __typeMapper.writeObject(__out, Manually_Billed_to_Client__c__typeInfo, Manually_Billed_to_Client__c, Manually_Billed_to_Client__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeString(__out, Notes_Description__c__typeInfo, Notes_Description__c, Notes_Description__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeString(__out, Order__c__typeInfo, Order__c, Order__c__is_set);
    __typeMapper.writeObject(__out, Order__r__typeInfo, Order__r, Order__r__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, Pmnt_Received_and_Inv_Nmbrs_Reconciled__c__typeInfo, Pmnt_Received_and_Inv_Nmbrs_Reconciled__c, Pmnt_Received_and_Inv_Nmbrs_Reconciled__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeString(__out, Reason__c__typeInfo, Reason__c, Reason__c__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeString(__out, Recruiter__c__typeInfo, Recruiter__c, Recruiter__c__is_set);
    __typeMapper.writeString(__out, Salesperson__c__typeInfo, Salesperson__c, Salesperson__c__is_set);
    __typeMapper.writeString(__out, Status__c__typeInfo, Status__c, Status__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
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
    if (__typeMapper.isElement(__in, Adjusted_Item__c__typeInfo)) {
      setAdjusted_Item__c((java.lang.String)__typeMapper.readString(__in, Adjusted_Item__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Adjustment_Type__c__typeInfo)) {
      setAdjustment_Type__c((java.lang.String)__typeMapper.readString(__in, Adjustment_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Amount__c__typeInfo)) {
      setAmount__c((java.lang.Double)__typeMapper.readObject(__in, Amount__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Check_Number__c__typeInfo)) {
      setCheck_Number__c((java.lang.String)__typeMapper.readString(__in, Check_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client__c__typeInfo)) {
      setClient__c((java.lang.String)__typeMapper.readString(__in, Client__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client__r__typeInfo)) {
      setClient__r((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Client__r__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
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
    if (__typeMapper.isElement(__in, Field_Employee__c__typeInfo)) {
      setField_Employee__c((java.lang.String)__typeMapper.readString(__in, Field_Employee__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GP_Invoice_Number__c__typeInfo)) {
      setGP_Invoice_Number__c((java.lang.String)__typeMapper.readString(__in, GP_Invoice_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoice_Adjustment_Type__c__typeInfo)) {
      setInvoice_Adjustment_Type__c((java.lang.String)__typeMapper.readString(__in, Invoice_Adjustment_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoice_Number__c__typeInfo)) {
      setInvoice_Number__c((java.lang.String)__typeMapper.readString(__in, Invoice_Number__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Manual_Invoice_Number__c__typeInfo)) {
      setManual_Invoice_Number__c((java.lang.String)__typeMapper.readString(__in, Manual_Invoice_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Manually_Billed_to_Client__c__typeInfo)) {
      setManually_Billed_to_Client__c((java.lang.Boolean)__typeMapper.readObject(__in, Manually_Billed_to_Client__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Notes_Description__c__typeInfo)) {
      setNotes_Description__c((java.lang.String)__typeMapper.readString(__in, Notes_Description__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order__c__typeInfo)) {
      setOrder__c((java.lang.String)__typeMapper.readString(__in, Order__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order__r__typeInfo)) {
      setOrder__r((com.sforce.soap.enterprise.sobject.Order__c)__typeMapper.readObject(__in, Order__r__typeInfo, com.sforce.soap.enterprise.sobject.Order__c.class));
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
    if (__typeMapper.isElement(__in, Pmnt_Received_and_Inv_Nmbrs_Reconciled__c__typeInfo)) {
      setPmnt_Received_and_Inv_Nmbrs_Reconciled__c((java.lang.Boolean)__typeMapper.readObject(__in, Pmnt_Received_and_Inv_Nmbrs_Reconciled__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Reason__c__typeInfo)) {
      setReason__c((java.lang.String)__typeMapper.readString(__in, Reason__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordAssociatedGroups__typeInfo)) {
      setRecordAssociatedGroups((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecordAssociatedGroups__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter__c__typeInfo)) {
      setRecruiter__c((java.lang.String)__typeMapper.readString(__in, Recruiter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Salesperson__c__typeInfo)) {
      setSalesperson__c((java.lang.String)__typeMapper.readString(__in, Salesperson__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__c__typeInfo)) {
      setStatus__c((java.lang.String)__typeMapper.readString(__in, Status__c__typeInfo, java.lang.String.class));
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
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Adjustments__c ");
    sb.append(super.toString());
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Adjusted_Item__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Adjusted_Item__c)+"'\n");
    sb.append(" Adjustment_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Adjustment_Type__c)+"'\n");
    sb.append(" Amount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Amount__c)+"'\n");
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
    sb.append(" Check_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Check_Number__c)+"'\n");
    sb.append(" Client__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client__c)+"'\n");
    sb.append(" Client__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client__r)+"'\n");
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
    sb.append(" Field_Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Field_Employee__c)+"'\n");
    sb.append(" GP_Invoice_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GP_Invoice_Number__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" Invoice_Adjustment_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoice_Adjustment_Type__c)+"'\n");
    sb.append(" Invoice_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoice_Number__c)+"'\n");
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
    sb.append(" LastReferencedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
    sb.append(" LastViewedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Manual_Invoice_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Manual_Invoice_Number__c)+"'\n");
    sb.append(" Manually_Billed_to_Client__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Manually_Billed_to_Client__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Notes_Description__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes_Description__c)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order__c)+"'\n");
    sb.append(" Order__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order__r)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Pmnt_Received_and_Inv_Nmbrs_Reconciled__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pmnt_Received_and_Inv_Nmbrs_Reconciled__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Reason__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Reason__c)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Recruiter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter__c)+"'\n");
    sb.append(" Salesperson__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Salesperson__c)+"'\n");
    sb.append(" Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status__c)+"'\n");
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
    sb.append("]\n");
    return sb.toString();
  }
}