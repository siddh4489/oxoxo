package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ConnectedApplication extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ConnectedApplication() {
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
   * element  : InstalledMobileApps of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo InstalledMobileApps__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","InstalledMobileApps","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean InstalledMobileApps__is_set = false;

  private com.sforce.soap.enterprise.QueryResult InstalledMobileApps;

  public com.sforce.soap.enterprise.QueryResult getInstalledMobileApps() {
    return InstalledMobileApps;
  }

  

  public void setInstalledMobileApps(com.sforce.soap.enterprise.QueryResult InstalledMobileApps) {
    this.InstalledMobileApps = InstalledMobileApps;
    InstalledMobileApps__is_set = true;
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
   * element  : MobileSessionTimeout of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileSessionTimeout__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileSessionTimeout","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileSessionTimeout__is_set = false;

  private java.lang.String MobileSessionTimeout;

  public java.lang.String getMobileSessionTimeout() {
    return MobileSessionTimeout;
  }

  

  public void setMobileSessionTimeout(java.lang.String MobileSessionTimeout) {
    this.MobileSessionTimeout = MobileSessionTimeout;
    MobileSessionTimeout__is_set = true;
  }
  
  /**
   * element  : MobileStartUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo MobileStartUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MobileStartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean MobileStartUrl__is_set = false;

  private java.lang.String MobileStartUrl;

  public java.lang.String getMobileStartUrl() {
    return MobileStartUrl;
  }

  

  public void setMobileStartUrl(java.lang.String MobileStartUrl) {
    this.MobileStartUrl = MobileStartUrl;
    MobileStartUrl__is_set = true;
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
   * element  : OptionsAllowAdminApprovedUsersOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsAllowAdminApprovedUsersOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsAllowAdminApprovedUsersOnly","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsAllowAdminApprovedUsersOnly__is_set = false;

  private java.lang.Boolean OptionsAllowAdminApprovedUsersOnly;

  public java.lang.Boolean getOptionsAllowAdminApprovedUsersOnly() {
    return OptionsAllowAdminApprovedUsersOnly;
  }

  

  public void setOptionsAllowAdminApprovedUsersOnly(java.lang.Boolean OptionsAllowAdminApprovedUsersOnly) {
    this.OptionsAllowAdminApprovedUsersOnly = OptionsAllowAdminApprovedUsersOnly;
    OptionsAllowAdminApprovedUsersOnly__is_set = true;
  }
  
  /**
   * element  : OptionsHasSessionLevelPolicy of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsHasSessionLevelPolicy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsHasSessionLevelPolicy","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsHasSessionLevelPolicy__is_set = false;

  private java.lang.Boolean OptionsHasSessionLevelPolicy;

  public java.lang.Boolean getOptionsHasSessionLevelPolicy() {
    return OptionsHasSessionLevelPolicy;
  }

  

  public void setOptionsHasSessionLevelPolicy(java.lang.Boolean OptionsHasSessionLevelPolicy) {
    this.OptionsHasSessionLevelPolicy = OptionsHasSessionLevelPolicy;
    OptionsHasSessionLevelPolicy__is_set = true;
  }
  
  /**
   * element  : OptionsIsInternal of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsIsInternal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsIsInternal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsIsInternal__is_set = false;

  private java.lang.Boolean OptionsIsInternal;

  public java.lang.Boolean getOptionsIsInternal() {
    return OptionsIsInternal;
  }

  

  public void setOptionsIsInternal(java.lang.Boolean OptionsIsInternal) {
    this.OptionsIsInternal = OptionsIsInternal;
    OptionsIsInternal__is_set = true;
  }
  
  /**
   * element  : OptionsRefreshTokenValidityMetric of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo OptionsRefreshTokenValidityMetric__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OptionsRefreshTokenValidityMetric","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean OptionsRefreshTokenValidityMetric__is_set = false;

  private java.lang.Boolean OptionsRefreshTokenValidityMetric;

  public java.lang.Boolean getOptionsRefreshTokenValidityMetric() {
    return OptionsRefreshTokenValidityMetric;
  }

  

  public void setOptionsRefreshTokenValidityMetric(java.lang.Boolean OptionsRefreshTokenValidityMetric) {
    this.OptionsRefreshTokenValidityMetric = OptionsRefreshTokenValidityMetric;
    OptionsRefreshTokenValidityMetric__is_set = true;
  }
  
  /**
   * element  : PinLength of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PinLength__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PinLength","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PinLength__is_set = false;

  private java.lang.String PinLength;

  public java.lang.String getPinLength() {
    return PinLength;
  }

  

  public void setPinLength(java.lang.String PinLength) {
    this.PinLength = PinLength;
    PinLength__is_set = true;
  }
  
  /**
   * element  : RefreshTokenValidityPeriod of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RefreshTokenValidityPeriod__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RefreshTokenValidityPeriod","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RefreshTokenValidityPeriod__is_set = false;

  private java.lang.Integer RefreshTokenValidityPeriod;

  public java.lang.Integer getRefreshTokenValidityPeriod() {
    return RefreshTokenValidityPeriod;
  }

  

  public void setRefreshTokenValidityPeriod(java.lang.Integer RefreshTokenValidityPeriod) {
    this.RefreshTokenValidityPeriod = RefreshTokenValidityPeriod;
    RefreshTokenValidityPeriod__is_set = true;
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
   * element  : StartUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo StartUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean StartUrl__is_set = false;

  private java.lang.String StartUrl;

  public java.lang.String getStartUrl() {
    return StartUrl;
  }

  

  public void setStartUrl(java.lang.String StartUrl) {
    this.StartUrl = StartUrl;
    StartUrl__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ConnectedApplication");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, InstalledMobileApps__typeInfo, InstalledMobileApps, InstalledMobileApps__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, MobileSessionTimeout__typeInfo, MobileSessionTimeout, MobileSessionTimeout__is_set);
    __typeMapper.writeString(__out, MobileStartUrl__typeInfo, MobileStartUrl, MobileStartUrl__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, OptionsAllowAdminApprovedUsersOnly__typeInfo, OptionsAllowAdminApprovedUsersOnly, OptionsAllowAdminApprovedUsersOnly__is_set);
    __typeMapper.writeObject(__out, OptionsHasSessionLevelPolicy__typeInfo, OptionsHasSessionLevelPolicy, OptionsHasSessionLevelPolicy__is_set);
    __typeMapper.writeObject(__out, OptionsIsInternal__typeInfo, OptionsIsInternal, OptionsIsInternal__is_set);
    __typeMapper.writeObject(__out, OptionsRefreshTokenValidityMetric__typeInfo, OptionsRefreshTokenValidityMetric, OptionsRefreshTokenValidityMetric__is_set);
    __typeMapper.writeString(__out, PinLength__typeInfo, PinLength, PinLength__is_set);
    __typeMapper.writeObject(__out, RefreshTokenValidityPeriod__typeInfo, RefreshTokenValidityPeriod, RefreshTokenValidityPeriod__is_set);
    __typeMapper.writeObject(__out, SetupEntityAccessItems__typeInfo, SetupEntityAccessItems, SetupEntityAccessItems__is_set);
    __typeMapper.writeString(__out, StartUrl__typeInfo, StartUrl, StartUrl__is_set);
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
    if (__typeMapper.isElement(__in, InstalledMobileApps__typeInfo)) {
      setInstalledMobileApps((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, InstalledMobileApps__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, MobileSessionTimeout__typeInfo)) {
      setMobileSessionTimeout((java.lang.String)__typeMapper.readString(__in, MobileSessionTimeout__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MobileStartUrl__typeInfo)) {
      setMobileStartUrl((java.lang.String)__typeMapper.readString(__in, MobileStartUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsAllowAdminApprovedUsersOnly__typeInfo)) {
      setOptionsAllowAdminApprovedUsersOnly((java.lang.Boolean)__typeMapper.readObject(__in, OptionsAllowAdminApprovedUsersOnly__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsHasSessionLevelPolicy__typeInfo)) {
      setOptionsHasSessionLevelPolicy((java.lang.Boolean)__typeMapper.readObject(__in, OptionsHasSessionLevelPolicy__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsIsInternal__typeInfo)) {
      setOptionsIsInternal((java.lang.Boolean)__typeMapper.readObject(__in, OptionsIsInternal__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OptionsRefreshTokenValidityMetric__typeInfo)) {
      setOptionsRefreshTokenValidityMetric((java.lang.Boolean)__typeMapper.readObject(__in, OptionsRefreshTokenValidityMetric__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PinLength__typeInfo)) {
      setPinLength((java.lang.String)__typeMapper.readString(__in, PinLength__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RefreshTokenValidityPeriod__typeInfo)) {
      setRefreshTokenValidityPeriod((java.lang.Integer)__typeMapper.readObject(__in, RefreshTokenValidityPeriod__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupEntityAccessItems__typeInfo)) {
      setSetupEntityAccessItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, SetupEntityAccessItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartUrl__typeInfo)) {
      setStartUrl((java.lang.String)__typeMapper.readString(__in, StartUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ConnectedApplication ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" InstalledMobileApps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InstalledMobileApps)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MobileSessionTimeout=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileSessionTimeout)+"'\n");
    sb.append(" MobileStartUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MobileStartUrl)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" OptionsAllowAdminApprovedUsersOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsAllowAdminApprovedUsersOnly)+"'\n");
    sb.append(" OptionsHasSessionLevelPolicy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsHasSessionLevelPolicy)+"'\n");
    sb.append(" OptionsIsInternal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsIsInternal)+"'\n");
    sb.append(" OptionsRefreshTokenValidityMetric=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OptionsRefreshTokenValidityMetric)+"'\n");
    sb.append(" PinLength=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PinLength)+"'\n");
    sb.append(" RefreshTokenValidityPeriod=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RefreshTokenValidityPeriod)+"'\n");
    sb.append(" SetupEntityAccessItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupEntityAccessItems)+"'\n");
    sb.append(" StartUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartUrl)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}