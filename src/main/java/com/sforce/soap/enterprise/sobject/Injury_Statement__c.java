package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Injury_Statement__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Injury_Statement__c() {
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
   * element  : Current_Medications__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Current_Medications__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Current_Medications__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Current_Medications__c__is_set = false;

  private java.lang.String Current_Medications__c;

  public java.lang.String getCurrent_Medications__c() {
    return Current_Medications__c;
  }

  

  public void setCurrent_Medications__c(java.lang.String Current_Medications__c) {
    this.Current_Medications__c = Current_Medications__c;
    Current_Medications__c__is_set = true;
  }
  
  /**
   * element  : Currently_taking_medication__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Currently_taking_medication__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Currently_taking_medication__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Currently_taking_medication__c__is_set = false;

  private java.lang.String Currently_taking_medication__c;

  public java.lang.String getCurrently_taking_medication__c() {
    return Currently_taking_medication__c;
  }

  

  public void setCurrently_taking_medication__c(java.lang.String Currently_taking_medication__c) {
    this.Currently_taking_medication__c = Currently_taking_medication__c;
    Currently_taking_medication__c__is_set = true;
  }
  
  /**
   * element  : Date_of_Accident__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_of_Accident__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_of_Accident__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean Date_of_Accident__c__is_set = false;

  private java.util.Calendar Date_of_Accident__c;

  public java.util.Calendar getDate_of_Accident__c() {
    return Date_of_Accident__c;
  }

  

  public void setDate_of_Accident__c(java.util.Calendar Date_of_Accident__c) {
    this.Date_of_Accident__c = Date_of_Accident__c;
    Date_of_Accident__c__is_set = true;
  }
  
  /**
   * element  : Describe_injury__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Describe_injury__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Describe_injury__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Describe_injury__c__is_set = false;

  private java.lang.String Describe_injury__c;

  public java.lang.String getDescribe_injury__c() {
    return Describe_injury__c;
  }

  

  public void setDescribe_injury__c(java.lang.String Describe_injury__c) {
    this.Describe_injury__c = Describe_injury__c;
    Describe_injury__c__is_set = true;
  }
  
  /**
   * element  : Did_EE_mention_prior_injury__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Did_EE_mention_prior_injury__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Did_EE_mention_prior_injury__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Did_EE_mention_prior_injury__c__is_set = false;

  private java.lang.String Did_EE_mention_prior_injury__c;

  public java.lang.String getDid_EE_mention_prior_injury__c() {
    return Did_EE_mention_prior_injury__c;
  }

  

  public void setDid_EE_mention_prior_injury__c(java.lang.String Did_EE_mention_prior_injury__c) {
    this.Did_EE_mention_prior_injury__c = Did_EE_mention_prior_injury__c;
    Did_EE_mention_prior_injury__c__is_set = true;
  }
  
  /**
   * element  : Did_EE_report_the_injury_to_you__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Did_EE_report_the_injury_to_you__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Did_EE_report_the_injury_to_you__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Did_EE_report_the_injury_to_you__c__is_set = false;

  private java.lang.String Did_EE_report_the_injury_to_you__c;

  public java.lang.String getDid_EE_report_the_injury_to_you__c() {
    return Did_EE_report_the_injury_to_you__c;
  }

  

  public void setDid_EE_report_the_injury_to_you__c(java.lang.String Did_EE_report_the_injury_to_you__c) {
    this.Did_EE_report_the_injury_to_you__c = Did_EE_report_the_injury_to_you__c;
    Did_EE_report_the_injury_to_you__c__is_set = true;
  }
  
  /**
   * element  : Did_you_report_injury_to_your_supervisor__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Did_you_report_injury_to_your_supervisor__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Did_you_report_injury_to_your_supervisor__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Did_you_report_injury_to_your_supervisor__c__is_set = false;

  private java.lang.String Did_you_report_injury_to_your_supervisor__c;

  public java.lang.String getDid_you_report_injury_to_your_supervisor__c() {
    return Did_you_report_injury_to_your_supervisor__c;
  }

  

  public void setDid_you_report_injury_to_your_supervisor__c(java.lang.String Did_you_report_injury_to_your_supervisor__c) {
    this.Did_you_report_injury_to_your_supervisor__c = Did_you_report_injury_to_your_supervisor__c;
    Did_you_report_injury_to_your_supervisor__c__is_set = true;
  }
  
  /**
   * element  : Doctor_Location__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Doctor_Location__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Doctor_Location__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Doctor_Location__c__is_set = false;

  private java.lang.String Doctor_Location__c;

  public java.lang.String getDoctor_Location__c() {
    return Doctor_Location__c;
  }

  

  public void setDoctor_Location__c(java.lang.String Doctor_Location__c) {
    this.Doctor_Location__c = Doctor_Location__c;
    Doctor_Location__c__is_set = true;
  }
  
  /**
   * element  : Doctor_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Doctor_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Doctor_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Doctor_Phone__c__is_set = false;

  private java.lang.String Doctor_Phone__c;

  public java.lang.String getDoctor_Phone__c() {
    return Doctor_Phone__c;
  }

  

  public void setDoctor_Phone__c(java.lang.String Doctor_Phone__c) {
    this.Doctor_Phone__c = Doctor_Phone__c;
    Doctor_Phone__c__is_set = true;
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
   * element  : Employee_Contact_Information__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Contact_Information__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Contact_Information__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_Contact_Information__c__is_set = false;

  private java.lang.String Employee_Contact_Information__c;

  public java.lang.String getEmployee_Contact_Information__c() {
    return Employee_Contact_Information__c;
  }

  

  public void setEmployee_Contact_Information__c(java.lang.String Employee_Contact_Information__c) {
    this.Employee_Contact_Information__c = Employee_Contact_Information__c;
    Employee_Contact_Information__c__is_set = true;
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
   * element  : Have_you_had_prior_injuries_to_this_bod__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Have_you_had_prior_injuries_to_this_bod__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Have_you_had_prior_injuries_to_this_bod__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Have_you_had_prior_injuries_to_this_bod__c__is_set = false;

  private java.lang.String Have_you_had_prior_injuries_to_this_bod__c;

  public java.lang.String getHave_you_had_prior_injuries_to_this_bod__c() {
    return Have_you_had_prior_injuries_to_this_bod__c;
  }

  

  public void setHave_you_had_prior_injuries_to_this_bod__c(java.lang.String Have_you_had_prior_injuries_to_this_bod__c) {
    this.Have_you_had_prior_injuries_to_this_bod__c = Have_you_had_prior_injuries_to_this_bod__c;
    Have_you_had_prior_injuries_to_this_bod__c__is_set = true;
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
   * element  : Hobbies__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Hobbies__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Hobbies__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Hobbies__c__is_set = false;

  private java.lang.String Hobbies__c;

  public java.lang.String getHobbies__c() {
    return Hobbies__c;
  }

  

  public void setHobbies__c(java.lang.String Hobbies__c) {
    this.Hobbies__c = Hobbies__c;
    Hobbies__c__is_set = true;
  }
  
  /**
   * element  : Injured_Area__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Injured_Area__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Injured_Area__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Injured_Area__c__is_set = false;

  private java.lang.String Injured_Area__c;

  public java.lang.String getInjured_Area__c() {
    return Injured_Area__c;
  }

  

  public void setInjured_Area__c(java.lang.String Injured_Area__c) {
    this.Injured_Area__c = Injured_Area__c;
    Injured_Area__c__is_set = true;
  }
  
  /**
   * element  : Injured_Employee__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Injured_Employee__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Injured_Employee__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Injured_Employee__c__is_set = false;

  private java.lang.String Injured_Employee__c;

  public java.lang.String getInjured_Employee__c() {
    return Injured_Employee__c;
  }

  

  public void setInjured_Employee__c(java.lang.String Injured_Employee__c) {
    this.Injured_Employee__c = Injured_Employee__c;
    Injured_Employee__c__is_set = true;
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
   * element  : Medical_Attention_Required__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Medical_Attention_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Medical_Attention_Required__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Medical_Attention_Required__c__is_set = false;

  private java.lang.String Medical_Attention_Required__c;

  public java.lang.String getMedical_Attention_Required__c() {
    return Medical_Attention_Required__c;
  }

  

  public void setMedical_Attention_Required__c(java.lang.String Medical_Attention_Required__c) {
    this.Medical_Attention_Required__c = Medical_Attention_Required__c;
    Medical_Attention_Required__c__is_set = true;
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
   * element  : Name_of_your_site_supervisor__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Name_of_your_site_supervisor__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name_of_your_site_supervisor__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Name_of_your_site_supervisor__c__is_set = false;

  private java.lang.String Name_of_your_site_supervisor__c;

  public java.lang.String getName_of_your_site_supervisor__c() {
    return Name_of_your_site_supervisor__c;
  }

  

  public void setName_of_your_site_supervisor__c(java.lang.String Name_of_your_site_supervisor__c) {
    this.Name_of_your_site_supervisor__c = Name_of_your_site_supervisor__c;
    Name_of_your_site_supervisor__c__is_set = true;
  }
  
  /**
   * element  : Name_of_your_treating_Dr__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Name_of_your_treating_Dr__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Name_of_your_treating_Dr__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Name_of_your_treating_Dr__c__is_set = false;

  private java.lang.String Name_of_your_treating_Dr__c;

  public java.lang.String getName_of_your_treating_Dr__c() {
    return Name_of_your_treating_Dr__c;
  }

  

  public void setName_of_your_treating_Dr__c(java.lang.String Name_of_your_treating_Dr__c) {
    this.Name_of_your_treating_Dr__c = Name_of_your_treating_Dr__c;
    Name_of_your_treating_Dr__c__is_set = true;
  }
  
  /**
   * element  : Names_of_witnesses__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Names_of_witnesses__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Names_of_witnesses__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Names_of_witnesses__c__is_set = false;

  private java.lang.String Names_of_witnesses__c;

  public java.lang.String getNames_of_witnesses__c() {
    return Names_of_witnesses__c;
  }

  

  public void setNames_of_witnesses__c(java.lang.String Names_of_witnesses__c) {
    this.Names_of_witnesses__c = Names_of_witnesses__c;
    Names_of_witnesses__c__is_set = true;
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
   * element  : Occupation__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Occupation__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Occupation__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Occupation__c__is_set = false;

  private java.lang.String Occupation__c;

  public java.lang.String getOccupation__c() {
    return Occupation__c;
  }

  

  public void setOccupation__c(java.lang.String Occupation__c) {
    this.Occupation__c = Occupation__c;
    Occupation__c__is_set = true;
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
   * element  : Prior_Injury_Detail__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Prior_Injury_Detail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Prior_Injury_Detail__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Prior_Injury_Detail__c__is_set = false;

  private java.lang.String Prior_Injury_Detail__c;

  public java.lang.String getPrior_Injury_Detail__c() {
    return Prior_Injury_Detail__c;
  }

  

  public void setPrior_Injury_Detail__c(java.lang.String Prior_Injury_Detail__c) {
    this.Prior_Injury_Detail__c = Prior_Injury_Detail__c;
    Prior_Injury_Detail__c__is_set = true;
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
   * element  : Suggestions_for_preventing_this__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Suggestions_for_preventing_this__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Suggestions_for_preventing_this__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Suggestions_for_preventing_this__c__is_set = false;

  private java.lang.String Suggestions_for_preventing_this__c;

  public java.lang.String getSuggestions_for_preventing_this__c() {
    return Suggestions_for_preventing_this__c;
  }

  

  public void setSuggestions_for_preventing_this__c(java.lang.String Suggestions_for_preventing_this__c) {
    this.Suggestions_for_preventing_this__c = Suggestions_for_preventing_this__c;
    Suggestions_for_preventing_this__c__is_set = true;
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
   * element  : When_did_EE_report_injury_to_you__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo When_did_EE_report_injury_to_you__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","When_did_EE_report_injury_to_you__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean When_did_EE_report_injury_to_you__c__is_set = false;

  private java.util.Calendar When_did_EE_report_injury_to_you__c;

  public java.util.Calendar getWhen_did_EE_report_injury_to_you__c() {
    return When_did_EE_report_injury_to_you__c;
  }

  

  public void setWhen_did_EE_report_injury_to_you__c(java.util.Calendar When_did_EE_report_injury_to_you__c) {
    this.When_did_EE_report_injury_to_you__c = When_did_EE_report_injury_to_you__c;
    When_did_EE_report_injury_to_you__c__is_set = true;
  }
  
  /**
   * element  : When_did_you_report_to_supervisor__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo When_did_you_report_to_supervisor__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","When_did_you_report_to_supervisor__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean When_did_you_report_to_supervisor__c__is_set = false;

  private java.util.Calendar When_did_you_report_to_supervisor__c;

  public java.util.Calendar getWhen_did_you_report_to_supervisor__c() {
    return When_did_you_report_to_supervisor__c;
  }

  

  public void setWhen_did_you_report_to_supervisor__c(java.util.Calendar When_did_you_report_to_supervisor__c) {
    this.When_did_you_report_to_supervisor__c = When_did_you_report_to_supervisor__c;
    When_did_you_report_to_supervisor__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Injury_Statement__c");
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
    __typeMapper.writeString(__out, Current_Medications__c__typeInfo, Current_Medications__c, Current_Medications__c__is_set);
    __typeMapper.writeString(__out, Currently_taking_medication__c__typeInfo, Currently_taking_medication__c, Currently_taking_medication__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Accident__c__typeInfo, Date_of_Accident__c, Date_of_Accident__c__is_set);
    __typeMapper.writeString(__out, Describe_injury__c__typeInfo, Describe_injury__c, Describe_injury__c__is_set);
    __typeMapper.writeString(__out, Did_EE_mention_prior_injury__c__typeInfo, Did_EE_mention_prior_injury__c, Did_EE_mention_prior_injury__c__is_set);
    __typeMapper.writeString(__out, Did_EE_report_the_injury_to_you__c__typeInfo, Did_EE_report_the_injury_to_you__c, Did_EE_report_the_injury_to_you__c__is_set);
    __typeMapper.writeString(__out, Did_you_report_injury_to_your_supervisor__c__typeInfo, Did_you_report_injury_to_your_supervisor__c, Did_you_report_injury_to_your_supervisor__c__is_set);
    __typeMapper.writeString(__out, Doctor_Location__c__typeInfo, Doctor_Location__c, Doctor_Location__c__is_set);
    __typeMapper.writeString(__out, Doctor_Phone__c__typeInfo, Doctor_Phone__c, Doctor_Phone__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeString(__out, Employee_Contact_Information__c__typeInfo, Employee_Contact_Information__c, Employee_Contact_Information__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeString(__out, Have_you_had_prior_injuries_to_this_bod__c__typeInfo, Have_you_had_prior_injuries_to_this_bod__c, Have_you_had_prior_injuries_to_this_bod__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, Hobbies__c__typeInfo, Hobbies__c, Hobbies__c__is_set);
    __typeMapper.writeString(__out, Injured_Area__c__typeInfo, Injured_Area__c, Injured_Area__c__is_set);
    __typeMapper.writeString(__out, Injured_Employee__c__typeInfo, Injured_Employee__c, Injured_Employee__c__is_set);
    __typeMapper.writeString(__out, Injury_Case__c__typeInfo, Injury_Case__c, Injury_Case__c__is_set);
    __typeMapper.writeObject(__out, Injury_Case__r__typeInfo, Injury_Case__r, Injury_Case__r__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Medical_Attention_Required__c__typeInfo, Medical_Attention_Required__c, Medical_Attention_Required__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, Name_of_your_site_supervisor__c__typeInfo, Name_of_your_site_supervisor__c, Name_of_your_site_supervisor__c__is_set);
    __typeMapper.writeString(__out, Name_of_your_treating_Dr__c__typeInfo, Name_of_your_treating_Dr__c, Name_of_your_treating_Dr__c__is_set);
    __typeMapper.writeString(__out, Names_of_witnesses__c__typeInfo, Names_of_witnesses__c, Names_of_witnesses__c__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeString(__out, Occupation__c__typeInfo, Occupation__c, Occupation__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeString(__out, Prior_Injury_Detail__c__typeInfo, Prior_Injury_Detail__c, Prior_Injury_Detail__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeString(__out, Suggestions_for_preventing_this__c__typeInfo, Suggestions_for_preventing_this__c, Suggestions_for_preventing_this__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, Webmerge_Documents__r__typeInfo, Webmerge_Documents__r, Webmerge_Documents__r__is_set);
    __typeMapper.writeObject(__out, When_did_EE_report_injury_to_you__c__typeInfo, When_did_EE_report_injury_to_you__c, When_did_EE_report_injury_to_you__c__is_set);
    __typeMapper.writeObject(__out, When_did_you_report_to_supervisor__c__typeInfo, When_did_you_report_to_supervisor__c, When_did_you_report_to_supervisor__c__is_set);
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
    if (__typeMapper.isElement(__in, Current_Medications__c__typeInfo)) {
      setCurrent_Medications__c((java.lang.String)__typeMapper.readString(__in, Current_Medications__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Currently_taking_medication__c__typeInfo)) {
      setCurrently_taking_medication__c((java.lang.String)__typeMapper.readString(__in, Currently_taking_medication__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Accident__c__typeInfo)) {
      setDate_of_Accident__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Accident__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Describe_injury__c__typeInfo)) {
      setDescribe_injury__c((java.lang.String)__typeMapper.readString(__in, Describe_injury__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Did_EE_mention_prior_injury__c__typeInfo)) {
      setDid_EE_mention_prior_injury__c((java.lang.String)__typeMapper.readString(__in, Did_EE_mention_prior_injury__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Did_EE_report_the_injury_to_you__c__typeInfo)) {
      setDid_EE_report_the_injury_to_you__c((java.lang.String)__typeMapper.readString(__in, Did_EE_report_the_injury_to_you__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Did_you_report_injury_to_your_supervisor__c__typeInfo)) {
      setDid_you_report_injury_to_your_supervisor__c((java.lang.String)__typeMapper.readString(__in, Did_you_report_injury_to_your_supervisor__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Doctor_Location__c__typeInfo)) {
      setDoctor_Location__c((java.lang.String)__typeMapper.readString(__in, Doctor_Location__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Doctor_Phone__c__typeInfo)) {
      setDoctor_Phone__c((java.lang.String)__typeMapper.readString(__in, Doctor_Phone__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Employee_Contact_Information__c__typeInfo)) {
      setEmployee_Contact_Information__c((java.lang.String)__typeMapper.readString(__in, Employee_Contact_Information__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Have_you_had_prior_injuries_to_this_bod__c__typeInfo)) {
      setHave_you_had_prior_injuries_to_this_bod__c((java.lang.String)__typeMapper.readString(__in, Have_you_had_prior_injuries_to_this_bod__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Hobbies__c__typeInfo)) {
      setHobbies__c((java.lang.String)__typeMapper.readString(__in, Hobbies__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Injured_Area__c__typeInfo)) {
      setInjured_Area__c((java.lang.String)__typeMapper.readString(__in, Injured_Area__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Injured_Employee__c__typeInfo)) {
      setInjured_Employee__c((java.lang.String)__typeMapper.readString(__in, Injured_Employee__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Medical_Attention_Required__c__typeInfo)) {
      setMedical_Attention_Required__c((java.lang.String)__typeMapper.readString(__in, Medical_Attention_Required__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name_of_your_site_supervisor__c__typeInfo)) {
      setName_of_your_site_supervisor__c((java.lang.String)__typeMapper.readString(__in, Name_of_your_site_supervisor__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name_of_your_treating_Dr__c__typeInfo)) {
      setName_of_your_treating_Dr__c((java.lang.String)__typeMapper.readString(__in, Name_of_your_treating_Dr__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Names_of_witnesses__c__typeInfo)) {
      setNames_of_witnesses__c((java.lang.String)__typeMapper.readString(__in, Names_of_witnesses__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Occupation__c__typeInfo)) {
      setOccupation__c((java.lang.String)__typeMapper.readString(__in, Occupation__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Prior_Injury_Detail__c__typeInfo)) {
      setPrior_Injury_Detail__c((java.lang.String)__typeMapper.readString(__in, Prior_Injury_Detail__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, RecordType__typeInfo)) {
      setRecordType((com.sforce.soap.enterprise.sobject.RecordType)__typeMapper.readObject(__in, RecordType__typeInfo, com.sforce.soap.enterprise.sobject.RecordType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, RecordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Suggestions_for_preventing_this__c__typeInfo)) {
      setSuggestions_for_preventing_this__c((java.lang.String)__typeMapper.readString(__in, Suggestions_for_preventing_this__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Webmerge_Documents__r__typeInfo)) {
      setWebmerge_Documents__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Webmerge_Documents__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, When_did_EE_report_injury_to_you__c__typeInfo)) {
      setWhen_did_EE_report_injury_to_you__c((java.util.Calendar)__typeMapper.readObject(__in, When_did_EE_report_injury_to_you__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, When_did_you_report_to_supervisor__c__typeInfo)) {
      setWhen_did_you_report_to_supervisor__c((java.util.Calendar)__typeMapper.readObject(__in, When_did_you_report_to_supervisor__c__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Injury_Statement__c ");
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
    sb.append(" Current_Medications__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Current_Medications__c)+"'\n");
    sb.append(" Currently_taking_medication__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Currently_taking_medication__c)+"'\n");
    sb.append(" Date_of_Accident__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Accident__c)+"'\n");
    sb.append(" Describe_injury__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Describe_injury__c)+"'\n");
    sb.append(" Did_EE_mention_prior_injury__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Did_EE_mention_prior_injury__c)+"'\n");
    sb.append(" Did_EE_report_the_injury_to_you__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Did_EE_report_the_injury_to_you__c)+"'\n");
    sb.append(" Did_you_report_injury_to_your_supervisor__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Did_you_report_injury_to_your_supervisor__c)+"'\n");
    sb.append(" Doctor_Location__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Doctor_Location__c)+"'\n");
    sb.append(" Doctor_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Doctor_Phone__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employee_Contact_Information__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Contact_Information__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Have_you_had_prior_injuries_to_this_bod__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Have_you_had_prior_injuries_to_this_bod__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" Hobbies__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Hobbies__c)+"'\n");
    sb.append(" Injured_Area__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Injured_Area__c)+"'\n");
    sb.append(" Injured_Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Injured_Employee__c)+"'\n");
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
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Medical_Attention_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Medical_Attention_Required__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Name_of_your_site_supervisor__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name_of_your_site_supervisor__c)+"'\n");
    sb.append(" Name_of_your_treating_Dr__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name_of_your_treating_Dr__c)+"'\n");
    sb.append(" Names_of_witnesses__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Names_of_witnesses__c)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Occupation__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Occupation__c)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Prior_Injury_Detail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Prior_Injury_Detail__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Suggestions_for_preventing_this__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Suggestions_for_preventing_this__c)+"'\n");
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
    sb.append(" Webmerge_Documents__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Webmerge_Documents__r)+"'\n");
    sb.append(" When_did_EE_report_injury_to_you__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(When_did_EE_report_injury_to_you__c)+"'\n");
    sb.append(" When_did_you_report_to_supervisor__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(When_did_you_report_to_supervisor__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}