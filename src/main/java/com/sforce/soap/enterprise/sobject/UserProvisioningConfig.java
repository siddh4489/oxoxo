package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserProvisioningConfig extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserProvisioningConfig() {
  }
    
  
  /**
   * element  : ApprovalRequired of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApprovalRequired__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApprovalRequired","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ApprovalRequired__is_set = false;

  private java.lang.String ApprovalRequired;

  public java.lang.String getApprovalRequired() {
    return ApprovalRequired;
  }

  

  public void setApprovalRequired(java.lang.String ApprovalRequired) {
    this.ApprovalRequired = ApprovalRequired;
    ApprovalRequired__is_set = true;
  }
  
  /**
   * element  : ConnectedApp of type {urn:sobject.enterprise.soap.sforce.com}ConnectedApplication
   * java type: com.sforce.soap.enterprise.sobject.ConnectedApplication
   */
  private static final com.sforce.ws.bind.TypeInfo ConnectedApp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConnectedApp","urn:sobject.enterprise.soap.sforce.com","ConnectedApplication",0,1,true);

  private boolean ConnectedApp__is_set = false;

  private com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp;

  public com.sforce.soap.enterprise.sobject.ConnectedApplication getConnectedApp() {
    return ConnectedApp;
  }

  

  public void setConnectedApp(com.sforce.soap.enterprise.sobject.ConnectedApplication ConnectedApp) {
    this.ConnectedApp = ConnectedApp;
    ConnectedApp__is_set = true;
  }
  
  /**
   * element  : ConnectedAppId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ConnectedAppId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ConnectedAppId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean ConnectedAppId__is_set = false;

  private java.lang.String ConnectedAppId;

  public java.lang.String getConnectedAppId() {
    return ConnectedAppId;
  }

  

  public void setConnectedAppId(java.lang.String ConnectedAppId) {
    this.ConnectedAppId = ConnectedAppId;
    ConnectedAppId__is_set = true;
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
   * element  : Enabled of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Enabled__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Enabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Enabled__is_set = false;

  private java.lang.Boolean Enabled;

  public java.lang.Boolean getEnabled() {
    return Enabled;
  }

  

  public void setEnabled(java.lang.Boolean Enabled) {
    this.Enabled = Enabled;
    Enabled__is_set = true;
  }
  
  /**
   * element  : EnabledOperations of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo EnabledOperations__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EnabledOperations","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean EnabledOperations__is_set = false;

  private java.lang.String EnabledOperations;

  public java.lang.String getEnabledOperations() {
    return EnabledOperations;
  }

  

  public void setEnabledOperations(java.lang.String EnabledOperations) {
    this.EnabledOperations = EnabledOperations;
    EnabledOperations__is_set = true;
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
   * element  : LastReconDateTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastReconDateTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LastReconDateTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastReconDateTime__is_set = false;

  private java.util.Calendar LastReconDateTime;

  public java.util.Calendar getLastReconDateTime() {
    return LastReconDateTime;
  }

  

  public void setLastReconDateTime(java.util.Calendar LastReconDateTime) {
    this.LastReconDateTime = LastReconDateTime;
    LastReconDateTime__is_set = true;
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
   * element  : NamedCredential of type {urn:sobject.enterprise.soap.sforce.com}NamedCredential
   * java type: com.sforce.soap.enterprise.sobject.NamedCredential
   */
  private static final com.sforce.ws.bind.TypeInfo NamedCredential__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NamedCredential","urn:sobject.enterprise.soap.sforce.com","NamedCredential",0,1,true);

  private boolean NamedCredential__is_set = false;

  private com.sforce.soap.enterprise.sobject.NamedCredential NamedCredential;

  public com.sforce.soap.enterprise.sobject.NamedCredential getNamedCredential() {
    return NamedCredential;
  }

  

  public void setNamedCredential(com.sforce.soap.enterprise.sobject.NamedCredential NamedCredential) {
    this.NamedCredential = NamedCredential;
    NamedCredential__is_set = true;
  }
  
  /**
   * element  : NamedCredentialId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo NamedCredentialId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NamedCredentialId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean NamedCredentialId__is_set = false;

  private java.lang.String NamedCredentialId;

  public java.lang.String getNamedCredentialId() {
    return NamedCredentialId;
  }

  

  public void setNamedCredentialId(java.lang.String NamedCredentialId) {
    this.NamedCredentialId = NamedCredentialId;
    NamedCredentialId__is_set = true;
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
   * element  : Notes of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Notes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Notes","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Notes__is_set = false;

  private java.lang.String Notes;

  public java.lang.String getNotes() {
    return Notes;
  }

  

  public void setNotes(java.lang.String Notes) {
    this.Notes = Notes;
    Notes__is_set = true;
  }
  
  /**
   * element  : OnUpdateAttributes of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OnUpdateAttributes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OnUpdateAttributes","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean OnUpdateAttributes__is_set = false;

  private java.lang.String OnUpdateAttributes;

  public java.lang.String getOnUpdateAttributes() {
    return OnUpdateAttributes;
  }

  

  public void setOnUpdateAttributes(java.lang.String OnUpdateAttributes) {
    this.OnUpdateAttributes = OnUpdateAttributes;
    OnUpdateAttributes__is_set = true;
  }
  
  /**
   * element  : ReconFilter of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ReconFilter__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ReconFilter","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ReconFilter__is_set = false;

  private java.lang.String ReconFilter;

  public java.lang.String getReconFilter() {
    return ReconFilter;
  }

  

  public void setReconFilter(java.lang.String ReconFilter) {
    this.ReconFilter = ReconFilter;
    ReconFilter__is_set = true;
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
   * element  : UserAccountMapping of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserAccountMapping__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserAccountMapping","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean UserAccountMapping__is_set = false;

  private java.lang.String UserAccountMapping;

  public java.lang.String getUserAccountMapping() {
    return UserAccountMapping;
  }

  

  public void setUserAccountMapping(java.lang.String UserAccountMapping) {
    this.UserAccountMapping = UserAccountMapping;
    UserAccountMapping__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserProvisioningConfig");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ApprovalRequired__typeInfo, ApprovalRequired, ApprovalRequired__is_set);
    __typeMapper.writeObject(__out, ConnectedApp__typeInfo, ConnectedApp, ConnectedApp__is_set);
    __typeMapper.writeString(__out, ConnectedAppId__typeInfo, ConnectedAppId, ConnectedAppId__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeObject(__out, Enabled__typeInfo, Enabled, Enabled__is_set);
    __typeMapper.writeString(__out, EnabledOperations__typeInfo, EnabledOperations, EnabledOperations__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeString(__out, Language__typeInfo, Language, Language__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, LastReconDateTime__typeInfo, LastReconDateTime, LastReconDateTime__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeObject(__out, NamedCredential__typeInfo, NamedCredential, NamedCredential__is_set);
    __typeMapper.writeString(__out, NamedCredentialId__typeInfo, NamedCredentialId, NamedCredentialId__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeString(__out, Notes__typeInfo, Notes, Notes__is_set);
    __typeMapper.writeString(__out, OnUpdateAttributes__typeInfo, OnUpdateAttributes, OnUpdateAttributes__is_set);
    __typeMapper.writeString(__out, ReconFilter__typeInfo, ReconFilter, ReconFilter__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, UserAccountMapping__typeInfo, UserAccountMapping, UserAccountMapping__is_set);
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
    if (__typeMapper.isElement(__in, ApprovalRequired__typeInfo)) {
      setApprovalRequired((java.lang.String)__typeMapper.readString(__in, ApprovalRequired__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConnectedApp__typeInfo)) {
      setConnectedApp((com.sforce.soap.enterprise.sobject.ConnectedApplication)__typeMapper.readObject(__in, ConnectedApp__typeInfo, com.sforce.soap.enterprise.sobject.ConnectedApplication.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ConnectedAppId__typeInfo)) {
      setConnectedAppId((java.lang.String)__typeMapper.readString(__in, ConnectedAppId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Enabled__typeInfo)) {
      setEnabled((java.lang.Boolean)__typeMapper.readObject(__in, Enabled__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EnabledOperations__typeInfo)) {
      setEnabledOperations((java.lang.String)__typeMapper.readString(__in, EnabledOperations__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, LastReconDateTime__typeInfo)) {
      setLastReconDateTime((java.util.Calendar)__typeMapper.readObject(__in, LastReconDateTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MasterLabel__typeInfo)) {
      setMasterLabel((java.lang.String)__typeMapper.readString(__in, MasterLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamedCredential__typeInfo)) {
      setNamedCredential((com.sforce.soap.enterprise.sobject.NamedCredential)__typeMapper.readObject(__in, NamedCredential__typeInfo, com.sforce.soap.enterprise.sobject.NamedCredential.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamedCredentialId__typeInfo)) {
      setNamedCredentialId((java.lang.String)__typeMapper.readString(__in, NamedCredentialId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Notes__typeInfo)) {
      setNotes((java.lang.String)__typeMapper.readString(__in, Notes__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OnUpdateAttributes__typeInfo)) {
      setOnUpdateAttributes((java.lang.String)__typeMapper.readString(__in, OnUpdateAttributes__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReconFilter__typeInfo)) {
      setReconFilter((java.lang.String)__typeMapper.readString(__in, ReconFilter__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserAccountMapping__typeInfo)) {
      setUserAccountMapping((java.lang.String)__typeMapper.readString(__in, UserAccountMapping__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserProvisioningConfig ");
    sb.append(super.toString());
    sb.append(" ApprovalRequired=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApprovalRequired)+"'\n");
    sb.append(" ConnectedApp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConnectedApp)+"'\n");
    sb.append(" ConnectedAppId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ConnectedAppId)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" Enabled=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Enabled)+"'\n");
    sb.append(" EnabledOperations=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EnabledOperations)+"'\n");
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
    sb.append(" LastReconDateTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastReconDateTime)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" NamedCredential=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamedCredential)+"'\n");
    sb.append(" NamedCredentialId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamedCredentialId)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" Notes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Notes)+"'\n");
    sb.append(" OnUpdateAttributes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OnUpdateAttributes)+"'\n");
    sb.append(" ReconFilter=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReconFilter)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserAccountMapping=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserAccountMapping)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}