package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class ApexLog extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public ApexLog() {
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
   * element  : DurationMilliseconds of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo DurationMilliseconds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DurationMilliseconds","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean DurationMilliseconds__is_set = false;

  private java.lang.Integer DurationMilliseconds;

  public java.lang.Integer getDurationMilliseconds() {
    return DurationMilliseconds;
  }

  

  public void setDurationMilliseconds(java.lang.Integer DurationMilliseconds) {
    this.DurationMilliseconds = DurationMilliseconds;
    DurationMilliseconds__is_set = true;
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
   * element  : Location of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Location__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Location","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Location__is_set = false;

  private java.lang.String Location;

  public java.lang.String getLocation() {
    return Location;
  }

  

  public void setLocation(java.lang.String Location) {
    this.Location = Location;
    Location__is_set = true;
  }
  
  /**
   * element  : LogLength of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo LogLength__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogLength","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean LogLength__is_set = false;

  private java.lang.Integer LogLength;

  public java.lang.Integer getLogLength() {
    return LogLength;
  }

  

  public void setLogLength(java.lang.Integer LogLength) {
    this.LogLength = LogLength;
    LogLength__is_set = true;
  }
  
  /**
   * element  : LogUser of type {urn:sobject.enterprise.soap.sforce.com}Name
   * java type: com.sforce.soap.enterprise.sobject.Name
   */
  private static final com.sforce.ws.bind.TypeInfo LogUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogUser","urn:sobject.enterprise.soap.sforce.com","Name",0,1,true);

  private boolean LogUser__is_set = false;

  private com.sforce.soap.enterprise.sobject.Name LogUser;

  public com.sforce.soap.enterprise.sobject.Name getLogUser() {
    return LogUser;
  }

  

  public void setLogUser(com.sforce.soap.enterprise.sobject.Name LogUser) {
    this.LogUser = LogUser;
    LogUser__is_set = true;
  }
  
  /**
   * element  : LogUserId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LogUserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","LogUserId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean LogUserId__is_set = false;

  private java.lang.String LogUserId;

  public java.lang.String getLogUserId() {
    return LogUserId;
  }

  

  public void setLogUserId(java.lang.String LogUserId) {
    this.LogUserId = LogUserId;
    LogUserId__is_set = true;
  }
  
  /**
   * element  : Operation of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Operation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Operation","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Operation__is_set = false;

  private java.lang.String Operation;

  public java.lang.String getOperation() {
    return Operation;
  }

  

  public void setOperation(java.lang.String Operation) {
    this.Operation = Operation;
    Operation__is_set = true;
  }
  
  /**
   * element  : Request of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Request__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Request","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Request__is_set = false;

  private java.lang.String Request;

  public java.lang.String getRequest() {
    return Request;
  }

  

  public void setRequest(java.lang.String Request) {
    this.Request = Request;
    Request__is_set = true;
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
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "ApexLog");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, Application__typeInfo, Application, Application__is_set);
    __typeMapper.writeObject(__out, DurationMilliseconds__typeInfo, DurationMilliseconds, DurationMilliseconds__is_set);
    __typeMapper.writeObject(__out, LastModifiedDate__typeInfo, LastModifiedDate, LastModifiedDate__is_set);
    __typeMapper.writeString(__out, Location__typeInfo, Location, Location__is_set);
    __typeMapper.writeObject(__out, LogLength__typeInfo, LogLength, LogLength__is_set);
    __typeMapper.writeObject(__out, LogUser__typeInfo, LogUser, LogUser__is_set);
    __typeMapper.writeString(__out, LogUserId__typeInfo, LogUserId, LogUserId__is_set);
    __typeMapper.writeString(__out, Operation__typeInfo, Operation, Operation__is_set);
    __typeMapper.writeString(__out, Request__typeInfo, Request, Request__is_set);
    __typeMapper.writeObject(__out, StartTime__typeInfo, StartTime, StartTime__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
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
    if (__typeMapper.isElement(__in, Application__typeInfo)) {
      setApplication((java.lang.String)__typeMapper.readString(__in, Application__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DurationMilliseconds__typeInfo)) {
      setDurationMilliseconds((java.lang.Integer)__typeMapper.readObject(__in, DurationMilliseconds__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastModifiedDate__typeInfo)) {
      setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, LastModifiedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Location__typeInfo)) {
      setLocation((java.lang.String)__typeMapper.readString(__in, Location__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogLength__typeInfo)) {
      setLogLength((java.lang.Integer)__typeMapper.readObject(__in, LogLength__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogUser__typeInfo)) {
      setLogUser((com.sforce.soap.enterprise.sobject.Name)__typeMapper.readObject(__in, LogUser__typeInfo, com.sforce.soap.enterprise.sobject.Name.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LogUserId__typeInfo)) {
      setLogUserId((java.lang.String)__typeMapper.readString(__in, LogUserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Operation__typeInfo)) {
      setOperation((java.lang.String)__typeMapper.readString(__in, Operation__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Request__typeInfo)) {
      setRequest((java.lang.String)__typeMapper.readString(__in, Request__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartTime__typeInfo)) {
      setStartTime((java.util.Calendar)__typeMapper.readObject(__in, StartTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus((java.lang.String)__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {
      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApexLog ");
    sb.append(super.toString());
    sb.append(" Application=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Application)+"'\n");
    sb.append(" DurationMilliseconds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurationMilliseconds)+"'\n");
    sb.append(" LastModifiedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastModifiedDate)+"'\n");
    sb.append(" Location=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Location)+"'\n");
    sb.append(" LogLength=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogLength)+"'\n");
    sb.append(" LogUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogUser)+"'\n");
    sb.append(" LogUserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LogUserId)+"'\n");
    sb.append(" Operation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Operation)+"'\n");
    sb.append(" Request=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Request)+"'\n");
    sb.append(" StartTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartTime)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SystemModstamp=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}