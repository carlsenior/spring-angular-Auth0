package com.example.auth0.pojo.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientFormDetails {
    @JsonProperty("clientFormId")
    int client_form_id;
    @JsonProperty("clientId")
    int client_id;
    @JsonProperty("formDetails")
    int form_details;
}
