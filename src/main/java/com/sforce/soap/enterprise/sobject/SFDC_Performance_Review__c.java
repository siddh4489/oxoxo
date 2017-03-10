package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class SFDC_Performance_Review__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public SFDC_Performance_Review__c() {
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
   * element  : Customer_Service_Internal_External__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Customer_Service_Internal_External__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Customer_Service_Internal_External__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Customer_Service_Internal_External__c__is_set = false;

  private java.lang.String Customer_Service_Internal_External__c;

  public java.lang.String getCustomer_Service_Internal_External__c() {
    return Customer_Service_Internal_External__c;
  }

  

  public void setCustomer_Service_Internal_External__c(java.lang.String Customer_Service_Internal_External__c) {
    this.Customer_Service_Internal_External__c = Customer_Service_Internal_External__c;
    Customer_Service_Internal_External__c__is_set = true;
  }
  
  /**
   * element  : Customer_Service_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Customer_Service_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Customer_Service_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Customer_Service_Notes__c__is_set = false;

  private java.lang.String Customer_Service_Notes__c;

  public java.lang.String getCustomer_Service_Notes__c() {
    return Customer_Service_Notes__c;
  }

  

  public void setCustomer_Service_Notes__c(java.lang.String Customer_Service_Notes__c) {
    this.Customer_Service_Notes__c = Customer_Service_Notes__c;
    Customer_Service_Notes__c__is_set = true;
  }
  
  /**
   * element  : Customer_Service_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Customer_Service_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Customer_Service_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Customer_Service_Rating__c__is_set = false;

  private java.lang.String Customer_Service_Rating__c;

  public java.lang.String getCustomer_Service_Rating__c() {
    return Customer_Service_Rating__c;
  }

  

  public void setCustomer_Service_Rating__c(java.lang.String Customer_Service_Rating__c) {
    this.Customer_Service_Rating__c = Customer_Service_Rating__c;
    Customer_Service_Rating__c__is_set = true;
  }
  
  /**
   * element  : Dependability_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Dependability_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Dependability_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Dependability_Notes__c__is_set = false;

  private java.lang.String Dependability_Notes__c;

  public java.lang.String getDependability_Notes__c() {
    return Dependability_Notes__c;
  }

  

  public void setDependability_Notes__c(java.lang.String Dependability_Notes__c) {
    this.Dependability_Notes__c = Dependability_Notes__c;
    Dependability_Notes__c__is_set = true;
  }
  
  /**
   * element  : Dependability_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Dependability_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Dependability_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Dependability_Rating__c__is_set = false;

  private java.lang.String Dependability_Rating__c;

  public java.lang.String getDependability_Rating__c() {
    return Dependability_Rating__c;
  }

  

  public void setDependability_Rating__c(java.lang.String Dependability_Rating__c) {
    this.Dependability_Rating__c = Dependability_Rating__c;
    Dependability_Rating__c__is_set = true;
  }
  
  /**
   * element  : Dependability__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Dependability__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Dependability__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Dependability__c__is_set = false;

  private java.lang.String Dependability__c;

  public java.lang.String getDependability__c() {
    return Dependability__c;
  }

  

  public void setDependability__c(java.lang.String Dependability__c) {
    this.Dependability__c = Dependability__c;
    Dependability__c__is_set = true;
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
   * element  : Employee_Comments__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Comments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Comments__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_Comments__c__is_set = false;

  private java.lang.String Employee_Comments__c;

  public java.lang.String getEmployee_Comments__c() {
    return Employee_Comments__c;
  }

  

  public void setEmployee_Comments__c(java.lang.String Employee_Comments__c) {
    this.Employee_Comments__c = Employee_Comments__c;
    Employee_Comments__c__is_set = true;
  }
  
  /**
   * element  : Employee_Review_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Review_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Review_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_Review_Notes__c__is_set = false;

  private java.lang.String Employee_Review_Notes__c;

  public java.lang.String getEmployee_Review_Notes__c() {
    return Employee_Review_Notes__c;
  }

  

  public void setEmployee_Review_Notes__c(java.lang.String Employee_Review_Notes__c) {
    this.Employee_Review_Notes__c = Employee_Review_Notes__c;
    Employee_Review_Notes__c__is_set = true;
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
   * element  : Employee__r of type {urn:sobject.enterprise.soap.sforce.com}SFDC_Employee__c
   * java type: com.sforce.soap.enterprise.sobject.SFDC_Employee__c
   */
  private static final com.sforce.ws.bind.TypeInfo Employee__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee__r","urn:sobject.enterprise.soap.sforce.com","SFDC_Employee__c",0,1,true);

  private boolean Employee__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.SFDC_Employee__c Employee__r;

  public com.sforce.soap.enterprise.sobject.SFDC_Employee__c getEmployee__r() {
    return Employee__r;
  }

  

  public void setEmployee__r(com.sforce.soap.enterprise.sobject.SFDC_Employee__c Employee__r) {
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
   * element  : Initiative_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Initiative_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Initiative_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Initiative_Notes__c__is_set = false;

  private java.lang.String Initiative_Notes__c;

  public java.lang.String getInitiative_Notes__c() {
    return Initiative_Notes__c;
  }

  

  public void setInitiative_Notes__c(java.lang.String Initiative_Notes__c) {
    this.Initiative_Notes__c = Initiative_Notes__c;
    Initiative_Notes__c__is_set = true;
  }
  
  /**
   * element  : Initiative_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Initiative_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Initiative_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Initiative_Rating__c__is_set = false;

  private java.lang.String Initiative_Rating__c;

  public java.lang.String getInitiative_Rating__c() {
    return Initiative_Rating__c;
  }

  

  public void setInitiative_Rating__c(java.lang.String Initiative_Rating__c) {
    this.Initiative_Rating__c = Initiative_Rating__c;
    Initiative_Rating__c__is_set = true;
  }
  
  /**
   * element  : Initiative__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Initiative__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Initiative__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Initiative__c__is_set = false;

  private java.lang.String Initiative__c;

  public java.lang.String getInitiative__c() {
    return Initiative__c;
  }

  

  public void setInitiative__c(java.lang.String Initiative__c) {
    this.Initiative__c = Initiative__c;
    Initiative__c__is_set = true;
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
   * element  : Job_Knowledge_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Knowledge_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Knowledge_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Job_Knowledge_Notes__c__is_set = false;

  private java.lang.String Job_Knowledge_Notes__c;

  public java.lang.String getJob_Knowledge_Notes__c() {
    return Job_Knowledge_Notes__c;
  }

  

  public void setJob_Knowledge_Notes__c(java.lang.String Job_Knowledge_Notes__c) {
    this.Job_Knowledge_Notes__c = Job_Knowledge_Notes__c;
    Job_Knowledge_Notes__c__is_set = true;
  }
  
  /**
   * element  : Job_Knowledge_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Knowledge_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Knowledge_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Job_Knowledge_Rating__c__is_set = false;

  private java.lang.String Job_Knowledge_Rating__c;

  public java.lang.String getJob_Knowledge_Rating__c() {
    return Job_Knowledge_Rating__c;
  }

  

  public void setJob_Knowledge_Rating__c(java.lang.String Job_Knowledge_Rating__c) {
    this.Job_Knowledge_Rating__c = Job_Knowledge_Rating__c;
    Job_Knowledge_Rating__c__is_set = true;
  }
  
  /**
   * element  : Job_Knowledge__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Knowledge__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Knowledge__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Job_Knowledge__c__is_set = false;

  private java.lang.String Job_Knowledge__c;

  public java.lang.String getJob_Knowledge__c() {
    return Job_Knowledge__c;
  }

  

  public void setJob_Knowledge__c(java.lang.String Job_Knowledge__c) {
    this.Job_Knowledge__c = Job_Knowledge__c;
    Job_Knowledge__c__is_set = true;
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
   * element  : Manager_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Manager_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Manager_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Manager_Status__c__is_set = false;

  private java.lang.String Manager_Status__c;

  public java.lang.String getManager_Status__c() {
    return Manager_Status__c;
  }

  

  public void setManager_Status__c(java.lang.String Manager_Status__c) {
    this.Manager_Status__c = Manager_Status__c;
    Manager_Status__c__is_set = true;
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
   * element  : Period_Review__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Period_Review__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Period_Review__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Period_Review__c__is_set = false;

  private java.lang.String Period_Review__c;

  public java.lang.String getPeriod_Review__c() {
    return Period_Review__c;
  }

  

  public void setPeriod_Review__c(java.lang.String Period_Review__c) {
    this.Period_Review__c = Period_Review__c;
    Period_Review__c__is_set = true;
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
   * element  : Quality_of_Work_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Quality_of_Work_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quality_of_Work_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Quality_of_Work_Notes__c__is_set = false;

  private java.lang.String Quality_of_Work_Notes__c;

  public java.lang.String getQuality_of_Work_Notes__c() {
    return Quality_of_Work_Notes__c;
  }

  

  public void setQuality_of_Work_Notes__c(java.lang.String Quality_of_Work_Notes__c) {
    this.Quality_of_Work_Notes__c = Quality_of_Work_Notes__c;
    Quality_of_Work_Notes__c__is_set = true;
  }
  
  /**
   * element  : Quality_of_Work_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Quality_of_Work_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quality_of_Work_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Quality_of_Work_Rating__c__is_set = false;

  private java.lang.String Quality_of_Work_Rating__c;

  public java.lang.String getQuality_of_Work_Rating__c() {
    return Quality_of_Work_Rating__c;
  }

  

  public void setQuality_of_Work_Rating__c(java.lang.String Quality_of_Work_Rating__c) {
    this.Quality_of_Work_Rating__c = Quality_of_Work_Rating__c;
    Quality_of_Work_Rating__c__is_set = true;
  }
  
  /**
   * element  : Quality_of_Work__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Quality_of_Work__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quality_of_Work__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Quality_of_Work__c__is_set = false;

  private java.lang.String Quality_of_Work__c;

  public java.lang.String getQuality_of_Work__c() {
    return Quality_of_Work__c;
  }

  

  public void setQuality_of_Work__c(java.lang.String Quality_of_Work__c) {
    this.Quality_of_Work__c = Quality_of_Work__c;
    Quality_of_Work__c__is_set = true;
  }
  
  /**
   * element  : Quantity_of_Work_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Quantity_of_Work_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quantity_of_Work_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Quantity_of_Work_Notes__c__is_set = false;

  private java.lang.String Quantity_of_Work_Notes__c;

  public java.lang.String getQuantity_of_Work_Notes__c() {
    return Quantity_of_Work_Notes__c;
  }

  

  public void setQuantity_of_Work_Notes__c(java.lang.String Quantity_of_Work_Notes__c) {
    this.Quantity_of_Work_Notes__c = Quantity_of_Work_Notes__c;
    Quantity_of_Work_Notes__c__is_set = true;
  }
  
  /**
   * element  : Quantity_of_Work_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Quantity_of_Work_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quantity_of_Work_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Quantity_of_Work_Rating__c__is_set = false;

  private java.lang.String Quantity_of_Work_Rating__c;

  public java.lang.String getQuantity_of_Work_Rating__c() {
    return Quantity_of_Work_Rating__c;
  }

  

  public void setQuantity_of_Work_Rating__c(java.lang.String Quantity_of_Work_Rating__c) {
    this.Quantity_of_Work_Rating__c = Quantity_of_Work_Rating__c;
    Quantity_of_Work_Rating__c__is_set = true;
  }
  
  /**
   * element  : Quantity_of_Work__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Quantity_of_Work__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quantity_of_Work__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Quantity_of_Work__c__is_set = false;

  private java.lang.String Quantity_of_Work__c;

  public java.lang.String getQuantity_of_Work__c() {
    return Quantity_of_Work__c;
  }

  

  public void setQuantity_of_Work__c(java.lang.String Quantity_of_Work__c) {
    this.Quantity_of_Work__c = Quantity_of_Work__c;
    Quantity_of_Work__c__is_set = true;
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
   * element  : Review_Date__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Review_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Review_Date__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean Review_Date__c__is_set = false;

  private java.util.Calendar Review_Date__c;

  public java.util.Calendar getReview_Date__c() {
    return Review_Date__c;
  }

  

  public void setReview_Date__c(java.util.Calendar Review_Date__c) {
    this.Review_Date__c = Review_Date__c;
    Review_Date__c__is_set = true;
  }
  
  /**
   * element  : Review_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Review_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Review_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Review_Notes__c__is_set = false;

  private java.lang.String Review_Notes__c;

  public java.lang.String getReview_Notes__c() {
    return Review_Notes__c;
  }

  

  public void setReview_Notes__c(java.lang.String Review_Notes__c) {
    this.Review_Notes__c = Review_Notes__c;
    Review_Notes__c__is_set = true;
  }
  
  /**
   * element  : Review_Overall_Score__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Review_Overall_Score__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Review_Overall_Score__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Review_Overall_Score__c__is_set = false;

  private java.lang.String Review_Overall_Score__c;

  public java.lang.String getReview_Overall_Score__c() {
    return Review_Overall_Score__c;
  }

  

  public void setReview_Overall_Score__c(java.lang.String Review_Overall_Score__c) {
    this.Review_Overall_Score__c = Review_Overall_Score__c;
    Review_Overall_Score__c__is_set = true;
  }
  
  /**
   * element  : Review_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Review_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Review_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Review_Type__c__is_set = false;

  private java.lang.String Review_Type__c;

  public java.lang.String getReview_Type__c() {
    return Review_Type__c;
  }

  

  public void setReview_Type__c(java.lang.String Review_Type__c) {
    this.Review_Type__c = Review_Type__c;
    Review_Type__c__is_set = true;
  }
  
  /**
   * element  : Reviewer__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Reviewer__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Reviewer__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Reviewer__c__is_set = false;

  private java.lang.String Reviewer__c;

  public java.lang.String getReviewer__c() {
    return Reviewer__c;
  }

  

  public void setReviewer__c(java.lang.String Reviewer__c) {
    this.Reviewer__c = Reviewer__c;
    Reviewer__c__is_set = true;
  }
  
  /**
   * element  : Supervision_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Supervision_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Supervision_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Supervision_Notes__c__is_set = false;

  private java.lang.String Supervision_Notes__c;

  public java.lang.String getSupervision_Notes__c() {
    return Supervision_Notes__c;
  }

  

  public void setSupervision_Notes__c(java.lang.String Supervision_Notes__c) {
    this.Supervision_Notes__c = Supervision_Notes__c;
    Supervision_Notes__c__is_set = true;
  }
  
  /**
   * element  : Supervision_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Supervision_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Supervision_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Supervision_Rating__c__is_set = false;

  private java.lang.String Supervision_Rating__c;

  public java.lang.String getSupervision_Rating__c() {
    return Supervision_Rating__c;
  }

  

  public void setSupervision_Rating__c(java.lang.String Supervision_Rating__c) {
    this.Supervision_Rating__c = Supervision_Rating__c;
    Supervision_Rating__c__is_set = true;
  }
  
  /**
   * element  : Supervision__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Supervision__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Supervision__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Supervision__c__is_set = false;

  private java.lang.String Supervision__c;

  public java.lang.String getSupervision__c() {
    return Supervision__c;
  }

  

  public void setSupervision__c(java.lang.String Supervision__c) {
    this.Supervision__c = Supervision__c;
    Supervision__c__is_set = true;
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
   * element  : Teamwork_Cooperation_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Teamwork_Cooperation_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Teamwork_Cooperation_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Teamwork_Cooperation_Rating__c__is_set = false;

  private java.lang.String Teamwork_Cooperation_Rating__c;

  public java.lang.String getTeamwork_Cooperation_Rating__c() {
    return Teamwork_Cooperation_Rating__c;
  }

  

  public void setTeamwork_Cooperation_Rating__c(java.lang.String Teamwork_Cooperation_Rating__c) {
    this.Teamwork_Cooperation_Rating__c = Teamwork_Cooperation_Rating__c;
    Teamwork_Cooperation_Rating__c__is_set = true;
  }
  
  /**
   * element  : Teamwork_and_Cooperation_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Teamwork_and_Cooperation_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Teamwork_and_Cooperation_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Teamwork_and_Cooperation_Notes__c__is_set = false;

  private java.lang.String Teamwork_and_Cooperation_Notes__c;

  public java.lang.String getTeamwork_and_Cooperation_Notes__c() {
    return Teamwork_and_Cooperation_Notes__c;
  }

  

  public void setTeamwork_and_Cooperation_Notes__c(java.lang.String Teamwork_and_Cooperation_Notes__c) {
    this.Teamwork_and_Cooperation_Notes__c = Teamwork_and_Cooperation_Notes__c;
    Teamwork_and_Cooperation_Notes__c__is_set = true;
  }
  
  /**
   * element  : Teamwork_and_Cooperation__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Teamwork_and_Cooperation__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Teamwork_and_Cooperation__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Teamwork_and_Cooperation__c__is_set = false;

  private java.lang.String Teamwork_and_Cooperation__c;

  public java.lang.String getTeamwork_and_Cooperation__c() {
    return Teamwork_and_Cooperation__c;
  }

  

  public void setTeamwork_and_Cooperation__c(java.lang.String Teamwork_and_Cooperation__c) {
    this.Teamwork_and_Cooperation__c = Teamwork_and_Cooperation__c;
    Teamwork_and_Cooperation__c__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "SFDC_Performance_Review__c");
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
    __typeMapper.writeString(__out, Customer_Service_Internal_External__c__typeInfo, Customer_Service_Internal_External__c, Customer_Service_Internal_External__c__is_set);
    __typeMapper.writeString(__out, Customer_Service_Notes__c__typeInfo, Customer_Service_Notes__c, Customer_Service_Notes__c__is_set);
    __typeMapper.writeString(__out, Customer_Service_Rating__c__typeInfo, Customer_Service_Rating__c, Customer_Service_Rating__c__is_set);
    __typeMapper.writeString(__out, Dependability_Notes__c__typeInfo, Dependability_Notes__c, Dependability_Notes__c__is_set);
    __typeMapper.writeString(__out, Dependability_Rating__c__typeInfo, Dependability_Rating__c, Dependability_Rating__c__is_set);
    __typeMapper.writeString(__out, Dependability__c__typeInfo, Dependability__c, Dependability__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeString(__out, Employee_Comments__c__typeInfo, Employee_Comments__c, Employee_Comments__c__is_set);
    __typeMapper.writeString(__out, Employee_Review_Notes__c__typeInfo, Employee_Review_Notes__c, Employee_Review_Notes__c__is_set);
    __typeMapper.writeString(__out, Employee__c__typeInfo, Employee__c, Employee__c__is_set);
    __typeMapper.writeObject(__out, Employee__r__typeInfo, Employee__r, Employee__r__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeString(__out, Initiative_Notes__c__typeInfo, Initiative_Notes__c, Initiative_Notes__c__is_set);
    __typeMapper.writeString(__out, Initiative_Rating__c__typeInfo, Initiative_Rating__c, Initiative_Rating__c__is_set);
    __typeMapper.writeString(__out, Initiative__c__typeInfo, Initiative__c, Initiative__c__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Job_Knowledge_Notes__c__typeInfo, Job_Knowledge_Notes__c, Job_Knowledge_Notes__c__is_set);
    __typeMapper.writeString(__out, Job_Knowledge_Rating__c__typeInfo, Job_Knowledge_Rating__c, Job_Knowledge_Rating__c__is_set);
    __typeMapper.writeString(__out, Job_Knowledge__c__typeInfo, Job_Knowledge__c, Job_Knowledge__c__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Manager_Status__c__typeInfo, Manager_Status__c, Manager_Status__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Period_Review__c__typeInfo, Period_Review__c, Period_Review__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeString(__out, Quality_of_Work_Notes__c__typeInfo, Quality_of_Work_Notes__c, Quality_of_Work_Notes__c__is_set);
    __typeMapper.writeString(__out, Quality_of_Work_Rating__c__typeInfo, Quality_of_Work_Rating__c, Quality_of_Work_Rating__c__is_set);
    __typeMapper.writeString(__out, Quality_of_Work__c__typeInfo, Quality_of_Work__c, Quality_of_Work__c__is_set);
    __typeMapper.writeString(__out, Quantity_of_Work_Notes__c__typeInfo, Quantity_of_Work_Notes__c, Quantity_of_Work_Notes__c__is_set);
    __typeMapper.writeString(__out, Quantity_of_Work_Rating__c__typeInfo, Quantity_of_Work_Rating__c, Quantity_of_Work_Rating__c__is_set);
    __typeMapper.writeString(__out, Quantity_of_Work__c__typeInfo, Quantity_of_Work__c, Quantity_of_Work__c__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, Review_Date__c__typeInfo, Review_Date__c, Review_Date__c__is_set);
    __typeMapper.writeString(__out, Review_Notes__c__typeInfo, Review_Notes__c, Review_Notes__c__is_set);
    __typeMapper.writeString(__out, Review_Overall_Score__c__typeInfo, Review_Overall_Score__c, Review_Overall_Score__c__is_set);
    __typeMapper.writeString(__out, Review_Type__c__typeInfo, Review_Type__c, Review_Type__c__is_set);
    __typeMapper.writeString(__out, Reviewer__c__typeInfo, Reviewer__c, Reviewer__c__is_set);
    __typeMapper.writeString(__out, Supervision_Notes__c__typeInfo, Supervision_Notes__c, Supervision_Notes__c__is_set);
    __typeMapper.writeString(__out, Supervision_Rating__c__typeInfo, Supervision_Rating__c, Supervision_Rating__c__is_set);
    __typeMapper.writeString(__out, Supervision__c__typeInfo, Supervision__c, Supervision__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeString(__out, Teamwork_Cooperation_Rating__c__typeInfo, Teamwork_Cooperation_Rating__c, Teamwork_Cooperation_Rating__c__is_set);
    __typeMapper.writeString(__out, Teamwork_and_Cooperation_Notes__c__typeInfo, Teamwork_and_Cooperation_Notes__c, Teamwork_and_Cooperation_Notes__c__is_set);
    __typeMapper.writeString(__out, Teamwork_and_Cooperation__c__typeInfo, Teamwork_and_Cooperation__c, Teamwork_and_Cooperation__c__is_set);
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
    if (__typeMapper.isElement(__in, Customer_Service_Internal_External__c__typeInfo)) {
      setCustomer_Service_Internal_External__c((java.lang.String)__typeMapper.readString(__in, Customer_Service_Internal_External__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Customer_Service_Notes__c__typeInfo)) {
      setCustomer_Service_Notes__c((java.lang.String)__typeMapper.readString(__in, Customer_Service_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Customer_Service_Rating__c__typeInfo)) {
      setCustomer_Service_Rating__c((java.lang.String)__typeMapper.readString(__in, Customer_Service_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Dependability_Notes__c__typeInfo)) {
      setDependability_Notes__c((java.lang.String)__typeMapper.readString(__in, Dependability_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Dependability_Rating__c__typeInfo)) {
      setDependability_Rating__c((java.lang.String)__typeMapper.readString(__in, Dependability_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Dependability__c__typeInfo)) {
      setDependability__c((java.lang.String)__typeMapper.readString(__in, Dependability__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Employee_Comments__c__typeInfo)) {
      setEmployee_Comments__c((java.lang.String)__typeMapper.readString(__in, Employee_Comments__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee_Review_Notes__c__typeInfo)) {
      setEmployee_Review_Notes__c((java.lang.String)__typeMapper.readString(__in, Employee_Review_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee__c__typeInfo)) {
      setEmployee__c((java.lang.String)__typeMapper.readString(__in, Employee__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee__r__typeInfo)) {
      setEmployee__r((com.sforce.soap.enterprise.sobject.SFDC_Employee__c)__typeMapper.readObject(__in, Employee__r__typeInfo, com.sforce.soap.enterprise.sobject.SFDC_Employee__c.class));
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
    if (__typeMapper.isElement(__in, Initiative_Notes__c__typeInfo)) {
      setInitiative_Notes__c((java.lang.String)__typeMapper.readString(__in, Initiative_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Initiative_Rating__c__typeInfo)) {
      setInitiative_Rating__c((java.lang.String)__typeMapper.readString(__in, Initiative_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Initiative__c__typeInfo)) {
      setInitiative__c((java.lang.String)__typeMapper.readString(__in, Initiative__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_Knowledge_Notes__c__typeInfo)) {
      setJob_Knowledge_Notes__c((java.lang.String)__typeMapper.readString(__in, Job_Knowledge_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_Knowledge_Rating__c__typeInfo)) {
      setJob_Knowledge_Rating__c((java.lang.String)__typeMapper.readString(__in, Job_Knowledge_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_Knowledge__c__typeInfo)) {
      setJob_Knowledge__c((java.lang.String)__typeMapper.readString(__in, Job_Knowledge__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Manager_Status__c__typeInfo)) {
      setManager_Status__c((java.lang.String)__typeMapper.readString(__in, Manager_Status__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Period_Review__c__typeInfo)) {
      setPeriod_Review__c((java.lang.String)__typeMapper.readString(__in, Period_Review__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Quality_of_Work_Notes__c__typeInfo)) {
      setQuality_of_Work_Notes__c((java.lang.String)__typeMapper.readString(__in, Quality_of_Work_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Quality_of_Work_Rating__c__typeInfo)) {
      setQuality_of_Work_Rating__c((java.lang.String)__typeMapper.readString(__in, Quality_of_Work_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Quality_of_Work__c__typeInfo)) {
      setQuality_of_Work__c((java.lang.String)__typeMapper.readString(__in, Quality_of_Work__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Quantity_of_Work_Notes__c__typeInfo)) {
      setQuantity_of_Work_Notes__c((java.lang.String)__typeMapper.readString(__in, Quantity_of_Work_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Quantity_of_Work_Rating__c__typeInfo)) {
      setQuantity_of_Work_Rating__c((java.lang.String)__typeMapper.readString(__in, Quantity_of_Work_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Quantity_of_Work__c__typeInfo)) {
      setQuantity_of_Work__c((java.lang.String)__typeMapper.readString(__in, Quantity_of_Work__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordAssociatedGroups__typeInfo)) {
      setRecordAssociatedGroups((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecordAssociatedGroups__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Review_Date__c__typeInfo)) {
      setReview_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Review_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Review_Notes__c__typeInfo)) {
      setReview_Notes__c((java.lang.String)__typeMapper.readString(__in, Review_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Review_Overall_Score__c__typeInfo)) {
      setReview_Overall_Score__c((java.lang.String)__typeMapper.readString(__in, Review_Overall_Score__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Review_Type__c__typeInfo)) {
      setReview_Type__c((java.lang.String)__typeMapper.readString(__in, Review_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Reviewer__c__typeInfo)) {
      setReviewer__c((java.lang.String)__typeMapper.readString(__in, Reviewer__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Supervision_Notes__c__typeInfo)) {
      setSupervision_Notes__c((java.lang.String)__typeMapper.readString(__in, Supervision_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Supervision_Rating__c__typeInfo)) {
      setSupervision_Rating__c((java.lang.String)__typeMapper.readString(__in, Supervision_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Supervision__c__typeInfo)) {
      setSupervision__c((java.lang.String)__typeMapper.readString(__in, Supervision__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Teamwork_Cooperation_Rating__c__typeInfo)) {
      setTeamwork_Cooperation_Rating__c((java.lang.String)__typeMapper.readString(__in, Teamwork_Cooperation_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Teamwork_and_Cooperation_Notes__c__typeInfo)) {
      setTeamwork_and_Cooperation_Notes__c((java.lang.String)__typeMapper.readString(__in, Teamwork_and_Cooperation_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Teamwork_and_Cooperation__c__typeInfo)) {
      setTeamwork_and_Cooperation__c((java.lang.String)__typeMapper.readString(__in, Teamwork_and_Cooperation__c__typeInfo, java.lang.String.class));
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
    sb.append("[SFDC_Performance_Review__c ");
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
    sb.append(" Customer_Service_Internal_External__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Customer_Service_Internal_External__c)+"'\n");
    sb.append(" Customer_Service_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Customer_Service_Notes__c)+"'\n");
    sb.append(" Customer_Service_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Customer_Service_Rating__c)+"'\n");
    sb.append(" Dependability_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Dependability_Notes__c)+"'\n");
    sb.append(" Dependability_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Dependability_Rating__c)+"'\n");
    sb.append(" Dependability__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Dependability__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employee_Comments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Comments__c)+"'\n");
    sb.append(" Employee_Review_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Review_Notes__c)+"'\n");
    sb.append(" Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee__c)+"'\n");
    sb.append(" Employee__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee__r)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Initiative_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Initiative_Notes__c)+"'\n");
    sb.append(" Initiative_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Initiative_Rating__c)+"'\n");
    sb.append(" Initiative__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Initiative__c)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Job_Knowledge_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Knowledge_Notes__c)+"'\n");
    sb.append(" Job_Knowledge_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Knowledge_Rating__c)+"'\n");
    sb.append(" Job_Knowledge__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Knowledge__c)+"'\n");
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
    sb.append(" Manager_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Manager_Status__c)+"'\n");
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
    sb.append(" Period_Review__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Period_Review__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Quality_of_Work_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quality_of_Work_Notes__c)+"'\n");
    sb.append(" Quality_of_Work_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quality_of_Work_Rating__c)+"'\n");
    sb.append(" Quality_of_Work__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quality_of_Work__c)+"'\n");
    sb.append(" Quantity_of_Work_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quantity_of_Work_Notes__c)+"'\n");
    sb.append(" Quantity_of_Work_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quantity_of_Work_Rating__c)+"'\n");
    sb.append(" Quantity_of_Work__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quantity_of_Work__c)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Review_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Review_Date__c)+"'\n");
    sb.append(" Review_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Review_Notes__c)+"'\n");
    sb.append(" Review_Overall_Score__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Review_Overall_Score__c)+"'\n");
    sb.append(" Review_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Review_Type__c)+"'\n");
    sb.append(" Reviewer__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Reviewer__c)+"'\n");
    sb.append(" Supervision_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Supervision_Notes__c)+"'\n");
    sb.append(" Supervision_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Supervision_Rating__c)+"'\n");
    sb.append(" Supervision__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Supervision__c)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" Teamwork_Cooperation_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Teamwork_Cooperation_Rating__c)+"'\n");
    sb.append(" Teamwork_and_Cooperation_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Teamwork_and_Cooperation_Notes__c)+"'\n");
    sb.append(" Teamwork_and_Cooperation__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Teamwork_and_Cooperation__c)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}