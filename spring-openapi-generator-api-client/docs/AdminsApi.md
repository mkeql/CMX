# AdminsApi

All URIs are relative to *https://virtserver.swaggerhub.com/mkeql/Connect/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnect**](AdminsApi.md#createConnect) | **POST** /connect | create a connect



## createConnect

> createConnect(connect)

create a connect

create a connect in peace

### Example

```java
// Import classes:
import com.au.eql.cmx.connect.client.invoker.ApiClient;
import com.au.eql.cmx.connect.client.invoker.ApiException;
import com.au.eql.cmx.connect.client.invoker.Configuration;
import com.au.eql.cmx.connect.client.invoker.models.*;
import com.au.eql.cmx.connect.api.AdminsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/mkeql/Connect/1.0.0");

        AdminsApi apiInstance = new AdminsApi(defaultClient);
        Connect connect = new Connect(); // Connect | Optional description in *Markdown*
        try {
            apiInstance.createConnect(connect);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#createConnect");
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
 **connect** | [**Connect**](Connect.md)| Optional description in *Markdown* |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | connect created |  -  |
| **400** | invalid input, object invalid |  -  |
| **409** | an existing item already exists |  -  |

