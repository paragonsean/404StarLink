# openapi_client.DocumentClassificationApi

All URIs are relative to *http://api.datumbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adult_content_detection**](DocumentClassificationApi.md#adult_content_detection) | **POST** /1.0/AdultContentDetection.json | Classifies the Document as adult or noadult
[**commercial_detection**](DocumentClassificationApi.md#commercial_detection) | **POST** /1.0/CommercialDetection.json | Classifies the Document as commercial or nocommercial
[**educational_detection**](DocumentClassificationApi.md#educational_detection) | **POST** /1.0/EducationalDetection.json | Classifies the Document as educational or noeducational
[**gender_detection**](DocumentClassificationApi.md#gender_detection) | **POST** /1.0/GenderDetection.json | Gender Detection Service
[**language_detection**](DocumentClassificationApi.md#language_detection) | **POST** /1.0/LanguageDetection.json | Identifies the Language of the Document
[**readability_assessment**](DocumentClassificationApi.md#readability_assessment) | **POST** /1.0/ReadabilityAssessment.json | Evaluates the Readability of the Document
[**sentiment_analysis**](DocumentClassificationApi.md#sentiment_analysis) | **POST** /1.0/SentimentAnalysis.json | Identifies the Sentiment of the Document
[**spam_detection**](DocumentClassificationApi.md#spam_detection) | **POST** /1.0/SpamDetection.json | Classifies the Document as spam or nospam
[**subjectivity_analysis**](DocumentClassificationApi.md#subjectivity_analysis) | **POST** /1.0/SubjectivityAnalysis.json | Classifies Document as Subjective or Objective
[**topic_classification**](DocumentClassificationApi.md#topic_classification) | **POST** /1.0/TopicClassification.json | Identifies the Topic of the Document
[**twitter_sentiment_analysis**](DocumentClassificationApi.md#twitter_sentiment_analysis) | **POST** /1.0/TwitterSentimentAnalysis.json | Identifies the Sentiment of Twitter Messages


# **adult_content_detection**
> adult_content_detection(api_key, text=text)

Classifies the Document as adult or noadult

The Adult Content Detection function classifies the documents as adult or noadult based on their context. It can be used to detect whether a document contains content unsuitable for minors.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Classifies the Document as adult or noadult
        api_instance.adult_content_detection(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->adult_content_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **commercial_detection**
> commercial_detection(api_key, text=text)

Classifies the Document as commercial or nocommercial

The Commercial Detection function labels the documents as commercial or non-commercial based on their keywords and expressions. It can be used to detect whether a website is commercial or not.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Classifies the Document as commercial or nocommercial
        api_instance.commercial_detection(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->commercial_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **educational_detection**
> educational_detection(api_key, text=text)

Classifies the Document as educational or noeducational

The Educational Detection function classifies the documents as educational or non-educational based on their context. It can be used to detect whether a website is educational or not.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Classifies the Document as educational or noeducational
        api_instance.educational_detection(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->educational_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gender_detection**
> gender_detection(api_key, text=text)

Gender Detection Service

The Gender Detection function identifies if a particular document is written-by or targets-to a man or a woman based on the context, the words and the idioms found in the text.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Gender Detection Service
        api_instance.gender_detection(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->gender_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **language_detection**
> language_detection(api_key, text=text)

Identifies the Language of the Document

The Language Detection function identifies the natural language of the given document based on its words and context. This classifier is able to detect 96 different languages.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Identifies the Language of the Document
        api_instance.language_detection(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->language_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **readability_assessment**
> readability_assessment(api_key, text=text)

Evaluates the Readability of the Document

The Readability Assessment function determines the degree of readability of a document based on its terms and idioms. The texts are classified as basic, intermediate and advanced depending their difficulty.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Evaluates the Readability of the Document
        api_instance.readability_assessment(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->readability_assessment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sentiment_analysis**
> sentiment_analysis(api_key, text=text)

Identifies the Sentiment of the Document

The Sentiment Analysis function classifies documents as positive, negative or neutral (lack of sentiment) depending on whether they express a positive, negative or neutral opinion.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Identifies the Sentiment of the Document
        api_instance.sentiment_analysis(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->sentiment_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **spam_detection**
> spam_detection(api_key, text=text)

Classifies the Document as spam or nospam

The Spam Detection function labels documents as spam or nospam by taking into account their context. It can be used to filter out spam emails and comments.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Classifies the Document as spam or nospam
        api_instance.spam_detection(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->spam_detection: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subjectivity_analysis**
> subjectivity_analysis(api_key, text=text)

Classifies Document as Subjective or Objective

The Subjectivity Analysis function categorizes documents as subjective or objective based on their writing style. Texts that express personal opinions are labeled as subjective and the others as objective.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Classifies Document as Subjective or Objective
        api_instance.subjectivity_analysis(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->subjectivity_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **topic_classification**
> topic_classification(api_key, text=text)

Identifies the Topic of the Document

The Topic Classification function assigns documents in 12 thematic categories based on their keywords, idioms and jargon. It can be used to identify the topic of the texts.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text that you want to analyze. It should not contain HTML tags. (optional)

    try:
        # Identifies the Topic of the Document
        api_instance.topic_classification(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->topic_classification: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text that you want to analyze. It should not contain HTML tags. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **twitter_sentiment_analysis**
> twitter_sentiment_analysis(api_key, text=text)

Identifies the Sentiment of Twitter Messages

The Twitter Sentiment Analysis function allows you to perform Sentiment Analysis on Twitter. It classifies the tweets as positive, negative or neutral depending on their context.

### Example


```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.datumbox.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.datumbox.com"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DocumentClassificationApi(api_client)
    api_key = 'api_key_example' # str | Your API Key
    text = 'text_example' # str | The text of the tweet that we evaluate. (optional)

    try:
        # Identifies the Sentiment of Twitter Messages
        api_instance.twitter_sentiment_analysis(api_key, text=text)
    except Exception as e:
        print("Exception when calling DocumentClassificationApi->twitter_sentiment_analysis: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **api_key** | **str**| Your API Key | 
 **text** | **str**| The text of the tweet that we evaluate. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | No response was specified |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

