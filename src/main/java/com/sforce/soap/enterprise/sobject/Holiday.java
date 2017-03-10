package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Holiday extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Holiday() {
  }
    
  
  /**
   * element  : ActivityDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ActivityDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ActivityDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean ActivityDate__is_set = false;

  private java.util.Calendar ActivityDate;

  public java.util.Calendar getActivityDate() {
    return ActivityDate;
  }

  

  public void setActivityDate(java.util.Calendar ActivityDate) {
    this.ActivityDate = ActivityDate;
    ActivityDate__is_set = true;
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
   * element  : Description of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Description__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Description__is_set = false;

  private java.lang.String Description;

  public java.lang.String getDescription() {
    return Description;
  }

  

  public void setDescription(java.lang.String Description) {
    this.Description = Description;
    Description__is_set = true;
  }
  
  /**
   * element  : EndTimeInMinutes of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo EndTimeInMinutes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EndTimeInMinutes","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean EndTimeInMinutes__is_set = false;

  private java.lang.Integer EndTimeInMinutes;

  public java.lang.Integer getEndTimeInMinutes() {
    return EndTimeInMinutes;
  }

  

  public void setEndTimeInMinutes(java.lang.Integer EndTimeInMinutes) {
    this.EndTimeInMinutes = EndTimeInMinutes;
    EndTimeInMinutes__is_set = true;
  }
  
  /**
   * element  : IsAllDay of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsAllDay__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsAllDay","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsAllDay__is_set = false;

  private java.lang.Boolean IsAllDay;

  public java.lang.Boolean getIsAllDay() {
    return IsAllDay;
  }

  

  public void setIsAllDay(java.lang.Boolean IsAllDay) {
    this.IsAllDay = IsAllDay;
    IsAllDay__is_set = true;
  }
  
  /**
   * element  : IsRecurrence of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsRecurrence__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsRecurrence","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsRecurrence__is_set = false;

  private java.lang.Boolean IsRecurrence;

  public java.lang.Boolean getIsRecurrence() {
    return IsRecurrence;
  }

  

  public void setIsRecurrence(java.lang.Boolean IsRecurrence) {
    this.IsRecurrence = IsRecurrence;
    IsRecurrence__is_set = true;
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
   * element  : RecurrenceDayOfMonth of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceDayOfMonth__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceDayOfMonth","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RecurrenceDayOfMonth__is_set = false;

  private java.lang.Integer RecurrenceDayOfMonth;

  public java.lang.Integer getRecurrenceDayOfMonth() {
    return RecurrenceDayOfMonth;
  }

  

  public void setRecurrenceDayOfMonth(java.lang.Integer RecurrenceDayOfMonth) {
    this.RecurrenceDayOfMonth = RecurrenceDayOfMonth;
    RecurrenceDayOfMonth__is_set = true;
  }
  
  /**
   * element  : RecurrenceDayOfWeekMask of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceDayOfWeekMask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceDayOfWeekMask","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RecurrenceDayOfWeekMask__is_set = false;

  private java.lang.Integer RecurrenceDayOfWeekMask;

  public java.lang.Integer getRecurrenceDayOfWeekMask() {
    return RecurrenceDayOfWeekMask;
  }

  

  public void setRecurrenceDayOfWeekMask(java.lang.Integer RecurrenceDayOfWeekMask) {
    this.RecurrenceDayOfWeekMask = RecurrenceDayOfWeekMask;
    RecurrenceDayOfWeekMask__is_set = true;
  }
  
  /**
   * element  : RecurrenceEndDateOnly of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceEndDateOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceEndDateOnly","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean RecurrenceEndDateOnly__is_set = false;

  private java.util.Calendar RecurrenceEndDateOnly;

  public java.util.Calendar getRecurrenceEndDateOnly() {
    return RecurrenceEndDateOnly;
  }

  

  public void setRecurrenceEndDateOnly(java.util.Calendar RecurrenceEndDateOnly) {
    this.RecurrenceEndDateOnly = RecurrenceEndDateOnly;
    RecurrenceEndDateOnly__is_set = true;
  }
  
  /**
   * element  : RecurrenceInstance of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceInstance__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceInstance","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceInstance__is_set = false;

  private java.lang.String RecurrenceInstance;

  public java.lang.String getRecurrenceInstance() {
    return RecurrenceInstance;
  }

  

  public void setRecurrenceInstance(java.lang.String RecurrenceInstance) {
    this.RecurrenceInstance = RecurrenceInstance;
    RecurrenceInstance__is_set = true;
  }
  
  /**
   * element  : RecurrenceInterval of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceInterval__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceInterval","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean RecurrenceInterval__is_set = false;

  private java.lang.Integer RecurrenceInterval;

  public java.lang.Integer getRecurrenceInterval() {
    return RecurrenceInterval;
  }

  

  public void setRecurrenceInterval(java.lang.Integer RecurrenceInterval) {
    this.RecurrenceInterval = RecurrenceInterval;
    RecurrenceInterval__is_set = true;
  }
  
  /**
   * element  : RecurrenceMonthOfYear of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceMonthOfYear__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceMonthOfYear","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceMonthOfYear__is_set = false;

  private java.lang.String RecurrenceMonthOfYear;

  public java.lang.String getRecurrenceMonthOfYear() {
    return RecurrenceMonthOfYear;
  }

  

  public void setRecurrenceMonthOfYear(java.lang.String RecurrenceMonthOfYear) {
    this.RecurrenceMonthOfYear = RecurrenceMonthOfYear;
    RecurrenceMonthOfYear__is_set = true;
  }
  
  /**
   * element  : RecurrenceStartDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceStartDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceStartDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean RecurrenceStartDate__is_set = false;

  private java.util.Calendar RecurrenceStartDate;

  public java.util.Calendar getRecurrenceStartDate() {
    return RecurrenceStartDate;
  }

  

  public void setRecurrenceStartDate(java.util.Calendar RecurrenceStartDate) {
    this.RecurrenceStartDate = RecurrenceStartDate;
    RecurrenceStartDate__is_set = true;
  }
  
  /**
   * element  : RecurrenceType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RecurrenceType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","RecurrenceType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean RecurrenceType__is_set = false;

  private java.lang.String RecurrenceType;

  public java.lang.String getRecurrenceType() {
    return RecurrenceType;
  }

  

  public void setRecurrenceType(java.lang.String RecurrenceType) {
    this.RecurrenceType = RecurrenceType;
    RecurrenceType__is_set = true;
  }
  
  /**
   * element  : StartTimeInMinutes of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo StartTimeInMinutes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartTimeInMinutes","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean StartTimeInMinutes__is_set = false;

  private java.lang.Integer StartTimeInMinutes;

  public java.lang.Integer getStartTimeInMinutes() {
    return StartTimeInMinutes;
  }

  

  public void setStartTimeInMinutes(java.lang.Integer StartTimeInMinutes) {
    this.StartTimeInMinutes = StartTimeInMinutes;
    StartTimeInMinutes__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Holiday");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, ActivityDate__typeInfo, ActivityDate, ActivityDate__is_set);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, EndTimeInMinutes__typeInfo, EndTimeInMinutes, EndTimeInMinutes__is_set);
    __typeMapper.writeObject(__out, IsAllDay__typeInfo, IsAllDay, IsAllDay__is_set);
    __typeMapper.writeObject(__out, IsRecurrence__typeInfo, IsRecurrence, IsRecurrence__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, RecurrenceDayOfMonth__typeInfo, RecurrenceDayOfMonth, RecurrenceDayOfMonth__is_set);
    __typeMapper.writeObject(__out, RecurrenceDayOfWeekMask__typeInfo, RecurrenceDayOfWeekMask, RecurrenceDayOfWeekMask__is_set);
    __typeMapper.writeObject(__out, RecurrenceEndDateOnly__typeInfo, RecurrenceEndDateOnly, RecurrenceEndDateOnly__is_set);
    __typeMapper.writeString(__out, RecurrenceInstance__typeInfo, RecurrenceInstance, RecurrenceInstance__is_set);
    __typeMapper.writeObject(__out, RecurrenceInterval__typeInfo, RecurrenceInterval, RecurrenceInterval__is_set);
    __typeMapper.writeString(__out, RecurrenceMonthOfYear__typeInfo, RecurrenceMonthOfYear, RecurrenceMonthOfYear__is_set);
    __typeMapper.writeObject(__out, RecurrenceStartDate__typeInfo, RecurrenceStartDate, RecurrenceStartDate__is_set);
    __typeMapper.writeString(__out, RecurrenceType__typeInfo, RecurrenceType, RecurrenceType__is_set);
    __typeMapper.writeObject(__out, StartTimeInMinutes__typeInfo, StartTimeInMinutes, StartTimeInMinutes__is_set);
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
    if (__typeMapper.isElement(__in, ActivityDate__typeInfo)) {
      setActivityDate((java.util.Calendar)__typeMapper.readObject(__in, ActivityDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndTimeInMinutes__typeInfo)) {
      setEndTimeInMinutes((java.lang.Integer)__typeMapper.readObject(__in, EndTimeInMinutes__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsAllDay__typeInfo)) {
      setIsAllDay((java.lang.Boolean)__typeMapper.readObject(__in, IsAllDay__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsRecurrence__typeInfo)) {
      setIsRecurrence((java.lang.Boolean)__typeMapper.readObject(__in, IsRecurrence__typeInfo, java.lang.Boolean.class));
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
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceDayOfMonth__typeInfo)) {
      setRecurrenceDayOfMonth((java.lang.Integer)__typeMapper.readObject(__in, RecurrenceDayOfMonth__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceDayOfWeekMask__typeInfo)) {
      setRecurrenceDayOfWeekMask((java.lang.Integer)__typeMapper.readObject(__in, RecurrenceDayOfWeekMask__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceEndDateOnly__typeInfo)) {
      setRecurrenceEndDateOnly((java.util.Calendar)__typeMapper.readObject(__in, RecurrenceEndDateOnly__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceInstance__typeInfo)) {
      setRecurrenceInstance((java.lang.String)__typeMapper.readString(__in, RecurrenceInstance__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceInterval__typeInfo)) {
      setRecurrenceInterval((java.lang.Integer)__typeMapper.readObject(__in, RecurrenceInterval__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceMonthOfYear__typeInfo)) {
      setRecurrenceMonthOfYear((java.lang.String)__typeMapper.readString(__in, RecurrenceMonthOfYear__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceStartDate__typeInfo)) {
      setRecurrenceStartDate((java.util.Calendar)__typeMapper.readObject(__in, RecurrenceStartDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RecurrenceType__typeInfo)) {
      setRecurrenceType((java.lang.String)__typeMapper.readString(__in, RecurrenceType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartTimeInMinutes__typeInfo)) {
      setStartTimeInMinutes((java.lang.Integer)__typeMapper.readObject(__in, StartTimeInMinutes__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Holiday ");
    sb.append(super.toString());
    sb.append(" ActivityDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ActivityDate)+"'\n");
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" EndTimeInMinutes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndTimeInMinutes)+"'\n");
    sb.append(" IsAllDay=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsAllDay)+"'\n");
    sb.append(" IsRecurrence=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsRecurrence)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" RecurrenceDayOfMonth=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceDayOfMonth)+"'\n");
    sb.append(" RecurrenceDayOfWeekMask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceDayOfWeekMask)+"'\n");
    sb.append(" RecurrenceEndDateOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceEndDateOnly)+"'\n");
    sb.append(" RecurrenceInstance=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceInstance)+"'\n");
    sb.append(" RecurrenceInterval=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceInterval)+"'\n");
    sb.append(" RecurrenceMonthOfYear=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceMonthOfYear)+"'\n");
    sb.append(" RecurrenceStartDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceStartDate)+"'\n");
    sb.append(" RecurrenceType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RecurrenceType)+"'\n");
    sb.append(" StartTimeInMinutes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartTimeInMinutes)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}