/* LanguageTool, a natural language style checker 
 * Copyright (C) 2005 Daniel Naber (http://www.danielnaber.de)
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.synthesis.sk;

import org.languagetool.JLanguageTool;
import org.languagetool.synthesis.BaseSynthesizer;

/**
 * Slovak word form synthesizer. <br/>
 * 
 * @author Marcin Miłkowski
 */

public class SlovakSynthesizer extends BaseSynthesizer {

  private static final String RESOURCE_FILENAME = "/sk/slovak_synth.dict";

  private static final String TAGS_FILE_NAME = "/sk/slovak_tags.txt";

  public SlovakSynthesizer() {
    super(JLanguageTool.getDataBroker().getResourceDir() + RESOURCE_FILENAME, 
    		JLanguageTool.getDataBroker().getResourceDir() + TAGS_FILE_NAME);
  }
}
