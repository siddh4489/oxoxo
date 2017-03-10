package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Quote extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Quote() {
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
   * element  : AdditionalAddress of type {urn:enterprise.soap.sforce.com}address
   * java type: com.sforce.soap.enterprise.Address
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalAddress","urn:enterprise.soap.sforce.com","address",0,1,true);

  private boolean AdditionalAddress__is_set = false;

  private com.sforce.soap.enterprise.Address AdditionalAddress;

  public com.sforce.soap.enterprise.Address getAdditionalAddress() {
    return AdditionalAddress;
  }

  

  public void setAdditionalAddress(com.sforce.soap.enterprise.Address AdditionalAddress) {
    this.AdditionalAddress = AdditionalAddress;
    AdditionalAddress__is_set = true;
  }
  
  /**
   * element  : AdditionalCity of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalCity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalCity","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdditionalCity__is_set = false;

  private java.lang.String AdditionalCity;

  public java.lang.String getAdditionalCity() {
    return AdditionalCity;
  }

  

  public void setAdditionalCity(java.lang.String AdditionalCity) {
    this.AdditionalCity = AdditionalCity;
    AdditionalCity__is_set = true;
  }
  
  /**
   * element  : AdditionalCountry of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalCountry__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalCountry","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdditionalCountry__is_set = false;

  private java.lang.String AdditionalCountry;

  public java.lang.String getAdditionalCountry() {
    return AdditionalCountry;
  }

  

  public void setAdditionalCountry(java.lang.String AdditionalCountry) {
    this.AdditionalCountry = AdditionalCountry;
    AdditionalCountry__is_set = true;
  }
  
  /**
   * element  : AdditionalGeocodeAccuracy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalGeocodeAccuracy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalGeocodeAccuracy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdditionalGeocodeAccuracy__is_set = false;

  private java.lang.String AdditionalGeocodeAccuracy;

  public java.lang.String getAdditionalGeocodeAccuracy() {
    return AdditionalGeocodeAccuracy;
  }

  

  public void setAdditionalGeocodeAccuracy(java.lang.String AdditionalGeocodeAccuracy) {
    this.AdditionalGeocodeAccuracy = AdditionalGeocodeAccuracy;
    AdditionalGeocodeAccuracy__is_set = true;
  }
  
  /**
   * element  : AdditionalLatitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalLatitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalLatitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean AdditionalLatitude__is_set = false;

  private java.lang.Double AdditionalLatitude;

  public java.lang.Double getAdditionalLatitude() {
    return AdditionalLatitude;
  }

  

  public void setAdditionalLatitude(java.lang.Double AdditionalLatitude) {
    this.AdditionalLatitude = AdditionalLatitude;
    AdditionalLatitude__is_set = true;
  }
  
  /**
   * element  : AdditionalLongitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalLongitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalLongitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean AdditionalLongitude__is_set = false;

  private java.lang.Double AdditionalLongitude;

  public java.lang.Double getAdditionalLongitude() {
    return AdditionalLongitude;
  }

  

  public void setAdditionalLongitude(java.lang.Double AdditionalLongitude) {
    this.AdditionalLongitude = AdditionalLongitude;
    AdditionalLongitude__is_set = true;
  }
  
  /**
   * element  : AdditionalName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdditionalName__is_set = false;

  private java.lang.String AdditionalName;

  public java.lang.String getAdditionalName() {
    return AdditionalName;
  }

  

  public void setAdditionalName(java.lang.String AdditionalName) {
    this.AdditionalName = AdditionalName;
    AdditionalName__is_set = true;
  }
  
  /**
   * element  : AdditionalPostalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalPostalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalPostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdditionalPostalCode__is_set = false;

  private java.lang.String AdditionalPostalCode;

  public java.lang.String getAdditionalPostalCode() {
    return AdditionalPostalCode;
  }

  

  public void setAdditionalPostalCode(java.lang.String AdditionalPostalCode) {
    this.AdditionalPostalCode = AdditionalPostalCode;
    AdditionalPostalCode__is_set = true;
  }
  
  /**
   * element  : AdditionalState of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalState__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalState","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdditionalState__is_set = false;

  private java.lang.String AdditionalState;

  public java.lang.String getAdditionalState() {
    return AdditionalState;
  }

  

  public void setAdditionalState(java.lang.String AdditionalState) {
    this.AdditionalState = AdditionalState;
    AdditionalState__is_set = true;
  }
  
  /**
   * element  : AdditionalStreet of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdditionalStreet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AdditionalStreet","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdditionalStreet__is_set = false;

  private java.lang.String AdditionalStreet;

  public java.lang.String getAdditionalStreet() {
    return AdditionalStreet;
  }

  

  public void setAdditionalStreet(java.lang.String AdditionalStreet) {
    this.AdditionalStreet = AdditionalStreet;
    AdditionalStreet__is_set = true;
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
   * element  : BillingName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BillingName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BillingName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BillingName__is_set = false;

  private java.lang.String BillingName;

  public java.lang.String getBillingName() {
    return BillingName;
  }

  

  public void setBillingName(java.lang.String BillingName) {
    this.BillingName = BillingName;
    BillingName__is_set = true;
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
   * element  : Contact of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo Contact__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contact","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean Contact__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact Contact;

  public com.sforce.soap.enterprise.sobject.Contact getContact() {
    return Contact;
  }

  

  public void setContact(com.sforce.soap.enterprise.sobject.Contact Contact) {
    this.Contact = Contact;
    Contact__is_set = true;
  }
  
  /**
   * element  : ContactId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContactId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContactId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContactId__is_set = false;

  private java.lang.String ContactId;

  public java.lang.String getContactId() {
    return ContactId;
  }

  

  public void setContactId(java.lang.String ContactId) {
    this.ContactId = ContactId;
    ContactId__is_set = true;
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
   * element  : Contract of type {urn:sobject.enterprise.soap.sforce.com}Contract
   * java type: com.sforce.soap.enterprise.sobject.Contract
   */
  private static final com.sforce.ws.bind.TypeInfo Contract__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contract","urn:sobject.enterprise.soap.sforce.com","Contract",0,1,true);

  private boolean Contract__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contract Contract;

  public com.sforce.soap.enterprise.sobject.Contract getContract() {
    return Contract;
  }

  

  public void setContract(com.sforce.soap.enterprise.sobject.Contract Contract) {
    this.Contract = Contract;
    Contract__is_set = true;
  }
  
  /**
   * element  : ContractId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContractId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContractId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ContractId__is_set = false;

  private java.lang.String ContractId;

  public java.lang.String getContractId() {
    return ContractId;
  }

  

  public void setContractId(java.lang.String ContractId) {
    this.ContractId = ContractId;
    ContractId__is_set = true;
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
   * element  : Discount of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Discount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Discount","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Discount__is_set = false;

  private java.lang.Double Discount;

  public java.lang.Double getDiscount() {
    return Discount;
  }

  

  public void setDiscount(java.lang.Double Discount) {
    this.Discount = Discount;
    Discount__is_set = true;
  }
  
  /**
   * element  : Email of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Email__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Email","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Email__is_set = false;

  private java.lang.String Email;

  public java.lang.String getEmail() {
    return Email;
  }

  

  public void setEmail(java.lang.String Email) {
    this.Email = Email;
    Email__is_set = true;
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
   * element  : ExpirationDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ExpirationDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExpirationDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean ExpirationDate__is_set = false;

  private java.util.Calendar ExpirationDate;

  public java.util.Calendar getExpirationDate() {
    return ExpirationDate;
  }

  

  public void setExpirationDate(java.util.Calendar ExpirationDate) {
    this.ExpirationDate = ExpirationDate;
    ExpirationDate__is_set = true;
  }
  
  /**
   * element  : Fax of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fax__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fax","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fax__is_set = false;

  private java.lang.String Fax;

  public java.lang.String getFax() {
    return Fax;
  }

  

  public void setFax(java.lang.String Fax) {
    this.Fax = Fax;
    Fax__is_set = true;
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
   * element  : GrandTotal of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo GrandTotal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GrandTotal","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean GrandTotal__is_set = false;

  private java.lang.Double GrandTotal;

  public java.lang.Double getGrandTotal() {
    return GrandTotal;
  }

  

  public void setGrandTotal(java.lang.Double GrandTotal) {
    this.GrandTotal = GrandTotal;
    GrandTotal__is_set = true;
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
   * element  : IsSyncing of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsSyncing__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsSyncing","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsSyncing__is_set = false;

  private java.lang.Boolean IsSyncing;

  public java.lang.Boolean getIsSyncing() {
    return IsSyncing;
  }

  

  public void setIsSyncing(java.lang.Boolean IsSyncing) {
    this.IsSyncing = IsSyncing;
    IsSyncing__is_set = true;
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
   * element  : LineItemCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo LineItemCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LineItemCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean LineItemCount__is_set = false;

  private java.lang.Integer LineItemCount;

  public java.lang.Integer getLineItemCount() {
    return LineItemCount;
  }

  

  public void setLineItemCount(java.lang.Integer LineItemCount) {
    this.LineItemCount = LineItemCount;
    LineItemCount__is_set = true;
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
   * element  : Opportunity of type {urn:sobject.enterprise.soap.sforce.com}Opportunity
   * java type: com.sforce.soap.enterprise.sobject.Opportunity
   */
  private static final com.sforce.ws.bind.TypeInfo Opportunity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Opportunity","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true);

  private boolean Opportunity__is_set = false;

  private com.sforce.soap.enterprise.sobject.Opportunity Opportunity;

  public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity() {
    return Opportunity;
  }

  

  public void setOpportunity(com.sforce.soap.enterprise.sobject.Opportunity Opportunity) {
    this.Opportunity = Opportunity;
    Opportunity__is_set = true;
  }
  
  /**
   * element  : OpportunityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean OpportunityId__is_set = false;

  private java.lang.String OpportunityId;

  public java.lang.String getOpportunityId() {
    return OpportunityId;
  }

  

  public void setOpportunityId(java.lang.String OpportunityId) {
    this.OpportunityId = OpportunityId;
    OpportunityId__is_set = true;
  }
  
  /**
   * element  : Phone of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Phone__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Phone","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Phone__is_set = false;

  private java.lang.String Phone;

  public java.lang.String getPhone() {
    return Phone;
  }

  

  public void setPhone(java.lang.String Phone) {
    this.Phone = Phone;
    Phone__is_set = true;
  }
  
  /**
   * element  : Pricebook2 of type {urn:sobject.enterprise.soap.sforce.com}Pricebook2
   * java type: com.sforce.soap.enterprise.sobject.Pricebook2
   */
  private static final com.sforce.ws.bind.TypeInfo Pricebook2__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pricebook2","urn:sobject.enterprise.soap.sforce.com","Pricebook2",0,1,true);

  private boolean Pricebook2__is_set = false;

  private com.sforce.soap.enterprise.sobject.Pricebook2 Pricebook2;

  public com.sforce.soap.enterprise.sobject.Pricebook2 getPricebook2() {
    return Pricebook2;
  }

  

  public void setPricebook2(com.sforce.soap.enterprise.sobject.Pricebook2 Pricebook2) {
    this.Pricebook2 = Pricebook2;
    Pricebook2__is_set = true;
  }
  
  /**
   * element  : Pricebook2Id of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pricebook2Id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pricebook2Id","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Pricebook2Id__is_set = false;

  private java.lang.String Pricebook2Id;

  public java.lang.String getPricebook2Id() {
    return Pricebook2Id;
  }

  

  public void setPricebook2Id(java.lang.String Pricebook2Id) {
    this.Pricebook2Id = Pricebook2Id;
    Pricebook2Id__is_set = true;
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
   * element  : QuoteDocuments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteDocuments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteDocuments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean QuoteDocuments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult QuoteDocuments;

  public com.sforce.soap.enterprise.QueryResult getQuoteDocuments() {
    return QuoteDocuments;
  }

  

  public void setQuoteDocuments(com.sforce.soap.enterprise.QueryResult QuoteDocuments) {
    this.QuoteDocuments = QuoteDocuments;
    QuoteDocuments__is_set = true;
  }
  
  /**
   * element  : QuoteLineItems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteLineItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteLineItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean QuoteLineItems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult QuoteLineItems;

  public com.sforce.soap.enterprise.QueryResult getQuoteLineItems() {
    return QuoteLineItems;
  }

  

  public void setQuoteLineItems(com.sforce.soap.enterprise.QueryResult QuoteLineItems) {
    this.QuoteLineItems = QuoteLineItems;
    QuoteLineItems__is_set = true;
  }
  
  /**
   * element  : QuoteNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteNumber__is_set = false;

  private java.lang.String QuoteNumber;

  public java.lang.String getQuoteNumber() {
    return QuoteNumber;
  }

  

  public void setQuoteNumber(java.lang.String QuoteNumber) {
    this.QuoteNumber = QuoteNumber;
    QuoteNumber__is_set = true;
  }
  
  /**
   * element  : QuoteToAddress of type {urn:enterprise.soap.sforce.com}address
   * java type: com.sforce.soap.enterprise.Address
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToAddress","urn:enterprise.soap.sforce.com","address",0,1,true);

  private boolean QuoteToAddress__is_set = false;

  private com.sforce.soap.enterprise.Address QuoteToAddress;

  public com.sforce.soap.enterprise.Address getQuoteToAddress() {
    return QuoteToAddress;
  }

  

  public void setQuoteToAddress(com.sforce.soap.enterprise.Address QuoteToAddress) {
    this.QuoteToAddress = QuoteToAddress;
    QuoteToAddress__is_set = true;
  }
  
  /**
   * element  : QuoteToCity of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToCity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToCity","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteToCity__is_set = false;

  private java.lang.String QuoteToCity;

  public java.lang.String getQuoteToCity() {
    return QuoteToCity;
  }

  

  public void setQuoteToCity(java.lang.String QuoteToCity) {
    this.QuoteToCity = QuoteToCity;
    QuoteToCity__is_set = true;
  }
  
  /**
   * element  : QuoteToCountry of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToCountry__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToCountry","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteToCountry__is_set = false;

  private java.lang.String QuoteToCountry;

  public java.lang.String getQuoteToCountry() {
    return QuoteToCountry;
  }

  

  public void setQuoteToCountry(java.lang.String QuoteToCountry) {
    this.QuoteToCountry = QuoteToCountry;
    QuoteToCountry__is_set = true;
  }
  
  /**
   * element  : QuoteToGeocodeAccuracy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToGeocodeAccuracy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToGeocodeAccuracy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteToGeocodeAccuracy__is_set = false;

  private java.lang.String QuoteToGeocodeAccuracy;

  public java.lang.String getQuoteToGeocodeAccuracy() {
    return QuoteToGeocodeAccuracy;
  }

  

  public void setQuoteToGeocodeAccuracy(java.lang.String QuoteToGeocodeAccuracy) {
    this.QuoteToGeocodeAccuracy = QuoteToGeocodeAccuracy;
    QuoteToGeocodeAccuracy__is_set = true;
  }
  
  /**
   * element  : QuoteToLatitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToLatitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToLatitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean QuoteToLatitude__is_set = false;

  private java.lang.Double QuoteToLatitude;

  public java.lang.Double getQuoteToLatitude() {
    return QuoteToLatitude;
  }

  

  public void setQuoteToLatitude(java.lang.Double QuoteToLatitude) {
    this.QuoteToLatitude = QuoteToLatitude;
    QuoteToLatitude__is_set = true;
  }
  
  /**
   * element  : QuoteToLongitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToLongitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToLongitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean QuoteToLongitude__is_set = false;

  private java.lang.Double QuoteToLongitude;

  public java.lang.Double getQuoteToLongitude() {
    return QuoteToLongitude;
  }

  

  public void setQuoteToLongitude(java.lang.Double QuoteToLongitude) {
    this.QuoteToLongitude = QuoteToLongitude;
    QuoteToLongitude__is_set = true;
  }
  
  /**
   * element  : QuoteToName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteToName__is_set = false;

  private java.lang.String QuoteToName;

  public java.lang.String getQuoteToName() {
    return QuoteToName;
  }

  

  public void setQuoteToName(java.lang.String QuoteToName) {
    this.QuoteToName = QuoteToName;
    QuoteToName__is_set = true;
  }
  
  /**
   * element  : QuoteToPostalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToPostalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToPostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteToPostalCode__is_set = false;

  private java.lang.String QuoteToPostalCode;

  public java.lang.String getQuoteToPostalCode() {
    return QuoteToPostalCode;
  }

  

  public void setQuoteToPostalCode(java.lang.String QuoteToPostalCode) {
    this.QuoteToPostalCode = QuoteToPostalCode;
    QuoteToPostalCode__is_set = true;
  }
  
  /**
   * element  : QuoteToState of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToState__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToState","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteToState__is_set = false;

  private java.lang.String QuoteToState;

  public java.lang.String getQuoteToState() {
    return QuoteToState;
  }

  

  public void setQuoteToState(java.lang.String QuoteToState) {
    this.QuoteToState = QuoteToState;
    QuoteToState__is_set = true;
  }
  
  /**
   * element  : QuoteToStreet of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuoteToStreet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuoteToStreet","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuoteToStreet__is_set = false;

  private java.lang.String QuoteToStreet;

  public java.lang.String getQuoteToStreet() {
    return QuoteToStreet;
  }

  

  public void setQuoteToStreet(java.lang.String QuoteToStreet) {
    this.QuoteToStreet = QuoteToStreet;
    QuoteToStreet__is_set = true;
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
   * element  : ShippingHandling of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingHandling__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingHandling","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean ShippingHandling__is_set = false;

  private java.lang.Double ShippingHandling;

  public java.lang.Double getShippingHandling() {
    return ShippingHandling;
  }

  

  public void setShippingHandling(java.lang.Double ShippingHandling) {
    this.ShippingHandling = ShippingHandling;
    ShippingHandling__is_set = true;
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
   * element  : ShippingName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ShippingName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ShippingName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ShippingName__is_set = false;

  private java.lang.String ShippingName;

  public java.lang.String getShippingName() {
    return ShippingName;
  }

  

  public void setShippingName(java.lang.String ShippingName) {
    this.ShippingName = ShippingName;
    ShippingName__is_set = true;
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
   * element  : Subtotal of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Subtotal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Subtotal","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Subtotal__is_set = false;

  private java.lang.Double Subtotal;

  public java.lang.Double getSubtotal() {
    return Subtotal;
  }

  

  public void setSubtotal(java.lang.Double Subtotal) {
    this.Subtotal = Subtotal;
    Subtotal__is_set = true;
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
   * element  : Tax of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Tax__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tax","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Tax__is_set = false;

  private java.lang.Double Tax;

  public java.lang.Double getTax() {
    return Tax;
  }

  

  public void setTax(java.lang.Double Tax) {
    this.Tax = Tax;
    Tax__is_set = true;
  }
  
  /**
   * element  : TotalPrice of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo TotalPrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TotalPrice","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean TotalPrice__is_set = false;

  private java.lang.Double TotalPrice;

  public java.lang.Double getTotalPrice() {
    return TotalPrice;
  }

  

  public void setTotalPrice(java.lang.Double TotalPrice) {
    this.TotalPrice = TotalPrice;
    TotalPrice__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Quote");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, AdditionalAddress__typeInfo, AdditionalAddress, AdditionalAddress__is_set);
    __typeMapper.writeString(__out, AdditionalCity__typeInfo, AdditionalCity, AdditionalCity__is_set);
    __typeMapper.writeString(__out, AdditionalCountry__typeInfo, AdditionalCountry, AdditionalCountry__is_set);
    __typeMapper.writeString(__out, AdditionalGeocodeAccuracy__typeInfo, AdditionalGeocodeAccuracy, AdditionalGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, AdditionalLatitude__typeInfo, AdditionalLatitude, AdditionalLatitude__is_set);
    __typeMapper.writeObject(__out, AdditionalLongitude__typeInfo, AdditionalLongitude, AdditionalLongitude__is_set);
    __typeMapper.writeString(__out, AdditionalName__typeInfo, AdditionalName, AdditionalName__is_set);
    __typeMapper.writeString(__out, AdditionalPostalCode__typeInfo, AdditionalPostalCode, AdditionalPostalCode__is_set);
    __typeMapper.writeString(__out, AdditionalState__typeInfo, AdditionalState, AdditionalState__is_set);
    __typeMapper.writeString(__out, AdditionalStreet__typeInfo, AdditionalStreet, AdditionalStreet__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, BillingAddress__typeInfo, BillingAddress, BillingAddress__is_set);
    __typeMapper.writeString(__out, BillingCity__typeInfo, BillingCity, BillingCity__is_set);
    __typeMapper.writeString(__out, BillingCountry__typeInfo, BillingCountry, BillingCountry__is_set);
    __typeMapper.writeString(__out, BillingGeocodeAccuracy__typeInfo, BillingGeocodeAccuracy, BillingGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, BillingLatitude__typeInfo, BillingLatitude, BillingLatitude__is_set);
    __typeMapper.writeObject(__out, BillingLongitude__typeInfo, BillingLongitude, BillingLongitude__is_set);
    __typeMapper.writeString(__out, BillingName__typeInfo, BillingName, BillingName__is_set);
    __typeMapper.writeString(__out, BillingPostalCode__typeInfo, BillingPostalCode, BillingPostalCode__is_set);
    __typeMapper.writeString(__out, BillingState__typeInfo, BillingState, BillingState__is_set);
    __typeMapper.writeString(__out, BillingStreet__typeInfo, BillingStreet, BillingStreet__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, Contact__typeInfo, Contact, Contact__is_set);
    __typeMapper.writeString(__out, ContactId__typeInfo, ContactId, ContactId__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, Contract__typeInfo, Contract, Contract__is_set);
    __typeMapper.writeString(__out, ContractId__typeInfo, ContractId, ContractId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, Discount__typeInfo, Discount, Discount__is_set);
    __typeMapper.writeString(__out, Email__typeInfo, Email, Email__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, ExpirationDate__typeInfo, ExpirationDate, ExpirationDate__is_set);
    __typeMapper.writeString(__out, Fax__typeInfo, Fax, Fax__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, GrandTotal__typeInfo, GrandTotal, GrandTotal__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsSyncing__typeInfo, IsSyncing, IsSyncing__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, LineItemCount__typeInfo, LineItemCount, LineItemCount__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Opportunity__typeInfo, Opportunity, Opportunity__is_set);
    __typeMapper.writeString(__out, OpportunityId__typeInfo, OpportunityId, OpportunityId__is_set);
    __typeMapper.writeString(__out, Phone__typeInfo, Phone, Phone__is_set);
    __typeMapper.writeObject(__out, Pricebook2__typeInfo, Pricebook2, Pricebook2__is_set);
    __typeMapper.writeString(__out, Pricebook2Id__typeInfo, Pricebook2Id, Pricebook2Id__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, QuoteDocuments__typeInfo, QuoteDocuments, QuoteDocuments__is_set);
    __typeMapper.writeObject(__out, QuoteLineItems__typeInfo, QuoteLineItems, QuoteLineItems__is_set);
    __typeMapper.writeString(__out, QuoteNumber__typeInfo, QuoteNumber, QuoteNumber__is_set);
    __typeMapper.writeObject(__out, QuoteToAddress__typeInfo, QuoteToAddress, QuoteToAddress__is_set);
    __typeMapper.writeString(__out, QuoteToCity__typeInfo, QuoteToCity, QuoteToCity__is_set);
    __typeMapper.writeString(__out, QuoteToCountry__typeInfo, QuoteToCountry, QuoteToCountry__is_set);
    __typeMapper.writeString(__out, QuoteToGeocodeAccuracy__typeInfo, QuoteToGeocodeAccuracy, QuoteToGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, QuoteToLatitude__typeInfo, QuoteToLatitude, QuoteToLatitude__is_set);
    __typeMapper.writeObject(__out, QuoteToLongitude__typeInfo, QuoteToLongitude, QuoteToLongitude__is_set);
    __typeMapper.writeString(__out, QuoteToName__typeInfo, QuoteToName, QuoteToName__is_set);
    __typeMapper.writeString(__out, QuoteToPostalCode__typeInfo, QuoteToPostalCode, QuoteToPostalCode__is_set);
    __typeMapper.writeString(__out, QuoteToState__typeInfo, QuoteToState, QuoteToState__is_set);
    __typeMapper.writeString(__out, QuoteToStreet__typeInfo, QuoteToStreet, QuoteToStreet__is_set);
    __typeMapper.writeObject(__out, ShippingAddress__typeInfo, ShippingAddress, ShippingAddress__is_set);
    __typeMapper.writeString(__out, ShippingCity__typeInfo, ShippingCity, ShippingCity__is_set);
    __typeMapper.writeString(__out, ShippingCountry__typeInfo, ShippingCountry, ShippingCountry__is_set);
    __typeMapper.writeString(__out, ShippingGeocodeAccuracy__typeInfo, ShippingGeocodeAccuracy, ShippingGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, ShippingHandling__typeInfo, ShippingHandling, ShippingHandling__is_set);
    __typeMapper.writeObject(__out, ShippingLatitude__typeInfo, ShippingLatitude, ShippingLatitude__is_set);
    __typeMapper.writeObject(__out, ShippingLongitude__typeInfo, ShippingLongitude, ShippingLongitude__is_set);
    __typeMapper.writeString(__out, ShippingName__typeInfo, ShippingName, ShippingName__is_set);
    __typeMapper.writeString(__out, ShippingPostalCode__typeInfo, ShippingPostalCode, ShippingPostalCode__is_set);
    __typeMapper.writeString(__out, ShippingState__typeInfo, ShippingState, ShippingState__is_set);
    __typeMapper.writeString(__out, ShippingStreet__typeInfo, ShippingStreet, ShippingStreet__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, Subtotal__typeInfo, Subtotal, Subtotal__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, Tax__typeInfo, Tax, Tax__is_set);
    __typeMapper.writeObject(__out, TotalPrice__typeInfo, TotalPrice, TotalPrice__is_set);
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
    if (__typeMapper.isElement(__in, Account__typeInfo)) {
      setAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Account__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountId__typeInfo)) {
      setAccountId((java.lang.String)__typeMapper.readString(__in, AccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalAddress__typeInfo)) {
      setAdditionalAddress((com.sforce.soap.enterprise.Address)__typeMapper.readObject(__in, AdditionalAddress__typeInfo, com.sforce.soap.enterprise.Address.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalCity__typeInfo)) {
      setAdditionalCity((java.lang.String)__typeMapper.readString(__in, AdditionalCity__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalCountry__typeInfo)) {
      setAdditionalCountry((java.lang.String)__typeMapper.readString(__in, AdditionalCountry__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalGeocodeAccuracy__typeInfo)) {
      setAdditionalGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, AdditionalGeocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalLatitude__typeInfo)) {
      setAdditionalLatitude((java.lang.Double)__typeMapper.readObject(__in, AdditionalLatitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalLongitude__typeInfo)) {
      setAdditionalLongitude((java.lang.Double)__typeMapper.readObject(__in, AdditionalLongitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalName__typeInfo)) {
      setAdditionalName((java.lang.String)__typeMapper.readString(__in, AdditionalName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalPostalCode__typeInfo)) {
      setAdditionalPostalCode((java.lang.String)__typeMapper.readString(__in, AdditionalPostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalState__typeInfo)) {
      setAdditionalState((java.lang.String)__typeMapper.readString(__in, AdditionalState__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdditionalStreet__typeInfo)) {
      setAdditionalStreet((java.lang.String)__typeMapper.readString(__in, AdditionalStreet__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, BillingName__typeInfo)) {
      setBillingName((java.lang.String)__typeMapper.readString(__in, BillingName__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Contact__typeInfo)) {
      setContact((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, Contact__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContactId__typeInfo)) {
      setContactId((java.lang.String)__typeMapper.readString(__in, ContactId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contract__typeInfo)) {
      setContract((com.sforce.soap.enterprise.sobject.Contract)__typeMapper.readObject(__in, Contract__typeInfo, com.sforce.soap.enterprise.sobject.Contract.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContractId__typeInfo)) {
      setContractId((java.lang.String)__typeMapper.readString(__in, ContractId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Discount__typeInfo)) {
      setDiscount((java.lang.Double)__typeMapper.readObject(__in, Discount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email__typeInfo)) {
      setEmail((java.lang.String)__typeMapper.readString(__in, Email__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Emails__typeInfo)) {
      setEmails((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Emails__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, ExpirationDate__typeInfo)) {
      setExpirationDate((java.util.Calendar)__typeMapper.readObject(__in, ExpirationDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fax__typeInfo)) {
      setFax((java.lang.String)__typeMapper.readString(__in, Fax__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, GrandTotal__typeInfo)) {
      setGrandTotal((java.lang.Double)__typeMapper.readObject(__in, GrandTotal__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsSyncing__typeInfo)) {
      setIsSyncing((java.lang.Boolean)__typeMapper.readObject(__in, IsSyncing__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LineItemCount__typeInfo)) {
      setLineItemCount((java.lang.Integer)__typeMapper.readObject(__in, LineItemCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Opportunity__typeInfo)) {
      setOpportunity((com.sforce.soap.enterprise.sobject.Opportunity)__typeMapper.readObject(__in, Opportunity__typeInfo, com.sforce.soap.enterprise.sobject.Opportunity.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpportunityId__typeInfo)) {
      setOpportunityId((java.lang.String)__typeMapper.readString(__in, OpportunityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone__typeInfo)) {
      setPhone((java.lang.String)__typeMapper.readString(__in, Phone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pricebook2__typeInfo)) {
      setPricebook2((com.sforce.soap.enterprise.sobject.Pricebook2)__typeMapper.readObject(__in, Pricebook2__typeInfo, com.sforce.soap.enterprise.sobject.Pricebook2.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pricebook2Id__typeInfo)) {
      setPricebook2Id((java.lang.String)__typeMapper.readString(__in, Pricebook2Id__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, QuoteDocuments__typeInfo)) {
      setQuoteDocuments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, QuoteDocuments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteLineItems__typeInfo)) {
      setQuoteLineItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, QuoteLineItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteNumber__typeInfo)) {
      setQuoteNumber((java.lang.String)__typeMapper.readString(__in, QuoteNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToAddress__typeInfo)) {
      setQuoteToAddress((com.sforce.soap.enterprise.Address)__typeMapper.readObject(__in, QuoteToAddress__typeInfo, com.sforce.soap.enterprise.Address.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToCity__typeInfo)) {
      setQuoteToCity((java.lang.String)__typeMapper.readString(__in, QuoteToCity__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToCountry__typeInfo)) {
      setQuoteToCountry((java.lang.String)__typeMapper.readString(__in, QuoteToCountry__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToGeocodeAccuracy__typeInfo)) {
      setQuoteToGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, QuoteToGeocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToLatitude__typeInfo)) {
      setQuoteToLatitude((java.lang.Double)__typeMapper.readObject(__in, QuoteToLatitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToLongitude__typeInfo)) {
      setQuoteToLongitude((java.lang.Double)__typeMapper.readObject(__in, QuoteToLongitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToName__typeInfo)) {
      setQuoteToName((java.lang.String)__typeMapper.readString(__in, QuoteToName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToPostalCode__typeInfo)) {
      setQuoteToPostalCode((java.lang.String)__typeMapper.readString(__in, QuoteToPostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToState__typeInfo)) {
      setQuoteToState((java.lang.String)__typeMapper.readString(__in, QuoteToState__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuoteToStreet__typeInfo)) {
      setQuoteToStreet((java.lang.String)__typeMapper.readString(__in, QuoteToStreet__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ShippingHandling__typeInfo)) {
      setShippingHandling((java.lang.Double)__typeMapper.readObject(__in, ShippingHandling__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, ShippingName__typeInfo)) {
      setShippingName((java.lang.String)__typeMapper.readString(__in, ShippingName__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Subtotal__typeInfo)) {
      setSubtotal((java.lang.Double)__typeMapper.readObject(__in, Subtotal__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Tax__typeInfo)) {
      setTax((java.lang.Double)__typeMapper.readObject(__in, Tax__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TotalPrice__typeInfo)) {
      setTotalPrice((java.lang.Double)__typeMapper.readObject(__in, TotalPrice__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Quote ");
    sb.append(super.toString());
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" AdditionalAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalAddress)+"'\n");
    sb.append(" AdditionalCity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalCity)+"'\n");
    sb.append(" AdditionalCountry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalCountry)+"'\n");
    sb.append(" AdditionalGeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalGeocodeAccuracy)+"'\n");
    sb.append(" AdditionalLatitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalLatitude)+"'\n");
    sb.append(" AdditionalLongitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalLongitude)+"'\n");
    sb.append(" AdditionalName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalName)+"'\n");
    sb.append(" AdditionalPostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalPostalCode)+"'\n");
    sb.append(" AdditionalState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalState)+"'\n");
    sb.append(" AdditionalStreet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdditionalStreet)+"'\n");
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
    sb.append(" BillingName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingName)+"'\n");
    sb.append(" BillingPostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingPostalCode)+"'\n");
    sb.append(" BillingState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingState)+"'\n");
    sb.append(" BillingStreet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillingStreet)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Contact=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contact)+"'\n");
    sb.append(" ContactId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContactId)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" Contract=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contract)+"'\n");
    sb.append(" ContractId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContractId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" Discount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Discount)+"'\n");
    sb.append(" Email=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" ExpirationDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExpirationDate)+"'\n");
    sb.append(" Fax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fax)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" GrandTotal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GrandTotal)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsSyncing=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsSyncing)+"'\n");
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
    sb.append(" LineItemCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LineItemCount)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Opportunity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunity)+"'\n");
    sb.append(" OpportunityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityId)+"'\n");
    sb.append(" Phone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone)+"'\n");
    sb.append(" Pricebook2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pricebook2)+"'\n");
    sb.append(" Pricebook2Id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pricebook2Id)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" QuoteDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteDocuments)+"'\n");
    sb.append(" QuoteLineItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteLineItems)+"'\n");
    sb.append(" QuoteNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteNumber)+"'\n");
    sb.append(" QuoteToAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToAddress)+"'\n");
    sb.append(" QuoteToCity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToCity)+"'\n");
    sb.append(" QuoteToCountry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToCountry)+"'\n");
    sb.append(" QuoteToGeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToGeocodeAccuracy)+"'\n");
    sb.append(" QuoteToLatitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToLatitude)+"'\n");
    sb.append(" QuoteToLongitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToLongitude)+"'\n");
    sb.append(" QuoteToName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToName)+"'\n");
    sb.append(" QuoteToPostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToPostalCode)+"'\n");
    sb.append(" QuoteToState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToState)+"'\n");
    sb.append(" QuoteToStreet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuoteToStreet)+"'\n");
    sb.append(" ShippingAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingAddress)+"'\n");
    sb.append(" ShippingCity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingCity)+"'\n");
    sb.append(" ShippingCountry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingCountry)+"'\n");
    sb.append(" ShippingGeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingGeocodeAccuracy)+"'\n");
    sb.append(" ShippingHandling=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingHandling)+"'\n");
    sb.append(" ShippingLatitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingLatitude)+"'\n");
    sb.append(" ShippingLongitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingLongitude)+"'\n");
    sb.append(" ShippingName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingName)+"'\n");
    sb.append(" ShippingPostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingPostalCode)+"'\n");
    sb.append(" ShippingState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingState)+"'\n");
    sb.append(" ShippingStreet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ShippingStreet)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Subtotal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subtotal)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" Tax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tax)+"'\n");
    sb.append(" TotalPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TotalPrice)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}