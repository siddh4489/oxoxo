package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Candidate_Employee__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Candidate_Employee__c() {
  }
    
  
  /**
   * element  : ACA_Opt_Out_Received__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ACA_Opt_Out_Received__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ACA_Opt_Out_Received__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean ACA_Opt_Out_Received__c__is_set = false;

  private java.util.Calendar ACA_Opt_Out_Received__c;

  public java.util.Calendar getACA_Opt_Out_Received__c() {
    return ACA_Opt_Out_Received__c;
  }

  

  public void setACA_Opt_Out_Received__c(java.util.Calendar ACA_Opt_Out_Received__c) {
    this.ACA_Opt_Out_Received__c = ACA_Opt_Out_Received__c;
    ACA_Opt_Out_Received__c__is_set = true;
  }
  
  /**
   * element  : Accepted_Terms_Verification_and_Release__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Accepted_Terms_Verification_and_Release__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Accepted_Terms_Verification_and_Release__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Accepted_Terms_Verification_and_Release__c__is_set = false;

  private java.lang.Boolean Accepted_Terms_Verification_and_Release__c;

  public java.lang.Boolean getAccepted_Terms_Verification_and_Release__c() {
    return Accepted_Terms_Verification_and_Release__c;
  }

  

  public void setAccepted_Terms_Verification_and_Release__c(java.lang.Boolean Accepted_Terms_Verification_and_Release__c) {
    this.Accepted_Terms_Verification_and_Release__c = Accepted_Terms_Verification_and_Release__c;
    Accepted_Terms_Verification_and_Release__c__is_set = true;
  }
  
  /**
   * element  : Active__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Active__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Active__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Active__c__is_set = false;

  private java.lang.Double Active__c;

  public java.lang.Double getActive__c() {
    return Active__c;
  }

  

  public void setActive__c(java.lang.Double Active__c) {
    this.Active__c = Active__c;
    Active__c__is_set = true;
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
   * element  : Address1__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Address1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address1__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Address1__c__is_set = false;

  private java.lang.String Address1__c;

  public java.lang.String getAddress1__c() {
    return Address1__c;
  }

  

  public void setAddress1__c(java.lang.String Address1__c) {
    this.Address1__c = Address1__c;
    Address1__c__is_set = true;
  }
  
  /**
   * element  : Address2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Address2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Address2__c__is_set = false;

  private java.lang.String Address2__c;

  public java.lang.String getAddress2__c() {
    return Address2__c;
  }

  

  public void setAddress2__c(java.lang.String Address2__c) {
    this.Address2__c = Address2__c;
    Address2__c__is_set = true;
  }
  
  /**
   * element  : Address_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Address_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Address_ID__c__is_set = false;

  private java.lang.String Address_ID__c;

  public java.lang.String getAddress_ID__c() {
    return Address_ID__c;
  }

  

  public void setAddress_ID__c(java.lang.String Address_ID__c) {
    this.Address_ID__c = Address_ID__c;
    Address_ID__c__is_set = true;
  }
  
  /**
   * element  : Advertisement__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Advertisement__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Advertisement__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Advertisement__c__is_set = false;

  private java.lang.String Advertisement__c;

  public java.lang.String getAdvertisement__c() {
    return Advertisement__c;
  }

  

  public void setAdvertisement__c(java.lang.String Advertisement__c) {
    this.Advertisement__c = Advertisement__c;
    Advertisement__c__is_set = true;
  }
  
  /**
   * element  : Advertisement__r of type {urn:sobject.enterprise.soap.sforce.com}Ads__c
   * java type: com.sforce.soap.enterprise.sobject.Ads__c
   */
  private static final com.sforce.ws.bind.TypeInfo Advertisement__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Advertisement__r","urn:sobject.enterprise.soap.sforce.com","Ads__c",0,1,true);

  private boolean Advertisement__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Ads__c Advertisement__r;

  public com.sforce.soap.enterprise.sobject.Ads__c getAdvertisement__r() {
    return Advertisement__r;
  }

  

  public void setAdvertisement__r(com.sforce.soap.enterprise.sobject.Ads__c Advertisement__r) {
    this.Advertisement__r = Advertisement__r;
    Advertisement__r__is_set = true;
  }
  
  /**
   * element  : Age__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Age__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Age__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Age__c__is_set = false;

  private java.lang.Double Age__c;

  public java.lang.Double getAge__c() {
    return Age__c;
  }

  

  public void setAge__c(java.lang.Double Age__c) {
    this.Age__c = Age__c;
    Age__c__is_set = true;
  }
  
  /**
   * element  : Agreements__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Agreements__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Agreements__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Agreements__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Agreements__r;

  public com.sforce.soap.enterprise.QueryResult getAgreements__r() {
    return Agreements__r;
  }

  

  public void setAgreements__r(com.sforce.soap.enterprise.QueryResult Agreements__r) {
    this.Agreements__r = Agreements__r;
    Agreements__r__is_set = true;
  }
  
  /**
   * element  : Applicant__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Applicant__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Applicant__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Applicant__c__is_set = false;

  private java.lang.String Applicant__c;

  public java.lang.String getApplicant__c() {
    return Applicant__c;
  }

  

  public void setApplicant__c(java.lang.String Applicant__c) {
    this.Applicant__c = Applicant__c;
    Applicant__c__is_set = true;
  }
  
  /**
   * element  : Applicant__r of type {urn:sobject.enterprise.soap.sforce.com}Applicant__c
   * java type: com.sforce.soap.enterprise.sobject.Applicant__c
   */
  private static final com.sforce.ws.bind.TypeInfo Applicant__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Applicant__r","urn:sobject.enterprise.soap.sforce.com","Applicant__c",0,1,true);

  private boolean Applicant__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Applicant__c Applicant__r;

  public com.sforce.soap.enterprise.sobject.Applicant__c getApplicant__r() {
    return Applicant__r;
  }

  

  public void setApplicant__r(com.sforce.soap.enterprise.sobject.Applicant__c Applicant__r) {
    this.Applicant__r = Applicant__r;
    Applicant__r__is_set = true;
  }
  
  /**
   * element  : Applicants__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Applicants__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Applicants__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Applicants__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Applicants__r;

  public com.sforce.soap.enterprise.QueryResult getApplicants__r() {
    return Applicants__r;
  }

  

  public void setApplicants__r(com.sforce.soap.enterprise.QueryResult Applicants__r) {
    this.Applicants__r = Applicants__r;
    Applicants__r__is_set = true;
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
   * element  : Average_Rating__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Average_Rating__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Average_Rating__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Average_Rating__c__is_set = false;

  private java.lang.String Average_Rating__c;

  public java.lang.String getAverage_Rating__c() {
    return Average_Rating__c;
  }

  

  public void setAverage_Rating__c(java.lang.String Average_Rating__c) {
    this.Average_Rating__c = Average_Rating__c;
    Average_Rating__c__is_set = true;
  }
  
  /**
   * element  : Avg_Weekly_Hours_Last_Month__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Avg_Weekly_Hours_Last_Month__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Avg_Weekly_Hours_Last_Month__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Avg_Weekly_Hours_Last_Month__c__is_set = false;

  private java.lang.Double Avg_Weekly_Hours_Last_Month__c;

  public java.lang.Double getAvg_Weekly_Hours_Last_Month__c() {
    return Avg_Weekly_Hours_Last_Month__c;
  }

  

  public void setAvg_Weekly_Hours_Last_Month__c(java.lang.Double Avg_Weekly_Hours_Last_Month__c) {
    this.Avg_Weekly_Hours_Last_Month__c = Avg_Weekly_Hours_Last_Month__c;
    Avg_Weekly_Hours_Last_Month__c__is_set = true;
  }
  
  /**
   * element  : BA_Reference_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BA_Reference_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BA_Reference_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BA_Reference_ID__c__is_set = false;

  private java.lang.String BA_Reference_ID__c;

  public java.lang.String getBA_Reference_ID__c() {
    return BA_Reference_ID__c;
  }

  

  public void setBA_Reference_ID__c(java.lang.String BA_Reference_ID__c) {
    this.BA_Reference_ID__c = BA_Reference_ID__c;
    BA_Reference_ID__c__is_set = true;
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
   * element  : Broadcast_Contact__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Broadcast_Contact__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Broadcast_Contact__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Broadcast_Contact__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Broadcast_Contact__r;

  public com.sforce.soap.enterprise.QueryResult getBroadcast_Contact__r() {
    return Broadcast_Contact__r;
  }

  

  public void setBroadcast_Contact__r(com.sforce.soap.enterprise.QueryResult Broadcast_Contact__r) {
    this.Broadcast_Contact__r = Broadcast_Contact__r;
    Broadcast_Contact__r__is_set = true;
  }
  
  /**
   * element  : Call_In_Note__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Call_In_Note__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Call_In_Note__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Call_In_Note__c__is_set = false;

  private java.lang.String Call_In_Note__c;

  public java.lang.String getCall_In_Note__c() {
    return Call_In_Note__c;
  }

  

  public void setCall_In_Note__c(java.lang.String Call_In_Note__c) {
    this.Call_In_Note__c = Call_In_Note__c;
    Call_In_Note__c__is_set = true;
  }
  
  /**
   * element  : Candidate_Geocodes__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Geocodes__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Geocodes__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Candidate_Geocodes__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Candidate_Geocodes__r;

  public com.sforce.soap.enterprise.QueryResult getCandidate_Geocodes__r() {
    return Candidate_Geocodes__r;
  }

  

  public void setCandidate_Geocodes__r(com.sforce.soap.enterprise.QueryResult Candidate_Geocodes__r) {
    this.Candidate_Geocodes__r = Candidate_Geocodes__r;
    Candidate_Geocodes__r__is_set = true;
  }
  
  /**
   * element  : Candidate_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Candidate_Status__c__is_set = false;

  private java.lang.String Candidate_Status__c;

  public java.lang.String getCandidate_Status__c() {
    return Candidate_Status__c;
  }

  

  public void setCandidate_Status__c(java.lang.String Candidate_Status__c) {
    this.Candidate_Status__c = Candidate_Status__c;
    Candidate_Status__c__is_set = true;
  }
  
  /**
   * element  : Candidate_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Candidate_Type__c__is_set = false;

  private java.lang.String Candidate_Type__c;

  public java.lang.String getCandidate_Type__c() {
    return Candidate_Type__c;
  }

  

  public void setCandidate_Type__c(java.lang.String Candidate_Type__c) {
    this.Candidate_Type__c = Candidate_Type__c;
    Candidate_Type__c__is_set = true;
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
   * element  : Certified_Submission_Correct_Accurate__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Certified_Submission_Correct_Accurate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Certified_Submission_Correct_Accurate__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Certified_Submission_Correct_Accurate__c__is_set = false;

  private java.lang.Boolean Certified_Submission_Correct_Accurate__c;

  public java.lang.Boolean getCertified_Submission_Correct_Accurate__c() {
    return Certified_Submission_Correct_Accurate__c;
  }

  

  public void setCertified_Submission_Correct_Accurate__c(java.lang.Boolean Certified_Submission_Correct_Accurate__c) {
    this.Certified_Submission_Correct_Accurate__c = Certified_Submission_Correct_Accurate__c;
    Certified_Submission_Correct_Accurate__c__is_set = true;
  }
  
  /**
   * element  : Child_Support_Or_Garnishment_Order__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Child_Support_Or_Garnishment_Order__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Child_Support_Or_Garnishment_Order__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Child_Support_Or_Garnishment_Order__c__is_set = false;

  private java.lang.Boolean Child_Support_Or_Garnishment_Order__c;

  public java.lang.Boolean getChild_Support_Or_Garnishment_Order__c() {
    return Child_Support_Or_Garnishment_Order__c;
  }

  

  public void setChild_Support_Or_Garnishment_Order__c(java.lang.Boolean Child_Support_Or_Garnishment_Order__c) {
    this.Child_Support_Or_Garnishment_Order__c = Child_Support_Or_Garnishment_Order__c;
    Child_Support_Or_Garnishment_Order__c__is_set = true;
  }
  
  /**
   * element  : Child_Support_Orders__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Child_Support_Orders__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Child_Support_Orders__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Child_Support_Orders__c__is_set = false;

  private java.lang.Double Child_Support_Orders__c;

  public java.lang.Double getChild_Support_Orders__c() {
    return Child_Support_Orders__c;
  }

  

  public void setChild_Support_Orders__c(java.lang.Double Child_Support_Orders__c) {
    this.Child_Support_Orders__c = Child_Support_Orders__c;
    Child_Support_Orders__c__is_set = true;
  }
  
  /**
   * element  : Child_Support__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Child_Support__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Child_Support__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Child_Support__c__is_set = false;

  private java.lang.String Child_Support__c;

  public java.lang.String getChild_Support__c() {
    return Child_Support__c;
  }

  

  public void setChild_Support__c(java.lang.String Child_Support__c) {
    this.Child_Support__c = Child_Support__c;
    Child_Support__c__is_set = true;
  }
  
  /**
   * element  : Child_Support__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Child_Support__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Child_Support__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Child_Support__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Child_Support__r;

  public com.sforce.soap.enterprise.QueryResult getChild_Support__r() {
    return Child_Support__r;
  }

  

  public void setChild_Support__r(com.sforce.soap.enterprise.QueryResult Child_Support__r) {
    this.Child_Support__r = Child_Support__r;
    Child_Support__r__is_set = true;
  }
  
  /**
   * element  : City__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo City__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","City__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean City__c__is_set = false;

  private java.lang.String City__c;

  public java.lang.String getCity__c() {
    return City__c;
  }

  

  public void setCity__c(java.lang.String City__c) {
    this.City__c = City__c;
    City__c__is_set = true;
  }
  
  /**
   * element  : Client_Bans__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Client_Bans__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Client_Bans__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Client_Bans__c__is_set = false;

  private java.lang.Double Client_Bans__c;

  public java.lang.Double getClient_Bans__c() {
    return Client_Bans__c;
  }

  

  public void setClient_Bans__c(java.lang.Double Client_Bans__c) {
    this.Client_Bans__c = Client_Bans__c;
    Client_Bans__c__is_set = true;
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
   * element  : Contact_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Contact_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Contact_Number__c__is_set = false;

  private java.lang.String Contact_Number__c;

  public java.lang.String getContact_Number__c() {
    return Contact_Number__c;
  }

  

  public void setContact_Number__c(java.lang.String Contact_Number__c) {
    this.Contact_Number__c = Contact_Number__c;
    Contact_Number__c__is_set = true;
  }
  
  /**
   * element  : Contacted_for_Tax_Paperwork__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Contacted_for_Tax_Paperwork__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contacted_for_Tax_Paperwork__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Contacted_for_Tax_Paperwork__c__is_set = false;

  private java.lang.Boolean Contacted_for_Tax_Paperwork__c;

  public java.lang.Boolean getContacted_for_Tax_Paperwork__c() {
    return Contacted_for_Tax_Paperwork__c;
  }

  

  public void setContacted_for_Tax_Paperwork__c(java.lang.Boolean Contacted_for_Tax_Paperwork__c) {
    this.Contacted_for_Tax_Paperwork__c = Contacted_for_Tax_Paperwork__c;
    Contacted_for_Tax_Paperwork__c__is_set = true;
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
   * element  : DD_on_File__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo DD_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DD_on_File__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean DD_on_File__c__is_set = false;

  private java.lang.Boolean DD_on_File__c;

  public java.lang.Boolean getDD_on_File__c() {
    return DD_on_File__c;
  }

  

  public void setDD_on_File__c(java.lang.Boolean DD_on_File__c) {
    this.DD_on_File__c = DD_on_File__c;
    DD_on_File__c__is_set = true;
  }
  
  /**
   * element  : Date_Available__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_Available__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_Available__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_Available__c__is_set = false;

  private java.util.Calendar Date_Available__c;

  public java.util.Calendar getDate_Available__c() {
    return Date_Available__c;
  }

  

  public void setDate_Available__c(java.util.Calendar Date_Available__c) {
    this.Date_Available__c = Date_Available__c;
    Date_Available__c__is_set = true;
  }
  
  /**
   * element  : Date_of_Birth__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_of_Birth__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_of_Birth__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_of_Birth__c__is_set = false;

  private java.util.Calendar Date_of_Birth__c;

  public java.util.Calendar getDate_of_Birth__c() {
    return Date_of_Birth__c;
  }

  

  public void setDate_of_Birth__c(java.util.Calendar Date_of_Birth__c) {
    this.Date_of_Birth__c = Date_of_Birth__c;
    Date_of_Birth__c__is_set = true;
  }
  
  /**
   * element  : Date_of_Last_Candidate_Type_Change__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_of_Last_Candidate_Type_Change__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_of_Last_Candidate_Type_Change__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_of_Last_Candidate_Type_Change__c__is_set = false;

  private java.util.Calendar Date_of_Last_Candidate_Type_Change__c;

  public java.util.Calendar getDate_of_Last_Candidate_Type_Change__c() {
    return Date_of_Last_Candidate_Type_Change__c;
  }

  

  public void setDate_of_Last_Candidate_Type_Change__c(java.util.Calendar Date_of_Last_Candidate_Type_Change__c) {
    this.Date_of_Last_Candidate_Type_Change__c = Date_of_Last_Candidate_Type_Change__c;
    Date_of_Last_Candidate_Type_Change__c__is_set = true;
  }
  
  /**
   * element  : Date_of_Last_Status_Change__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_of_Last_Status_Change__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_of_Last_Status_Change__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_of_Last_Status_Change__c__is_set = false;

  private java.util.Calendar Date_of_Last_Status_Change__c;

  public java.util.Calendar getDate_of_Last_Status_Change__c() {
    return Date_of_Last_Status_Change__c;
  }

  

  public void setDate_of_Last_Status_Change__c(java.util.Calendar Date_of_Last_Status_Change__c) {
    this.Date_of_Last_Status_Change__c = Date_of_Last_Status_Change__c;
    Date_of_Last_Status_Change__c__is_set = true;
  }
  
  /**
   * element  : Date_of_Tax_Paperwork__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_of_Tax_Paperwork__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_of_Tax_Paperwork__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_of_Tax_Paperwork__c__is_set = false;

  private java.util.Calendar Date_of_Tax_Paperwork__c;

  public java.util.Calendar getDate_of_Tax_Paperwork__c() {
    return Date_of_Tax_Paperwork__c;
  }

  

  public void setDate_of_Tax_Paperwork__c(java.util.Calendar Date_of_Tax_Paperwork__c) {
    this.Date_of_Tax_Paperwork__c = Date_of_Tax_Paperwork__c;
    Date_of_Tax_Paperwork__c__is_set = true;
  }
  
  /**
   * element  : Days_Since_1st_Pay__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Days_Since_1st_Pay__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Days_Since_1st_Pay__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Days_Since_1st_Pay__c__is_set = false;

  private java.lang.Double Days_Since_1st_Pay__c;

  public java.lang.Double getDays_Since_1st_Pay__c() {
    return Days_Since_1st_Pay__c;
  }

  

  public void setDays_Since_1st_Pay__c(java.lang.Double Days_Since_1st_Pay__c) {
    this.Days_Since_1st_Pay__c = Days_Since_1st_Pay__c;
    Days_Since_1st_Pay__c__is_set = true;
  }
  
  /**
   * element  : Deduction_Set_Up_in_GP__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Deduction_Set_Up_in_GP__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Deduction_Set_Up_in_GP__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Deduction_Set_Up_in_GP__c__is_set = false;

  private java.util.Calendar Deduction_Set_Up_in_GP__c;

  public java.util.Calendar getDeduction_Set_Up_in_GP__c() {
    return Deduction_Set_Up_in_GP__c;
  }

  

  public void setDeduction_Set_Up_in_GP__c(java.util.Calendar Deduction_Set_Up_in_GP__c) {
    this.Deduction_Set_Up_in_GP__c = Deduction_Set_Up_in_GP__c;
    Deduction_Set_Up_in_GP__c__is_set = true;
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
   * element  : Do_Not_Assign_To__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Do_Not_Assign_To__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Do_Not_Assign_To__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Do_Not_Assign_To__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Do_Not_Assign_To__r;

  public com.sforce.soap.enterprise.QueryResult getDo_Not_Assign_To__r() {
    return Do_Not_Assign_To__r;
  }

  

  public void setDo_Not_Assign_To__r(com.sforce.soap.enterprise.QueryResult Do_Not_Assign_To__r) {
    this.Do_Not_Assign_To__r = Do_Not_Assign_To__r;
    Do_Not_Assign_To__r__is_set = true;
  }
  
  /**
   * element  : Documentation_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Documentation_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Documentation_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Documentation_Status__c__is_set = false;

  private java.lang.String Documentation_Status__c;

  public java.lang.String getDocumentation_Status__c() {
    return Documentation_Status__c;
  }

  

  public void setDocumentation_Status__c(java.lang.String Documentation_Status__c) {
    this.Documentation_Status__c = Documentation_Status__c;
    Documentation_Status__c__is_set = true;
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
   * element  : Education__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Education__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Education__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Education__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Education__r;

  public com.sforce.soap.enterprise.QueryResult getEducation__r() {
    return Education__r;
  }

  

  public void setEducation__r(com.sforce.soap.enterprise.QueryResult Education__r) {
    this.Education__r = Education__r;
    Education__r__is_set = true;
  }
  
  /**
   * element  : Email_1__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Email_1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email_1__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Email_1__c__is_set = false;

  private java.lang.String Email_1__c;

  public java.lang.String getEmail_1__c() {
    return Email_1__c;
  }

  

  public void setEmail_1__c(java.lang.String Email_1__c) {
    this.Email_1__c = Email_1__c;
    Email_1__c__is_set = true;
  }
  
  /**
   * element  : Email_2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Email_2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email_2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Email_2__c__is_set = false;

  private java.lang.String Email_2__c;

  public java.lang.String getEmail_2__c() {
    return Email_2__c;
  }

  

  public void setEmail_2__c(java.lang.String Email_2__c) {
    this.Email_2__c = Email_2__c;
    Email_2__c__is_set = true;
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
   * element  : Emails__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Emails__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Emails__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Emails__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Emails__r;

  public com.sforce.soap.enterprise.QueryResult getEmails__r() {
    return Emails__r;
  }

  

  public void setEmails__r(com.sforce.soap.enterprise.QueryResult Emails__r) {
    this.Emails__r = Emails__r;
    Emails__r__is_set = true;
  }
  
  /**
   * element  : Emergency_Contacts__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Emergency_Contacts__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Emergency_Contacts__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Emergency_Contacts__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Emergency_Contacts__r;

  public com.sforce.soap.enterprise.QueryResult getEmergency_Contacts__r() {
    return Emergency_Contacts__r;
  }

  

  public void setEmergency_Contacts__r(com.sforce.soap.enterprise.QueryResult Emergency_Contacts__r) {
    this.Emergency_Contacts__r = Emergency_Contacts__r;
    Emergency_Contacts__r__is_set = true;
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
   * element  : Employment_Paperwork2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Employment_Paperwork2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employment_Paperwork2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Employment_Paperwork2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Employment_Paperwork2__r;

  public com.sforce.soap.enterprise.QueryResult getEmployment_Paperwork2__r() {
    return Employment_Paperwork2__r;
  }

  

  public void setEmployment_Paperwork2__r(com.sforce.soap.enterprise.QueryResult Employment_Paperwork2__r) {
    this.Employment_Paperwork2__r = Employment_Paperwork2__r;
    Employment_Paperwork2__r__is_set = true;
  }
  
  /**
   * element  : Employments__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Employments__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employments__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Employments__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Employments__r;

  public com.sforce.soap.enterprise.QueryResult getEmployments__r() {
    return Employments__r;
  }

  

  public void setEmployments__r(com.sforce.soap.enterprise.QueryResult Employments__r) {
    this.Employments__r = Employments__r;
    Employments__r__is_set = true;
  }
  
  /**
   * element  : Ethnicity__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Ethnicity__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Ethnicity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Ethnicity__c__is_set = false;

  private java.lang.String Ethnicity__c;

  public java.lang.String getEthnicity__c() {
    return Ethnicity__c;
  }

  

  public void setEthnicity__c(java.lang.String Ethnicity__c) {
    this.Ethnicity__c = Ethnicity__c;
    Ethnicity__c__is_set = true;
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
   * element  : FE_Bonuses1__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FE_Bonuses1__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FE_Bonuses1__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FE_Bonuses1__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FE_Bonuses1__r;

  public com.sforce.soap.enterprise.QueryResult getFE_Bonuses1__r() {
    return FE_Bonuses1__r;
  }

  

  public void setFE_Bonuses1__r(com.sforce.soap.enterprise.QueryResult FE_Bonuses1__r) {
    this.FE_Bonuses1__r = FE_Bonuses1__r;
    FE_Bonuses1__r__is_set = true;
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
   * element  : First_Check_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo First_Check_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","First_Check_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean First_Check_Date__c__is_set = false;

  private java.util.Calendar First_Check_Date__c;

  public java.util.Calendar getFirst_Check_Date__c() {
    return First_Check_Date__c;
  }

  

  public void setFirst_Check_Date__c(java.util.Calendar First_Check_Date__c) {
    this.First_Check_Date__c = First_Check_Date__c;
    First_Check_Date__c__is_set = true;
  }
  
  /**
   * element  : First_Day_Worked__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo First_Day_Worked__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","First_Day_Worked__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean First_Day_Worked__c__is_set = false;

  private java.util.Calendar First_Day_Worked__c;

  public java.util.Calendar getFirst_Day_Worked__c() {
    return First_Day_Worked__c;
  }

  

  public void setFirst_Day_Worked__c(java.util.Calendar First_Day_Worked__c) {
    this.First_Day_Worked__c = First_Day_Worked__c;
    First_Day_Worked__c__is_set = true;
  }
  
  /**
   * element  : First_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo First_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","First_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean First_Name__c__is_set = false;

  private java.lang.String First_Name__c;

  public java.lang.String getFirst_Name__c() {
    return First_Name__c;
  }

  

  public void setFirst_Name__c(java.lang.String First_Name__c) {
    this.First_Name__c = First_Name__c;
    First_Name__c__is_set = true;
  }
  
  /**
   * element  : First_Timecard__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo First_Timecard__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","First_Timecard__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean First_Timecard__c__is_set = false;

  private java.util.Calendar First_Timecard__c;

  public java.util.Calendar getFirst_Timecard__c() {
    return First_Timecard__c;
  }

  

  public void setFirst_Timecard__c(java.util.Calendar First_Timecard__c) {
    this.First_Timecard__c = First_Timecard__c;
    First_Timecard__c__is_set = true;
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
   * element  : Full_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Full_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Full_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Full_Name__c__is_set = false;

  private java.lang.String Full_Name__c;

  public java.lang.String getFull_Name__c() {
    return Full_Name__c;
  }

  

  public void setFull_Name__c(java.lang.String Full_Name__c) {
    this.Full_Name__c = Full_Name__c;
    Full_Name__c__is_set = true;
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
   * element  : I9__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo I9__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","I9__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean I9__c__is_set = false;

  private java.lang.Boolean I9__c;

  public java.lang.Boolean getI9__c() {
    return I9__c;
  }

  

  public void setI9__c(java.lang.Boolean I9__c) {
    this.I9__c = I9__c;
    I9__c__is_set = true;
  }
  
  /**
   * element  : I_9_Forms__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo I_9_Forms__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","I_9_Forms__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean I_9_Forms__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult I_9_Forms__r;

  public com.sforce.soap.enterprise.QueryResult getI_9_Forms__r() {
    return I_9_Forms__r;
  }

  

  public void setI_9_Forms__r(com.sforce.soap.enterprise.QueryResult I_9_Forms__r) {
    this.I_9_Forms__r = I_9_Forms__r;
    I_9_Forms__r__is_set = true;
  }
  
  /**
   * element  : Import_Date__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Import_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Import_Date__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Import_Date__c__is_set = false;

  private java.lang.String Import_Date__c;

  public java.lang.String getImport_Date__c() {
    return Import_Date__c;
  }

  

  public void setImport_Date__c(java.lang.String Import_Date__c) {
    this.Import_Date__c = Import_Date__c;
    Import_Date__c__is_set = true;
  }
  
  /**
   * element  : Import_Source__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Import_Source__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Import_Source__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Import_Source__c__is_set = false;

  private java.lang.String Import_Source__c;

  public java.lang.String getImport_Source__c() {
    return Import_Source__c;
  }

  

  public void setImport_Source__c(java.lang.String Import_Source__c) {
    this.Import_Source__c = Import_Source__c;
    Import_Source__c__is_set = true;
  }
  
  /**
   * element  : Imported_Last_Employer__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Imported_Last_Employer__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Imported_Last_Employer__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Imported_Last_Employer__c__is_set = false;

  private java.lang.String Imported_Last_Employer__c;

  public java.lang.String getImported_Last_Employer__c() {
    return Imported_Last_Employer__c;
  }

  

  public void setImported_Last_Employer__c(java.lang.String Imported_Last_Employer__c) {
    this.Imported_Last_Employer__c = Imported_Last_Employer__c;
    Imported_Last_Employer__c__is_set = true;
  }
  
  /**
   * element  : Imported_Resume_Notes__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Imported_Resume_Notes__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Imported_Resume_Notes__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Imported_Resume_Notes__c__is_set = false;

  private java.lang.String Imported_Resume_Notes__c;

  public java.lang.String getImported_Resume_Notes__c() {
    return Imported_Resume_Notes__c;
  }

  

  public void setImported_Resume_Notes__c(java.lang.String Imported_Resume_Notes__c) {
    this.Imported_Resume_Notes__c = Imported_Resume_Notes__c;
    Imported_Resume_Notes__c__is_set = true;
  }
  
  /**
   * element  : Imported_Years_Experience__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Imported_Years_Experience__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Imported_Years_Experience__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Imported_Years_Experience__c__is_set = false;

  private java.lang.String Imported_Years_Experience__c;

  public java.lang.String getImported_Years_Experience__c() {
    return Imported_Years_Experience__c;
  }

  

  public void setImported_Years_Experience__c(java.lang.String Imported_Years_Experience__c) {
    this.Imported_Years_Experience__c = Imported_Years_Experience__c;
    Imported_Years_Experience__c__is_set = true;
  }
  
  /**
   * element  : Incoming_SMS__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Incoming_SMS__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Incoming_SMS__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Incoming_SMS__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Incoming_SMS__r;

  public com.sforce.soap.enterprise.QueryResult getIncoming_SMS__r() {
    return Incoming_SMS__r;
  }

  

  public void setIncoming_SMS__r(com.sforce.soap.enterprise.QueryResult Incoming_SMS__r) {
    this.Incoming_SMS__r = Incoming_SMS__r;
    Incoming_SMS__r__is_set = true;
  }
  
  /**
   * element  : Insurance_Eligible__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Insurance_Eligible__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Insurance_Eligible__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Insurance_Eligible__c__is_set = false;

  private java.lang.String Insurance_Eligible__c;

  public java.lang.String getInsurance_Eligible__c() {
    return Insurance_Eligible__c;
  }

  

  public void setInsurance_Eligible__c(java.lang.String Insurance_Eligible__c) {
    this.Insurance_Eligible__c = Insurance_Eligible__c;
    Insurance_Eligible__c__is_set = true;
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
   * element  : Job_Reference_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Job_Reference_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Job_Reference_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Job_Reference_Number__c__is_set = false;

  private java.lang.String Job_Reference_Number__c;

  public java.lang.String getJob_Reference_Number__c() {
    return Job_Reference_Number__c;
  }

  

  public void setJob_Reference_Number__c(java.lang.String Job_Reference_Number__c) {
    this.Job_Reference_Number__c = Job_Reference_Number__c;
    Job_Reference_Number__c__is_set = true;
  }
  
  /**
   * element  : Jobs_will_not_take__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Jobs_will_not_take__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Jobs_will_not_take__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Jobs_will_not_take__c__is_set = false;

  private java.lang.String Jobs_will_not_take__c;

  public java.lang.String getJobs_will_not_take__c() {
    return Jobs_will_not_take__c;
  }

  

  public void setJobs_will_not_take__c(java.lang.String Jobs_will_not_take__c) {
    this.Jobs_will_not_take__c = Jobs_will_not_take__c;
    Jobs_will_not_take__c__is_set = true;
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
   * element  : Last_Assigned_With__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Last_Assigned_With__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Last_Assigned_With__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Last_Assigned_With__c__is_set = false;

  private java.lang.String Last_Assigned_With__c;

  public java.lang.String getLast_Assigned_With__c() {
    return Last_Assigned_With__c;
  }

  

  public void setLast_Assigned_With__c(java.lang.String Last_Assigned_With__c) {
    this.Last_Assigned_With__c = Last_Assigned_With__c;
    Last_Assigned_With__c__is_set = true;
  }
  
  /**
   * element  : Last_Assignment_Ended__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Last_Assignment_Ended__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Last_Assignment_Ended__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Last_Assignment_Ended__c__is_set = false;

  private java.util.Calendar Last_Assignment_Ended__c;

  public java.util.Calendar getLast_Assignment_Ended__c() {
    return Last_Assignment_Ended__c;
  }

  

  public void setLast_Assignment_Ended__c(java.util.Calendar Last_Assignment_Ended__c) {
    this.Last_Assignment_Ended__c = Last_Assignment_Ended__c;
    Last_Assignment_Ended__c__is_set = true;
  }
  
  /**
   * element  : Last_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Last_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Last_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Last_Name__c__is_set = false;

  private java.lang.String Last_Name__c;

  public java.lang.String getLast_Name__c() {
    return Last_Name__c;
  }

  

  public void setLast_Name__c(java.lang.String Last_Name__c) {
    this.Last_Name__c = Last_Name__c;
    Last_Name__c__is_set = true;
  }
  
  /**
   * element  : Last_PDNB__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Last_PDNB__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Last_PDNB__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Last_PDNB__c__is_set = false;

  private java.lang.String Last_PDNB__c;

  public java.lang.String getLast_PDNB__c() {
    return Last_PDNB__c;
  }

  

  public void setLast_PDNB__c(java.lang.String Last_PDNB__c) {
    this.Last_PDNB__c = Last_PDNB__c;
    Last_PDNB__c__is_set = true;
  }
  
  /**
   * element  : Last_Regular_Pay__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Last_Regular_Pay__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Last_Regular_Pay__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Last_Regular_Pay__c__is_set = false;

  private java.lang.String Last_Regular_Pay__c;

  public java.lang.String getLast_Regular_Pay__c() {
    return Last_Regular_Pay__c;
  }

  

  public void setLast_Regular_Pay__c(java.lang.String Last_Regular_Pay__c) {
    this.Last_Regular_Pay__c = Last_Regular_Pay__c;
    Last_Regular_Pay__c__is_set = true;
  }
  
  /**
   * element  : Last_Vacation_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Last_Vacation_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Last_Vacation_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Last_Vacation_Date__c__is_set = false;

  private java.util.Calendar Last_Vacation_Date__c;

  public java.util.Calendar getLast_Vacation_Date__c() {
    return Last_Vacation_Date__c;
  }

  

  public void setLast_Vacation_Date__c(java.util.Calendar Last_Vacation_Date__c) {
    this.Last_Vacation_Date__c = Last_Vacation_Date__c;
    Last_Vacation_Date__c__is_set = true;
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
   * element  : Location__Latitude__s of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Location__Latitude__s__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Location__Latitude__s","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Location__Latitude__s__is_set = false;

  private java.lang.Double Location__Latitude__s;

  public java.lang.Double getLocation__Latitude__s() {
    return Location__Latitude__s;
  }

  

  public void setLocation__Latitude__s(java.lang.Double Location__Latitude__s) {
    this.Location__Latitude__s = Location__Latitude__s;
    Location__Latitude__s__is_set = true;
  }
  
  /**
   * element  : Location__Longitude__s of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Location__Longitude__s__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Location__Longitude__s","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Location__Longitude__s__is_set = false;

  private java.lang.Double Location__Longitude__s;

  public java.lang.Double getLocation__Longitude__s() {
    return Location__Longitude__s;
  }

  

  public void setLocation__Longitude__s(java.lang.Double Location__Longitude__s) {
    this.Location__Longitude__s = Location__Longitude__s;
    Location__Longitude__s__is_set = true;
  }
  
  /**
   * element  : Location__c of type {urn:enterprise.soap.sforce.com}location
   * java type: com.sforce.soap.enterprise.Location
   */
  private static final com.sforce.ws.bind.TypeInfo Location__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Location__c","urn:enterprise.soap.sforce.com","location",0,1,true);

  private boolean Location__c__is_set = false;

  private com.sforce.soap.enterprise.Location Location__c;

  public com.sforce.soap.enterprise.Location getLocation__c() {
    return Location__c;
  }

  

  public void setLocation__c(com.sforce.soap.enterprise.Location Location__c) {
    this.Location__c = Location__c;
    Location__c__is_set = true;
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
   * element  : Middle_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Middle_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Middle_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Middle_Name__c__is_set = false;

  private java.lang.String Middle_Name__c;

  public java.lang.String getMiddle_Name__c() {
    return Middle_Name__c;
  }

  

  public void setMiddle_Name__c(java.lang.String Middle_Name__c) {
    this.Middle_Name__c = Middle_Name__c;
    Middle_Name__c__is_set = true;
  }
  
  /**
   * element  : Most_Recent_Check_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Most_Recent_Check_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Most_Recent_Check_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Most_Recent_Check_Date__c__is_set = false;

  private java.util.Calendar Most_Recent_Check_Date__c;

  public java.util.Calendar getMost_Recent_Check_Date__c() {
    return Most_Recent_Check_Date__c;
  }

  

  public void setMost_Recent_Check_Date__c(java.util.Calendar Most_Recent_Check_Date__c) {
    this.Most_Recent_Check_Date__c = Most_Recent_Check_Date__c;
    Most_Recent_Check_Date__c__is_set = true;
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
   * element  : Nickname__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Nickname__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Nickname__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Nickname__c__is_set = false;

  private java.lang.String Nickname__c;

  public java.lang.String getNickname__c() {
    return Nickname__c;
  }

  

  public void setNickname__c(java.lang.String Nickname__c) {
    this.Nickname__c = Nickname__c;
    Nickname__c__is_set = true;
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
   * element  : Number_of_Injuries__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Number_of_Injuries__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number_of_Injuries__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Number_of_Injuries__c__is_set = false;

  private java.lang.Double Number_of_Injuries__c;

  public java.lang.Double getNumber_of_Injuries__c() {
    return Number_of_Injuries__c;
  }

  

  public void setNumber_of_Injuries__c(java.lang.Double Number_of_Injuries__c) {
    this.Number_of_Injuries__c = Number_of_Injuries__c;
    Number_of_Injuries__c__is_set = true;
  }
  
  /**
   * element  : Number_of_Ratings__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Number_of_Ratings__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number_of_Ratings__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Number_of_Ratings__c__is_set = false;

  private java.lang.Double Number_of_Ratings__c;

  public java.lang.Double getNumber_of_Ratings__c() {
    return Number_of_Ratings__c;
  }

  

  public void setNumber_of_Ratings__c(java.lang.Double Number_of_Ratings__c) {
    this.Number_of_Ratings__c = Number_of_Ratings__c;
    Number_of_Ratings__c__is_set = true;
  }
  
  /**
   * element  : OK_to_send_Text_Messages__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OK_to_send_Text_Messages__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OK_to_send_Text_Messages__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OK_to_send_Text_Messages__c__is_set = false;

  private java.lang.Boolean OK_to_send_Text_Messages__c;

  public java.lang.Boolean getOK_to_send_Text_Messages__c() {
    return OK_to_send_Text_Messages__c;
  }

  

  public void setOK_to_send_Text_Messages__c(java.lang.Boolean OK_to_send_Text_Messages__c) {
    this.OK_to_send_Text_Messages__c = OK_to_send_Text_Messages__c;
    OK_to_send_Text_Messages__c__is_set = true;
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
   * element  : Original_Time_Cards__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Original_Time_Cards__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Original_Time_Cards__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Original_Time_Cards__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Original_Time_Cards__r;

  public com.sforce.soap.enterprise.QueryResult getOriginal_Time_Cards__r() {
    return Original_Time_Cards__r;
  }

  

  public void setOriginal_Time_Cards__r(com.sforce.soap.enterprise.QueryResult Original_Time_Cards__r) {
    this.Original_Time_Cards__r = Original_Time_Cards__r;
    Original_Time_Cards__r__is_set = true;
  }
  
  /**
   * element  : Own_Tools__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Own_Tools__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Own_Tools__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Own_Tools__c__is_set = false;

  private java.lang.String Own_Tools__c;

  public java.lang.String getOwn_Tools__c() {
    return Own_Tools__c;
  }

  

  public void setOwn_Tools__c(java.lang.String Own_Tools__c) {
    this.Own_Tools__c = Own_Tools__c;
    Own_Tools__c__is_set = true;
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
   * element  : Payroll_Exceptions__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Payroll_Exceptions__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Payroll_Exceptions__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Payroll_Exceptions__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Payroll_Exceptions__r;

  public com.sforce.soap.enterprise.QueryResult getPayroll_Exceptions__r() {
    return Payroll_Exceptions__r;
  }

  

  public void setPayroll_Exceptions__r(com.sforce.soap.enterprise.QueryResult Payroll_Exceptions__r) {
    this.Payroll_Exceptions__r = Payroll_Exceptions__r;
    Payroll_Exceptions__r__is_set = true;
  }
  
  /**
   * element  : Payroll_History__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Payroll_History__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Payroll_History__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Payroll_History__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Payroll_History__r;

  public com.sforce.soap.enterprise.QueryResult getPayroll_History__r() {
    return Payroll_History__r;
  }

  

  public void setPayroll_History__r(com.sforce.soap.enterprise.QueryResult Payroll_History__r) {
    this.Payroll_History__r = Payroll_History__r;
    Payroll_History__r__is_set = true;
  }
  
  /**
   * element  : Personal_Certifications__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Personal_Certifications__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Personal_Certifications__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Personal_Certifications__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Personal_Certifications__r;

  public com.sforce.soap.enterprise.QueryResult getPersonal_Certifications__r() {
    return Personal_Certifications__r;
  }

  

  public void setPersonal_Certifications__r(com.sforce.soap.enterprise.QueryResult Personal_Certifications__r) {
    this.Personal_Certifications__r = Personal_Certifications__r;
    Personal_Certifications__r__is_set = true;
  }
  
  /**
   * element  : Personal_Skills__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Personal_Skills__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Personal_Skills__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Personal_Skills__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Personal_Skills__r;

  public com.sforce.soap.enterprise.QueryResult getPersonal_Skills__r() {
    return Personal_Skills__r;
  }

  

  public void setPersonal_Skills__r(com.sforce.soap.enterprise.QueryResult Personal_Skills__r) {
    this.Personal_Skills__r = Personal_Skills__r;
    Personal_Skills__r__is_set = true;
  }
  
  /**
   * element  : Personal_Trades__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Personal_Trades__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Personal_Trades__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Personal_Trades__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Personal_Trades__r;

  public com.sforce.soap.enterprise.QueryResult getPersonal_Trades__r() {
    return Personal_Trades__r;
  }

  

  public void setPersonal_Trades__r(com.sforce.soap.enterprise.QueryResult Personal_Trades__r) {
    this.Personal_Trades__r = Personal_Trades__r;
    Personal_Trades__r__is_set = true;
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
   * element  : Primary_Phone_Raw__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Primary_Phone_Raw__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Primary_Phone_Raw__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Primary_Phone_Raw__c__is_set = false;

  private java.lang.String Primary_Phone_Raw__c;

  public java.lang.String getPrimary_Phone_Raw__c() {
    return Primary_Phone_Raw__c;
  }

  

  public void setPrimary_Phone_Raw__c(java.lang.String Primary_Phone_Raw__c) {
    this.Primary_Phone_Raw__c = Primary_Phone_Raw__c;
    Primary_Phone_Raw__c__is_set = true;
  }
  
  /**
   * element  : Primary_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Primary_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Primary_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Primary_Phone__c__is_set = false;

  private java.lang.String Primary_Phone__c;

  public java.lang.String getPrimary_Phone__c() {
    return Primary_Phone__c;
  }

  

  public void setPrimary_Phone__c(java.lang.String Primary_Phone__c) {
    this.Primary_Phone__c = Primary_Phone__c;
    Primary_Phone__c__is_set = true;
  }
  
  /**
   * element  : Primary_is_Mobile__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Primary_is_Mobile__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Primary_is_Mobile__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Primary_is_Mobile__c__is_set = false;

  private java.lang.Boolean Primary_is_Mobile__c;

  public java.lang.Boolean getPrimary_is_Mobile__c() {
    return Primary_is_Mobile__c;
  }

  

  public void setPrimary_is_Mobile__c(java.lang.Boolean Primary_is_Mobile__c) {
    this.Primary_is_Mobile__c = Primary_is_Mobile__c;
    Primary_is_Mobile__c__is_set = true;
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
   * element  : Rogue_Payment_Objects__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Rogue_Payment_Objects__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rogue_Payment_Objects__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Rogue_Payment_Objects__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Rogue_Payment_Objects__r;

  public com.sforce.soap.enterprise.QueryResult getRogue_Payment_Objects__r() {
    return Rogue_Payment_Objects__r;
  }

  

  public void setRogue_Payment_Objects__r(com.sforce.soap.enterprise.QueryResult Rogue_Payment_Objects__r) {
    this.Rogue_Payment_Objects__r = Rogue_Payment_Objects__r;
    Rogue_Payment_Objects__r__is_set = true;
  }
  
  /**
   * element  : SMS_History__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo SMS_History__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SMS_History__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean SMS_History__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult SMS_History__r;

  public com.sforce.soap.enterprise.QueryResult getSMS_History__r() {
    return SMS_History__r;
  }

  

  public void setSMS_History__r(com.sforce.soap.enterprise.QueryResult SMS_History__r) {
    this.SMS_History__r = SMS_History__r;
    SMS_History__r__is_set = true;
  }
  
  /**
   * element  : Safety_Training__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Safety_Training__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Safety_Training__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Safety_Training__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Safety_Training__r;

  public com.sforce.soap.enterprise.QueryResult getSafety_Training__r() {
    return Safety_Training__r;
  }

  

  public void setSafety_Training__r(com.sforce.soap.enterprise.QueryResult Safety_Training__r) {
    this.Safety_Training__r = Safety_Training__r;
    Safety_Training__r__is_set = true;
  }
  
  /**
   * element  : Secondary_Phone_Raw__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Secondary_Phone_Raw__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Secondary_Phone_Raw__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Secondary_Phone_Raw__c__is_set = false;

  private java.lang.String Secondary_Phone_Raw__c;

  public java.lang.String getSecondary_Phone_Raw__c() {
    return Secondary_Phone_Raw__c;
  }

  

  public void setSecondary_Phone_Raw__c(java.lang.String Secondary_Phone_Raw__c) {
    this.Secondary_Phone_Raw__c = Secondary_Phone_Raw__c;
    Secondary_Phone_Raw__c__is_set = true;
  }
  
  /**
   * element  : Secondary_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Secondary_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Secondary_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Secondary_Phone__c__is_set = false;

  private java.lang.String Secondary_Phone__c;

  public java.lang.String getSecondary_Phone__c() {
    return Secondary_Phone__c;
  }

  

  public void setSecondary_Phone__c(java.lang.String Secondary_Phone__c) {
    this.Secondary_Phone__c = Secondary_Phone__c;
    Secondary_Phone__c__is_set = true;
  }
  
  /**
   * element  : Secondary_is_Mobile__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Secondary_is_Mobile__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Secondary_is_Mobile__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Secondary_is_Mobile__c__is_set = false;

  private java.lang.Boolean Secondary_is_Mobile__c;

  public java.lang.Boolean getSecondary_is_Mobile__c() {
    return Secondary_is_Mobile__c;
  }

  

  public void setSecondary_is_Mobile__c(java.lang.Boolean Secondary_is_Mobile__c) {
    this.Secondary_is_Mobile__c = Secondary_is_Mobile__c;
    Secondary_is_Mobile__c__is_set = true;
  }
  
  /**
   * element  : SendTimecard__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo SendTimecard__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SendTimecard__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean SendTimecard__c__is_set = false;

  private java.lang.Boolean SendTimecard__c;

  public java.lang.Boolean getSendTimecard__c() {
    return SendTimecard__c;
  }

  

  public void setSendTimecard__c(java.lang.Boolean SendTimecard__c) {
    this.SendTimecard__c = SendTimecard__c;
    SendTimecard__c__is_set = true;
  }
  
  /**
   * element  : Sex__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Sex__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Sex__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Sex__c__is_set = false;

  private java.lang.String Sex__c;

  public java.lang.String getSex__c() {
    return Sex__c;
  }

  

  public void setSex__c(java.lang.String Sex__c) {
    this.Sex__c = Sex__c;
    Sex__c__is_set = true;
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
   * element  : Social_Security_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Social_Security_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Social_Security_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Social_Security_Number__c__is_set = false;

  private java.lang.String Social_Security_Number__c;

  public java.lang.String getSocial_Security_Number__c() {
    return Social_Security_Number__c;
  }

  

  public void setSocial_Security_Number__c(java.lang.String Social_Security_Number__c) {
    this.Social_Security_Number__c = Social_Security_Number__c;
    Social_Security_Number__c__is_set = true;
  }
  
  /**
   * element  : Source_URL__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Source_URL__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Source_URL__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Source_URL__c__is_set = false;

  private java.lang.String Source_URL__c;

  public java.lang.String getSource_URL__c() {
    return Source_URL__c;
  }

  

  public void setSource_URL__c(java.lang.String Source_URL__c) {
    this.Source_URL__c = Source_URL__c;
    Source_URL__c__is_set = true;
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
   * element  : Sum_of_Ratings__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Sum_of_Ratings__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Sum_of_Ratings__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Sum_of_Ratings__c__is_set = false;

  private java.lang.Double Sum_of_Ratings__c;

  public java.lang.Double getSum_of_Ratings__c() {
    return Sum_of_Ratings__c;
  }

  

  public void setSum_of_Ratings__c(java.lang.Double Sum_of_Ratings__c) {
    this.Sum_of_Ratings__c = Sum_of_Ratings__c;
    Sum_of_Ratings__c__is_set = true;
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
   * element  : Take_Action__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Take_Action__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Take_Action__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Take_Action__c__is_set = false;

  private java.lang.Boolean Take_Action__c;

  public java.lang.Boolean getTake_Action__c() {
    return Take_Action__c;
  }

  

  public void setTake_Action__c(java.lang.Boolean Take_Action__c) {
    this.Take_Action__c = Take_Action__c;
    Take_Action__c__is_set = true;
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
   * element  : Temporary_Address1__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Temporary_Address1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Temporary_Address1__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Temporary_Address1__c__is_set = false;

  private java.lang.String Temporary_Address1__c;

  public java.lang.String getTemporary_Address1__c() {
    return Temporary_Address1__c;
  }

  

  public void setTemporary_Address1__c(java.lang.String Temporary_Address1__c) {
    this.Temporary_Address1__c = Temporary_Address1__c;
    Temporary_Address1__c__is_set = true;
  }
  
  /**
   * element  : Temporary_Address2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Temporary_Address2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Temporary_Address2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Temporary_Address2__c__is_set = false;

  private java.lang.String Temporary_Address2__c;

  public java.lang.String getTemporary_Address2__c() {
    return Temporary_Address2__c;
  }

  

  public void setTemporary_Address2__c(java.lang.String Temporary_Address2__c) {
    this.Temporary_Address2__c = Temporary_Address2__c;
    Temporary_Address2__c__is_set = true;
  }
  
  /**
   * element  : Temporary_City__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Temporary_City__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Temporary_City__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Temporary_City__c__is_set = false;

  private java.lang.String Temporary_City__c;

  public java.lang.String getTemporary_City__c() {
    return Temporary_City__c;
  }

  

  public void setTemporary_City__c(java.lang.String Temporary_City__c) {
    this.Temporary_City__c = Temporary_City__c;
    Temporary_City__c__is_set = true;
  }
  
  /**
   * element  : Temporary_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Temporary_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Temporary_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Temporary_State__c__is_set = false;

  private java.lang.String Temporary_State__c;

  public java.lang.String getTemporary_State__c() {
    return Temporary_State__c;
  }

  

  public void setTemporary_State__c(java.lang.String Temporary_State__c) {
    this.Temporary_State__c = Temporary_State__c;
    Temporary_State__c__is_set = true;
  }
  
  /**
   * element  : Temporary_Zip_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Temporary_Zip_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Temporary_Zip_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Temporary_Zip_Code__c__is_set = false;

  private java.lang.String Temporary_Zip_Code__c;

  public java.lang.String getTemporary_Zip_Code__c() {
    return Temporary_Zip_Code__c;
  }

  

  public void setTemporary_Zip_Code__c(java.lang.String Temporary_Zip_Code__c) {
    this.Temporary_Zip_Code__c = Temporary_Zip_Code__c;
    Temporary_Zip_Code__c__is_set = true;
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
   * element  : Tools_Owned__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Tools_Owned__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tools_Owned__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Tools_Owned__c__is_set = false;

  private java.lang.String Tools_Owned__c;

  public java.lang.String getTools_Owned__c() {
    return Tools_Owned__c;
  }

  

  public void setTools_Owned__c(java.lang.String Tools_Owned__c) {
    this.Tools_Owned__c = Tools_Owned__c;
    Tools_Owned__c__is_set = true;
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
   * element  : Total_Hours_Last_Month__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Hours_Last_Month__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Hours_Last_Month__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Hours_Last_Month__c__is_set = false;

  private java.lang.Double Total_Hours_Last_Month__c;

  public java.lang.Double getTotal_Hours_Last_Month__c() {
    return Total_Hours_Last_Month__c;
  }

  

  public void setTotal_Hours_Last_Month__c(java.lang.Double Total_Hours_Last_Month__c) {
    this.Total_Hours_Last_Month__c = Total_Hours_Last_Month__c;
    Total_Hours_Last_Month__c__is_set = true;
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
   * element  : Trade__r of type {urn:sobject.enterprise.soap.sforce.com}Personal_Trade__c
   * java type: com.sforce.soap.enterprise.sobject.Personal_Trade__c
   */
  private static final com.sforce.ws.bind.TypeInfo Trade__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trade__r","urn:sobject.enterprise.soap.sforce.com","Personal_Trade__c",0,1,true);

  private boolean Trade__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Personal_Trade__c Trade__r;

  public com.sforce.soap.enterprise.sobject.Personal_Trade__c getTrade__r() {
    return Trade__r;
  }

  

  public void setTrade__r(com.sforce.soap.enterprise.sobject.Personal_Trade__c Trade__r) {
    this.Trade__r = Trade__r;
    Trade__r__is_set = true;
  }
  
  /**
   * element  : Trades__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Trades__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Trades__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Trades__c__is_set = false;

  private java.lang.String Trades__c;

  public java.lang.String getTrades__c() {
    return Trades__c;
  }

  

  public void setTrades__c(java.lang.String Trades__c) {
    this.Trades__c = Trades__c;
    Trades__c__is_set = true;
  }
  
  /**
   * element  : Training_Participants__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Training_Participants__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Training_Participants__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Training_Participants__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Training_Participants__r;

  public com.sforce.soap.enterprise.QueryResult getTraining_Participants__r() {
    return Training_Participants__r;
  }

  

  public void setTraining_Participants__r(com.sforce.soap.enterprise.QueryResult Training_Participants__r) {
    this.Training_Participants__r = Training_Participants__r;
    Training_Participants__r__is_set = true;
  }
  
  /**
   * element  : Twitter_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Twitter_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Twitter_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Twitter_ID__c__is_set = false;

  private java.lang.String Twitter_ID__c;

  public java.lang.String getTwitter_ID__c() {
    return Twitter_ID__c;
  }

  

  public void setTwitter_ID__c(java.lang.String Twitter_ID__c) {
    this.Twitter_ID__c = Twitter_ID__c;
    Twitter_ID__c__is_set = true;
  }
  
  /**
   * element  : Two_ID_s__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Two_ID_s__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Two_ID_s__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Two_ID_s__c__is_set = false;

  private java.lang.Boolean Two_ID_s__c;

  public java.lang.Boolean getTwo_ID_s__c() {
    return Two_ID_s__c;
  }

  

  public void setTwo_ID_s__c(java.lang.Boolean Two_ID_s__c) {
    this.Two_ID_s__c = Two_ID_s__c;
    Two_ID_s__c__is_set = true;
  }
  
  /**
   * element  : UE_Claim_Count__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo UE_Claim_Count__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UE_Claim_Count__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean UE_Claim_Count__c__is_set = false;

  private java.lang.Double UE_Claim_Count__c;

  public java.lang.Double getUE_Claim_Count__c() {
    return UE_Claim_Count__c;
  }

  

  public void setUE_Claim_Count__c(java.lang.Double UE_Claim_Count__c) {
    this.UE_Claim_Count__c = UE_Claim_Count__c;
    UE_Claim_Count__c__is_set = true;
  }
  
  /**
   * element  : Unemployment_Claim__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Unemployment_Claim__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Unemployment_Claim__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Unemployment_Claim__c__is_set = false;

  private java.lang.Boolean Unemployment_Claim__c;

  public java.lang.Boolean getUnemployment_Claim__c() {
    return Unemployment_Claim__c;
  }

  

  public void setUnemployment_Claim__c(java.lang.Boolean Unemployment_Claim__c) {
    this.Unemployment_Claim__c = Unemployment_Claim__c;
    Unemployment_Claim__c__is_set = true;
  }
  
  /**
   * element  : Unemployment_Claims__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Unemployment_Claims__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Unemployment_Claims__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Unemployment_Claims__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Unemployment_Claims__r;

  public com.sforce.soap.enterprise.QueryResult getUnemployment_Claims__r() {
    return Unemployment_Claims__r;
  }

  

  public void setUnemployment_Claims__r(com.sforce.soap.enterprise.QueryResult Unemployment_Claims__r) {
    this.Unemployment_Claims__r = Unemployment_Claims__r;
    Unemployment_Claims__r__is_set = true;
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
   * element  : Use_Temporary_Address_Until__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Use_Temporary_Address_Until__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Use_Temporary_Address_Until__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Use_Temporary_Address_Until__c__is_set = false;

  private java.util.Calendar Use_Temporary_Address_Until__c;

  public java.util.Calendar getUse_Temporary_Address_Until__c() {
    return Use_Temporary_Address_Until__c;
  }

  

  public void setUse_Temporary_Address_Until__c(java.util.Calendar Use_Temporary_Address_Until__c) {
    this.Use_Temporary_Address_Until__c = Use_Temporary_Address_Until__c;
    Use_Temporary_Address_Until__c__is_set = true;
  }
  
  /**
   * element  : Use_Temporary_Address__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Use_Temporary_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Use_Temporary_Address__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Use_Temporary_Address__c__is_set = false;

  private java.lang.Boolean Use_Temporary_Address__c;

  public java.lang.Boolean getUse_Temporary_Address__c() {
    return Use_Temporary_Address__c;
  }

  

  public void setUse_Temporary_Address__c(java.lang.Boolean Use_Temporary_Address__c) {
    this.Use_Temporary_Address__c = Use_Temporary_Address__c;
    Use_Temporary_Address__c__is_set = true;
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
   * element  : Verification_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Verification_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Verification_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Verification_Status__c__is_set = false;

  private java.lang.String Verification_Status__c;

  public java.lang.String getVerification_Status__c() {
    return Verification_Status__c;
  }

  

  public void setVerification_Status__c(java.lang.String Verification_Status__c) {
    this.Verification_Status__c = Verification_Status__c;
    Verification_Status__c__is_set = true;
  }
  
  /**
   * element  : Verified_By__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Verified_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Verified_By__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Verified_By__c__is_set = false;

  private java.lang.String Verified_By__c;

  public java.lang.String getVerified_By__c() {
    return Verified_By__c;
  }

  

  public void setVerified_By__c(java.lang.String Verified_By__c) {
    this.Verified_By__c = Verified_By__c;
    Verified_By__c__is_set = true;
  }
  
  /**
   * element  : Verified_On__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Verified_On__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Verified_On__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean Verified_On__c__is_set = false;

  private java.util.Calendar Verified_On__c;

  public java.util.Calendar getVerified_On__c() {
    return Verified_On__c;
  }

  

  public void setVerified_On__c(java.util.Calendar Verified_On__c) {
    this.Verified_On__c = Verified_On__c;
    Verified_On__c__is_set = true;
  }
  
  /**
   * element  : Verified__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Verified__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Verified__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Verified__c__is_set = false;

  private java.lang.Boolean Verified__c;

  public java.lang.Boolean getVerified__c() {
    return Verified__c;
  }

  

  public void setVerified__c(java.lang.Boolean Verified__c) {
    this.Verified__c = Verified__c;
    Verified__c__is_set = true;
  }
  
  /**
   * element  : W4__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo W4__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","W4__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean W4__c__is_set = false;

  private java.lang.Boolean W4__c;

  public java.lang.Boolean getW4__c() {
    return W4__c;
  }

  

  public void setW4__c(java.lang.Boolean W4__c) {
    this.W4__c = W4__c;
    W4__c__is_set = true;
  }
  
  /**
   * element  : W_4_Forms__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo W_4_Forms__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","W_4_Forms__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean W_4_Forms__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult W_4_Forms__r;

  public com.sforce.soap.enterprise.QueryResult getW_4_Forms__r() {
    return W_4_Forms__r;
  }

  

  public void setW_4_Forms__r(com.sforce.soap.enterprise.QueryResult W_4_Forms__r) {
    this.W_4_Forms__r = W_4_Forms__r;
    W_4_Forms__r__is_set = true;
  }
  
  /**
   * element  : Weeks_Since_Last_Paycheck__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Weeks_Since_Last_Paycheck__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Weeks_Since_Last_Paycheck__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Weeks_Since_Last_Paycheck__c__is_set = false;

  private java.lang.Double Weeks_Since_Last_Paycheck__c;

  public java.lang.Double getWeeks_Since_Last_Paycheck__c() {
    return Weeks_Since_Last_Paycheck__c;
  }

  

  public void setWeeks_Since_Last_Paycheck__c(java.lang.Double Weeks_Since_Last_Paycheck__c) {
    this.Weeks_Since_Last_Paycheck__c = Weeks_Since_Last_Paycheck__c;
    Weeks_Since_Last_Paycheck__c__is_set = true;
  }
  
  /**
   * element  : Zip_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Zip_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Zip_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Zip_Code__c__is_set = false;

  private java.lang.String Zip_Code__c;

  public java.lang.String getZip_Code__c() {
    return Zip_Code__c;
  }

  

  public void setZip_Code__c(java.lang.String Zip_Code__c) {
    this.Zip_Code__c = Zip_Code__c;
    Zip_Code__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Candidate_Employee__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ACA_Opt_Out_Received__c__typeInfo, ACA_Opt_Out_Received__c, ACA_Opt_Out_Received__c__is_set);
    __typeMapper.writeObject(__out, Accepted_Terms_Verification_and_Release__c__typeInfo, Accepted_Terms_Verification_and_Release__c, Accepted_Terms_Verification_and_Release__c__is_set);
    __typeMapper.writeObject(__out, Active__c__typeInfo, Active__c, Active__c__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeString(__out, Address1__c__typeInfo, Address1__c, Address1__c__is_set);
    __typeMapper.writeString(__out, Address2__c__typeInfo, Address2__c, Address2__c__is_set);
    __typeMapper.writeString(__out, Address_ID__c__typeInfo, Address_ID__c, Address_ID__c__is_set);
    __typeMapper.writeString(__out, Advertisement__c__typeInfo, Advertisement__c, Advertisement__c__is_set);
    __typeMapper.writeObject(__out, Advertisement__r__typeInfo, Advertisement__r, Advertisement__r__is_set);
    __typeMapper.writeObject(__out, Age__c__typeInfo, Age__c, Age__c__is_set);
    __typeMapper.writeObject(__out, Agreements__r__typeInfo, Agreements__r, Agreements__r__is_set);
    __typeMapper.writeString(__out, Applicant__c__typeInfo, Applicant__c, Applicant__c__is_set);
    __typeMapper.writeObject(__out, Applicant__r__typeInfo, Applicant__r, Applicant__r__is_set);
    __typeMapper.writeObject(__out, Applicants__r__typeInfo, Applicants__r, Applicants__r__is_set);
    __typeMapper.writeObject(__out, Assignments__r__typeInfo, Assignments__r, Assignments__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Average_Rating__c__typeInfo, Average_Rating__c, Average_Rating__c__is_set);
    __typeMapper.writeObject(__out, Avg_Weekly_Hours_Last_Month__c__typeInfo, Avg_Weekly_Hours_Last_Month__c, Avg_Weekly_Hours_Last_Month__c__is_set);
    __typeMapper.writeString(__out, BA_Reference_ID__c__typeInfo, BA_Reference_ID__c, BA_Reference_ID__c__is_set);
    __typeMapper.writeObject(__out, Background_Checks__r__typeInfo, Background_Checks__r, Background_Checks__r__is_set);
    __typeMapper.writeObject(__out, Broadcast_Contact__r__typeInfo, Broadcast_Contact__r, Broadcast_Contact__r__is_set);
    __typeMapper.writeString(__out, Call_In_Note__c__typeInfo, Call_In_Note__c, Call_In_Note__c__is_set);
    __typeMapper.writeObject(__out, Candidate_Geocodes__r__typeInfo, Candidate_Geocodes__r, Candidate_Geocodes__r__is_set);
    __typeMapper.writeString(__out, Candidate_Status__c__typeInfo, Candidate_Status__c, Candidate_Status__c__is_set);
    __typeMapper.writeString(__out, Candidate_Type__c__typeInfo, Candidate_Type__c, Candidate_Type__c__is_set);
    __typeMapper.writeObject(__out, Cases__r__typeInfo, Cases__r, Cases__r__is_set);
    __typeMapper.writeObject(__out, Certified_Submission_Correct_Accurate__c__typeInfo, Certified_Submission_Correct_Accurate__c, Certified_Submission_Correct_Accurate__c__is_set);
    __typeMapper.writeObject(__out, Child_Support_Or_Garnishment_Order__c__typeInfo, Child_Support_Or_Garnishment_Order__c, Child_Support_Or_Garnishment_Order__c__is_set);
    __typeMapper.writeObject(__out, Child_Support_Orders__c__typeInfo, Child_Support_Orders__c, Child_Support_Orders__c__is_set);
    __typeMapper.writeString(__out, Child_Support__c__typeInfo, Child_Support__c, Child_Support__c__is_set);
    __typeMapper.writeObject(__out, Child_Support__r__typeInfo, Child_Support__r, Child_Support__r__is_set);
    __typeMapper.writeString(__out, City__c__typeInfo, City__c, City__c__is_set);
    __typeMapper.writeObject(__out, Client_Bans__c__typeInfo, Client_Bans__c, Client_Bans__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, Contact_Number__c__typeInfo, Contact_Number__c, Contact_Number__c__is_set);
    __typeMapper.writeObject(__out, Contacted_for_Tax_Paperwork__c__typeInfo, Contacted_for_Tax_Paperwork__c, Contacted_for_Tax_Paperwork__c__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, DD_on_File__c__typeInfo, DD_on_File__c, DD_on_File__c__is_set);
    __typeMapper.writeObject(__out, Date_Available__c__typeInfo, Date_Available__c, Date_Available__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Birth__c__typeInfo, Date_of_Birth__c, Date_of_Birth__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Last_Candidate_Type_Change__c__typeInfo, Date_of_Last_Candidate_Type_Change__c, Date_of_Last_Candidate_Type_Change__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Last_Status_Change__c__typeInfo, Date_of_Last_Status_Change__c, Date_of_Last_Status_Change__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Tax_Paperwork__c__typeInfo, Date_of_Tax_Paperwork__c, Date_of_Tax_Paperwork__c__is_set);
    __typeMapper.writeObject(__out, Days_Since_1st_Pay__c__typeInfo, Days_Since_1st_Pay__c, Days_Since_1st_Pay__c__is_set);
    __typeMapper.writeObject(__out, Deduction_Set_Up_in_GP__c__typeInfo, Deduction_Set_Up_in_GP__c, Deduction_Set_Up_in_GP__c__is_set);
    __typeMapper.writeString(__out, Division__c__typeInfo, Division__c, Division__c__is_set);
    __typeMapper.writeObject(__out, Division__r__typeInfo, Division__r, Division__r__is_set);
    __typeMapper.writeObject(__out, Do_Not_Assign_To__r__typeInfo, Do_Not_Assign_To__r, Do_Not_Assign_To__r__is_set);
    __typeMapper.writeString(__out, Documentation_Status__c__typeInfo, Documentation_Status__c, Documentation_Status__c__is_set);
    __typeMapper.writeObject(__out, Drug_Tests__r__typeInfo, Drug_Tests__r, Drug_Tests__r__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Education__r__typeInfo, Education__r, Education__r__is_set);
    __typeMapper.writeString(__out, Email_1__c__typeInfo, Email_1__c, Email_1__c__is_set);
    __typeMapper.writeString(__out, Email_2__c__typeInfo, Email_2__c, Email_2__c__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, Emails__r__typeInfo, Emails__r, Emails__r__is_set);
    __typeMapper.writeObject(__out, Emergency_Contacts__r__typeInfo, Emergency_Contacts__r, Emergency_Contacts__r__is_set);
    __typeMapper.writeString(__out, Employee_ID__c__typeInfo, Employee_ID__c, Employee_ID__c__is_set);
    __typeMapper.writeObject(__out, Employment_Paperwork2__r__typeInfo, Employment_Paperwork2__r, Employment_Paperwork2__r__is_set);
    __typeMapper.writeObject(__out, Employments__r__typeInfo, Employments__r, Employments__r__is_set);
    __typeMapper.writeString(__out, Ethnicity__c__typeInfo, Ethnicity__c, Ethnicity__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FE_Bonuses1__r__typeInfo, FE_Bonuses1__r, FE_Bonuses1__r__is_set);
    __typeMapper.writeObject(__out, FE_Bonuses__r__typeInfo, FE_Bonuses__r, FE_Bonuses__r__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, Field_Expenses__r__typeInfo, Field_Expenses__r, Field_Expenses__r__is_set);
    __typeMapper.writeObject(__out, First_Check_Date__c__typeInfo, First_Check_Date__c, First_Check_Date__c__is_set);
    __typeMapper.writeObject(__out, First_Day_Worked__c__typeInfo, First_Day_Worked__c, First_Day_Worked__c__is_set);
    __typeMapper.writeString(__out, First_Name__c__typeInfo, First_Name__c, First_Name__c__is_set);
    __typeMapper.writeObject(__out, First_Timecard__c__typeInfo, First_Timecard__c, First_Timecard__c__is_set);
    __typeMapper.writeObject(__out, Fraud__r__typeInfo, Fraud__r, Fraud__r__is_set);
    __typeMapper.writeString(__out, Full_Name__c__typeInfo, Full_Name__c, Full_Name__c__is_set);
    __typeMapper.writeString(__out, Geo_Code_Status__c__typeInfo, Geo_Code_Status__c, Geo_Code_Status__c__is_set);
    __typeMapper.writeObject(__out, Guarantees__r__typeInfo, Guarantees__r, Guarantees__r__is_set);
    __typeMapper.writeObject(__out, HR_Requests__r__typeInfo, HR_Requests__r, HR_Requests__r__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, I9__c__typeInfo, I9__c, I9__c__is_set);
    __typeMapper.writeObject(__out, I_9_Forms__r__typeInfo, I_9_Forms__r, I_9_Forms__r__is_set);
    __typeMapper.writeString(__out, Import_Date__c__typeInfo, Import_Date__c, Import_Date__c__is_set);
    __typeMapper.writeString(__out, Import_Source__c__typeInfo, Import_Source__c, Import_Source__c__is_set);
    __typeMapper.writeString(__out, Imported_Last_Employer__c__typeInfo, Imported_Last_Employer__c, Imported_Last_Employer__c__is_set);
    __typeMapper.writeString(__out, Imported_Resume_Notes__c__typeInfo, Imported_Resume_Notes__c, Imported_Resume_Notes__c__is_set);
    __typeMapper.writeString(__out, Imported_Years_Experience__c__typeInfo, Imported_Years_Experience__c, Imported_Years_Experience__c__is_set);
    __typeMapper.writeObject(__out, Incoming_SMS__r__typeInfo, Incoming_SMS__r, Incoming_SMS__r__is_set);
    __typeMapper.writeString(__out, Insurance_Eligible__c__typeInfo, Insurance_Eligible__c, Insurance_Eligible__c__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Job_Reference_Number__c__typeInfo, Job_Reference_Number__c, Job_Reference_Number__c__is_set);
    __typeMapper.writeString(__out, Jobs_will_not_take__c__typeInfo, Jobs_will_not_take__c, Jobs_will_not_take__c__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeString(__out, Last_Assigned_With__c__typeInfo, Last_Assigned_With__c, Last_Assigned_With__c__is_set);
    __typeMapper.writeObject(__out, Last_Assignment_Ended__c__typeInfo, Last_Assignment_Ended__c, Last_Assignment_Ended__c__is_set);
    __typeMapper.writeString(__out, Last_Name__c__typeInfo, Last_Name__c, Last_Name__c__is_set);
    __typeMapper.writeString(__out, Last_PDNB__c__typeInfo, Last_PDNB__c, Last_PDNB__c__is_set);
    __typeMapper.writeString(__out, Last_Regular_Pay__c__typeInfo, Last_Regular_Pay__c, Last_Regular_Pay__c__is_set);
    __typeMapper.writeObject(__out, Last_Vacation_Date__c__typeInfo, Last_Vacation_Date__c, Last_Vacation_Date__c__is_set);
    __typeMapper.writeObject(__out, Lat__c__typeInfo, Lat__c, Lat__c__is_set);
    __typeMapper.writeObject(__out, Location__Latitude__s__typeInfo, Location__Latitude__s, Location__Latitude__s__is_set);
    __typeMapper.writeObject(__out, Location__Longitude__s__typeInfo, Location__Longitude__s, Location__Longitude__s__is_set);
    __typeMapper.writeObject(__out, Location__c__typeInfo, Location__c, Location__c__is_set);
    __typeMapper.writeObject(__out, Lon__c__typeInfo, Lon__c, Lon__c__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Middle_Name__c__typeInfo, Middle_Name__c, Middle_Name__c__is_set);
    __typeMapper.writeObject(__out, Most_Recent_Check_Date__c__typeInfo, Most_Recent_Check_Date__c, Most_Recent_Check_Date__c__is_set);
    __typeMapper.writeObject(__out, Most_Recent_Timecard__c__typeInfo, Most_Recent_Timecard__c, Most_Recent_Timecard__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, Nickname__c__typeInfo, Nickname__c, Nickname__c__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, Number_of_Assignments__c__typeInfo, Number_of_Assignments__c, Number_of_Assignments__c__is_set);
    __typeMapper.writeObject(__out, Number_of_Injuries__c__typeInfo, Number_of_Injuries__c, Number_of_Injuries__c__is_set);
    __typeMapper.writeObject(__out, Number_of_Ratings__c__typeInfo, Number_of_Ratings__c, Number_of_Ratings__c__is_set);
    __typeMapper.writeObject(__out, OK_to_send_Text_Messages__c__typeInfo, OK_to_send_Text_Messages__c, OK_to_send_Text_Messages__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Original_Time_Cards__r__typeInfo, Original_Time_Cards__r, Original_Time_Cards__r__is_set);
    __typeMapper.writeString(__out, Own_Tools__c__typeInfo, Own_Tools__c, Own_Tools__c__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, PPE__r__typeInfo, PPE__r, PPE__r__is_set);
    __typeMapper.writeObject(__out, Payroll_Advances__r__typeInfo, Payroll_Advances__r, Payroll_Advances__r__is_set);
    __typeMapper.writeObject(__out, Payroll_Exceptions__r__typeInfo, Payroll_Exceptions__r, Payroll_Exceptions__r__is_set);
    __typeMapper.writeObject(__out, Payroll_History__r__typeInfo, Payroll_History__r, Payroll_History__r__is_set);
    __typeMapper.writeObject(__out, Personal_Certifications__r__typeInfo, Personal_Certifications__r, Personal_Certifications__r__is_set);
    __typeMapper.writeObject(__out, Personal_Skills__r__typeInfo, Personal_Skills__r, Personal_Skills__r__is_set);
    __typeMapper.writeObject(__out, Personal_Trades__r__typeInfo, Personal_Trades__r, Personal_Trades__r__is_set);
    __typeMapper.writeObject(__out, Potential_Candidate_Lists__r__typeInfo, Potential_Candidate_Lists__r, Potential_Candidate_Lists__r__is_set);
    __typeMapper.writeString(__out, Primary_Phone_Raw__c__typeInfo, Primary_Phone_Raw__c, Primary_Phone_Raw__c__is_set);
    __typeMapper.writeString(__out, Primary_Phone__c__typeInfo, Primary_Phone__c, Primary_Phone__c__is_set);
    __typeMapper.writeObject(__out, Primary_is_Mobile__c__typeInfo, Primary_is_Mobile__c, Primary_is_Mobile__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, Proxy__r__typeInfo, Proxy__r, Proxy__r__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeString(__out, Region__c__typeInfo, Region__c, Region__c__is_set);
    __typeMapper.writeObject(__out, Region__r__typeInfo, Region__r, Region__r__is_set);
    __typeMapper.writeObject(__out, Rogue_Payment_Objects__r__typeInfo, Rogue_Payment_Objects__r, Rogue_Payment_Objects__r__is_set);
    __typeMapper.writeObject(__out, SMS_History__r__typeInfo, SMS_History__r, SMS_History__r__is_set);
    __typeMapper.writeObject(__out, Safety_Training__r__typeInfo, Safety_Training__r, Safety_Training__r__is_set);
    __typeMapper.writeString(__out, Secondary_Phone_Raw__c__typeInfo, Secondary_Phone_Raw__c, Secondary_Phone_Raw__c__is_set);
    __typeMapper.writeString(__out, Secondary_Phone__c__typeInfo, Secondary_Phone__c, Secondary_Phone__c__is_set);
    __typeMapper.writeObject(__out, Secondary_is_Mobile__c__typeInfo, Secondary_is_Mobile__c, Secondary_is_Mobile__c__is_set);
    __typeMapper.writeObject(__out, SendTimecard__c__typeInfo, SendTimecard__c, SendTimecard__c__is_set);
    __typeMapper.writeString(__out, Sex__c__typeInfo, Sex__c, Sex__c__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeString(__out, Social_Security_Number__c__typeInfo, Social_Security_Number__c, Social_Security_Number__c__is_set);
    __typeMapper.writeString(__out, Source_URL__c__typeInfo, Source_URL__c, Source_URL__c__is_set);
    __typeMapper.writeString(__out, State__c__typeInfo, State__c, State__c__is_set);
    __typeMapper.writeObject(__out, Sum_of_Ratings__c__typeInfo, Sum_of_Ratings__c, Sum_of_Ratings__c__is_set);
    __typeMapper.writeObject(__out, Surveys__r__typeInfo, Surveys__r, Surveys__r__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, Take_Action__c__typeInfo, Take_Action__c, Take_Action__c__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeString(__out, Temporary_Address1__c__typeInfo, Temporary_Address1__c, Temporary_Address1__c__is_set);
    __typeMapper.writeString(__out, Temporary_Address2__c__typeInfo, Temporary_Address2__c, Temporary_Address2__c__is_set);
    __typeMapper.writeString(__out, Temporary_City__c__typeInfo, Temporary_City__c, Temporary_City__c__is_set);
    __typeMapper.writeString(__out, Temporary_State__c__typeInfo, Temporary_State__c, Temporary_State__c__is_set);
    __typeMapper.writeString(__out, Temporary_Zip_Code__c__typeInfo, Temporary_Zip_Code__c, Temporary_Zip_Code__c__is_set);
    __typeMapper.writeObject(__out, Timesheets__r__typeInfo, Timesheets__r, Timesheets__r__is_set);
    __typeMapper.writeString(__out, Tools_Owned__c__typeInfo, Tools_Owned__c, Tools_Owned__c__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, Total_Hours_Last_Month__c__typeInfo, Total_Hours_Last_Month__c, Total_Hours_Last_Month__c__is_set);
    __typeMapper.writeObject(__out, Total_Hours_Worked__c__typeInfo, Total_Hours_Worked__c, Total_Hours_Worked__c__is_set);
    __typeMapper.writeString(__out, Trade__c__typeInfo, Trade__c, Trade__c__is_set);
    __typeMapper.writeObject(__out, Trade__r__typeInfo, Trade__r, Trade__r__is_set);
    __typeMapper.writeString(__out, Trades__c__typeInfo, Trades__c, Trades__c__is_set);
    __typeMapper.writeObject(__out, Training_Participants__r__typeInfo, Training_Participants__r, Training_Participants__r__is_set);
    __typeMapper.writeString(__out, Twitter_ID__c__typeInfo, Twitter_ID__c, Twitter_ID__c__is_set);
    __typeMapper.writeObject(__out, Two_ID_s__c__typeInfo, Two_ID_s__c, Two_ID_s__c__is_set);
    __typeMapper.writeObject(__out, UE_Claim_Count__c__typeInfo, UE_Claim_Count__c, UE_Claim_Count__c__is_set);
    __typeMapper.writeObject(__out, Unemployment_Claim__c__typeInfo, Unemployment_Claim__c, Unemployment_Claim__c__is_set);
    __typeMapper.writeObject(__out, Unemployment_Claims__r__typeInfo, Unemployment_Claims__r, Unemployment_Claims__r__is_set);
    __typeMapper.writeObject(__out, Unverified_Time__r__typeInfo, Unverified_Time__r, Unverified_Time__r__is_set);
    __typeMapper.writeObject(__out, Use_Temporary_Address_Until__c__typeInfo, Use_Temporary_Address_Until__c, Use_Temporary_Address_Until__c__is_set);
    __typeMapper.writeObject(__out, Use_Temporary_Address__c__typeInfo, Use_Temporary_Address__c, Use_Temporary_Address__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeString(__out, Verification_Status__c__typeInfo, Verification_Status__c, Verification_Status__c__is_set);
    __typeMapper.writeString(__out, Verified_By__c__typeInfo, Verified_By__c, Verified_By__c__is_set);
    __typeMapper.writeObject(__out, Verified_On__c__typeInfo, Verified_On__c, Verified_On__c__is_set);
    __typeMapper.writeObject(__out, Verified__c__typeInfo, Verified__c, Verified__c__is_set);
    __typeMapper.writeObject(__out, W4__c__typeInfo, W4__c, W4__c__is_set);
    __typeMapper.writeObject(__out, W_4_Forms__r__typeInfo, W_4_Forms__r, W_4_Forms__r__is_set);
    __typeMapper.writeObject(__out, Weeks_Since_Last_Paycheck__c__typeInfo, Weeks_Since_Last_Paycheck__c, Weeks_Since_Last_Paycheck__c__is_set);
    __typeMapper.writeString(__out, Zip_Code__c__typeInfo, Zip_Code__c, Zip_Code__c__is_set);
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
    if (__typeMapper.isElement(__in, ACA_Opt_Out_Received__c__typeInfo)) {
      setACA_Opt_Out_Received__c((java.util.Calendar)__typeMapper.readObject(__in, ACA_Opt_Out_Received__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Accepted_Terms_Verification_and_Release__c__typeInfo)) {
      setAccepted_Terms_Verification_and_Release__c((java.lang.Boolean)__typeMapper.readObject(__in, Accepted_Terms_Verification_and_Release__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Active__c__typeInfo)) {
      setActive__c((java.lang.Double)__typeMapper.readObject(__in, Active__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address1__c__typeInfo)) {
      setAddress1__c((java.lang.String)__typeMapper.readString(__in, Address1__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address2__c__typeInfo)) {
      setAddress2__c((java.lang.String)__typeMapper.readString(__in, Address2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address_ID__c__typeInfo)) {
      setAddress_ID__c((java.lang.String)__typeMapper.readString(__in, Address_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Advertisement__c__typeInfo)) {
      setAdvertisement__c((java.lang.String)__typeMapper.readString(__in, Advertisement__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Advertisement__r__typeInfo)) {
      setAdvertisement__r((com.sforce.soap.enterprise.sobject.Ads__c)__typeMapper.readObject(__in, Advertisement__r__typeInfo, com.sforce.soap.enterprise.sobject.Ads__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Age__c__typeInfo)) {
      setAge__c((java.lang.Double)__typeMapper.readObject(__in, Age__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Agreements__r__typeInfo)) {
      setAgreements__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Agreements__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Applicant__c__typeInfo)) {
      setApplicant__c((java.lang.String)__typeMapper.readString(__in, Applicant__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Applicant__r__typeInfo)) {
      setApplicant__r((com.sforce.soap.enterprise.sobject.Applicant__c)__typeMapper.readObject(__in, Applicant__r__typeInfo, com.sforce.soap.enterprise.sobject.Applicant__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Applicants__r__typeInfo)) {
      setApplicants__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Applicants__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Average_Rating__c__typeInfo)) {
      setAverage_Rating__c((java.lang.String)__typeMapper.readString(__in, Average_Rating__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Avg_Weekly_Hours_Last_Month__c__typeInfo)) {
      setAvg_Weekly_Hours_Last_Month__c((java.lang.Double)__typeMapper.readObject(__in, Avg_Weekly_Hours_Last_Month__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BA_Reference_ID__c__typeInfo)) {
      setBA_Reference_ID__c((java.lang.String)__typeMapper.readString(__in, BA_Reference_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Background_Checks__r__typeInfo)) {
      setBackground_Checks__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Background_Checks__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Broadcast_Contact__r__typeInfo)) {
      setBroadcast_Contact__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Broadcast_Contact__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Call_In_Note__c__typeInfo)) {
      setCall_In_Note__c((java.lang.String)__typeMapper.readString(__in, Call_In_Note__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Geocodes__r__typeInfo)) {
      setCandidate_Geocodes__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Candidate_Geocodes__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Status__c__typeInfo)) {
      setCandidate_Status__c((java.lang.String)__typeMapper.readString(__in, Candidate_Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Type__c__typeInfo)) {
      setCandidate_Type__c((java.lang.String)__typeMapper.readString(__in, Candidate_Type__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cases__r__typeInfo)) {
      setCases__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Certified_Submission_Correct_Accurate__c__typeInfo)) {
      setCertified_Submission_Correct_Accurate__c((java.lang.Boolean)__typeMapper.readObject(__in, Certified_Submission_Correct_Accurate__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Child_Support_Or_Garnishment_Order__c__typeInfo)) {
      setChild_Support_Or_Garnishment_Order__c((java.lang.Boolean)__typeMapper.readObject(__in, Child_Support_Or_Garnishment_Order__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Child_Support_Orders__c__typeInfo)) {
      setChild_Support_Orders__c((java.lang.Double)__typeMapper.readObject(__in, Child_Support_Orders__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Child_Support__c__typeInfo)) {
      setChild_Support__c((java.lang.String)__typeMapper.readString(__in, Child_Support__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Child_Support__r__typeInfo)) {
      setChild_Support__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Child_Support__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, City__c__typeInfo)) {
      setCity__c((java.lang.String)__typeMapper.readString(__in, City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Client_Bans__c__typeInfo)) {
      setClient_Bans__c((java.lang.Double)__typeMapper.readObject(__in, Client_Bans__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contact_Number__c__typeInfo)) {
      setContact_Number__c((java.lang.String)__typeMapper.readString(__in, Contact_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contacted_for_Tax_Paperwork__c__typeInfo)) {
      setContacted_for_Tax_Paperwork__c((java.lang.Boolean)__typeMapper.readObject(__in, Contacted_for_Tax_Paperwork__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, DD_on_File__c__typeInfo)) {
      setDD_on_File__c((java.lang.Boolean)__typeMapper.readObject(__in, DD_on_File__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_Available__c__typeInfo)) {
      setDate_Available__c((java.util.Calendar)__typeMapper.readObject(__in, Date_Available__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Birth__c__typeInfo)) {
      setDate_of_Birth__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Birth__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Last_Candidate_Type_Change__c__typeInfo)) {
      setDate_of_Last_Candidate_Type_Change__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Last_Candidate_Type_Change__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Last_Status_Change__c__typeInfo)) {
      setDate_of_Last_Status_Change__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Last_Status_Change__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Tax_Paperwork__c__typeInfo)) {
      setDate_of_Tax_Paperwork__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Tax_Paperwork__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Days_Since_1st_Pay__c__typeInfo)) {
      setDays_Since_1st_Pay__c((java.lang.Double)__typeMapper.readObject(__in, Days_Since_1st_Pay__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Deduction_Set_Up_in_GP__c__typeInfo)) {
      setDeduction_Set_Up_in_GP__c((java.util.Calendar)__typeMapper.readObject(__in, Deduction_Set_Up_in_GP__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Do_Not_Assign_To__r__typeInfo)) {
      setDo_Not_Assign_To__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Do_Not_Assign_To__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Documentation_Status__c__typeInfo)) {
      setDocumentation_Status__c((java.lang.String)__typeMapper.readString(__in, Documentation_Status__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Education__r__typeInfo)) {
      setEducation__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Education__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email_1__c__typeInfo)) {
      setEmail_1__c((java.lang.String)__typeMapper.readString(__in, Email_1__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email_2__c__typeInfo)) {
      setEmail_2__c((java.lang.String)__typeMapper.readString(__in, Email_2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__r__typeInfo)) {
      setEmails__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emergency_Contacts__r__typeInfo)) {
      setEmergency_Contacts__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emergency_Contacts__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee_ID__c__typeInfo)) {
      setEmployee_ID__c((java.lang.String)__typeMapper.readString(__in, Employee_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employment_Paperwork2__r__typeInfo)) {
      setEmployment_Paperwork2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Employment_Paperwork2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employments__r__typeInfo)) {
      setEmployments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Employments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Ethnicity__c__typeInfo)) {
      setEthnicity__c((java.lang.String)__typeMapper.readString(__in, Ethnicity__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, FE_Bonuses1__r__typeInfo)) {
      setFE_Bonuses1__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FE_Bonuses1__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Field_Expenses__r__typeInfo)) {
      setField_Expenses__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Field_Expenses__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, First_Check_Date__c__typeInfo)) {
      setFirst_Check_Date__c((java.util.Calendar)__typeMapper.readObject(__in, First_Check_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, First_Day_Worked__c__typeInfo)) {
      setFirst_Day_Worked__c((java.util.Calendar)__typeMapper.readObject(__in, First_Day_Worked__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, First_Name__c__typeInfo)) {
      setFirst_Name__c((java.lang.String)__typeMapper.readString(__in, First_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, First_Timecard__c__typeInfo)) {
      setFirst_Timecard__c((java.util.Calendar)__typeMapper.readObject(__in, First_Timecard__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fraud__r__typeInfo)) {
      setFraud__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Fraud__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Full_Name__c__typeInfo)) {
      setFull_Name__c((java.lang.String)__typeMapper.readString(__in, Full_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Geo_Code_Status__c__typeInfo)) {
      setGeo_Code_Status__c((java.lang.String)__typeMapper.readString(__in, Geo_Code_Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Guarantees__r__typeInfo)) {
      setGuarantees__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Guarantees__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HR_Requests__r__typeInfo)) {
      setHR_Requests__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, HR_Requests__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, I9__c__typeInfo)) {
      setI9__c((java.lang.Boolean)__typeMapper.readObject(__in, I9__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, I_9_Forms__r__typeInfo)) {
      setI_9_Forms__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, I_9_Forms__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Import_Date__c__typeInfo)) {
      setImport_Date__c((java.lang.String)__typeMapper.readString(__in, Import_Date__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Import_Source__c__typeInfo)) {
      setImport_Source__c((java.lang.String)__typeMapper.readString(__in, Import_Source__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Imported_Last_Employer__c__typeInfo)) {
      setImported_Last_Employer__c((java.lang.String)__typeMapper.readString(__in, Imported_Last_Employer__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Imported_Resume_Notes__c__typeInfo)) {
      setImported_Resume_Notes__c((java.lang.String)__typeMapper.readString(__in, Imported_Resume_Notes__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Imported_Years_Experience__c__typeInfo)) {
      setImported_Years_Experience__c((java.lang.String)__typeMapper.readString(__in, Imported_Years_Experience__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Incoming_SMS__r__typeInfo)) {
      setIncoming_SMS__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Incoming_SMS__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Insurance_Eligible__c__typeInfo)) {
      setInsurance_Eligible__c((java.lang.String)__typeMapper.readString(__in, Insurance_Eligible__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Job_Reference_Number__c__typeInfo)) {
      setJob_Reference_Number__c((java.lang.String)__typeMapper.readString(__in, Job_Reference_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Jobs_will_not_take__c__typeInfo)) {
      setJobs_will_not_take__c((java.lang.String)__typeMapper.readString(__in, Jobs_will_not_take__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Last_Assigned_With__c__typeInfo)) {
      setLast_Assigned_With__c((java.lang.String)__typeMapper.readString(__in, Last_Assigned_With__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Last_Assignment_Ended__c__typeInfo)) {
      setLast_Assignment_Ended__c((java.util.Calendar)__typeMapper.readObject(__in, Last_Assignment_Ended__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Last_Name__c__typeInfo)) {
      setLast_Name__c((java.lang.String)__typeMapper.readString(__in, Last_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Last_PDNB__c__typeInfo)) {
      setLast_PDNB__c((java.lang.String)__typeMapper.readString(__in, Last_PDNB__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Last_Regular_Pay__c__typeInfo)) {
      setLast_Regular_Pay__c((java.lang.String)__typeMapper.readString(__in, Last_Regular_Pay__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Last_Vacation_Date__c__typeInfo)) {
      setLast_Vacation_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Last_Vacation_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Lat__c__typeInfo)) {
      setLat__c((java.lang.Double)__typeMapper.readObject(__in, Lat__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Location__Latitude__s__typeInfo)) {
      setLocation__Latitude__s((java.lang.Double)__typeMapper.readObject(__in, Location__Latitude__s__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Location__Longitude__s__typeInfo)) {
      setLocation__Longitude__s((java.lang.Double)__typeMapper.readObject(__in, Location__Longitude__s__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Location__c__typeInfo)) {
      setLocation__c((com.sforce.soap.enterprise.Location)__typeMapper.readObject(__in, Location__c__typeInfo, com.sforce.soap.enterprise.Location.class));
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
    if (__typeMapper.isElement(__in, Middle_Name__c__typeInfo)) {
      setMiddle_Name__c((java.lang.String)__typeMapper.readString(__in, Middle_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Most_Recent_Check_Date__c__typeInfo)) {
      setMost_Recent_Check_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Most_Recent_Check_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Nickname__c__typeInfo)) {
      setNickname__c((java.lang.String)__typeMapper.readString(__in, Nickname__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Number_of_Injuries__c__typeInfo)) {
      setNumber_of_Injuries__c((java.lang.Double)__typeMapper.readObject(__in, Number_of_Injuries__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Number_of_Ratings__c__typeInfo)) {
      setNumber_of_Ratings__c((java.lang.Double)__typeMapper.readObject(__in, Number_of_Ratings__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OK_to_send_Text_Messages__c__typeInfo)) {
      setOK_to_send_Text_Messages__c((java.lang.Boolean)__typeMapper.readObject(__in, OK_to_send_Text_Messages__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Original_Time_Cards__r__typeInfo)) {
      setOriginal_Time_Cards__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Original_Time_Cards__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Own_Tools__c__typeInfo)) {
      setOwn_Tools__c((java.lang.String)__typeMapper.readString(__in, Own_Tools__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, PPE__r__typeInfo)) {
      setPPE__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PPE__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payroll_Advances__r__typeInfo)) {
      setPayroll_Advances__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Payroll_Advances__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payroll_Exceptions__r__typeInfo)) {
      setPayroll_Exceptions__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Payroll_Exceptions__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payroll_History__r__typeInfo)) {
      setPayroll_History__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Payroll_History__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Personal_Certifications__r__typeInfo)) {
      setPersonal_Certifications__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Personal_Certifications__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Personal_Skills__r__typeInfo)) {
      setPersonal_Skills__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Personal_Skills__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Personal_Trades__r__typeInfo)) {
      setPersonal_Trades__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Personal_Trades__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Potential_Candidate_Lists__r__typeInfo)) {
      setPotential_Candidate_Lists__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Potential_Candidate_Lists__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Primary_Phone_Raw__c__typeInfo)) {
      setPrimary_Phone_Raw__c((java.lang.String)__typeMapper.readString(__in, Primary_Phone_Raw__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Primary_Phone__c__typeInfo)) {
      setPrimary_Phone__c((java.lang.String)__typeMapper.readString(__in, Primary_Phone__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Primary_is_Mobile__c__typeInfo)) {
      setPrimary_is_Mobile__c((java.lang.Boolean)__typeMapper.readObject(__in, Primary_is_Mobile__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Proxy__r__typeInfo)) {
      setProxy__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Proxy__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Region__r__typeInfo)) {
      setRegion__r((com.sforce.soap.enterprise.sobject.Region__c)__typeMapper.readObject(__in, Region__r__typeInfo, com.sforce.soap.enterprise.sobject.Region__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Rogue_Payment_Objects__r__typeInfo)) {
      setRogue_Payment_Objects__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Rogue_Payment_Objects__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SMS_History__r__typeInfo)) {
      setSMS_History__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, SMS_History__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Safety_Training__r__typeInfo)) {
      setSafety_Training__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Safety_Training__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Secondary_Phone_Raw__c__typeInfo)) {
      setSecondary_Phone_Raw__c((java.lang.String)__typeMapper.readString(__in, Secondary_Phone_Raw__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Secondary_Phone__c__typeInfo)) {
      setSecondary_Phone__c((java.lang.String)__typeMapper.readString(__in, Secondary_Phone__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Secondary_is_Mobile__c__typeInfo)) {
      setSecondary_is_Mobile__c((java.lang.Boolean)__typeMapper.readObject(__in, Secondary_is_Mobile__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SendTimecard__c__typeInfo)) {
      setSendTimecard__c((java.lang.Boolean)__typeMapper.readObject(__in, SendTimecard__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Sex__c__typeInfo)) {
      setSex__c((java.lang.String)__typeMapper.readString(__in, Sex__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Social_Security_Number__c__typeInfo)) {
      setSocial_Security_Number__c((java.lang.String)__typeMapper.readString(__in, Social_Security_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Source_URL__c__typeInfo)) {
      setSource_URL__c((java.lang.String)__typeMapper.readString(__in, Source_URL__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__c__typeInfo)) {
      setState__c((java.lang.String)__typeMapper.readString(__in, State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Sum_of_Ratings__c__typeInfo)) {
      setSum_of_Ratings__c((java.lang.Double)__typeMapper.readObject(__in, Sum_of_Ratings__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Take_Action__c__typeInfo)) {
      setTake_Action__c((java.lang.Boolean)__typeMapper.readObject(__in, Take_Action__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Temporary_Address1__c__typeInfo)) {
      setTemporary_Address1__c((java.lang.String)__typeMapper.readString(__in, Temporary_Address1__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Temporary_Address2__c__typeInfo)) {
      setTemporary_Address2__c((java.lang.String)__typeMapper.readString(__in, Temporary_Address2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Temporary_City__c__typeInfo)) {
      setTemporary_City__c((java.lang.String)__typeMapper.readString(__in, Temporary_City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Temporary_State__c__typeInfo)) {
      setTemporary_State__c((java.lang.String)__typeMapper.readString(__in, Temporary_State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Temporary_Zip_Code__c__typeInfo)) {
      setTemporary_Zip_Code__c((java.lang.String)__typeMapper.readString(__in, Temporary_Zip_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Timesheets__r__typeInfo)) {
      setTimesheets__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Timesheets__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tools_Owned__c__typeInfo)) {
      setTools_Owned__c((java.lang.String)__typeMapper.readString(__in, Tools_Owned__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Hours_Last_Month__c__typeInfo)) {
      setTotal_Hours_Last_Month__c((java.lang.Double)__typeMapper.readObject(__in, Total_Hours_Last_Month__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Trade__r__typeInfo)) {
      setTrade__r((com.sforce.soap.enterprise.sobject.Personal_Trade__c)__typeMapper.readObject(__in, Trade__r__typeInfo, com.sforce.soap.enterprise.sobject.Personal_Trade__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Trades__c__typeInfo)) {
      setTrades__c((java.lang.String)__typeMapper.readString(__in, Trades__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Training_Participants__r__typeInfo)) {
      setTraining_Participants__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Training_Participants__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Twitter_ID__c__typeInfo)) {
      setTwitter_ID__c((java.lang.String)__typeMapper.readString(__in, Twitter_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Two_ID_s__c__typeInfo)) {
      setTwo_ID_s__c((java.lang.Boolean)__typeMapper.readObject(__in, Two_ID_s__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UE_Claim_Count__c__typeInfo)) {
      setUE_Claim_Count__c((java.lang.Double)__typeMapper.readObject(__in, UE_Claim_Count__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Unemployment_Claim__c__typeInfo)) {
      setUnemployment_Claim__c((java.lang.Boolean)__typeMapper.readObject(__in, Unemployment_Claim__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Unemployment_Claims__r__typeInfo)) {
      setUnemployment_Claims__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Unemployment_Claims__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Unverified_Time__r__typeInfo)) {
      setUnverified_Time__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Unverified_Time__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Use_Temporary_Address_Until__c__typeInfo)) {
      setUse_Temporary_Address_Until__c((java.util.Calendar)__typeMapper.readObject(__in, Use_Temporary_Address_Until__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Use_Temporary_Address__c__typeInfo)) {
      setUse_Temporary_Address__c((java.lang.Boolean)__typeMapper.readObject(__in, Use_Temporary_Address__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Verification_Status__c__typeInfo)) {
      setVerification_Status__c((java.lang.String)__typeMapper.readString(__in, Verification_Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Verified_By__c__typeInfo)) {
      setVerified_By__c((java.lang.String)__typeMapper.readString(__in, Verified_By__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Verified_On__c__typeInfo)) {
      setVerified_On__c((java.util.Calendar)__typeMapper.readObject(__in, Verified_On__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Verified__c__typeInfo)) {
      setVerified__c((java.lang.Boolean)__typeMapper.readObject(__in, Verified__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, W4__c__typeInfo)) {
      setW4__c((java.lang.Boolean)__typeMapper.readObject(__in, W4__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, W_4_Forms__r__typeInfo)) {
      setW_4_Forms__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, W_4_Forms__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Weeks_Since_Last_Paycheck__c__typeInfo)) {
      setWeeks_Since_Last_Paycheck__c((java.lang.Double)__typeMapper.readObject(__in, Weeks_Since_Last_Paycheck__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Zip_Code__c__typeInfo)) {
      setZip_Code__c((java.lang.String)__typeMapper.readString(__in, Zip_Code__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Candidate_Employee__c ");
    sb.append(super.toString());
    sb.append(" ACA_Opt_Out_Received__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ACA_Opt_Out_Received__c)+"'\n");
    sb.append(" Accepted_Terms_Verification_and_Release__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Accepted_Terms_Verification_and_Release__c)+"'\n");
    sb.append(" Active__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Active__c)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Address1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address1__c)+"'\n");
    sb.append(" Address2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address2__c)+"'\n");
    sb.append(" Address_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address_ID__c)+"'\n");
    sb.append(" Advertisement__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Advertisement__c)+"'\n");
    sb.append(" Advertisement__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Advertisement__r)+"'\n");
    sb.append(" Age__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Age__c)+"'\n");
    sb.append(" Agreements__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Agreements__r)+"'\n");
    sb.append(" Applicant__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Applicant__c)+"'\n");
    sb.append(" Applicant__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Applicant__r)+"'\n");
    sb.append(" Applicants__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Applicants__r)+"'\n");
    sb.append(" Assignments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignments__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Average_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Average_Rating__c)+"'\n");
    sb.append(" Avg_Weekly_Hours_Last_Month__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Avg_Weekly_Hours_Last_Month__c)+"'\n");
    sb.append(" BA_Reference_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BA_Reference_ID__c)+"'\n");
    sb.append(" Background_Checks__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Background_Checks__r)+"'\n");
    sb.append(" Broadcast_Contact__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Broadcast_Contact__r)+"'\n");
    sb.append(" Call_In_Note__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Call_In_Note__c)+"'\n");
    sb.append(" Candidate_Geocodes__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Geocodes__r)+"'\n");
    sb.append(" Candidate_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Status__c)+"'\n");
    sb.append(" Candidate_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Type__c)+"'\n");
    sb.append(" Cases__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases__r)+"'\n");
    sb.append(" Certified_Submission_Correct_Accurate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Certified_Submission_Correct_Accurate__c)+"'\n");
    sb.append(" Child_Support_Or_Garnishment_Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Child_Support_Or_Garnishment_Order__c)+"'\n");
    sb.append(" Child_Support_Orders__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Child_Support_Orders__c)+"'\n");
    sb.append(" Child_Support__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Child_Support__c)+"'\n");
    sb.append(" Child_Support__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Child_Support__r)+"'\n");
    sb.append(" City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City__c)+"'\n");
    sb.append(" Client_Bans__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Client_Bans__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Contact_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact_Number__c)+"'\n");
    sb.append(" Contacted_for_Tax_Paperwork__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contacted_for_Tax_Paperwork__c)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DD_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DD_on_File__c)+"'\n");
    sb.append(" Date_Available__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_Available__c)+"'\n");
    sb.append(" Date_of_Birth__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Birth__c)+"'\n");
    sb.append(" Date_of_Last_Candidate_Type_Change__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Last_Candidate_Type_Change__c)+"'\n");
    sb.append(" Date_of_Last_Status_Change__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Last_Status_Change__c)+"'\n");
    sb.append(" Date_of_Tax_Paperwork__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Tax_Paperwork__c)+"'\n");
    sb.append(" Days_Since_1st_Pay__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Days_Since_1st_Pay__c)+"'\n");
    sb.append(" Deduction_Set_Up_in_GP__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Deduction_Set_Up_in_GP__c)+"'\n");
    sb.append(" Division__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__c)+"'\n");
    sb.append(" Division__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__r)+"'\n");
    sb.append(" Do_Not_Assign_To__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Do_Not_Assign_To__r)+"'\n");
    sb.append(" Documentation_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Documentation_Status__c)+"'\n");
    sb.append(" Drug_Tests__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Drug_Tests__r)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Education__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Education__r)+"'\n");
    sb.append(" Email_1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email_1__c)+"'\n");
    sb.append(" Email_2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email_2__c)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Emails__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails__r)+"'\n");
    sb.append(" Emergency_Contacts__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emergency_Contacts__r)+"'\n");
    sb.append(" Employee_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_ID__c)+"'\n");
    sb.append(" Employment_Paperwork2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employment_Paperwork2__r)+"'\n");
    sb.append(" Employments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employments__r)+"'\n");
    sb.append(" Ethnicity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Ethnicity__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FE_Bonuses1__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FE_Bonuses1__r)+"'\n");
    sb.append(" FE_Bonuses__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FE_Bonuses__r)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" Field_Expenses__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Field_Expenses__r)+"'\n");
    sb.append(" First_Check_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(First_Check_Date__c)+"'\n");
    sb.append(" First_Day_Worked__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(First_Day_Worked__c)+"'\n");
    sb.append(" First_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(First_Name__c)+"'\n");
    sb.append(" First_Timecard__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(First_Timecard__c)+"'\n");
    sb.append(" Fraud__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fraud__r)+"'\n");
    sb.append(" Full_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Full_Name__c)+"'\n");
    sb.append(" Geo_Code_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Geo_Code_Status__c)+"'\n");
    sb.append(" Guarantees__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Guarantees__r)+"'\n");
    sb.append(" HR_Requests__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HR_Requests__r)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" I9__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(I9__c)+"'\n");
    sb.append(" I_9_Forms__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(I_9_Forms__r)+"'\n");
    sb.append(" Import_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Import_Date__c)+"'\n");
    sb.append(" Import_Source__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Import_Source__c)+"'\n");
    sb.append(" Imported_Last_Employer__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Imported_Last_Employer__c)+"'\n");
    sb.append(" Imported_Resume_Notes__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Imported_Resume_Notes__c)+"'\n");
    sb.append(" Imported_Years_Experience__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Imported_Years_Experience__c)+"'\n");
    sb.append(" Incoming_SMS__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Incoming_SMS__r)+"'\n");
    sb.append(" Insurance_Eligible__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Insurance_Eligible__c)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Job_Reference_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Reference_Number__c)+"'\n");
    sb.append(" Jobs_will_not_take__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Jobs_will_not_take__c)+"'\n");
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
    sb.append(" Last_Assigned_With__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_Assigned_With__c)+"'\n");
    sb.append(" Last_Assignment_Ended__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_Assignment_Ended__c)+"'\n");
    sb.append(" Last_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_Name__c)+"'\n");
    sb.append(" Last_PDNB__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_PDNB__c)+"'\n");
    sb.append(" Last_Regular_Pay__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_Regular_Pay__c)+"'\n");
    sb.append(" Last_Vacation_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_Vacation_Date__c)+"'\n");
    sb.append(" Lat__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lat__c)+"'\n");
    sb.append(" Location__Latitude__s=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Location__Latitude__s)+"'\n");
    sb.append(" Location__Longitude__s=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Location__Longitude__s)+"'\n");
    sb.append(" Location__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Location__c)+"'\n");
    sb.append(" Lon__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lon__c)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Middle_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Middle_Name__c)+"'\n");
    sb.append(" Most_Recent_Check_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Most_Recent_Check_Date__c)+"'\n");
    sb.append(" Most_Recent_Timecard__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Most_Recent_Timecard__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Nickname__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Nickname__c)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Number_of_Assignments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Assignments__c)+"'\n");
    sb.append(" Number_of_Injuries__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Injuries__c)+"'\n");
    sb.append(" Number_of_Ratings__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Ratings__c)+"'\n");
    sb.append(" OK_to_send_Text_Messages__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OK_to_send_Text_Messages__c)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Original_Time_Cards__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Original_Time_Cards__r)+"'\n");
    sb.append(" Own_Tools__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Own_Tools__c)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" PPE__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PPE__r)+"'\n");
    sb.append(" Payroll_Advances__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payroll_Advances__r)+"'\n");
    sb.append(" Payroll_Exceptions__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payroll_Exceptions__r)+"'\n");
    sb.append(" Payroll_History__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payroll_History__r)+"'\n");
    sb.append(" Personal_Certifications__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Personal_Certifications__r)+"'\n");
    sb.append(" Personal_Skills__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Personal_Skills__r)+"'\n");
    sb.append(" Personal_Trades__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Personal_Trades__r)+"'\n");
    sb.append(" Potential_Candidate_Lists__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Potential_Candidate_Lists__r)+"'\n");
    sb.append(" Primary_Phone_Raw__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Primary_Phone_Raw__c)+"'\n");
    sb.append(" Primary_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Primary_Phone__c)+"'\n");
    sb.append(" Primary_is_Mobile__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Primary_is_Mobile__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Proxy__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Proxy__r)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Region__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Region__c)+"'\n");
    sb.append(" Region__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Region__r)+"'\n");
    sb.append(" Rogue_Payment_Objects__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rogue_Payment_Objects__r)+"'\n");
    sb.append(" SMS_History__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SMS_History__r)+"'\n");
    sb.append(" Safety_Training__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Safety_Training__r)+"'\n");
    sb.append(" Secondary_Phone_Raw__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Secondary_Phone_Raw__c)+"'\n");
    sb.append(" Secondary_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Secondary_Phone__c)+"'\n");
    sb.append(" Secondary_is_Mobile__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Secondary_is_Mobile__c)+"'\n");
    sb.append(" SendTimecard__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SendTimecard__c)+"'\n");
    sb.append(" Sex__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sex__c)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
    sb.append(" Social_Security_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Social_Security_Number__c)+"'\n");
    sb.append(" Source_URL__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Source_URL__c)+"'\n");
    sb.append(" State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State__c)+"'\n");
    sb.append(" Sum_of_Ratings__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sum_of_Ratings__c)+"'\n");
    sb.append(" Surveys__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Surveys__r)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" Take_Action__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Take_Action__c)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" Temporary_Address1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Temporary_Address1__c)+"'\n");
    sb.append(" Temporary_Address2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Temporary_Address2__c)+"'\n");
    sb.append(" Temporary_City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Temporary_City__c)+"'\n");
    sb.append(" Temporary_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Temporary_State__c)+"'\n");
    sb.append(" Temporary_Zip_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Temporary_Zip_Code__c)+"'\n");
    sb.append(" Timesheets__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Timesheets__r)+"'\n");
    sb.append(" Tools_Owned__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tools_Owned__c)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Total_Hours_Last_Month__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Hours_Last_Month__c)+"'\n");
    sb.append(" Total_Hours_Worked__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Hours_Worked__c)+"'\n");
    sb.append(" Trade__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade__c)+"'\n");
    sb.append(" Trade__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trade__r)+"'\n");
    sb.append(" Trades__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Trades__c)+"'\n");
    sb.append(" Training_Participants__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Training_Participants__r)+"'\n");
    sb.append(" Twitter_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Twitter_ID__c)+"'\n");
    sb.append(" Two_ID_s__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Two_ID_s__c)+"'\n");
    sb.append(" UE_Claim_Count__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UE_Claim_Count__c)+"'\n");
    sb.append(" Unemployment_Claim__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Unemployment_Claim__c)+"'\n");
    sb.append(" Unemployment_Claims__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Unemployment_Claims__r)+"'\n");
    sb.append(" Unverified_Time__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Unverified_Time__r)+"'\n");
    sb.append(" Use_Temporary_Address_Until__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Use_Temporary_Address_Until__c)+"'\n");
    sb.append(" Use_Temporary_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Use_Temporary_Address__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" Verification_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Verification_Status__c)+"'\n");
    sb.append(" Verified_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Verified_By__c)+"'\n");
    sb.append(" Verified_On__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Verified_On__c)+"'\n");
    sb.append(" Verified__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Verified__c)+"'\n");
    sb.append(" W4__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(W4__c)+"'\n");
    sb.append(" W_4_Forms__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(W_4_Forms__r)+"'\n");
    sb.append(" Weeks_Since_Last_Paycheck__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Weeks_Since_Last_Paycheck__c)+"'\n");
    sb.append(" Zip_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Zip_Code__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}