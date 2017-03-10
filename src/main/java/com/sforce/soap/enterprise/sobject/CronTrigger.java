package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class CronTrigger extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public CronTrigger() {
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
   * element  : CronExpression of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CronExpression__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CronExpression","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CronExpression__is_set = false;

  private java.lang.String CronExpression;

  public java.lang.String getCronExpression() {
    return CronExpression;
  }

  

  public void setCronExpression(java.lang.String CronExpression) {
    this.CronExpression = CronExpression;
    CronExpression__is_set = true;
  }
  
  /**
   * element  : CronJobDetail of type {urn:sobject.enterprise.soap.sforce.com}CronJobDetail
   * java type: com.sforce.soap.enterprise.sobject.CronJobDetail
   */
  private static final com.sforce.ws.bind.TypeInfo CronJobDetail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CronJobDetail","urn:sobject.enterprise.soap.sforce.com","CronJobDetail",0,1,true);

  private boolean CronJobDetail__is_set = false;

  private com.sforce.soap.enterprise.sobject.CronJobDetail CronJobDetail;

  public com.sforce.soap.enterprise.sobject.CronJobDetail getCronJobDetail() {
    return CronJobDetail;
  }

  

  public void setCronJobDetail(com.sforce.soap.enterprise.sobject.CronJobDetail CronJobDetail) {
    this.CronJobDetail = CronJobDetail;
    CronJobDetail__is_set = true;
  }
  
  /**
   * element  : CronJobDetailId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CronJobDetailId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CronJobDetailId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean CronJobDetailId__is_set = false;

  private java.lang.String CronJobDetailId;

  public java.lang.String getCronJobDetailId() {
    return CronJobDetailId;
  }

  

  public void setCronJobDetailId(java.lang.String CronJobDetailId) {
    this.CronJobDetailId = CronJobDetailId;
    CronJobDetailId__is_set = true;
  }
  
  /**
   * element  : EndTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EndTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EndTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean EndTime__is_set = false;

  private java.util.Calendar EndTime;

  public java.util.Calendar getEndTime() {
    return EndTime;
  }

  

  public void setEndTime(java.util.Calendar EndTime) {
    this.EndTime = EndTime;
    EndTime__is_set = true;
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
   * element  : NextFireTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo NextFireTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","NextFireTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean NextFireTime__is_set = false;

  private java.util.Calendar NextFireTime;

  public java.util.Calendar getNextFireTime() {
    return NextFireTime;
  }

  

  public void setNextFireTime(java.util.Calendar NextFireTime) {
    this.NextFireTime = NextFireTime;
    NextFireTime__is_set = true;
  }
  
  /**
   * element  : OwnerId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo OwnerId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","OwnerId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean OwnerId__is_set = false;

  private java.lang.String OwnerId;

  public java.lang.String getOwnerId() {
    return OwnerId;
  }

  

  public void setOwnerId(java.lang.String OwnerId) {
    this.OwnerId = OwnerId;
    OwnerId__is_set = true;
  }
  
  /**
   * element  : PreviousFireTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo PreviousFireTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PreviousFireTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean PreviousFireTime__is_set = false;

  private java.util.Calendar PreviousFireTime;

  public java.util.Calendar getPreviousFireTime() {
    return PreviousFireTime;
  }

  

  public void setPreviousFireTime(java.util.Calendar PreviousFireTime) {
    this.PreviousFireTime = PreviousFireTime;
    PreviousFireTime__is_set = true;
  }
  
  /**
   * element  : StartTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo StartTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean StartTime__is_set = false;

  private java.util.Calendar StartTime;

  public java.util.Calendar getStartTime() {
    return StartTime;
  }

  

  public void setStartTime(java.util.Calendar StartTime) {
    this.StartTime = StartTime;
    StartTime__is_set = true;
  }
  
  /**
   * element  : State of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo State__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","State","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean State__is_set = false;

  private java.lang.String State;

  public java.lang.String getState() {
    return State;
  }

  

  public void setState(java.lang.String State) {
    this.State = State;
    State__is_set = true;
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
   * element  : TimesTriggered of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo TimesTriggered__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","TimesTriggered","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean TimesTriggered__is_set = false;

  private java.lang.Integer TimesTriggered;

  public java.lang.Integer getTimesTriggered() {
    return TimesTriggered;
  }

  

  public void setTimesTriggered(java.lang.Integer TimesTriggered) {
    this.TimesTriggered = TimesTriggered;
    TimesTriggered__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "CronTrigger");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CronExpression__typeInfo, CronExpression, CronExpression__is_set);
    __typeMapper.writeObject(__out, CronJobDetail__typeInfo, CronJobDetail, CronJobDetail__is_set);
    __typeMapper.writeString(__out, CronJobDetailId__typeInfo, CronJobDetailId, CronJobDetailId__is_set);
    __typeMapper.writeObject(__out, EndTime__typeInfo, EndTime, EndTime__is_set);
    __typeMapper.writeObject(__out, LastModifiedBy__typeInfo, LastModifiedBy, LastModifiedBy__is_set);
    __typeMapper.writeString(__out, LastModifiedById__typeInfo, LastModifiedById, LastModifiedById__is_set);
    __typeMapper.writeObject(__out, NextFireTime__typeInfo, NextFireTime, NextFireTime__is_set);
    __typeMapper.writeString(__out, OwnerId__typeInfo, OwnerId, OwnerId__is_set);
    __typeMapper.writeObject(__out, PreviousFireTime__typeInfo, PreviousFireTime, PreviousFireTime__is_set);
    __typeMapper.writeObject(__out, StartTime__typeInfo, StartTime, StartTime__is_set);
    __typeMapper.writeString(__out, State__typeInfo, State, State__is_set);
    __typeMapper.writeString(__out, TimeZoneSidKey__typeInfo, TimeZoneSidKey, TimeZoneSidKey__is_set);
    __typeMapper.writeObject(__out, TimesTriggered__typeInfo, TimesTriggered, TimesTriggered__is_set);
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
    if (__typeMapper.isElement(__in, CronExpression__typeInfo)) {
      setCronExpression((java.lang.String)__typeMapper.readString(__in, CronExpression__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CronJobDetail__typeInfo)) {
      setCronJobDetail((com.sforce.soap.enterprise.sobject.CronJobDetail)__typeMapper.readObject(__in, CronJobDetail__typeInfo, com.sforce.soap.enterprise.sobject.CronJobDetail.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CronJobDetailId__typeInfo)) {
      setCronJobDetailId((java.lang.String)__typeMapper.readString(__in, CronJobDetailId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndTime__typeInfo)) {
      setEndTime((java.util.Calendar)__typeMapper.readObject(__in, EndTime__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, NextFireTime__typeInfo)) {
      setNextFireTime((java.util.Calendar)__typeMapper.readObject(__in, NextFireTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, OwnerId__typeInfo)) {
      setOwnerId((java.lang.String)__typeMapper.readString(__in, OwnerId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreviousFireTime__typeInfo)) {
      setPreviousFireTime((java.util.Calendar)__typeMapper.readObject(__in, PreviousFireTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartTime__typeInfo)) {
      setStartTime((java.util.Calendar)__typeMapper.readObject(__in, StartTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, State__typeInfo)) {
      setState((java.lang.String)__typeMapper.readString(__in, State__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TimeZoneSidKey__typeInfo)) {
      setTimeZoneSidKey((java.lang.String)__typeMapper.readString(__in, TimeZoneSidKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TimesTriggered__typeInfo)) {
      setTimesTriggered((java.lang.Integer)__typeMapper.readObject(__in, TimesTriggered__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CronTrigger ");
    sb.append(super.toString());
    sb.append(" CreatedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CronExpression=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CronExpression)+"'\n");
    sb.append(" CronJobDetail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CronJobDetail)+"'\n");
    sb.append(" CronJobDetailId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CronJobDetailId)+"'\n");
    sb.append(" EndTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndTime)+"'\n");
    sb.append(" LastModifiedBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedBy)+"'\n");
    sb.append(" LastModifiedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedById)+"'\n");
    sb.append(" NextFireTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NextFireTime)+"'\n");
    sb.append(" OwnerId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(OwnerId)+"'\n");
    sb.append(" PreviousFireTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreviousFireTime)+"'\n");
    sb.append(" StartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartTime)+"'\n");
    sb.append(" State=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(State)+"'\n");
    sb.append(" TimeZoneSidKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TimeZoneSidKey)+"'\n");
    sb.append(" TimesTriggered=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TimesTriggered)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}