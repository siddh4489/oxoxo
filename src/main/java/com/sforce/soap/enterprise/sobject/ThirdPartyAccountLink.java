package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ThirdPartyAccountLink extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ThirdPartyAccountLink() {
  }
    
  
  /**
   * element  : Handle of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Handle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Handle","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Handle__is_set = false;

  private java.lang.String Handle;

  public java.lang.String getHandle() {
    return Handle;
  }

  

  public void setHandle(java.lang.String Handle) {
    this.Handle = Handle;
    Handle__is_set = true;
  }
  
  /**
   * element  : IsNotSsoUsable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsNotSsoUsable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsNotSsoUsable","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsNotSsoUsable__is_set = false;

  private java.lang.Boolean IsNotSsoUsable;

  public java.lang.Boolean getIsNotSsoUsable() {
    return IsNotSsoUsable;
  }

  

  public void setIsNotSsoUsable(java.lang.Boolean IsNotSsoUsable) {
    this.IsNotSsoUsable = IsNotSsoUsable;
    IsNotSsoUsable__is_set = true;
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
   * element  : RemoteIdentifier of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RemoteIdentifier__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RemoteIdentifier","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RemoteIdentifier__is_set = false;

  private java.lang.String RemoteIdentifier;

  public java.lang.String getRemoteIdentifier() {
    return RemoteIdentifier;
  }

  

  public void setRemoteIdentifier(java.lang.String RemoteIdentifier) {
    this.RemoteIdentifier = RemoteIdentifier;
    RemoteIdentifier__is_set = true;
  }
  
  /**
   * element  : SsoProvider of type {urn:sobject.enterprise.soap.sforce.com}AuthProvider
   * java type: com.sforce.soap.enterprise.sobject.AuthProvider
   */
  private static final com.sforce.ws.bind.TypeInfo SsoProvider__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SsoProvider","urn:sobject.enterprise.soap.sforce.com","AuthProvider",0,1,true);

  private boolean SsoProvider__is_set = false;

  private com.sforce.soap.enterprise.sobject.AuthProvider SsoProvider;

  public com.sforce.soap.enterprise.sobject.AuthProvider getSsoProvider() {
    return SsoProvider;
  }

  

  public void setSsoProvider(com.sforce.soap.enterprise.sobject.AuthProvider SsoProvider) {
    this.SsoProvider = SsoProvider;
    SsoProvider__is_set = true;
  }
  
  /**
   * element  : SsoProviderId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SsoProviderId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SsoProviderId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean SsoProviderId__is_set = false;

  private java.lang.String SsoProviderId;

  public java.lang.String getSsoProviderId() {
    return SsoProviderId;
  }

  

  public void setSsoProviderId(java.lang.String SsoProviderId) {
    this.SsoProviderId = SsoProviderId;
    SsoProviderId__is_set = true;
  }
  
  /**
   * element  : SsoProviderName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SsoProviderName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SsoProviderName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SsoProviderName__is_set = false;

  private java.lang.String SsoProviderName;

  public java.lang.String getSsoProviderName() {
    return SsoProviderName;
  }

  

  public void setSsoProviderName(java.lang.String SsoProviderName) {
    this.SsoProviderName = SsoProviderName;
    SsoProviderName__is_set = true;
  }
  
  /**
   * element  : ThirdPartyAccountLinkKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ThirdPartyAccountLinkKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ThirdPartyAccountLinkKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ThirdPartyAccountLinkKey__is_set = false;

  private java.lang.String ThirdPartyAccountLinkKey;

  public java.lang.String getThirdPartyAccountLinkKey() {
    return ThirdPartyAccountLinkKey;
  }

  

  public void setThirdPartyAccountLinkKey(java.lang.String ThirdPartyAccountLinkKey) {
    this.ThirdPartyAccountLinkKey = ThirdPartyAccountLinkKey;
    ThirdPartyAccountLinkKey__is_set = true;
  }
  
  /**
   * element  : User of type {urn:sobject.enterprise.soap.sforce.com}User
   * java type: com.sforce.soap.enterprise.sobject.User
   */
  private static final com.sforce.ws.bind.TypeInfo User__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","User","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);

  private boolean User__is_set = false;

  private com.sforce.soap.enterprise.sobject.User User;

  public com.sforce.soap.enterprise.sobject.User getUser() {
    return User;
  }

  

  public void setUser(com.sforce.soap.enterprise.sobject.User User) {
    this.User = User;
    User__is_set = true;
  }
  
  /**
   * element  : UserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserId__is_set = false;

  private java.lang.String UserId;

  public java.lang.String getUserId() {
    return UserId;
  }

  

  public void setUserId(java.lang.String UserId) {
    this.UserId = UserId;
    UserId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ThirdPartyAccountLink");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Handle__typeInfo, Handle, Handle__is_set);
    __typeMapper.writeObject(__out, IsNotSsoUsable__typeInfo, IsNotSsoUsable, IsNotSsoUsable__is_set);
    __typeMapper.writeString(__out, Provider__typeInfo, Provider, Provider__is_set);
    __typeMapper.writeString(__out, RemoteIdentifier__typeInfo, RemoteIdentifier, RemoteIdentifier__is_set);
    __typeMapper.writeObject(__out, SsoProvider__typeInfo, SsoProvider, SsoProvider__is_set);
    __typeMapper.writeString(__out, SsoProviderId__typeInfo, SsoProviderId, SsoProviderId__is_set);
    __typeMapper.writeString(__out, SsoProviderName__typeInfo, SsoProviderName, SsoProviderName__is_set);
    __typeMapper.writeString(__out, ThirdPartyAccountLinkKey__typeInfo, ThirdPartyAccountLinkKey, ThirdPartyAccountLinkKey__is_set);
    __typeMapper.writeObject(__out, User__typeInfo, User, User__is_set);
    __typeMapper.writeString(__out, UserId__typeInfo, UserId, UserId__is_set);
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
    if (__typeMapper.isElement(__in, Handle__typeInfo)) {
      setHandle((java.lang.String)__typeMapper.readString(__in, Handle__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsNotSsoUsable__typeInfo)) {
      setIsNotSsoUsable((java.lang.Boolean)__typeMapper.readObject(__in, IsNotSsoUsable__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Provider__typeInfo)) {
      setProvider((java.lang.String)__typeMapper.readString(__in, Provider__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RemoteIdentifier__typeInfo)) {
      setRemoteIdentifier((java.lang.String)__typeMapper.readString(__in, RemoteIdentifier__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SsoProvider__typeInfo)) {
      setSsoProvider((com.sforce.soap.enterprise.sobject.AuthProvider)__typeMapper.readObject(__in, SsoProvider__typeInfo, com.sforce.soap.enterprise.sobject.AuthProvider.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SsoProviderId__typeInfo)) {
      setSsoProviderId((java.lang.String)__typeMapper.readString(__in, SsoProviderId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SsoProviderName__typeInfo)) {
      setSsoProviderName((java.lang.String)__typeMapper.readString(__in, SsoProviderName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ThirdPartyAccountLinkKey__typeInfo)) {
      setThirdPartyAccountLinkKey((java.lang.String)__typeMapper.readString(__in, ThirdPartyAccountLinkKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, User__typeInfo)) {
      setUser((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, User__typeInfo, com.sforce.soap.enterprise.sobject.User.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, UserId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ThirdPartyAccountLink ");
    sb.append(super.toString());
    sb.append(" Handle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Handle)+"'\n");
    sb.append(" IsNotSsoUsable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsNotSsoUsable)+"'\n");
    sb.append(" Provider=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Provider)+"'\n");
    sb.append(" RemoteIdentifier=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RemoteIdentifier)+"'\n");
    sb.append(" SsoProvider=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SsoProvider)+"'\n");
    sb.append(" SsoProviderId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SsoProviderId)+"'\n");
    sb.append(" SsoProviderName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SsoProviderName)+"'\n");
    sb.append(" ThirdPartyAccountLinkKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ThirdPartyAccountLinkKey)+"'\n");
    sb.append(" User=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(User)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}