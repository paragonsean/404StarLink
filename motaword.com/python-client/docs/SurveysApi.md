# openapi_client.SurveysApi

All URIs are relative to *https://api.motaword.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_questions**](SurveysApi.md#get_questions) | **GET** /surveys/{scope}/{type} | Get survey questions in given scope and type
[**submit_answers**](SurveysApi.md#submit_answers) | **POST** /surveys/{scope}/{type} | Post survey answers for scope and type


# **get_questions**
> List[SurveyQuestion] get_questions(scope, type, attach_answers_for_project=attach_answers_for_project)

Get survey questions in given scope and type

Get survey questions in given scope and type

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.survey_question import SurveyQuestion
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SurveysApi(api_client)
    scope = 'scope_example' # str | Scope
    type = 'type_example' # str | Type
    attach_answers_for_project = 56 # int | Project ID (optional)

    try:
        # Get survey questions in given scope and type
        api_response = api_instance.get_questions(scope, type, attach_answers_for_project=attach_answers_for_project)
        print("The response of SurveysApi->get_questions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SurveysApi->get_questions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **str**| Scope | 
 **type** | **str**| Type | 
 **attach_answers_for_project** | **int**| Project ID | [optional] 

### Return type

[**List[SurveyQuestion]**](SurveyQuestion.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Survey Questions |  -  |
**404** | SurveyQuestionsNotFound |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_answers**
> OperationStatus submit_answers(scope, type, survey_answers=survey_answers)

Post survey answers for scope and type

Post survey answers for scope and type

### Example

* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):
* OAuth Authentication (mwoAuth):

```python
import openapi_client
from openapi_client.models.operation_status import OperationStatus
from openapi_client.models.survey_answers import SurveyAnswers
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.motaword.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.motaword.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.SurveysApi(api_client)
    scope = 'scope_example' # str | Scope
    type = 'type_example' # str | Type
    survey_answers = openapi_client.SurveyAnswers() # SurveyAnswers |  (optional)

    try:
        # Post survey answers for scope and type
        api_response = api_instance.submit_answers(scope, type, survey_answers=survey_answers)
        print("The response of SurveysApi->submit_answers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SurveysApi->submit_answers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **str**| Scope | 
 **type** | **str**| Type | 
 **survey_answers** | [**SurveyAnswers**](SurveyAnswers.md)|  | [optional] 

### Return type

[**OperationStatus**](OperationStatus.md)

### Authorization

[mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth), [mwoAuth](../README.md#mwoAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Survey Answers |  -  |
**500** | FailedToSubmitSurveyAnswers |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

