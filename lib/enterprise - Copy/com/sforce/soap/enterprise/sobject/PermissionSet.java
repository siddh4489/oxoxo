package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class PermissionSet extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public PermissionSet() {
  }
    
  
  /**
   * element  : Assignments of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Assignments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Assignments","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Assignments__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Assignments;

  public com.sforce.soap.enterprise.QueryResult getAssignments() {
    return Assignments;
  }

  

  public void setAssignments(com.sforce.soap.enterprise.QueryResult Assignments) {
    this.Assignments = Assignments;
    Assignments__is_set = true;
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
   * element  : FieldPerms of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo FieldPerms__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FieldPerms","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean FieldPerms__is_set = false;

  private com.sforce.soap.enterprise.QueryResult FieldPerms;

  public com.sforce.soap.enterprise.QueryResult getFieldPerms() {
    return FieldPerms;
  }

  

  public void setFieldPerms(com.sforce.soap.enterprise.QueryResult FieldPerms) {
    this.FieldPerms = FieldPerms;
    FieldPerms__is_set = true;
  }
  
  /**
   * element  : IsOwnedByProfile of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsOwnedByProfile__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsOwnedByProfile","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsOwnedByProfile__is_set = false;

  private java.lang.Boolean IsOwnedByProfile;

  public java.lang.Boolean getIsOwnedByProfile() {
    return IsOwnedByProfile;
  }

  

  public void setIsOwnedByProfile(java.lang.Boolean IsOwnedByProfile) {
    this.IsOwnedByProfile = IsOwnedByProfile;
    IsOwnedByProfile__is_set = true;
  }
  
  /**
   * element  : Label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Label","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Label__is_set = false;

  private java.lang.String Label;

  public java.lang.String getLabel() {
    return Label;
  }

  

  public void setLabel(java.lang.String Label) {
    this.Label = Label;
    Label__is_set = true;
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
   * element  : License of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo License__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","License","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean License__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name License;

  public com.sforce.soap.enterprise.sobject.Name getLicense() {
    return License;
  }

  

  public void setLicense(com.sforce.soap.enterprise.sobject.Name License) {
    this.License = License;
    License__is_set = true;
  }
  
  /**
   * element  : LicenseId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LicenseId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LicenseId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LicenseId__is_set = false;

  private java.lang.String LicenseId;

  public java.lang.String getLicenseId() {
    return LicenseId;
  }

  

  public void setLicenseId(java.lang.String LicenseId) {
    this.LicenseId = LicenseId;
    LicenseId__is_set = true;
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
   * element  : ObjectPerms of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo ObjectPerms__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ObjectPerms","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean ObjectPerms__is_set = false;

  private com.sforce.soap.enterprise.QueryResult ObjectPerms;

  public com.sforce.soap.enterprise.QueryResult getObjectPerms() {
    return ObjectPerms;
  }

  

  public void setObjectPerms(com.sforce.soap.enterprise.QueryResult ObjectPerms) {
    this.ObjectPerms = ObjectPerms;
    ObjectPerms__is_set = true;
  }
  
  /**
   * element  : PermissionsActivateContract of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsActivateContract__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsActivateContract","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsActivateContract__is_set = false;

  private java.lang.Boolean PermissionsActivateContract;

  public java.lang.Boolean getPermissionsActivateContract() {
    return PermissionsActivateContract;
  }

  

  public void setPermissionsActivateContract(java.lang.Boolean PermissionsActivateContract) {
    this.PermissionsActivateContract = PermissionsActivateContract;
    PermissionsActivateContract__is_set = true;
  }
  
  /**
   * element  : PermissionsAllowEmailIC of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsAllowEmailIC__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsAllowEmailIC","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsAllowEmailIC__is_set = false;

  private java.lang.Boolean PermissionsAllowEmailIC;

  public java.lang.Boolean getPermissionsAllowEmailIC() {
    return PermissionsAllowEmailIC;
  }

  

  public void setPermissionsAllowEmailIC(java.lang.Boolean PermissionsAllowEmailIC) {
    this.PermissionsAllowEmailIC = PermissionsAllowEmailIC;
    PermissionsAllowEmailIC__is_set = true;
  }
  
  /**
   * element  : PermissionsAllowUniversalSearch of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsAllowUniversalSearch__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsAllowUniversalSearch","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsAllowUniversalSearch__is_set = false;

  private java.lang.Boolean PermissionsAllowUniversalSearch;

  public java.lang.Boolean getPermissionsAllowUniversalSearch() {
    return PermissionsAllowUniversalSearch;
  }

  

  public void setPermissionsAllowUniversalSearch(java.lang.Boolean PermissionsAllowUniversalSearch) {
    this.PermissionsAllowUniversalSearch = PermissionsAllowUniversalSearch;
    PermissionsAllowUniversalSearch__is_set = true;
  }
  
  /**
   * element  : PermissionsAllowViewKnowledge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsAllowViewKnowledge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsAllowViewKnowledge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsAllowViewKnowledge__is_set = false;

  private java.lang.Boolean PermissionsAllowViewKnowledge;

  public java.lang.Boolean getPermissionsAllowViewKnowledge() {
    return PermissionsAllowViewKnowledge;
  }

  

  public void setPermissionsAllowViewKnowledge(java.lang.Boolean PermissionsAllowViewKnowledge) {
    this.PermissionsAllowViewKnowledge = PermissionsAllowViewKnowledge;
    PermissionsAllowViewKnowledge__is_set = true;
  }
  
  /**
   * element  : PermissionsApiEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsApiEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsApiEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsApiEnabled__is_set = false;

  private java.lang.Boolean PermissionsApiEnabled;

  public java.lang.Boolean getPermissionsApiEnabled() {
    return PermissionsApiEnabled;
  }

  

  public void setPermissionsApiEnabled(java.lang.Boolean PermissionsApiEnabled) {
    this.PermissionsApiEnabled = PermissionsApiEnabled;
    PermissionsApiEnabled__is_set = true;
  }
  
  /**
   * element  : PermissionsApiUserOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsApiUserOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsApiUserOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsApiUserOnly__is_set = false;

  private java.lang.Boolean PermissionsApiUserOnly;

  public java.lang.Boolean getPermissionsApiUserOnly() {
    return PermissionsApiUserOnly;
  }

  

  public void setPermissionsApiUserOnly(java.lang.Boolean PermissionsApiUserOnly) {
    this.PermissionsApiUserOnly = PermissionsApiUserOnly;
    PermissionsApiUserOnly__is_set = true;
  }
  
  /**
   * element  : PermissionsAssignPermissionSets of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsAssignPermissionSets__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsAssignPermissionSets","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsAssignPermissionSets__is_set = false;

  private java.lang.Boolean PermissionsAssignPermissionSets;

  public java.lang.Boolean getPermissionsAssignPermissionSets() {
    return PermissionsAssignPermissionSets;
  }

  

  public void setPermissionsAssignPermissionSets(java.lang.Boolean PermissionsAssignPermissionSets) {
    this.PermissionsAssignPermissionSets = PermissionsAssignPermissionSets;
    PermissionsAssignPermissionSets__is_set = true;
  }
  
  /**
   * element  : PermissionsAssignTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsAssignTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsAssignTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsAssignTopics__is_set = false;

  private java.lang.Boolean PermissionsAssignTopics;

  public java.lang.Boolean getPermissionsAssignTopics() {
    return PermissionsAssignTopics;
  }

  

  public void setPermissionsAssignTopics(java.lang.Boolean PermissionsAssignTopics) {
    this.PermissionsAssignTopics = PermissionsAssignTopics;
    PermissionsAssignTopics__is_set = true;
  }
  
  /**
   * element  : PermissionsAuthorApex of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsAuthorApex__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsAuthorApex","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsAuthorApex__is_set = false;

  private java.lang.Boolean PermissionsAuthorApex;

  public java.lang.Boolean getPermissionsAuthorApex() {
    return PermissionsAuthorApex;
  }

  

  public void setPermissionsAuthorApex(java.lang.Boolean PermissionsAuthorApex) {
    this.PermissionsAuthorApex = PermissionsAuthorApex;
    PermissionsAuthorApex__is_set = true;
  }
  
  /**
   * element  : PermissionsBulkApiHardDelete of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsBulkApiHardDelete__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsBulkApiHardDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsBulkApiHardDelete__is_set = false;

  private java.lang.Boolean PermissionsBulkApiHardDelete;

  public java.lang.Boolean getPermissionsBulkApiHardDelete() {
    return PermissionsBulkApiHardDelete;
  }

  

  public void setPermissionsBulkApiHardDelete(java.lang.Boolean PermissionsBulkApiHardDelete) {
    this.PermissionsBulkApiHardDelete = PermissionsBulkApiHardDelete;
    PermissionsBulkApiHardDelete__is_set = true;
  }
  
  /**
   * element  : PermissionsBulkMacrosAllowed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsBulkMacrosAllowed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsBulkMacrosAllowed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsBulkMacrosAllowed__is_set = false;

  private java.lang.Boolean PermissionsBulkMacrosAllowed;

  public java.lang.Boolean getPermissionsBulkMacrosAllowed() {
    return PermissionsBulkMacrosAllowed;
  }

  

  public void setPermissionsBulkMacrosAllowed(java.lang.Boolean PermissionsBulkMacrosAllowed) {
    this.PermissionsBulkMacrosAllowed = PermissionsBulkMacrosAllowed;
    PermissionsBulkMacrosAllowed__is_set = true;
  }
  
  /**
   * element  : PermissionsCampaignInfluence2 of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCampaignInfluence2__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCampaignInfluence2","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCampaignInfluence2__is_set = false;

  private java.lang.Boolean PermissionsCampaignInfluence2;

  public java.lang.Boolean getPermissionsCampaignInfluence2() {
    return PermissionsCampaignInfluence2;
  }

  

  public void setPermissionsCampaignInfluence2(java.lang.Boolean PermissionsCampaignInfluence2) {
    this.PermissionsCampaignInfluence2 = PermissionsCampaignInfluence2;
    PermissionsCampaignInfluence2__is_set = true;
  }
  
  /**
   * element  : PermissionsCanApproveFeedPost of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCanApproveFeedPost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCanApproveFeedPost","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCanApproveFeedPost__is_set = false;

  private java.lang.Boolean PermissionsCanApproveFeedPost;

  public java.lang.Boolean getPermissionsCanApproveFeedPost() {
    return PermissionsCanApproveFeedPost;
  }

  

  public void setPermissionsCanApproveFeedPost(java.lang.Boolean PermissionsCanApproveFeedPost) {
    this.PermissionsCanApproveFeedPost = PermissionsCanApproveFeedPost;
    PermissionsCanApproveFeedPost__is_set = true;
  }
  
  /**
   * element  : PermissionsCanInsertFeedSystemFields of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCanInsertFeedSystemFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCanInsertFeedSystemFields","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCanInsertFeedSystemFields__is_set = false;

  private java.lang.Boolean PermissionsCanInsertFeedSystemFields;

  public java.lang.Boolean getPermissionsCanInsertFeedSystemFields() {
    return PermissionsCanInsertFeedSystemFields;
  }

  

  public void setPermissionsCanInsertFeedSystemFields(java.lang.Boolean PermissionsCanInsertFeedSystemFields) {
    this.PermissionsCanInsertFeedSystemFields = PermissionsCanInsertFeedSystemFields;
    PermissionsCanInsertFeedSystemFields__is_set = true;
  }
  
  /**
   * element  : PermissionsCanUseNewDashboardBuilder of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCanUseNewDashboardBuilder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCanUseNewDashboardBuilder","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCanUseNewDashboardBuilder__is_set = false;

  private java.lang.Boolean PermissionsCanUseNewDashboardBuilder;

  public java.lang.Boolean getPermissionsCanUseNewDashboardBuilder() {
    return PermissionsCanUseNewDashboardBuilder;
  }

  

  public void setPermissionsCanUseNewDashboardBuilder(java.lang.Boolean PermissionsCanUseNewDashboardBuilder) {
    this.PermissionsCanUseNewDashboardBuilder = PermissionsCanUseNewDashboardBuilder;
    PermissionsCanUseNewDashboardBuilder__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterComposeUiCodesnippet of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterComposeUiCodesnippet__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterComposeUiCodesnippet","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterComposeUiCodesnippet__is_set = false;

  private java.lang.Boolean PermissionsChatterComposeUiCodesnippet;

  public java.lang.Boolean getPermissionsChatterComposeUiCodesnippet() {
    return PermissionsChatterComposeUiCodesnippet;
  }

  

  public void setPermissionsChatterComposeUiCodesnippet(java.lang.Boolean PermissionsChatterComposeUiCodesnippet) {
    this.PermissionsChatterComposeUiCodesnippet = PermissionsChatterComposeUiCodesnippet;
    PermissionsChatterComposeUiCodesnippet__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterEditOwnPost of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterEditOwnPost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterEditOwnPost","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterEditOwnPost__is_set = false;

  private java.lang.Boolean PermissionsChatterEditOwnPost;

  public java.lang.Boolean getPermissionsChatterEditOwnPost() {
    return PermissionsChatterEditOwnPost;
  }

  

  public void setPermissionsChatterEditOwnPost(java.lang.Boolean PermissionsChatterEditOwnPost) {
    this.PermissionsChatterEditOwnPost = PermissionsChatterEditOwnPost;
    PermissionsChatterEditOwnPost__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterEditOwnRecordPost of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterEditOwnRecordPost__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterEditOwnRecordPost","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterEditOwnRecordPost__is_set = false;

  private java.lang.Boolean PermissionsChatterEditOwnRecordPost;

  public java.lang.Boolean getPermissionsChatterEditOwnRecordPost() {
    return PermissionsChatterEditOwnRecordPost;
  }

  

  public void setPermissionsChatterEditOwnRecordPost(java.lang.Boolean PermissionsChatterEditOwnRecordPost) {
    this.PermissionsChatterEditOwnRecordPost = PermissionsChatterEditOwnRecordPost;
    PermissionsChatterEditOwnRecordPost__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterFileLink of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterFileLink__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterFileLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterFileLink__is_set = false;

  private java.lang.Boolean PermissionsChatterFileLink;

  public java.lang.Boolean getPermissionsChatterFileLink() {
    return PermissionsChatterFileLink;
  }

  

  public void setPermissionsChatterFileLink(java.lang.Boolean PermissionsChatterFileLink) {
    this.PermissionsChatterFileLink = PermissionsChatterFileLink;
    PermissionsChatterFileLink__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterForSharePoint of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterForSharePoint__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterForSharePoint","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterForSharePoint__is_set = false;

  private java.lang.Boolean PermissionsChatterForSharePoint;

  public java.lang.Boolean getPermissionsChatterForSharePoint() {
    return PermissionsChatterForSharePoint;
  }

  

  public void setPermissionsChatterForSharePoint(java.lang.Boolean PermissionsChatterForSharePoint) {
    this.PermissionsChatterForSharePoint = PermissionsChatterForSharePoint;
    PermissionsChatterForSharePoint__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterInternalUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterInternalUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterInternalUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterInternalUser__is_set = false;

  private java.lang.Boolean PermissionsChatterInternalUser;

  public java.lang.Boolean getPermissionsChatterInternalUser() {
    return PermissionsChatterInternalUser;
  }

  

  public void setPermissionsChatterInternalUser(java.lang.Boolean PermissionsChatterInternalUser) {
    this.PermissionsChatterInternalUser = PermissionsChatterInternalUser;
    PermissionsChatterInternalUser__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterInviteExternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterInviteExternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterInviteExternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterInviteExternalUsers__is_set = false;

  private java.lang.Boolean PermissionsChatterInviteExternalUsers;

  public java.lang.Boolean getPermissionsChatterInviteExternalUsers() {
    return PermissionsChatterInviteExternalUsers;
  }

  

  public void setPermissionsChatterInviteExternalUsers(java.lang.Boolean PermissionsChatterInviteExternalUsers) {
    this.PermissionsChatterInviteExternalUsers = PermissionsChatterInviteExternalUsers;
    PermissionsChatterInviteExternalUsers__is_set = true;
  }
  
  /**
   * element  : PermissionsChatterOwnGroups of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsChatterOwnGroups__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsChatterOwnGroups","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsChatterOwnGroups__is_set = false;

  private java.lang.Boolean PermissionsChatterOwnGroups;

  public java.lang.Boolean getPermissionsChatterOwnGroups() {
    return PermissionsChatterOwnGroups;
  }

  

  public void setPermissionsChatterOwnGroups(java.lang.Boolean PermissionsChatterOwnGroups) {
    this.PermissionsChatterOwnGroups = PermissionsChatterOwnGroups;
    PermissionsChatterOwnGroups__is_set = true;
  }
  
  /**
   * element  : PermissionsConfigCustomRecs of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsConfigCustomRecs__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsConfigCustomRecs","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsConfigCustomRecs__is_set = false;

  private java.lang.Boolean PermissionsConfigCustomRecs;

  public java.lang.Boolean getPermissionsConfigCustomRecs() {
    return PermissionsConfigCustomRecs;
  }

  

  public void setPermissionsConfigCustomRecs(java.lang.Boolean PermissionsConfigCustomRecs) {
    this.PermissionsConfigCustomRecs = PermissionsConfigCustomRecs;
    PermissionsConfigCustomRecs__is_set = true;
  }
  
  /**
   * element  : PermissionsConnectOrgToEnvironmentHub of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsConnectOrgToEnvironmentHub__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsConnectOrgToEnvironmentHub","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsConnectOrgToEnvironmentHub__is_set = false;

  private java.lang.Boolean PermissionsConnectOrgToEnvironmentHub;

  public java.lang.Boolean getPermissionsConnectOrgToEnvironmentHub() {
    return PermissionsConnectOrgToEnvironmentHub;
  }

  

  public void setPermissionsConnectOrgToEnvironmentHub(java.lang.Boolean PermissionsConnectOrgToEnvironmentHub) {
    this.PermissionsConnectOrgToEnvironmentHub = PermissionsConnectOrgToEnvironmentHub;
    PermissionsConnectOrgToEnvironmentHub__is_set = true;
  }
  
  /**
   * element  : PermissionsContentAdministrator of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsContentAdministrator__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsContentAdministrator","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsContentAdministrator__is_set = false;

  private java.lang.Boolean PermissionsContentAdministrator;

  public java.lang.Boolean getPermissionsContentAdministrator() {
    return PermissionsContentAdministrator;
  }

  

  public void setPermissionsContentAdministrator(java.lang.Boolean PermissionsContentAdministrator) {
    this.PermissionsContentAdministrator = PermissionsContentAdministrator;
    PermissionsContentAdministrator__is_set = true;
  }
  
  /**
   * element  : PermissionsContentHubUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsContentHubUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsContentHubUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsContentHubUser__is_set = false;

  private java.lang.Boolean PermissionsContentHubUser;

  public java.lang.Boolean getPermissionsContentHubUser() {
    return PermissionsContentHubUser;
  }

  

  public void setPermissionsContentHubUser(java.lang.Boolean PermissionsContentHubUser) {
    this.PermissionsContentHubUser = PermissionsContentHubUser;
    PermissionsContentHubUser__is_set = true;
  }
  
  /**
   * element  : PermissionsConvertLeads of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsConvertLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsConvertLeads","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsConvertLeads__is_set = false;

  private java.lang.Boolean PermissionsConvertLeads;

  public java.lang.Boolean getPermissionsConvertLeads() {
    return PermissionsConvertLeads;
  }

  

  public void setPermissionsConvertLeads(java.lang.Boolean PermissionsConvertLeads) {
    this.PermissionsConvertLeads = PermissionsConvertLeads;
    PermissionsConvertLeads__is_set = true;
  }
  
  /**
   * element  : PermissionsCreateCustomizeFilters of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCreateCustomizeFilters__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCreateCustomizeFilters","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCreateCustomizeFilters__is_set = false;

  private java.lang.Boolean PermissionsCreateCustomizeFilters;

  public java.lang.Boolean getPermissionsCreateCustomizeFilters() {
    return PermissionsCreateCustomizeFilters;
  }

  

  public void setPermissionsCreateCustomizeFilters(java.lang.Boolean PermissionsCreateCustomizeFilters) {
    this.PermissionsCreateCustomizeFilters = PermissionsCreateCustomizeFilters;
    PermissionsCreateCustomizeFilters__is_set = true;
  }
  
  /**
   * element  : PermissionsCreatePackaging of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCreatePackaging__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCreatePackaging","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCreatePackaging__is_set = false;

  private java.lang.Boolean PermissionsCreatePackaging;

  public java.lang.Boolean getPermissionsCreatePackaging() {
    return PermissionsCreatePackaging;
  }

  

  public void setPermissionsCreatePackaging(java.lang.Boolean PermissionsCreatePackaging) {
    this.PermissionsCreatePackaging = PermissionsCreatePackaging;
    PermissionsCreatePackaging__is_set = true;
  }
  
  /**
   * element  : PermissionsCreateTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCreateTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCreateTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCreateTopics__is_set = false;

  private java.lang.Boolean PermissionsCreateTopics;

  public java.lang.Boolean getPermissionsCreateTopics() {
    return PermissionsCreateTopics;
  }

  

  public void setPermissionsCreateTopics(java.lang.Boolean PermissionsCreateTopics) {
    this.PermissionsCreateTopics = PermissionsCreateTopics;
    PermissionsCreateTopics__is_set = true;
  }
  
  /**
   * element  : PermissionsCreateWorkBadgeDefinition of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCreateWorkBadgeDefinition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCreateWorkBadgeDefinition","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCreateWorkBadgeDefinition__is_set = false;

  private java.lang.Boolean PermissionsCreateWorkBadgeDefinition;

  public java.lang.Boolean getPermissionsCreateWorkBadgeDefinition() {
    return PermissionsCreateWorkBadgeDefinition;
  }

  

  public void setPermissionsCreateWorkBadgeDefinition(java.lang.Boolean PermissionsCreateWorkBadgeDefinition) {
    this.PermissionsCreateWorkBadgeDefinition = PermissionsCreateWorkBadgeDefinition;
    PermissionsCreateWorkBadgeDefinition__is_set = true;
  }
  
  /**
   * element  : PermissionsCreateWorkspaces of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCreateWorkspaces__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCreateWorkspaces","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCreateWorkspaces__is_set = false;

  private java.lang.Boolean PermissionsCreateWorkspaces;

  public java.lang.Boolean getPermissionsCreateWorkspaces() {
    return PermissionsCreateWorkspaces;
  }

  

  public void setPermissionsCreateWorkspaces(java.lang.Boolean PermissionsCreateWorkspaces) {
    this.PermissionsCreateWorkspaces = PermissionsCreateWorkspaces;
    PermissionsCreateWorkspaces__is_set = true;
  }
  
  /**
   * element  : PermissionsCustomMobileAppsAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCustomMobileAppsAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCustomMobileAppsAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCustomMobileAppsAccess__is_set = false;

  private java.lang.Boolean PermissionsCustomMobileAppsAccess;

  public java.lang.Boolean getPermissionsCustomMobileAppsAccess() {
    return PermissionsCustomMobileAppsAccess;
  }

  

  public void setPermissionsCustomMobileAppsAccess(java.lang.Boolean PermissionsCustomMobileAppsAccess) {
    this.PermissionsCustomMobileAppsAccess = PermissionsCustomMobileAppsAccess;
    PermissionsCustomMobileAppsAccess__is_set = true;
  }
  
  /**
   * element  : PermissionsCustomizeApplication of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsCustomizeApplication__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsCustomizeApplication","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsCustomizeApplication__is_set = false;

  private java.lang.Boolean PermissionsCustomizeApplication;

  public java.lang.Boolean getPermissionsCustomizeApplication() {
    return PermissionsCustomizeApplication;
  }

  

  public void setPermissionsCustomizeApplication(java.lang.Boolean PermissionsCustomizeApplication) {
    this.PermissionsCustomizeApplication = PermissionsCustomizeApplication;
    PermissionsCustomizeApplication__is_set = true;
  }
  
  /**
   * element  : PermissionsDataExport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsDataExport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsDataExport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsDataExport__is_set = false;

  private java.lang.Boolean PermissionsDataExport;

  public java.lang.Boolean getPermissionsDataExport() {
    return PermissionsDataExport;
  }

  

  public void setPermissionsDataExport(java.lang.Boolean PermissionsDataExport) {
    this.PermissionsDataExport = PermissionsDataExport;
    PermissionsDataExport__is_set = true;
  }
  
  /**
   * element  : PermissionsDelegatedPortalUserAdmin of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsDelegatedPortalUserAdmin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsDelegatedPortalUserAdmin","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsDelegatedPortalUserAdmin__is_set = false;

  private java.lang.Boolean PermissionsDelegatedPortalUserAdmin;

  public java.lang.Boolean getPermissionsDelegatedPortalUserAdmin() {
    return PermissionsDelegatedPortalUserAdmin;
  }

  

  public void setPermissionsDelegatedPortalUserAdmin(java.lang.Boolean PermissionsDelegatedPortalUserAdmin) {
    this.PermissionsDelegatedPortalUserAdmin = PermissionsDelegatedPortalUserAdmin;
    PermissionsDelegatedPortalUserAdmin__is_set = true;
  }
  
  /**
   * element  : PermissionsDelegatedTwoFactor of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsDelegatedTwoFactor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsDelegatedTwoFactor","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsDelegatedTwoFactor__is_set = false;

  private java.lang.Boolean PermissionsDelegatedTwoFactor;

  public java.lang.Boolean getPermissionsDelegatedTwoFactor() {
    return PermissionsDelegatedTwoFactor;
  }

  

  public void setPermissionsDelegatedTwoFactor(java.lang.Boolean PermissionsDelegatedTwoFactor) {
    this.PermissionsDelegatedTwoFactor = PermissionsDelegatedTwoFactor;
    PermissionsDelegatedTwoFactor__is_set = true;
  }
  
  /**
   * element  : PermissionsDeleteActivatedContract of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsDeleteActivatedContract__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsDeleteActivatedContract","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsDeleteActivatedContract__is_set = false;

  private java.lang.Boolean PermissionsDeleteActivatedContract;

  public java.lang.Boolean getPermissionsDeleteActivatedContract() {
    return PermissionsDeleteActivatedContract;
  }

  

  public void setPermissionsDeleteActivatedContract(java.lang.Boolean PermissionsDeleteActivatedContract) {
    this.PermissionsDeleteActivatedContract = PermissionsDeleteActivatedContract;
    PermissionsDeleteActivatedContract__is_set = true;
  }
  
  /**
   * element  : PermissionsDeleteTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsDeleteTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsDeleteTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsDeleteTopics__is_set = false;

  private java.lang.Boolean PermissionsDeleteTopics;

  public java.lang.Boolean getPermissionsDeleteTopics() {
    return PermissionsDeleteTopics;
  }

  

  public void setPermissionsDeleteTopics(java.lang.Boolean PermissionsDeleteTopics) {
    this.PermissionsDeleteTopics = PermissionsDeleteTopics;
    PermissionsDeleteTopics__is_set = true;
  }
  
  /**
   * element  : PermissionsDistributeFromPersWksp of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsDistributeFromPersWksp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsDistributeFromPersWksp","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsDistributeFromPersWksp__is_set = false;

  private java.lang.Boolean PermissionsDistributeFromPersWksp;

  public java.lang.Boolean getPermissionsDistributeFromPersWksp() {
    return PermissionsDistributeFromPersWksp;
  }

  

  public void setPermissionsDistributeFromPersWksp(java.lang.Boolean PermissionsDistributeFromPersWksp) {
    this.PermissionsDistributeFromPersWksp = PermissionsDistributeFromPersWksp;
    PermissionsDistributeFromPersWksp__is_set = true;
  }
  
  /**
   * element  : PermissionsEditBrandTemplates of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditBrandTemplates__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditBrandTemplates","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditBrandTemplates__is_set = false;

  private java.lang.Boolean PermissionsEditBrandTemplates;

  public java.lang.Boolean getPermissionsEditBrandTemplates() {
    return PermissionsEditBrandTemplates;
  }

  

  public void setPermissionsEditBrandTemplates(java.lang.Boolean PermissionsEditBrandTemplates) {
    this.PermissionsEditBrandTemplates = PermissionsEditBrandTemplates;
    PermissionsEditBrandTemplates__is_set = true;
  }
  
  /**
   * element  : PermissionsEditCaseComments of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditCaseComments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditCaseComments","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditCaseComments__is_set = false;

  private java.lang.Boolean PermissionsEditCaseComments;

  public java.lang.Boolean getPermissionsEditCaseComments() {
    return PermissionsEditCaseComments;
  }

  

  public void setPermissionsEditCaseComments(java.lang.Boolean PermissionsEditCaseComments) {
    this.PermissionsEditCaseComments = PermissionsEditCaseComments;
    PermissionsEditCaseComments__is_set = true;
  }
  
  /**
   * element  : PermissionsEditEvent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditEvent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditEvent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditEvent__is_set = false;

  private java.lang.Boolean PermissionsEditEvent;

  public java.lang.Boolean getPermissionsEditEvent() {
    return PermissionsEditEvent;
  }

  

  public void setPermissionsEditEvent(java.lang.Boolean PermissionsEditEvent) {
    this.PermissionsEditEvent = PermissionsEditEvent;
    PermissionsEditEvent__is_set = true;
  }
  
  /**
   * element  : PermissionsEditHtmlTemplates of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditHtmlTemplates__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditHtmlTemplates","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditHtmlTemplates__is_set = false;

  private java.lang.Boolean PermissionsEditHtmlTemplates;

  public java.lang.Boolean getPermissionsEditHtmlTemplates() {
    return PermissionsEditHtmlTemplates;
  }

  

  public void setPermissionsEditHtmlTemplates(java.lang.Boolean PermissionsEditHtmlTemplates) {
    this.PermissionsEditHtmlTemplates = PermissionsEditHtmlTemplates;
    PermissionsEditHtmlTemplates__is_set = true;
  }
  
  /**
   * element  : PermissionsEditKnowledge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditKnowledge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditKnowledge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditKnowledge__is_set = false;

  private java.lang.Boolean PermissionsEditKnowledge;

  public java.lang.Boolean getPermissionsEditKnowledge() {
    return PermissionsEditKnowledge;
  }

  

  public void setPermissionsEditKnowledge(java.lang.Boolean PermissionsEditKnowledge) {
    this.PermissionsEditKnowledge = PermissionsEditKnowledge;
    PermissionsEditKnowledge__is_set = true;
  }
  
  /**
   * element  : PermissionsEditOppLineItemUnitPrice of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditOppLineItemUnitPrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditOppLineItemUnitPrice","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditOppLineItemUnitPrice__is_set = false;

  private java.lang.Boolean PermissionsEditOppLineItemUnitPrice;

  public java.lang.Boolean getPermissionsEditOppLineItemUnitPrice() {
    return PermissionsEditOppLineItemUnitPrice;
  }

  

  public void setPermissionsEditOppLineItemUnitPrice(java.lang.Boolean PermissionsEditOppLineItemUnitPrice) {
    this.PermissionsEditOppLineItemUnitPrice = PermissionsEditOppLineItemUnitPrice;
    PermissionsEditOppLineItemUnitPrice__is_set = true;
  }
  
  /**
   * element  : PermissionsEditPublicDocuments of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditPublicDocuments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditPublicDocuments","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditPublicDocuments__is_set = false;

  private java.lang.Boolean PermissionsEditPublicDocuments;

  public java.lang.Boolean getPermissionsEditPublicDocuments() {
    return PermissionsEditPublicDocuments;
  }

  

  public void setPermissionsEditPublicDocuments(java.lang.Boolean PermissionsEditPublicDocuments) {
    this.PermissionsEditPublicDocuments = PermissionsEditPublicDocuments;
    PermissionsEditPublicDocuments__is_set = true;
  }
  
  /**
   * element  : PermissionsEditPublicTemplates of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditPublicTemplates__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditPublicTemplates","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditPublicTemplates__is_set = false;

  private java.lang.Boolean PermissionsEditPublicTemplates;

  public java.lang.Boolean getPermissionsEditPublicTemplates() {
    return PermissionsEditPublicTemplates;
  }

  

  public void setPermissionsEditPublicTemplates(java.lang.Boolean PermissionsEditPublicTemplates) {
    this.PermissionsEditPublicTemplates = PermissionsEditPublicTemplates;
    PermissionsEditPublicTemplates__is_set = true;
  }
  
  /**
   * element  : PermissionsEditReadonlyFields of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditReadonlyFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditReadonlyFields","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditReadonlyFields__is_set = false;

  private java.lang.Boolean PermissionsEditReadonlyFields;

  public java.lang.Boolean getPermissionsEditReadonlyFields() {
    return PermissionsEditReadonlyFields;
  }

  

  public void setPermissionsEditReadonlyFields(java.lang.Boolean PermissionsEditReadonlyFields) {
    this.PermissionsEditReadonlyFields = PermissionsEditReadonlyFields;
    PermissionsEditReadonlyFields__is_set = true;
  }
  
  /**
   * element  : PermissionsEditReports of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditReports__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditReports","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditReports__is_set = false;

  private java.lang.Boolean PermissionsEditReports;

  public java.lang.Boolean getPermissionsEditReports() {
    return PermissionsEditReports;
  }

  

  public void setPermissionsEditReports(java.lang.Boolean PermissionsEditReports) {
    this.PermissionsEditReports = PermissionsEditReports;
    PermissionsEditReports__is_set = true;
  }
  
  /**
   * element  : PermissionsEditTask of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditTask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditTask","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditTask__is_set = false;

  private java.lang.Boolean PermissionsEditTask;

  public java.lang.Boolean getPermissionsEditTask() {
    return PermissionsEditTask;
  }

  

  public void setPermissionsEditTask(java.lang.Boolean PermissionsEditTask) {
    this.PermissionsEditTask = PermissionsEditTask;
    PermissionsEditTask__is_set = true;
  }
  
  /**
   * element  : PermissionsEditTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEditTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEditTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEditTopics__is_set = false;

  private java.lang.Boolean PermissionsEditTopics;

  public java.lang.Boolean getPermissionsEditTopics() {
    return PermissionsEditTopics;
  }

  

  public void setPermissionsEditTopics(java.lang.Boolean PermissionsEditTopics) {
    this.PermissionsEditTopics = PermissionsEditTopics;
    PermissionsEditTopics__is_set = true;
  }
  
  /**
   * element  : PermissionsEmailAdministration of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEmailAdministration__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEmailAdministration","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEmailAdministration__is_set = false;

  private java.lang.Boolean PermissionsEmailAdministration;

  public java.lang.Boolean getPermissionsEmailAdministration() {
    return PermissionsEmailAdministration;
  }

  

  public void setPermissionsEmailAdministration(java.lang.Boolean PermissionsEmailAdministration) {
    this.PermissionsEmailAdministration = PermissionsEmailAdministration;
    PermissionsEmailAdministration__is_set = true;
  }
  
  /**
   * element  : PermissionsEmailMass of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEmailMass__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEmailMass","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEmailMass__is_set = false;

  private java.lang.Boolean PermissionsEmailMass;

  public java.lang.Boolean getPermissionsEmailMass() {
    return PermissionsEmailMass;
  }

  

  public void setPermissionsEmailMass(java.lang.Boolean PermissionsEmailMass) {
    this.PermissionsEmailMass = PermissionsEmailMass;
    PermissionsEmailMass__is_set = true;
  }
  
  /**
   * element  : PermissionsEmailSingle of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEmailSingle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEmailSingle","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEmailSingle__is_set = false;

  private java.lang.Boolean PermissionsEmailSingle;

  public java.lang.Boolean getPermissionsEmailSingle() {
    return PermissionsEmailSingle;
  }

  

  public void setPermissionsEmailSingle(java.lang.Boolean PermissionsEmailSingle) {
    this.PermissionsEmailSingle = PermissionsEmailSingle;
    PermissionsEmailSingle__is_set = true;
  }
  
  /**
   * element  : PermissionsEmailTemplateManagement of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEmailTemplateManagement__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEmailTemplateManagement","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEmailTemplateManagement__is_set = false;

  private java.lang.Boolean PermissionsEmailTemplateManagement;

  public java.lang.Boolean getPermissionsEmailTemplateManagement() {
    return PermissionsEmailTemplateManagement;
  }

  

  public void setPermissionsEmailTemplateManagement(java.lang.Boolean PermissionsEmailTemplateManagement) {
    this.PermissionsEmailTemplateManagement = PermissionsEmailTemplateManagement;
    PermissionsEmailTemplateManagement__is_set = true;
  }
  
  /**
   * element  : PermissionsEnableNotifications of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsEnableNotifications__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsEnableNotifications","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsEnableNotifications__is_set = false;

  private java.lang.Boolean PermissionsEnableNotifications;

  public java.lang.Boolean getPermissionsEnableNotifications() {
    return PermissionsEnableNotifications;
  }

  

  public void setPermissionsEnableNotifications(java.lang.Boolean PermissionsEnableNotifications) {
    this.PermissionsEnableNotifications = PermissionsEnableNotifications;
    PermissionsEnableNotifications__is_set = true;
  }
  
  /**
   * element  : PermissionsExportReport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsExportReport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsExportReport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsExportReport__is_set = false;

  private java.lang.Boolean PermissionsExportReport;

  public java.lang.Boolean getPermissionsExportReport() {
    return PermissionsExportReport;
  }

  

  public void setPermissionsExportReport(java.lang.Boolean PermissionsExportReport) {
    this.PermissionsExportReport = PermissionsExportReport;
    PermissionsExportReport__is_set = true;
  }
  
  /**
   * element  : PermissionsFlowUFLRequired of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsFlowUFLRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsFlowUFLRequired","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsFlowUFLRequired__is_set = false;

  private java.lang.Boolean PermissionsFlowUFLRequired;

  public java.lang.Boolean getPermissionsFlowUFLRequired() {
    return PermissionsFlowUFLRequired;
  }

  

  public void setPermissionsFlowUFLRequired(java.lang.Boolean PermissionsFlowUFLRequired) {
    this.PermissionsFlowUFLRequired = PermissionsFlowUFLRequired;
    PermissionsFlowUFLRequired__is_set = true;
  }
  
  /**
   * element  : PermissionsForceTwoFactor of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsForceTwoFactor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsForceTwoFactor","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsForceTwoFactor__is_set = false;

  private java.lang.Boolean PermissionsForceTwoFactor;

  public java.lang.Boolean getPermissionsForceTwoFactor() {
    return PermissionsForceTwoFactor;
  }

  

  public void setPermissionsForceTwoFactor(java.lang.Boolean PermissionsForceTwoFactor) {
    this.PermissionsForceTwoFactor = PermissionsForceTwoFactor;
    PermissionsForceTwoFactor__is_set = true;
  }
  
  /**
   * element  : PermissionsHasFileSync of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsHasFileSync__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsHasFileSync","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsHasFileSync__is_set = false;

  private java.lang.Boolean PermissionsHasFileSync;

  public java.lang.Boolean getPermissionsHasFileSync() {
    return PermissionsHasFileSync;
  }

  

  public void setPermissionsHasFileSync(java.lang.Boolean PermissionsHasFileSync) {
    this.PermissionsHasFileSync = PermissionsHasFileSync;
    PermissionsHasFileSync__is_set = true;
  }
  
  /**
   * element  : PermissionsIPRestrictRequests of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsIPRestrictRequests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsIPRestrictRequests","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsIPRestrictRequests__is_set = false;

  private java.lang.Boolean PermissionsIPRestrictRequests;

  public java.lang.Boolean getPermissionsIPRestrictRequests() {
    return PermissionsIPRestrictRequests;
  }

  

  public void setPermissionsIPRestrictRequests(java.lang.Boolean PermissionsIPRestrictRequests) {
    this.PermissionsIPRestrictRequests = PermissionsIPRestrictRequests;
    PermissionsIPRestrictRequests__is_set = true;
  }
  
  /**
   * element  : PermissionsIdentityConnect of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsIdentityConnect__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsIdentityConnect","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsIdentityConnect__is_set = false;

  private java.lang.Boolean PermissionsIdentityConnect;

  public java.lang.Boolean getPermissionsIdentityConnect() {
    return PermissionsIdentityConnect;
  }

  

  public void setPermissionsIdentityConnect(java.lang.Boolean PermissionsIdentityConnect) {
    this.PermissionsIdentityConnect = PermissionsIdentityConnect;
    PermissionsIdentityConnect__is_set = true;
  }
  
  /**
   * element  : PermissionsIdentityEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsIdentityEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsIdentityEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsIdentityEnabled__is_set = false;

  private java.lang.Boolean PermissionsIdentityEnabled;

  public java.lang.Boolean getPermissionsIdentityEnabled() {
    return PermissionsIdentityEnabled;
  }

  

  public void setPermissionsIdentityEnabled(java.lang.Boolean PermissionsIdentityEnabled) {
    this.PermissionsIdentityEnabled = PermissionsIdentityEnabled;
    PermissionsIdentityEnabled__is_set = true;
  }
  
  /**
   * element  : PermissionsImportCustomObjects of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsImportCustomObjects__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsImportCustomObjects","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsImportCustomObjects__is_set = false;

  private java.lang.Boolean PermissionsImportCustomObjects;

  public java.lang.Boolean getPermissionsImportCustomObjects() {
    return PermissionsImportCustomObjects;
  }

  

  public void setPermissionsImportCustomObjects(java.lang.Boolean PermissionsImportCustomObjects) {
    this.PermissionsImportCustomObjects = PermissionsImportCustomObjects;
    PermissionsImportCustomObjects__is_set = true;
  }
  
  /**
   * element  : PermissionsImportLeads of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsImportLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsImportLeads","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsImportLeads__is_set = false;

  private java.lang.Boolean PermissionsImportLeads;

  public java.lang.Boolean getPermissionsImportLeads() {
    return PermissionsImportLeads;
  }

  

  public void setPermissionsImportLeads(java.lang.Boolean PermissionsImportLeads) {
    this.PermissionsImportLeads = PermissionsImportLeads;
    PermissionsImportLeads__is_set = true;
  }
  
  /**
   * element  : PermissionsImportPersonal of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsImportPersonal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsImportPersonal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsImportPersonal__is_set = false;

  private java.lang.Boolean PermissionsImportPersonal;

  public java.lang.Boolean getPermissionsImportPersonal() {
    return PermissionsImportPersonal;
  }

  

  public void setPermissionsImportPersonal(java.lang.Boolean PermissionsImportPersonal) {
    this.PermissionsImportPersonal = PermissionsImportPersonal;
    PermissionsImportPersonal__is_set = true;
  }
  
  /**
   * element  : PermissionsInboundMigrationToolsUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsInboundMigrationToolsUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsInboundMigrationToolsUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsInboundMigrationToolsUser__is_set = false;

  private java.lang.Boolean PermissionsInboundMigrationToolsUser;

  public java.lang.Boolean getPermissionsInboundMigrationToolsUser() {
    return PermissionsInboundMigrationToolsUser;
  }

  

  public void setPermissionsInboundMigrationToolsUser(java.lang.Boolean PermissionsInboundMigrationToolsUser) {
    this.PermissionsInboundMigrationToolsUser = PermissionsInboundMigrationToolsUser;
    PermissionsInboundMigrationToolsUser__is_set = true;
  }
  
  /**
   * element  : PermissionsInstallPackaging of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsInstallPackaging__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsInstallPackaging","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsInstallPackaging__is_set = false;

  private java.lang.Boolean PermissionsInstallPackaging;

  public java.lang.Boolean getPermissionsInstallPackaging() {
    return PermissionsInstallPackaging;
  }

  

  public void setPermissionsInstallPackaging(java.lang.Boolean PermissionsInstallPackaging) {
    this.PermissionsInstallPackaging = PermissionsInstallPackaging;
    PermissionsInstallPackaging__is_set = true;
  }
  
  /**
   * element  : PermissionsIsSsoEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsIsSsoEnabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsIsSsoEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsIsSsoEnabled__is_set = false;

  private java.lang.Boolean PermissionsIsSsoEnabled;

  public java.lang.Boolean getPermissionsIsSsoEnabled() {
    return PermissionsIsSsoEnabled;
  }

  

  public void setPermissionsIsSsoEnabled(java.lang.Boolean PermissionsIsSsoEnabled) {
    this.PermissionsIsSsoEnabled = PermissionsIsSsoEnabled;
    PermissionsIsSsoEnabled__is_set = true;
  }
  
  /**
   * element  : PermissionsLightningExperienceUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsLightningExperienceUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsLightningExperienceUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsLightningExperienceUser__is_set = false;

  private java.lang.Boolean PermissionsLightningExperienceUser;

  public java.lang.Boolean getPermissionsLightningExperienceUser() {
    return PermissionsLightningExperienceUser;
  }

  

  public void setPermissionsLightningExperienceUser(java.lang.Boolean PermissionsLightningExperienceUser) {
    this.PermissionsLightningExperienceUser = PermissionsLightningExperienceUser;
    PermissionsLightningExperienceUser__is_set = true;
  }
  
  /**
   * element  : PermissionsManageAnalyticSnapshots of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageAnalyticSnapshots__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageAnalyticSnapshots","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageAnalyticSnapshots__is_set = false;

  private java.lang.Boolean PermissionsManageAnalyticSnapshots;

  public java.lang.Boolean getPermissionsManageAnalyticSnapshots() {
    return PermissionsManageAnalyticSnapshots;
  }

  

  public void setPermissionsManageAnalyticSnapshots(java.lang.Boolean PermissionsManageAnalyticSnapshots) {
    this.PermissionsManageAnalyticSnapshots = PermissionsManageAnalyticSnapshots;
    PermissionsManageAnalyticSnapshots__is_set = true;
  }
  
  /**
   * element  : PermissionsManageAuthProviders of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageAuthProviders__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageAuthProviders","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageAuthProviders__is_set = false;

  private java.lang.Boolean PermissionsManageAuthProviders;

  public java.lang.Boolean getPermissionsManageAuthProviders() {
    return PermissionsManageAuthProviders;
  }

  

  public void setPermissionsManageAuthProviders(java.lang.Boolean PermissionsManageAuthProviders) {
    this.PermissionsManageAuthProviders = PermissionsManageAuthProviders;
    PermissionsManageAuthProviders__is_set = true;
  }
  
  /**
   * element  : PermissionsManageBusinessHourHolidays of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageBusinessHourHolidays__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageBusinessHourHolidays","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageBusinessHourHolidays__is_set = false;

  private java.lang.Boolean PermissionsManageBusinessHourHolidays;

  public java.lang.Boolean getPermissionsManageBusinessHourHolidays() {
    return PermissionsManageBusinessHourHolidays;
  }

  

  public void setPermissionsManageBusinessHourHolidays(java.lang.Boolean PermissionsManageBusinessHourHolidays) {
    this.PermissionsManageBusinessHourHolidays = PermissionsManageBusinessHourHolidays;
    PermissionsManageBusinessHourHolidays__is_set = true;
  }
  
  /**
   * element  : PermissionsManageCallCenters of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageCallCenters__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageCallCenters","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageCallCenters__is_set = false;

  private java.lang.Boolean PermissionsManageCallCenters;

  public java.lang.Boolean getPermissionsManageCallCenters() {
    return PermissionsManageCallCenters;
  }

  

  public void setPermissionsManageCallCenters(java.lang.Boolean PermissionsManageCallCenters) {
    this.PermissionsManageCallCenters = PermissionsManageCallCenters;
    PermissionsManageCallCenters__is_set = true;
  }
  
  /**
   * element  : PermissionsManageCases of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageCases__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageCases","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageCases__is_set = false;

  private java.lang.Boolean PermissionsManageCases;

  public java.lang.Boolean getPermissionsManageCases() {
    return PermissionsManageCases;
  }

  

  public void setPermissionsManageCases(java.lang.Boolean PermissionsManageCases) {
    this.PermissionsManageCases = PermissionsManageCases;
    PermissionsManageCases__is_set = true;
  }
  
  /**
   * element  : PermissionsManageCategories of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageCategories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageCategories","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageCategories__is_set = false;

  private java.lang.Boolean PermissionsManageCategories;

  public java.lang.Boolean getPermissionsManageCategories() {
    return PermissionsManageCategories;
  }

  

  public void setPermissionsManageCategories(java.lang.Boolean PermissionsManageCategories) {
    this.PermissionsManageCategories = PermissionsManageCategories;
    PermissionsManageCategories__is_set = true;
  }
  
  /**
   * element  : PermissionsManageChatterMessages of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageChatterMessages__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageChatterMessages","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageChatterMessages__is_set = false;

  private java.lang.Boolean PermissionsManageChatterMessages;

  public java.lang.Boolean getPermissionsManageChatterMessages() {
    return PermissionsManageChatterMessages;
  }

  

  public void setPermissionsManageChatterMessages(java.lang.Boolean PermissionsManageChatterMessages) {
    this.PermissionsManageChatterMessages = PermissionsManageChatterMessages;
    PermissionsManageChatterMessages__is_set = true;
  }
  
  /**
   * element  : PermissionsManageContentPermissions of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageContentPermissions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageContentPermissions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageContentPermissions__is_set = false;

  private java.lang.Boolean PermissionsManageContentPermissions;

  public java.lang.Boolean getPermissionsManageContentPermissions() {
    return PermissionsManageContentPermissions;
  }

  

  public void setPermissionsManageContentPermissions(java.lang.Boolean PermissionsManageContentPermissions) {
    this.PermissionsManageContentPermissions = PermissionsManageContentPermissions;
    PermissionsManageContentPermissions__is_set = true;
  }
  
  /**
   * element  : PermissionsManageContentProperties of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageContentProperties__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageContentProperties","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageContentProperties__is_set = false;

  private java.lang.Boolean PermissionsManageContentProperties;

  public java.lang.Boolean getPermissionsManageContentProperties() {
    return PermissionsManageContentProperties;
  }

  

  public void setPermissionsManageContentProperties(java.lang.Boolean PermissionsManageContentProperties) {
    this.PermissionsManageContentProperties = PermissionsManageContentProperties;
    PermissionsManageContentProperties__is_set = true;
  }
  
  /**
   * element  : PermissionsManageContentTypes of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageContentTypes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageContentTypes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageContentTypes__is_set = false;

  private java.lang.Boolean PermissionsManageContentTypes;

  public java.lang.Boolean getPermissionsManageContentTypes() {
    return PermissionsManageContentTypes;
  }

  

  public void setPermissionsManageContentTypes(java.lang.Boolean PermissionsManageContentTypes) {
    this.PermissionsManageContentTypes = PermissionsManageContentTypes;
    PermissionsManageContentTypes__is_set = true;
  }
  
  /**
   * element  : PermissionsManageCssUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageCssUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageCssUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageCssUsers__is_set = false;

  private java.lang.Boolean PermissionsManageCssUsers;

  public java.lang.Boolean getPermissionsManageCssUsers() {
    return PermissionsManageCssUsers;
  }

  

  public void setPermissionsManageCssUsers(java.lang.Boolean PermissionsManageCssUsers) {
    this.PermissionsManageCssUsers = PermissionsManageCssUsers;
    PermissionsManageCssUsers__is_set = true;
  }
  
  /**
   * element  : PermissionsManageCustomPermissions of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageCustomPermissions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageCustomPermissions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageCustomPermissions__is_set = false;

  private java.lang.Boolean PermissionsManageCustomPermissions;

  public java.lang.Boolean getPermissionsManageCustomPermissions() {
    return PermissionsManageCustomPermissions;
  }

  

  public void setPermissionsManageCustomPermissions(java.lang.Boolean PermissionsManageCustomPermissions) {
    this.PermissionsManageCustomPermissions = PermissionsManageCustomPermissions;
    PermissionsManageCustomPermissions__is_set = true;
  }
  
  /**
   * element  : PermissionsManageCustomReportTypes of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageCustomReportTypes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageCustomReportTypes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageCustomReportTypes__is_set = false;

  private java.lang.Boolean PermissionsManageCustomReportTypes;

  public java.lang.Boolean getPermissionsManageCustomReportTypes() {
    return PermissionsManageCustomReportTypes;
  }

  

  public void setPermissionsManageCustomReportTypes(java.lang.Boolean PermissionsManageCustomReportTypes) {
    this.PermissionsManageCustomReportTypes = PermissionsManageCustomReportTypes;
    PermissionsManageCustomReportTypes__is_set = true;
  }
  
  /**
   * element  : PermissionsManageDashboards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageDashboards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageDashboards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageDashboards__is_set = false;

  private java.lang.Boolean PermissionsManageDashboards;

  public java.lang.Boolean getPermissionsManageDashboards() {
    return PermissionsManageDashboards;
  }

  

  public void setPermissionsManageDashboards(java.lang.Boolean PermissionsManageDashboards) {
    this.PermissionsManageDashboards = PermissionsManageDashboards;
    PermissionsManageDashboards__is_set = true;
  }
  
  /**
   * element  : PermissionsManageDataCategories of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageDataCategories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageDataCategories","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageDataCategories__is_set = false;

  private java.lang.Boolean PermissionsManageDataCategories;

  public java.lang.Boolean getPermissionsManageDataCategories() {
    return PermissionsManageDataCategories;
  }

  

  public void setPermissionsManageDataCategories(java.lang.Boolean PermissionsManageDataCategories) {
    this.PermissionsManageDataCategories = PermissionsManageDataCategories;
    PermissionsManageDataCategories__is_set = true;
  }
  
  /**
   * element  : PermissionsManageDataIntegrations of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageDataIntegrations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageDataIntegrations","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageDataIntegrations__is_set = false;

  private java.lang.Boolean PermissionsManageDataIntegrations;

  public java.lang.Boolean getPermissionsManageDataIntegrations() {
    return PermissionsManageDataIntegrations;
  }

  

  public void setPermissionsManageDataIntegrations(java.lang.Boolean PermissionsManageDataIntegrations) {
    this.PermissionsManageDataIntegrations = PermissionsManageDataIntegrations;
    PermissionsManageDataIntegrations__is_set = true;
  }
  
  /**
   * element  : PermissionsManageDynamicDashboards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageDynamicDashboards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageDynamicDashboards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageDynamicDashboards__is_set = false;

  private java.lang.Boolean PermissionsManageDynamicDashboards;

  public java.lang.Boolean getPermissionsManageDynamicDashboards() {
    return PermissionsManageDynamicDashboards;
  }

  

  public void setPermissionsManageDynamicDashboards(java.lang.Boolean PermissionsManageDynamicDashboards) {
    this.PermissionsManageDynamicDashboards = PermissionsManageDynamicDashboards;
    PermissionsManageDynamicDashboards__is_set = true;
  }
  
  /**
   * element  : PermissionsManageEmailClientConfig of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageEmailClientConfig__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageEmailClientConfig","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageEmailClientConfig__is_set = false;

  private java.lang.Boolean PermissionsManageEmailClientConfig;

  public java.lang.Boolean getPermissionsManageEmailClientConfig() {
    return PermissionsManageEmailClientConfig;
  }

  

  public void setPermissionsManageEmailClientConfig(java.lang.Boolean PermissionsManageEmailClientConfig) {
    this.PermissionsManageEmailClientConfig = PermissionsManageEmailClientConfig;
    PermissionsManageEmailClientConfig__is_set = true;
  }
  
  /**
   * element  : PermissionsManageExchangeConfig of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageExchangeConfig__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageExchangeConfig","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageExchangeConfig__is_set = false;

  private java.lang.Boolean PermissionsManageExchangeConfig;

  public java.lang.Boolean getPermissionsManageExchangeConfig() {
    return PermissionsManageExchangeConfig;
  }

  

  public void setPermissionsManageExchangeConfig(java.lang.Boolean PermissionsManageExchangeConfig) {
    this.PermissionsManageExchangeConfig = PermissionsManageExchangeConfig;
    PermissionsManageExchangeConfig__is_set = true;
  }
  
  /**
   * element  : PermissionsManageInteraction of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageInteraction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageInteraction","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageInteraction__is_set = false;

  private java.lang.Boolean PermissionsManageInteraction;

  public java.lang.Boolean getPermissionsManageInteraction() {
    return PermissionsManageInteraction;
  }

  

  public void setPermissionsManageInteraction(java.lang.Boolean PermissionsManageInteraction) {
    this.PermissionsManageInteraction = PermissionsManageInteraction;
    PermissionsManageInteraction__is_set = true;
  }
  
  /**
   * element  : PermissionsManageInternalUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageInternalUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageInternalUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageInternalUsers__is_set = false;

  private java.lang.Boolean PermissionsManageInternalUsers;

  public java.lang.Boolean getPermissionsManageInternalUsers() {
    return PermissionsManageInternalUsers;
  }

  

  public void setPermissionsManageInternalUsers(java.lang.Boolean PermissionsManageInternalUsers) {
    this.PermissionsManageInternalUsers = PermissionsManageInternalUsers;
    PermissionsManageInternalUsers__is_set = true;
  }
  
  /**
   * element  : PermissionsManageIpAddresses of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageIpAddresses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageIpAddresses","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageIpAddresses__is_set = false;

  private java.lang.Boolean PermissionsManageIpAddresses;

  public java.lang.Boolean getPermissionsManageIpAddresses() {
    return PermissionsManageIpAddresses;
  }

  

  public void setPermissionsManageIpAddresses(java.lang.Boolean PermissionsManageIpAddresses) {
    this.PermissionsManageIpAddresses = PermissionsManageIpAddresses;
    PermissionsManageIpAddresses__is_set = true;
  }
  
  /**
   * element  : PermissionsManageKnowledge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageKnowledge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageKnowledge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageKnowledge__is_set = false;

  private java.lang.Boolean PermissionsManageKnowledge;

  public java.lang.Boolean getPermissionsManageKnowledge() {
    return PermissionsManageKnowledge;
  }

  

  public void setPermissionsManageKnowledge(java.lang.Boolean PermissionsManageKnowledge) {
    this.PermissionsManageKnowledge = PermissionsManageKnowledge;
    PermissionsManageKnowledge__is_set = true;
  }
  
  /**
   * element  : PermissionsManageKnowledgeImportExport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageKnowledgeImportExport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageKnowledgeImportExport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageKnowledgeImportExport__is_set = false;

  private java.lang.Boolean PermissionsManageKnowledgeImportExport;

  public java.lang.Boolean getPermissionsManageKnowledgeImportExport() {
    return PermissionsManageKnowledgeImportExport;
  }

  

  public void setPermissionsManageKnowledgeImportExport(java.lang.Boolean PermissionsManageKnowledgeImportExport) {
    this.PermissionsManageKnowledgeImportExport = PermissionsManageKnowledgeImportExport;
    PermissionsManageKnowledgeImportExport__is_set = true;
  }
  
  /**
   * element  : PermissionsManageLeads of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageLeads__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageLeads","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageLeads__is_set = false;

  private java.lang.Boolean PermissionsManageLeads;

  public java.lang.Boolean getPermissionsManageLeads() {
    return PermissionsManageLeads;
  }

  

  public void setPermissionsManageLeads(java.lang.Boolean PermissionsManageLeads) {
    this.PermissionsManageLeads = PermissionsManageLeads;
    PermissionsManageLeads__is_set = true;
  }
  
  /**
   * element  : PermissionsManageLoginAccessPolicies of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageLoginAccessPolicies__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageLoginAccessPolicies","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageLoginAccessPolicies__is_set = false;

  private java.lang.Boolean PermissionsManageLoginAccessPolicies;

  public java.lang.Boolean getPermissionsManageLoginAccessPolicies() {
    return PermissionsManageLoginAccessPolicies;
  }

  

  public void setPermissionsManageLoginAccessPolicies(java.lang.Boolean PermissionsManageLoginAccessPolicies) {
    this.PermissionsManageLoginAccessPolicies = PermissionsManageLoginAccessPolicies;
    PermissionsManageLoginAccessPolicies__is_set = true;
  }
  
  /**
   * element  : PermissionsManageMobile of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageMobile__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageMobile","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageMobile__is_set = false;

  private java.lang.Boolean PermissionsManageMobile;

  public java.lang.Boolean getPermissionsManageMobile() {
    return PermissionsManageMobile;
  }

  

  public void setPermissionsManageMobile(java.lang.Boolean PermissionsManageMobile) {
    this.PermissionsManageMobile = PermissionsManageMobile;
    PermissionsManageMobile__is_set = true;
  }
  
  /**
   * element  : PermissionsManagePartners of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManagePartners__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManagePartners","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManagePartners__is_set = false;

  private java.lang.Boolean PermissionsManagePartners;

  public java.lang.Boolean getPermissionsManagePartners() {
    return PermissionsManagePartners;
  }

  

  public void setPermissionsManagePartners(java.lang.Boolean PermissionsManagePartners) {
    this.PermissionsManagePartners = PermissionsManagePartners;
    PermissionsManagePartners__is_set = true;
  }
  
  /**
   * element  : PermissionsManagePasswordPolicies of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManagePasswordPolicies__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManagePasswordPolicies","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManagePasswordPolicies__is_set = false;

  private java.lang.Boolean PermissionsManagePasswordPolicies;

  public java.lang.Boolean getPermissionsManagePasswordPolicies() {
    return PermissionsManagePasswordPolicies;
  }

  

  public void setPermissionsManagePasswordPolicies(java.lang.Boolean PermissionsManagePasswordPolicies) {
    this.PermissionsManagePasswordPolicies = PermissionsManagePasswordPolicies;
    PermissionsManagePasswordPolicies__is_set = true;
  }
  
  /**
   * element  : PermissionsManageProfilesPermissionsets of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageProfilesPermissionsets__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageProfilesPermissionsets","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageProfilesPermissionsets__is_set = false;

  private java.lang.Boolean PermissionsManageProfilesPermissionsets;

  public java.lang.Boolean getPermissionsManageProfilesPermissionsets() {
    return PermissionsManageProfilesPermissionsets;
  }

  

  public void setPermissionsManageProfilesPermissionsets(java.lang.Boolean PermissionsManageProfilesPermissionsets) {
    this.PermissionsManageProfilesPermissionsets = PermissionsManageProfilesPermissionsets;
    PermissionsManageProfilesPermissionsets__is_set = true;
  }
  
  /**
   * element  : PermissionsManagePvtRptsAndDashbds of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManagePvtRptsAndDashbds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManagePvtRptsAndDashbds","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManagePvtRptsAndDashbds__is_set = false;

  private java.lang.Boolean PermissionsManagePvtRptsAndDashbds;

  public java.lang.Boolean getPermissionsManagePvtRptsAndDashbds() {
    return PermissionsManagePvtRptsAndDashbds;
  }

  

  public void setPermissionsManagePvtRptsAndDashbds(java.lang.Boolean PermissionsManagePvtRptsAndDashbds) {
    this.PermissionsManagePvtRptsAndDashbds = PermissionsManagePvtRptsAndDashbds;
    PermissionsManagePvtRptsAndDashbds__is_set = true;
  }
  
  /**
   * element  : PermissionsManageRemoteAccess of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageRemoteAccess__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageRemoteAccess","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageRemoteAccess__is_set = false;

  private java.lang.Boolean PermissionsManageRemoteAccess;

  public java.lang.Boolean getPermissionsManageRemoteAccess() {
    return PermissionsManageRemoteAccess;
  }

  

  public void setPermissionsManageRemoteAccess(java.lang.Boolean PermissionsManageRemoteAccess) {
    this.PermissionsManageRemoteAccess = PermissionsManageRemoteAccess;
    PermissionsManageRemoteAccess__is_set = true;
  }
  
  /**
   * element  : PermissionsManageRoles of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageRoles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageRoles","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageRoles__is_set = false;

  private java.lang.Boolean PermissionsManageRoles;

  public java.lang.Boolean getPermissionsManageRoles() {
    return PermissionsManageRoles;
  }

  

  public void setPermissionsManageRoles(java.lang.Boolean PermissionsManageRoles) {
    this.PermissionsManageRoles = PermissionsManageRoles;
    PermissionsManageRoles__is_set = true;
  }
  
  /**
   * element  : PermissionsManageSandboxes of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageSandboxes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageSandboxes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageSandboxes__is_set = false;

  private java.lang.Boolean PermissionsManageSandboxes;

  public java.lang.Boolean getPermissionsManageSandboxes() {
    return PermissionsManageSandboxes;
  }

  

  public void setPermissionsManageSandboxes(java.lang.Boolean PermissionsManageSandboxes) {
    this.PermissionsManageSandboxes = PermissionsManageSandboxes;
    PermissionsManageSandboxes__is_set = true;
  }
  
  /**
   * element  : PermissionsManageSearchPromotionRules of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageSearchPromotionRules__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageSearchPromotionRules","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageSearchPromotionRules__is_set = false;

  private java.lang.Boolean PermissionsManageSearchPromotionRules;

  public java.lang.Boolean getPermissionsManageSearchPromotionRules() {
    return PermissionsManageSearchPromotionRules;
  }

  

  public void setPermissionsManageSearchPromotionRules(java.lang.Boolean PermissionsManageSearchPromotionRules) {
    this.PermissionsManageSearchPromotionRules = PermissionsManageSearchPromotionRules;
    PermissionsManageSearchPromotionRules__is_set = true;
  }
  
  /**
   * element  : PermissionsManageSelfService of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageSelfService__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageSelfService","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageSelfService__is_set = false;

  private java.lang.Boolean PermissionsManageSelfService;

  public java.lang.Boolean getPermissionsManageSelfService() {
    return PermissionsManageSelfService;
  }

  

  public void setPermissionsManageSelfService(java.lang.Boolean PermissionsManageSelfService) {
    this.PermissionsManageSelfService = PermissionsManageSelfService;
    PermissionsManageSelfService__is_set = true;
  }
  
  /**
   * element  : PermissionsManageSharing of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageSharing__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageSharing","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageSharing__is_set = false;

  private java.lang.Boolean PermissionsManageSharing;

  public java.lang.Boolean getPermissionsManageSharing() {
    return PermissionsManageSharing;
  }

  

  public void setPermissionsManageSharing(java.lang.Boolean PermissionsManageSharing) {
    this.PermissionsManageSharing = PermissionsManageSharing;
    PermissionsManageSharing__is_set = true;
  }
  
  /**
   * element  : PermissionsManageSolutions of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageSolutions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageSolutions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageSolutions__is_set = false;

  private java.lang.Boolean PermissionsManageSolutions;

  public java.lang.Boolean getPermissionsManageSolutions() {
    return PermissionsManageSolutions;
  }

  

  public void setPermissionsManageSolutions(java.lang.Boolean PermissionsManageSolutions) {
    this.PermissionsManageSolutions = PermissionsManageSolutions;
    PermissionsManageSolutions__is_set = true;
  }
  
  /**
   * element  : PermissionsManageSynonyms of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageSynonyms__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageSynonyms","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageSynonyms__is_set = false;

  private java.lang.Boolean PermissionsManageSynonyms;

  public java.lang.Boolean getPermissionsManageSynonyms() {
    return PermissionsManageSynonyms;
  }

  

  public void setPermissionsManageSynonyms(java.lang.Boolean PermissionsManageSynonyms) {
    this.PermissionsManageSynonyms = PermissionsManageSynonyms;
    PermissionsManageSynonyms__is_set = true;
  }
  
  /**
   * element  : PermissionsManageTranslation of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageTranslation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageTranslation","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageTranslation__is_set = false;

  private java.lang.Boolean PermissionsManageTranslation;

  public java.lang.Boolean getPermissionsManageTranslation() {
    return PermissionsManageTranslation;
  }

  

  public void setPermissionsManageTranslation(java.lang.Boolean PermissionsManageTranslation) {
    this.PermissionsManageTranslation = PermissionsManageTranslation;
    PermissionsManageTranslation__is_set = true;
  }
  
  /**
   * element  : PermissionsManageTwoFactor of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageTwoFactor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageTwoFactor","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageTwoFactor__is_set = false;

  private java.lang.Boolean PermissionsManageTwoFactor;

  public java.lang.Boolean getPermissionsManageTwoFactor() {
    return PermissionsManageTwoFactor;
  }

  

  public void setPermissionsManageTwoFactor(java.lang.Boolean PermissionsManageTwoFactor) {
    this.PermissionsManageTwoFactor = PermissionsManageTwoFactor;
    PermissionsManageTwoFactor__is_set = true;
  }
  
  /**
   * element  : PermissionsManageUnlistedGroups of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageUnlistedGroups__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageUnlistedGroups","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageUnlistedGroups__is_set = false;

  private java.lang.Boolean PermissionsManageUnlistedGroups;

  public java.lang.Boolean getPermissionsManageUnlistedGroups() {
    return PermissionsManageUnlistedGroups;
  }

  

  public void setPermissionsManageUnlistedGroups(java.lang.Boolean PermissionsManageUnlistedGroups) {
    this.PermissionsManageUnlistedGroups = PermissionsManageUnlistedGroups;
    PermissionsManageUnlistedGroups__is_set = true;
  }
  
  /**
   * element  : PermissionsManageUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsManageUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsManageUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsManageUsers__is_set = false;

  private java.lang.Boolean PermissionsManageUsers;

  public java.lang.Boolean getPermissionsManageUsers() {
    return PermissionsManageUsers;
  }

  

  public void setPermissionsManageUsers(java.lang.Boolean PermissionsManageUsers) {
    this.PermissionsManageUsers = PermissionsManageUsers;
    PermissionsManageUsers__is_set = true;
  }
  
  /**
   * element  : PermissionsMassInlineEdit of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsMassInlineEdit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsMassInlineEdit","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsMassInlineEdit__is_set = false;

  private java.lang.Boolean PermissionsMassInlineEdit;

  public java.lang.Boolean getPermissionsMassInlineEdit() {
    return PermissionsMassInlineEdit;
  }

  

  public void setPermissionsMassInlineEdit(java.lang.Boolean PermissionsMassInlineEdit) {
    this.PermissionsMassInlineEdit = PermissionsMassInlineEdit;
    PermissionsMassInlineEdit__is_set = true;
  }
  
  /**
   * element  : PermissionsMergeTopics of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsMergeTopics__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsMergeTopics","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsMergeTopics__is_set = false;

  private java.lang.Boolean PermissionsMergeTopics;

  public java.lang.Boolean getPermissionsMergeTopics() {
    return PermissionsMergeTopics;
  }

  

  public void setPermissionsMergeTopics(java.lang.Boolean PermissionsMergeTopics) {
    this.PermissionsMergeTopics = PermissionsMergeTopics;
    PermissionsMergeTopics__is_set = true;
  }
  
  /**
   * element  : PermissionsModerateChatter of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsModerateChatter__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsModerateChatter","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsModerateChatter__is_set = false;

  private java.lang.Boolean PermissionsModerateChatter;

  public java.lang.Boolean getPermissionsModerateChatter() {
    return PermissionsModerateChatter;
  }

  

  public void setPermissionsModerateChatter(java.lang.Boolean PermissionsModerateChatter) {
    this.PermissionsModerateChatter = PermissionsModerateChatter;
    PermissionsModerateChatter__is_set = true;
  }
  
  /**
   * element  : PermissionsModifyAllData of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsModifyAllData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsModifyAllData","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsModifyAllData__is_set = false;

  private java.lang.Boolean PermissionsModifyAllData;

  public java.lang.Boolean getPermissionsModifyAllData() {
    return PermissionsModifyAllData;
  }

  

  public void setPermissionsModifyAllData(java.lang.Boolean PermissionsModifyAllData) {
    this.PermissionsModifyAllData = PermissionsModifyAllData;
    PermissionsModifyAllData__is_set = true;
  }
  
  /**
   * element  : PermissionsNewReportBuilder of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsNewReportBuilder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsNewReportBuilder","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsNewReportBuilder__is_set = false;

  private java.lang.Boolean PermissionsNewReportBuilder;

  public java.lang.Boolean getPermissionsNewReportBuilder() {
    return PermissionsNewReportBuilder;
  }

  

  public void setPermissionsNewReportBuilder(java.lang.Boolean PermissionsNewReportBuilder) {
    this.PermissionsNewReportBuilder = PermissionsNewReportBuilder;
    PermissionsNewReportBuilder__is_set = true;
  }
  
  /**
   * element  : PermissionsOutboundMigrationToolsUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsOutboundMigrationToolsUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsOutboundMigrationToolsUser","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsOutboundMigrationToolsUser__is_set = false;

  private java.lang.Boolean PermissionsOutboundMigrationToolsUser;

  public java.lang.Boolean getPermissionsOutboundMigrationToolsUser() {
    return PermissionsOutboundMigrationToolsUser;
  }

  

  public void setPermissionsOutboundMigrationToolsUser(java.lang.Boolean PermissionsOutboundMigrationToolsUser) {
    this.PermissionsOutboundMigrationToolsUser = PermissionsOutboundMigrationToolsUser;
    PermissionsOutboundMigrationToolsUser__is_set = true;
  }
  
  /**
   * element  : PermissionsPasswordNeverExpires of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsPasswordNeverExpires__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsPasswordNeverExpires","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsPasswordNeverExpires__is_set = false;

  private java.lang.Boolean PermissionsPasswordNeverExpires;

  public java.lang.Boolean getPermissionsPasswordNeverExpires() {
    return PermissionsPasswordNeverExpires;
  }

  

  public void setPermissionsPasswordNeverExpires(java.lang.Boolean PermissionsPasswordNeverExpires) {
    this.PermissionsPasswordNeverExpires = PermissionsPasswordNeverExpires;
    PermissionsPasswordNeverExpires__is_set = true;
  }
  
  /**
   * element  : PermissionsPublishPackaging of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsPublishPackaging__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsPublishPackaging","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsPublishPackaging__is_set = false;

  private java.lang.Boolean PermissionsPublishPackaging;

  public java.lang.Boolean getPermissionsPublishPackaging() {
    return PermissionsPublishPackaging;
  }

  

  public void setPermissionsPublishPackaging(java.lang.Boolean PermissionsPublishPackaging) {
    this.PermissionsPublishPackaging = PermissionsPublishPackaging;
    PermissionsPublishPackaging__is_set = true;
  }
  
  /**
   * element  : PermissionsResetPasswords of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsResetPasswords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsResetPasswords","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsResetPasswords__is_set = false;

  private java.lang.Boolean PermissionsResetPasswords;

  public java.lang.Boolean getPermissionsResetPasswords() {
    return PermissionsResetPasswords;
  }

  

  public void setPermissionsResetPasswords(java.lang.Boolean PermissionsResetPasswords) {
    this.PermissionsResetPasswords = PermissionsResetPasswords;
    PermissionsResetPasswords__is_set = true;
  }
  
  /**
   * element  : PermissionsRunFlow of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsRunFlow__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsRunFlow","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsRunFlow__is_set = false;

  private java.lang.Boolean PermissionsRunFlow;

  public java.lang.Boolean getPermissionsRunFlow() {
    return PermissionsRunFlow;
  }

  

  public void setPermissionsRunFlow(java.lang.Boolean PermissionsRunFlow) {
    this.PermissionsRunFlow = PermissionsRunFlow;
    PermissionsRunFlow__is_set = true;
  }
  
  /**
   * element  : PermissionsRunReports of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsRunReports__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsRunReports","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsRunReports__is_set = false;

  private java.lang.Boolean PermissionsRunReports;

  public java.lang.Boolean getPermissionsRunReports() {
    return PermissionsRunReports;
  }

  

  public void setPermissionsRunReports(java.lang.Boolean PermissionsRunReports) {
    this.PermissionsRunReports = PermissionsRunReports;
    PermissionsRunReports__is_set = true;
  }
  
  /**
   * element  : PermissionsSalesConsole of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsSalesConsole__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsSalesConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsSalesConsole__is_set = false;

  private java.lang.Boolean PermissionsSalesConsole;

  public java.lang.Boolean getPermissionsSalesConsole() {
    return PermissionsSalesConsole;
  }

  

  public void setPermissionsSalesConsole(java.lang.Boolean PermissionsSalesConsole) {
    this.PermissionsSalesConsole = PermissionsSalesConsole;
    PermissionsSalesConsole__is_set = true;
  }
  
  /**
   * element  : PermissionsScheduleJob of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsScheduleJob__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsScheduleJob","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsScheduleJob__is_set = false;

  private java.lang.Boolean PermissionsScheduleJob;

  public java.lang.Boolean getPermissionsScheduleJob() {
    return PermissionsScheduleJob;
  }

  

  public void setPermissionsScheduleJob(java.lang.Boolean PermissionsScheduleJob) {
    this.PermissionsScheduleJob = PermissionsScheduleJob;
    PermissionsScheduleJob__is_set = true;
  }
  
  /**
   * element  : PermissionsScheduleReports of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsScheduleReports__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsScheduleReports","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsScheduleReports__is_set = false;

  private java.lang.Boolean PermissionsScheduleReports;

  public java.lang.Boolean getPermissionsScheduleReports() {
    return PermissionsScheduleReports;
  }

  

  public void setPermissionsScheduleReports(java.lang.Boolean PermissionsScheduleReports) {
    this.PermissionsScheduleReports = PermissionsScheduleReports;
    PermissionsScheduleReports__is_set = true;
  }
  
  /**
   * element  : PermissionsSelectFilesFromSalesforce of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsSelectFilesFromSalesforce__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsSelectFilesFromSalesforce","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsSelectFilesFromSalesforce__is_set = false;

  private java.lang.Boolean PermissionsSelectFilesFromSalesforce;

  public java.lang.Boolean getPermissionsSelectFilesFromSalesforce() {
    return PermissionsSelectFilesFromSalesforce;
  }

  

  public void setPermissionsSelectFilesFromSalesforce(java.lang.Boolean PermissionsSelectFilesFromSalesforce) {
    this.PermissionsSelectFilesFromSalesforce = PermissionsSelectFilesFromSalesforce;
    PermissionsSelectFilesFromSalesforce__is_set = true;
  }
  
  /**
   * element  : PermissionsSendAnnouncementEmails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsSendAnnouncementEmails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsSendAnnouncementEmails","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsSendAnnouncementEmails__is_set = false;

  private java.lang.Boolean PermissionsSendAnnouncementEmails;

  public java.lang.Boolean getPermissionsSendAnnouncementEmails() {
    return PermissionsSendAnnouncementEmails;
  }

  

  public void setPermissionsSendAnnouncementEmails(java.lang.Boolean PermissionsSendAnnouncementEmails) {
    this.PermissionsSendAnnouncementEmails = PermissionsSendAnnouncementEmails;
    PermissionsSendAnnouncementEmails__is_set = true;
  }
  
  /**
   * element  : PermissionsSendSitRequests of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsSendSitRequests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsSendSitRequests","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsSendSitRequests__is_set = false;

  private java.lang.Boolean PermissionsSendSitRequests;

  public java.lang.Boolean getPermissionsSendSitRequests() {
    return PermissionsSendSitRequests;
  }

  

  public void setPermissionsSendSitRequests(java.lang.Boolean PermissionsSendSitRequests) {
    this.PermissionsSendSitRequests = PermissionsSendSitRequests;
    PermissionsSendSitRequests__is_set = true;
  }
  
  /**
   * element  : PermissionsShareInternalArticles of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsShareInternalArticles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsShareInternalArticles","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsShareInternalArticles__is_set = false;

  private java.lang.Boolean PermissionsShareInternalArticles;

  public java.lang.Boolean getPermissionsShareInternalArticles() {
    return PermissionsShareInternalArticles;
  }

  

  public void setPermissionsShareInternalArticles(java.lang.Boolean PermissionsShareInternalArticles) {
    this.PermissionsShareInternalArticles = PermissionsShareInternalArticles;
    PermissionsShareInternalArticles__is_set = true;
  }
  
  /**
   * element  : PermissionsShowCompanyNameAsUserBadge of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsShowCompanyNameAsUserBadge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsShowCompanyNameAsUserBadge","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsShowCompanyNameAsUserBadge__is_set = false;

  private java.lang.Boolean PermissionsShowCompanyNameAsUserBadge;

  public java.lang.Boolean getPermissionsShowCompanyNameAsUserBadge() {
    return PermissionsShowCompanyNameAsUserBadge;
  }

  

  public void setPermissionsShowCompanyNameAsUserBadge(java.lang.Boolean PermissionsShowCompanyNameAsUserBadge) {
    this.PermissionsShowCompanyNameAsUserBadge = PermissionsShowCompanyNameAsUserBadge;
    PermissionsShowCompanyNameAsUserBadge__is_set = true;
  }
  
  /**
   * element  : PermissionsSocialInsightsLogoAdmin of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsSocialInsightsLogoAdmin__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsSocialInsightsLogoAdmin","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsSocialInsightsLogoAdmin__is_set = false;

  private java.lang.Boolean PermissionsSocialInsightsLogoAdmin;

  public java.lang.Boolean getPermissionsSocialInsightsLogoAdmin() {
    return PermissionsSocialInsightsLogoAdmin;
  }

  

  public void setPermissionsSocialInsightsLogoAdmin(java.lang.Boolean PermissionsSocialInsightsLogoAdmin) {
    this.PermissionsSocialInsightsLogoAdmin = PermissionsSocialInsightsLogoAdmin;
    PermissionsSocialInsightsLogoAdmin__is_set = true;
  }
  
  /**
   * element  : PermissionsSolutionImport of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsSolutionImport__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsSolutionImport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsSolutionImport__is_set = false;

  private java.lang.Boolean PermissionsSolutionImport;

  public java.lang.Boolean getPermissionsSolutionImport() {
    return PermissionsSolutionImport;
  }

  

  public void setPermissionsSolutionImport(java.lang.Boolean PermissionsSolutionImport) {
    this.PermissionsSolutionImport = PermissionsSolutionImport;
    PermissionsSolutionImport__is_set = true;
  }
  
  /**
   * element  : PermissionsSubmitMacrosAllowed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsSubmitMacrosAllowed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsSubmitMacrosAllowed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsSubmitMacrosAllowed__is_set = false;

  private java.lang.Boolean PermissionsSubmitMacrosAllowed;

  public java.lang.Boolean getPermissionsSubmitMacrosAllowed() {
    return PermissionsSubmitMacrosAllowed;
  }

  

  public void setPermissionsSubmitMacrosAllowed(java.lang.Boolean PermissionsSubmitMacrosAllowed) {
    this.PermissionsSubmitMacrosAllowed = PermissionsSubmitMacrosAllowed;
    PermissionsSubmitMacrosAllowed__is_set = true;
  }
  
  /**
   * element  : PermissionsTagManager of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsTagManager__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsTagManager","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsTagManager__is_set = false;

  private java.lang.Boolean PermissionsTagManager;

  public java.lang.Boolean getPermissionsTagManager() {
    return PermissionsTagManager;
  }

  

  public void setPermissionsTagManager(java.lang.Boolean PermissionsTagManager) {
    this.PermissionsTagManager = PermissionsTagManager;
    PermissionsTagManager__is_set = true;
  }
  
  /**
   * element  : PermissionsTransferAnyCase of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsTransferAnyCase__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsTransferAnyCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsTransferAnyCase__is_set = false;

  private java.lang.Boolean PermissionsTransferAnyCase;

  public java.lang.Boolean getPermissionsTransferAnyCase() {
    return PermissionsTransferAnyCase;
  }

  

  public void setPermissionsTransferAnyCase(java.lang.Boolean PermissionsTransferAnyCase) {
    this.PermissionsTransferAnyCase = PermissionsTransferAnyCase;
    PermissionsTransferAnyCase__is_set = true;
  }
  
  /**
   * element  : PermissionsTransferAnyEntity of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsTransferAnyEntity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsTransferAnyEntity","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsTransferAnyEntity__is_set = false;

  private java.lang.Boolean PermissionsTransferAnyEntity;

  public java.lang.Boolean getPermissionsTransferAnyEntity() {
    return PermissionsTransferAnyEntity;
  }

  

  public void setPermissionsTransferAnyEntity(java.lang.Boolean PermissionsTransferAnyEntity) {
    this.PermissionsTransferAnyEntity = PermissionsTransferAnyEntity;
    PermissionsTransferAnyEntity__is_set = true;
  }
  
  /**
   * element  : PermissionsTransferAnyLead of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsTransferAnyLead__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsTransferAnyLead","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsTransferAnyLead__is_set = false;

  private java.lang.Boolean PermissionsTransferAnyLead;

  public java.lang.Boolean getPermissionsTransferAnyLead() {
    return PermissionsTransferAnyLead;
  }

  

  public void setPermissionsTransferAnyLead(java.lang.Boolean PermissionsTransferAnyLead) {
    this.PermissionsTransferAnyLead = PermissionsTransferAnyLead;
    PermissionsTransferAnyLead__is_set = true;
  }
  
  /**
   * element  : PermissionsTwoFactorApi of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsTwoFactorApi__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsTwoFactorApi","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsTwoFactorApi__is_set = false;

  private java.lang.Boolean PermissionsTwoFactorApi;

  public java.lang.Boolean getPermissionsTwoFactorApi() {
    return PermissionsTwoFactorApi;
  }

  

  public void setPermissionsTwoFactorApi(java.lang.Boolean PermissionsTwoFactorApi) {
    this.PermissionsTwoFactorApi = PermissionsTwoFactorApi;
    PermissionsTwoFactorApi__is_set = true;
  }
  
  /**
   * element  : PermissionsUseTeamReassignWizards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsUseTeamReassignWizards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsUseTeamReassignWizards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsUseTeamReassignWizards__is_set = false;

  private java.lang.Boolean PermissionsUseTeamReassignWizards;

  public java.lang.Boolean getPermissionsUseTeamReassignWizards() {
    return PermissionsUseTeamReassignWizards;
  }

  

  public void setPermissionsUseTeamReassignWizards(java.lang.Boolean PermissionsUseTeamReassignWizards) {
    this.PermissionsUseTeamReassignWizards = PermissionsUseTeamReassignWizards;
    PermissionsUseTeamReassignWizards__is_set = true;
  }
  
  /**
   * element  : PermissionsViewAllData of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewAllData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewAllData","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewAllData__is_set = false;

  private java.lang.Boolean PermissionsViewAllData;

  public java.lang.Boolean getPermissionsViewAllData() {
    return PermissionsViewAllData;
  }

  

  public void setPermissionsViewAllData(java.lang.Boolean PermissionsViewAllData) {
    this.PermissionsViewAllData = PermissionsViewAllData;
    PermissionsViewAllData__is_set = true;
  }
  
  /**
   * element  : PermissionsViewAllUsers of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewAllUsers__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewAllUsers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewAllUsers__is_set = false;

  private java.lang.Boolean PermissionsViewAllUsers;

  public java.lang.Boolean getPermissionsViewAllUsers() {
    return PermissionsViewAllUsers;
  }

  

  public void setPermissionsViewAllUsers(java.lang.Boolean PermissionsViewAllUsers) {
    this.PermissionsViewAllUsers = PermissionsViewAllUsers;
    PermissionsViewAllUsers__is_set = true;
  }
  
  /**
   * element  : PermissionsViewContent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewContent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewContent","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewContent__is_set = false;

  private java.lang.Boolean PermissionsViewContent;

  public java.lang.Boolean getPermissionsViewContent() {
    return PermissionsViewContent;
  }

  

  public void setPermissionsViewContent(java.lang.Boolean PermissionsViewContent) {
    this.PermissionsViewContent = PermissionsViewContent;
    PermissionsViewContent__is_set = true;
  }
  
  /**
   * element  : PermissionsViewDataAssessment of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewDataAssessment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewDataAssessment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewDataAssessment__is_set = false;

  private java.lang.Boolean PermissionsViewDataAssessment;

  public java.lang.Boolean getPermissionsViewDataAssessment() {
    return PermissionsViewDataAssessment;
  }

  

  public void setPermissionsViewDataAssessment(java.lang.Boolean PermissionsViewDataAssessment) {
    this.PermissionsViewDataAssessment = PermissionsViewDataAssessment;
    PermissionsViewDataAssessment__is_set = true;
  }
  
  /**
   * element  : PermissionsViewDataCategories of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewDataCategories__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewDataCategories","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewDataCategories__is_set = false;

  private java.lang.Boolean PermissionsViewDataCategories;

  public java.lang.Boolean getPermissionsViewDataCategories() {
    return PermissionsViewDataCategories;
  }

  

  public void setPermissionsViewDataCategories(java.lang.Boolean PermissionsViewDataCategories) {
    this.PermissionsViewDataCategories = PermissionsViewDataCategories;
    PermissionsViewDataCategories__is_set = true;
  }
  
  /**
   * element  : PermissionsViewEncryptedData of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewEncryptedData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewEncryptedData","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewEncryptedData__is_set = false;

  private java.lang.Boolean PermissionsViewEncryptedData;

  public java.lang.Boolean getPermissionsViewEncryptedData() {
    return PermissionsViewEncryptedData;
  }

  

  public void setPermissionsViewEncryptedData(java.lang.Boolean PermissionsViewEncryptedData) {
    this.PermissionsViewEncryptedData = PermissionsViewEncryptedData;
    PermissionsViewEncryptedData__is_set = true;
  }
  
  /**
   * element  : PermissionsViewEventLogFiles of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewEventLogFiles__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewEventLogFiles","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewEventLogFiles__is_set = false;

  private java.lang.Boolean PermissionsViewEventLogFiles;

  public java.lang.Boolean getPermissionsViewEventLogFiles() {
    return PermissionsViewEventLogFiles;
  }

  

  public void setPermissionsViewEventLogFiles(java.lang.Boolean PermissionsViewEventLogFiles) {
    this.PermissionsViewEventLogFiles = PermissionsViewEventLogFiles;
    PermissionsViewEventLogFiles__is_set = true;
  }
  
  /**
   * element  : PermissionsViewHelpLink of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewHelpLink__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewHelpLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewHelpLink__is_set = false;

  private java.lang.Boolean PermissionsViewHelpLink;

  public java.lang.Boolean getPermissionsViewHelpLink() {
    return PermissionsViewHelpLink;
  }

  

  public void setPermissionsViewHelpLink(java.lang.Boolean PermissionsViewHelpLink) {
    this.PermissionsViewHelpLink = PermissionsViewHelpLink;
    PermissionsViewHelpLink__is_set = true;
  }
  
  /**
   * element  : PermissionsViewMyTeamsDashboards of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewMyTeamsDashboards__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewMyTeamsDashboards","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewMyTeamsDashboards__is_set = false;

  private java.lang.Boolean PermissionsViewMyTeamsDashboards;

  public java.lang.Boolean getPermissionsViewMyTeamsDashboards() {
    return PermissionsViewMyTeamsDashboards;
  }

  

  public void setPermissionsViewMyTeamsDashboards(java.lang.Boolean PermissionsViewMyTeamsDashboards) {
    this.PermissionsViewMyTeamsDashboards = PermissionsViewMyTeamsDashboards;
    PermissionsViewMyTeamsDashboards__is_set = true;
  }
  
  /**
   * element  : PermissionsViewSetup of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo PermissionsViewSetup__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PermissionsViewSetup","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean PermissionsViewSetup__is_set = false;

  private java.lang.Boolean PermissionsViewSetup;

  public java.lang.Boolean getPermissionsViewSetup() {
    return PermissionsViewSetup;
  }

  

  public void setPermissionsViewSetup(java.lang.Boolean PermissionsViewSetup) {
    this.PermissionsViewSetup = PermissionsViewSetup;
    PermissionsViewSetup__is_set = true;
  }
  
  /**
   * element  : Profile of type {urn:sobject.enterprise.soap.sforce.com}Profile
   * java type: com.sforce.soap.enterprise.sobject.Profile
   */
  private static final com.sforce.ws.bind.TypeInfo Profile__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Profile","urn:sobject.enterprise.soap.sforce.com","Profile",0,1,true);

  private boolean Profile__is_set = false;

  private com.sforce.soap.enterprise.sobject.Profile Profile;

  public com.sforce.soap.enterprise.sobject.Profile getProfile() {
    return Profile;
  }

  

  public void setProfile(com.sforce.soap.enterprise.sobject.Profile Profile) {
    this.Profile = Profile;
    Profile__is_set = true;
  }
  
  /**
   * element  : ProfileId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProfileId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProfileId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ProfileId__is_set = false;

  private java.lang.String ProfileId;

  public java.lang.String getProfileId() {
    return ProfileId;
  }

  

  public void setProfileId(java.lang.String ProfileId) {
    this.ProfileId = ProfileId;
    ProfileId__is_set = true;
  }
  
  /**
   * element  : SetupEntityAccessItems of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo SetupEntityAccessItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SetupEntityAccessItems","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean SetupEntityAccessItems__is_set = false;

  private com.sforce.soap.enterprise.QueryResult SetupEntityAccessItems;

  public com.sforce.soap.enterprise.QueryResult getSetupEntityAccessItems() {
    return SetupEntityAccessItems;
  }

  

  public void setSetupEntityAccessItems(com.sforce.soap.enterprise.QueryResult SetupEntityAccessItems) {
    this.SetupEntityAccessItems = SetupEntityAccessItems;
    SetupEntityAccessItems__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "PermissionSet");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Assignments__typeInfo, Assignments, Assignments__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, FieldPerms__typeInfo, FieldPerms, FieldPerms__is_set);
    __typeMapper.writeObject(__out, IsOwnedByProfile__typeInfo, IsOwnedByProfile, IsOwnedByProfile__is_set);
    __typeMapper.writeString(__out, Label__typeInfo, Label, Label__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, License__typeInfo, License, License__is_set);
    __typeMapper.writeString(__out, LicenseId__typeInfo, LicenseId, LicenseId__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeObject(__out, ObjectPerms__typeInfo, ObjectPerms, ObjectPerms__is_set);
    __typeMapper.writeObject(__out, PermissionsActivateContract__typeInfo, PermissionsActivateContract, PermissionsActivateContract__is_set);
    __typeMapper.writeObject(__out, PermissionsAllowEmailIC__typeInfo, PermissionsAllowEmailIC, PermissionsAllowEmailIC__is_set);
    __typeMapper.writeObject(__out, PermissionsAllowUniversalSearch__typeInfo, PermissionsAllowUniversalSearch, PermissionsAllowUniversalSearch__is_set);
    __typeMapper.writeObject(__out, PermissionsAllowViewKnowledge__typeInfo, PermissionsAllowViewKnowledge, PermissionsAllowViewKnowledge__is_set);
    __typeMapper.writeObject(__out, PermissionsApiEnabled__typeInfo, PermissionsApiEnabled, PermissionsApiEnabled__is_set);
    __typeMapper.writeObject(__out, PermissionsApiUserOnly__typeInfo, PermissionsApiUserOnly, PermissionsApiUserOnly__is_set);
    __typeMapper.writeObject(__out, PermissionsAssignPermissionSets__typeInfo, PermissionsAssignPermissionSets, PermissionsAssignPermissionSets__is_set);
    __typeMapper.writeObject(__out, PermissionsAssignTopics__typeInfo, PermissionsAssignTopics, PermissionsAssignTopics__is_set);
    __typeMapper.writeObject(__out, PermissionsAuthorApex__typeInfo, PermissionsAuthorApex, PermissionsAuthorApex__is_set);
    __typeMapper.writeObject(__out, PermissionsBulkApiHardDelete__typeInfo, PermissionsBulkApiHardDelete, PermissionsBulkApiHardDelete__is_set);
    __typeMapper.writeObject(__out, PermissionsBulkMacrosAllowed__typeInfo, PermissionsBulkMacrosAllowed, PermissionsBulkMacrosAllowed__is_set);
    __typeMapper.writeObject(__out, PermissionsCampaignInfluence2__typeInfo, PermissionsCampaignInfluence2, PermissionsCampaignInfluence2__is_set);
    __typeMapper.writeObject(__out, PermissionsCanApproveFeedPost__typeInfo, PermissionsCanApproveFeedPost, PermissionsCanApproveFeedPost__is_set);
    __typeMapper.writeObject(__out, PermissionsCanInsertFeedSystemFields__typeInfo, PermissionsCanInsertFeedSystemFields, PermissionsCanInsertFeedSystemFields__is_set);
    __typeMapper.writeObject(__out, PermissionsCanUseNewDashboardBuilder__typeInfo, PermissionsCanUseNewDashboardBuilder, PermissionsCanUseNewDashboardBuilder__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterComposeUiCodesnippet__typeInfo, PermissionsChatterComposeUiCodesnippet, PermissionsChatterComposeUiCodesnippet__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterEditOwnPost__typeInfo, PermissionsChatterEditOwnPost, PermissionsChatterEditOwnPost__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterEditOwnRecordPost__typeInfo, PermissionsChatterEditOwnRecordPost, PermissionsChatterEditOwnRecordPost__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterFileLink__typeInfo, PermissionsChatterFileLink, PermissionsChatterFileLink__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterForSharePoint__typeInfo, PermissionsChatterForSharePoint, PermissionsChatterForSharePoint__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterInternalUser__typeInfo, PermissionsChatterInternalUser, PermissionsChatterInternalUser__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterInviteExternalUsers__typeInfo, PermissionsChatterInviteExternalUsers, PermissionsChatterInviteExternalUsers__is_set);
    __typeMapper.writeObject(__out, PermissionsChatterOwnGroups__typeInfo, PermissionsChatterOwnGroups, PermissionsChatterOwnGroups__is_set);
    __typeMapper.writeObject(__out, PermissionsConfigCustomRecs__typeInfo, PermissionsConfigCustomRecs, PermissionsConfigCustomRecs__is_set);
    __typeMapper.writeObject(__out, PermissionsConnectOrgToEnvironmentHub__typeInfo, PermissionsConnectOrgToEnvironmentHub, PermissionsConnectOrgToEnvironmentHub__is_set);
    __typeMapper.writeObject(__out, PermissionsContentAdministrator__typeInfo, PermissionsContentAdministrator, PermissionsContentAdministrator__is_set);
    __typeMapper.writeObject(__out, PermissionsContentHubUser__typeInfo, PermissionsContentHubUser, PermissionsContentHubUser__is_set);
    __typeMapper.writeObject(__out, PermissionsConvertLeads__typeInfo, PermissionsConvertLeads, PermissionsConvertLeads__is_set);
    __typeMapper.writeObject(__out, PermissionsCreateCustomizeFilters__typeInfo, PermissionsCreateCustomizeFilters, PermissionsCreateCustomizeFilters__is_set);
    __typeMapper.writeObject(__out, PermissionsCreatePackaging__typeInfo, PermissionsCreatePackaging, PermissionsCreatePackaging__is_set);
    __typeMapper.writeObject(__out, PermissionsCreateTopics__typeInfo, PermissionsCreateTopics, PermissionsCreateTopics__is_set);
    __typeMapper.writeObject(__out, PermissionsCreateWorkBadgeDefinition__typeInfo, PermissionsCreateWorkBadgeDefinition, PermissionsCreateWorkBadgeDefinition__is_set);
    __typeMapper.writeObject(__out, PermissionsCreateWorkspaces__typeInfo, PermissionsCreateWorkspaces, PermissionsCreateWorkspaces__is_set);
    __typeMapper.writeObject(__out, PermissionsCustomMobileAppsAccess__typeInfo, PermissionsCustomMobileAppsAccess, PermissionsCustomMobileAppsAccess__is_set);
    __typeMapper.writeObject(__out, PermissionsCustomizeApplication__typeInfo, PermissionsCustomizeApplication, PermissionsCustomizeApplication__is_set);
    __typeMapper.writeObject(__out, PermissionsDataExport__typeInfo, PermissionsDataExport, PermissionsDataExport__is_set);
    __typeMapper.writeObject(__out, PermissionsDelegatedPortalUserAdmin__typeInfo, PermissionsDelegatedPortalUserAdmin, PermissionsDelegatedPortalUserAdmin__is_set);
    __typeMapper.writeObject(__out, PermissionsDelegatedTwoFactor__typeInfo, PermissionsDelegatedTwoFactor, PermissionsDelegatedTwoFactor__is_set);
    __typeMapper.writeObject(__out, PermissionsDeleteActivatedContract__typeInfo, PermissionsDeleteActivatedContract, PermissionsDeleteActivatedContract__is_set);
    __typeMapper.writeObject(__out, PermissionsDeleteTopics__typeInfo, PermissionsDeleteTopics, PermissionsDeleteTopics__is_set);
    __typeMapper.writeObject(__out, PermissionsDistributeFromPersWksp__typeInfo, PermissionsDistributeFromPersWksp, PermissionsDistributeFromPersWksp__is_set);
    __typeMapper.writeObject(__out, PermissionsEditBrandTemplates__typeInfo, PermissionsEditBrandTemplates, PermissionsEditBrandTemplates__is_set);
    __typeMapper.writeObject(__out, PermissionsEditCaseComments__typeInfo, PermissionsEditCaseComments, PermissionsEditCaseComments__is_set);
    __typeMapper.writeObject(__out, PermissionsEditEvent__typeInfo, PermissionsEditEvent, PermissionsEditEvent__is_set);
    __typeMapper.writeObject(__out, PermissionsEditHtmlTemplates__typeInfo, PermissionsEditHtmlTemplates, PermissionsEditHtmlTemplates__is_set);
    __typeMapper.writeObject(__out, PermissionsEditKnowledge__typeInfo, PermissionsEditKnowledge, PermissionsEditKnowledge__is_set);
    __typeMapper.writeObject(__out, PermissionsEditOppLineItemUnitPrice__typeInfo, PermissionsEditOppLineItemUnitPrice, PermissionsEditOppLineItemUnitPrice__is_set);
    __typeMapper.writeObject(__out, PermissionsEditPublicDocuments__typeInfo, PermissionsEditPublicDocuments, PermissionsEditPublicDocuments__is_set);
    __typeMapper.writeObject(__out, PermissionsEditPublicTemplates__typeInfo, PermissionsEditPublicTemplates, PermissionsEditPublicTemplates__is_set);
    __typeMapper.writeObject(__out, PermissionsEditReadonlyFields__typeInfo, PermissionsEditReadonlyFields, PermissionsEditReadonlyFields__is_set);
    __typeMapper.writeObject(__out, PermissionsEditReports__typeInfo, PermissionsEditReports, PermissionsEditReports__is_set);
    __typeMapper.writeObject(__out, PermissionsEditTask__typeInfo, PermissionsEditTask, PermissionsEditTask__is_set);
    __typeMapper.writeObject(__out, PermissionsEditTopics__typeInfo, PermissionsEditTopics, PermissionsEditTopics__is_set);
    __typeMapper.writeObject(__out, PermissionsEmailAdministration__typeInfo, PermissionsEmailAdministration, PermissionsEmailAdministration__is_set);
    __typeMapper.writeObject(__out, PermissionsEmailMass__typeInfo, PermissionsEmailMass, PermissionsEmailMass__is_set);
    __typeMapper.writeObject(__out, PermissionsEmailSingle__typeInfo, PermissionsEmailSingle, PermissionsEmailSingle__is_set);
    __typeMapper.writeObject(__out, PermissionsEmailTemplateManagement__typeInfo, PermissionsEmailTemplateManagement, PermissionsEmailTemplateManagement__is_set);
    __typeMapper.writeObject(__out, PermissionsEnableNotifications__typeInfo, PermissionsEnableNotifications, PermissionsEnableNotifications__is_set);
    __typeMapper.writeObject(__out, PermissionsExportReport__typeInfo, PermissionsExportReport, PermissionsExportReport__is_set);
    __typeMapper.writeObject(__out, PermissionsFlowUFLRequired__typeInfo, PermissionsFlowUFLRequired, PermissionsFlowUFLRequired__is_set);
    __typeMapper.writeObject(__out, PermissionsForceTwoFactor__typeInfo, PermissionsForceTwoFactor, PermissionsForceTwoFactor__is_set);
    __typeMapper.writeObject(__out, PermissionsHasFileSync__typeInfo, PermissionsHasFileSync, PermissionsHasFileSync__is_set);
    __typeMapper.writeObject(__out, PermissionsIPRestrictRequests__typeInfo, PermissionsIPRestrictRequests, PermissionsIPRestrictRequests__is_set);
    __typeMapper.writeObject(__out, PermissionsIdentityConnect__typeInfo, PermissionsIdentityConnect, PermissionsIdentityConnect__is_set);
    __typeMapper.writeObject(__out, PermissionsIdentityEnabled__typeInfo, PermissionsIdentityEnabled, PermissionsIdentityEnabled__is_set);
    __typeMapper.writeObject(__out, PermissionsImportCustomObjects__typeInfo, PermissionsImportCustomObjects, PermissionsImportCustomObjects__is_set);
    __typeMapper.writeObject(__out, PermissionsImportLeads__typeInfo, PermissionsImportLeads, PermissionsImportLeads__is_set);
    __typeMapper.writeObject(__out, PermissionsImportPersonal__typeInfo, PermissionsImportPersonal, PermissionsImportPersonal__is_set);
    __typeMapper.writeObject(__out, PermissionsInboundMigrationToolsUser__typeInfo, PermissionsInboundMigrationToolsUser, PermissionsInboundMigrationToolsUser__is_set);
    __typeMapper.writeObject(__out, PermissionsInstallPackaging__typeInfo, PermissionsInstallPackaging, PermissionsInstallPackaging__is_set);
    __typeMapper.writeObject(__out, PermissionsIsSsoEnabled__typeInfo, PermissionsIsSsoEnabled, PermissionsIsSsoEnabled__is_set);
    __typeMapper.writeObject(__out, PermissionsLightningExperienceUser__typeInfo, PermissionsLightningExperienceUser, PermissionsLightningExperienceUser__is_set);
    __typeMapper.writeObject(__out, PermissionsManageAnalyticSnapshots__typeInfo, PermissionsManageAnalyticSnapshots, PermissionsManageAnalyticSnapshots__is_set);
    __typeMapper.writeObject(__out, PermissionsManageAuthProviders__typeInfo, PermissionsManageAuthProviders, PermissionsManageAuthProviders__is_set);
    __typeMapper.writeObject(__out, PermissionsManageBusinessHourHolidays__typeInfo, PermissionsManageBusinessHourHolidays, PermissionsManageBusinessHourHolidays__is_set);
    __typeMapper.writeObject(__out, PermissionsManageCallCenters__typeInfo, PermissionsManageCallCenters, PermissionsManageCallCenters__is_set);
    __typeMapper.writeObject(__out, PermissionsManageCases__typeInfo, PermissionsManageCases, PermissionsManageCases__is_set);
    __typeMapper.writeObject(__out, PermissionsManageCategories__typeInfo, PermissionsManageCategories, PermissionsManageCategories__is_set);
    __typeMapper.writeObject(__out, PermissionsManageChatterMessages__typeInfo, PermissionsManageChatterMessages, PermissionsManageChatterMessages__is_set);
    __typeMapper.writeObject(__out, PermissionsManageContentPermissions__typeInfo, PermissionsManageContentPermissions, PermissionsManageContentPermissions__is_set);
    __typeMapper.writeObject(__out, PermissionsManageContentProperties__typeInfo, PermissionsManageContentProperties, PermissionsManageContentProperties__is_set);
    __typeMapper.writeObject(__out, PermissionsManageContentTypes__typeInfo, PermissionsManageContentTypes, PermissionsManageContentTypes__is_set);
    __typeMapper.writeObject(__out, PermissionsManageCssUsers__typeInfo, PermissionsManageCssUsers, PermissionsManageCssUsers__is_set);
    __typeMapper.writeObject(__out, PermissionsManageCustomPermissions__typeInfo, PermissionsManageCustomPermissions, PermissionsManageCustomPermissions__is_set);
    __typeMapper.writeObject(__out, PermissionsManageCustomReportTypes__typeInfo, PermissionsManageCustomReportTypes, PermissionsManageCustomReportTypes__is_set);
    __typeMapper.writeObject(__out, PermissionsManageDashboards__typeInfo, PermissionsManageDashboards, PermissionsManageDashboards__is_set);
    __typeMapper.writeObject(__out, PermissionsManageDataCategories__typeInfo, PermissionsManageDataCategories, PermissionsManageDataCategories__is_set);
    __typeMapper.writeObject(__out, PermissionsManageDataIntegrations__typeInfo, PermissionsManageDataIntegrations, PermissionsManageDataIntegrations__is_set);
    __typeMapper.writeObject(__out, PermissionsManageDynamicDashboards__typeInfo, PermissionsManageDynamicDashboards, PermissionsManageDynamicDashboards__is_set);
    __typeMapper.writeObject(__out, PermissionsManageEmailClientConfig__typeInfo, PermissionsManageEmailClientConfig, PermissionsManageEmailClientConfig__is_set);
    __typeMapper.writeObject(__out, PermissionsManageExchangeConfig__typeInfo, PermissionsManageExchangeConfig, PermissionsManageExchangeConfig__is_set);
    __typeMapper.writeObject(__out, PermissionsManageInteraction__typeInfo, PermissionsManageInteraction, PermissionsManageInteraction__is_set);
    __typeMapper.writeObject(__out, PermissionsManageInternalUsers__typeInfo, PermissionsManageInternalUsers, PermissionsManageInternalUsers__is_set);
    __typeMapper.writeObject(__out, PermissionsManageIpAddresses__typeInfo, PermissionsManageIpAddresses, PermissionsManageIpAddresses__is_set);
    __typeMapper.writeObject(__out, PermissionsManageKnowledge__typeInfo, PermissionsManageKnowledge, PermissionsManageKnowledge__is_set);
    __typeMapper.writeObject(__out, PermissionsManageKnowledgeImportExport__typeInfo, PermissionsManageKnowledgeImportExport, PermissionsManageKnowledgeImportExport__is_set);
    __typeMapper.writeObject(__out, PermissionsManageLeads__typeInfo, PermissionsManageLeads, PermissionsManageLeads__is_set);
    __typeMapper.writeObject(__out, PermissionsManageLoginAccessPolicies__typeInfo, PermissionsManageLoginAccessPolicies, PermissionsManageLoginAccessPolicies__is_set);
    __typeMapper.writeObject(__out, PermissionsManageMobile__typeInfo, PermissionsManageMobile, PermissionsManageMobile__is_set);
    __typeMapper.writeObject(__out, PermissionsManagePartners__typeInfo, PermissionsManagePartners, PermissionsManagePartners__is_set);
    __typeMapper.writeObject(__out, PermissionsManagePasswordPolicies__typeInfo, PermissionsManagePasswordPolicies, PermissionsManagePasswordPolicies__is_set);
    __typeMapper.writeObject(__out, PermissionsManageProfilesPermissionsets__typeInfo, PermissionsManageProfilesPermissionsets, PermissionsManageProfilesPermissionsets__is_set);
    __typeMapper.writeObject(__out, PermissionsManagePvtRptsAndDashbds__typeInfo, PermissionsManagePvtRptsAndDashbds, PermissionsManagePvtRptsAndDashbds__is_set);
    __typeMapper.writeObject(__out, PermissionsManageRemoteAccess__typeInfo, PermissionsManageRemoteAccess, PermissionsManageRemoteAccess__is_set);
    __typeMapper.writeObject(__out, PermissionsManageRoles__typeInfo, PermissionsManageRoles, PermissionsManageRoles__is_set);
    __typeMapper.writeObject(__out, PermissionsManageSandboxes__typeInfo, PermissionsManageSandboxes, PermissionsManageSandboxes__is_set);
    __typeMapper.writeObject(__out, PermissionsManageSearchPromotionRules__typeInfo, PermissionsManageSearchPromotionRules, PermissionsManageSearchPromotionRules__is_set);
    __typeMapper.writeObject(__out, PermissionsManageSelfService__typeInfo, PermissionsManageSelfService, PermissionsManageSelfService__is_set);
    __typeMapper.writeObject(__out, PermissionsManageSharing__typeInfo, PermissionsManageSharing, PermissionsManageSharing__is_set);
    __typeMapper.writeObject(__out, PermissionsManageSolutions__typeInfo, PermissionsManageSolutions, PermissionsManageSolutions__is_set);
    __typeMapper.writeObject(__out, PermissionsManageSynonyms__typeInfo, PermissionsManageSynonyms, PermissionsManageSynonyms__is_set);
    __typeMapper.writeObject(__out, PermissionsManageTranslation__typeInfo, PermissionsManageTranslation, PermissionsManageTranslation__is_set);
    __typeMapper.writeObject(__out, PermissionsManageTwoFactor__typeInfo, PermissionsManageTwoFactor, PermissionsManageTwoFactor__is_set);
    __typeMapper.writeObject(__out, PermissionsManageUnlistedGroups__typeInfo, PermissionsManageUnlistedGroups, PermissionsManageUnlistedGroups__is_set);
    __typeMapper.writeObject(__out, PermissionsManageUsers__typeInfo, PermissionsManageUsers, PermissionsManageUsers__is_set);
    __typeMapper.writeObject(__out, PermissionsMassInlineEdit__typeInfo, PermissionsMassInlineEdit, PermissionsMassInlineEdit__is_set);
    __typeMapper.writeObject(__out, PermissionsMergeTopics__typeInfo, PermissionsMergeTopics, PermissionsMergeTopics__is_set);
    __typeMapper.writeObject(__out, PermissionsModerateChatter__typeInfo, PermissionsModerateChatter, PermissionsModerateChatter__is_set);
    __typeMapper.writeObject(__out, PermissionsModifyAllData__typeInfo, PermissionsModifyAllData, PermissionsModifyAllData__is_set);
    __typeMapper.writeObject(__out, PermissionsNewReportBuilder__typeInfo, PermissionsNewReportBuilder, PermissionsNewReportBuilder__is_set);
    __typeMapper.writeObject(__out, PermissionsOutboundMigrationToolsUser__typeInfo, PermissionsOutboundMigrationToolsUser, PermissionsOutboundMigrationToolsUser__is_set);
    __typeMapper.writeObject(__out, PermissionsPasswordNeverExpires__typeInfo, PermissionsPasswordNeverExpires, PermissionsPasswordNeverExpires__is_set);
    __typeMapper.writeObject(__out, PermissionsPublishPackaging__typeInfo, PermissionsPublishPackaging, PermissionsPublishPackaging__is_set);
    __typeMapper.writeObject(__out, PermissionsResetPasswords__typeInfo, PermissionsResetPasswords, PermissionsResetPasswords__is_set);
    __typeMapper.writeObject(__out, PermissionsRunFlow__typeInfo, PermissionsRunFlow, PermissionsRunFlow__is_set);
    __typeMapper.writeObject(__out, PermissionsRunReports__typeInfo, PermissionsRunReports, PermissionsRunReports__is_set);
    __typeMapper.writeObject(__out, PermissionsSalesConsole__typeInfo, PermissionsSalesConsole, PermissionsSalesConsole__is_set);
    __typeMapper.writeObject(__out, PermissionsScheduleJob__typeInfo, PermissionsScheduleJob, PermissionsScheduleJob__is_set);
    __typeMapper.writeObject(__out, PermissionsScheduleReports__typeInfo, PermissionsScheduleReports, PermissionsScheduleReports__is_set);
    __typeMapper.writeObject(__out, PermissionsSelectFilesFromSalesforce__typeInfo, PermissionsSelectFilesFromSalesforce, PermissionsSelectFilesFromSalesforce__is_set);
    __typeMapper.writeObject(__out, PermissionsSendAnnouncementEmails__typeInfo, PermissionsSendAnnouncementEmails, PermissionsSendAnnouncementEmails__is_set);
    __typeMapper.writeObject(__out, PermissionsSendSitRequests__typeInfo, PermissionsSendSitRequests, PermissionsSendSitRequests__is_set);
    __typeMapper.writeObject(__out, PermissionsShareInternalArticles__typeInfo, PermissionsShareInternalArticles, PermissionsShareInternalArticles__is_set);
    __typeMapper.writeObject(__out, PermissionsShowCompanyNameAsUserBadge__typeInfo, PermissionsShowCompanyNameAsUserBadge, PermissionsShowCompanyNameAsUserBadge__is_set);
    __typeMapper.writeObject(__out, PermissionsSocialInsightsLogoAdmin__typeInfo, PermissionsSocialInsightsLogoAdmin, PermissionsSocialInsightsLogoAdmin__is_set);
    __typeMapper.writeObject(__out, PermissionsSolutionImport__typeInfo, PermissionsSolutionImport, PermissionsSolutionImport__is_set);
    __typeMapper.writeObject(__out, PermissionsSubmitMacrosAllowed__typeInfo, PermissionsSubmitMacrosAllowed, PermissionsSubmitMacrosAllowed__is_set);
    __typeMapper.writeObject(__out, PermissionsTagManager__typeInfo, PermissionsTagManager, PermissionsTagManager__is_set);
    __typeMapper.writeObject(__out, PermissionsTransferAnyCase__typeInfo, PermissionsTransferAnyCase, PermissionsTransferAnyCase__is_set);
    __typeMapper.writeObject(__out, PermissionsTransferAnyEntity__typeInfo, PermissionsTransferAnyEntity, PermissionsTransferAnyEntity__is_set);
    __typeMapper.writeObject(__out, PermissionsTransferAnyLead__typeInfo, PermissionsTransferAnyLead, PermissionsTransferAnyLead__is_set);
    __typeMapper.writeObject(__out, PermissionsTwoFactorApi__typeInfo, PermissionsTwoFactorApi, PermissionsTwoFactorApi__is_set);
    __typeMapper.writeObject(__out, PermissionsUseTeamReassignWizards__typeInfo, PermissionsUseTeamReassignWizards, PermissionsUseTeamReassignWizards__is_set);
    __typeMapper.writeObject(__out, PermissionsViewAllData__typeInfo, PermissionsViewAllData, PermissionsViewAllData__is_set);
    __typeMapper.writeObject(__out, PermissionsViewAllUsers__typeInfo, PermissionsViewAllUsers, PermissionsViewAllUsers__is_set);
    __typeMapper.writeObject(__out, PermissionsViewContent__typeInfo, PermissionsViewContent, PermissionsViewContent__is_set);
    __typeMapper.writeObject(__out, PermissionsViewDataAssessment__typeInfo, PermissionsViewDataAssessment, PermissionsViewDataAssessment__is_set);
    __typeMapper.writeObject(__out, PermissionsViewDataCategories__typeInfo, PermissionsViewDataCategories, PermissionsViewDataCategories__is_set);
    __typeMapper.writeObject(__out, PermissionsViewEncryptedData__typeInfo, PermissionsViewEncryptedData, PermissionsViewEncryptedData__is_set);
    __typeMapper.writeObject(__out, PermissionsViewEventLogFiles__typeInfo, PermissionsViewEventLogFiles, PermissionsViewEventLogFiles__is_set);
    __typeMapper.writeObject(__out, PermissionsViewHelpLink__typeInfo, PermissionsViewHelpLink, PermissionsViewHelpLink__is_set);
    __typeMapper.writeObject(__out, PermissionsViewMyTeamsDashboards__typeInfo, PermissionsViewMyTeamsDashboards, PermissionsViewMyTeamsDashboards__is_set);
    __typeMapper.writeObject(__out, PermissionsViewSetup__typeInfo, PermissionsViewSetup, PermissionsViewSetup__is_set);
    __typeMapper.writeObject(__out, Profile__typeInfo, Profile, Profile__is_set);
    __typeMapper.writeString(__out, ProfileId__typeInfo, ProfileId, ProfileId__is_set);
    __typeMapper.writeObject(__out, SetupEntityAccessItems__typeInfo, SetupEntityAccessItems, SetupEntityAccessItems__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
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
    if (__typeMapper.isElement(__in, Assignments__typeInfo)) {
      setAssignments((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Assignments__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, FieldPerms__typeInfo)) {
      setFieldPerms((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, FieldPerms__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsOwnedByProfile__typeInfo)) {
      setIsOwnedByProfile((java.lang.Boolean)__typeMapper.readObject(__in, IsOwnedByProfile__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, Label__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, License__typeInfo)) {
      setLicense((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, License__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LicenseId__typeInfo)) {
      setLicenseId((java.lang.String)__typeMapper.readString(__in, LicenseId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ObjectPerms__typeInfo)) {
      setObjectPerms((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, ObjectPerms__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsActivateContract__typeInfo)) {
      setPermissionsActivateContract((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsActivateContract__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsAllowEmailIC__typeInfo)) {
      setPermissionsAllowEmailIC((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsAllowEmailIC__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsAllowUniversalSearch__typeInfo)) {
      setPermissionsAllowUniversalSearch((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsAllowUniversalSearch__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsAllowViewKnowledge__typeInfo)) {
      setPermissionsAllowViewKnowledge((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsAllowViewKnowledge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsApiEnabled__typeInfo)) {
      setPermissionsApiEnabled((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsApiEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsApiUserOnly__typeInfo)) {
      setPermissionsApiUserOnly((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsApiUserOnly__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsAssignPermissionSets__typeInfo)) {
      setPermissionsAssignPermissionSets((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsAssignPermissionSets__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsAssignTopics__typeInfo)) {
      setPermissionsAssignTopics((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsAssignTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsAuthorApex__typeInfo)) {
      setPermissionsAuthorApex((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsAuthorApex__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsBulkApiHardDelete__typeInfo)) {
      setPermissionsBulkApiHardDelete((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsBulkApiHardDelete__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsBulkMacrosAllowed__typeInfo)) {
      setPermissionsBulkMacrosAllowed((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsBulkMacrosAllowed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCampaignInfluence2__typeInfo)) {
      setPermissionsCampaignInfluence2((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCampaignInfluence2__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCanApproveFeedPost__typeInfo)) {
      setPermissionsCanApproveFeedPost((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCanApproveFeedPost__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCanInsertFeedSystemFields__typeInfo)) {
      setPermissionsCanInsertFeedSystemFields((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCanInsertFeedSystemFields__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCanUseNewDashboardBuilder__typeInfo)) {
      setPermissionsCanUseNewDashboardBuilder((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCanUseNewDashboardBuilder__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterComposeUiCodesnippet__typeInfo)) {
      setPermissionsChatterComposeUiCodesnippet((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterComposeUiCodesnippet__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterEditOwnPost__typeInfo)) {
      setPermissionsChatterEditOwnPost((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterEditOwnPost__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterEditOwnRecordPost__typeInfo)) {
      setPermissionsChatterEditOwnRecordPost((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterEditOwnRecordPost__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterFileLink__typeInfo)) {
      setPermissionsChatterFileLink((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterFileLink__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterForSharePoint__typeInfo)) {
      setPermissionsChatterForSharePoint((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterForSharePoint__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterInternalUser__typeInfo)) {
      setPermissionsChatterInternalUser((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterInternalUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterInviteExternalUsers__typeInfo)) {
      setPermissionsChatterInviteExternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterInviteExternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsChatterOwnGroups__typeInfo)) {
      setPermissionsChatterOwnGroups((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsChatterOwnGroups__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsConfigCustomRecs__typeInfo)) {
      setPermissionsConfigCustomRecs((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsConfigCustomRecs__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsConnectOrgToEnvironmentHub__typeInfo)) {
      setPermissionsConnectOrgToEnvironmentHub((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsConnectOrgToEnvironmentHub__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsContentAdministrator__typeInfo)) {
      setPermissionsContentAdministrator((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsContentAdministrator__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsContentHubUser__typeInfo)) {
      setPermissionsContentHubUser((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsContentHubUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsConvertLeads__typeInfo)) {
      setPermissionsConvertLeads((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsConvertLeads__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCreateCustomizeFilters__typeInfo)) {
      setPermissionsCreateCustomizeFilters((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCreateCustomizeFilters__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCreatePackaging__typeInfo)) {
      setPermissionsCreatePackaging((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCreatePackaging__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCreateTopics__typeInfo)) {
      setPermissionsCreateTopics((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCreateTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCreateWorkBadgeDefinition__typeInfo)) {
      setPermissionsCreateWorkBadgeDefinition((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCreateWorkBadgeDefinition__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCreateWorkspaces__typeInfo)) {
      setPermissionsCreateWorkspaces((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCreateWorkspaces__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCustomMobileAppsAccess__typeInfo)) {
      setPermissionsCustomMobileAppsAccess((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCustomMobileAppsAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsCustomizeApplication__typeInfo)) {
      setPermissionsCustomizeApplication((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsCustomizeApplication__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsDataExport__typeInfo)) {
      setPermissionsDataExport((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsDataExport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsDelegatedPortalUserAdmin__typeInfo)) {
      setPermissionsDelegatedPortalUserAdmin((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsDelegatedPortalUserAdmin__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsDelegatedTwoFactor__typeInfo)) {
      setPermissionsDelegatedTwoFactor((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsDelegatedTwoFactor__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsDeleteActivatedContract__typeInfo)) {
      setPermissionsDeleteActivatedContract((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsDeleteActivatedContract__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsDeleteTopics__typeInfo)) {
      setPermissionsDeleteTopics((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsDeleteTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsDistributeFromPersWksp__typeInfo)) {
      setPermissionsDistributeFromPersWksp((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsDistributeFromPersWksp__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditBrandTemplates__typeInfo)) {
      setPermissionsEditBrandTemplates((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditBrandTemplates__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditCaseComments__typeInfo)) {
      setPermissionsEditCaseComments((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditCaseComments__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditEvent__typeInfo)) {
      setPermissionsEditEvent((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditEvent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditHtmlTemplates__typeInfo)) {
      setPermissionsEditHtmlTemplates((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditHtmlTemplates__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditKnowledge__typeInfo)) {
      setPermissionsEditKnowledge((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditKnowledge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditOppLineItemUnitPrice__typeInfo)) {
      setPermissionsEditOppLineItemUnitPrice((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditOppLineItemUnitPrice__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditPublicDocuments__typeInfo)) {
      setPermissionsEditPublicDocuments((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditPublicDocuments__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditPublicTemplates__typeInfo)) {
      setPermissionsEditPublicTemplates((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditPublicTemplates__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditReadonlyFields__typeInfo)) {
      setPermissionsEditReadonlyFields((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditReadonlyFields__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditReports__typeInfo)) {
      setPermissionsEditReports((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditReports__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditTask__typeInfo)) {
      setPermissionsEditTask((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditTask__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEditTopics__typeInfo)) {
      setPermissionsEditTopics((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEditTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEmailAdministration__typeInfo)) {
      setPermissionsEmailAdministration((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEmailAdministration__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEmailMass__typeInfo)) {
      setPermissionsEmailMass((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEmailMass__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEmailSingle__typeInfo)) {
      setPermissionsEmailSingle((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEmailSingle__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEmailTemplateManagement__typeInfo)) {
      setPermissionsEmailTemplateManagement((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEmailTemplateManagement__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsEnableNotifications__typeInfo)) {
      setPermissionsEnableNotifications((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsEnableNotifications__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsExportReport__typeInfo)) {
      setPermissionsExportReport((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsExportReport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsFlowUFLRequired__typeInfo)) {
      setPermissionsFlowUFLRequired((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsFlowUFLRequired__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsForceTwoFactor__typeInfo)) {
      setPermissionsForceTwoFactor((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsForceTwoFactor__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsHasFileSync__typeInfo)) {
      setPermissionsHasFileSync((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsHasFileSync__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsIPRestrictRequests__typeInfo)) {
      setPermissionsIPRestrictRequests((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsIPRestrictRequests__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsIdentityConnect__typeInfo)) {
      setPermissionsIdentityConnect((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsIdentityConnect__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsIdentityEnabled__typeInfo)) {
      setPermissionsIdentityEnabled((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsIdentityEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsImportCustomObjects__typeInfo)) {
      setPermissionsImportCustomObjects((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsImportCustomObjects__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsImportLeads__typeInfo)) {
      setPermissionsImportLeads((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsImportLeads__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsImportPersonal__typeInfo)) {
      setPermissionsImportPersonal((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsImportPersonal__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsInboundMigrationToolsUser__typeInfo)) {
      setPermissionsInboundMigrationToolsUser((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsInboundMigrationToolsUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsInstallPackaging__typeInfo)) {
      setPermissionsInstallPackaging((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsInstallPackaging__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsIsSsoEnabled__typeInfo)) {
      setPermissionsIsSsoEnabled((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsIsSsoEnabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsLightningExperienceUser__typeInfo)) {
      setPermissionsLightningExperienceUser((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsLightningExperienceUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageAnalyticSnapshots__typeInfo)) {
      setPermissionsManageAnalyticSnapshots((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageAnalyticSnapshots__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageAuthProviders__typeInfo)) {
      setPermissionsManageAuthProviders((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageAuthProviders__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageBusinessHourHolidays__typeInfo)) {
      setPermissionsManageBusinessHourHolidays((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageBusinessHourHolidays__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageCallCenters__typeInfo)) {
      setPermissionsManageCallCenters((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageCallCenters__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageCases__typeInfo)) {
      setPermissionsManageCases((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageCases__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageCategories__typeInfo)) {
      setPermissionsManageCategories((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageCategories__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageChatterMessages__typeInfo)) {
      setPermissionsManageChatterMessages((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageChatterMessages__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageContentPermissions__typeInfo)) {
      setPermissionsManageContentPermissions((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageContentPermissions__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageContentProperties__typeInfo)) {
      setPermissionsManageContentProperties((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageContentProperties__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageContentTypes__typeInfo)) {
      setPermissionsManageContentTypes((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageContentTypes__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageCssUsers__typeInfo)) {
      setPermissionsManageCssUsers((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageCssUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageCustomPermissions__typeInfo)) {
      setPermissionsManageCustomPermissions((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageCustomPermissions__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageCustomReportTypes__typeInfo)) {
      setPermissionsManageCustomReportTypes((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageCustomReportTypes__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageDashboards__typeInfo)) {
      setPermissionsManageDashboards((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageDashboards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageDataCategories__typeInfo)) {
      setPermissionsManageDataCategories((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageDataCategories__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageDataIntegrations__typeInfo)) {
      setPermissionsManageDataIntegrations((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageDataIntegrations__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageDynamicDashboards__typeInfo)) {
      setPermissionsManageDynamicDashboards((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageDynamicDashboards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageEmailClientConfig__typeInfo)) {
      setPermissionsManageEmailClientConfig((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageEmailClientConfig__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageExchangeConfig__typeInfo)) {
      setPermissionsManageExchangeConfig((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageExchangeConfig__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageInteraction__typeInfo)) {
      setPermissionsManageInteraction((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageInteraction__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageInternalUsers__typeInfo)) {
      setPermissionsManageInternalUsers((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageInternalUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageIpAddresses__typeInfo)) {
      setPermissionsManageIpAddresses((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageIpAddresses__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageKnowledge__typeInfo)) {
      setPermissionsManageKnowledge((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageKnowledge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageKnowledgeImportExport__typeInfo)) {
      setPermissionsManageKnowledgeImportExport((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageKnowledgeImportExport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageLeads__typeInfo)) {
      setPermissionsManageLeads((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageLeads__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageLoginAccessPolicies__typeInfo)) {
      setPermissionsManageLoginAccessPolicies((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageLoginAccessPolicies__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageMobile__typeInfo)) {
      setPermissionsManageMobile((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageMobile__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManagePartners__typeInfo)) {
      setPermissionsManagePartners((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManagePartners__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManagePasswordPolicies__typeInfo)) {
      setPermissionsManagePasswordPolicies((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManagePasswordPolicies__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageProfilesPermissionsets__typeInfo)) {
      setPermissionsManageProfilesPermissionsets((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageProfilesPermissionsets__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManagePvtRptsAndDashbds__typeInfo)) {
      setPermissionsManagePvtRptsAndDashbds((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManagePvtRptsAndDashbds__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageRemoteAccess__typeInfo)) {
      setPermissionsManageRemoteAccess((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageRemoteAccess__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageRoles__typeInfo)) {
      setPermissionsManageRoles((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageRoles__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageSandboxes__typeInfo)) {
      setPermissionsManageSandboxes((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageSandboxes__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageSearchPromotionRules__typeInfo)) {
      setPermissionsManageSearchPromotionRules((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageSearchPromotionRules__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageSelfService__typeInfo)) {
      setPermissionsManageSelfService((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageSelfService__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageSharing__typeInfo)) {
      setPermissionsManageSharing((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageSharing__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageSolutions__typeInfo)) {
      setPermissionsManageSolutions((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageSolutions__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageSynonyms__typeInfo)) {
      setPermissionsManageSynonyms((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageSynonyms__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageTranslation__typeInfo)) {
      setPermissionsManageTranslation((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageTranslation__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageTwoFactor__typeInfo)) {
      setPermissionsManageTwoFactor((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageTwoFactor__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageUnlistedGroups__typeInfo)) {
      setPermissionsManageUnlistedGroups((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageUnlistedGroups__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsManageUsers__typeInfo)) {
      setPermissionsManageUsers((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsManageUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsMassInlineEdit__typeInfo)) {
      setPermissionsMassInlineEdit((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsMassInlineEdit__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsMergeTopics__typeInfo)) {
      setPermissionsMergeTopics((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsMergeTopics__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsModerateChatter__typeInfo)) {
      setPermissionsModerateChatter((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsModerateChatter__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsModifyAllData__typeInfo)) {
      setPermissionsModifyAllData((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsModifyAllData__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsNewReportBuilder__typeInfo)) {
      setPermissionsNewReportBuilder((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsNewReportBuilder__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsOutboundMigrationToolsUser__typeInfo)) {
      setPermissionsOutboundMigrationToolsUser((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsOutboundMigrationToolsUser__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsPasswordNeverExpires__typeInfo)) {
      setPermissionsPasswordNeverExpires((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsPasswordNeverExpires__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsPublishPackaging__typeInfo)) {
      setPermissionsPublishPackaging((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsPublishPackaging__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsResetPasswords__typeInfo)) {
      setPermissionsResetPasswords((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsResetPasswords__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsRunFlow__typeInfo)) {
      setPermissionsRunFlow((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsRunFlow__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsRunReports__typeInfo)) {
      setPermissionsRunReports((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsRunReports__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsSalesConsole__typeInfo)) {
      setPermissionsSalesConsole((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsSalesConsole__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsScheduleJob__typeInfo)) {
      setPermissionsScheduleJob((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsScheduleJob__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsScheduleReports__typeInfo)) {
      setPermissionsScheduleReports((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsScheduleReports__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsSelectFilesFromSalesforce__typeInfo)) {
      setPermissionsSelectFilesFromSalesforce((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsSelectFilesFromSalesforce__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsSendAnnouncementEmails__typeInfo)) {
      setPermissionsSendAnnouncementEmails((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsSendAnnouncementEmails__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsSendSitRequests__typeInfo)) {
      setPermissionsSendSitRequests((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsSendSitRequests__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsShareInternalArticles__typeInfo)) {
      setPermissionsShareInternalArticles((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsShareInternalArticles__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsShowCompanyNameAsUserBadge__typeInfo)) {
      setPermissionsShowCompanyNameAsUserBadge((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsShowCompanyNameAsUserBadge__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsSocialInsightsLogoAdmin__typeInfo)) {
      setPermissionsSocialInsightsLogoAdmin((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsSocialInsightsLogoAdmin__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsSolutionImport__typeInfo)) {
      setPermissionsSolutionImport((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsSolutionImport__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsSubmitMacrosAllowed__typeInfo)) {
      setPermissionsSubmitMacrosAllowed((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsSubmitMacrosAllowed__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsTagManager__typeInfo)) {
      setPermissionsTagManager((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsTagManager__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsTransferAnyCase__typeInfo)) {
      setPermissionsTransferAnyCase((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsTransferAnyCase__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsTransferAnyEntity__typeInfo)) {
      setPermissionsTransferAnyEntity((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsTransferAnyEntity__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsTransferAnyLead__typeInfo)) {
      setPermissionsTransferAnyLead((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsTransferAnyLead__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsTwoFactorApi__typeInfo)) {
      setPermissionsTwoFactorApi((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsTwoFactorApi__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsUseTeamReassignWizards__typeInfo)) {
      setPermissionsUseTeamReassignWizards((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsUseTeamReassignWizards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewAllData__typeInfo)) {
      setPermissionsViewAllData((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewAllData__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewAllUsers__typeInfo)) {
      setPermissionsViewAllUsers((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewAllUsers__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewContent__typeInfo)) {
      setPermissionsViewContent((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewContent__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewDataAssessment__typeInfo)) {
      setPermissionsViewDataAssessment((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewDataAssessment__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewDataCategories__typeInfo)) {
      setPermissionsViewDataCategories((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewDataCategories__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewEncryptedData__typeInfo)) {
      setPermissionsViewEncryptedData((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewEncryptedData__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewEventLogFiles__typeInfo)) {
      setPermissionsViewEventLogFiles((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewEventLogFiles__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewHelpLink__typeInfo)) {
      setPermissionsViewHelpLink((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewHelpLink__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewMyTeamsDashboards__typeInfo)) {
      setPermissionsViewMyTeamsDashboards((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewMyTeamsDashboards__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PermissionsViewSetup__typeInfo)) {
      setPermissionsViewSetup((java.lang.Boolean)__typeMapper.readObject(__in, PermissionsViewSetup__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Profile__typeInfo)) {
      setProfile((com.sforce.soap.enterprise.sobject.Profile)__typeMapper.readObject(__in, Profile__typeInfo, com.sforce.soap.enterprise.sobject.Profile.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProfileId__typeInfo)) {
      setProfileId((java.lang.String)__typeMapper.readString(__in, ProfileId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupEntityAccessItems__typeInfo)) {
      setSetupEntityAccessItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, SetupEntityAccessItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PermissionSet ");
    sb.append(super.toString());
    sb.append(" Assignments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Assignments)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" FieldPerms=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FieldPerms)+"'\n");
    sb.append(" IsOwnedByProfile=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsOwnedByProfile)+"'\n");
    sb.append(" Label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Label)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" License=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(License)+"'\n");
    sb.append(" LicenseId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LicenseId)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" ObjectPerms=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ObjectPerms)+"'\n");
    sb.append(" PermissionsActivateContract=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsActivateContract)+"'\n");
    sb.append(" PermissionsAllowEmailIC=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsAllowEmailIC)+"'\n");
    sb.append(" PermissionsAllowUniversalSearch=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsAllowUniversalSearch)+"'\n");
    sb.append(" PermissionsAllowViewKnowledge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsAllowViewKnowledge)+"'\n");
    sb.append(" PermissionsApiEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsApiEnabled)+"'\n");
    sb.append(" PermissionsApiUserOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsApiUserOnly)+"'\n");
    sb.append(" PermissionsAssignPermissionSets=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsAssignPermissionSets)+"'\n");
    sb.append(" PermissionsAssignTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsAssignTopics)+"'\n");
    sb.append(" PermissionsAuthorApex=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsAuthorApex)+"'\n");
    sb.append(" PermissionsBulkApiHardDelete=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsBulkApiHardDelete)+"'\n");
    sb.append(" PermissionsBulkMacrosAllowed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsBulkMacrosAllowed)+"'\n");
    sb.append(" PermissionsCampaignInfluence2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCampaignInfluence2)+"'\n");
    sb.append(" PermissionsCanApproveFeedPost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCanApproveFeedPost)+"'\n");
    sb.append(" PermissionsCanInsertFeedSystemFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCanInsertFeedSystemFields)+"'\n");
    sb.append(" PermissionsCanUseNewDashboardBuilder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCanUseNewDashboardBuilder)+"'\n");
    sb.append(" PermissionsChatterComposeUiCodesnippet=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterComposeUiCodesnippet)+"'\n");
    sb.append(" PermissionsChatterEditOwnPost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterEditOwnPost)+"'\n");
    sb.append(" PermissionsChatterEditOwnRecordPost=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterEditOwnRecordPost)+"'\n");
    sb.append(" PermissionsChatterFileLink=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterFileLink)+"'\n");
    sb.append(" PermissionsChatterForSharePoint=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterForSharePoint)+"'\n");
    sb.append(" PermissionsChatterInternalUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterInternalUser)+"'\n");
    sb.append(" PermissionsChatterInviteExternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterInviteExternalUsers)+"'\n");
    sb.append(" PermissionsChatterOwnGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsChatterOwnGroups)+"'\n");
    sb.append(" PermissionsConfigCustomRecs=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsConfigCustomRecs)+"'\n");
    sb.append(" PermissionsConnectOrgToEnvironmentHub=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsConnectOrgToEnvironmentHub)+"'\n");
    sb.append(" PermissionsContentAdministrator=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsContentAdministrator)+"'\n");
    sb.append(" PermissionsContentHubUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsContentHubUser)+"'\n");
    sb.append(" PermissionsConvertLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsConvertLeads)+"'\n");
    sb.append(" PermissionsCreateCustomizeFilters=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCreateCustomizeFilters)+"'\n");
    sb.append(" PermissionsCreatePackaging=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCreatePackaging)+"'\n");
    sb.append(" PermissionsCreateTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCreateTopics)+"'\n");
    sb.append(" PermissionsCreateWorkBadgeDefinition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCreateWorkBadgeDefinition)+"'\n");
    sb.append(" PermissionsCreateWorkspaces=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCreateWorkspaces)+"'\n");
    sb.append(" PermissionsCustomMobileAppsAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCustomMobileAppsAccess)+"'\n");
    sb.append(" PermissionsCustomizeApplication=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsCustomizeApplication)+"'\n");
    sb.append(" PermissionsDataExport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsDataExport)+"'\n");
    sb.append(" PermissionsDelegatedPortalUserAdmin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsDelegatedPortalUserAdmin)+"'\n");
    sb.append(" PermissionsDelegatedTwoFactor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsDelegatedTwoFactor)+"'\n");
    sb.append(" PermissionsDeleteActivatedContract=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsDeleteActivatedContract)+"'\n");
    sb.append(" PermissionsDeleteTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsDeleteTopics)+"'\n");
    sb.append(" PermissionsDistributeFromPersWksp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsDistributeFromPersWksp)+"'\n");
    sb.append(" PermissionsEditBrandTemplates=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditBrandTemplates)+"'\n");
    sb.append(" PermissionsEditCaseComments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditCaseComments)+"'\n");
    sb.append(" PermissionsEditEvent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditEvent)+"'\n");
    sb.append(" PermissionsEditHtmlTemplates=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditHtmlTemplates)+"'\n");
    sb.append(" PermissionsEditKnowledge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditKnowledge)+"'\n");
    sb.append(" PermissionsEditOppLineItemUnitPrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditOppLineItemUnitPrice)+"'\n");
    sb.append(" PermissionsEditPublicDocuments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditPublicDocuments)+"'\n");
    sb.append(" PermissionsEditPublicTemplates=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditPublicTemplates)+"'\n");
    sb.append(" PermissionsEditReadonlyFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditReadonlyFields)+"'\n");
    sb.append(" PermissionsEditReports=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditReports)+"'\n");
    sb.append(" PermissionsEditTask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditTask)+"'\n");
    sb.append(" PermissionsEditTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEditTopics)+"'\n");
    sb.append(" PermissionsEmailAdministration=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEmailAdministration)+"'\n");
    sb.append(" PermissionsEmailMass=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEmailMass)+"'\n");
    sb.append(" PermissionsEmailSingle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEmailSingle)+"'\n");
    sb.append(" PermissionsEmailTemplateManagement=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEmailTemplateManagement)+"'\n");
    sb.append(" PermissionsEnableNotifications=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsEnableNotifications)+"'\n");
    sb.append(" PermissionsExportReport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsExportReport)+"'\n");
    sb.append(" PermissionsFlowUFLRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsFlowUFLRequired)+"'\n");
    sb.append(" PermissionsForceTwoFactor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsForceTwoFactor)+"'\n");
    sb.append(" PermissionsHasFileSync=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsHasFileSync)+"'\n");
    sb.append(" PermissionsIPRestrictRequests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsIPRestrictRequests)+"'\n");
    sb.append(" PermissionsIdentityConnect=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsIdentityConnect)+"'\n");
    sb.append(" PermissionsIdentityEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsIdentityEnabled)+"'\n");
    sb.append(" PermissionsImportCustomObjects=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsImportCustomObjects)+"'\n");
    sb.append(" PermissionsImportLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsImportLeads)+"'\n");
    sb.append(" PermissionsImportPersonal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsImportPersonal)+"'\n");
    sb.append(" PermissionsInboundMigrationToolsUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsInboundMigrationToolsUser)+"'\n");
    sb.append(" PermissionsInstallPackaging=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsInstallPackaging)+"'\n");
    sb.append(" PermissionsIsSsoEnabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsIsSsoEnabled)+"'\n");
    sb.append(" PermissionsLightningExperienceUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsLightningExperienceUser)+"'\n");
    sb.append(" PermissionsManageAnalyticSnapshots=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageAnalyticSnapshots)+"'\n");
    sb.append(" PermissionsManageAuthProviders=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageAuthProviders)+"'\n");
    sb.append(" PermissionsManageBusinessHourHolidays=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageBusinessHourHolidays)+"'\n");
    sb.append(" PermissionsManageCallCenters=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageCallCenters)+"'\n");
    sb.append(" PermissionsManageCases=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageCases)+"'\n");
    sb.append(" PermissionsManageCategories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageCategories)+"'\n");
    sb.append(" PermissionsManageChatterMessages=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageChatterMessages)+"'\n");
    sb.append(" PermissionsManageContentPermissions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageContentPermissions)+"'\n");
    sb.append(" PermissionsManageContentProperties=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageContentProperties)+"'\n");
    sb.append(" PermissionsManageContentTypes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageContentTypes)+"'\n");
    sb.append(" PermissionsManageCssUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageCssUsers)+"'\n");
    sb.append(" PermissionsManageCustomPermissions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageCustomPermissions)+"'\n");
    sb.append(" PermissionsManageCustomReportTypes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageCustomReportTypes)+"'\n");
    sb.append(" PermissionsManageDashboards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageDashboards)+"'\n");
    sb.append(" PermissionsManageDataCategories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageDataCategories)+"'\n");
    sb.append(" PermissionsManageDataIntegrations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageDataIntegrations)+"'\n");
    sb.append(" PermissionsManageDynamicDashboards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageDynamicDashboards)+"'\n");
    sb.append(" PermissionsManageEmailClientConfig=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageEmailClientConfig)+"'\n");
    sb.append(" PermissionsManageExchangeConfig=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageExchangeConfig)+"'\n");
    sb.append(" PermissionsManageInteraction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageInteraction)+"'\n");
    sb.append(" PermissionsManageInternalUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageInternalUsers)+"'\n");
    sb.append(" PermissionsManageIpAddresses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageIpAddresses)+"'\n");
    sb.append(" PermissionsManageKnowledge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageKnowledge)+"'\n");
    sb.append(" PermissionsManageKnowledgeImportExport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageKnowledgeImportExport)+"'\n");
    sb.append(" PermissionsManageLeads=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageLeads)+"'\n");
    sb.append(" PermissionsManageLoginAccessPolicies=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageLoginAccessPolicies)+"'\n");
    sb.append(" PermissionsManageMobile=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageMobile)+"'\n");
    sb.append(" PermissionsManagePartners=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManagePartners)+"'\n");
    sb.append(" PermissionsManagePasswordPolicies=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManagePasswordPolicies)+"'\n");
    sb.append(" PermissionsManageProfilesPermissionsets=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageProfilesPermissionsets)+"'\n");
    sb.append(" PermissionsManagePvtRptsAndDashbds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManagePvtRptsAndDashbds)+"'\n");
    sb.append(" PermissionsManageRemoteAccess=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageRemoteAccess)+"'\n");
    sb.append(" PermissionsManageRoles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageRoles)+"'\n");
    sb.append(" PermissionsManageSandboxes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageSandboxes)+"'\n");
    sb.append(" PermissionsManageSearchPromotionRules=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageSearchPromotionRules)+"'\n");
    sb.append(" PermissionsManageSelfService=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageSelfService)+"'\n");
    sb.append(" PermissionsManageSharing=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageSharing)+"'\n");
    sb.append(" PermissionsManageSolutions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageSolutions)+"'\n");
    sb.append(" PermissionsManageSynonyms=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageSynonyms)+"'\n");
    sb.append(" PermissionsManageTranslation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageTranslation)+"'\n");
    sb.append(" PermissionsManageTwoFactor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageTwoFactor)+"'\n");
    sb.append(" PermissionsManageUnlistedGroups=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageUnlistedGroups)+"'\n");
    sb.append(" PermissionsManageUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsManageUsers)+"'\n");
    sb.append(" PermissionsMassInlineEdit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsMassInlineEdit)+"'\n");
    sb.append(" PermissionsMergeTopics=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsMergeTopics)+"'\n");
    sb.append(" PermissionsModerateChatter=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsModerateChatter)+"'\n");
    sb.append(" PermissionsModifyAllData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsModifyAllData)+"'\n");
    sb.append(" PermissionsNewReportBuilder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsNewReportBuilder)+"'\n");
    sb.append(" PermissionsOutboundMigrationToolsUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsOutboundMigrationToolsUser)+"'\n");
    sb.append(" PermissionsPasswordNeverExpires=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsPasswordNeverExpires)+"'\n");
    sb.append(" PermissionsPublishPackaging=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsPublishPackaging)+"'\n");
    sb.append(" PermissionsResetPasswords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsResetPasswords)+"'\n");
    sb.append(" PermissionsRunFlow=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsRunFlow)+"'\n");
    sb.append(" PermissionsRunReports=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsRunReports)+"'\n");
    sb.append(" PermissionsSalesConsole=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsSalesConsole)+"'\n");
    sb.append(" PermissionsScheduleJob=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsScheduleJob)+"'\n");
    sb.append(" PermissionsScheduleReports=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsScheduleReports)+"'\n");
    sb.append(" PermissionsSelectFilesFromSalesforce=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsSelectFilesFromSalesforce)+"'\n");
    sb.append(" PermissionsSendAnnouncementEmails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsSendAnnouncementEmails)+"'\n");
    sb.append(" PermissionsSendSitRequests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsSendSitRequests)+"'\n");
    sb.append(" PermissionsShareInternalArticles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsShareInternalArticles)+"'\n");
    sb.append(" PermissionsShowCompanyNameAsUserBadge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsShowCompanyNameAsUserBadge)+"'\n");
    sb.append(" PermissionsSocialInsightsLogoAdmin=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsSocialInsightsLogoAdmin)+"'\n");
    sb.append(" PermissionsSolutionImport=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsSolutionImport)+"'\n");
    sb.append(" PermissionsSubmitMacrosAllowed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsSubmitMacrosAllowed)+"'\n");
    sb.append(" PermissionsTagManager=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsTagManager)+"'\n");
    sb.append(" PermissionsTransferAnyCase=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsTransferAnyCase)+"'\n");
    sb.append(" PermissionsTransferAnyEntity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsTransferAnyEntity)+"'\n");
    sb.append(" PermissionsTransferAnyLead=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsTransferAnyLead)+"'\n");
    sb.append(" PermissionsTwoFactorApi=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsTwoFactorApi)+"'\n");
    sb.append(" PermissionsUseTeamReassignWizards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsUseTeamReassignWizards)+"'\n");
    sb.append(" PermissionsViewAllData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewAllData)+"'\n");
    sb.append(" PermissionsViewAllUsers=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewAllUsers)+"'\n");
    sb.append(" PermissionsViewContent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewContent)+"'\n");
    sb.append(" PermissionsViewDataAssessment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewDataAssessment)+"'\n");
    sb.append(" PermissionsViewDataCategories=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewDataCategories)+"'\n");
    sb.append(" PermissionsViewEncryptedData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewEncryptedData)+"'\n");
    sb.append(" PermissionsViewEventLogFiles=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewEventLogFiles)+"'\n");
    sb.append(" PermissionsViewHelpLink=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewHelpLink)+"'\n");
    sb.append(" PermissionsViewMyTeamsDashboards=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewMyTeamsDashboards)+"'\n");
    sb.append(" PermissionsViewSetup=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PermissionsViewSetup)+"'\n");
    sb.append(" Profile=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Profile)+"'\n");
    sb.append(" ProfileId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProfileId)+"'\n");
    sb.append(" SetupEntityAccessItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupEntityAccessItems)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}