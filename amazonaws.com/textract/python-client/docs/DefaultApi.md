# openapi_client.DefaultApi

All URIs are relative to *http://textract.us-east-1.amazonaws.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze_document**](DefaultApi.md#analyze_document) | **POST** /#X-Amz-Target&#x3D;Textract.AnalyzeDocument | 
[**analyze_expense**](DefaultApi.md#analyze_expense) | **POST** /#X-Amz-Target&#x3D;Textract.AnalyzeExpense | 
[**analyze_id**](DefaultApi.md#analyze_id) | **POST** /#X-Amz-Target&#x3D;Textract.AnalyzeID | 
[**detect_document_text**](DefaultApi.md#detect_document_text) | **POST** /#X-Amz-Target&#x3D;Textract.DetectDocumentText | 
[**get_document_analysis**](DefaultApi.md#get_document_analysis) | **POST** /#X-Amz-Target&#x3D;Textract.GetDocumentAnalysis | 
[**get_document_text_detection**](DefaultApi.md#get_document_text_detection) | **POST** /#X-Amz-Target&#x3D;Textract.GetDocumentTextDetection | 
[**get_expense_analysis**](DefaultApi.md#get_expense_analysis) | **POST** /#X-Amz-Target&#x3D;Textract.GetExpenseAnalysis | 
[**get_lending_analysis**](DefaultApi.md#get_lending_analysis) | **POST** /#X-Amz-Target&#x3D;Textract.GetLendingAnalysis | 
[**get_lending_analysis_summary**](DefaultApi.md#get_lending_analysis_summary) | **POST** /#X-Amz-Target&#x3D;Textract.GetLendingAnalysisSummary | 
[**start_document_analysis**](DefaultApi.md#start_document_analysis) | **POST** /#X-Amz-Target&#x3D;Textract.StartDocumentAnalysis | 
[**start_document_text_detection**](DefaultApi.md#start_document_text_detection) | **POST** /#X-Amz-Target&#x3D;Textract.StartDocumentTextDetection | 
[**start_expense_analysis**](DefaultApi.md#start_expense_analysis) | **POST** /#X-Amz-Target&#x3D;Textract.StartExpenseAnalysis | 
[**start_lending_analysis**](DefaultApi.md#start_lending_analysis) | **POST** /#X-Amz-Target&#x3D;Textract.StartLendingAnalysis | 


# **analyze_document**
> AnalyzeDocumentResponse analyze_document(x_amz_target, analyze_document_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Analyzes an input document for relationships between detected items. </p> <p>The types of information returned are as follows: </p> <ul> <li> <p>Form data (key-value pairs). The related information is returned in two <a>Block</a> objects, each of type <code>KEY_VALUE_SET</code>: a KEY <code>Block</code> object and a VALUE <code>Block</code> object. For example, <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.</p> </li> <li> <p>Table and table cell data. A TABLE <code>Block</code> object contains information about a detected table. A CELL <code>Block</code> object is returned for each cell in a table.</p> </li> <li> <p>Lines and words of text. A LINE <code>Block</code> object contains one or more WORD <code>Block</code> objects. All lines and words that are detected in the document are returned (including text that doesn't have a relationship with the value of <code>FeatureTypes</code>). </p> </li> <li> <p>Signatures. A SIGNATURE <code>Block</code> object contains the location information of a signature in a document. If used in conjunction with forms or tables, a signature can be given a Key-Value pairing or be detected in the cell of a table.</p> </li> <li> <p>Query. A QUERY Block object contains the query text, alias and link to the associated Query results block object.</p> </li> <li> <p>Query Result. A QUERY_RESULT Block object contains the answer to the query and an ID that connects it to the query asked. This Block also contains a confidence score.</p> </li> </ul> <p>Selection elements such as check boxes and option buttons (radio buttons) can be detected in form data and in tables. A SELECTION_ELEMENT <code>Block</code> object contains information about a selection element, including the selection status.</p> <p>You can choose which type of analysis to perform by specifying the <code>FeatureTypes</code> list. </p> <p>The output is returned in a list of <code>Block</code> objects.</p> <p> <code>AnalyzeDocument</code> is a synchronous operation. To analyze documents asynchronously, use <a>StartDocumentAnalysis</a>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html\">Document Text Analysis</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.analyze_document_request import AnalyzeDocumentRequest
from openapi_client.models.analyze_document_response import AnalyzeDocumentResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    analyze_document_request = openapi_client.AnalyzeDocumentRequest() # AnalyzeDocumentRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.analyze_document(x_amz_target, analyze_document_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->analyze_document:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->analyze_document: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **analyze_document_request** | [**AnalyzeDocumentRequest**](AnalyzeDocumentRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**AnalyzeDocumentResponse**](AnalyzeDocumentResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | UnsupportedDocumentException |  -  |
**483** | DocumentTooLargeException |  -  |
**484** | BadDocumentException |  -  |
**485** | AccessDeniedException |  -  |
**486** | ProvisionedThroughputExceededException |  -  |
**487** | InternalServerError |  -  |
**488** | ThrottlingException |  -  |
**489** | HumanLoopQuotaExceededException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyze_expense**
> AnalyzeExpenseResponse analyze_expense(x_amz_target, analyze_expense_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p> <code>AnalyzeExpense</code> synchronously analyzes an input document for financially related relationships between text.</p> <p>Information is returned as <code>ExpenseDocuments</code> and seperated as follows:</p> <ul> <li> <p> <code>LineItemGroups</code>- A data set containing <code>LineItems</code> which store information about the lines of text, such as an item purchased and its price on a receipt.</p> </li> <li> <p> <code>SummaryFields</code>- Contains all other information a receipt, such as header information or the vendors name.</p> </li> </ul>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.analyze_expense_request import AnalyzeExpenseRequest
from openapi_client.models.analyze_expense_response import AnalyzeExpenseResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    analyze_expense_request = openapi_client.AnalyzeExpenseRequest() # AnalyzeExpenseRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.analyze_expense(x_amz_target, analyze_expense_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->analyze_expense:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->analyze_expense: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **analyze_expense_request** | [**AnalyzeExpenseRequest**](AnalyzeExpenseRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**AnalyzeExpenseResponse**](AnalyzeExpenseResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | UnsupportedDocumentException |  -  |
**483** | DocumentTooLargeException |  -  |
**484** | BadDocumentException |  -  |
**485** | AccessDeniedException |  -  |
**486** | ProvisionedThroughputExceededException |  -  |
**487** | InternalServerError |  -  |
**488** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyze_id**
> AnalyzeIDResponse analyze_id(x_amz_target, analyze_id_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Analyzes identity documents for relevant information. This information is extracted and returned as <code>IdentityDocumentFields</code>, which records both the normalized field and value of the extracted text. Unlike other Amazon Textract operations, <code>AnalyzeID</code> doesn't return any Geometry data.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.analyze_id_request import AnalyzeIDRequest
from openapi_client.models.analyze_id_response import AnalyzeIDResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    analyze_id_request = openapi_client.AnalyzeIDRequest() # AnalyzeIDRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.analyze_id(x_amz_target, analyze_id_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->analyze_id:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->analyze_id: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **analyze_id_request** | [**AnalyzeIDRequest**](AnalyzeIDRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**AnalyzeIDResponse**](AnalyzeIDResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | UnsupportedDocumentException |  -  |
**483** | DocumentTooLargeException |  -  |
**484** | BadDocumentException |  -  |
**485** | AccessDeniedException |  -  |
**486** | ProvisionedThroughputExceededException |  -  |
**487** | InternalServerError |  -  |
**488** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **detect_document_text**
> DetectDocumentTextResponse detect_document_text(x_amz_target, detect_document_text_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Detects text in the input document. Amazon Textract can detect lines of text and the words that make up a line of text. The input document must be in one of the following image formats: JPEG, PNG, PDF, or TIFF. <code>DetectDocumentText</code> returns the detected text in an array of <a>Block</a> objects. </p> <p>Each document page has as an associated <code>Block</code> of type PAGE. Each PAGE <code>Block</code> object is the parent of LINE <code>Block</code> objects that represent the lines of detected text on a page. A LINE <code>Block</code> object is a parent for each word that makes up the line. Words are represented by <code>Block</code> objects of type WORD.</p> <p> <code>DetectDocumentText</code> is a synchronous operation. To analyze documents asynchronously, use <a>StartDocumentTextDetection</a>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html\">Document Text Detection</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.detect_document_text_request import DetectDocumentTextRequest
from openapi_client.models.detect_document_text_response import DetectDocumentTextResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    detect_document_text_request = openapi_client.DetectDocumentTextRequest() # DetectDocumentTextRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.detect_document_text(x_amz_target, detect_document_text_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->detect_document_text:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->detect_document_text: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **detect_document_text_request** | [**DetectDocumentTextRequest**](DetectDocumentTextRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DetectDocumentTextResponse**](DetectDocumentTextResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | UnsupportedDocumentException |  -  |
**483** | DocumentTooLargeException |  -  |
**484** | BadDocumentException |  -  |
**485** | AccessDeniedException |  -  |
**486** | ProvisionedThroughputExceededException |  -  |
**487** | InternalServerError |  -  |
**488** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_analysis**
> GetDocumentAnalysisResponse get_document_analysis(x_amz_target, get_document_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Gets the results for an Amazon Textract asynchronous operation that analyzes text in a document.</p> <p>You start asynchronous text analysis by calling <a>StartDocumentAnalysis</a>, which returns a job identifier (<code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to <code>StartDocumentAnalysis</code>. To get the results of the text-detection operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetDocumentAnalysis</code>, and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartDocumentAnalysis</code>.</p> <p> <code>GetDocumentAnalysis</code> returns an array of <a>Block</a> objects. The following types of information are returned: </p> <ul> <li> <p>Form data (key-value pairs). The related information is returned in two <a>Block</a> objects, each of type <code>KEY_VALUE_SET</code>: a KEY <code>Block</code> object and a VALUE <code>Block</code> object. For example, <i>Name: Ana Silva Carolina</i> contains a key and value. <i>Name:</i> is the key. <i>Ana Silva Carolina</i> is the value.</p> </li> <li> <p>Table and table cell data. A TABLE <code>Block</code> object contains information about a detected table. A CELL <code>Block</code> object is returned for each cell in a table.</p> </li> <li> <p>Lines and words of text. A LINE <code>Block</code> object contains one or more WORD <code>Block</code> objects. All lines and words that are detected in the document are returned (including text that doesn't have a relationship with the value of the <code>StartDocumentAnalysis</code> <code>FeatureTypes</code> input parameter). </p> </li> <li> <p>Query. A QUERY Block object contains the query text, alias and link to the associated Query results block object.</p> </li> <li> <p>Query Results. A QUERY_RESULT Block object contains the answer to the query and an ID that connects it to the query asked. This Block also contains a confidence score.</p> </li> </ul> <note> <p>While processing a document with queries, look out for <code>INVALID_REQUEST_PARAMETERS</code> output. This indicates that either the per page query limit has been exceeded or that the operation is trying to query a page in the document which doesn’t exist. </p> </note> <p>Selection elements such as check boxes and option buttons (radio buttons) can be detected in form data and in tables. A SELECTION_ELEMENT <code>Block</code> object contains information about a selection element, including the selection status.</p> <p>Use the <code>MaxResults</code> parameter to limit the number of blocks that are returned. If there are more results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call <code>GetDocumentAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value that's returned from the previous call to <code>GetDocumentAnalysis</code>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html\">Document Text Analysis</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_document_analysis_request import GetDocumentAnalysisRequest
from openapi_client.models.get_document_analysis_response import GetDocumentAnalysisResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_document_analysis_request = openapi_client.GetDocumentAnalysisRequest() # GetDocumentAnalysisRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_document_analysis(x_amz_target, get_document_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_document_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_document_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_document_analysis_request** | [**GetDocumentAnalysisRequest**](GetDocumentAnalysisRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetDocumentAnalysisResponse**](GetDocumentAnalysisResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ProvisionedThroughputExceededException |  -  |
**483** | InvalidJobIdException |  -  |
**484** | InternalServerError |  -  |
**485** | ThrottlingException |  -  |
**486** | InvalidS3ObjectException |  -  |
**487** | InvalidKMSKeyException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_document_text_detection**
> GetDocumentTextDetectionResponse get_document_text_detection(x_amz_target, get_document_text_detection_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Gets the results for an Amazon Textract asynchronous operation that detects text in a document. Amazon Textract can detect lines of text and the words that make up a line of text.</p> <p>You start asynchronous text detection by calling <a>StartDocumentTextDetection</a>, which returns a job identifier (<code>JobId</code>). When the text detection operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to <code>StartDocumentTextDetection</code>. To get the results of the text-detection operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetDocumentTextDetection</code>, and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartDocumentTextDetection</code>.</p> <p> <code>GetDocumentTextDetection</code> returns an array of <a>Block</a> objects. </p> <p>Each document page has as an associated <code>Block</code> of type PAGE. Each PAGE <code>Block</code> object is the parent of LINE <code>Block</code> objects that represent the lines of detected text on a page. A LINE <code>Block</code> object is a parent for each word that makes up the line. Words are represented by <code>Block</code> objects of type WORD.</p> <p>Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call <code>GetDocumentTextDetection</code>, and populate the <code>NextToken</code> request parameter with the token value that's returned from the previous call to <code>GetDocumentTextDetection</code>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html\">Document Text Detection</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_document_text_detection_request import GetDocumentTextDetectionRequest
from openapi_client.models.get_document_text_detection_response import GetDocumentTextDetectionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_document_text_detection_request = openapi_client.GetDocumentTextDetectionRequest() # GetDocumentTextDetectionRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_document_text_detection(x_amz_target, get_document_text_detection_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_document_text_detection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_document_text_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_document_text_detection_request** | [**GetDocumentTextDetectionRequest**](GetDocumentTextDetectionRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetDocumentTextDetectionResponse**](GetDocumentTextDetectionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ProvisionedThroughputExceededException |  -  |
**483** | InvalidJobIdException |  -  |
**484** | InternalServerError |  -  |
**485** | ThrottlingException |  -  |
**486** | InvalidS3ObjectException |  -  |
**487** | InvalidKMSKeyException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_expense_analysis**
> GetExpenseAnalysisResponse get_expense_analysis(x_amz_target, get_expense_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Gets the results for an Amazon Textract asynchronous operation that analyzes invoices and receipts. Amazon Textract finds contact information, items purchased, and vendor name, from input invoices and receipts.</p> <p>You start asynchronous invoice/receipt analysis by calling <a>StartExpenseAnalysis</a>, which returns a job identifier (<code>JobId</code>). Upon completion of the invoice/receipt analysis, Amazon Textract publishes the completion status to the Amazon Simple Notification Service (Amazon SNS) topic. This topic must be registered in the initial call to <code>StartExpenseAnalysis</code>. To get the results of the invoice/receipt analysis operation, first ensure that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <code>GetExpenseAnalysis</code>, and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartExpenseAnalysis</code>.</p> <p>Use the MaxResults parameter to limit the number of blocks that are returned. If there are more results than specified in <code>MaxResults</code>, the value of <code>NextToken</code> in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call <code>GetExpenseAnalysis</code>, and populate the <code>NextToken</code> request parameter with the token value that's returned from the previous call to <code>GetExpenseAnalysis</code>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/invoices-receipts.html\">Analyzing Invoices and Receipts</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_expense_analysis_request import GetExpenseAnalysisRequest
from openapi_client.models.get_expense_analysis_response import GetExpenseAnalysisResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_expense_analysis_request = openapi_client.GetExpenseAnalysisRequest() # GetExpenseAnalysisRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_expense_analysis(x_amz_target, get_expense_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_expense_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_expense_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_expense_analysis_request** | [**GetExpenseAnalysisRequest**](GetExpenseAnalysisRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetExpenseAnalysisResponse**](GetExpenseAnalysisResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ProvisionedThroughputExceededException |  -  |
**483** | InvalidJobIdException |  -  |
**484** | InternalServerError |  -  |
**485** | ThrottlingException |  -  |
**486** | InvalidS3ObjectException |  -  |
**487** | InvalidKMSKeyException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_lending_analysis**
> GetLendingAnalysisResponse get_lending_analysis(x_amz_target, get_lending_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Gets the results for an Amazon Textract asynchronous operation that analyzes text in a lending document. </p> <p>You start asynchronous text analysis by calling <code>StartLendingAnalysis</code>, which returns a job identifier (<code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to <code>StartLendingAnalysis</code>. </p> <p>To get the results of the text analysis operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLendingAnalysis, and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartLendingAnalysis</code>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_lending_analysis_request import GetLendingAnalysisRequest
from openapi_client.models.get_lending_analysis_response import GetLendingAnalysisResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_lending_analysis_request = openapi_client.GetLendingAnalysisRequest() # GetLendingAnalysisRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_lending_analysis(x_amz_target, get_lending_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_lending_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_lending_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_lending_analysis_request** | [**GetLendingAnalysisRequest**](GetLendingAnalysisRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetLendingAnalysisResponse**](GetLendingAnalysisResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ProvisionedThroughputExceededException |  -  |
**483** | InvalidJobIdException |  -  |
**484** | InternalServerError |  -  |
**485** | ThrottlingException |  -  |
**486** | InvalidS3ObjectException |  -  |
**487** | InvalidKMSKeyException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_lending_analysis_summary**
> GetLendingAnalysisSummaryResponse get_lending_analysis_summary(x_amz_target, get_lending_analysis_summary_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Gets summarized results for the <code>StartLendingAnalysis</code> operation, which analyzes text in a lending document. The returned summary consists of information about documents grouped together by a common document type. Information like detected signatures, page numbers, and split documents is returned with respect to the type of grouped document. </p> <p>You start asynchronous text analysis by calling <code>StartLendingAnalysis</code>, which returns a job identifier (<code>JobId</code>). When the text analysis operation finishes, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that's registered in the initial call to <code>StartLendingAnalysis</code>. </p> <p>To get the results of the text analysis operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call <code>GetLendingAnalysisSummary</code>, and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartLendingAnalysis</code>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_lending_analysis_summary_request import GetLendingAnalysisSummaryRequest
from openapi_client.models.get_lending_analysis_summary_response import GetLendingAnalysisSummaryResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    get_lending_analysis_summary_request = openapi_client.GetLendingAnalysisSummaryRequest() # GetLendingAnalysisSummaryRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_lending_analysis_summary(x_amz_target, get_lending_analysis_summary_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_lending_analysis_summary:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_lending_analysis_summary: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **get_lending_analysis_summary_request** | [**GetLendingAnalysisSummaryRequest**](GetLendingAnalysisSummaryRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetLendingAnalysisSummaryResponse**](GetLendingAnalysisSummaryResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ProvisionedThroughputExceededException |  -  |
**483** | InvalidJobIdException |  -  |
**484** | InternalServerError |  -  |
**485** | ThrottlingException |  -  |
**486** | InvalidS3ObjectException |  -  |
**487** | InvalidKMSKeyException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_document_analysis**
> StartDocumentAnalysisResponse start_document_analysis(x_amz_target, start_document_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Starts the asynchronous analysis of an input document for relationships between detected items such as key-value pairs, tables, and selection elements.</p> <p> <code>StartDocumentAnalysis</code> can analyze text in documents that are in JPEG, PNG, TIFF, and PDF format. The documents are stored in an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name and file name of the document. </p> <p> <code>StartDocumentAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results of the operation. When text analysis is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the results of the text analysis operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetDocumentAnalysis</a>, and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartDocumentAnalysis</code>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/how-it-works-analyzing.html\">Document Text Analysis</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_document_analysis_request import StartDocumentAnalysisRequest
from openapi_client.models.start_document_analysis_response import StartDocumentAnalysisResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    start_document_analysis_request = openapi_client.StartDocumentAnalysisRequest() # StartDocumentAnalysisRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_document_analysis(x_amz_target, start_document_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_document_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_document_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **start_document_analysis_request** | [**StartDocumentAnalysisRequest**](StartDocumentAnalysisRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**StartDocumentAnalysisResponse**](StartDocumentAnalysisResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | InvalidKMSKeyException |  -  |
**483** | UnsupportedDocumentException |  -  |
**484** | DocumentTooLargeException |  -  |
**485** | BadDocumentException |  -  |
**486** | AccessDeniedException |  -  |
**487** | ProvisionedThroughputExceededException |  -  |
**488** | InternalServerError |  -  |
**489** | IdempotentParameterMismatchException |  -  |
**490** | ThrottlingException |  -  |
**491** | LimitExceededException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_document_text_detection**
> StartDocumentTextDetectionResponse start_document_text_detection(x_amz_target, start_document_text_detection_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Starts the asynchronous detection of text in a document. Amazon Textract can detect lines of text and the words that make up a line of text.</p> <p> <code>StartDocumentTextDetection</code> can analyze text in documents that are in JPEG, PNG, TIFF, and PDF format. The documents are stored in an Amazon S3 bucket. Use <a>DocumentLocation</a> to specify the bucket name and file name of the document. </p> <p> <code>StartTextDetection</code> returns a job identifier (<code>JobId</code>) that you use to get the results of the operation. When text detection is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetDocumentTextDetection</a>, and pass the job identifier (<code>JobId</code>) from the initial call to <code>StartDocumentTextDetection</code>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/how-it-works-detecting.html\">Document Text Detection</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_document_text_detection_request import StartDocumentTextDetectionRequest
from openapi_client.models.start_document_text_detection_response import StartDocumentTextDetectionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    start_document_text_detection_request = openapi_client.StartDocumentTextDetectionRequest() # StartDocumentTextDetectionRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_document_text_detection(x_amz_target, start_document_text_detection_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_document_text_detection:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_document_text_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **start_document_text_detection_request** | [**StartDocumentTextDetectionRequest**](StartDocumentTextDetectionRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**StartDocumentTextDetectionResponse**](StartDocumentTextDetectionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | InvalidKMSKeyException |  -  |
**483** | UnsupportedDocumentException |  -  |
**484** | DocumentTooLargeException |  -  |
**485** | BadDocumentException |  -  |
**486** | AccessDeniedException |  -  |
**487** | ProvisionedThroughputExceededException |  -  |
**488** | InternalServerError |  -  |
**489** | IdempotentParameterMismatchException |  -  |
**490** | ThrottlingException |  -  |
**491** | LimitExceededException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_expense_analysis**
> StartExpenseAnalysisResponse start_expense_analysis(x_amz_target, start_expense_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Starts the asynchronous analysis of invoices or receipts for data like contact information, items purchased, and vendor names.</p> <p> <code>StartExpenseAnalysis</code> can analyze text in documents that are in JPEG, PNG, and PDF format. The documents must be stored in an Amazon S3 bucket. Use the <a>DocumentLocation</a> parameter to specify the name of your S3 bucket and the name of the document in that bucket. </p> <p> <code>StartExpenseAnalysis</code> returns a job identifier (<code>JobId</code>) that you will provide to <code>GetExpenseAnalysis</code> to retrieve the results of the operation. When the analysis of the input invoices/receipts is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you provide to the <code>NotificationChannel</code>. To obtain the results of the invoice and receipt analysis operation, ensure that the status value published to the Amazon SNS topic is <code>SUCCEEDED</code>. If so, call <a>GetExpenseAnalysis</a>, and pass the job identifier (<code>JobId</code>) that was returned by your call to <code>StartExpenseAnalysis</code>.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/textract/latest/dg/invoice-receipts.html\">Analyzing Invoices and Receipts</a>.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_expense_analysis_request import StartExpenseAnalysisRequest
from openapi_client.models.start_expense_analysis_response import StartExpenseAnalysisResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    start_expense_analysis_request = openapi_client.StartExpenseAnalysisRequest() # StartExpenseAnalysisRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_expense_analysis(x_amz_target, start_expense_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_expense_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_expense_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **start_expense_analysis_request** | [**StartExpenseAnalysisRequest**](StartExpenseAnalysisRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**StartExpenseAnalysisResponse**](StartExpenseAnalysisResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | InvalidKMSKeyException |  -  |
**483** | UnsupportedDocumentException |  -  |
**484** | DocumentTooLargeException |  -  |
**485** | BadDocumentException |  -  |
**486** | AccessDeniedException |  -  |
**487** | ProvisionedThroughputExceededException |  -  |
**488** | InternalServerError |  -  |
**489** | IdempotentParameterMismatchException |  -  |
**490** | ThrottlingException |  -  |
**491** | LimitExceededException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_lending_analysis**
> StartLendingAnalysisResponse start_lending_analysis(x_amz_target, start_lending_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Starts the classification and analysis of an input document. <code>StartLendingAnalysis</code> initiates the classification and analysis of a packet of lending documents. <code>StartLendingAnalysis</code> operates on a document file located in an Amazon S3 bucket.</p> <p> <code>StartLendingAnalysis</code> can analyze text in documents that are in one of the following formats: JPEG, PNG, TIFF, PDF. Use <code>DocumentLocation</code> to specify the bucket name and the file name of the document. </p> <p> <code>StartLendingAnalysis</code> returns a job identifier (<code>JobId</code>) that you use to get the results of the operation. When the text analysis is finished, Amazon Textract publishes a completion status to the Amazon Simple Notification Service (Amazon SNS) topic that you specify in <code>NotificationChannel</code>. To get the results of the text analysis operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If the status is SUCCEEDED you can call either <code>GetLendingAnalysis</code> or <code>GetLendingAnalysisSummary</code> and provide the <code>JobId</code> to obtain the results of the analysis.</p> <p>If using <code>OutputConfig</code> to specify an Amazon S3 bucket, the output will be contained within the specified prefix in a directory labeled with the job-id. In the directory there are 3 sub-directories: </p> <ul> <li> <p>detailedResponse (contains the GetLendingAnalysis response)</p> </li> <li> <p>summaryResponse (for the GetLendingAnalysisSummary response)</p> </li> <li> <p>splitDocuments (documents split across logical boundaries)</p> </li> </ul>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_lending_analysis_request import StartLendingAnalysisRequest
from openapi_client.models.start_lending_analysis_response import StartLendingAnalysisResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://textract.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://textract.us-east-1.amazonaws.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: hmac
configuration.api_key['hmac'] = os.environ["API_KEY"]

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['hmac'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    x_amz_target = 'x_amz_target_example' # str | 
    start_lending_analysis_request = openapi_client.StartLendingAnalysisRequest() # StartLendingAnalysisRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_lending_analysis(x_amz_target, start_lending_analysis_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_lending_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_lending_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_target** | **str**|  | 
 **start_lending_analysis_request** | [**StartLendingAnalysisRequest**](StartLendingAnalysisRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**StartLendingAnalysisResponse**](StartLendingAnalysisResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | InvalidParameterException |  -  |
**481** | InvalidS3ObjectException |  -  |
**482** | InvalidKMSKeyException |  -  |
**483** | UnsupportedDocumentException |  -  |
**484** | DocumentTooLargeException |  -  |
**485** | BadDocumentException |  -  |
**486** | AccessDeniedException |  -  |
**487** | ProvisionedThroughputExceededException |  -  |
**488** | InternalServerError |  -  |
**489** | IdempotentParameterMismatchException |  -  |
**490** | ThrottlingException |  -  |
**491** | LimitExceededException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

