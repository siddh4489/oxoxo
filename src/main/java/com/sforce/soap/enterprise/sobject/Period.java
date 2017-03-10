package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class Period extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public Period() {
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
   * element  : FiscalYearSettings of type {urn:sobject.enterprise.soap.sforce.com}FiscalYearSettings
   * java type: com.sforce.soap.enterprise.sobject.FiscalYearSettings
   */
  private static final com.sforce.ws.bind.TypeInfo FiscalYearSettings__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings","urn:sobject.enterprise.soap.sforce.com","FiscalYearSettings",0,1,true);

  private boolean FiscalYearSettings__is_set = false;

  private com.sforce.soap.enterprise.sobject.FiscalYearSettings FiscalYearSettings;

  public com.sforce.soap.enterprise.sobject.FiscalYearSettings getFiscalYearSettings() {
    return FiscalYearSettings;
  }

  

  public void setFiscalYearSettings(com.sforce.soap.enterprise.sobject.FiscalYearSettings FiscalYearSettings) {
    this.FiscalYearSettings = FiscalYearSettings;
    FiscalYearSettings__is_set = true;
  }
  
  /**
   * element  : FiscalYearSettingsId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FiscalYearSettingsId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FiscalYearSettingsId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean FiscalYearSettingsId__is_set = false;

  private java.lang.String FiscalYearSettingsId;

  public java.lang.String getFiscalYearSettingsId() {
    return FiscalYearSettingsId;
  }

  

  public void setFiscalYearSettingsId(java.lang.String FiscalYearSettingsId) {
    this.FiscalYearSettingsId = FiscalYearSettingsId;
    FiscalYearSettingsId__is_set = true;
  }
  
  /**
   * element  : FullyQualifiedLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FullyQualifiedLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FullyQualifiedLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FullyQualifiedLabel__is_set = false;

  private java.lang.String FullyQualifiedLabel;

  public java.lang.String getFullyQualifiedLabel() {
    return FullyQualifiedLabel;
  }

  

  public void setFullyQualifiedLabel(java.lang.String FullyQualifiedLabel) {
    this.FullyQualifiedLabel = FullyQualifiedLabel;
    FullyQualifiedLabel__is_set = true;
  }
  
  /**
   * element  : IsForecastPeriod of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsForecastPeriod__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsForecastPeriod","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsForecastPeriod__is_set = false;

  private java.lang.Boolean IsForecastPeriod;

  public java.lang.Boolean getIsForecastPeriod() {
    return IsForecastPeriod;
  }

  

  public void setIsForecastPeriod(java.lang.Boolean IsForecastPeriod) {
    this.IsForecastPeriod = IsForecastPeriod;
    IsForecastPeriod__is_set = true;
  }
  
  /**
   * element  : Number of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Number__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Number","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Number__is_set = false;

  private java.lang.Integer Number;

  public java.lang.Integer getNumber() {
    return Number;
  }

  

  public void setNumber(java.lang.Integer Number) {
    this.Number = Number;
    Number__is_set = true;
  }
  
  /**
   * element  : PeriodLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PeriodLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","PeriodLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PeriodLabel__is_set = false;

  private java.lang.String PeriodLabel;

  public java.lang.String getPeriodLabel() {
    return PeriodLabel;
  }

  

  public void setPeriodLabel(java.lang.String PeriodLabel) {
    this.PeriodLabel = PeriodLabel;
    PeriodLabel__is_set = true;
  }
  
  /**
   * element  : QuarterLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo QuarterLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","QuarterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean QuarterLabel__is_set = false;

  private java.lang.String QuarterLabel;

  public java.lang.String getQuarterLabel() {
    return QuarterLabel;
  }

  

  public void setQuarterLabel(java.lang.String QuarterLabel) {
    this.QuarterLabel = QuarterLabel;
    QuarterLabel__is_set = true;
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
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Period");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, EndDate__typeInfo, EndDate, EndDate__is_set);
    __typeMapper.writeObject(__out, FiscalYearSettings__typeInfo, FiscalYearSettings, FiscalYearSettings__is_set);
    __typeMapper.writeString(__out, FiscalYearSettingsId__typeInfo, FiscalYearSettingsId, FiscalYearSettingsId__is_set);
    __typeMapper.writeString(__out, FullyQualifiedLabel__typeInfo, FullyQualifiedLabel, FullyQualifiedLabel__is_set);
    __typeMapper.writeObject(__out, IsForecastPeriod__typeInfo, IsForecastPeriod, IsForecastPeriod__is_set);
    __typeMapper.writeObject(__out, Number__typeInfo, Number, Number__is_set);
    __typeMapper.writeString(__out, PeriodLabel__typeInfo, PeriodLabel, PeriodLabel__is_set);
    __typeMapper.writeString(__out, QuarterLabel__typeInfo, QuarterLabel, QuarterLabel__is_set);
    __typeMapper.writeObject(__out, StartDate__typeInfo, StartDate, StartDate__is_set);
    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
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
    if (__typeMapper.isElement(__in, EndDate__typeInfo)) {
      setEndDate((java.util.Calendar)__typeMapper.readObject(__in, EndDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FiscalYearSettings__typeInfo)) {
      setFiscalYearSettings((com.sforce.soap.enterprise.sobject.FiscalYearSettings)__typeMapper.readObject(__in, FiscalYearSettings__typeInfo, com.sforce.soap.enterprise.sobject.FiscalYearSettings.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FiscalYearSettingsId__typeInfo)) {
      setFiscalYearSettingsId((java.lang.String)__typeMapper.readString(__in, FiscalYearSettingsId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FullyQualifiedLabel__typeInfo)) {
      setFullyQualifiedLabel((java.lang.String)__typeMapper.readString(__in, FullyQualifiedLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsForecastPeriod__typeInfo)) {
      setIsForecastPeriod((java.lang.Boolean)__typeMapper.readObject(__in, IsForecastPeriod__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Number__typeInfo)) {
      setNumber((java.lang.Integer)__typeMapper.readObject(__in, Number__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PeriodLabel__typeInfo)) {
      setPeriodLabel((java.lang.String)__typeMapper.readString(__in, PeriodLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, QuarterLabel__typeInfo)) {
      setQuarterLabel((java.lang.String)__typeMapper.readString(__in, QuarterLabel__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Period ");
    sb.append(super.toString());
    sb.append(" EndDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndDate)+"'\n");
    sb.append(" FiscalYearSettings=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FiscalYearSettings)+"'\n");
    sb.append(" FiscalYearSettingsId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FiscalYearSettingsId)+"'\n");
    sb.append(" FullyQualifiedLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FullyQualifiedLabel)+"'\n");
    sb.append(" IsForecastPeriod=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsForecastPeriod)+"'\n");
    sb.append(" Number=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number)+"'\n");
    sb.append(" PeriodLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PeriodLabel)+"'\n");
    sb.append(" QuarterLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(QuarterLabel)+"'\n");
    sb.append(" StartDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartDate)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}