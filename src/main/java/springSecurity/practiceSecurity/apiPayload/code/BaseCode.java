package springSecurity.practiceSecurity.apiPayload.code;

import springSecurity.practiceSecurity.apiPayload.code.dto.ReasonDTO;

public interface BaseCode {
    ReasonDTO getReason();
    ReasonDTO getReasonHttpStatus();
}
