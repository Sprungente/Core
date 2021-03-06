package me.dablakbandit.core.json;

import java.io.StringWriter;

import me.dablakbandit.core.json.JSONWriter;

public class JSONStringer extends JSONWriter {

    public JSONStringer() {
        super(new StringWriter());
    }

    public String toString() {
        return this.mode == 'd' ? this.writer.toString() : null;
    }
}
