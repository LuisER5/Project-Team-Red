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
package org.apache.sling.scripting.sightly.apps.teamRedProject.components.hero;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class hero__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_commonstemplates = null;
Object _dynamic_properties = bindings.get("properties");
Object _global_hascontent = null;
out.write("\n");
_global_commonstemplates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_hascontent = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title")) ? renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title") : renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description")));
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("<section class=\"cmp-hero\" id=\"header\">\n        <div class=\"d-flex flex-column justify-content-center cmp-hero__content\"");
    {
        String var_attrcontent0 = (("background-image: url(" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "fileReference"), "unsafe"))) + ");");
        out.write(" style=\"");
        out.write(renderContext.getObjectModel().toString(var_attrcontent0));
        out.write("\"");
    }
    out.write(">\n            <p>");
    {
        Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "file"), "text");
        out.write(renderContext.getObjectModel().toString(var_1));
    }
    out.write("</p>\n            <p class=\"fw-bold cmp-hero__subtitle\">");
    {
        Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "subtitle"), "text");
        out.write(renderContext.getObjectModel().toString(var_2));
    }
    out.write("</p>\n            <h1 class=\"fw-bold cmp-hero__heading\">");
    {
        Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text");
        out.write(renderContext.getObjectModel().toString(var_3));
    }
    out.write("</h1>\n            <p class=\"cmp-hero__text\">");
    {
        Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
        out.write(renderContext.getObjectModel().toString(var_4));
    }
    out.write("</p>\n            <div style=\"display: inline-block\">\n                ");
    {
        Object var_testvariable5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonPrimary");
        if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
            out.write("<a");
            {
                Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "linkPrimary");
                {
                    Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "uri");
                    {
                        boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
                        if (var_shoulddisplayattr9) {
                            out.write(" href");
                            {
                                boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                                if (!var_istrueattr8) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            out.write(" type=\"button\" class=\"btn btn-primary cmp-quote__btn mr-1\">");
            {
                Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonPrimary"), "text");
                out.write(renderContext.getObjectModel().toString(var_10));
            }
            out.write("</a>");
        }
    }
    out.write("\n                ");
    {
        Object var_testvariable11 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonSecondary");
        if (renderContext.getObjectModel().toBoolean(var_testvariable11)) {
            out.write("<a");
            {
                Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "linkSecondary");
                {
                    Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
                    {
                        boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                        if (var_shoulddisplayattr15) {
                            out.write(" href");
                            {
                                boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                                if (!var_istrueattr14) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            out.write(" type=\"button\" class=\"btn btn-outline fw-bold\" style=\"color: #0076d5\">");
            {
                Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonSecondary"), "text");
                out.write(renderContext.getObjectModel().toString(var_16));
            }
            out.write("</a>");
        }
    }
    out.write("\n            </div>\n        </div>\n</section>");
}
out.write("\n");
{
    Object var_templatevar17 = renderContext.getObjectModel().resolveProperty(_global_commonstemplates, "placeholder");
    {
        boolean var_templateoptions18_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_hascontent));
        {
            java.util.Map var_templateoptions18 = obj().with("isEmpty", var_templateoptions18_field$_isempty);
            callUnit(out, renderContext, var_templatevar17, var_templateoptions18);
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

