/**
 * @(#)YDExtBattriWriter, 16/6/16.
 * <p/>
 * Copyright 2016 Yodao, Inc. All rights reserved.
 * YODAO PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import com.fasterxml.jackson.core.JsonGenerator;
import com.google.openrtb.json.OpenRtbJsonExtWriter;

import java.io.IOException;

/**
 * @author panpengfei.
 * @version 1.0.0
 */
public class YDExtBattriWriter extends OpenRtbJsonExtWriter<Integer> {

    public YDExtBattriWriter() {
        super(Constants.EXTEND_BATTRI_FIELD_NAME, false);
    }

    @Override
    protected void write(Integer ext, JsonGenerator gen) throws IOException {
        gen.writeNumber(ext);
    }
}
