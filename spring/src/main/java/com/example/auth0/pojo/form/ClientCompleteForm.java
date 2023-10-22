package com.example.auth0.pojo.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientCompleteForm {
    @JsonProperty("id")
    private int id;
    @JsonProperty("clientId")
    private String client_id;
    @JsonProperty("formData")
    private String form_data;
    @JsonProperty("formId")
    private int form_id;
}
