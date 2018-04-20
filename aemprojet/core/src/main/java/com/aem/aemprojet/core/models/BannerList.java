package com.aem.aemprojet.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  
  
@Model(adaptables = Resource.class)
public class BannerList {
  
    private final Logger LOG = LoggerFactory.getLogger(getClass());
  
    @Inject @Optional
    public String bgstyle; // corresponds to the node in the dialog named bgstyle
     
    @Inject @Optional
    public String backimage; // corresponds to the node in the dialog named image
     
    @Inject @Optional
    public String backcolor ;
     
        
    @Inject @Optional @Default(values="image.jpg")
    public String bannerimage; // corresponds to the node in the dialog named bannerimage
     
    @Inject @Optional @Default(values="right")
    public String position; // corresponds to the node in the dialog named position
     
     
    @Inject @Optional @Default(values="Heading")
    public String heading; // corresponds to the node in the dialog named heading
     
    @Inject @Optional @Default(values="60")
    public String fontsize; // corresponds to the node in the dialog named fontsize
     
     
    @Inject @Optional @Default(values="As an Adobe Experience Manager Developer, you can create a custom Banner component. A Banner Component typically embeds an advertisement into a web page.  That is, it is used to attract traffic to a website by linking to the website of the advertiser. This development article walk you thought how to build a responsive Banner component that can be used in an AEM site.")
    public String description; // corresponds to the node in the dialog named description
     
    @Inject @Optional @Default(values="More Info")
    public String buttontext; // corresponds to the node in the dialog named buttontext
     
    @Inject @Optional @Default(values="/content/aemprojet/fr.html")
    public String hreflink; // corresponds to the node in the dialog named hreflink
     
    private String m_bgstyle;
     
    private String m_image  ; 
     
    private String m_color ; 
     
    private String m_bannerimage;
     
    private String m_position;
     
    private String m_heading;;
     
    private String m_fontsize;;
     
    private String m_description;
     
    private String m_buttontext;
     
    private String m_hreflink ;
  
       
    
    @PostConstruct
    protected void init() {
    
        if (bgstyle == null) // value not injected
            m_bgstyle = "color";
        else
            m_bgstyle = bgstyle; 
             
        LOG.info("m_bgstyle is  **** "+ m_bgstyle);
         
        if (backimage == null) // value not injected
            m_image = "/content/dam/we-retail/en/products/Product_catalog.jpg 	";
        else
            m_image = backimage;
         
         
        LOG.info("m_bgimage is  **** "+ m_image); 
         
                  
        if (backcolor == null) // value not injected
            m_color = "#2657a5";
        else
            m_color = backcolor;
         
        LOG.info("m_bgcolor is  **** "+ m_color); 
         
        m_bannerimage = bannerimage ; 
        m_position = position; 
        m_heading = heading; 
        m_fontsize= fontsize;
        m_description =description; 
        m_buttontext = buttontext;
        m_hreflink=hreflink;

    }
  
    public String getBgstyle() {
        return m_bgstyle;
    }
     
    public String getBackcolor() {
        return m_color;
    }
     
     
    public String getBackimage() {
        return m_image;
    }
     
    public String getBannerimage() {
        return m_bannerimage;
    }
     
    public String getPosition() {
        return m_position ;
    }
     
        
    public String getHeading() {
        return m_heading;
    }
    
    public String getFontsize() {
        return m_fontsize;
    }
     
    public String getDescription() {
        return m_description;
    }
     
    public String getButtontext() {
        return m_buttontext;
    }
     
    public String getHreflink() {
        return m_hreflink;
    }
    
}