package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class Canvas extends com.sforce.soap.enterprise.DescribeLayoutComponent {
  /**
   * Constructor
   */
  public Canvas() {
  }
    
  
  /**
   * element  : displayLocation of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo displayLocation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","displayLocation","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean displayLocation__is_set = false;

  private java.lang.String displayLocation;

  public java.lang.String getDisplayLocation() {
    return displayLocation;
  }

  

  public void setDisplayLocation(java.lang.String displayLocation) {
    this.displayLocation = displayLocation;
    displayLocation__is_set = true;
  }
  
  /**
   * element  : referenceId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo referenceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","referenceId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean referenceId__is_set = false;

  private java.lang.String referenceId;

  public java.lang.String getReferenceId() {
    return referenceId;
  }

  

  public void setReferenceId(java.lang.String referenceId) {
    this.referenceId = referenceId;
    referenceId__is_set = true;
  }
  
  /**
   * element  : showLabel of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showLabel","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showLabel__is_set = false;

  private boolean showLabel;

  public boolean getShowLabel() {
    return showLabel;
  }

  

  public boolean isShowLabel() {
    return showLabel;
  }

  

  public void setShowLabel(boolean showLabel) {
    this.showLabel = showLabel;
    showLabel__is_set = true;
  }
  
  /**
   * element  : showScrollbars of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showScrollbars__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showScrollbars","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showScrollbars__is_set = false;

  private boolean showScrollbars;

  public boolean getShowScrollbars() {
    return showScrollbars;
  }

  

  public boolean isShowScrollbars() {
    return showScrollbars;
  }

  

  public void setShowScrollbars(boolean showScrollbars) {
    this.showScrollbars = showScrollbars;
    showScrollbars__is_set = true;
  }
  
  /**
   * element  : suggestedHeight of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo suggestedHeight__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","suggestedHeight","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean suggestedHeight__is_set = false;

  private java.lang.String suggestedHeight;

  public java.lang.String getSuggestedHeight() {
    return suggestedHeight;
  }

  

  public void setSuggestedHeight(java.lang.String suggestedHeight) {
    this.suggestedHeight = suggestedHeight;
    suggestedHeight__is_set = true;
  }
  
  /**
   * element  : suggestedWidth of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo suggestedWidth__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","suggestedWidth","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean suggestedWidth__is_set = false;

  private java.lang.String suggestedWidth;

  public java.lang.String getSuggestedWidth() {
    return suggestedWidth;
  }

  

  public void setSuggestedWidth(java.lang.String suggestedWidth) {
    this.suggestedWidth = suggestedWidth;
    suggestedWidth__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "Canvas");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, displayLocation__typeInfo, displayLocation, displayLocation__is_set);
    __typeMapper.writeString(__out, referenceId__typeInfo, referenceId, referenceId__is_set);
    __typeMapper.writeBoolean(__out, showLabel__typeInfo, showLabel, showLabel__is_set);
    __typeMapper.writeBoolean(__out, showScrollbars__typeInfo, showScrollbars, showScrollbars__is_set);
    __typeMapper.writeString(__out, suggestedHeight__typeInfo, suggestedHeight, suggestedHeight__is_set);
    __typeMapper.writeString(__out, suggestedWidth__typeInfo, suggestedWidth, suggestedWidth__is_set);
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
    if (__typeMapper.verifyElement(__in, displayLocation__typeInfo)) {
      setDisplayLocation((java.lang.String)__typeMapper.readString(__in, displayLocation__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, referenceId__typeInfo)) {
      setReferenceId((java.lang.String)__typeMapper.readString(__in, referenceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showLabel__typeInfo)) {
      setShowLabel((boolean)__typeMapper.readBoolean(__in, showLabel__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showScrollbars__typeInfo)) {
      setShowScrollbars((boolean)__typeMapper.readBoolean(__in, showScrollbars__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, suggestedHeight__typeInfo)) {
      setSuggestedHeight((java.lang.String)__typeMapper.readString(__in, suggestedHeight__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, suggestedWidth__typeInfo)) {
      setSuggestedWidth((java.lang.String)__typeMapper.readString(__in, suggestedWidth__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Canvas ");
    sb.append(super.toString());
    sb.append(" displayLocation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(displayLocation)+"'\n");
    sb.append(" referenceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(referenceId)+"'\n");
    sb.append(" showLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showLabel)+"'\n");
    sb.append(" showScrollbars=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showScrollbars)+"'\n");
    sb.append(" suggestedHeight=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(suggestedHeight)+"'\n");
    sb.append(" suggestedWidth=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(suggestedWidth)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}