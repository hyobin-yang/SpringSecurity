package springSecurity.practiceSecurity.exception.handler;

import springSecurity.practiceSecurity.apiPayload.code.BaseErrorCode;
import springSecurity.practiceSecurity.exception.GeneralException;

public class ExceptionHandler extends GeneralException {

    public ExceptionHandler(BaseErrorCode errorCode){
        super(errorCode);
    }
}
