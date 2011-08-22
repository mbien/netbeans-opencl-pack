/*
 * Created on Monday, August 22 2011 03:18
 */
package com.mbien.opencl.editor;

import java.util.Collection;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.ParserFactory;

/**
 *
 * @author mbien
 */
public class NBCLParserFactory extends ParserFactory {

    @Override
    public Parser createParser(Collection<Snapshot> snapshots) {
        return new NBCLParser();
    }

}
