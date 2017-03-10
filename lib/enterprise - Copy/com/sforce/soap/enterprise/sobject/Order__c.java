package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Order__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Order__c() {
  }
    
  
  /**
   * element  : Account_Manager__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Account_Manager__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Account_Manager__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Account_Manager__c__is_set = false;

  private java.lang.String Account_Manager__c;

  public java.lang.String getAccount_Manager__c() {
    return Account_Manager__c;
  }

  

  public void setAccount_Manager__c(java.lang.String Account_Manager__c) {
    this.Account_Manager__c = Account_Manager__c;
    Account_Manager__c__is_set = true;
  }
  
  /**
   * element  : Account_Manager__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Account_Manager__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Account_Manager__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Account_Manager__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Account_Manager__r;

  public com.sforce.soap.enterprise.sobject.User getAccount_Manager__r() {
    return Account_Manager__r;
  }

  

  public void setAccount_Manager__r(com.sforce.soap.enterprise.sobject.User Account_Manager__r) {
    this.Account_Manager__r = Account_Manager__r;
    Account_Manager__r__is_set = true;
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
   * element  : Actual_Project_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Actual_Project_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Actual_Project_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Actual_Project_End_Date__c__is_set = false;

  private java.util.Calendar Actual_Project_End_Date__c;

  public java.util.Calendar getActual_Project_End_Date__c() {
    return Actual_Project_End_Date__c;
  }

  

  public void setActual_Project_End_Date__c(java.util.Calendar Actual_Project_End_Date__c) {
    this.Actual_Project_End_Date__c = Actual_Project_End_Date__c;
    Actual_Project_End_Date__c__is_set = true;
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
   * element  : Ads__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Ads__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Ads__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Ads__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Ads__r;

  public com.sforce.soap.enterprise.QueryResult getAds__r() {
    return Ads__r;
  }

  

  public void setAds__r(com.sforce.soap.enterprise.QueryResult Ads__r) {
    this.Ads__r = Ads__r;
    Ads__r__is_set = true;
  }
  
  /**
   * element  : All_Assignments_Closed__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo All_Assignments_Closed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","All_Assignments_Closed__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean All_Assignments_Closed__c__is_set = false;

  private java.lang.String All_Assignments_Closed__c;

  public java.lang.String getAll_Assignments_Closed__c() {
    return All_Assignments_Closed__c;
  }

  

  public void setAll_Assignments_Closed__c(java.lang.String All_Assignments_Closed__c) {
    this.All_Assignments_Closed__c = All_Assignments_Closed__c;
    All_Assignments_Closed__c__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_1__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_1__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assigned_Recruiter_1__c__is_set = false;

  private java.lang.String Assigned_Recruiter_1__c;

  public java.lang.String getAssigned_Recruiter_1__c() {
    return Assigned_Recruiter_1__c;
  }

  

  public void setAssigned_Recruiter_1__c(java.lang.String Assigned_Recruiter_1__c) {
    this.Assigned_Recruiter_1__c = Assigned_Recruiter_1__c;
    Assigned_Recruiter_1__c__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_1__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_1__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Assigned_Recruiter_1__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_1__r;

  public com.sforce.soap.enterprise.sobject.User getAssigned_Recruiter_1__r() {
    return Assigned_Recruiter_1__r;
  }

  

  public void setAssigned_Recruiter_1__r(com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_1__r) {
    this.Assigned_Recruiter_1__r = Assigned_Recruiter_1__r;
    Assigned_Recruiter_1__r__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_2__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_2__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assigned_Recruiter_2__c__is_set = false;

  private java.lang.String Assigned_Recruiter_2__c;

  public java.lang.String getAssigned_Recruiter_2__c() {
    return Assigned_Recruiter_2__c;
  }

  

  public void setAssigned_Recruiter_2__c(java.lang.String Assigned_Recruiter_2__c) {
    this.Assigned_Recruiter_2__c = Assigned_Recruiter_2__c;
    Assigned_Recruiter_2__c__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_2__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_2__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Assigned_Recruiter_2__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_2__r;

  public com.sforce.soap.enterprise.sobject.User getAssigned_Recruiter_2__r() {
    return Assigned_Recruiter_2__r;
  }

  

  public void setAssigned_Recruiter_2__r(com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_2__r) {
    this.Assigned_Recruiter_2__r = Assigned_Recruiter_2__r;
    Assigned_Recruiter_2__r__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_3__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_3__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assigned_Recruiter_3__c__is_set = false;

  private java.lang.String Assigned_Recruiter_3__c;

  public java.lang.String getAssigned_Recruiter_3__c() {
    return Assigned_Recruiter_3__c;
  }

  

  public void setAssigned_Recruiter_3__c(java.lang.String Assigned_Recruiter_3__c) {
    this.Assigned_Recruiter_3__c = Assigned_Recruiter_3__c;
    Assigned_Recruiter_3__c__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_3__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_3__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_3__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Assigned_Recruiter_3__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_3__r;

  public com.sforce.soap.enterprise.sobject.User getAssigned_Recruiter_3__r() {
    return Assigned_Recruiter_3__r;
  }

  

  public void setAssigned_Recruiter_3__r(com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_3__r) {
    this.Assigned_Recruiter_3__r = Assigned_Recruiter_3__r;
    Assigned_Recruiter_3__r__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_4__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_4__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_4__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assigned_Recruiter_4__c__is_set = false;

  private java.lang.String Assigned_Recruiter_4__c;

  public java.lang.String getAssigned_Recruiter_4__c() {
    return Assigned_Recruiter_4__c;
  }

  

  public void setAssigned_Recruiter_4__c(java.lang.String Assigned_Recruiter_4__c) {
    this.Assigned_Recruiter_4__c = Assigned_Recruiter_4__c;
    Assigned_Recruiter_4__c__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_4__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_4__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_4__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Assigned_Recruiter_4__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_4__r;

  public com.sforce.soap.enterprise.sobject.User getAssigned_Recruiter_4__r() {
    return Assigned_Recruiter_4__r;
  }

  

  public void setAssigned_Recruiter_4__r(com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_4__r) {
    this.Assigned_Recruiter_4__r = Assigned_Recruiter_4__r;
    Assigned_Recruiter_4__r__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_5__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_5__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_5__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Assigned_Recruiter_5__c__is_set = false;

  private java.lang.String Assigned_Recruiter_5__c;

  public java.lang.String getAssigned_Recruiter_5__c() {
    return Assigned_Recruiter_5__c;
  }

  

  public void setAssigned_Recruiter_5__c(java.lang.String Assigned_Recruiter_5__c) {
    this.Assigned_Recruiter_5__c = Assigned_Recruiter_5__c;
    Assigned_Recruiter_5__c__is_set = true;
  }
  
  /**
   * element  : Assigned_Recruiter_5__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Assigned_Recruiter_5__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assigned_Recruiter_5__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Assigned_Recruiter_5__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_5__r;

  public com.sforce.soap.enterprise.sobject.User getAssigned_Recruiter_5__r() {
    return Assigned_Recruiter_5__r;
  }

  

  public void setAssigned_Recruiter_5__r(com.sforce.soap.enterprise.sobject.User Assigned_Recruiter_5__r) {
    this.Assigned_Recruiter_5__r = Assigned_Recruiter_5__r;
    Assigned_Recruiter_5__r__is_set = true;
  }
  
  /**
   * element  : Assignments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Assignments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Assignments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Assignments__r;

  public com.sforce.soap.enterprise.QueryResult getAssignments__r() {
    return Assignments__r;
  }

  

  public void setAssignments__r(com.sforce.soap.enterprise.QueryResult Assignments__r) {
    this.Assignments__r = Assignments__r;
    Assignments__r__is_set = true;
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
   * element  : Average_Days_to_Pay__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Average_Days_to_Pay__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Average_Days_to_Pay__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Average_Days_to_Pay__c__is_set = false;

  private java.lang.Double Average_Days_to_Pay__c;

  public java.lang.Double getAverage_Days_to_Pay__c() {
    return Average_Days_to_Pay__c;
  }

  

  public void setAverage_Days_to_Pay__c(java.lang.Double Average_Days_to_Pay__c) {
    this.Average_Days_to_Pay__c = Average_Days_to_Pay__c;
    Average_Days_to_Pay__c__is_set = true;
  }
  
  /**
   * element  : Background_Check_Required__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Background_Check_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Background_Check_Required__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Background_Check_Required__c__is_set = false;

  private java.lang.Boolean Background_Check_Required__c;

  public java.lang.Boolean getBackground_Check_Required__c() {
    return Background_Check_Required__c;
  }

  

  public void setBackground_Check_Required__c(java.lang.Boolean Background_Check_Required__c) {
    this.Background_Check_Required__c = Background_Check_Required__c;
    Background_Check_Required__c__is_set = true;
  }
  
  /**
   * element  : Background_Checks__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Background_Checks__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Background_Checks__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Background_Checks__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Background_Checks__r;

  public com.sforce.soap.enterprise.QueryResult getBackground_Checks__r() {
    return Background_Checks__r;
  }

  

  public void setBackground_Checks__r(com.sforce.soap.enterprise.QueryResult Background_Checks__r) {
    this.Background_Checks__r = Background_Checks__r;
    Background_Checks__r__is_set = true;
  }
  
  /**
   * element  : CSA_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CSA_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSA_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean CSA_Date__c__is_set = false;

  private java.util.Calendar CSA_Date__c;

  public java.util.Calendar getCSA_Date__c() {
    return CSA_Date__c;
  }

  

  public void setCSA_Date__c(java.util.Calendar CSA_Date__c) {
    this.CSA_Date__c = CSA_Date__c;
    CSA_Date__c__is_set = true;
  }
  
  /**
   * element  : CSA_Obtained_By_Dept__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CSA_Obtained_By_Dept__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSA_Obtained_By_Dept__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CSA_Obtained_By_Dept__c__is_set = false;

  private java.lang.String CSA_Obtained_By_Dept__c;

  public java.lang.String getCSA_Obtained_By_Dept__c() {
    return CSA_Obtained_By_Dept__c;
  }

  

  public void setCSA_Obtained_By_Dept__c(java.lang.String CSA_Obtained_By_Dept__c) {
    this.CSA_Obtained_By_Dept__c = CSA_Obtained_By_Dept__c;
    CSA_Obtained_By_Dept__c__is_set = true;
  }
  
  /**
   * element  : CSA_Obtained_By__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CSA_Obtained_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSA_Obtained_By__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CSA_Obtained_By__c__is_set = false;

  private java.lang.String CSA_Obtained_By__c;

  public java.lang.String getCSA_Obtained_By__c() {
    return CSA_Obtained_By__c;
  }

  

  public void setCSA_Obtained_By__c(java.lang.String CSA_Obtained_By__c) {
    this.CSA_Obtained_By__c = CSA_Obtained_By__c;
    CSA_Obtained_By__c__is_set = true;
  }
  
  /**
   * element  : CSA_on_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CSA_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSA_on_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CSA_on_File__c__is_set = false;

  private java.lang.String CSA_on_File__c;

  public java.lang.String getCSA_on_File__c() {
    return CSA_on_File__c;
  }

  

  public void setCSA_on_File__c(java.lang.String CSA_on_File__c) {
    this.CSA_on_File__c = CSA_on_File__c;
    CSA_on_File__c__is_set = true;
  }
  
  /**
   * element  : CandidateSearchLink__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CandidateSearchLink__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CandidateSearchLink__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CandidateSearchLink__c__is_set = false;

  private java.lang.String CandidateSearchLink__c;

  public java.lang.String getCandidateSearchLink__c() {
    return CandidateSearchLink__c;
  }

  

  public void setCandidateSearchLink__c(java.lang.String CandidateSearchLink__c) {
    this.CandidateSearchLink__c = CandidateSearchLink__c;
    CandidateSearchLink__c__is_set = true;
  }
  
  /**
   * element  : Candidate_Submit_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Submit_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Submit_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Candidate_Submit_Date__c__is_set = false;

  private java.util.Calendar Candidate_Submit_Date__c;

  public java.util.Calendar getCandidate_Submit_Date__c() {
    return Candidate_Submit_Date__c;
  }

  

  public void setCandidate_Submit_Date__c(java.util.Calendar Candidate_Submit_Date__c) {
    this.Candidate_Submit_Date__c = Candidate_Submit_Date__c;
    Candidate_Submit_Date__c__is_set = true;
  }
  
  /**
   * element  : Claim1__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Claim1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Claim1__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Claim1__c__is_set = false;

  private java.lang.Boolean Claim1__c;

  public java.lang.Boolean getClaim1__c() {
    return Claim1__c;
  }

  

  public void setClaim1__c(java.lang.Boolean Claim1__c) {
    this.Claim1__c = Claim1__c;
    Claim1__c__is_set = true;
  }
  
  /**
   * element  : Claim_2__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Claim_2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Claim_2__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Claim_2__c__is_set = false;

  private java.lang.Boolean Claim_2__c;

  public java.lang.Boolean getClaim_2__c() {
    return Claim_2__c;
  }

  

  public void setClaim_2__c(java.lang.Boolean Claim_2__c) {
    this.Claim_2__c = Claim_2__c;
    Claim_2__c__is_set = true;
  }
  
  /**
   * element  : Claim_4__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Claim_4__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Claim_4__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Claim_4__c__is_set = false;

  private java.lang.Boolean Claim_4__c;

  public java.lang.Boolean getClaim_4__c() {
    return Claim_4__c;
  }

  

  public void setClaim_4__c(java.lang.Boolean Claim_4__c) {
    this.Claim_4__c = Claim_4__c;
    Claim_4__c__is_set = true;
  }
  
  /**
   * element  : Claim_5__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Claim_5__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Claim_5__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Claim_5__c__is_set = false;

  private java.lang.Boolean Claim_5__c;

  public java.lang.Boolean getClaim_5__c() {
    return Claim_5__c;
  }

  

  public void setClaim_5__c(java.lang.Boolean Claim_5__c) {
    this.Claim_5__c = Claim_5__c;
    Claim_5__c__is_set = true;
  }
  
  /**
   * element  : Claim_Slot_3__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Claim_Slot_3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Claim_Slot_3__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Claim_Slot_3__c__is_set = false;

  private java.lang.Boolean Claim_Slot_3__c;

  public java.lang.Boolean getClaim_Slot_3__c() {
    return Claim_Slot_3__c;
  }

  

  public void setClaim_Slot_3__c(java.lang.Boolean Claim_Slot_3__c) {
    this.Claim_Slot_3__c = Claim_Slot_3__c;
    Claim_Slot_3__c__is_set = true;
  }
  
  /**
   * element  : Client_Name__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Client_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client_Name__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : Client_Name__r of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Client_Name__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client_Name__r","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean Client_Name__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account Client_Name__r;

  public com.sforce.soap.enterprise.sobject.Account getClient_Name__r() {
    return Client_Name__r;
  }

  

  public void setClient_Name__r(com.sforce.soap.enterprise.sobject.Account Client_Name__r) {
    this.Client_Name__r = Client_Name__r;
    Client_Name__r__is_set = true;
  }
  
  /**
   * element  : Client_is_Collections_Issue__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Client_is_Collections_Issue__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client_is_Collections_Issue__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Client_is_Collections_Issue__c__is_set = false;

  private java.lang.String Client_is_Collections_Issue__c;

  public java.lang.String getClient_is_Collections_Issue__c() {
    return Client_is_Collections_Issue__c;
  }

  

  public void setClient_is_Collections_Issue__c(java.lang.String Client_is_Collections_Issue__c) {
    this.Client_is_Collections_Issue__c = Client_is_Collections_Issue__c;
    Client_is_Collections_Issue__c__is_set = true;
  }
  
  /**
   * element  : Closed_Assignments__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Closed_Assignments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Closed_Assignments__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Closed_Assignments__c__is_set = false;

  private java.lang.Double Closed_Assignments__c;

  public java.lang.Double getClosed_Assignments__c() {
    return Closed_Assignments__c;
  }

  

  public void setClosed_Assignments__c(java.lang.Double Closed_Assignments__c) {
    this.Closed_Assignments__c = Closed_Assignments__c;
    Closed_Assignments__c__is_set = true;
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
   * element  : Create_Assignment_Link__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Create_Assignment_Link__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Create_Assignment_Link__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Create_Assignment_Link__c__is_set = false;

  private java.lang.String Create_Assignment_Link__c;

  public java.lang.String getCreate_Assignment_Link__c() {
    return Create_Assignment_Link__c;
  }

  

  public void setCreate_Assignment_Link__c(java.lang.String Create_Assignment_Link__c) {
    this.Create_Assignment_Link__c = Create_Assignment_Link__c;
    Create_Assignment_Link__c__is_set = true;
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
   * element  : Creator_Dept__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Creator_Dept__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Creator_Dept__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Creator_Dept__c__is_set = false;

  private java.lang.String Creator_Dept__c;

  public java.lang.String getCreator_Dept__c() {
    return Creator_Dept__c;
  }

  

  public void setCreator_Dept__c(java.lang.String Creator_Dept__c) {
    this.Creator_Dept__c = Creator_Dept__c;
    Creator_Dept__c__is_set = true;
  }
  
  /**
   * element  : Credit_Limit__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Credit_Limit__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Credit_Limit__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Credit_Limit__c__is_set = false;

  private java.lang.Double Credit_Limit__c;

  public java.lang.Double getCredit_Limit__c() {
    return Credit_Limit__c;
  }

  

  public void setCredit_Limit__c(java.lang.Double Credit_Limit__c) {
    this.Credit_Limit__c = Credit_Limit__c;
    Credit_Limit__c__is_set = true;
  }
  
  /**
   * element  : Credit_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Credit_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Credit_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Credit_Rating__c__is_set = false;

  private java.lang.String Credit_Rating__c;

  public java.lang.String getCredit_Rating__c() {
    return Credit_Rating__c;
  }

  

  public void setCredit_Rating__c(java.lang.String Credit_Rating__c) {
    this.Credit_Rating__c = Credit_Rating__c;
    Credit_Rating__c__is_set = true;
  }
  
  /**
   * element  : Description__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Description__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Description__c__is_set = false;

  private java.lang.String Description__c;

  public java.lang.String getDescription__c() {
    return Description__c;
  }

  

  public void setDescription__c(java.lang.String Description__c) {
    this.Description__c = Description__c;
    Description__c__is_set = true;
  }
  
  /**
   * element  : Division__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Division__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Division__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : Division__r of type {urn:sobject.enterprise.soap.sforce.com}Division__c
   * java type: com.sforce.soap.enterprise.sobject.Division__c
   */
  private static final com.sforce.ws.bind.TypeInfo Division__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Division__r","urn:sobject.enterprise.soap.sforce.com","Division__c",0,1,true);

  private boolean Division__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Division__c Division__r;

  public com.sforce.soap.enterprise.sobject.Division__c getDivision__r() {
    return Division__r;
  }

  

  public void setDivision__r(com.sforce.soap.enterprise.sobject.Division__c Division__r) {
    this.Division__r = Division__r;
    Division__r__is_set = true;
  }
  
  /**
   * element  : Drug_Test_Required__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Drug_Test_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Drug_Test_Required__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Drug_Test_Required__c__is_set = false;

  private java.lang.Boolean Drug_Test_Required__c;

  public java.lang.Boolean getDrug_Test_Required__c() {
    return Drug_Test_Required__c;
  }

  

  public void setDrug_Test_Required__c(java.lang.Boolean Drug_Test_Required__c) {
    this.Drug_Test_Required__c = Drug_Test_Required__c;
    Drug_Test_Required__c__is_set = true;
  }
  
  /**
   * element  : Drug_Tests__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Drug_Tests__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Drug_Tests__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Drug_Tests__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Drug_Tests__r;

  public com.sforce.soap.enterprise.QueryResult getDrug_Tests__r() {
    return Drug_Tests__r;
  }

  

  public void setDrug_Tests__r(com.sforce.soap.enterprise.QueryResult Drug_Tests__r) {
    this.Drug_Tests__r = Drug_Tests__r;
    Drug_Tests__r__is_set = true;
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
   * element  : Email_Posting_Template_Number__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Email_Posting_Template_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email_Posting_Template_Number__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Email_Posting_Template_Number__c__is_set = false;

  private java.lang.Double Email_Posting_Template_Number__c;

  public java.lang.Double getEmail_Posting_Template_Number__c() {
    return Email_Posting_Template_Number__c;
  }

  

  public void setEmail_Posting_Template_Number__c(java.lang.Double Email_Posting_Template_Number__c) {
    this.Email_Posting_Template_Number__c = Email_Posting_Template_Number__c;
    Email_Posting_Template_Number__c__is_set = true;
  }
  
  /**
   * element  : Email_Posting_Template_State_Value__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Email_Posting_Template_State_Value__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email_Posting_Template_State_Value__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Email_Posting_Template_State_Value__c__is_set = false;

  private java.lang.Double Email_Posting_Template_State_Value__c;

  public java.lang.Double getEmail_Posting_Template_State_Value__c() {
    return Email_Posting_Template_State_Value__c;
  }

  

  public void setEmail_Posting_Template_State_Value__c(java.lang.Double Email_Posting_Template_State_Value__c) {
    this.Email_Posting_Template_State_Value__c = Email_Posting_Template_State_Value__c;
    Email_Posting_Template_State_Value__c__is_set = true;
  }
  
  /**
   * element  : Email_Posting_Template_Trade_Value__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Email_Posting_Template_Trade_Value__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email_Posting_Template_Trade_Value__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Email_Posting_Template_Trade_Value__c__is_set = false;

  private java.lang.Double Email_Posting_Template_Trade_Value__c;

  public java.lang.Double getEmail_Posting_Template_Trade_Value__c() {
    return Email_Posting_Template_Trade_Value__c;
  }

  

  public void setEmail_Posting_Template_Trade_Value__c(java.lang.Double Email_Posting_Template_Trade_Value__c) {
    this.Email_Posting_Template_Trade_Value__c = Email_Posting_Template_Trade_Value__c;
    Email_Posting_Template_Trade_Value__c__is_set = true;
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
   * element  : Employees_Assigned__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Employees_Assigned__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employees_Assigned__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Employees_Assigned__c__is_set = false;

  private java.lang.Double Employees_Assigned__c;

  public java.lang.Double getEmployees_Assigned__c() {
    return Employees_Assigned__c;
  }

  

  public void setEmployees_Assigned__c(java.lang.Double Employees_Assigned__c) {
    this.Employees_Assigned__c = Employees_Assigned__c;
    Employees_Assigned__c__is_set = true;
  }
  
  /**
   * element  : Estimated_Duration__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Estimated_Duration__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Estimated_Duration__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Estimated_Duration__c__is_set = false;

  private java.lang.Double Estimated_Duration__c;

  public java.lang.Double getEstimated_Duration__c() {
    return Estimated_Duration__c;
  }

  

  public void setEstimated_Duration__c(java.lang.Double Estimated_Duration__c) {
    this.Estimated_Duration__c = Estimated_Duration__c;
    Estimated_Duration__c__is_set = true;
  }
  
  /**
   * element  : Estimated_Project_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Estimated_Project_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Estimated_Project_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Estimated_Project_End_Date__c__is_set = false;

  private java.util.Calendar Estimated_Project_End_Date__c;

  public java.util.Calendar getEstimated_Project_End_Date__c() {
    return Estimated_Project_End_Date__c;
  }

  

  public void setEstimated_Project_End_Date__c(java.util.Calendar Estimated_Project_End_Date__c) {
    this.Estimated_Project_End_Date__c = Estimated_Project_End_Date__c;
    Estimated_Project_End_Date__c__is_set = true;
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
   * element  : Field_Expenses__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Field_Expenses__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Field_Expenses__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Field_Expenses__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Field_Expenses__r;

  public com.sforce.soap.enterprise.QueryResult getField_Expenses__r() {
    return Field_Expenses__r;
  }

  

  public void setField_Expenses__r(com.sforce.soap.enterprise.QueryResult Field_Expenses__r) {
    this.Field_Expenses__r = Field_Expenses__r;
    Field_Expenses__r__is_set = true;
  }
  
  /**
   * element  : Fifth_Recruiter__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fifth_Recruiter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fifth_Recruiter__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fifth_Recruiter__c__is_set = false;

  private java.lang.String Fifth_Recruiter__c;

  public java.lang.String getFifth_Recruiter__c() {
    return Fifth_Recruiter__c;
  }

  

  public void setFifth_Recruiter__c(java.lang.String Fifth_Recruiter__c) {
    this.Fifth_Recruiter__c = Fifth_Recruiter__c;
    Fifth_Recruiter__c__is_set = true;
  }
  
  /**
   * element  : First_Assignment_Start__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo First_Assignment_Start__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","First_Assignment_Start__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean First_Assignment_Start__c__is_set = false;

  private java.util.Calendar First_Assignment_Start__c;

  public java.util.Calendar getFirst_Assignment_Start__c() {
    return First_Assignment_Start__c;
  }

  

  public void setFirst_Assignment_Start__c(java.util.Calendar First_Assignment_Start__c) {
    this.First_Assignment_Start__c = First_Assignment_Start__c;
    First_Assignment_Start__c__is_set = true;
  }
  
  /**
   * element  : Fourth_Recruiter__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fourth_Recruiter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fourth_Recruiter__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fourth_Recruiter__c__is_set = false;

  private java.lang.String Fourth_Recruiter__c;

  public java.lang.String getFourth_Recruiter__c() {
    return Fourth_Recruiter__c;
  }

  

  public void setFourth_Recruiter__c(java.lang.String Fourth_Recruiter__c) {
    this.Fourth_Recruiter__c = Fourth_Recruiter__c;
    Fourth_Recruiter__c__is_set = true;
  }
  
  /**
   * element  : General_Contractor_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo General_Contractor_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","General_Contractor_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean General_Contractor_Name__c__is_set = false;

  private java.lang.String General_Contractor_Name__c;

  public java.lang.String getGeneral_Contractor_Name__c() {
    return General_Contractor_Name__c;
  }

  

  public void setGeneral_Contractor_Name__c(java.lang.String General_Contractor_Name__c) {
    this.General_Contractor_Name__c = General_Contractor_Name__c;
    General_Contractor_Name__c__is_set = true;
  }
  
  /**
   * element  : Geo_Code_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Geo_Code_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Geo_Code_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Geo_Code_Status__c__is_set = false;

  private java.lang.String Geo_Code_Status__c;

  public java.lang.String getGeo_Code_Status__c() {
    return Geo_Code_Status__c;
  }

  

  public void setGeo_Code_Status__c(java.lang.String Geo_Code_Status__c) {
    this.Geo_Code_Status__c = Geo_Code_Status__c;
    Geo_Code_Status__c__is_set = true;
  }
  
  /**
   * element  : Global_Share__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Global_Share__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Global_Share__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Global_Share__c__is_set = false;

  private java.lang.String Global_Share__c;

  public java.lang.String getGlobal_Share__c() {
    return Global_Share__c;
  }

  

  public void setGlobal_Share__c(java.lang.String Global_Share__c) {
    this.Global_Share__c = Global_Share__c;
    Global_Share__c__is_set = true;
  }
  
  /**
   * element  : HR_Requests__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo HR_Requests__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HR_Requests__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean HR_Requests__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult HR_Requests__r;

  public com.sforce.soap.enterprise.QueryResult getHR_Requests__r() {
    return HR_Requests__r;
  }

  

  public void setHR_Requests__r(com.sforce.soap.enterprise.QueryResult HR_Requests__r) {
    this.HR_Requests__r = HR_Requests__r;
    HR_Requests__r__is_set = true;
  }
  
  /**
   * element  : Has_WC_Coverage__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Has_WC_Coverage__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Has_WC_Coverage__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Has_WC_Coverage__c__is_set = false;

  private java.lang.Boolean Has_WC_Coverage__c;

  public java.lang.Boolean getHas_WC_Coverage__c() {
    return Has_WC_Coverage__c;
  }

  

  public void setHas_WC_Coverage__c(java.lang.Boolean Has_WC_Coverage__c) {
    this.Has_WC_Coverage__c = Has_WC_Coverage__c;
    Has_WC_Coverage__c__is_set = true;
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
   * element  : If_Background_Ck_required_is_it_BILLED__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo If_Background_Ck_required_is_it_BILLED__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","If_Background_Ck_required_is_it_BILLED__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean If_Background_Ck_required_is_it_BILLED__c__is_set = false;

  private java.lang.String If_Background_Ck_required_is_it_BILLED__c;

  public java.lang.String getIf_Background_Ck_required_is_it_BILLED__c() {
    return If_Background_Ck_required_is_it_BILLED__c;
  }

  

  public void setIf_Background_Ck_required_is_it_BILLED__c(java.lang.String If_Background_Ck_required_is_it_BILLED__c) {
    this.If_Background_Ck_required_is_it_BILLED__c = If_Background_Ck_required_is_it_BILLED__c;
    If_Background_Ck_required_is_it_BILLED__c__is_set = true;
  }
  
  /**
   * element  : If_Drug_Test_required_is_it_BILLED__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo If_Drug_Test_required_is_it_BILLED__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","If_Drug_Test_required_is_it_BILLED__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean If_Drug_Test_required_is_it_BILLED__c__is_set = false;

  private java.lang.String If_Drug_Test_required_is_it_BILLED__c;

  public java.lang.String getIf_Drug_Test_required_is_it_BILLED__c() {
    return If_Drug_Test_required_is_it_BILLED__c;
  }

  

  public void setIf_Drug_Test_required_is_it_BILLED__c(java.lang.String If_Drug_Test_required_is_it_BILLED__c) {
    this.If_Drug_Test_required_is_it_BILLED__c = If_Drug_Test_required_is_it_BILLED__c;
    If_Drug_Test_required_is_it_BILLED__c__is_set = true;
  }
  
  /**
   * element  : Invoices__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Invoices__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoices__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Invoices__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Invoices__r;

  public com.sforce.soap.enterprise.QueryResult getInvoices__r() {
    return Invoices__r;
  }

  

  public void setInvoices__r(com.sforce.soap.enterprise.QueryResult Invoices__r) {
    this.Invoices__r = Invoices__r;
    Invoices__r__is_set = true;
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
   * element  : Lat__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Lat__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Lat__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Lat__c__is_set = false;

  private java.lang.Double Lat__c;

  public java.lang.Double getLat__c() {
    return Lat__c;
  }

  

  public void setLat__c(java.lang.Double Lat__c) {
    this.Lat__c = Lat__c;
    Lat__c__is_set = true;
  }
  
  /**
   * element  : Location_of_Project__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Location_of_Project__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Location_of_Project__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Location_of_Project__c__is_set = false;

  private java.lang.String Location_of_Project__c;

  public java.lang.String getLocation_of_Project__c() {
    return Location_of_Project__c;
  }

  

  public void setLocation_of_Project__c(java.lang.String Location_of_Project__c) {
    this.Location_of_Project__c = Location_of_Project__c;
    Location_of_Project__c__is_set = true;
  }
  
  /**
   * element  : Lon__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Lon__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Lon__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Lon__c__is_set = false;

  private java.lang.Double Lon__c;

  public java.lang.Double getLon__c() {
    return Lon__c;
  }

  

  public void setLon__c(java.lang.Double Lon__c) {
    this.Lon__c = Lon__c;
    Lon__c__is_set = true;
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
   * element  : Max_Assignment_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Max_Assignment_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Max_Assignment_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Max_Assignment_End_Date__c__is_set = false;

  private java.util.Calendar Max_Assignment_End_Date__c;

  public java.util.Calendar getMax_Assignment_End_Date__c() {
    return Max_Assignment_End_Date__c;
  }

  

  public void setMax_Assignment_End_Date__c(java.util.Calendar Max_Assignment_End_Date__c) {
    this.Max_Assignment_End_Date__c = Max_Assignment_End_Date__c;
    Max_Assignment_End_Date__c__is_set = true;
  }
  
  /**
   * element  : Mileage__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Mileage__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Mileage__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Mileage__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Mileage__r;

  public com.sforce.soap.enterprise.QueryResult getMileage__r() {
    return Mileage__r;
  }

  

  public void setMileage__r(com.sforce.soap.enterprise.QueryResult Mileage__r) {
    this.Mileage__r = Mileage__r;
    Mileage__r__is_set = true;
  }
  
  /**
   * element  : Most_Recent_Assignment_End__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Most_Recent_Assignment_End__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Most_Recent_Assignment_End__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Most_Recent_Assignment_End__c__is_set = false;

  private java.util.Calendar Most_Recent_Assignment_End__c;

  public java.util.Calendar getMost_Recent_Assignment_End__c() {
    return Most_Recent_Assignment_End__c;
  }

  

  public void setMost_Recent_Assignment_End__c(java.util.Calendar Most_Recent_Assignment_End__c) {
    this.Most_Recent_Assignment_End__c = Most_Recent_Assignment_End__c;
    Most_Recent_Assignment_End__c__is_set = true;
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
   * element  : Number_of_Assignments__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Number_of_Assignments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number_of_Assignments__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Number_of_Assignments__c__is_set = false;

  private java.lang.Double Number_of_Assignments__c;

  public java.lang.Double getNumber_of_Assignments__c() {
    return Number_of_Assignments__c;
  }

  

  public void setNumber_of_Assignments__c(java.lang.Double Number_of_Assignments__c) {
    this.Number_of_Assignments__c = Number_of_Assignments__c;
    Number_of_Assignments__c__is_set = true;
  }
  
  /**
   * element  : OCIP__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OCIP__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OCIP__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OCIP__c__is_set = false;

  private java.lang.Boolean OCIP__c;

  public java.lang.Boolean getOCIP__c() {
    return OCIP__c;
  }

  

  public void setOCIP__c(java.lang.Boolean OCIP__c) {
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
   * element  : Open_Assignments__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Open_Assignments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Open_Assignments__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Open_Assignments__c__is_set = false;

  private java.lang.Double Open_Assignments__c;

  public java.lang.Double getOpen_Assignments__c() {
    return Open_Assignments__c;
  }

  

  public void setOpen_Assignments__c(java.lang.Double Open_Assignments__c) {
    this.Open_Assignments__c = Open_Assignments__c;
    Open_Assignments__c__is_set = true;
  }
  
  /**
   * element  : Opportunity_Id__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunity_Id__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunity_Id__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Opportunity_Id__c__is_set = false;

  private java.lang.String Opportunity_Id__c;

  public java.lang.String getOpportunity_Id__c() {
    return Opportunity_Id__c;
  }

  

  public void setOpportunity_Id__c(java.lang.String Opportunity_Id__c) {
    this.Opportunity_Id__c = Opportunity_Id__c;
    Opportunity_Id__c__is_set = true;
  }
  
  /**
   * element  : Ops_Team_Assigned__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Ops_Team_Assigned__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Ops_Team_Assigned__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Ops_Team_Assigned__c__is_set = false;

  private java.lang.String Ops_Team_Assigned__c;

  public java.lang.String getOps_Team_Assigned__c() {
    return Ops_Team_Assigned__c;
  }

  

  public void setOps_Team_Assigned__c(java.lang.String Ops_Team_Assigned__c) {
    this.Ops_Team_Assigned__c = Ops_Team_Assigned__c;
    Ops_Team_Assigned__c__is_set = true;
  }
  
  /**
   * element  : OrderCount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo OrderCount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OrderCount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean OrderCount__c__is_set = false;

  private java.lang.Double OrderCount__c;

  public java.lang.Double getOrderCount__c() {
    return OrderCount__c;
  }

  

  public void setOrderCount__c(java.lang.Double OrderCount__c) {
    this.OrderCount__c = OrderCount__c;
    OrderCount__c__is_set = true;
  }
  
  /**
   * element  : Order_Certifications__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Certifications__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Certifications__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Order_Certifications__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Order_Certifications__r;

  public com.sforce.soap.enterprise.QueryResult getOrder_Certifications__r() {
    return Order_Certifications__r;
  }

  

  public void setOrder_Certifications__r(com.sforce.soap.enterprise.QueryResult Order_Certifications__r) {
    this.Order_Certifications__r = Order_Certifications__r;
    Order_Certifications__r__is_set = true;
  }
  
  /**
   * element  : Order_Description__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Description__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Description__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Order_Description__c__is_set = false;

  private java.lang.String Order_Description__c;

  public java.lang.String getOrder_Description__c() {
    return Order_Description__c;
  }

  

  public void setOrder_Description__c(java.lang.String Order_Description__c) {
    this.Order_Description__c = Order_Description__c;
    Order_Description__c__is_set = true;
  }
  
  /**
   * element  : Order_Note__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Note__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Note__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Order_Note__c__is_set = false;

  private java.lang.String Order_Note__c;

  public java.lang.String getOrder_Note__c() {
    return Order_Note__c;
  }

  

  public void setOrder_Note__c(java.lang.String Order_Note__c) {
    this.Order_Note__c = Order_Note__c;
    Order_Note__c__is_set = true;
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
   * element  : Order_Rates__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Rates__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Rates__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Order_Rates__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Order_Rates__r;

  public com.sforce.soap.enterprise.QueryResult getOrder_Rates__r() {
    return Order_Rates__r;
  }

  

  public void setOrder_Rates__r(com.sforce.soap.enterprise.QueryResult Order_Rates__r) {
    this.Order_Rates__r = Order_Rates__r;
    Order_Rates__r__is_set = true;
  }
  
  /**
   * element  : Order_Skills__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Order_Skills__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Order_Skills__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Order_Skills__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Order_Skills__r;

  public com.sforce.soap.enterprise.QueryResult getOrder_Skills__r() {
    return Order_Skills__r;
  }

  

  public void setOrder_Skills__r(com.sforce.soap.enterprise.QueryResult Order_Skills__r) {
    this.Order_Skills__r = Order_Skills__r;
    Order_Skills__r__is_set = true;
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
   * element  : PO_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PO_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PO_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PO_Number__c__is_set = false;

  private java.lang.String PO_Number__c;

  public java.lang.String getPO_Number__c() {
    return PO_Number__c;
  }

  

  public void setPO_Number__c(java.lang.String PO_Number__c) {
    this.PO_Number__c = PO_Number__c;
    PO_Number__c__is_set = true;
  }
  
  /**
   * element  : PO_Override__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PO_Override__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PO_Override__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PO_Override__c__is_set = false;

  private java.lang.Boolean PO_Override__c;

  public java.lang.Boolean getPO_Override__c() {
    return PO_Override__c;
  }

  

  public void setPO_Override__c(java.lang.Boolean PO_Override__c) {
    this.PO_Override__c = PO_Override__c;
    PO_Override__c__is_set = true;
  }
  
  /**
   * element  : PO_Required__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PO_Required__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PO_Required__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PO_Required__c__is_set = false;

  private java.lang.String PO_Required__c;

  public java.lang.String getPO_Required__c() {
    return PO_Required__c;
  }

  

  public void setPO_Required__c(java.lang.String PO_Required__c) {
    this.PO_Required__c = PO_Required__c;
    PO_Required__c__is_set = true;
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
   * element  : Potential_Candidate_Lists__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Potential_Candidate_Lists__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Potential_Candidate_Lists__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Potential_Candidate_Lists__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Potential_Candidate_Lists__r;

  public com.sforce.soap.enterprise.QueryResult getPotential_Candidate_Lists__r() {
    return Potential_Candidate_Lists__r;
  }

  

  public void setPotential_Candidate_Lists__r(com.sforce.soap.enterprise.QueryResult Potential_Candidate_Lists__r) {
    this.Potential_Candidate_Lists__r = Potential_Candidate_Lists__r;
    Potential_Candidate_Lists__r__is_set = true;
  }
  
  /**
   * element  : Prevailing_Wage_Project__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Prevailing_Wage_Project__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Prevailing_Wage_Project__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Prevailing_Wage_Project__c__is_set = false;

  private java.lang.String Prevailing_Wage_Project__c;

  public java.lang.String getPrevailing_Wage_Project__c() {
    return Prevailing_Wage_Project__c;
  }

  

  public void setPrevailing_Wage_Project__c(java.lang.String Prevailing_Wage_Project__c) {
    this.Prevailing_Wage_Project__c = Prevailing_Wage_Project__c;
    Prevailing_Wage_Project__c__is_set = true;
  }
  
  /**
   * element  : Priority__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Priority__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Priority__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Priority__c__is_set = false;

  private java.lang.Double Priority__c;

  public java.lang.Double getPriority__c() {
    return Priority__c;
  }

  

  public void setPriority__c(java.lang.Double Priority__c) {
    this.Priority__c = Priority__c;
    Priority__c__is_set = true;
  }
  
  /**
   * element  : Probability__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Probability__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Probability__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Probability__c__is_set = false;

  private java.lang.Double Probability__c;

  public java.lang.Double getProbability__c() {
    return Probability__c;
  }

  

  public void setProbability__c(java.lang.Double Probability__c) {
    this.Probability__c = Probability__c;
    Probability__c__is_set = true;
  }
  
  /**
   * element  : Probability_del__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Probability_del__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Probability_del__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Probability_del__c__is_set = false;

  private java.lang.Double Probability_del__c;

  public java.lang.Double getProbability_del__c() {
    return Probability_del__c;
  }

  

  public void setProbability_del__c(java.lang.Double Probability_del__c) {
    this.Probability_del__c = Probability_del__c;
    Probability_del__c__is_set = true;
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
   * element  : Project_Contact__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Contact__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_Contact__c__is_set = false;

  private java.lang.String Project_Contact__c;

  public java.lang.String getProject_Contact__c() {
    return Project_Contact__c;
  }

  

  public void setProject_Contact__c(java.lang.String Project_Contact__c) {
    this.Project_Contact__c = Project_Contact__c;
    Project_Contact__c__is_set = true;
  }
  
  /**
   * element  : Project_Owner_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Owner_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Owner_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_Owner_Name__c__is_set = false;

  private java.lang.String Project_Owner_Name__c;

  public java.lang.String getProject_Owner_Name__c() {
    return Project_Owner_Name__c;
  }

  

  public void setProject_Owner_Name__c(java.lang.String Project_Owner_Name__c) {
    this.Project_Owner_Name__c = Project_Owner_Name__c;
    Project_Owner_Name__c__is_set = true;
  }
  
  /**
   * element  : Project_Site_Contact__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Site_Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Site_Contact__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Project_Site_Contact__c__is_set = false;

  private java.lang.String Project_Site_Contact__c;

  public java.lang.String getProject_Site_Contact__c() {
    return Project_Site_Contact__c;
  }

  

  public void setProject_Site_Contact__c(java.lang.String Project_Site_Contact__c) {
    this.Project_Site_Contact__c = Project_Site_Contact__c;
    Project_Site_Contact__c__is_set = true;
  }
  
  /**
   * element  : Project_Start_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Project_Start_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Project_Start_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Project_Start_Date__c__is_set = false;

  private java.util.Calendar Project_Start_Date__c;

  public java.util.Calendar getProject_Start_Date__c() {
    return Project_Start_Date__c;
  }

  

  public void setProject_Start_Date__c(java.util.Calendar Project_Start_Date__c) {
    this.Project_Start_Date__c = Project_Start_Date__c;
    Project_Start_Date__c__is_set = true;
  }
  
  /**
   * element  : Proxy__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Proxy__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Proxy__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Proxy__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Proxy__r;

  public com.sforce.soap.enterprise.QueryResult getProxy__r() {
    return Proxy__r;
  }

  

  public void setProxy__r(com.sforce.soap.enterprise.QueryResult Proxy__r) {
    this.Proxy__r = Proxy__r;
    Proxy__r__is_set = true;
  }
  
  /**
   * element  : Publically_Funded_Project__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Publically_Funded_Project__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Publically_Funded_Project__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Publically_Funded_Project__c__is_set = false;

  private java.lang.Boolean Publically_Funded_Project__c;

  public java.lang.Boolean getPublically_Funded_Project__c() {
    return Publically_Funded_Project__c;
  }

  

  public void setPublically_Funded_Project__c(java.lang.Boolean Publically_Funded_Project__c) {
    this.Publically_Funded_Project__c = Publically_Funded_Project__c;
    Publically_Funded_Project__c__is_set = true;
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
   * element  : Recruiter_1_First_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_1_First_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_1_First_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter_1_First_Name__c__is_set = false;

  private java.lang.String Recruiter_1_First_Name__c;

  public java.lang.String getRecruiter_1_First_Name__c() {
    return Recruiter_1_First_Name__c;
  }

  

  public void setRecruiter_1_First_Name__c(java.lang.String Recruiter_1_First_Name__c) {
    this.Recruiter_1_First_Name__c = Recruiter_1_First_Name__c;
    Recruiter_1_First_Name__c__is_set = true;
  }
  
  /**
   * element  : Recruiter_1_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_1_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_1_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter_1_Phone__c__is_set = false;

  private java.lang.String Recruiter_1_Phone__c;

  public java.lang.String getRecruiter_1_Phone__c() {
    return Recruiter_1_Phone__c;
  }

  

  public void setRecruiter_1_Phone__c(java.lang.String Recruiter_1_Phone__c) {
    this.Recruiter_1_Phone__c = Recruiter_1_Phone__c;
    Recruiter_1_Phone__c__is_set = true;
  }
  
  /**
   * element  : Recruiter_In_Charge__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_In_Charge__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_In_Charge__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter_In_Charge__c__is_set = false;

  private java.lang.String Recruiter_In_Charge__c;

  public java.lang.String getRecruiter_In_Charge__c() {
    return Recruiter_In_Charge__c;
  }

  

  public void setRecruiter_In_Charge__c(java.lang.String Recruiter_In_Charge__c) {
    this.Recruiter_In_Charge__c = Recruiter_In_Charge__c;
    Recruiter_In_Charge__c__is_set = true;
  }
  
  /**
   * element  : Recruiter_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Recruiter_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Recruiter_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Recruiter_Phone__c__is_set = false;

  private java.lang.String Recruiter_Phone__c;

  public java.lang.String getRecruiter_Phone__c() {
    return Recruiter_Phone__c;
  }

  

  public void setRecruiter_Phone__c(java.lang.String Recruiter_Phone__c) {
    this.Recruiter_Phone__c = Recruiter_Phone__c;
    Recruiter_Phone__c__is_set = true;
  }
  
  /**
   * element  : Region__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Region__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Region__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : Region__r of type {urn:sobject.enterprise.soap.sforce.com}Region__c
   * java type: com.sforce.soap.enterprise.sobject.Region__c
   */
  private static final com.sforce.ws.bind.TypeInfo Region__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Region__r","urn:sobject.enterprise.soap.sforce.com","Region__c",0,1,true);

  private boolean Region__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Region__c Region__r;

  public com.sforce.soap.enterprise.sobject.Region__c getRegion__r() {
    return Region__r;
  }

  

  public void setRegion__r(com.sforce.soap.enterprise.sobject.Region__c Region__r) {
    this.Region__r = Region__r;
    Region__r__is_set = true;
  }
  
  /**
   * element  : Requested_Headcount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Requested_Headcount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Requested_Headcount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Requested_Headcount__c__is_set = false;

  private java.lang.Double Requested_Headcount__c;

  public java.lang.Double getRequested_Headcount__c() {
    return Requested_Headcount__c;
  }

  

  public void setRequested_Headcount__c(java.lang.Double Requested_Headcount__c) {
    this.Requested_Headcount__c = Requested_Headcount__c;
    Requested_Headcount__c__is_set = true;
  }
  
  /**
   * element  : Requested_Start_Time__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Requested_Start_Time__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Requested_Start_Time__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Requested_Start_Time__c__is_set = false;

  private java.lang.String Requested_Start_Time__c;

  public java.lang.String getRequested_Start_Time__c() {
    return Requested_Start_Time__c;
  }

  

  public void setRequested_Start_Time__c(java.lang.String Requested_Start_Time__c) {
    this.Requested_Start_Time__c = Requested_Start_Time__c;
    Requested_Start_Time__c__is_set = true;
  }
  
  /**
   * element  : Safety_Contact__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Safety_Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Safety_Contact__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Safety_Contact__c__is_set = false;

  private java.lang.String Safety_Contact__c;

  public java.lang.String getSafety_Contact__c() {
    return Safety_Contact__c;
  }

  

  public void setSafety_Contact__c(java.lang.String Safety_Contact__c) {
    this.Safety_Contact__c = Safety_Contact__c;
    Safety_Contact__c__is_set = true;
  }
  
  /**
   * element  : Safety_Contact__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo Safety_Contact__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Safety_Contact__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean Safety_Contact__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact Safety_Contact__r;

  public com.sforce.soap.enterprise.sobject.Contact getSafety_Contact__r() {
    return Safety_Contact__r;
  }

  

  public void setSafety_Contact__r(com.sforce.soap.enterprise.sobject.Contact Safety_Contact__r) {
    this.Safety_Contact__r = Safety_Contact__r;
    Safety_Contact__r__is_set = true;
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
   * element  : Special_Billing_Instructions__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Billing_Instructions__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Billing_Instructions__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Billing_Instructions__c__is_set = false;

  private java.lang.String Special_Billing_Instructions__c;

  public java.lang.String getSpecial_Billing_Instructions__c() {
    return Special_Billing_Instructions__c;
  }

  

  public void setSpecial_Billing_Instructions__c(java.lang.String Special_Billing_Instructions__c) {
    this.Special_Billing_Instructions__c = Special_Billing_Instructions__c;
    Special_Billing_Instructions__c__is_set = true;
  }
  
  /**
   * element  : Special_Requirements__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Special_Requirements__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Special_Requirements__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Special_Requirements__c__is_set = false;

  private java.lang.String Special_Requirements__c;

  public java.lang.String getSpecial_Requirements__c() {
    return Special_Requirements__c;
  }

  

  public void setSpecial_Requirements__c(java.lang.String Special_Requirements__c) {
    this.Special_Requirements__c = Special_Requirements__c;
    Special_Requirements__c__is_set = true;
  }
  
  /**
   * element  : State_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State_Code__c__is_set = false;

  private java.lang.String State_Code__c;

  public java.lang.String getState_Code__c() {
    return State_Code__c;
  }

  

  public void setState_Code__c(java.lang.String State_Code__c) {
    this.State_Code__c = State_Code__c;
    State_Code__c__is_set = true;
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
   * element  : Submit_Date_Week_Ending__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Submit_Date_Week_Ending__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Submit_Date_Week_Ending__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Submit_Date_Week_Ending__c__is_set = false;

  private java.util.Calendar Submit_Date_Week_Ending__c;

  public java.util.Calendar getSubmit_Date_Week_Ending__c() {
    return Submit_Date_Week_Ending__c;
  }

  

  public void setSubmit_Date_Week_Ending__c(java.util.Calendar Submit_Date_Week_Ending__c) {
    this.Submit_Date_Week_Ending__c = Submit_Date_Week_Ending__c;
    Submit_Date_Week_Ending__c__is_set = true;
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
   * element  : Target_Bill_Rate__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Target_Bill_Rate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Target_Bill_Rate__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Target_Bill_Rate__c__is_set = false;

  private java.lang.Double Target_Bill_Rate__c;

  public java.lang.Double getTarget_Bill_Rate__c() {
    return Target_Bill_Rate__c;
  }

  

  public void setTarget_Bill_Rate__c(java.lang.Double Target_Bill_Rate__c) {
    this.Target_Bill_Rate__c = Target_Bill_Rate__c;
    Target_Bill_Rate__c__is_set = true;
  }
  
  /**
   * element  : Target_Mark_Up__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Target_Mark_Up__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Target_Mark_Up__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Target_Mark_Up__c__is_set = false;

  private java.lang.Double Target_Mark_Up__c;

  public java.lang.Double getTarget_Mark_Up__c() {
    return Target_Mark_Up__c;
  }

  

  public void setTarget_Mark_Up__c(java.lang.Double Target_Mark_Up__c) {
    this.Target_Mark_Up__c = Target_Mark_Up__c;
    Target_Mark_Up__c__is_set = true;
  }
  
  /**
   * element  : Target_Pay_Rate__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Target_Pay_Rate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Target_Pay_Rate__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Target_Pay_Rate__c__is_set = false;

  private java.lang.Double Target_Pay_Rate__c;

  public java.lang.Double getTarget_Pay_Rate__c() {
    return Target_Pay_Rate__c;
  }

  

  public void setTarget_Pay_Rate__c(java.lang.Double Target_Pay_Rate__c) {
    this.Target_Pay_Rate__c = Target_Pay_Rate__c;
    Target_Pay_Rate__c__is_set = true;
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
   * element  : Tax_Exempt__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Tax_Exempt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tax_Exempt__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Tax_Exempt__c__is_set = false;

  private java.lang.String Tax_Exempt__c;

  public java.lang.String getTax_Exempt__c() {
    return Tax_Exempt__c;
  }

  

  public void setTax_Exempt__c(java.lang.String Tax_Exempt__c) {
    this.Tax_Exempt__c = Tax_Exempt__c;
    Tax_Exempt__c__is_set = true;
  }
  
  /**
   * element  : Tax_Schedule__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Tax_Schedule__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tax_Schedule__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Tax_Schedule__c__is_set = false;

  private java.lang.String Tax_Schedule__c;

  public java.lang.String getTax_Schedule__c() {
    return Tax_Schedule__c;
  }

  

  public void setTax_Schedule__c(java.lang.String Tax_Schedule__c) {
    this.Tax_Schedule__c = Tax_Schedule__c;
    Tax_Schedule__c__is_set = true;
  }
  
  /**
   * element  : Tax_Schedule__r of type {urn:sobject.enterprise.soap.sforce.com}Tax_Schedule__c
   * java type: com.sforce.soap.enterprise.sobject.Tax_Schedule__c
   */
  private static final com.sforce.ws.bind.TypeInfo Tax_Schedule__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tax_Schedule__r","urn:sobject.enterprise.soap.sforce.com","Tax_Schedule__c",0,1,true);

  private boolean Tax_Schedule__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Tax_Schedule__c Tax_Schedule__r;

  public com.sforce.soap.enterprise.sobject.Tax_Schedule__c getTax_Schedule__r() {
    return Tax_Schedule__r;
  }

  

  public void setTax_Schedule__r(com.sforce.soap.enterprise.sobject.Tax_Schedule__c Tax_Schedule__r) {
    this.Tax_Schedule__r = Tax_Schedule__r;
    Tax_Schedule__r__is_set = true;
  }
  
  /**
   * element  : Test__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Test__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Test__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Test__c__is_set = false;

  private java.lang.String Test__c;

  public java.lang.String getTest__c() {
    return Test__c;
  }

  

  public void setTest__c(java.lang.String Test__c) {
    this.Test__c = Test__c;
    Test__c__is_set = true;
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
   * element  : Total_Client_Active_Assignments__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Client_Active_Assignments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Client_Active_Assignments__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Client_Active_Assignments__c__is_set = false;

  private java.lang.Double Total_Client_Active_Assignments__c;

  public java.lang.Double getTotal_Client_Active_Assignments__c() {
    return Total_Client_Active_Assignments__c;
  }

  

  public void setTotal_Client_Active_Assignments__c(java.lang.Double Total_Client_Active_Assignments__c) {
    this.Total_Client_Active_Assignments__c = Total_Client_Active_Assignments__c;
    Total_Client_Active_Assignments__c__is_set = true;
  }
  
  /**
   * element  : Total_Req_Headcount_Credit_Load__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Req_Headcount_Credit_Load__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Req_Headcount_Credit_Load__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Req_Headcount_Credit_Load__c__is_set = false;

  private java.lang.Double Total_Req_Headcount_Credit_Load__c;

  public java.lang.Double getTotal_Req_Headcount_Credit_Load__c() {
    return Total_Req_Headcount_Credit_Load__c;
  }

  

  public void setTotal_Req_Headcount_Credit_Load__c(java.lang.Double Total_Req_Headcount_Credit_Load__c) {
    this.Total_Req_Headcount_Credit_Load__c = Total_Req_Headcount_Credit_Load__c;
    Total_Req_Headcount_Credit_Load__c__is_set = true;
  }
  
  /**
   * element  : TradeID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TradeID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TradeID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TradeID__c__is_set = false;

  private java.lang.String TradeID__c;

  public java.lang.String getTradeID__c() {
    return TradeID__c;
  }

  

  public void setTradeID__c(java.lang.String TradeID__c) {
    this.TradeID__c = TradeID__c;
    TradeID__c__is_set = true;
  }
  
  /**
   * element  : TradeMerge__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TradeMerge__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TradeMerge__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TradeMerge__c__is_set = false;

  private java.lang.String TradeMerge__c;

  public java.lang.String getTradeMerge__c() {
    return TradeMerge__c;
  }

  

  public void setTradeMerge__c(java.lang.String TradeMerge__c) {
    this.TradeMerge__c = TradeMerge__c;
    TradeMerge__c__is_set = true;
  }
  
  /**
   * element  : Trade__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Trade__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trade__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : Trade__r of type {urn:sobject.enterprise.soap.sforce.com}Trade__c
   * java type: com.sforce.soap.enterprise.sobject.Trade__c
   */
  private static final com.sforce.ws.bind.TypeInfo Trade__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trade__r","urn:sobject.enterprise.soap.sforce.com","Trade__c",0,1,true);

  private boolean Trade__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Trade__c Trade__r;

  public com.sforce.soap.enterprise.sobject.Trade__c getTrade__r() {
    return Trade__r;
  }

  

  public void setTrade__r(com.sforce.soap.enterprise.sobject.Trade__c Trade__r) {
    this.Trade__r = Trade__r;
    Trade__r__is_set = true;
  }
  
  /**
   * element  : Unfilled_Headcount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Unfilled_Headcount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Unfilled_Headcount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Unfilled_Headcount__c__is_set = false;

  private java.lang.Double Unfilled_Headcount__c;

  public java.lang.Double getUnfilled_Headcount__c() {
    return Unfilled_Headcount__c;
  }

  

  public void setUnfilled_Headcount__c(java.lang.Double Unfilled_Headcount__c) {
    this.Unfilled_Headcount__c = Unfilled_Headcount__c;
    Unfilled_Headcount__c__is_set = true;
  }
  
  /**
   * element  : Update__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Update__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Update__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Update__c__is_set = false;

  private java.lang.Boolean Update__c;

  public java.lang.Boolean getUpdate__c() {
    return Update__c;
  }

  

  public void setUpdate__c(java.lang.Boolean Update__c) {
    this.Update__c = Update__c;
    Update__c__is_set = true;
  }
  
  /**
   * element  : UserClaim1__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserClaim1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserClaim1__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UserClaim1__c__is_set = false;

  private java.lang.String UserClaim1__c;

  public java.lang.String getUserClaim1__c() {
    return UserClaim1__c;
  }

  

  public void setUserClaim1__c(java.lang.String UserClaim1__c) {
    this.UserClaim1__c = UserClaim1__c;
    UserClaim1__c__is_set = true;
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
   * element  : User_Claim2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo User_Claim2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User_Claim2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean User_Claim2__c__is_set = false;

  private java.lang.String User_Claim2__c;

  public java.lang.String getUser_Claim2__c() {
    return User_Claim2__c;
  }

  

  public void setUser_Claim2__c(java.lang.String User_Claim2__c) {
    this.User_Claim2__c = User_Claim2__c;
    User_Claim2__c__is_set = true;
  }
  
  /**
   * element  : User_Claim_3__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo User_Claim_3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User_Claim_3__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean User_Claim_3__c__is_set = false;

  private java.lang.String User_Claim_3__c;

  public java.lang.String getUser_Claim_3__c() {
    return User_Claim_3__c;
  }

  

  public void setUser_Claim_3__c(java.lang.String User_Claim_3__c) {
    this.User_Claim_3__c = User_Claim_3__c;
    User_Claim_3__c__is_set = true;
  }
  
  /**
   * element  : User_Claim_4__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo User_Claim_4__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User_Claim_4__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean User_Claim_4__c__is_set = false;

  private java.lang.String User_Claim_4__c;

  public java.lang.String getUser_Claim_4__c() {
    return User_Claim_4__c;
  }

  

  public void setUser_Claim_4__c(java.lang.String User_Claim_4__c) {
    this.User_Claim_4__c = User_Claim_4__c;
    User_Claim_4__c__is_set = true;
  }
  
  /**
   * element  : User_Claim_5__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo User_Claim_5__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User_Claim_5__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean User_Claim_5__c__is_set = false;

  private java.lang.String User_Claim_5__c;

  public java.lang.String getUser_Claim_5__c() {
    return User_Claim_5__c;
  }

  

  public void setUser_Claim_5__c(java.lang.String User_Claim_5__c) {
    this.User_Claim_5__c = User_Claim_5__c;
    User_Claim_5__c__is_set = true;
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
   * element  : Work_County__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Work_County__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_County__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Work_County__c__is_set = false;

  private java.lang.String Work_County__c;

  public java.lang.String getWork_County__c() {
    return Work_County__c;
  }

  

  public void setWork_County__c(java.lang.String Work_County__c) {
    this.Work_County__c = Work_County__c;
    Work_County__c__is_set = true;
  }
  
  /**
   * element  : Work_city__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Work_city__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Work_city__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Work_city__c__is_set = false;

  private java.lang.String Work_city__c;

  public java.lang.String getWork_city__c() {
    return Work_city__c;
  }

  

  public void setWork_city__c(java.lang.String Work_city__c) {
    this.Work_city__c = Work_city__c;
    Work_city__c__is_set = true;
  }
  
  /**
   * element  : Working_Recruiter_2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Working_Recruiter_2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Working_Recruiter_2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Working_Recruiter_2__c__is_set = false;

  private java.lang.String Working_Recruiter_2__c;

  public java.lang.String getWorking_Recruiter_2__c() {
    return Working_Recruiter_2__c;
  }

  

  public void setWorking_Recruiter_2__c(java.lang.String Working_Recruiter_2__c) {
    this.Working_Recruiter_2__c = Working_Recruiter_2__c;
    Working_Recruiter_2__c__is_set = true;
  }
  
  /**
   * element  : Working_Recruiter_3__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Working_Recruiter_3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Working_Recruiter_3__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Working_Recruiter_3__c__is_set = false;

  private java.lang.String Working_Recruiter_3__c;

  public java.lang.String getWorking_Recruiter_3__c() {
    return Working_Recruiter_3__c;
  }

  

  public void setWorking_Recruiter_3__c(java.lang.String Working_Recruiter_3__c) {
    this.Working_Recruiter_3__c = Working_Recruiter_3__c;
    Working_Recruiter_3__c__is_set = true;
  }
  
  /**
   * element  : actualDurationPeriod__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo actualDurationPeriod__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","actualDurationPeriod__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean actualDurationPeriod__c__is_set = false;

  private java.lang.String actualDurationPeriod__c;

  public java.lang.String getActualDurationPeriod__c() {
    return actualDurationPeriod__c;
  }

  

  public void setActualDurationPeriod__c(java.lang.String actualDurationPeriod__c) {
    this.actualDurationPeriod__c = actualDurationPeriod__c;
    actualDurationPeriod__c__is_set = true;
  }
  
  /**
   * element  : orderType__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo orderType__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","orderType__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean orderType__c__is_set = false;

  private java.lang.String orderType__c;

  public java.lang.String getOrderType__c() {
    return orderType__c;
  }

  

  public void setOrderType__c(java.lang.String orderType__c) {
    this.orderType__c = orderType__c;
    orderType__c__is_set = true;
  }
  
  /**
   * element  : workState__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo workState__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","workState__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean workState__c__is_set = false;

  private java.lang.String workState__c;

  public java.lang.String getWorkState__c() {
    return workState__c;
  }

  

  public void setWorkState__c(java.lang.String workState__c) {
    this.workState__c = workState__c;
    workState__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Order__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Account_Manager__c__typeInfo, Account_Manager__c, Account_Manager__c__is_set);
    __typeMapper.writeObject(__out, Account_Manager__r__typeInfo, Account_Manager__r, Account_Manager__r__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, Actual_Duration__c__typeInfo, Actual_Duration__c, Actual_Duration__c__is_set);
    __typeMapper.writeObject(__out, Actual_Project_End_Date__c__typeInfo, Actual_Project_End_Date__c, Actual_Project_End_Date__c__is_set);
    __typeMapper.writeObject(__out, Actual_Start_Date__c__typeInfo, Actual_Start_Date__c, Actual_Start_Date__c__is_set);
    __typeMapper.writeObject(__out, Adjustments__r__typeInfo, Adjustments__r, Adjustments__r__is_set);
    __typeMapper.writeObject(__out, Ads__r__typeInfo, Ads__r, Ads__r__is_set);
    __typeMapper.writeString(__out, All_Assignments_Closed__c__typeInfo, All_Assignments_Closed__c, All_Assignments_Closed__c__is_set);
    __typeMapper.writeString(__out, Assigned_Recruiter_1__c__typeInfo, Assigned_Recruiter_1__c, Assigned_Recruiter_1__c__is_set);
    __typeMapper.writeObject(__out, Assigned_Recruiter_1__r__typeInfo, Assigned_Recruiter_1__r, Assigned_Recruiter_1__r__is_set);
    __typeMapper.writeString(__out, Assigned_Recruiter_2__c__typeInfo, Assigned_Recruiter_2__c, Assigned_Recruiter_2__c__is_set);
    __typeMapper.writeObject(__out, Assigned_Recruiter_2__r__typeInfo, Assigned_Recruiter_2__r, Assigned_Recruiter_2__r__is_set);
    __typeMapper.writeString(__out, Assigned_Recruiter_3__c__typeInfo, Assigned_Recruiter_3__c, Assigned_Recruiter_3__c__is_set);
    __typeMapper.writeObject(__out, Assigned_Recruiter_3__r__typeInfo, Assigned_Recruiter_3__r, Assigned_Recruiter_3__r__is_set);
    __typeMapper.writeString(__out, Assigned_Recruiter_4__c__typeInfo, Assigned_Recruiter_4__c, Assigned_Recruiter_4__c__is_set);
    __typeMapper.writeObject(__out, Assigned_Recruiter_4__r__typeInfo, Assigned_Recruiter_4__r, Assigned_Recruiter_4__r__is_set);
    __typeMapper.writeString(__out, Assigned_Recruiter_5__c__typeInfo, Assigned_Recruiter_5__c, Assigned_Recruiter_5__c__is_set);
    __typeMapper.writeObject(__out, Assigned_Recruiter_5__r__typeInfo, Assigned_Recruiter_5__r, Assigned_Recruiter_5__r__is_set);
    __typeMapper.writeObject(__out, Assignments__r__typeInfo, Assignments__r, Assignments__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, Average_Days_to_Pay__c__typeInfo, Average_Days_to_Pay__c, Average_Days_to_Pay__c__is_set);
    __typeMapper.writeObject(__out, Background_Check_Required__c__typeInfo, Background_Check_Required__c, Background_Check_Required__c__is_set);
    __typeMapper.writeObject(__out, Background_Checks__r__typeInfo, Background_Checks__r, Background_Checks__r__is_set);
    __typeMapper.writeObject(__out, CSA_Date__c__typeInfo, CSA_Date__c, CSA_Date__c__is_set);
    __typeMapper.writeString(__out, CSA_Obtained_By_Dept__c__typeInfo, CSA_Obtained_By_Dept__c, CSA_Obtained_By_Dept__c__is_set);
    __typeMapper.writeString(__out, CSA_Obtained_By__c__typeInfo, CSA_Obtained_By__c, CSA_Obtained_By__c__is_set);
    __typeMapper.writeString(__out, CSA_on_File__c__typeInfo, CSA_on_File__c, CSA_on_File__c__is_set);
    __typeMapper.writeString(__out, CandidateSearchLink__c__typeInfo, CandidateSearchLink__c, CandidateSearchLink__c__is_set);
    __typeMapper.writeObject(__out, Candidate_Submit_Date__c__typeInfo, Candidate_Submit_Date__c, Candidate_Submit_Date__c__is_set);
    __typeMapper.writeObject(__out, Claim1__c__typeInfo, Claim1__c, Claim1__c__is_set);
    __typeMapper.writeObject(__out, Claim_2__c__typeInfo, Claim_2__c, Claim_2__c__is_set);
    __typeMapper.writeObject(__out, Claim_4__c__typeInfo, Claim_4__c, Claim_4__c__is_set);
    __typeMapper.writeObject(__out, Claim_5__c__typeInfo, Claim_5__c, Claim_5__c__is_set);
    __typeMapper.writeObject(__out, Claim_Slot_3__c__typeInfo, Claim_Slot_3__c, Claim_Slot_3__c__is_set);
    __typeMapper.writeString(__out, Client_Name__c__typeInfo, Client_Name__c, Client_Name__c__is_set);
    __typeMapper.writeObject(__out, Client_Name__r__typeInfo, Client_Name__r, Client_Name__r__is_set);
    __typeMapper.writeString(__out, Client_is_Collections_Issue__c__typeInfo, Client_is_Collections_Issue__c, Client_is_Collections_Issue__c__is_set);
    __typeMapper.writeObject(__out, Closed_Assignments__c__typeInfo, Closed_Assignments__c, Closed_Assignments__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, Contact__c__typeInfo, Contact__c, Contact__c__is_set);
    __typeMapper.writeObject(__out, Contact__r__typeInfo, Contact__r, Contact__r__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeString(__out, Create_Assignment_Link__c__typeInfo, Create_Assignment_Link__c, Create_Assignment_Link__c__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Creator_Dept__c__typeInfo, Creator_Dept__c, Creator_Dept__c__is_set);
    __typeMapper.writeObject(__out, Credit_Limit__c__typeInfo, Credit_Limit__c, Credit_Limit__c__is_set);
    __typeMapper.writeString(__out, Credit_Rating__c__typeInfo, Credit_Rating__c, Credit_Rating__c__is_set);
    __typeMapper.writeString(__out, Description__c__typeInfo, Description__c, Description__c__is_set);
    __typeMapper.writeString(__out, Division__c__typeInfo, Division__c, Division__c__is_set);
    __typeMapper.writeObject(__out, Division__r__typeInfo, Division__r, Division__r__is_set);
    __typeMapper.writeObject(__out, Drug_Test_Required__c__typeInfo, Drug_Test_Required__c, Drug_Test_Required__c__is_set);
    __typeMapper.writeObject(__out, Drug_Tests__r__typeInfo, Drug_Tests__r, Drug_Tests__r__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Email_Posting_Template_Number__c__typeInfo, Email_Posting_Template_Number__c, Email_Posting_Template_Number__c__is_set);
    __typeMapper.writeObject(__out, Email_Posting_Template_State_Value__c__typeInfo, Email_Posting_Template_State_Value__c, Email_Posting_Template_State_Value__c__is_set);
    __typeMapper.writeObject(__out, Email_Posting_Template_Trade_Value__c__typeInfo, Email_Posting_Template_Trade_Value__c, Email_Posting_Template_Trade_Value__c__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, Employees_Assigned__c__typeInfo, Employees_Assigned__c, Employees_Assigned__c__is_set);
    __typeMapper.writeObject(__out, Estimated_Duration__c__typeInfo, Estimated_Duration__c, Estimated_Duration__c__is_set);
    __typeMapper.writeObject(__out, Estimated_Project_End_Date__c__typeInfo, Estimated_Project_End_Date__c, Estimated_Project_End_Date__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, Field_Expenses__r__typeInfo, Field_Expenses__r, Field_Expenses__r__is_set);
    __typeMapper.writeString(__out, Fifth_Recruiter__c__typeInfo, Fifth_Recruiter__c, Fifth_Recruiter__c__is_set);
    __typeMapper.writeObject(__out, First_Assignment_Start__c__typeInfo, First_Assignment_Start__c, First_Assignment_Start__c__is_set);
    __typeMapper.writeString(__out, Fourth_Recruiter__c__typeInfo, Fourth_Recruiter__c, Fourth_Recruiter__c__is_set);
    __typeMapper.writeString(__out, General_Contractor_Name__c__typeInfo, General_Contractor_Name__c, General_Contractor_Name__c__is_set);
    __typeMapper.writeString(__out, Geo_Code_Status__c__typeInfo, Geo_Code_Status__c, Geo_Code_Status__c__is_set);
    __typeMapper.writeString(__out, Global_Share__c__typeInfo, Global_Share__c, Global_Share__c__is_set);
    __typeMapper.writeObject(__out, HR_Requests__r__typeInfo, HR_Requests__r, HR_Requests__r__is_set);
    __typeMapper.writeObject(__out, Has_WC_Coverage__c__typeInfo, Has_WC_Coverage__c, Has_WC_Coverage__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, If_Background_Ck_required_is_it_BILLED__c__typeInfo, If_Background_Ck_required_is_it_BILLED__c, If_Background_Ck_required_is_it_BILLED__c__is_set);
    __typeMapper.writeString(__out, If_Drug_Test_required_is_it_BILLED__c__typeInfo, If_Drug_Test_required_is_it_BILLED__c, If_Drug_Test_required_is_it_BILLED__c__is_set);
    __typeMapper.writeObject(__out, Invoices__r__typeInfo, Invoices__r, Invoices__r__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, Lat__c__typeInfo, Lat__c, Lat__c__is_set);
    __typeMapper.writeString(__out, Location_of_Project__c__typeInfo, Location_of_Project__c, Location_of_Project__c__is_set);
    __typeMapper.writeObject(__out, Lon__c__typeInfo, Lon__c, Lon__c__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeObject(__out, Max_Assignment_End_Date__c__typeInfo, Max_Assignment_End_Date__c, Max_Assignment_End_Date__c__is_set);
    __typeMapper.writeObject(__out, Mileage__r__typeInfo, Mileage__r, Mileage__r__is_set);
    __typeMapper.writeObject(__out, Most_Recent_Assignment_End__c__typeInfo, Most_Recent_Assignment_End__c, Most_Recent_Assignment_End__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, Number_of_Assignments__c__typeInfo, Number_of_Assignments__c, Number_of_Assignments__c__is_set);
    __typeMapper.writeObject(__out, OCIP__c__typeInfo, OCIP__c, OCIP__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Open_Assignments__c__typeInfo, Open_Assignments__c, Open_Assignments__c__is_set);
    __typeMapper.writeString(__out, Opportunity_Id__c__typeInfo, Opportunity_Id__c, Opportunity_Id__c__is_set);
    __typeMapper.writeString(__out, Ops_Team_Assigned__c__typeInfo, Ops_Team_Assigned__c, Ops_Team_Assigned__c__is_set);
    __typeMapper.writeObject(__out, OrderCount__c__typeInfo, OrderCount__c, OrderCount__c__is_set);
    __typeMapper.writeObject(__out, Order_Certifications__r__typeInfo, Order_Certifications__r, Order_Certifications__r__is_set);
    __typeMapper.writeString(__out, Order_Description__c__typeInfo, Order_Description__c, Order_Description__c__is_set);
    __typeMapper.writeString(__out, Order_Note__c__typeInfo, Order_Note__c, Order_Note__c__is_set);
    __typeMapper.writeString(__out, Order_Number__c__typeInfo, Order_Number__c, Order_Number__c__is_set);
    __typeMapper.writeObject(__out, Order_Rates__r__typeInfo, Order_Rates__r, Order_Rates__r__is_set);
    __typeMapper.writeObject(__out, Order_Skills__r__typeInfo, Order_Skills__r, Order_Skills__r__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, PO_Number__c__typeInfo, PO_Number__c, PO_Number__c__is_set);
    __typeMapper.writeObject(__out, PO_Override__c__typeInfo, PO_Override__c, PO_Override__c__is_set);
    __typeMapper.writeString(__out, PO_Required__c__typeInfo, PO_Required__c, PO_Required__c__is_set);
    __typeMapper.writeObject(__out, Payroll_Advances__r__typeInfo, Payroll_Advances__r, Payroll_Advances__r__is_set);
    __typeMapper.writeObject(__out, Potential_Candidate_Lists__r__typeInfo, Potential_Candidate_Lists__r, Potential_Candidate_Lists__r__is_set);
    __typeMapper.writeString(__out, Prevailing_Wage_Project__c__typeInfo, Prevailing_Wage_Project__c, Prevailing_Wage_Project__c__is_set);
    __typeMapper.writeObject(__out, Priority__c__typeInfo, Priority__c, Priority__c__is_set);
    __typeMapper.writeObject(__out, Probability__c__typeInfo, Probability__c, Probability__c__is_set);
    __typeMapper.writeObject(__out, Probability_del__c__typeInfo, Probability_del__c, Probability_del__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeString(__out, Project_Contact__c__typeInfo, Project_Contact__c, Project_Contact__c__is_set);
    __typeMapper.writeString(__out, Project_Owner_Name__c__typeInfo, Project_Owner_Name__c, Project_Owner_Name__c__is_set);
    __typeMapper.writeString(__out, Project_Site_Contact__c__typeInfo, Project_Site_Contact__c, Project_Site_Contact__c__is_set);
    __typeMapper.writeObject(__out, Project_Start_Date__c__typeInfo, Project_Start_Date__c, Project_Start_Date__c__is_set);
    __typeMapper.writeObject(__out, Proxy__r__typeInfo, Proxy__r, Proxy__r__is_set);
    __typeMapper.writeObject(__out, Publically_Funded_Project__c__typeInfo, Publically_Funded_Project__c, Publically_Funded_Project__c__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeString(__out, Recruiter_1_First_Name__c__typeInfo, Recruiter_1_First_Name__c, Recruiter_1_First_Name__c__is_set);
    __typeMapper.writeString(__out, Recruiter_1_Phone__c__typeInfo, Recruiter_1_Phone__c, Recruiter_1_Phone__c__is_set);
    __typeMapper.writeString(__out, Recruiter_In_Charge__c__typeInfo, Recruiter_In_Charge__c, Recruiter_In_Charge__c__is_set);
    __typeMapper.writeString(__out, Recruiter_Phone__c__typeInfo, Recruiter_Phone__c, Recruiter_Phone__c__is_set);
    __typeMapper.writeString(__out, Region__c__typeInfo, Region__c, Region__c__is_set);
    __typeMapper.writeObject(__out, Region__r__typeInfo, Region__r, Region__r__is_set);
    __typeMapper.writeObject(__out, Requested_Headcount__c__typeInfo, Requested_Headcount__c, Requested_Headcount__c__is_set);
    __typeMapper.writeString(__out, Requested_Start_Time__c__typeInfo, Requested_Start_Time__c, Requested_Start_Time__c__is_set);
    __typeMapper.writeString(__out, Safety_Contact__c__typeInfo, Safety_Contact__c, Safety_Contact__c__is_set);
    __typeMapper.writeObject(__out, Safety_Contact__r__typeInfo, Safety_Contact__r, Safety_Contact__r__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeString(__out, Special_Billing_Instructions__c__typeInfo, Special_Billing_Instructions__c, Special_Billing_Instructions__c__is_set);
    __typeMapper.writeString(__out, Special_Requirements__c__typeInfo, Special_Requirements__c, Special_Requirements__c__is_set);
    __typeMapper.writeString(__out, State_Code__c__typeInfo, State_Code__c, State_Code__c__is_set);
    __typeMapper.writeString(__out, Status__c__typeInfo, Status__c, Status__c__is_set);
    __typeMapper.writeObject(__out, Submit_Date_Week_Ending__c__typeInfo, Submit_Date_Week_Ending__c, Submit_Date_Week_Ending__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, Target_Bill_Rate__c__typeInfo, Target_Bill_Rate__c, Target_Bill_Rate__c__is_set);
    __typeMapper.writeObject(__out, Target_Mark_Up__c__typeInfo, Target_Mark_Up__c, Target_Mark_Up__c__is_set);
    __typeMapper.writeObject(__out, Target_Pay_Rate__c__typeInfo, Target_Pay_Rate__c, Target_Pay_Rate__c__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeString(__out, Tax_Exempt__c__typeInfo, Tax_Exempt__c, Tax_Exempt__c__is_set);
    __typeMapper.writeString(__out, Tax_Schedule__c__typeInfo, Tax_Schedule__c, Tax_Schedule__c__is_set);
    __typeMapper.writeObject(__out, Tax_Schedule__r__typeInfo, Tax_Schedule__r, Tax_Schedule__r__is_set);
    __typeMapper.writeString(__out, Test__c__typeInfo, Test__c, Test__c__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, Total_Client_Active_Assignments__c__typeInfo, Total_Client_Active_Assignments__c, Total_Client_Active_Assignments__c__is_set);
    __typeMapper.writeObject(__out, Total_Req_Headcount_Credit_Load__c__typeInfo, Total_Req_Headcount_Credit_Load__c, Total_Req_Headcount_Credit_Load__c__is_set);
    __typeMapper.writeString(__out, TradeID__c__typeInfo, TradeID__c, TradeID__c__is_set);
    __typeMapper.writeString(__out, TradeMerge__c__typeInfo, TradeMerge__c, TradeMerge__c__is_set);
    __typeMapper.writeString(__out, Trade__c__typeInfo, Trade__c, Trade__c__is_set);
    __typeMapper.writeObject(__out, Trade__r__typeInfo, Trade__r, Trade__r__is_set);
    __typeMapper.writeObject(__out, Unfilled_Headcount__c__typeInfo, Unfilled_Headcount__c, Unfilled_Headcount__c__is_set);
    __typeMapper.writeObject(__out, Update__c__typeInfo, Update__c, Update__c__is_set);
    __typeMapper.writeString(__out, UserClaim1__c__typeInfo, UserClaim1__c, UserClaim1__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeString(__out, User_Claim2__c__typeInfo, User_Claim2__c, User_Claim2__c__is_set);
    __typeMapper.writeString(__out, User_Claim_3__c__typeInfo, User_Claim_3__c, User_Claim_3__c__is_set);
    __typeMapper.writeString(__out, User_Claim_4__c__typeInfo, User_Claim_4__c, User_Claim_4__c__is_set);
    __typeMapper.writeString(__out, User_Claim_5__c__typeInfo, User_Claim_5__c, User_Claim_5__c__is_set);
    __typeMapper.writeString(__out, WC_Code__c__typeInfo, WC_Code__c, WC_Code__c__is_set);
    __typeMapper.writeObject(__out, Week_Ending__c__typeInfo, Week_Ending__c, Week_Ending__c__is_set);
    __typeMapper.writeString(__out, Work_County__c__typeInfo, Work_County__c, Work_County__c__is_set);
    __typeMapper.writeString(__out, Work_city__c__typeInfo, Work_city__c, Work_city__c__is_set);
    __typeMapper.writeString(__out, Working_Recruiter_2__c__typeInfo, Working_Recruiter_2__c, Working_Recruiter_2__c__is_set);
    __typeMapper.writeString(__out, Working_Recruiter_3__c__typeInfo, Working_Recruiter_3__c, Working_Recruiter_3__c__is_set);
    __typeMapper.writeString(__out, actualDurationPeriod__c__typeInfo, actualDurationPeriod__c, actualDurationPeriod__c__is_set);
    __typeMapper.writeString(__out, orderType__c__typeInfo, orderType__c, orderType__c__is_set);
    __typeMapper.writeString(__out, workState__c__typeInfo, workState__c, workState__c__is_set);
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
    if (__typeMapper.isElement(__in, Account_Manager__c__typeInfo)) {
      setAccount_Manager__c((java.lang.String)__typeMapper.readString(__in, Account_Manager__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Account_Manager__r__typeInfo)) {
      setAccount_Manager__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Account_Manager__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Duration__c__typeInfo)) {
      setActual_Duration__c((java.lang.Double)__typeMapper.readObject(__in, Actual_Duration__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Actual_Project_End_Date__c__typeInfo)) {
      setActual_Project_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Actual_Project_End_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Ads__r__typeInfo)) {
      setAds__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Ads__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, All_Assignments_Closed__c__typeInfo)) {
      setAll_Assignments_Closed__c((java.lang.String)__typeMapper.readString(__in, All_Assignments_Closed__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_1__c__typeInfo)) {
      setAssigned_Recruiter_1__c((java.lang.String)__typeMapper.readString(__in, Assigned_Recruiter_1__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_1__r__typeInfo)) {
      setAssigned_Recruiter_1__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Assigned_Recruiter_1__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_2__c__typeInfo)) {
      setAssigned_Recruiter_2__c((java.lang.String)__typeMapper.readString(__in, Assigned_Recruiter_2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_2__r__typeInfo)) {
      setAssigned_Recruiter_2__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Assigned_Recruiter_2__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_3__c__typeInfo)) {
      setAssigned_Recruiter_3__c((java.lang.String)__typeMapper.readString(__in, Assigned_Recruiter_3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_3__r__typeInfo)) {
      setAssigned_Recruiter_3__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Assigned_Recruiter_3__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_4__c__typeInfo)) {
      setAssigned_Recruiter_4__c((java.lang.String)__typeMapper.readString(__in, Assigned_Recruiter_4__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_4__r__typeInfo)) {
      setAssigned_Recruiter_4__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Assigned_Recruiter_4__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_5__c__typeInfo)) {
      setAssigned_Recruiter_5__c((java.lang.String)__typeMapper.readString(__in, Assigned_Recruiter_5__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assigned_Recruiter_5__r__typeInfo)) {
      setAssigned_Recruiter_5__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Assigned_Recruiter_5__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignments__r__typeInfo)) {
      setAssignments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assignments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Average_Days_to_Pay__c__typeInfo)) {
      setAverage_Days_to_Pay__c((java.lang.Double)__typeMapper.readObject(__in, Average_Days_to_Pay__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Background_Check_Required__c__typeInfo)) {
      setBackground_Check_Required__c((java.lang.Boolean)__typeMapper.readObject(__in, Background_Check_Required__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Background_Checks__r__typeInfo)) {
      setBackground_Checks__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Background_Checks__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSA_Date__c__typeInfo)) {
      setCSA_Date__c((java.util.Calendar)__typeMapper.readObject(__in, CSA_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSA_Obtained_By_Dept__c__typeInfo)) {
      setCSA_Obtained_By_Dept__c((java.lang.String)__typeMapper.readString(__in, CSA_Obtained_By_Dept__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSA_Obtained_By__c__typeInfo)) {
      setCSA_Obtained_By__c((java.lang.String)__typeMapper.readString(__in, CSA_Obtained_By__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSA_on_File__c__typeInfo)) {
      setCSA_on_File__c((java.lang.String)__typeMapper.readString(__in, CSA_on_File__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CandidateSearchLink__c__typeInfo)) {
      setCandidateSearchLink__c((java.lang.String)__typeMapper.readString(__in, CandidateSearchLink__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Submit_Date__c__typeInfo)) {
      setCandidate_Submit_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Candidate_Submit_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Claim1__c__typeInfo)) {
      setClaim1__c((java.lang.Boolean)__typeMapper.readObject(__in, Claim1__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Claim_2__c__typeInfo)) {
      setClaim_2__c((java.lang.Boolean)__typeMapper.readObject(__in, Claim_2__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Claim_4__c__typeInfo)) {
      setClaim_4__c((java.lang.Boolean)__typeMapper.readObject(__in, Claim_4__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Claim_5__c__typeInfo)) {
      setClaim_5__c((java.lang.Boolean)__typeMapper.readObject(__in, Claim_5__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Claim_Slot_3__c__typeInfo)) {
      setClaim_Slot_3__c((java.lang.Boolean)__typeMapper.readObject(__in, Claim_Slot_3__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client_Name__c__typeInfo)) {
      setClient_Name__c((java.lang.String)__typeMapper.readString(__in, Client_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client_Name__r__typeInfo)) {
      setClient_Name__r((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Client_Name__r__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client_is_Collections_Issue__c__typeInfo)) {
      setClient_is_Collections_Issue__c((java.lang.String)__typeMapper.readString(__in, Client_is_Collections_Issue__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Closed_Assignments__c__typeInfo)) {
      setClosed_Assignments__c((java.lang.Double)__typeMapper.readObject(__in, Closed_Assignments__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Create_Assignment_Link__c__typeInfo)) {
      setCreate_Assignment_Link__c((java.lang.String)__typeMapper.readString(__in, Create_Assignment_Link__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Creator_Dept__c__typeInfo)) {
      setCreator_Dept__c((java.lang.String)__typeMapper.readString(__in, Creator_Dept__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Credit_Limit__c__typeInfo)) {
      setCredit_Limit__c((java.lang.Double)__typeMapper.readObject(__in, Credit_Limit__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Credit_Rating__c__typeInfo)) {
      setCredit_Rating__c((java.lang.String)__typeMapper.readString(__in, Credit_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__c__typeInfo)) {
      setDescription__c((java.lang.String)__typeMapper.readString(__in, Description__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Division__c__typeInfo)) {
      setDivision__c((java.lang.String)__typeMapper.readString(__in, Division__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Division__r__typeInfo)) {
      setDivision__r((com.sforce.soap.enterprise.sobject.Division__c)__typeMapper.readObject(__in, Division__r__typeInfo, com.sforce.soap.enterprise.sobject.Division__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Drug_Test_Required__c__typeInfo)) {
      setDrug_Test_Required__c((java.lang.Boolean)__typeMapper.readObject(__in, Drug_Test_Required__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Drug_Tests__r__typeInfo)) {
      setDrug_Tests__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Drug_Tests__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DuplicateRecordItems__typeInfo)) {
      setDuplicateRecordItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DuplicateRecordItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email_Posting_Template_Number__c__typeInfo)) {
      setEmail_Posting_Template_Number__c((java.lang.Double)__typeMapper.readObject(__in, Email_Posting_Template_Number__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email_Posting_Template_State_Value__c__typeInfo)) {
      setEmail_Posting_Template_State_Value__c((java.lang.Double)__typeMapper.readObject(__in, Email_Posting_Template_State_Value__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email_Posting_Template_Trade_Value__c__typeInfo)) {
      setEmail_Posting_Template_Trade_Value__c((java.lang.Double)__typeMapper.readObject(__in, Email_Posting_Template_Trade_Value__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employees_Assigned__c__typeInfo)) {
      setEmployees_Assigned__c((java.lang.Double)__typeMapper.readObject(__in, Employees_Assigned__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Estimated_Duration__c__typeInfo)) {
      setEstimated_Duration__c((java.lang.Double)__typeMapper.readObject(__in, Estimated_Duration__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Estimated_Project_End_Date__c__typeInfo)) {
      setEstimated_Project_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Estimated_Project_End_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Field_Expenses__r__typeInfo)) {
      setField_Expenses__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Field_Expenses__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fifth_Recruiter__c__typeInfo)) {
      setFifth_Recruiter__c((java.lang.String)__typeMapper.readString(__in, Fifth_Recruiter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, First_Assignment_Start__c__typeInfo)) {
      setFirst_Assignment_Start__c((java.util.Calendar)__typeMapper.readObject(__in, First_Assignment_Start__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fourth_Recruiter__c__typeInfo)) {
      setFourth_Recruiter__c((java.lang.String)__typeMapper.readString(__in, Fourth_Recruiter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, General_Contractor_Name__c__typeInfo)) {
      setGeneral_Contractor_Name__c((java.lang.String)__typeMapper.readString(__in, General_Contractor_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Geo_Code_Status__c__typeInfo)) {
      setGeo_Code_Status__c((java.lang.String)__typeMapper.readString(__in, Geo_Code_Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Global_Share__c__typeInfo)) {
      setGlobal_Share__c((java.lang.String)__typeMapper.readString(__in, Global_Share__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HR_Requests__r__typeInfo)) {
      setHR_Requests__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, HR_Requests__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Has_WC_Coverage__c__typeInfo)) {
      setHas_WC_Coverage__c((java.lang.Boolean)__typeMapper.readObject(__in, Has_WC_Coverage__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, If_Background_Ck_required_is_it_BILLED__c__typeInfo)) {
      setIf_Background_Ck_required_is_it_BILLED__c((java.lang.String)__typeMapper.readString(__in, If_Background_Ck_required_is_it_BILLED__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, If_Drug_Test_required_is_it_BILLED__c__typeInfo)) {
      setIf_Drug_Test_required_is_it_BILLED__c((java.lang.String)__typeMapper.readString(__in, If_Drug_Test_required_is_it_BILLED__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoices__r__typeInfo)) {
      setInvoices__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Invoices__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Lat__c__typeInfo)) {
      setLat__c((java.lang.Double)__typeMapper.readObject(__in, Lat__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Location_of_Project__c__typeInfo)) {
      setLocation_of_Project__c((java.lang.String)__typeMapper.readString(__in, Location_of_Project__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Lon__c__typeInfo)) {
      setLon__c((java.lang.Double)__typeMapper.readObject(__in, Lon__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Max_Assignment_End_Date__c__typeInfo)) {
      setMax_Assignment_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Max_Assignment_End_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Mileage__r__typeInfo)) {
      setMileage__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Mileage__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Most_Recent_Assignment_End__c__typeInfo)) {
      setMost_Recent_Assignment_End__c((java.util.Calendar)__typeMapper.readObject(__in, Most_Recent_Assignment_End__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Number_of_Assignments__c__typeInfo)) {
      setNumber_of_Assignments__c((java.lang.Double)__typeMapper.readObject(__in, Number_of_Assignments__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OCIP__c__typeInfo)) {
      setOCIP__c((java.lang.Boolean)__typeMapper.readObject(__in, OCIP__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Open_Assignments__c__typeInfo)) {
      setOpen_Assignments__c((java.lang.Double)__typeMapper.readObject(__in, Open_Assignments__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Opportunity_Id__c__typeInfo)) {
      setOpportunity_Id__c((java.lang.String)__typeMapper.readString(__in, Opportunity_Id__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Ops_Team_Assigned__c__typeInfo)) {
      setOps_Team_Assigned__c((java.lang.String)__typeMapper.readString(__in, Ops_Team_Assigned__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OrderCount__c__typeInfo)) {
      setOrderCount__c((java.lang.Double)__typeMapper.readObject(__in, OrderCount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Certifications__r__typeInfo)) {
      setOrder_Certifications__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Order_Certifications__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Description__c__typeInfo)) {
      setOrder_Description__c((java.lang.String)__typeMapper.readString(__in, Order_Description__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Note__c__typeInfo)) {
      setOrder_Note__c((java.lang.String)__typeMapper.readString(__in, Order_Note__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Number__c__typeInfo)) {
      setOrder_Number__c((java.lang.String)__typeMapper.readString(__in, Order_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Rates__r__typeInfo)) {
      setOrder_Rates__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Order_Rates__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Order_Skills__r__typeInfo)) {
      setOrder_Skills__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Order_Skills__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, PO_Number__c__typeInfo)) {
      setPO_Number__c((java.lang.String)__typeMapper.readString(__in, PO_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PO_Override__c__typeInfo)) {
      setPO_Override__c((java.lang.Boolean)__typeMapper.readObject(__in, PO_Override__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PO_Required__c__typeInfo)) {
      setPO_Required__c((java.lang.String)__typeMapper.readString(__in, PO_Required__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payroll_Advances__r__typeInfo)) {
      setPayroll_Advances__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Payroll_Advances__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Potential_Candidate_Lists__r__typeInfo)) {
      setPotential_Candidate_Lists__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Potential_Candidate_Lists__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Prevailing_Wage_Project__c__typeInfo)) {
      setPrevailing_Wage_Project__c((java.lang.String)__typeMapper.readString(__in, Prevailing_Wage_Project__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Priority__c__typeInfo)) {
      setPriority__c((java.lang.Double)__typeMapper.readObject(__in, Priority__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Probability__c__typeInfo)) {
      setProbability__c((java.lang.Double)__typeMapper.readObject(__in, Probability__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Probability_del__c__typeInfo)) {
      setProbability_del__c((java.lang.Double)__typeMapper.readObject(__in, Probability_del__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Project_Contact__c__typeInfo)) {
      setProject_Contact__c((java.lang.String)__typeMapper.readString(__in, Project_Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_Owner_Name__c__typeInfo)) {
      setProject_Owner_Name__c((java.lang.String)__typeMapper.readString(__in, Project_Owner_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_Site_Contact__c__typeInfo)) {
      setProject_Site_Contact__c((java.lang.String)__typeMapper.readString(__in, Project_Site_Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Project_Start_Date__c__typeInfo)) {
      setProject_Start_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Project_Start_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Proxy__r__typeInfo)) {
      setProxy__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Proxy__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Publically_Funded_Project__c__typeInfo)) {
      setPublically_Funded_Project__c((java.lang.Boolean)__typeMapper.readObject(__in, Publically_Funded_Project__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Recruiter_1_First_Name__c__typeInfo)) {
      setRecruiter_1_First_Name__c((java.lang.String)__typeMapper.readString(__in, Recruiter_1_First_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter_1_Phone__c__typeInfo)) {
      setRecruiter_1_Phone__c((java.lang.String)__typeMapper.readString(__in, Recruiter_1_Phone__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter_In_Charge__c__typeInfo)) {
      setRecruiter_In_Charge__c((java.lang.String)__typeMapper.readString(__in, Recruiter_In_Charge__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Recruiter_Phone__c__typeInfo)) {
      setRecruiter_Phone__c((java.lang.String)__typeMapper.readString(__in, Recruiter_Phone__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Region__c__typeInfo)) {
      setRegion__c((java.lang.String)__typeMapper.readString(__in, Region__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Region__r__typeInfo)) {
      setRegion__r((com.sforce.soap.enterprise.sobject.Region__c)__typeMapper.readObject(__in, Region__r__typeInfo, com.sforce.soap.enterprise.sobject.Region__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Requested_Headcount__c__typeInfo)) {
      setRequested_Headcount__c((java.lang.Double)__typeMapper.readObject(__in, Requested_Headcount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Requested_Start_Time__c__typeInfo)) {
      setRequested_Start_Time__c((java.lang.String)__typeMapper.readString(__in, Requested_Start_Time__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Safety_Contact__c__typeInfo)) {
      setSafety_Contact__c((java.lang.String)__typeMapper.readString(__in, Safety_Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Safety_Contact__r__typeInfo)) {
      setSafety_Contact__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, Safety_Contact__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Billing_Instructions__c__typeInfo)) {
      setSpecial_Billing_Instructions__c((java.lang.String)__typeMapper.readString(__in, Special_Billing_Instructions__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Special_Requirements__c__typeInfo)) {
      setSpecial_Requirements__c((java.lang.String)__typeMapper.readString(__in, Special_Requirements__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State_Code__c__typeInfo)) {
      setState_Code__c((java.lang.String)__typeMapper.readString(__in, State_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__c__typeInfo)) {
      setStatus__c((java.lang.String)__typeMapper.readString(__in, Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Submit_Date_Week_Ending__c__typeInfo)) {
      setSubmit_Date_Week_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, Submit_Date_Week_Ending__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Target_Bill_Rate__c__typeInfo)) {
      setTarget_Bill_Rate__c((java.lang.Double)__typeMapper.readObject(__in, Target_Bill_Rate__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Target_Mark_Up__c__typeInfo)) {
      setTarget_Mark_Up__c((java.lang.Double)__typeMapper.readObject(__in, Target_Mark_Up__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Target_Pay_Rate__c__typeInfo)) {
      setTarget_Pay_Rate__c((java.lang.Double)__typeMapper.readObject(__in, Target_Pay_Rate__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Tax_Exempt__c__typeInfo)) {
      setTax_Exempt__c((java.lang.String)__typeMapper.readString(__in, Tax_Exempt__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tax_Schedule__c__typeInfo)) {
      setTax_Schedule__c((java.lang.String)__typeMapper.readString(__in, Tax_Schedule__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tax_Schedule__r__typeInfo)) {
      setTax_Schedule__r((com.sforce.soap.enterprise.sobject.Tax_Schedule__c)__typeMapper.readObject(__in, Tax_Schedule__r__typeInfo, com.sforce.soap.enterprise.sobject.Tax_Schedule__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Test__c__typeInfo)) {
      setTest__c((java.lang.String)__typeMapper.readString(__in, Test__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Client_Active_Assignments__c__typeInfo)) {
      setTotal_Client_Active_Assignments__c((java.lang.Double)__typeMapper.readObject(__in, Total_Client_Active_Assignments__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Req_Headcount_Credit_Load__c__typeInfo)) {
      setTotal_Req_Headcount_Credit_Load__c((java.lang.Double)__typeMapper.readObject(__in, Total_Req_Headcount_Credit_Load__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TradeID__c__typeInfo)) {
      setTradeID__c((java.lang.String)__typeMapper.readString(__in, TradeID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TradeMerge__c__typeInfo)) {
      setTradeMerge__c((java.lang.String)__typeMapper.readString(__in, TradeMerge__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Trade__c__typeInfo)) {
      setTrade__c((java.lang.String)__typeMapper.readString(__in, Trade__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Trade__r__typeInfo)) {
      setTrade__r((com.sforce.soap.enterprise.sobject.Trade__c)__typeMapper.readObject(__in, Trade__r__typeInfo, com.sforce.soap.enterprise.sobject.Trade__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Unfilled_Headcount__c__typeInfo)) {
      setUnfilled_Headcount__c((java.lang.Double)__typeMapper.readObject(__in, Unfilled_Headcount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Update__c__typeInfo)) {
      setUpdate__c((java.lang.Boolean)__typeMapper.readObject(__in, Update__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserClaim1__c__typeInfo)) {
      setUserClaim1__c((java.lang.String)__typeMapper.readString(__in, UserClaim1__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User_Claim2__c__typeInfo)) {
      setUser_Claim2__c((java.lang.String)__typeMapper.readString(__in, User_Claim2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User_Claim_3__c__typeInfo)) {
      setUser_Claim_3__c((java.lang.String)__typeMapper.readString(__in, User_Claim_3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User_Claim_4__c__typeInfo)) {
      setUser_Claim_4__c((java.lang.String)__typeMapper.readString(__in, User_Claim_4__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User_Claim_5__c__typeInfo)) {
      setUser_Claim_5__c((java.lang.String)__typeMapper.readString(__in, User_Claim_5__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WC_Code__c__typeInfo)) {
      setWC_Code__c((java.lang.String)__typeMapper.readString(__in, WC_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Week_Ending__c__typeInfo)) {
      setWeek_Ending__c((java.util.Calendar)__typeMapper.readObject(__in, Week_Ending__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_County__c__typeInfo)) {
      setWork_County__c((java.lang.String)__typeMapper.readString(__in, Work_County__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Work_city__c__typeInfo)) {
      setWork_city__c((java.lang.String)__typeMapper.readString(__in, Work_city__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Working_Recruiter_2__c__typeInfo)) {
      setWorking_Recruiter_2__c((java.lang.String)__typeMapper.readString(__in, Working_Recruiter_2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Working_Recruiter_3__c__typeInfo)) {
      setWorking_Recruiter_3__c((java.lang.String)__typeMapper.readString(__in, Working_Recruiter_3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, actualDurationPeriod__c__typeInfo)) {
      setActualDurationPeriod__c((java.lang.String)__typeMapper.readString(__in, actualDurationPeriod__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, orderType__c__typeInfo)) {
      setOrderType__c((java.lang.String)__typeMapper.readString(__in, orderType__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, workState__c__typeInfo)) {
      setWorkState__c((java.lang.String)__typeMapper.readString(__in, workState__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Order__c ");
    sb.append(super.toString());
    sb.append(" Account_Manager__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account_Manager__c)+"'\n");
    sb.append(" Account_Manager__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account_Manager__r)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Actual_Duration__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Duration__c)+"'\n");
    sb.append(" Actual_Project_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Project_End_Date__c)+"'\n");
    sb.append(" Actual_Start_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Start_Date__c)+"'\n");
    sb.append(" Adjustments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Adjustments__r)+"'\n");
    sb.append(" Ads__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Ads__r)+"'\n");
    sb.append(" All_Assignments_Closed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(All_Assignments_Closed__c)+"'\n");
    sb.append(" Assigned_Recruiter_1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_1__c)+"'\n");
    sb.append(" Assigned_Recruiter_1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_1__r)+"'\n");
    sb.append(" Assigned_Recruiter_2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_2__c)+"'\n");
    sb.append(" Assigned_Recruiter_2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_2__r)+"'\n");
    sb.append(" Assigned_Recruiter_3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_3__c)+"'\n");
    sb.append(" Assigned_Recruiter_3__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_3__r)+"'\n");
    sb.append(" Assigned_Recruiter_4__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_4__c)+"'\n");
    sb.append(" Assigned_Recruiter_4__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_4__r)+"'\n");
    sb.append(" Assigned_Recruiter_5__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_5__c)+"'\n");
    sb.append(" Assigned_Recruiter_5__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assigned_Recruiter_5__r)+"'\n");
    sb.append(" Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignments__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Average_Days_to_Pay__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Average_Days_to_Pay__c)+"'\n");
    sb.append(" Background_Check_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Background_Check_Required__c)+"'\n");
    sb.append(" Background_Checks__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Background_Checks__r)+"'\n");
    sb.append(" CSA_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_Date__c)+"'\n");
    sb.append(" CSA_Obtained_By_Dept__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_Obtained_By_Dept__c)+"'\n");
    sb.append(" CSA_Obtained_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_Obtained_By__c)+"'\n");
    sb.append(" CSA_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_on_File__c)+"'\n");
    sb.append(" CandidateSearchLink__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CandidateSearchLink__c)+"'\n");
    sb.append(" Candidate_Submit_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Submit_Date__c)+"'\n");
    sb.append(" Claim1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Claim1__c)+"'\n");
    sb.append(" Claim_2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Claim_2__c)+"'\n");
    sb.append(" Claim_4__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Claim_4__c)+"'\n");
    sb.append(" Claim_5__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Claim_5__c)+"'\n");
    sb.append(" Claim_Slot_3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Claim_Slot_3__c)+"'\n");
    sb.append(" Client_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client_Name__c)+"'\n");
    sb.append(" Client_Name__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client_Name__r)+"'\n");
    sb.append(" Client_is_Collections_Issue__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client_is_Collections_Issue__c)+"'\n");
    sb.append(" Closed_Assignments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Closed_Assignments__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact__c)+"'\n");
    sb.append(" Contact__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact__r)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" Create_Assignment_Link__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Create_Assignment_Link__c)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Creator_Dept__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Creator_Dept__c)+"'\n");
    sb.append(" Credit_Limit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Limit__c)+"'\n");
    sb.append(" Credit_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Rating__c)+"'\n");
    sb.append(" Description__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description__c)+"'\n");
    sb.append(" Division__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__c)+"'\n");
    sb.append(" Division__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__r)+"'\n");
    sb.append(" Drug_Test_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Drug_Test_Required__c)+"'\n");
    sb.append(" Drug_Tests__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Drug_Tests__r)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Email_Posting_Template_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email_Posting_Template_Number__c)+"'\n");
    sb.append(" Email_Posting_Template_State_Value__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email_Posting_Template_State_Value__c)+"'\n");
    sb.append(" Email_Posting_Template_Trade_Value__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email_Posting_Template_Trade_Value__c)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employees_Assigned__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employees_Assigned__c)+"'\n");
    sb.append(" Estimated_Duration__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Estimated_Duration__c)+"'\n");
    sb.append(" Estimated_Project_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Estimated_Project_End_Date__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" Field_Expenses__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Field_Expenses__r)+"'\n");
    sb.append(" Fifth_Recruiter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fifth_Recruiter__c)+"'\n");
    sb.append(" First_Assignment_Start__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(First_Assignment_Start__c)+"'\n");
    sb.append(" Fourth_Recruiter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fourth_Recruiter__c)+"'\n");
    sb.append(" General_Contractor_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(General_Contractor_Name__c)+"'\n");
    sb.append(" Geo_Code_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Geo_Code_Status__c)+"'\n");
    sb.append(" Global_Share__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Global_Share__c)+"'\n");
    sb.append(" HR_Requests__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HR_Requests__r)+"'\n");
    sb.append(" Has_WC_Coverage__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Has_WC_Coverage__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" If_Background_Ck_required_is_it_BILLED__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(If_Background_Ck_required_is_it_BILLED__c)+"'\n");
    sb.append(" If_Drug_Test_required_is_it_BILLED__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(If_Drug_Test_required_is_it_BILLED__c)+"'\n");
    sb.append(" Invoices__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoices__r)+"'\n");
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
    sb.append(" Lat__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lat__c)+"'\n");
    sb.append(" Location_of_Project__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Location_of_Project__c)+"'\n");
    sb.append(" Lon__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lon__c)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Max_Assignment_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Max_Assignment_End_Date__c)+"'\n");
    sb.append(" Mileage__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Mileage__r)+"'\n");
    sb.append(" Most_Recent_Assignment_End__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Most_Recent_Assignment_End__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Number_of_Assignments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Assignments__c)+"'\n");
    sb.append(" OCIP__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OCIP__c)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Open_Assignments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Open_Assignments__c)+"'\n");
    sb.append(" Opportunity_Id__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunity_Id__c)+"'\n");
    sb.append(" Ops_Team_Assigned__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Ops_Team_Assigned__c)+"'\n");
    sb.append(" OrderCount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OrderCount__c)+"'\n");
    sb.append(" Order_Certifications__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Certifications__r)+"'\n");
    sb.append(" Order_Description__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Description__c)+"'\n");
    sb.append(" Order_Note__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Note__c)+"'\n");
    sb.append(" Order_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Number__c)+"'\n");
    sb.append(" Order_Rates__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Rates__r)+"'\n");
    sb.append(" Order_Skills__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Order_Skills__r)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" PO_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PO_Number__c)+"'\n");
    sb.append(" PO_Override__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PO_Override__c)+"'\n");
    sb.append(" PO_Required__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PO_Required__c)+"'\n");
    sb.append(" Payroll_Advances__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payroll_Advances__r)+"'\n");
    sb.append(" Potential_Candidate_Lists__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Potential_Candidate_Lists__r)+"'\n");
    sb.append(" Prevailing_Wage_Project__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Prevailing_Wage_Project__c)+"'\n");
    sb.append(" Priority__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Priority__c)+"'\n");
    sb.append(" Probability__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Probability__c)+"'\n");
    sb.append(" Probability_del__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Probability_del__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Project_Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Contact__c)+"'\n");
    sb.append(" Project_Owner_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Owner_Name__c)+"'\n");
    sb.append(" Project_Site_Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Site_Contact__c)+"'\n");
    sb.append(" Project_Start_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Project_Start_Date__c)+"'\n");
    sb.append(" Proxy__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Proxy__r)+"'\n");
    sb.append(" Publically_Funded_Project__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Publically_Funded_Project__c)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Recruiter_1_First_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_1_First_Name__c)+"'\n");
    sb.append(" Recruiter_1_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_1_Phone__c)+"'\n");
    sb.append(" Recruiter_In_Charge__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_In_Charge__c)+"'\n");
    sb.append(" Recruiter_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Recruiter_Phone__c)+"'\n");
    sb.append(" Region__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Region__c)+"'\n");
    sb.append(" Region__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Region__r)+"'\n");
    sb.append(" Requested_Headcount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Requested_Headcount__c)+"'\n");
    sb.append(" Requested_Start_Time__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Requested_Start_Time__c)+"'\n");
    sb.append(" Safety_Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Safety_Contact__c)+"'\n");
    sb.append(" Safety_Contact__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Safety_Contact__r)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
    sb.append(" Special_Billing_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Billing_Instructions__c)+"'\n");
    sb.append(" Special_Requirements__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Requirements__c)+"'\n");
    sb.append(" State_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State_Code__c)+"'\n");
    sb.append(" Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status__c)+"'\n");
    sb.append(" Submit_Date_Week_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Submit_Date_Week_Ending__c)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" Target_Bill_Rate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Target_Bill_Rate__c)+"'\n");
    sb.append(" Target_Mark_Up__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Target_Mark_Up__c)+"'\n");
    sb.append(" Target_Pay_Rate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Target_Pay_Rate__c)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" Tax_Exempt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tax_Exempt__c)+"'\n");
    sb.append(" Tax_Schedule__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tax_Schedule__c)+"'\n");
    sb.append(" Tax_Schedule__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tax_Schedule__r)+"'\n");
    sb.append(" Test__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Test__c)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Total_Client_Active_Assignments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Client_Active_Assignments__c)+"'\n");
    sb.append(" Total_Req_Headcount_Credit_Load__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Req_Headcount_Credit_Load__c)+"'\n");
    sb.append(" TradeID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TradeID__c)+"'\n");
    sb.append(" TradeMerge__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TradeMerge__c)+"'\n");
    sb.append(" Trade__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade__c)+"'\n");
    sb.append(" Trade__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade__r)+"'\n");
    sb.append(" Unfilled_Headcount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Unfilled_Headcount__c)+"'\n");
    sb.append(" Update__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Update__c)+"'\n");
    sb.append(" UserClaim1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserClaim1__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" User_Claim2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User_Claim2__c)+"'\n");
    sb.append(" User_Claim_3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User_Claim_3__c)+"'\n");
    sb.append(" User_Claim_4__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User_Claim_4__c)+"'\n");
    sb.append(" User_Claim_5__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User_Claim_5__c)+"'\n");
    sb.append(" WC_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WC_Code__c)+"'\n");
    sb.append(" Week_Ending__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Week_Ending__c)+"'\n");
    sb.append(" Work_County__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_County__c)+"'\n");
    sb.append(" Work_city__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Work_city__c)+"'\n");
    sb.append(" Working_Recruiter_2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Working_Recruiter_2__c)+"'\n");
    sb.append(" Working_Recruiter_3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Working_Recruiter_3__c)+"'\n");
    sb.append(" actualDurationPeriod__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(actualDurationPeriod__c)+"'\n");
    sb.append(" orderType__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(orderType__c)+"'\n");
    sb.append(" workState__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(workState__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}