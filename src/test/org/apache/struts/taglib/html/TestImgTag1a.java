/*
 * $Id$ 
 *
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts.taglib.html;

import java.util.HashMap;
import java.util.Locale;

import javax.servlet.jsp.PageContext;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.cactus.JspTestCase;
import org.apache.struts.Globals;
import org.apache.struts.taglib.SimpleBeanForTesting;

/**
 * Suite of unit tests for the
 * <code>org.apache.struts.taglib.html.ImgTag</code> class.
 *
 */
public class TestImgTag1a extends JspTestCase {

    /**
     * Defines the testcase name for JUnit.
     *
     * @param theName the testcase's name.
     */
    public TestImgTag1a(String theName) {
        super(theName);
    }

    /**
     * Start the tests.
     *
     * @param theArgs the arguments. Not used
     */
    public static void main(String[] theArgs) {
        junit.awtui.TestRunner.main(new String[] {TestImgTag1a.class.getName()});
    }

    /**
     * @return a test suite (<code>TestSuite</code>) that includes all methods
     *         starting with "test"
     */
    public static Test suite() {
        // All methods starting with "test" will be executed in the test suite.
        return new TestSuite(TestImgTag1a.class);
    }

    private void runMyTest(String whichTest, String locale) throws Exception {
        pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale), PageContext.SESSION_SCOPE);
        pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"), PageContext.REQUEST_SCOPE);
        request.setAttribute("runTest", whichTest);
        pageContext.forward("/test/org/apache/struts/taglib/html/TestImgTag1a.jsp");
    }

    /*
     * Testing ImgTag.
     */

//--------Testing attributes using page------

    public void testImgPageNameNoScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                pageContext.setAttribute("paramMapNoScope", map, PageContext.REQUEST_SCOPE);
       runMyTest("testImgPageNameNoScope", "");
    }

    public void testImgPageNamePropertyNoScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
                pageContext.setAttribute("paramPropertyMapNoScope", sbft, PageContext.REQUEST_SCOPE);
       runMyTest("testImgPageNamePropertyNoScope", "");
    }

    public void testImgPageNameApplicationScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                pageContext.setAttribute("paramMapApplicationScope", map, PageContext.APPLICATION_SCOPE);
       runMyTest("testImgPageNameApplicationScope", "");
    }

    public void testImgPageNamePropertyApplicationScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
                pageContext.setAttribute("paramPropertyMapApplicationScope", sbft, PageContext.APPLICATION_SCOPE);
       runMyTest("testImgPageNamePropertyApplicationScope", "");
    }

    public void testImgPageNameSessionScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                pageContext.setAttribute("paramMapSessionScope", map, PageContext.SESSION_SCOPE);
       runMyTest("testImgPageNameSessionScope", "");
    }

    public void testImgPageNamePropertySessionScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
                pageContext.setAttribute("paramPropertyMapSessionScope", sbft, PageContext.SESSION_SCOPE);
       runMyTest("testImgPageNamePropertySessionScope", "");
    }

    public void testImgPageNameRequestScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                pageContext.setAttribute("paramMapRequestScope", map, PageContext.REQUEST_SCOPE);
       runMyTest("testImgPageNameRequestScope", "");
    }

    public void testImgPageNamePropertyRequestScope() throws Exception {
                HashMap map = new HashMap();
                map.put("param1","value1");
                map.put("param2","value2");
                map.put("param3","value3");
                map.put("param4","value4");
                SimpleBeanForTesting sbft = new SimpleBeanForTesting(map);
                pageContext.setAttribute("paramPropertyMapRequestScope", sbft, PageContext.REQUEST_SCOPE);
       runMyTest("testImgPageNamePropertyRequestScope", "");
    }



}
