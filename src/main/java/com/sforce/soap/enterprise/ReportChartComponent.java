package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ReportChartComponent extends com.sforce.soap.enterprise.DescribeLayoutComponent {
  /**
   * Constructor
   */
  public ReportChartComponent() {
  }
    
  
  /**
   * element  : cacheData of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo cacheData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","cacheData","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean cacheData__is_set = false;

  private boolean cacheData;

  public boolean getCacheData() {
    return cacheData;
  }

  

  public boolean isCacheData() {
    return cacheData;
  }

  

  public void setCacheData(boolean cacheData) {
    this.cacheData = cacheData;
    cacheData__is_set = true;
  }
  
  /**
   * element  : contextFilterableField of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo contextFilterableField__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contextFilterableField","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean contextFilterableField__is_set = false;

  private java.lang.String contextFilterableField;

  public java.lang.String getContextFilterableField() {
    return contextFilterableField;
  }

  

  public void setContextFilterableField(java.lang.String contextFilterableField) {
    this.contextFilterableField = contextFilterableField;
    contextFilterableField__is_set = true;
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
   * element  : includeContext of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo includeContext__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","includeContext","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean includeContext__is_set = false;

  private boolean includeContext;

  public boolean getIncludeContext() {
    return includeContext;
  }

  

  public boolean isIncludeContext() {
    return includeContext;
  }

  

  public void setIncludeContext(boolean includeContext) {
    this.includeContext = includeContext;
    includeContext__is_set = true;
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
   * element  : size of type {urn:enterprise.soap.sforce.com}ReportChartSize
   * java type: com.sforce.soap.enterprise.ReportChartSize
   */
  private static final com.sforce.ws.bind.TypeInfo size__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","size","urn:enterprise.soap.sforce.com","ReportChartSize",1,1,true);

  private boolean size__is_set = false;

  private com.sforce.soap.enterprise.ReportChartSize size;

  public com.sforce.soap.enterprise.ReportChartSize getSize() {
    return size;
  }

  

  public void setSize(com.sforce.soap.enterprise.ReportChartSize size) {
    this.size = size;
    size__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "ReportChartComponent");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeBoolean(__out, cacheData__typeInfo, cacheData, cacheData__is_set);
    __typeMapper.writeString(__out, contextFilterableField__typeInfo, contextFilterableField, contextFilterableField__is_set);
    __typeMapper.writeString(__out, error__typeInfo, error, error__is_set);
    __typeMapper.writeBoolean(__out, hideOnError__typeInfo, hideOnError, hideOnError__is_set);
    __typeMapper.writeBoolean(__out, includeContext__typeInfo, includeContext, includeContext__is_set);
    __typeMapper.writeBoolean(__out, showTitle__typeInfo, showTitle, showTitle__is_set);
    __typeMapper.writeObject(__out, size__typeInfo, size, size__is_set);
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
    if (__typeMapper.verifyElement(__in, cacheData__typeInfo)) {
      setCacheData((boolean)__typeMapper.readBoolean(__in, cacheData__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, contextFilterableField__typeInfo)) {
      setContextFilterableField((java.lang.String)__typeMapper.readString(__in, contextFilterableField__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, error__typeInfo)) {
      setError((java.lang.String)__typeMapper.readString(__in, error__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, hideOnError__typeInfo)) {
      setHideOnError((boolean)__typeMapper.readBoolean(__in, hideOnError__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, includeContext__typeInfo)) {
      setIncludeContext((boolean)__typeMapper.readBoolean(__in, includeContext__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, showTitle__typeInfo)) {
      setShowTitle((boolean)__typeMapper.readBoolean(__in, showTitle__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, size__typeInfo)) {
      setSize((com.sforce.soap.enterprise.ReportChartSize)__typeMapper.readObject(__in, size__typeInfo, com.sforce.soap.enterprise.ReportChartSize.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ReportChartComponent ");
    sb.append(super.toString());
    sb.append(" cacheData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(cacheData)+"'\n");
    sb.append(" contextFilterableField=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contextFilterableField)+"'\n");
    sb.append(" error=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(error)+"'\n");
    sb.append(" hideOnError=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(hideOnError)+"'\n");
    sb.append(" includeContext=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(includeContext)+"'\n");
    sb.append(" showTitle=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(showTitle)+"'\n");
    sb.append(" size=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(size)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}