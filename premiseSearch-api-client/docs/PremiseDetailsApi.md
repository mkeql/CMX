# PremiseDetailsApi

All URIs are relative to *https://virtserver.swaggerhub.com/mkeql/PremiseSearch/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPremiseDetails**](PremiseDetailsApi.md#getPremiseDetails) | **GET** /premise | searches premise details



## getPremiseDetails

> List&lt;NMIStatus&gt; getPremiseDetails(nmi)

searches premise details

By passing in the appropriate options, you can search for available inventory in the system 

### Example

```java
// Import classes:
import com.au.eql.cmx.premise.client.invoker.ApiClient;
import com.au.eql.cmx.premise.client.invoker.ApiException;
import com.au.eql.cmx.premise.client.invoker.Configuration;
import com.au.eql.cmx.premise.client.invoker.models.*;
import com.au.eql.cmx.premise.api.PremiseDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/mkeql/PremiseSearch/1.0.0");

        PremiseDetailsApi apiInstance = new PremiseDetailsApi(defaultClient);
        String nmi = "nmi_example"; // String | passed as an input to retieve information regarding connection point.
        try {
            List<NMIStatus> result = apiInstance.getPremiseDetails(nmi);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PremiseDetailsApi#getPremiseDetails");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nmi** | **String**| passed as an input to retieve information regarding connection point. |

### Return type

[**List&lt;NMIStatus&gt;**](NMIStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | search results matching criteria |  -  |
| **400** | bad input parameter |  -  |

