package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Contract extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Contract() {
  }
    
  
  /**
   * element  : Account of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Account__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Account","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean Account__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account Account;

  public com.sforce.soap.enterprise.sobject.Account getAccount() {
    return Account;
  }

  

  public void setAccount(com.sforce.soap.enterprise.sobject.Account Account) {
    this.Account = Account;
    Account__is_set = true;
  }
  
  /**
   * element  : AccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AccountId__is_set = false;

  private java.lang.String AccountId;

  public java.lang.String getAccountId() {
    return AccountId;
  }

  

  public void setAccountId(java.lang.String AccountId) {
    this.AccountId = AccountId;
    AccountId__is_set = true;
  }
  
  /**
   * element  : ActivatedBy of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo ActivatedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean ActivatedBy__is_set = false;

  private com.sforce.soap.enterprise.sobject.User ActivatedBy;

  public com.sforce.soap.enterprise.sobject.User getActivatedBy() {
    return ActivatedBy;
  }

  

  public void setActivatedBy(com.sforce.soap.enterprise.sobject.User ActivatedBy) {
    this.ActivatedBy = ActivatedBy;
    ActivatedBy__is_set = true;
  }
  
  /**
   * element  : ActivatedById of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ActivatedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivatedById","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ActivatedById__is_set = false;

  private java.lang.String ActivatedById;

  public java.lang.String getActivatedById() {
    return ActivatedById;
  }

  

  public void setActivatedById(java.lang.String ActivatedById) {
    this.ActivatedById = ActivatedById;
    ActivatedById__is_set = true;
  }
  
  /**
   * element  : ActivatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ActivatedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ActivatedDate__is_set = false;

  private java.util.Calendar ActivatedDate;

  public java.util.Calendar getActivatedDate() {
    return ActivatedDate;
  }

  

  public void setActivatedDate(java.util.Calendar ActivatedDate) {
    this.ActivatedDate = ActivatedDate;
    ActivatedDate__is_set = true;
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
   * element  : Approvals of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Approvals__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Approvals","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Approvals__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Approvals;

  public com.sforce.soap.enterprise.QueryResult getApprovals() {
    return Approvals;
  }

  

  public void setApprovals(com.sforce.soap.enterprise.QueryResult Approvals) {
    this.Approvals = Approvals;
    Approvals__is_set = true;
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
   * element  : BillingAddress of type {urn:enterprise.soap.sforce.com}address
   * java type: com.sforce.soap.enterprise.Address
   */
  private static final com.sforce.ws.bind.TypeInfo BillingAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingAddress","urn:enterprise.soap.sforce.com","address",0,1,true);

  private boolean BillingAddress__is_set = false;

  private com.sforce.soap.enterprise.Address BillingAddress;

  public com.sforce.soap.enterprise.Address getBillingAddress() {
    return BillingAddress;
  }

  

  public void setBillingAddress(com.sforce.soap.enterprise.Address BillingAddress) {
    this.BillingAddress = BillingAddress;
    BillingAddress__is_set = true;
  }
  
  /**
   * element  : BillingCity of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BillingCity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingCity","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BillingCity__is_set = false;

  private java.lang.String BillingCity;

  public java.lang.String getBillingCity() {
    return BillingCity;
  }

  

  public void setBillingCity(java.lang.String BillingCity) {
    this.BillingCity = BillingCity;
    BillingCity__is_set = true;
  }
  
  /**
   * element  : BillingCountry of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BillingCountry__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingCountry","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BillingCountry__is_set = false;

  private java.lang.String BillingCountry;

  public java.lang.String getBillingCountry() {
    return BillingCountry;
  }

  

  public void setBillingCountry(java.lang.String BillingCountry) {
    this.BillingCountry = BillingCountry;
    BillingCountry__is_set = true;
  }
  
  /**
   * element  : BillingGeocodeAccuracy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BillingGeocodeAccuracy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingGeocodeAccuracy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BillingGeocodeAccuracy__is_set = false;

  private java.lang.String BillingGeocodeAccuracy;

  public java.lang.String getBillingGeocodeAccuracy() {
    return BillingGeocodeAccuracy;
  }

  

  public void setBillingGeocodeAccuracy(java.lang.String BillingGeocodeAccuracy) {
    this.BillingGeocodeAccuracy = BillingGeocodeAccuracy;
    BillingGeocodeAccuracy__is_set = true;
  }
  
  /**
   * element  : BillingLatitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo BillingLatitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingLatitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean BillingLatitude__is_set = false;

  private java.lang.Double BillingLatitude;

  public java.lang.Double getBillingLatitude() {
    return BillingLatitude;
  }

  

  public void setBillingLatitude(java.lang.Double BillingLatitude) {
    this.BillingLatitude = BillingLatitude;
    BillingLatitude__is_set = true;
  }
  
  /**
   * element  : BillingLongitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo BillingLongitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingLongitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean BillingLongitude__is_set = false;

  private java.lang.Double BillingLongitude;

  public java.lang.Double getBillingLongitude() {
    return BillingLongitude;
  }

  

  public void setBillingLongitude(java.lang.Double BillingLongitude) {
    this.BillingLongitude = BillingLongitude;
    BillingLongitude__is_set = true;
  }
  
  /**
   * element  : BillingPostalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BillingPostalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingPostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BillingPostalCode__is_set = false;

  private java.lang.String BillingPostalCode;

  public java.lang.String getBillingPostalCode() {
    return BillingPostalCode;
  }

  

  public void setBillingPostalCode(java.lang.String BillingPostalCode) {
    this.BillingPostalCode = BillingPostalCode;
    BillingPostalCode__is_set = true;
  }
  
  /**
   * element  : BillingState of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BillingState__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingState","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BillingState__is_set = false;

  private java.lang.String BillingState;

  public java.lang.String getBillingState() {
    return BillingState;
  }

  

  public void setBillingState(java.lang.String BillingState) {
    this.BillingState = BillingState;
    BillingState__is_set = true;
  }
  
  /**
   * element  : BillingStreet of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BillingStreet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingStreet","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BillingStreet__is_set = false;

  private java.lang.String BillingStreet;

  public java.lang.String getBillingStreet() {
    return BillingStreet;
  }

  

  public void setBillingStreet(java.lang.String BillingStreet) {
    this.BillingStreet = BillingStreet;
    BillingStreet__is_set = true;
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
   * element  : CompanySigned of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo CompanySigned__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CompanySigned","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean CompanySigned__is_set = false;

  private com.sforce.soap.enterprise.sobject.User CompanySigned;

  public com.sforce.soap.enterprise.sobject.User getCompanySigned() {
    return CompanySigned;
  }

  

  public void setCompanySigned(com.sforce.soap.enterprise.sobject.User CompanySigned) {
    this.CompanySigned = CompanySigned;
    CompanySigned__is_set = true;
  }
  
  /**
   * element  : CompanySignedDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CompanySignedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CompanySignedDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean CompanySignedDate__is_set = false;

  private java.util.Calendar CompanySignedDate;

  public java.util.Calendar getCompanySignedDate() {
    return CompanySignedDate;
  }

  

  public void setCompanySignedDate(java.util.Calendar CompanySignedDate) {
    this.CompanySignedDate = CompanySignedDate;
    CompanySignedDate__is_set = true;
  }
  
  /**
   * element  : CompanySignedId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CompanySignedId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CompanySignedId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CompanySignedId__is_set = false;

  private java.lang.String CompanySignedId;

  public java.lang.String getCompanySignedId() {
    return CompanySignedId;
  }

  

  public void setCompanySignedId(java.lang.String CompanySignedId) {
    this.CompanySignedId = CompanySignedId;
    CompanySignedId__is_set = true;
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
   * element  : ContractContactRoles of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ContractContactRoles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContractContactRoles","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ContractContactRoles__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ContractContactRoles;

  public com.sforce.soap.enterprise.QueryResult getContractContactRoles() {
    return ContractContactRoles;
  }

  

  public void setContractContactRoles(com.sforce.soap.enterprise.QueryResult ContractContactRoles) {
    this.ContractContactRoles = ContractContactRoles;
    ContractContactRoles__is_set = true;
  }
  
  /**
   * element  : ContractNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContractNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContractNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ContractNumber__is_set = false;

  private java.lang.String ContractNumber;

  public java.lang.String getContractNumber() {
    return ContractNumber;
  }

  

  public void setContractNumber(java.lang.String ContractNumber) {
    this.ContractNumber = ContractNumber;
    ContractNumber__is_set = true;
  }
  
  /**
   * element  : ContractTerm of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ContractTerm__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContractTerm","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ContractTerm__is_set = false;

  private java.lang.Integer ContractTerm;

  public java.lang.Integer getContractTerm() {
    return ContractTerm;
  }

  

  public void setContractTerm(java.lang.Integer ContractTerm) {
    this.ContractTerm = ContractTerm;
    ContractTerm__is_set = true;
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
   * element  : CustomerSigned of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo CustomerSigned__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomerSigned","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean CustomerSigned__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact CustomerSigned;

  public com.sforce.soap.enterprise.sobject.Contact getCustomerSigned() {
    return CustomerSigned;
  }

  

  public void setCustomerSigned(com.sforce.soap.enterprise.sobject.Contact CustomerSigned) {
    this.CustomerSigned = CustomerSigned;
    CustomerSigned__is_set = true;
  }
  
  /**
   * element  : CustomerSignedDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CustomerSignedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomerSignedDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean CustomerSignedDate__is_set = false;

  private java.util.Calendar CustomerSignedDate;

  public java.util.Calendar getCustomerSignedDate() {
    return CustomerSignedDate;
  }

  

  public void setCustomerSignedDate(java.util.Calendar CustomerSignedDate) {
    this.CustomerSignedDate = CustomerSignedDate;
    CustomerSignedDate__is_set = true;
  }
  
  /**
   * element  : CustomerSignedId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomerSignedId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomerSignedId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CustomerSignedId__is_set = false;

  private java.lang.String CustomerSignedId;

  public java.lang.String getCustomerSignedId() {
    return CustomerSignedId;
  }

  

  public void setCustomerSignedId(java.lang.String CustomerSignedId) {
    this.CustomerSignedId = CustomerSignedId;
    CustomerSignedId__is_set = true;
  }
  
  /**
   * element  : CustomerSignedTitle of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomerSignedTitle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomerSignedTitle","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CustomerSignedTitle__is_set = false;

  private java.lang.String CustomerSignedTitle;

  public java.lang.String getCustomerSignedTitle() {
    return CustomerSignedTitle;
  }

  

  public void setCustomerSignedTitle(java.lang.String CustomerSignedTitle) {
    this.CustomerSignedTitle = CustomerSignedTitle;
    CustomerSignedTitle__is_set = true;
  }
  
  /**
   * element  : Description of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Description__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Description__is_set = false;

  private java.lang.String Description;

  public java.lang.String getDescription() {
    return Description;
  }

  

  public void setDescription(java.lang.String Description) {
    this.Description = Description;
    Description__is_set = true;
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
   * element  : EndDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EndDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EndDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean EndDate__is_set = false;

  private java.util.Calendar EndDate;

  public java.util.Calendar getEndDate() {
    return EndDate;
  }

  

  public void setEndDate(java.util.Calendar EndDate) {
    this.EndDate = EndDate;
    EndDate__is_set = true;
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
   * element  : LastApprovedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastApprovedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastApprovedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastApprovedDate__is_set = false;

  private java.util.Calendar LastApprovedDate;

  public java.util.Calendar getLastApprovedDate() {
    return LastApprovedDate;
  }

  

  public void setLastApprovedDate(java.util.Calendar LastApprovedDate) {
    this.LastApprovedDate = LastApprovedDate;
    LastApprovedDate__is_set = true;
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
   * element  : Opportunities of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunities__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunities","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Opportunities__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Opportunities;

  public com.sforce.soap.enterprise.QueryResult getOpportunities() {
    return Opportunities;
  }

  

  public void setOpportunities(com.sforce.soap.enterprise.QueryResult Opportunities) {
    this.Opportunities = Opportunities;
    Opportunities__is_set = true;
  }
  
  /**
   * element  : Owner of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo Owner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Owner","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean Owner__is_set = false;

  private com.sforce.soap.enterprise.sobject.User Owner;

  public com.sforce.soap.enterprise.sobject.User getOwner() {
    return Owner;
  }

  

  public void setOwner(com.sforce.soap.enterprise.sobject.User Owner) {
    this.Owner = Owner;
    Owner__is_set = true;
  }
  
  /**
   * element  : OwnerExpirationNotice of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OwnerExpirationNotice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OwnerExpirationNotice","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean OwnerExpirationNotice__is_set = false;

  private java.lang.String OwnerExpirationNotice;

  public java.lang.String getOwnerExpirationNotice() {
    return OwnerExpirationNotice;
  }

  

  public void setOwnerExpirationNotice(java.lang.String OwnerExpirationNotice) {
    this.OwnerExpirationNotice = OwnerExpirationNotice;
    OwnerExpirationNotice__is_set = true;
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
   * element  : Quotes of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Quotes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Quotes","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Quotes__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Quotes;

  public com.sforce.soap.enterprise.QueryResult getQuotes() {
    return Quotes;
  }

  

  public void setQuotes(com.sforce.soap.enterprise.QueryResult Quotes) {
    this.Quotes = Quotes;
    Quotes__is_set = true;
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
   * element  : ShippingAddress of type {urn:enterprise.soap.sforce.com}address
   * java type: com.sforce.soap.enterprise.Address
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingAddress","urn:enterprise.soap.sforce.com","address",0,1,true);

  private boolean ShippingAddress__is_set = false;

  private com.sforce.soap.enterprise.Address ShippingAddress;

  public com.sforce.soap.enterprise.Address getShippingAddress() {
    return ShippingAddress;
  }

  

  public void setShippingAddress(com.sforce.soap.enterprise.Address ShippingAddress) {
    this.ShippingAddress = ShippingAddress;
    ShippingAddress__is_set = true;
  }
  
  /**
   * element  : ShippingCity of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingCity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingCity","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShippingCity__is_set = false;

  private java.lang.String ShippingCity;

  public java.lang.String getShippingCity() {
    return ShippingCity;
  }

  

  public void setShippingCity(java.lang.String ShippingCity) {
    this.ShippingCity = ShippingCity;
    ShippingCity__is_set = true;
  }
  
  /**
   * element  : ShippingCountry of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingCountry__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingCountry","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShippingCountry__is_set = false;

  private java.lang.String ShippingCountry;

  public java.lang.String getShippingCountry() {
    return ShippingCountry;
  }

  

  public void setShippingCountry(java.lang.String ShippingCountry) {
    this.ShippingCountry = ShippingCountry;
    ShippingCountry__is_set = true;
  }
  
  /**
   * element  : ShippingGeocodeAccuracy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingGeocodeAccuracy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingGeocodeAccuracy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShippingGeocodeAccuracy__is_set = false;

  private java.lang.String ShippingGeocodeAccuracy;

  public java.lang.String getShippingGeocodeAccuracy() {
    return ShippingGeocodeAccuracy;
  }

  

  public void setShippingGeocodeAccuracy(java.lang.String ShippingGeocodeAccuracy) {
    this.ShippingGeocodeAccuracy = ShippingGeocodeAccuracy;
    ShippingGeocodeAccuracy__is_set = true;
  }
  
  /**
   * element  : ShippingLatitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingLatitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingLatitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ShippingLatitude__is_set = false;

  private java.lang.Double ShippingLatitude;

  public java.lang.Double getShippingLatitude() {
    return ShippingLatitude;
  }

  

  public void setShippingLatitude(java.lang.Double ShippingLatitude) {
    this.ShippingLatitude = ShippingLatitude;
    ShippingLatitude__is_set = true;
  }
  
  /**
   * element  : ShippingLongitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingLongitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingLongitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ShippingLongitude__is_set = false;

  private java.lang.Double ShippingLongitude;

  public java.lang.Double getShippingLongitude() {
    return ShippingLongitude;
  }

  

  public void setShippingLongitude(java.lang.Double ShippingLongitude) {
    this.ShippingLongitude = ShippingLongitude;
    ShippingLongitude__is_set = true;
  }
  
  /**
   * element  : ShippingPostalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingPostalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingPostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShippingPostalCode__is_set = false;

  private java.lang.String ShippingPostalCode;

  public java.lang.String getShippingPostalCode() {
    return ShippingPostalCode;
  }

  

  public void setShippingPostalCode(java.lang.String ShippingPostalCode) {
    this.ShippingPostalCode = ShippingPostalCode;
    ShippingPostalCode__is_set = true;
  }
  
  /**
   * element  : ShippingState of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingState__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingState","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShippingState__is_set = false;

  private java.lang.String ShippingState;

  public java.lang.String getShippingState() {
    return ShippingState;
  }

  

  public void setShippingState(java.lang.String ShippingState) {
    this.ShippingState = ShippingState;
    ShippingState__is_set = true;
  }
  
  /**
   * element  : ShippingStreet of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingStreet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingStreet","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShippingStreet__is_set = false;

  private java.lang.String ShippingStreet;

  public java.lang.String getShippingStreet() {
    return ShippingStreet;
  }

  

  public void setShippingStreet(java.lang.String ShippingStreet) {
    this.ShippingStreet = ShippingStreet;
    ShippingStreet__is_set = true;
  }
  
  /**
   * element  : SpecialTerms of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SpecialTerms__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SpecialTerms","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SpecialTerms__is_set = false;

  private java.lang.String SpecialTerms;

  public java.lang.String getSpecialTerms() {
    return SpecialTerms;
  }

  

  public void setSpecialTerms(java.lang.String SpecialTerms) {
    this.SpecialTerms = SpecialTerms;
    SpecialTerms__is_set = true;
  }
  
  /**
   * element  : StartDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo StartDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean StartDate__is_set = false;

  private java.util.Calendar StartDate;

  public java.util.Calendar getStartDate() {
    return StartDate;
  }

  

  public void setStartDate(java.util.Calendar StartDate) {
    this.StartDate = StartDate;
    StartDate__is_set = true;
  }
  
  /**
   * element  : Status of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Status__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Status__is_set = false;

  private java.lang.String Status;

  public java.lang.String getStatus() {
    return Status;
  }

  

  public void setStatus(java.lang.String Status) {
    this.Status = Status;
    Status__is_set = true;
  }
  
  /**
   * element  : StatusCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StatusCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StatusCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StatusCode__is_set = false;

  private java.lang.String StatusCode;

  public java.lang.String getStatusCode() {
    return StatusCode;
  }

  

  public void setStatusCode(java.lang.String StatusCode) {
    this.StatusCode = StatusCode;
    StatusCode__is_set = true;
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
   * element  : echosign_dev1__R00N70000001hM2JEAU__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__R00N70000001hM2JEAU__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__R00N70000001hM2JEAU__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__R00N70000001hM2JEAU__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__R00N70000001hM2JEAU__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__R00N70000001hM2JEAU__r() {
    return echosign_dev1__R00N70000001hM2JEAU__r;
  }

  

  public void setEchosign_dev1__R00N70000001hM2JEAU__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__R00N70000001hM2JEAU__r) {
    this.echosign_dev1__R00N70000001hM2JEAU__r = echosign_dev1__R00N70000001hM2JEAU__r;
    echosign_dev1__R00N70000001hM2JEAU__r__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Contract");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeObject(__out, ActivatedBy__typeInfo, ActivatedBy, ActivatedBy__is_set);
    __typeMapper.writeString(__out, ActivatedById__typeInfo, ActivatedById, ActivatedById__is_set);
    __typeMapper.writeObject(__out, ActivatedDate__typeInfo, ActivatedDate, ActivatedDate__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, Approvals__typeInfo, Approvals, Approvals__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, BillingAddress__typeInfo, BillingAddress, BillingAddress__is_set);
    __typeMapper.writeString(__out, BillingCity__typeInfo, BillingCity, BillingCity__is_set);
    __typeMapper.writeString(__out, BillingCountry__typeInfo, BillingCountry, BillingCountry__is_set);
    __typeMapper.writeString(__out, BillingGeocodeAccuracy__typeInfo, BillingGeocodeAccuracy, BillingGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, BillingLatitude__typeInfo, BillingLatitude, BillingLatitude__is_set);
    __typeMapper.writeObject(__out, BillingLongitude__typeInfo, BillingLongitude, BillingLongitude__is_set);
    __typeMapper.writeString(__out, BillingPostalCode__typeInfo, BillingPostalCode, BillingPostalCode__is_set);
    __typeMapper.writeString(__out, BillingState__typeInfo, BillingState, BillingState__is_set);
    __typeMapper.writeString(__out, BillingStreet__typeInfo, BillingStreet, BillingStreet__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, CompanySigned__typeInfo, CompanySigned, CompanySigned__is_set);
    __typeMapper.writeObject(__out, CompanySignedDate__typeInfo, CompanySignedDate, CompanySignedDate__is_set);
    __typeMapper.writeString(__out, CompanySignedId__typeInfo, CompanySignedId, CompanySignedId__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, ContractContactRoles__typeInfo, ContractContactRoles, ContractContactRoles__is_set);
    __typeMapper.writeString(__out, ContractNumber__typeInfo, ContractNumber, ContractNumber__is_set);
    __typeMapper.writeObject(__out, ContractTerm__typeInfo, ContractTerm, ContractTerm__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, CustomerSigned__typeInfo, CustomerSigned, CustomerSigned__is_set);
    __typeMapper.writeObject(__out, CustomerSignedDate__typeInfo, CustomerSignedDate, CustomerSignedDate__is_set);
    __typeMapper.writeString(__out, CustomerSignedId__typeInfo, CustomerSignedId, CustomerSignedId__is_set);
    __typeMapper.writeString(__out, CustomerSignedTitle__typeInfo, CustomerSignedTitle, CustomerSignedTitle__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, EndDate__typeInfo, EndDate, EndDate__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastApprovedDate__typeInfo, LastApprovedDate, LastApprovedDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Opportunities__typeInfo, Opportunities, Opportunities__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerExpirationNotice__typeInfo, OwnerExpirationNotice, OwnerExpirationNotice__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, Quotes__typeInfo, Quotes, Quotes__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, ShippingAddress__typeInfo, ShippingAddress, ShippingAddress__is_set);
    __typeMapper.writeString(__out, ShippingCity__typeInfo, ShippingCity, ShippingCity__is_set);
    __typeMapper.writeString(__out, ShippingCountry__typeInfo, ShippingCountry, ShippingCountry__is_set);
    __typeMapper.writeString(__out, ShippingGeocodeAccuracy__typeInfo, ShippingGeocodeAccuracy, ShippingGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, ShippingLatitude__typeInfo, ShippingLatitude, ShippingLatitude__is_set);
    __typeMapper.writeObject(__out, ShippingLongitude__typeInfo, ShippingLongitude, ShippingLongitude__is_set);
    __typeMapper.writeString(__out, ShippingPostalCode__typeInfo, ShippingPostalCode, ShippingPostalCode__is_set);
    __typeMapper.writeString(__out, ShippingState__typeInfo, ShippingState, ShippingState__is_set);
    __typeMapper.writeString(__out, ShippingStreet__typeInfo, ShippingStreet, ShippingStreet__is_set);
    __typeMapper.writeString(__out, SpecialTerms__typeInfo, SpecialTerms, SpecialTerms__is_set);
    __typeMapper.writeObject(__out, StartDate__typeInfo, StartDate, StartDate__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, StatusCode__typeInfo, StatusCode, StatusCode__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__R00N70000001hM2JEAU__r__typeInfo, echosign_dev1__R00N70000001hM2JEAU__r, echosign_dev1__R00N70000001hM2JEAU__r__is_set);
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
    if (__typeMapper.isElement(__in, Account__typeInfo)) {
      setAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Account__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountId__typeInfo)) {
      setAccountId((java.lang.String)__typeMapper.readString(__in, AccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivatedBy__typeInfo)) {
      setActivatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, ActivatedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivatedById__typeInfo)) {
      setActivatedById((java.lang.String)__typeMapper.readString(__in, ActivatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivatedDate__typeInfo)) {
      setActivatedDate((java.util.Calendar)__typeMapper.readObject(__in, ActivatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Approvals__typeInfo)) {
      setApprovals((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Approvals__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, BillingAddress__typeInfo)) {
      setBillingAddress((com.sforce.soap.enterprise.Address)__typeMapper.readObject(__in, BillingAddress__typeInfo, com.sforce.soap.enterprise.Address.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingCity__typeInfo)) {
      setBillingCity((java.lang.String)__typeMapper.readString(__in, BillingCity__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingCountry__typeInfo)) {
      setBillingCountry((java.lang.String)__typeMapper.readString(__in, BillingCountry__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingGeocodeAccuracy__typeInfo)) {
      setBillingGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, BillingGeocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingLatitude__typeInfo)) {
      setBillingLatitude((java.lang.Double)__typeMapper.readObject(__in, BillingLatitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingLongitude__typeInfo)) {
      setBillingLongitude((java.lang.Double)__typeMapper.readObject(__in, BillingLongitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingPostalCode__typeInfo)) {
      setBillingPostalCode((java.lang.String)__typeMapper.readString(__in, BillingPostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingState__typeInfo)) {
      setBillingState((java.lang.String)__typeMapper.readString(__in, BillingState__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillingStreet__typeInfo)) {
      setBillingStreet((java.lang.String)__typeMapper.readString(__in, BillingStreet__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CompanySigned__typeInfo)) {
      setCompanySigned((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CompanySigned__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CompanySignedDate__typeInfo)) {
      setCompanySignedDate((java.util.Calendar)__typeMapper.readObject(__in, CompanySignedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CompanySignedId__typeInfo)) {
      setCompanySignedId((java.lang.String)__typeMapper.readString(__in, CompanySignedId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContractContactRoles__typeInfo)) {
      setContractContactRoles((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContractContactRoles__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContractNumber__typeInfo)) {
      setContractNumber((java.lang.String)__typeMapper.readString(__in, ContractNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContractTerm__typeInfo)) {
      setContractTerm((java.lang.Integer)__typeMapper.readObject(__in, ContractTerm__typeInfo, java.lang.Integer.class));
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
    if (__typeMapper.isElement(__in, CustomerSigned__typeInfo)) {
      setCustomerSigned((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, CustomerSigned__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomerSignedDate__typeInfo)) {
      setCustomerSignedDate((java.util.Calendar)__typeMapper.readObject(__in, CustomerSignedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomerSignedId__typeInfo)) {
      setCustomerSignedId((java.lang.String)__typeMapper.readString(__in, CustomerSignedId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomerSignedTitle__typeInfo)) {
      setCustomerSignedTitle((java.lang.String)__typeMapper.readString(__in, CustomerSignedTitle__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndDate__typeInfo)) {
      setEndDate((java.util.Calendar)__typeMapper.readObject(__in, EndDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, LastApprovedDate__typeInfo)) {
      setLastApprovedDate((java.util.Calendar)__typeMapper.readObject(__in, LastApprovedDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Opportunities__typeInfo)) {
      setOpportunities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Opportunities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Owner__typeInfo)) {
      setOwner((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Owner__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnerExpirationNotice__typeInfo)) {
      setOwnerExpirationNotice((java.lang.String)__typeMapper.readString(__in, OwnerExpirationNotice__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
      setOwnerId((java.lang.String)__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Quotes__typeInfo)) {
      setQuotes((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Quotes__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecordAssociatedGroups__typeInfo)) {
      setRecordAssociatedGroups((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, RecordAssociatedGroups__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingAddress__typeInfo)) {
      setShippingAddress((com.sforce.soap.enterprise.Address)__typeMapper.readObject(__in, ShippingAddress__typeInfo, com.sforce.soap.enterprise.Address.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingCity__typeInfo)) {
      setShippingCity((java.lang.String)__typeMapper.readString(__in, ShippingCity__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingCountry__typeInfo)) {
      setShippingCountry((java.lang.String)__typeMapper.readString(__in, ShippingCountry__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingGeocodeAccuracy__typeInfo)) {
      setShippingGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, ShippingGeocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingLatitude__typeInfo)) {
      setShippingLatitude((java.lang.Double)__typeMapper.readObject(__in, ShippingLatitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingLongitude__typeInfo)) {
      setShippingLongitude((java.lang.Double)__typeMapper.readObject(__in, ShippingLongitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingPostalCode__typeInfo)) {
      setShippingPostalCode((java.lang.String)__typeMapper.readString(__in, ShippingPostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingState__typeInfo)) {
      setShippingState((java.lang.String)__typeMapper.readString(__in, ShippingState__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ShippingStreet__typeInfo)) {
      setShippingStreet((java.lang.String)__typeMapper.readString(__in, ShippingStreet__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SpecialTerms__typeInfo)) {
      setSpecialTerms((java.lang.String)__typeMapper.readString(__in, SpecialTerms__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartDate__typeInfo)) {
      setStartDate((java.util.Calendar)__typeMapper.readObject(__in, StartDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StatusCode__typeInfo)) {
      setStatusCode((java.lang.String)__typeMapper.readString(__in, StatusCode__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, echosign_dev1__R00N70000001hM2JEAU__r__typeInfo)) {
      setEchosign_dev1__R00N70000001hM2JEAU__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__R00N70000001hM2JEAU__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Contract ");
    sb.append(super.toString());
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" ActivatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivatedBy)+"'\n");
    sb.append(" ActivatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivatedById)+"'\n");
    sb.append(" ActivatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivatedDate)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Approvals=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Approvals)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" BillingAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingAddress)+"'\n");
    sb.append(" BillingCity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingCity)+"'\n");
    sb.append(" BillingCountry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingCountry)+"'\n");
    sb.append(" BillingGeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingGeocodeAccuracy)+"'\n");
    sb.append(" BillingLatitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingLatitude)+"'\n");
    sb.append(" BillingLongitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingLongitude)+"'\n");
    sb.append(" BillingPostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingPostalCode)+"'\n");
    sb.append(" BillingState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingState)+"'\n");
    sb.append(" BillingStreet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingStreet)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" CompanySigned=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CompanySigned)+"'\n");
    sb.append(" CompanySignedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CompanySignedDate)+"'\n");
    sb.append(" CompanySignedId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CompanySignedId)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" ContractContactRoles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContractContactRoles)+"'\n");
    sb.append(" ContractNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContractNumber)+"'\n");
    sb.append(" ContractTerm=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContractTerm)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CustomerSigned=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomerSigned)+"'\n");
    sb.append(" CustomerSignedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomerSignedDate)+"'\n");
    sb.append(" CustomerSignedId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomerSignedId)+"'\n");
    sb.append(" CustomerSignedTitle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomerSignedTitle)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" EndDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndDate)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" LastActivityDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastActivityDate)+"'\n");
    sb.append(" LastApprovedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastApprovedDate)+"'\n");
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
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Opportunities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunities)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerExpirationNotice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerExpirationNotice)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Quotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Quotes)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" ShippingAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingAddress)+"'\n");
    sb.append(" ShippingCity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingCity)+"'\n");
    sb.append(" ShippingCountry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingCountry)+"'\n");
    sb.append(" ShippingGeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingGeocodeAccuracy)+"'\n");
    sb.append(" ShippingLatitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingLatitude)+"'\n");
    sb.append(" ShippingLongitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingLongitude)+"'\n");
    sb.append(" ShippingPostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingPostalCode)+"'\n");
    sb.append(" ShippingState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingState)+"'\n");
    sb.append(" ShippingStreet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingStreet)+"'\n");
    sb.append(" SpecialTerms=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SpecialTerms)+"'\n");
    sb.append(" StartDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartDate)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" StatusCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StatusCode)+"'\n");
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
    sb.append(" echosign_dev1__R00N70000001hM2JEAU__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__R00N70000001hM2JEAU__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}