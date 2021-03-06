package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Assignment__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Assignment__c() {
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
   * element  : Actual_Duration__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Duration__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Duration__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Actual_Duration__c__is_set = false;

  private java.lang.Double Actual_Duration__c;

  public java.lang.Double getActual_Duration__c() {
    return Actual_Duration__c;
  }

  

  public void setActual_Duration__c(java.lang.Double Actual_Duration__c) {
    this.Actual_Duration__c = Actual_Duration__c;
    Actual_Duration__c__is_set = true;
  }
  
  /**
   * element  : Actual_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Actual_End_Date__c__is_set = false;

  private java.util.Calendar Actual_End_Date__c;

  public java.util.Calendar getActual_End_Date__c() {
    return Actual_End_Date__c;
  }

  

  public void setActual_End_Date__c(java.util.Calendar Actual_End_Date__c) {
    this.Actual_End_Date__c = Actual_End_Date__c;
    Actual_End_Date__c__is_set = true;
  }
  
  /**
   * element  : Actual_Start_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Start_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Start_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Actual_Start_Date__c__is_set = false;

  private java.util.Calendar Actual_Start_Date__c;

  public java.util.Calendar getActual_Start_Date__c() {
    return Actual_Start_Date__c;
  }

  

  public void setActual_Start_Date__c(java.util.Calendar Actual_Start_Date__c) {
    this.Actual_Start_Date__c = Actual_Start_Date__c;
    Actual_Start_Date__c__is_set = true;
  }
  
  /**
   * element  : Adjustments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Adjustments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Adjustments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Adjustments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Adjustments__r;

  public com.sforce.soap.enterprise.QueryResult getAdjustments__r() {
    return Adjustments__r;
  }

  

  public void setAdjustments__r(com.sforce.soap.enterprise.QueryResult Adjustments__r) {
    this.Adjustments__r = Adjustments__r;
    Adjustments__r__is_set = true;
  }
  
  /**
   * element  : Assignment_Close_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assignment_Close_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignment_Close_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Assignment_Close_Notes__c__is_set = false;

  private java.lang.String Assignment_Close_Notes__c;

  public java.lang.String getAssignment_Close_Notes__c() {
    return Assignment_Close_Notes__c;
  }

  

  public void setAssignment_Close_Notes__c(java.lang.String Assignment_Close_Notes__c) {
    this.Assignment_Close_Notes__c = Assignment_Close_Notes__c;
    Assignment_Close_Notes__c__is_set = true;
  }
  
  /**
   * element  : Assignment_Rates__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Assignment_Rates__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignment_Rates__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Assignment_Rates__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Assignment_Rates__r;

  public com.sforce.soap.enterprise.QueryResult getAssignment_Rates__r() {
    return Assignment_Rates__r;
  }

  

  public void setAssignment_Rates__r(com.sforce.soap.enterprise.QueryResult Assignment_Rates__r) {
    this.Assignment_Rates__r = Assignment_Rates__r;
    Assignment_Rates__r__is_set = true;
  }
  
  /**
   * element  : Assist__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assist__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assist__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assist__c__is_set = false;

  private java.lang.String Assist__c;

  public java.lang.String getAssist__c() {
    return Assist__c;
  }

  

  public void setAssist__c(java.lang.String Assist__c) {
    this.Assist__c = Assist__c;
    Assist__c__is_set = true;
  }
  
  /**
   * element  : Assist__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Assist__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assist__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Assist__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Assist__r;

  public com.sforce.soap.enterprise.sobject.User getAssist__r() {
    return Assist__r;
  }

  

  public void setAssist__r(com.sforce.soap.enterprise.sobject.User Assist__r) {
    this.Assist__r = Assist__r;
    Assist__r__is_set = true;
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
   * element  : BA_Assignment_Reference__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BA_Assignment_Reference__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BA_Assignment_Reference__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BA_Assignment_Reference__c__is_set = false;

  private java.lang.String BA_Assignment_Reference__c;

  public java.lang.String getBA_Assignment_Reference__c() {
    return BA_Assignment_Reference__c;
  }

  

  public void setBA_Assignment_Reference__c(java.lang.String BA_Assignment_Reference__c) {
    this.BA_Assignment_Reference__c = BA_Assignment_Reference__c;
    BA_Assignment_Reference__c__is_set = true;
  }
  
  /**
   * element  : Background_Test_Requested_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Background_Test_Requested_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Background_Test_Requested_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Background_Test_Requested_Date__c__is_set = false;

  private java.util.Calendar Background_Test_Requested_Date__c;

  public java.util.Calendar getBackground_Test_Requested_Date__c() {
    return Background_Test_Requested_Date__c;
  }

  

  public void setBackground_Test_Requested_Date__c(java.util.Calendar Background_Test_Requested_Date__c) {
    this.Background_Test_Requested_Date__c = Background_Test_Requested_Date__c;
    Background_Test_Requested_Date__c__is_set = true;
  }
  
  /**
   * element  : Background_Test_Required__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Background_Test_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Background_Test_Required__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Background_Test_Required__c__is_set = false;

  private java.lang.String Background_Test_Required__c;

  public java.lang.String getBackground_Test_Required__c() {
    return Background_Test_Required__c;
  }

  

  public void setBackground_Test_Required__c(java.lang.String Background_Test_Required__c) {
    this.Background_Test_Required__c = Background_Test_Required__c;
    Background_Test_Required__c__is_set = true;
  }
  
  /**
   * element  : Background_Test_Result_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Background_Test_Result_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Background_Test_Result_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Background_Test_Result_Date__c__is_set = false;

  private java.util.Calendar Background_Test_Result_Date__c;

  public java.util.Calendar getBackground_Test_Result_Date__c() {
    return Background_Test_Result_Date__c;
  }

  

  public void setBackground_Test_Result_Date__c(java.util.Calendar Background_Test_Result_Date__c) {
    this.Background_Test_Result_Date__c = Background_Test_Result_Date__c;
    Background_Test_Result_Date__c__is_set = true;
  }
  
  /**
   * element  : Candidate_Email__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Email__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Email__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Candidate_Email__c__is_set = false;

  private java.lang.String Candidate_Email__c;

  public java.lang.String getCandidate_Email__c() {
    return Candidate_Email__c;
  }

  

  public void setCandidate_Email__c(java.lang.String Candidate_Email__c) {
    this.Candidate_Email__c = Candidate_Email__c;
    Candidate_Email__c__is_set = true;
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
   * element  : Cases1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Cases1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cases1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Cases1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Cases1__r;

  public com.sforce.soap.enterprise.QueryResult getCases1__r() {
    return Cases1__r;
  }

  

  public void setCases1__r(com.sforce.soap.enterprise.QueryResult Cases1__r) {
    this.Cases1__r = Cases1__r;
    Cases1__r__is_set = true;
  }
  
  /**
   * element  : Cases__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Cases__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cases__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Cases__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Cases__r;

  public com.sforce.soap.enterprise.QueryResult getCases__r() {
    return Cases__r;
  }

  

  public void setCases__r(com.sforce.soap.enterprise.QueryResult Cases__r) {
    this.Cases__r = Cases__r;
    Cases__r__is_set = true;
  }
  
  /**
   * element  : Client_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Client_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Client_Name__c__is_set = false;

  private java.lang.String Client_Name__c;

  public java.lang.String getClient_Name__c() {
    return Client_Name__c;
  }

  

  public void setClient_Name__c(java.lang.String Client_Name__c) {
    this.Client_Name__c = Client_Name__c;
    Client_Name__c__is_set = true;
  }
  
  /**
   * element  : Closed_TC_Variance__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Closed_TC_Variance__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Closed_TC_Variance__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Closed_TC_Variance__c__is_set = false;

  private java.lang.Double Closed_TC_Variance__c;

  public java.lang.Double getClosed_TC_Variance__c() {
    return Closed_TC_Variance__c;
  }

  

  public void setClosed_TC_Variance__c(java.lang.Double Closed_TC_Variance__c) {
    this.Closed_TC_Variance__c = Closed_TC_Variance__c;
    Closed_TC_Variance__c__is_set = true;
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
   * element  : DLPDNB__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DLPDNB__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DLPDNB__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DLPDNB__c__is_set = false;

  private java.lang.String DLPDNB__c;

  public java.lang.String getDLPDNB__c() {
    return DLPDNB__c;
  }

  

  public void setDLPDNB__c(java.lang.String DLPDNB__c) {
    this.DLPDNB__c = DLPDNB__c;
    DLPDNB__c__is_set = true;
  }
  
  /**
   * element  : Deductions__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Deductions__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Deductions__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Deductions__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Deductions__r;

  public com.sforce.soap.enterprise.QueryResult getDeductions__r() {
    return Deductions__r;
  }

  

  public void setDeductions__r(com.sforce.soap.enterprise.QueryResult Deductions__r) {
    this.Deductions__r = Deductions__r;
    Deductions__r__is_set = true;
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
   * element  : Drug_Test_Requested_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Drug_Test_Requested_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Drug_Test_Requested_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Drug_Test_Requested_Date__c__is_set = false;

  private java.util.Calendar Drug_Test_Requested_Date__c;

  public java.util.Calendar getDrug_Test_Requested_Date__c() {
    return Drug_Test_Requested_Date__c;
  }

  

  public void setDrug_Test_Requested_Date__c(java.util.Calendar Drug_Test_Requested_Date__c) {
    this.Drug_Test_Requested_Date__c = Drug_Test_Requested_Date__c;
    Drug_Test_Requested_Date__c__is_set = true;
  }
  
  /**
   * element  : Drug_Test_Required__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Drug_Test_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Drug_Test_Required__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Drug_Test_Required__c__is_set = false;

  private java.lang.String Drug_Test_Required__c;

  public java.lang.String getDrug_Test_Required__c() {
    return Drug_Test_Required__c;
  }

  

  public void setDrug_Test_Required__c(java.lang.String Drug_Test_Required__c) {
    this.Drug_Test_Required__c = Drug_Test_Required__c;
    Drug_Test_Required__c__is_set = true;
  }
  
  /**
   * element  : Drug_Test_Result_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Drug_Test_Result_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Drug_Test_Result_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Drug_Test_Result_Date__c__is_set = false;

  private java.util.Calendar Drug_Test_Result_Date__c;

  public java.util.Calendar getDrug_Test_Result_Date__c() {
    return Drug_Test_Result_Date__c;
  }

  

  public void setDrug_Test_Result_Date__c(java.util.Calendar Drug_Test_Result_Date__c) {
    this.Drug_Test_Result_Date__c = Drug_Test_Result_Date__c;
    Drug_Test_Result_Date__c__is_set = true;
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
   * element  : EE_App_on_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EE_App_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EE_App_on_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EE_App_on_File__c__is_set = false;

  private java.lang.String EE_App_on_File__c;

  public java.lang.String getEE_App_on_File__c() {
    return EE_App_on_File__c;
  }

  

  public void setEE_App_on_File__c(java.lang.String EE_App_on_File__c) {
    this.EE_App_on_File__c = EE_App_on_File__c;
    EE_App_on_File__c__is_set = true;
  }
  
  /**
   * element  : EE_Tax_PPW_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EE_Tax_PPW_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EE_Tax_PPW_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EE_Tax_PPW_Status__c__is_set = false;

  private java.lang.String EE_Tax_PPW_Status__c;

  public java.lang.String getEE_Tax_PPW_Status__c() {
    return EE_Tax_PPW_Status__c;
  }

  

  public void setEE_Tax_PPW_Status__c(java.lang.String EE_Tax_PPW_Status__c) {
    this.EE_Tax_PPW_Status__c = EE_Tax_PPW_Status__c;
    EE_Tax_PPW_Status__c__is_set = true;
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
   * element  : Employee_Requests__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Requests__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Requests__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Employee_Requests__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Employee_Requests__r;

  public com.sforce.soap.enterprise.QueryResult getEmployee_Requests__r() {
    return Employee_Requests__r;
  }

  

  public void setEmployee_Requests__r(com.sforce.soap.enterprise.QueryResult Employee_Requests__r) {
    this.Employee_Requests__r = Employee_Requests__r;
    Employee_Requests__r__is_set = true;
  }
  
  /**
   * element  : End_Date_Week_Ending__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo End_Date_Week_Ending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","End_Date_Week_Ending__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean End_Date_Week_Ending__c__is_set = false;

  private java.util.Calendar End_Date_Week_Ending__c;

  public java.util.Calendar getEnd_Date_Week_Ending__c() {
    return End_Date_Week_Ending__c;
  }

  

  public void setEnd_Date_Week_Ending__c(java.util.Calendar End_Date_Week_Ending__c) {
    this.End_Date_Week_Ending__c = End_Date_Week_Ending__c;
    End_Date_Week_Ending__c__is_set = true;
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
   * element  : FE_Bonuses__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FE_Bonuses__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FE_Bonuses__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FE_Bonuses__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FE_Bonuses__r;

  public com.sforce.soap.enterprise.QueryResult getFE_Bonuses__r() {
    return FE_Bonuses__r;
  }

  

  public void setFE_Bonuses__r(com.sforce.soap.enterprise.QueryResult FE_Bonuses__r) {
    this.FE_Bonuses__r = FE_Bonuses__r;
    FE_Bonuses__r__is_set = true;
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
   * element  : Fraud__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Fraud__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fraud__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Fraud__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Fraud__r;

  public com.sforce.soap.enterprise.QueryResult getFraud__r() {
    return Fraud__r;
  }

  

  public void setFraud__r(com.sforce.soap.enterprise.QueryResult Fraud__r) {
    this.Fraud__r = Fraud__r;
    Fraud__r__is_set = true;
  }
  
  /**
   * element  : GP_Job_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo GP_Job_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GP_Job_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean GP_Job_Number__c__is_set = false;

  private java.lang.String GP_Job_Number__c;

  public java.lang.String getGP_Job_Number__c() {
    return GP_Job_Number__c;
  }

  

  public void setGP_Job_Number__c(java.lang.String GP_Job_Number__c) {
    this.GP_Job_Number__c = GP_Job_Number__c;
    GP_Job_Number__c__is_set = true;
  }
  
  /**
   * element  : Guarantees__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Guarantees__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Guarantees__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Guarantees__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Guarantees__r;

  public com.sforce.soap.enterprise.QueryResult getGuarantees__r() {
    return Guarantees__r;
  }

  

  public void setGuarantees__r(com.sforce.soap.enterprise.QueryResult Guarantees__r) {
    this.Guarantees__r = Guarantees__r;
    Guarantees__r__is_set = true;
  }
  
  /**
   * element  : HRPDNB__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo HRPDNB__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HRPDNB__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean HRPDNB__c__is_set = false;

  private java.lang.String HRPDNB__c;

  public java.lang.String getHRPDNB__c() {
    return HRPDNB__c;
  }

  

  public void setHRPDNB__c(java.lang.String HRPDNB__c) {
    this.HRPDNB__c = HRPDNB__c;
    HRPDNB__c__is_set = true;
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
   * element  : Job_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Job_Number__c__is_set = false;

  private java.lang.String Job_Number__c;

  public java.lang.String getJob_Number__c() {
    return Job_Number__c;
  }

  

  public void setJob_Number__c(java.lang.String Job_Number__c) {
    this.Job_Number__c = Job_Number__c;
    Job_Number__c__is_set = true;
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
   * element  : Last_Timesheet_Rec_d__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Last_Timesheet_Rec_d__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Last_Timesheet_Rec_d__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Last_Timesheet_Rec_d__c__is_set = false;

  private java.util.Calendar Last_Timesheet_Rec_d__c;

  public java.util.Calendar getLast_Timesheet_Rec_d__c() {
    return Last_Timesheet_Rec_d__c;
  }

  

  public void setLast_Timesheet_Rec_d__c(java.util.Calendar Last_Timesheet_Rec_d__c) {
    this.Last_Timesheet_Rec_d__c = Last_Timesheet_Rec_d__c;
    Last_Timesheet_Rec_d__c__is_set = true;
  }
  
  /**
   * element  : Lead_Source__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Lead_Source__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Lead_Source__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Lead_Source__c__is_set = false;

  private java.lang.String Lead_Source__c;

  public java.lang.String getLead_Source__c() {
    return Lead_Source__c;
  }

  

  public void setLead_Source__c(java.lang.String Lead_Source__c) {
    this.Lead_Source__c = Lead_Source__c;
    Lead_Source__c__is_set = true;
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
   * element  : Modified_Actual_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Modified_Actual_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Modified_Actual_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Modified_Actual_End_Date__c__is_set = false;

  private java.util.Calendar Modified_Actual_End_Date__c;

  public java.util.Calendar getModified_Actual_End_Date__c() {
    return Modified_Actual_End_Date__c;
  }

  

  public void setModified_Actual_End_Date__c(java.util.Calendar Modified_Actual_End_Date__c) {
    this.Modified_Actual_End_Date__c = Modified_Actual_End_Date__c;
    Modified_Actual_End_Date__c__is_set = true;
  }
  
  /**
   * element  : Most_Recent_Timecard__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Most_Recent_Timecard__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Most_Recent_Timecard__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Most_Recent_Timecard__c__is_set = false;

  private java.util.Calendar Most_Recent_Timecard__c;

  public java.util.Calendar getMost_Recent_Timecard__c() {
    return Most_Recent_Timecard__c;
  }

  

  public void setMost_Recent_Timecard__c(java.util.Calendar Most_Recent_Timecard__c) {
    this.Most_Recent_Timecard__c = Most_Recent_Timecard__c;
    Most_Recent_Timecard__c__is_set = true;
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
   * element  : OCIP__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OCIP__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OCIP__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean OCIP__c__is_set = false;

  private java.lang.String OCIP__c;

  public java.lang.String getOCIP__c() {
    return OCIP__c;
  }

  

  public void setOCIP__c(java.lang.String OCIP__c) {
    this.OCIP__c = OCIP__c;
    OCIP__c__is_set = true;
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
   * element  : Out_of_Pocket_Expenses__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Out_of_Pocket_Expenses__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Out_of_Pocket_Expenses__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Out_of_Pocket_Expenses__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Out_of_Pocket_Expenses__r;

  public com.sforce.soap.enterprise.QueryResult getOut_of_Pocket_Expenses__r() {
    return Out_of_Pocket_Expenses__r;
  }

  

  public void setOut_of_Pocket_Expenses__r(com.sforce.soap.enterprise.QueryResult Out_of_Pocket_Expenses__r) {
    this.Out_of_Pocket_Expenses__r = Out_of_Pocket_Expenses__r;
    Out_of_Pocket_Expenses__r__is_set = true;
  }
  
  /**
   * element  : Overtime_Multiplier__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Overtime_Multiplier__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Overtime_Multiplier__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Overtime_Multiplier__c__is_set = false;

  private java.lang.Double Overtime_Multiplier__c;

  public java.lang.Double getOvertime_Multiplier__c() {
    return Overtime_Multiplier__c;
  }

  

  public void setOvertime_Multiplier__c(java.lang.Double Overtime_Multiplier__c) {
    this.Overtime_Multiplier__c = Overtime_Multiplier__c;
    Overtime_Multiplier__c__is_set = true;
  }
  
  /**
   * element  : PDNB__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PDNB__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PDNB__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PDNB__c__is_set = false;

  private java.lang.String PDNB__c;

  public java.lang.String getPDNB__c() {
    return PDNB__c;
  }

  

  public void setPDNB__c(java.lang.String PDNB__c) {
    this.PDNB__c = PDNB__c;
    PDNB__c__is_set = true;
  }
  
  /**
   * element  : PD_Ratio__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo PD_Ratio__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PD_Ratio__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean PD_Ratio__c__is_set = false;

  private java.lang.Double PD_Ratio__c;

  public java.lang.Double getPD_Ratio__c() {
    return PD_Ratio__c;
  }

  

  public void setPD_Ratio__c(java.lang.Double PD_Ratio__c) {
    this.PD_Ratio__c = PD_Ratio__c;
    PD_Ratio__c__is_set = true;
  }
  
  /**
   * element  : PPE__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo PPE__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PPE__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean PPE__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult PPE__r;

  public com.sforce.soap.enterprise.QueryResult getPPE__r() {
    return PPE__r;
  }

  

  public void setPPE__r(com.sforce.soap.enterprise.QueryResult PPE__r) {
    this.PPE__r = PPE__r;
    PPE__r__is_set = true;
  }
  
  /**
   * element  : Payroll_Advances__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Payroll_Advances__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Payroll_Advances__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Payroll_Advances__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Payroll_Advances__r;

  public com.sforce.soap.enterprise.QueryResult getPayroll_Advances__r() {
    return Payroll_Advances__r;
  }

  

  public void setPayroll_Advances__r(com.sforce.soap.enterprise.QueryResult Payroll_Advances__r) {
    this.Payroll_Advances__r = Payroll_Advances__r;
    Payroll_Advances__r__is_set = true;
  }
  
  /**
   * element  : Payroll_Details__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Payroll_Details__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Payroll_Details__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Payroll_Details__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Payroll_Details__r;

  public com.sforce.soap.enterprise.QueryResult getPayroll_Details__r() {
    return Payroll_Details__r;
  }

  

  public void setPayroll_Details__r(com.sforce.soap.enterprise.QueryResult Payroll_Details__r) {
    this.Payroll_Details__r = Payroll_Details__r;
    Payroll_Details__r__is_set = true;
  }
  
  /**
   * element  : Possible_PD_Violation__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Possible_PD_Violation__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Possible_PD_Violation__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Possible_PD_Violation__c__is_set = false;

  private java.lang.String Possible_PD_Violation__c;

  public java.lang.String getPossible_PD_Violation__c() {
    return Possible_PD_Violation__c;
  }

  

  public void setPossible_PD_Violation__c(java.lang.String Possible_PD_Violation__c) {
    this.Possible_PD_Violation__c = Possible_PD_Violation__c;
    Possible_PD_Violation__c__is_set = true;
  }
  
  /**
   * element  : Prime_General__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Prime_General__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Prime_General__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Prime_General__c__is_set = false;

  private java.lang.String Prime_General__c;

  public java.lang.String getPrime_General__c() {
    return Prime_General__c;
  }

  

  public void setPrime_General__c(java.lang.String Prime_General__c) {
    this.Prime_General__c = Prime_General__c;
    Prime_General__c__is_set = true;
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
   * element  : Project_Description__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Description__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_Description__c__is_set = false;

  private java.lang.String Project_Description__c;

  public java.lang.String getProject_Description__c() {
    return Project_Description__c;
  }

  

  public void setProject_Description__c(java.lang.String Project_Description__c) {
    this.Project_Description__c = Project_Description__c;
    Project_Description__c__is_set = true;
  }
  
  /**
   * element  : Projected_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Projected_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Projected_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Projected_End_Date__c__is_set = false;

  private java.util.Calendar Projected_End_Date__c;

  public java.util.Calendar getProjected_End_Date__c() {
    return Projected_End_Date__c;
  }

  

  public void setProjected_End_Date__c(java.util.Calendar Projected_End_Date__c) {
    this.Projected_End_Date__c = Projected_End_Date__c;
    Projected_End_Date__c__is_set = true;
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
   * element  : Recruiter__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : Recruiter__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Recruiter__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Recruiter__r;

  public com.sforce.soap.enterprise.sobject.User getRecruiter__r() {
    return Recruiter__r;
  }

  

  public void setRecruiter__r(com.sforce.soap.enterprise.sobject.User Recruiter__r) {
    this.Recruiter__r = Recruiter__r;
    Recruiter__r__is_set = true;
  }
  
  /**
   * element  : Regional_Manager__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Regional_Manager__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regional_Manager__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : Regional_Manager__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Regional_Manager__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regional_Manager__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Regional_Manager__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Regional_Manager__r;

  public com.sforce.soap.enterprise.sobject.User getRegional_Manager__r() {
    return Regional_Manager__r;
  }

  

  public void setRegional_Manager__r(com.sforce.soap.enterprise.sobject.User Regional_Manager__r) {
    this.Regional_Manager__r = Regional_Manager__r;
    Regional_Manager__r__is_set = true;
  }
  
  /**
   * element  : Regular_Pay__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Regular_Pay__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Regular_Pay__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Regular_Pay__c__is_set = false;

  private java.lang.String Regular_Pay__c;

  public java.lang.String getRegular_Pay__c() {
    return Regular_Pay__c;
  }

  

  public void setRegular_Pay__c(java.lang.String Regular_Pay__c) {
    this.Regular_Pay__c = Regular_Pay__c;
    Regular_Pay__c__is_set = true;
  }
  
  /**
   * element  : Revenues__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Revenues__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Revenues__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Revenues__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Revenues__r;

  public com.sforce.soap.enterprise.QueryResult getRevenues__r() {
    return Revenues__r;
  }

  

  public void setRevenues__r(com.sforce.soap.enterprise.QueryResult Revenues__r) {
    this.Revenues__r = Revenues__r;
    Revenues__r__is_set = true;
  }
  
  /**
   * element  : SF_End_Date_WE__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo SF_End_Date_WE__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SF_End_Date_WE__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean SF_End_Date_WE__c__is_set = false;

  private java.util.Calendar SF_End_Date_WE__c;

  public java.util.Calendar getSF_End_Date_WE__c() {
    return SF_End_Date_WE__c;
  }

  

  public void setSF_End_Date_WE__c(java.util.Calendar SF_End_Date_WE__c) {
    this.SF_End_Date_WE__c = SF_End_Date_WE__c;
    SF_End_Date_WE__c__is_set = true;
  }
  
  /**
   * element  : Start_Date_Week_Ending__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Start_Date_Week_Ending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Start_Date_Week_Ending__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Start_Date_Week_Ending__c__is_set = false;

  private java.util.Calendar Start_Date_Week_Ending__c;

  public java.util.Calendar getStart_Date_Week_Ending__c() {
    return Start_Date_Week_Ending__c;
  }

  

  public void setStart_Date_Week_Ending__c(java.util.Calendar Start_Date_Week_Ending__c) {
    this.Start_Date_Week_Ending__c = Start_Date_Week_Ending__c;
    Start_Date_Week_Ending__c__is_set = true;
  }
  
  /**
   * element  : State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State__c__is_set = false;

  private java.lang.String State__c;

  public java.lang.String getState__c() {
    return State__c;
  }

  

  public void setState__c(java.lang.String State__c) {
    this.State__c = State__c;
    State__c__is_set = true;
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
   * element  : Surveys__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Surveys__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Surveys__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Surveys__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Surveys__r;

  public com.sforce.soap.enterprise.QueryResult getSurveys__r() {
    return Surveys__r;
  }

  

  public void setSurveys__r(com.sforce.soap.enterprise.QueryResult Surveys__r) {
    this.Surveys__r = Surveys__r;
    Surveys__r__is_set = true;
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
   * element  : Timesheets__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Timesheets__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Timesheets__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Timesheets__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Timesheets__r;

  public com.sforce.soap.enterprise.QueryResult getTimesheets__r() {
    return Timesheets__r;
  }

  

  public void setTimesheets__r(com.sforce.soap.enterprise.QueryResult Timesheets__r) {
    this.Timesheets__r = Timesheets__r;
    Timesheets__r__is_set = true;
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
   * element  : Unverified_Time__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Unverified_Time__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Unverified_Time__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Unverified_Time__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Unverified_Time__r;

  public com.sforce.soap.enterprise.QueryResult getUnverified_Time__r() {
    return Unverified_Time__r;
  }

  

  public void setUnverified_Time__r(com.sforce.soap.enterprise.QueryResult Unverified_Time__r) {
    this.Unverified_Time__r = Unverified_Time__r;
    Unverified_Time__r__is_set = true;
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
   * element  : WC_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo WC_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WC_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean WC_Code__c__is_set = false;

  private java.lang.String WC_Code__c;

  public java.lang.String getWC_Code__c() {
    return WC_Code__c;
  }

  

  public void setWC_Code__c(java.lang.String WC_Code__c) {
    this.WC_Code__c = WC_Code__c;
    WC_Code__c__is_set = true;
  }
  
  /**
   * element  : WKPDNB__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo WKPDNB__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WKPDNB__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean WKPDNB__c__is_set = false;

  private java.lang.String WKPDNB__c;

  public java.lang.String getWKPDNB__c() {
    return WKPDNB__c;
  }

  

  public void setWKPDNB__c(java.lang.String WKPDNB__c) {
    this.WKPDNB__c = WKPDNB__c;
    WKPDNB__c__is_set = true;
  }
  
  /**
   * element  : Weeks_Since_Last_TC__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Weeks_Since_Last_TC__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Weeks_Since_Last_TC__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Weeks_Since_Last_TC__c__is_set = false;

  private java.lang.Double Weeks_Since_Last_TC__c;

  public java.lang.Double getWeeks_Since_Last_TC__c() {
    return Weeks_Since_Last_TC__c;
  }

  

  public void setWeeks_Since_Last_TC__c(java.lang.Double Weeks_Since_Last_TC__c) {
    this.Weeks_Since_Last_TC__c = Weeks_Since_Last_TC__c;
    Weeks_Since_Last_TC__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Assignment__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, Actual_Duration__c__typeInfo, Actual_Duration__c, Actual_Duration__c__is_set);
    __typeMapper.writeObject(__out, Actual_End_Date__c__typeInfo, Actual_End_Date__c, Actual_End_Date__c__is_set);
    __typeMapper.writeObject(__out, Actual_Start_Date__c__typeInfo, Actual_Start_Date__c, Actual_Start_Date__c__is_set);
    __typeMapper.writeObject(__out, Adjustments__r__typeInfo, Adjustments__r, Adjustments__r__is_set);
    __typeMapper.writeString(__out, Assignment_Close_Notes__c__typeInfo, Assignment_Close_Notes__c, Assignment_Close_Notes__c__is_set);
    __typeMapper.writeObject(__out, Assignment_Rates__r__typeInfo, Assignment_Rates__r, Assignment_Rates__r__is_set);
    __typeMapper.writeString(__out, Assist__c__typeInfo, Assist__c, Assist__c__is_set);
    __typeMapper.writeObject(__out, Assist__r__typeInfo, Assist__r, Assist__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, BA_Assignment_Reference__c__typeInfo, BA_Assignment_Reference__c, BA_Assignment_Reference__c__is_set);
    __typeMapper.writeObject(__out, Background_Test_Requested_Date__c__typeInfo, Background_Test_Requested_Date__c, Background_Test_Requested_Date__c__is_set);
    __typeMapper.writeString(__out, Background_Test_Required__c__typeInfo, Background_Test_Required__c, Background_Test_Required__c__is_set);
    __typeMapper.writeObject(__out, Background_Test_Result_Date__c__typeInfo, Background_Test_Result_Date__c, Background_Test_Result_Date__c__is_set);
    __typeMapper.writeString(__out, Candidate_Email__c__typeInfo, Candidate_Email__c, Candidate_Email__c__is_set);
    __typeMapper.writeString(__out, Candidate_Employee__c__typeInfo, Candidate_Employee__c, Candidate_Employee__c__is_set);
    __typeMapper.writeObject(__out, Candidate_Employee__r__typeInfo, Candidate_Employee__r, Candidate_Employee__r__is_set);
    __typeMapper.writeObject(__out, Cases1__r__typeInfo, Cases1__r, Cases1__r__is_set);
    __typeMapper.writeObject(__out, Cases__r__typeInfo, Cases__r, Cases__r__is_set);
    __typeMapper.writeString(__out, Client_Name__c__typeInfo, Client_Name__c, Client_Name__c__is_set);
    __typeMapper.writeObject(__out, Closed_TC_Variance__c__typeInfo, Closed_TC_Variance__c, Closed_TC_Variance__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeString(__out, Contractor__c__typeInfo, Contractor__c, Contractor__c__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, DLPDNB__c__typeInfo, DLPDNB__c, DLPDNB__c__is_set);
    __typeMapper.writeObject(__out, Deductions__r__typeInfo, Deductions__r, Deductions__r__is_set);
    __typeMapper.writeString(__out, Division__c__typeInfo, Division__c, Division__c__is_set);
    __typeMapper.writeObject(__out, Drug_Test_Requested_Date__c__typeInfo, Drug_Test_Requested_Date__c, Drug_Test_Requested_Date__c__is_set);
    __typeMapper.writeString(__out, Drug_Test_Required__c__typeInfo, Drug_Test_Required__c, Drug_Test_Required__c__is_set);
    __typeMapper.writeObject(__out, Drug_Test_Result_Date__c__typeInfo, Drug_Test_Result_Date__c, Drug_Test_Result_Date__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeString(__out, EE_App_on_File__c__typeInfo, EE_App_on_File__c, EE_App_on_File__c__is_set);
    __typeMapper.writeString(__out, EE_Tax_PPW_Status__c__typeInfo, EE_Tax_PPW_Status__c, EE_Tax_PPW_Status__c__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, Employee_Requests__r__typeInfo, Employee_Requests__r, Employee_Requests__r__is_set);
    __typeMapper.writeObject(__out, End_Date_Week_Ending__c__typeInfo, End_Date_Week_Ending__c, End_Date_Week_Ending__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FE_Bonuses__r__typeInfo, FE_Bonuses__r, FE_Bonuses__r__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, Fraud__r__typeInfo, Fraud__r, Fraud__r__is_set);
    __typeMapper.writeString(__out, GP_Job_Number__c__typeInfo, GP_Job_Number__c, GP_Job_Number__c__is_set);
    __typeMapper.writeObject(__out, Guarantees__r__typeInfo, Guarantees__r, Guarantees__r__is_set);
    __typeMapper.writeString(__out, HRPDNB__c__typeInfo, HRPDNB__c, HRPDNB__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Job_Number__c__typeInfo, Job_Number__c, Job_Number__c__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, Last_Timesheet_Rec_d__c__typeInfo, Last_Timesheet_Rec_d__c, Last_Timesheet_Rec_d__c__is_set);
    __typeMapper.writeString(__out, Lead_Source__c__typeInfo, Lead_Source__c, Lead_Source__c__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeObject(__out, Modified_Actual_End_Date__c__typeInfo, Modified_Actual_End_Date__c, Modified_Actual_End_Date__c__is_set);
    __typeMapper.writeObject(__out, Most_Recent_Timecard__c__typeInfo, Most_Recent_Timecard__c, Most_Recent_Timecard__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeString(__out, OCIP__c__typeInfo, OCIP__c, OCIP__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeString(__out, Order_Number__c__typeInfo, Order_Number__c, Order_Number__c__is_set);
    __typeMapper.writeString(__out, Order__c__typeInfo, Order__c, Order__c__is_set);
    __typeMapper.writeObject(__out, Order__r__typeInfo, Order__r, Order__r__is_set);
    __typeMapper.writeObject(__out, Out_of_Pocket_Expenses__r__typeInfo, Out_of_Pocket_Expenses__r, Out_of_Pocket_Expenses__r__is_set);
    __typeMapper.writeObject(__out, Overtime_Multiplier__c__typeInfo, Overtime_Multiplier__c, Overtime_Multiplier__c__is_set);
    __typeMapper.writeString(__out, PDNB__c__typeInfo, PDNB__c, PDNB__c__is_set);
    __typeMapper.writeObject(__out, PD_Ratio__c__typeInfo, PD_Ratio__c, PD_Ratio__c__is_set);
    __typeMapper.writeObject(__out, PPE__r__typeInfo, PPE__r, PPE__r__is_set);
    __typeMapper.writeObject(__out, Payroll_Advances__r__typeInfo, Payroll_Advances__r, Payroll_Advances__r__is_set);
    __typeMapper.writeObject(__out, Payroll_Details__r__typeInfo, Payroll_Details__r, Payroll_Details__r__is_set);
    __typeMapper.writeString(__out, Possible_PD_Violation__c__typeInfo, Possible_PD_Violation__c, Possible_PD_Violation__c__is_set);
    __typeMapper.writeString(__out, Prime_General__c__typeInfo, Prime_General__c, Prime_General__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeString(__out, Project_Description__c__typeInfo, Project_Description__c, Project_Description__c__is_set);
    __typeMapper.writeObject(__out, Projected_End_Date__c__typeInfo, Projected_End_Date__c, Projected_End_Date__c__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeString(__out, Recruiter__c__typeInfo, Recruiter__c, Recruiter__c__is_set);
    __typeMapper.writeObject(__out, Recruiter__r__typeInfo, Recruiter__r, Recruiter__r__is_set);
    __typeMapper.writeString(__out, Regional_Manager__c__typeInfo, Regional_Manager__c, Regional_Manager__c__is_set);
    __typeMapper.writeObject(__out, Regional_Manager__r__typeInfo, Regional_Manager__r, Regional_Manager__r__is_set);
    __typeMapper.writeString(__out, Regular_Pay__c__typeInfo, Regular_Pay__c, Regular_Pay__c__is_set);
    __typeMapper.writeObject(__out, Revenues__r__typeInfo, Revenues__r, Revenues__r__is_set);
    __typeMapper.writeObject(__out, SF_End_Date_WE__c__typeInfo, SF_End_Date_WE__c, SF_End_Date_WE__c__is_set);
    __typeMapper.writeObject(__out, Start_Date_Week_Ending__c__typeInfo, Start_Date_Week_Ending__c, Start_Date_Week_Ending__c__is_set);
    __typeMapper.writeString(__out, State__c__typeInfo, State__c, State__c__is_set);
    __typeMapper.writeString(__out, Status__c__typeInfo, Status__c, Status__c__is_set);
    __typeMapper.writeObject(__out, Surveys__r__typeInfo, Surveys__r, Surveys__r__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, Timesheets__r__typeInfo, Timesheets__r, Timesheets__r__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, Total_Hours_Worked__c__typeInfo, Total_Hours_Worked__c, Total_Hours_Worked__c__is_set);
    __typeMapper.writeString(__out, Trade__c__typeInfo, Trade__c, Trade__c__is_set);
    __typeMapper.writeObject(__out, Unverified_Time__r__typeInfo, Unverified_Time__r, Unverified_Time__r__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeString(__out, WC_Code__c__typeInfo, WC_Code__c, WC_Code__c__is_set);
    __typeMapper.writeString(__out, WKPDNB__c__typeInfo, WKPDNB__c, WKPDNB__c__is_set);
    __typeMapper.writeObject(__out, Weeks_Since_Last_TC__c__typeInfo, Weeks_Since_Last_TC__c, Weeks_Since_Last_TC__c__is_set);
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
    if (__typeMapper.isElement(__in, Actual_Duration__c__typeInfo)) {
      setActual_Duration__c((java.lang.Double)__typeMapper.readObject(__in, Actual_Duration__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_End_Date__c__typeInfo)) {
      setActual_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Actual_End_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Start_Date__c__typeInfo)) {
      setActual_Start_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Actual_Start_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Adjustments__r__typeInfo)) {
      setAdjustments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Adjustments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignment_Close_Notes__c__typeInfo)) {
      setAssignment_Close_Notes__c((java.lang.String)__typeMapper.readString(__in, Assignment_Close_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignment_Rates__r__typeInfo)) {
      setAssignment_Rates__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assignment_Rates__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assist__c__typeInfo)) {
      setAssist__c((java.lang.String)__typeMapper.readString(__in, Assist__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assist__r__typeInfo)) {
      setAssist__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Assist__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
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
    if (__typeMapper.isElement(__in, BA_Assignment_Reference__c__typeInfo)) {
      setBA_Assignment_Reference__c((java.lang.String)__typeMapper.readString(__in, BA_Assignment_Reference__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Background_Test_Requested_Date__c__typeInfo)) {
      setBackground_Test_Requested_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Background_Test_Requested_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Background_Test_Required__c__typeInfo)) {
      setBackground_Test_Required__c((java.lang.String)__typeMapper.readString(__in, Background_Test_Required__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Background_Test_Result_Date__c__typeInfo)) {
      setBackground_Test_Result_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Background_Test_Result_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Email__c__typeInfo)) {
      setCandidate_Email__c((java.lang.String)__typeMapper.readString(__in, Candidate_Email__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Cases1__r__typeInfo)) {
      setCases1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cases__r__typeInfo)) {
      setCases__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client_Name__c__typeInfo)) {
      setClient_Name__c((java.lang.String)__typeMapper.readString(__in, Client_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Closed_TC_Variance__c__typeInfo)) {
      setClosed_TC_Variance__c((java.lang.Double)__typeMapper.readObject(__in, Closed_TC_Variance__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, DLPDNB__c__typeInfo)) {
      setDLPDNB__c((java.lang.String)__typeMapper.readString(__in, DLPDNB__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Deductions__r__typeInfo)) {
      setDeductions__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Deductions__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Division__c__typeInfo)) {
      setDivision__c((java.lang.String)__typeMapper.readString(__in, Division__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Drug_Test_Requested_Date__c__typeInfo)) {
      setDrug_Test_Requested_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Drug_Test_Requested_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Drug_Test_Required__c__typeInfo)) {
      setDrug_Test_Required__c((java.lang.String)__typeMapper.readString(__in, Drug_Test_Required__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Drug_Test_Result_Date__c__typeInfo)) {
      setDrug_Test_Result_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Drug_Test_Result_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DuplicateRecordItems__typeInfo)) {
      setDuplicateRecordItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DuplicateRecordItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EE_App_on_File__c__typeInfo)) {
      setEE_App_on_File__c((java.lang.String)__typeMapper.readString(__in, EE_App_on_File__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EE_Tax_PPW_Status__c__typeInfo)) {
      setEE_Tax_PPW_Status__c((java.lang.String)__typeMapper.readString(__in, EE_Tax_PPW_Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee_Requests__r__typeInfo)) {
      setEmployee_Requests__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Employee_Requests__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, End_Date_Week_Ending__c__typeInfo)) {
      setEnd_Date_Week_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, End_Date_Week_Ending__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, FE_Bonuses__r__typeInfo)) {
      setFE_Bonuses__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FE_Bonuses__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Fraud__r__typeInfo)) {
      setFraud__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Fraud__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GP_Job_Number__c__typeInfo)) {
      setGP_Job_Number__c((java.lang.String)__typeMapper.readString(__in, GP_Job_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Guarantees__r__typeInfo)) {
      setGuarantees__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Guarantees__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HRPDNB__c__typeInfo)) {
      setHRPDNB__c((java.lang.String)__typeMapper.readString(__in, HRPDNB__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Job_Number__c__typeInfo)) {
      setJob_Number__c((java.lang.String)__typeMapper.readString(__in, Job_Number__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Last_Timesheet_Rec_d__c__typeInfo)) {
      setLast_Timesheet_Rec_d__c((java.util.Calendar)__typeMapper.readObject(__in, Last_Timesheet_Rec_d__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Lead_Source__c__typeInfo)) {
      setLead_Source__c((java.lang.String)__typeMapper.readString(__in, Lead_Source__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Modified_Actual_End_Date__c__typeInfo)) {
      setModified_Actual_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Modified_Actual_End_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Most_Recent_Timecard__c__typeInfo)) {
      setMost_Recent_Timecard__c((java.util.Calendar)__typeMapper.readObject(__in, Most_Recent_Timecard__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, OCIP__c__typeInfo)) {
      setOCIP__c((java.lang.String)__typeMapper.readString(__in, OCIP__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Number__c__typeInfo)) {
      setOrder_Number__c((java.lang.String)__typeMapper.readString(__in, Order_Number__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Out_of_Pocket_Expenses__r__typeInfo)) {
      setOut_of_Pocket_Expenses__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Out_of_Pocket_Expenses__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Overtime_Multiplier__c__typeInfo)) {
      setOvertime_Multiplier__c((java.lang.Double)__typeMapper.readObject(__in, Overtime_Multiplier__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PDNB__c__typeInfo)) {
      setPDNB__c((java.lang.String)__typeMapper.readString(__in, PDNB__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PD_Ratio__c__typeInfo)) {
      setPD_Ratio__c((java.lang.Double)__typeMapper.readObject(__in, PD_Ratio__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PPE__r__typeInfo)) {
      setPPE__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PPE__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payroll_Advances__r__typeInfo)) {
      setPayroll_Advances__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Payroll_Advances__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payroll_Details__r__typeInfo)) {
      setPayroll_Details__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Payroll_Details__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Possible_PD_Violation__c__typeInfo)) {
      setPossible_PD_Violation__c((java.lang.String)__typeMapper.readString(__in, Possible_PD_Violation__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Prime_General__c__typeInfo)) {
      setPrime_General__c((java.lang.String)__typeMapper.readString(__in, Prime_General__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Project_Description__c__typeInfo)) {
      setProject_Description__c((java.lang.String)__typeMapper.readString(__in, Project_Description__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Projected_End_Date__c__typeInfo)) {
      setProjected_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Projected_End_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Recruiter__c__typeInfo)) {
      setRecruiter__c((java.lang.String)__typeMapper.readString(__in, Recruiter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter__r__typeInfo)) {
      setRecruiter__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Recruiter__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regional_Manager__c__typeInfo)) {
      setRegional_Manager__c((java.lang.String)__typeMapper.readString(__in, Regional_Manager__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regional_Manager__r__typeInfo)) {
      setRegional_Manager__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Regional_Manager__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Regular_Pay__c__typeInfo)) {
      setRegular_Pay__c((java.lang.String)__typeMapper.readString(__in, Regular_Pay__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Revenues__r__typeInfo)) {
      setRevenues__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Revenues__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SF_End_Date_WE__c__typeInfo)) {
      setSF_End_Date_WE__c((java.util.Calendar)__typeMapper.readObject(__in, SF_End_Date_WE__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Start_Date_Week_Ending__c__typeInfo)) {
      setStart_Date_Week_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, Start_Date_Week_Ending__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__c__typeInfo)) {
      setState__c((java.lang.String)__typeMapper.readString(__in, State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__c__typeInfo)) {
      setStatus__c((java.lang.String)__typeMapper.readString(__in, Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Surveys__r__typeInfo)) {
      setSurveys__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Surveys__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Timesheets__r__typeInfo)) {
      setTimesheets__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Timesheets__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Trade__c__typeInfo)) {
      setTrade__c((java.lang.String)__typeMapper.readString(__in, Trade__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Unverified_Time__r__typeInfo)) {
      setUnverified_Time__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Unverified_Time__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WC_Code__c__typeInfo)) {
      setWC_Code__c((java.lang.String)__typeMapper.readString(__in, WC_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WKPDNB__c__typeInfo)) {
      setWKPDNB__c((java.lang.String)__typeMapper.readString(__in, WKPDNB__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Weeks_Since_Last_TC__c__typeInfo)) {
      setWeeks_Since_Last_TC__c((java.lang.Double)__typeMapper.readObject(__in, Weeks_Since_Last_TC__c__typeInfo, java.lang.Double.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Assignment__c ");
    sb.append(super.toString());
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Actual_Duration__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Duration__c)+"'\n");
    sb.append(" Actual_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_End_Date__c)+"'\n");
    sb.append(" Actual_Start_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Start_Date__c)+"'\n");
    sb.append(" Adjustments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Adjustments__r)+"'\n");
    sb.append(" Assignment_Close_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignment_Close_Notes__c)+"'\n");
    sb.append(" Assignment_Rates__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignment_Rates__r)+"'\n");
    sb.append(" Assist__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assist__c)+"'\n");
    sb.append(" Assist__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assist__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" BA_Assignment_Reference__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BA_Assignment_Reference__c)+"'\n");
    sb.append(" Background_Test_Requested_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Background_Test_Requested_Date__c)+"'\n");
    sb.append(" Background_Test_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Background_Test_Required__c)+"'\n");
    sb.append(" Background_Test_Result_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Background_Test_Result_Date__c)+"'\n");
    sb.append(" Candidate_Email__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Email__c)+"'\n");
    sb.append(" Candidate_Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__c)+"'\n");
    sb.append(" Candidate_Employee__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__r)+"'\n");
    sb.append(" Cases1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases1__r)+"'\n");
    sb.append(" Cases__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases__r)+"'\n");
    sb.append(" Client_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client_Name__c)+"'\n");
    sb.append(" Closed_TC_Variance__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Closed_TC_Variance__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
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
    sb.append(" DLPDNB__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DLPDNB__c)+"'\n");
    sb.append(" Deductions__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Deductions__r)+"'\n");
    sb.append(" Division__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__c)+"'\n");
    sb.append(" Drug_Test_Requested_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Drug_Test_Requested_Date__c)+"'\n");
    sb.append(" Drug_Test_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Drug_Test_Required__c)+"'\n");
    sb.append(" Drug_Test_Result_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Drug_Test_Result_Date__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" EE_App_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EE_App_on_File__c)+"'\n");
    sb.append(" EE_Tax_PPW_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EE_Tax_PPW_Status__c)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employee_Requests__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Requests__r)+"'\n");
    sb.append(" End_Date_Week_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(End_Date_Week_Ending__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FE_Bonuses__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FE_Bonuses__r)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" Fraud__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fraud__r)+"'\n");
    sb.append(" GP_Job_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GP_Job_Number__c)+"'\n");
    sb.append(" Guarantees__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Guarantees__r)+"'\n");
    sb.append(" HRPDNB__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HRPDNB__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Job_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Number__c)+"'\n");
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
    sb.append(" Last_Timesheet_Rec_d__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_Timesheet_Rec_d__c)+"'\n");
    sb.append(" Lead_Source__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lead_Source__c)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Modified_Actual_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Modified_Actual_End_Date__c)+"'\n");
    sb.append(" Most_Recent_Timecard__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Most_Recent_Timecard__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" OCIP__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OCIP__c)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Order_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Number__c)+"'\n");
    sb.append(" Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order__c)+"'\n");
    sb.append(" Order__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order__r)+"'\n");
    sb.append(" Out_of_Pocket_Expenses__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Out_of_Pocket_Expenses__r)+"'\n");
    sb.append(" Overtime_Multiplier__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Overtime_Multiplier__c)+"'\n");
    sb.append(" PDNB__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PDNB__c)+"'\n");
    sb.append(" PD_Ratio__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PD_Ratio__c)+"'\n");
    sb.append(" PPE__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PPE__r)+"'\n");
    sb.append(" Payroll_Advances__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payroll_Advances__r)+"'\n");
    sb.append(" Payroll_Details__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payroll_Details__r)+"'\n");
    sb.append(" Possible_PD_Violation__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Possible_PD_Violation__c)+"'\n");
    sb.append(" Prime_General__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Prime_General__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Project_Description__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Description__c)+"'\n");
    sb.append(" Projected_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Projected_End_Date__c)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Recruiter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter__c)+"'\n");
    sb.append(" Recruiter__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter__r)+"'\n");
    sb.append(" Regional_Manager__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regional_Manager__c)+"'\n");
    sb.append(" Regional_Manager__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regional_Manager__r)+"'\n");
    sb.append(" Regular_Pay__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Regular_Pay__c)+"'\n");
    sb.append(" Revenues__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Revenues__r)+"'\n");
    sb.append(" SF_End_Date_WE__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SF_End_Date_WE__c)+"'\n");
    sb.append(" Start_Date_Week_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Start_Date_Week_Ending__c)+"'\n");
    sb.append(" State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State__c)+"'\n");
    sb.append(" Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status__c)+"'\n");
    sb.append(" Surveys__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Surveys__r)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" Timesheets__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Timesheets__r)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Total_Hours_Worked__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Hours_Worked__c)+"'\n");
    sb.append(" Trade__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade__c)+"'\n");
    sb.append(" Unverified_Time__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Unverified_Time__r)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" WC_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WC_Code__c)+"'\n");
    sb.append(" WKPDNB__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WKPDNB__c)+"'\n");
    sb.append(" Weeks_Since_Last_TC__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Weeks_Since_Last_TC__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}