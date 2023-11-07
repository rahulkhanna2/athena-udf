package com.demo.athena;

import com.amazonaws.athena.connector.lambda.handlers.UserDefinedFunctionHandler;

public class AthenaUDFHandler
        extends UserDefinedFunctionHandler {
    private static final String SOURCE_TYPE = "athena_common_udfs";

    public AthenaUDFHandler() {
        super(SOURCE_TYPE);
    }

    public String compress(String input) {
        return "ABBBABABABABABAB_" + input;
    }

    public String decompress(String input) {
        return "NVNVNVNVNVNVNV_" + input;
    }

}