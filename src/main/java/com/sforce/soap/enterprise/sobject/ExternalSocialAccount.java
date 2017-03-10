package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ExternalSocialAccount extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ExternalSocialAccount() {
  }
    
  
  /**
   * element  : AuthorizedBy of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AuthorizedBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AuthorizedBy","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AuthorizedBy__is_set = false;

  private java.lang.String AuthorizedBy;

  public java.lang.String getAuthorizedBy() {
    return AuthorizedBy;
  }

  

  public void setAuthorizedBy(java.lang.String AuthorizedBy) {
    this.AuthorizedBy = AuthorizedBy;
    AuthorizedBy__is_set = true;
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
   * element  : DataSourceId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DataSourceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DataSourceId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DataSourceId__is_set = false;

  private java.lang.String DataSourceId;

  public java.lang.String getDataSourceId() {
    return DataSourceId;
  }

  

  public void setDataSourceId(java.lang.String DataSourceId) {
    this.DataSourceId = DataSourceId;
    DataSourceId__is_set = true;
  }
  
  /**
   * element  : DefaultResponseAccount of type {urn:sobject.enterprise.soap.sforce.com}ExternalSocialAccount
   * java type: com.sforce.soap.enterprise.sobject.ExternalSocialAccount
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultResponseAccount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultResponseAccount","urn:sobject.enterprise.soap.sforce.com","ExternalSocialAccount",0,1,true);

  private boolean DefaultResponseAccount__is_set = false;

  private com.sforce.soap.enterprise.sobject.ExternalSocialAccount DefaultResponseAccount;

  public com.sforce.soap.enterprise.sobject.ExternalSocialAccount getDefaultResponseAccount() {
    return DefaultResponseAccount;
  }

  

  public void setDefaultResponseAccount(com.sforce.soap.enterprise.sobject.ExternalSocialAccount DefaultResponseAccount) {
    this.DefaultResponseAccount = DefaultResponseAccount;
    DefaultResponseAccount__is_set = true;
  }
  
  /**
   * element  : DefaultResponseAccountId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultResponseAccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultResponseAccountId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean DefaultResponseAccountId__is_set = false;

  private java.lang.String DefaultResponseAccountId;

  public java.lang.String getDefaultResponseAccountId() {
    return DefaultResponseAccountId;
  }

  

  public void setDefaultResponseAccountId(java.lang.String DefaultResponseAccountId) {
    this.DefaultResponseAccountId = DefaultResponseAccountId;
    DefaultResponseAccountId__is_set = true;
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
   * element  : ExternalAccountId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalAccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalAccountId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalAccountId__is_set = false;

  private java.lang.String ExternalAccountId;

  public java.lang.String getExternalAccountId() {
    return ExternalAccountId;
  }

  

  public void setExternalAccountId(java.lang.String ExternalAccountId) {
    this.ExternalAccountId = ExternalAccountId;
    ExternalAccountId__is_set = true;
  }
  
  /**
   * element  : ExternalPictureURL of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExternalPictureURL__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExternalPictureURL","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ExternalPictureURL__is_set = false;

  private java.lang.String ExternalPictureURL;

  public java.lang.String getExternalPictureURL() {
    return ExternalPictureURL;
  }

  

  public void setExternalPictureURL(java.lang.String ExternalPictureURL) {
    this.ExternalPictureURL = ExternalPictureURL;
    ExternalPictureURL__is_set = true;
  }
  
  /**
   * element  : IsActive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsActive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsActive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsActive__is_set = false;

  private java.lang.Boolean IsActive;

  public java.lang.Boolean getIsActive() {
    return IsActive;
  }

  

  public void setIsActive(java.lang.Boolean IsActive) {
    this.IsActive = IsActive;
    IsActive__is_set = true;
  }
  
  /**
   * element  : IsAuthenticated of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAuthenticated__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAuthenticated","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAuthenticated__is_set = false;

  private java.lang.Boolean IsAuthenticated;

  public java.lang.Boolean getIsAuthenticated() {
    return IsAuthenticated;
  }

  

  public void setIsAuthenticated(java.lang.Boolean IsAuthenticated) {
    this.IsAuthenticated = IsAuthenticated;
    IsAuthenticated__is_set = true;
  }
  
  /**
   * element  : IsDataSourceActive of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDataSourceActive__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDataSourceActive","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDataSourceActive__is_set = false;

  private java.lang.Boolean IsDataSourceActive;

  public java.lang.Boolean getIsDataSourceActive() {
    return IsDataSourceActive;
  }

  

  public void setIsDataSourceActive(java.lang.Boolean IsDataSourceActive) {
    this.IsDataSourceActive = IsDataSourceActive;
    IsDataSourceActive__is_set = true;
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
   * element  : ProfileUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProfileUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProfileUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ProfileUrl__is_set = false;

  private java.lang.String ProfileUrl;

  public java.lang.String getProfileUrl() {
    return ProfileUrl;
  }

  

  public void setProfileUrl(java.lang.String ProfileUrl) {
    this.ProfileUrl = ProfileUrl;
    ProfileUrl__is_set = true;
  }
  
  /**
   * element  : Provider of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Provider__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Provider","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Provider__is_set = false;

  private java.lang.String Provider;

  public java.lang.String getProvider() {
    return Provider;
  }

  

  public void setProvider(java.lang.String Provider) {
    this.Provider = Provider;
    Provider__is_set = true;
  }
  
  /**
   * element  : ProviderUserId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProviderUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProviderUserId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ProviderUserId__is_set = false;

  private java.lang.String ProviderUserId;

  public java.lang.String getProviderUserId() {
    return ProviderUserId;
  }

  

  public void setProviderUserId(java.lang.String ProviderUserId) {
    this.ProviderUserId = ProviderUserId;
    ProviderUserId__is_set = true;
  }
  
  /**
   * element  : RuleId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RuleId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RuleId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RuleId__is_set = false;

  private java.lang.String RuleId;

  public java.lang.String getRuleId() {
    return RuleId;
  }

  

  public void setRuleId(java.lang.String RuleId) {
    this.RuleId = RuleId;
    RuleId__is_set = true;
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
   * element  : SocialPropertyId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SocialPropertyId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SocialPropertyId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SocialPropertyId__is_set = false;

  private java.lang.String SocialPropertyId;

  public java.lang.String getSocialPropertyId() {
    return SocialPropertyId;
  }

  

  public void setSocialPropertyId(java.lang.String SocialPropertyId) {
    this.SocialPropertyId = SocialPropertyId;
    SocialPropertyId__is_set = true;
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
   * element  : TopicId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TopicId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TopicId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TopicId__is_set = false;

  private java.lang.String TopicId;

  public java.lang.String getTopicId() {
    return TopicId;
  }

  

  public void setTopicId(java.lang.String TopicId) {
    this.TopicId = TopicId;
    TopicId__is_set = true;
  }
  
  /**
   * element  : UniqueName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UniqueName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UniqueName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UniqueName__is_set = false;

  private java.lang.String UniqueName;

  public java.lang.String getUniqueName() {
    return UniqueName;
  }

  

  public void setUniqueName(java.lang.String UniqueName) {
    this.UniqueName = UniqueName;
    UniqueName__is_set = true;
  }
  
  /**
   * element  : Username of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Username__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Username","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Username__is_set = false;

  private java.lang.String Username;

  public java.lang.String getUsername() {
    return Username;
  }

  

  public void setUsername(java.lang.String Username) {
    this.Username = Username;
    Username__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ExternalSocialAccount");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AuthorizedBy__typeInfo, AuthorizedBy, AuthorizedBy__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, DataSourceId__typeInfo, DataSourceId, DataSourceId__is_set);
    __typeMapper.writeObject(__out, DefaultResponseAccount__typeInfo, DefaultResponseAccount, DefaultResponseAccount__is_set);
    __typeMapper.writeString(__out, DefaultResponseAccountId__typeInfo, DefaultResponseAccountId, DefaultResponseAccountId__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeString(__out, ExternalAccountId__typeInfo, ExternalAccountId, ExternalAccountId__is_set);
    __typeMapper.writeString(__out, ExternalPictureURL__typeInfo, ExternalPictureURL, ExternalPictureURL__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, IsAuthenticated__typeInfo, IsAuthenticated, IsAuthenticated__is_set);
    __typeMapper.writeObject(__out, IsDataSourceActive__typeInfo, IsDataSourceActive, IsDataSourceActive__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Language__typeInfo, Language, Language__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeString(__out, ProfileUrl__typeInfo, ProfileUrl, ProfileUrl__is_set);
    __typeMapper.writeString(__out, Provider__typeInfo, Provider, Provider__is_set);
    __typeMapper.writeString(__out, ProviderUserId__typeInfo, ProviderUserId, ProviderUserId__is_set);
    __typeMapper.writeString(__out, RuleId__typeInfo, RuleId, RuleId__is_set);
    __typeMapper.writeObject(__out, SetupEntityAccessItems__typeInfo, SetupEntityAccessItems, SetupEntityAccessItems__is_set);
    __typeMapper.writeString(__out, SocialPropertyId__typeInfo, SocialPropertyId, SocialPropertyId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, TopicId__typeInfo, TopicId, TopicId__is_set);
    __typeMapper.writeString(__out, UniqueName__typeInfo, UniqueName, UniqueName__is_set);
    __typeMapper.writeString(__out, Username__typeInfo, Username, Username__is_set);
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
    if (__typeMapper.isElement(__in, AuthorizedBy__typeInfo)) {
      setAuthorizedBy((java.lang.String)__typeMapper.readString(__in, AuthorizedBy__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, DataSourceId__typeInfo)) {
      setDataSourceId((java.lang.String)__typeMapper.readString(__in, DataSourceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultResponseAccount__typeInfo)) {
      setDefaultResponseAccount((com.sforce.soap.enterprise.sobject.ExternalSocialAccount)__typeMapper.readObject(__in, DefaultResponseAccount__typeInfo, com.sforce.soap.enterprise.sobject.ExternalSocialAccount.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultResponseAccountId__typeInfo)) {
      setDefaultResponseAccountId((java.lang.String)__typeMapper.readString(__in, DefaultResponseAccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalAccountId__typeInfo)) {
      setExternalAccountId((java.lang.String)__typeMapper.readString(__in, ExternalAccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExternalPictureURL__typeInfo)) {
      setExternalPictureURL((java.lang.String)__typeMapper.readString(__in, ExternalPictureURL__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAuthenticated__typeInfo)) {
      setIsAuthenticated((java.lang.Boolean)__typeMapper.readObject(__in, IsAuthenticated__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDataSourceActive__typeInfo)) {
      setIsDataSourceActive((java.lang.Boolean)__typeMapper.readObject(__in, IsDataSourceActive__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, ProfileUrl__typeInfo)) {
      setProfileUrl((java.lang.String)__typeMapper.readString(__in, ProfileUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Provider__typeInfo)) {
      setProvider((java.lang.String)__typeMapper.readString(__in, Provider__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProviderUserId__typeInfo)) {
      setProviderUserId((java.lang.String)__typeMapper.readString(__in, ProviderUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RuleId__typeInfo)) {
      setRuleId((java.lang.String)__typeMapper.readString(__in, RuleId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupEntityAccessItems__typeInfo)) {
      setSetupEntityAccessItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, SetupEntityAccessItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SocialPropertyId__typeInfo)) {
      setSocialPropertyId((java.lang.String)__typeMapper.readString(__in, SocialPropertyId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TopicId__typeInfo)) {
      setTopicId((java.lang.String)__typeMapper.readString(__in, TopicId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UniqueName__typeInfo)) {
      setUniqueName((java.lang.String)__typeMapper.readString(__in, UniqueName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Username__typeInfo)) {
      setUsername((java.lang.String)__typeMapper.readString(__in, Username__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ExternalSocialAccount ");
    sb.append(super.toString());
    sb.append(" AuthorizedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AuthorizedBy)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DataSourceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DataSourceId)+"'\n");
    sb.append(" DefaultResponseAccount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultResponseAccount)+"'\n");
    sb.append(" DefaultResponseAccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultResponseAccountId)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" ExternalAccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalAccountId)+"'\n");
    sb.append(" ExternalPictureURL=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExternalPictureURL)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" IsAuthenticated=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAuthenticated)+"'\n");
    sb.append(" IsDataSourceActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDataSourceActive)+"'\n");
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
    sb.append(" ProfileUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProfileUrl)+"'\n");
    sb.append(" Provider=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Provider)+"'\n");
    sb.append(" ProviderUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProviderUserId)+"'\n");
    sb.append(" RuleId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RuleId)+"'\n");
    sb.append(" SetupEntityAccessItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupEntityAccessItems)+"'\n");
    sb.append(" SocialPropertyId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SocialPropertyId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" TopicId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TopicId)+"'\n");
    sb.append(" UniqueName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UniqueName)+"'\n");
    sb.append(" Username=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Username)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}