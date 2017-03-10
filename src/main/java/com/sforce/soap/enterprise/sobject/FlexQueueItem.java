package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class FlexQueueItem extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public FlexQueueItem() {
  }
    
  
  /**
   * element  : AsyncApexJob of type {urn:sobject.enterprise.soap.sforce.com}AsyncApexJob
   * java type: com.sforce.soap.enterprise.sobject.AsyncApexJob
   */
  private static final com.sforce.ws.bind.TypeInfo AsyncApexJob__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AsyncApexJob","urn:sobject.enterprise.soap.sforce.com","AsyncApexJob",0,1,true);

  private boolean AsyncApexJob__is_set = false;

  private com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob;

  public com.sforce.soap.enterprise.sobject.AsyncApexJob getAsyncApexJob() {
    return AsyncApexJob;
  }

  

  public void setAsyncApexJob(com.sforce.soap.enterprise.sobject.AsyncApexJob AsyncApexJob) {
    this.AsyncApexJob = AsyncApexJob;
    AsyncApexJob__is_set = true;
  }
  
  /**
   * element  : AsyncApexJobId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AsyncApexJobId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","AsyncApexJobId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean AsyncApexJobId__is_set = false;

  private java.lang.String AsyncApexJobId;

  public java.lang.String getAsyncApexJobId() {
    return AsyncApexJobId;
  }

  

  public void setAsyncApexJobId(java.lang.String AsyncApexJobId) {
    this.AsyncApexJobId = AsyncApexJobId;
    AsyncApexJobId__is_set = true;
  }
  
  /**
   * element  : FlexQueueItemId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FlexQueueItemId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","FlexQueueItemId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FlexQueueItemId__is_set = false;

  private java.lang.String FlexQueueItemId;

  public java.lang.String getFlexQueueItemId() {
    return FlexQueueItemId;
  }

  

  public void setFlexQueueItemId(java.lang.String FlexQueueItemId) {
    this.FlexQueueItemId = FlexQueueItemId;
    FlexQueueItemId__is_set = true;
  }
  
  /**
   * element  : JobPosition of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo JobPosition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JobPosition","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean JobPosition__is_set = false;

  private java.lang.Integer JobPosition;

  public java.lang.Integer getJobPosition() {
    return JobPosition;
  }

  

  public void setJobPosition(java.lang.Integer JobPosition) {
    this.JobPosition = JobPosition;
    JobPosition__is_set = true;
  }
  
  /**
   * element  : JobType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo JobType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","JobType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean JobType__is_set = false;

  private java.lang.String JobType;

  public java.lang.String getJobType() {
    return JobType;
  }

  

  public void setJobType(java.lang.String JobType) {
    this.JobType = JobType;
    JobType__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "FlexQueueItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AsyncApexJob__typeInfo, AsyncApexJob, AsyncApexJob__is_set);
    __typeMapper.writeString(__out, AsyncApexJobId__typeInfo, AsyncApexJobId, AsyncApexJobId__is_set);
    __typeMapper.writeString(__out, FlexQueueItemId__typeInfo, FlexQueueItemId, FlexQueueItemId__is_set);
    __typeMapper.writeObject(__out, JobPosition__typeInfo, JobPosition, JobPosition__is_set);
    __typeMapper.writeString(__out, JobType__typeInfo, JobType, JobType__is_set);
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
    if (__typeMapper.isElement(__in, AsyncApexJob__typeInfo)) {
      setAsyncApexJob((com.sforce.soap.enterprise.sobject.AsyncApexJob)__typeMapper.readObject(__in, AsyncApexJob__typeInfo, com.sforce.soap.enterprise.sobject.AsyncApexJob.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AsyncApexJobId__typeInfo)) {
      setAsyncApexJobId((java.lang.String)__typeMapper.readString(__in, AsyncApexJobId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FlexQueueItemId__typeInfo)) {
      setFlexQueueItemId((java.lang.String)__typeMapper.readString(__in, FlexQueueItemId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JobPosition__typeInfo)) {
      setJobPosition((java.lang.Integer)__typeMapper.readObject(__in, JobPosition__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, JobType__typeInfo)) {
      setJobType((java.lang.String)__typeMapper.readString(__in, JobType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FlexQueueItem ");
    sb.append(super.toString());
    sb.append(" AsyncApexJob=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AsyncApexJob)+"'\n");
    sb.append(" AsyncApexJobId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AsyncApexJobId)+"'\n");
    sb.append(" FlexQueueItemId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FlexQueueItemId)+"'\n");
    sb.append(" JobPosition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JobPosition)+"'\n");
    sb.append(" JobType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(JobType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}