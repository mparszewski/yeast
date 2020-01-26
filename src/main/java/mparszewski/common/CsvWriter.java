package mparszewski.common;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CsvWriter {

    public static void write(Writer writer, List<Yeast> values) throws IOException {
        StringBuilder builder = new StringBuilder("sequence_name,mcg,gvh,alm,mit,erl,pox,vac,nuc,class_distribution\n");
        for (Yeast yeast : values) {
            builder.append(yeast.toString());
            builder.append("\n");
        }
        writer.append(builder.toString());
    }


}
