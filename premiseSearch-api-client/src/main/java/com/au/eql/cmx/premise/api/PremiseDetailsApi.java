package com.au.eql.cmx.premise.api;

import com.au.eql.cmx.premise.client.invoker.ApiClient;

import com.au.eql.cmx.premise.model.NMIStatus;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-15T17:41:25.017457+10:00[Australia/Brisbane]")
@Component("com.au.eql.cmx.premise.api.PremiseDetailsApi")
public class PremiseDetailsApi {
    private ApiClient apiClient;

    public PremiseDetailsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PremiseDetailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * searches premise details
     * By passing in the appropriate options, you can search for available inventory in the system 
     * <p><b>200</b> - search results matching criteria
     * <p><b>400</b> - bad input parameter
     * @param nmi passed as an input to retieve information regarding connection point. (required)
     * @return List&lt;NMIStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<NMIStatus> getPremiseDetails(String nmi) throws RestClientException {
        return getPremiseDetailsWithHttpInfo(nmi).getBody();
    }

    /**
     * searches premise details
     * By passing in the appropriate options, you can search for available inventory in the system 
     * <p><b>200</b> - search results matching criteria
     * <p><b>400</b> - bad input parameter
     * @param nmi passed as an input to retieve information regarding connection point. (required)
     * @return ResponseEntity&lt;List&lt;NMIStatus&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<NMIStatus>> getPremiseDetailsWithHttpInfo(String nmi) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'nmi' is set
        if (nmi == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nmi' when calling getPremiseDetails");
        }
        

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nmi", nmi));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<NMIStatus>> returnType = new ParameterizedTypeReference<List<NMIStatus>>() {};
        return apiClient.invokeAPI("/premise", HttpMethod.GET, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
