# ConnectApi

All URIs are relative to *https://virtserver.swaggerhub.com/mkeql/Connect/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnect**](ConnectApi.md#createConnect) | **POST** /cmx/connect | create a connect



## createConnect

> ModelApiResponse createConnect(connect)

create a connect

create a connect in peace

### Example

```java
// Import classes:
import com.au.eql.cmx.connect.client.invoker.ApiClient;
import com.au.eql.cmx.connect.client.invoker.ApiException;
import com.au.eql.cmx.connect.client.invoker.Configuration;
import com.au.eql.cmx.connect.client.invoker.models.*;
import com.au.eql.cmx.connect.api.ConnectApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/mkeql/Connect/1.0.0");

        ConnectApi apiInstance = new ConnectApi(defaultClient);
        Connect connect = new Connect(); // Connect | Optional description in *Markdown*
        try {
            ModelApiResponse result = apiInstance.createConnect(connect);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ConnectApi#createConnect");
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

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | invalid input, object invalid |  -  |
| **409** | an existing item already exists |  -  |

