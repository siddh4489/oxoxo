package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class AnalyticsCloudComponent extends com.sforce.soap.enterprise.DescribeLayoutComponent {
  /**
   * Constructor
   */
  public AnalyticsCloudComponent() {
  }
    
  
  /**
   * element  : error of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo error__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","error","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean error__is_set = false;

  private java.lang.String error;

  public java.lang.String getError() {
    return error;
  }

  

  public void setError(java.lang.String error) {
    this.error = error;
    error__is_set = true;
  }
  
  /**
   * element  : filter of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo filter__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","filter","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean filter__is_set = false;

  private java.lang.String filter;

  public java.lang.String getFilter() {
    return filter;
  }

  

  public void setFilter(java.lang.String filter) {
    this.filter = filter;
    filter__is_set = true;
  }
  
  /**
   * element  : height of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo height__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","height","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean height__is_set = false;

  private java.lang.String height;

  public java.lang.String getHeight() {
    return height;
  }

  

  public void setHeight(java.lang.String height) {
    this.height = height;
    height__is_set = true;
  }
  
  /**
   * element  : hideOnError of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo hideOnError__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","hideOnError","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean hideOnError__is_set = false;

  private boolean hideOnError;

  public boolean getHideOnError() {
    return hideOnError;
  }

  

  public boolean isHideOnError() {
    return hideOnError;
  }

  

  public void setHideOnError(boolean hideOnError) {
    this.hideOnError = hideOnError;
    hideOnError__is_set = true;
  }
  
  /**
   * element  : showSharing of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showSharing__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showSharing","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showSharing__is_set = false;

  private boolean showSharing;

  public boolean getShowSharing() {
    return showSharing;
  }

  

  public boolean isShowSharing() {
    return showSharing;
  }

  

  public void setShowSharing(boolean showSharing) {
    this.showSharing = showSharing;
    showSharing__is_set = true;
  }
  
  /**
   * element  : showTitle of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo showTitle__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","showTitle","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean showTitle__is_set = false;

  private boolean showTitle;

  public boolean getShowTitle() {
    return showTitle;
  }

  

  public boolean isShowTitle() {
    return showTitle;
  }

  

  public void setShowTitle(boolean showTitle) {
    this.showTitle = showTitle;
    showTitle__is_set = true;
  }
  
  /**
   * element  : width of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo width__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","width","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean width__is_set = false;

  private java.lang.String width;

  public java.lang.String getWidth() {
    return width;
  }

  

  public void setWidth(java.lang.String width) {
    this.width = width;
    width__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "AnalyticsCloudComponent");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, error__typeInfo, error, error__is_set);
    __typeMapper.writeString(__out, filter__typeInfo, filter, filter__is_set);
    __typeMapper.writeString(__out, height__typeInfo, height, height__is_set);
    __typeMapper.writeBoolean(__out, hideOnError__typeInfo, hideOnError, hideOnError__is_set);
    __typeMapper.writeBoolean(__out, showSharing__typeInfo, showSharing, showSharing__is_set);
    __typeMapper.writeBoolean(__out, showTitle__typeInfo, showTitle, showTitle__is_set);
    __typeMapper.writeString(__out, width__typeInfo, width, width__is_set);
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
    if (__typeMapper.verifyElement(__in, error__typeInfo)) {
      setError((java.lang.String)__typeMapper.readString(__in, error__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, filter__typeInfo)) {
      setFilter((java.lang.String)__typeMapper.readString(__in, filter__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, height__typeInfo)) {
      setHeight((java.lang.String)__typeMapper.readString(__in, height__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, hideOnError__typeInfo)) {
      setHideOnError((boolean)__typeMapper.readBoolean(__in, hideOnError__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showSharing__typeInfo)) {
      setShowSharing((boolean)__typeMapper.readBoolean(__in, showSharing__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showTitle__typeInfo)) {
      setShowTitle((boolean)__typeMapper.readBoolean(__in, showTitle__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, width__typeInfo)) {
      setWidth((java.lang.String)__typeMapper.readString(__in, width__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AnalyticsCloudComponent ");
    sb.append(super.toString());
    sb.append(" error=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(error)+"'\n");
    sb.append(" filter=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(filter)+"'\n");
    sb.append(" height=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(height)+"'\n");
    sb.append(" hideOnError=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(hideOnError)+"'\n");
    sb.append(" showSharing=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showSharing)+"'\n");
    sb.append(" showTitle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showTitle)+"'\n");
    sb.append(" width=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(width)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}