// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import communitycommons.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Encodes a string to HTML Entities, so that they can be displayed in the browser without breaking any layout. 
 * 
 * This is useful for special widgets which allow HTML to be rendered properly, including special characters as '<' and '&'. 
 * For example '<' will be encoded as '&lt;' and '&' will be encoded as '&amp;'
 * 
 * Returns the encoded string.
 */
public class HTMLEncode extends CustomJavaAction<String>
{
	private String value;

	public HTMLEncode(IContext context, String value)
	{
		super(context);
		this.value = value;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.HTMLEncode(value);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "HTMLEncode";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
