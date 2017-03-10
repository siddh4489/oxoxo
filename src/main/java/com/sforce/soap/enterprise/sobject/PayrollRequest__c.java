package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class PayrollRequest__c extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public PayrollRequest__c() {
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
   * element  : Address_on_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Address_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address_on_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Address_on_File__c__is_set = false;

  private java.lang.String Address_on_File__c;

  public java.lang.String getAddress_on_File__c() {
    return Address_on_File__c;
  }

  

  public void setAddress_on_File__c(java.lang.String Address_on_File__c) {
    this.Address_on_File__c = Address_on_File__c;
    Address_on_File__c__is_set = true;
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
   * element  : Charge__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Charge__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Charge__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Charge__c__is_set = false;

  private java.lang.String Charge__c;

  public java.lang.String getCharge__c() {
    return Charge__c;
  }

  

  public void setCharge__c(java.lang.String Charge__c) {
    this.Charge__c = Charge__c;
    Charge__c__is_set = true;
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
   * element  : City_on_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo City_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","City_on_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean City_on_File__c__is_set = false;

  private java.lang.String City_on_File__c;

  public java.lang.String getCity_on_File__c() {
    return City_on_File__c;
  }

  

  public void setCity_on_File__c(java.lang.String City_on_File__c) {
    this.City_on_File__c = City_on_File__c;
    City_on_File__c__is_set = true;
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
   * element  : Costs_Recovered__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Costs_Recovered__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Costs_Recovered__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Costs_Recovered__c__is_set = false;

  private java.lang.String Costs_Recovered__c;

  public java.lang.String getCosts_Recovered__c() {
    return Costs_Recovered__c;
  }

  

  public void setCosts_Recovered__c(java.lang.String Costs_Recovered__c) {
    this.Costs_Recovered__c = Costs_Recovered__c;
    Costs_Recovered__c__is_set = true;
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
   * element  : Customer_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Customer_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Customer_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Customer_ID__c__is_set = false;

  private java.lang.String Customer_ID__c;

  public java.lang.String getCustomer_ID__c() {
    return Customer_ID__c;
  }

  

  public void setCustomer_ID__c(java.lang.String Customer_ID__c) {
    this.Customer_ID__c = Customer_ID__c;
    Customer_ID__c__is_set = true;
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
   * element  : Deduction__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Deduction__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Deduction__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Deduction__c__is_set = false;

  private java.lang.String Deduction__c;

  public java.lang.String getDeduction__c() {
    return Deduction__c;
  }

  

  public void setDeduction__c(java.lang.String Deduction__c) {
    this.Deduction__c = Deduction__c;
    Deduction__c__is_set = true;
  }
  
  /**
   * element  : Deduction__r of type {urn:sobject.enterprise.soap.sforce.com}Field_Expense__c
   * java type: com.sforce.soap.enterprise.sobject.Field_Expense__c
   */
  private static final com.sforce.ws.bind.TypeInfo Deduction__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Deduction__r","urn:sobject.enterprise.soap.sforce.com","Field_Expense__c",0,1,true);

  private boolean Deduction__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Field_Expense__c Deduction__r;

  public com.sforce.soap.enterprise.sobject.Field_Expense__c getDeduction__r() {
    return Deduction__r;
  }

  

  public void setDeduction__r(com.sforce.soap.enterprise.sobject.Field_Expense__c Deduction__r) {
    this.Deduction__r = Deduction__r;
    Deduction__r__is_set = true;
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
   * element  : Delivery_Type__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Delivery_Type__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Delivery_Type__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Delivery_Type__c__is_set = false;

  private java.lang.String Delivery_Type__c;

  public java.lang.String getDelivery_Type__c() {
    return Delivery_Type__c;
  }

  

  public void setDelivery_Type__c(java.lang.String Delivery_Type__c) {
    this.Delivery_Type__c = Delivery_Type__c;
    Delivery_Type__c__is_set = true;
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
   * element  : Employee_Email__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Email__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Email__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_Email__c__is_set = false;

  private java.lang.String Employee_Email__c;

  public java.lang.String getEmployee_Email__c() {
    return Employee_Email__c;
  }

  

  public void setEmployee_Email__c(java.lang.String Employee_Email__c) {
    this.Employee_Email__c = Employee_Email__c;
    Employee_Email__c__is_set = true;
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
   * element  : Employee_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Employee_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Employee_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Employee_Phone__c__is_set = false;

  private java.lang.String Employee_Phone__c;

  public java.lang.String getEmployee_Phone__c() {
    return Employee_Phone__c;
  }

  

  public void setEmployee_Phone__c(java.lang.String Employee_Phone__c) {
    this.Employee_Phone__c = Employee_Phone__c;
    Employee_Phone__c__is_set = true;
  }
  
  /**
   * element  : Estimated_Delivery_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Estimated_Delivery_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Estimated_Delivery_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Estimated_Delivery_Date__c__is_set = false;

  private java.util.Calendar Estimated_Delivery_Date__c;

  public java.util.Calendar getEstimated_Delivery_Date__c() {
    return Estimated_Delivery_Date__c;
  }

  

  public void setEstimated_Delivery_Date__c(java.util.Calendar Estimated_Delivery_Date__c) {
    this.Estimated_Delivery_Date__c = Estimated_Delivery_Date__c;
    Estimated_Delivery_Date__c__is_set = true;
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
   * element  : Fee_Waived__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fee_Waived__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fee_Waived__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fee_Waived__c__is_set = false;

  private java.lang.String Fee_Waived__c;

  public java.lang.String getFee_Waived__c() {
    return Fee_Waived__c;
  }

  

  public void setFee_Waived__c(java.lang.String Fee_Waived__c) {
    this.Fee_Waived__c = Fee_Waived__c;
    Fee_Waived__c__is_set = true;
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
   * element  : I9_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo I9_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","I9_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean I9_Status__c__is_set = false;

  private java.lang.String I9_Status__c;

  public java.lang.String getI9_Status__c() {
    return I9_Status__c;
  }

  

  public void setI9_Status__c(java.lang.String I9_Status__c) {
    this.I9_Status__c = I9_Status__c;
    I9_Status__c__is_set = true;
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
   * element  : Mailed_By__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Mailed_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Mailed_By__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Mailed_By__c__is_set = false;

  private java.lang.String Mailed_By__c;

  public java.lang.String getMailed_By__c() {
    return Mailed_By__c;
  }

  

  public void setMailed_By__c(java.lang.String Mailed_By__c) {
    this.Mailed_By__c = Mailed_By__c;
    Mailed_By__c__is_set = true;
  }
  
  /**
   * element  : Mailed_By__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Mailed_By__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Mailed_By__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Mailed_By__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Mailed_By__r;

  public com.sforce.soap.enterprise.sobject.User getMailed_By__r() {
    return Mailed_By__r;
  }

  

  public void setMailed_By__r(com.sforce.soap.enterprise.sobject.User Mailed_By__r) {
    this.Mailed_By__r = Mailed_By__r;
    Mailed_By__r__is_set = true;
  }
  
  /**
   * element  : Mailed_On__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Mailed_On__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Mailed_On__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Mailed_On__c__is_set = false;

  private java.util.Calendar Mailed_On__c;

  public java.util.Calendar getMailed_On__c() {
    return Mailed_On__c;
  }

  

  public void setMailed_On__c(java.util.Calendar Mailed_On__c) {
    this.Mailed_On__c = Mailed_On__c;
    Mailed_On__c__is_set = true;
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
   * element  : Notes_Comments__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Notes_Comments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes_Comments__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Notes_Comments__c__is_set = false;

  private java.lang.String Notes_Comments__c;

  public java.lang.String getNotes_Comments__c() {
    return Notes_Comments__c;
  }

  

  public void setNotes_Comments__c(java.lang.String Notes_Comments__c) {
    this.Notes_Comments__c = Notes_Comments__c;
    Notes_Comments__c__is_set = true;
  }
  
  /**
   * element  : Number_of_Weeks_to_Recover__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Number_of_Weeks_to_Recover__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number_of_Weeks_to_Recover__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Number_of_Weeks_to_Recover__c__is_set = false;

  private java.lang.String Number_of_Weeks_to_Recover__c;

  public java.lang.String getNumber_of_Weeks_to_Recover__c() {
    return Number_of_Weeks_to_Recover__c;
  }

  

  public void setNumber_of_Weeks_to_Recover__c(java.lang.String Number_of_Weeks_to_Recover__c) {
    this.Number_of_Weeks_to_Recover__c = Number_of_Weeks_to_Recover__c;
    Number_of_Weeks_to_Recover__c__is_set = true;
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
   * element  : Pay_Card_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pay_Card_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pay_Card_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Pay_Card_ID__c__is_set = false;

  private java.lang.String Pay_Card_ID__c;

  public java.lang.String getPay_Card_ID__c() {
    return Pay_Card_ID__c;
  }

  

  public void setPay_Card_ID__c(java.lang.String Pay_Card_ID__c) {
    this.Pay_Card_ID__c = Pay_Card_ID__c;
    Pay_Card_ID__c__is_set = true;
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
   * element  : Postal_Code__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Postal_Code__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Postal_Code__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Postal_Code__c__is_set = false;

  private java.lang.String Postal_Code__c;

  public java.lang.String getPostal_Code__c() {
    return Postal_Code__c;
  }

  

  public void setPostal_Code__c(java.lang.String Postal_Code__c) {
    this.Postal_Code__c = Postal_Code__c;
    Postal_Code__c__is_set = true;
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
   * element  : Reference_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Reference_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Reference_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Reference_Number__c__is_set = false;

  private java.lang.String Reference_Number__c;

  public java.lang.String getReference_Number__c() {
    return Reference_Number__c;
  }

  

  public void setReference_Number__c(java.lang.String Reference_Number__c) {
    this.Reference_Number__c = Reference_Number__c;
    Reference_Number__c__is_set = true;
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
   * element  : Send_to_Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Send_to_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Send_to_Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Send_to_Address__c__is_set = false;

  private java.lang.String Send_to_Address__c;

  public java.lang.String getSend_to_Address__c() {
    return Send_to_Address__c;
  }

  

  public void setSend_to_Address__c(java.lang.String Send_to_Address__c) {
    this.Send_to_Address__c = Send_to_Address__c;
    Send_to_Address__c__is_set = true;
  }
  
  /**
   * element  : Send_to_State__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Send_to_State__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Send_to_State__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Send_to_State__c__is_set = false;

  private java.lang.String Send_to_State__c;

  public java.lang.String getSend_to_State__c() {
    return Send_to_State__c;
  }

  

  public void setSend_to_State__c(java.lang.String Send_to_State__c) {
    this.Send_to_State__c = Send_to_State__c;
    Send_to_State__c__is_set = true;
  }
  
  /**
   * element  : Sender_Account__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Sender_Account__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Sender_Account__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Sender_Account__c__is_set = false;

  private java.lang.String Sender_Account__c;

  public java.lang.String getSender_Account__c() {
    return Sender_Account__c;
  }

  

  public void setSender_Account__c(java.lang.String Sender_Account__c) {
    this.Sender_Account__c = Sender_Account__c;
    Sender_Account__c__is_set = true;
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
   * element  : State_on_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State_on_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State_on_File__c__is_set = false;

  private java.lang.String State_on_File__c;

  public java.lang.String getState_on_File__c() {
    return State_on_File__c;
  }

  

  public void setState_on_File__c(java.lang.String State_on_File__c) {
    this.State_on_File__c = State_on_File__c;
    State_on_File__c__is_set = true;
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
   * element  : Street__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Street__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Street__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Street__c__is_set = false;

  private java.lang.String Street__c;

  public java.lang.String getStreet__c() {
    return Street__c;
  }

  

  public void setStreet__c(java.lang.String Street__c) {
    this.Street__c = Street__c;
    Street__c__is_set = true;
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
   * element  : Tracking_Id__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Tracking_Id__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tracking_Id__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Tracking_Id__c__is_set = false;

  private java.lang.String Tracking_Id__c;

  public java.lang.String getTracking_Id__c() {
    return Tracking_Id__c;
  }

  

  public void setTracking_Id__c(java.lang.String Tracking_Id__c) {
    this.Tracking_Id__c = Tracking_Id__c;
    Tracking_Id__c__is_set = true;
  }
  
  /**
   * element  : Two_ID_s_on_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Two_ID_s_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Two_ID_s_on_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Two_ID_s_on_File__c__is_set = false;

  private java.lang.String Two_ID_s_on_File__c;

  public java.lang.String getTwo_ID_s_on_File__c() {
    return Two_ID_s_on_File__c;
  }

  

  public void setTwo_ID_s_on_File__c(java.lang.String Two_ID_s_on_File__c) {
    this.Two_ID_s_on_File__c = Two_ID_s_on_File__c;
    Two_ID_s_on_File__c__is_set = true;
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
   * element  : Zip_Code_on_File__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Zip_Code_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Zip_Code_on_File__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Zip_Code_on_File__c__is_set = false;

  private java.lang.String Zip_Code_on_File__c;

  public java.lang.String getZip_Code_on_File__c() {
    return Zip_Code_on_File__c;
  }

  

  public void setZip_Code_on_File__c(java.lang.String Zip_Code_on_File__c) {
    this.Zip_Code_on_File__c = Zip_Code_on_File__c;
    Zip_Code_on_File__c__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PayrollRequest__c");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, Actual_Payment_Amount__c__typeInfo, Actual_Payment_Amount__c, Actual_Payment_Amount__c__is_set);
    __typeMapper.writeString(__out, Address_on_File__c__typeInfo, Address_on_File__c, Address_on_File__c__is_set);
    __typeMapper.writeObject(__out, Amount__c__typeInfo, Amount__c, Amount__c__is_set);
    __typeMapper.writeString(__out, Assignment__c__typeInfo, Assignment__c, Assignment__c__is_set);
    __typeMapper.writeObject(__out, Assignment__r__typeInfo, Assignment__r, Assignment__r__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeString(__out, Candidate_Employee__c__typeInfo, Candidate_Employee__c, Candidate_Employee__c__is_set);
    __typeMapper.writeObject(__out, Candidate_Employee__r__typeInfo, Candidate_Employee__r, Candidate_Employee__r__is_set);
    __typeMapper.writeString(__out, Charge__c__typeInfo, Charge__c, Charge__c__is_set);
    __typeMapper.writeString(__out, City__c__typeInfo, City__c, City__c__is_set);
    __typeMapper.writeString(__out, City_on_File__c__typeInfo, City_on_File__c, City_on_File__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeString(__out, Costs_Recovered__c__typeInfo, Costs_Recovered__c, Costs_Recovered__c__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Customer_ID__c__typeInfo, Customer_ID__c, Customer_ID__c__is_set);
    __typeMapper.writeObject(__out, DOB__c__typeInfo, DOB__c, DOB__c__is_set);
    __typeMapper.writeString(__out, Deduction__c__typeInfo, Deduction__c, Deduction__c__is_set);
    __typeMapper.writeObject(__out, Deduction__r__typeInfo, Deduction__r, Deduction__r__is_set);
    __typeMapper.writeObject(__out, Deductions__r__typeInfo, Deductions__r, Deductions__r__is_set);
    __typeMapper.writeString(__out, Delivery_Type__c__typeInfo, Delivery_Type__c, Delivery_Type__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeString(__out, Employee_Email__c__typeInfo, Employee_Email__c, Employee_Email__c__is_set);
    __typeMapper.writeString(__out, Employee_ID__c__typeInfo, Employee_ID__c, Employee_ID__c__is_set);
    __typeMapper.writeString(__out, Employee_Phone__c__typeInfo, Employee_Phone__c, Employee_Phone__c__is_set);
    __typeMapper.writeObject(__out, Estimated_Delivery_Date__c__typeInfo, Estimated_Delivery_Date__c, Estimated_Delivery_Date__c__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeString(__out, Fee_Waived__c__typeInfo, Fee_Waived__c, Fee_Waived__c__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, I9_Status__c__typeInfo, I9_Status__c, I9_Status__c__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Mailed_By__c__typeInfo, Mailed_By__c, Mailed_By__c__is_set);
    __typeMapper.writeObject(__out, Mailed_By__r__typeInfo, Mailed_By__r, Mailed_By__r__is_set);
    __typeMapper.writeObject(__out, Mailed_On__c__typeInfo, Mailed_On__c, Mailed_On__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeString(__out, Notes_Comments__c__typeInfo, Notes_Comments__c, Notes_Comments__c__is_set);
    __typeMapper.writeString(__out, Number_of_Weeks_to_Recover__c__typeInfo, Number_of_Weeks_to_Recover__c, Number_of_Weeks_to_Recover__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Pay_Card_ID__c__typeInfo, Pay_Card_ID__c, Pay_Card_ID__c__is_set);
    __typeMapper.writeString(__out, Payment_Method__c__typeInfo, Payment_Method__c, Payment_Method__c__is_set);
    __typeMapper.writeString(__out, Postal_Code__c__typeInfo, Postal_Code__c, Postal_Code__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeString(__out, Reason__c__typeInfo, Reason__c, Reason__c__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeString(__out, Reference_Number__c__typeInfo, Reference_Number__c, Reference_Number__c__is_set);
    __typeMapper.writeString(__out, SSN__c__typeInfo, SSN__c, SSN__c__is_set);
    __typeMapper.writeString(__out, Send_to_Address__c__typeInfo, Send_to_Address__c, Send_to_Address__c__is_set);
    __typeMapper.writeString(__out, Send_to_State__c__typeInfo, Send_to_State__c, Send_to_State__c__is_set);
    __typeMapper.writeString(__out, Sender_Account__c__typeInfo, Sender_Account__c, Sender_Account__c__is_set);
    __typeMapper.writeString(__out, State__c__typeInfo, State__c, State__c__is_set);
    __typeMapper.writeString(__out, State_on_File__c__typeInfo, State_on_File__c, State_on_File__c__is_set);
    __typeMapper.writeString(__out, Status__c__typeInfo, Status__c, Status__c__is_set);
    __typeMapper.writeString(__out, Street__c__typeInfo, Street__c, Street__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeString(__out, Tracking_Id__c__typeInfo, Tracking_Id__c, Tracking_Id__c__is_set);
    __typeMapper.writeString(__out, Two_ID_s_on_File__c__typeInfo, Two_ID_s_on_File__c, Two_ID_s_on_File__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeString(__out, Zip_Code_on_File__c__typeInfo, Zip_Code_on_File__c, Zip_Code_on_File__c__is_set);
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
    if (__typeMapper.isElement(__in, Address_on_File__c__typeInfo)) {
      setAddress_on_File__c((java.lang.String)__typeMapper.readString(__in, Address_on_File__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Candidate_Employee__c__typeInfo)) {
      setCandidate_Employee__c((java.lang.String)__typeMapper.readString(__in, Candidate_Employee__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Candidate_Employee__r__typeInfo)) {
      setCandidate_Employee__r((com.sforce.soap.enterprise.sobject.Candidate_Employee__c)__typeMapper.readObject(__in, Candidate_Employee__r__typeInfo, com.sforce.soap.enterprise.sobject.Candidate_Employee__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Charge__c__typeInfo)) {
      setCharge__c((java.lang.String)__typeMapper.readString(__in, Charge__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, City__c__typeInfo)) {
      setCity__c((java.lang.String)__typeMapper.readString(__in, City__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, City_on_File__c__typeInfo)) {
      setCity_on_File__c((java.lang.String)__typeMapper.readString(__in, City_on_File__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Costs_Recovered__c__typeInfo)) {
      setCosts_Recovered__c((java.lang.String)__typeMapper.readString(__in, Costs_Recovered__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Customer_ID__c__typeInfo)) {
      setCustomer_ID__c((java.lang.String)__typeMapper.readString(__in, Customer_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DOB__c__typeInfo)) {
      setDOB__c((java.util.Calendar)__typeMapper.readObject(__in, DOB__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Deduction__c__typeInfo)) {
      setDeduction__c((java.lang.String)__typeMapper.readString(__in, Deduction__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Deduction__r__typeInfo)) {
      setDeduction__r((com.sforce.soap.enterprise.sobject.Field_Expense__c)__typeMapper.readObject(__in, Deduction__r__typeInfo, com.sforce.soap.enterprise.sobject.Field_Expense__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Deductions__r__typeInfo)) {
      setDeductions__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Deductions__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Delivery_Type__c__typeInfo)) {
      setDelivery_Type__c((java.lang.String)__typeMapper.readString(__in, Delivery_Type__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Employee_Email__c__typeInfo)) {
      setEmployee_Email__c((java.lang.String)__typeMapper.readString(__in, Employee_Email__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee_ID__c__typeInfo)) {
      setEmployee_ID__c((java.lang.String)__typeMapper.readString(__in, Employee_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Employee_Phone__c__typeInfo)) {
      setEmployee_Phone__c((java.lang.String)__typeMapper.readString(__in, Employee_Phone__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Estimated_Delivery_Date__c__typeInfo)) {
      setEstimated_Delivery_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Estimated_Delivery_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Fee_Waived__c__typeInfo)) {
      setFee_Waived__c((java.lang.String)__typeMapper.readString(__in, Fee_Waived__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, I9_Status__c__typeInfo)) {
      setI9_Status__c((java.lang.String)__typeMapper.readString(__in, I9_Status__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Mailed_By__c__typeInfo)) {
      setMailed_By__c((java.lang.String)__typeMapper.readString(__in, Mailed_By__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Mailed_By__r__typeInfo)) {
      setMailed_By__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Mailed_By__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Mailed_On__c__typeInfo)) {
      setMailed_On__c((java.util.Calendar)__typeMapper.readObject(__in, Mailed_On__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Notes_Comments__c__typeInfo)) {
      setNotes_Comments__c((java.lang.String)__typeMapper.readString(__in, Notes_Comments__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Number_of_Weeks_to_Recover__c__typeInfo)) {
      setNumber_of_Weeks_to_Recover__c((java.lang.String)__typeMapper.readString(__in, Number_of_Weeks_to_Recover__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Pay_Card_ID__c__typeInfo)) {
      setPay_Card_ID__c((java.lang.String)__typeMapper.readString(__in, Pay_Card_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Payment_Method__c__typeInfo)) {
      setPayment_Method__c((java.lang.String)__typeMapper.readString(__in, Payment_Method__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Postal_Code__c__typeInfo)) {
      setPostal_Code__c((java.lang.String)__typeMapper.readString(__in, Postal_Code__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, RecordType__typeInfo)) {
      setRecordType((com.sforce.soap.enterprise.sobject.RecordType)__typeMapper.readObject(__in, RecordType__typeInfo, com.sforce.soap.enterprise.sobject.RecordType.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, RecordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Reference_Number__c__typeInfo)) {
      setReference_Number__c((java.lang.String)__typeMapper.readString(__in, Reference_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SSN__c__typeInfo)) {
      setSSN__c((java.lang.String)__typeMapper.readString(__in, SSN__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Send_to_Address__c__typeInfo)) {
      setSend_to_Address__c((java.lang.String)__typeMapper.readString(__in, Send_to_Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Send_to_State__c__typeInfo)) {
      setSend_to_State__c((java.lang.String)__typeMapper.readString(__in, Send_to_State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Sender_Account__c__typeInfo)) {
      setSender_Account__c((java.lang.String)__typeMapper.readString(__in, Sender_Account__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__c__typeInfo)) {
      setState__c((java.lang.String)__typeMapper.readString(__in, State__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State_on_File__c__typeInfo)) {
      setState_on_File__c((java.lang.String)__typeMapper.readString(__in, State_on_File__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__c__typeInfo)) {
      setStatus__c((java.lang.String)__typeMapper.readString(__in, Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Street__c__typeInfo)) {
      setStreet__c((java.lang.String)__typeMapper.readString(__in, Street__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Tracking_Id__c__typeInfo)) {
      setTracking_Id__c((java.lang.String)__typeMapper.readString(__in, Tracking_Id__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Two_ID_s_on_File__c__typeInfo)) {
      setTwo_ID_s_on_File__c((java.lang.String)__typeMapper.readString(__in, Two_ID_s_on_File__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Zip_Code_on_File__c__typeInfo)) {
      setZip_Code_on_File__c((java.lang.String)__typeMapper.readString(__in, Zip_Code_on_File__c__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PayrollRequest__c ");
    sb.append(super.toString());
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Actual_Payment_Amount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Actual_Payment_Amount__c)+"'\n");
    sb.append(" Address_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address_on_File__c)+"'\n");
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
    sb.append(" Candidate_Employee__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__c)+"'\n");
    sb.append(" Candidate_Employee__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Candidate_Employee__r)+"'\n");
    sb.append(" Charge__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Charge__c)+"'\n");
    sb.append(" City__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City__c)+"'\n");
    sb.append(" City_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City_on_File__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" Costs_Recovered__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Costs_Recovered__c)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Customer_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Customer_ID__c)+"'\n");
    sb.append(" DOB__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DOB__c)+"'\n");
    sb.append(" Deduction__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Deduction__c)+"'\n");
    sb.append(" Deduction__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Deduction__r)+"'\n");
    sb.append(" Deductions__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Deductions__r)+"'\n");
    sb.append(" Delivery_Type__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Delivery_Type__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" Employee_Email__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Email__c)+"'\n");
    sb.append(" Employee_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_ID__c)+"'\n");
    sb.append(" Employee_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Employee_Phone__c)+"'\n");
    sb.append(" Estimated_Delivery_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Estimated_Delivery_Date__c)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" Fee_Waived__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fee_Waived__c)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" I9_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(I9_Status__c)+"'\n");
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
    sb.append(" Mailed_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Mailed_By__c)+"'\n");
    sb.append(" Mailed_By__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Mailed_By__r)+"'\n");
    sb.append(" Mailed_On__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Mailed_On__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" Notes_Comments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes_Comments__c)+"'\n");
    sb.append(" Number_of_Weeks_to_Recover__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Weeks_to_Recover__c)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Pay_Card_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pay_Card_ID__c)+"'\n");
    sb.append(" Payment_Method__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Payment_Method__c)+"'\n");
    sb.append(" Postal_Code__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Postal_Code__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Reason__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Reason__c)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Reference_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Reference_Number__c)+"'\n");
    sb.append(" SSN__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SSN__c)+"'\n");
    sb.append(" Send_to_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Send_to_Address__c)+"'\n");
    sb.append(" Send_to_State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Send_to_State__c)+"'\n");
    sb.append(" Sender_Account__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sender_Account__c)+"'\n");
    sb.append(" State__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State__c)+"'\n");
    sb.append(" State_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State_on_File__c)+"'\n");
    sb.append(" Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status__c)+"'\n");
    sb.append(" Street__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Street__c)+"'\n");
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
    sb.append(" Tracking_Id__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tracking_Id__c)+"'\n");
    sb.append(" Two_ID_s_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Two_ID_s_on_File__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" Zip_Code_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Zip_Code_on_File__c)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}