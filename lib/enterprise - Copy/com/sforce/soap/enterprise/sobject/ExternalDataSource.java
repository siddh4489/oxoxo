package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ExternalDataSource extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ExternalDataSource() {
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
   * element  : CustomConfiguration of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomConfiguration__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomConfiguration","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CustomConfiguration__is_set = false;

  private java.lang.String CustomConfiguration;

  public java.lang.String getCustomConfiguration() {
    return CustomConfiguration;
  }

  

  public void setCustomConfiguration(java.lang.String CustomConfiguration) {
    this.CustomConfiguration = CustomConfiguration;
    CustomConfiguration__is_set = true;
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
   * element  : Endpoint of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Endpoint__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Endpoint","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Endpoint__is_set = false;

  private java.lang.String Endpoint;

  public java.lang.String getEndpoint() {
    return Endpoint;
  }

  

  public void setEndpoint(java.lang.String Endpoint) {
    this.Endpoint = Endpoint;
    Endpoint__is_set = true;
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
   * element  : IsWritable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsWritable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsWritable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsWritable__is_set = false;

  private java.lang.Boolean IsWritable;

  public java.lang.Boolean getIsWritable() {
    return IsWritable;
  }

  

  public void setIsWritable(java.lang.Boolean IsWritable) {
    this.IsWritable = IsWritable;
    IsWritable__is_set = true;
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
   * element  : LargeIcon of type {urn:sobject.enterprise.soap.sforce.com}StaticResource
   * java type: com.sforce.soap.enterprise.sobject.StaticResource
   */
  private static final com.sforce.ws.bind.TypeInfo LargeIcon__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LargeIcon","urn:sobject.enterprise.soap.sforce.com","StaticResource",0,1,true);

  private boolean LargeIcon__is_set = false;

  private com.sforce.soap.enterprise.sobject.StaticResource LargeIcon;

  public com.sforce.soap.enterprise.sobject.StaticResource getLargeIcon() {
    return LargeIcon;
  }

  

  public void setLargeIcon(com.sforce.soap.enterprise.sobject.StaticResource LargeIcon) {
    this.LargeIcon = LargeIcon;
    LargeIcon__is_set = true;
  }
  
  /**
   * element  : LargeIconId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LargeIconId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LargeIconId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LargeIconId__is_set = false;

  private java.lang.String LargeIconId;

  public java.lang.String getLargeIconId() {
    return LargeIconId;
  }

  

  public void setLargeIconId(java.lang.String LargeIconId) {
    this.LargeIconId = LargeIconId;
    LargeIconId__is_set = true;
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
   * element  : PrincipalType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PrincipalType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PrincipalType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PrincipalType__is_set = false;

  private java.lang.String PrincipalType;

  public java.lang.String getPrincipalType() {
    return PrincipalType;
  }

  

  public void setPrincipalType(java.lang.String PrincipalType) {
    this.PrincipalType = PrincipalType;
    PrincipalType__is_set = true;
  }
  
  /**
   * element  : Protocol of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Protocol__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Protocol","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Protocol__is_set = false;

  private java.lang.String Protocol;

  public java.lang.String getProtocol() {
    return Protocol;
  }

  

  public void setProtocol(java.lang.String Protocol) {
    this.Protocol = Protocol;
    Protocol__is_set = true;
  }
  
  /**
   * element  : Repository of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Repository__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Repository","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Repository__is_set = false;

  private java.lang.String Repository;

  public java.lang.String getRepository() {
    return Repository;
  }

  

  public void setRepository(java.lang.String Repository) {
    this.Repository = Repository;
    Repository__is_set = true;
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
   * element  : SmallIcon of type {urn:sobject.enterprise.soap.sforce.com}StaticResource
   * java type: com.sforce.soap.enterprise.sobject.StaticResource
   */
  private static final com.sforce.ws.bind.TypeInfo SmallIcon__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SmallIcon","urn:sobject.enterprise.soap.sforce.com","StaticResource",0,1,true);

  private boolean SmallIcon__is_set = false;

  private com.sforce.soap.enterprise.sobject.StaticResource SmallIcon;

  public com.sforce.soap.enterprise.sobject.StaticResource getSmallIcon() {
    return SmallIcon;
  }

  

  public void setSmallIcon(com.sforce.soap.enterprise.sobject.StaticResource SmallIcon) {
    this.SmallIcon = SmallIcon;
    SmallIcon__is_set = true;
  }
  
  /**
   * element  : SmallIconId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SmallIconId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SmallIconId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SmallIconId__is_set = false;

  private java.lang.String SmallIconId;

  public java.lang.String getSmallIconId() {
    return SmallIconId;
  }

  

  public void setSmallIconId(java.lang.String SmallIconId) {
    this.SmallIconId = SmallIconId;
    SmallIconId__is_set = true;
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
   * element  : UserAuths of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo UserAuths__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserAuths","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean UserAuths__is_set = false;

  private com.sforce.soap.enterprise.QueryResult UserAuths;

  public com.sforce.soap.enterprise.QueryResult getUserAuths() {
    return UserAuths;
  }

  

  public void setUserAuths(com.sforce.soap.enterprise.QueryResult UserAuths) {
    this.UserAuths = UserAuths;
    UserAuths__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ExternalDataSource");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CustomConfiguration__typeInfo, CustomConfiguration, CustomConfiguration__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeString(__out, Endpoint__typeInfo, Endpoint, Endpoint__is_set);
    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);
    __typeMapper.writeObject(__out, IsWritable__typeInfo, IsWritable, IsWritable__is_set);
    __typeMapper.writeString(__out, Language__typeInfo, Language, Language__is_set);
    __typeMapper.writeObject(__out, LargeIcon__typeInfo, LargeIcon, LargeIcon__is_set);
    __typeMapper.writeString(__out, LargeIconId__typeInfo, LargeIconId, LargeIconId__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, MasterLabel__typeInfo, MasterLabel, MasterLabel__is_set);
    __typeMapper.writeString(__out, NamespacePrefix__typeInfo, NamespacePrefix, NamespacePrefix__is_set);
    __typeMapper.writeString(__out, PrincipalType__typeInfo, PrincipalType, PrincipalType__is_set);
    __typeMapper.writeString(__out, Protocol__typeInfo, Protocol, Protocol__is_set);
    __typeMapper.writeString(__out, Repository__typeInfo, Repository, Repository__is_set);
    __typeMapper.writeObject(__out, SetupEntityAccessItems__typeInfo, SetupEntityAccessItems, SetupEntityAccessItems__is_set);
    __typeMapper.writeObject(__out, SmallIcon__typeInfo, SmallIcon, SmallIcon__is_set);
    __typeMapper.writeString(__out, SmallIconId__typeInfo, SmallIconId, SmallIconId__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeObject(__out, UserAuths__typeInfo, UserAuths, UserAuths__is_set);
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
    if (__typeMapper.isElement(__in, CustomConfiguration__typeInfo)) {
      setCustomConfiguration((java.lang.String)__typeMapper.readString(__in, CustomConfiguration__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Endpoint__typeInfo)) {
      setEndpoint((java.lang.String)__typeMapper.readString(__in, Endpoint__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {
      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsWritable__typeInfo)) {
      setIsWritable((java.lang.Boolean)__typeMapper.readObject(__in, IsWritable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Language__typeInfo)) {
      setLanguage((java.lang.String)__typeMapper.readString(__in, Language__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LargeIcon__typeInfo)) {
      setLargeIcon((com.sforce.soap.enterprise.sobject.StaticResource)__typeMapper.readObject(__in, LargeIcon__typeInfo, com.sforce.soap.enterprise.sobject.StaticResource.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LargeIconId__typeInfo)) {
      setLargeIconId((java.lang.String)__typeMapper.readString(__in, LargeIconId__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, NamespacePrefix__typeInfo)) {
      setNamespacePrefix((java.lang.String)__typeMapper.readString(__in, NamespacePrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PrincipalType__typeInfo)) {
      setPrincipalType((java.lang.String)__typeMapper.readString(__in, PrincipalType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Protocol__typeInfo)) {
      setProtocol((java.lang.String)__typeMapper.readString(__in, Protocol__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Repository__typeInfo)) {
      setRepository((java.lang.String)__typeMapper.readString(__in, Repository__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SetupEntityAccessItems__typeInfo)) {
      setSetupEntityAccessItems((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, SetupEntityAccessItems__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SmallIcon__typeInfo)) {
      setSmallIcon((com.sforce.soap.enterprise.sobject.StaticResource)__typeMapper.readObject(__in, SmallIcon__typeInfo, com.sforce.soap.enterprise.sobject.StaticResource.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SmallIconId__typeInfo)) {
      setSmallIconId((java.lang.String)__typeMapper.readString(__in, SmallIconId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserAuths__typeInfo)) {
      setUserAuths((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, UserAuths__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ExternalDataSource ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CustomConfiguration=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomConfiguration)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" Endpoint=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Endpoint)+"'\n");
    sb.append(" IsDeleted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");
    sb.append(" IsWritable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsWritable)+"'\n");
    sb.append(" Language=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Language)+"'\n");
    sb.append(" LargeIcon=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LargeIcon)+"'\n");
    sb.append(" LargeIconId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LargeIconId)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MasterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MasterLabel)+"'\n");
    sb.append(" NamespacePrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NamespacePrefix)+"'\n");
    sb.append(" PrincipalType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PrincipalType)+"'\n");
    sb.append(" Protocol=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Protocol)+"'\n");
    sb.append(" Repository=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Repository)+"'\n");
    sb.append(" SetupEntityAccessItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SetupEntityAccessItems)+"'\n");
    sb.append(" SmallIcon=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SmallIcon)+"'\n");
    sb.append(" SmallIconId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SmallIconId)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" UserAuths=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserAuths)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}