package com.nbzwy.lib.common.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.CompactWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.dom4j.Document;
import org.dom4j.Element;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.*;

/**
 * Created by Administrator on 2015-10-26.
 */
public class XmlUtil {
    @SuppressWarnings("unchecked")
    public static Map<String, Object> Dom2Map(Document doc){
        Map<String, Object> map = new HashMap<String, Object>();
        if(doc == null)
            return map;
        Element root = doc.getRootElement();
        for (Iterator iterator = root.elementIterator(); iterator.hasNext();) {
            Element e = (Element) iterator.next();
            List list = e.elements();
            if(list.size() > 0){
                map.put(e.getName(), Dom2Map(e));
            }else
                map.put(e.getName(), e.getText());
        }
        return map;
    }
    @SuppressWarnings("unchecked")
    public static Map Dom2Map(Element e){
        Map map = new HashMap();
        List list = e.elements();
        if(list.size() > 0){
            for (int i = 0;i < list.size(); i++) {
                Element iter = (Element) list.get(i);
                List mapList = new ArrayList();

                if(iter.elements().size() > 0){
                    Map m = Dom2Map(iter);
                    if(map.get(iter.getName()) != null){
                        Object obj = map.get(iter.getName());
                        if(!obj.getClass().getName().equals("java.util.ArrayList")){
                            mapList = new ArrayList();
                            mapList.add(obj);
                            mapList.add(m);
                        }
                        if(obj.getClass().getName().equals("java.util.ArrayList")){
                            mapList = (List) obj;
                            mapList.add(m);
                        }
                        map.put(iter.getName(), mapList);
                    }else
                        map.put(iter.getName(), m);
                }
                else{
                    if(map.get(iter.getName()) != null){
                        Object obj = map.get(iter.getName());
                        if(!obj.getClass().getName().equals("java.util.ArrayList")){
                            mapList = new ArrayList();
                            mapList.add(obj);
                            mapList.add(iter.getText());
                        }
                        if(obj.getClass().getName().equals("java.util.ArrayList")){
                            mapList = (List) obj;
                            mapList.add(iter.getText());
                        }
                        map.put(iter.getName(), mapList);
                    }else
                        map.put(iter.getName(), iter.getText());
                }
            }
        }else
            map.put(e.getName(), e.getText());
        return map;
    }

    public static <K,V> void toXml(Map<K, V> map, Writer out) throws IOException, XMLStreamException {
        XMLStreamWriter xsw = null;
        try {
            try {
                XMLOutputFactory xof = XMLOutputFactory.newInstance();
                // If you want pretty-printing, you can use:
                //xsw = new javanet.staxutils.IndentingXMLStreamWriter(xof.createXMLStreamWriter(out));

                xsw = xof.createXMLStreamWriter(out);
                xsw.writeStartDocument("utf-8", "1.0");
                xsw.writeStartElement("entries");

                // Do the Collection
                for (Map.Entry<K, V> e : map.entrySet()) {
                    xsw.writeStartElement("entry");
                    xsw.writeAttribute("key", e.getKey().toString());
                    xsw.writeAttribute("value", e.getValue().toString());
                    xsw.writeEndElement();
                }
                xsw.writeEndElement();
                xsw.writeEndDocument();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) { /* ignore */ }
                }
            }// end inner finally
        } finally {
            if (xsw != null) {
                try {
                    xsw.close();
                } catch (XMLStreamException e) { /* ignore */ }
            }
        }
    }

    /**
     *
     * @param obj
     * @param format 格式化
     * @return
     */
    public static String toXml(Object obj, boolean format) {
        XStream xstream = new XStream();
        // XStream xstream=new XStream(new DomDriver());
        // XStream xstream=new XStream(new DomDriver("utf-8"));

        xstream.processAnnotations(obj.getClass());
        if (format) {
            return xstream.toXML(obj);
        } else {
            Writer writer = new StringWriter();
            xstream.marshal(obj, new CompactWriter(writer));
            return writer.toString();
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T toBean(String xmlStr, Class<T> cls) {
        XStream xstream = new XStream(new DomDriver());
        xstream.processAnnotations(cls);
        T obj = (T) xstream.fromXML(xmlStr);
        return obj;
    }
}
