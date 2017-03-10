package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class LoginHistory extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public LoginHistory() {
  }
    
  
  /**
   * element  : ApiType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApiType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApiType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ApiType__is_set = false;

  private java.lang.String ApiType;

  public java.lang.String getApiType() {
    return ApiType;
  }

  

  public void setApiType(java.lang.String ApiType) {
    this.ApiType = ApiType;
    ApiType__is_set = true;
  }
  
  /**
   * element  : ApiVersion of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ApiVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ApiVersion","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ApiVersion__is_set = false;

  private java.lang.String ApiVersion;

  public java.lang.String getApiVersion() {
    return ApiVersion;
  }

  

  public void setApiVersion(java.lang.String ApiVersion) {
    this.ApiVersion = ApiVersion;
    ApiVersion__is_set = true;
  }
  
  /**
   * element  : Application of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Application__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Application","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Application__is_set = false;

  private java.lang.String Application;

  public java.lang.String getApplication() {
    return Application;
  }

  

  public void setApplication(java.lang.String Application) {
    this.Application = Application;
    Application__is_set = true;
  }
  
  /**
   * element  : AuthenticationServiceId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AuthenticationServiceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AuthenticationServiceId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AuthenticationServiceId__is_set = false;

  private java.lang.String AuthenticationServiceId;

  public java.lang.String getAuthenticationServiceId() {
    return AuthenticationServiceId;
  }

  

  public void setAuthenticationServiceId(java.lang.String AuthenticationServiceId) {
    this.AuthenticationServiceId = AuthenticationServiceId;
    AuthenticationServiceId__is_set = true;
  }
  
  /**
   * element  : Browser of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Browser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Browser","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Browser__is_set = false;

  private java.lang.String Browser;

  public java.lang.String getBrowser() {
    return Browser;
  }

  

  public void setBrowser(java.lang.String Browser) {
    this.Browser = Browser;
    Browser__is_set = true;
  }
  
  /**
   * element  : CipherSuite of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CipherSuite__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CipherSuite","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CipherSuite__is_set = false;

  private java.lang.String CipherSuite;

  public java.lang.String getCipherSuite() {
    return CipherSuite;
  }

  

  public void setCipherSuite(java.lang.String CipherSuite) {
    this.CipherSuite = CipherSuite;
    CipherSuite__is_set = true;
  }
  
  /**
   * element  : ClientVersion of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ClientVersion__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ClientVersion","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ClientVersion__is_set = false;

  private java.lang.String ClientVersion;

  public java.lang.String getClientVersion() {
    return ClientVersion;
  }

  

  public void setClientVersion(java.lang.String ClientVersion) {
    this.ClientVersion = ClientVersion;
    ClientVersion__is_set = true;
  }
  
  /**
   * element  : CountryIso of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CountryIso__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CountryIso","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CountryIso__is_set = false;

  private java.lang.String CountryIso;

  public java.lang.String getCountryIso() {
    return CountryIso;
  }

  

  public void setCountryIso(java.lang.String CountryIso) {
    this.CountryIso = CountryIso;
    CountryIso__is_set = true;
  }
  
  /**
   * element  : LoginGeo of type {urn:sobject.enterprise.soap.sforce.com}LoginGeo
   * java type: com.sforce.soap.enterprise.sobject.LoginGeo
   */
  private static final com.sforce.ws.bind.TypeInfo LoginGeo__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginGeo","urn:sobject.enterprise.soap.sforce.com","LoginGeo",0,1,true);

  private boolean LoginGeo__is_set = false;

  private com.sforce.soap.enterprise.sobject.LoginGeo LoginGeo;

  public com.sforce.soap.enterprise.sobject.LoginGeo getLoginGeo() {
    return LoginGeo;
  }

  

  public void setLoginGeo(com.sforce.soap.enterprise.sobject.LoginGeo LoginGeo) {
    this.LoginGeo = LoginGeo;
    LoginGeo__is_set = true;
  }
  
  /**
   * element  : LoginGeoId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LoginGeoId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginGeoId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LoginGeoId__is_set = false;

  private java.lang.String LoginGeoId;

  public java.lang.String getLoginGeoId() {
    return LoginGeoId;
  }

  

  public void setLoginGeoId(java.lang.String LoginGeoId) {
    this.LoginGeoId = LoginGeoId;
    LoginGeoId__is_set = true;
  }
  
  /**
   * element  : LoginTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LoginTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LoginTime__is_set = false;

  private java.util.Calendar LoginTime;

  public java.util.Calendar getLoginTime() {
    return LoginTime;
  }

  

  public void setLoginTime(java.util.Calendar LoginTime) {
    this.LoginTime = LoginTime;
    LoginTime__is_set = true;
  }
  
  /**
   * element  : LoginType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LoginType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LoginType__is_set = false;

  private java.lang.String LoginType;

  public java.lang.String getLoginType() {
    return LoginType;
  }

  

  public void setLoginType(java.lang.String LoginType) {
    this.LoginType = LoginType;
    LoginType__is_set = true;
  }
  
  /**
   * element  : LoginUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LoginUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LoginUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LoginUrl__is_set = false;

  private java.lang.String LoginUrl;

  public java.lang.String getLoginUrl() {
    return LoginUrl;
  }

  

  public void setLoginUrl(java.lang.String LoginUrl) {
    this.LoginUrl = LoginUrl;
    LoginUrl__is_set = true;
  }
  
  /**
   * element  : Platform of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Platform__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Platform","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Platform__is_set = false;

  private java.lang.String Platform;

  public java.lang.String getPlatform() {
    return Platform;
  }

  

  public void setPlatform(java.lang.String Platform) {
    this.Platform = Platform;
    Platform__is_set = true;
  }
  
  /**
   * element  : SourceIp of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SourceIp__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SourceIp","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SourceIp__is_set = false;

  private java.lang.String SourceIp;

  public java.lang.String getSourceIp() {
    return SourceIp;
  }

  

  public void setSourceIp(java.lang.String SourceIp) {
    this.SourceIp = SourceIp;
    SourceIp__is_set = true;
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
   * element  : TlsProtocol of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TlsProtocol__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TlsProtocol","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TlsProtocol__is_set = false;

  private java.lang.String TlsProtocol;

  public java.lang.String getTlsProtocol() {
    return TlsProtocol;
  }

  

  public void setTlsProtocol(java.lang.String TlsProtocol) {
    this.TlsProtocol = TlsProtocol;
    TlsProtocol__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "LoginHistory");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ApiType__typeInfo, ApiType, ApiType__is_set);
    __typeMapper.writeString(__out, ApiVersion__typeInfo, ApiVersion, ApiVersion__is_set);
    __typeMapper.writeString(__out, Application__typeInfo, Application, Application__is_set);
    __typeMapper.writeString(__out, AuthenticationServiceId__typeInfo, AuthenticationServiceId, AuthenticationServiceId__is_set);
    __typeMapper.writeString(__out, Browser__typeInfo, Browser, Browser__is_set);
    __typeMapper.writeString(__out, CipherSuite__typeInfo, CipherSuite, CipherSuite__is_set);
    __typeMapper.writeString(__out, ClientVersion__typeInfo, ClientVersion, ClientVersion__is_set);
    __typeMapper.writeString(__out, CountryIso__typeInfo, CountryIso, CountryIso__is_set);
    __typeMapper.writeObject(__out, LoginGeo__typeInfo, LoginGeo, LoginGeo__is_set);
    __typeMapper.writeString(__out, LoginGeoId__typeInfo, LoginGeoId, LoginGeoId__is_set);
    __typeMapper.writeObject(__out, LoginTime__typeInfo, LoginTime, LoginTime__is_set);
    __typeMapper.writeString(__out, LoginType__typeInfo, LoginType, LoginType__is_set);
    __typeMapper.writeString(__out, LoginUrl__typeInfo, LoginUrl, LoginUrl__is_set);
    __typeMapper.writeString(__out, Platform__typeInfo, Platform, Platform__is_set);
    __typeMapper.writeString(__out, SourceIp__typeInfo, SourceIp, SourceIp__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, TlsProtocol__typeInfo, TlsProtocol, TlsProtocol__is_set);
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
    if (__typeMapper.isElement(__in, ApiType__typeInfo)) {
      setApiType((java.lang.String)__typeMapper.readString(__in, ApiType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ApiVersion__typeInfo)) {
      setApiVersion((java.lang.String)__typeMapper.readString(__in, ApiVersion__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Application__typeInfo)) {
      setApplication((java.lang.String)__typeMapper.readString(__in, Application__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AuthenticationServiceId__typeInfo)) {
      setAuthenticationServiceId((java.lang.String)__typeMapper.readString(__in, AuthenticationServiceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Browser__typeInfo)) {
      setBrowser((java.lang.String)__typeMapper.readString(__in, Browser__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CipherSuite__typeInfo)) {
      setCipherSuite((java.lang.String)__typeMapper.readString(__in, CipherSuite__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ClientVersion__typeInfo)) {
      setClientVersion((java.lang.String)__typeMapper.readString(__in, ClientVersion__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CountryIso__typeInfo)) {
      setCountryIso((java.lang.String)__typeMapper.readString(__in, CountryIso__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginGeo__typeInfo)) {
      setLoginGeo((com.sforce.soap.enterprise.sobject.LoginGeo)__typeMapper.readObject(__in, LoginGeo__typeInfo, com.sforce.soap.enterprise.sobject.LoginGeo.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginGeoId__typeInfo)) {
      setLoginGeoId((java.lang.String)__typeMapper.readString(__in, LoginGeoId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginTime__typeInfo)) {
      setLoginTime((java.util.Calendar)__typeMapper.readObject(__in, LoginTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginType__typeInfo)) {
      setLoginType((java.lang.String)__typeMapper.readString(__in, LoginType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LoginUrl__typeInfo)) {
      setLoginUrl((java.lang.String)__typeMapper.readString(__in, LoginUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Platform__typeInfo)) {
      setPlatform((java.lang.String)__typeMapper.readString(__in, Platform__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SourceIp__typeInfo)) {
      setSourceIp((java.lang.String)__typeMapper.readString(__in, SourceIp__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TlsProtocol__typeInfo)) {
      setTlsProtocol((java.lang.String)__typeMapper.readString(__in, TlsProtocol__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, UserId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LoginHistory ");
    sb.append(super.toString());
    sb.append(" ApiType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApiType)+"'\n");
    sb.append(" ApiVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ApiVersion)+"'\n");
    sb.append(" Application=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Application)+"'\n");
    sb.append(" AuthenticationServiceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AuthenticationServiceId)+"'\n");
    sb.append(" Browser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Browser)+"'\n");
    sb.append(" CipherSuite=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CipherSuite)+"'\n");
    sb.append(" ClientVersion=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ClientVersion)+"'\n");
    sb.append(" CountryIso=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CountryIso)+"'\n");
    sb.append(" LoginGeo=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginGeo)+"'\n");
    sb.append(" LoginGeoId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginGeoId)+"'\n");
    sb.append(" LoginTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginTime)+"'\n");
    sb.append(" LoginType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginType)+"'\n");
    sb.append(" LoginUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LoginUrl)+"'\n");
    sb.append(" Platform=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Platform)+"'\n");
    sb.append(" SourceIp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceIp)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" TlsProtocol=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TlsProtocol)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}