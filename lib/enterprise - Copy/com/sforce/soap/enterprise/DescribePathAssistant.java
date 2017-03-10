package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribePathAssistant implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribePathAssistant() {
  }
    
  
  /**
   * element  : active of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo active__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean active__is_set = false;

  private boolean active;

  public boolean getActive() {
    return active;
  }

  

  public boolean isActive() {
    return active;
  }

  

  public void setActive(boolean active) {
    this.active = active;
    active__is_set = true;
  }
  
  /**
   * element  : apiName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo apiName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","apiName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean apiName__is_set = false;

  private java.lang.String apiName;

  public java.lang.String getApiName() {
    return apiName;
  }

  

  public void setApiName(java.lang.String apiName) {
    this.apiName = apiName;
    apiName__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : pathPicklistField of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo pathPicklistField__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","pathPicklistField","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean pathPicklistField__is_set = false;

  private java.lang.String pathPicklistField;

  public java.lang.String getPathPicklistField() {
    return pathPicklistField;
  }

  

  public void setPathPicklistField(java.lang.String pathPicklistField) {
    this.pathPicklistField = pathPicklistField;
    pathPicklistField__is_set = true;
  }
  
  /**
   * element  : picklistsForRecordType of type {urn:enterprise.soap.sforce.com}PicklistForRecordType
   * java type: com.sforce.soap.enterprise.PicklistForRecordType[]
   */
  private static final com.sforce.ws.bind.TypeInfo picklistsForRecordType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","picklistsForRecordType","urn:enterprise.soap.sforce.com","PicklistForRecordType",0,-1,true);

  private boolean picklistsForRecordType__is_set = false;

  private com.sforce.soap.enterprise.PicklistForRecordType[] picklistsForRecordType = new com.sforce.soap.enterprise.PicklistForRecordType[0];

  public com.sforce.soap.enterprise.PicklistForRecordType[] getPicklistsForRecordType() {
    return picklistsForRecordType;
  }

  

  public void setPicklistsForRecordType(com.sforce.soap.enterprise.PicklistForRecordType[] picklistsForRecordType) {
    this.picklistsForRecordType = picklistsForRecordType;
    picklistsForRecordType__is_set = true;
  }
  
  /**
   * element  : recordTypeId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo recordTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","recordTypeId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean recordTypeId__is_set = false;

  private java.lang.String recordTypeId;

  public java.lang.String getRecordTypeId() {
    return recordTypeId;
  }

  

  public void setRecordTypeId(java.lang.String recordTypeId) {
    this.recordTypeId = recordTypeId;
    recordTypeId__is_set = true;
  }
  
  /**
   * element  : steps of type {urn:enterprise.soap.sforce.com}DescribePathAssistantStep
   * java type: com.sforce.soap.enterprise.DescribePathAssistantStep[]
   */
  private static final com.sforce.ws.bind.TypeInfo steps__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","steps","urn:enterprise.soap.sforce.com","DescribePathAssistantStep",0,-1,true);

  private boolean steps__is_set = false;

  private com.sforce.soap.enterprise.DescribePathAssistantStep[] steps = new com.sforce.soap.enterprise.DescribePathAssistantStep[0];

  public com.sforce.soap.enterprise.DescribePathAssistantStep[] getSteps() {
    return steps;
  }

  

  public void setSteps(com.sforce.soap.enterprise.DescribePathAssistantStep[] steps) {
    this.steps = steps;
    steps__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeBoolean(__out, active__typeInfo, active, active__is_set);
    __typeMapper.writeString(__out, apiName__typeInfo, apiName, apiName__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, pathPicklistField__typeInfo, pathPicklistField, pathPicklistField__is_set);
    __typeMapper.writeObject(__out, picklistsForRecordType__typeInfo, picklistsForRecordType, picklistsForRecordType__is_set);
    __typeMapper.writeString(__out, recordTypeId__typeInfo, recordTypeId, recordTypeId__is_set);
    __typeMapper.writeObject(__out, steps__typeInfo, steps, steps__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, active__typeInfo)) {
      setActive((boolean)__typeMapper.readBoolean(__in, active__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, apiName__typeInfo)) {
      setApiName((java.lang.String)__typeMapper.readString(__in, apiName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, pathPicklistField__typeInfo)) {
      setPathPicklistField((java.lang.String)__typeMapper.readString(__in, pathPicklistField__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, picklistsForRecordType__typeInfo)) {
      setPicklistsForRecordType((com.sforce.soap.enterprise.PicklistForRecordType[])__typeMapper.readObject(__in, picklistsForRecordType__typeInfo, com.sforce.soap.enterprise.PicklistForRecordType[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, recordTypeId__typeInfo)) {
      setRecordTypeId((java.lang.String)__typeMapper.readString(__in, recordTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, steps__typeInfo)) {
      setSteps((com.sforce.soap.enterprise.DescribePathAssistantStep[])__typeMapper.readObject(__in, steps__typeInfo, com.sforce.soap.enterprise.DescribePathAssistantStep[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribePathAssistant ");
    
    sb.append(" active=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(active)+"'\n");
    sb.append(" apiName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(apiName)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" pathPicklistField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(pathPicklistField)+"'\n");
    sb.append(" picklistsForRecordType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(picklistsForRecordType)+"'\n");
    sb.append(" recordTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(recordTypeId)+"'\n");
    sb.append(" steps=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(steps)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}