package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeCompactLayout implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeCompactLayout() {
  }
    
  
  /**
   * element  : actions of type {urn:enterprise.soap.sforce.com}DescribeLayoutButton
   * java type: com.sforce.soap.enterprise.DescribeLayoutButton[]
   */
  private static final com.sforce.ws.bind.TypeInfo actions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","actions","urn:enterprise.soap.sforce.com","DescribeLayoutButton",0,-1,true);

  private boolean actions__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutButton[] actions = new com.sforce.soap.enterprise.DescribeLayoutButton[0];

  public com.sforce.soap.enterprise.DescribeLayoutButton[] getActions() {
    return actions;
  }

  

  public void setActions(com.sforce.soap.enterprise.DescribeLayoutButton[] actions) {
    this.actions = actions;
    actions__is_set = true;
  }
  
  /**
   * element  : fieldItems of type {urn:enterprise.soap.sforce.com}DescribeLayoutItem
   * java type: com.sforce.soap.enterprise.DescribeLayoutItem[]
   */
  private static final com.sforce.ws.bind.TypeInfo fieldItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","fieldItems","urn:enterprise.soap.sforce.com","DescribeLayoutItem",0,-1,true);

  private boolean fieldItems__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutItem[] fieldItems = new com.sforce.soap.enterprise.DescribeLayoutItem[0];

  public com.sforce.soap.enterprise.DescribeLayoutItem[] getFieldItems() {
    return fieldItems;
  }

  

  public void setFieldItems(com.sforce.soap.enterprise.DescribeLayoutItem[] fieldItems) {
    this.fieldItems = fieldItems;
    fieldItems__is_set = true;
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
   * element  : imageItems of type {urn:enterprise.soap.sforce.com}DescribeLayoutItem
   * java type: com.sforce.soap.enterprise.DescribeLayoutItem[]
   */
  private static final com.sforce.ws.bind.TypeInfo imageItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","imageItems","urn:enterprise.soap.sforce.com","DescribeLayoutItem",0,-1,true);

  private boolean imageItems__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutItem[] imageItems = new com.sforce.soap.enterprise.DescribeLayoutItem[0];

  public com.sforce.soap.enterprise.DescribeLayoutItem[] getImageItems() {
    return imageItems;
  }

  

  public void setImageItems(com.sforce.soap.enterprise.DescribeLayoutItem[] imageItems) {
    this.imageItems = imageItems;
    imageItems__is_set = true;
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
   * element  : objectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo objectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","objectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean objectType__is_set = false;

  private java.lang.String objectType;

  public java.lang.String getObjectType() {
    return objectType;
  }

  

  public void setObjectType(java.lang.String objectType) {
    this.objectType = objectType;
    objectType__is_set = true;
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
   
    __typeMapper.writeObject(__out, actions__typeInfo, actions, actions__is_set);
    __typeMapper.writeObject(__out, fieldItems__typeInfo, fieldItems, fieldItems__is_set);
    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
    __typeMapper.writeObject(__out, imageItems__typeInfo, imageItems, imageItems__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeString(__out, objectType__typeInfo, objectType, objectType__is_set);
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
    if (__typeMapper.isElement(__in, actions__typeInfo)) {
      setActions((com.sforce.soap.enterprise.DescribeLayoutButton[])__typeMapper.readObject(__in, actions__typeInfo, com.sforce.soap.enterprise.DescribeLayoutButton[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, fieldItems__typeInfo)) {
      setFieldItems((com.sforce.soap.enterprise.DescribeLayoutItem[])__typeMapper.readObject(__in, fieldItems__typeInfo, com.sforce.soap.enterprise.DescribeLayoutItem[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, imageItems__typeInfo)) {
      setImageItems((com.sforce.soap.enterprise.DescribeLayoutItem[])__typeMapper.readObject(__in, imageItems__typeInfo, com.sforce.soap.enterprise.DescribeLayoutItem[].class));
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
    if (__typeMapper.verifyElement(__in, objectType__typeInfo)) {
      setObjectType((java.lang.String)__typeMapper.readString(__in, objectType__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeCompactLayout ");
    
    sb.append(" actions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(actions)+"'\n");
    sb.append(" fieldItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldItems)+"'\n");
    sb.append(" id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");
    sb.append(" imageItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(imageItems)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" objectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(objectType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}