/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.teamRedProject.components.button;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class button__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_commonstemplates = null;
Object _global_button = null;
Object _global_component = null;
Object _global_icontemplate = null;
Object _global_showcomponent = null;
Object _dynamic_properties = bindings.get("properties");
out.write("\r\n");
_global_commonstemplates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_button = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Button.class.getName(), obj());
_global_component = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Component.class.getName(), obj());
_global_icontemplate = renderContext.call("use", "icon.html", obj());
_global_showcomponent = renderContext.getObjectModel().resolveProperty(_global_button, "text");
if (renderContext.getObjectModel().toBoolean(_global_showcomponent)) {
    {
        Object var_tagvar0 = renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_button, "link")) ? "a" : "button"), "elementName");
        if (renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("<");
            out.write(renderContext.getObjectModel().toString(var_tagvar0));
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("<button");
        }
        {
            String var_attrvalue1 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_button, "link")) ? "" : "button");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" type");
                        {
                            boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                            if (!var_istrueattr3) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_global_component, "id");
            {
                Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "attribute");
                {
                    boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
                    if (var_shoulddisplayattr8) {
                        out.write(" id");
                        {
                            boolean var_istrueattr7 = (var_attrvalue5.equals(true));
                            if (!var_istrueattr7) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            String var_attrcontent9 = ("cmp-button btn default-style-button " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "style"), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent9));
            out.write("\"");
        }
        {
            Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_global_button, "link");
            {
                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                {
                    boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                    if (var_shoulddisplayattr13) {
                        out.write(" href");
                        {
                            boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                            if (!var_istrueattr12) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_global_button, "accessibilityLabel");
            {
                Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                {
                    boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                    if (var_shoulddisplayattr17) {
                        out.write(" aria-label");
                        {
                            boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                            if (!var_istrueattr16) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            boolean var_attrvalue18 = (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_button, "data")) ? true : false);
            {
                Object var_attrcontent19 = renderContext.call("xss", var_attrvalue18, "attribute");
                {
                    boolean var_shoulddisplayattr21 = (((null != var_attrcontent19) && (!"".equals(var_attrcontent19))) && ((!"".equals(var_attrvalue18)) && (false != var_attrvalue18)));
                    if (var_shoulddisplayattr21) {
                        out.write(" data-cmp-clickable");
                        {
                            boolean var_istrueattr20 = (var_attrvalue18 == true);
                            if (!var_istrueattr20) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent19));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue22 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_button, "data"), "json");
            {
                Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "attribute");
                {
                    boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (!((Object)false).equals(var_attrvalue22))));
                    if (var_shoulddisplayattr25) {
                        out.write(" data-cmp-data-layer");
                        {
                            boolean var_istrueattr24 = (var_attrvalue22.equals(true));
                            if (!var_istrueattr24) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent23));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">\r\n    ");
        {
            Object var_templatevar26 = renderContext.getObjectModel().resolveProperty(_global_icontemplate, "icon");
            {
                Object var_templateoptions27_field$_icon = renderContext.getObjectModel().resolveProperty(_global_button, "icon");
                {
                    java.util.Map var_templateoptions27 = obj().with("icon", var_templateoptions27_field$_icon);
                    callUnit(out, renderContext, var_templatevar26, var_templateoptions27);
                }
            }
        }
        out.write("\r\n    <span class=\"cmp-button__text\">");
        {
            Object var_28 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_button, "text"), "text");
            out.write(renderContext.getObjectModel().toString(var_28));
        }
        out.write("</span>\r\n");
        if (renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("</");
            out.write(renderContext.getObjectModel().toString(var_tagvar0));
            out.write(">");
        }
        if (!renderContext.getObjectModel().toBoolean(var_tagvar0)) {
            out.write("</button>");
        }
    }
}
out.write("\r\n");
{
    Object var_templatevar29 = renderContext.getObjectModel().resolveProperty(_global_commonstemplates, "placeholder");
    {
        boolean var_templateoptions30_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_showcomponent));
        {
            java.util.Map var_templateoptions30 = obj().with("isEmpty", var_templateoptions30_field$_isempty);
            callUnit(out, renderContext, var_templatevar29, var_templateoptions30);
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

