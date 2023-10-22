package com.example.auth0.pojo.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ClientConsultationForm {
    @JsonProperty("formId")
    private int form_id;
    @JsonProperty("formName")
    private String form_name;
    @JsonProperty("formDescription")
    private String form_description;
    @JsonProperty("assignedService")
    private List<Integer> assigned_services;
    @JsonProperty("frequency")
    private int frequency;
    private List<DataModel> data_model;

    @Data
    public static class DataModel {
        private String label;
        private String inputType;
        private List<String> options;
    }
}
