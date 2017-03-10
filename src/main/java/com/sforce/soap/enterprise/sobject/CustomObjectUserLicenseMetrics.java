package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CustomObjectUserLicenseMetrics extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CustomObjectUserLicenseMetrics() {
  }
    
  
  /**
   * element  : CustomObjectId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomObjectId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomObjectId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CustomObjectId__is_set = false;

  private java.lang.String CustomObjectId;

  public java.lang.String getCustomObjectId() {
    return CustomObjectId;
  }

  

  public void setCustomObjectId(java.lang.String CustomObjectId) {
    this.CustomObjectId = CustomObjectId;
    CustomObjectId__is_set = true;
  }
  
  /**
   * element  : CustomObjectName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomObjectName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomObjectName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CustomObjectName__is_set = false;

  private java.lang.String CustomObjectName;

  public java.lang.String getCustomObjectName() {
    return CustomObjectName;
  }

  

  public void setCustomObjectName(java.lang.String CustomObjectName) {
    this.CustomObjectName = CustomObjectName;
    CustomObjectName__is_set = true;
  }
  
  /**
   * element  : CustomObjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CustomObjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CustomObjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CustomObjectType__is_set = false;

  private java.lang.String CustomObjectType;

  public java.lang.String getCustomObjectType() {
    return CustomObjectType;
  }

  

  public void setCustomObjectType(java.lang.String CustomObjectType) {
    this.CustomObjectType = CustomObjectType;
    CustomObjectType__is_set = true;
  }
  
  /**
   * element  : MetricsDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo MetricsDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MetricsDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean MetricsDate__is_set = false;

  private java.util.Calendar MetricsDate;

  public java.util.Calendar getMetricsDate() {
    return MetricsDate;
  }

  

  public void setMetricsDate(java.util.Calendar MetricsDate) {
    this.MetricsDate = MetricsDate;
    MetricsDate__is_set = true;
  }
  
  /**
   * element  : ObjectCount of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ObjectCount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ObjectCount","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ObjectCount__is_set = false;

  private java.lang.Integer ObjectCount;

  public java.lang.Integer getObjectCount() {
    return ObjectCount;
  }

  

  public void setObjectCount(java.lang.Integer ObjectCount) {
    this.ObjectCount = ObjectCount;
    ObjectCount__is_set = true;
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
   * element  : UserLicense of type {urn:sobject.enterprise.soap.sforce.com}UserLicense
   * java type: com.sforce.soap.enterprise.sobject.UserLicense
   */
  private static final com.sforce.ws.bind.TypeInfo UserLicense__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserLicense","urn:sobject.enterprise.soap.sforce.com","UserLicense",0,1,true);

  private boolean UserLicense__is_set = false;

  private com.sforce.soap.enterprise.sobject.UserLicense UserLicense;

  public com.sforce.soap.enterprise.sobject.UserLicense getUserLicense() {
    return UserLicense;
  }

  

  public void setUserLicense(com.sforce.soap.enterprise.sobject.UserLicense UserLicense) {
    this.UserLicense = UserLicense;
    UserLicense__is_set = true;
  }
  
  /**
   * element  : UserLicenseId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserLicenseId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","UserLicenseId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean UserLicenseId__is_set = false;

  private java.lang.String UserLicenseId;

  public java.lang.String getUserLicenseId() {
    return UserLicenseId;
  }

  

  public void setUserLicenseId(java.lang.String UserLicenseId) {
    this.UserLicenseId = UserLicenseId;
    UserLicenseId__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CustomObjectUserLicenseMetrics");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, CustomObjectId__typeInfo, CustomObjectId, CustomObjectId__is_set);
    __typeMapper.writeString(__out, CustomObjectName__typeInfo, CustomObjectName, CustomObjectName__is_set);
    __typeMapper.writeString(__out, CustomObjectType__typeInfo, CustomObjectType, CustomObjectType__is_set);
    __typeMapper.writeObject(__out, MetricsDate__typeInfo, MetricsDate, MetricsDate__is_set);
    __typeMapper.writeObject(__out, ObjectCount__typeInfo, ObjectCount, ObjectCount__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, UserLicense__typeInfo, UserLicense, UserLicense__is_set);
    __typeMapper.writeString(__out, UserLicenseId__typeInfo, UserLicenseId, UserLicenseId__is_set);
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
    if (__typeMapper.isElement(__in, CustomObjectId__typeInfo)) {
      setCustomObjectId((java.lang.String)__typeMapper.readString(__in, CustomObjectId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomObjectName__typeInfo)) {
      setCustomObjectName((java.lang.String)__typeMapper.readString(__in, CustomObjectName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CustomObjectType__typeInfo)) {
      setCustomObjectType((java.lang.String)__typeMapper.readString(__in, CustomObjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MetricsDate__typeInfo)) {
      setMetricsDate((java.util.Calendar)__typeMapper.readObject(__in, MetricsDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ObjectCount__typeInfo)) {
      setObjectCount((java.lang.Integer)__typeMapper.readObject(__in, ObjectCount__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserLicense__typeInfo)) {
      setUserLicense((com.sforce.soap.enterprise.sobject.UserLicense)__typeMapper.readObject(__in, UserLicense__typeInfo, com.sforce.soap.enterprise.sobject.UserLicense.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UserLicenseId__typeInfo)) {
      setUserLicenseId((java.lang.String)__typeMapper.readString(__in, UserLicenseId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CustomObjectUserLicenseMetrics ");
    sb.append(super.toString());
    sb.append(" CustomObjectId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomObjectId)+"'\n");
    sb.append(" CustomObjectName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomObjectName)+"'\n");
    sb.append(" CustomObjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomObjectType)+"'\n");
    sb.append(" MetricsDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MetricsDate)+"'\n");
    sb.append(" ObjectCount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ObjectCount)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" UserLicense=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserLicense)+"'\n");
    sb.append(" UserLicenseId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserLicenseId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}