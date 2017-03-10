package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FiscalYearSettings extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FiscalYearSettings() {
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
   * element  : EndDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EndDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","EndDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean EndDate__is_set = false;

  private java.util.Calendar EndDate;

  public java.util.Calendar getEndDate() {
    return EndDate;
  }

  

  public void setEndDate(java.util.Calendar EndDate) {
    this.EndDate = EndDate;
    EndDate__is_set = true;
  }
  
  /**
   * element  : IsStandardYear of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsStandardYear__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsStandardYear","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsStandardYear__is_set = false;

  private java.lang.Boolean IsStandardYear;

  public java.lang.Boolean getIsStandardYear() {
    return IsStandardYear;
  }

  

  public void setIsStandardYear(java.lang.Boolean IsStandardYear) {
    this.IsStandardYear = IsStandardYear;
    IsStandardYear__is_set = true;
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
   * element  : PeriodId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PeriodId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PeriodId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean PeriodId__is_set = false;

  private java.lang.String PeriodId;

  public java.lang.String getPeriodId() {
    return PeriodId;
  }

  

  public void setPeriodId(java.lang.String PeriodId) {
    this.PeriodId = PeriodId;
    PeriodId__is_set = true;
  }
  
  /**
   * element  : PeriodLabelScheme of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PeriodLabelScheme__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PeriodLabelScheme","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PeriodLabelScheme__is_set = false;

  private java.lang.String PeriodLabelScheme;

  public java.lang.String getPeriodLabelScheme() {
    return PeriodLabelScheme;
  }

  

  public void setPeriodLabelScheme(java.lang.String PeriodLabelScheme) {
    this.PeriodLabelScheme = PeriodLabelScheme;
    PeriodLabelScheme__is_set = true;
  }
  
  /**
   * element  : PeriodPrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PeriodPrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PeriodPrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PeriodPrefix__is_set = false;

  private java.lang.String PeriodPrefix;

  public java.lang.String getPeriodPrefix() {
    return PeriodPrefix;
  }

  

  public void setPeriodPrefix(java.lang.String PeriodPrefix) {
    this.PeriodPrefix = PeriodPrefix;
    PeriodPrefix__is_set = true;
  }
  
  /**
   * element  : Periods of type {urn:enterprise.soap.sforce.com}QueryResult
   * java type: com.sforce.soap.enterprise.QueryResult
   */
  private static final com.sforce.ws.bind.TypeInfo Periods__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Periods","urn:enterprise.soap.sforce.com","QueryResult",0,1,true);

  private boolean Periods__is_set = false;

  private com.sforce.soap.enterprise.QueryResult Periods;

  public com.sforce.soap.enterprise.QueryResult getPeriods() {
    return Periods;
  }

  

  public void setPeriods(com.sforce.soap.enterprise.QueryResult Periods) {
    this.Periods = Periods;
    Periods__is_set = true;
  }
  
  /**
   * element  : QuarterLabelScheme of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuarterLabelScheme__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuarterLabelScheme","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuarterLabelScheme__is_set = false;

  private java.lang.String QuarterLabelScheme;

  public java.lang.String getQuarterLabelScheme() {
    return QuarterLabelScheme;
  }

  

  public void setQuarterLabelScheme(java.lang.String QuarterLabelScheme) {
    this.QuarterLabelScheme = QuarterLabelScheme;
    QuarterLabelScheme__is_set = true;
  }
  
  /**
   * element  : QuarterPrefix of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuarterPrefix__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuarterPrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuarterPrefix__is_set = false;

  private java.lang.String QuarterPrefix;

  public java.lang.String getQuarterPrefix() {
    return QuarterPrefix;
  }

  

  public void setQuarterPrefix(java.lang.String QuarterPrefix) {
    this.QuarterPrefix = QuarterPrefix;
    QuarterPrefix__is_set = true;
  }
  
  /**
   * element  : StartDate of type {http://www.w3.org/2001/XMLSchema}date
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo StartDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","StartDate","http://www.w3.org/2001/XMLSchema","date",0,1,true);

  private boolean StartDate__is_set = false;

  private java.util.Calendar StartDate;

  public java.util.Calendar getStartDate() {
    return StartDate;
  }

  

  public void setStartDate(java.util.Calendar StartDate) {
    this.StartDate = StartDate;
    StartDate__is_set = true;
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
   * element  : WeekLabelScheme of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo WeekLabelScheme__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WeekLabelScheme","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean WeekLabelScheme__is_set = false;

  private java.lang.String WeekLabelScheme;

  public java.lang.String getWeekLabelScheme() {
    return WeekLabelScheme;
  }

  

  public void setWeekLabelScheme(java.lang.String WeekLabelScheme) {
    this.WeekLabelScheme = WeekLabelScheme;
    WeekLabelScheme__is_set = true;
  }
  
  /**
   * element  : WeekStartDay of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo WeekStartDay__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","WeekStartDay","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean WeekStartDay__is_set = false;

  private java.lang.Integer WeekStartDay;

  public java.lang.Integer getWeekStartDay() {
    return WeekStartDay;
  }

  

  public void setWeekStartDay(java.lang.Integer WeekStartDay) {
    this.WeekStartDay = WeekStartDay;
    WeekStartDay__is_set = true;
  }
  
  /**
   * element  : YearType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo YearType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","YearType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean YearType__is_set = false;

  private java.lang.String YearType;

  public java.lang.String getYearType() {
    return YearType;
  }

  

  public void setYearType(java.lang.String YearType) {
    this.YearType = YearType;
    YearType__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettings");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeObject(__out, EndDate__typeInfo, EndDate, EndDate__is_set);
    __typeMapper.writeObject(__out, IsStandardYear__typeInfo, IsStandardYear, IsStandardYear__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeString(__out, PeriodId__typeInfo, PeriodId, PeriodId__is_set);
    __typeMapper.writeString(__out, PeriodLabelScheme__typeInfo, PeriodLabelScheme, PeriodLabelScheme__is_set);
    __typeMapper.writeString(__out, PeriodPrefix__typeInfo, PeriodPrefix, PeriodPrefix__is_set);
    __typeMapper.writeObject(__out, Periods__typeInfo, Periods, Periods__is_set);
    __typeMapper.writeString(__out, QuarterLabelScheme__typeInfo, QuarterLabelScheme, QuarterLabelScheme__is_set);
    __typeMapper.writeString(__out, QuarterPrefix__typeInfo, QuarterPrefix, QuarterPrefix__is_set);
    __typeMapper.writeObject(__out, StartDate__typeInfo, StartDate, StartDate__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, WeekLabelScheme__typeInfo, WeekLabelScheme, WeekLabelScheme__is_set);
    __typeMapper.writeObject(__out, WeekStartDay__typeInfo, WeekStartDay, WeekStartDay__is_set);
    __typeMapper.writeString(__out, YearType__typeInfo, YearType, YearType__is_set);
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
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndDate__typeInfo)) {
      setEndDate((java.util.Calendar)__typeMapper.readObject(__in, EndDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsStandardYear__typeInfo)) {
      setIsStandardYear((java.lang.Boolean)__typeMapper.readObject(__in, IsStandardYear__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PeriodId__typeInfo)) {
      setPeriodId((java.lang.String)__typeMapper.readString(__in, PeriodId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PeriodLabelScheme__typeInfo)) {
      setPeriodLabelScheme((java.lang.String)__typeMapper.readString(__in, PeriodLabelScheme__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PeriodPrefix__typeInfo)) {
      setPeriodPrefix((java.lang.String)__typeMapper.readString(__in, PeriodPrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Periods__typeInfo)) {
      setPeriods((com.sforce.soap.enterprise.QueryResult)__typeMapper.readObject(__in, Periods__typeInfo, com.sforce.soap.enterprise.QueryResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuarterLabelScheme__typeInfo)) {
      setQuarterLabelScheme((java.lang.String)__typeMapper.readString(__in, QuarterLabelScheme__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuarterPrefix__typeInfo)) {
      setQuarterPrefix((java.lang.String)__typeMapper.readString(__in, QuarterPrefix__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartDate__typeInfo)) {
      setStartDate((java.util.Calendar)__typeMapper.readObject(__in, StartDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WeekLabelScheme__typeInfo)) {
      setWeekLabelScheme((java.lang.String)__typeMapper.readString(__in, WeekLabelScheme__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, WeekStartDay__typeInfo)) {
      setWeekStartDay((java.lang.Integer)__typeMapper.readObject(__in, WeekStartDay__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, YearType__typeInfo)) {
      setYearType((java.lang.String)__typeMapper.readString(__in, YearType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FiscalYearSettings ");
    sb.append(super.toString());
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" EndDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndDate)+"'\n");
    sb.append(" IsStandardYear=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsStandardYear)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" PeriodId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PeriodId)+"'\n");
    sb.append(" PeriodLabelScheme=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PeriodLabelScheme)+"'\n");
    sb.append(" PeriodPrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PeriodPrefix)+"'\n");
    sb.append(" Periods=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Periods)+"'\n");
    sb.append(" QuarterLabelScheme=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuarterLabelScheme)+"'\n");
    sb.append(" QuarterPrefix=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuarterPrefix)+"'\n");
    sb.append(" StartDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartDate)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" WeekLabelScheme=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WeekLabelScheme)+"'\n");
    sb.append(" WeekStartDay=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(WeekStartDay)+"'\n");
    sb.append(" YearType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(YearType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}