package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class HR_Requests__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public HR_Requests__c() {
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
   * element  : Actual_Payment_Amount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Payment_Amount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Payment_Amount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Actual_Payment_Amount__c__is_set = false;

  private java.lang.Double Actual_Payment_Amount__c;

  public java.lang.Double getActual_Payment_Amount__c() {
    return Actual_Payment_Amount__c;
  }

  

  public void setActual_Payment_Amount__c(java.lang.Double Actual_Payment_Amount__c) {
    this.Actual_Payment_Amount__c = Actual_Payment_Amount__c;
    Actual_Payment_Amount__c__is_set = true;
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
   * element  : Bill_Amount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Bill_Amount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Bill_Amount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Bill_Amount__c__is_set = false;

  private java.lang.Double Bill_Amount__c;

  public java.lang.Double getBill_Amount__c() {
    return Bill_Amount__c;
  }

  

  public void setBill_Amount__c(java.lang.Double Bill_Amount__c) {
    this.Bill_Amount__c = Bill_Amount__c;
    Bill_Amount__c__is_set = true;
  }
  
  /**
   * element  : Bill_to__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Bill_to__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Bill_to__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Bill_to__c__is_set = false;

  private java.lang.String Bill_to__c;

  public java.lang.String getBill_to__c() {
    return Bill_to__c;
  }

  

  public void setBill_to__c(java.lang.String Bill_to__c) {
    this.Bill_to__c = Bill_to__c;
    Bill_to__c__is_set = true;
  }
  
  /**
   * element  : Charge_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Charge_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Charge_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Charge_Date__c__is_set = false;

  private java.util.Calendar Charge_Date__c;

  public java.util.Calendar getCharge_Date__c() {
    return Charge_Date__c;
  }

  

  public void setCharge_Date__c(java.util.Calendar Charge_Date__c) {
    this.Charge_Date__c = Charge_Date__c;
    Charge_Date__c__is_set = true;
  }
  
  /**
   * element  : Check_Cost__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Check_Cost__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Check_Cost__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Check_Cost__c__is_set = false;

  private java.lang.Double Check_Cost__c;

  public java.lang.Double getCheck_Cost__c() {
    return Check_Cost__c;
  }

  

  public void setCheck_Cost__c(java.lang.Double Check_Cost__c) {
    this.Check_Cost__c = Check_Cost__c;
    Check_Cost__c__is_set = true;
  }
  
  /**
   * element  : ClickSafetyOrder__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ClickSafetyOrder__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ClickSafetyOrder__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ClickSafetyOrder__c__is_set = false;

  private java.lang.String ClickSafetyOrder__c;

  public java.lang.String getClickSafetyOrder__c() {
    return ClickSafetyOrder__c;
  }

  

  public void setClickSafetyOrder__c(java.lang.String ClickSafetyOrder__c) {
    this.ClickSafetyOrder__c = ClickSafetyOrder__c;
    ClickSafetyOrder__c__is_set = true;
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
   * element  : Cost__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Cost__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cost__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Cost__c__is_set = false;

  private java.lang.Double Cost__c;

  public java.lang.Double getCost__c() {
    return Cost__c;
  }

  

  public void setCost__c(java.lang.Double Cost__c) {
    this.Cost__c = Cost__c;
    Cost__c__is_set = true;
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
   * element  : DOB__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo DOB__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DOB__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean DOB__c__is_set = false;

  private java.util.Calendar DOB__c;

  public java.util.Calendar getDOB__c() {
    return DOB__c;
  }

  

  public void setDOB__c(java.util.Calendar DOB__c) {
    this.DOB__c = DOB__c;
    DOB__c__is_set = true;
  }
  
  /**
   * element  : DT_Test_Date_Text__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DT_Test_Date_Text__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DT_Test_Date_Text__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DT_Test_Date_Text__c__is_set = false;

  private java.lang.String DT_Test_Date_Text__c;

  public java.lang.String getDT_Test_Date_Text__c() {
    return DT_Test_Date_Text__c;
  }

  

  public void setDT_Test_Date_Text__c(java.lang.String DT_Test_Date_Text__c) {
    this.DT_Test_Date_Text__c = DT_Test_Date_Text__c;
    DT_Test_Date_Text__c__is_set = true;
  }
  
  /**
   * element  : Date_of_Test__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_of_Test__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_of_Test__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_of_Test__c__is_set = false;

  private java.util.Calendar Date_of_Test__c;

  public java.util.Calendar getDate_of_Test__c() {
    return Date_of_Test__c;
  }

  

  public void setDate_of_Test__c(java.util.Calendar Date_of_Test__c) {
    this.Date_of_Test__c = Date_of_Test__c;
    Date_of_Test__c__is_set = true;
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
   * element  : EE_Email__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EE_Email__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EE_Email__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EE_Email__c__is_set = false;

  private java.lang.String EE_Email__c;

  public java.lang.String getEE_Email__c() {
    return EE_Email__c;
  }

  

  public void setEE_Email__c(java.lang.String EE_Email__c) {
    this.EE_Email__c = EE_Email__c;
    EE_Email__c__is_set = true;
  }
  
  /**
   * element  : EE_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EE_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EE_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EE_Phone__c__is_set = false;

  private java.lang.String EE_Phone__c;

  public java.lang.String getEE_Phone__c() {
    return EE_Phone__c;
  }

  

  public void setEE_Phone__c(java.lang.String EE_Phone__c) {
    this.EE_Phone__c = EE_Phone__c;
    EE_Phone__c__is_set = true;
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
   * element  : Feeds of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Feeds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Feeds","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Feeds__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Feeds;

  public com.sforce.soap.enterprise.QueryResult getFeeds() {
    return Feeds;
  }

  

  public void setFeeds(com.sforce.soap.enterprise.QueryResult Feeds) {
    this.Feeds = Feeds;
    Feeds__is_set = true;
  }
  
  /**
   * element  : HASC_Training_Cost__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo HASC_Training_Cost__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HASC_Training_Cost__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean HASC_Training_Cost__c__is_set = false;

  private java.lang.Double HASC_Training_Cost__c;

  public java.lang.Double getHASC_Training_Cost__c() {
    return HASC_Training_Cost__c;
  }

  

  public void setHASC_Training_Cost__c(java.lang.Double HASC_Training_Cost__c) {
    this.HASC_Training_Cost__c = HASC_Training_Cost__c;
    HASC_Training_Cost__c__is_set = true;
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
   * element  : Injury_Case__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Injury_Case__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Injury_Case__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Injury_Case__c__is_set = false;

  private java.lang.String Injury_Case__c;

  public java.lang.String getInjury_Case__c() {
    return Injury_Case__c;
  }

  

  public void setInjury_Case__c(java.lang.String Injury_Case__c) {
    this.Injury_Case__c = Injury_Case__c;
    Injury_Case__c__is_set = true;
  }
  
  /**
   * element  : Injury_Case__r of type {urn:sobject.enterprise.soap.sforce.com}Case
   * java type: com.sforce.soap.enterprise.sobject.Case
   */
  private static final com.sforce.ws.bind.TypeInfo Injury_Case__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Injury_Case__r","urn:sobject.enterprise.soap.sforce.com","Case",0,1,true);

  private boolean Injury_Case__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Case Injury_Case__r;

  public com.sforce.soap.enterprise.sobject.Case getInjury_Case__r() {
    return Injury_Case__r;
  }

  

  public void setInjury_Case__r(com.sforce.soap.enterprise.sobject.Case Injury_Case__r) {
    this.Injury_Case__r = Injury_Case__r;
    Injury_Case__r__is_set = true;
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
   * element  : Method_of_Payment__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Method_of_Payment__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Method_of_Payment__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Method_of_Payment__c__is_set = false;

  private java.lang.String Method_of_Payment__c;

  public java.lang.String getMethod_of_Payment__c() {
    return Method_of_Payment__c;
  }

  

  public void setMethod_of_Payment__c(java.lang.String Method_of_Payment__c) {
    this.Method_of_Payment__c = Method_of_Payment__c;
    Method_of_Payment__c__is_set = true;
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
   * element  : Notes_and_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Notes_and_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes_and_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Notes_and_Instructions__c__is_set = false;

  private java.lang.String Notes_and_Instructions__c;

  public java.lang.String getNotes_and_Instructions__c() {
    return Notes_and_Instructions__c;
  }

  

  public void setNotes_and_Instructions__c(java.lang.String Notes_and_Instructions__c) {
    this.Notes_and_Instructions__c = Notes_and_Instructions__c;
    Notes_and_Instructions__c__is_set = true;
  }
  
  /**
   * element  : Number_of_Drugs_Tested__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Number_of_Drugs_Tested__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number_of_Drugs_Tested__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Number_of_Drugs_Tested__c__is_set = false;

  private java.lang.String Number_of_Drugs_Tested__c;

  public java.lang.String getNumber_of_Drugs_Tested__c() {
    return Number_of_Drugs_Tested__c;
  }

  

  public void setNumber_of_Drugs_Tested__c(java.lang.String Number_of_Drugs_Tested__c) {
    this.Number_of_Drugs_Tested__c = Number_of_Drugs_Tested__c;
    Number_of_Drugs_Tested__c__is_set = true;
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
   * element  : Password_Issued__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Password_Issued__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Password_Issued__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Password_Issued__c__is_set = false;

  private java.lang.String Password_Issued__c;

  public java.lang.String getPassword_Issued__c() {
    return Password_Issued__c;
  }

  

  public void setPassword_Issued__c(java.lang.String Password_Issued__c) {
    this.Password_Issued__c = Password_Issued__c;
    Password_Issued__c__is_set = true;
  }
  
  /**
   * element  : Payment_Method__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Payment_Method__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Payment_Method__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Payment_Method__c__is_set = false;

  private java.lang.String Payment_Method__c;

  public java.lang.String getPayment_Method__c() {
    return Payment_Method__c;
  }

  

  public void setPayment_Method__c(java.lang.String Payment_Method__c) {
    this.Payment_Method__c = Payment_Method__c;
    Payment_Method__c__is_set = true;
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
   * element  : Quoted_Cost__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Quoted_Cost__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quoted_Cost__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Quoted_Cost__c__is_set = false;

  private java.lang.Double Quoted_Cost__c;

  public java.lang.Double getQuoted_Cost__c() {
    return Quoted_Cost__c;
  }

  

  public void setQuoted_Cost__c(java.lang.Double Quoted_Cost__c) {
    this.Quoted_Cost__c = Quoted_Cost__c;
    Quoted_Cost__c__is_set = true;
  }
  
  /**
   * element  : Reason_for_Test__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Reason_for_Test__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Reason_for_Test__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Reason_for_Test__c__is_set = false;

  private java.lang.String Reason_for_Test__c;

  public java.lang.String getReason_for_Test__c() {
    return Reason_for_Test__c;
  }

  

  public void setReason_for_Test__c(java.lang.String Reason_for_Test__c) {
    this.Reason_for_Test__c = Reason_for_Test__c;
    Reason_for_Test__c__is_set = true;
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
   * element  : RecordType of type {urn:sobject.enterprise.soap.sforce.com}RecordType
   * java type: com.sforce.soap.enterprise.sobject.RecordType
   */
  private static final com.sforce.ws.bind.TypeInfo RecordType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordType","urn:sobject.enterprise.soap.sforce.com","RecordType",0,1,true);

  private boolean RecordType__is_set = false;

  private com.sforce.soap.enterprise.sobject.RecordType RecordType;

  public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
    return RecordType;
  }

  

  public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType RecordType) {
    this.RecordType = RecordType;
    RecordType__is_set = true;
  }
  
  /**
   * element  : RecordTypeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecordTypeId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RecordTypeId__is_set = false;

  private java.lang.String RecordTypeId;

  public java.lang.String getRecordTypeId() {
    return RecordTypeId;
  }

  

  public void setRecordTypeId(java.lang.String RecordTypeId) {
    this.RecordTypeId = RecordTypeId;
    RecordTypeId__is_set = true;
  }
  
  /**
   * element  : Recruiter_Email__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_Email__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_Email__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter_Email__c__is_set = false;

  private java.lang.String Recruiter_Email__c;

  public java.lang.String getRecruiter_Email__c() {
    return Recruiter_Email__c;
  }

  

  public void setRecruiter_Email__c(java.lang.String Recruiter_Email__c) {
    this.Recruiter_Email__c = Recruiter_Email__c;
    Recruiter_Email__c__is_set = true;
  }
  
  /**
   * element  : Regional_Manager__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Regional_Manager__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regional_Manager__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Regional_Manager__c__is_set = false;

  private java.lang.String Regional_Manager__c;

  public java.lang.String getRegional_Manager__c() {
    return Regional_Manager__c;
  }

  

  public void setRegional_Manager__c(java.lang.String Regional_Manager__c) {
    this.Regional_Manager__c = Regional_Manager__c;
    Regional_Manager__c__is_set = true;
  }
  
  /**
   * element  : Result__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Result__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Result__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Result__c__is_set = false;

  private java.lang.String Result__c;

  public java.lang.String getResult__c() {
    return Result__c;
  }

  

  public void setResult__c(java.lang.String Result__c) {
    this.Result__c = Result__c;
    Result__c__is_set = true;
  }
  
  /**
   * element  : SSN__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SSN__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SSN__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SSN__c__is_set = false;

  private java.lang.String SSN__c;

  public java.lang.String getSSN__c() {
    return SSN__c;
  }

  

  public void setSSN__c(java.lang.String SSN__c) {
    this.SSN__c = SSN__c;
    SSN__c__is_set = true;
  }
  
  /**
   * element  : SalespersonEmail__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SalespersonEmail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SalespersonEmail__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SalespersonEmail__c__is_set = false;

  private java.lang.String SalespersonEmail__c;

  public java.lang.String getSalespersonEmail__c() {
    return SalespersonEmail__c;
  }

  

  public void setSalespersonEmail__c(java.lang.String SalespersonEmail__c) {
    this.SalespersonEmail__c = SalespersonEmail__c;
    SalespersonEmail__c__is_set = true;
  }
  
  /**
   * element  : Setup_Handled_By__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Setup_Handled_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Setup_Handled_By__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Setup_Handled_By__c__is_set = false;

  private java.lang.String Setup_Handled_By__c;

  public java.lang.String getSetup_Handled_By__c() {
    return Setup_Handled_By__c;
  }

  

  public void setSetup_Handled_By__c(java.lang.String Setup_Handled_By__c) {
    this.Setup_Handled_By__c = Setup_Handled_By__c;
    Setup_Handled_By__c__is_set = true;
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
   * element  : Test_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Test_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Test_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Test_Type__c__is_set = false;

  private java.lang.String Test_Type__c;

  public java.lang.String getTest_Type__c() {
    return Test_Type__c;
  }

  

  public void setTest_Type__c(java.lang.String Test_Type__c) {
    this.Test_Type__c = Test_Type__c;
    Test_Type__c__is_set = true;
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
   * element  : Training_Request_Detail__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Training_Request_Detail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Training_Request_Detail__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Training_Request_Detail__c__is_set = false;

  private java.lang.String Training_Request_Detail__c;

  public java.lang.String getTraining_Request_Detail__c() {
    return Training_Request_Detail__c;
  }

  

  public void setTraining_Request_Detail__c(java.lang.String Training_Request_Detail__c) {
    this.Training_Request_Detail__c = Training_Request_Detail__c;
    Training_Request_Detail__c__is_set = true;
  }
  
  /**
   * element  : Training_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Training_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Training_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Training_Type__c__is_set = false;

  private java.lang.String Training_Type__c;

  public java.lang.String getTraining_Type__c() {
    return Training_Type__c;
  }

  

  public void setTraining_Type__c(java.lang.String Training_Type__c) {
    this.Training_Type__c = Training_Type__c;
    Training_Type__c__is_set = true;
  }
  
  /**
   * element  : Type_of_Check__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type_of_Check__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type_of_Check__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type_of_Check__c__is_set = false;

  private java.lang.String Type_of_Check__c;

  public java.lang.String getType_of_Check__c() {
    return Type_of_Check__c;
  }

  

  public void setType_of_Check__c(java.lang.String Type_of_Check__c) {
    this.Type_of_Check__c = Type_of_Check__c;
    Type_of_Check__c__is_set = true;
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
   * element  : Username_Issued__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Username_Issued__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Username_Issued__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Username_Issued__c__is_set = false;

  private java.lang.String Username_Issued__c;

  public java.lang.String getUsername_Issued__c() {
    return Username_Issued__c;
  }

  

  public void setUsername_Issued__c(java.lang.String Username_Issued__c) {
    this.Username_Issued__c = Username_Issued__c;
    Username_Issued__c__is_set = true;
  }
  
  /**
   * element  : Vendor_Charge__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Vendor_Charge__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Vendor_Charge__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Vendor_Charge__c__is_set = false;

  private java.lang.Double Vendor_Charge__c;

  public java.lang.Double getVendor_Charge__c() {
    return Vendor_Charge__c;
  }

  

  public void setVendor_Charge__c(java.lang.Double Vendor_Charge__c) {
    this.Vendor_Charge__c = Vendor_Charge__c;
    Vendor_Charge__c__is_set = true;
  }
  
  /**
   * element  : Vendor__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Vendor__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Vendor__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Vendor__c__is_set = false;

  private java.lang.String Vendor__c;

  public java.lang.String getVendor__c() {
    return Vendor__c;
  }

  

  public void setVendor__c(java.lang.String Vendor__c) {
    this.Vendor__c = Vendor__c;
    Vendor__c__is_set = true;
  }
  
  /**
   * element  : Webmerge_Documents__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Webmerge_Documents__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Webmerge_Documents__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Webmerge_Documents__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Webmerge_Documents__r;

  public com.sforce.soap.enterprise.QueryResult getWebmerge_Documents__r() {
    return Webmerge_Documents__r;
  }

  

  public void setWebmerge_Documents__r(com.sforce.soap.enterprise.QueryResult Webmerge_Documents__r) {
    this.Webmerge_Documents__r = Webmerge_Documents__r;
    Webmerge_Documents__r__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "HR_Requests__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, Actual_Payment_Amount__c__typeInfo, Actual_Payment_Amount__c, Actual_Payment_Amount__c__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, Bill_Amount__c__typeInfo, Bill_Amount__c, Bill_Amount__c__is_set);
    __typeMapper.writeString(__out, Bill_to__c__typeInfo, Bill_to__c, Bill_to__c__is_set);
    __typeMapper.writeObject(__out, Charge_Date__c__typeInfo, Charge_Date__c, Charge_Date__c__is_set);
    __typeMapper.writeObject(__out, Check_Cost__c__typeInfo, Check_Cost__c, Check_Cost__c__is_set);
    __typeMapper.writeString(__out, ClickSafetyOrder__c__typeInfo, ClickSafetyOrder__c, ClickSafetyOrder__c__is_set);
    __typeMapper.writeString(__out, Client__c__typeInfo, Client__c, Client__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, Cost__c__typeInfo, Cost__c, Cost__c__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DOB__c__typeInfo, DOB__c, DOB__c__is_set);
    __typeMapper.writeString(__out, DT_Test_Date_Text__c__typeInfo, DT_Test_Date_Text__c, DT_Test_Date_Text__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Test__c__typeInfo, Date_of_Test__c, Date_of_Test__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeString(__out, EE_Email__c__typeInfo, EE_Email__c, EE_Email__c__is_set);
    __typeMapper.writeString(__out, EE_Phone__c__typeInfo, EE_Phone__c, EE_Phone__c__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeString(__out, Employee_ID__c__typeInfo, Employee_ID__c, Employee_ID__c__is_set);
    __typeMapper.writeString(__out, Employee__c__typeInfo, Employee__c, Employee__c__is_set);
    __typeMapper.writeObject(__out, Employee__r__typeInfo, Employee__r, Employee__r__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, HASC_Training_Cost__c__typeInfo, HASC_Training_Cost__c, HASC_Training_Cost__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, Injury_Case__c__typeInfo, Injury_Case__c, Injury_Case__c__is_set);
    __typeMapper.writeObject(__out, Injury_Case__r__typeInfo, Injury_Case__r, Injury_Case__r__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Method_of_Payment__c__typeInfo, Method_of_Payment__c, Method_of_Payment__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeString(__out, Notes_and_Instructions__c__typeInfo, Notes_and_Instructions__c, Notes_and_Instructions__c__is_set);
    __typeMapper.writeString(__out, Number_of_Drugs_Tested__c__typeInfo, Number_of_Drugs_Tested__c, Number_of_Drugs_Tested__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeString(__out, Order__c__typeInfo, Order__c, Order__c__is_set);
    __typeMapper.writeObject(__out, Order__r__typeInfo, Order__r, Order__r__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Password_Issued__c__typeInfo, Password_Issued__c, Password_Issued__c__is_set);
    __typeMapper.writeString(__out, Payment_Method__c__typeInfo, Payment_Method__c, Payment_Method__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, Quoted_Cost__c__typeInfo, Quoted_Cost__c, Quoted_Cost__c__is_set);
    __typeMapper.writeString(__out, Reason_for_Test__c__typeInfo, Reason_for_Test__c, Reason_for_Test__c__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeString(__out, Recruiter_Email__c__typeInfo, Recruiter_Email__c, Recruiter_Email__c__is_set);
    __typeMapper.writeString(__out, Regional_Manager__c__typeInfo, Regional_Manager__c, Regional_Manager__c__is_set);
    __typeMapper.writeString(__out, Result__c__typeInfo, Result__c, Result__c__is_set);
    __typeMapper.writeString(__out, SSN__c__typeInfo, SSN__c, SSN__c__is_set);
    __typeMapper.writeString(__out, SalespersonEmail__c__typeInfo, SalespersonEmail__c, SalespersonEmail__c__is_set);
    __typeMapper.writeString(__out, Setup_Handled_By__c__typeInfo, Setup_Handled_By__c, Setup_Handled_By__c__is_set);
    __typeMapper.writeString(__out, Status__c__typeInfo, Status__c, Status__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeString(__out, Test_Type__c__typeInfo, Test_Type__c, Test_Type__c__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeString(__out, Training_Request_Detail__c__typeInfo, Training_Request_Detail__c, Training_Request_Detail__c__is_set);
    __typeMapper.writeString(__out, Training_Type__c__typeInfo, Training_Type__c, Training_Type__c__is_set);
    __typeMapper.writeString(__out, Type_of_Check__c__typeInfo, Type_of_Check__c, Type_of_Check__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeString(__out, Username_Issued__c__typeInfo, Username_Issued__c, Username_Issued__c__is_set);
    __typeMapper.writeObject(__out, Vendor_Charge__c__typeInfo, Vendor_Charge__c, Vendor_Charge__c__is_set);
    __typeMapper.writeString(__out, Vendor__c__typeInfo, Vendor__c, Vendor__c__is_set);
    __typeMapper.writeObject(__out, Webmerge_Documents__r__typeInfo, Webmerge_Documents__r, Webmerge_Documents__r__is_set);
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
    if (__typeMapper.isElement(__in, Actual_Payment_Amount__c__typeInfo)) {
      setActual_Payment_Amount__c((java.lang.Double)__typeMapper.readObject(__in, Actual_Payment_Amount__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Bill_Amount__c__typeInfo)) {
      setBill_Amount__c((java.lang.Double)__typeMapper.readObject(__in, Bill_Amount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Bill_to__c__typeInfo)) {
      setBill_to__c((java.lang.String)__typeMapper.readString(__in, Bill_to__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Charge_Date__c__typeInfo)) {
      setCharge_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Charge_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Check_Cost__c__typeInfo)) {
      setCheck_Cost__c((java.lang.Double)__typeMapper.readObject(__in, Check_Cost__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ClickSafetyOrder__c__typeInfo)) {
      setClickSafetyOrder__c((java.lang.String)__typeMapper.readString(__in, ClickSafetyOrder__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cost__c__typeInfo)) {
      setCost__c((java.lang.Double)__typeMapper.readObject(__in, Cost__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, DOB__c__typeInfo)) {
      setDOB__c((java.util.Calendar)__typeMapper.readObject(__in, DOB__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DT_Test_Date_Text__c__typeInfo)) {
      setDT_Test_Date_Text__c((java.lang.String)__typeMapper.readString(__in, DT_Test_Date_Text__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Test__c__typeInfo)) {
      setDate_of_Test__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Test__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DuplicateRecordItems__typeInfo)) {
      setDuplicateRecordItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DuplicateRecordItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EE_Email__c__typeInfo)) {
      setEE_Email__c((java.lang.String)__typeMapper.readString(__in, EE_Email__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EE_Phone__c__typeInfo)) {
      setEE_Phone__c((java.lang.String)__typeMapper.readString(__in, EE_Phone__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Events__typeInfo)) {
      setEvents((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Events__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Feeds__typeInfo)) {
      setFeeds((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Feeds__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HASC_Training_Cost__c__typeInfo)) {
      setHASC_Training_Cost__c((java.lang.Double)__typeMapper.readObject(__in, HASC_Training_Cost__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Injury_Case__c__typeInfo)) {
      setInjury_Case__c((java.lang.String)__typeMapper.readString(__in, Injury_Case__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Injury_Case__r__typeInfo)) {
      setInjury_Case__r((com.sforce.soap.enterprise.sobject.Case)__typeMapper.readObject(__in, Injury_Case__r__typeInfo, com.sforce.soap.enterprise.sobject.Case.class));
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
    if (__typeMapper.isElement(__in, Method_of_Payment__c__typeInfo)) {
      setMethod_of_Payment__c((java.lang.String)__typeMapper.readString(__in, Method_of_Payment__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Notes_and_Instructions__c__typeInfo)) {
      setNotes_and_Instructions__c((java.lang.String)__typeMapper.readString(__in, Notes_and_Instructions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Number_of_Drugs_Tested__c__typeInfo)) {
      setNumber_of_Drugs_Tested__c((java.lang.String)__typeMapper.readString(__in, Number_of_Drugs_Tested__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Password_Issued__c__typeInfo)) {
      setPassword_Issued__c((java.lang.String)__typeMapper.readString(__in, Password_Issued__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payment_Method__c__typeInfo)) {
      setPayment_Method__c((java.lang.String)__typeMapper.readString(__in, Payment_Method__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Quoted_Cost__c__typeInfo)) {
      setQuoted_Cost__c((java.lang.Double)__typeMapper.readObject(__in, Quoted_Cost__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Reason_for_Test__c__typeInfo)) {
      setReason_for_Test__c((java.lang.String)__typeMapper.readString(__in, Reason_for_Test__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordAssociatedGroups__typeInfo)) {
      setRecordAssociatedGroups((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecordAssociatedGroups__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordType__typeInfo)) {
      setRecordType((com.sforce.soap.enterprise.sobject.RecordType)__typeMapper.readObject(__in, RecordType__typeInfo, com.sforce.soap.enterprise.sobject.RecordType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, RecordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter_Email__c__typeInfo)) {
      setRecruiter_Email__c((java.lang.String)__typeMapper.readString(__in, Recruiter_Email__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regional_Manager__c__typeInfo)) {
      setRegional_Manager__c((java.lang.String)__typeMapper.readString(__in, Regional_Manager__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Result__c__typeInfo)) {
      setResult__c((java.lang.String)__typeMapper.readString(__in, Result__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SSN__c__typeInfo)) {
      setSSN__c((java.lang.String)__typeMapper.readString(__in, SSN__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SalespersonEmail__c__typeInfo)) {
      setSalespersonEmail__c((java.lang.String)__typeMapper.readString(__in, SalespersonEmail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Setup_Handled_By__c__typeInfo)) {
      setSetup_Handled_By__c((java.lang.String)__typeMapper.readString(__in, Setup_Handled_By__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Test_Type__c__typeInfo)) {
      setTest_Type__c((java.lang.String)__typeMapper.readString(__in, Test_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Training_Request_Detail__c__typeInfo)) {
      setTraining_Request_Detail__c((java.lang.String)__typeMapper.readString(__in, Training_Request_Detail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Training_Type__c__typeInfo)) {
      setTraining_Type__c((java.lang.String)__typeMapper.readString(__in, Training_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type_of_Check__c__typeInfo)) {
      setType_of_Check__c((java.lang.String)__typeMapper.readString(__in, Type_of_Check__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Username_Issued__c__typeInfo)) {
      setUsername_Issued__c((java.lang.String)__typeMapper.readString(__in, Username_Issued__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Vendor_Charge__c__typeInfo)) {
      setVendor_Charge__c((java.lang.Double)__typeMapper.readObject(__in, Vendor_Charge__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Vendor__c__typeInfo)) {
      setVendor__c((java.lang.String)__typeMapper.readString(__in, Vendor__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Webmerge_Documents__r__typeInfo)) {
      setWebmerge_Documents__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Webmerge_Documents__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[HR_Requests__c ");
    sb.append(super.toString());
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Actual_Payment_Amount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Payment_Amount__c)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Bill_Amount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Bill_Amount__c)+"'\n");
    sb.append(" Bill_to__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Bill_to__c)+"'\n");
    sb.append(" Charge_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Charge_Date__c)+"'\n");
    sb.append(" Check_Cost__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Check_Cost__c)+"'\n");
    sb.append(" ClickSafetyOrder__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ClickSafetyOrder__c)+"'\n");
    sb.append(" Client__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" Cost__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cost__c)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DOB__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DOB__c)+"'\n");
    sb.append(" DT_Test_Date_Text__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DT_Test_Date_Text__c)+"'\n");
    sb.append(" Date_of_Test__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Test__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" EE_Email__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EE_Email__c)+"'\n");
    sb.append(" EE_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EE_Phone__c)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employee_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_ID__c)+"'\n");
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
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" HASC_Training_Cost__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HASC_Training_Cost__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" Injury_Case__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Injury_Case__c)+"'\n");
    sb.append(" Injury_Case__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Injury_Case__r)+"'\n");
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
    sb.append(" Method_of_Payment__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Method_of_Payment__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Notes_and_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes_and_Instructions__c)+"'\n");
    sb.append(" Number_of_Drugs_Tested__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Drugs_Tested__c)+"'\n");
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
    sb.append(" Password_Issued__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Password_Issued__c)+"'\n");
    sb.append(" Payment_Method__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payment_Method__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Quoted_Cost__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quoted_Cost__c)+"'\n");
    sb.append(" Reason_for_Test__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Reason_for_Test__c)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Recruiter_Email__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_Email__c)+"'\n");
    sb.append(" Regional_Manager__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regional_Manager__c)+"'\n");
    sb.append(" Result__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Result__c)+"'\n");
    sb.append(" SSN__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SSN__c)+"'\n");
    sb.append(" SalespersonEmail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SalespersonEmail__c)+"'\n");
    sb.append(" Setup_Handled_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Setup_Handled_By__c)+"'\n");
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
    sb.append(" Test_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Test_Type__c)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Training_Request_Detail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Training_Request_Detail__c)+"'\n");
    sb.append(" Training_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Training_Type__c)+"'\n");
    sb.append(" Type_of_Check__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type_of_Check__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" Username_Issued__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Username_Issued__c)+"'\n");
    sb.append(" Vendor_Charge__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Vendor_Charge__c)+"'\n");
    sb.append(" Vendor__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Vendor__c)+"'\n");
    sb.append(" Webmerge_Documents__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Webmerge_Documents__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}