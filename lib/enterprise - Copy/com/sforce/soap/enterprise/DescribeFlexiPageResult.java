package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeFlexiPageResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeFlexiPageResult() {
  }
    
  
  /**
   * element  : id of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","id","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean id__is_set = false;

  private java.lang.String id;

  public java.lang.String getId() {
    return id;
  }

  

  public void setId(java.lang.String id) {
    this.id = id;
    id__is_set = true;
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
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : quickActionList of type {urn:enterprise.soap.sforce.com}DescribeQuickActionListResult
   * java type: com.sforce.soap.enterprise.DescribeQuickActionListResult
   */
  private static final com.sforce.ws.bind.TypeInfo quickActionList__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","quickActionList","urn:enterprise.soap.sforce.com","DescribeQuickActionListResult",0,1,true);

  private boolean quickActionList__is_set = false;

  private com.sforce.soap.enterprise.DescribeQuickActionListResult quickActionList;

  public com.sforce.soap.enterprise.DescribeQuickActionListResult getQuickActionList() {
    return quickActionList;
  }

  

  public void setQuickActionList(com.sforce.soap.enterprise.DescribeQuickActionListResult quickActionList) {
    this.quickActionList = quickActionList;
    quickActionList__is_set = true;
  }
  
  /**
   * element  : regions of type {urn:enterprise.soap.sforce.com}DescribeFlexiPageRegion
   * java type: com.sforce.soap.enterprise.DescribeFlexiPageRegion[]
   */
  private static final com.sforce.ws.bind.TypeInfo regions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","regions","urn:enterprise.soap.sforce.com","DescribeFlexiPageRegion",0,-1,true);

  private boolean regions__is_set = false;

  private com.sforce.soap.enterprise.DescribeFlexiPageRegion[] regions = new com.sforce.soap.enterprise.DescribeFlexiPageRegion[0];

  public com.sforce.soap.enterprise.DescribeFlexiPageRegion[] getRegions() {
    return regions;
  }

  

  public void setRegions(com.sforce.soap.enterprise.DescribeFlexiPageRegion[] regions) {
    this.regions = regions;
    regions__is_set = true;
  }
  
  /**
   * element  : sobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean sobjectType__is_set = false;

  private java.lang.String sobjectType;

  public java.lang.String getSobjectType() {
    return sobjectType;
  }

  

  public void setSobjectType(java.lang.String sobjectType) {
    this.sobjectType = sobjectType;
    sobjectType__is_set = true;
  }
  
  /**
   * element  : template of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo template__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","template","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean template__is_set = false;

  private java.lang.String template;

  public java.lang.String getTemplate() {
    return template;
  }

  

  public void setTemplate(java.lang.String template) {
    this.template = template;
    template__is_set = true;
  }
  
  /**
   * element  : type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","type","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean type__is_set = false;

  private java.lang.String type;

  public java.lang.String getType() {
    return type;
  }

  

  public void setType(java.lang.String type) {
    this.type = type;
    type__is_set = true;
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
   
    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeObject(__out, quickActionList__typeInfo, quickActionList, quickActionList__is_set);
    __typeMapper.writeObject(__out, regions__typeInfo, regions, regions__is_set);
    __typeMapper.writeString(__out, sobjectType__typeInfo, sobjectType, sobjectType__is_set);
    __typeMapper.writeString(__out, template__typeInfo, template, template__is_set);
    __typeMapper.writeString(__out, type__typeInfo, type, type__is_set);
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
    if (__typeMapper.verifyElement(__in, id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, quickActionList__typeInfo)) {
      setQuickActionList((com.sforce.soap.enterprise.DescribeQuickActionListResult)__typeMapper.readObject(__in, quickActionList__typeInfo, com.sforce.soap.enterprise.DescribeQuickActionListResult.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, regions__typeInfo)) {
      setRegions((com.sforce.soap.enterprise.DescribeFlexiPageRegion[])__typeMapper.readObject(__in, regions__typeInfo, com.sforce.soap.enterprise.DescribeFlexiPageRegion[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, sobjectType__typeInfo)) {
      setSobjectType((java.lang.String)__typeMapper.readString(__in, sobjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, template__typeInfo)) {
      setTemplate((java.lang.String)__typeMapper.readString(__in, template__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeFlexiPageResult ");
    
    sb.append(" id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" quickActionList=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(quickActionList)+"'\n");
    sb.append(" regions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(regions)+"'\n");
    sb.append(" sobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobjectType)+"'\n");
    sb.append(" template=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(template)+"'\n");
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}