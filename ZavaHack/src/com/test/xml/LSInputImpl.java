package com.test.xml;
import java.io.InputStream;
import java.io.Reader;

import org.w3c.dom.ls.LSInput;

public class LSInputImpl implements LSInput {
 
    private Reader characterStream;
    private InputStream byteStream;
    private String stringData;
    private String systemId;
    private String publicId;
    private String baseURI;
    private String encoding;
    private boolean certifiedText;
	@Override
	public Reader getCharacterStream()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setCharacterStream(Reader characterStream)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public InputStream getByteStream()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setByteStream(InputStream byteStream)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getStringData()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setStringData(String stringData)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getSystemId()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setSystemId(String systemId)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getPublicId()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setPublicId(String publicId)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getBaseURI()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setBaseURI(String baseURI)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getEncoding()
	{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setEncoding(String encoding)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean getCertifiedText()
	{
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setCertifiedText(boolean certifiedText)
	{
		// TODO Auto-generated method stub
		
	}
 
    // Getters and setters here
}