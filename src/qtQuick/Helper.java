package qtQuick;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Helper {
		
	public static String getClassName(EObject o) {
		return o.eClass().getName();
	}

	public static EList<EAttribute> getAttributes(EObject o) {
		EList<EAttribute> attributes = o.eClass().getEAllAttributes();
		EList<EAttribute> assignedAttributes = new BasicEList<EAttribute>();
		for (EAttribute attribute : attributes) {
			Object attrValue = getAttributeValue(o, attribute);
			if(attrValue != null && !attrValue.equals("")) {
				assignedAttributes.add(attribute);
			}
		}
		return assignedAttributes;
	}
	
	public static String getAttributeName(EObject o, EStructuralFeature f) {
		return f.getName().replace("_", ".");
	}

	public static Object getAttributeValue(EObject o, EStructuralFeature f) {
		return o.eGet(f);
	}

}
