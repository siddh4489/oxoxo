package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Applicant__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Applicant__c() {
  }
    
  
  /**
   * element  : ACAAcknowledgementSignature__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ACAAcknowledgementSignature__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ACAAcknowledgementSignature__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ACAAcknowledgementSignature__c__is_set = false;

  private java.lang.String ACAAcknowledgementSignature__c;

  public java.lang.String getACAAcknowledgementSignature__c() {
    return ACAAcknowledgementSignature__c;
  }

  

  public void setACAAcknowledgementSignature__c(java.lang.String ACAAcknowledgementSignature__c) {
    this.ACAAcknowledgementSignature__c = ACAAcknowledgementSignature__c;
    ACAAcknowledgementSignature__c__is_set = true;
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
   * element  : Applicant_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Applicant_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Applicant_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Applicant_Status__c__is_set = false;

  private java.lang.String Applicant_Status__c;

  public java.lang.String getApplicant_Status__c() {
    return Applicant_Status__c;
  }

  

  public void setApplicant_Status__c(java.lang.String Applicant_Status__c) {
    this.Applicant_Status__c = Applicant_Status__c;
    Applicant_Status__c__is_set = true;
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
   * element  : Candidate__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Candidate__c__is_set = false;

  private java.lang.String Candidate__c;

  public java.lang.String getCandidate__c() {
    return Candidate__c;
  }

  

  public void setCandidate__c(java.lang.String Candidate__c) {
    this.Candidate__c = Candidate__c;
    Candidate__c__is_set = true;
  }
  
  /**
   * element  : Candidate__r of type {urn:sobject.enterprise.soap.sforce.com}Candidate_Employee__c
   * java type: com.sforce.soap.enterprise.sobject.Candidate_Employee__c
   */
  private static final com.sforce.ws.bind.TypeInfo Candidate__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidate__r","urn:sobject.enterprise.soap.sforce.com","Candidate_Employee__c",0,1,true);

  private boolean Candidate__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Candidate_Employee__c Candidate__r;

  public com.sforce.soap.enterprise.sobject.Candidate_Employee__c getCandidate__r() {
    return Candidate__r;
  }

  

  public void setCandidate__r(com.sforce.soap.enterprise.sobject.Candidate_Employee__c Candidate__r) {
    this.Candidate__r = Candidate__r;
    Candidate__r__is_set = true;
  }
  
  /**
   * element  : Candidates_Employees__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Candidates_Employees__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Candidates_Employees__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Candidates_Employees__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Candidates_Employees__r;

  public com.sforce.soap.enterprise.QueryResult getCandidates_Employees__r() {
    return Candidates_Employees__r;
  }

  

  public void setCandidates_Employees__r(com.sforce.soap.enterprise.QueryResult Candidates_Employees__r) {
    this.Candidates_Employees__r = Candidates_Employees__r;
    Candidates_Employees__r__is_set = true;
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
   * element  : Contacted_By_Recruiter__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Contacted_By_Recruiter__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contacted_By_Recruiter__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Contacted_By_Recruiter__c__is_set = false;

  private java.lang.String Contacted_By_Recruiter__c;

  public java.lang.String getContacted_By_Recruiter__c() {
    return Contacted_By_Recruiter__c;
  }

  

  public void setContacted_By_Recruiter__c(java.lang.String Contacted_By_Recruiter__c) {
    this.Contacted_By_Recruiter__c = Contacted_By_Recruiter__c;
    Contacted_By_Recruiter__c__is_set = true;
  }
  
  /**
   * element  : Contacted_By_Recruiter__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Contacted_By_Recruiter__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contacted_By_Recruiter__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Contacted_By_Recruiter__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Contacted_By_Recruiter__r;

  public com.sforce.soap.enterprise.sobject.User getContacted_By_Recruiter__r() {
    return Contacted_By_Recruiter__r;
  }

  

  public void setContacted_By_Recruiter__r(com.sforce.soap.enterprise.sobject.User Contacted_By_Recruiter__r) {
    this.Contacted_By_Recruiter__r = Contacted_By_Recruiter__r;
    Contacted_By_Recruiter__r__is_set = true;
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
   * element  : Created_Week_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Created_Week_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Created_Week_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Created_Week_End_Date__c__is_set = false;

  private java.util.Calendar Created_Week_End_Date__c;

  public java.util.Calendar getCreated_Week_End_Date__c() {
    return Created_Week_End_Date__c;
  }

  

  public void setCreated_Week_End_Date__c(java.util.Calendar Created_Week_End_Date__c) {
    this.Created_Week_End_Date__c = Created_Week_End_Date__c;
    Created_Week_End_Date__c__is_set = true;
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
   * element  : Date_Submitted__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_Submitted__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_Submitted__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_Submitted__c__is_set = false;

  private java.util.Calendar Date_Submitted__c;

  public java.util.Calendar getDate_Submitted__c() {
    return Date_Submitted__c;
  }

  

  public void setDate_Submitted__c(java.util.Calendar Date_Submitted__c) {
    this.Date_Submitted__c = Date_Submitted__c;
    Date_Submitted__c__is_set = true;
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
   * element  : Signature__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Signature__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Signature__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Signature__c__is_set = false;

  private java.lang.String Signature__c;

  public java.lang.String getSignature__c() {
    return Signature__c;
  }

  

  public void setSignature__c(java.lang.String Signature__c) {
    this.Signature__c = Signature__c;
    Signature__c__is_set = true;
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
   * element  : smsOK__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo smsOK__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smsOK__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean smsOK__c__is_set = false;

  private java.lang.Boolean smsOK__c;

  public java.lang.Boolean getSmsOK__c() {
    return smsOK__c;
  }

  

  public void setSmsOK__c(java.lang.Boolean smsOK__c) {
    this.smsOK__c = smsOK__c;
    smsOK__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Applicant__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ACAAcknowledgementSignature__c__typeInfo, ACAAcknowledgementSignature__c, ACAAcknowledgementSignature__c__is_set);
    __typeMapper.writeObject(__out, Accepted_Terms_Verification_and_Release__c__typeInfo, Accepted_Terms_Verification_and_Release__c, Accepted_Terms_Verification_and_Release__c__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeString(__out, Address1__c__typeInfo, Address1__c, Address1__c__is_set);
    __typeMapper.writeString(__out, Address2__c__typeInfo, Address2__c, Address2__c__is_set);
    __typeMapper.writeString(__out, Applicant_Status__c__typeInfo, Applicant_Status__c, Applicant_Status__c__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Candidate__c__typeInfo, Candidate__c, Candidate__c__is_set);
    __typeMapper.writeObject(__out, Candidate__r__typeInfo, Candidate__r, Candidate__r__is_set);
    __typeMapper.writeObject(__out, Candidates_Employees__r__typeInfo, Candidates_Employees__r, Candidates_Employees__r__is_set);
    __typeMapper.writeObject(__out, Certified_Submission_Correct_Accurate__c__typeInfo, Certified_Submission_Correct_Accurate__c, Certified_Submission_Correct_Accurate__c__is_set);
    __typeMapper.writeString(__out, City__c__typeInfo, City__c, City__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, Contacted_By_Recruiter__c__typeInfo, Contacted_By_Recruiter__c, Contacted_By_Recruiter__c__is_set);
    __typeMapper.writeObject(__out, Contacted_By_Recruiter__r__typeInfo, Contacted_By_Recruiter__r, Contacted_By_Recruiter__r__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Created_Week_End_Date__c__typeInfo, Created_Week_End_Date__c, Created_Week_End_Date__c__is_set);
    __typeMapper.writeObject(__out, Date_Available__c__typeInfo, Date_Available__c, Date_Available__c__is_set);
    __typeMapper.writeObject(__out, Date_Submitted__c__typeInfo, Date_Submitted__c, Date_Submitted__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Education__r__typeInfo, Education__r, Education__r__is_set);
    __typeMapper.writeString(__out, Email_1__c__typeInfo, Email_1__c, Email_1__c__is_set);
    __typeMapper.writeString(__out, Email_2__c__typeInfo, Email_2__c, Email_2__c__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, Emergency_Contacts__r__typeInfo, Emergency_Contacts__r, Emergency_Contacts__r__is_set);
    __typeMapper.writeObject(__out, Employments__r__typeInfo, Employments__r, Employments__r__is_set);
    __typeMapper.writeString(__out, Ethnicity__c__typeInfo, Ethnicity__c, Ethnicity__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeString(__out, First_Name__c__typeInfo, First_Name__c, First_Name__c__is_set);
    __typeMapper.writeString(__out, Full_Name__c__typeInfo, Full_Name__c, Full_Name__c__is_set);
    __typeMapper.writeString(__out, Geo_Code_Status__c__typeInfo, Geo_Code_Status__c, Geo_Code_Status__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, I_9_Forms__r__typeInfo, I_9_Forms__r, I_9_Forms__r__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Job_Reference_Number__c__typeInfo, Job_Reference_Number__c, Job_Reference_Number__c__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeString(__out, Last_Name__c__typeInfo, Last_Name__c, Last_Name__c__is_set);
    __typeMapper.writeObject(__out, Lat__c__typeInfo, Lat__c, Lat__c__is_set);
    __typeMapper.writeObject(__out, Location__Latitude__s__typeInfo, Location__Latitude__s, Location__Latitude__s__is_set);
    __typeMapper.writeObject(__out, Location__Longitude__s__typeInfo, Location__Longitude__s, Location__Longitude__s__is_set);
    __typeMapper.writeObject(__out, Location__c__typeInfo, Location__c, Location__c__is_set);
    __typeMapper.writeObject(__out, Lon__c__typeInfo, Lon__c, Lon__c__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Middle_Name__c__typeInfo, Middle_Name__c, Middle_Name__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, Nickname__c__typeInfo, Nickname__c, Nickname__c__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, Personal_Trades__r__typeInfo, Personal_Trades__r, Personal_Trades__r__is_set);
    __typeMapper.writeString(__out, Primary_Phone_Raw__c__typeInfo, Primary_Phone_Raw__c, Primary_Phone_Raw__c__is_set);
    __typeMapper.writeString(__out, Primary_Phone__c__typeInfo, Primary_Phone__c, Primary_Phone__c__is_set);
    __typeMapper.writeObject(__out, Primary_is_Mobile__c__typeInfo, Primary_is_Mobile__c, Primary_is_Mobile__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeString(__out, Region__c__typeInfo, Region__c, Region__c__is_set);
    __typeMapper.writeObject(__out, Region__r__typeInfo, Region__r, Region__r__is_set);
    __typeMapper.writeString(__out, Secondary_Phone__c__typeInfo, Secondary_Phone__c, Secondary_Phone__c__is_set);
    __typeMapper.writeObject(__out, Secondary_is_Mobile__c__typeInfo, Secondary_is_Mobile__c, Secondary_is_Mobile__c__is_set);
    __typeMapper.writeString(__out, Sex__c__typeInfo, Sex__c, Sex__c__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeString(__out, Signature__c__typeInfo, Signature__c, Signature__c__is_set);
    __typeMapper.writeString(__out, State__c__typeInfo, State__c, State__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeString(__out, Twitter_ID__c__typeInfo, Twitter_ID__c, Twitter_ID__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, W_4_Forms__r__typeInfo, W_4_Forms__r, W_4_Forms__r__is_set);
    __typeMapper.writeString(__out, Zip_Code__c__typeInfo, Zip_Code__c, Zip_Code__c__is_set);
    __typeMapper.writeObject(__out, smsOK__c__typeInfo, smsOK__c, smsOK__c__is_set);
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
    if (__typeMapper.isElement(__in, ACAAcknowledgementSignature__c__typeInfo)) {
      setACAAcknowledgementSignature__c((java.lang.String)__typeMapper.readString(__in, ACAAcknowledgementSignature__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Accepted_Terms_Verification_and_Release__c__typeInfo)) {
      setAccepted_Terms_Verification_and_Release__c((java.lang.Boolean)__typeMapper.readObject(__in, Accepted_Terms_Verification_and_Release__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Applicant_Status__c__typeInfo)) {
      setApplicant_Status__c((java.lang.String)__typeMapper.readString(__in, Applicant_Status__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Candidate__c__typeInfo)) {
      setCandidate__c((java.lang.String)__typeMapper.readString(__in, Candidate__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate__r__typeInfo)) {
      setCandidate__r((com.sforce.soap.enterprise.sobject.Candidate_Employee__c)__typeMapper.readObject(__in, Candidate__r__typeInfo, com.sforce.soap.enterprise.sobject.Candidate_Employee__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidates_Employees__r__typeInfo)) {
      setCandidates_Employees__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Candidates_Employees__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Certified_Submission_Correct_Accurate__c__typeInfo)) {
      setCertified_Submission_Correct_Accurate__c((java.lang.Boolean)__typeMapper.readObject(__in, Certified_Submission_Correct_Accurate__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, City__c__typeInfo)) {
      setCity__c((java.lang.String)__typeMapper.readString(__in, City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contacted_By_Recruiter__c__typeInfo)) {
      setContacted_By_Recruiter__c((java.lang.String)__typeMapper.readString(__in, Contacted_By_Recruiter__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contacted_By_Recruiter__r__typeInfo)) {
      setContacted_By_Recruiter__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Contacted_By_Recruiter__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
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
    if (__typeMapper.isElement(__in, Created_Week_End_Date__c__typeInfo)) {
      setCreated_Week_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Created_Week_End_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_Available__c__typeInfo)) {
      setDate_Available__c((java.util.Calendar)__typeMapper.readObject(__in, Date_Available__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_Submitted__c__typeInfo)) {
      setDate_Submitted__c((java.util.Calendar)__typeMapper.readObject(__in, Date_Submitted__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Emergency_Contacts__r__typeInfo)) {
      setEmergency_Contacts__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emergency_Contacts__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, FeedSubscriptionsForEntity__typeInfo)) {
      setFeedSubscriptionsForEntity((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FeedSubscriptionsForEntity__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, First_Name__c__typeInfo)) {
      setFirst_Name__c((java.lang.String)__typeMapper.readString(__in, First_Name__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, I_9_Forms__r__typeInfo)) {
      setI_9_Forms__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, I_9_Forms__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Last_Name__c__typeInfo)) {
      setLast_Name__c((java.lang.String)__typeMapper.readString(__in, Last_Name__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Personal_Trades__r__typeInfo)) {
      setPersonal_Trades__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Personal_Trades__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Secondary_Phone__c__typeInfo)) {
      setSecondary_Phone__c((java.lang.String)__typeMapper.readString(__in, Secondary_Phone__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Secondary_is_Mobile__c__typeInfo)) {
      setSecondary_is_Mobile__c((java.lang.Boolean)__typeMapper.readObject(__in, Secondary_is_Mobile__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Signature__c__typeInfo)) {
      setSignature__c((java.lang.String)__typeMapper.readString(__in, Signature__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__c__typeInfo)) {
      setState__c((java.lang.String)__typeMapper.readString(__in, State__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Twitter_ID__c__typeInfo)) {
      setTwitter_ID__c((java.lang.String)__typeMapper.readString(__in, Twitter_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, W_4_Forms__r__typeInfo)) {
      setW_4_Forms__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, W_4_Forms__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Zip_Code__c__typeInfo)) {
      setZip_Code__c((java.lang.String)__typeMapper.readString(__in, Zip_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smsOK__c__typeInfo)) {
      setSmsOK__c((java.lang.Boolean)__typeMapper.readObject(__in, smsOK__c__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Applicant__c ");
    sb.append(super.toString());
    sb.append(" ACAAcknowledgementSignature__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ACAAcknowledgementSignature__c)+"'\n");
    sb.append(" Accepted_Terms_Verification_and_Release__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Accepted_Terms_Verification_and_Release__c)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Address1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address1__c)+"'\n");
    sb.append(" Address2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address2__c)+"'\n");
    sb.append(" Applicant_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Applicant_Status__c)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Candidate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate__c)+"'\n");
    sb.append(" Candidate__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate__r)+"'\n");
    sb.append(" Candidates_Employees__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidates_Employees__r)+"'\n");
    sb.append(" Certified_Submission_Correct_Accurate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Certified_Submission_Correct_Accurate__c)+"'\n");
    sb.append(" City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Contacted_By_Recruiter__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contacted_By_Recruiter__c)+"'\n");
    sb.append(" Contacted_By_Recruiter__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contacted_By_Recruiter__r)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Created_Week_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Created_Week_End_Date__c)+"'\n");
    sb.append(" Date_Available__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_Available__c)+"'\n");
    sb.append(" Date_Submitted__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_Submitted__c)+"'\n");
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
    sb.append(" Emergency_Contacts__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emergency_Contacts__r)+"'\n");
    sb.append(" Employments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employments__r)+"'\n");
    sb.append(" Ethnicity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Ethnicity__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" First_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(First_Name__c)+"'\n");
    sb.append(" Full_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Full_Name__c)+"'\n");
    sb.append(" Geo_Code_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Geo_Code_Status__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" I_9_Forms__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(I_9_Forms__r)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Job_Reference_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Job_Reference_Number__c)+"'\n");
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
    sb.append(" Last_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Last_Name__c)+"'\n");
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
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Nickname__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Nickname__c)+"'\n");
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
    sb.append(" Personal_Trades__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Personal_Trades__r)+"'\n");
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
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Region__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Region__c)+"'\n");
    sb.append(" Region__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Region__r)+"'\n");
    sb.append(" Secondary_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Secondary_Phone__c)+"'\n");
    sb.append(" Secondary_is_Mobile__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Secondary_is_Mobile__c)+"'\n");
    sb.append(" Sex__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sex__c)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
    sb.append(" Signature__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Signature__c)+"'\n");
    sb.append(" State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State__c)+"'\n");
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
    sb.append(" Twitter_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Twitter_ID__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" W_4_Forms__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(W_4_Forms__r)+"'\n");
    sb.append(" Zip_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Zip_Code__c)+"'\n");
    sb.append(" smsOK__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smsOK__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}