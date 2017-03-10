package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class BusinessHours extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public BusinessHours() {
  }
    
  
  /**
   * element  : Cases of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Cases__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Cases","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Cases__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Cases;

  public com.sforce.soap.enterprise.QueryResult getCases() {
    return Cases;
  }

  

  public void setCases(com.sforce.soap.enterprise.QueryResult Cases) {
    this.Cases = Cases;
    Cases__is_set = true;
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
   * element  : FridayEndTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo FridayEndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FridayEndTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean FridayEndTime__is_set = false;

  private com.sforce.ws.types.Time FridayEndTime;

  public com.sforce.ws.types.Time getFridayEndTime() {
    return FridayEndTime;
  }

  

  public void setFridayEndTime(com.sforce.ws.types.Time FridayEndTime) {
    this.FridayEndTime = FridayEndTime;
    FridayEndTime__is_set = true;
  }
  
  /**
   * element  : FridayStartTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo FridayStartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FridayStartTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean FridayStartTime__is_set = false;

  private com.sforce.ws.types.Time FridayStartTime;

  public com.sforce.ws.types.Time getFridayStartTime() {
    return FridayStartTime;
  }

  

  public void setFridayStartTime(com.sforce.ws.types.Time FridayStartTime) {
    this.FridayStartTime = FridayStartTime;
    FridayStartTime__is_set = true;
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
   * element  : IsDefault of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsDefault__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDefault","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsDefault__is_set = false;

  private java.lang.Boolean IsDefault;

  public java.lang.Boolean getIsDefault() {
    return IsDefault;
  }

  

  public void setIsDefault(java.lang.Boolean IsDefault) {
    this.IsDefault = IsDefault;
    IsDefault__is_set = true;
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
   * element  : MondayEndTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo MondayEndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MondayEndTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean MondayEndTime__is_set = false;

  private com.sforce.ws.types.Time MondayEndTime;

  public com.sforce.ws.types.Time getMondayEndTime() {
    return MondayEndTime;
  }

  

  public void setMondayEndTime(com.sforce.ws.types.Time MondayEndTime) {
    this.MondayEndTime = MondayEndTime;
    MondayEndTime__is_set = true;
  }
  
  /**
   * element  : MondayStartTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo MondayStartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","MondayStartTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean MondayStartTime__is_set = false;

  private com.sforce.ws.types.Time MondayStartTime;

  public com.sforce.ws.types.Time getMondayStartTime() {
    return MondayStartTime;
  }

  

  public void setMondayStartTime(com.sforce.ws.types.Time MondayStartTime) {
    this.MondayStartTime = MondayStartTime;
    MondayStartTime__is_set = true;
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
   * element  : SaturdayEndTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo SaturdayEndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SaturdayEndTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean SaturdayEndTime__is_set = false;

  private com.sforce.ws.types.Time SaturdayEndTime;

  public com.sforce.ws.types.Time getSaturdayEndTime() {
    return SaturdayEndTime;
  }

  

  public void setSaturdayEndTime(com.sforce.ws.types.Time SaturdayEndTime) {
    this.SaturdayEndTime = SaturdayEndTime;
    SaturdayEndTime__is_set = true;
  }
  
  /**
   * element  : SaturdayStartTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo SaturdayStartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SaturdayStartTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean SaturdayStartTime__is_set = false;

  private com.sforce.ws.types.Time SaturdayStartTime;

  public com.sforce.ws.types.Time getSaturdayStartTime() {
    return SaturdayStartTime;
  }

  

  public void setSaturdayStartTime(com.sforce.ws.types.Time SaturdayStartTime) {
    this.SaturdayStartTime = SaturdayStartTime;
    SaturdayStartTime__is_set = true;
  }
  
  /**
   * element  : SundayEndTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo SundayEndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SundayEndTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean SundayEndTime__is_set = false;

  private com.sforce.ws.types.Time SundayEndTime;

  public com.sforce.ws.types.Time getSundayEndTime() {
    return SundayEndTime;
  }

  

  public void setSundayEndTime(com.sforce.ws.types.Time SundayEndTime) {
    this.SundayEndTime = SundayEndTime;
    SundayEndTime__is_set = true;
  }
  
  /**
   * element  : SundayStartTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo SundayStartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SundayStartTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean SundayStartTime__is_set = false;

  private com.sforce.ws.types.Time SundayStartTime;

  public com.sforce.ws.types.Time getSundayStartTime() {
    return SundayStartTime;
  }

  

  public void setSundayStartTime(com.sforce.ws.types.Time SundayStartTime) {
    this.SundayStartTime = SundayStartTime;
    SundayStartTime__is_set = true;
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
   * element  : ThursdayEndTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo ThursdayEndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ThursdayEndTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean ThursdayEndTime__is_set = false;

  private com.sforce.ws.types.Time ThursdayEndTime;

  public com.sforce.ws.types.Time getThursdayEndTime() {
    return ThursdayEndTime;
  }

  

  public void setThursdayEndTime(com.sforce.ws.types.Time ThursdayEndTime) {
    this.ThursdayEndTime = ThursdayEndTime;
    ThursdayEndTime__is_set = true;
  }
  
  /**
   * element  : ThursdayStartTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo ThursdayStartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ThursdayStartTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean ThursdayStartTime__is_set = false;

  private com.sforce.ws.types.Time ThursdayStartTime;

  public com.sforce.ws.types.Time getThursdayStartTime() {
    return ThursdayStartTime;
  }

  

  public void setThursdayStartTime(com.sforce.ws.types.Time ThursdayStartTime) {
    this.ThursdayStartTime = ThursdayStartTime;
    ThursdayStartTime__is_set = true;
  }
  
  /**
   * element  : TimeZoneSidKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TimeZoneSidKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimeZoneSidKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TimeZoneSidKey__is_set = false;

  private java.lang.String TimeZoneSidKey;

  public java.lang.String getTimeZoneSidKey() {
    return TimeZoneSidKey;
  }

  

  public void setTimeZoneSidKey(java.lang.String TimeZoneSidKey) {
    this.TimeZoneSidKey = TimeZoneSidKey;
    TimeZoneSidKey__is_set = true;
  }
  
  /**
   * element  : TuesdayEndTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo TuesdayEndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TuesdayEndTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean TuesdayEndTime__is_set = false;

  private com.sforce.ws.types.Time TuesdayEndTime;

  public com.sforce.ws.types.Time getTuesdayEndTime() {
    return TuesdayEndTime;
  }

  

  public void setTuesdayEndTime(com.sforce.ws.types.Time TuesdayEndTime) {
    this.TuesdayEndTime = TuesdayEndTime;
    TuesdayEndTime__is_set = true;
  }
  
  /**
   * element  : TuesdayStartTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo TuesdayStartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TuesdayStartTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean TuesdayStartTime__is_set = false;

  private com.sforce.ws.types.Time TuesdayStartTime;

  public com.sforce.ws.types.Time getTuesdayStartTime() {
    return TuesdayStartTime;
  }

  

  public void setTuesdayStartTime(com.sforce.ws.types.Time TuesdayStartTime) {
    this.TuesdayStartTime = TuesdayStartTime;
    TuesdayStartTime__is_set = true;
  }
  
  /**
   * element  : WednesdayEndTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo WednesdayEndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WednesdayEndTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean WednesdayEndTime__is_set = false;

  private com.sforce.ws.types.Time WednesdayEndTime;

  public com.sforce.ws.types.Time getWednesdayEndTime() {
    return WednesdayEndTime;
  }

  

  public void setWednesdayEndTime(com.sforce.ws.types.Time WednesdayEndTime) {
    this.WednesdayEndTime = WednesdayEndTime;
    WednesdayEndTime__is_set = true;
  }
  
  /**
   * element  : WednesdayStartTime of type {http://www.w3.org/2001/XMLSchema}time
   * java type: com.sforce.ws.types.Time
   */
  private static final com.sforce.ws.bind.TypeInfo WednesdayStartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WednesdayStartTime","http://www.w3.org/2001/XMLSchema","time",0,1,true);

  private boolean WednesdayStartTime__is_set = false;

  private com.sforce.ws.types.Time WednesdayStartTime;

  public com.sforce.ws.types.Time getWednesdayStartTime() {
    return WednesdayStartTime;
  }

  

  public void setWednesdayStartTime(com.sforce.ws.types.Time WednesdayStartTime) {
    this.WednesdayStartTime = WednesdayStartTime;
    WednesdayStartTime__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "BusinessHours");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Cases__typeInfo, Cases, Cases__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, FridayEndTime__typeInfo, FridayEndTime, FridayEndTime__is_set);
    __typeMapper.writeObject(__out, FridayStartTime__typeInfo, FridayStartTime, FridayStartTime__is_set);
    __typeMapper.writeObject(__out, IsActive__typeInfo, IsActive, IsActive__is_set);
    __typeMapper.writeObject(__out, IsDefault__typeInfo, IsDefault, IsDefault__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeObject(__out, MondayEndTime__typeInfo, MondayEndTime, MondayEndTime__is_set);
    __typeMapper.writeObject(__out, MondayStartTime__typeInfo, MondayStartTime, MondayStartTime__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, SaturdayEndTime__typeInfo, SaturdayEndTime, SaturdayEndTime__is_set);
    __typeMapper.writeObject(__out, SaturdayStartTime__typeInfo, SaturdayStartTime, SaturdayStartTime__is_set);
    __typeMapper.writeObject(__out, SundayEndTime__typeInfo, SundayEndTime, SundayEndTime__is_set);
    __typeMapper.writeObject(__out, SundayStartTime__typeInfo, SundayStartTime, SundayStartTime__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeObject(__out, ThursdayEndTime__typeInfo, ThursdayEndTime, ThursdayEndTime__is_set);
    __typeMapper.writeObject(__out, ThursdayStartTime__typeInfo, ThursdayStartTime, ThursdayStartTime__is_set);
    __typeMapper.writeString(__out, TimeZoneSidKey__typeInfo, TimeZoneSidKey, TimeZoneSidKey__is_set);
    __typeMapper.writeObject(__out, TuesdayEndTime__typeInfo, TuesdayEndTime, TuesdayEndTime__is_set);
    __typeMapper.writeObject(__out, TuesdayStartTime__typeInfo, TuesdayStartTime, TuesdayStartTime__is_set);
    __typeMapper.writeObject(__out, WednesdayEndTime__typeInfo, WednesdayEndTime, WednesdayEndTime__is_set);
    __typeMapper.writeObject(__out, WednesdayStartTime__typeInfo, WednesdayStartTime, WednesdayStartTime__is_set);
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
    if (__typeMapper.isElement(__in, Cases__typeInfo)) {
      setCases((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Cases__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
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
    if (__typeMapper.isElement(__in, FridayEndTime__typeInfo)) {
      setFridayEndTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, FridayEndTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FridayStartTime__typeInfo)) {
      setFridayStartTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, FridayStartTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsActive__typeInfo)) {
      setIsActive((java.lang.Boolean)__typeMapper.readObject(__in, IsActive__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsDefault__typeInfo)) {
      setIsDefault((java.lang.Boolean)__typeMapper.readObject(__in, IsDefault__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, MondayEndTime__typeInfo)) {
      setMondayEndTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, MondayEndTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MondayStartTime__typeInfo)) {
      setMondayStartTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, MondayStartTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SaturdayEndTime__typeInfo)) {
      setSaturdayEndTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, SaturdayEndTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SaturdayStartTime__typeInfo)) {
      setSaturdayStartTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, SaturdayStartTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SundayEndTime__typeInfo)) {
      setSundayEndTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, SundayEndTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SundayStartTime__typeInfo)) {
      setSundayStartTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, SundayStartTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ThursdayEndTime__typeInfo)) {
      setThursdayEndTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, ThursdayEndTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ThursdayStartTime__typeInfo)) {
      setThursdayStartTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, ThursdayStartTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TimeZoneSidKey__typeInfo)) {
      setTimeZoneSidKey((java.lang.String)__typeMapper.readString(__in, TimeZoneSidKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TuesdayEndTime__typeInfo)) {
      setTuesdayEndTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, TuesdayEndTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TuesdayStartTime__typeInfo)) {
      setTuesdayStartTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, TuesdayStartTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WednesdayEndTime__typeInfo)) {
      setWednesdayEndTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, WednesdayEndTime__typeInfo, com.sforce.ws.types.Time.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WednesdayStartTime__typeInfo)) {
      setWednesdayStartTime((com.sforce.ws.types.Time)__typeMapper.readObject(__in, WednesdayStartTime__typeInfo, com.sforce.ws.types.Time.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[BusinessHours ");
    sb.append(super.toString());
    sb.append(" Cases=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Cases)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" FridayEndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FridayEndTime)+"'\n");
    sb.append(" FridayStartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FridayStartTime)+"'\n");
    sb.append(" IsActive=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsActive)+"'\n");
    sb.append(" IsDefault=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDefault)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" MondayEndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MondayEndTime)+"'\n");
    sb.append(" MondayStartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MondayStartTime)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" SaturdayEndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SaturdayEndTime)+"'\n");
    sb.append(" SaturdayStartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SaturdayStartTime)+"'\n");
    sb.append(" SundayEndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SundayEndTime)+"'\n");
    sb.append(" SundayStartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SundayStartTime)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" ThursdayEndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ThursdayEndTime)+"'\n");
    sb.append(" ThursdayStartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ThursdayStartTime)+"'\n");
    sb.append(" TimeZoneSidKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TimeZoneSidKey)+"'\n");
    sb.append(" TuesdayEndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TuesdayEndTime)+"'\n");
    sb.append(" TuesdayStartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TuesdayStartTime)+"'\n");
    sb.append(" WednesdayEndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WednesdayEndTime)+"'\n");
    sb.append(" WednesdayStartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WednesdayStartTime)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}