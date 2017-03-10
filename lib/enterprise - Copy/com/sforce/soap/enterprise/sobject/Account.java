package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Account extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Account() {
  }
    
  
  /**
   * element  : AP_Contact_Lookup__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AP_Contact_Lookup__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AP_Contact_Lookup__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AP_Contact_Lookup__c__is_set = false;

  private java.lang.String AP_Contact_Lookup__c;

  public java.lang.String getAP_Contact_Lookup__c() {
    return AP_Contact_Lookup__c;
  }

  

  public void setAP_Contact_Lookup__c(java.lang.String AP_Contact_Lookup__c) {
    this.AP_Contact_Lookup__c = AP_Contact_Lookup__c;
    AP_Contact_Lookup__c__is_set = true;
  }
  
  /**
   * element  : AP_Contact_Lookup__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo AP_Contact_Lookup__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AP_Contact_Lookup__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean AP_Contact_Lookup__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact AP_Contact_Lookup__r;

  public com.sforce.soap.enterprise.sobject.Contact getAP_Contact_Lookup__r() {
    return AP_Contact_Lookup__r;
  }

  

  public void setAP_Contact_Lookup__r(com.sforce.soap.enterprise.sobject.Contact AP_Contact_Lookup__r) {
    this.AP_Contact_Lookup__r = AP_Contact_Lookup__r;
    AP_Contact_Lookup__r__is_set = true;
  }
  
  /**
   * element  : AccountContactRoles of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AccountContactRoles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountContactRoles","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AccountContactRoles__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AccountContactRoles;

  public com.sforce.soap.enterprise.QueryResult getAccountContactRoles() {
    return AccountContactRoles;
  }

  

  public void setAccountContactRoles(com.sforce.soap.enterprise.QueryResult AccountContactRoles) {
    this.AccountContactRoles = AccountContactRoles;
    AccountContactRoles__is_set = true;
  }
  
  /**
   * element  : AccountPartnersFrom of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AccountPartnersFrom__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountPartnersFrom","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AccountPartnersFrom__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AccountPartnersFrom;

  public com.sforce.soap.enterprise.QueryResult getAccountPartnersFrom() {
    return AccountPartnersFrom;
  }

  

  public void setAccountPartnersFrom(com.sforce.soap.enterprise.QueryResult AccountPartnersFrom) {
    this.AccountPartnersFrom = AccountPartnersFrom;
    AccountPartnersFrom__is_set = true;
  }
  
  /**
   * element  : AccountPartnersTo of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AccountPartnersTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountPartnersTo","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AccountPartnersTo__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AccountPartnersTo;

  public com.sforce.soap.enterprise.QueryResult getAccountPartnersTo() {
    return AccountPartnersTo;
  }

  

  public void setAccountPartnersTo(com.sforce.soap.enterprise.QueryResult AccountPartnersTo) {
    this.AccountPartnersTo = AccountPartnersTo;
    AccountPartnersTo__is_set = true;
  }
  
  /**
   * element  : AccountSource of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountSource__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AccountSource","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AccountSource__is_set = false;

  private java.lang.String AccountSource;

  public java.lang.String getAccountSource() {
    return AccountSource;
  }

  

  public void setAccountSource(java.lang.String AccountSource) {
    this.AccountSource = AccountSource;
    AccountSource__is_set = true;
  }
  
  /**
   * element  : Active_Assignments__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Active_Assignments__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Active_Assignments__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Active_Assignments__c__is_set = false;

  private java.lang.Double Active_Assignments__c;

  public java.lang.Double getActive_Assignments__c() {
    return Active_Assignments__c;
  }

  

  public void setActive_Assignments__c(java.lang.Double Active_Assignments__c) {
    this.Active_Assignments__c = Active_Assignments__c;
    Active_Assignments__c__is_set = true;
  }
  
  /**
   * element  : Active__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Active__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Active__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Active__c__is_set = false;

  private java.lang.String Active__c;

  public java.lang.String getActive__c() {
    return Active__c;
  }

  

  public void setActive__c(java.lang.String Active__c) {
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
   * element  : AcumenMerge__Robots__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AcumenMerge__Robots__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AcumenMerge__Robots__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AcumenMerge__Robots__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AcumenMerge__Robots__r;

  public com.sforce.soap.enterprise.QueryResult getAcumenMerge__Robots__r() {
    return AcumenMerge__Robots__r;
  }

  

  public void setAcumenMerge__Robots__r(com.sforce.soap.enterprise.QueryResult AcumenMerge__Robots__r) {
    this.AcumenMerge__Robots__r = AcumenMerge__Robots__r;
    AcumenMerge__Robots__r__is_set = true;
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
   * element  : AnnualRevenue of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo AnnualRevenue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AnnualRevenue","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean AnnualRevenue__is_set = false;

  private java.lang.Double AnnualRevenue;

  public java.lang.Double getAnnualRevenue() {
    return AnnualRevenue;
  }

  

  public void setAnnualRevenue(java.lang.Double AnnualRevenue) {
    this.AnnualRevenue = AnnualRevenue;
    AnnualRevenue__is_set = true;
  }
  
  /**
   * element  : Assets of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Assets__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assets","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Assets__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Assets;

  public com.sforce.soap.enterprise.QueryResult getAssets() {
    return Assets;
  }

  

  public void setAssets(com.sforce.soap.enterprise.QueryResult Assets) {
    this.Assets = Assets;
    Assets__is_set = true;
  }
  
  /**
   * element  : Assignment_Credit_Load__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Assignment_Credit_Load__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignment_Credit_Load__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Assignment_Credit_Load__c__is_set = false;

  private java.lang.Double Assignment_Credit_Load__c;

  public java.lang.Double getAssignment_Credit_Load__c() {
    return Assignment_Credit_Load__c;
  }

  

  public void setAssignment_Credit_Load__c(java.lang.Double Assignment_Credit_Load__c) {
    this.Assignment_Credit_Load__c = Assignment_Credit_Load__c;
    Assignment_Credit_Load__c__is_set = true;
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
   * element  : BA_Client_Reference__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BA_Client_Reference__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","BA_Client_Reference__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BA_Client_Reference__c__is_set = false;

  private java.lang.String BA_Client_Reference__c;

  public java.lang.String getBA_Client_Reference__c() {
    return BA_Client_Reference__c;
  }

  

  public void setBA_Client_Reference__c(java.lang.String BA_Client_Reference__c) {
    this.BA_Client_Reference__c = BA_Client_Reference__c;
    BA_Client_Reference__c__is_set = true;
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
   * element  : CSA_Obtained_By__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CSA_Obtained_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSA_Obtained_By__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

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
   * element  : CSA_Obtained_By__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo CSA_Obtained_By__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSA_Obtained_By__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean CSA_Obtained_By__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User CSA_Obtained_By__r;

  public com.sforce.soap.enterprise.sobject.User getCSA_Obtained_By__r() {
    return CSA_Obtained_By__r;
  }

  

  public void setCSA_Obtained_By__r(com.sforce.soap.enterprise.sobject.User CSA_Obtained_By__r) {
    this.CSA_Obtained_By__r = CSA_Obtained_By__r;
    CSA_Obtained_By__r__is_set = true;
  }
  
  /**
   * element  : CSA_on_File__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo CSA_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSA_on_File__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean CSA_on_File__c__is_set = false;

  private java.lang.Boolean CSA_on_File__c;

  public java.lang.Boolean getCSA_on_File__c() {
    return CSA_on_File__c;
  }

  

  public void setCSA_on_File__c(java.lang.Boolean CSA_on_File__c) {
    this.CSA_on_File__c = CSA_on_File__c;
    CSA_on_File__c__is_set = true;
  }
  
  /**
   * element  : CSO_Relationship_Established__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo CSO_Relationship_Established__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CSO_Relationship_Established__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean CSO_Relationship_Established__c__is_set = false;

  private java.lang.Boolean CSO_Relationship_Established__c;

  public java.lang.Boolean getCSO_Relationship_Established__c() {
    return CSO_Relationship_Established__c;
  }

  

  public void setCSO_Relationship_Established__c(java.lang.Boolean CSO_Relationship_Established__c) {
    this.CSO_Relationship_Established__c = CSO_Relationship_Established__c;
    CSO_Relationship_Established__c__is_set = true;
  }
  
  /**
   * element  : Cases of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Cases__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cases","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Cases__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Cases;

  public com.sforce.soap.enterprise.QueryResult getCases() {
    return Cases;
  }

  

  public void setCases(com.sforce.soap.enterprise.QueryResult Cases) {
    this.Cases = Cases;
    Cases__is_set = true;
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
   * element  : ChildAccounts of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ChildAccounts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ChildAccounts","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ChildAccounts__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ChildAccounts;

  public com.sforce.soap.enterprise.QueryResult getChildAccounts() {
    return ChildAccounts;
  }

  

  public void setChildAccounts(com.sforce.soap.enterprise.QueryResult ChildAccounts) {
    this.ChildAccounts = ChildAccounts;
    ChildAccounts__is_set = true;
  }
  
  /**
   * element  : Collections_Handled_By__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Collections_Handled_By__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Collections_Handled_By__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Collections_Handled_By__c__is_set = false;

  private java.lang.String Collections_Handled_By__c;

  public java.lang.String getCollections_Handled_By__c() {
    return Collections_Handled_By__c;
  }

  

  public void setCollections_Handled_By__c(java.lang.String Collections_Handled_By__c) {
    this.Collections_Handled_By__c = Collections_Handled_By__c;
    Collections_Handled_By__c__is_set = true;
  }
  
  /**
   * element  : Collections_Issue__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Collections_Issue__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Collections_Issue__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Collections_Issue__c__is_set = false;

  private java.lang.Boolean Collections_Issue__c;

  public java.lang.Boolean getCollections_Issue__c() {
    return Collections_Issue__c;
  }

  

  public void setCollections_Issue__c(java.lang.Boolean Collections_Issue__c) {
    this.Collections_Issue__c = Collections_Issue__c;
    Collections_Issue__c__is_set = true;
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
   * element  : Contacts of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Contacts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contacts","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Contacts__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Contacts;

  public com.sforce.soap.enterprise.QueryResult getContacts() {
    return Contacts;
  }

  

  public void setContacts(com.sforce.soap.enterprise.QueryResult Contacts) {
    this.Contacts = Contacts;
    Contacts__is_set = true;
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
   * element  : Contracts of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Contracts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Contracts","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Contracts__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Contracts;

  public com.sforce.soap.enterprise.QueryResult getContracts() {
    return Contracts;
  }

  

  public void setContracts(com.sforce.soap.enterprise.QueryResult Contracts) {
    this.Contracts = Contracts;
    Contracts__is_set = true;
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
   * element  : Credit_App_on_File__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Credit_App_on_File__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Credit_App_on_File__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Credit_App_on_File__c__is_set = false;

  private java.lang.Boolean Credit_App_on_File__c;

  public java.lang.Boolean getCredit_App_on_File__c() {
    return Credit_App_on_File__c;
  }

  

  public void setCredit_App_on_File__c(java.lang.Boolean Credit_App_on_File__c) {
    this.Credit_App_on_File__c = Credit_App_on_File__c;
    Credit_App_on_File__c__is_set = true;
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
   * element  : Current_AR_Credit_Load__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Current_AR_Credit_Load__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Current_AR_Credit_Load__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Current_AR_Credit_Load__c__is_set = false;

  private java.lang.Double Current_AR_Credit_Load__c;

  public java.lang.Double getCurrent_AR_Credit_Load__c() {
    return Current_AR_Credit_Load__c;
  }

  

  public void setCurrent_AR_Credit_Load__c(java.lang.Double Current_AR_Credit_Load__c) {
    this.Current_AR_Credit_Load__c = Current_AR_Credit_Load__c;
    Current_AR_Credit_Load__c__is_set = true;
  }
  
  /**
   * element  : CustomerPriority__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomerPriority__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomerPriority__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CustomerPriority__c__is_set = false;

  private java.lang.String CustomerPriority__c;

  public java.lang.String getCustomerPriority__c() {
    return CustomerPriority__c;
  }

  

  public void setCustomerPriority__c(java.lang.String CustomerPriority__c) {
    this.CustomerPriority__c = CustomerPriority__c;
    CustomerPriority__c__is_set = true;
  }
  
  /**
   * element  : Customer_Id__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Customer_Id__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Customer_Id__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Customer_Id__c__is_set = false;

  private java.lang.String Customer_Id__c;

  public java.lang.String getCustomer_Id__c() {
    return Customer_Id__c;
  }

  

  public void setCustomer_Id__c(java.lang.String Customer_Id__c) {
    this.Customer_Id__c = Customer_Id__c;
    Customer_Id__c__is_set = true;
  }
  
  /**
   * element  : Days_Since_Activity_or_Order__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Days_Since_Activity_or_Order__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Days_Since_Activity_or_Order__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Days_Since_Activity_or_Order__c__is_set = false;

  private java.lang.Double Days_Since_Activity_or_Order__c;

  public java.lang.Double getDays_Since_Activity_or_Order__c() {
    return Days_Since_Activity_or_Order__c;
  }

  

  public void setDays_Since_Activity_or_Order__c(java.lang.Double Days_Since_Activity_or_Order__c) {
    this.Days_Since_Activity_or_Order__c = Days_Since_Activity_or_Order__c;
    Days_Since_Activity_or_Order__c__is_set = true;
  }
  
  /**
   * element  : Days_Since_Last_Activity__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Days_Since_Last_Activity__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Days_Since_Last_Activity__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Days_Since_Last_Activity__c__is_set = false;

  private java.lang.Double Days_Since_Last_Activity__c;

  public java.lang.Double getDays_Since_Last_Activity__c() {
    return Days_Since_Last_Activity__c;
  }

  

  public void setDays_Since_Last_Activity__c(java.lang.Double Days_Since_Last_Activity__c) {
    this.Days_Since_Last_Activity__c = Days_Since_Last_Activity__c;
    Days_Since_Last_Activity__c__is_set = true;
  }
  
  /**
   * element  : Days_Since_Last_Order__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Days_Since_Last_Order__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Days_Since_Last_Order__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Days_Since_Last_Order__c__is_set = false;

  private java.lang.Double Days_Since_Last_Order__c;

  public java.lang.Double getDays_Since_Last_Order__c() {
    return Days_Since_Last_Order__c;
  }

  

  public void setDays_Since_Last_Order__c(java.lang.Double Days_Since_Last_Order__c) {
    this.Days_Since_Last_Order__c = Days_Since_Last_Order__c;
    Days_Since_Last_Order__c__is_set = true;
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
   * element  : Do_Not_Buy_Text__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Do_Not_Buy_Text__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Do_Not_Buy_Text__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Do_Not_Buy_Text__c__is_set = false;

  private java.lang.String Do_Not_Buy_Text__c;

  public java.lang.String getDo_Not_Buy_Text__c() {
    return Do_Not_Buy_Text__c;
  }

  

  public void setDo_Not_Buy_Text__c(java.lang.String Do_Not_Buy_Text__c) {
    this.Do_Not_Buy_Text__c = Do_Not_Buy_Text__c;
    Do_Not_Buy_Text__c__is_set = true;
  }
  
  /**
   * element  : Do_Not_Buy__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Do_Not_Buy__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Do_Not_Buy__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Do_Not_Buy__c__is_set = false;

  private java.lang.Boolean Do_Not_Buy__c;

  public java.lang.Boolean getDo_Not_Buy__c() {
    return Do_Not_Buy__c;
  }

  

  public void setDo_Not_Buy__c(java.lang.Boolean Do_Not_Buy__c) {
    this.Do_Not_Buy__c = Do_Not_Buy__c;
    Do_Not_Buy__c__is_set = true;
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
   * element  : Expenses__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Expenses__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Expenses__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Expenses__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Expenses__r;

  public com.sforce.soap.enterprise.QueryResult getExpenses__r() {
    return Expenses__r;
  }

  

  public void setExpenses__r(com.sforce.soap.enterprise.QueryResult Expenses__r) {
    this.Expenses__r = Expenses__r;
    Expenses__r__is_set = true;
  }
  
  /**
   * element  : External_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo External_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","External_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean External_ID__c__is_set = false;

  private java.lang.String External_ID__c;

  public java.lang.String getExternal_ID__c() {
    return External_ID__c;
  }

  

  public void setExternal_ID__c(java.lang.String External_ID__c) {
    this.External_ID__c = External_ID__c;
    External_ID__c__is_set = true;
  }
  
  /**
   * element  : FNA_Status__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FNA_Status__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FNA_Status__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FNA_Status__c__is_set = false;

  private java.lang.String FNA_Status__c;

  public java.lang.String getFNA_Status__c() {
    return FNA_Status__c;
  }

  

  public void setFNA_Status__c(java.lang.String FNA_Status__c) {
    this.FNA_Status__c = FNA_Status__c;
    FNA_Status__c__is_set = true;
  }
  
  /**
   * element  : Fast_Pay_Client__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Fast_Pay_Client__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fast_Pay_Client__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Fast_Pay_Client__c__is_set = false;

  private java.lang.Boolean Fast_Pay_Client__c;

  public java.lang.Boolean getFast_Pay_Client__c() {
    return Fast_Pay_Client__c;
  }

  

  public void setFast_Pay_Client__c(java.lang.Boolean Fast_Pay_Client__c) {
    this.Fast_Pay_Client__c = Fast_Pay_Client__c;
    Fast_Pay_Client__c__is_set = true;
  }
  
  /**
   * element  : Fast_Pay_Details__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Fast_Pay_Details__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Fast_Pay_Details__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Fast_Pay_Details__c__is_set = false;

  private java.lang.String Fast_Pay_Details__c;

  public java.lang.String getFast_Pay_Details__c() {
    return Fast_Pay_Details__c;
  }

  

  public void setFast_Pay_Details__c(java.lang.String Fast_Pay_Details__c) {
    this.Fast_Pay_Details__c = Fast_Pay_Details__c;
    Fast_Pay_Details__c__is_set = true;
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
   * element  : Focus_Account__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Focus_Account__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Focus_Account__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Focus_Account__c__is_set = false;

  private java.lang.Boolean Focus_Account__c;

  public java.lang.Boolean getFocus_Account__c() {
    return Focus_Account__c;
  }

  

  public void setFocus_Account__c(java.lang.Boolean Focus_Account__c) {
    this.Focus_Account__c = Focus_Account__c;
    Focus_Account__c__is_set = true;
  }
  
  /**
   * element  : General_Contractor_Required_On_Order__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo General_Contractor_Required_On_Order__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","General_Contractor_Required_On_Order__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean General_Contractor_Required_On_Order__c__is_set = false;

  private java.lang.Boolean General_Contractor_Required_On_Order__c;

  public java.lang.Boolean getGeneral_Contractor_Required_On_Order__c() {
    return General_Contractor_Required_On_Order__c;
  }

  

  public void setGeneral_Contractor_Required_On_Order__c(java.lang.Boolean General_Contractor_Required_On_Order__c) {
    this.General_Contractor_Required_On_Order__c = General_Contractor_Required_On_Order__c;
    General_Contractor_Required_On_Order__c__is_set = true;
  }
  
  /**
   * element  : Global_Accounts_Sharing__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Global_Accounts_Sharing__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Global_Accounts_Sharing__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Global_Accounts_Sharing__c__is_set = false;

  private java.lang.Boolean Global_Accounts_Sharing__c;

  public java.lang.Boolean getGlobal_Accounts_Sharing__c() {
    return Global_Accounts_Sharing__c;
  }

  

  public void setGlobal_Accounts_Sharing__c(java.lang.Boolean Global_Accounts_Sharing__c) {
    this.Global_Accounts_Sharing__c = Global_Accounts_Sharing__c;
    Global_Accounts_Sharing__c__is_set = true;
  }
  
  /**
   * element  : Global_Sharing_Expiration_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Global_Sharing_Expiration_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Global_Sharing_Expiration_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Global_Sharing_Expiration_Date__c__is_set = false;

  private java.util.Calendar Global_Sharing_Expiration_Date__c;

  public java.util.Calendar getGlobal_Sharing_Expiration_Date__c() {
    return Global_Sharing_Expiration_Date__c;
  }

  

  public void setGlobal_Sharing_Expiration_Date__c(java.util.Calendar Global_Sharing_Expiration_Date__c) {
    this.Global_Sharing_Expiration_Date__c = Global_Sharing_Expiration_Date__c;
    Global_Sharing_Expiration_Date__c__is_set = true;
  }
  
  /**
   * element  : Global_Sharing_Start_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Global_Sharing_Start_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Global_Sharing_Start_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Global_Sharing_Start_Date__c__is_set = false;

  private java.util.Calendar Global_Sharing_Start_Date__c;

  public java.util.Calendar getGlobal_Sharing_Start_Date__c() {
    return Global_Sharing_Start_Date__c;
  }

  

  public void setGlobal_Sharing_Start_Date__c(java.util.Calendar Global_Sharing_Start_Date__c) {
    this.Global_Sharing_Start_Date__c = Global_Sharing_Start_Date__c;
    Global_Sharing_Start_Date__c__is_set = true;
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
   * element  : Industry__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Industry__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Industry__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Industry__c__is_set = false;

  private java.lang.String Industry__c;

  public java.lang.String getIndustry__c() {
    return Industry__c;
  }

  

  public void setIndustry__c(java.lang.String Industry__c) {
    this.Industry__c = Industry__c;
    Industry__c__is_set = true;
  }
  
  /**
   * element  : Injury_Count__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Injury_Count__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Injury_Count__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Injury_Count__c__is_set = false;

  private java.lang.Double Injury_Count__c;

  public java.lang.Double getInjury_Count__c() {
    return Injury_Count__c;
  }

  

  public void setInjury_Count__c(java.lang.Double Injury_Count__c) {
    this.Injury_Count__c = Injury_Count__c;
    Injury_Count__c__is_set = true;
  }
  
  /**
   * element  : Invoices_Outstanding__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Invoices_Outstanding__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Invoices_Outstanding__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Invoices_Outstanding__c__is_set = false;

  private java.lang.Double Invoices_Outstanding__c;

  public java.lang.Double getInvoices_Outstanding__c() {
    return Invoices_Outstanding__c;
  }

  

  public void setInvoices_Outstanding__c(java.lang.Double Invoices_Outstanding__c) {
    this.Invoices_Outstanding__c = Invoices_Outstanding__c;
    Invoices_Outstanding__c__is_set = true;
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
   * element  : IsPartner of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsPartner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsPartner","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsPartner__is_set = false;

  private java.lang.Boolean IsPartner;

  public java.lang.Boolean getIsPartner() {
    return IsPartner;
  }

  

  public void setIsPartner(java.lang.Boolean IsPartner) {
    this.IsPartner = IsPartner;
    IsPartner__is_set = true;
  }
  
  /**
   * element  : Jigsaw of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Jigsaw__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Jigsaw","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Jigsaw__is_set = false;

  private java.lang.String Jigsaw;

  public java.lang.String getJigsaw() {
    return Jigsaw;
  }

  

  public void setJigsaw(java.lang.String Jigsaw) {
    this.Jigsaw = Jigsaw;
    Jigsaw__is_set = true;
  }
  
  /**
   * element  : JigsawCompanyId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo JigsawCompanyId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JigsawCompanyId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean JigsawCompanyId__is_set = false;

  private java.lang.String JigsawCompanyId;

  public java.lang.String getJigsawCompanyId() {
    return JigsawCompanyId;
  }

  

  public void setJigsawCompanyId(java.lang.String JigsawCompanyId) {
    this.JigsawCompanyId = JigsawCompanyId;
    JigsawCompanyId__is_set = true;
  }
  
  /**
   * element  : Known_Services_User__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Known_Services_User__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Known_Services_User__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Known_Services_User__c__is_set = false;

  private java.lang.Boolean Known_Services_User__c;

  public java.lang.Boolean getKnown_Services_User__c() {
    return Known_Services_User__c;
  }

  

  public void setKnown_Services_User__c(java.lang.Boolean Known_Services_User__c) {
    this.Known_Services_User__c = Known_Services_User__c;
    Known_Services_User__c__is_set = true;
  }
  
  /**
   * element  : LTATW__LTATW_selectedAddress__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LTATW__LTATW_selectedAddress__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LTATW__LTATW_selectedAddress__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LTATW__LTATW_selectedAddress__c__is_set = false;

  private java.lang.String LTATW__LTATW_selectedAddress__c;

  public java.lang.String getLTATW__LTATW_selectedAddress__c() {
    return LTATW__LTATW_selectedAddress__c;
  }

  

  public void setLTATW__LTATW_selectedAddress__c(java.lang.String LTATW__LTATW_selectedAddress__c) {
    this.LTATW__LTATW_selectedAddress__c = LTATW__LTATW_selectedAddress__c;
    LTATW__LTATW_selectedAddress__c__is_set = true;
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
   * element  : MME__EmailMessages__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo MME__EmailMessages__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MME__EmailMessages__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean MME__EmailMessages__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult MME__EmailMessages__r;

  public com.sforce.soap.enterprise.QueryResult getMME__EmailMessages__r() {
    return MME__EmailMessages__r;
  }

  

  public void setMME__EmailMessages__r(com.sforce.soap.enterprise.QueryResult MME__EmailMessages__r) {
    this.MME__EmailMessages__r = MME__EmailMessages__r;
    MME__EmailMessages__r__is_set = true;
  }
  
  /**
   * element  : MasterRecord of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo MasterRecord__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MasterRecord","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean MasterRecord__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account MasterRecord;

  public com.sforce.soap.enterprise.sobject.Account getMasterRecord() {
    return MasterRecord;
  }

  

  public void setMasterRecord(com.sforce.soap.enterprise.sobject.Account MasterRecord) {
    this.MasterRecord = MasterRecord;
    MasterRecord__is_set = true;
  }
  
  /**
   * element  : MasterRecordId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MasterRecordId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MasterRecordId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean MasterRecordId__is_set = false;

  private java.lang.String MasterRecordId;

  public java.lang.String getMasterRecordId() {
    return MasterRecordId;
  }

  

  public void setMasterRecordId(java.lang.String MasterRecordId) {
    this.MasterRecordId = MasterRecordId;
    MasterRecordId__is_set = true;
  }
  
  /**
   * element  : Max_Actual_End_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Max_Actual_End_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Max_Actual_End_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Max_Actual_End_Date__c__is_set = false;

  private java.util.Calendar Max_Actual_End_Date__c;

  public java.util.Calendar getMax_Actual_End_Date__c() {
    return Max_Actual_End_Date__c;
  }

  

  public void setMax_Actual_End_Date__c(java.util.Calendar Max_Actual_End_Date__c) {
    this.Max_Actual_End_Date__c = Max_Actual_End_Date__c;
    Max_Actual_End_Date__c__is_set = true;
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
   * element  : Most_Recent_Order_Date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Most_Recent_Order_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Most_Recent_Order_Date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Most_Recent_Order_Date__c__is_set = false;

  private java.util.Calendar Most_Recent_Order_Date__c;

  public java.util.Calendar getMost_Recent_Order_Date__c() {
    return Most_Recent_Order_Date__c;
  }

  

  public void setMost_Recent_Order_Date__c(java.util.Calendar Most_Recent_Order_Date__c) {
    this.Most_Recent_Order_Date__c = Most_Recent_Order_Date__c;
    Most_Recent_Order_Date__c__is_set = true;
  }
  
  /**
   * element  : Most_Recent_Payment__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Most_Recent_Payment__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Most_Recent_Payment__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean Most_Recent_Payment__c__is_set = false;

  private java.util.Calendar Most_Recent_Payment__c;

  public java.util.Calendar getMost_Recent_Payment__c() {
    return Most_Recent_Payment__c;
  }

  

  public void setMost_Recent_Payment__c(java.util.Calendar Most_Recent_Payment__c) {
    this.Most_Recent_Payment__c = Most_Recent_Payment__c;
    Most_Recent_Payment__c__is_set = true;
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
   * element  : NumberOfEmployees of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfEmployees__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberOfEmployees","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfEmployees__is_set = false;

  private java.lang.Integer NumberOfEmployees;

  public java.lang.Integer getNumberOfEmployees() {
    return NumberOfEmployees;
  }

  

  public void setNumberOfEmployees(java.lang.Integer NumberOfEmployees) {
    this.NumberOfEmployees = NumberOfEmployees;
    NumberOfEmployees__is_set = true;
  }
  
  /**
   * element  : Number_of_Current_Orders__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Number_of_Current_Orders__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number_of_Current_Orders__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Number_of_Current_Orders__c__is_set = false;

  private java.lang.Double Number_of_Current_Orders__c;

  public java.lang.Double getNumber_of_Current_Orders__c() {
    return Number_of_Current_Orders__c;
  }

  

  public void setNumber_of_Current_Orders__c(java.lang.Double Number_of_Current_Orders__c) {
    this.Number_of_Current_Orders__c = Number_of_Current_Orders__c;
    Number_of_Current_Orders__c__is_set = true;
  }
  
  /**
   * element  : Number_of_Orders__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Number_of_Orders__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number_of_Orders__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Number_of_Orders__c__is_set = false;

  private java.lang.Double Number_of_Orders__c;

  public java.lang.Double getNumber_of_Orders__c() {
    return Number_of_Orders__c;
  }

  

  public void setNumber_of_Orders__c(java.lang.Double Number_of_Orders__c) {
    this.Number_of_Orders__c = Number_of_Orders__c;
    Number_of_Orders__c__is_set = true;
  }
  
  /**
   * element  : NumberofLocations__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo NumberofLocations__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NumberofLocations__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean NumberofLocations__c__is_set = false;

  private java.lang.Double NumberofLocations__c;

  public java.lang.Double getNumberofLocations__c() {
    return NumberofLocations__c;
  }

  

  public void setNumberofLocations__c(java.lang.Double NumberofLocations__c) {
    this.NumberofLocations__c = NumberofLocations__c;
    NumberofLocations__c__is_set = true;
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
   * element  : OpportunityPartnersTo of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo OpportunityPartnersTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OpportunityPartnersTo","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean OpportunityPartnersTo__is_set = false;

  private com.sforce.soap.enterprise.QueryResult OpportunityPartnersTo;

  public com.sforce.soap.enterprise.QueryResult getOpportunityPartnersTo() {
    return OpportunityPartnersTo;
  }

  

  public void setOpportunityPartnersTo(com.sforce.soap.enterprise.QueryResult OpportunityPartnersTo) {
    this.OpportunityPartnersTo = OpportunityPartnersTo;
    OpportunityPartnersTo__is_set = true;
  }
  
  /**
   * element  : Orders_Placed__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Orders_Placed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders_Placed__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Orders_Placed__c__is_set = false;

  private java.lang.Double Orders_Placed__c;

  public java.lang.Double getOrders_Placed__c() {
    return Orders_Placed__c;
  }

  

  public void setOrders_Placed__c(java.lang.Double Orders_Placed__c) {
    this.Orders_Placed__c = Orders_Placed__c;
    Orders_Placed__c__is_set = true;
  }
  
  /**
   * element  : Orders__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Orders__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Orders__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Orders__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Orders__r;

  public com.sforce.soap.enterprise.QueryResult getOrders__r() {
    return Orders__r;
  }

  

  public void setOrders__r(com.sforce.soap.enterprise.QueryResult Orders__r) {
    this.Orders__r = Orders__r;
    Orders__r__is_set = true;
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
   * element  : Ownership of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Ownership__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Ownership","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Ownership__is_set = false;

  private java.lang.String Ownership;

  public java.lang.String getOwnership() {
    return Ownership;
  }

  

  public void setOwnership(java.lang.String Ownership) {
    this.Ownership = Ownership;
    Ownership__is_set = true;
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
   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean Parent__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account Parent;

  public com.sforce.soap.enterprise.sobject.Account getParent() {
    return Parent;
  }

  

  public void setParent(com.sforce.soap.enterprise.sobject.Account Parent) {
    this.Parent = Parent;
    Parent__is_set = true;
  }
  
  /**
   * element  : ParentId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ParentId__is_set = false;

  private java.lang.String ParentId;

  public java.lang.String getParentId() {
    return ParentId;
  }

  

  public void setParentId(java.lang.String ParentId) {
    this.ParentId = ParentId;
    ParentId__is_set = true;
  }
  
  /**
   * element  : PartnersFrom of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo PartnersFrom__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PartnersFrom","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean PartnersFrom__is_set = false;

  private com.sforce.soap.enterprise.QueryResult PartnersFrom;

  public com.sforce.soap.enterprise.QueryResult getPartnersFrom() {
    return PartnersFrom;
  }

  

  public void setPartnersFrom(com.sforce.soap.enterprise.QueryResult PartnersFrom) {
    this.PartnersFrom = PartnersFrom;
    PartnersFrom__is_set = true;
  }
  
  /**
   * element  : PartnersTo of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo PartnersTo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PartnersTo","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean PartnersTo__is_set = false;

  private com.sforce.soap.enterprise.QueryResult PartnersTo;

  public com.sforce.soap.enterprise.QueryResult getPartnersTo() {
    return PartnersTo;
  }

  

  public void setPartnersTo(com.sforce.soap.enterprise.QueryResult PartnersTo) {
    this.PartnersTo = PartnersTo;
    PartnersTo__is_set = true;
  }
  
  /**
   * element  : Personas of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Personas__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Personas","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Personas__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Personas;

  public com.sforce.soap.enterprise.QueryResult getPersonas() {
    return Personas;
  }

  

  public void setPersonas(com.sforce.soap.enterprise.QueryResult Personas) {
    this.Personas = Personas;
    Personas__is_set = true;
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
   * element  : PhotoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PhotoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PhotoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PhotoUrl__is_set = false;

  private java.lang.String PhotoUrl;

  public java.lang.String getPhotoUrl() {
    return PhotoUrl;
  }

  

  public void setPhotoUrl(java.lang.String PhotoUrl) {
    this.PhotoUrl = PhotoUrl;
    PhotoUrl__is_set = true;
  }
  
  /**
   * element  : Posts of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Posts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Posts","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Posts__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Posts;

  public com.sforce.soap.enterprise.QueryResult getPosts() {
    return Posts;
  }

  

  public void setPosts(com.sforce.soap.enterprise.QueryResult Posts) {
    this.Posts = Posts;
    Posts__is_set = true;
  }
  
  /**
   * element  : Pre_Pay_Client_Text__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pre_Pay_Client_Text__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pre_Pay_Client_Text__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Pre_Pay_Client_Text__c__is_set = false;

  private java.lang.String Pre_Pay_Client_Text__c;

  public java.lang.String getPre_Pay_Client_Text__c() {
    return Pre_Pay_Client_Text__c;
  }

  

  public void setPre_Pay_Client_Text__c(java.lang.String Pre_Pay_Client_Text__c) {
    this.Pre_Pay_Client_Text__c = Pre_Pay_Client_Text__c;
    Pre_Pay_Client_Text__c__is_set = true;
  }
  
  /**
   * element  : Pre_Pay_Client__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Pre_Pay_Client__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pre_Pay_Client__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Pre_Pay_Client__c__is_set = false;

  private java.lang.Boolean Pre_Pay_Client__c;

  public java.lang.Boolean getPre_Pay_Client__c() {
    return Pre_Pay_Client__c;
  }

  

  public void setPre_Pay_Client__c(java.lang.Boolean Pre_Pay_Client__c) {
    this.Pre_Pay_Client__c = Pre_Pay_Client__c;
    Pre_Pay_Client__c__is_set = true;
  }
  
  /**
   * element  : Pre_Pay_Method__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Pre_Pay_Method__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Pre_Pay_Method__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Pre_Pay_Method__c__is_set = false;

  private java.lang.String Pre_Pay_Method__c;

  public java.lang.String getPre_Pay_Method__c() {
    return Pre_Pay_Method__c;
  }

  

  public void setPre_Pay_Method__c(java.lang.String Pre_Pay_Method__c) {
    this.Pre_Pay_Method__c = Pre_Pay_Method__c;
    Pre_Pay_Method__c__is_set = true;
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
   * element  : Rating of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Rating__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Rating","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Rating__is_set = false;

  private java.lang.String Rating;

  public java.lang.String getRating() {
    return Rating;
  }

  

  public void setRating(java.lang.String Rating) {
    this.Rating = Rating;
    Rating__is_set = true;
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
   * element  : Remaining_Credit__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Remaining_Credit__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Remaining_Credit__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Remaining_Credit__c__is_set = false;

  private java.lang.Double Remaining_Credit__c;

  public java.lang.Double getRemaining_Credit__c() {
    return Remaining_Credit__c;
  }

  

  public void setRemaining_Credit__c(java.lang.Double Remaining_Credit__c) {
    this.Remaining_Credit__c = Remaining_Credit__c;
    Remaining_Credit__c__is_set = true;
  }
  
  /**
   * element  : Requires_PO_on_Orders__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Requires_PO_on_Orders__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Requires_PO_on_Orders__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Requires_PO_on_Orders__c__is_set = false;

  private java.lang.String Requires_PO_on_Orders__c;

  public java.lang.String getRequires_PO_on_Orders__c() {
    return Requires_PO_on_Orders__c;
  }

  

  public void setRequires_PO_on_Orders__c(java.lang.String Requires_PO_on_Orders__c) {
    this.Requires_PO_on_Orders__c = Requires_PO_on_Orders__c;
    Requires_PO_on_Orders__c__is_set = true;
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
   * element  : SF_Account_ID__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SF_Account_ID__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SF_Account_ID__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SF_Account_ID__c__is_set = false;

  private java.lang.String SF_Account_ID__c;

  public java.lang.String getSF_Account_ID__c() {
    return SF_Account_ID__c;
  }

  

  public void setSF_Account_ID__c(java.lang.String SF_Account_ID__c) {
    this.SF_Account_ID__c = SF_Account_ID__c;
    SF_Account_ID__c__is_set = true;
  }
  
  /**
   * element  : SLAExpirationDate__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo SLAExpirationDate__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SLAExpirationDate__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean SLAExpirationDate__c__is_set = false;

  private java.util.Calendar SLAExpirationDate__c;

  public java.util.Calendar getSLAExpirationDate__c() {
    return SLAExpirationDate__c;
  }

  

  public void setSLAExpirationDate__c(java.util.Calendar SLAExpirationDate__c) {
    this.SLAExpirationDate__c = SLAExpirationDate__c;
    SLAExpirationDate__c__is_set = true;
  }
  
  /**
   * element  : SLASerialNumber__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SLASerialNumber__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SLASerialNumber__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SLASerialNumber__c__is_set = false;

  private java.lang.String SLASerialNumber__c;

  public java.lang.String getSLASerialNumber__c() {
    return SLASerialNumber__c;
  }

  

  public void setSLASerialNumber__c(java.lang.String SLASerialNumber__c) {
    this.SLASerialNumber__c = SLASerialNumber__c;
    SLASerialNumber__c__is_set = true;
  }
  
  /**
   * element  : SLA__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SLA__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SLA__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SLA__c__is_set = false;

  private java.lang.String SLA__c;

  public java.lang.String getSLA__c() {
    return SLA__c;
  }

  

  public void setSLA__c(java.lang.String SLA__c) {
    this.SLA__c = SLA__c;
    SLA__c__is_set = true;
  }
  
  /**
   * element  : Send_Notice_of_Furnishing__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Send_Notice_of_Furnishing__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Send_Notice_of_Furnishing__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Send_Notice_of_Furnishing__c__is_set = false;

  private java.lang.Boolean Send_Notice_of_Furnishing__c;

  public java.lang.Boolean getSend_Notice_of_Furnishing__c() {
    return Send_Notice_of_Furnishing__c;
  }

  

  public void setSend_Notice_of_Furnishing__c(java.lang.Boolean Send_Notice_of_Furnishing__c) {
    this.Send_Notice_of_Furnishing__c = Send_Notice_of_Furnishing__c;
    Send_Notice_of_Furnishing__c__is_set = true;
  }
  
  /**
   * element  : Send_to_Contact__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Send_to_Contact__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Send_to_Contact__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean Send_to_Contact__c__is_set = false;

  private java.lang.String Send_to_Contact__c;

  public java.lang.String getSend_to_Contact__c() {
    return Send_to_Contact__c;
  }

  

  public void setSend_to_Contact__c(java.lang.String Send_to_Contact__c) {
    this.Send_to_Contact__c = Send_to_Contact__c;
    Send_to_Contact__c__is_set = true;
  }
  
  /**
   * element  : Send_to_Contact__r of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo Send_to_Contact__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Send_to_Contact__r","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean Send_to_Contact__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact Send_to_Contact__r;

  public com.sforce.soap.enterprise.sobject.Contact getSend_to_Contact__r() {
    return Send_to_Contact__r;
  }

  

  public void setSend_to_Contact__r(com.sforce.soap.enterprise.sobject.Contact Send_to_Contact__r) {
    this.Send_to_Contact__r = Send_to_Contact__r;
    Send_to_Contact__r__is_set = true;
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
   * element  : Sic of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Sic__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Sic","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Sic__is_set = false;

  private java.lang.String Sic;

  public java.lang.String getSic() {
    return Sic;
  }

  

  public void setSic(java.lang.String Sic) {
    this.Sic = Sic;
    Sic__is_set = true;
  }
  
  /**
   * element  : SicDesc of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SicDesc__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SicDesc","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SicDesc__is_set = false;

  private java.lang.String SicDesc;

  public java.lang.String getSicDesc() {
    return SicDesc;
  }

  

  public void setSicDesc(java.lang.String SicDesc) {
    this.SicDesc = SicDesc;
    SicDesc__is_set = true;
  }
  
  /**
   * element  : Site of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Site__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Site","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Site__is_set = false;

  private java.lang.String Site;

  public java.lang.String getSite() {
    return Site;
  }

  

  public void setSite(java.lang.String Site) {
    this.Site = Site;
    Site__is_set = true;
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
   * element  : Tax_Exempt__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Tax_Exempt__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Tax_Exempt__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Tax_Exempt__c__is_set = false;

  private java.lang.Boolean Tax_Exempt__c;

  public java.lang.Boolean getTax_Exempt__c() {
    return Tax_Exempt__c;
  }

  

  public void setTax_Exempt__c(java.lang.Boolean Tax_Exempt__c) {
    this.Tax_Exempt__c = Tax_Exempt__c;
    Tax_Exempt__c__is_set = true;
  }
  
  /**
   * element  : TickerSymbol of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TickerSymbol__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TickerSymbol","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TickerSymbol__is_set = false;

  private java.lang.String TickerSymbol;

  public java.lang.String getTickerSymbol() {
    return TickerSymbol;
  }

  

  public void setTickerSymbol(java.lang.String TickerSymbol) {
    this.TickerSymbol = TickerSymbol;
    TickerSymbol__is_set = true;
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
   * element  : Total_Billed__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Billed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Billed__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Billed__c__is_set = false;

  private java.lang.Double Total_Billed__c;

  public java.lang.Double getTotal_Billed__c() {
    return Total_Billed__c;
  }

  

  public void setTotal_Billed__c(java.lang.Double Total_Billed__c) {
    this.Total_Billed__c = Total_Billed__c;
    Total_Billed__c__is_set = true;
  }
  
  /**
   * element  : Total_Invoices_Billed__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Invoices_Billed__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Invoices_Billed__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Invoices_Billed__c__is_set = false;

  private java.lang.Double Total_Invoices_Billed__c;

  public java.lang.Double getTotal_Invoices_Billed__c() {
    return Total_Invoices_Billed__c;
  }

  

  public void setTotal_Invoices_Billed__c(java.lang.Double Total_Invoices_Billed__c) {
    this.Total_Invoices_Billed__c = Total_Invoices_Billed__c;
    Total_Invoices_Billed__c__is_set = true;
  }
  
  /**
   * element  : Total_Open_Invoices__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Open_Invoices__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Open_Invoices__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Open_Invoices__c__is_set = false;

  private java.lang.Double Total_Open_Invoices__c;

  public java.lang.Double getTotal_Open_Invoices__c() {
    return Total_Open_Invoices__c;
  }

  

  public void setTotal_Open_Invoices__c(java.lang.Double Total_Open_Invoices__c) {
    this.Total_Open_Invoices__c = Total_Open_Invoices__c;
    Total_Open_Invoices__c__is_set = true;
  }
  
  /**
   * element  : Total_Open_Req_Headcount__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Total_Open_Req_Headcount__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Total_Open_Req_Headcount__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Total_Open_Req_Headcount__c__is_set = false;

  private java.lang.Double Total_Open_Req_Headcount__c;

  public java.lang.Double getTotal_Open_Req_Headcount__c() {
    return Total_Open_Req_Headcount__c;
  }

  

  public void setTotal_Open_Req_Headcount__c(java.lang.Double Total_Open_Req_Headcount__c) {
    this.Total_Open_Req_Headcount__c = Total_Open_Req_Headcount__c;
    Total_Open_Req_Headcount__c__is_set = true;
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
   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type__is_set = false;

  private java.lang.String Type;

  public java.lang.String getType() {
    return Type;
  }

  

  public void setType(java.lang.String Type) {
    this.Type = Type;
    Type__is_set = true;
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
   * element  : UpsellOpportunity__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UpsellOpportunity__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UpsellOpportunity__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UpsellOpportunity__c__is_set = false;

  private java.lang.String UpsellOpportunity__c;

  public java.lang.String getUpsellOpportunity__c() {
    return UpsellOpportunity__c;
  }

  

  public void setUpsellOpportunity__c(java.lang.String UpsellOpportunity__c) {
    this.UpsellOpportunity__c = UpsellOpportunity__c;
    UpsellOpportunity__c__is_set = true;
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
   * element  : VCSSAP__VCSEmail__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__VCSEmail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__VCSEmail__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean VCSSAP__VCSEmail__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmail__r;

  public com.sforce.soap.enterprise.QueryResult getVCSSAP__VCSEmail__r() {
    return VCSSAP__VCSEmail__r;
  }

  

  public void setVCSSAP__VCSEmail__r(com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmail__r) {
    this.VCSSAP__VCSEmail__r = VCSSAP__VCSEmail__r;
    VCSSAP__VCSEmail__r__is_set = true;
  }
  
  /**
   * element  : Website of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Website__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Website","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Website__is_set = false;

  private java.lang.String Website;

  public java.lang.String getWebsite() {
    return Website;
  }

  

  public void setWebsite(java.lang.String Website) {
    this.Website = Website;
    Website__is_set = true;
  }
  
  /**
   * element  : Which_Address__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Which_Address__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Which_Address__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Which_Address__c__is_set = false;

  private java.lang.String Which_Address__c;

  public java.lang.String getWhich_Address__c() {
    return Which_Address__c;
  }

  

  public void setWhich_Address__c(java.lang.String Which_Address__c) {
    this.Which_Address__c = Which_Address__c;
    Which_Address__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__dc3DisableDuplicateCheck__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__dc3DisableDuplicateCheck__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__dc3DisableDuplicateCheck__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean dupcheck__dc3DisableDuplicateCheck__c__is_set = false;

  private java.lang.Boolean dupcheck__dc3DisableDuplicateCheck__c;

  public java.lang.Boolean getDupcheck__dc3DisableDuplicateCheck__c() {
    return dupcheck__dc3DisableDuplicateCheck__c;
  }

  

  public void setDupcheck__dc3DisableDuplicateCheck__c(java.lang.Boolean dupcheck__dc3DisableDuplicateCheck__c) {
    this.dupcheck__dc3DisableDuplicateCheck__c = dupcheck__dc3DisableDuplicateCheck__c;
    dupcheck__dc3DisableDuplicateCheck__c__is_set = true;
  }
  
  /**
   * element  : dupcheck__dc3Index__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__dc3Index__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__dc3Index__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean dupcheck__dc3Index__c__is_set = false;

  private java.lang.String dupcheck__dc3Index__c;

  public java.lang.String getDupcheck__dc3Index__c() {
    return dupcheck__dc3Index__c;
  }

  

  public void setDupcheck__dc3Index__c(java.lang.String dupcheck__dc3Index__c) {
    this.dupcheck__dc3Index__c = dupcheck__dc3Index__c;
    dupcheck__dc3Index__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements__r() {
    return echosign_dev1__Agreements__r;
  }

  

  public void setEchosign_dev1__Agreements__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements__r) {
    this.echosign_dev1__Agreements__r = echosign_dev1__Agreements__r;
    echosign_dev1__Agreements__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Echosign_Recipients__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Echosign_Recipients__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Echosign_Recipients__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Echosign_Recipients__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Echosign_Recipients__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Echosign_Recipients__r() {
    return echosign_dev1__Echosign_Recipients__r;
  }

  

  public void setEchosign_dev1__Echosign_Recipients__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Echosign_Recipients__r) {
    this.echosign_dev1__Echosign_Recipients__r = echosign_dev1__Echosign_Recipients__r;
    echosign_dev1__Echosign_Recipients__r__is_set = true;
  }
  
  /**
   * element  : i__DaysSinceLastMail__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__DaysSinceLastMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__DaysSinceLastMail__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__DaysSinceLastMail__c__is_set = false;

  private java.lang.Double i__DaysSinceLastMail__c;

  public java.lang.Double getI__DaysSinceLastMail__c() {
    return i__DaysSinceLastMail__c;
  }

  

  public void setI__DaysSinceLastMail__c(java.lang.Double i__DaysSinceLastMail__c) {
    this.i__DaysSinceLastMail__c = i__DaysSinceLastMail__c;
    i__DaysSinceLastMail__c__is_set = true;
  }
  
  /**
   * element  : i__EA2Cs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__EA2Cs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EA2Cs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__EA2Cs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__EA2Cs__r;

  public com.sforce.soap.enterprise.QueryResult getI__EA2Cs__r() {
    return i__EA2Cs__r;
  }

  

  public void setI__EA2Cs__r(com.sforce.soap.enterprise.QueryResult i__EA2Cs__r) {
    this.i__EA2Cs__r = i__EA2Cs__r;
    i__EA2Cs__r__is_set = true;
  }
  
  /**
   * element  : i__LastInboundMail__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundMail__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean i__LastInboundMail__c__is_set = false;

  private java.lang.String i__LastInboundMail__c;

  public java.lang.String getI__LastInboundMail__c() {
    return i__LastInboundMail__c;
  }

  

  public void setI__LastInboundMail__c(java.lang.String i__LastInboundMail__c) {
    this.i__LastInboundMail__c = i__LastInboundMail__c;
    i__LastInboundMail__c__is_set = true;
  }
  
  /**
   * element  : i__LastInboundMail__r of type {urn:sobject.enterprise.soap.sforce.com}i__Email__c
   * java type: com.sforce.soap.enterprise.sobject.I__Email__c
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundMail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundMail__r","urn:sobject.enterprise.soap.sforce.com","i__Email__c",0,1,true);

  private boolean i__LastInboundMail__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.I__Email__c i__LastInboundMail__r;

  public com.sforce.soap.enterprise.sobject.I__Email__c getI__LastInboundMail__r() {
    return i__LastInboundMail__r;
  }

  

  public void setI__LastInboundMail__r(com.sforce.soap.enterprise.sobject.I__Email__c i__LastInboundMail__r) {
    this.i__LastInboundMail__r = i__LastInboundMail__r;
    i__LastInboundMail__r__is_set = true;
  }
  
  /**
   * element  : i__LastInboundSent__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundSent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundSent__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastInboundSent__c__is_set = false;

  private java.util.Calendar i__LastInboundSent__c;

  public java.util.Calendar getI__LastInboundSent__c() {
    return i__LastInboundSent__c;
  }

  

  public void setI__LastInboundSent__c(java.util.Calendar i__LastInboundSent__c) {
    this.i__LastInboundSent__c = i__LastInboundSent__c;
    i__LastInboundSent__c__is_set = true;
  }
  
  /**
   * element  : i__LastInboundTime__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastInboundTime__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastInboundTime__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastInboundTime__c__is_set = false;

  private java.util.Calendar i__LastInboundTime__c;

  public java.util.Calendar getI__LastInboundTime__c() {
    return i__LastInboundTime__c;
  }

  

  public void setI__LastInboundTime__c(java.util.Calendar i__LastInboundTime__c) {
    this.i__LastInboundTime__c = i__LastInboundTime__c;
    i__LastInboundTime__c__is_set = true;
  }
  
  /**
   * element  : i__LastMailSent__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMailSent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMailSent__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastMailSent__c__is_set = false;

  private java.util.Calendar i__LastMailSent__c;

  public java.util.Calendar getI__LastMailSent__c() {
    return i__LastMailSent__c;
  }

  

  public void setI__LastMailSent__c(java.util.Calendar i__LastMailSent__c) {
    this.i__LastMailSent__c = i__LastMailSent__c;
    i__LastMailSent__c__is_set = true;
  }
  
  /**
   * element  : i__LastMailTimeDelta__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMailTimeDelta__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMailTimeDelta__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean i__LastMailTimeDelta__c__is_set = false;

  private java.lang.Double i__LastMailTimeDelta__c;

  public java.lang.Double getI__LastMailTimeDelta__c() {
    return i__LastMailTimeDelta__c;
  }

  

  public void setI__LastMailTimeDelta__c(java.lang.Double i__LastMailTimeDelta__c) {
    this.i__LastMailTimeDelta__c = i__LastMailTimeDelta__c;
    i__LastMailTimeDelta__c__is_set = true;
  }
  
  /**
   * element  : i__LastMailTime__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMailTime__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMailTime__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastMailTime__c__is_set = false;

  private java.util.Calendar i__LastMailTime__c;

  public java.util.Calendar getI__LastMailTime__c() {
    return i__LastMailTime__c;
  }

  

  public void setI__LastMailTime__c(java.util.Calendar i__LastMailTime__c) {
    this.i__LastMailTime__c = i__LastMailTime__c;
    i__LastMailTime__c__is_set = true;
  }
  
  /**
   * element  : i__LastMail__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMail__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean i__LastMail__c__is_set = false;

  private java.lang.String i__LastMail__c;

  public java.lang.String getI__LastMail__c() {
    return i__LastMail__c;
  }

  

  public void setI__LastMail__c(java.lang.String i__LastMail__c) {
    this.i__LastMail__c = i__LastMail__c;
    i__LastMail__c__is_set = true;
  }
  
  /**
   * element  : i__LastMail__r of type {urn:sobject.enterprise.soap.sforce.com}i__Email__c
   * java type: com.sforce.soap.enterprise.sobject.I__Email__c
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastMail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastMail__r","urn:sobject.enterprise.soap.sforce.com","i__Email__c",0,1,true);

  private boolean i__LastMail__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.I__Email__c i__LastMail__r;

  public com.sforce.soap.enterprise.sobject.I__Email__c getI__LastMail__r() {
    return i__LastMail__r;
  }

  

  public void setI__LastMail__r(com.sforce.soap.enterprise.sobject.I__Email__c i__LastMail__r) {
    this.i__LastMail__r = i__LastMail__r;
    i__LastMail__r__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundMail__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundMail__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundMail__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean i__LastOutboundMail__c__is_set = false;

  private java.lang.String i__LastOutboundMail__c;

  public java.lang.String getI__LastOutboundMail__c() {
    return i__LastOutboundMail__c;
  }

  

  public void setI__LastOutboundMail__c(java.lang.String i__LastOutboundMail__c) {
    this.i__LastOutboundMail__c = i__LastOutboundMail__c;
    i__LastOutboundMail__c__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundMail__r of type {urn:sobject.enterprise.soap.sforce.com}i__Email__c
   * java type: com.sforce.soap.enterprise.sobject.I__Email__c
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundMail__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundMail__r","urn:sobject.enterprise.soap.sforce.com","i__Email__c",0,1,true);

  private boolean i__LastOutboundMail__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.I__Email__c i__LastOutboundMail__r;

  public com.sforce.soap.enterprise.sobject.I__Email__c getI__LastOutboundMail__r() {
    return i__LastOutboundMail__r;
  }

  

  public void setI__LastOutboundMail__r(com.sforce.soap.enterprise.sobject.I__Email__c i__LastOutboundMail__r) {
    this.i__LastOutboundMail__r = i__LastOutboundMail__r;
    i__LastOutboundMail__r__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundSent__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundSent__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundSent__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastOutboundSent__c__is_set = false;

  private java.util.Calendar i__LastOutboundSent__c;

  public java.util.Calendar getI__LastOutboundSent__c() {
    return i__LastOutboundSent__c;
  }

  

  public void setI__LastOutboundSent__c(java.util.Calendar i__LastOutboundSent__c) {
    this.i__LastOutboundSent__c = i__LastOutboundSent__c;
    i__LastOutboundSent__c__is_set = true;
  }
  
  /**
   * element  : i__LastOutboundTime__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo i__LastOutboundTime__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__LastOutboundTime__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean i__LastOutboundTime__c__is_set = false;

  private java.util.Calendar i__LastOutboundTime__c;

  public java.util.Calendar getI__LastOutboundTime__c() {
    return i__LastOutboundTime__c;
  }

  

  public void setI__LastOutboundTime__c(java.util.Calendar i__LastOutboundTime__c) {
    this.i__LastOutboundTime__c = i__LastOutboundTime__c;
    i__LastOutboundTime__c__is_set = true;
  }
  
  /**
   * element  : isEmailSend__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo isEmailSend__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","isEmailSend__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean isEmailSend__c__is_set = false;

  private java.lang.Boolean isEmailSend__c;

  public java.lang.Boolean getIsEmailSend__c() {
    return isEmailSend__c;
  }

  

  public void setIsEmailSend__c(java.lang.Boolean isEmailSend__c) {
    this.isEmailSend__c = isEmailSend__c;
    isEmailSend__c__is_set = true;
  }
  
  /**
   * element  : lat__c of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo lat__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","lat__c","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean lat__c__is_set = false;

  private java.lang.Double lat__c;

  public java.lang.Double getLat__c() {
    return lat__c;
  }

  

  public void setLat__c(java.lang.Double lat__c) {
    this.lat__c = lat__c;
    lat__c__is_set = true;
  }
  
  /**
   * element  : rh2__Describes__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Describes__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Describes__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Describes__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Describes__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Describes__r() {
    return rh2__Describes__r;
  }

  

  public void setRh2__Describes__r(com.sforce.soap.enterprise.QueryResult rh2__Describes__r) {
    this.rh2__Describes__r = rh2__Describes__r;
    rh2__Describes__r__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_Conditions__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_Conditions__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_Conditions__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Rollup_Conditions__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Rollup_Conditions__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Rollup_Conditions__r() {
    return rh2__Rollup_Conditions__r;
  }

  

  public void setRh2__Rollup_Conditions__r(com.sforce.soap.enterprise.QueryResult rh2__Rollup_Conditions__r) {
    this.rh2__Rollup_Conditions__r = rh2__Rollup_Conditions__r;
    rh2__Rollup_Conditions__r__is_set = true;
  }
  
  /**
   * element  : rh2__Rollup_Dummies__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo rh2__Rollup_Dummies__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","rh2__Rollup_Dummies__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean rh2__Rollup_Dummies__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult rh2__Rollup_Dummies__r;

  public com.sforce.soap.enterprise.QueryResult getRh2__Rollup_Dummies__r() {
    return rh2__Rollup_Dummies__r;
  }

  

  public void setRh2__Rollup_Dummies__r(com.sforce.soap.enterprise.QueryResult rh2__Rollup_Dummies__r) {
    this.rh2__Rollup_Dummies__r = rh2__Rollup_Dummies__r;
    rh2__Rollup_Dummies__r__is_set = true;
  }
  
  /**
   * element  : simplesurvey__Surveys__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo simplesurvey__Surveys__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","simplesurvey__Surveys__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean simplesurvey__Surveys__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult simplesurvey__Surveys__r;

  public com.sforce.soap.enterprise.QueryResult getSimplesurvey__Surveys__r() {
    return simplesurvey__Surveys__r;
  }

  

  public void setSimplesurvey__Surveys__r(com.sforce.soap.enterprise.QueryResult simplesurvey__Surveys__r) {
    this.simplesurvey__Surveys__r = simplesurvey__Surveys__r;
    simplesurvey__Surveys__r__is_set = true;
  }
  
  /**
   * element  : webm__Webmerge_Documents__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo webm__Webmerge_Documents__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","webm__Webmerge_Documents__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean webm__Webmerge_Documents__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult webm__Webmerge_Documents__r;

  public com.sforce.soap.enterprise.QueryResult getWebm__Webmerge_Documents__r() {
    return webm__Webmerge_Documents__r;
  }

  

  public void setWebm__Webmerge_Documents__r(com.sforce.soap.enterprise.QueryResult webm__Webmerge_Documents__r) {
    this.webm__Webmerge_Documents__r = webm__Webmerge_Documents__r;
    webm__Webmerge_Documents__r__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Account");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AP_Contact_Lookup__c__typeInfo, AP_Contact_Lookup__c, AP_Contact_Lookup__c__is_set);
    __typeMapper.writeObject(__out, AP_Contact_Lookup__r__typeInfo, AP_Contact_Lookup__r, AP_Contact_Lookup__r__is_set);
    __typeMapper.writeObject(__out, AccountContactRoles__typeInfo, AccountContactRoles, AccountContactRoles__is_set);
    __typeMapper.writeObject(__out, AccountPartnersFrom__typeInfo, AccountPartnersFrom, AccountPartnersFrom__is_set);
    __typeMapper.writeObject(__out, AccountPartnersTo__typeInfo, AccountPartnersTo, AccountPartnersTo__is_set);
    __typeMapper.writeString(__out, AccountSource__typeInfo, AccountSource, AccountSource__is_set);
    __typeMapper.writeObject(__out, Active_Assignments__c__typeInfo, Active_Assignments__c, Active_Assignments__c__is_set);
    __typeMapper.writeString(__out, Active__c__typeInfo, Active__c, Active__c__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, AcumenMerge__Robots__r__typeInfo, AcumenMerge__Robots__r, AcumenMerge__Robots__r__is_set);
    __typeMapper.writeString(__out, Address_ID__c__typeInfo, Address_ID__c, Address_ID__c__is_set);
    __typeMapper.writeObject(__out, Adjustments__r__typeInfo, Adjustments__r, Adjustments__r__is_set);
    __typeMapper.writeObject(__out, AnnualRevenue__typeInfo, AnnualRevenue, AnnualRevenue__is_set);
    __typeMapper.writeObject(__out, Assets__typeInfo, Assets, Assets__is_set);
    __typeMapper.writeObject(__out, Assignment_Credit_Load__c__typeInfo, Assignment_Credit_Load__c, Assignment_Credit_Load__c__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, Average_Days_to_Pay__c__typeInfo, Average_Days_to_Pay__c, Average_Days_to_Pay__c__is_set);
    __typeMapper.writeString(__out, BA_Client_Reference__c__typeInfo, BA_Client_Reference__c, BA_Client_Reference__c__is_set);
    __typeMapper.writeObject(__out, BillingAddress__typeInfo, BillingAddress, BillingAddress__is_set);
    __typeMapper.writeString(__out, BillingCity__typeInfo, BillingCity, BillingCity__is_set);
    __typeMapper.writeString(__out, BillingCountry__typeInfo, BillingCountry, BillingCountry__is_set);
    __typeMapper.writeString(__out, BillingGeocodeAccuracy__typeInfo, BillingGeocodeAccuracy, BillingGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, BillingLatitude__typeInfo, BillingLatitude, BillingLatitude__is_set);
    __typeMapper.writeObject(__out, BillingLongitude__typeInfo, BillingLongitude, BillingLongitude__is_set);
    __typeMapper.writeString(__out, BillingPostalCode__typeInfo, BillingPostalCode, BillingPostalCode__is_set);
    __typeMapper.writeString(__out, BillingState__typeInfo, BillingState, BillingState__is_set);
    __typeMapper.writeString(__out, BillingStreet__typeInfo, BillingStreet, BillingStreet__is_set);
    __typeMapper.writeObject(__out, CSA_Date__c__typeInfo, CSA_Date__c, CSA_Date__c__is_set);
    __typeMapper.writeString(__out, CSA_Obtained_By__c__typeInfo, CSA_Obtained_By__c, CSA_Obtained_By__c__is_set);
    __typeMapper.writeObject(__out, CSA_Obtained_By__r__typeInfo, CSA_Obtained_By__r, CSA_Obtained_By__r__is_set);
    __typeMapper.writeObject(__out, CSA_on_File__c__typeInfo, CSA_on_File__c, CSA_on_File__c__is_set);
    __typeMapper.writeObject(__out, CSO_Relationship_Established__c__typeInfo, CSO_Relationship_Established__c, CSO_Relationship_Established__c__is_set);
    __typeMapper.writeObject(__out, Cases__typeInfo, Cases, Cases__is_set);
    __typeMapper.writeObject(__out, Cases__r__typeInfo, Cases__r, Cases__r__is_set);
    __typeMapper.writeObject(__out, ChildAccounts__typeInfo, ChildAccounts, ChildAccounts__is_set);
    __typeMapper.writeString(__out, Collections_Handled_By__c__typeInfo, Collections_Handled_By__c, Collections_Handled_By__c__is_set);
    __typeMapper.writeObject(__out, Collections_Issue__c__typeInfo, Collections_Issue__c, Collections_Issue__c__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeObject(__out, Contacts__typeInfo, Contacts, Contacts__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, Contracts__typeInfo, Contracts, Contracts__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Credit_App_on_File__c__typeInfo, Credit_App_on_File__c, Credit_App_on_File__c__is_set);
    __typeMapper.writeObject(__out, Credit_Limit__c__typeInfo, Credit_Limit__c, Credit_Limit__c__is_set);
    __typeMapper.writeString(__out, Credit_Rating__c__typeInfo, Credit_Rating__c, Credit_Rating__c__is_set);
    __typeMapper.writeObject(__out, Current_AR_Credit_Load__c__typeInfo, Current_AR_Credit_Load__c, Current_AR_Credit_Load__c__is_set);
    __typeMapper.writeString(__out, CustomerPriority__c__typeInfo, CustomerPriority__c, CustomerPriority__c__is_set);
    __typeMapper.writeString(__out, Customer_Id__c__typeInfo, Customer_Id__c, Customer_Id__c__is_set);
    __typeMapper.writeObject(__out, Days_Since_Activity_or_Order__c__typeInfo, Days_Since_Activity_or_Order__c, Days_Since_Activity_or_Order__c__is_set);
    __typeMapper.writeObject(__out, Days_Since_Last_Activity__c__typeInfo, Days_Since_Last_Activity__c, Days_Since_Last_Activity__c__is_set);
    __typeMapper.writeObject(__out, Days_Since_Last_Order__c__typeInfo, Days_Since_Last_Order__c, Days_Since_Last_Order__c__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, Division__c__typeInfo, Division__c, Division__c__is_set);
    __typeMapper.writeObject(__out, Division__r__typeInfo, Division__r, Division__r__is_set);
    __typeMapper.writeObject(__out, Do_Not_Assign_To__r__typeInfo, Do_Not_Assign_To__r, Do_Not_Assign_To__r__is_set);
    __typeMapper.writeString(__out, Do_Not_Buy_Text__c__typeInfo, Do_Not_Buy_Text__c, Do_Not_Buy_Text__c__is_set);
    __typeMapper.writeObject(__out, Do_Not_Buy__c__typeInfo, Do_Not_Buy__c, Do_Not_Buy__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeObject(__out, Emails__typeInfo, Emails, Emails__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeObject(__out, Expenses__r__typeInfo, Expenses__r, Expenses__r__is_set);
    __typeMapper.writeString(__out, External_ID__c__typeInfo, External_ID__c, External_ID__c__is_set);
    __typeMapper.writeString(__out, FNA_Status__c__typeInfo, FNA_Status__c, FNA_Status__c__is_set);
    __typeMapper.writeObject(__out, Fast_Pay_Client__c__typeInfo, Fast_Pay_Client__c, Fast_Pay_Client__c__is_set);
    __typeMapper.writeString(__out, Fast_Pay_Details__c__typeInfo, Fast_Pay_Details__c, Fast_Pay_Details__c__is_set);
    __typeMapper.writeString(__out, Fax__typeInfo, Fax, Fax__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeObject(__out, Focus_Account__c__typeInfo, Focus_Account__c, Focus_Account__c__is_set);
    __typeMapper.writeObject(__out, General_Contractor_Required_On_Order__c__typeInfo, General_Contractor_Required_On_Order__c, General_Contractor_Required_On_Order__c__is_set);
    __typeMapper.writeObject(__out, Global_Accounts_Sharing__c__typeInfo, Global_Accounts_Sharing__c, Global_Accounts_Sharing__c__is_set);
    __typeMapper.writeObject(__out, Global_Sharing_Expiration_Date__c__typeInfo, Global_Sharing_Expiration_Date__c, Global_Sharing_Expiration_Date__c__is_set);
    __typeMapper.writeObject(__out, Global_Sharing_Start_Date__c__typeInfo, Global_Sharing_Start_Date__c, Global_Sharing_Start_Date__c__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, Industry__c__typeInfo, Industry__c, Industry__c__is_set);
    __typeMapper.writeObject(__out, Injury_Count__c__typeInfo, Injury_Count__c, Injury_Count__c__is_set);
    __typeMapper.writeObject(__out, Invoices_Outstanding__c__typeInfo, Invoices_Outstanding__c, Invoices_Outstanding__c__is_set);
    __typeMapper.writeObject(__out, Invoices__r__typeInfo, Invoices__r, Invoices__r__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsPartner__typeInfo, IsPartner, IsPartner__is_set);
    __typeMapper.writeString(__out, Jigsaw__typeInfo, Jigsaw, Jigsaw__is_set);
    __typeMapper.writeString(__out, JigsawCompanyId__typeInfo, JigsawCompanyId, JigsawCompanyId__is_set);
    __typeMapper.writeObject(__out, Known_Services_User__c__typeInfo, Known_Services_User__c, Known_Services_User__c__is_set);
    __typeMapper.writeString(__out, LTATW__LTATW_selectedAddress__c__typeInfo, LTATW__LTATW_selectedAddress__c, LTATW__LTATW_selectedAddress__c__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, Lon__c__typeInfo, Lon__c, Lon__c__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeObject(__out, MME__EmailMessages__r__typeInfo, MME__EmailMessages__r, MME__EmailMessages__r__is_set);
    __typeMapper.writeObject(__out, MasterRecord__typeInfo, MasterRecord, MasterRecord__is_set);
    __typeMapper.writeString(__out, MasterRecordId__typeInfo, MasterRecordId, MasterRecordId__is_set);
    __typeMapper.writeObject(__out, Max_Actual_End_Date__c__typeInfo, Max_Actual_End_Date__c, Max_Actual_End_Date__c__is_set);
    __typeMapper.writeObject(__out, Most_Recent_Assignment_End__c__typeInfo, Most_Recent_Assignment_End__c, Most_Recent_Assignment_End__c__is_set);
    __typeMapper.writeObject(__out, Most_Recent_Order_Date__c__typeInfo, Most_Recent_Order_Date__c, Most_Recent_Order_Date__c__is_set);
    __typeMapper.writeObject(__out, Most_Recent_Payment__c__typeInfo, Most_Recent_Payment__c, Most_Recent_Payment__c__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, NumberOfEmployees__typeInfo, NumberOfEmployees, NumberOfEmployees__is_set);
    __typeMapper.writeObject(__out, Number_of_Current_Orders__c__typeInfo, Number_of_Current_Orders__c, Number_of_Current_Orders__c__is_set);
    __typeMapper.writeObject(__out, Number_of_Orders__c__typeInfo, Number_of_Orders__c, Number_of_Orders__c__is_set);
    __typeMapper.writeObject(__out, NumberofLocations__c__typeInfo, NumberofLocations__c, NumberofLocations__c__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeObject(__out, Opportunities__typeInfo, Opportunities, Opportunities__is_set);
    __typeMapper.writeObject(__out, OpportunityPartnersTo__typeInfo, OpportunityPartnersTo, OpportunityPartnersTo__is_set);
    __typeMapper.writeObject(__out, Orders_Placed__c__typeInfo, Orders_Placed__c, Orders_Placed__c__is_set);
    __typeMapper.writeObject(__out, Orders__r__typeInfo, Orders__r, Orders__r__is_set);
    __typeMapper.writeObject(__out, Overtime_Multiplier__c__typeInfo, Overtime_Multiplier__c, Overtime_Multiplier__c__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeString(__out, Ownership__typeInfo, Ownership, Ownership__is_set);
    __typeMapper.writeObject(__out, PO_Override__c__typeInfo, PO_Override__c, PO_Override__c__is_set);
    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);
    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);
    __typeMapper.writeObject(__out, PartnersFrom__typeInfo, PartnersFrom, PartnersFrom__is_set);
    __typeMapper.writeObject(__out, PartnersTo__typeInfo, PartnersTo, PartnersTo__is_set);
    __typeMapper.writeObject(__out, Personas__typeInfo, Personas, Personas__is_set);
    __typeMapper.writeString(__out, Phone__typeInfo, Phone, Phone__is_set);
    __typeMapper.writeString(__out, PhotoUrl__typeInfo, PhotoUrl, PhotoUrl__is_set);
    __typeMapper.writeObject(__out, Posts__typeInfo, Posts, Posts__is_set);
    __typeMapper.writeString(__out, Pre_Pay_Client_Text__c__typeInfo, Pre_Pay_Client_Text__c, Pre_Pay_Client_Text__c__is_set);
    __typeMapper.writeObject(__out, Pre_Pay_Client__c__typeInfo, Pre_Pay_Client__c, Pre_Pay_Client__c__is_set);
    __typeMapper.writeString(__out, Pre_Pay_Method__c__typeInfo, Pre_Pay_Method__c, Pre_Pay_Method__c__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeObject(__out, Proxy__r__typeInfo, Proxy__r, Proxy__r__is_set);
    __typeMapper.writeString(__out, Rating__typeInfo, Rating, Rating__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeObject(__out, Remaining_Credit__c__typeInfo, Remaining_Credit__c, Remaining_Credit__c__is_set);
    __typeMapper.writeString(__out, Requires_PO_on_Orders__c__typeInfo, Requires_PO_on_Orders__c, Requires_PO_on_Orders__c__is_set);
    __typeMapper.writeObject(__out, Revenues__r__typeInfo, Revenues__r, Revenues__r__is_set);
    __typeMapper.writeString(__out, SF_Account_ID__c__typeInfo, SF_Account_ID__c, SF_Account_ID__c__is_set);
    __typeMapper.writeObject(__out, SLAExpirationDate__c__typeInfo, SLAExpirationDate__c, SLAExpirationDate__c__is_set);
    __typeMapper.writeString(__out, SLASerialNumber__c__typeInfo, SLASerialNumber__c, SLASerialNumber__c__is_set);
    __typeMapper.writeString(__out, SLA__c__typeInfo, SLA__c, SLA__c__is_set);
    __typeMapper.writeObject(__out, Send_Notice_of_Furnishing__c__typeInfo, Send_Notice_of_Furnishing__c, Send_Notice_of_Furnishing__c__is_set);
    __typeMapper.writeString(__out, Send_to_Contact__c__typeInfo, Send_to_Contact__c, Send_to_Contact__c__is_set);
    __typeMapper.writeObject(__out, Send_to_Contact__r__typeInfo, Send_to_Contact__r, Send_to_Contact__r__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeObject(__out, ShippingAddress__typeInfo, ShippingAddress, ShippingAddress__is_set);
    __typeMapper.writeString(__out, ShippingCity__typeInfo, ShippingCity, ShippingCity__is_set);
    __typeMapper.writeString(__out, ShippingCountry__typeInfo, ShippingCountry, ShippingCountry__is_set);
    __typeMapper.writeString(__out, ShippingGeocodeAccuracy__typeInfo, ShippingGeocodeAccuracy, ShippingGeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, ShippingLatitude__typeInfo, ShippingLatitude, ShippingLatitude__is_set);
    __typeMapper.writeObject(__out, ShippingLongitude__typeInfo, ShippingLongitude, ShippingLongitude__is_set);
    __typeMapper.writeString(__out, ShippingPostalCode__typeInfo, ShippingPostalCode, ShippingPostalCode__is_set);
    __typeMapper.writeString(__out, ShippingState__typeInfo, ShippingState, ShippingState__is_set);
    __typeMapper.writeString(__out, ShippingStreet__typeInfo, ShippingStreet, ShippingStreet__is_set);
    __typeMapper.writeString(__out, Sic__typeInfo, Sic, Sic__is_set);
    __typeMapper.writeString(__out, SicDesc__typeInfo, SicDesc, SicDesc__is_set);
    __typeMapper.writeString(__out, Site__typeInfo, Site, Site__is_set);
    __typeMapper.writeString(__out, Special_Billing_Instructions__c__typeInfo, Special_Billing_Instructions__c, Special_Billing_Instructions__c__is_set);
    __typeMapper.writeString(__out, Special_Requirements__c__typeInfo, Special_Requirements__c, Special_Requirements__c__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeObject(__out, Tax_Exempt__c__typeInfo, Tax_Exempt__c, Tax_Exempt__c__is_set);
    __typeMapper.writeString(__out, TickerSymbol__typeInfo, TickerSymbol, TickerSymbol__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, Total_Billed__c__typeInfo, Total_Billed__c, Total_Billed__c__is_set);
    __typeMapper.writeObject(__out, Total_Invoices_Billed__c__typeInfo, Total_Invoices_Billed__c, Total_Invoices_Billed__c__is_set);
    __typeMapper.writeObject(__out, Total_Open_Invoices__c__typeInfo, Total_Open_Invoices__c, Total_Open_Invoices__c__is_set);
    __typeMapper.writeObject(__out, Total_Open_Req_Headcount__c__typeInfo, Total_Open_Req_Headcount__c, Total_Open_Req_Headcount__c__is_set);
    __typeMapper.writeObject(__out, Total_Req_Headcount_Credit_Load__c__typeInfo, Total_Req_Headcount_Credit_Load__c, Total_Req_Headcount_Credit_Load__c__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeObject(__out, Unverified_Time__r__typeInfo, Unverified_Time__r, Unverified_Time__r__is_set);
    __typeMapper.writeString(__out, UpsellOpportunity__c__typeInfo, UpsellOpportunity__c, UpsellOpportunity__c__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, VCSSAP__VCSEmail__r__typeInfo, VCSSAP__VCSEmail__r, VCSSAP__VCSEmail__r__is_set);
    __typeMapper.writeString(__out, Website__typeInfo, Website, Website__is_set);
    __typeMapper.writeString(__out, Which_Address__c__typeInfo, Which_Address__c, Which_Address__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__dc3DisableDuplicateCheck__c__typeInfo, dupcheck__dc3DisableDuplicateCheck__c, dupcheck__dc3DisableDuplicateCheck__c__is_set);
    __typeMapper.writeString(__out, dupcheck__dc3Index__c__typeInfo, dupcheck__dc3Index__c, dupcheck__dc3Index__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements__r__typeInfo, echosign_dev1__Agreements__r, echosign_dev1__Agreements__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Echosign_Recipients__r__typeInfo, echosign_dev1__Echosign_Recipients__r, echosign_dev1__Echosign_Recipients__r__is_set);
    __typeMapper.writeObject(__out, i__DaysSinceLastMail__c__typeInfo, i__DaysSinceLastMail__c, i__DaysSinceLastMail__c__is_set);
    __typeMapper.writeObject(__out, i__EA2Cs__r__typeInfo, i__EA2Cs__r, i__EA2Cs__r__is_set);
    __typeMapper.writeString(__out, i__LastInboundMail__c__typeInfo, i__LastInboundMail__c, i__LastInboundMail__c__is_set);
    __typeMapper.writeObject(__out, i__LastInboundMail__r__typeInfo, i__LastInboundMail__r, i__LastInboundMail__r__is_set);
    __typeMapper.writeObject(__out, i__LastInboundSent__c__typeInfo, i__LastInboundSent__c, i__LastInboundSent__c__is_set);
    __typeMapper.writeObject(__out, i__LastInboundTime__c__typeInfo, i__LastInboundTime__c, i__LastInboundTime__c__is_set);
    __typeMapper.writeObject(__out, i__LastMailSent__c__typeInfo, i__LastMailSent__c, i__LastMailSent__c__is_set);
    __typeMapper.writeObject(__out, i__LastMailTimeDelta__c__typeInfo, i__LastMailTimeDelta__c, i__LastMailTimeDelta__c__is_set);
    __typeMapper.writeObject(__out, i__LastMailTime__c__typeInfo, i__LastMailTime__c, i__LastMailTime__c__is_set);
    __typeMapper.writeString(__out, i__LastMail__c__typeInfo, i__LastMail__c, i__LastMail__c__is_set);
    __typeMapper.writeObject(__out, i__LastMail__r__typeInfo, i__LastMail__r, i__LastMail__r__is_set);
    __typeMapper.writeString(__out, i__LastOutboundMail__c__typeInfo, i__LastOutboundMail__c, i__LastOutboundMail__c__is_set);
    __typeMapper.writeObject(__out, i__LastOutboundMail__r__typeInfo, i__LastOutboundMail__r, i__LastOutboundMail__r__is_set);
    __typeMapper.writeObject(__out, i__LastOutboundSent__c__typeInfo, i__LastOutboundSent__c, i__LastOutboundSent__c__is_set);
    __typeMapper.writeObject(__out, i__LastOutboundTime__c__typeInfo, i__LastOutboundTime__c, i__LastOutboundTime__c__is_set);
    __typeMapper.writeObject(__out, isEmailSend__c__typeInfo, isEmailSend__c, isEmailSend__c__is_set);
    __typeMapper.writeObject(__out, lat__c__typeInfo, lat__c, lat__c__is_set);
    __typeMapper.writeObject(__out, rh2__Describes__r__typeInfo, rh2__Describes__r, rh2__Describes__r__is_set);
    __typeMapper.writeObject(__out, rh2__Rollup_Conditions__r__typeInfo, rh2__Rollup_Conditions__r, rh2__Rollup_Conditions__r__is_set);
    __typeMapper.writeObject(__out, rh2__Rollup_Dummies__r__typeInfo, rh2__Rollup_Dummies__r, rh2__Rollup_Dummies__r__is_set);
    __typeMapper.writeObject(__out, simplesurvey__Surveys__r__typeInfo, simplesurvey__Surveys__r, simplesurvey__Surveys__r__is_set);
    __typeMapper.writeObject(__out, webm__Webmerge_Documents__r__typeInfo, webm__Webmerge_Documents__r, webm__Webmerge_Documents__r__is_set);
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
    if (__typeMapper.isElement(__in, AP_Contact_Lookup__c__typeInfo)) {
      setAP_Contact_Lookup__c((java.lang.String)__typeMapper.readString(__in, AP_Contact_Lookup__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AP_Contact_Lookup__r__typeInfo)) {
      setAP_Contact_Lookup__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, AP_Contact_Lookup__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountContactRoles__typeInfo)) {
      setAccountContactRoles((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AccountContactRoles__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountPartnersFrom__typeInfo)) {
      setAccountPartnersFrom((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AccountPartnersFrom__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountPartnersTo__typeInfo)) {
      setAccountPartnersTo((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AccountPartnersTo__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountSource__typeInfo)) {
      setAccountSource((java.lang.String)__typeMapper.readString(__in, AccountSource__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Active_Assignments__c__typeInfo)) {
      setActive_Assignments__c((java.lang.Double)__typeMapper.readObject(__in, Active_Assignments__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Active__c__typeInfo)) {
      setActive__c((java.lang.String)__typeMapper.readString(__in, Active__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AcumenMerge__Robots__r__typeInfo)) {
      setAcumenMerge__Robots__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AcumenMerge__Robots__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address_ID__c__typeInfo)) {
      setAddress_ID__c((java.lang.String)__typeMapper.readString(__in, Address_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Adjustments__r__typeInfo)) {
      setAdjustments__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Adjustments__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AnnualRevenue__typeInfo)) {
      setAnnualRevenue((java.lang.Double)__typeMapper.readObject(__in, AnnualRevenue__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assets__typeInfo)) {
      setAssets((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assets__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Assignment_Credit_Load__c__typeInfo)) {
      setAssignment_Credit_Load__c((java.lang.Double)__typeMapper.readObject(__in, Assignment_Credit_Load__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, BA_Client_Reference__c__typeInfo)) {
      setBA_Client_Reference__c((java.lang.String)__typeMapper.readString(__in, BA_Client_Reference__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, CSA_Date__c__typeInfo)) {
      setCSA_Date__c((java.util.Calendar)__typeMapper.readObject(__in, CSA_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSA_Obtained_By__c__typeInfo)) {
      setCSA_Obtained_By__c((java.lang.String)__typeMapper.readString(__in, CSA_Obtained_By__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSA_Obtained_By__r__typeInfo)) {
      setCSA_Obtained_By__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CSA_Obtained_By__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSA_on_File__c__typeInfo)) {
      setCSA_on_File__c((java.lang.Boolean)__typeMapper.readObject(__in, CSA_on_File__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CSO_Relationship_Established__c__typeInfo)) {
      setCSO_Relationship_Established__c((java.lang.Boolean)__typeMapper.readObject(__in, CSO_Relationship_Established__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cases__typeInfo)) {
      setCases((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Cases__r__typeInfo)) {
      setCases__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ChildAccounts__typeInfo)) {
      setChildAccounts((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ChildAccounts__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Collections_Handled_By__c__typeInfo)) {
      setCollections_Handled_By__c((java.lang.String)__typeMapper.readString(__in, Collections_Handled_By__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Collections_Issue__c__typeInfo)) {
      setCollections_Issue__c((java.lang.Boolean)__typeMapper.readObject(__in, Collections_Issue__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contacts__typeInfo)) {
      setContacts((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Contacts__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Contracts__typeInfo)) {
      setContracts((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Contracts__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Credit_App_on_File__c__typeInfo)) {
      setCredit_App_on_File__c((java.lang.Boolean)__typeMapper.readObject(__in, Credit_App_on_File__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Current_AR_Credit_Load__c__typeInfo)) {
      setCurrent_AR_Credit_Load__c((java.lang.Double)__typeMapper.readObject(__in, Current_AR_Credit_Load__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomerPriority__c__typeInfo)) {
      setCustomerPriority__c((java.lang.String)__typeMapper.readString(__in, CustomerPriority__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Customer_Id__c__typeInfo)) {
      setCustomer_Id__c((java.lang.String)__typeMapper.readString(__in, Customer_Id__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Days_Since_Activity_or_Order__c__typeInfo)) {
      setDays_Since_Activity_or_Order__c((java.lang.Double)__typeMapper.readObject(__in, Days_Since_Activity_or_Order__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Days_Since_Last_Activity__c__typeInfo)) {
      setDays_Since_Last_Activity__c((java.lang.Double)__typeMapper.readObject(__in, Days_Since_Last_Activity__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Days_Since_Last_Order__c__typeInfo)) {
      setDays_Since_Last_Order__c((java.lang.Double)__typeMapper.readObject(__in, Days_Since_Last_Order__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Do_Not_Buy_Text__c__typeInfo)) {
      setDo_Not_Buy_Text__c((java.lang.String)__typeMapper.readString(__in, Do_Not_Buy_Text__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Do_Not_Buy__c__typeInfo)) {
      setDo_Not_Buy__c((java.lang.Boolean)__typeMapper.readObject(__in, Do_Not_Buy__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Events__typeInfo)) {
      setEvents((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Events__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Expenses__r__typeInfo)) {
      setExpenses__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Expenses__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, External_ID__c__typeInfo)) {
      setExternal_ID__c((java.lang.String)__typeMapper.readString(__in, External_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FNA_Status__c__typeInfo)) {
      setFNA_Status__c((java.lang.String)__typeMapper.readString(__in, FNA_Status__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fast_Pay_Client__c__typeInfo)) {
      setFast_Pay_Client__c((java.lang.Boolean)__typeMapper.readObject(__in, Fast_Pay_Client__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fast_Pay_Details__c__typeInfo)) {
      setFast_Pay_Details__c((java.lang.String)__typeMapper.readString(__in, Fast_Pay_Details__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Focus_Account__c__typeInfo)) {
      setFocus_Account__c((java.lang.Boolean)__typeMapper.readObject(__in, Focus_Account__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, General_Contractor_Required_On_Order__c__typeInfo)) {
      setGeneral_Contractor_Required_On_Order__c((java.lang.Boolean)__typeMapper.readObject(__in, General_Contractor_Required_On_Order__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Global_Accounts_Sharing__c__typeInfo)) {
      setGlobal_Accounts_Sharing__c((java.lang.Boolean)__typeMapper.readObject(__in, Global_Accounts_Sharing__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Global_Sharing_Expiration_Date__c__typeInfo)) {
      setGlobal_Sharing_Expiration_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Global_Sharing_Expiration_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Global_Sharing_Start_Date__c__typeInfo)) {
      setGlobal_Sharing_Start_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Global_Sharing_Start_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Industry__c__typeInfo)) {
      setIndustry__c((java.lang.String)__typeMapper.readString(__in, Industry__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Injury_Count__c__typeInfo)) {
      setInjury_Count__c((java.lang.Double)__typeMapper.readObject(__in, Injury_Count__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Invoices_Outstanding__c__typeInfo)) {
      setInvoices_Outstanding__c((java.lang.Double)__typeMapper.readObject(__in, Invoices_Outstanding__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, IsPartner__typeInfo)) {
      setIsPartner((java.lang.Boolean)__typeMapper.readObject(__in, IsPartner__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Jigsaw__typeInfo)) {
      setJigsaw((java.lang.String)__typeMapper.readString(__in, Jigsaw__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JigsawCompanyId__typeInfo)) {
      setJigsawCompanyId((java.lang.String)__typeMapper.readString(__in, JigsawCompanyId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Known_Services_User__c__typeInfo)) {
      setKnown_Services_User__c((java.lang.Boolean)__typeMapper.readObject(__in, Known_Services_User__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LTATW__LTATW_selectedAddress__c__typeInfo)) {
      setLTATW__LTATW_selectedAddress__c((java.lang.String)__typeMapper.readString(__in, LTATW__LTATW_selectedAddress__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Lon__c__typeInfo)) {
      setLon__c((java.lang.Double)__typeMapper.readObject(__in, Lon__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LookedUpFromActivities__typeInfo)) {
      setLookedUpFromActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, LookedUpFromActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MME__EmailMessages__r__typeInfo)) {
      setMME__EmailMessages__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, MME__EmailMessages__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MasterRecord__typeInfo)) {
      setMasterRecord((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, MasterRecord__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MasterRecordId__typeInfo)) {
      setMasterRecordId((java.lang.String)__typeMapper.readString(__in, MasterRecordId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Max_Actual_End_Date__c__typeInfo)) {
      setMax_Actual_End_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Max_Actual_End_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Most_Recent_Assignment_End__c__typeInfo)) {
      setMost_Recent_Assignment_End__c((java.util.Calendar)__typeMapper.readObject(__in, Most_Recent_Assignment_End__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Most_Recent_Order_Date__c__typeInfo)) {
      setMost_Recent_Order_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Most_Recent_Order_Date__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Most_Recent_Payment__c__typeInfo)) {
      setMost_Recent_Payment__c((java.util.Calendar)__typeMapper.readObject(__in, Most_Recent_Payment__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, NumberOfEmployees__typeInfo)) {
      setNumberOfEmployees((java.lang.Integer)__typeMapper.readObject(__in, NumberOfEmployees__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Number_of_Current_Orders__c__typeInfo)) {
      setNumber_of_Current_Orders__c((java.lang.Double)__typeMapper.readObject(__in, Number_of_Current_Orders__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Number_of_Orders__c__typeInfo)) {
      setNumber_of_Orders__c((java.lang.Double)__typeMapper.readObject(__in, Number_of_Orders__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberofLocations__c__typeInfo)) {
      setNumberofLocations__c((java.lang.Double)__typeMapper.readObject(__in, NumberofLocations__c__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, OpportunityPartnersTo__typeInfo)) {
      setOpportunityPartnersTo((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpportunityPartnersTo__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders_Placed__c__typeInfo)) {
      setOrders_Placed__c((java.lang.Double)__typeMapper.readObject(__in, Orders_Placed__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Orders__r__typeInfo)) {
      setOrders__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Orders__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Overtime_Multiplier__c__typeInfo)) {
      setOvertime_Multiplier__c((java.lang.Double)__typeMapper.readObject(__in, Overtime_Multiplier__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Owner__typeInfo)) {
      setOwner((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, Owner__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
      setOwnerId((java.lang.String)__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Ownership__typeInfo)) {
      setOwnership((java.lang.String)__typeMapper.readString(__in, Ownership__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PO_Override__c__typeInfo)) {
      setPO_Override__c((java.lang.Boolean)__typeMapper.readObject(__in, PO_Override__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Parent__typeInfo)) {
      setParent((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {
      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PartnersFrom__typeInfo)) {
      setPartnersFrom((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PartnersFrom__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PartnersTo__typeInfo)) {
      setPartnersTo((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PartnersTo__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Personas__typeInfo)) {
      setPersonas((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Personas__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone__typeInfo)) {
      setPhone((java.lang.String)__typeMapper.readString(__in, Phone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PhotoUrl__typeInfo)) {
      setPhotoUrl((java.lang.String)__typeMapper.readString(__in, PhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Posts__typeInfo)) {
      setPosts((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Posts__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pre_Pay_Client_Text__c__typeInfo)) {
      setPre_Pay_Client_Text__c((java.lang.String)__typeMapper.readString(__in, Pre_Pay_Client_Text__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pre_Pay_Client__c__typeInfo)) {
      setPre_Pay_Client__c((java.lang.Boolean)__typeMapper.readObject(__in, Pre_Pay_Client__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Pre_Pay_Method__c__typeInfo)) {
      setPre_Pay_Method__c((java.lang.String)__typeMapper.readString(__in, Pre_Pay_Method__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Rating__typeInfo)) {
      setRating((java.lang.String)__typeMapper.readString(__in, Rating__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Remaining_Credit__c__typeInfo)) {
      setRemaining_Credit__c((java.lang.Double)__typeMapper.readObject(__in, Remaining_Credit__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Requires_PO_on_Orders__c__typeInfo)) {
      setRequires_PO_on_Orders__c((java.lang.String)__typeMapper.readString(__in, Requires_PO_on_Orders__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Revenues__r__typeInfo)) {
      setRevenues__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Revenues__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SF_Account_ID__c__typeInfo)) {
      setSF_Account_ID__c((java.lang.String)__typeMapper.readString(__in, SF_Account_ID__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SLAExpirationDate__c__typeInfo)) {
      setSLAExpirationDate__c((java.util.Calendar)__typeMapper.readObject(__in, SLAExpirationDate__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SLASerialNumber__c__typeInfo)) {
      setSLASerialNumber__c((java.lang.String)__typeMapper.readString(__in, SLASerialNumber__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SLA__c__typeInfo)) {
      setSLA__c((java.lang.String)__typeMapper.readString(__in, SLA__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Send_Notice_of_Furnishing__c__typeInfo)) {
      setSend_Notice_of_Furnishing__c((java.lang.Boolean)__typeMapper.readObject(__in, Send_Notice_of_Furnishing__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Send_to_Contact__c__typeInfo)) {
      setSend_to_Contact__c((java.lang.String)__typeMapper.readString(__in, Send_to_Contact__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Send_to_Contact__r__typeInfo)) {
      setSend_to_Contact__r((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, Send_to_Contact__r__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Sic__typeInfo)) {
      setSic((java.lang.String)__typeMapper.readString(__in, Sic__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SicDesc__typeInfo)) {
      setSicDesc((java.lang.String)__typeMapper.readString(__in, SicDesc__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Site__typeInfo)) {
      setSite((java.lang.String)__typeMapper.readString(__in, Site__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Tax_Exempt__c__typeInfo)) {
      setTax_Exempt__c((java.lang.Boolean)__typeMapper.readObject(__in, Tax_Exempt__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TickerSymbol__typeInfo)) {
      setTickerSymbol((java.lang.String)__typeMapper.readString(__in, TickerSymbol__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Billed__c__typeInfo)) {
      setTotal_Billed__c((java.lang.Double)__typeMapper.readObject(__in, Total_Billed__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Invoices_Billed__c__typeInfo)) {
      setTotal_Invoices_Billed__c((java.lang.Double)__typeMapper.readObject(__in, Total_Invoices_Billed__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Open_Invoices__c__typeInfo)) {
      setTotal_Open_Invoices__c((java.lang.Double)__typeMapper.readObject(__in, Total_Open_Invoices__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Open_Req_Headcount__c__typeInfo)) {
      setTotal_Open_Req_Headcount__c((java.lang.Double)__typeMapper.readObject(__in, Total_Open_Req_Headcount__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Total_Req_Headcount_Credit_Load__c__typeInfo)) {
      setTotal_Req_Headcount_Credit_Load__c((java.lang.Double)__typeMapper.readObject(__in, Total_Req_Headcount_Credit_Load__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Unverified_Time__r__typeInfo)) {
      setUnverified_Time__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Unverified_Time__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UpsellOpportunity__c__typeInfo)) {
      setUpsellOpportunity__c((java.lang.String)__typeMapper.readString(__in, UpsellOpportunity__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__VCSEmail__r__typeInfo)) {
      setVCSSAP__VCSEmail__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VCSSAP__VCSEmail__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Website__typeInfo)) {
      setWebsite((java.lang.String)__typeMapper.readString(__in, Website__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Which_Address__c__typeInfo)) {
      setWhich_Address__c((java.lang.String)__typeMapper.readString(__in, Which_Address__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__dc3DisableDuplicateCheck__c__typeInfo)) {
      setDupcheck__dc3DisableDuplicateCheck__c((java.lang.Boolean)__typeMapper.readObject(__in, dupcheck__dc3DisableDuplicateCheck__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, dupcheck__dc3Index__c__typeInfo)) {
      setDupcheck__dc3Index__c((java.lang.String)__typeMapper.readString(__in, dupcheck__dc3Index__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements__r__typeInfo)) {
      setEchosign_dev1__Agreements__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Echosign_Recipients__r__typeInfo)) {
      setEchosign_dev1__Echosign_Recipients__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Echosign_Recipients__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__DaysSinceLastMail__c__typeInfo)) {
      setI__DaysSinceLastMail__c((java.lang.Double)__typeMapper.readObject(__in, i__DaysSinceLastMail__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EA2Cs__r__typeInfo)) {
      setI__EA2Cs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__EA2Cs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundMail__c__typeInfo)) {
      setI__LastInboundMail__c((java.lang.String)__typeMapper.readString(__in, i__LastInboundMail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundMail__r__typeInfo)) {
      setI__LastInboundMail__r((com.sforce.soap.enterprise.sobject.I__Email__c)__typeMapper.readObject(__in, i__LastInboundMail__r__typeInfo, com.sforce.soap.enterprise.sobject.I__Email__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundSent__c__typeInfo)) {
      setI__LastInboundSent__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastInboundSent__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastInboundTime__c__typeInfo)) {
      setI__LastInboundTime__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastInboundTime__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMailSent__c__typeInfo)) {
      setI__LastMailSent__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastMailSent__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMailTimeDelta__c__typeInfo)) {
      setI__LastMailTimeDelta__c((java.lang.Double)__typeMapper.readObject(__in, i__LastMailTimeDelta__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMailTime__c__typeInfo)) {
      setI__LastMailTime__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastMailTime__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMail__c__typeInfo)) {
      setI__LastMail__c((java.lang.String)__typeMapper.readString(__in, i__LastMail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastMail__r__typeInfo)) {
      setI__LastMail__r((com.sforce.soap.enterprise.sobject.I__Email__c)__typeMapper.readObject(__in, i__LastMail__r__typeInfo, com.sforce.soap.enterprise.sobject.I__Email__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundMail__c__typeInfo)) {
      setI__LastOutboundMail__c((java.lang.String)__typeMapper.readString(__in, i__LastOutboundMail__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundMail__r__typeInfo)) {
      setI__LastOutboundMail__r((com.sforce.soap.enterprise.sobject.I__Email__c)__typeMapper.readObject(__in, i__LastOutboundMail__r__typeInfo, com.sforce.soap.enterprise.sobject.I__Email__c.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundSent__c__typeInfo)) {
      setI__LastOutboundSent__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastOutboundSent__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__LastOutboundTime__c__typeInfo)) {
      setI__LastOutboundTime__c((java.util.Calendar)__typeMapper.readObject(__in, i__LastOutboundTime__c__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, isEmailSend__c__typeInfo)) {
      setIsEmailSend__c((java.lang.Boolean)__typeMapper.readObject(__in, isEmailSend__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, lat__c__typeInfo)) {
      setLat__c((java.lang.Double)__typeMapper.readObject(__in, lat__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Describes__r__typeInfo)) {
      setRh2__Describes__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Describes__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_Conditions__r__typeInfo)) {
      setRh2__Rollup_Conditions__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Rollup_Conditions__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, rh2__Rollup_Dummies__r__typeInfo)) {
      setRh2__Rollup_Dummies__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, rh2__Rollup_Dummies__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, simplesurvey__Surveys__r__typeInfo)) {
      setSimplesurvey__Surveys__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, simplesurvey__Surveys__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, webm__Webmerge_Documents__r__typeInfo)) {
      setWebm__Webmerge_Documents__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, webm__Webmerge_Documents__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Account ");
    sb.append(super.toString());
    sb.append(" AP_Contact_Lookup__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AP_Contact_Lookup__c)+"'\n");
    sb.append(" AP_Contact_Lookup__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AP_Contact_Lookup__r)+"'\n");
    sb.append(" AccountContactRoles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountContactRoles)+"'\n");
    sb.append(" AccountPartnersFrom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountPartnersFrom)+"'\n");
    sb.append(" AccountPartnersTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountPartnersTo)+"'\n");
    sb.append(" AccountSource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountSource)+"'\n");
    sb.append(" Active_Assignments__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Active_Assignments__c)+"'\n");
    sb.append(" Active__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Active__c)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" AcumenMerge__Robots__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AcumenMerge__Robots__r)+"'\n");
    sb.append(" Address_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address_ID__c)+"'\n");
    sb.append(" Adjustments__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Adjustments__r)+"'\n");
    sb.append(" AnnualRevenue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AnnualRevenue)+"'\n");
    sb.append(" Assets=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assets)+"'\n");
    sb.append(" Assignment_Credit_Load__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignment_Credit_Load__c)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Average_Days_to_Pay__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Average_Days_to_Pay__c)+"'\n");
    sb.append(" BA_Client_Reference__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BA_Client_Reference__c)+"'\n");
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
    sb.append(" CSA_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_Date__c)+"'\n");
    sb.append(" CSA_Obtained_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_Obtained_By__c)+"'\n");
    sb.append(" CSA_Obtained_By__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_Obtained_By__r)+"'\n");
    sb.append(" CSA_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSA_on_File__c)+"'\n");
    sb.append(" CSO_Relationship_Established__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CSO_Relationship_Established__c)+"'\n");
    sb.append(" Cases=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases)+"'\n");
    sb.append(" Cases__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases__r)+"'\n");
    sb.append(" ChildAccounts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ChildAccounts)+"'\n");
    sb.append(" Collections_Handled_By__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Collections_Handled_By__c)+"'\n");
    sb.append(" Collections_Issue__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Collections_Issue__c)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Contacts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contacts)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" Contracts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Contracts)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Credit_App_on_File__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_App_on_File__c)+"'\n");
    sb.append(" Credit_Limit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Limit__c)+"'\n");
    sb.append(" Credit_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Rating__c)+"'\n");
    sb.append(" Current_AR_Credit_Load__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Current_AR_Credit_Load__c)+"'\n");
    sb.append(" CustomerPriority__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomerPriority__c)+"'\n");
    sb.append(" Customer_Id__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Customer_Id__c)+"'\n");
    sb.append(" Days_Since_Activity_or_Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Days_Since_Activity_or_Order__c)+"'\n");
    sb.append(" Days_Since_Last_Activity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Days_Since_Last_Activity__c)+"'\n");
    sb.append(" Days_Since_Last_Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Days_Since_Last_Order__c)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" Division__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__c)+"'\n");
    sb.append(" Division__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division__r)+"'\n");
    sb.append(" Do_Not_Assign_To__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Do_Not_Assign_To__r)+"'\n");
    sb.append(" Do_Not_Buy_Text__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Do_Not_Buy_Text__c)+"'\n");
    sb.append(" Do_Not_Buy__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Do_Not_Buy__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Emails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Emails)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" Expenses__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Expenses__r)+"'\n");
    sb.append(" External_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(External_ID__c)+"'\n");
    sb.append(" FNA_Status__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FNA_Status__c)+"'\n");
    sb.append(" Fast_Pay_Client__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fast_Pay_Client__c)+"'\n");
    sb.append(" Fast_Pay_Details__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fast_Pay_Details__c)+"'\n");
    sb.append(" Fax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fax)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" Focus_Account__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Focus_Account__c)+"'\n");
    sb.append(" General_Contractor_Required_On_Order__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(General_Contractor_Required_On_Order__c)+"'\n");
    sb.append(" Global_Accounts_Sharing__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Global_Accounts_Sharing__c)+"'\n");
    sb.append(" Global_Sharing_Expiration_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Global_Sharing_Expiration_Date__c)+"'\n");
    sb.append(" Global_Sharing_Start_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Global_Sharing_Start_Date__c)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" Industry__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Industry__c)+"'\n");
    sb.append(" Injury_Count__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Injury_Count__c)+"'\n");
    sb.append(" Invoices_Outstanding__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoices_Outstanding__c)+"'\n");
    sb.append(" Invoices__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoices__r)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsPartner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsPartner)+"'\n");
    sb.append(" Jigsaw=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Jigsaw)+"'\n");
    sb.append(" JigsawCompanyId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JigsawCompanyId)+"'\n");
    sb.append(" Known_Services_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Known_Services_User__c)+"'\n");
    sb.append(" LTATW__LTATW_selectedAddress__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LTATW__LTATW_selectedAddress__c)+"'\n");
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
    sb.append(" Lon__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Lon__c)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" MME__EmailMessages__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MME__EmailMessages__r)+"'\n");
    sb.append(" MasterRecord=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterRecord)+"'\n");
    sb.append(" MasterRecordId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterRecordId)+"'\n");
    sb.append(" Max_Actual_End_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Max_Actual_End_Date__c)+"'\n");
    sb.append(" Most_Recent_Assignment_End__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Most_Recent_Assignment_End__c)+"'\n");
    sb.append(" Most_Recent_Order_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Most_Recent_Order_Date__c)+"'\n");
    sb.append(" Most_Recent_Payment__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Most_Recent_Payment__c)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" NumberOfEmployees=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfEmployees)+"'\n");
    sb.append(" Number_of_Current_Orders__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Current_Orders__c)+"'\n");
    sb.append(" Number_of_Orders__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number_of_Orders__c)+"'\n");
    sb.append(" NumberofLocations__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberofLocations__c)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Opportunities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Opportunities)+"'\n");
    sb.append(" OpportunityPartnersTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpportunityPartnersTo)+"'\n");
    sb.append(" Orders_Placed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders_Placed__c)+"'\n");
    sb.append(" Orders__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Orders__r)+"'\n");
    sb.append(" Overtime_Multiplier__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Overtime_Multiplier__c)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Ownership=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Ownership)+"'\n");
    sb.append(" PO_Override__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PO_Override__c)+"'\n");
    sb.append(" Parent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");
    sb.append(" ParentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");
    sb.append(" PartnersFrom=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PartnersFrom)+"'\n");
    sb.append(" PartnersTo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PartnersTo)+"'\n");
    sb.append(" Personas=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Personas)+"'\n");
    sb.append(" Phone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone)+"'\n");
    sb.append(" PhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PhotoUrl)+"'\n");
    sb.append(" Posts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Posts)+"'\n");
    sb.append(" Pre_Pay_Client_Text__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pre_Pay_Client_Text__c)+"'\n");
    sb.append(" Pre_Pay_Client__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pre_Pay_Client__c)+"'\n");
    sb.append(" Pre_Pay_Method__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Pre_Pay_Method__c)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Proxy__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Proxy__r)+"'\n");
    sb.append(" Rating=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rating)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Remaining_Credit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Remaining_Credit__c)+"'\n");
    sb.append(" Requires_PO_on_Orders__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Requires_PO_on_Orders__c)+"'\n");
    sb.append(" Revenues__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Revenues__r)+"'\n");
    sb.append(" SF_Account_ID__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SF_Account_ID__c)+"'\n");
    sb.append(" SLAExpirationDate__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SLAExpirationDate__c)+"'\n");
    sb.append(" SLASerialNumber__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SLASerialNumber__c)+"'\n");
    sb.append(" SLA__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SLA__c)+"'\n");
    sb.append(" Send_Notice_of_Furnishing__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Send_Notice_of_Furnishing__c)+"'\n");
    sb.append(" Send_to_Contact__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Send_to_Contact__c)+"'\n");
    sb.append(" Send_to_Contact__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Send_to_Contact__r)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
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
    sb.append(" Sic=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Sic)+"'\n");
    sb.append(" SicDesc=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SicDesc)+"'\n");
    sb.append(" Site=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Site)+"'\n");
    sb.append(" Special_Billing_Instructions__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Billing_Instructions__c)+"'\n");
    sb.append(" Special_Requirements__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Special_Requirements__c)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" Tax_Exempt__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tax_Exempt__c)+"'\n");
    sb.append(" TickerSymbol=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TickerSymbol)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" Total_Billed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Billed__c)+"'\n");
    sb.append(" Total_Invoices_Billed__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Invoices_Billed__c)+"'\n");
    sb.append(" Total_Open_Invoices__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Open_Invoices__c)+"'\n");
    sb.append(" Total_Open_Req_Headcount__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Open_Req_Headcount__c)+"'\n");
    sb.append(" Total_Req_Headcount_Credit_Load__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Total_Req_Headcount_Credit_Load__c)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" Unverified_Time__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Unverified_Time__r)+"'\n");
    sb.append(" UpsellOpportunity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpsellOpportunity__c)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" VCSSAP__VCSEmail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__VCSEmail__r)+"'\n");
    sb.append(" Website=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Website)+"'\n");
    sb.append(" Which_Address__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Which_Address__c)+"'\n");
    sb.append(" dupcheck__dc3DisableDuplicateCheck__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__dc3DisableDuplicateCheck__c)+"'\n");
    sb.append(" dupcheck__dc3Index__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__dc3Index__c)+"'\n");
    sb.append(" echosign_dev1__Agreements__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements__r)+"'\n");
    sb.append(" echosign_dev1__Echosign_Recipients__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Echosign_Recipients__r)+"'\n");
    sb.append(" i__DaysSinceLastMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__DaysSinceLastMail__c)+"'\n");
    sb.append(" i__EA2Cs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EA2Cs__r)+"'\n");
    sb.append(" i__LastInboundMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundMail__c)+"'\n");
    sb.append(" i__LastInboundMail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundMail__r)+"'\n");
    sb.append(" i__LastInboundSent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundSent__c)+"'\n");
    sb.append(" i__LastInboundTime__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastInboundTime__c)+"'\n");
    sb.append(" i__LastMailSent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMailSent__c)+"'\n");
    sb.append(" i__LastMailTimeDelta__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMailTimeDelta__c)+"'\n");
    sb.append(" i__LastMailTime__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMailTime__c)+"'\n");
    sb.append(" i__LastMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMail__c)+"'\n");
    sb.append(" i__LastMail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastMail__r)+"'\n");
    sb.append(" i__LastOutboundMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundMail__c)+"'\n");
    sb.append(" i__LastOutboundMail__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundMail__r)+"'\n");
    sb.append(" i__LastOutboundSent__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundSent__c)+"'\n");
    sb.append(" i__LastOutboundTime__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__LastOutboundTime__c)+"'\n");
    sb.append(" isEmailSend__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(isEmailSend__c)+"'\n");
    sb.append(" lat__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(lat__c)+"'\n");
    sb.append(" rh2__Describes__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Describes__r)+"'\n");
    sb.append(" rh2__Rollup_Conditions__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_Conditions__r)+"'\n");
    sb.append(" rh2__Rollup_Dummies__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rh2__Rollup_Dummies__r)+"'\n");
    sb.append(" simplesurvey__Surveys__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(simplesurvey__Surveys__r)+"'\n");
    sb.append(" webm__Webmerge_Documents__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(webm__Webmerge_Documents__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}