package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class AuthProvider extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public AuthProvider() {
  }
    
  
  /**
   * element  : AuthorizeUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AuthorizeUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AuthorizeUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AuthorizeUrl__is_set = false;

  private java.lang.String AuthorizeUrl;

  public java.lang.String getAuthorizeUrl() {
    return AuthorizeUrl;
  }

  

  public void setAuthorizeUrl(java.lang.String AuthorizeUrl) {
    this.AuthorizeUrl = AuthorizeUrl;
    AuthorizeUrl__is_set = true;
  }
  
  /**
   * element  : ConsumerKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConsumerKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConsumerKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ConsumerKey__is_set = false;

  private java.lang.String ConsumerKey;

  public java.lang.String getConsumerKey() {
    return ConsumerKey;
  }

  

  public void setConsumerKey(java.lang.String ConsumerKey) {
    this.ConsumerKey = ConsumerKey;
    ConsumerKey__is_set = true;
  }
  
  /**
   * element  : ConsumerSecret of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConsumerSecret__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConsumerSecret","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ConsumerSecret__is_set = false;

  private java.lang.String ConsumerSecret;

  public java.lang.String getConsumerSecret() {
    return ConsumerSecret;
  }

  

  public void setConsumerSecret(java.lang.String ConsumerSecret) {
    this.ConsumerSecret = ConsumerSecret;
    ConsumerSecret__is_set = true;
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
   * element  : CustomMetadataTypeRecord of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomMetadataTypeRecord__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomMetadataTypeRecord","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CustomMetadataTypeRecord__is_set = false;

  private java.lang.String CustomMetadataTypeRecord;

  public java.lang.String getCustomMetadataTypeRecord() {
    return CustomMetadataTypeRecord;
  }

  

  public void setCustomMetadataTypeRecord(java.lang.String CustomMetadataTypeRecord) {
    this.CustomMetadataTypeRecord = CustomMetadataTypeRecord;
    CustomMetadataTypeRecord__is_set = true;
  }
  
  /**
   * element  : DefaultScopes of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DefaultScopes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DefaultScopes","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DefaultScopes__is_set = false;

  private java.lang.String DefaultScopes;

  public java.lang.String getDefaultScopes() {
    return DefaultScopes;
  }

  

  public void setDefaultScopes(java.lang.String DefaultScopes) {
    this.DefaultScopes = DefaultScopes;
    DefaultScopes__is_set = true;
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
   * element  : ErrorUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ErrorUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ErrorUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ErrorUrl__is_set = false;

  private java.lang.String ErrorUrl;

  public java.lang.String getErrorUrl() {
    return ErrorUrl;
  }

  

  public void setErrorUrl(java.lang.String ErrorUrl) {
    this.ErrorUrl = ErrorUrl;
    ErrorUrl__is_set = true;
  }
  
  /**
   * element  : ExecutionUserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ExecutionUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ExecutionUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ExecutionUserId__is_set = false;

  private java.lang.String ExecutionUserId;

  public java.lang.String getExecutionUserId() {
    return ExecutionUserId;
  }

  

  public void setExecutionUserId(java.lang.String ExecutionUserId) {
    this.ExecutionUserId = ExecutionUserId;
    ExecutionUserId__is_set = true;
  }
  
  /**
   * element  : FriendlyName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FriendlyName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FriendlyName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FriendlyName__is_set = false;

  private java.lang.String FriendlyName;

  public java.lang.String getFriendlyName() {
    return FriendlyName;
  }

  

  public void setFriendlyName(java.lang.String FriendlyName) {
    this.FriendlyName = FriendlyName;
    FriendlyName__is_set = true;
  }
  
  /**
   * element  : IconUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo IconUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IconUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean IconUrl__is_set = false;

  private java.lang.String IconUrl;

  public java.lang.String getIconUrl() {
    return IconUrl;
  }

  

  public void setIconUrl(java.lang.String IconUrl) {
    this.IconUrl = IconUrl;
    IconUrl__is_set = true;
  }
  
  /**
   * element  : IdTokenIssuer of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo IdTokenIssuer__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IdTokenIssuer","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean IdTokenIssuer__is_set = false;

  private java.lang.String IdTokenIssuer;

  public java.lang.String getIdTokenIssuer() {
    return IdTokenIssuer;
  }

  

  public void setIdTokenIssuer(java.lang.String IdTokenIssuer) {
    this.IdTokenIssuer = IdTokenIssuer;
    IdTokenIssuer__is_set = true;
  }
  
  /**
   * element  : LogoutUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LogoutUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogoutUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LogoutUrl__is_set = false;

  private java.lang.String LogoutUrl;

  public java.lang.String getLogoutUrl() {
    return LogoutUrl;
  }

  

  public void setLogoutUrl(java.lang.String LogoutUrl) {
    this.LogoutUrl = LogoutUrl;
    LogoutUrl__is_set = true;
  }
  
  /**
   * element  : OptionsIncludeOrgIdInId of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsIncludeOrgIdInId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsIncludeOrgIdInId","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsIncludeOrgIdInId__is_set = false;

  private java.lang.Boolean OptionsIncludeOrgIdInId;

  public java.lang.Boolean getOptionsIncludeOrgIdInId() {
    return OptionsIncludeOrgIdInId;
  }

  

  public void setOptionsIncludeOrgIdInId(java.lang.Boolean OptionsIncludeOrgIdInId) {
    this.OptionsIncludeOrgIdInId = OptionsIncludeOrgIdInId;
    OptionsIncludeOrgIdInId__is_set = true;
  }
  
  /**
   * element  : OptionsSendAccessTokenInHeader of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsSendAccessTokenInHeader__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsSendAccessTokenInHeader","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsSendAccessTokenInHeader__is_set = false;

  private java.lang.Boolean OptionsSendAccessTokenInHeader;

  public java.lang.Boolean getOptionsSendAccessTokenInHeader() {
    return OptionsSendAccessTokenInHeader;
  }

  

  public void setOptionsSendAccessTokenInHeader(java.lang.Boolean OptionsSendAccessTokenInHeader) {
    this.OptionsSendAccessTokenInHeader = OptionsSendAccessTokenInHeader;
    OptionsSendAccessTokenInHeader__is_set = true;
  }
  
  /**
   * element  : OptionsSendClientCredentialsInHeader of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsSendClientCredentialsInHeader__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsSendClientCredentialsInHeader","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsSendClientCredentialsInHeader__is_set = false;

  private java.lang.Boolean OptionsSendClientCredentialsInHeader;

  public java.lang.Boolean getOptionsSendClientCredentialsInHeader() {
    return OptionsSendClientCredentialsInHeader;
  }

  

  public void setOptionsSendClientCredentialsInHeader(java.lang.Boolean OptionsSendClientCredentialsInHeader) {
    this.OptionsSendClientCredentialsInHeader = OptionsSendClientCredentialsInHeader;
    OptionsSendClientCredentialsInHeader__is_set = true;
  }
  
  /**
   * element  : PluginId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PluginId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PluginId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PluginId__is_set = false;

  private java.lang.String PluginId;

  public java.lang.String getPluginId() {
    return PluginId;
  }

  

  public void setPluginId(java.lang.String PluginId) {
    this.PluginId = PluginId;
    PluginId__is_set = true;
  }
  
  /**
   * element  : ProviderType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ProviderType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ProviderType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ProviderType__is_set = false;

  private java.lang.String ProviderType;

  public java.lang.String getProviderType() {
    return ProviderType;
  }

  

  public void setProviderType(java.lang.String ProviderType) {
    this.ProviderType = ProviderType;
    ProviderType__is_set = true;
  }
  
  /**
   * element  : RegistrationHandlerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RegistrationHandlerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RegistrationHandlerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean RegistrationHandlerId__is_set = false;

  private java.lang.String RegistrationHandlerId;

  public java.lang.String getRegistrationHandlerId() {
    return RegistrationHandlerId;
  }

  

  public void setRegistrationHandlerId(java.lang.String RegistrationHandlerId) {
    this.RegistrationHandlerId = RegistrationHandlerId;
    RegistrationHandlerId__is_set = true;
  }
  
  /**
   * element  : TokenUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TokenUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TokenUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TokenUrl__is_set = false;

  private java.lang.String TokenUrl;

  public java.lang.String getTokenUrl() {
    return TokenUrl;
  }

  

  public void setTokenUrl(java.lang.String TokenUrl) {
    this.TokenUrl = TokenUrl;
    TokenUrl__is_set = true;
  }
  
  /**
   * element  : UserInfoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserInfoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserInfoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UserInfoUrl__is_set = false;

  private java.lang.String UserInfoUrl;

  public java.lang.String getUserInfoUrl() {
    return UserInfoUrl;
  }

  

  public void setUserInfoUrl(java.lang.String UserInfoUrl) {
    this.UserInfoUrl = UserInfoUrl;
    UserInfoUrl__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "AuthProvider");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AuthorizeUrl__typeInfo, AuthorizeUrl, AuthorizeUrl__is_set);
    __typeMapper.writeString(__out, ConsumerKey__typeInfo, ConsumerKey, ConsumerKey__is_set);
    __typeMapper.writeString(__out, ConsumerSecret__typeInfo, ConsumerSecret, ConsumerSecret__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CustomMetadataTypeRecord__typeInfo, CustomMetadataTypeRecord, CustomMetadataTypeRecord__is_set);
    __typeMapper.writeString(__out, DefaultScopes__typeInfo, DefaultScopes, DefaultScopes__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeString(__out, ErrorUrl__typeInfo, ErrorUrl, ErrorUrl__is_set);
    __typeMapper.writeString(__out, ExecutionUserId__typeInfo, ExecutionUserId, ExecutionUserId__is_set);
    __typeMapper.writeString(__out, FriendlyName__typeInfo, FriendlyName, FriendlyName__is_set);
    __typeMapper.writeString(__out, IconUrl__typeInfo, IconUrl, IconUrl__is_set);
    __typeMapper.writeString(__out, IdTokenIssuer__typeInfo, IdTokenIssuer, IdTokenIssuer__is_set);
    __typeMapper.writeString(__out, LogoutUrl__typeInfo, LogoutUrl, LogoutUrl__is_set);
    __typeMapper.writeObject(__out, OptionsIncludeOrgIdInId__typeInfo, OptionsIncludeOrgIdInId, OptionsIncludeOrgIdInId__is_set);
    __typeMapper.writeObject(__out, OptionsSendAccessTokenInHeader__typeInfo, OptionsSendAccessTokenInHeader, OptionsSendAccessTokenInHeader__is_set);
    __typeMapper.writeObject(__out, OptionsSendClientCredentialsInHeader__typeInfo, OptionsSendClientCredentialsInHeader, OptionsSendClientCredentialsInHeader__is_set);
    __typeMapper.writeString(__out, PluginId__typeInfo, PluginId, PluginId__is_set);
    __typeMapper.writeString(__out, ProviderType__typeInfo, ProviderType, ProviderType__is_set);
    __typeMapper.writeString(__out, RegistrationHandlerId__typeInfo, RegistrationHandlerId, RegistrationHandlerId__is_set);
    __typeMapper.writeString(__out, TokenUrl__typeInfo, TokenUrl, TokenUrl__is_set);
    __typeMapper.writeString(__out, UserInfoUrl__typeInfo, UserInfoUrl, UserInfoUrl__is_set);
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
    if (__typeMapper.isElement(__in, AuthorizeUrl__typeInfo)) {
      setAuthorizeUrl((java.lang.String)__typeMapper.readString(__in, AuthorizeUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConsumerKey__typeInfo)) {
      setConsumerKey((java.lang.String)__typeMapper.readString(__in, ConsumerKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConsumerSecret__typeInfo)) {
      setConsumerSecret((java.lang.String)__typeMapper.readString(__in, ConsumerSecret__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomMetadataTypeRecord__typeInfo)) {
      setCustomMetadataTypeRecord((java.lang.String)__typeMapper.readString(__in, CustomMetadataTypeRecord__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DefaultScopes__typeInfo)) {
      setDefaultScopes((java.lang.String)__typeMapper.readString(__in, DefaultScopes__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ErrorUrl__typeInfo)) {
      setErrorUrl((java.lang.String)__typeMapper.readString(__in, ErrorUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ExecutionUserId__typeInfo)) {
      setExecutionUserId((java.lang.String)__typeMapper.readString(__in, ExecutionUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FriendlyName__typeInfo)) {
      setFriendlyName((java.lang.String)__typeMapper.readString(__in, FriendlyName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IconUrl__typeInfo)) {
      setIconUrl((java.lang.String)__typeMapper.readString(__in, IconUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IdTokenIssuer__typeInfo)) {
      setIdTokenIssuer((java.lang.String)__typeMapper.readString(__in, IdTokenIssuer__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogoutUrl__typeInfo)) {
      setLogoutUrl((java.lang.String)__typeMapper.readString(__in, LogoutUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsIncludeOrgIdInId__typeInfo)) {
      setOptionsIncludeOrgIdInId((java.lang.Boolean)__typeMapper.readObject(__in, OptionsIncludeOrgIdInId__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsSendAccessTokenInHeader__typeInfo)) {
      setOptionsSendAccessTokenInHeader((java.lang.Boolean)__typeMapper.readObject(__in, OptionsSendAccessTokenInHeader__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsSendClientCredentialsInHeader__typeInfo)) {
      setOptionsSendClientCredentialsInHeader((java.lang.Boolean)__typeMapper.readObject(__in, OptionsSendClientCredentialsInHeader__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PluginId__typeInfo)) {
      setPluginId((java.lang.String)__typeMapper.readString(__in, PluginId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProviderType__typeInfo)) {
      setProviderType((java.lang.String)__typeMapper.readString(__in, ProviderType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RegistrationHandlerId__typeInfo)) {
      setRegistrationHandlerId((java.lang.String)__typeMapper.readString(__in, RegistrationHandlerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TokenUrl__typeInfo)) {
      setTokenUrl((java.lang.String)__typeMapper.readString(__in, TokenUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserInfoUrl__typeInfo)) {
      setUserInfoUrl((java.lang.String)__typeMapper.readString(__in, UserInfoUrl__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AuthProvider ");
    sb.append(super.toString());
    sb.append(" AuthorizeUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AuthorizeUrl)+"'\n");
    sb.append(" ConsumerKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConsumerKey)+"'\n");
    sb.append(" ConsumerSecret=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConsumerSecret)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CustomMetadataTypeRecord=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomMetadataTypeRecord)+"'\n");
    sb.append(" DefaultScopes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DefaultScopes)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" ErrorUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ErrorUrl)+"'\n");
    sb.append(" ExecutionUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExecutionUserId)+"'\n");
    sb.append(" FriendlyName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FriendlyName)+"'\n");
    sb.append(" IconUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IconUrl)+"'\n");
    sb.append(" IdTokenIssuer=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IdTokenIssuer)+"'\n");
    sb.append(" LogoutUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogoutUrl)+"'\n");
    sb.append(" OptionsIncludeOrgIdInId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsIncludeOrgIdInId)+"'\n");
    sb.append(" OptionsSendAccessTokenInHeader=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsSendAccessTokenInHeader)+"'\n");
    sb.append(" OptionsSendClientCredentialsInHeader=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsSendClientCredentialsInHeader)+"'\n");
    sb.append(" PluginId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PluginId)+"'\n");
    sb.append(" ProviderType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProviderType)+"'\n");
    sb.append(" RegistrationHandlerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RegistrationHandlerId)+"'\n");
    sb.append(" TokenUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TokenUrl)+"'\n");
    sb.append(" UserInfoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserInfoUrl)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}