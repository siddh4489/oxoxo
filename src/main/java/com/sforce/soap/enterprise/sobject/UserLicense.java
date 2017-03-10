package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class UserLicense extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public UserLicense() {
  }
    
  
  /**
   * element  : LicenseDefinitionKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LicenseDefinitionKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LicenseDefinitionKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LicenseDefinitionKey__is_set = false;

  private java.lang.String LicenseDefinitionKey;

  public java.lang.String getLicenseDefinitionKey() {
    return LicenseDefinitionKey;
  }

  

  public void setLicenseDefinitionKey(java.lang.String LicenseDefinitionKey) {
    this.LicenseDefinitionKey = LicenseDefinitionKey;
    LicenseDefinitionKey__is_set = true;
  }
  
  /**
   * element  : MonthlyLoginsEntitlement of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MonthlyLoginsEntitlement__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MonthlyLoginsEntitlement","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MonthlyLoginsEntitlement__is_set = false;

  private java.lang.Integer MonthlyLoginsEntitlement;

  public java.lang.Integer getMonthlyLoginsEntitlement() {
    return MonthlyLoginsEntitlement;
  }

  

  public void setMonthlyLoginsEntitlement(java.lang.Integer MonthlyLoginsEntitlement) {
    this.MonthlyLoginsEntitlement = MonthlyLoginsEntitlement;
    MonthlyLoginsEntitlement__is_set = true;
  }
  
  /**
   * element  : MonthlyLoginsUsed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo MonthlyLoginsUsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MonthlyLoginsUsed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean MonthlyLoginsUsed__is_set = false;

  private java.lang.Integer MonthlyLoginsUsed;

  public java.lang.Integer getMonthlyLoginsUsed() {
    return MonthlyLoginsUsed;
  }

  

  public void setMonthlyLoginsUsed(java.lang.Integer MonthlyLoginsUsed) {
    this.MonthlyLoginsUsed = MonthlyLoginsUsed;
    MonthlyLoginsUsed__is_set = true;
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
   * element  : userlicenses of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo userlicenses__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","userlicenses","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean userlicenses__is_set = false;

  private com.sforce.soap.enterprise.QueryResult userlicenses;

  public com.sforce.soap.enterprise.QueryResult getUserlicenses() {
    return userlicenses;
  }

  

  public void setUserlicenses(com.sforce.soap.enterprise.QueryResult userlicenses) {
    this.userlicenses = userlicenses;
    userlicenses__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "UserLicense");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, LicenseDefinitionKey__typeInfo, LicenseDefinitionKey, LicenseDefinitionKey__is_set);
    __typeMapper.writeObject(__out, MonthlyLoginsEntitlement__typeInfo, MonthlyLoginsEntitlement, MonthlyLoginsEntitlement__is_set);
    __typeMapper.writeObject(__out, MonthlyLoginsUsed__typeInfo, MonthlyLoginsUsed, MonthlyLoginsUsed__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, userlicenses__typeInfo, userlicenses, userlicenses__is_set);
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
    if (__typeMapper.isElement(__in, LicenseDefinitionKey__typeInfo)) {
      setLicenseDefinitionKey((java.lang.String)__typeMapper.readString(__in, LicenseDefinitionKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MonthlyLoginsEntitlement__typeInfo)) {
      setMonthlyLoginsEntitlement((java.lang.Integer)__typeMapper.readObject(__in, MonthlyLoginsEntitlement__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MonthlyLoginsUsed__typeInfo)) {
      setMonthlyLoginsUsed((java.lang.Integer)__typeMapper.readObject(__in, MonthlyLoginsUsed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, userlicenses__typeInfo)) {
      setUserlicenses((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, userlicenses__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UserLicense ");
    sb.append(super.toString());
    sb.append(" LicenseDefinitionKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LicenseDefinitionKey)+"'\n");
    sb.append(" MonthlyLoginsEntitlement=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MonthlyLoginsEntitlement)+"'\n");
    sb.append(" MonthlyLoginsUsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MonthlyLoginsUsed)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" userlicenses=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(userlicenses)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}