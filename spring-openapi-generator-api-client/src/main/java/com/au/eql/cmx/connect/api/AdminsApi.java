package com.au.eql.cmx.connect.api;

import com.au.eql.cmx.connect.client.invoker.ApiClient;

import com.au.eql.cmx.connect.model.Connect;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-06T13:38:35.354059+10:00[Australia/Brisbane]")
@Component("com.au.eql.cmx.connect.api.AdminsApi")
public class AdminsApi {
    private ApiClient apiClient;

    public AdminsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AdminsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * create a connect
     * create a connect in peace
     * <p><b>201</b> - connect created
     * <p><b>400</b> - invalid input, object invalid
     * <p><b>409</b> - an existing item already exists
     * @param connect Optional description in *Markdown* (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createConnect(Connect connect) throws RestClientException {
        createConnectWithHttpInfo(connect);
    }

    /**
     * create a connect
     * create a connect in peace
     * <p><b>201</b> - connect created
     * <p><b>400</b> - invalid input, object invalid
     * <p><b>409</b> - an existing item already exists
     * @param connect Optional description in *Markdown* (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createConnectWithHttpInfo(Connect connect) throws RestClientException {
        Object postBody = connect;
        
        // verify the required parameter 'connect' is set
        if (connect == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connect' when calling createConnect");
        }
        

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/connect", HttpMethod.POST, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
