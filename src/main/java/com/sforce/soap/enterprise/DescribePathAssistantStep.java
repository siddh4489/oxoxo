package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribePathAssistantStep implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribePathAssistantStep() {
  }
    
  
  /**
   * element  : closed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo closed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","closed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean closed__is_set = false;

  private boolean closed;

  public boolean getClosed() {
    return closed;
  }

  

  public boolean isClosed() {
    return closed;
  }

  

  public void setClosed(boolean closed) {
    this.closed = closed;
    closed__is_set = true;
  }
  
  /**
   * element  : converted of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo converted__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","converted","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean converted__is_set = false;

  private boolean converted;

  public boolean getConverted() {
    return converted;
  }

  

  public boolean isConverted() {
    return converted;
  }

  

  public void setConverted(boolean converted) {
    this.converted = converted;
    converted__is_set = true;
  }
  
  /**
   * element  : fields of type {urn:enterprise.soap.sforce.com}DescribePathAssistantField
   * java type: com.sforce.soap.enterprise.DescribePathAssistantField[]
   */
  private static final com.sforce.ws.bind.TypeInfo fields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","fields","urn:enterprise.soap.sforce.com","DescribePathAssistantField",0,-1,true);

  private boolean fields__is_set = false;

  private com.sforce.soap.enterprise.DescribePathAssistantField[] fields = new com.sforce.soap.enterprise.DescribePathAssistantField[0];

  public com.sforce.soap.enterprise.DescribePathAssistantField[] getFields() {
    return fields;
  }

  

  public void setFields(com.sforce.soap.enterprise.DescribePathAssistantField[] fields) {
    this.fields = fields;
    fields__is_set = true;
  }
  
  /**
   * element  : info of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo info__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","info","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean info__is_set = false;

  private java.lang.String info;

  public java.lang.String getInfo() {
    return info;
  }

  

  public void setInfo(java.lang.String info) {
    this.info = info;
    info__is_set = true;
  }
  
  /**
   * element  : layoutSection of type {urn:enterprise.soap.sforce.com}DescribeLayoutSection
   * java type: com.sforce.soap.enterprise.DescribeLayoutSection
   */
  private static final com.sforce.ws.bind.TypeInfo layoutSection__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","layoutSection","urn:enterprise.soap.sforce.com","DescribeLayoutSection",1,1,true);

  private boolean layoutSection__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutSection layoutSection;

  public com.sforce.soap.enterprise.DescribeLayoutSection getLayoutSection() {
    return layoutSection;
  }

  

  public void setLayoutSection(com.sforce.soap.enterprise.DescribeLayoutSection layoutSection) {
    this.layoutSection = layoutSection;
    layoutSection__is_set = true;
  }
  
  /**
   * element  : picklistLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo picklistLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","picklistLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean picklistLabel__is_set = false;

  private java.lang.String picklistLabel;

  public java.lang.String getPicklistLabel() {
    return picklistLabel;
  }

  

  public void setPicklistLabel(java.lang.String picklistLabel) {
    this.picklistLabel = picklistLabel;
    picklistLabel__is_set = true;
  }
  
  /**
   * element  : picklistValue of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo picklistValue__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","picklistValue","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean picklistValue__is_set = false;

  private java.lang.String picklistValue;

  public java.lang.String getPicklistValue() {
    return picklistValue;
  }

  

  public void setPicklistValue(java.lang.String picklistValue) {
    this.picklistValue = picklistValue;
    picklistValue__is_set = true;
  }
  
  /**
   * element  : won of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo won__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","won","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean won__is_set = false;

  private boolean won;

  public boolean getWon() {
    return won;
  }

  

  public boolean isWon() {
    return won;
  }

  

  public void setWon(boolean won) {
    this.won = won;
    won__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, closed__typeInfo, closed, closed__is_set);
    __typeMapper.writeBoolean(__out, converted__typeInfo, converted, converted__is_set);
    __typeMapper.writeObject(__out, fields__typeInfo, fields, fields__is_set);
    __typeMapper.writeString(__out, info__typeInfo, info, info__is_set);
    __typeMapper.writeObject(__out, layoutSection__typeInfo, layoutSection, layoutSection__is_set);
    __typeMapper.writeString(__out, picklistLabel__typeInfo, picklistLabel, picklistLabel__is_set);
    __typeMapper.writeString(__out, picklistValue__typeInfo, picklistValue, picklistValue__is_set);
    __typeMapper.writeBoolean(__out, won__typeInfo, won, won__is_set);
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
    if (__typeMapper.verifyElement(__in, closed__typeInfo)) {
      setClosed((boolean)__typeMapper.readBoolean(__in, closed__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, converted__typeInfo)) {
      setConverted((boolean)__typeMapper.readBoolean(__in, converted__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, fields__typeInfo)) {
      setFields((com.sforce.soap.enterprise.DescribePathAssistantField[])__typeMapper.readObject(__in, fields__typeInfo, com.sforce.soap.enterprise.DescribePathAssistantField[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, info__typeInfo)) {
      setInfo((java.lang.String)__typeMapper.readString(__in, info__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, layoutSection__typeInfo)) {
      setLayoutSection((com.sforce.soap.enterprise.DescribeLayoutSection)__typeMapper.readObject(__in, layoutSection__typeInfo, com.sforce.soap.enterprise.DescribeLayoutSection.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, picklistLabel__typeInfo)) {
      setPicklistLabel((java.lang.String)__typeMapper.readString(__in, picklistLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, picklistValue__typeInfo)) {
      setPicklistValue((java.lang.String)__typeMapper.readString(__in, picklistValue__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, won__typeInfo)) {
      setWon((boolean)__typeMapper.readBoolean(__in, won__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribePathAssistantStep ");
    
    sb.append(" closed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(closed)+"'\n");
    sb.append(" converted=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(converted)+"'\n");
    sb.append(" fields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fields)+"'\n");
    sb.append(" info=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(info)+"'\n");
    sb.append(" layoutSection=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layoutSection)+"'\n");
    sb.append(" picklistLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(picklistLabel)+"'\n");
    sb.append(" picklistValue=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(picklistValue)+"'\n");
    sb.append(" won=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(won)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}