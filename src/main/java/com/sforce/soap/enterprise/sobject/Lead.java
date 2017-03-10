package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Lead extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Lead() {
  }
    
  
  /**
   * element  : AcceptedEventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo AcceptedEventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AcceptedEventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean AcceptedEventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult AcceptedEventRelations;

  public com.sforce.soap.enterprise.QueryResult getAcceptedEventRelations() {
    return AcceptedEventRelations;
  }

  

  public void setAcceptedEventRelations(com.sforce.soap.enterprise.QueryResult AcceptedEventRelations) {
    this.AcceptedEventRelations = AcceptedEventRelations;
    AcceptedEventRelations__is_set = true;
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
   * element  : Address of type {urn:enterprise.soap.sforce.com}address
   * java type: com.sforce.soap.enterprise.Address
   */
  private static final com.sforce.ws.bind.TypeInfo Address__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address","urn:enterprise.soap.sforce.com","address",0,1,true);

  private boolean Address__is_set = false;

  private com.sforce.soap.enterprise.Address Address;

  public com.sforce.soap.enterprise.Address getAddress() {
    return Address;
  }

  

  public void setAddress(com.sforce.soap.enterprise.Address Address) {
    this.Address = Address;
    Address__is_set = true;
  }
  
  /**
   * element  : Address_is_Residential__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Address_is_Residential__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Address_is_Residential__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Address_is_Residential__c__is_set = false;

  private java.lang.Boolean Address_is_Residential__c;

  public java.lang.Boolean getAddress_is_Residential__c() {
    return Address_is_Residential__c;
  }

  

  public void setAddress_is_Residential__c(java.lang.Boolean Address_is_Residential__c) {
    this.Address_is_Residential__c = Address_is_Residential__c;
    Address_is_Residential__c__is_set = true;
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
   * element  : Campaign of type {urn:sobject.enterprise.soap.sforce.com}Campaign
   * java type: com.sforce.soap.enterprise.sobject.Campaign
   */
  private static final com.sforce.ws.bind.TypeInfo Campaign__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Campaign","urn:sobject.enterprise.soap.sforce.com","Campaign",0,1,true);

  private boolean Campaign__is_set = false;

  private com.sforce.soap.enterprise.sobject.Campaign Campaign;

  public com.sforce.soap.enterprise.sobject.Campaign getCampaign() {
    return Campaign;
  }

  

  public void setCampaign(com.sforce.soap.enterprise.sobject.Campaign Campaign) {
    this.Campaign = Campaign;
    Campaign__is_set = true;
  }
  
  /**
   * element  : CampaignMembers of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo CampaignMembers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CampaignMembers","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean CampaignMembers__is_set = false;

  private com.sforce.soap.enterprise.QueryResult CampaignMembers;

  public com.sforce.soap.enterprise.QueryResult getCampaignMembers() {
    return CampaignMembers;
  }

  

  public void setCampaignMembers(com.sforce.soap.enterprise.QueryResult CampaignMembers) {
    this.CampaignMembers = CampaignMembers;
    CampaignMembers__is_set = true;
  }
  
  /**
   * element  : City of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo City__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","City","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean City__is_set = false;

  private java.lang.String City;

  public java.lang.String getCity() {
    return City;
  }

  

  public void setCity(java.lang.String City) {
    this.City = City;
    City__is_set = true;
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
   * element  : Company of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Company__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Company","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Company__is_set = false;

  private java.lang.String Company;

  public java.lang.String getCompany() {
    return Company;
  }

  

  public void setCompany(java.lang.String Company) {
    this.Company = Company;
    Company__is_set = true;
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
   * element  : ConvertedAccount of type {urn:sobject.enterprise.soap.sforce.com}Account
   * java type: com.sforce.soap.enterprise.sobject.Account
   */
  private static final com.sforce.ws.bind.TypeInfo ConvertedAccount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConvertedAccount","urn:sobject.enterprise.soap.sforce.com","Account",0,1,true);

  private boolean ConvertedAccount__is_set = false;

  private com.sforce.soap.enterprise.sobject.Account ConvertedAccount;

  public com.sforce.soap.enterprise.sobject.Account getConvertedAccount() {
    return ConvertedAccount;
  }

  

  public void setConvertedAccount(com.sforce.soap.enterprise.sobject.Account ConvertedAccount) {
    this.ConvertedAccount = ConvertedAccount;
    ConvertedAccount__is_set = true;
  }
  
  /**
   * element  : ConvertedAccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConvertedAccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConvertedAccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ConvertedAccountId__is_set = false;

  private java.lang.String ConvertedAccountId;

  public java.lang.String getConvertedAccountId() {
    return ConvertedAccountId;
  }

  

  public void setConvertedAccountId(java.lang.String ConvertedAccountId) {
    this.ConvertedAccountId = ConvertedAccountId;
    ConvertedAccountId__is_set = true;
  }
  
  /**
   * element  : ConvertedContact of type {urn:sobject.enterprise.soap.sforce.com}Contact
   * java type: com.sforce.soap.enterprise.sobject.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo ConvertedContact__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConvertedContact","urn:sobject.enterprise.soap.sforce.com","Contact",0,1,true);

  private boolean ConvertedContact__is_set = false;

  private com.sforce.soap.enterprise.sobject.Contact ConvertedContact;

  public com.sforce.soap.enterprise.sobject.Contact getConvertedContact() {
    return ConvertedContact;
  }

  

  public void setConvertedContact(com.sforce.soap.enterprise.sobject.Contact ConvertedContact) {
    this.ConvertedContact = ConvertedContact;
    ConvertedContact__is_set = true;
  }
  
  /**
   * element  : ConvertedContactId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConvertedContactId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConvertedContactId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ConvertedContactId__is_set = false;

  private java.lang.String ConvertedContactId;

  public java.lang.String getConvertedContactId() {
    return ConvertedContactId;
  }

  

  public void setConvertedContactId(java.lang.String ConvertedContactId) {
    this.ConvertedContactId = ConvertedContactId;
    ConvertedContactId__is_set = true;
  }
  
  /**
   * element  : ConvertedDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ConvertedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConvertedDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean ConvertedDate__is_set = false;

  private java.util.Calendar ConvertedDate;

  public java.util.Calendar getConvertedDate() {
    return ConvertedDate;
  }

  

  public void setConvertedDate(java.util.Calendar ConvertedDate) {
    this.ConvertedDate = ConvertedDate;
    ConvertedDate__is_set = true;
  }
  
  /**
   * element  : ConvertedOpportunity of type {urn:sobject.enterprise.soap.sforce.com}Opportunity
   * java type: com.sforce.soap.enterprise.sobject.Opportunity
   */
  private static final com.sforce.ws.bind.TypeInfo ConvertedOpportunity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConvertedOpportunity","urn:sobject.enterprise.soap.sforce.com","Opportunity",0,1,true);

  private boolean ConvertedOpportunity__is_set = false;

  private com.sforce.soap.enterprise.sobject.Opportunity ConvertedOpportunity;

  public com.sforce.soap.enterprise.sobject.Opportunity getConvertedOpportunity() {
    return ConvertedOpportunity;
  }

  

  public void setConvertedOpportunity(com.sforce.soap.enterprise.sobject.Opportunity ConvertedOpportunity) {
    this.ConvertedOpportunity = ConvertedOpportunity;
    ConvertedOpportunity__is_set = true;
  }
  
  /**
   * element  : ConvertedOpportunityId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConvertedOpportunityId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConvertedOpportunityId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ConvertedOpportunityId__is_set = false;

  private java.lang.String ConvertedOpportunityId;

  public java.lang.String getConvertedOpportunityId() {
    return ConvertedOpportunityId;
  }

  

  public void setConvertedOpportunityId(java.lang.String ConvertedOpportunityId) {
    this.ConvertedOpportunityId = ConvertedOpportunityId;
    ConvertedOpportunityId__is_set = true;
  }
  
  /**
   * element  : Country of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Country__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Country","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Country__is_set = false;

  private java.lang.String Country;

  public java.lang.String getCountry() {
    return Country;
  }

  

  public void setCountry(java.lang.String Country) {
    this.Country = Country;
    Country__is_set = true;
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
   * element  : Created_Date__c of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo Created_Date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Created_Date__c","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean Created_Date__c__is_set = false;

  private java.util.Calendar Created_Date__c;

  public java.util.Calendar getCreated_Date__c() {
    return Created_Date__c;
  }

  

  public void setCreated_Date__c(java.util.Calendar Created_Date__c) {
    this.Created_Date__c = Created_Date__c;
    Created_Date__c__is_set = true;
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
   * element  : DUNS_Number__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DUNS_Number__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DUNS_Number__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DUNS_Number__c__is_set = false;

  private java.lang.String DUNS_Number__c;

  public java.lang.String getDUNS_Number__c() {
    return DUNS_Number__c;
  }

  

  public void setDUNS_Number__c(java.lang.String DUNS_Number__c) {
    this.DUNS_Number__c = DUNS_Number__c;
    DUNS_Number__c__is_set = true;
  }
  
  /**
   * element  : D_B_Prescreen_Score__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo D_B_Prescreen_Score__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","D_B_Prescreen_Score__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean D_B_Prescreen_Score__c__is_set = false;

  private java.lang.String D_B_Prescreen_Score__c;

  public java.lang.String getD_B_Prescreen_Score__c() {
    return D_B_Prescreen_Score__c;
  }

  

  public void setD_B_Prescreen_Score__c(java.lang.String D_B_Prescreen_Score__c) {
    this.D_B_Prescreen_Score__c = D_B_Prescreen_Score__c;
    D_B_Prescreen_Score__c__is_set = true;
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
   * element  : DeclinedEventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo DeclinedEventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeclinedEventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean DeclinedEventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult DeclinedEventRelations;

  public com.sforce.soap.enterprise.QueryResult getDeclinedEventRelations() {
    return DeclinedEventRelations;
  }

  

  public void setDeclinedEventRelations(com.sforce.soap.enterprise.QueryResult DeclinedEventRelations) {
    this.DeclinedEventRelations = DeclinedEventRelations;
    DeclinedEventRelations__is_set = true;
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
   * element  : Disqualification_Reason__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Disqualification_Reason__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Disqualification_Reason__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Disqualification_Reason__c__is_set = false;

  private java.lang.String Disqualification_Reason__c;

  public java.lang.String getDisqualification_Reason__c() {
    return Disqualification_Reason__c;
  }

  

  public void setDisqualification_Reason__c(java.lang.String Disqualification_Reason__c) {
    this.Disqualification_Reason__c = Disqualification_Reason__c;
    Disqualification_Reason__c__is_set = true;
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
   * element  : EmailBouncedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EmailBouncedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailBouncedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean EmailBouncedDate__is_set = false;

  private java.util.Calendar EmailBouncedDate;

  public java.util.Calendar getEmailBouncedDate() {
    return EmailBouncedDate;
  }

  

  public void setEmailBouncedDate(java.util.Calendar EmailBouncedDate) {
    this.EmailBouncedDate = EmailBouncedDate;
    EmailBouncedDate__is_set = true;
  }
  
  /**
   * element  : EmailBouncedReason of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EmailBouncedReason__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailBouncedReason","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EmailBouncedReason__is_set = false;

  private java.lang.String EmailBouncedReason;

  public java.lang.String getEmailBouncedReason() {
    return EmailBouncedReason;
  }

  

  public void setEmailBouncedReason(java.lang.String EmailBouncedReason) {
    this.EmailBouncedReason = EmailBouncedReason;
    EmailBouncedReason__is_set = true;
  }
  
  /**
   * element  : EmailMessageRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo EmailMessageRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailMessageRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean EmailMessageRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult EmailMessageRelations;

  public com.sforce.soap.enterprise.QueryResult getEmailMessageRelations() {
    return EmailMessageRelations;
  }

  

  public void setEmailMessageRelations(com.sforce.soap.enterprise.QueryResult EmailMessageRelations) {
    this.EmailMessageRelations = EmailMessageRelations;
    EmailMessageRelations__is_set = true;
  }
  
  /**
   * element  : EmailStatuses of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo EmailStatuses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EmailStatuses","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean EmailStatuses__is_set = false;

  private com.sforce.soap.enterprise.QueryResult EmailStatuses;

  public com.sforce.soap.enterprise.QueryResult getEmailStatuses() {
    return EmailStatuses;
  }

  

  public void setEmailStatuses(com.sforce.soap.enterprise.QueryResult EmailStatuses) {
    this.EmailStatuses = EmailStatuses;
    EmailStatuses__is_set = true;
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
   * element  : EventWhoRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo EventWhoRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EventWhoRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean EventWhoRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult EventWhoRelations;

  public com.sforce.soap.enterprise.QueryResult getEventWhoRelations() {
    return EventWhoRelations;
  }

  

  public void setEventWhoRelations(com.sforce.soap.enterprise.QueryResult EventWhoRelations) {
    this.EventWhoRelations = EventWhoRelations;
    EventWhoRelations__is_set = true;
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
   * element  : FirstName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FirstName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FirstName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FirstName__is_set = false;

  private java.lang.String FirstName;

  public java.lang.String getFirstName() {
    return FirstName;
  }

  

  public void setFirstName(java.lang.String FirstName) {
    this.FirstName = FirstName;
    FirstName__is_set = true;
  }
  
  /**
   * element  : GeocodeAccuracy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo GeocodeAccuracy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GeocodeAccuracy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean GeocodeAccuracy__is_set = false;

  private java.lang.String GeocodeAccuracy;

  public java.lang.String getGeocodeAccuracy() {
    return GeocodeAccuracy;
  }

  

  public void setGeocodeAccuracy(java.lang.String GeocodeAccuracy) {
    this.GeocodeAccuracy = GeocodeAccuracy;
    GeocodeAccuracy__is_set = true;
  }
  
  /**
   * element  : HasOptedOutOfEmail of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo HasOptedOutOfEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","HasOptedOutOfEmail","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean HasOptedOutOfEmail__is_set = false;

  private java.lang.Boolean HasOptedOutOfEmail;

  public java.lang.Boolean getHasOptedOutOfEmail() {
    return HasOptedOutOfEmail;
  }

  

  public void setHasOptedOutOfEmail(java.lang.Boolean HasOptedOutOfEmail) {
    this.HasOptedOutOfEmail = HasOptedOutOfEmail;
    HasOptedOutOfEmail__is_set = true;
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
   * element  : Industries__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Industries__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Industries__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Industries__c__is_set = false;

  private java.lang.String Industries__c;

  public java.lang.String getIndustries__c() {
    return Industries__c;
  }

  

  public void setIndustries__c(java.lang.String Industries__c) {
    this.Industries__c = Industries__c;
    Industries__c__is_set = true;
  }
  
  /**
   * element  : Industry of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Industry__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Industry","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Industry__is_set = false;

  private java.lang.String Industry;

  public java.lang.String getIndustry() {
    return Industry;
  }

  

  public void setIndustry(java.lang.String Industry) {
    this.Industry = Industry;
    Industry__is_set = true;
  }
  
  /**
   * element  : IsConverted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsConverted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsConverted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsConverted__is_set = false;

  private java.lang.Boolean IsConverted;

  public java.lang.Boolean getIsConverted() {
    return IsConverted;
  }

  

  public void setIsConverted(java.lang.Boolean IsConverted) {
    this.IsConverted = IsConverted;
    IsConverted__is_set = true;
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
   * element  : IsUnreadByOwner of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsUnreadByOwner__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsUnreadByOwner","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsUnreadByOwner__is_set = false;

  private java.lang.Boolean IsUnreadByOwner;

  public java.lang.Boolean getIsUnreadByOwner() {
    return IsUnreadByOwner;
  }

  

  public void setIsUnreadByOwner(java.lang.Boolean IsUnreadByOwner) {
    this.IsUnreadByOwner = IsUnreadByOwner;
    IsUnreadByOwner__is_set = true;
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
   * element  : JigsawContactId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo JigsawContactId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JigsawContactId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean JigsawContactId__is_set = false;

  private java.lang.String JigsawContactId;

  public java.lang.String getJigsawContactId() {
    return JigsawContactId;
  }

  

  public void setJigsawContactId(java.lang.String JigsawContactId) {
    this.JigsawContactId = JigsawContactId;
    JigsawContactId__is_set = true;
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
   * element  : LastName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LastName__is_set = false;

  private java.lang.String LastName;

  public java.lang.String getLastName() {
    return LastName;
  }

  

  public void setLastName(java.lang.String LastName) {
    this.LastName = LastName;
    LastName__is_set = true;
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
   * element  : Latitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Latitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Latitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Latitude__is_set = false;

  private java.lang.Double Latitude;

  public java.lang.Double getLatitude() {
    return Latitude;
  }

  

  public void setLatitude(java.lang.Double Latitude) {
    this.Latitude = Latitude;
    Latitude__is_set = true;
  }
  
  /**
   * element  : LeadSource of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LeadSource__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LeadSource","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LeadSource__is_set = false;

  private java.lang.String LeadSource;

  public java.lang.String getLeadSource() {
    return LeadSource;
  }

  

  public void setLeadSource(java.lang.String LeadSource) {
    this.LeadSource = LeadSource;
    LeadSource__is_set = true;
  }
  
  /**
   * element  : Longitude of type {http://www.w3.org/2001/XMLSchema}double
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Longitude__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Longitude","http://www.w3.org/2001/XMLSchema","double",0,1,true);

  private boolean Longitude__is_set = false;

  private java.lang.Double Longitude;

  public java.lang.Double getLongitude() {
    return Longitude;
  }

  

  public void setLongitude(java.lang.Double Longitude) {
    this.Longitude = Longitude;
    Longitude__is_set = true;
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
   * element  : MasterRecord of type {urn:sobject.enterprise.soap.sforce.com}Lead
   * java type: com.sforce.soap.enterprise.sobject.Lead
   */
  private static final com.sforce.ws.bind.TypeInfo MasterRecord__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MasterRecord","urn:sobject.enterprise.soap.sforce.com","Lead",0,1,true);

  private boolean MasterRecord__is_set = false;

  private com.sforce.soap.enterprise.sobject.Lead MasterRecord;

  public com.sforce.soap.enterprise.sobject.Lead getMasterRecord() {
    return MasterRecord;
  }

  

  public void setMasterRecord(com.sforce.soap.enterprise.sobject.Lead MasterRecord) {
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
   * element  : MobilePhone of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobilePhone__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobilePhone","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobilePhone__is_set = false;

  private java.lang.String MobilePhone;

  public java.lang.String getMobilePhone() {
    return MobilePhone;
  }

  

  public void setMobilePhone(java.lang.String MobilePhone) {
    this.MobilePhone = MobilePhone;
    MobilePhone__is_set = true;
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
   * element  : Other_Phone__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Other_Phone__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Other_Phone__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Other_Phone__c__is_set = false;

  private java.lang.String Other_Phone__c;

  public java.lang.String getOther_Phone__c() {
    return Other_Phone__c;
  }

  

  public void setOther_Phone__c(java.lang.String Other_Phone__c) {
    this.Other_Phone__c = Other_Phone__c;
    Other_Phone__c__is_set = true;
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
   * element  : Phone_Ext__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Phone_Ext__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Phone_Ext__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Phone_Ext__c__is_set = false;

  private java.lang.String Phone_Ext__c;

  public java.lang.String getPhone_Ext__c() {
    return Phone_Ext__c;
  }

  

  public void setPhone_Ext__c(java.lang.String Phone_Ext__c) {
    this.Phone_Ext__c = Phone_Ext__c;
    Phone_Ext__c__is_set = true;
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
   * element  : PostalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PostalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PostalCode__is_set = false;

  private java.lang.String PostalCode;

  public java.lang.String getPostalCode() {
    return PostalCode;
  }

  

  public void setPostalCode(java.lang.String PostalCode) {
    this.PostalCode = PostalCode;
    PostalCode__is_set = true;
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
   * element  : Remove_From_Auto_Email__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Remove_From_Auto_Email__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Remove_From_Auto_Email__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Remove_From_Auto_Email__c__is_set = false;

  private java.lang.Boolean Remove_From_Auto_Email__c;

  public java.lang.Boolean getRemove_From_Auto_Email__c() {
    return Remove_From_Auto_Email__c;
  }

  

  public void setRemove_From_Auto_Email__c(java.lang.Boolean Remove_From_Auto_Email__c) {
    this.Remove_From_Auto_Email__c = Remove_From_Auto_Email__c;
    Remove_From_Auto_Email__c__is_set = true;
  }
  
  /**
   * element  : Salutation of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Salutation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Salutation","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Salutation__is_set = false;

  private java.lang.String Salutation;

  public java.lang.String getSalutation() {
    return Salutation;
  }

  

  public void setSalutation(java.lang.String Salutation) {
    this.Salutation = Salutation;
    Salutation__is_set = true;
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
   * element  : State of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State__is_set = false;

  private java.lang.String State;

  public java.lang.String getState() {
    return State;
  }

  

  public void setState(java.lang.String State) {
    this.State = State;
    State__is_set = true;
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
   * element  : Street of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Street__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Street","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Street__is_set = false;

  private java.lang.String Street;

  public java.lang.String getStreet() {
    return Street;
  }

  

  public void setStreet(java.lang.String Street) {
    this.Street = Street;
    Street__is_set = true;
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
   * element  : TaskWhoRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo TaskWhoRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TaskWhoRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean TaskWhoRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult TaskWhoRelations;

  public com.sforce.soap.enterprise.QueryResult getTaskWhoRelations() {
    return TaskWhoRelations;
  }

  

  public void setTaskWhoRelations(com.sforce.soap.enterprise.QueryResult TaskWhoRelations) {
    this.TaskWhoRelations = TaskWhoRelations;
    TaskWhoRelations__is_set = true;
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
   * element  : Title of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Title__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Title","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Title__is_set = false;

  private java.lang.String Title;

  public java.lang.String getTitle() {
    return Title;
  }

  

  public void setTitle(java.lang.String Title) {
    this.Title = Title;
    Title__is_set = true;
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
   * element  : UndecidedEventRelations of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UndecidedEventRelations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UndecidedEventRelations","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UndecidedEventRelations__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UndecidedEventRelations;

  public com.sforce.soap.enterprise.QueryResult getUndecidedEventRelations() {
    return UndecidedEventRelations;
  }

  

  public void setUndecidedEventRelations(com.sforce.soap.enterprise.QueryResult UndecidedEventRelations) {
    this.UndecidedEventRelations = UndecidedEventRelations;
    UndecidedEventRelations__is_set = true;
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
   * element  : VCSSAP__VCSEmails__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo VCSSAP__VCSEmails__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","VCSSAP__VCSEmails__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean VCSSAP__VCSEmails__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmails__r;

  public com.sforce.soap.enterprise.QueryResult getVCSSAP__VCSEmails__r() {
    return VCSSAP__VCSEmails__r;
  }

  

  public void setVCSSAP__VCSEmails__r(com.sforce.soap.enterprise.QueryResult VCSSAP__VCSEmails__r) {
    this.VCSSAP__VCSEmails__r = VCSSAP__VCSEmails__r;
    VCSSAP__VCSEmails__r__is_set = true;
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
   * element  : due_date__c of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo due_date__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","due_date__c","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean due_date__c__is_set = false;

  private java.util.Calendar due_date__c;

  public java.util.Calendar getDue_date__c() {
    return due_date__c;
  }

  

  public void setDue_date__c(java.util.Calendar due_date__c) {
    this.due_date__c = due_date__c;
    due_date__c__is_set = true;
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
   * element  : dupcheck__dc3Web2Lead__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo dupcheck__dc3Web2Lead__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","dupcheck__dc3Web2Lead__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean dupcheck__dc3Web2Lead__c__is_set = false;

  private java.lang.Boolean dupcheck__dc3Web2Lead__c;

  public java.lang.Boolean getDupcheck__dc3Web2Lead__c() {
    return dupcheck__dc3Web2Lead__c;
  }

  

  public void setDupcheck__dc3Web2Lead__c(java.lang.Boolean dupcheck__dc3Web2Lead__c) {
    this.dupcheck__dc3Web2Lead__c = dupcheck__dc3Web2Lead__c;
    dupcheck__dc3Web2Lead__c__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements2__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements2__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements2__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements2__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements2__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements2__r() {
    return echosign_dev1__Agreements2__r;
  }

  

  public void setEchosign_dev1__Agreements2__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements2__r) {
    this.echosign_dev1__Agreements2__r = echosign_dev1__Agreements2__r;
    echosign_dev1__Agreements2__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements3__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements3__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements3__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements3__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements3__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements3__r() {
    return echosign_dev1__Agreements3__r;
  }

  

  public void setEchosign_dev1__Agreements3__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements3__r) {
    this.echosign_dev1__Agreements3__r = echosign_dev1__Agreements3__r;
    echosign_dev1__Agreements3__r__is_set = true;
  }
  
  /**
   * element  : echosign_dev1__Agreements4__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Agreements4__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Agreements4__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Agreements4__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements4__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Agreements4__r() {
    return echosign_dev1__Agreements4__r;
  }

  

  public void setEchosign_dev1__Agreements4__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Agreements4__r) {
    this.echosign_dev1__Agreements4__r = echosign_dev1__Agreements4__r;
    echosign_dev1__Agreements4__r__is_set = true;
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
   * element  : echosign_dev1__Recipient_Templates__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo echosign_dev1__Recipient_Templates__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","echosign_dev1__Recipient_Templates__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean echosign_dev1__Recipient_Templates__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult echosign_dev1__Recipient_Templates__r;

  public com.sforce.soap.enterprise.QueryResult getEchosign_dev1__Recipient_Templates__r() {
    return echosign_dev1__Recipient_Templates__r;
  }

  

  public void setEchosign_dev1__Recipient_Templates__r(com.sforce.soap.enterprise.QueryResult echosign_dev1__Recipient_Templates__r) {
    this.echosign_dev1__Recipient_Templates__r = echosign_dev1__Recipient_Templates__r;
    echosign_dev1__Recipient_Templates__r__is_set = true;
  }
  
  /**
   * element  : i__CreatedForUser__c of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__CreatedForUser__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__CreatedForUser__c","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean i__CreatedForUser__c__is_set = false;

  private java.lang.String i__CreatedForUser__c;

  public java.lang.String getI__CreatedForUser__c() {
    return i__CreatedForUser__c;
  }

  

  public void setI__CreatedForUser__c(java.lang.String i__CreatedForUser__c) {
    this.i__CreatedForUser__c = i__CreatedForUser__c;
    i__CreatedForUser__c__is_set = true;
  }
  
  /**
   * element  : i__CreatedForUser__r of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo i__CreatedForUser__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__CreatedForUser__r","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean i__CreatedForUser__r__is_set = false;

  private com.sforce.soap.enterprise.sobject.User i__CreatedForUser__r;

  public com.sforce.soap.enterprise.sobject.User getI__CreatedForUser__r() {
    return i__CreatedForUser__r;
  }

  

  public void setI__CreatedForUser__r(com.sforce.soap.enterprise.sobject.User i__CreatedForUser__r) {
    this.i__CreatedForUser__r = i__CreatedForUser__r;
    i__CreatedForUser__r__is_set = true;
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
   * element  : i__EmailAddrs__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo i__EmailAddrs__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__EmailAddrs__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean i__EmailAddrs__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult i__EmailAddrs__r;

  public com.sforce.soap.enterprise.QueryResult getI__EmailAddrs__r() {
    return i__EmailAddrs__r;
  }

  

  public void setI__EmailAddrs__r(com.sforce.soap.enterprise.QueryResult i__EmailAddrs__r) {
    this.i__EmailAddrs__r = i__EmailAddrs__r;
    i__EmailAddrs__r__is_set = true;
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
   * element  : i__OtherEmails__c of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo i__OtherEmails__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","i__OtherEmails__c","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean i__OtherEmails__c__is_set = false;

  private java.lang.String i__OtherEmails__c;

  public java.lang.String getI__OtherEmails__c() {
    return i__OtherEmails__c;
  }

  

  public void setI__OtherEmails__c(java.lang.String i__OtherEmails__c) {
    this.i__OtherEmails__c = i__OtherEmails__c;
    i__OtherEmails__c__is_set = true;
  }
  
  /**
   * element  : smagicinteract__Incoming_SMS__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo smagicinteract__Incoming_SMS__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smagicinteract__Incoming_SMS__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean smagicinteract__Incoming_SMS__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult smagicinteract__Incoming_SMS__r;

  public com.sforce.soap.enterprise.QueryResult getSmagicinteract__Incoming_SMS__r() {
    return smagicinteract__Incoming_SMS__r;
  }

  

  public void setSmagicinteract__Incoming_SMS__r(com.sforce.soap.enterprise.QueryResult smagicinteract__Incoming_SMS__r) {
    this.smagicinteract__Incoming_SMS__r = smagicinteract__Incoming_SMS__r;
    smagicinteract__Incoming_SMS__r__is_set = true;
  }
  
  /**
   * element  : smagicinteract__SMSOptOut__c of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo smagicinteract__SMSOptOut__c__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smagicinteract__SMSOptOut__c","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean smagicinteract__SMSOptOut__c__is_set = false;

  private java.lang.Boolean smagicinteract__SMSOptOut__c;

  public java.lang.Boolean getSmagicinteract__SMSOptOut__c() {
    return smagicinteract__SMSOptOut__c;
  }

  

  public void setSmagicinteract__SMSOptOut__c(java.lang.Boolean smagicinteract__SMSOptOut__c) {
    this.smagicinteract__SMSOptOut__c = smagicinteract__SMSOptOut__c;
    smagicinteract__SMSOptOut__c__is_set = true;
  }
  
  /**
   * element  : smagicinteract__smsMagic__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo smagicinteract__smsMagic__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","smagicinteract__smsMagic__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean smagicinteract__smsMagic__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult smagicinteract__smsMagic__r;

  public com.sforce.soap.enterprise.QueryResult getSmagicinteract__smsMagic__r() {
    return smagicinteract__smsMagic__r;
  }

  

  public void setSmagicinteract__smsMagic__r(com.sforce.soap.enterprise.QueryResult smagicinteract__smsMagic__r) {
    this.smagicinteract__smsMagic__r = smagicinteract__smsMagic__r;
    smagicinteract__smsMagic__r__is_set = true;
  }
  
  /**
   * element  : vr__VR_Email_History_Lead__r of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo vr__VR_Email_History_Lead__r__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","vr__VR_Email_History_Lead__r","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean vr__VR_Email_History_Lead__r__is_set = false;

  private com.sforce.soap.enterprise.QueryResult vr__VR_Email_History_Lead__r;

  public com.sforce.soap.enterprise.QueryResult getVr__VR_Email_History_Lead__r() {
    return vr__VR_Email_History_Lead__r;
  }

  

  public void setVr__VR_Email_History_Lead__r(com.sforce.soap.enterprise.QueryResult vr__VR_Email_History_Lead__r) {
    this.vr__VR_Email_History_Lead__r = vr__VR_Email_History_Lead__r;
    vr__VR_Email_History_Lead__r__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Lead");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AcceptedEventRelations__typeInfo, AcceptedEventRelations, AcceptedEventRelations__is_set);
    __typeMapper.writeObject(__out, ActivityHistories__typeInfo, ActivityHistories, ActivityHistories__is_set);
    __typeMapper.writeObject(__out, Address__typeInfo, Address, Address__is_set);
    __typeMapper.writeObject(__out, Address_is_Residential__c__typeInfo, Address_is_Residential__c, Address_is_Residential__c__is_set);
    __typeMapper.writeObject(__out, AnnualRevenue__typeInfo, AnnualRevenue, AnnualRevenue__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeObject(__out, Attachments__typeInfo, Attachments, Attachments__is_set);
    __typeMapper.writeObject(__out, Campaign__typeInfo, Campaign, Campaign__is_set);
    __typeMapper.writeObject(__out, CampaignMembers__typeInfo, CampaignMembers, CampaignMembers__is_set);
    __typeMapper.writeString(__out, City__typeInfo, City, City__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, Company__typeInfo, Company, Company__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeObject(__out, ConvertedAccount__typeInfo, ConvertedAccount, ConvertedAccount__is_set);
    __typeMapper.writeString(__out, ConvertedAccountId__typeInfo, ConvertedAccountId, ConvertedAccountId__is_set);
    __typeMapper.writeObject(__out, ConvertedContact__typeInfo, ConvertedContact, ConvertedContact__is_set);
    __typeMapper.writeString(__out, ConvertedContactId__typeInfo, ConvertedContactId, ConvertedContactId__is_set);
    __typeMapper.writeObject(__out, ConvertedDate__typeInfo, ConvertedDate, ConvertedDate__is_set);
    __typeMapper.writeObject(__out, ConvertedOpportunity__typeInfo, ConvertedOpportunity, ConvertedOpportunity__is_set);
    __typeMapper.writeString(__out, ConvertedOpportunityId__typeInfo, ConvertedOpportunityId, ConvertedOpportunityId__is_set);
    __typeMapper.writeString(__out, Country__typeInfo, Country, Country__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, Created_Date__c__typeInfo, Created_Date__c, Created_Date__c__is_set);
    __typeMapper.writeObject(__out, Credit_Limit__c__typeInfo, Credit_Limit__c, Credit_Limit__c__is_set);
    __typeMapper.writeString(__out, Credit_Rating__c__typeInfo, Credit_Rating__c, Credit_Rating__c__is_set);
    __typeMapper.writeString(__out, DUNS_Number__c__typeInfo, DUNS_Number__c, DUNS_Number__c__is_set);
    __typeMapper.writeString(__out, D_B_Prescreen_Score__c__typeInfo, D_B_Prescreen_Score__c, D_B_Prescreen_Score__c__is_set);
    __typeMapper.writeObject(__out, Days_Since_Last_Activity__c__typeInfo, Days_Since_Last_Activity__c, Days_Since_Last_Activity__c__is_set);
    __typeMapper.writeObject(__out, DeclinedEventRelations__typeInfo, DeclinedEventRelations, DeclinedEventRelations__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, Disqualification_Reason__c__typeInfo, Disqualification_Reason__c, Disqualification_Reason__c__is_set);
    __typeMapper.writeObject(__out, DuplicateRecordItems__typeInfo, DuplicateRecordItems, DuplicateRecordItems__is_set);
    __typeMapper.writeString(__out, Email__typeInfo, Email, Email__is_set);
    __typeMapper.writeObject(__out, EmailBouncedDate__typeInfo, EmailBouncedDate, EmailBouncedDate__is_set);
    __typeMapper.writeString(__out, EmailBouncedReason__typeInfo, EmailBouncedReason, EmailBouncedReason__is_set);
    __typeMapper.writeObject(__out, EmailMessageRelations__typeInfo, EmailMessageRelations, EmailMessageRelations__is_set);
    __typeMapper.writeObject(__out, EmailStatuses__typeInfo, EmailStatuses, EmailStatuses__is_set);
    __typeMapper.writeObject(__out, EventRelations__typeInfo, EventRelations, EventRelations__is_set);
    __typeMapper.writeObject(__out, EventWhoRelations__typeInfo, EventWhoRelations, EventWhoRelations__is_set);
    __typeMapper.writeObject(__out, Events__typeInfo, Events, Events__is_set);
    __typeMapper.writeString(__out, Fax__typeInfo, Fax, Fax__is_set);
    __typeMapper.writeObject(__out, FeedSubscriptionsForEntity__typeInfo, FeedSubscriptionsForEntity, FeedSubscriptionsForEntity__is_set);
    __typeMapper.writeObject(__out, Feeds__typeInfo, Feeds, Feeds__is_set);
    __typeMapper.writeString(__out, FirstName__typeInfo, FirstName, FirstName__is_set);
    __typeMapper.writeString(__out, GeocodeAccuracy__typeInfo, GeocodeAccuracy, GeocodeAccuracy__is_set);
    __typeMapper.writeObject(__out, HasOptedOutOfEmail__typeInfo, HasOptedOutOfEmail, HasOptedOutOfEmail__is_set);
    __typeMapper.writeObject(__out, Histories__typeInfo, Histories, Histories__is_set);
    __typeMapper.writeString(__out, Industries__c__typeInfo, Industries__c, Industries__c__is_set);
    __typeMapper.writeString(__out, Industry__typeInfo, Industry, Industry__is_set);
    __typeMapper.writeObject(__out, IsConverted__typeInfo, IsConverted, IsConverted__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsUnreadByOwner__typeInfo, IsUnreadByOwner, IsUnreadByOwner__is_set);
    __typeMapper.writeString(__out, Jigsaw__typeInfo, Jigsaw, Jigsaw__is_set);
    __typeMapper.writeString(__out, JigsawContactId__typeInfo, JigsawContactId, JigsawContactId__is_set);
    __typeMapper.writeObject(__out, Known_Services_User__c__typeInfo, Known_Services_User__c, Known_Services_User__c__is_set);
    __typeMapper.writeObject(__out, LastActivityDate__typeInfo, LastActivityDate, LastActivityDate__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, LastName__typeInfo, LastName, LastName__is_set);
    __typeMapper.writeObject(__out, LastReferencedDate__typeInfo, LastReferencedDate, LastReferencedDate__is_set);
    __typeMapper.writeObject(__out, LastViewedDate__typeInfo, LastViewedDate, LastViewedDate__is_set);
    __typeMapper.writeObject(__out, Latitude__typeInfo, Latitude, Latitude__is_set);
    __typeMapper.writeString(__out, LeadSource__typeInfo, LeadSource, LeadSource__is_set);
    __typeMapper.writeObject(__out, Longitude__typeInfo, Longitude, Longitude__is_set);
    __typeMapper.writeObject(__out, LookedUpFromActivities__typeInfo, LookedUpFromActivities, LookedUpFromActivities__is_set);
    __typeMapper.writeObject(__out, MME__EmailMessages__r__typeInfo, MME__EmailMessages__r, MME__EmailMessages__r__is_set);
    __typeMapper.writeObject(__out, MasterRecord__typeInfo, MasterRecord, MasterRecord__is_set);
    __typeMapper.writeString(__out, MasterRecordId__typeInfo, MasterRecordId, MasterRecordId__is_set);
    __typeMapper.writeString(__out, MobilePhone__typeInfo, MobilePhone, MobilePhone__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, Nickname__c__typeInfo, Nickname__c, Nickname__c__is_set);
    __typeMapper.writeObject(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeObject(__out, NotesAndAttachments__typeInfo, NotesAndAttachments, NotesAndAttachments__is_set);
    __typeMapper.writeObject(__out, NumberOfEmployees__typeInfo, NumberOfEmployees, NumberOfEmployees__is_set);
    __typeMapper.writeObject(__out, OpenActivities__typeInfo, OpenActivities, OpenActivities__is_set);
    __typeMapper.writeString(__out, Other_Phone__c__typeInfo, Other_Phone__c, Other_Phone__c__is_set);
    __typeMapper.writeObject(__out, Owner__typeInfo, Owner, Owner__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, Personas__typeInfo, Personas, Personas__is_set);
    __typeMapper.writeString(__out, Phone__typeInfo, Phone, Phone__is_set);
    __typeMapper.writeString(__out, Phone_Ext__c__typeInfo, Phone_Ext__c, Phone_Ext__c__is_set);
    __typeMapper.writeString(__out, PhotoUrl__typeInfo, PhotoUrl, PhotoUrl__is_set);
    __typeMapper.writeString(__out, PostalCode__typeInfo, PostalCode, PostalCode__is_set);
    __typeMapper.writeObject(__out, Posts__typeInfo, Posts, Posts__is_set);
    __typeMapper.writeObject(__out, ProcessInstances__typeInfo, ProcessInstances, ProcessInstances__is_set);
    __typeMapper.writeObject(__out, ProcessSteps__typeInfo, ProcessSteps, ProcessSteps__is_set);
    __typeMapper.writeString(__out, Rating__typeInfo, Rating, Rating__is_set);
    __typeMapper.writeObject(__out, RecordAssociatedGroups__typeInfo, RecordAssociatedGroups, RecordAssociatedGroups__is_set);
    __typeMapper.writeObject(__out, RecordType__typeInfo, RecordType, RecordType__is_set);
    __typeMapper.writeString(__out, RecordTypeId__typeInfo, RecordTypeId, RecordTypeId__is_set);
    __typeMapper.writeObject(__out, Remove_From_Auto_Email__c__typeInfo, Remove_From_Auto_Email__c, Remove_From_Auto_Email__c__is_set);
    __typeMapper.writeString(__out, Salutation__typeInfo, Salutation, Salutation__is_set);
    __typeMapper.writeObject(__out, Shares__typeInfo, Shares, Shares__is_set);
    __typeMapper.writeString(__out, State__typeInfo, State, State__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, Street__typeInfo, Street, Street__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, Tags__typeInfo, Tags, Tags__is_set);
    __typeMapper.writeObject(__out, TaskRelations__typeInfo, TaskRelations, TaskRelations__is_set);
    __typeMapper.writeObject(__out, TaskWhoRelations__typeInfo, TaskWhoRelations, TaskWhoRelations__is_set);
    __typeMapper.writeObject(__out, Tasks__typeInfo, Tasks, Tasks__is_set);
    __typeMapper.writeString(__out, Title__typeInfo, Title, Title__is_set);
    __typeMapper.writeObject(__out, TopicAssignments__typeInfo, TopicAssignments, TopicAssignments__is_set);
    __typeMapper.writeObject(__out, UndecidedEventRelations__typeInfo, UndecidedEventRelations, UndecidedEventRelations__is_set);
    __typeMapper.writeObject(__out, UserRecordAccess__typeInfo, UserRecordAccess, UserRecordAccess__is_set);
    __typeMapper.writeObject(__out, VCSSAP__VCSEmails__r__typeInfo, VCSSAP__VCSEmails__r, VCSSAP__VCSEmails__r__is_set);
    __typeMapper.writeString(__out, Website__typeInfo, Website, Website__is_set);
    __typeMapper.writeObject(__out, due_date__c__typeInfo, due_date__c, due_date__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__dc3DisableDuplicateCheck__c__typeInfo, dupcheck__dc3DisableDuplicateCheck__c, dupcheck__dc3DisableDuplicateCheck__c__is_set);
    __typeMapper.writeString(__out, dupcheck__dc3Index__c__typeInfo, dupcheck__dc3Index__c, dupcheck__dc3Index__c__is_set);
    __typeMapper.writeObject(__out, dupcheck__dc3Web2Lead__c__typeInfo, dupcheck__dc3Web2Lead__c, dupcheck__dc3Web2Lead__c__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements2__r__typeInfo, echosign_dev1__Agreements2__r, echosign_dev1__Agreements2__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements3__r__typeInfo, echosign_dev1__Agreements3__r, echosign_dev1__Agreements3__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements4__r__typeInfo, echosign_dev1__Agreements4__r, echosign_dev1__Agreements4__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Agreements__r__typeInfo, echosign_dev1__Agreements__r, echosign_dev1__Agreements__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Echosign_Recipients__r__typeInfo, echosign_dev1__Echosign_Recipients__r, echosign_dev1__Echosign_Recipients__r__is_set);
    __typeMapper.writeObject(__out, echosign_dev1__Recipient_Templates__r__typeInfo, echosign_dev1__Recipient_Templates__r, echosign_dev1__Recipient_Templates__r__is_set);
    __typeMapper.writeString(__out, i__CreatedForUser__c__typeInfo, i__CreatedForUser__c, i__CreatedForUser__c__is_set);
    __typeMapper.writeObject(__out, i__CreatedForUser__r__typeInfo, i__CreatedForUser__r, i__CreatedForUser__r__is_set);
    __typeMapper.writeObject(__out, i__DaysSinceLastMail__c__typeInfo, i__DaysSinceLastMail__c, i__DaysSinceLastMail__c__is_set);
    __typeMapper.writeObject(__out, i__EmailAddrs__r__typeInfo, i__EmailAddrs__r, i__EmailAddrs__r__is_set);
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
    __typeMapper.writeString(__out, i__OtherEmails__c__typeInfo, i__OtherEmails__c, i__OtherEmails__c__is_set);
    __typeMapper.writeObject(__out, smagicinteract__Incoming_SMS__r__typeInfo, smagicinteract__Incoming_SMS__r, smagicinteract__Incoming_SMS__r__is_set);
    __typeMapper.writeObject(__out, smagicinteract__SMSOptOut__c__typeInfo, smagicinteract__SMSOptOut__c, smagicinteract__SMSOptOut__c__is_set);
    __typeMapper.writeObject(__out, smagicinteract__smsMagic__r__typeInfo, smagicinteract__smsMagic__r, smagicinteract__smsMagic__r__is_set);
    __typeMapper.writeObject(__out, vr__VR_Email_History_Lead__r__typeInfo, vr__VR_Email_History_Lead__r, vr__VR_Email_History_Lead__r__is_set);
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
    if (__typeMapper.isElement(__in, AcceptedEventRelations__typeInfo)) {
      setAcceptedEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, AcceptedEventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ActivityHistories__typeInfo)) {
      setActivityHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ActivityHistories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address__typeInfo)) {
      setAddress((com.sforce.soap.enterprise.Address)__typeMapper.readObject(__in, Address__typeInfo, com.sforce.soap.enterprise.Address.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Address_is_Residential__c__typeInfo)) {
      setAddress_is_Residential__c((java.lang.Boolean)__typeMapper.readObject(__in, Address_is_Residential__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AnnualRevenue__typeInfo)) {
      setAnnualRevenue((java.lang.Double)__typeMapper.readObject(__in, AnnualRevenue__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, Campaign__typeInfo)) {
      setCampaign((com.sforce.soap.enterprise.sobject.Campaign)__typeMapper.readObject(__in, Campaign__typeInfo, com.sforce.soap.enterprise.sobject.Campaign.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CampaignMembers__typeInfo)) {
      setCampaignMembers((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CampaignMembers__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, City__typeInfo)) {
      setCity((java.lang.String)__typeMapper.readString(__in, City__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Company__typeInfo)) {
      setCompany((java.lang.String)__typeMapper.readString(__in, Company__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConvertedAccount__typeInfo)) {
      setConvertedAccount((com.sforce.soap.enterprise.sobject.Account)__typeMapper.readObject(__in, ConvertedAccount__typeInfo, com.sforce.soap.enterprise.sobject.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConvertedAccountId__typeInfo)) {
      setConvertedAccountId((java.lang.String)__typeMapper.readString(__in, ConvertedAccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConvertedContact__typeInfo)) {
      setConvertedContact((com.sforce.soap.enterprise.sobject.Contact)__typeMapper.readObject(__in, ConvertedContact__typeInfo, com.sforce.soap.enterprise.sobject.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConvertedContactId__typeInfo)) {
      setConvertedContactId((java.lang.String)__typeMapper.readString(__in, ConvertedContactId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConvertedDate__typeInfo)) {
      setConvertedDate((java.util.Calendar)__typeMapper.readObject(__in, ConvertedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConvertedOpportunity__typeInfo)) {
      setConvertedOpportunity((com.sforce.soap.enterprise.sobject.Opportunity)__typeMapper.readObject(__in, ConvertedOpportunity__typeInfo, com.sforce.soap.enterprise.sobject.Opportunity.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConvertedOpportunityId__typeInfo)) {
      setConvertedOpportunityId((java.lang.String)__typeMapper.readString(__in, ConvertedOpportunityId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Country__typeInfo)) {
      setCountry((java.lang.String)__typeMapper.readString(__in, Country__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Created_Date__c__typeInfo)) {
      setCreated_Date__c((java.util.Calendar)__typeMapper.readObject(__in, Created_Date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, DUNS_Number__c__typeInfo)) {
      setDUNS_Number__c((java.lang.String)__typeMapper.readString(__in, DUNS_Number__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, D_B_Prescreen_Score__c__typeInfo)) {
      setD_B_Prescreen_Score__c((java.lang.String)__typeMapper.readString(__in, D_B_Prescreen_Score__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Days_Since_Last_Activity__c__typeInfo)) {
      setDays_Since_Last_Activity__c((java.lang.Double)__typeMapper.readObject(__in, Days_Since_Last_Activity__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeclinedEventRelations__typeInfo)) {
      setDeclinedEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DeclinedEventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Disqualification_Reason__c__typeInfo)) {
      setDisqualification_Reason__c((java.lang.String)__typeMapper.readString(__in, Disqualification_Reason__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DuplicateRecordItems__typeInfo)) {
      setDuplicateRecordItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, DuplicateRecordItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email__typeInfo)) {
      setEmail((java.lang.String)__typeMapper.readString(__in, Email__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailBouncedDate__typeInfo)) {
      setEmailBouncedDate((java.util.Calendar)__typeMapper.readObject(__in, EmailBouncedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailBouncedReason__typeInfo)) {
      setEmailBouncedReason((java.lang.String)__typeMapper.readString(__in, EmailBouncedReason__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailMessageRelations__typeInfo)) {
      setEmailMessageRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EmailMessageRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EmailStatuses__typeInfo)) {
      setEmailStatuses((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EmailStatuses__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventRelations__typeInfo)) {
      setEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EventWhoRelations__typeInfo)) {
      setEventWhoRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, EventWhoRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Events__typeInfo)) {
      setEvents((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Events__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, FirstName__typeInfo)) {
      setFirstName((java.lang.String)__typeMapper.readString(__in, FirstName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GeocodeAccuracy__typeInfo)) {
      setGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, GeocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, HasOptedOutOfEmail__typeInfo)) {
      setHasOptedOutOfEmail((java.lang.Boolean)__typeMapper.readObject(__in, HasOptedOutOfEmail__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Histories__typeInfo)) {
      setHistories((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Histories__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Industries__c__typeInfo)) {
      setIndustries__c((java.lang.String)__typeMapper.readString(__in, Industries__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Industry__typeInfo)) {
      setIndustry((java.lang.String)__typeMapper.readString(__in, Industry__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsConverted__typeInfo)) {
      setIsConverted((java.lang.Boolean)__typeMapper.readObject(__in, IsConverted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsUnreadByOwner__typeInfo)) {
      setIsUnreadByOwner((java.lang.Boolean)__typeMapper.readObject(__in, IsUnreadByOwner__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Jigsaw__typeInfo)) {
      setJigsaw((java.lang.String)__typeMapper.readString(__in, Jigsaw__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JigsawContactId__typeInfo)) {
      setJigsawContactId((java.lang.String)__typeMapper.readString(__in, JigsawContactId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Known_Services_User__c__typeInfo)) {
      setKnown_Services_User__c((java.lang.Boolean)__typeMapper.readObject(__in, Known_Services_User__c__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, LastName__typeInfo)) {
      setLastName((java.lang.String)__typeMapper.readString(__in, LastName__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Latitude__typeInfo)) {
      setLatitude((java.lang.Double)__typeMapper.readObject(__in, Latitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LeadSource__typeInfo)) {
      setLeadSource((java.lang.String)__typeMapper.readString(__in, LeadSource__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Longitude__typeInfo)) {
      setLongitude((java.lang.Double)__typeMapper.readObject(__in, Longitude__typeInfo, java.lang.Double.class));
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
      setMasterRecord((com.sforce.soap.enterprise.sobject.Lead)__typeMapper.readObject(__in, MasterRecord__typeInfo, com.sforce.soap.enterprise.sobject.Lead.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MasterRecordId__typeInfo)) {
      setMasterRecordId((java.lang.String)__typeMapper.readString(__in, MasterRecordId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobilePhone__typeInfo)) {
      setMobilePhone((java.lang.String)__typeMapper.readString(__in, MobilePhone__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, NumberOfEmployees__typeInfo)) {
      setNumberOfEmployees((java.lang.Integer)__typeMapper.readObject(__in, NumberOfEmployees__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OpenActivities__typeInfo)) {
      setOpenActivities((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, OpenActivities__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Other_Phone__c__typeInfo)) {
      setOther_Phone__c((java.lang.String)__typeMapper.readString(__in, Other_Phone__c__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Personas__typeInfo)) {
      setPersonas((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Personas__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone__typeInfo)) {
      setPhone((java.lang.String)__typeMapper.readString(__in, Phone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone_Ext__c__typeInfo)) {
      setPhone_Ext__c((java.lang.String)__typeMapper.readString(__in, Phone_Ext__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PhotoUrl__typeInfo)) {
      setPhotoUrl((java.lang.String)__typeMapper.readString(__in, PhotoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PostalCode__typeInfo)) {
      setPostalCode((java.lang.String)__typeMapper.readString(__in, PostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Posts__typeInfo)) {
      setPosts((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Posts__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, Remove_From_Auto_Email__c__typeInfo)) {
      setRemove_From_Auto_Email__c((java.lang.Boolean)__typeMapper.readObject(__in, Remove_From_Auto_Email__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Salutation__typeInfo)) {
      setSalutation((java.lang.String)__typeMapper.readString(__in, Salutation__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Shares__typeInfo)) {
      setShares((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Shares__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__typeInfo)) {
      setState((java.lang.String)__typeMapper.readString(__in, State__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Street__typeInfo)) {
      setStreet((java.lang.String)__typeMapper.readString(__in, Street__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TaskWhoRelations__typeInfo)) {
      setTaskWhoRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TaskWhoRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tasks__typeInfo)) {
      setTasks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Tasks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Title__typeInfo)) {
      setTitle((java.lang.String)__typeMapper.readString(__in, Title__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicAssignments__typeInfo)) {
      setTopicAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, TopicAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UndecidedEventRelations__typeInfo)) {
      setUndecidedEventRelations((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UndecidedEventRelations__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserRecordAccess__typeInfo)) {
      setUserRecordAccess((com.sforce.soap.enterprise.sobject.UserRecordAccess)__typeMapper.readObject(__in, UserRecordAccess__typeInfo, com.sforce.soap.enterprise.sobject.UserRecordAccess.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, VCSSAP__VCSEmails__r__typeInfo)) {
      setVCSSAP__VCSEmails__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, VCSSAP__VCSEmails__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Website__typeInfo)) {
      setWebsite((java.lang.String)__typeMapper.readString(__in, Website__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, due_date__c__typeInfo)) {
      setDue_date__c((java.util.Calendar)__typeMapper.readObject(__in, due_date__c__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, dupcheck__dc3Web2Lead__c__typeInfo)) {
      setDupcheck__dc3Web2Lead__c((java.lang.Boolean)__typeMapper.readObject(__in, dupcheck__dc3Web2Lead__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements2__r__typeInfo)) {
      setEchosign_dev1__Agreements2__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements2__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements3__r__typeInfo)) {
      setEchosign_dev1__Agreements3__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements3__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, echosign_dev1__Agreements4__r__typeInfo)) {
      setEchosign_dev1__Agreements4__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Agreements4__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, echosign_dev1__Recipient_Templates__r__typeInfo)) {
      setEchosign_dev1__Recipient_Templates__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, echosign_dev1__Recipient_Templates__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__CreatedForUser__c__typeInfo)) {
      setI__CreatedForUser__c((java.lang.String)__typeMapper.readString(__in, i__CreatedForUser__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__CreatedForUser__r__typeInfo)) {
      setI__CreatedForUser__r((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, i__CreatedForUser__r__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__DaysSinceLastMail__c__typeInfo)) {
      setI__DaysSinceLastMail__c((java.lang.Double)__typeMapper.readObject(__in, i__DaysSinceLastMail__c__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, i__EmailAddrs__r__typeInfo)) {
      setI__EmailAddrs__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, i__EmailAddrs__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, i__OtherEmails__c__typeInfo)) {
      setI__OtherEmails__c((java.lang.String)__typeMapper.readString(__in, i__OtherEmails__c__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__Incoming_SMS__r__typeInfo)) {
      setSmagicinteract__Incoming_SMS__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, smagicinteract__Incoming_SMS__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__SMSOptOut__c__typeInfo)) {
      setSmagicinteract__SMSOptOut__c((java.lang.Boolean)__typeMapper.readObject(__in, smagicinteract__SMSOptOut__c__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, smagicinteract__smsMagic__r__typeInfo)) {
      setSmagicinteract__smsMagic__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, smagicinteract__smsMagic__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, vr__VR_Email_History_Lead__r__typeInfo)) {
      setVr__VR_Email_History_Lead__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, vr__VR_Email_History_Lead__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, webm__Webmerge_Documents__r__typeInfo)) {
      setWebm__Webmerge_Documents__r((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, webm__Webmerge_Documents__r__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Lead ");
    sb.append(super.toString());
    sb.append(" AcceptedEventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AcceptedEventRelations)+"'\n");
    sb.append(" ActivityHistories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityHistories)+"'\n");
    sb.append(" Address=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address)+"'\n");
    sb.append(" Address_is_Residential__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address_is_Residential__c)+"'\n");
    sb.append(" AnnualRevenue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AnnualRevenue)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" Attachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Attachments)+"'\n");
    sb.append(" Campaign=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Campaign)+"'\n");
    sb.append(" CampaignMembers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CampaignMembers)+"'\n");
    sb.append(" City=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" Company=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Company)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" ConvertedAccount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConvertedAccount)+"'\n");
    sb.append(" ConvertedAccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConvertedAccountId)+"'\n");
    sb.append(" ConvertedContact=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConvertedContact)+"'\n");
    sb.append(" ConvertedContactId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConvertedContactId)+"'\n");
    sb.append(" ConvertedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConvertedDate)+"'\n");
    sb.append(" ConvertedOpportunity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConvertedOpportunity)+"'\n");
    sb.append(" ConvertedOpportunityId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConvertedOpportunityId)+"'\n");
    sb.append(" Country=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Country)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Created_Date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Created_Date__c)+"'\n");
    sb.append(" Credit_Limit__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Limit__c)+"'\n");
    sb.append(" Credit_Rating__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Credit_Rating__c)+"'\n");
    sb.append(" DUNS_Number__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DUNS_Number__c)+"'\n");
    sb.append(" D_B_Prescreen_Score__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(D_B_Prescreen_Score__c)+"'\n");
    sb.append(" Days_Since_Last_Activity__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Days_Since_Last_Activity__c)+"'\n");
    sb.append(" DeclinedEventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeclinedEventRelations)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" Disqualification_Reason__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Disqualification_Reason__c)+"'\n");
    sb.append(" DuplicateRecordItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DuplicateRecordItems)+"'\n");
    sb.append(" Email=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email)+"'\n");
    sb.append(" EmailBouncedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailBouncedDate)+"'\n");
    sb.append(" EmailBouncedReason=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailBouncedReason)+"'\n");
    sb.append(" EmailMessageRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailMessageRelations)+"'\n");
    sb.append(" EmailStatuses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EmailStatuses)+"'\n");
    sb.append(" EventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventRelations)+"'\n");
    sb.append(" EventWhoRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EventWhoRelations)+"'\n");
    sb.append(" Events=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Events)+"'\n");
    sb.append(" Fax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fax)+"'\n");
    sb.append(" FeedSubscriptionsForEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FeedSubscriptionsForEntity)+"'\n");
    sb.append(" Feeds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Feeds)+"'\n");
    sb.append(" FirstName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FirstName)+"'\n");
    sb.append(" GeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GeocodeAccuracy)+"'\n");
    sb.append(" HasOptedOutOfEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(HasOptedOutOfEmail)+"'\n");
    sb.append(" Histories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Histories)+"'\n");
    sb.append(" Industries__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Industries__c)+"'\n");
    sb.append(" Industry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Industry)+"'\n");
    sb.append(" IsConverted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsConverted)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsUnreadByOwner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsUnreadByOwner)+"'\n");
    sb.append(" Jigsaw=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Jigsaw)+"'\n");
    sb.append(" JigsawContactId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JigsawContactId)+"'\n");
    sb.append(" Known_Services_User__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Known_Services_User__c)+"'\n");
    sb.append(" LastActivityDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastActivityDate)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" LastName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastName)+"'\n");
    sb.append(" LastReferencedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReferencedDate)+"'\n");
    sb.append(" LastViewedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastViewedDate)+"'\n");
    sb.append(" Latitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Latitude)+"'\n");
    sb.append(" LeadSource=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LeadSource)+"'\n");
    sb.append(" Longitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Longitude)+"'\n");
    sb.append(" LookedUpFromActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LookedUpFromActivities)+"'\n");
    sb.append(" MME__EmailMessages__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MME__EmailMessages__r)+"'\n");
    sb.append(" MasterRecord=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterRecord)+"'\n");
    sb.append(" MasterRecordId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterRecordId)+"'\n");
    sb.append(" MobilePhone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobilePhone)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" Nickname__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Nickname__c)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" NotesAndAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NotesAndAttachments)+"'\n");
    sb.append(" NumberOfEmployees=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfEmployees)+"'\n");
    sb.append(" OpenActivities=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OpenActivities)+"'\n");
    sb.append(" Other_Phone__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Other_Phone__c)+"'\n");
    sb.append(" Owner=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Owner)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" Personas=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Personas)+"'\n");
    sb.append(" Phone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone)+"'\n");
    sb.append(" Phone_Ext__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone_Ext__c)+"'\n");
    sb.append(" PhotoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PhotoUrl)+"'\n");
    sb.append(" PostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PostalCode)+"'\n");
    sb.append(" Posts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Posts)+"'\n");
    sb.append(" ProcessInstances=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessInstances)+"'\n");
    sb.append(" ProcessSteps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessSteps)+"'\n");
    sb.append(" Rating=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Rating)+"'\n");
    sb.append(" RecordAssociatedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordAssociatedGroups)+"'\n");
    sb.append(" RecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordType)+"'\n");
    sb.append(" RecordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecordTypeId)+"'\n");
    sb.append(" Remove_From_Auto_Email__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Remove_From_Auto_Email__c)+"'\n");
    sb.append(" Salutation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Salutation)+"'\n");
    sb.append(" Shares=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Shares)+"'\n");
    sb.append(" State=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" Street=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Street)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Tags=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tags)+"'\n");
    sb.append(" TaskRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskRelations)+"'\n");
    sb.append(" TaskWhoRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaskWhoRelations)+"'\n");
    sb.append(" Tasks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tasks)+"'\n");
    sb.append(" Title=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Title)+"'\n");
    sb.append(" TopicAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicAssignments)+"'\n");
    sb.append(" UndecidedEventRelations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UndecidedEventRelations)+"'\n");
    sb.append(" UserRecordAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserRecordAccess)+"'\n");
    sb.append(" VCSSAP__VCSEmails__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(VCSSAP__VCSEmails__r)+"'\n");
    sb.append(" Website=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Website)+"'\n");
    sb.append(" due_date__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(due_date__c)+"'\n");
    sb.append(" dupcheck__dc3DisableDuplicateCheck__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__dc3DisableDuplicateCheck__c)+"'\n");
    sb.append(" dupcheck__dc3Index__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__dc3Index__c)+"'\n");
    sb.append(" dupcheck__dc3Web2Lead__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dupcheck__dc3Web2Lead__c)+"'\n");
    sb.append(" echosign_dev1__Agreements2__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements2__r)+"'\n");
    sb.append(" echosign_dev1__Agreements3__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements3__r)+"'\n");
    sb.append(" echosign_dev1__Agreements4__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements4__r)+"'\n");
    sb.append(" echosign_dev1__Agreements__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Agreements__r)+"'\n");
    sb.append(" echosign_dev1__Echosign_Recipients__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Echosign_Recipients__r)+"'\n");
    sb.append(" echosign_dev1__Recipient_Templates__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(echosign_dev1__Recipient_Templates__r)+"'\n");
    sb.append(" i__CreatedForUser__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__CreatedForUser__c)+"'\n");
    sb.append(" i__CreatedForUser__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__CreatedForUser__r)+"'\n");
    sb.append(" i__DaysSinceLastMail__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__DaysSinceLastMail__c)+"'\n");
    sb.append(" i__EmailAddrs__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__EmailAddrs__r)+"'\n");
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
    sb.append(" i__OtherEmails__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(i__OtherEmails__c)+"'\n");
    sb.append(" smagicinteract__Incoming_SMS__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__Incoming_SMS__r)+"'\n");
    sb.append(" smagicinteract__SMSOptOut__c=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__SMSOptOut__c)+"'\n");
    sb.append(" smagicinteract__smsMagic__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(smagicinteract__smsMagic__r)+"'\n");
    sb.append(" vr__VR_Email_History_Lead__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(vr__VR_Email_History_Lead__r)+"'\n");
    sb.append(" webm__Webmerge_Documents__r=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(webm__Webmerge_Documents__r)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}