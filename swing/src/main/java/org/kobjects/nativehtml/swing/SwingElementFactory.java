package org.kobjects.nativehtml.swing;

import org.kobjects.nativehtml.dom.ElementFactory;
import org.kobjects.nativehtml.dom.Document;
import org.kobjects.nativehtml.dom.Element;
import org.kobjects.nativehtml.dom.ElementType;

public class SwingElementFactory implements ElementFactory {

	@Override
	public Element createElement(Document document, ElementType elementType, String elementName) {
		switch (elementType) {
			
		case COMPONENT:
			if (elementName.equals("select")) {
				return new HtmlSelectComponent(document, elementName);
			} 
			if (elementName.equals("input")) {
				return new HtmlInputComponent(document, elementName);
			}
			if (elementName.equals("text-component")) {
				return new TextComponent(document);
			}
			return new ComponentContainer(document, elementName);
			
		default:
			return null;
		}
	}
	
}