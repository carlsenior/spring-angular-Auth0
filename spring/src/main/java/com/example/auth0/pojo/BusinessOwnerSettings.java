package com.example.auth0.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class
BusinessOwnerSettings {
   int setting_id;
   String logo;
   String site_name;
   String businessAddress;
   String companyTradingName;
   String tel;
   String default_email;
   String language;
   String businessOwnerVersion;
   String mobileAppVersion;
   String theme;
   String timezone;
   String currency_prefix;
   Boolean stripe;
   String stripe_secret_key;
   String stripe_publishable_key;
   Boolean smsEnabled;
   String smsClientName;
   String colour_primary;
   String colour_secondary;
   String colour_text;
   String bio;
   String smsToken;
   String smsApiKey;
   Boolean is_deleted;
}
