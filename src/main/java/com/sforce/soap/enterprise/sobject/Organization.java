package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Organization extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Organization() {
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
   * element  : ComplianceBccEmail of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ComplianceBccEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ComplianceBccEmail","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ComplianceBccEmail__is_set = false;

  private java.lang.String ComplianceBccEmail;

  public java.lang.String getComplianceBccEmail() {
    return ComplianceBccEmail;
  }

  

  public void setComplianceBccEmail(java.lang.String ComplianceBccEmail) {
    this.ComplianceBccEmail = ComplianceBccEmail;
    ComplianceBccEmail__is_set = true;
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
   * element  : CustomBrands of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo CustomBrands__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomBrands","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean CustomBrands__is_set = false;

  private com.sforce.soap.enterprise.QueryResult CustomBrands;

  public com.sforce.soap.enterprise.QueryResult getCustomBrands() {
    return CustomBrands;
  }

  

  public void setCustomBrands(com.sforce.soap.enterprise.QueryResult CustomBrands) {
    this.CustomBrands = CustomBrands;
    CustomBrands__is_set = true;
  }
  
  /**
   * element  : DefaultAccountAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultAccountAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultAccountAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultAccountAccess__is_set = false;

  private java.lang.String DefaultAccountAccess;

  public java.lang.String getDefaultAccountAccess() {
    return DefaultAccountAccess;
  }

  

  public void setDefaultAccountAccess(java.lang.String DefaultAccountAccess) {
    this.DefaultAccountAccess = DefaultAccountAccess;
    DefaultAccountAccess__is_set = true;
  }
  
  /**
   * element  : DefaultCalendarAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultCalendarAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultCalendarAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultCalendarAccess__is_set = false;

  private java.lang.String DefaultCalendarAccess;

  public java.lang.String getDefaultCalendarAccess() {
    return DefaultCalendarAccess;
  }

  

  public void setDefaultCalendarAccess(java.lang.String DefaultCalendarAccess) {
    this.DefaultCalendarAccess = DefaultCalendarAccess;
    DefaultCalendarAccess__is_set = true;
  }
  
  /**
   * element  : DefaultCampaignAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultCampaignAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultCampaignAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultCampaignAccess__is_set = false;

  private java.lang.String DefaultCampaignAccess;

  public java.lang.String getDefaultCampaignAccess() {
    return DefaultCampaignAccess;
  }

  

  public void setDefaultCampaignAccess(java.lang.String DefaultCampaignAccess) {
    this.DefaultCampaignAccess = DefaultCampaignAccess;
    DefaultCampaignAccess__is_set = true;
  }
  
  /**
   * element  : DefaultCaseAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultCaseAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultCaseAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultCaseAccess__is_set = false;

  private java.lang.String DefaultCaseAccess;

  public java.lang.String getDefaultCaseAccess() {
    return DefaultCaseAccess;
  }

  

  public void setDefaultCaseAccess(java.lang.String DefaultCaseAccess) {
    this.DefaultCaseAccess = DefaultCaseAccess;
    DefaultCaseAccess__is_set = true;
  }
  
  /**
   * element  : DefaultContactAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultContactAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultContactAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultContactAccess__is_set = false;

  private java.lang.String DefaultContactAccess;

  public java.lang.String getDefaultContactAccess() {
    return DefaultContactAccess;
  }

  

  public void setDefaultContactAccess(java.lang.String DefaultContactAccess) {
    this.DefaultContactAccess = DefaultContactAccess;
    DefaultContactAccess__is_set = true;
  }
  
  /**
   * element  : DefaultLeadAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultLeadAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultLeadAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultLeadAccess__is_set = false;

  private java.lang.String DefaultLeadAccess;

  public java.lang.String getDefaultLeadAccess() {
    return DefaultLeadAccess;
  }

  

  public void setDefaultLeadAccess(java.lang.String DefaultLeadAccess) {
    this.DefaultLeadAccess = DefaultLeadAccess;
    DefaultLeadAccess__is_set = true;
  }
  
  /**
   * element  : DefaultLocaleSidKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultLocaleSidKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultLocaleSidKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultLocaleSidKey__is_set = false;

  private java.lang.String DefaultLocaleSidKey;

  public java.lang.String getDefaultLocaleSidKey() {
    return DefaultLocaleSidKey;
  }

  

  public void setDefaultLocaleSidKey(java.lang.String DefaultLocaleSidKey) {
    this.DefaultLocaleSidKey = DefaultLocaleSidKey;
    DefaultLocaleSidKey__is_set = true;
  }
  
  /**
   * element  : DefaultOpportunityAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultOpportunityAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultOpportunityAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultOpportunityAccess__is_set = false;

  private java.lang.String DefaultOpportunityAccess;

  public java.lang.String getDefaultOpportunityAccess() {
    return DefaultOpportunityAccess;
  }

  

  public void setDefaultOpportunityAccess(java.lang.String DefaultOpportunityAccess) {
    this.DefaultOpportunityAccess = DefaultOpportunityAccess;
    DefaultOpportunityAccess__is_set = true;
  }
  
  /**
   * element  : DefaultPricebookAccess of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultPricebookAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultPricebookAccess","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultPricebookAccess__is_set = false;

  private java.lang.String DefaultPricebookAccess;

  public java.lang.String getDefaultPricebookAccess() {
    return DefaultPricebookAccess;
  }

  

  public void setDefaultPricebookAccess(java.lang.String DefaultPricebookAccess) {
    this.DefaultPricebookAccess = DefaultPricebookAccess;
    DefaultPricebookAccess__is_set = true;
  }
  
  /**
   * element  : DelegatedAuthenticationServiceUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DelegatedAuthenticationServiceUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DelegatedAuthenticationServiceUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DelegatedAuthenticationServiceUrl__is_set = false;

  private java.lang.String DelegatedAuthenticationServiceUrl;

  public java.lang.String getDelegatedAuthenticationServiceUrl() {
    return DelegatedAuthenticationServiceUrl;
  }

  

  public void setDelegatedAuthenticationServiceUrl(java.lang.String DelegatedAuthenticationServiceUrl) {
    this.DelegatedAuthenticationServiceUrl = DelegatedAuthenticationServiceUrl;
    DelegatedAuthenticationServiceUrl__is_set = true;
  }
  
  /**
   * element  : Division of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Division__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Division","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Division__is_set = false;

  private java.lang.String Division;

  public java.lang.String getDivision() {
    return Division;
  }

  

  public void setDivision(java.lang.String Division) {
    this.Division = Division;
    Division__is_set = true;
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
   * element  : FiscalYearStartMonth of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo FiscalYearStartMonth__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FiscalYearStartMonth","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean FiscalYearStartMonth__is_set = false;

  private java.lang.Integer FiscalYearStartMonth;

  public java.lang.Integer getFiscalYearStartMonth() {
    return FiscalYearStartMonth;
  }

  

  public void setFiscalYearStartMonth(java.lang.Integer FiscalYearStartMonth) {
    this.FiscalYearStartMonth = FiscalYearStartMonth;
    FiscalYearStartMonth__is_set = true;
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
   * element  : InstanceName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InstanceName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InstanceName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean InstanceName__is_set = false;

  private java.lang.String InstanceName;

  public java.lang.String getInstanceName() {
    return InstanceName;
  }

  

  public void setInstanceName(java.lang.String InstanceName) {
    this.InstanceName = InstanceName;
    InstanceName__is_set = true;
  }
  
  /**
   * element  : IsReadOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsReadOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsReadOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsReadOnly__is_set = false;

  private java.lang.Boolean IsReadOnly;

  public java.lang.Boolean getIsReadOnly() {
    return IsReadOnly;
  }

  

  public void setIsReadOnly(java.lang.Boolean IsReadOnly) {
    this.IsReadOnly = IsReadOnly;
    IsReadOnly__is_set = true;
  }
  
  /**
   * element  : IsSandbox of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsSandbox__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsSandbox","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsSandbox__is_set = false;

  private java.lang.Boolean IsSandbox;

  public java.lang.Boolean getIsSandbox() {
    return IsSandbox;
  }

  

  public void setIsSandbox(java.lang.Boolean IsSandbox) {
    this.IsSandbox = IsSandbox;
    IsSandbox__is_set = true;
  }
  
  /**
   * element  : LanguageLocaleKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LanguageLocaleKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LanguageLocaleKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LanguageLocaleKey__is_set = false;

  private java.lang.String LanguageLocaleKey;

  public java.lang.String getLanguageLocaleKey() {
    return LanguageLocaleKey;
  }

  

  public void setLanguageLocaleKey(java.lang.String LanguageLocaleKey) {
    this.LanguageLocaleKey = LanguageLocaleKey;
    LanguageLocaleKey__is_set = true;
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
   * element  : MonthlyPageViewsEntitlement of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MonthlyPageViewsEntitlement__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MonthlyPageViewsEntitlement","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MonthlyPageViewsEntitlement__is_set = false;

  private java.lang.Integer MonthlyPageViewsEntitlement;

  public java.lang.Integer getMonthlyPageViewsEntitlement() {
    return MonthlyPageViewsEntitlement;
  }

  

  public void setMonthlyPageViewsEntitlement(java.lang.Integer MonthlyPageViewsEntitlement) {
    this.MonthlyPageViewsEntitlement = MonthlyPageViewsEntitlement;
    MonthlyPageViewsEntitlement__is_set = true;
  }
  
  /**
   * element  : MonthlyPageViewsUsed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MonthlyPageViewsUsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MonthlyPageViewsUsed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MonthlyPageViewsUsed__is_set = false;

  private java.lang.Integer MonthlyPageViewsUsed;

  public java.lang.Integer getMonthlyPageViewsUsed() {
    return MonthlyPageViewsUsed;
  }

  

  public void setMonthlyPageViewsUsed(java.lang.Integer MonthlyPageViewsUsed) {
    this.MonthlyPageViewsUsed = MonthlyPageViewsUsed;
    MonthlyPageViewsUsed__is_set = true;
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
   * element  : NamespacePrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NamespacePrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NamespacePrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean NamespacePrefix__is_set = false;

  private java.lang.String NamespacePrefix;

  public java.lang.String getNamespacePrefix() {
    return NamespacePrefix;
  }

  

  public void setNamespacePrefix(java.lang.String NamespacePrefix) {
    this.NamespacePrefix = NamespacePrefix;
    NamespacePrefix__is_set = true;
  }
  
  /**
   * element  : OrganizationType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OrganizationType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OrganizationType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean OrganizationType__is_set = false;

  private java.lang.String OrganizationType;

  public java.lang.String getOrganizationType() {
    return OrganizationType;
  }

  

  public void setOrganizationType(java.lang.String OrganizationType) {
    this.OrganizationType = OrganizationType;
    OrganizationType__is_set = true;
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
   * element  : PreferencesRequireOpportunityProducts of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PreferencesRequireOpportunityProducts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreferencesRequireOpportunityProducts","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PreferencesRequireOpportunityProducts__is_set = false;

  private java.lang.Boolean PreferencesRequireOpportunityProducts;

  public java.lang.Boolean getPreferencesRequireOpportunityProducts() {
    return PreferencesRequireOpportunityProducts;
  }

  

  public void setPreferencesRequireOpportunityProducts(java.lang.Boolean PreferencesRequireOpportunityProducts) {
    this.PreferencesRequireOpportunityProducts = PreferencesRequireOpportunityProducts;
    PreferencesRequireOpportunityProducts__is_set = true;
  }
  
  /**
   * element  : PrimaryContact of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PrimaryContact__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PrimaryContact","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PrimaryContact__is_set = false;

  private java.lang.String PrimaryContact;

  public java.lang.String getPrimaryContact() {
    return PrimaryContact;
  }

  

  public void setPrimaryContact(java.lang.String PrimaryContact) {
    this.PrimaryContact = PrimaryContact;
    PrimaryContact__is_set = true;
  }
  
  /**
   * element  : ReceivesAdminInfoEmails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ReceivesAdminInfoEmails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReceivesAdminInfoEmails","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ReceivesAdminInfoEmails__is_set = false;

  private java.lang.Boolean ReceivesAdminInfoEmails;

  public java.lang.Boolean getReceivesAdminInfoEmails() {
    return ReceivesAdminInfoEmails;
  }

  

  public void setReceivesAdminInfoEmails(java.lang.Boolean ReceivesAdminInfoEmails) {
    this.ReceivesAdminInfoEmails = ReceivesAdminInfoEmails;
    ReceivesAdminInfoEmails__is_set = true;
  }
  
  /**
   * element  : ReceivesInfoEmails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ReceivesInfoEmails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReceivesInfoEmails","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ReceivesInfoEmails__is_set = false;

  private java.lang.Boolean ReceivesInfoEmails;

  public java.lang.Boolean getReceivesInfoEmails() {
    return ReceivesInfoEmails;
  }

  

  public void setReceivesInfoEmails(java.lang.Boolean ReceivesInfoEmails) {
    this.ReceivesInfoEmails = ReceivesInfoEmails;
    ReceivesInfoEmails__is_set = true;
  }
  
  /**
   * element  : SignupCountryIsoCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SignupCountryIsoCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SignupCountryIsoCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SignupCountryIsoCode__is_set = false;

  private java.lang.String SignupCountryIsoCode;

  public java.lang.String getSignupCountryIsoCode() {
    return SignupCountryIsoCode;
  }

  

  public void setSignupCountryIsoCode(java.lang.String SignupCountryIsoCode) {
    this.SignupCountryIsoCode = SignupCountryIsoCode;
    SignupCountryIsoCode__is_set = true;
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
   * element  : TrialExpirationDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo TrialExpirationDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TrialExpirationDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean TrialExpirationDate__is_set = false;

  private java.util.Calendar TrialExpirationDate;

  public java.util.Calendar getTrialExpirationDate() {
    return TrialExpirationDate;
  }

  

  public void setTrialExpirationDate(java.util.Calendar TrialExpirationDate) {
    this.TrialExpirationDate = TrialExpirationDate;
    TrialExpirationDate__is_set = true;
  }
  
  /**
   * element  : UiSkin of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UiSkin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UiSkin","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UiSkin__is_set = false;

  private java.lang.String UiSkin;

  public java.lang.String getUiSkin() {
    return UiSkin;
  }

  

  public void setUiSkin(java.lang.String UiSkin) {
    this.UiSkin = UiSkin;
    UiSkin__is_set = true;
  }
  
  /**
   * element  : UsesStartDateAsFiscalYearName of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UsesStartDateAsFiscalYearName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsesStartDateAsFiscalYearName","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UsesStartDateAsFiscalYearName__is_set = false;

  private java.lang.Boolean UsesStartDateAsFiscalYearName;

  public java.lang.Boolean getUsesStartDateAsFiscalYearName() {
    return UsesStartDateAsFiscalYearName;
  }

  

  public void setUsesStartDateAsFiscalYearName(java.lang.Boolean UsesStartDateAsFiscalYearName) {
    this.UsesStartDateAsFiscalYearName = UsesStartDateAsFiscalYearName;
    UsesStartDateAsFiscalYearName__is_set = true;
  }
  
  /**
   * element  : WebToCaseDefaultOrigin of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo WebToCaseDefaultOrigin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WebToCaseDefaultOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean WebToCaseDefaultOrigin__is_set = false;

  private java.lang.String WebToCaseDefaultOrigin;

  public java.lang.String getWebToCaseDefaultOrigin() {
    return WebToCaseDefaultOrigin;
  }

  

  public void setWebToCaseDefaultOrigin(java.lang.String WebToCaseDefaultOrigin) {
    this.WebToCaseDefaultOrigin = WebToCaseDefaultOrigin;
    WebToCaseDefaultOrigin__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Organization");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Address__typeInfo, Address, Address__is_set);
    __typeMapper.writeObject(__out, AttachedContentDocuments__typeInfo, AttachedContentDocuments, AttachedContentDocuments__is_set);
    __typeMapper.writeObject(__out, AttachedContentNotes__typeInfo, AttachedContentNotes, AttachedContentNotes__is_set);
    __typeMapper.writeString(__out, City__typeInfo, City, City__is_set);
    __typeMapper.writeObject(__out, CombinedAttachments__typeInfo, CombinedAttachments, CombinedAttachments__is_set);
    __typeMapper.writeString(__out, ComplianceBccEmail__typeInfo, ComplianceBccEmail, ComplianceBccEmail__is_set);
    __typeMapper.writeObject(__out, ContentDocumentLinks__typeInfo, ContentDocumentLinks, ContentDocumentLinks__is_set);
    __typeMapper.writeString(__out, Country__typeInfo, Country, Country__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, CustomBrands__typeInfo, CustomBrands, CustomBrands__is_set);
    __typeMapper.writeString(__out, DefaultAccountAccess__typeInfo, DefaultAccountAccess, DefaultAccountAccess__is_set);
    __typeMapper.writeString(__out, DefaultCalendarAccess__typeInfo, DefaultCalendarAccess, DefaultCalendarAccess__is_set);
    __typeMapper.writeString(__out, DefaultCampaignAccess__typeInfo, DefaultCampaignAccess, DefaultCampaignAccess__is_set);
    __typeMapper.writeString(__out, DefaultCaseAccess__typeInfo, DefaultCaseAccess, DefaultCaseAccess__is_set);
    __typeMapper.writeString(__out, DefaultContactAccess__typeInfo, DefaultContactAccess, DefaultContactAccess__is_set);
    __typeMapper.writeString(__out, DefaultLeadAccess__typeInfo, DefaultLeadAccess, DefaultLeadAccess__is_set);
    __typeMapper.writeString(__out, DefaultLocaleSidKey__typeInfo, DefaultLocaleSidKey, DefaultLocaleSidKey__is_set);
    __typeMapper.writeString(__out, DefaultOpportunityAccess__typeInfo, DefaultOpportunityAccess, DefaultOpportunityAccess__is_set);
    __typeMapper.writeString(__out, DefaultPricebookAccess__typeInfo, DefaultPricebookAccess, DefaultPricebookAccess__is_set);
    __typeMapper.writeString(__out, DelegatedAuthenticationServiceUrl__typeInfo, DelegatedAuthenticationServiceUrl, DelegatedAuthenticationServiceUrl__is_set);
    __typeMapper.writeString(__out, Division__typeInfo, Division, Division__is_set);
    __typeMapper.writeString(__out, Fax__typeInfo, Fax, Fax__is_set);
    __typeMapper.writeObject(__out, FiscalYearStartMonth__typeInfo, FiscalYearStartMonth, FiscalYearStartMonth__is_set);
    __typeMapper.writeString(__out, GeocodeAccuracy__typeInfo, GeocodeAccuracy, GeocodeAccuracy__is_set);
    __typeMapper.writeString(__out, InstanceName__typeInfo, InstanceName, InstanceName__is_set);
    __typeMapper.writeObject(__out, IsReadOnly__typeInfo, IsReadOnly, IsReadOnly__is_set);
    __typeMapper.writeObject(__out, IsSandbox__typeInfo, IsSandbox, IsSandbox__is_set);
    __typeMapper.writeString(__out, LanguageLocaleKey__typeInfo, LanguageLocaleKey, LanguageLocaleKey__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, Latitude__typeInfo, Latitude, Latitude__is_set);
    __typeMapper.writeObject(__out, Longitude__typeInfo, Longitude, Longitude__is_set);
    __typeMapper.writeObject(__out, MonthlyPageViewsEntitlement__typeInfo, MonthlyPageViewsEntitlement, MonthlyPageViewsEntitlement__is_set);
    __typeMapper.writeObject(__out, MonthlyPageViewsUsed__typeInfo, MonthlyPageViewsUsed, MonthlyPageViewsUsed__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeString(__out, OrganizationType__typeInfo, OrganizationType, OrganizationType__is_set);
    __typeMapper.writeString(__out, Phone__typeInfo, Phone, Phone__is_set);
    __typeMapper.writeString(__out, PostalCode__typeInfo, PostalCode, PostalCode__is_set);
    __typeMapper.writeObject(__out, PreferencesRequireOpportunityProducts__typeInfo, PreferencesRequireOpportunityProducts, PreferencesRequireOpportunityProducts__is_set);
    __typeMapper.writeString(__out, PrimaryContact__typeInfo, PrimaryContact, PrimaryContact__is_set);
    __typeMapper.writeObject(__out, ReceivesAdminInfoEmails__typeInfo, ReceivesAdminInfoEmails, ReceivesAdminInfoEmails__is_set);
    __typeMapper.writeObject(__out, ReceivesInfoEmails__typeInfo, ReceivesInfoEmails, ReceivesInfoEmails__is_set);
    __typeMapper.writeString(__out, SignupCountryIsoCode__typeInfo, SignupCountryIsoCode, SignupCountryIsoCode__is_set);
    __typeMapper.writeString(__out, State__typeInfo, State, State__is_set);
    __typeMapper.writeString(__out, Street__typeInfo, Street, Street__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TrialExpirationDate__typeInfo, TrialExpirationDate, TrialExpirationDate__is_set);
    __typeMapper.writeString(__out, UiSkin__typeInfo, UiSkin, UiSkin__is_set);
    __typeMapper.writeObject(__out, UsesStartDateAsFiscalYearName__typeInfo, UsesStartDateAsFiscalYearName, UsesStartDateAsFiscalYearName__is_set);
    __typeMapper.writeString(__out, WebToCaseDefaultOrigin__typeInfo, WebToCaseDefaultOrigin, WebToCaseDefaultOrigin__is_set);
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
    if (__typeMapper.isElement(__in, Address__typeInfo)) {
      setAddress((com.sforce.soap.enterprise.Address)__typeMapper.readObject(__in, Address__typeInfo, com.sforce.soap.enterprise.Address.class));
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
    if (__typeMapper.isElement(__in, City__typeInfo)) {
      setCity((java.lang.String)__typeMapper.readString(__in, City__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CombinedAttachments__typeInfo)) {
      setCombinedAttachments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CombinedAttachments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ComplianceBccEmail__typeInfo)) {
      setComplianceBccEmail((java.lang.String)__typeMapper.readString(__in, ComplianceBccEmail__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContentDocumentLinks__typeInfo)) {
      setContentDocumentLinks((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ContentDocumentLinks__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, CustomBrands__typeInfo)) {
      setCustomBrands((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, CustomBrands__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultAccountAccess__typeInfo)) {
      setDefaultAccountAccess((java.lang.String)__typeMapper.readString(__in, DefaultAccountAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultCalendarAccess__typeInfo)) {
      setDefaultCalendarAccess((java.lang.String)__typeMapper.readString(__in, DefaultCalendarAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultCampaignAccess__typeInfo)) {
      setDefaultCampaignAccess((java.lang.String)__typeMapper.readString(__in, DefaultCampaignAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultCaseAccess__typeInfo)) {
      setDefaultCaseAccess((java.lang.String)__typeMapper.readString(__in, DefaultCaseAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultContactAccess__typeInfo)) {
      setDefaultContactAccess((java.lang.String)__typeMapper.readString(__in, DefaultContactAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultLeadAccess__typeInfo)) {
      setDefaultLeadAccess((java.lang.String)__typeMapper.readString(__in, DefaultLeadAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultLocaleSidKey__typeInfo)) {
      setDefaultLocaleSidKey((java.lang.String)__typeMapper.readString(__in, DefaultLocaleSidKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultOpportunityAccess__typeInfo)) {
      setDefaultOpportunityAccess((java.lang.String)__typeMapper.readString(__in, DefaultOpportunityAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultPricebookAccess__typeInfo)) {
      setDefaultPricebookAccess((java.lang.String)__typeMapper.readString(__in, DefaultPricebookAccess__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DelegatedAuthenticationServiceUrl__typeInfo)) {
      setDelegatedAuthenticationServiceUrl((java.lang.String)__typeMapper.readString(__in, DelegatedAuthenticationServiceUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Division__typeInfo)) {
      setDivision((java.lang.String)__typeMapper.readString(__in, Division__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Fax__typeInfo)) {
      setFax((java.lang.String)__typeMapper.readString(__in, Fax__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FiscalYearStartMonth__typeInfo)) {
      setFiscalYearStartMonth((java.lang.Integer)__typeMapper.readObject(__in, FiscalYearStartMonth__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GeocodeAccuracy__typeInfo)) {
      setGeocodeAccuracy((java.lang.String)__typeMapper.readString(__in, GeocodeAccuracy__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InstanceName__typeInfo)) {
      setInstanceName((java.lang.String)__typeMapper.readString(__in, InstanceName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsReadOnly__typeInfo)) {
      setIsReadOnly((java.lang.Boolean)__typeMapper.readObject(__in, IsReadOnly__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsSandbox__typeInfo)) {
      setIsSandbox((java.lang.Boolean)__typeMapper.readObject(__in, IsSandbox__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LanguageLocaleKey__typeInfo)) {
      setLanguageLocaleKey((java.lang.String)__typeMapper.readString(__in, LanguageLocaleKey__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Latitude__typeInfo)) {
      setLatitude((java.lang.Double)__typeMapper.readObject(__in, Latitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Longitude__typeInfo)) {
      setLongitude((java.lang.Double)__typeMapper.readObject(__in, Longitude__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MonthlyPageViewsEntitlement__typeInfo)) {
      setMonthlyPageViewsEntitlement((java.lang.Integer)__typeMapper.readObject(__in, MonthlyPageViewsEntitlement__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MonthlyPageViewsUsed__typeInfo)) {
      setMonthlyPageViewsUsed((java.lang.Integer)__typeMapper.readObject(__in, MonthlyPageViewsUsed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OrganizationType__typeInfo)) {
      setOrganizationType((java.lang.String)__typeMapper.readString(__in, OrganizationType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone__typeInfo)) {
      setPhone((java.lang.String)__typeMapper.readString(__in, Phone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PostalCode__typeInfo)) {
      setPostalCode((java.lang.String)__typeMapper.readString(__in, PostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreferencesRequireOpportunityProducts__typeInfo)) {
      setPreferencesRequireOpportunityProducts((java.lang.Boolean)__typeMapper.readObject(__in, PreferencesRequireOpportunityProducts__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PrimaryContact__typeInfo)) {
      setPrimaryContact((java.lang.String)__typeMapper.readString(__in, PrimaryContact__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReceivesAdminInfoEmails__typeInfo)) {
      setReceivesAdminInfoEmails((java.lang.Boolean)__typeMapper.readObject(__in, ReceivesAdminInfoEmails__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReceivesInfoEmails__typeInfo)) {
      setReceivesInfoEmails((java.lang.Boolean)__typeMapper.readObject(__in, ReceivesInfoEmails__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SignupCountryIsoCode__typeInfo)) {
      setSignupCountryIsoCode((java.lang.String)__typeMapper.readString(__in, SignupCountryIsoCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__typeInfo)) {
      setState((java.lang.String)__typeMapper.readString(__in, State__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, TrialExpirationDate__typeInfo)) {
      setTrialExpirationDate((java.util.Calendar)__typeMapper.readObject(__in, TrialExpirationDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UiSkin__typeInfo)) {
      setUiSkin((java.lang.String)__typeMapper.readString(__in, UiSkin__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsesStartDateAsFiscalYearName__typeInfo)) {
      setUsesStartDateAsFiscalYearName((java.lang.Boolean)__typeMapper.readObject(__in, UsesStartDateAsFiscalYearName__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WebToCaseDefaultOrigin__typeInfo)) {
      setWebToCaseDefaultOrigin((java.lang.String)__typeMapper.readString(__in, WebToCaseDefaultOrigin__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Organization ");
    sb.append(super.toString());
    sb.append(" Address=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Address)+"'\n");
    sb.append(" AttachedContentDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentDocuments)+"'\n");
    sb.append(" AttachedContentNotes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AttachedContentNotes)+"'\n");
    sb.append(" City=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(City)+"'\n");
    sb.append(" CombinedAttachments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CombinedAttachments)+"'\n");
    sb.append(" ComplianceBccEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ComplianceBccEmail)+"'\n");
    sb.append(" ContentDocumentLinks=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContentDocumentLinks)+"'\n");
    sb.append(" Country=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Country)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CustomBrands=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomBrands)+"'\n");
    sb.append(" DefaultAccountAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultAccountAccess)+"'\n");
    sb.append(" DefaultCalendarAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultCalendarAccess)+"'\n");
    sb.append(" DefaultCampaignAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultCampaignAccess)+"'\n");
    sb.append(" DefaultCaseAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultCaseAccess)+"'\n");
    sb.append(" DefaultContactAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultContactAccess)+"'\n");
    sb.append(" DefaultLeadAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultLeadAccess)+"'\n");
    sb.append(" DefaultLocaleSidKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultLocaleSidKey)+"'\n");
    sb.append(" DefaultOpportunityAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultOpportunityAccess)+"'\n");
    sb.append(" DefaultPricebookAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultPricebookAccess)+"'\n");
    sb.append(" DelegatedAuthenticationServiceUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DelegatedAuthenticationServiceUrl)+"'\n");
    sb.append(" Division=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Division)+"'\n");
    sb.append(" Fax=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Fax)+"'\n");
    sb.append(" FiscalYearStartMonth=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FiscalYearStartMonth)+"'\n");
    sb.append(" GeocodeAccuracy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GeocodeAccuracy)+"'\n");
    sb.append(" InstanceName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InstanceName)+"'\n");
    sb.append(" IsReadOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsReadOnly)+"'\n");
    sb.append(" IsSandbox=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsSandbox)+"'\n");
    sb.append(" LanguageLocaleKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LanguageLocaleKey)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Latitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Latitude)+"'\n");
    sb.append(" Longitude=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Longitude)+"'\n");
    sb.append(" MonthlyPageViewsEntitlement=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MonthlyPageViewsEntitlement)+"'\n");
    sb.append(" MonthlyPageViewsUsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MonthlyPageViewsUsed)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" OrganizationType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OrganizationType)+"'\n");
    sb.append(" Phone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone)+"'\n");
    sb.append(" PostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PostalCode)+"'\n");
    sb.append(" PreferencesRequireOpportunityProducts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreferencesRequireOpportunityProducts)+"'\n");
    sb.append(" PrimaryContact=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PrimaryContact)+"'\n");
    sb.append(" ReceivesAdminInfoEmails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReceivesAdminInfoEmails)+"'\n");
    sb.append(" ReceivesInfoEmails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReceivesInfoEmails)+"'\n");
    sb.append(" SignupCountryIsoCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SignupCountryIsoCode)+"'\n");
    sb.append(" State=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State)+"'\n");
    sb.append(" Street=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Street)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TrialExpirationDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TrialExpirationDate)+"'\n");
    sb.append(" UiSkin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UiSkin)+"'\n");
    sb.append(" UsesStartDateAsFiscalYearName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsesStartDateAsFiscalYearName)+"'\n");
    sb.append(" WebToCaseDefaultOrigin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WebToCaseDefaultOrigin)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}