package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class PermissionSetLicense extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public PermissionSetLicense() {
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
   * element  : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DeveloperName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DeveloperName__is_set = false;

  private java.lang.String DeveloperName;

  public java.lang.String getDeveloperName() {
    return DeveloperName;
  }

  

  public void setDeveloperName(java.lang.String DeveloperName) {
    this.DeveloperName = DeveloperName;
    DeveloperName__is_set = true;
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
   * element  : GrantedByLicenses of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo GrantedByLicenses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","GrantedByLicenses","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean GrantedByLicenses__is_set = false;

  private com.sforce.soap.enterprise.QueryResult GrantedByLicenses;

  public com.sforce.soap.enterprise.QueryResult getGrantedByLicenses() {
    return GrantedByLicenses;
  }

  

  public void setGrantedByLicenses(com.sforce.soap.enterprise.QueryResult GrantedByLicenses) {
    this.GrantedByLicenses = GrantedByLicenses;
    GrantedByLicenses__is_set = true;
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
   * element  : Language of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Language__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Language","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Language__is_set = false;

  private java.lang.String Language;

  public java.lang.String getLanguage() {
    return Language;
  }

  

  public void setLanguage(java.lang.String Language) {
    this.Language = Language;
    Language__is_set = true;
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
   * element  : MasterLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MasterLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MasterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MasterLabel__is_set = false;

  private java.lang.String MasterLabel;

  public java.lang.String getMasterLabel() {
    return MasterLabel;
  }

  

  public void setMasterLabel(java.lang.String MasterLabel) {
    this.MasterLabel = MasterLabel;
    MasterLabel__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsActivateContract of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsActivateContract__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsActivateContract","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsActivateContract__is_set = false;

  private java.lang.Boolean MaximumPermissionsActivateContract;

  public java.lang.Boolean getMaximumPermissionsActivateContract() {
    return MaximumPermissionsActivateContract;
  }

  

  public void setMaximumPermissionsActivateContract(java.lang.Boolean MaximumPermissionsActivateContract) {
    this.MaximumPermissionsActivateContract = MaximumPermissionsActivateContract;
    MaximumPermissionsActivateContract__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsAllowEmailIC of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsAllowEmailIC__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsAllowEmailIC","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsAllowEmailIC__is_set = false;

  private java.lang.Boolean MaximumPermissionsAllowEmailIC;

  public java.lang.Boolean getMaximumPermissionsAllowEmailIC() {
    return MaximumPermissionsAllowEmailIC;
  }

  

  public void setMaximumPermissionsAllowEmailIC(java.lang.Boolean MaximumPermissionsAllowEmailIC) {
    this.MaximumPermissionsAllowEmailIC = MaximumPermissionsAllowEmailIC;
    MaximumPermissionsAllowEmailIC__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsAllowUniversalSearch of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsAllowUniversalSearch__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsAllowUniversalSearch","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsAllowUniversalSearch__is_set = false;

  private java.lang.Boolean MaximumPermissionsAllowUniversalSearch;

  public java.lang.Boolean getMaximumPermissionsAllowUniversalSearch() {
    return MaximumPermissionsAllowUniversalSearch;
  }

  

  public void setMaximumPermissionsAllowUniversalSearch(java.lang.Boolean MaximumPermissionsAllowUniversalSearch) {
    this.MaximumPermissionsAllowUniversalSearch = MaximumPermissionsAllowUniversalSearch;
    MaximumPermissionsAllowUniversalSearch__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsAllowViewKnowledge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsAllowViewKnowledge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsAllowViewKnowledge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsAllowViewKnowledge__is_set = false;

  private java.lang.Boolean MaximumPermissionsAllowViewKnowledge;

  public java.lang.Boolean getMaximumPermissionsAllowViewKnowledge() {
    return MaximumPermissionsAllowViewKnowledge;
  }

  

  public void setMaximumPermissionsAllowViewKnowledge(java.lang.Boolean MaximumPermissionsAllowViewKnowledge) {
    this.MaximumPermissionsAllowViewKnowledge = MaximumPermissionsAllowViewKnowledge;
    MaximumPermissionsAllowViewKnowledge__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsApiEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsApiEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsApiEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsApiEnabled__is_set = false;

  private java.lang.Boolean MaximumPermissionsApiEnabled;

  public java.lang.Boolean getMaximumPermissionsApiEnabled() {
    return MaximumPermissionsApiEnabled;
  }

  

  public void setMaximumPermissionsApiEnabled(java.lang.Boolean MaximumPermissionsApiEnabled) {
    this.MaximumPermissionsApiEnabled = MaximumPermissionsApiEnabled;
    MaximumPermissionsApiEnabled__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsApiUserOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsApiUserOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsApiUserOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsApiUserOnly__is_set = false;

  private java.lang.Boolean MaximumPermissionsApiUserOnly;

  public java.lang.Boolean getMaximumPermissionsApiUserOnly() {
    return MaximumPermissionsApiUserOnly;
  }

  

  public void setMaximumPermissionsApiUserOnly(java.lang.Boolean MaximumPermissionsApiUserOnly) {
    this.MaximumPermissionsApiUserOnly = MaximumPermissionsApiUserOnly;
    MaximumPermissionsApiUserOnly__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsAssignPermissionSets of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsAssignPermissionSets__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsAssignPermissionSets","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsAssignPermissionSets__is_set = false;

  private java.lang.Boolean MaximumPermissionsAssignPermissionSets;

  public java.lang.Boolean getMaximumPermissionsAssignPermissionSets() {
    return MaximumPermissionsAssignPermissionSets;
  }

  

  public void setMaximumPermissionsAssignPermissionSets(java.lang.Boolean MaximumPermissionsAssignPermissionSets) {
    this.MaximumPermissionsAssignPermissionSets = MaximumPermissionsAssignPermissionSets;
    MaximumPermissionsAssignPermissionSets__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsAssignTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsAssignTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsAssignTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsAssignTopics__is_set = false;

  private java.lang.Boolean MaximumPermissionsAssignTopics;

  public java.lang.Boolean getMaximumPermissionsAssignTopics() {
    return MaximumPermissionsAssignTopics;
  }

  

  public void setMaximumPermissionsAssignTopics(java.lang.Boolean MaximumPermissionsAssignTopics) {
    this.MaximumPermissionsAssignTopics = MaximumPermissionsAssignTopics;
    MaximumPermissionsAssignTopics__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsAuthorApex of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsAuthorApex__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsAuthorApex","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsAuthorApex__is_set = false;

  private java.lang.Boolean MaximumPermissionsAuthorApex;

  public java.lang.Boolean getMaximumPermissionsAuthorApex() {
    return MaximumPermissionsAuthorApex;
  }

  

  public void setMaximumPermissionsAuthorApex(java.lang.Boolean MaximumPermissionsAuthorApex) {
    this.MaximumPermissionsAuthorApex = MaximumPermissionsAuthorApex;
    MaximumPermissionsAuthorApex__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsBulkApiHardDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsBulkApiHardDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsBulkApiHardDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsBulkApiHardDelete__is_set = false;

  private java.lang.Boolean MaximumPermissionsBulkApiHardDelete;

  public java.lang.Boolean getMaximumPermissionsBulkApiHardDelete() {
    return MaximumPermissionsBulkApiHardDelete;
  }

  

  public void setMaximumPermissionsBulkApiHardDelete(java.lang.Boolean MaximumPermissionsBulkApiHardDelete) {
    this.MaximumPermissionsBulkApiHardDelete = MaximumPermissionsBulkApiHardDelete;
    MaximumPermissionsBulkApiHardDelete__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsBulkMacrosAllowed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsBulkMacrosAllowed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsBulkMacrosAllowed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsBulkMacrosAllowed__is_set = false;

  private java.lang.Boolean MaximumPermissionsBulkMacrosAllowed;

  public java.lang.Boolean getMaximumPermissionsBulkMacrosAllowed() {
    return MaximumPermissionsBulkMacrosAllowed;
  }

  

  public void setMaximumPermissionsBulkMacrosAllowed(java.lang.Boolean MaximumPermissionsBulkMacrosAllowed) {
    this.MaximumPermissionsBulkMacrosAllowed = MaximumPermissionsBulkMacrosAllowed;
    MaximumPermissionsBulkMacrosAllowed__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCampaignInfluence2 of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCampaignInfluence2__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCampaignInfluence2","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCampaignInfluence2__is_set = false;

  private java.lang.Boolean MaximumPermissionsCampaignInfluence2;

  public java.lang.Boolean getMaximumPermissionsCampaignInfluence2() {
    return MaximumPermissionsCampaignInfluence2;
  }

  

  public void setMaximumPermissionsCampaignInfluence2(java.lang.Boolean MaximumPermissionsCampaignInfluence2) {
    this.MaximumPermissionsCampaignInfluence2 = MaximumPermissionsCampaignInfluence2;
    MaximumPermissionsCampaignInfluence2__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCanApproveFeedPost of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCanApproveFeedPost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCanApproveFeedPost","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCanApproveFeedPost__is_set = false;

  private java.lang.Boolean MaximumPermissionsCanApproveFeedPost;

  public java.lang.Boolean getMaximumPermissionsCanApproveFeedPost() {
    return MaximumPermissionsCanApproveFeedPost;
  }

  

  public void setMaximumPermissionsCanApproveFeedPost(java.lang.Boolean MaximumPermissionsCanApproveFeedPost) {
    this.MaximumPermissionsCanApproveFeedPost = MaximumPermissionsCanApproveFeedPost;
    MaximumPermissionsCanApproveFeedPost__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCanInsertFeedSystemFields of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCanInsertFeedSystemFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCanInsertFeedSystemFields","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCanInsertFeedSystemFields__is_set = false;

  private java.lang.Boolean MaximumPermissionsCanInsertFeedSystemFields;

  public java.lang.Boolean getMaximumPermissionsCanInsertFeedSystemFields() {
    return MaximumPermissionsCanInsertFeedSystemFields;
  }

  

  public void setMaximumPermissionsCanInsertFeedSystemFields(java.lang.Boolean MaximumPermissionsCanInsertFeedSystemFields) {
    this.MaximumPermissionsCanInsertFeedSystemFields = MaximumPermissionsCanInsertFeedSystemFields;
    MaximumPermissionsCanInsertFeedSystemFields__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCanUseNewDashboardBuilder of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCanUseNewDashboardBuilder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCanUseNewDashboardBuilder","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCanUseNewDashboardBuilder__is_set = false;

  private java.lang.Boolean MaximumPermissionsCanUseNewDashboardBuilder;

  public java.lang.Boolean getMaximumPermissionsCanUseNewDashboardBuilder() {
    return MaximumPermissionsCanUseNewDashboardBuilder;
  }

  

  public void setMaximumPermissionsCanUseNewDashboardBuilder(java.lang.Boolean MaximumPermissionsCanUseNewDashboardBuilder) {
    this.MaximumPermissionsCanUseNewDashboardBuilder = MaximumPermissionsCanUseNewDashboardBuilder;
    MaximumPermissionsCanUseNewDashboardBuilder__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterComposeUiCodesnippet of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterComposeUiCodesnippet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterComposeUiCodesnippet","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterComposeUiCodesnippet__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterComposeUiCodesnippet;

  public java.lang.Boolean getMaximumPermissionsChatterComposeUiCodesnippet() {
    return MaximumPermissionsChatterComposeUiCodesnippet;
  }

  

  public void setMaximumPermissionsChatterComposeUiCodesnippet(java.lang.Boolean MaximumPermissionsChatterComposeUiCodesnippet) {
    this.MaximumPermissionsChatterComposeUiCodesnippet = MaximumPermissionsChatterComposeUiCodesnippet;
    MaximumPermissionsChatterComposeUiCodesnippet__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterEditOwnPost of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterEditOwnPost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterEditOwnPost","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterEditOwnPost__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterEditOwnPost;

  public java.lang.Boolean getMaximumPermissionsChatterEditOwnPost() {
    return MaximumPermissionsChatterEditOwnPost;
  }

  

  public void setMaximumPermissionsChatterEditOwnPost(java.lang.Boolean MaximumPermissionsChatterEditOwnPost) {
    this.MaximumPermissionsChatterEditOwnPost = MaximumPermissionsChatterEditOwnPost;
    MaximumPermissionsChatterEditOwnPost__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterEditOwnRecordPost of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterEditOwnRecordPost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterEditOwnRecordPost","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterEditOwnRecordPost__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterEditOwnRecordPost;

  public java.lang.Boolean getMaximumPermissionsChatterEditOwnRecordPost() {
    return MaximumPermissionsChatterEditOwnRecordPost;
  }

  

  public void setMaximumPermissionsChatterEditOwnRecordPost(java.lang.Boolean MaximumPermissionsChatterEditOwnRecordPost) {
    this.MaximumPermissionsChatterEditOwnRecordPost = MaximumPermissionsChatterEditOwnRecordPost;
    MaximumPermissionsChatterEditOwnRecordPost__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterFileLink of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterFileLink__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterFileLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterFileLink__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterFileLink;

  public java.lang.Boolean getMaximumPermissionsChatterFileLink() {
    return MaximumPermissionsChatterFileLink;
  }

  

  public void setMaximumPermissionsChatterFileLink(java.lang.Boolean MaximumPermissionsChatterFileLink) {
    this.MaximumPermissionsChatterFileLink = MaximumPermissionsChatterFileLink;
    MaximumPermissionsChatterFileLink__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterForSharePoint of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterForSharePoint__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterForSharePoint","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterForSharePoint__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterForSharePoint;

  public java.lang.Boolean getMaximumPermissionsChatterForSharePoint() {
    return MaximumPermissionsChatterForSharePoint;
  }

  

  public void setMaximumPermissionsChatterForSharePoint(java.lang.Boolean MaximumPermissionsChatterForSharePoint) {
    this.MaximumPermissionsChatterForSharePoint = MaximumPermissionsChatterForSharePoint;
    MaximumPermissionsChatterForSharePoint__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterInternalUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterInternalUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterInternalUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterInternalUser__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterInternalUser;

  public java.lang.Boolean getMaximumPermissionsChatterInternalUser() {
    return MaximumPermissionsChatterInternalUser;
  }

  

  public void setMaximumPermissionsChatterInternalUser(java.lang.Boolean MaximumPermissionsChatterInternalUser) {
    this.MaximumPermissionsChatterInternalUser = MaximumPermissionsChatterInternalUser;
    MaximumPermissionsChatterInternalUser__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterInviteExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterInviteExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterInviteExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterInviteExternalUsers__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterInviteExternalUsers;

  public java.lang.Boolean getMaximumPermissionsChatterInviteExternalUsers() {
    return MaximumPermissionsChatterInviteExternalUsers;
  }

  

  public void setMaximumPermissionsChatterInviteExternalUsers(java.lang.Boolean MaximumPermissionsChatterInviteExternalUsers) {
    this.MaximumPermissionsChatterInviteExternalUsers = MaximumPermissionsChatterInviteExternalUsers;
    MaximumPermissionsChatterInviteExternalUsers__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsChatterOwnGroups of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsChatterOwnGroups__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsChatterOwnGroups","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsChatterOwnGroups__is_set = false;

  private java.lang.Boolean MaximumPermissionsChatterOwnGroups;

  public java.lang.Boolean getMaximumPermissionsChatterOwnGroups() {
    return MaximumPermissionsChatterOwnGroups;
  }

  

  public void setMaximumPermissionsChatterOwnGroups(java.lang.Boolean MaximumPermissionsChatterOwnGroups) {
    this.MaximumPermissionsChatterOwnGroups = MaximumPermissionsChatterOwnGroups;
    MaximumPermissionsChatterOwnGroups__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsConfigCustomRecs of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsConfigCustomRecs__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsConfigCustomRecs","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsConfigCustomRecs__is_set = false;

  private java.lang.Boolean MaximumPermissionsConfigCustomRecs;

  public java.lang.Boolean getMaximumPermissionsConfigCustomRecs() {
    return MaximumPermissionsConfigCustomRecs;
  }

  

  public void setMaximumPermissionsConfigCustomRecs(java.lang.Boolean MaximumPermissionsConfigCustomRecs) {
    this.MaximumPermissionsConfigCustomRecs = MaximumPermissionsConfigCustomRecs;
    MaximumPermissionsConfigCustomRecs__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsConnectOrgToEnvironmentHub of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsConnectOrgToEnvironmentHub__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsConnectOrgToEnvironmentHub","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsConnectOrgToEnvironmentHub__is_set = false;

  private java.lang.Boolean MaximumPermissionsConnectOrgToEnvironmentHub;

  public java.lang.Boolean getMaximumPermissionsConnectOrgToEnvironmentHub() {
    return MaximumPermissionsConnectOrgToEnvironmentHub;
  }

  

  public void setMaximumPermissionsConnectOrgToEnvironmentHub(java.lang.Boolean MaximumPermissionsConnectOrgToEnvironmentHub) {
    this.MaximumPermissionsConnectOrgToEnvironmentHub = MaximumPermissionsConnectOrgToEnvironmentHub;
    MaximumPermissionsConnectOrgToEnvironmentHub__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsContentAdministrator of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsContentAdministrator__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsContentAdministrator","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsContentAdministrator__is_set = false;

  private java.lang.Boolean MaximumPermissionsContentAdministrator;

  public java.lang.Boolean getMaximumPermissionsContentAdministrator() {
    return MaximumPermissionsContentAdministrator;
  }

  

  public void setMaximumPermissionsContentAdministrator(java.lang.Boolean MaximumPermissionsContentAdministrator) {
    this.MaximumPermissionsContentAdministrator = MaximumPermissionsContentAdministrator;
    MaximumPermissionsContentAdministrator__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsContentHubUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsContentHubUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsContentHubUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsContentHubUser__is_set = false;

  private java.lang.Boolean MaximumPermissionsContentHubUser;

  public java.lang.Boolean getMaximumPermissionsContentHubUser() {
    return MaximumPermissionsContentHubUser;
  }

  

  public void setMaximumPermissionsContentHubUser(java.lang.Boolean MaximumPermissionsContentHubUser) {
    this.MaximumPermissionsContentHubUser = MaximumPermissionsContentHubUser;
    MaximumPermissionsContentHubUser__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsConvertLeads of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsConvertLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsConvertLeads","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsConvertLeads__is_set = false;

  private java.lang.Boolean MaximumPermissionsConvertLeads;

  public java.lang.Boolean getMaximumPermissionsConvertLeads() {
    return MaximumPermissionsConvertLeads;
  }

  

  public void setMaximumPermissionsConvertLeads(java.lang.Boolean MaximumPermissionsConvertLeads) {
    this.MaximumPermissionsConvertLeads = MaximumPermissionsConvertLeads;
    MaximumPermissionsConvertLeads__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCreateCustomizeFilters of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCreateCustomizeFilters__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCreateCustomizeFilters","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCreateCustomizeFilters__is_set = false;

  private java.lang.Boolean MaximumPermissionsCreateCustomizeFilters;

  public java.lang.Boolean getMaximumPermissionsCreateCustomizeFilters() {
    return MaximumPermissionsCreateCustomizeFilters;
  }

  

  public void setMaximumPermissionsCreateCustomizeFilters(java.lang.Boolean MaximumPermissionsCreateCustomizeFilters) {
    this.MaximumPermissionsCreateCustomizeFilters = MaximumPermissionsCreateCustomizeFilters;
    MaximumPermissionsCreateCustomizeFilters__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCreatePackaging of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCreatePackaging__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCreatePackaging","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCreatePackaging__is_set = false;

  private java.lang.Boolean MaximumPermissionsCreatePackaging;

  public java.lang.Boolean getMaximumPermissionsCreatePackaging() {
    return MaximumPermissionsCreatePackaging;
  }

  

  public void setMaximumPermissionsCreatePackaging(java.lang.Boolean MaximumPermissionsCreatePackaging) {
    this.MaximumPermissionsCreatePackaging = MaximumPermissionsCreatePackaging;
    MaximumPermissionsCreatePackaging__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCreateTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCreateTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCreateTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCreateTopics__is_set = false;

  private java.lang.Boolean MaximumPermissionsCreateTopics;

  public java.lang.Boolean getMaximumPermissionsCreateTopics() {
    return MaximumPermissionsCreateTopics;
  }

  

  public void setMaximumPermissionsCreateTopics(java.lang.Boolean MaximumPermissionsCreateTopics) {
    this.MaximumPermissionsCreateTopics = MaximumPermissionsCreateTopics;
    MaximumPermissionsCreateTopics__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCreateWorkBadgeDefinition of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCreateWorkBadgeDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCreateWorkBadgeDefinition","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCreateWorkBadgeDefinition__is_set = false;

  private java.lang.Boolean MaximumPermissionsCreateWorkBadgeDefinition;

  public java.lang.Boolean getMaximumPermissionsCreateWorkBadgeDefinition() {
    return MaximumPermissionsCreateWorkBadgeDefinition;
  }

  

  public void setMaximumPermissionsCreateWorkBadgeDefinition(java.lang.Boolean MaximumPermissionsCreateWorkBadgeDefinition) {
    this.MaximumPermissionsCreateWorkBadgeDefinition = MaximumPermissionsCreateWorkBadgeDefinition;
    MaximumPermissionsCreateWorkBadgeDefinition__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCreateWorkspaces of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCreateWorkspaces__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCreateWorkspaces","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCreateWorkspaces__is_set = false;

  private java.lang.Boolean MaximumPermissionsCreateWorkspaces;

  public java.lang.Boolean getMaximumPermissionsCreateWorkspaces() {
    return MaximumPermissionsCreateWorkspaces;
  }

  

  public void setMaximumPermissionsCreateWorkspaces(java.lang.Boolean MaximumPermissionsCreateWorkspaces) {
    this.MaximumPermissionsCreateWorkspaces = MaximumPermissionsCreateWorkspaces;
    MaximumPermissionsCreateWorkspaces__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCustomMobileAppsAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCustomMobileAppsAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCustomMobileAppsAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCustomMobileAppsAccess__is_set = false;

  private java.lang.Boolean MaximumPermissionsCustomMobileAppsAccess;

  public java.lang.Boolean getMaximumPermissionsCustomMobileAppsAccess() {
    return MaximumPermissionsCustomMobileAppsAccess;
  }

  

  public void setMaximumPermissionsCustomMobileAppsAccess(java.lang.Boolean MaximumPermissionsCustomMobileAppsAccess) {
    this.MaximumPermissionsCustomMobileAppsAccess = MaximumPermissionsCustomMobileAppsAccess;
    MaximumPermissionsCustomMobileAppsAccess__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsCustomizeApplication of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsCustomizeApplication__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsCustomizeApplication","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsCustomizeApplication__is_set = false;

  private java.lang.Boolean MaximumPermissionsCustomizeApplication;

  public java.lang.Boolean getMaximumPermissionsCustomizeApplication() {
    return MaximumPermissionsCustomizeApplication;
  }

  

  public void setMaximumPermissionsCustomizeApplication(java.lang.Boolean MaximumPermissionsCustomizeApplication) {
    this.MaximumPermissionsCustomizeApplication = MaximumPermissionsCustomizeApplication;
    MaximumPermissionsCustomizeApplication__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsDataExport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsDataExport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsDataExport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsDataExport__is_set = false;

  private java.lang.Boolean MaximumPermissionsDataExport;

  public java.lang.Boolean getMaximumPermissionsDataExport() {
    return MaximumPermissionsDataExport;
  }

  

  public void setMaximumPermissionsDataExport(java.lang.Boolean MaximumPermissionsDataExport) {
    this.MaximumPermissionsDataExport = MaximumPermissionsDataExport;
    MaximumPermissionsDataExport__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsDelegatedPortalUserAdmin of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsDelegatedPortalUserAdmin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsDelegatedPortalUserAdmin","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsDelegatedPortalUserAdmin__is_set = false;

  private java.lang.Boolean MaximumPermissionsDelegatedPortalUserAdmin;

  public java.lang.Boolean getMaximumPermissionsDelegatedPortalUserAdmin() {
    return MaximumPermissionsDelegatedPortalUserAdmin;
  }

  

  public void setMaximumPermissionsDelegatedPortalUserAdmin(java.lang.Boolean MaximumPermissionsDelegatedPortalUserAdmin) {
    this.MaximumPermissionsDelegatedPortalUserAdmin = MaximumPermissionsDelegatedPortalUserAdmin;
    MaximumPermissionsDelegatedPortalUserAdmin__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsDelegatedTwoFactor of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsDelegatedTwoFactor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsDelegatedTwoFactor","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsDelegatedTwoFactor__is_set = false;

  private java.lang.Boolean MaximumPermissionsDelegatedTwoFactor;

  public java.lang.Boolean getMaximumPermissionsDelegatedTwoFactor() {
    return MaximumPermissionsDelegatedTwoFactor;
  }

  

  public void setMaximumPermissionsDelegatedTwoFactor(java.lang.Boolean MaximumPermissionsDelegatedTwoFactor) {
    this.MaximumPermissionsDelegatedTwoFactor = MaximumPermissionsDelegatedTwoFactor;
    MaximumPermissionsDelegatedTwoFactor__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsDeleteActivatedContract of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsDeleteActivatedContract__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsDeleteActivatedContract","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsDeleteActivatedContract__is_set = false;

  private java.lang.Boolean MaximumPermissionsDeleteActivatedContract;

  public java.lang.Boolean getMaximumPermissionsDeleteActivatedContract() {
    return MaximumPermissionsDeleteActivatedContract;
  }

  

  public void setMaximumPermissionsDeleteActivatedContract(java.lang.Boolean MaximumPermissionsDeleteActivatedContract) {
    this.MaximumPermissionsDeleteActivatedContract = MaximumPermissionsDeleteActivatedContract;
    MaximumPermissionsDeleteActivatedContract__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsDeleteTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsDeleteTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsDeleteTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsDeleteTopics__is_set = false;

  private java.lang.Boolean MaximumPermissionsDeleteTopics;

  public java.lang.Boolean getMaximumPermissionsDeleteTopics() {
    return MaximumPermissionsDeleteTopics;
  }

  

  public void setMaximumPermissionsDeleteTopics(java.lang.Boolean MaximumPermissionsDeleteTopics) {
    this.MaximumPermissionsDeleteTopics = MaximumPermissionsDeleteTopics;
    MaximumPermissionsDeleteTopics__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsDistributeFromPersWksp of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsDistributeFromPersWksp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsDistributeFromPersWksp","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsDistributeFromPersWksp__is_set = false;

  private java.lang.Boolean MaximumPermissionsDistributeFromPersWksp;

  public java.lang.Boolean getMaximumPermissionsDistributeFromPersWksp() {
    return MaximumPermissionsDistributeFromPersWksp;
  }

  

  public void setMaximumPermissionsDistributeFromPersWksp(java.lang.Boolean MaximumPermissionsDistributeFromPersWksp) {
    this.MaximumPermissionsDistributeFromPersWksp = MaximumPermissionsDistributeFromPersWksp;
    MaximumPermissionsDistributeFromPersWksp__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditBrandTemplates of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditBrandTemplates__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditBrandTemplates","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditBrandTemplates__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditBrandTemplates;

  public java.lang.Boolean getMaximumPermissionsEditBrandTemplates() {
    return MaximumPermissionsEditBrandTemplates;
  }

  

  public void setMaximumPermissionsEditBrandTemplates(java.lang.Boolean MaximumPermissionsEditBrandTemplates) {
    this.MaximumPermissionsEditBrandTemplates = MaximumPermissionsEditBrandTemplates;
    MaximumPermissionsEditBrandTemplates__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditCaseComments of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditCaseComments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditCaseComments","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditCaseComments__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditCaseComments;

  public java.lang.Boolean getMaximumPermissionsEditCaseComments() {
    return MaximumPermissionsEditCaseComments;
  }

  

  public void setMaximumPermissionsEditCaseComments(java.lang.Boolean MaximumPermissionsEditCaseComments) {
    this.MaximumPermissionsEditCaseComments = MaximumPermissionsEditCaseComments;
    MaximumPermissionsEditCaseComments__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditEvent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditEvent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditEvent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditEvent__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditEvent;

  public java.lang.Boolean getMaximumPermissionsEditEvent() {
    return MaximumPermissionsEditEvent;
  }

  

  public void setMaximumPermissionsEditEvent(java.lang.Boolean MaximumPermissionsEditEvent) {
    this.MaximumPermissionsEditEvent = MaximumPermissionsEditEvent;
    MaximumPermissionsEditEvent__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditHtmlTemplates of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditHtmlTemplates__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditHtmlTemplates","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditHtmlTemplates__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditHtmlTemplates;

  public java.lang.Boolean getMaximumPermissionsEditHtmlTemplates() {
    return MaximumPermissionsEditHtmlTemplates;
  }

  

  public void setMaximumPermissionsEditHtmlTemplates(java.lang.Boolean MaximumPermissionsEditHtmlTemplates) {
    this.MaximumPermissionsEditHtmlTemplates = MaximumPermissionsEditHtmlTemplates;
    MaximumPermissionsEditHtmlTemplates__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditKnowledge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditKnowledge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditKnowledge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditKnowledge__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditKnowledge;

  public java.lang.Boolean getMaximumPermissionsEditKnowledge() {
    return MaximumPermissionsEditKnowledge;
  }

  

  public void setMaximumPermissionsEditKnowledge(java.lang.Boolean MaximumPermissionsEditKnowledge) {
    this.MaximumPermissionsEditKnowledge = MaximumPermissionsEditKnowledge;
    MaximumPermissionsEditKnowledge__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditOppLineItemUnitPrice of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditOppLineItemUnitPrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditOppLineItemUnitPrice","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditOppLineItemUnitPrice__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditOppLineItemUnitPrice;

  public java.lang.Boolean getMaximumPermissionsEditOppLineItemUnitPrice() {
    return MaximumPermissionsEditOppLineItemUnitPrice;
  }

  

  public void setMaximumPermissionsEditOppLineItemUnitPrice(java.lang.Boolean MaximumPermissionsEditOppLineItemUnitPrice) {
    this.MaximumPermissionsEditOppLineItemUnitPrice = MaximumPermissionsEditOppLineItemUnitPrice;
    MaximumPermissionsEditOppLineItemUnitPrice__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditPublicDocuments of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditPublicDocuments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditPublicDocuments","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditPublicDocuments__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditPublicDocuments;

  public java.lang.Boolean getMaximumPermissionsEditPublicDocuments() {
    return MaximumPermissionsEditPublicDocuments;
  }

  

  public void setMaximumPermissionsEditPublicDocuments(java.lang.Boolean MaximumPermissionsEditPublicDocuments) {
    this.MaximumPermissionsEditPublicDocuments = MaximumPermissionsEditPublicDocuments;
    MaximumPermissionsEditPublicDocuments__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditPublicTemplates of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditPublicTemplates__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditPublicTemplates","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditPublicTemplates__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditPublicTemplates;

  public java.lang.Boolean getMaximumPermissionsEditPublicTemplates() {
    return MaximumPermissionsEditPublicTemplates;
  }

  

  public void setMaximumPermissionsEditPublicTemplates(java.lang.Boolean MaximumPermissionsEditPublicTemplates) {
    this.MaximumPermissionsEditPublicTemplates = MaximumPermissionsEditPublicTemplates;
    MaximumPermissionsEditPublicTemplates__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditReadonlyFields of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditReadonlyFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditReadonlyFields","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditReadonlyFields__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditReadonlyFields;

  public java.lang.Boolean getMaximumPermissionsEditReadonlyFields() {
    return MaximumPermissionsEditReadonlyFields;
  }

  

  public void setMaximumPermissionsEditReadonlyFields(java.lang.Boolean MaximumPermissionsEditReadonlyFields) {
    this.MaximumPermissionsEditReadonlyFields = MaximumPermissionsEditReadonlyFields;
    MaximumPermissionsEditReadonlyFields__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditReports of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditReports__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditReports","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditReports__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditReports;

  public java.lang.Boolean getMaximumPermissionsEditReports() {
    return MaximumPermissionsEditReports;
  }

  

  public void setMaximumPermissionsEditReports(java.lang.Boolean MaximumPermissionsEditReports) {
    this.MaximumPermissionsEditReports = MaximumPermissionsEditReports;
    MaximumPermissionsEditReports__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditTask of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditTask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditTask","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditTask__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditTask;

  public java.lang.Boolean getMaximumPermissionsEditTask() {
    return MaximumPermissionsEditTask;
  }

  

  public void setMaximumPermissionsEditTask(java.lang.Boolean MaximumPermissionsEditTask) {
    this.MaximumPermissionsEditTask = MaximumPermissionsEditTask;
    MaximumPermissionsEditTask__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEditTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEditTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEditTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEditTopics__is_set = false;

  private java.lang.Boolean MaximumPermissionsEditTopics;

  public java.lang.Boolean getMaximumPermissionsEditTopics() {
    return MaximumPermissionsEditTopics;
  }

  

  public void setMaximumPermissionsEditTopics(java.lang.Boolean MaximumPermissionsEditTopics) {
    this.MaximumPermissionsEditTopics = MaximumPermissionsEditTopics;
    MaximumPermissionsEditTopics__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEmailAdministration of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEmailAdministration__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEmailAdministration","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEmailAdministration__is_set = false;

  private java.lang.Boolean MaximumPermissionsEmailAdministration;

  public java.lang.Boolean getMaximumPermissionsEmailAdministration() {
    return MaximumPermissionsEmailAdministration;
  }

  

  public void setMaximumPermissionsEmailAdministration(java.lang.Boolean MaximumPermissionsEmailAdministration) {
    this.MaximumPermissionsEmailAdministration = MaximumPermissionsEmailAdministration;
    MaximumPermissionsEmailAdministration__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEmailMass of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEmailMass__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEmailMass","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEmailMass__is_set = false;

  private java.lang.Boolean MaximumPermissionsEmailMass;

  public java.lang.Boolean getMaximumPermissionsEmailMass() {
    return MaximumPermissionsEmailMass;
  }

  

  public void setMaximumPermissionsEmailMass(java.lang.Boolean MaximumPermissionsEmailMass) {
    this.MaximumPermissionsEmailMass = MaximumPermissionsEmailMass;
    MaximumPermissionsEmailMass__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEmailSingle of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEmailSingle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEmailSingle","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEmailSingle__is_set = false;

  private java.lang.Boolean MaximumPermissionsEmailSingle;

  public java.lang.Boolean getMaximumPermissionsEmailSingle() {
    return MaximumPermissionsEmailSingle;
  }

  

  public void setMaximumPermissionsEmailSingle(java.lang.Boolean MaximumPermissionsEmailSingle) {
    this.MaximumPermissionsEmailSingle = MaximumPermissionsEmailSingle;
    MaximumPermissionsEmailSingle__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEmailTemplateManagement of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEmailTemplateManagement__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEmailTemplateManagement","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEmailTemplateManagement__is_set = false;

  private java.lang.Boolean MaximumPermissionsEmailTemplateManagement;

  public java.lang.Boolean getMaximumPermissionsEmailTemplateManagement() {
    return MaximumPermissionsEmailTemplateManagement;
  }

  

  public void setMaximumPermissionsEmailTemplateManagement(java.lang.Boolean MaximumPermissionsEmailTemplateManagement) {
    this.MaximumPermissionsEmailTemplateManagement = MaximumPermissionsEmailTemplateManagement;
    MaximumPermissionsEmailTemplateManagement__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsEnableNotifications of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsEnableNotifications__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsEnableNotifications","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsEnableNotifications__is_set = false;

  private java.lang.Boolean MaximumPermissionsEnableNotifications;

  public java.lang.Boolean getMaximumPermissionsEnableNotifications() {
    return MaximumPermissionsEnableNotifications;
  }

  

  public void setMaximumPermissionsEnableNotifications(java.lang.Boolean MaximumPermissionsEnableNotifications) {
    this.MaximumPermissionsEnableNotifications = MaximumPermissionsEnableNotifications;
    MaximumPermissionsEnableNotifications__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsExportReport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsExportReport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsExportReport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsExportReport__is_set = false;

  private java.lang.Boolean MaximumPermissionsExportReport;

  public java.lang.Boolean getMaximumPermissionsExportReport() {
    return MaximumPermissionsExportReport;
  }

  

  public void setMaximumPermissionsExportReport(java.lang.Boolean MaximumPermissionsExportReport) {
    this.MaximumPermissionsExportReport = MaximumPermissionsExportReport;
    MaximumPermissionsExportReport__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsFlowUFLRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsFlowUFLRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsFlowUFLRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsFlowUFLRequired__is_set = false;

  private java.lang.Boolean MaximumPermissionsFlowUFLRequired;

  public java.lang.Boolean getMaximumPermissionsFlowUFLRequired() {
    return MaximumPermissionsFlowUFLRequired;
  }

  

  public void setMaximumPermissionsFlowUFLRequired(java.lang.Boolean MaximumPermissionsFlowUFLRequired) {
    this.MaximumPermissionsFlowUFLRequired = MaximumPermissionsFlowUFLRequired;
    MaximumPermissionsFlowUFLRequired__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsForceTwoFactor of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsForceTwoFactor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsForceTwoFactor","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsForceTwoFactor__is_set = false;

  private java.lang.Boolean MaximumPermissionsForceTwoFactor;

  public java.lang.Boolean getMaximumPermissionsForceTwoFactor() {
    return MaximumPermissionsForceTwoFactor;
  }

  

  public void setMaximumPermissionsForceTwoFactor(java.lang.Boolean MaximumPermissionsForceTwoFactor) {
    this.MaximumPermissionsForceTwoFactor = MaximumPermissionsForceTwoFactor;
    MaximumPermissionsForceTwoFactor__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsHasFileSync of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsHasFileSync__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsHasFileSync","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsHasFileSync__is_set = false;

  private java.lang.Boolean MaximumPermissionsHasFileSync;

  public java.lang.Boolean getMaximumPermissionsHasFileSync() {
    return MaximumPermissionsHasFileSync;
  }

  

  public void setMaximumPermissionsHasFileSync(java.lang.Boolean MaximumPermissionsHasFileSync) {
    this.MaximumPermissionsHasFileSync = MaximumPermissionsHasFileSync;
    MaximumPermissionsHasFileSync__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsIPRestrictRequests of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsIPRestrictRequests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsIPRestrictRequests","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsIPRestrictRequests__is_set = false;

  private java.lang.Boolean MaximumPermissionsIPRestrictRequests;

  public java.lang.Boolean getMaximumPermissionsIPRestrictRequests() {
    return MaximumPermissionsIPRestrictRequests;
  }

  

  public void setMaximumPermissionsIPRestrictRequests(java.lang.Boolean MaximumPermissionsIPRestrictRequests) {
    this.MaximumPermissionsIPRestrictRequests = MaximumPermissionsIPRestrictRequests;
    MaximumPermissionsIPRestrictRequests__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsIdentityConnect of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsIdentityConnect__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsIdentityConnect","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsIdentityConnect__is_set = false;

  private java.lang.Boolean MaximumPermissionsIdentityConnect;

  public java.lang.Boolean getMaximumPermissionsIdentityConnect() {
    return MaximumPermissionsIdentityConnect;
  }

  

  public void setMaximumPermissionsIdentityConnect(java.lang.Boolean MaximumPermissionsIdentityConnect) {
    this.MaximumPermissionsIdentityConnect = MaximumPermissionsIdentityConnect;
    MaximumPermissionsIdentityConnect__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsIdentityEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsIdentityEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsIdentityEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsIdentityEnabled__is_set = false;

  private java.lang.Boolean MaximumPermissionsIdentityEnabled;

  public java.lang.Boolean getMaximumPermissionsIdentityEnabled() {
    return MaximumPermissionsIdentityEnabled;
  }

  

  public void setMaximumPermissionsIdentityEnabled(java.lang.Boolean MaximumPermissionsIdentityEnabled) {
    this.MaximumPermissionsIdentityEnabled = MaximumPermissionsIdentityEnabled;
    MaximumPermissionsIdentityEnabled__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsImportCustomObjects of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsImportCustomObjects__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsImportCustomObjects","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsImportCustomObjects__is_set = false;

  private java.lang.Boolean MaximumPermissionsImportCustomObjects;

  public java.lang.Boolean getMaximumPermissionsImportCustomObjects() {
    return MaximumPermissionsImportCustomObjects;
  }

  

  public void setMaximumPermissionsImportCustomObjects(java.lang.Boolean MaximumPermissionsImportCustomObjects) {
    this.MaximumPermissionsImportCustomObjects = MaximumPermissionsImportCustomObjects;
    MaximumPermissionsImportCustomObjects__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsImportLeads of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsImportLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsImportLeads","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsImportLeads__is_set = false;

  private java.lang.Boolean MaximumPermissionsImportLeads;

  public java.lang.Boolean getMaximumPermissionsImportLeads() {
    return MaximumPermissionsImportLeads;
  }

  

  public void setMaximumPermissionsImportLeads(java.lang.Boolean MaximumPermissionsImportLeads) {
    this.MaximumPermissionsImportLeads = MaximumPermissionsImportLeads;
    MaximumPermissionsImportLeads__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsImportPersonal of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsImportPersonal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsImportPersonal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsImportPersonal__is_set = false;

  private java.lang.Boolean MaximumPermissionsImportPersonal;

  public java.lang.Boolean getMaximumPermissionsImportPersonal() {
    return MaximumPermissionsImportPersonal;
  }

  

  public void setMaximumPermissionsImportPersonal(java.lang.Boolean MaximumPermissionsImportPersonal) {
    this.MaximumPermissionsImportPersonal = MaximumPermissionsImportPersonal;
    MaximumPermissionsImportPersonal__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsInboundMigrationToolsUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsInboundMigrationToolsUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsInboundMigrationToolsUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsInboundMigrationToolsUser__is_set = false;

  private java.lang.Boolean MaximumPermissionsInboundMigrationToolsUser;

  public java.lang.Boolean getMaximumPermissionsInboundMigrationToolsUser() {
    return MaximumPermissionsInboundMigrationToolsUser;
  }

  

  public void setMaximumPermissionsInboundMigrationToolsUser(java.lang.Boolean MaximumPermissionsInboundMigrationToolsUser) {
    this.MaximumPermissionsInboundMigrationToolsUser = MaximumPermissionsInboundMigrationToolsUser;
    MaximumPermissionsInboundMigrationToolsUser__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsInstallPackaging of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsInstallPackaging__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsInstallPackaging","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsInstallPackaging__is_set = false;

  private java.lang.Boolean MaximumPermissionsInstallPackaging;

  public java.lang.Boolean getMaximumPermissionsInstallPackaging() {
    return MaximumPermissionsInstallPackaging;
  }

  

  public void setMaximumPermissionsInstallPackaging(java.lang.Boolean MaximumPermissionsInstallPackaging) {
    this.MaximumPermissionsInstallPackaging = MaximumPermissionsInstallPackaging;
    MaximumPermissionsInstallPackaging__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsIsSsoEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsIsSsoEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsIsSsoEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsIsSsoEnabled__is_set = false;

  private java.lang.Boolean MaximumPermissionsIsSsoEnabled;

  public java.lang.Boolean getMaximumPermissionsIsSsoEnabled() {
    return MaximumPermissionsIsSsoEnabled;
  }

  

  public void setMaximumPermissionsIsSsoEnabled(java.lang.Boolean MaximumPermissionsIsSsoEnabled) {
    this.MaximumPermissionsIsSsoEnabled = MaximumPermissionsIsSsoEnabled;
    MaximumPermissionsIsSsoEnabled__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsLightningExperienceUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsLightningExperienceUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsLightningExperienceUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsLightningExperienceUser__is_set = false;

  private java.lang.Boolean MaximumPermissionsLightningExperienceUser;

  public java.lang.Boolean getMaximumPermissionsLightningExperienceUser() {
    return MaximumPermissionsLightningExperienceUser;
  }

  

  public void setMaximumPermissionsLightningExperienceUser(java.lang.Boolean MaximumPermissionsLightningExperienceUser) {
    this.MaximumPermissionsLightningExperienceUser = MaximumPermissionsLightningExperienceUser;
    MaximumPermissionsLightningExperienceUser__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageAnalyticSnapshots of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageAnalyticSnapshots__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageAnalyticSnapshots","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageAnalyticSnapshots__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageAnalyticSnapshots;

  public java.lang.Boolean getMaximumPermissionsManageAnalyticSnapshots() {
    return MaximumPermissionsManageAnalyticSnapshots;
  }

  

  public void setMaximumPermissionsManageAnalyticSnapshots(java.lang.Boolean MaximumPermissionsManageAnalyticSnapshots) {
    this.MaximumPermissionsManageAnalyticSnapshots = MaximumPermissionsManageAnalyticSnapshots;
    MaximumPermissionsManageAnalyticSnapshots__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageAuthProviders of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageAuthProviders__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageAuthProviders","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageAuthProviders__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageAuthProviders;

  public java.lang.Boolean getMaximumPermissionsManageAuthProviders() {
    return MaximumPermissionsManageAuthProviders;
  }

  

  public void setMaximumPermissionsManageAuthProviders(java.lang.Boolean MaximumPermissionsManageAuthProviders) {
    this.MaximumPermissionsManageAuthProviders = MaximumPermissionsManageAuthProviders;
    MaximumPermissionsManageAuthProviders__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageBusinessHourHolidays of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageBusinessHourHolidays__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageBusinessHourHolidays","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageBusinessHourHolidays__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageBusinessHourHolidays;

  public java.lang.Boolean getMaximumPermissionsManageBusinessHourHolidays() {
    return MaximumPermissionsManageBusinessHourHolidays;
  }

  

  public void setMaximumPermissionsManageBusinessHourHolidays(java.lang.Boolean MaximumPermissionsManageBusinessHourHolidays) {
    this.MaximumPermissionsManageBusinessHourHolidays = MaximumPermissionsManageBusinessHourHolidays;
    MaximumPermissionsManageBusinessHourHolidays__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageCallCenters of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageCallCenters__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageCallCenters","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageCallCenters__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageCallCenters;

  public java.lang.Boolean getMaximumPermissionsManageCallCenters() {
    return MaximumPermissionsManageCallCenters;
  }

  

  public void setMaximumPermissionsManageCallCenters(java.lang.Boolean MaximumPermissionsManageCallCenters) {
    this.MaximumPermissionsManageCallCenters = MaximumPermissionsManageCallCenters;
    MaximumPermissionsManageCallCenters__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageCases of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageCases__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageCases","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageCases__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageCases;

  public java.lang.Boolean getMaximumPermissionsManageCases() {
    return MaximumPermissionsManageCases;
  }

  

  public void setMaximumPermissionsManageCases(java.lang.Boolean MaximumPermissionsManageCases) {
    this.MaximumPermissionsManageCases = MaximumPermissionsManageCases;
    MaximumPermissionsManageCases__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageCategories of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageCategories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageCategories","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageCategories__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageCategories;

  public java.lang.Boolean getMaximumPermissionsManageCategories() {
    return MaximumPermissionsManageCategories;
  }

  

  public void setMaximumPermissionsManageCategories(java.lang.Boolean MaximumPermissionsManageCategories) {
    this.MaximumPermissionsManageCategories = MaximumPermissionsManageCategories;
    MaximumPermissionsManageCategories__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageChatterMessages of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageChatterMessages__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageChatterMessages","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageChatterMessages__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageChatterMessages;

  public java.lang.Boolean getMaximumPermissionsManageChatterMessages() {
    return MaximumPermissionsManageChatterMessages;
  }

  

  public void setMaximumPermissionsManageChatterMessages(java.lang.Boolean MaximumPermissionsManageChatterMessages) {
    this.MaximumPermissionsManageChatterMessages = MaximumPermissionsManageChatterMessages;
    MaximumPermissionsManageChatterMessages__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageContentPermissions of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageContentPermissions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageContentPermissions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageContentPermissions__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageContentPermissions;

  public java.lang.Boolean getMaximumPermissionsManageContentPermissions() {
    return MaximumPermissionsManageContentPermissions;
  }

  

  public void setMaximumPermissionsManageContentPermissions(java.lang.Boolean MaximumPermissionsManageContentPermissions) {
    this.MaximumPermissionsManageContentPermissions = MaximumPermissionsManageContentPermissions;
    MaximumPermissionsManageContentPermissions__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageContentProperties of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageContentProperties__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageContentProperties","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageContentProperties__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageContentProperties;

  public java.lang.Boolean getMaximumPermissionsManageContentProperties() {
    return MaximumPermissionsManageContentProperties;
  }

  

  public void setMaximumPermissionsManageContentProperties(java.lang.Boolean MaximumPermissionsManageContentProperties) {
    this.MaximumPermissionsManageContentProperties = MaximumPermissionsManageContentProperties;
    MaximumPermissionsManageContentProperties__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageContentTypes of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageContentTypes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageContentTypes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageContentTypes__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageContentTypes;

  public java.lang.Boolean getMaximumPermissionsManageContentTypes() {
    return MaximumPermissionsManageContentTypes;
  }

  

  public void setMaximumPermissionsManageContentTypes(java.lang.Boolean MaximumPermissionsManageContentTypes) {
    this.MaximumPermissionsManageContentTypes = MaximumPermissionsManageContentTypes;
    MaximumPermissionsManageContentTypes__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageCssUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageCssUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageCssUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageCssUsers__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageCssUsers;

  public java.lang.Boolean getMaximumPermissionsManageCssUsers() {
    return MaximumPermissionsManageCssUsers;
  }

  

  public void setMaximumPermissionsManageCssUsers(java.lang.Boolean MaximumPermissionsManageCssUsers) {
    this.MaximumPermissionsManageCssUsers = MaximumPermissionsManageCssUsers;
    MaximumPermissionsManageCssUsers__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageCustomPermissions of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageCustomPermissions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageCustomPermissions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageCustomPermissions__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageCustomPermissions;

  public java.lang.Boolean getMaximumPermissionsManageCustomPermissions() {
    return MaximumPermissionsManageCustomPermissions;
  }

  

  public void setMaximumPermissionsManageCustomPermissions(java.lang.Boolean MaximumPermissionsManageCustomPermissions) {
    this.MaximumPermissionsManageCustomPermissions = MaximumPermissionsManageCustomPermissions;
    MaximumPermissionsManageCustomPermissions__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageCustomReportTypes of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageCustomReportTypes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageCustomReportTypes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageCustomReportTypes__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageCustomReportTypes;

  public java.lang.Boolean getMaximumPermissionsManageCustomReportTypes() {
    return MaximumPermissionsManageCustomReportTypes;
  }

  

  public void setMaximumPermissionsManageCustomReportTypes(java.lang.Boolean MaximumPermissionsManageCustomReportTypes) {
    this.MaximumPermissionsManageCustomReportTypes = MaximumPermissionsManageCustomReportTypes;
    MaximumPermissionsManageCustomReportTypes__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageDashboards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageDashboards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageDashboards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageDashboards__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageDashboards;

  public java.lang.Boolean getMaximumPermissionsManageDashboards() {
    return MaximumPermissionsManageDashboards;
  }

  

  public void setMaximumPermissionsManageDashboards(java.lang.Boolean MaximumPermissionsManageDashboards) {
    this.MaximumPermissionsManageDashboards = MaximumPermissionsManageDashboards;
    MaximumPermissionsManageDashboards__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageDataCategories of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageDataCategories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageDataCategories","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageDataCategories__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageDataCategories;

  public java.lang.Boolean getMaximumPermissionsManageDataCategories() {
    return MaximumPermissionsManageDataCategories;
  }

  

  public void setMaximumPermissionsManageDataCategories(java.lang.Boolean MaximumPermissionsManageDataCategories) {
    this.MaximumPermissionsManageDataCategories = MaximumPermissionsManageDataCategories;
    MaximumPermissionsManageDataCategories__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageDataIntegrations of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageDataIntegrations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageDataIntegrations","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageDataIntegrations__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageDataIntegrations;

  public java.lang.Boolean getMaximumPermissionsManageDataIntegrations() {
    return MaximumPermissionsManageDataIntegrations;
  }

  

  public void setMaximumPermissionsManageDataIntegrations(java.lang.Boolean MaximumPermissionsManageDataIntegrations) {
    this.MaximumPermissionsManageDataIntegrations = MaximumPermissionsManageDataIntegrations;
    MaximumPermissionsManageDataIntegrations__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageDynamicDashboards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageDynamicDashboards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageDynamicDashboards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageDynamicDashboards__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageDynamicDashboards;

  public java.lang.Boolean getMaximumPermissionsManageDynamicDashboards() {
    return MaximumPermissionsManageDynamicDashboards;
  }

  

  public void setMaximumPermissionsManageDynamicDashboards(java.lang.Boolean MaximumPermissionsManageDynamicDashboards) {
    this.MaximumPermissionsManageDynamicDashboards = MaximumPermissionsManageDynamicDashboards;
    MaximumPermissionsManageDynamicDashboards__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageEmailClientConfig of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageEmailClientConfig__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageEmailClientConfig","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageEmailClientConfig__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageEmailClientConfig;

  public java.lang.Boolean getMaximumPermissionsManageEmailClientConfig() {
    return MaximumPermissionsManageEmailClientConfig;
  }

  

  public void setMaximumPermissionsManageEmailClientConfig(java.lang.Boolean MaximumPermissionsManageEmailClientConfig) {
    this.MaximumPermissionsManageEmailClientConfig = MaximumPermissionsManageEmailClientConfig;
    MaximumPermissionsManageEmailClientConfig__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageExchangeConfig of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageExchangeConfig__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageExchangeConfig","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageExchangeConfig__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageExchangeConfig;

  public java.lang.Boolean getMaximumPermissionsManageExchangeConfig() {
    return MaximumPermissionsManageExchangeConfig;
  }

  

  public void setMaximumPermissionsManageExchangeConfig(java.lang.Boolean MaximumPermissionsManageExchangeConfig) {
    this.MaximumPermissionsManageExchangeConfig = MaximumPermissionsManageExchangeConfig;
    MaximumPermissionsManageExchangeConfig__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageInteraction of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageInteraction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageInteraction","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageInteraction__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageInteraction;

  public java.lang.Boolean getMaximumPermissionsManageInteraction() {
    return MaximumPermissionsManageInteraction;
  }

  

  public void setMaximumPermissionsManageInteraction(java.lang.Boolean MaximumPermissionsManageInteraction) {
    this.MaximumPermissionsManageInteraction = MaximumPermissionsManageInteraction;
    MaximumPermissionsManageInteraction__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageInternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageInternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageInternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageInternalUsers__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageInternalUsers;

  public java.lang.Boolean getMaximumPermissionsManageInternalUsers() {
    return MaximumPermissionsManageInternalUsers;
  }

  

  public void setMaximumPermissionsManageInternalUsers(java.lang.Boolean MaximumPermissionsManageInternalUsers) {
    this.MaximumPermissionsManageInternalUsers = MaximumPermissionsManageInternalUsers;
    MaximumPermissionsManageInternalUsers__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageIpAddresses of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageIpAddresses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageIpAddresses","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageIpAddresses__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageIpAddresses;

  public java.lang.Boolean getMaximumPermissionsManageIpAddresses() {
    return MaximumPermissionsManageIpAddresses;
  }

  

  public void setMaximumPermissionsManageIpAddresses(java.lang.Boolean MaximumPermissionsManageIpAddresses) {
    this.MaximumPermissionsManageIpAddresses = MaximumPermissionsManageIpAddresses;
    MaximumPermissionsManageIpAddresses__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageKnowledge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageKnowledge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageKnowledge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageKnowledge__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageKnowledge;

  public java.lang.Boolean getMaximumPermissionsManageKnowledge() {
    return MaximumPermissionsManageKnowledge;
  }

  

  public void setMaximumPermissionsManageKnowledge(java.lang.Boolean MaximumPermissionsManageKnowledge) {
    this.MaximumPermissionsManageKnowledge = MaximumPermissionsManageKnowledge;
    MaximumPermissionsManageKnowledge__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageKnowledgeImportExport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageKnowledgeImportExport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageKnowledgeImportExport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageKnowledgeImportExport__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageKnowledgeImportExport;

  public java.lang.Boolean getMaximumPermissionsManageKnowledgeImportExport() {
    return MaximumPermissionsManageKnowledgeImportExport;
  }

  

  public void setMaximumPermissionsManageKnowledgeImportExport(java.lang.Boolean MaximumPermissionsManageKnowledgeImportExport) {
    this.MaximumPermissionsManageKnowledgeImportExport = MaximumPermissionsManageKnowledgeImportExport;
    MaximumPermissionsManageKnowledgeImportExport__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageLeads of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageLeads","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageLeads__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageLeads;

  public java.lang.Boolean getMaximumPermissionsManageLeads() {
    return MaximumPermissionsManageLeads;
  }

  

  public void setMaximumPermissionsManageLeads(java.lang.Boolean MaximumPermissionsManageLeads) {
    this.MaximumPermissionsManageLeads = MaximumPermissionsManageLeads;
    MaximumPermissionsManageLeads__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageLoginAccessPolicies of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageLoginAccessPolicies__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageLoginAccessPolicies","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageLoginAccessPolicies__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageLoginAccessPolicies;

  public java.lang.Boolean getMaximumPermissionsManageLoginAccessPolicies() {
    return MaximumPermissionsManageLoginAccessPolicies;
  }

  

  public void setMaximumPermissionsManageLoginAccessPolicies(java.lang.Boolean MaximumPermissionsManageLoginAccessPolicies) {
    this.MaximumPermissionsManageLoginAccessPolicies = MaximumPermissionsManageLoginAccessPolicies;
    MaximumPermissionsManageLoginAccessPolicies__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageMobile of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageMobile__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageMobile","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageMobile__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageMobile;

  public java.lang.Boolean getMaximumPermissionsManageMobile() {
    return MaximumPermissionsManageMobile;
  }

  

  public void setMaximumPermissionsManageMobile(java.lang.Boolean MaximumPermissionsManageMobile) {
    this.MaximumPermissionsManageMobile = MaximumPermissionsManageMobile;
    MaximumPermissionsManageMobile__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManagePartners of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManagePartners__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManagePartners","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManagePartners__is_set = false;

  private java.lang.Boolean MaximumPermissionsManagePartners;

  public java.lang.Boolean getMaximumPermissionsManagePartners() {
    return MaximumPermissionsManagePartners;
  }

  

  public void setMaximumPermissionsManagePartners(java.lang.Boolean MaximumPermissionsManagePartners) {
    this.MaximumPermissionsManagePartners = MaximumPermissionsManagePartners;
    MaximumPermissionsManagePartners__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManagePasswordPolicies of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManagePasswordPolicies__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManagePasswordPolicies","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManagePasswordPolicies__is_set = false;

  private java.lang.Boolean MaximumPermissionsManagePasswordPolicies;

  public java.lang.Boolean getMaximumPermissionsManagePasswordPolicies() {
    return MaximumPermissionsManagePasswordPolicies;
  }

  

  public void setMaximumPermissionsManagePasswordPolicies(java.lang.Boolean MaximumPermissionsManagePasswordPolicies) {
    this.MaximumPermissionsManagePasswordPolicies = MaximumPermissionsManagePasswordPolicies;
    MaximumPermissionsManagePasswordPolicies__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageProfilesPermissionsets of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageProfilesPermissionsets__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageProfilesPermissionsets","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageProfilesPermissionsets__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageProfilesPermissionsets;

  public java.lang.Boolean getMaximumPermissionsManageProfilesPermissionsets() {
    return MaximumPermissionsManageProfilesPermissionsets;
  }

  

  public void setMaximumPermissionsManageProfilesPermissionsets(java.lang.Boolean MaximumPermissionsManageProfilesPermissionsets) {
    this.MaximumPermissionsManageProfilesPermissionsets = MaximumPermissionsManageProfilesPermissionsets;
    MaximumPermissionsManageProfilesPermissionsets__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManagePvtRptsAndDashbds of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManagePvtRptsAndDashbds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManagePvtRptsAndDashbds","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManagePvtRptsAndDashbds__is_set = false;

  private java.lang.Boolean MaximumPermissionsManagePvtRptsAndDashbds;

  public java.lang.Boolean getMaximumPermissionsManagePvtRptsAndDashbds() {
    return MaximumPermissionsManagePvtRptsAndDashbds;
  }

  

  public void setMaximumPermissionsManagePvtRptsAndDashbds(java.lang.Boolean MaximumPermissionsManagePvtRptsAndDashbds) {
    this.MaximumPermissionsManagePvtRptsAndDashbds = MaximumPermissionsManagePvtRptsAndDashbds;
    MaximumPermissionsManagePvtRptsAndDashbds__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageRemoteAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageRemoteAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageRemoteAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageRemoteAccess__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageRemoteAccess;

  public java.lang.Boolean getMaximumPermissionsManageRemoteAccess() {
    return MaximumPermissionsManageRemoteAccess;
  }

  

  public void setMaximumPermissionsManageRemoteAccess(java.lang.Boolean MaximumPermissionsManageRemoteAccess) {
    this.MaximumPermissionsManageRemoteAccess = MaximumPermissionsManageRemoteAccess;
    MaximumPermissionsManageRemoteAccess__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageRoles of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageRoles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageRoles","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageRoles__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageRoles;

  public java.lang.Boolean getMaximumPermissionsManageRoles() {
    return MaximumPermissionsManageRoles;
  }

  

  public void setMaximumPermissionsManageRoles(java.lang.Boolean MaximumPermissionsManageRoles) {
    this.MaximumPermissionsManageRoles = MaximumPermissionsManageRoles;
    MaximumPermissionsManageRoles__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageSandboxes of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageSandboxes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageSandboxes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageSandboxes__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageSandboxes;

  public java.lang.Boolean getMaximumPermissionsManageSandboxes() {
    return MaximumPermissionsManageSandboxes;
  }

  

  public void setMaximumPermissionsManageSandboxes(java.lang.Boolean MaximumPermissionsManageSandboxes) {
    this.MaximumPermissionsManageSandboxes = MaximumPermissionsManageSandboxes;
    MaximumPermissionsManageSandboxes__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageSearchPromotionRules of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageSearchPromotionRules__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageSearchPromotionRules","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageSearchPromotionRules__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageSearchPromotionRules;

  public java.lang.Boolean getMaximumPermissionsManageSearchPromotionRules() {
    return MaximumPermissionsManageSearchPromotionRules;
  }

  

  public void setMaximumPermissionsManageSearchPromotionRules(java.lang.Boolean MaximumPermissionsManageSearchPromotionRules) {
    this.MaximumPermissionsManageSearchPromotionRules = MaximumPermissionsManageSearchPromotionRules;
    MaximumPermissionsManageSearchPromotionRules__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageSelfService of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageSelfService__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageSelfService","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageSelfService__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageSelfService;

  public java.lang.Boolean getMaximumPermissionsManageSelfService() {
    return MaximumPermissionsManageSelfService;
  }

  

  public void setMaximumPermissionsManageSelfService(java.lang.Boolean MaximumPermissionsManageSelfService) {
    this.MaximumPermissionsManageSelfService = MaximumPermissionsManageSelfService;
    MaximumPermissionsManageSelfService__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageSharing of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageSharing__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageSharing","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageSharing__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageSharing;

  public java.lang.Boolean getMaximumPermissionsManageSharing() {
    return MaximumPermissionsManageSharing;
  }

  

  public void setMaximumPermissionsManageSharing(java.lang.Boolean MaximumPermissionsManageSharing) {
    this.MaximumPermissionsManageSharing = MaximumPermissionsManageSharing;
    MaximumPermissionsManageSharing__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageSolutions of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageSolutions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageSolutions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageSolutions__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageSolutions;

  public java.lang.Boolean getMaximumPermissionsManageSolutions() {
    return MaximumPermissionsManageSolutions;
  }

  

  public void setMaximumPermissionsManageSolutions(java.lang.Boolean MaximumPermissionsManageSolutions) {
    this.MaximumPermissionsManageSolutions = MaximumPermissionsManageSolutions;
    MaximumPermissionsManageSolutions__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageSynonyms of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageSynonyms__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageSynonyms","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageSynonyms__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageSynonyms;

  public java.lang.Boolean getMaximumPermissionsManageSynonyms() {
    return MaximumPermissionsManageSynonyms;
  }

  

  public void setMaximumPermissionsManageSynonyms(java.lang.Boolean MaximumPermissionsManageSynonyms) {
    this.MaximumPermissionsManageSynonyms = MaximumPermissionsManageSynonyms;
    MaximumPermissionsManageSynonyms__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageTranslation of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageTranslation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageTranslation","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageTranslation__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageTranslation;

  public java.lang.Boolean getMaximumPermissionsManageTranslation() {
    return MaximumPermissionsManageTranslation;
  }

  

  public void setMaximumPermissionsManageTranslation(java.lang.Boolean MaximumPermissionsManageTranslation) {
    this.MaximumPermissionsManageTranslation = MaximumPermissionsManageTranslation;
    MaximumPermissionsManageTranslation__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageTwoFactor of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageTwoFactor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageTwoFactor","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageTwoFactor__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageTwoFactor;

  public java.lang.Boolean getMaximumPermissionsManageTwoFactor() {
    return MaximumPermissionsManageTwoFactor;
  }

  

  public void setMaximumPermissionsManageTwoFactor(java.lang.Boolean MaximumPermissionsManageTwoFactor) {
    this.MaximumPermissionsManageTwoFactor = MaximumPermissionsManageTwoFactor;
    MaximumPermissionsManageTwoFactor__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageUnlistedGroups of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageUnlistedGroups__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageUnlistedGroups","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageUnlistedGroups__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageUnlistedGroups;

  public java.lang.Boolean getMaximumPermissionsManageUnlistedGroups() {
    return MaximumPermissionsManageUnlistedGroups;
  }

  

  public void setMaximumPermissionsManageUnlistedGroups(java.lang.Boolean MaximumPermissionsManageUnlistedGroups) {
    this.MaximumPermissionsManageUnlistedGroups = MaximumPermissionsManageUnlistedGroups;
    MaximumPermissionsManageUnlistedGroups__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsManageUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsManageUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsManageUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsManageUsers__is_set = false;

  private java.lang.Boolean MaximumPermissionsManageUsers;

  public java.lang.Boolean getMaximumPermissionsManageUsers() {
    return MaximumPermissionsManageUsers;
  }

  

  public void setMaximumPermissionsManageUsers(java.lang.Boolean MaximumPermissionsManageUsers) {
    this.MaximumPermissionsManageUsers = MaximumPermissionsManageUsers;
    MaximumPermissionsManageUsers__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsMassInlineEdit of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsMassInlineEdit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsMassInlineEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsMassInlineEdit__is_set = false;

  private java.lang.Boolean MaximumPermissionsMassInlineEdit;

  public java.lang.Boolean getMaximumPermissionsMassInlineEdit() {
    return MaximumPermissionsMassInlineEdit;
  }

  

  public void setMaximumPermissionsMassInlineEdit(java.lang.Boolean MaximumPermissionsMassInlineEdit) {
    this.MaximumPermissionsMassInlineEdit = MaximumPermissionsMassInlineEdit;
    MaximumPermissionsMassInlineEdit__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsMergeTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsMergeTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsMergeTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsMergeTopics__is_set = false;

  private java.lang.Boolean MaximumPermissionsMergeTopics;

  public java.lang.Boolean getMaximumPermissionsMergeTopics() {
    return MaximumPermissionsMergeTopics;
  }

  

  public void setMaximumPermissionsMergeTopics(java.lang.Boolean MaximumPermissionsMergeTopics) {
    this.MaximumPermissionsMergeTopics = MaximumPermissionsMergeTopics;
    MaximumPermissionsMergeTopics__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsModerateChatter of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsModerateChatter__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsModerateChatter","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsModerateChatter__is_set = false;

  private java.lang.Boolean MaximumPermissionsModerateChatter;

  public java.lang.Boolean getMaximumPermissionsModerateChatter() {
    return MaximumPermissionsModerateChatter;
  }

  

  public void setMaximumPermissionsModerateChatter(java.lang.Boolean MaximumPermissionsModerateChatter) {
    this.MaximumPermissionsModerateChatter = MaximumPermissionsModerateChatter;
    MaximumPermissionsModerateChatter__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsModifyAllData of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsModifyAllData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsModifyAllData","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsModifyAllData__is_set = false;

  private java.lang.Boolean MaximumPermissionsModifyAllData;

  public java.lang.Boolean getMaximumPermissionsModifyAllData() {
    return MaximumPermissionsModifyAllData;
  }

  

  public void setMaximumPermissionsModifyAllData(java.lang.Boolean MaximumPermissionsModifyAllData) {
    this.MaximumPermissionsModifyAllData = MaximumPermissionsModifyAllData;
    MaximumPermissionsModifyAllData__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsNewReportBuilder of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsNewReportBuilder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsNewReportBuilder","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsNewReportBuilder__is_set = false;

  private java.lang.Boolean MaximumPermissionsNewReportBuilder;

  public java.lang.Boolean getMaximumPermissionsNewReportBuilder() {
    return MaximumPermissionsNewReportBuilder;
  }

  

  public void setMaximumPermissionsNewReportBuilder(java.lang.Boolean MaximumPermissionsNewReportBuilder) {
    this.MaximumPermissionsNewReportBuilder = MaximumPermissionsNewReportBuilder;
    MaximumPermissionsNewReportBuilder__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsOutboundMigrationToolsUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsOutboundMigrationToolsUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsOutboundMigrationToolsUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsOutboundMigrationToolsUser__is_set = false;

  private java.lang.Boolean MaximumPermissionsOutboundMigrationToolsUser;

  public java.lang.Boolean getMaximumPermissionsOutboundMigrationToolsUser() {
    return MaximumPermissionsOutboundMigrationToolsUser;
  }

  

  public void setMaximumPermissionsOutboundMigrationToolsUser(java.lang.Boolean MaximumPermissionsOutboundMigrationToolsUser) {
    this.MaximumPermissionsOutboundMigrationToolsUser = MaximumPermissionsOutboundMigrationToolsUser;
    MaximumPermissionsOutboundMigrationToolsUser__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsPasswordNeverExpires of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsPasswordNeverExpires__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsPasswordNeverExpires","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsPasswordNeverExpires__is_set = false;

  private java.lang.Boolean MaximumPermissionsPasswordNeverExpires;

  public java.lang.Boolean getMaximumPermissionsPasswordNeverExpires() {
    return MaximumPermissionsPasswordNeverExpires;
  }

  

  public void setMaximumPermissionsPasswordNeverExpires(java.lang.Boolean MaximumPermissionsPasswordNeverExpires) {
    this.MaximumPermissionsPasswordNeverExpires = MaximumPermissionsPasswordNeverExpires;
    MaximumPermissionsPasswordNeverExpires__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsPublishPackaging of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsPublishPackaging__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsPublishPackaging","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsPublishPackaging__is_set = false;

  private java.lang.Boolean MaximumPermissionsPublishPackaging;

  public java.lang.Boolean getMaximumPermissionsPublishPackaging() {
    return MaximumPermissionsPublishPackaging;
  }

  

  public void setMaximumPermissionsPublishPackaging(java.lang.Boolean MaximumPermissionsPublishPackaging) {
    this.MaximumPermissionsPublishPackaging = MaximumPermissionsPublishPackaging;
    MaximumPermissionsPublishPackaging__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsResetPasswords of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsResetPasswords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsResetPasswords","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsResetPasswords__is_set = false;

  private java.lang.Boolean MaximumPermissionsResetPasswords;

  public java.lang.Boolean getMaximumPermissionsResetPasswords() {
    return MaximumPermissionsResetPasswords;
  }

  

  public void setMaximumPermissionsResetPasswords(java.lang.Boolean MaximumPermissionsResetPasswords) {
    this.MaximumPermissionsResetPasswords = MaximumPermissionsResetPasswords;
    MaximumPermissionsResetPasswords__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsRunFlow of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsRunFlow__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsRunFlow","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsRunFlow__is_set = false;

  private java.lang.Boolean MaximumPermissionsRunFlow;

  public java.lang.Boolean getMaximumPermissionsRunFlow() {
    return MaximumPermissionsRunFlow;
  }

  

  public void setMaximumPermissionsRunFlow(java.lang.Boolean MaximumPermissionsRunFlow) {
    this.MaximumPermissionsRunFlow = MaximumPermissionsRunFlow;
    MaximumPermissionsRunFlow__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsRunReports of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsRunReports__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsRunReports","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsRunReports__is_set = false;

  private java.lang.Boolean MaximumPermissionsRunReports;

  public java.lang.Boolean getMaximumPermissionsRunReports() {
    return MaximumPermissionsRunReports;
  }

  

  public void setMaximumPermissionsRunReports(java.lang.Boolean MaximumPermissionsRunReports) {
    this.MaximumPermissionsRunReports = MaximumPermissionsRunReports;
    MaximumPermissionsRunReports__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsSalesConsole of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsSalesConsole__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsSalesConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsSalesConsole__is_set = false;

  private java.lang.Boolean MaximumPermissionsSalesConsole;

  public java.lang.Boolean getMaximumPermissionsSalesConsole() {
    return MaximumPermissionsSalesConsole;
  }

  

  public void setMaximumPermissionsSalesConsole(java.lang.Boolean MaximumPermissionsSalesConsole) {
    this.MaximumPermissionsSalesConsole = MaximumPermissionsSalesConsole;
    MaximumPermissionsSalesConsole__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsScheduleJob of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsScheduleJob__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsScheduleJob","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsScheduleJob__is_set = false;

  private java.lang.Boolean MaximumPermissionsScheduleJob;

  public java.lang.Boolean getMaximumPermissionsScheduleJob() {
    return MaximumPermissionsScheduleJob;
  }

  

  public void setMaximumPermissionsScheduleJob(java.lang.Boolean MaximumPermissionsScheduleJob) {
    this.MaximumPermissionsScheduleJob = MaximumPermissionsScheduleJob;
    MaximumPermissionsScheduleJob__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsScheduleReports of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsScheduleReports__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsScheduleReports","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsScheduleReports__is_set = false;

  private java.lang.Boolean MaximumPermissionsScheduleReports;

  public java.lang.Boolean getMaximumPermissionsScheduleReports() {
    return MaximumPermissionsScheduleReports;
  }

  

  public void setMaximumPermissionsScheduleReports(java.lang.Boolean MaximumPermissionsScheduleReports) {
    this.MaximumPermissionsScheduleReports = MaximumPermissionsScheduleReports;
    MaximumPermissionsScheduleReports__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsSelectFilesFromSalesforce of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsSelectFilesFromSalesforce__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsSelectFilesFromSalesforce","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsSelectFilesFromSalesforce__is_set = false;

  private java.lang.Boolean MaximumPermissionsSelectFilesFromSalesforce;

  public java.lang.Boolean getMaximumPermissionsSelectFilesFromSalesforce() {
    return MaximumPermissionsSelectFilesFromSalesforce;
  }

  

  public void setMaximumPermissionsSelectFilesFromSalesforce(java.lang.Boolean MaximumPermissionsSelectFilesFromSalesforce) {
    this.MaximumPermissionsSelectFilesFromSalesforce = MaximumPermissionsSelectFilesFromSalesforce;
    MaximumPermissionsSelectFilesFromSalesforce__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsSendAnnouncementEmails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsSendAnnouncementEmails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsSendAnnouncementEmails","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsSendAnnouncementEmails__is_set = false;

  private java.lang.Boolean MaximumPermissionsSendAnnouncementEmails;

  public java.lang.Boolean getMaximumPermissionsSendAnnouncementEmails() {
    return MaximumPermissionsSendAnnouncementEmails;
  }

  

  public void setMaximumPermissionsSendAnnouncementEmails(java.lang.Boolean MaximumPermissionsSendAnnouncementEmails) {
    this.MaximumPermissionsSendAnnouncementEmails = MaximumPermissionsSendAnnouncementEmails;
    MaximumPermissionsSendAnnouncementEmails__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsSendSitRequests of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsSendSitRequests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsSendSitRequests","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsSendSitRequests__is_set = false;

  private java.lang.Boolean MaximumPermissionsSendSitRequests;

  public java.lang.Boolean getMaximumPermissionsSendSitRequests() {
    return MaximumPermissionsSendSitRequests;
  }

  

  public void setMaximumPermissionsSendSitRequests(java.lang.Boolean MaximumPermissionsSendSitRequests) {
    this.MaximumPermissionsSendSitRequests = MaximumPermissionsSendSitRequests;
    MaximumPermissionsSendSitRequests__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsShareInternalArticles of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsShareInternalArticles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsShareInternalArticles","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsShareInternalArticles__is_set = false;

  private java.lang.Boolean MaximumPermissionsShareInternalArticles;

  public java.lang.Boolean getMaximumPermissionsShareInternalArticles() {
    return MaximumPermissionsShareInternalArticles;
  }

  

  public void setMaximumPermissionsShareInternalArticles(java.lang.Boolean MaximumPermissionsShareInternalArticles) {
    this.MaximumPermissionsShareInternalArticles = MaximumPermissionsShareInternalArticles;
    MaximumPermissionsShareInternalArticles__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsShowCompanyNameAsUserBadge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsShowCompanyNameAsUserBadge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsShowCompanyNameAsUserBadge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsShowCompanyNameAsUserBadge__is_set = false;

  private java.lang.Boolean MaximumPermissionsShowCompanyNameAsUserBadge;

  public java.lang.Boolean getMaximumPermissionsShowCompanyNameAsUserBadge() {
    return MaximumPermissionsShowCompanyNameAsUserBadge;
  }

  

  public void setMaximumPermissionsShowCompanyNameAsUserBadge(java.lang.Boolean MaximumPermissionsShowCompanyNameAsUserBadge) {
    this.MaximumPermissionsShowCompanyNameAsUserBadge = MaximumPermissionsShowCompanyNameAsUserBadge;
    MaximumPermissionsShowCompanyNameAsUserBadge__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsSocialInsightsLogoAdmin of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsSocialInsightsLogoAdmin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsSocialInsightsLogoAdmin","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsSocialInsightsLogoAdmin__is_set = false;

  private java.lang.Boolean MaximumPermissionsSocialInsightsLogoAdmin;

  public java.lang.Boolean getMaximumPermissionsSocialInsightsLogoAdmin() {
    return MaximumPermissionsSocialInsightsLogoAdmin;
  }

  

  public void setMaximumPermissionsSocialInsightsLogoAdmin(java.lang.Boolean MaximumPermissionsSocialInsightsLogoAdmin) {
    this.MaximumPermissionsSocialInsightsLogoAdmin = MaximumPermissionsSocialInsightsLogoAdmin;
    MaximumPermissionsSocialInsightsLogoAdmin__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsSolutionImport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsSolutionImport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsSolutionImport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsSolutionImport__is_set = false;

  private java.lang.Boolean MaximumPermissionsSolutionImport;

  public java.lang.Boolean getMaximumPermissionsSolutionImport() {
    return MaximumPermissionsSolutionImport;
  }

  

  public void setMaximumPermissionsSolutionImport(java.lang.Boolean MaximumPermissionsSolutionImport) {
    this.MaximumPermissionsSolutionImport = MaximumPermissionsSolutionImport;
    MaximumPermissionsSolutionImport__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsSubmitMacrosAllowed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsSubmitMacrosAllowed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsSubmitMacrosAllowed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsSubmitMacrosAllowed__is_set = false;

  private java.lang.Boolean MaximumPermissionsSubmitMacrosAllowed;

  public java.lang.Boolean getMaximumPermissionsSubmitMacrosAllowed() {
    return MaximumPermissionsSubmitMacrosAllowed;
  }

  

  public void setMaximumPermissionsSubmitMacrosAllowed(java.lang.Boolean MaximumPermissionsSubmitMacrosAllowed) {
    this.MaximumPermissionsSubmitMacrosAllowed = MaximumPermissionsSubmitMacrosAllowed;
    MaximumPermissionsSubmitMacrosAllowed__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsTagManager of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsTagManager__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsTagManager","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsTagManager__is_set = false;

  private java.lang.Boolean MaximumPermissionsTagManager;

  public java.lang.Boolean getMaximumPermissionsTagManager() {
    return MaximumPermissionsTagManager;
  }

  

  public void setMaximumPermissionsTagManager(java.lang.Boolean MaximumPermissionsTagManager) {
    this.MaximumPermissionsTagManager = MaximumPermissionsTagManager;
    MaximumPermissionsTagManager__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsTransferAnyCase of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsTransferAnyCase__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsTransferAnyCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsTransferAnyCase__is_set = false;

  private java.lang.Boolean MaximumPermissionsTransferAnyCase;

  public java.lang.Boolean getMaximumPermissionsTransferAnyCase() {
    return MaximumPermissionsTransferAnyCase;
  }

  

  public void setMaximumPermissionsTransferAnyCase(java.lang.Boolean MaximumPermissionsTransferAnyCase) {
    this.MaximumPermissionsTransferAnyCase = MaximumPermissionsTransferAnyCase;
    MaximumPermissionsTransferAnyCase__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsTransferAnyEntity of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsTransferAnyEntity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsTransferAnyEntity","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsTransferAnyEntity__is_set = false;

  private java.lang.Boolean MaximumPermissionsTransferAnyEntity;

  public java.lang.Boolean getMaximumPermissionsTransferAnyEntity() {
    return MaximumPermissionsTransferAnyEntity;
  }

  

  public void setMaximumPermissionsTransferAnyEntity(java.lang.Boolean MaximumPermissionsTransferAnyEntity) {
    this.MaximumPermissionsTransferAnyEntity = MaximumPermissionsTransferAnyEntity;
    MaximumPermissionsTransferAnyEntity__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsTransferAnyLead of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsTransferAnyLead__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsTransferAnyLead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsTransferAnyLead__is_set = false;

  private java.lang.Boolean MaximumPermissionsTransferAnyLead;

  public java.lang.Boolean getMaximumPermissionsTransferAnyLead() {
    return MaximumPermissionsTransferAnyLead;
  }

  

  public void setMaximumPermissionsTransferAnyLead(java.lang.Boolean MaximumPermissionsTransferAnyLead) {
    this.MaximumPermissionsTransferAnyLead = MaximumPermissionsTransferAnyLead;
    MaximumPermissionsTransferAnyLead__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsTwoFactorApi of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsTwoFactorApi__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsTwoFactorApi","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsTwoFactorApi__is_set = false;

  private java.lang.Boolean MaximumPermissionsTwoFactorApi;

  public java.lang.Boolean getMaximumPermissionsTwoFactorApi() {
    return MaximumPermissionsTwoFactorApi;
  }

  

  public void setMaximumPermissionsTwoFactorApi(java.lang.Boolean MaximumPermissionsTwoFactorApi) {
    this.MaximumPermissionsTwoFactorApi = MaximumPermissionsTwoFactorApi;
    MaximumPermissionsTwoFactorApi__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsUseTeamReassignWizards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsUseTeamReassignWizards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsUseTeamReassignWizards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsUseTeamReassignWizards__is_set = false;

  private java.lang.Boolean MaximumPermissionsUseTeamReassignWizards;

  public java.lang.Boolean getMaximumPermissionsUseTeamReassignWizards() {
    return MaximumPermissionsUseTeamReassignWizards;
  }

  

  public void setMaximumPermissionsUseTeamReassignWizards(java.lang.Boolean MaximumPermissionsUseTeamReassignWizards) {
    this.MaximumPermissionsUseTeamReassignWizards = MaximumPermissionsUseTeamReassignWizards;
    MaximumPermissionsUseTeamReassignWizards__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewAllData of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewAllData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewAllData","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewAllData__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewAllData;

  public java.lang.Boolean getMaximumPermissionsViewAllData() {
    return MaximumPermissionsViewAllData;
  }

  

  public void setMaximumPermissionsViewAllData(java.lang.Boolean MaximumPermissionsViewAllData) {
    this.MaximumPermissionsViewAllData = MaximumPermissionsViewAllData;
    MaximumPermissionsViewAllData__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewAllUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewAllUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewAllUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewAllUsers__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewAllUsers;

  public java.lang.Boolean getMaximumPermissionsViewAllUsers() {
    return MaximumPermissionsViewAllUsers;
  }

  

  public void setMaximumPermissionsViewAllUsers(java.lang.Boolean MaximumPermissionsViewAllUsers) {
    this.MaximumPermissionsViewAllUsers = MaximumPermissionsViewAllUsers;
    MaximumPermissionsViewAllUsers__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewContent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewContent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewContent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewContent__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewContent;

  public java.lang.Boolean getMaximumPermissionsViewContent() {
    return MaximumPermissionsViewContent;
  }

  

  public void setMaximumPermissionsViewContent(java.lang.Boolean MaximumPermissionsViewContent) {
    this.MaximumPermissionsViewContent = MaximumPermissionsViewContent;
    MaximumPermissionsViewContent__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewDataAssessment of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewDataAssessment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewDataAssessment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewDataAssessment__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewDataAssessment;

  public java.lang.Boolean getMaximumPermissionsViewDataAssessment() {
    return MaximumPermissionsViewDataAssessment;
  }

  

  public void setMaximumPermissionsViewDataAssessment(java.lang.Boolean MaximumPermissionsViewDataAssessment) {
    this.MaximumPermissionsViewDataAssessment = MaximumPermissionsViewDataAssessment;
    MaximumPermissionsViewDataAssessment__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewDataCategories of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewDataCategories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewDataCategories","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewDataCategories__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewDataCategories;

  public java.lang.Boolean getMaximumPermissionsViewDataCategories() {
    return MaximumPermissionsViewDataCategories;
  }

  

  public void setMaximumPermissionsViewDataCategories(java.lang.Boolean MaximumPermissionsViewDataCategories) {
    this.MaximumPermissionsViewDataCategories = MaximumPermissionsViewDataCategories;
    MaximumPermissionsViewDataCategories__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewEncryptedData of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewEncryptedData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewEncryptedData","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewEncryptedData__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewEncryptedData;

  public java.lang.Boolean getMaximumPermissionsViewEncryptedData() {
    return MaximumPermissionsViewEncryptedData;
  }

  

  public void setMaximumPermissionsViewEncryptedData(java.lang.Boolean MaximumPermissionsViewEncryptedData) {
    this.MaximumPermissionsViewEncryptedData = MaximumPermissionsViewEncryptedData;
    MaximumPermissionsViewEncryptedData__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewEventLogFiles of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewEventLogFiles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewEventLogFiles","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewEventLogFiles__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewEventLogFiles;

  public java.lang.Boolean getMaximumPermissionsViewEventLogFiles() {
    return MaximumPermissionsViewEventLogFiles;
  }

  

  public void setMaximumPermissionsViewEventLogFiles(java.lang.Boolean MaximumPermissionsViewEventLogFiles) {
    this.MaximumPermissionsViewEventLogFiles = MaximumPermissionsViewEventLogFiles;
    MaximumPermissionsViewEventLogFiles__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewHelpLink of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewHelpLink__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewHelpLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewHelpLink__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewHelpLink;

  public java.lang.Boolean getMaximumPermissionsViewHelpLink() {
    return MaximumPermissionsViewHelpLink;
  }

  

  public void setMaximumPermissionsViewHelpLink(java.lang.Boolean MaximumPermissionsViewHelpLink) {
    this.MaximumPermissionsViewHelpLink = MaximumPermissionsViewHelpLink;
    MaximumPermissionsViewHelpLink__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewMyTeamsDashboards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewMyTeamsDashboards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewMyTeamsDashboards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewMyTeamsDashboards__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewMyTeamsDashboards;

  public java.lang.Boolean getMaximumPermissionsViewMyTeamsDashboards() {
    return MaximumPermissionsViewMyTeamsDashboards;
  }

  

  public void setMaximumPermissionsViewMyTeamsDashboards(java.lang.Boolean MaximumPermissionsViewMyTeamsDashboards) {
    this.MaximumPermissionsViewMyTeamsDashboards = MaximumPermissionsViewMyTeamsDashboards;
    MaximumPermissionsViewMyTeamsDashboards__is_set = true;
  }
  
  /**
   * element  : MaximumPermissionsViewSetup of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo MaximumPermissionsViewSetup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MaximumPermissionsViewSetup","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean MaximumPermissionsViewSetup__is_set = false;

  private java.lang.Boolean MaximumPermissionsViewSetup;

  public java.lang.Boolean getMaximumPermissionsViewSetup() {
    return MaximumPermissionsViewSetup;
  }

  

  public void setMaximumPermissionsViewSetup(java.lang.Boolean MaximumPermissionsViewSetup) {
    this.MaximumPermissionsViewSetup = MaximumPermissionsViewSetup;
    MaximumPermissionsViewSetup__is_set = true;
  }
  
  /**
   * element  : PermissionSetLicenseAssignments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionSetLicenseAssignments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionSetLicenseAssignments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean PermissionSetLicenseAssignments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult PermissionSetLicenseAssignments;

  public com.sforce.soap.enterprise.QueryResult getPermissionSetLicenseAssignments() {
    return PermissionSetLicenseAssignments;
  }

  

  public void setPermissionSetLicenseAssignments(com.sforce.soap.enterprise.QueryResult PermissionSetLicenseAssignments) {
    this.PermissionSetLicenseAssignments = PermissionSetLicenseAssignments;
    PermissionSetLicenseAssignments__is_set = true;
  }
  
  /**
   * element  : PermissionSetLicenseKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionSetLicenseKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionSetLicenseKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PermissionSetLicenseKey__is_set = false;

  private java.lang.String PermissionSetLicenseKey;

  public java.lang.String getPermissionSetLicenseKey() {
    return PermissionSetLicenseKey;
  }

  

  public void setPermissionSetLicenseKey(java.lang.String PermissionSetLicenseKey) {
    this.PermissionSetLicenseKey = PermissionSetLicenseKey;
    PermissionSetLicenseKey__is_set = true;
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
   * element  : TotalLicenses of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TotalLicenses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TotalLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TotalLicenses__is_set = false;

  private java.lang.Integer TotalLicenses;

  public java.lang.Integer getTotalLicenses() {
    return TotalLicenses;
  }

  

  public void setTotalLicenses(java.lang.Integer TotalLicenses) {
    this.TotalLicenses = TotalLicenses;
    TotalLicenses__is_set = true;
  }
  
  /**
   * element  : UsedLicenses of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo UsedLicenses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UsedLicenses","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean UsedLicenses__is_set = false;

  private java.lang.Integer UsedLicenses;

  public java.lang.Integer getUsedLicenses() {
    return UsedLicenses;
  }

  

  public void setUsedLicenses(java.lang.Integer UsedLicenses) {
    this.UsedLicenses = UsedLicenses;
    UsedLicenses__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PermissionSetLicense");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeObject(__out, ExpirationDate__typeInfo, ExpirationDate, ExpirationDate__is_set);
    __typeMapper.writeObject(__out, GrantedByLicenses__typeInfo, GrantedByLicenses, GrantedByLicenses__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Language__typeInfo, Language, Language__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsActivateContract__typeInfo, MaximumPermissionsActivateContract, MaximumPermissionsActivateContract__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsAllowEmailIC__typeInfo, MaximumPermissionsAllowEmailIC, MaximumPermissionsAllowEmailIC__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsAllowUniversalSearch__typeInfo, MaximumPermissionsAllowUniversalSearch, MaximumPermissionsAllowUniversalSearch__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsAllowViewKnowledge__typeInfo, MaximumPermissionsAllowViewKnowledge, MaximumPermissionsAllowViewKnowledge__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsApiEnabled__typeInfo, MaximumPermissionsApiEnabled, MaximumPermissionsApiEnabled__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsApiUserOnly__typeInfo, MaximumPermissionsApiUserOnly, MaximumPermissionsApiUserOnly__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsAssignPermissionSets__typeInfo, MaximumPermissionsAssignPermissionSets, MaximumPermissionsAssignPermissionSets__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsAssignTopics__typeInfo, MaximumPermissionsAssignTopics, MaximumPermissionsAssignTopics__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsAuthorApex__typeInfo, MaximumPermissionsAuthorApex, MaximumPermissionsAuthorApex__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsBulkApiHardDelete__typeInfo, MaximumPermissionsBulkApiHardDelete, MaximumPermissionsBulkApiHardDelete__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsBulkMacrosAllowed__typeInfo, MaximumPermissionsBulkMacrosAllowed, MaximumPermissionsBulkMacrosAllowed__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCampaignInfluence2__typeInfo, MaximumPermissionsCampaignInfluence2, MaximumPermissionsCampaignInfluence2__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCanApproveFeedPost__typeInfo, MaximumPermissionsCanApproveFeedPost, MaximumPermissionsCanApproveFeedPost__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCanInsertFeedSystemFields__typeInfo, MaximumPermissionsCanInsertFeedSystemFields, MaximumPermissionsCanInsertFeedSystemFields__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCanUseNewDashboardBuilder__typeInfo, MaximumPermissionsCanUseNewDashboardBuilder, MaximumPermissionsCanUseNewDashboardBuilder__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterComposeUiCodesnippet__typeInfo, MaximumPermissionsChatterComposeUiCodesnippet, MaximumPermissionsChatterComposeUiCodesnippet__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterEditOwnPost__typeInfo, MaximumPermissionsChatterEditOwnPost, MaximumPermissionsChatterEditOwnPost__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterEditOwnRecordPost__typeInfo, MaximumPermissionsChatterEditOwnRecordPost, MaximumPermissionsChatterEditOwnRecordPost__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterFileLink__typeInfo, MaximumPermissionsChatterFileLink, MaximumPermissionsChatterFileLink__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterForSharePoint__typeInfo, MaximumPermissionsChatterForSharePoint, MaximumPermissionsChatterForSharePoint__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterInternalUser__typeInfo, MaximumPermissionsChatterInternalUser, MaximumPermissionsChatterInternalUser__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterInviteExternalUsers__typeInfo, MaximumPermissionsChatterInviteExternalUsers, MaximumPermissionsChatterInviteExternalUsers__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsChatterOwnGroups__typeInfo, MaximumPermissionsChatterOwnGroups, MaximumPermissionsChatterOwnGroups__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsConfigCustomRecs__typeInfo, MaximumPermissionsConfigCustomRecs, MaximumPermissionsConfigCustomRecs__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsConnectOrgToEnvironmentHub__typeInfo, MaximumPermissionsConnectOrgToEnvironmentHub, MaximumPermissionsConnectOrgToEnvironmentHub__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsContentAdministrator__typeInfo, MaximumPermissionsContentAdministrator, MaximumPermissionsContentAdministrator__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsContentHubUser__typeInfo, MaximumPermissionsContentHubUser, MaximumPermissionsContentHubUser__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsConvertLeads__typeInfo, MaximumPermissionsConvertLeads, MaximumPermissionsConvertLeads__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCreateCustomizeFilters__typeInfo, MaximumPermissionsCreateCustomizeFilters, MaximumPermissionsCreateCustomizeFilters__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCreatePackaging__typeInfo, MaximumPermissionsCreatePackaging, MaximumPermissionsCreatePackaging__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCreateTopics__typeInfo, MaximumPermissionsCreateTopics, MaximumPermissionsCreateTopics__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCreateWorkBadgeDefinition__typeInfo, MaximumPermissionsCreateWorkBadgeDefinition, MaximumPermissionsCreateWorkBadgeDefinition__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCreateWorkspaces__typeInfo, MaximumPermissionsCreateWorkspaces, MaximumPermissionsCreateWorkspaces__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCustomMobileAppsAccess__typeInfo, MaximumPermissionsCustomMobileAppsAccess, MaximumPermissionsCustomMobileAppsAccess__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsCustomizeApplication__typeInfo, MaximumPermissionsCustomizeApplication, MaximumPermissionsCustomizeApplication__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsDataExport__typeInfo, MaximumPermissionsDataExport, MaximumPermissionsDataExport__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsDelegatedPortalUserAdmin__typeInfo, MaximumPermissionsDelegatedPortalUserAdmin, MaximumPermissionsDelegatedPortalUserAdmin__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsDelegatedTwoFactor__typeInfo, MaximumPermissionsDelegatedTwoFactor, MaximumPermissionsDelegatedTwoFactor__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsDeleteActivatedContract__typeInfo, MaximumPermissionsDeleteActivatedContract, MaximumPermissionsDeleteActivatedContract__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsDeleteTopics__typeInfo, MaximumPermissionsDeleteTopics, MaximumPermissionsDeleteTopics__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsDistributeFromPersWksp__typeInfo, MaximumPermissionsDistributeFromPersWksp, MaximumPermissionsDistributeFromPersWksp__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditBrandTemplates__typeInfo, MaximumPermissionsEditBrandTemplates, MaximumPermissionsEditBrandTemplates__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditCaseComments__typeInfo, MaximumPermissionsEditCaseComments, MaximumPermissionsEditCaseComments__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditEvent__typeInfo, MaximumPermissionsEditEvent, MaximumPermissionsEditEvent__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditHtmlTemplates__typeInfo, MaximumPermissionsEditHtmlTemplates, MaximumPermissionsEditHtmlTemplates__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditKnowledge__typeInfo, MaximumPermissionsEditKnowledge, MaximumPermissionsEditKnowledge__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditOppLineItemUnitPrice__typeInfo, MaximumPermissionsEditOppLineItemUnitPrice, MaximumPermissionsEditOppLineItemUnitPrice__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditPublicDocuments__typeInfo, MaximumPermissionsEditPublicDocuments, MaximumPermissionsEditPublicDocuments__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditPublicTemplates__typeInfo, MaximumPermissionsEditPublicTemplates, MaximumPermissionsEditPublicTemplates__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditReadonlyFields__typeInfo, MaximumPermissionsEditReadonlyFields, MaximumPermissionsEditReadonlyFields__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditReports__typeInfo, MaximumPermissionsEditReports, MaximumPermissionsEditReports__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditTask__typeInfo, MaximumPermissionsEditTask, MaximumPermissionsEditTask__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEditTopics__typeInfo, MaximumPermissionsEditTopics, MaximumPermissionsEditTopics__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEmailAdministration__typeInfo, MaximumPermissionsEmailAdministration, MaximumPermissionsEmailAdministration__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEmailMass__typeInfo, MaximumPermissionsEmailMass, MaximumPermissionsEmailMass__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEmailSingle__typeInfo, MaximumPermissionsEmailSingle, MaximumPermissionsEmailSingle__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEmailTemplateManagement__typeInfo, MaximumPermissionsEmailTemplateManagement, MaximumPermissionsEmailTemplateManagement__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsEnableNotifications__typeInfo, MaximumPermissionsEnableNotifications, MaximumPermissionsEnableNotifications__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsExportReport__typeInfo, MaximumPermissionsExportReport, MaximumPermissionsExportReport__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsFlowUFLRequired__typeInfo, MaximumPermissionsFlowUFLRequired, MaximumPermissionsFlowUFLRequired__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsForceTwoFactor__typeInfo, MaximumPermissionsForceTwoFactor, MaximumPermissionsForceTwoFactor__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsHasFileSync__typeInfo, MaximumPermissionsHasFileSync, MaximumPermissionsHasFileSync__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsIPRestrictRequests__typeInfo, MaximumPermissionsIPRestrictRequests, MaximumPermissionsIPRestrictRequests__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsIdentityConnect__typeInfo, MaximumPermissionsIdentityConnect, MaximumPermissionsIdentityConnect__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsIdentityEnabled__typeInfo, MaximumPermissionsIdentityEnabled, MaximumPermissionsIdentityEnabled__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsImportCustomObjects__typeInfo, MaximumPermissionsImportCustomObjects, MaximumPermissionsImportCustomObjects__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsImportLeads__typeInfo, MaximumPermissionsImportLeads, MaximumPermissionsImportLeads__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsImportPersonal__typeInfo, MaximumPermissionsImportPersonal, MaximumPermissionsImportPersonal__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsInboundMigrationToolsUser__typeInfo, MaximumPermissionsInboundMigrationToolsUser, MaximumPermissionsInboundMigrationToolsUser__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsInstallPackaging__typeInfo, MaximumPermissionsInstallPackaging, MaximumPermissionsInstallPackaging__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsIsSsoEnabled__typeInfo, MaximumPermissionsIsSsoEnabled, MaximumPermissionsIsSsoEnabled__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsLightningExperienceUser__typeInfo, MaximumPermissionsLightningExperienceUser, MaximumPermissionsLightningExperienceUser__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageAnalyticSnapshots__typeInfo, MaximumPermissionsManageAnalyticSnapshots, MaximumPermissionsManageAnalyticSnapshots__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageAuthProviders__typeInfo, MaximumPermissionsManageAuthProviders, MaximumPermissionsManageAuthProviders__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageBusinessHourHolidays__typeInfo, MaximumPermissionsManageBusinessHourHolidays, MaximumPermissionsManageBusinessHourHolidays__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageCallCenters__typeInfo, MaximumPermissionsManageCallCenters, MaximumPermissionsManageCallCenters__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageCases__typeInfo, MaximumPermissionsManageCases, MaximumPermissionsManageCases__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageCategories__typeInfo, MaximumPermissionsManageCategories, MaximumPermissionsManageCategories__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageChatterMessages__typeInfo, MaximumPermissionsManageChatterMessages, MaximumPermissionsManageChatterMessages__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageContentPermissions__typeInfo, MaximumPermissionsManageContentPermissions, MaximumPermissionsManageContentPermissions__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageContentProperties__typeInfo, MaximumPermissionsManageContentProperties, MaximumPermissionsManageContentProperties__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageContentTypes__typeInfo, MaximumPermissionsManageContentTypes, MaximumPermissionsManageContentTypes__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageCssUsers__typeInfo, MaximumPermissionsManageCssUsers, MaximumPermissionsManageCssUsers__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageCustomPermissions__typeInfo, MaximumPermissionsManageCustomPermissions, MaximumPermissionsManageCustomPermissions__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageCustomReportTypes__typeInfo, MaximumPermissionsManageCustomReportTypes, MaximumPermissionsManageCustomReportTypes__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageDashboards__typeInfo, MaximumPermissionsManageDashboards, MaximumPermissionsManageDashboards__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageDataCategories__typeInfo, MaximumPermissionsManageDataCategories, MaximumPermissionsManageDataCategories__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageDataIntegrations__typeInfo, MaximumPermissionsManageDataIntegrations, MaximumPermissionsManageDataIntegrations__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageDynamicDashboards__typeInfo, MaximumPermissionsManageDynamicDashboards, MaximumPermissionsManageDynamicDashboards__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageEmailClientConfig__typeInfo, MaximumPermissionsManageEmailClientConfig, MaximumPermissionsManageEmailClientConfig__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageExchangeConfig__typeInfo, MaximumPermissionsManageExchangeConfig, MaximumPermissionsManageExchangeConfig__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageInteraction__typeInfo, MaximumPermissionsManageInteraction, MaximumPermissionsManageInteraction__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageInternalUsers__typeInfo, MaximumPermissionsManageInternalUsers, MaximumPermissionsManageInternalUsers__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageIpAddresses__typeInfo, MaximumPermissionsManageIpAddresses, MaximumPermissionsManageIpAddresses__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageKnowledge__typeInfo, MaximumPermissionsManageKnowledge, MaximumPermissionsManageKnowledge__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageKnowledgeImportExport__typeInfo, MaximumPermissionsManageKnowledgeImportExport, MaximumPermissionsManageKnowledgeImportExport__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageLeads__typeInfo, MaximumPermissionsManageLeads, MaximumPermissionsManageLeads__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageLoginAccessPolicies__typeInfo, MaximumPermissionsManageLoginAccessPolicies, MaximumPermissionsManageLoginAccessPolicies__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageMobile__typeInfo, MaximumPermissionsManageMobile, MaximumPermissionsManageMobile__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManagePartners__typeInfo, MaximumPermissionsManagePartners, MaximumPermissionsManagePartners__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManagePasswordPolicies__typeInfo, MaximumPermissionsManagePasswordPolicies, MaximumPermissionsManagePasswordPolicies__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageProfilesPermissionsets__typeInfo, MaximumPermissionsManageProfilesPermissionsets, MaximumPermissionsManageProfilesPermissionsets__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManagePvtRptsAndDashbds__typeInfo, MaximumPermissionsManagePvtRptsAndDashbds, MaximumPermissionsManagePvtRptsAndDashbds__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageRemoteAccess__typeInfo, MaximumPermissionsManageRemoteAccess, MaximumPermissionsManageRemoteAccess__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageRoles__typeInfo, MaximumPermissionsManageRoles, MaximumPermissionsManageRoles__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageSandboxes__typeInfo, MaximumPermissionsManageSandboxes, MaximumPermissionsManageSandboxes__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageSearchPromotionRules__typeInfo, MaximumPermissionsManageSearchPromotionRules, MaximumPermissionsManageSearchPromotionRules__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageSelfService__typeInfo, MaximumPermissionsManageSelfService, MaximumPermissionsManageSelfService__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageSharing__typeInfo, MaximumPermissionsManageSharing, MaximumPermissionsManageSharing__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageSolutions__typeInfo, MaximumPermissionsManageSolutions, MaximumPermissionsManageSolutions__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageSynonyms__typeInfo, MaximumPermissionsManageSynonyms, MaximumPermissionsManageSynonyms__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageTranslation__typeInfo, MaximumPermissionsManageTranslation, MaximumPermissionsManageTranslation__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageTwoFactor__typeInfo, MaximumPermissionsManageTwoFactor, MaximumPermissionsManageTwoFactor__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageUnlistedGroups__typeInfo, MaximumPermissionsManageUnlistedGroups, MaximumPermissionsManageUnlistedGroups__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsManageUsers__typeInfo, MaximumPermissionsManageUsers, MaximumPermissionsManageUsers__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsMassInlineEdit__typeInfo, MaximumPermissionsMassInlineEdit, MaximumPermissionsMassInlineEdit__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsMergeTopics__typeInfo, MaximumPermissionsMergeTopics, MaximumPermissionsMergeTopics__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsModerateChatter__typeInfo, MaximumPermissionsModerateChatter, MaximumPermissionsModerateChatter__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsModifyAllData__typeInfo, MaximumPermissionsModifyAllData, MaximumPermissionsModifyAllData__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsNewReportBuilder__typeInfo, MaximumPermissionsNewReportBuilder, MaximumPermissionsNewReportBuilder__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsOutboundMigrationToolsUser__typeInfo, MaximumPermissionsOutboundMigrationToolsUser, MaximumPermissionsOutboundMigrationToolsUser__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsPasswordNeverExpires__typeInfo, MaximumPermissionsPasswordNeverExpires, MaximumPermissionsPasswordNeverExpires__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsPublishPackaging__typeInfo, MaximumPermissionsPublishPackaging, MaximumPermissionsPublishPackaging__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsResetPasswords__typeInfo, MaximumPermissionsResetPasswords, MaximumPermissionsResetPasswords__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsRunFlow__typeInfo, MaximumPermissionsRunFlow, MaximumPermissionsRunFlow__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsRunReports__typeInfo, MaximumPermissionsRunReports, MaximumPermissionsRunReports__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsSalesConsole__typeInfo, MaximumPermissionsSalesConsole, MaximumPermissionsSalesConsole__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsScheduleJob__typeInfo, MaximumPermissionsScheduleJob, MaximumPermissionsScheduleJob__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsScheduleReports__typeInfo, MaximumPermissionsScheduleReports, MaximumPermissionsScheduleReports__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsSelectFilesFromSalesforce__typeInfo, MaximumPermissionsSelectFilesFromSalesforce, MaximumPermissionsSelectFilesFromSalesforce__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsSendAnnouncementEmails__typeInfo, MaximumPermissionsSendAnnouncementEmails, MaximumPermissionsSendAnnouncementEmails__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsSendSitRequests__typeInfo, MaximumPermissionsSendSitRequests, MaximumPermissionsSendSitRequests__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsShareInternalArticles__typeInfo, MaximumPermissionsShareInternalArticles, MaximumPermissionsShareInternalArticles__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsShowCompanyNameAsUserBadge__typeInfo, MaximumPermissionsShowCompanyNameAsUserBadge, MaximumPermissionsShowCompanyNameAsUserBadge__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsSocialInsightsLogoAdmin__typeInfo, MaximumPermissionsSocialInsightsLogoAdmin, MaximumPermissionsSocialInsightsLogoAdmin__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsSolutionImport__typeInfo, MaximumPermissionsSolutionImport, MaximumPermissionsSolutionImport__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsSubmitMacrosAllowed__typeInfo, MaximumPermissionsSubmitMacrosAllowed, MaximumPermissionsSubmitMacrosAllowed__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsTagManager__typeInfo, MaximumPermissionsTagManager, MaximumPermissionsTagManager__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsTransferAnyCase__typeInfo, MaximumPermissionsTransferAnyCase, MaximumPermissionsTransferAnyCase__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsTransferAnyEntity__typeInfo, MaximumPermissionsTransferAnyEntity, MaximumPermissionsTransferAnyEntity__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsTransferAnyLead__typeInfo, MaximumPermissionsTransferAnyLead, MaximumPermissionsTransferAnyLead__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsTwoFactorApi__typeInfo, MaximumPermissionsTwoFactorApi, MaximumPermissionsTwoFactorApi__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsUseTeamReassignWizards__typeInfo, MaximumPermissionsUseTeamReassignWizards, MaximumPermissionsUseTeamReassignWizards__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewAllData__typeInfo, MaximumPermissionsViewAllData, MaximumPermissionsViewAllData__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewAllUsers__typeInfo, MaximumPermissionsViewAllUsers, MaximumPermissionsViewAllUsers__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewContent__typeInfo, MaximumPermissionsViewContent, MaximumPermissionsViewContent__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewDataAssessment__typeInfo, MaximumPermissionsViewDataAssessment, MaximumPermissionsViewDataAssessment__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewDataCategories__typeInfo, MaximumPermissionsViewDataCategories, MaximumPermissionsViewDataCategories__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewEncryptedData__typeInfo, MaximumPermissionsViewEncryptedData, MaximumPermissionsViewEncryptedData__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewEventLogFiles__typeInfo, MaximumPermissionsViewEventLogFiles, MaximumPermissionsViewEventLogFiles__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewHelpLink__typeInfo, MaximumPermissionsViewHelpLink, MaximumPermissionsViewHelpLink__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewMyTeamsDashboards__typeInfo, MaximumPermissionsViewMyTeamsDashboards, MaximumPermissionsViewMyTeamsDashboards__is_set);
    __typeMapper.writeObject(__out, MaximumPermissionsViewSetup__typeInfo, MaximumPermissionsViewSetup, MaximumPermissionsViewSetup__is_set);
    __typeMapper.writeObject(__out, PermissionSetLicenseAssignments__typeInfo, PermissionSetLicenseAssignments, PermissionSetLicenseAssignments__is_set);
    __typeMapper.writeString(__out, PermissionSetLicenseKey__typeInfo, PermissionSetLicenseKey, PermissionSetLicenseKey__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, TotalLicenses__typeInfo, TotalLicenses, TotalLicenses__is_set);
    __typeMapper.writeObject(__out, UsedLicenses__typeInfo, UsedLicenses, UsedLicenses__is_set);
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
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExpirationDate__typeInfo)) {
      setExpirationDate((java.util.Calendar)__typeMapper.readObject(__in, ExpirationDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, GrantedByLicenses__typeInfo)) {
      setGrantedByLicenses((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, GrantedByLicenses__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Language__typeInfo)) {
      setLanguage((java.lang.String)__typeMapper.readString(__in, Language__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, MasterLabel__typeInfo)) {
      setMasterLabel((java.lang.String)__typeMapper.readString(__in, MasterLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsActivateContract__typeInfo)) {
      setMaximumPermissionsActivateContract((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsActivateContract__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsAllowEmailIC__typeInfo)) {
      setMaximumPermissionsAllowEmailIC((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsAllowEmailIC__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsAllowUniversalSearch__typeInfo)) {
      setMaximumPermissionsAllowUniversalSearch((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsAllowUniversalSearch__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsAllowViewKnowledge__typeInfo)) {
      setMaximumPermissionsAllowViewKnowledge((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsAllowViewKnowledge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsApiEnabled__typeInfo)) {
      setMaximumPermissionsApiEnabled((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsApiEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsApiUserOnly__typeInfo)) {
      setMaximumPermissionsApiUserOnly((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsApiUserOnly__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsAssignPermissionSets__typeInfo)) {
      setMaximumPermissionsAssignPermissionSets((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsAssignPermissionSets__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsAssignTopics__typeInfo)) {
      setMaximumPermissionsAssignTopics((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsAssignTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsAuthorApex__typeInfo)) {
      setMaximumPermissionsAuthorApex((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsAuthorApex__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsBulkApiHardDelete__typeInfo)) {
      setMaximumPermissionsBulkApiHardDelete((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsBulkApiHardDelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsBulkMacrosAllowed__typeInfo)) {
      setMaximumPermissionsBulkMacrosAllowed((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsBulkMacrosAllowed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCampaignInfluence2__typeInfo)) {
      setMaximumPermissionsCampaignInfluence2((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCampaignInfluence2__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCanApproveFeedPost__typeInfo)) {
      setMaximumPermissionsCanApproveFeedPost((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCanApproveFeedPost__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCanInsertFeedSystemFields__typeInfo)) {
      setMaximumPermissionsCanInsertFeedSystemFields((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCanInsertFeedSystemFields__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCanUseNewDashboardBuilder__typeInfo)) {
      setMaximumPermissionsCanUseNewDashboardBuilder((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCanUseNewDashboardBuilder__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterComposeUiCodesnippet__typeInfo)) {
      setMaximumPermissionsChatterComposeUiCodesnippet((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterComposeUiCodesnippet__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterEditOwnPost__typeInfo)) {
      setMaximumPermissionsChatterEditOwnPost((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterEditOwnPost__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterEditOwnRecordPost__typeInfo)) {
      setMaximumPermissionsChatterEditOwnRecordPost((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterEditOwnRecordPost__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterFileLink__typeInfo)) {
      setMaximumPermissionsChatterFileLink((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterFileLink__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterForSharePoint__typeInfo)) {
      setMaximumPermissionsChatterForSharePoint((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterForSharePoint__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterInternalUser__typeInfo)) {
      setMaximumPermissionsChatterInternalUser((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterInternalUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterInviteExternalUsers__typeInfo)) {
      setMaximumPermissionsChatterInviteExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterInviteExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsChatterOwnGroups__typeInfo)) {
      setMaximumPermissionsChatterOwnGroups((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsChatterOwnGroups__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsConfigCustomRecs__typeInfo)) {
      setMaximumPermissionsConfigCustomRecs((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsConfigCustomRecs__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsConnectOrgToEnvironmentHub__typeInfo)) {
      setMaximumPermissionsConnectOrgToEnvironmentHub((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsConnectOrgToEnvironmentHub__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsContentAdministrator__typeInfo)) {
      setMaximumPermissionsContentAdministrator((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsContentAdministrator__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsContentHubUser__typeInfo)) {
      setMaximumPermissionsContentHubUser((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsContentHubUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsConvertLeads__typeInfo)) {
      setMaximumPermissionsConvertLeads((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsConvertLeads__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCreateCustomizeFilters__typeInfo)) {
      setMaximumPermissionsCreateCustomizeFilters((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCreateCustomizeFilters__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCreatePackaging__typeInfo)) {
      setMaximumPermissionsCreatePackaging((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCreatePackaging__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCreateTopics__typeInfo)) {
      setMaximumPermissionsCreateTopics((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCreateTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCreateWorkBadgeDefinition__typeInfo)) {
      setMaximumPermissionsCreateWorkBadgeDefinition((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCreateWorkBadgeDefinition__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCreateWorkspaces__typeInfo)) {
      setMaximumPermissionsCreateWorkspaces((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCreateWorkspaces__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCustomMobileAppsAccess__typeInfo)) {
      setMaximumPermissionsCustomMobileAppsAccess((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCustomMobileAppsAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsCustomizeApplication__typeInfo)) {
      setMaximumPermissionsCustomizeApplication((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsCustomizeApplication__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsDataExport__typeInfo)) {
      setMaximumPermissionsDataExport((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsDataExport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsDelegatedPortalUserAdmin__typeInfo)) {
      setMaximumPermissionsDelegatedPortalUserAdmin((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsDelegatedPortalUserAdmin__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsDelegatedTwoFactor__typeInfo)) {
      setMaximumPermissionsDelegatedTwoFactor((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsDelegatedTwoFactor__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsDeleteActivatedContract__typeInfo)) {
      setMaximumPermissionsDeleteActivatedContract((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsDeleteActivatedContract__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsDeleteTopics__typeInfo)) {
      setMaximumPermissionsDeleteTopics((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsDeleteTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsDistributeFromPersWksp__typeInfo)) {
      setMaximumPermissionsDistributeFromPersWksp((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsDistributeFromPersWksp__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditBrandTemplates__typeInfo)) {
      setMaximumPermissionsEditBrandTemplates((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditBrandTemplates__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditCaseComments__typeInfo)) {
      setMaximumPermissionsEditCaseComments((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditCaseComments__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditEvent__typeInfo)) {
      setMaximumPermissionsEditEvent((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditEvent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditHtmlTemplates__typeInfo)) {
      setMaximumPermissionsEditHtmlTemplates((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditHtmlTemplates__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditKnowledge__typeInfo)) {
      setMaximumPermissionsEditKnowledge((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditKnowledge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditOppLineItemUnitPrice__typeInfo)) {
      setMaximumPermissionsEditOppLineItemUnitPrice((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditOppLineItemUnitPrice__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditPublicDocuments__typeInfo)) {
      setMaximumPermissionsEditPublicDocuments((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditPublicDocuments__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditPublicTemplates__typeInfo)) {
      setMaximumPermissionsEditPublicTemplates((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditPublicTemplates__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditReadonlyFields__typeInfo)) {
      setMaximumPermissionsEditReadonlyFields((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditReadonlyFields__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditReports__typeInfo)) {
      setMaximumPermissionsEditReports((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditReports__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditTask__typeInfo)) {
      setMaximumPermissionsEditTask((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditTask__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEditTopics__typeInfo)) {
      setMaximumPermissionsEditTopics((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEditTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEmailAdministration__typeInfo)) {
      setMaximumPermissionsEmailAdministration((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEmailAdministration__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEmailMass__typeInfo)) {
      setMaximumPermissionsEmailMass((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEmailMass__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEmailSingle__typeInfo)) {
      setMaximumPermissionsEmailSingle((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEmailSingle__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEmailTemplateManagement__typeInfo)) {
      setMaximumPermissionsEmailTemplateManagement((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEmailTemplateManagement__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsEnableNotifications__typeInfo)) {
      setMaximumPermissionsEnableNotifications((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsEnableNotifications__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsExportReport__typeInfo)) {
      setMaximumPermissionsExportReport((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsExportReport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsFlowUFLRequired__typeInfo)) {
      setMaximumPermissionsFlowUFLRequired((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsFlowUFLRequired__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsForceTwoFactor__typeInfo)) {
      setMaximumPermissionsForceTwoFactor((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsForceTwoFactor__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsHasFileSync__typeInfo)) {
      setMaximumPermissionsHasFileSync((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsHasFileSync__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsIPRestrictRequests__typeInfo)) {
      setMaximumPermissionsIPRestrictRequests((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsIPRestrictRequests__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsIdentityConnect__typeInfo)) {
      setMaximumPermissionsIdentityConnect((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsIdentityConnect__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsIdentityEnabled__typeInfo)) {
      setMaximumPermissionsIdentityEnabled((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsIdentityEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsImportCustomObjects__typeInfo)) {
      setMaximumPermissionsImportCustomObjects((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsImportCustomObjects__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsImportLeads__typeInfo)) {
      setMaximumPermissionsImportLeads((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsImportLeads__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsImportPersonal__typeInfo)) {
      setMaximumPermissionsImportPersonal((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsImportPersonal__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsInboundMigrationToolsUser__typeInfo)) {
      setMaximumPermissionsInboundMigrationToolsUser((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsInboundMigrationToolsUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsInstallPackaging__typeInfo)) {
      setMaximumPermissionsInstallPackaging((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsInstallPackaging__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsIsSsoEnabled__typeInfo)) {
      setMaximumPermissionsIsSsoEnabled((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsIsSsoEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsLightningExperienceUser__typeInfo)) {
      setMaximumPermissionsLightningExperienceUser((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsLightningExperienceUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageAnalyticSnapshots__typeInfo)) {
      setMaximumPermissionsManageAnalyticSnapshots((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageAnalyticSnapshots__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageAuthProviders__typeInfo)) {
      setMaximumPermissionsManageAuthProviders((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageAuthProviders__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageBusinessHourHolidays__typeInfo)) {
      setMaximumPermissionsManageBusinessHourHolidays((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageBusinessHourHolidays__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageCallCenters__typeInfo)) {
      setMaximumPermissionsManageCallCenters((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageCallCenters__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageCases__typeInfo)) {
      setMaximumPermissionsManageCases((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageCases__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageCategories__typeInfo)) {
      setMaximumPermissionsManageCategories((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageCategories__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageChatterMessages__typeInfo)) {
      setMaximumPermissionsManageChatterMessages((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageChatterMessages__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageContentPermissions__typeInfo)) {
      setMaximumPermissionsManageContentPermissions((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageContentPermissions__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageContentProperties__typeInfo)) {
      setMaximumPermissionsManageContentProperties((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageContentProperties__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageContentTypes__typeInfo)) {
      setMaximumPermissionsManageContentTypes((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageContentTypes__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageCssUsers__typeInfo)) {
      setMaximumPermissionsManageCssUsers((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageCssUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageCustomPermissions__typeInfo)) {
      setMaximumPermissionsManageCustomPermissions((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageCustomPermissions__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageCustomReportTypes__typeInfo)) {
      setMaximumPermissionsManageCustomReportTypes((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageCustomReportTypes__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageDashboards__typeInfo)) {
      setMaximumPermissionsManageDashboards((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageDashboards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageDataCategories__typeInfo)) {
      setMaximumPermissionsManageDataCategories((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageDataCategories__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageDataIntegrations__typeInfo)) {
      setMaximumPermissionsManageDataIntegrations((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageDataIntegrations__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageDynamicDashboards__typeInfo)) {
      setMaximumPermissionsManageDynamicDashboards((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageDynamicDashboards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageEmailClientConfig__typeInfo)) {
      setMaximumPermissionsManageEmailClientConfig((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageEmailClientConfig__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageExchangeConfig__typeInfo)) {
      setMaximumPermissionsManageExchangeConfig((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageExchangeConfig__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageInteraction__typeInfo)) {
      setMaximumPermissionsManageInteraction((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageInteraction__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageInternalUsers__typeInfo)) {
      setMaximumPermissionsManageInternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageInternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageIpAddresses__typeInfo)) {
      setMaximumPermissionsManageIpAddresses((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageIpAddresses__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageKnowledge__typeInfo)) {
      setMaximumPermissionsManageKnowledge((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageKnowledge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageKnowledgeImportExport__typeInfo)) {
      setMaximumPermissionsManageKnowledgeImportExport((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageKnowledgeImportExport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageLeads__typeInfo)) {
      setMaximumPermissionsManageLeads((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageLeads__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageLoginAccessPolicies__typeInfo)) {
      setMaximumPermissionsManageLoginAccessPolicies((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageLoginAccessPolicies__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageMobile__typeInfo)) {
      setMaximumPermissionsManageMobile((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageMobile__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManagePartners__typeInfo)) {
      setMaximumPermissionsManagePartners((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManagePartners__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManagePasswordPolicies__typeInfo)) {
      setMaximumPermissionsManagePasswordPolicies((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManagePasswordPolicies__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageProfilesPermissionsets__typeInfo)) {
      setMaximumPermissionsManageProfilesPermissionsets((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageProfilesPermissionsets__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManagePvtRptsAndDashbds__typeInfo)) {
      setMaximumPermissionsManagePvtRptsAndDashbds((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManagePvtRptsAndDashbds__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageRemoteAccess__typeInfo)) {
      setMaximumPermissionsManageRemoteAccess((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageRemoteAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageRoles__typeInfo)) {
      setMaximumPermissionsManageRoles((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageRoles__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageSandboxes__typeInfo)) {
      setMaximumPermissionsManageSandboxes((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageSandboxes__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageSearchPromotionRules__typeInfo)) {
      setMaximumPermissionsManageSearchPromotionRules((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageSearchPromotionRules__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageSelfService__typeInfo)) {
      setMaximumPermissionsManageSelfService((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageSelfService__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageSharing__typeInfo)) {
      setMaximumPermissionsManageSharing((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageSharing__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageSolutions__typeInfo)) {
      setMaximumPermissionsManageSolutions((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageSolutions__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageSynonyms__typeInfo)) {
      setMaximumPermissionsManageSynonyms((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageSynonyms__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageTranslation__typeInfo)) {
      setMaximumPermissionsManageTranslation((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageTranslation__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageTwoFactor__typeInfo)) {
      setMaximumPermissionsManageTwoFactor((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageTwoFactor__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageUnlistedGroups__typeInfo)) {
      setMaximumPermissionsManageUnlistedGroups((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageUnlistedGroups__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsManageUsers__typeInfo)) {
      setMaximumPermissionsManageUsers((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsManageUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsMassInlineEdit__typeInfo)) {
      setMaximumPermissionsMassInlineEdit((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsMassInlineEdit__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsMergeTopics__typeInfo)) {
      setMaximumPermissionsMergeTopics((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsMergeTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsModerateChatter__typeInfo)) {
      setMaximumPermissionsModerateChatter((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsModerateChatter__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsModifyAllData__typeInfo)) {
      setMaximumPermissionsModifyAllData((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsModifyAllData__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsNewReportBuilder__typeInfo)) {
      setMaximumPermissionsNewReportBuilder((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsNewReportBuilder__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsOutboundMigrationToolsUser__typeInfo)) {
      setMaximumPermissionsOutboundMigrationToolsUser((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsOutboundMigrationToolsUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsPasswordNeverExpires__typeInfo)) {
      setMaximumPermissionsPasswordNeverExpires((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsPasswordNeverExpires__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsPublishPackaging__typeInfo)) {
      setMaximumPermissionsPublishPackaging((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsPublishPackaging__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsResetPasswords__typeInfo)) {
      setMaximumPermissionsResetPasswords((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsResetPasswords__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsRunFlow__typeInfo)) {
      setMaximumPermissionsRunFlow((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsRunFlow__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsRunReports__typeInfo)) {
      setMaximumPermissionsRunReports((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsRunReports__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsSalesConsole__typeInfo)) {
      setMaximumPermissionsSalesConsole((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsSalesConsole__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsScheduleJob__typeInfo)) {
      setMaximumPermissionsScheduleJob((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsScheduleJob__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsScheduleReports__typeInfo)) {
      setMaximumPermissionsScheduleReports((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsScheduleReports__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsSelectFilesFromSalesforce__typeInfo)) {
      setMaximumPermissionsSelectFilesFromSalesforce((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsSelectFilesFromSalesforce__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsSendAnnouncementEmails__typeInfo)) {
      setMaximumPermissionsSendAnnouncementEmails((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsSendAnnouncementEmails__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsSendSitRequests__typeInfo)) {
      setMaximumPermissionsSendSitRequests((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsSendSitRequests__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsShareInternalArticles__typeInfo)) {
      setMaximumPermissionsShareInternalArticles((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsShareInternalArticles__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsShowCompanyNameAsUserBadge__typeInfo)) {
      setMaximumPermissionsShowCompanyNameAsUserBadge((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsShowCompanyNameAsUserBadge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsSocialInsightsLogoAdmin__typeInfo)) {
      setMaximumPermissionsSocialInsightsLogoAdmin((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsSocialInsightsLogoAdmin__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsSolutionImport__typeInfo)) {
      setMaximumPermissionsSolutionImport((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsSolutionImport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsSubmitMacrosAllowed__typeInfo)) {
      setMaximumPermissionsSubmitMacrosAllowed((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsSubmitMacrosAllowed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsTagManager__typeInfo)) {
      setMaximumPermissionsTagManager((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsTagManager__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsTransferAnyCase__typeInfo)) {
      setMaximumPermissionsTransferAnyCase((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsTransferAnyCase__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsTransferAnyEntity__typeInfo)) {
      setMaximumPermissionsTransferAnyEntity((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsTransferAnyEntity__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsTransferAnyLead__typeInfo)) {
      setMaximumPermissionsTransferAnyLead((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsTransferAnyLead__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsTwoFactorApi__typeInfo)) {
      setMaximumPermissionsTwoFactorApi((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsTwoFactorApi__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsUseTeamReassignWizards__typeInfo)) {
      setMaximumPermissionsUseTeamReassignWizards((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsUseTeamReassignWizards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewAllData__typeInfo)) {
      setMaximumPermissionsViewAllData((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewAllData__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewAllUsers__typeInfo)) {
      setMaximumPermissionsViewAllUsers((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewAllUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewContent__typeInfo)) {
      setMaximumPermissionsViewContent((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewContent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewDataAssessment__typeInfo)) {
      setMaximumPermissionsViewDataAssessment((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewDataAssessment__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewDataCategories__typeInfo)) {
      setMaximumPermissionsViewDataCategories((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewDataCategories__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewEncryptedData__typeInfo)) {
      setMaximumPermissionsViewEncryptedData((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewEncryptedData__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewEventLogFiles__typeInfo)) {
      setMaximumPermissionsViewEventLogFiles((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewEventLogFiles__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewHelpLink__typeInfo)) {
      setMaximumPermissionsViewHelpLink((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewHelpLink__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewMyTeamsDashboards__typeInfo)) {
      setMaximumPermissionsViewMyTeamsDashboards((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewMyTeamsDashboards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaximumPermissionsViewSetup__typeInfo)) {
      setMaximumPermissionsViewSetup((java.lang.Boolean)__typeMapper.readObject(__in, MaximumPermissionsViewSetup__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionSetLicenseAssignments__typeInfo)) {
      setPermissionSetLicenseAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, PermissionSetLicenseAssignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionSetLicenseKey__typeInfo)) {
      setPermissionSetLicenseKey((java.lang.String)__typeMapper.readString(__in, PermissionSetLicenseKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TotalLicenses__typeInfo)) {
      setTotalLicenses((java.lang.Integer)__typeMapper.readObject(__in, TotalLicenses__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UsedLicenses__typeInfo)) {
      setUsedLicenses((java.lang.Integer)__typeMapper.readObject(__in, UsedLicenses__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PermissionSetLicense ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" ExpirationDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExpirationDate)+"'\n");
    sb.append(" GrantedByLicenses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GrantedByLicenses)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" Language=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Language)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" MaximumPermissionsActivateContract=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsActivateContract)+"'\n");
    sb.append(" MaximumPermissionsAllowEmailIC=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsAllowEmailIC)+"'\n");
    sb.append(" MaximumPermissionsAllowUniversalSearch=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsAllowUniversalSearch)+"'\n");
    sb.append(" MaximumPermissionsAllowViewKnowledge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsAllowViewKnowledge)+"'\n");
    sb.append(" MaximumPermissionsApiEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsApiEnabled)+"'\n");
    sb.append(" MaximumPermissionsApiUserOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsApiUserOnly)+"'\n");
    sb.append(" MaximumPermissionsAssignPermissionSets=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsAssignPermissionSets)+"'\n");
    sb.append(" MaximumPermissionsAssignTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsAssignTopics)+"'\n");
    sb.append(" MaximumPermissionsAuthorApex=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsAuthorApex)+"'\n");
    sb.append(" MaximumPermissionsBulkApiHardDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsBulkApiHardDelete)+"'\n");
    sb.append(" MaximumPermissionsBulkMacrosAllowed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsBulkMacrosAllowed)+"'\n");
    sb.append(" MaximumPermissionsCampaignInfluence2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCampaignInfluence2)+"'\n");
    sb.append(" MaximumPermissionsCanApproveFeedPost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCanApproveFeedPost)+"'\n");
    sb.append(" MaximumPermissionsCanInsertFeedSystemFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCanInsertFeedSystemFields)+"'\n");
    sb.append(" MaximumPermissionsCanUseNewDashboardBuilder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCanUseNewDashboardBuilder)+"'\n");
    sb.append(" MaximumPermissionsChatterComposeUiCodesnippet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterComposeUiCodesnippet)+"'\n");
    sb.append(" MaximumPermissionsChatterEditOwnPost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterEditOwnPost)+"'\n");
    sb.append(" MaximumPermissionsChatterEditOwnRecordPost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterEditOwnRecordPost)+"'\n");
    sb.append(" MaximumPermissionsChatterFileLink=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterFileLink)+"'\n");
    sb.append(" MaximumPermissionsChatterForSharePoint=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterForSharePoint)+"'\n");
    sb.append(" MaximumPermissionsChatterInternalUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterInternalUser)+"'\n");
    sb.append(" MaximumPermissionsChatterInviteExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterInviteExternalUsers)+"'\n");
    sb.append(" MaximumPermissionsChatterOwnGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsChatterOwnGroups)+"'\n");
    sb.append(" MaximumPermissionsConfigCustomRecs=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsConfigCustomRecs)+"'\n");
    sb.append(" MaximumPermissionsConnectOrgToEnvironmentHub=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsConnectOrgToEnvironmentHub)+"'\n");
    sb.append(" MaximumPermissionsContentAdministrator=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsContentAdministrator)+"'\n");
    sb.append(" MaximumPermissionsContentHubUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsContentHubUser)+"'\n");
    sb.append(" MaximumPermissionsConvertLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsConvertLeads)+"'\n");
    sb.append(" MaximumPermissionsCreateCustomizeFilters=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCreateCustomizeFilters)+"'\n");
    sb.append(" MaximumPermissionsCreatePackaging=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCreatePackaging)+"'\n");
    sb.append(" MaximumPermissionsCreateTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCreateTopics)+"'\n");
    sb.append(" MaximumPermissionsCreateWorkBadgeDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCreateWorkBadgeDefinition)+"'\n");
    sb.append(" MaximumPermissionsCreateWorkspaces=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCreateWorkspaces)+"'\n");
    sb.append(" MaximumPermissionsCustomMobileAppsAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCustomMobileAppsAccess)+"'\n");
    sb.append(" MaximumPermissionsCustomizeApplication=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsCustomizeApplication)+"'\n");
    sb.append(" MaximumPermissionsDataExport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsDataExport)+"'\n");
    sb.append(" MaximumPermissionsDelegatedPortalUserAdmin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsDelegatedPortalUserAdmin)+"'\n");
    sb.append(" MaximumPermissionsDelegatedTwoFactor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsDelegatedTwoFactor)+"'\n");
    sb.append(" MaximumPermissionsDeleteActivatedContract=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsDeleteActivatedContract)+"'\n");
    sb.append(" MaximumPermissionsDeleteTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsDeleteTopics)+"'\n");
    sb.append(" MaximumPermissionsDistributeFromPersWksp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsDistributeFromPersWksp)+"'\n");
    sb.append(" MaximumPermissionsEditBrandTemplates=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditBrandTemplates)+"'\n");
    sb.append(" MaximumPermissionsEditCaseComments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditCaseComments)+"'\n");
    sb.append(" MaximumPermissionsEditEvent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditEvent)+"'\n");
    sb.append(" MaximumPermissionsEditHtmlTemplates=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditHtmlTemplates)+"'\n");
    sb.append(" MaximumPermissionsEditKnowledge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditKnowledge)+"'\n");
    sb.append(" MaximumPermissionsEditOppLineItemUnitPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditOppLineItemUnitPrice)+"'\n");
    sb.append(" MaximumPermissionsEditPublicDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditPublicDocuments)+"'\n");
    sb.append(" MaximumPermissionsEditPublicTemplates=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditPublicTemplates)+"'\n");
    sb.append(" MaximumPermissionsEditReadonlyFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditReadonlyFields)+"'\n");
    sb.append(" MaximumPermissionsEditReports=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditReports)+"'\n");
    sb.append(" MaximumPermissionsEditTask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditTask)+"'\n");
    sb.append(" MaximumPermissionsEditTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEditTopics)+"'\n");
    sb.append(" MaximumPermissionsEmailAdministration=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEmailAdministration)+"'\n");
    sb.append(" MaximumPermissionsEmailMass=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEmailMass)+"'\n");
    sb.append(" MaximumPermissionsEmailSingle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEmailSingle)+"'\n");
    sb.append(" MaximumPermissionsEmailTemplateManagement=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEmailTemplateManagement)+"'\n");
    sb.append(" MaximumPermissionsEnableNotifications=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsEnableNotifications)+"'\n");
    sb.append(" MaximumPermissionsExportReport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsExportReport)+"'\n");
    sb.append(" MaximumPermissionsFlowUFLRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsFlowUFLRequired)+"'\n");
    sb.append(" MaximumPermissionsForceTwoFactor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsForceTwoFactor)+"'\n");
    sb.append(" MaximumPermissionsHasFileSync=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsHasFileSync)+"'\n");
    sb.append(" MaximumPermissionsIPRestrictRequests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsIPRestrictRequests)+"'\n");
    sb.append(" MaximumPermissionsIdentityConnect=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsIdentityConnect)+"'\n");
    sb.append(" MaximumPermissionsIdentityEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsIdentityEnabled)+"'\n");
    sb.append(" MaximumPermissionsImportCustomObjects=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsImportCustomObjects)+"'\n");
    sb.append(" MaximumPermissionsImportLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsImportLeads)+"'\n");
    sb.append(" MaximumPermissionsImportPersonal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsImportPersonal)+"'\n");
    sb.append(" MaximumPermissionsInboundMigrationToolsUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsInboundMigrationToolsUser)+"'\n");
    sb.append(" MaximumPermissionsInstallPackaging=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsInstallPackaging)+"'\n");
    sb.append(" MaximumPermissionsIsSsoEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsIsSsoEnabled)+"'\n");
    sb.append(" MaximumPermissionsLightningExperienceUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsLightningExperienceUser)+"'\n");
    sb.append(" MaximumPermissionsManageAnalyticSnapshots=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageAnalyticSnapshots)+"'\n");
    sb.append(" MaximumPermissionsManageAuthProviders=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageAuthProviders)+"'\n");
    sb.append(" MaximumPermissionsManageBusinessHourHolidays=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageBusinessHourHolidays)+"'\n");
    sb.append(" MaximumPermissionsManageCallCenters=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageCallCenters)+"'\n");
    sb.append(" MaximumPermissionsManageCases=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageCases)+"'\n");
    sb.append(" MaximumPermissionsManageCategories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageCategories)+"'\n");
    sb.append(" MaximumPermissionsManageChatterMessages=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageChatterMessages)+"'\n");
    sb.append(" MaximumPermissionsManageContentPermissions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageContentPermissions)+"'\n");
    sb.append(" MaximumPermissionsManageContentProperties=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageContentProperties)+"'\n");
    sb.append(" MaximumPermissionsManageContentTypes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageContentTypes)+"'\n");
    sb.append(" MaximumPermissionsManageCssUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageCssUsers)+"'\n");
    sb.append(" MaximumPermissionsManageCustomPermissions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageCustomPermissions)+"'\n");
    sb.append(" MaximumPermissionsManageCustomReportTypes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageCustomReportTypes)+"'\n");
    sb.append(" MaximumPermissionsManageDashboards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageDashboards)+"'\n");
    sb.append(" MaximumPermissionsManageDataCategories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageDataCategories)+"'\n");
    sb.append(" MaximumPermissionsManageDataIntegrations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageDataIntegrations)+"'\n");
    sb.append(" MaximumPermissionsManageDynamicDashboards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageDynamicDashboards)+"'\n");
    sb.append(" MaximumPermissionsManageEmailClientConfig=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageEmailClientConfig)+"'\n");
    sb.append(" MaximumPermissionsManageExchangeConfig=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageExchangeConfig)+"'\n");
    sb.append(" MaximumPermissionsManageInteraction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageInteraction)+"'\n");
    sb.append(" MaximumPermissionsManageInternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageInternalUsers)+"'\n");
    sb.append(" MaximumPermissionsManageIpAddresses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageIpAddresses)+"'\n");
    sb.append(" MaximumPermissionsManageKnowledge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageKnowledge)+"'\n");
    sb.append(" MaximumPermissionsManageKnowledgeImportExport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageKnowledgeImportExport)+"'\n");
    sb.append(" MaximumPermissionsManageLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageLeads)+"'\n");
    sb.append(" MaximumPermissionsManageLoginAccessPolicies=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageLoginAccessPolicies)+"'\n");
    sb.append(" MaximumPermissionsManageMobile=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageMobile)+"'\n");
    sb.append(" MaximumPermissionsManagePartners=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManagePartners)+"'\n");
    sb.append(" MaximumPermissionsManagePasswordPolicies=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManagePasswordPolicies)+"'\n");
    sb.append(" MaximumPermissionsManageProfilesPermissionsets=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageProfilesPermissionsets)+"'\n");
    sb.append(" MaximumPermissionsManagePvtRptsAndDashbds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManagePvtRptsAndDashbds)+"'\n");
    sb.append(" MaximumPermissionsManageRemoteAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageRemoteAccess)+"'\n");
    sb.append(" MaximumPermissionsManageRoles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageRoles)+"'\n");
    sb.append(" MaximumPermissionsManageSandboxes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageSandboxes)+"'\n");
    sb.append(" MaximumPermissionsManageSearchPromotionRules=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageSearchPromotionRules)+"'\n");
    sb.append(" MaximumPermissionsManageSelfService=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageSelfService)+"'\n");
    sb.append(" MaximumPermissionsManageSharing=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageSharing)+"'\n");
    sb.append(" MaximumPermissionsManageSolutions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageSolutions)+"'\n");
    sb.append(" MaximumPermissionsManageSynonyms=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageSynonyms)+"'\n");
    sb.append(" MaximumPermissionsManageTranslation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageTranslation)+"'\n");
    sb.append(" MaximumPermissionsManageTwoFactor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageTwoFactor)+"'\n");
    sb.append(" MaximumPermissionsManageUnlistedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageUnlistedGroups)+"'\n");
    sb.append(" MaximumPermissionsManageUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsManageUsers)+"'\n");
    sb.append(" MaximumPermissionsMassInlineEdit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsMassInlineEdit)+"'\n");
    sb.append(" MaximumPermissionsMergeTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsMergeTopics)+"'\n");
    sb.append(" MaximumPermissionsModerateChatter=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsModerateChatter)+"'\n");
    sb.append(" MaximumPermissionsModifyAllData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsModifyAllData)+"'\n");
    sb.append(" MaximumPermissionsNewReportBuilder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsNewReportBuilder)+"'\n");
    sb.append(" MaximumPermissionsOutboundMigrationToolsUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsOutboundMigrationToolsUser)+"'\n");
    sb.append(" MaximumPermissionsPasswordNeverExpires=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsPasswordNeverExpires)+"'\n");
    sb.append(" MaximumPermissionsPublishPackaging=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsPublishPackaging)+"'\n");
    sb.append(" MaximumPermissionsResetPasswords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsResetPasswords)+"'\n");
    sb.append(" MaximumPermissionsRunFlow=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsRunFlow)+"'\n");
    sb.append(" MaximumPermissionsRunReports=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsRunReports)+"'\n");
    sb.append(" MaximumPermissionsSalesConsole=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsSalesConsole)+"'\n");
    sb.append(" MaximumPermissionsScheduleJob=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsScheduleJob)+"'\n");
    sb.append(" MaximumPermissionsScheduleReports=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsScheduleReports)+"'\n");
    sb.append(" MaximumPermissionsSelectFilesFromSalesforce=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsSelectFilesFromSalesforce)+"'\n");
    sb.append(" MaximumPermissionsSendAnnouncementEmails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsSendAnnouncementEmails)+"'\n");
    sb.append(" MaximumPermissionsSendSitRequests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsSendSitRequests)+"'\n");
    sb.append(" MaximumPermissionsShareInternalArticles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsShareInternalArticles)+"'\n");
    sb.append(" MaximumPermissionsShowCompanyNameAsUserBadge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsShowCompanyNameAsUserBadge)+"'\n");
    sb.append(" MaximumPermissionsSocialInsightsLogoAdmin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsSocialInsightsLogoAdmin)+"'\n");
    sb.append(" MaximumPermissionsSolutionImport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsSolutionImport)+"'\n");
    sb.append(" MaximumPermissionsSubmitMacrosAllowed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsSubmitMacrosAllowed)+"'\n");
    sb.append(" MaximumPermissionsTagManager=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsTagManager)+"'\n");
    sb.append(" MaximumPermissionsTransferAnyCase=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsTransferAnyCase)+"'\n");
    sb.append(" MaximumPermissionsTransferAnyEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsTransferAnyEntity)+"'\n");
    sb.append(" MaximumPermissionsTransferAnyLead=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsTransferAnyLead)+"'\n");
    sb.append(" MaximumPermissionsTwoFactorApi=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsTwoFactorApi)+"'\n");
    sb.append(" MaximumPermissionsUseTeamReassignWizards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsUseTeamReassignWizards)+"'\n");
    sb.append(" MaximumPermissionsViewAllData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewAllData)+"'\n");
    sb.append(" MaximumPermissionsViewAllUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewAllUsers)+"'\n");
    sb.append(" MaximumPermissionsViewContent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewContent)+"'\n");
    sb.append(" MaximumPermissionsViewDataAssessment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewDataAssessment)+"'\n");
    sb.append(" MaximumPermissionsViewDataCategories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewDataCategories)+"'\n");
    sb.append(" MaximumPermissionsViewEncryptedData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewEncryptedData)+"'\n");
    sb.append(" MaximumPermissionsViewEventLogFiles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewEventLogFiles)+"'\n");
    sb.append(" MaximumPermissionsViewHelpLink=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewHelpLink)+"'\n");
    sb.append(" MaximumPermissionsViewMyTeamsDashboards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewMyTeamsDashboards)+"'\n");
    sb.append(" MaximumPermissionsViewSetup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaximumPermissionsViewSetup)+"'\n");
    sb.append(" PermissionSetLicenseAssignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionSetLicenseAssignments)+"'\n");
    sb.append(" PermissionSetLicenseKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionSetLicenseKey)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TotalLicenses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TotalLicenses)+"'\n");
    sb.append(" UsedLicenses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UsedLicenses)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}