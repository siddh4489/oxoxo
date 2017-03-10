package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class I9_Form__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public I9_Form__c() {
  }
    
  
  /**
   * element  : Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Address__c__is_set = false;

  private java.lang.String Address__c;

  public java.lang.String getAddress__c() {
    return Address__c;
  }

  

  public void setAddress__c(java.lang.String Address__c) {
    this.Address__c = Address__c;
    Address__c__is_set = true;
  }
  
  /**
   * element  : Alien_Expiration_Date__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Alien_Expiration_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Alien_Expiration_Date__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean Alien_Expiration_Date__c__is_set = false;

  private java.util.Calendar Alien_Expiration_Date__c;

  public java.util.Calendar getAlien_Expiration_Date__c() {
    return Alien_Expiration_Date__c;
  }

  

  public void setAlien_Expiration_Date__c(java.util.Calendar Alien_Expiration_Date__c) {
    this.Alien_Expiration_Date__c = Alien_Expiration_Date__c;
    Alien_Expiration_Date__c__is_set = true;
  }
  
  /**
   * element  : Alien_Registration_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Alien_Registration_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Alien_Registration_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Alien_Registration_Number__c__is_set = false;

  private java.lang.String Alien_Registration_Number__c;

  public java.lang.String getAlien_Registration_Number__c() {
    return Alien_Registration_Number__c;
  }

  

  public void setAlien_Registration_Number__c(java.lang.String Alien_Registration_Number__c) {
    this.Alien_Registration_Number__c = Alien_Registration_Number__c;
    Alien_Registration_Number__c__is_set = true;
  }
  
  /**
   * element  : Apartment_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Apartment_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Apartment_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Apartment_Number__c__is_set = false;

  private java.lang.String Apartment_Number__c;

  public java.lang.String getApartment_Number__c() {
    return Apartment_Number__c;
  }

  

  public void setApartment_Number__c(java.lang.String Apartment_Number__c) {
    this.Apartment_Number__c = Apartment_Number__c;
    Apartment_Number__c__is_set = true;
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
   * element  : Business_Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Business_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Business_Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Business_Address__c__is_set = false;

  private java.lang.String Business_Address__c;

  public java.lang.String getBusiness_Address__c() {
    return Business_Address__c;
  }

  

  public void setBusiness_Address__c(java.lang.String Business_Address__c) {
    this.Business_Address__c = Business_Address__c;
    Business_Address__c__is_set = true;
  }
  
  /**
   * element  : Business_City__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Business_City__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Business_City__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Business_City__c__is_set = false;

  private java.lang.String Business_City__c;

  public java.lang.String getBusiness_City__c() {
    return Business_City__c;
  }

  

  public void setBusiness_City__c(java.lang.String Business_City__c) {
    this.Business_City__c = Business_City__c;
    Business_City__c__is_set = true;
  }
  
  /**
   * element  : Business_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Business_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Business_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Business_State__c__is_set = false;

  private java.lang.String Business_State__c;

  public java.lang.String getBusiness_State__c() {
    return Business_State__c;
  }

  

  public void setBusiness_State__c(java.lang.String Business_State__c) {
    this.Business_State__c = Business_State__c;
    Business_State__c__is_set = true;
  }
  
  /**
   * element  : Business_Zip_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Business_Zip_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Business_Zip_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Business_Zip_Code__c__is_set = false;

  private java.lang.String Business_Zip_Code__c;

  public java.lang.String getBusiness_Zip_Code__c() {
    return Business_Zip_Code__c;
  }

  

  public void setBusiness_Zip_Code__c(java.lang.String Business_Zip_Code__c) {
    this.Business_Zip_Code__c = Business_Zip_Code__c;
    Business_Zip_Code__c__is_set = true;
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
   * element  : Certification_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Certification_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Certification_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Certification_Date__c__is_set = false;

  private java.util.Calendar Certification_Date__c;

  public java.util.Calendar getCertification_Date__c() {
    return Certification_Date__c;
  }

  

  public void setCertification_Date__c(java.util.Calendar Certification_Date__c) {
    this.Certification_Date__c = Certification_Date__c;
    Certification_Date__c__is_set = true;
  }
  
  /**
   * element  : Citizen_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Citizen_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Citizen_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Citizen_Status__c__is_set = false;

  private java.lang.String Citizen_Status__c;

  public java.lang.String getCitizen_Status__c() {
    return Citizen_Status__c;
  }

  

  public void setCitizen_Status__c(java.lang.String Citizen_Status__c) {
    this.Citizen_Status__c = Citizen_Status__c;
    Citizen_Status__c__is_set = true;
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
   * element  : Complete__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Complete__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Complete__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Complete__c__is_set = false;

  private java.lang.Boolean Complete__c;

  public java.lang.Boolean getComplete__c() {
    return Complete__c;
  }

  

  public void setComplete__c(java.lang.Boolean Complete__c) {
    this.Complete__c = Complete__c;
    Complete__c__is_set = true;
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
   * element  : Date_Submitted__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_Submitted__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_Submitted__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

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
   * element  : Date_of_Rehire__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Date_of_Rehire__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Date_of_Rehire__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Date_of_Rehire__c__is_set = false;

  private java.util.Calendar Date_of_Rehire__c;

  public java.util.Calendar getDate_of_Rehire__c() {
    return Date_of_Rehire__c;
  }

  

  public void setDate_of_Rehire__c(java.util.Calendar Date_of_Rehire__c) {
    this.Date_of_Rehire__c = Date_of_Rehire__c;
    Date_of_Rehire__c__is_set = true;
  }
  
  /**
   * element  : Document_Number_A1__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Number_A1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Number_A1__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Number_A1__c__is_set = false;

  private java.lang.String Document_Number_A1__c;

  public java.lang.String getDocument_Number_A1__c() {
    return Document_Number_A1__c;
  }

  

  public void setDocument_Number_A1__c(java.lang.String Document_Number_A1__c) {
    this.Document_Number_A1__c = Document_Number_A1__c;
    Document_Number_A1__c__is_set = true;
  }
  
  /**
   * element  : Document_Number_A2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Number_A2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Number_A2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Number_A2__c__is_set = false;

  private java.lang.String Document_Number_A2__c;

  public java.lang.String getDocument_Number_A2__c() {
    return Document_Number_A2__c;
  }

  

  public void setDocument_Number_A2__c(java.lang.String Document_Number_A2__c) {
    this.Document_Number_A2__c = Document_Number_A2__c;
    Document_Number_A2__c__is_set = true;
  }
  
  /**
   * element  : Document_Number_A3__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Number_A3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Number_A3__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Number_A3__c__is_set = false;

  private java.lang.String Document_Number_A3__c;

  public java.lang.String getDocument_Number_A3__c() {
    return Document_Number_A3__c;
  }

  

  public void setDocument_Number_A3__c(java.lang.String Document_Number_A3__c) {
    this.Document_Number_A3__c = Document_Number_A3__c;
    Document_Number_A3__c__is_set = true;
  }
  
  /**
   * element  : Document_Number_B__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Number_B__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Number_B__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Number_B__c__is_set = false;

  private java.lang.String Document_Number_B__c;

  public java.lang.String getDocument_Number_B__c() {
    return Document_Number_B__c;
  }

  

  public void setDocument_Number_B__c(java.lang.String Document_Number_B__c) {
    this.Document_Number_B__c = Document_Number_B__c;
    Document_Number_B__c__is_set = true;
  }
  
  /**
   * element  : Document_Number_C__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Number_C__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Number_C__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Number_C__c__is_set = false;

  private java.lang.String Document_Number_C__c;

  public java.lang.String getDocument_Number_C__c() {
    return Document_Number_C__c;
  }

  

  public void setDocument_Number_C__c(java.lang.String Document_Number_C__c) {
    this.Document_Number_C__c = Document_Number_C__c;
    Document_Number_C__c__is_set = true;
  }
  
  /**
   * element  : Document_Title_A2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Title_A2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Title_A2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Title_A2__c__is_set = false;

  private java.lang.String Document_Title_A2__c;

  public java.lang.String getDocument_Title_A2__c() {
    return Document_Title_A2__c;
  }

  

  public void setDocument_Title_A2__c(java.lang.String Document_Title_A2__c) {
    this.Document_Title_A2__c = Document_Title_A2__c;
    Document_Title_A2__c__is_set = true;
  }
  
  /**
   * element  : Document_Title_A3__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Title_A3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Title_A3__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Title_A3__c__is_set = false;

  private java.lang.String Document_Title_A3__c;

  public java.lang.String getDocument_Title_A3__c() {
    return Document_Title_A3__c;
  }

  

  public void setDocument_Title_A3__c(java.lang.String Document_Title_A3__c) {
    this.Document_Title_A3__c = Document_Title_A3__c;
    Document_Title_A3__c__is_set = true;
  }
  
  /**
   * element  : Document_Title_A__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Title_A__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Title_A__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Title_A__c__is_set = false;

  private java.lang.String Document_Title_A__c;

  public java.lang.String getDocument_Title_A__c() {
    return Document_Title_A__c;
  }

  

  public void setDocument_Title_A__c(java.lang.String Document_Title_A__c) {
    this.Document_Title_A__c = Document_Title_A__c;
    Document_Title_A__c__is_set = true;
  }
  
  /**
   * element  : Document_Title_B__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Title_B__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Title_B__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Title_B__c__is_set = false;

  private java.lang.String Document_Title_B__c;

  public java.lang.String getDocument_Title_B__c() {
    return Document_Title_B__c;
  }

  

  public void setDocument_Title_B__c(java.lang.String Document_Title_B__c) {
    this.Document_Title_B__c = Document_Title_B__c;
    Document_Title_B__c__is_set = true;
  }
  
  /**
   * element  : Document_Title_C__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Document_Title_C__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Document_Title_C__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Document_Title_C__c__is_set = false;

  private java.lang.String Document_Title_C__c;

  public java.lang.String getDocument_Title_C__c() {
    return Document_Title_C__c;
  }

  

  public void setDocument_Title_C__c(java.lang.String Document_Title_C__c) {
    this.Document_Title_C__c = Document_Title_C__c;
    Document_Title_C__c__is_set = true;
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
   * element  : Email_Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Email_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email_Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Email_Address__c__is_set = false;

  private java.lang.String Email_Address__c;

  public java.lang.String getEmail_Address__c() {
    return Email_Address__c;
  }

  

  public void setEmail_Address__c(java.lang.String Email_Address__c) {
    this.Email_Address__c = Email_Address__c;
    Email_Address__c__is_set = true;
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
   * element  : Employer_Date_Signed__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Employer_Date_Signed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employer_Date_Signed__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Employer_Date_Signed__c__is_set = false;

  private java.util.Calendar Employer_Date_Signed__c;

  public java.util.Calendar getEmployer_Date_Signed__c() {
    return Employer_Date_Signed__c;
  }

  

  public void setEmployer_Date_Signed__c(java.util.Calendar Employer_Date_Signed__c) {
    this.Employer_Date_Signed__c = Employer_Date_Signed__c;
    Employer_Date_Signed__c__is_set = true;
  }
  
  /**
   * element  : Employer_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employer_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employer_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employer_Name__c__is_set = false;

  private java.lang.String Employer_Name__c;

  public java.lang.String getEmployer_Name__c() {
    return Employer_Name__c;
  }

  

  public void setEmployer_Name__c(java.lang.String Employer_Name__c) {
    this.Employer_Name__c = Employer_Name__c;
    Employer_Name__c__is_set = true;
  }
  
  /**
   * element  : Employer_Signature__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employer_Signature__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employer_Signature__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employer_Signature__c__is_set = false;

  private java.lang.String Employer_Signature__c;

  public java.lang.String getEmployer_Signature__c() {
    return Employer_Signature__c;
  }

  

  public void setEmployer_Signature__c(java.lang.String Employer_Signature__c) {
    this.Employer_Signature__c = Employer_Signature__c;
    Employer_Signature__c__is_set = true;
  }
  
  /**
   * element  : Employer_Title__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employer_Title__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employer_Title__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employer_Title__c__is_set = false;

  private java.lang.String Employer_Title__c;

  public java.lang.String getEmployer_Title__c() {
    return Employer_Title__c;
  }

  

  public void setEmployer_Title__c(java.lang.String Employer_Title__c) {
    this.Employer_Title__c = Employer_Title__c;
    Employer_Title__c__is_set = true;
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
   * element  : Expiration_Date_A1__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Expiration_Date_A1__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Expiration_Date_A1__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Expiration_Date_A1__c__is_set = false;

  private java.util.Calendar Expiration_Date_A1__c;

  public java.util.Calendar getExpiration_Date_A1__c() {
    return Expiration_Date_A1__c;
  }

  

  public void setExpiration_Date_A1__c(java.util.Calendar Expiration_Date_A1__c) {
    this.Expiration_Date_A1__c = Expiration_Date_A1__c;
    Expiration_Date_A1__c__is_set = true;
  }
  
  /**
   * element  : Expiration_Date_A2__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Expiration_Date_A2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Expiration_Date_A2__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Expiration_Date_A2__c__is_set = false;

  private java.util.Calendar Expiration_Date_A2__c;

  public java.util.Calendar getExpiration_Date_A2__c() {
    return Expiration_Date_A2__c;
  }

  

  public void setExpiration_Date_A2__c(java.util.Calendar Expiration_Date_A2__c) {
    this.Expiration_Date_A2__c = Expiration_Date_A2__c;
    Expiration_Date_A2__c__is_set = true;
  }
  
  /**
   * element  : Expiration_Date_A3__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Expiration_Date_A3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Expiration_Date_A3__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Expiration_Date_A3__c__is_set = false;

  private java.util.Calendar Expiration_Date_A3__c;

  public java.util.Calendar getExpiration_Date_A3__c() {
    return Expiration_Date_A3__c;
  }

  

  public void setExpiration_Date_A3__c(java.util.Calendar Expiration_Date_A3__c) {
    this.Expiration_Date_A3__c = Expiration_Date_A3__c;
    Expiration_Date_A3__c__is_set = true;
  }
  
  /**
   * element  : Expiration_Date_B__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Expiration_Date_B__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Expiration_Date_B__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Expiration_Date_B__c__is_set = false;

  private java.util.Calendar Expiration_Date_B__c;

  public java.util.Calendar getExpiration_Date_B__c() {
    return Expiration_Date_B__c;
  }

  

  public void setExpiration_Date_B__c(java.util.Calendar Expiration_Date_B__c) {
    this.Expiration_Date_B__c = Expiration_Date_B__c;
    Expiration_Date_B__c__is_set = true;
  }
  
  /**
   * element  : Expiration_Date_C__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Expiration_Date_C__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Expiration_Date_C__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Expiration_Date_C__c__is_set = false;

  private java.util.Calendar Expiration_Date_C__c;

  public java.util.Calendar getExpiration_Date_C__c() {
    return Expiration_Date_C__c;
  }

  

  public void setExpiration_Date_C__c(java.util.Calendar Expiration_Date_C__c) {
    this.Expiration_Date_C__c = Expiration_Date_C__c;
    Expiration_Date_C__c__is_set = true;
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
   * element  : Issuing_Authority_A2__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Issuing_Authority_A2__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Issuing_Authority_A2__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Issuing_Authority_A2__c__is_set = false;

  private java.lang.String Issuing_Authority_A2__c;

  public java.lang.String getIssuing_Authority_A2__c() {
    return Issuing_Authority_A2__c;
  }

  

  public void setIssuing_Authority_A2__c(java.lang.String Issuing_Authority_A2__c) {
    this.Issuing_Authority_A2__c = Issuing_Authority_A2__c;
    Issuing_Authority_A2__c__is_set = true;
  }
  
  /**
   * element  : Issuing_Authority_A3__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Issuing_Authority_A3__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Issuing_Authority_A3__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Issuing_Authority_A3__c__is_set = false;

  private java.lang.String Issuing_Authority_A3__c;

  public java.lang.String getIssuing_Authority_A3__c() {
    return Issuing_Authority_A3__c;
  }

  

  public void setIssuing_Authority_A3__c(java.lang.String Issuing_Authority_A3__c) {
    this.Issuing_Authority_A3__c = Issuing_Authority_A3__c;
    Issuing_Authority_A3__c__is_set = true;
  }
  
  /**
   * element  : Issuing_Authority_A__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Issuing_Authority_A__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Issuing_Authority_A__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Issuing_Authority_A__c__is_set = false;

  private java.lang.String Issuing_Authority_A__c;

  public java.lang.String getIssuing_Authority_A__c() {
    return Issuing_Authority_A__c;
  }

  

  public void setIssuing_Authority_A__c(java.lang.String Issuing_Authority_A__c) {
    this.Issuing_Authority_A__c = Issuing_Authority_A__c;
    Issuing_Authority_A__c__is_set = true;
  }
  
  /**
   * element  : Issuing_Authority_B__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Issuing_Authority_B__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Issuing_Authority_B__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Issuing_Authority_B__c__is_set = false;

  private java.lang.String Issuing_Authority_B__c;

  public java.lang.String getIssuing_Authority_B__c() {
    return Issuing_Authority_B__c;
  }

  

  public void setIssuing_Authority_B__c(java.lang.String Issuing_Authority_B__c) {
    this.Issuing_Authority_B__c = Issuing_Authority_B__c;
    Issuing_Authority_B__c__is_set = true;
  }
  
  /**
   * element  : Issuing_Authority_C__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Issuing_Authority_C__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Issuing_Authority_C__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Issuing_Authority_C__c__is_set = false;

  private java.lang.String Issuing_Authority_C__c;

  public java.lang.String getIssuing_Authority_C__c() {
    return Issuing_Authority_C__c;
  }

  

  public void setIssuing_Authority_C__c(java.lang.String Issuing_Authority_C__c) {
    this.Issuing_Authority_C__c = Issuing_Authority_C__c;
    Issuing_Authority_C__c__is_set = true;
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
   * element  : LatestXfdfId__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LatestXfdfId__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LatestXfdfId__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LatestXfdfId__c__is_set = false;

  private java.lang.String LatestXfdfId__c;

  public java.lang.String getLatestXfdfId__c() {
    return LatestXfdfId__c;
  }

  

  public void setLatestXfdfId__c(java.lang.String LatestXfdfId__c) {
    this.LatestXfdfId__c = LatestXfdfId__c;
    LatestXfdfId__c__is_set = true;
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
   * element  : Maiden_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Maiden_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Maiden_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Maiden_Name__c__is_set = false;

  private java.lang.String Maiden_Name__c;

  public java.lang.String getMaiden_Name__c() {
    return Maiden_Name__c;
  }

  

  public void setMaiden_Name__c(java.lang.String Maiden_Name__c) {
    this.Maiden_Name__c = Maiden_Name__c;
    Maiden_Name__c__is_set = true;
  }
  
  /**
   * element  : Middle_Initial__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Middle_Initial__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Middle_Initial__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Middle_Initial__c__is_set = false;

  private java.lang.String Middle_Initial__c;

  public java.lang.String getMiddle_Initial__c() {
    return Middle_Initial__c;
  }

  

  public void setMiddle_Initial__c(java.lang.String Middle_Initial__c) {
    this.Middle_Initial__c = Middle_Initial__c;
    Middle_Initial__c__is_set = true;
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
   * element  : New_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo New_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","New_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean New_Name__c__is_set = false;

  private java.lang.String New_Name__c;

  public java.lang.String getNew_Name__c() {
    return New_Name__c;
  }

  

  public void setNew_Name__c(java.lang.String New_Name__c) {
    this.New_Name__c = New_Name__c;
    New_Name__c__is_set = true;
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
   * element  : Other_Names_Used__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Other_Names_Used__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Other_Names_Used__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Other_Names_Used__c__is_set = false;

  private java.lang.String Other_Names_Used__c;

  public java.lang.String getOther_Names_Used__c() {
    return Other_Names_Used__c;
  }

  

  public void setOther_Names_Used__c(java.lang.String Other_Names_Used__c) {
    this.Other_Names_Used__c = Other_Names_Used__c;
    Other_Names_Used__c__is_set = true;
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
   * element  : Pdf_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pdf_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pdf_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Pdf_File__c__is_set = false;

  private java.lang.String Pdf_File__c;

  public java.lang.String getPdf_File__c() {
    return Pdf_File__c;
  }

  

  public void setPdf_File__c(java.lang.String Pdf_File__c) {
    this.Pdf_File__c = Pdf_File__c;
    Pdf_File__c__is_set = true;
  }
  
  /**
   * element  : Phone_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Phone_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Phone_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Phone_Number__c__is_set = false;

  private java.lang.String Phone_Number__c;

  public java.lang.String getPhone_Number__c() {
    return Phone_Number__c;
  }

  

  public void setPhone_Number__c(java.lang.String Phone_Number__c) {
    this.Phone_Number__c = Phone_Number__c;
    Phone_Number__c__is_set = true;
  }
  
  /**
   * element  : Preparer_Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Preparer_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Preparer_Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Preparer_Address__c__is_set = false;

  private java.lang.String Preparer_Address__c;

  public java.lang.String getPreparer_Address__c() {
    return Preparer_Address__c;
  }

  

  public void setPreparer_Address__c(java.lang.String Preparer_Address__c) {
    this.Preparer_Address__c = Preparer_Address__c;
    Preparer_Address__c__is_set = true;
  }
  
  /**
   * element  : Preparer_City__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Preparer_City__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Preparer_City__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Preparer_City__c__is_set = false;

  private java.lang.String Preparer_City__c;

  public java.lang.String getPreparer_City__c() {
    return Preparer_City__c;
  }

  

  public void setPreparer_City__c(java.lang.String Preparer_City__c) {
    this.Preparer_City__c = Preparer_City__c;
    Preparer_City__c__is_set = true;
  }
  
  /**
   * element  : Preparer_Date_Submitted__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Preparer_Date_Submitted__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Preparer_Date_Submitted__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Preparer_Date_Submitted__c__is_set = false;

  private java.util.Calendar Preparer_Date_Submitted__c;

  public java.util.Calendar getPreparer_Date_Submitted__c() {
    return Preparer_Date_Submitted__c;
  }

  

  public void setPreparer_Date_Submitted__c(java.util.Calendar Preparer_Date_Submitted__c) {
    this.Preparer_Date_Submitted__c = Preparer_Date_Submitted__c;
    Preparer_Date_Submitted__c__is_set = true;
  }
  
  /**
   * element  : Preparer_Name__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Preparer_Name__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Preparer_Name__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Preparer_Name__c__is_set = false;

  private java.lang.String Preparer_Name__c;

  public java.lang.String getPreparer_Name__c() {
    return Preparer_Name__c;
  }

  

  public void setPreparer_Name__c(java.lang.String Preparer_Name__c) {
    this.Preparer_Name__c = Preparer_Name__c;
    Preparer_Name__c__is_set = true;
  }
  
  /**
   * element  : Preparer_Signature__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Preparer_Signature__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Preparer_Signature__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Preparer_Signature__c__is_set = false;

  private java.lang.String Preparer_Signature__c;

  public java.lang.String getPreparer_Signature__c() {
    return Preparer_Signature__c;
  }

  

  public void setPreparer_Signature__c(java.lang.String Preparer_Signature__c) {
    this.Preparer_Signature__c = Preparer_Signature__c;
    Preparer_Signature__c__is_set = true;
  }
  
  /**
   * element  : Preparer_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Preparer_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Preparer_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Preparer_State__c__is_set = false;

  private java.lang.String Preparer_State__c;

  public java.lang.String getPreparer_State__c() {
    return Preparer_State__c;
  }

  

  public void setPreparer_State__c(java.lang.String Preparer_State__c) {
    this.Preparer_State__c = Preparer_State__c;
    Preparer_State__c__is_set = true;
  }
  
  /**
   * element  : Preparer_Zip_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Preparer_Zip_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Preparer_Zip_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Preparer_Zip_Code__c__is_set = false;

  private java.lang.String Preparer_Zip_Code__c;

  public java.lang.String getPreparer_Zip_Code__c() {
    return Preparer_Zip_Code__c;
  }

  

  public void setPreparer_Zip_Code__c(java.lang.String Preparer_Zip_Code__c) {
    this.Preparer_Zip_Code__c = Preparer_Zip_Code__c;
    Preparer_Zip_Code__c__is_set = true;
  }
  
  /**
   * element  : Previous_Document_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Previous_Document_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Previous_Document_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Previous_Document_Number__c__is_set = false;

  private java.lang.String Previous_Document_Number__c;

  public java.lang.String getPrevious_Document_Number__c() {
    return Previous_Document_Number__c;
  }

  

  public void setPrevious_Document_Number__c(java.lang.String Previous_Document_Number__c) {
    this.Previous_Document_Number__c = Previous_Document_Number__c;
    Previous_Document_Number__c__is_set = true;
  }
  
  /**
   * element  : Previous_Document_Title__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Previous_Document_Title__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Previous_Document_Title__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Previous_Document_Title__c__is_set = false;

  private java.lang.String Previous_Document_Title__c;

  public java.lang.String getPrevious_Document_Title__c() {
    return Previous_Document_Title__c;
  }

  

  public void setPrevious_Document_Title__c(java.lang.String Previous_Document_Title__c) {
    this.Previous_Document_Title__c = Previous_Document_Title__c;
    Previous_Document_Title__c__is_set = true;
  }
  
  /**
   * element  : Previous_Expiration_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Previous_Expiration_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Previous_Expiration_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Previous_Expiration_Date__c__is_set = false;

  private java.util.Calendar Previous_Expiration_Date__c;

  public java.util.Calendar getPrevious_Expiration_Date__c() {
    return Previous_Expiration_Date__c;
  }

  

  public void setPrevious_Expiration_Date__c(java.util.Calendar Previous_Expiration_Date__c) {
    this.Previous_Expiration_Date__c = Previous_Expiration_Date__c;
    Previous_Expiration_Date__c__is_set = true;
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
   * element  : Rehire_Date_Submitted__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Rehire_Date_Submitted__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rehire_Date_Submitted__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Rehire_Date_Submitted__c__is_set = false;

  private java.util.Calendar Rehire_Date_Submitted__c;

  public java.util.Calendar getRehire_Date_Submitted__c() {
    return Rehire_Date_Submitted__c;
  }

  

  public void setRehire_Date_Submitted__c(java.util.Calendar Rehire_Date_Submitted__c) {
    this.Rehire_Date_Submitted__c = Rehire_Date_Submitted__c;
    Rehire_Date_Submitted__c__is_set = true;
  }
  
  /**
   * element  : Rehire_Document_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Rehire_Document_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rehire_Document_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Rehire_Document_Number__c__is_set = false;

  private java.lang.String Rehire_Document_Number__c;

  public java.lang.String getRehire_Document_Number__c() {
    return Rehire_Document_Number__c;
  }

  

  public void setRehire_Document_Number__c(java.lang.String Rehire_Document_Number__c) {
    this.Rehire_Document_Number__c = Rehire_Document_Number__c;
    Rehire_Document_Number__c__is_set = true;
  }
  
  /**
   * element  : Rehire_Document_Title__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Rehire_Document_Title__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rehire_Document_Title__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Rehire_Document_Title__c__is_set = false;

  private java.lang.String Rehire_Document_Title__c;

  public java.lang.String getRehire_Document_Title__c() {
    return Rehire_Document_Title__c;
  }

  

  public void setRehire_Document_Title__c(java.lang.String Rehire_Document_Title__c) {
    this.Rehire_Document_Title__c = Rehire_Document_Title__c;
    Rehire_Document_Title__c__is_set = true;
  }
  
  /**
   * element  : Rehire_Employer_Signature__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Rehire_Employer_Signature__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rehire_Employer_Signature__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Rehire_Employer_Signature__c__is_set = false;

  private java.lang.String Rehire_Employer_Signature__c;

  public java.lang.String getRehire_Employer_Signature__c() {
    return Rehire_Employer_Signature__c;
  }

  

  public void setRehire_Employer_Signature__c(java.lang.String Rehire_Employer_Signature__c) {
    this.Rehire_Employer_Signature__c = Rehire_Employer_Signature__c;
    Rehire_Employer_Signature__c__is_set = true;
  }
  
  /**
   * element  : Rehire_Expiration_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Rehire_Expiration_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rehire_Expiration_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Rehire_Expiration_Date__c__is_set = false;

  private java.util.Calendar Rehire_Expiration_Date__c;

  public java.util.Calendar getRehire_Expiration_Date__c() {
    return Rehire_Expiration_Date__c;
  }

  

  public void setRehire_Expiration_Date__c(java.util.Calendar Rehire_Expiration_Date__c) {
    this.Rehire_Expiration_Date__c = Rehire_Expiration_Date__c;
    Rehire_Expiration_Date__c__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "I9_Form__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Address__c__typeInfo, Address__c, Address__c__is_set);
    __typeMapper.writeObject(__out, Alien_Expiration_Date__c__typeInfo, Alien_Expiration_Date__c, Alien_Expiration_Date__c__is_set);
    __typeMapper.writeString(__out, Alien_Registration_Number__c__typeInfo, Alien_Registration_Number__c, Alien_Registration_Number__c__is_set);
    __typeMapper.writeString(__out, Apartment_Number__c__typeInfo, Apartment_Number__c, Apartment_Number__c__is_set);
    __typeMapper.writeString(__out, Applicant__c__typeInfo, Applicant__c, Applicant__c__is_set);
    __typeMapper.writeObject(__out, Applicant__r__typeInfo, Applicant__r, Applicant__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Business_Address__c__typeInfo, Business_Address__c, Business_Address__c__is_set);
    __typeMapper.writeString(__out, Business_City__c__typeInfo, Business_City__c, Business_City__c__is_set);
    __typeMapper.writeString(__out, Business_State__c__typeInfo, Business_State__c, Business_State__c__is_set);
    __typeMapper.writeString(__out, Business_Zip_Code__c__typeInfo, Business_Zip_Code__c, Business_Zip_Code__c__is_set);
    __typeMapper.writeString(__out, Candidate_Employee__c__typeInfo, Candidate_Employee__c, Candidate_Employee__c__is_set);
    __typeMapper.writeObject(__out, Candidate_Employee__r__typeInfo, Candidate_Employee__r, Candidate_Employee__r__is_set);
    __typeMapper.writeObject(__out, Certification_Date__c__typeInfo, Certification_Date__c, Certification_Date__c__is_set);
    __typeMapper.writeString(__out, Citizen_Status__c__typeInfo, Citizen_Status__c, Citizen_Status__c__is_set);
    __typeMapper.writeString(__out, City__c__typeInfo, City__c, City__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, Complete__c__typeInfo, Complete__c, Complete__c__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Date_Submitted__c__typeInfo, Date_Submitted__c, Date_Submitted__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Birth__c__typeInfo, Date_of_Birth__c, Date_of_Birth__c__is_set);
    __typeMapper.writeObject(__out, Date_of_Rehire__c__typeInfo, Date_of_Rehire__c, Date_of_Rehire__c__is_set);
    __typeMapper.writeString(__out, Document_Number_A1__c__typeInfo, Document_Number_A1__c, Document_Number_A1__c__is_set);
    __typeMapper.writeString(__out, Document_Number_A2__c__typeInfo, Document_Number_A2__c, Document_Number_A2__c__is_set);
    __typeMapper.writeString(__out, Document_Number_A3__c__typeInfo, Document_Number_A3__c, Document_Number_A3__c__is_set);
    __typeMapper.writeString(__out, Document_Number_B__c__typeInfo, Document_Number_B__c, Document_Number_B__c__is_set);
    __typeMapper.writeString(__out, Document_Number_C__c__typeInfo, Document_Number_C__c, Document_Number_C__c__is_set);
    __typeMapper.writeString(__out, Document_Title_A2__c__typeInfo, Document_Title_A2__c, Document_Title_A2__c__is_set);
    __typeMapper.writeString(__out, Document_Title_A3__c__typeInfo, Document_Title_A3__c, Document_Title_A3__c__is_set);
    __typeMapper.writeString(__out, Document_Title_A__c__typeInfo, Document_Title_A__c, Document_Title_A__c__is_set);
    __typeMapper.writeString(__out, Document_Title_B__c__typeInfo, Document_Title_B__c, Document_Title_B__c__is_set);
    __typeMapper.writeString(__out, Document_Title_C__c__typeInfo, Document_Title_C__c, Document_Title_C__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeString(__out, Email_Address__c__typeInfo, Email_Address__c, Email_Address__c__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, Employer_Date_Signed__c__typeInfo, Employer_Date_Signed__c, Employer_Date_Signed__c__is_set);
    __typeMapper.writeString(__out, Employer_Name__c__typeInfo, Employer_Name__c, Employer_Name__c__is_set);
    __typeMapper.writeString(__out, Employer_Signature__c__typeInfo, Employer_Signature__c, Employer_Signature__c__is_set);
    __typeMapper.writeString(__out, Employer_Title__c__typeInfo, Employer_Title__c, Employer_Title__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Expiration_Date_A1__c__typeInfo, Expiration_Date_A1__c, Expiration_Date_A1__c__is_set);
    __typeMapper.writeObject(__out, Expiration_Date_A2__c__typeInfo, Expiration_Date_A2__c, Expiration_Date_A2__c__is_set);
    __typeMapper.writeObject(__out, Expiration_Date_A3__c__typeInfo, Expiration_Date_A3__c, Expiration_Date_A3__c__is_set);
    __typeMapper.writeObject(__out, Expiration_Date_B__c__typeInfo, Expiration_Date_B__c, Expiration_Date_B__c__is_set);
    __typeMapper.writeObject(__out, Expiration_Date_C__c__typeInfo, Expiration_Date_C__c, Expiration_Date_C__c__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeString(__out, First_Name__c__typeInfo, First_Name__c, First_Name__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Issuing_Authority_A2__c__typeInfo, Issuing_Authority_A2__c, Issuing_Authority_A2__c__is_set);
    __typeMapper.writeString(__out, Issuing_Authority_A3__c__typeInfo, Issuing_Authority_A3__c, Issuing_Authority_A3__c__is_set);
    __typeMapper.writeString(__out, Issuing_Authority_A__c__typeInfo, Issuing_Authority_A__c, Issuing_Authority_A__c__is_set);
    __typeMapper.writeString(__out, Issuing_Authority_B__c__typeInfo, Issuing_Authority_B__c, Issuing_Authority_B__c__is_set);
    __typeMapper.writeString(__out, Issuing_Authority_C__c__typeInfo, Issuing_Authority_C__c, Issuing_Authority_C__c__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeString(__out, Last_Name__c__typeInfo, Last_Name__c, Last_Name__c__is_set);
    __typeMapper.writeString(__out, LatestXfdfId__c__typeInfo, LatestXfdfId__c, LatestXfdfId__c__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Maiden_Name__c__typeInfo, Maiden_Name__c, Maiden_Name__c__is_set);
    __typeMapper.writeString(__out, Middle_Initial__c__typeInfo, Middle_Initial__c, Middle_Initial__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, New_Name__c__typeInfo, New_Name__c, New_Name__c__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeString(__out, Other_Names_Used__c__typeInfo, Other_Names_Used__c, Other_Names_Used__c__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Pdf_File__c__typeInfo, Pdf_File__c, Pdf_File__c__is_set);
    __typeMapper.writeString(__out, Phone_Number__c__typeInfo, Phone_Number__c, Phone_Number__c__is_set);
    __typeMapper.writeString(__out, Preparer_Address__c__typeInfo, Preparer_Address__c, Preparer_Address__c__is_set);
    __typeMapper.writeString(__out, Preparer_City__c__typeInfo, Preparer_City__c, Preparer_City__c__is_set);
    __typeMapper.writeObject(__out, Preparer_Date_Submitted__c__typeInfo, Preparer_Date_Submitted__c, Preparer_Date_Submitted__c__is_set);
    __typeMapper.writeString(__out, Preparer_Name__c__typeInfo, Preparer_Name__c, Preparer_Name__c__is_set);
    __typeMapper.writeString(__out, Preparer_Signature__c__typeInfo, Preparer_Signature__c, Preparer_Signature__c__is_set);
    __typeMapper.writeString(__out, Preparer_State__c__typeInfo, Preparer_State__c, Preparer_State__c__is_set);
    __typeMapper.writeString(__out, Preparer_Zip_Code__c__typeInfo, Preparer_Zip_Code__c, Preparer_Zip_Code__c__is_set);
    __typeMapper.writeString(__out, Previous_Document_Number__c__typeInfo, Previous_Document_Number__c, Previous_Document_Number__c__is_set);
    __typeMapper.writeString(__out, Previous_Document_Title__c__typeInfo, Previous_Document_Title__c, Previous_Document_Title__c__is_set);
    __typeMapper.writeObject(__out, Previous_Expiration_Date__c__typeInfo, Previous_Expiration_Date__c, Previous_Expiration_Date__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, Rehire_Date_Submitted__c__typeInfo, Rehire_Date_Submitted__c, Rehire_Date_Submitted__c__is_set);
    __typeMapper.writeString(__out, Rehire_Document_Number__c__typeInfo, Rehire_Document_Number__c, Rehire_Document_Number__c__is_set);
    __typeMapper.writeString(__out, Rehire_Document_Title__c__typeInfo, Rehire_Document_Title__c, Rehire_Document_Title__c__is_set);
    __typeMapper.writeString(__out, Rehire_Employer_Signature__c__typeInfo, Rehire_Employer_Signature__c, Rehire_Employer_Signature__c__is_set);
    __typeMapper.writeObject(__out, Rehire_Expiration_Date__c__typeInfo, Rehire_Expiration_Date__c, Rehire_Expiration_Date__c__is_set);
    __typeMapper.writeString(__out, Signature__c__typeInfo, Signature__c, Signature__c__is_set);
    __typeMapper.writeString(__out, Social_Security_Number__c__typeInfo, Social_Security_Number__c, Social_Security_Number__c__is_set);
    __typeMapper.writeString(__out, State__c__typeInfo, State__c, State__c__is_set);
    __typeMapper.writeString(__out, Status__c__typeInfo, Status__c, Status__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
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
    if (__typeMapper.isElement(__in, Address__c__typeInfo)) {
      setAddress__c((java.lang.String)__typeMapper.readString(__in, Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Alien_Expiration_Date__c__typeInfo)) {
      setAlien_Expiration_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Alien_Expiration_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Alien_Registration_Number__c__typeInfo)) {
      setAlien_Registration_Number__c((java.lang.String)__typeMapper.readString(__in, Alien_Registration_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Apartment_Number__c__typeInfo)) {
      setApartment_Number__c((java.lang.String)__typeMapper.readString(__in, Apartment_Number__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Business_Address__c__typeInfo)) {
      setBusiness_Address__c((java.lang.String)__typeMapper.readString(__in, Business_Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Business_City__c__typeInfo)) {
      setBusiness_City__c((java.lang.String)__typeMapper.readString(__in, Business_City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Business_State__c__typeInfo)) {
      setBusiness_State__c((java.lang.String)__typeMapper.readString(__in, Business_State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Business_Zip_Code__c__typeInfo)) {
      setBusiness_Zip_Code__c((java.lang.String)__typeMapper.readString(__in, Business_Zip_Code__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Certification_Date__c__typeInfo)) {
      setCertification_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Certification_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Citizen_Status__c__typeInfo)) {
      setCitizen_Status__c((java.lang.String)__typeMapper.readString(__in, Citizen_Status__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Complete__c__typeInfo)) {
      setComplete__c((java.lang.Boolean)__typeMapper.readObject(__in, Complete__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Date_Submitted__c__typeInfo)) {
      setDate_Submitted__c((java.util.Calendar)__typeMapper.readObject(__in, Date_Submitted__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Birth__c__typeInfo)) {
      setDate_of_Birth__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Birth__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Date_of_Rehire__c__typeInfo)) {
      setDate_of_Rehire__c((java.util.Calendar)__typeMapper.readObject(__in, Date_of_Rehire__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Number_A1__c__typeInfo)) {
      setDocument_Number_A1__c((java.lang.String)__typeMapper.readString(__in, Document_Number_A1__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Number_A2__c__typeInfo)) {
      setDocument_Number_A2__c((java.lang.String)__typeMapper.readString(__in, Document_Number_A2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Number_A3__c__typeInfo)) {
      setDocument_Number_A3__c((java.lang.String)__typeMapper.readString(__in, Document_Number_A3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Number_B__c__typeInfo)) {
      setDocument_Number_B__c((java.lang.String)__typeMapper.readString(__in, Document_Number_B__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Number_C__c__typeInfo)) {
      setDocument_Number_C__c((java.lang.String)__typeMapper.readString(__in, Document_Number_C__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Title_A2__c__typeInfo)) {
      setDocument_Title_A2__c((java.lang.String)__typeMapper.readString(__in, Document_Title_A2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Title_A3__c__typeInfo)) {
      setDocument_Title_A3__c((java.lang.String)__typeMapper.readString(__in, Document_Title_A3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Title_A__c__typeInfo)) {
      setDocument_Title_A__c((java.lang.String)__typeMapper.readString(__in, Document_Title_A__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Title_B__c__typeInfo)) {
      setDocument_Title_B__c((java.lang.String)__typeMapper.readString(__in, Document_Title_B__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Document_Title_C__c__typeInfo)) {
      setDocument_Title_C__c((java.lang.String)__typeMapper.readString(__in, Document_Title_C__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DuplicateRecordItems__typeInfo)) {
      setDuplicateRecordItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DuplicateRecordItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email_Address__c__typeInfo)) {
      setEmail_Address__c((java.lang.String)__typeMapper.readString(__in, Email_Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employer_Date_Signed__c__typeInfo)) {
      setEmployer_Date_Signed__c((java.util.Calendar)__typeMapper.readObject(__in, Employer_Date_Signed__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employer_Name__c__typeInfo)) {
      setEmployer_Name__c((java.lang.String)__typeMapper.readString(__in, Employer_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employer_Signature__c__typeInfo)) {
      setEmployer_Signature__c((java.lang.String)__typeMapper.readString(__in, Employer_Signature__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employer_Title__c__typeInfo)) {
      setEmployer_Title__c((java.lang.String)__typeMapper.readString(__in, Employer_Title__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Expiration_Date_A1__c__typeInfo)) {
      setExpiration_Date_A1__c((java.util.Calendar)__typeMapper.readObject(__in, Expiration_Date_A1__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Expiration_Date_A2__c__typeInfo)) {
      setExpiration_Date_A2__c((java.util.Calendar)__typeMapper.readObject(__in, Expiration_Date_A2__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Expiration_Date_A3__c__typeInfo)) {
      setExpiration_Date_A3__c((java.util.Calendar)__typeMapper.readObject(__in, Expiration_Date_A3__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Expiration_Date_B__c__typeInfo)) {
      setExpiration_Date_B__c((java.util.Calendar)__typeMapper.readObject(__in, Expiration_Date_B__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Expiration_Date_C__c__typeInfo)) {
      setExpiration_Date_C__c((java.util.Calendar)__typeMapper.readObject(__in, Expiration_Date_C__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Issuing_Authority_A2__c__typeInfo)) {
      setIssuing_Authority_A2__c((java.lang.String)__typeMapper.readString(__in, Issuing_Authority_A2__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Issuing_Authority_A3__c__typeInfo)) {
      setIssuing_Authority_A3__c((java.lang.String)__typeMapper.readString(__in, Issuing_Authority_A3__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Issuing_Authority_A__c__typeInfo)) {
      setIssuing_Authority_A__c((java.lang.String)__typeMapper.readString(__in, Issuing_Authority_A__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Issuing_Authority_B__c__typeInfo)) {
      setIssuing_Authority_B__c((java.lang.String)__typeMapper.readString(__in, Issuing_Authority_B__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Issuing_Authority_C__c__typeInfo)) {
      setIssuing_Authority_C__c((java.lang.String)__typeMapper.readString(__in, Issuing_Authority_C__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LatestXfdfId__c__typeInfo)) {
      setLatestXfdfId__c((java.lang.String)__typeMapper.readString(__in, LatestXfdfId__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Maiden_Name__c__typeInfo)) {
      setMaiden_Name__c((java.lang.String)__typeMapper.readString(__in, Maiden_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Middle_Initial__c__typeInfo)) {
      setMiddle_Initial__c((java.lang.String)__typeMapper.readString(__in, Middle_Initial__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, New_Name__c__typeInfo)) {
      setNew_Name__c((java.lang.String)__typeMapper.readString(__in, New_Name__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Other_Names_Used__c__typeInfo)) {
      setOther_Names_Used__c((java.lang.String)__typeMapper.readString(__in, Other_Names_Used__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Pdf_File__c__typeInfo)) {
      setPdf_File__c((java.lang.String)__typeMapper.readString(__in, Pdf_File__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone_Number__c__typeInfo)) {
      setPhone_Number__c((java.lang.String)__typeMapper.readString(__in, Phone_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Preparer_Address__c__typeInfo)) {
      setPreparer_Address__c((java.lang.String)__typeMapper.readString(__in, Preparer_Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Preparer_City__c__typeInfo)) {
      setPreparer_City__c((java.lang.String)__typeMapper.readString(__in, Preparer_City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Preparer_Date_Submitted__c__typeInfo)) {
      setPreparer_Date_Submitted__c((java.util.Calendar)__typeMapper.readObject(__in, Preparer_Date_Submitted__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Preparer_Name__c__typeInfo)) {
      setPreparer_Name__c((java.lang.String)__typeMapper.readString(__in, Preparer_Name__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Preparer_Signature__c__typeInfo)) {
      setPreparer_Signature__c((java.lang.String)__typeMapper.readString(__in, Preparer_Signature__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Preparer_State__c__typeInfo)) {
      setPreparer_State__c((java.lang.String)__typeMapper.readString(__in, Preparer_State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Preparer_Zip_Code__c__typeInfo)) {
      setPreparer_Zip_Code__c((java.lang.String)__typeMapper.readString(__in, Preparer_Zip_Code__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Previous_Document_Number__c__typeInfo)) {
      setPrevious_Document_Number__c((java.lang.String)__typeMapper.readString(__in, Previous_Document_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Previous_Document_Title__c__typeInfo)) {
      setPrevious_Document_Title__c((java.lang.String)__typeMapper.readString(__in, Previous_Document_Title__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Previous_Expiration_Date__c__typeInfo)) {
      setPrevious_Expiration_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Previous_Expiration_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Rehire_Date_Submitted__c__typeInfo)) {
      setRehire_Date_Submitted__c((java.util.Calendar)__typeMapper.readObject(__in, Rehire_Date_Submitted__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Rehire_Document_Number__c__typeInfo)) {
      setRehire_Document_Number__c((java.lang.String)__typeMapper.readString(__in, Rehire_Document_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Rehire_Document_Title__c__typeInfo)) {
      setRehire_Document_Title__c((java.lang.String)__typeMapper.readString(__in, Rehire_Document_Title__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Rehire_Employer_Signature__c__typeInfo)) {
      setRehire_Employer_Signature__c((java.lang.String)__typeMapper.readString(__in, Rehire_Employer_Signature__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Rehire_Expiration_Date__c__typeInfo)) {
      setRehire_Expiration_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Rehire_Expiration_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Signature__c__typeInfo)) {
      setSignature__c((java.lang.String)__typeMapper.readString(__in, Signature__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Social_Security_Number__c__typeInfo)) {
      setSocial_Security_Number__c((java.lang.String)__typeMapper.readString(__in, Social_Security_Number__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Zip_Code__c__typeInfo)) {
      setZip_Code__c((java.lang.String)__typeMapper.readString(__in, Zip_Code__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[I9_Form__c ");
    sb.append(super.toString());
    sb.append(" Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address__c)+"'\n");
    sb.append(" Alien_Expiration_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Alien_Expiration_Date__c)+"'\n");
    sb.append(" Alien_Registration_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Alien_Registration_Number__c)+"'\n");
    sb.append(" Apartment_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Apartment_Number__c)+"'\n");
    sb.append(" Applicant__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Applicant__c)+"'\n");
    sb.append(" Applicant__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Applicant__r)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Business_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Business_Address__c)+"'\n");
    sb.append(" Business_City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Business_City__c)+"'\n");
    sb.append(" Business_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Business_State__c)+"'\n");
    sb.append(" Business_Zip_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Business_Zip_Code__c)+"'\n");
    sb.append(" Candidate_Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__c)+"'\n");
    sb.append(" Candidate_Employee__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__r)+"'\n");
    sb.append(" Certification_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Certification_Date__c)+"'\n");
    sb.append(" Citizen_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Citizen_Status__c)+"'\n");
    sb.append(" City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Complete__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Complete__c)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Date_Submitted__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_Submitted__c)+"'\n");
    sb.append(" Date_of_Birth__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Birth__c)+"'\n");
    sb.append(" Date_of_Rehire__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Date_of_Rehire__c)+"'\n");
    sb.append(" Document_Number_A1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Number_A1__c)+"'\n");
    sb.append(" Document_Number_A2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Number_A2__c)+"'\n");
    sb.append(" Document_Number_A3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Number_A3__c)+"'\n");
    sb.append(" Document_Number_B__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Number_B__c)+"'\n");
    sb.append(" Document_Number_C__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Number_C__c)+"'\n");
    sb.append(" Document_Title_A2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Title_A2__c)+"'\n");
    sb.append(" Document_Title_A3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Title_A3__c)+"'\n");
    sb.append(" Document_Title_A__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Title_A__c)+"'\n");
    sb.append(" Document_Title_B__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Title_B__c)+"'\n");
    sb.append(" Document_Title_C__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Document_Title_C__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Email_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email_Address__c)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employer_Date_Signed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employer_Date_Signed__c)+"'\n");
    sb.append(" Employer_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employer_Name__c)+"'\n");
    sb.append(" Employer_Signature__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employer_Signature__c)+"'\n");
    sb.append(" Employer_Title__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employer_Title__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Expiration_Date_A1__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Expiration_Date_A1__c)+"'\n");
    sb.append(" Expiration_Date_A2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Expiration_Date_A2__c)+"'\n");
    sb.append(" Expiration_Date_A3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Expiration_Date_A3__c)+"'\n");
    sb.append(" Expiration_Date_B__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Expiration_Date_B__c)+"'\n");
    sb.append(" Expiration_Date_C__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Expiration_Date_C__c)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" First_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(First_Name__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Issuing_Authority_A2__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Issuing_Authority_A2__c)+"'\n");
    sb.append(" Issuing_Authority_A3__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Issuing_Authority_A3__c)+"'\n");
    sb.append(" Issuing_Authority_A__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Issuing_Authority_A__c)+"'\n");
    sb.append(" Issuing_Authority_B__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Issuing_Authority_B__c)+"'\n");
    sb.append(" Issuing_Authority_C__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Issuing_Authority_C__c)+"'\n");
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
    sb.append(" LatestXfdfId__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LatestXfdfId__c)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Maiden_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Maiden_Name__c)+"'\n");
    sb.append(" Middle_Initial__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Middle_Initial__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" New_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(New_Name__c)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Other_Names_Used__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Other_Names_Used__c)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Pdf_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pdf_File__c)+"'\n");
    sb.append(" Phone_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone_Number__c)+"'\n");
    sb.append(" Preparer_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Preparer_Address__c)+"'\n");
    sb.append(" Preparer_City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Preparer_City__c)+"'\n");
    sb.append(" Preparer_Date_Submitted__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Preparer_Date_Submitted__c)+"'\n");
    sb.append(" Preparer_Name__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Preparer_Name__c)+"'\n");
    sb.append(" Preparer_Signature__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Preparer_Signature__c)+"'\n");
    sb.append(" Preparer_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Preparer_State__c)+"'\n");
    sb.append(" Preparer_Zip_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Preparer_Zip_Code__c)+"'\n");
    sb.append(" Previous_Document_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Previous_Document_Number__c)+"'\n");
    sb.append(" Previous_Document_Title__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Previous_Document_Title__c)+"'\n");
    sb.append(" Previous_Expiration_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Previous_Expiration_Date__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" Rehire_Date_Submitted__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rehire_Date_Submitted__c)+"'\n");
    sb.append(" Rehire_Document_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rehire_Document_Number__c)+"'\n");
    sb.append(" Rehire_Document_Title__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rehire_Document_Title__c)+"'\n");
    sb.append(" Rehire_Employer_Signature__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rehire_Employer_Signature__c)+"'\n");
    sb.append(" Rehire_Expiration_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rehire_Expiration_Date__c)+"'\n");
    sb.append(" Signature__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Signature__c)+"'\n");
    sb.append(" Social_Security_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Social_Security_Number__c)+"'\n");
    sb.append(" State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State__c)+"'\n");
    sb.append(" Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status__c)+"'\n");
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
    sb.append(" Zip_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Zip_Code__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}