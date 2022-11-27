# openapi_client.DefaultApi

All URIs are relative to *http://pinpoint.us-east-1.amazonaws.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_app**](DefaultApi.md#create_app) | **POST** /v1/apps | 
[**create_campaign**](DefaultApi.md#create_campaign) | **POST** /v1/apps/{application-id}/campaigns | 
[**create_email_template**](DefaultApi.md#create_email_template) | **POST** /v1/templates/{template-name}/email | 
[**create_export_job**](DefaultApi.md#create_export_job) | **POST** /v1/apps/{application-id}/jobs/export | 
[**create_import_job**](DefaultApi.md#create_import_job) | **POST** /v1/apps/{application-id}/jobs/import | 
[**create_in_app_template**](DefaultApi.md#create_in_app_template) | **POST** /v1/templates/{template-name}/inapp | 
[**create_journey**](DefaultApi.md#create_journey) | **POST** /v1/apps/{application-id}/journeys | 
[**create_push_template**](DefaultApi.md#create_push_template) | **POST** /v1/templates/{template-name}/push | 
[**create_recommender_configuration**](DefaultApi.md#create_recommender_configuration) | **POST** /v1/recommenders | 
[**create_segment**](DefaultApi.md#create_segment) | **POST** /v1/apps/{application-id}/segments | 
[**create_sms_template**](DefaultApi.md#create_sms_template) | **POST** /v1/templates/{template-name}/sms | 
[**create_voice_template**](DefaultApi.md#create_voice_template) | **POST** /v1/templates/{template-name}/voice | 
[**delete_adm_channel**](DefaultApi.md#delete_adm_channel) | **DELETE** /v1/apps/{application-id}/channels/adm | 
[**delete_apns_channel**](DefaultApi.md#delete_apns_channel) | **DELETE** /v1/apps/{application-id}/channels/apns | 
[**delete_apns_sandbox_channel**](DefaultApi.md#delete_apns_sandbox_channel) | **DELETE** /v1/apps/{application-id}/channels/apns_sandbox | 
[**delete_apns_voip_channel**](DefaultApi.md#delete_apns_voip_channel) | **DELETE** /v1/apps/{application-id}/channels/apns_voip | 
[**delete_apns_voip_sandbox_channel**](DefaultApi.md#delete_apns_voip_sandbox_channel) | **DELETE** /v1/apps/{application-id}/channels/apns_voip_sandbox | 
[**delete_app**](DefaultApi.md#delete_app) | **DELETE** /v1/apps/{application-id} | 
[**delete_baidu_channel**](DefaultApi.md#delete_baidu_channel) | **DELETE** /v1/apps/{application-id}/channels/baidu | 
[**delete_campaign**](DefaultApi.md#delete_campaign) | **DELETE** /v1/apps/{application-id}/campaigns/{campaign-id} | 
[**delete_email_channel**](DefaultApi.md#delete_email_channel) | **DELETE** /v1/apps/{application-id}/channels/email | 
[**delete_email_template**](DefaultApi.md#delete_email_template) | **DELETE** /v1/templates/{template-name}/email | 
[**delete_endpoint**](DefaultApi.md#delete_endpoint) | **DELETE** /v1/apps/{application-id}/endpoints/{endpoint-id} | 
[**delete_event_stream**](DefaultApi.md#delete_event_stream) | **DELETE** /v1/apps/{application-id}/eventstream | 
[**delete_gcm_channel**](DefaultApi.md#delete_gcm_channel) | **DELETE** /v1/apps/{application-id}/channels/gcm | 
[**delete_in_app_template**](DefaultApi.md#delete_in_app_template) | **DELETE** /v1/templates/{template-name}/inapp | 
[**delete_journey**](DefaultApi.md#delete_journey) | **DELETE** /v1/apps/{application-id}/journeys/{journey-id} | 
[**delete_push_template**](DefaultApi.md#delete_push_template) | **DELETE** /v1/templates/{template-name}/push | 
[**delete_recommender_configuration**](DefaultApi.md#delete_recommender_configuration) | **DELETE** /v1/recommenders/{recommender-id} | 
[**delete_segment**](DefaultApi.md#delete_segment) | **DELETE** /v1/apps/{application-id}/segments/{segment-id} | 
[**delete_sms_channel**](DefaultApi.md#delete_sms_channel) | **DELETE** /v1/apps/{application-id}/channels/sms | 
[**delete_sms_template**](DefaultApi.md#delete_sms_template) | **DELETE** /v1/templates/{template-name}/sms | 
[**delete_user_endpoints**](DefaultApi.md#delete_user_endpoints) | **DELETE** /v1/apps/{application-id}/users/{user-id} | 
[**delete_voice_channel**](DefaultApi.md#delete_voice_channel) | **DELETE** /v1/apps/{application-id}/channels/voice | 
[**delete_voice_template**](DefaultApi.md#delete_voice_template) | **DELETE** /v1/templates/{template-name}/voice | 
[**get_adm_channel**](DefaultApi.md#get_adm_channel) | **GET** /v1/apps/{application-id}/channels/adm | 
[**get_apns_channel**](DefaultApi.md#get_apns_channel) | **GET** /v1/apps/{application-id}/channels/apns | 
[**get_apns_sandbox_channel**](DefaultApi.md#get_apns_sandbox_channel) | **GET** /v1/apps/{application-id}/channels/apns_sandbox | 
[**get_apns_voip_channel**](DefaultApi.md#get_apns_voip_channel) | **GET** /v1/apps/{application-id}/channels/apns_voip | 
[**get_apns_voip_sandbox_channel**](DefaultApi.md#get_apns_voip_sandbox_channel) | **GET** /v1/apps/{application-id}/channels/apns_voip_sandbox | 
[**get_app**](DefaultApi.md#get_app) | **GET** /v1/apps/{application-id} | 
[**get_application_date_range_kpi**](DefaultApi.md#get_application_date_range_kpi) | **GET** /v1/apps/{application-id}/kpis/daterange/{kpi-name} | 
[**get_application_settings**](DefaultApi.md#get_application_settings) | **GET** /v1/apps/{application-id}/settings | 
[**get_apps**](DefaultApi.md#get_apps) | **GET** /v1/apps | 
[**get_baidu_channel**](DefaultApi.md#get_baidu_channel) | **GET** /v1/apps/{application-id}/channels/baidu | 
[**get_campaign**](DefaultApi.md#get_campaign) | **GET** /v1/apps/{application-id}/campaigns/{campaign-id} | 
[**get_campaign_activities**](DefaultApi.md#get_campaign_activities) | **GET** /v1/apps/{application-id}/campaigns/{campaign-id}/activities | 
[**get_campaign_date_range_kpi**](DefaultApi.md#get_campaign_date_range_kpi) | **GET** /v1/apps/{application-id}/campaigns/{campaign-id}/kpis/daterange/{kpi-name} | 
[**get_campaign_version**](DefaultApi.md#get_campaign_version) | **GET** /v1/apps/{application-id}/campaigns/{campaign-id}/versions/{version} | 
[**get_campaign_versions**](DefaultApi.md#get_campaign_versions) | **GET** /v1/apps/{application-id}/campaigns/{campaign-id}/versions | 
[**get_campaigns**](DefaultApi.md#get_campaigns) | **GET** /v1/apps/{application-id}/campaigns | 
[**get_channels**](DefaultApi.md#get_channels) | **GET** /v1/apps/{application-id}/channels | 
[**get_email_channel**](DefaultApi.md#get_email_channel) | **GET** /v1/apps/{application-id}/channels/email | 
[**get_email_template**](DefaultApi.md#get_email_template) | **GET** /v1/templates/{template-name}/email | 
[**get_endpoint**](DefaultApi.md#get_endpoint) | **GET** /v1/apps/{application-id}/endpoints/{endpoint-id} | 
[**get_event_stream**](DefaultApi.md#get_event_stream) | **GET** /v1/apps/{application-id}/eventstream | 
[**get_export_job**](DefaultApi.md#get_export_job) | **GET** /v1/apps/{application-id}/jobs/export/{job-id} | 
[**get_export_jobs**](DefaultApi.md#get_export_jobs) | **GET** /v1/apps/{application-id}/jobs/export | 
[**get_gcm_channel**](DefaultApi.md#get_gcm_channel) | **GET** /v1/apps/{application-id}/channels/gcm | 
[**get_import_job**](DefaultApi.md#get_import_job) | **GET** /v1/apps/{application-id}/jobs/import/{job-id} | 
[**get_import_jobs**](DefaultApi.md#get_import_jobs) | **GET** /v1/apps/{application-id}/jobs/import | 
[**get_in_app_messages**](DefaultApi.md#get_in_app_messages) | **GET** /v1/apps/{application-id}/endpoints/{endpoint-id}/inappmessages | 
[**get_in_app_template**](DefaultApi.md#get_in_app_template) | **GET** /v1/templates/{template-name}/inapp | 
[**get_journey**](DefaultApi.md#get_journey) | **GET** /v1/apps/{application-id}/journeys/{journey-id} | 
[**get_journey_date_range_kpi**](DefaultApi.md#get_journey_date_range_kpi) | **GET** /v1/apps/{application-id}/journeys/{journey-id}/kpis/daterange/{kpi-name} | 
[**get_journey_execution_activity_metrics**](DefaultApi.md#get_journey_execution_activity_metrics) | **GET** /v1/apps/{application-id}/journeys/{journey-id}/activities/{journey-activity-id}/execution-metrics | 
[**get_journey_execution_metrics**](DefaultApi.md#get_journey_execution_metrics) | **GET** /v1/apps/{application-id}/journeys/{journey-id}/execution-metrics | 
[**get_push_template**](DefaultApi.md#get_push_template) | **GET** /v1/templates/{template-name}/push | 
[**get_recommender_configuration**](DefaultApi.md#get_recommender_configuration) | **GET** /v1/recommenders/{recommender-id} | 
[**get_recommender_configurations**](DefaultApi.md#get_recommender_configurations) | **GET** /v1/recommenders | 
[**get_segment**](DefaultApi.md#get_segment) | **GET** /v1/apps/{application-id}/segments/{segment-id} | 
[**get_segment_export_jobs**](DefaultApi.md#get_segment_export_jobs) | **GET** /v1/apps/{application-id}/segments/{segment-id}/jobs/export | 
[**get_segment_import_jobs**](DefaultApi.md#get_segment_import_jobs) | **GET** /v1/apps/{application-id}/segments/{segment-id}/jobs/import | 
[**get_segment_version**](DefaultApi.md#get_segment_version) | **GET** /v1/apps/{application-id}/segments/{segment-id}/versions/{version} | 
[**get_segment_versions**](DefaultApi.md#get_segment_versions) | **GET** /v1/apps/{application-id}/segments/{segment-id}/versions | 
[**get_segments**](DefaultApi.md#get_segments) | **GET** /v1/apps/{application-id}/segments | 
[**get_sms_channel**](DefaultApi.md#get_sms_channel) | **GET** /v1/apps/{application-id}/channels/sms | 
[**get_sms_template**](DefaultApi.md#get_sms_template) | **GET** /v1/templates/{template-name}/sms | 
[**get_user_endpoints**](DefaultApi.md#get_user_endpoints) | **GET** /v1/apps/{application-id}/users/{user-id} | 
[**get_voice_channel**](DefaultApi.md#get_voice_channel) | **GET** /v1/apps/{application-id}/channels/voice | 
[**get_voice_template**](DefaultApi.md#get_voice_template) | **GET** /v1/templates/{template-name}/voice | 
[**list_journeys**](DefaultApi.md#list_journeys) | **GET** /v1/apps/{application-id}/journeys | 
[**list_tags_for_resource**](DefaultApi.md#list_tags_for_resource) | **GET** /v1/tags/{resource-arn} | 
[**list_template_versions**](DefaultApi.md#list_template_versions) | **GET** /v1/templates/{template-name}/{template-type}/versions | 
[**list_templates**](DefaultApi.md#list_templates) | **GET** /v1/templates | 
[**phone_number_validate**](DefaultApi.md#phone_number_validate) | **POST** /v1/phone/number/validate | 
[**put_event_stream**](DefaultApi.md#put_event_stream) | **POST** /v1/apps/{application-id}/eventstream | 
[**put_events**](DefaultApi.md#put_events) | **POST** /v1/apps/{application-id}/events | 
[**remove_attributes**](DefaultApi.md#remove_attributes) | **PUT** /v1/apps/{application-id}/attributes/{attribute-type} | 
[**send_messages**](DefaultApi.md#send_messages) | **POST** /v1/apps/{application-id}/messages | 
[**send_otp_message**](DefaultApi.md#send_otp_message) | **POST** /v1/apps/{application-id}/otp | 
[**send_users_messages**](DefaultApi.md#send_users_messages) | **POST** /v1/apps/{application-id}/users-messages | 
[**tag_resource**](DefaultApi.md#tag_resource) | **POST** /v1/tags/{resource-arn} | 
[**untag_resource**](DefaultApi.md#untag_resource) | **DELETE** /v1/tags/{resource-arn}#tagKeys | 
[**update_adm_channel**](DefaultApi.md#update_adm_channel) | **PUT** /v1/apps/{application-id}/channels/adm | 
[**update_apns_channel**](DefaultApi.md#update_apns_channel) | **PUT** /v1/apps/{application-id}/channels/apns | 
[**update_apns_sandbox_channel**](DefaultApi.md#update_apns_sandbox_channel) | **PUT** /v1/apps/{application-id}/channels/apns_sandbox | 
[**update_apns_voip_channel**](DefaultApi.md#update_apns_voip_channel) | **PUT** /v1/apps/{application-id}/channels/apns_voip | 
[**update_apns_voip_sandbox_channel**](DefaultApi.md#update_apns_voip_sandbox_channel) | **PUT** /v1/apps/{application-id}/channels/apns_voip_sandbox | 
[**update_application_settings**](DefaultApi.md#update_application_settings) | **PUT** /v1/apps/{application-id}/settings | 
[**update_baidu_channel**](DefaultApi.md#update_baidu_channel) | **PUT** /v1/apps/{application-id}/channels/baidu | 
[**update_campaign**](DefaultApi.md#update_campaign) | **PUT** /v1/apps/{application-id}/campaigns/{campaign-id} | 
[**update_email_channel**](DefaultApi.md#update_email_channel) | **PUT** /v1/apps/{application-id}/channels/email | 
[**update_email_template**](DefaultApi.md#update_email_template) | **PUT** /v1/templates/{template-name}/email | 
[**update_endpoint**](DefaultApi.md#update_endpoint) | **PUT** /v1/apps/{application-id}/endpoints/{endpoint-id} | 
[**update_endpoints_batch**](DefaultApi.md#update_endpoints_batch) | **PUT** /v1/apps/{application-id}/endpoints | 
[**update_gcm_channel**](DefaultApi.md#update_gcm_channel) | **PUT** /v1/apps/{application-id}/channels/gcm | 
[**update_in_app_template**](DefaultApi.md#update_in_app_template) | **PUT** /v1/templates/{template-name}/inapp | 
[**update_journey**](DefaultApi.md#update_journey) | **PUT** /v1/apps/{application-id}/journeys/{journey-id} | 
[**update_journey_state**](DefaultApi.md#update_journey_state) | **PUT** /v1/apps/{application-id}/journeys/{journey-id}/state | 
[**update_push_template**](DefaultApi.md#update_push_template) | **PUT** /v1/templates/{template-name}/push | 
[**update_recommender_configuration**](DefaultApi.md#update_recommender_configuration) | **PUT** /v1/recommenders/{recommender-id} | 
[**update_segment**](DefaultApi.md#update_segment) | **PUT** /v1/apps/{application-id}/segments/{segment-id} | 
[**update_sms_channel**](DefaultApi.md#update_sms_channel) | **PUT** /v1/apps/{application-id}/channels/sms | 
[**update_sms_template**](DefaultApi.md#update_sms_template) | **PUT** /v1/templates/{template-name}/sms | 
[**update_template_active_version**](DefaultApi.md#update_template_active_version) | **PUT** /v1/templates/{template-name}/{template-type}/active-version | 
[**update_voice_channel**](DefaultApi.md#update_voice_channel) | **PUT** /v1/apps/{application-id}/channels/voice | 
[**update_voice_template**](DefaultApi.md#update_voice_template) | **PUT** /v1/templates/{template-name}/voice | 
[**verify_otp_message**](DefaultApi.md#verify_otp_message) | **POST** /v1/apps/{application-id}/verify-otp | 


# **create_app**
> CreateAppResponse create_app(create_app_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



 <p>Creates an application.</p>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_app_request import CreateAppRequest
from openapi_client.models.create_app_response import CreateAppResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    create_app_request = openapi_client.CreateAppRequest() # CreateAppRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_app(create_app_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_app:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_app: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_app_request** | [**CreateAppRequest**](CreateAppRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateAppResponse**](CreateAppResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_campaign**
> CreateCampaignResponse create_campaign(application_id, create_campaign_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new campaign for an application or updates the settings of an existing campaign for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_campaign_request import CreateCampaignRequest
from openapi_client.models.create_campaign_response import CreateCampaignResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    create_campaign_request = openapi_client.CreateCampaignRequest() # CreateCampaignRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_campaign(application_id, create_campaign_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_campaign:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_campaign: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **create_campaign_request** | [**CreateCampaignRequest**](CreateCampaignRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateCampaignResponse**](CreateCampaignResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_email_template**
> CreateEmailTemplateResponse create_email_template(template_name, update_email_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a message template for messages that are sent through the email channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_email_template_response import CreateEmailTemplateResponse
from openapi_client.models.update_email_template_request import UpdateEmailTemplateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_email_template_request = openapi_client.UpdateEmailTemplateRequest() # UpdateEmailTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_email_template(template_name, update_email_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_email_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_email_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_email_template_request** | [**UpdateEmailTemplateRequest**](UpdateEmailTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateEmailTemplateResponse**](CreateEmailTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | MethodNotAllowedException |  -  |
**481** | TooManyRequestsException |  -  |
**482** | BadRequestException |  -  |
**483** | InternalServerErrorException |  -  |
**484** | ForbiddenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_export_job**
> CreateExportJobResponse create_export_job(application_id, create_export_job_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates an export job for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_export_job_request import CreateExportJobRequest
from openapi_client.models.create_export_job_response import CreateExportJobResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    create_export_job_request = openapi_client.CreateExportJobRequest() # CreateExportJobRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_export_job(application_id, create_export_job_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_export_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_export_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **create_export_job_request** | [**CreateExportJobRequest**](CreateExportJobRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateExportJobResponse**](CreateExportJobResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_import_job**
> CreateImportJobResponse create_import_job(application_id, create_import_job_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates an import job for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_import_job_request import CreateImportJobRequest
from openapi_client.models.create_import_job_response import CreateImportJobResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    create_import_job_request = openapi_client.CreateImportJobRequest() # CreateImportJobRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_import_job(application_id, create_import_job_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_import_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_import_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **create_import_job_request** | [**CreateImportJobRequest**](CreateImportJobRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateImportJobResponse**](CreateImportJobResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_in_app_template**
> CreateInAppTemplateResponse create_in_app_template(template_name, update_in_app_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new message template for messages using the in-app message channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_in_app_template_response import CreateInAppTemplateResponse
from openapi_client.models.update_in_app_template_request import UpdateInAppTemplateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_in_app_template_request = openapi_client.UpdateInAppTemplateRequest() # UpdateInAppTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_in_app_template(template_name, update_in_app_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_in_app_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_in_app_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_in_app_template_request** | [**UpdateInAppTemplateRequest**](UpdateInAppTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateInAppTemplateResponse**](CreateInAppTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | MethodNotAllowedException |  -  |
**481** | TooManyRequestsException |  -  |
**482** | BadRequestException |  -  |
**483** | InternalServerErrorException |  -  |
**484** | ForbiddenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_journey**
> CreateJourneyResponse create_journey(application_id, create_journey_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a journey for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_journey_request import CreateJourneyRequest
from openapi_client.models.create_journey_response import CreateJourneyResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    create_journey_request = openapi_client.CreateJourneyRequest() # CreateJourneyRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_journey(application_id, create_journey_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_journey:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_journey: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **create_journey_request** | [**CreateJourneyRequest**](CreateJourneyRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateJourneyResponse**](CreateJourneyResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_push_template**
> CreatePushTemplateResponse create_push_template(template_name, update_push_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a message template for messages that are sent through a push notification channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_push_template_response import CreatePushTemplateResponse
from openapi_client.models.update_push_template_request import UpdatePushTemplateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_push_template_request = openapi_client.UpdatePushTemplateRequest() # UpdatePushTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_push_template(template_name, update_push_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_push_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_push_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_push_template_request** | [**UpdatePushTemplateRequest**](UpdatePushTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreatePushTemplateResponse**](CreatePushTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | MethodNotAllowedException |  -  |
**481** | TooManyRequestsException |  -  |
**482** | BadRequestException |  -  |
**483** | InternalServerErrorException |  -  |
**484** | ForbiddenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_recommender_configuration**
> CreateRecommenderConfigurationResponse create_recommender_configuration(create_recommender_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates an Amazon Pinpoint configuration for a recommender model.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_recommender_configuration_request import CreateRecommenderConfigurationRequest
from openapi_client.models.create_recommender_configuration_response import CreateRecommenderConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    create_recommender_configuration_request = openapi_client.CreateRecommenderConfigurationRequest() # CreateRecommenderConfigurationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_recommender_configuration(create_recommender_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_recommender_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_recommender_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_recommender_configuration_request** | [**CreateRecommenderConfigurationRequest**](CreateRecommenderConfigurationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateRecommenderConfigurationResponse**](CreateRecommenderConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_segment**
> CreateSegmentResponse create_segment(application_id, create_segment_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_segment_request import CreateSegmentRequest
from openapi_client.models.create_segment_response import CreateSegmentResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    create_segment_request = openapi_client.CreateSegmentRequest() # CreateSegmentRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_segment(application_id, create_segment_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_segment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_segment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **create_segment_request** | [**CreateSegmentRequest**](CreateSegmentRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateSegmentResponse**](CreateSegmentResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_sms_template**
> CreateSmsTemplateResponse create_sms_template(template_name, update_sms_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a message template for messages that are sent through the SMS channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_sms_template_response import CreateSmsTemplateResponse
from openapi_client.models.update_sms_template_request import UpdateSmsTemplateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_sms_template_request = openapi_client.UpdateSmsTemplateRequest() # UpdateSmsTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_sms_template(template_name, update_sms_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_sms_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_sms_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_sms_template_request** | [**UpdateSmsTemplateRequest**](UpdateSmsTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateSmsTemplateResponse**](CreateSmsTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | MethodNotAllowedException |  -  |
**481** | TooManyRequestsException |  -  |
**482** | BadRequestException |  -  |
**483** | InternalServerErrorException |  -  |
**484** | ForbiddenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_voice_template**
> CreateVoiceTemplateResponse create_voice_template(template_name, update_voice_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a message template for messages that are sent through the voice channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_voice_template_response import CreateVoiceTemplateResponse
from openapi_client.models.update_voice_template_request import UpdateVoiceTemplateRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_voice_template_request = openapi_client.UpdateVoiceTemplateRequest() # UpdateVoiceTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_voice_template(template_name, update_voice_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_voice_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_voice_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_voice_template_request** | [**UpdateVoiceTemplateRequest**](UpdateVoiceTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateVoiceTemplateResponse**](CreateVoiceTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | MethodNotAllowedException |  -  |
**481** | TooManyRequestsException |  -  |
**482** | BadRequestException |  -  |
**483** | InternalServerErrorException |  -  |
**484** | ForbiddenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_adm_channel**
> DeleteAdmChannelResponse delete_adm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the ADM channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_adm_channel_response import DeleteAdmChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_adm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_adm_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_adm_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteAdmChannelResponse**](DeleteAdmChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_apns_channel**
> DeleteApnsChannelResponse delete_apns_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the APNs channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_apns_channel_response import DeleteApnsChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_apns_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_apns_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_apns_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteApnsChannelResponse**](DeleteApnsChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_apns_sandbox_channel**
> DeleteApnsSandboxChannelResponse delete_apns_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the APNs sandbox channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_apns_sandbox_channel_response import DeleteApnsSandboxChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_apns_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_apns_sandbox_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_apns_sandbox_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteApnsSandboxChannelResponse**](DeleteApnsSandboxChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_apns_voip_channel**
> DeleteApnsVoipChannelResponse delete_apns_voip_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the APNs VoIP channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_apns_voip_channel_response import DeleteApnsVoipChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_apns_voip_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_apns_voip_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_apns_voip_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteApnsVoipChannelResponse**](DeleteApnsVoipChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_apns_voip_sandbox_channel**
> DeleteApnsVoipSandboxChannelResponse delete_apns_voip_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the APNs VoIP sandbox channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_apns_voip_sandbox_channel_response import DeleteApnsVoipSandboxChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_apns_voip_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_apns_voip_sandbox_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_apns_voip_sandbox_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteApnsVoipSandboxChannelResponse**](DeleteApnsVoipSandboxChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_app**
> DeleteAppResponse delete_app(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_app_response import DeleteAppResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_app(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_app:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_app: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteAppResponse**](DeleteAppResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_baidu_channel**
> DeleteBaiduChannelResponse delete_baidu_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the Baidu channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_baidu_channel_response import DeleteBaiduChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_baidu_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_baidu_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_baidu_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteBaiduChannelResponse**](DeleteBaiduChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_campaign**
> DeleteCampaignResponse delete_campaign(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a campaign from an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_campaign_response import DeleteCampaignResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    campaign_id = 'campaign_id_example' # str | The unique identifier for the campaign.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_campaign(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_campaign:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_campaign: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **campaign_id** | **str**| The unique identifier for the campaign. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteCampaignResponse**](DeleteCampaignResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_email_channel**
> DeleteEmailChannelResponse delete_email_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the email channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_email_channel_response import DeleteEmailChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_email_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_email_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_email_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteEmailChannelResponse**](DeleteEmailChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_email_template**
> DeleteEmailTemplateResponse delete_email_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Deletes a message template for messages that were sent through the email channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_email_template_response import DeleteEmailTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.delete_email_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->delete_email_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_email_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**DeleteEmailTemplateResponse**](DeleteEmailTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_endpoint**
> DeleteEndpointResponse delete_endpoint(application_id, endpoint_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes an endpoint from an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_endpoint_response import DeleteEndpointResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    endpoint_id = 'endpoint_id_example' # str | The unique identifier for the endpoint.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_endpoint(application_id, endpoint_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_endpoint:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_endpoint: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **endpoint_id** | **str**| The unique identifier for the endpoint. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteEndpointResponse**](DeleteEndpointResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_event_stream**
> DeleteEventStreamResponse delete_event_stream(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes the event stream for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_event_stream_response import DeleteEventStreamResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_event_stream(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_event_stream:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_event_stream: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteEventStreamResponse**](DeleteEventStreamResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_gcm_channel**
> DeleteGcmChannelResponse delete_gcm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the GCM channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_gcm_channel_response import DeleteGcmChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_gcm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_gcm_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_gcm_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteGcmChannelResponse**](DeleteGcmChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_in_app_template**
> DeleteInAppTemplateResponse delete_in_app_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Deletes a message template for messages sent using the in-app message channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_in_app_template_response import DeleteInAppTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.delete_in_app_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->delete_in_app_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_in_app_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**DeleteInAppTemplateResponse**](DeleteInAppTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_journey**
> DeleteJourneyResponse delete_journey(application_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a journey from an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_journey_response import DeleteJourneyResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    journey_id = 'journey_id_example' # str | The unique identifier for the journey.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_journey(application_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_journey:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_journey: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **journey_id** | **str**| The unique identifier for the journey. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteJourneyResponse**](DeleteJourneyResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_push_template**
> DeletePushTemplateResponse delete_push_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Deletes a message template for messages that were sent through a push notification channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_push_template_response import DeletePushTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.delete_push_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->delete_push_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_push_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**DeletePushTemplateResponse**](DeletePushTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_recommender_configuration**
> DeleteRecommenderConfigurationResponse delete_recommender_configuration(recommender_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes an Amazon Pinpoint configuration for a recommender model.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_recommender_configuration_response import DeleteRecommenderConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    recommender_id = 'recommender_id_example' # str | The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_recommender_configuration(recommender_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_recommender_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_recommender_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recommender_id** | **str**| The unique identifier for the recommender model configuration. This identifier is displayed as the &lt;b&gt;Recommender ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteRecommenderConfigurationResponse**](DeleteRecommenderConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_segment**
> DeleteSegmentResponse delete_segment(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a segment from an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_segment_response import DeleteSegmentResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    segment_id = 'segment_id_example' # str | The unique identifier for the segment.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_segment(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_segment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_segment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **segment_id** | **str**| The unique identifier for the segment. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteSegmentResponse**](DeleteSegmentResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_sms_channel**
> DeleteSmsChannelResponse delete_sms_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the SMS channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_sms_channel_response import DeleteSmsChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_sms_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_sms_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_sms_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteSmsChannelResponse**](DeleteSmsChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_sms_template**
> DeleteSmsTemplateResponse delete_sms_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Deletes a message template for messages that were sent through the SMS channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_sms_template_response import DeleteSmsTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.delete_sms_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->delete_sms_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_sms_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**DeleteSmsTemplateResponse**](DeleteSmsTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_user_endpoints**
> DeleteUserEndpointsResponse delete_user_endpoints(application_id, user_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes all the endpoints that are associated with a specific user ID.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_user_endpoints_response import DeleteUserEndpointsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    user_id = 'user_id_example' # str | The unique identifier for the user.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_user_endpoints(application_id, user_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_user_endpoints:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_user_endpoints: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **user_id** | **str**| The unique identifier for the user. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteUserEndpointsResponse**](DeleteUserEndpointsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_voice_channel**
> DeleteVoiceChannelResponse delete_voice_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disables the voice channel for an application and deletes any existing settings for the channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_voice_channel_response import DeleteVoiceChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_voice_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_voice_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_voice_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**DeleteVoiceChannelResponse**](DeleteVoiceChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_voice_template**
> DeleteVoiceTemplateResponse delete_voice_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Deletes a message template for messages that were sent through the voice channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.delete_voice_template_response import DeleteVoiceTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.delete_voice_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->delete_voice_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_voice_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**DeleteVoiceTemplateResponse**](DeleteVoiceTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_adm_channel**
> GetAdmChannelResponse get_adm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the ADM channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_adm_channel_response import GetAdmChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_adm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_adm_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_adm_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetAdmChannelResponse**](GetAdmChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_apns_channel**
> GetApnsChannelResponse get_apns_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the APNs channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_apns_channel_response import GetApnsChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_apns_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_apns_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_apns_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetApnsChannelResponse**](GetApnsChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_apns_sandbox_channel**
> GetApnsSandboxChannelResponse get_apns_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the APNs sandbox channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_apns_sandbox_channel_response import GetApnsSandboxChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_apns_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_apns_sandbox_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_apns_sandbox_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetApnsSandboxChannelResponse**](GetApnsSandboxChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_apns_voip_channel**
> GetApnsVoipChannelResponse get_apns_voip_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the APNs VoIP channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_apns_voip_channel_response import GetApnsVoipChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_apns_voip_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_apns_voip_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_apns_voip_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetApnsVoipChannelResponse**](GetApnsVoipChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_apns_voip_sandbox_channel**
> GetApnsVoipSandboxChannelResponse get_apns_voip_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the APNs VoIP sandbox channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_apns_voip_sandbox_channel_response import GetApnsVoipSandboxChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_apns_voip_sandbox_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_apns_voip_sandbox_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_apns_voip_sandbox_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetApnsVoipSandboxChannelResponse**](GetApnsVoipSandboxChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_app**
> GetAppResponse get_app(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_app_response import GetAppResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_app(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_app:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_app: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetAppResponse**](GetAppResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_application_date_range_kpi**
> GetApplicationDateRangeKpiResponse get_application_date_range_kpi(application_id, kpi_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, end_time=end_time, next_token=next_token, page_size=page_size, start_time=start_time)



Retrieves (queries) pre-aggregated data for a standard metric that applies to an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_application_date_range_kpi_response import GetApplicationDateRangeKpiResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    kpi_name = 'kpi_name_example' # str | The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the <a href=\"https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html\">Amazon Pinpoint Developer Guide</a>.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-26T20:00:00Z for 8:00 PM UTC July 26, 2019. (optional)
    next_token = 'next_token_example' # str | The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-19T20:00:00Z for 8:00 PM UTC July 19, 2019. This value should also be fewer than 90 days from the current day. (optional)

    try:
        api_response = api_instance.get_application_date_range_kpi(application_id, kpi_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, end_time=end_time, next_token=next_token, page_size=page_size, start_time=start_time)
        print("The response of DefaultApi->get_application_date_range_kpi:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_application_date_range_kpi: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **kpi_name** | **str**| The name of the metric, also referred to as a &lt;i&gt;key performance indicator (KPI)&lt;/i&gt;, to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html\&quot;&gt;Amazon Pinpoint Developer Guide&lt;/a&gt;. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **end_time** | **datetime**| The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-26T20:00:00Z for 8:00 PM UTC July 26, 2019. | [optional] 
 **next_token** | **str**| The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **start_time** | **datetime**| The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-19T20:00:00Z for 8:00 PM UTC July 19, 2019. This value should also be fewer than 90 days from the current day. | [optional] 

### Return type

[**GetApplicationDateRangeKpiResponse**](GetApplicationDateRangeKpiResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_application_settings**
> GetApplicationSettingsResponse get_application_settings(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the settings for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_application_settings_response import GetApplicationSettingsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_application_settings(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_application_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_application_settings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetApplicationSettingsResponse**](GetApplicationSettingsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_apps**
> GetAppsResponse get_apps(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about all the applications that are associated with your Amazon Pinpoint account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_apps_response import GetAppsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_apps(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_apps:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_apps: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetAppsResponse**](GetAppsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_baidu_channel**
> GetBaiduChannelResponse get_baidu_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the Baidu channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_baidu_channel_response import GetBaiduChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_baidu_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_baidu_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_baidu_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetBaiduChannelResponse**](GetBaiduChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign**
> GetCampaignResponse get_campaign(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status, configuration, and other settings for a campaign.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_campaign_response import GetCampaignResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    campaign_id = 'campaign_id_example' # str | The unique identifier for the campaign.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_campaign(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_campaign:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_campaign: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **campaign_id** | **str**| The unique identifier for the campaign. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_activities**
> GetCampaignActivitiesResponse get_campaign_activities(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about all the activities for a campaign.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_campaign_activities_response import GetCampaignActivitiesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    campaign_id = 'campaign_id_example' # str | The unique identifier for the campaign.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_campaign_activities(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_campaign_activities:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_campaign_activities: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **campaign_id** | **str**| The unique identifier for the campaign. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetCampaignActivitiesResponse**](GetCampaignActivitiesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_date_range_kpi**
> GetCampaignDateRangeKpiResponse get_campaign_date_range_kpi(application_id, campaign_id, kpi_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, end_time=end_time, next_token=next_token, page_size=page_size, start_time=start_time)



Retrieves (queries) pre-aggregated data for a standard metric that applies to a campaign.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_campaign_date_range_kpi_response import GetCampaignDateRangeKpiResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    campaign_id = 'campaign_id_example' # str | The unique identifier for the campaign.
    kpi_name = 'kpi_name_example' # str | The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the <a href=\"https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html\">Amazon Pinpoint Developer Guide</a>.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-26T20:00:00Z for 8:00 PM UTC July 26, 2019. (optional)
    next_token = 'next_token_example' # str | The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-19T20:00:00Z for 8:00 PM UTC July 19, 2019. This value should also be fewer than 90 days from the current day. (optional)

    try:
        api_response = api_instance.get_campaign_date_range_kpi(application_id, campaign_id, kpi_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, end_time=end_time, next_token=next_token, page_size=page_size, start_time=start_time)
        print("The response of DefaultApi->get_campaign_date_range_kpi:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_campaign_date_range_kpi: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **campaign_id** | **str**| The unique identifier for the campaign. | 
 **kpi_name** | **str**| The name of the metric, also referred to as a &lt;i&gt;key performance indicator (KPI)&lt;/i&gt;, to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html\&quot;&gt;Amazon Pinpoint Developer Guide&lt;/a&gt;. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **end_time** | **datetime**| The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-26T20:00:00Z for 8:00 PM UTC July 26, 2019. | [optional] 
 **next_token** | **str**| The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **start_time** | **datetime**| The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-19T20:00:00Z for 8:00 PM UTC July 19, 2019. This value should also be fewer than 90 days from the current day. | [optional] 

### Return type

[**GetCampaignDateRangeKpiResponse**](GetCampaignDateRangeKpiResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_version**
> GetCampaignVersionResponse get_campaign_version(application_id, campaign_id, version, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status, configuration, and other settings for a specific version of a campaign.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_campaign_version_response import GetCampaignVersionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    campaign_id = 'campaign_id_example' # str | The unique identifier for the campaign.
    version = 'version_example' # str | The unique version number (Version property) for the campaign version.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_campaign_version(application_id, campaign_id, version, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_campaign_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_campaign_version: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **campaign_id** | **str**| The unique identifier for the campaign. | 
 **version** | **str**| The unique version number (Version property) for the campaign version. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetCampaignVersionResponse**](GetCampaignVersionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaign_versions**
> GetCampaignVersionsResponse get_campaign_versions(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the status, configuration, and other settings for all versions of a campaign.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_campaign_versions_response import GetCampaignVersionsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    campaign_id = 'campaign_id_example' # str | The unique identifier for the campaign.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_campaign_versions(application_id, campaign_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_campaign_versions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_campaign_versions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **campaign_id** | **str**| The unique identifier for the campaign. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetCampaignVersionsResponse**](GetCampaignVersionsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_campaigns**
> GetCampaignsResponse get_campaigns(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the status, configuration, and other settings for all the campaigns that are associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_campaigns_response import GetCampaignsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_campaigns(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_campaigns:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_campaigns: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_channels**
> GetChannelsResponse get_channels(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the history and status of each channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_channels_response import GetChannelsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_channels(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_channels:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_channels: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetChannelsResponse**](GetChannelsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_email_channel**
> GetEmailChannelResponse get_email_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the email channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_email_channel_response import GetEmailChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_email_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_email_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_email_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetEmailChannelResponse**](GetEmailChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_email_template**
> GetEmailTemplateResponse get_email_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Retrieves the content and settings of a message template for messages that are sent through the email channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_email_template_response import GetEmailTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.get_email_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->get_email_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_email_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**GetEmailTemplateResponse**](GetEmailTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_endpoint**
> GetEndpointResponse get_endpoint(application_id, endpoint_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the settings and attributes of a specific endpoint for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_endpoint_response import GetEndpointResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    endpoint_id = 'endpoint_id_example' # str | The unique identifier for the endpoint.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_endpoint(application_id, endpoint_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_endpoint:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_endpoint: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **endpoint_id** | **str**| The unique identifier for the endpoint. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetEndpointResponse**](GetEndpointResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_stream**
> GetEventStreamResponse get_event_stream(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the event stream settings for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_event_stream_response import GetEventStreamResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_event_stream(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_event_stream:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_event_stream: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetEventStreamResponse**](GetEventStreamResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_export_job**
> GetExportJobResponse get_export_job(application_id, job_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of a specific export job for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_export_job_response import GetExportJobResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    job_id = 'job_id_example' # str | The unique identifier for the job.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_export_job(application_id, job_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_export_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_export_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **job_id** | **str**| The unique identifier for the job. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetExportJobResponse**](GetExportJobResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_export_jobs**
> GetExportJobsResponse get_export_jobs(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the status and settings of all the export jobs for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_export_jobs_response import GetExportJobsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_export_jobs(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_export_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_export_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetExportJobsResponse**](GetExportJobsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_gcm_channel**
> GetGcmChannelResponse get_gcm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the GCM channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_gcm_channel_response import GetGcmChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_gcm_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_gcm_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_gcm_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetGcmChannelResponse**](GetGcmChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_import_job**
> GetImportJobResponse get_import_job(application_id, job_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of a specific import job for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_import_job_response import GetImportJobResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    job_id = 'job_id_example' # str | The unique identifier for the job.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_import_job(application_id, job_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_import_job:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_import_job: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **job_id** | **str**| The unique identifier for the job. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetImportJobResponse**](GetImportJobResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_import_jobs**
> GetImportJobsResponse get_import_jobs(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the status and settings of all the import jobs for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_import_jobs_response import GetImportJobsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_import_jobs(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_import_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_import_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetImportJobsResponse**](GetImportJobsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_in_app_messages**
> GetInAppMessagesResponse get_in_app_messages(application_id, endpoint_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves the in-app messages targeted for the provided endpoint ID.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_in_app_messages_response import GetInAppMessagesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    endpoint_id = 'endpoint_id_example' # str | The unique identifier for the endpoint.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_in_app_messages(application_id, endpoint_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_in_app_messages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_in_app_messages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **endpoint_id** | **str**| The unique identifier for the endpoint. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetInAppMessagesResponse**](GetInAppMessagesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_in_app_template**
> GetInAppTemplateResponse get_in_app_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Retrieves the content and settings of a message template for messages sent through the in-app channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_in_app_template_response import GetInAppTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.get_in_app_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->get_in_app_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_in_app_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**GetInAppTemplateResponse**](GetInAppTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_journey**
> GetJourneyResponse get_journey(application_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status, configuration, and other settings for a journey.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_journey_response import GetJourneyResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    journey_id = 'journey_id_example' # str | The unique identifier for the journey.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_journey(application_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_journey:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_journey: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **journey_id** | **str**| The unique identifier for the journey. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetJourneyResponse**](GetJourneyResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_journey_date_range_kpi**
> GetJourneyDateRangeKpiResponse get_journey_date_range_kpi(application_id, journey_id, kpi_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, end_time=end_time, next_token=next_token, page_size=page_size, start_time=start_time)



Retrieves (queries) pre-aggregated data for a standard engagement metric that applies to a journey.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_journey_date_range_kpi_response import GetJourneyDateRangeKpiResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    journey_id = 'journey_id_example' # str | The unique identifier for the journey.
    kpi_name = 'kpi_name_example' # str | The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the <a href=\"https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html\">Amazon Pinpoint Developer Guide</a>.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    end_time = '2013-10-20T19:20:30+01:00' # datetime | The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-26T20:00:00Z for 8:00 PM UTC July 26, 2019. (optional)
    next_token = 'next_token_example' # str | The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    start_time = '2013-10-20T19:20:30+01:00' # datetime | The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-19T20:00:00Z for 8:00 PM UTC July 19, 2019. This value should also be fewer than 90 days from the current day. (optional)

    try:
        api_response = api_instance.get_journey_date_range_kpi(application_id, journey_id, kpi_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, end_time=end_time, next_token=next_token, page_size=page_size, start_time=start_time)
        print("The response of DefaultApi->get_journey_date_range_kpi:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_journey_date_range_kpi: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **journey_id** | **str**| The unique identifier for the journey. | 
 **kpi_name** | **str**| The name of the metric, also referred to as a &lt;i&gt;key performance indicator (KPI)&lt;/i&gt;, to retrieve data for. This value describes the associated metric and consists of two or more terms, which are comprised of lowercase alphanumeric characters, separated by a hyphen. Examples are email-open-rate and successful-delivery-rate. For a list of valid values, see the &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/pinpoint/latest/developerguide/analytics-standard-metrics.html\&quot;&gt;Amazon Pinpoint Developer Guide&lt;/a&gt;. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **end_time** | **datetime**| The last date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-26T20:00:00Z for 8:00 PM UTC July 26, 2019. | [optional] 
 **next_token** | **str**| The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **start_time** | **datetime**| The first date and time to retrieve data for, as part of an inclusive date range that filters the query results. This value should be in extended ISO 8601 format and use Coordinated Universal Time (UTC), for example: 2019-07-19T20:00:00Z for 8:00 PM UTC July 19, 2019. This value should also be fewer than 90 days from the current day. | [optional] 

### Return type

[**GetJourneyDateRangeKpiResponse**](GetJourneyDateRangeKpiResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_journey_execution_activity_metrics**
> GetJourneyExecutionActivityMetricsResponse get_journey_execution_activity_metrics(application_id, journey_activity_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size)



Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey activity.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_journey_execution_activity_metrics_response import GetJourneyExecutionActivityMetricsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    journey_activity_id = 'journey_activity_id_example' # str | The unique identifier for the journey activity.
    journey_id = 'journey_id_example' # str | The unique identifier for the journey.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    next_token = 'next_token_example' # str | The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)

    try:
        api_response = api_instance.get_journey_execution_activity_metrics(application_id, journey_activity_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size)
        print("The response of DefaultApi->get_journey_execution_activity_metrics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_journey_execution_activity_metrics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **journey_activity_id** | **str**| The unique identifier for the journey activity. | 
 **journey_id** | **str**| The unique identifier for the journey. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **next_token** | **str**| The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 

### Return type

[**GetJourneyExecutionActivityMetricsResponse**](GetJourneyExecutionActivityMetricsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_journey_execution_metrics**
> GetJourneyExecutionMetricsResponse get_journey_execution_metrics(application_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size)



Retrieves (queries) pre-aggregated data for a standard execution metric that applies to a journey.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_journey_execution_metrics_response import GetJourneyExecutionMetricsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    journey_id = 'journey_id_example' # str | The unique identifier for the journey.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    next_token = 'next_token_example' # str | The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)

    try:
        api_response = api_instance.get_journey_execution_metrics(application_id, journey_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size)
        print("The response of DefaultApi->get_journey_execution_metrics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_journey_execution_metrics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **journey_id** | **str**| The unique identifier for the journey. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **next_token** | **str**| The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 

### Return type

[**GetJourneyExecutionMetricsResponse**](GetJourneyExecutionMetricsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_push_template**
> GetPushTemplateResponse get_push_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Retrieves the content and settings of a message template for messages that are sent through a push notification channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_push_template_response import GetPushTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.get_push_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->get_push_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_push_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**GetPushTemplateResponse**](GetPushTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommender_configuration**
> GetRecommenderConfigurationResponse get_recommender_configuration(recommender_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about an Amazon Pinpoint configuration for a recommender model.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_recommender_configuration_response import GetRecommenderConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    recommender_id = 'recommender_id_example' # str | The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_recommender_configuration(recommender_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_recommender_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_recommender_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recommender_id** | **str**| The unique identifier for the recommender model configuration. This identifier is displayed as the &lt;b&gt;Recommender ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetRecommenderConfigurationResponse**](GetRecommenderConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommender_configurations**
> GetRecommenderConfigurationsResponse get_recommender_configurations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about all the recommender model configurations that are associated with your Amazon Pinpoint account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_recommender_configurations_response import GetRecommenderConfigurationsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_recommender_configurations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_recommender_configurations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_recommender_configurations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetRecommenderConfigurationsResponse**](GetRecommenderConfigurationsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segment**
> GetSegmentResponse get_segment(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the configuration, dimension, and other settings for a specific segment that's associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_segment_response import GetSegmentResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    segment_id = 'segment_id_example' # str | The unique identifier for the segment.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_segment(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_segment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_segment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **segment_id** | **str**| The unique identifier for the segment. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetSegmentResponse**](GetSegmentResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segment_export_jobs**
> GetSegmentExportJobsResponse get_segment_export_jobs(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the status and settings of the export jobs for a segment.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_segment_export_jobs_response import GetSegmentExportJobsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    segment_id = 'segment_id_example' # str | The unique identifier for the segment.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_segment_export_jobs(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_segment_export_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_segment_export_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **segment_id** | **str**| The unique identifier for the segment. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetSegmentExportJobsResponse**](GetSegmentExportJobsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segment_import_jobs**
> GetSegmentImportJobsResponse get_segment_import_jobs(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the status and settings of the import jobs for a segment.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_segment_import_jobs_response import GetSegmentImportJobsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    segment_id = 'segment_id_example' # str | The unique identifier for the segment.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_segment_import_jobs(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_segment_import_jobs:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_segment_import_jobs: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **segment_id** | **str**| The unique identifier for the segment. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetSegmentImportJobsResponse**](GetSegmentImportJobsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segment_version**
> GetSegmentVersionResponse get_segment_version(application_id, segment_id, version, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the configuration, dimension, and other settings for a specific version of a segment that's associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_segment_version_response import GetSegmentVersionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    segment_id = 'segment_id_example' # str | The unique identifier for the segment.
    version = 'version_example' # str | The unique version number (Version property) for the campaign version.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_segment_version(application_id, segment_id, version, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_segment_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_segment_version: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **segment_id** | **str**| The unique identifier for the segment. | 
 **version** | **str**| The unique version number (Version property) for the campaign version. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetSegmentVersionResponse**](GetSegmentVersionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segment_versions**
> GetSegmentVersionsResponse get_segment_versions(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the configuration, dimension, and other settings for all the versions of a specific segment that's associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_segment_versions_response import GetSegmentVersionsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    segment_id = 'segment_id_example' # str | The unique identifier for the segment.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_segment_versions(application_id, segment_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_segment_versions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_segment_versions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **segment_id** | **str**| The unique identifier for the segment. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetSegmentVersionsResponse**](GetSegmentVersionsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segments**
> GetSegmentsResponse get_segments(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the configuration, dimension, and other settings for all the segments that are associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_segments_response import GetSegmentsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.get_segments(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->get_segments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_segments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**GetSegmentsResponse**](GetSegmentsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sms_channel**
> GetSmsChannelResponse get_sms_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the SMS channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_sms_channel_response import GetSmsChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_sms_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_sms_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_sms_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetSmsChannelResponse**](GetSmsChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_sms_template**
> GetSmsTemplateResponse get_sms_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Retrieves the content and settings of a message template for messages that are sent through the SMS channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_sms_template_response import GetSmsTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.get_sms_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->get_sms_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_sms_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**GetSmsTemplateResponse**](GetSmsTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user_endpoints**
> GetUserEndpointsResponse get_user_endpoints(application_id, user_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about all the endpoints that are associated with a specific user ID.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_user_endpoints_response import GetUserEndpointsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    user_id = 'user_id_example' # str | The unique identifier for the user.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_user_endpoints(application_id, user_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_user_endpoints:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_user_endpoints: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **user_id** | **str**| The unique identifier for the user. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetUserEndpointsResponse**](GetUserEndpointsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_voice_channel**
> GetVoiceChannelResponse get_voice_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about the status and settings of the voice channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_voice_channel_response import GetVoiceChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_voice_channel(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_voice_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_voice_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetVoiceChannelResponse**](GetVoiceChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_voice_template**
> GetVoiceTemplateResponse get_voice_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)



Retrieves the content and settings of a message template for messages that are sent through the voice channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_voice_template_response import GetVoiceTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.get_voice_template(template_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, version=version)
        print("The response of DefaultApi->get_voice_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_voice_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**GetVoiceTemplateResponse**](GetVoiceTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_journeys**
> ListJourneysResponse list_journeys(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)



Retrieves information about the status, configuration, and other settings for all the journeys that are associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_journeys_response import ListJourneysResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    token = 'token_example' # str | The NextToken string that specifies which page of results to return in a paginated response. (optional)

    try:
        api_response = api_instance.list_journeys(application_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, page_size=page_size, token=token)
        print("The response of DefaultApi->list_journeys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_journeys: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **token** | **str**| The NextToken string that specifies which page of results to return in a paginated response. | [optional] 

### Return type

[**ListJourneysResponse**](ListJourneysResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_tags_for_resource**
> ListTagsForResourceResponse list_tags_for_resource(resource_arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves all the tags (keys and values) that are associated with an application, campaign, message template, or segment.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_tags_for_resource_response import ListTagsForResourceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    resource_arn = 'resource_arn_example' # str | The Amazon Resource Name (ARN) of the resource.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.list_tags_for_resource(resource_arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->list_tags_for_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_tags_for_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The Amazon Resource Name (ARN) of the resource. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**ListTagsForResourceResponse**](ListTagsForResourceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_template_versions**
> ListTemplateVersionsResponse list_template_versions(template_name, template_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size)



Retrieves information about all the versions of a specific message template.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_template_versions_response import ListTemplateVersionsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    template_type = 'template_type_example' # str | The type of channel that the message template is designed for. Valid values are: EMAIL, PUSH, SMS, and VOICE.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    next_token = 'next_token_example' # str | The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)

    try:
        api_response = api_instance.list_template_versions(template_name, template_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size)
        print("The response of DefaultApi->list_template_versions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_template_versions: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **template_type** | **str**| The type of channel that the message template is designed for. Valid values are: EMAIL, PUSH, SMS, and VOICE. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **next_token** | **str**| The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 

### Return type

[**ListTemplateVersionsResponse**](ListTemplateVersionsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_templates**
> ListTemplatesResponse list_templates(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size, prefix=prefix, template_type=template_type)



Retrieves information about all the message templates that are associated with your Amazon Pinpoint account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_templates_response import ListTemplatesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    next_token = 'next_token_example' # str | The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    page_size = 'page_size_example' # str | The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. (optional)
    prefix = 'prefix_example' # str | The substring to match in the names of the message templates to include in the results. If you specify this value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify. (optional)
    template_type = 'template_type_example' # str | The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include all types of templates in the results, don't include this parameter in your request. (optional)

    try:
        api_response = api_instance.list_templates(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, page_size=page_size, prefix=prefix, template_type=template_type)
        print("The response of DefaultApi->list_templates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_templates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **next_token** | **str**| The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **page_size** | **str**| The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics. | [optional] 
 **prefix** | **str**| The substring to match in the names of the message templates to include in the results. If you specify this value, Amazon Pinpoint returns only those templates whose names begin with the value that you specify. | [optional] 
 **template_type** | **str**| The type of message template to include in the results. Valid values are: EMAIL, PUSH, SMS, and VOICE. To include all types of templates in the results, don&#39;t include this parameter in your request. | [optional] 

### Return type

[**ListTemplatesResponse**](ListTemplatesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | MethodNotAllowedException |  -  |
**481** | TooManyRequestsException |  -  |
**482** | BadRequestException |  -  |
**483** | InternalServerErrorException |  -  |
**484** | ForbiddenException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **phone_number_validate**
> PhoneNumberValidateResponse phone_number_validate(phone_number_validate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Retrieves information about a phone number.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.phone_number_validate_request import PhoneNumberValidateRequest
from openapi_client.models.phone_number_validate_response import PhoneNumberValidateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    phone_number_validate_request = openapi_client.PhoneNumberValidateRequest() # PhoneNumberValidateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.phone_number_validate(phone_number_validate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->phone_number_validate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->phone_number_validate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phone_number_validate_request** | [**PhoneNumberValidateRequest**](PhoneNumberValidateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**PhoneNumberValidateResponse**](PhoneNumberValidateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_event_stream**
> PutEventStreamResponse put_event_stream(application_id, put_event_stream_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new event stream for an application or updates the settings of an existing event stream for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.put_event_stream_request import PutEventStreamRequest
from openapi_client.models.put_event_stream_response import PutEventStreamResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    put_event_stream_request = openapi_client.PutEventStreamRequest() # PutEventStreamRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.put_event_stream(application_id, put_event_stream_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->put_event_stream:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->put_event_stream: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **put_event_stream_request** | [**PutEventStreamRequest**](PutEventStreamRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**PutEventStreamResponse**](PutEventStreamResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_events**
> PutEventsResponse put_events(application_id, put_events_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new event to record for endpoints, or creates or updates endpoint data that existing events are associated with.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.put_events_request import PutEventsRequest
from openapi_client.models.put_events_response import PutEventsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    put_events_request = openapi_client.PutEventsRequest() # PutEventsRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.put_events(application_id, put_events_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->put_events:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->put_events: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **put_events_request** | [**PutEventsRequest**](PutEventsRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**PutEventsResponse**](PutEventsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_attributes**
> RemoveAttributesResponse remove_attributes(application_id, attribute_type, remove_attributes_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Removes one or more attributes, of the same attribute type, from all the endpoints that are associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.remove_attributes_request import RemoveAttributesRequest
from openapi_client.models.remove_attributes_response import RemoveAttributesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    attribute_type = 'attribute_type_example' # str |  <p>The type of attribute or attributes to remove. Valid values are:</p> <ul><li><p>endpoint-custom-attributes - Custom attributes that describe endpoints, such as the date when an associated user opted in or out of receiving communications from you through a specific type of channel.</p></li> <li><p>endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints, such as the number of app sessions or the number of items left in a cart.</p></li> <li><p>endpoint-user-attributes - Custom attributes that describe users, such as first name, last name, and age.</p></li></ul>
    remove_attributes_request = openapi_client.RemoveAttributesRequest() # RemoveAttributesRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.remove_attributes(application_id, attribute_type, remove_attributes_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->remove_attributes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->remove_attributes: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **attribute_type** | **str**|  &lt;p&gt;The type of attribute or attributes to remove. Valid values are:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;endpoint-custom-attributes - Custom attributes that describe endpoints, such as the date when an associated user opted in or out of receiving communications from you through a specific type of channel.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;endpoint-metric-attributes - Custom metrics that your app reports to Amazon Pinpoint for endpoints, such as the number of app sessions or the number of items left in a cart.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;endpoint-user-attributes - Custom attributes that describe users, such as first name, last name, and age.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | 
 **remove_attributes_request** | [**RemoveAttributesRequest**](RemoveAttributesRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**RemoveAttributesResponse**](RemoveAttributesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_messages**
> SendMessagesResponse send_messages(application_id, send_messages_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates and sends a direct message.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.send_messages_request import SendMessagesRequest
from openapi_client.models.send_messages_response import SendMessagesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    send_messages_request = openapi_client.SendMessagesRequest() # SendMessagesRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.send_messages(application_id, send_messages_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->send_messages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->send_messages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **send_messages_request** | [**SendMessagesRequest**](SendMessagesRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**SendMessagesResponse**](SendMessagesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_otp_message**
> SendOTPMessageResponse send_otp_message(application_id, send_otp_message_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Send an OTP message

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.send_otp_message_request import SendOTPMessageRequest
from openapi_client.models.send_otp_message_response import SendOTPMessageResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique ID of your Amazon Pinpoint application.
    send_otp_message_request = openapi_client.SendOTPMessageRequest() # SendOTPMessageRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.send_otp_message(application_id, send_otp_message_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->send_otp_message:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->send_otp_message: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique ID of your Amazon Pinpoint application. | 
 **send_otp_message_request** | [**SendOTPMessageRequest**](SendOTPMessageRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**SendOTPMessageResponse**](SendOTPMessageResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_users_messages**
> SendUsersMessagesResponse send_users_messages(application_id, send_users_messages_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates and sends a message to a list of users.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.send_users_messages_request import SendUsersMessagesRequest
from openapi_client.models.send_users_messages_response import SendUsersMessagesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    send_users_messages_request = openapi_client.SendUsersMessagesRequest() # SendUsersMessagesRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.send_users_messages(application_id, send_users_messages_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->send_users_messages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->send_users_messages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **send_users_messages_request** | [**SendUsersMessagesRequest**](SendUsersMessagesRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**SendUsersMessagesResponse**](SendUsersMessagesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tag_resource**
> tag_resource(resource_arn, tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Adds one or more tags (keys and values) to an application, campaign, message template, or segment.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.tag_resource_request import TagResourceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    resource_arn = 'resource_arn_example' # str | The Amazon Resource Name (ARN) of the resource.
    tag_resource_request = openapi_client.TagResourceRequest() # TagResourceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_instance.tag_resource(resource_arn, tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
    except Exception as e:
        print("Exception when calling DefaultApi->tag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The Amazon Resource Name (ARN) of the resource. | 
 **tag_resource_request** | [**TagResourceRequest**](TagResourceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **untag_resource**
> untag_resource(resource_arn, tag_keys, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Removes one or more tags (keys and values) from an application, campaign, message template, or segment.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    resource_arn = 'resource_arn_example' # str | The Amazon Resource Name (ARN) of the resource.
    tag_keys = ['tag_keys_example'] # List[str] | The key of the tag to remove from the resource. To remove multiple tags, append the tagKeys parameter and argument for each additional tag to remove, separated by an ampersand (&amp;).
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_instance.untag_resource(resource_arn, tag_keys, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
    except Exception as e:
        print("Exception when calling DefaultApi->untag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The Amazon Resource Name (ARN) of the resource. | 
 **tag_keys** | [**List[str]**](str.md)| The key of the tag to remove from the resource. To remove multiple tags, append the tagKeys parameter and argument for each additional tag to remove, separated by an ampersand (&amp;amp;). | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_adm_channel**
> UpdateAdmChannelResponse update_adm_channel(application_id, update_adm_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the ADM channel for an application or updates the status and settings of the ADM channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_adm_channel_request import UpdateAdmChannelRequest
from openapi_client.models.update_adm_channel_response import UpdateAdmChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_adm_channel_request = openapi_client.UpdateAdmChannelRequest() # UpdateAdmChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_adm_channel(application_id, update_adm_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_adm_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_adm_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_adm_channel_request** | [**UpdateAdmChannelRequest**](UpdateAdmChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateAdmChannelResponse**](UpdateAdmChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_apns_channel**
> UpdateApnsChannelResponse update_apns_channel(application_id, update_apns_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the APNs channel for an application or updates the status and settings of the APNs channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_apns_channel_request import UpdateApnsChannelRequest
from openapi_client.models.update_apns_channel_response import UpdateApnsChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_apns_channel_request = openapi_client.UpdateApnsChannelRequest() # UpdateApnsChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_apns_channel(application_id, update_apns_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_apns_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_apns_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_apns_channel_request** | [**UpdateApnsChannelRequest**](UpdateApnsChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateApnsChannelResponse**](UpdateApnsChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_apns_sandbox_channel**
> UpdateApnsSandboxChannelResponse update_apns_sandbox_channel(application_id, update_apns_sandbox_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the APNs sandbox channel for an application or updates the status and settings of the APNs sandbox channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_apns_sandbox_channel_request import UpdateApnsSandboxChannelRequest
from openapi_client.models.update_apns_sandbox_channel_response import UpdateApnsSandboxChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_apns_sandbox_channel_request = openapi_client.UpdateApnsSandboxChannelRequest() # UpdateApnsSandboxChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_apns_sandbox_channel(application_id, update_apns_sandbox_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_apns_sandbox_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_apns_sandbox_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_apns_sandbox_channel_request** | [**UpdateApnsSandboxChannelRequest**](UpdateApnsSandboxChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateApnsSandboxChannelResponse**](UpdateApnsSandboxChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_apns_voip_channel**
> UpdateApnsVoipChannelResponse update_apns_voip_channel(application_id, update_apns_voip_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the APNs VoIP channel for an application or updates the status and settings of the APNs VoIP channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_apns_voip_channel_request import UpdateApnsVoipChannelRequest
from openapi_client.models.update_apns_voip_channel_response import UpdateApnsVoipChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_apns_voip_channel_request = openapi_client.UpdateApnsVoipChannelRequest() # UpdateApnsVoipChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_apns_voip_channel(application_id, update_apns_voip_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_apns_voip_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_apns_voip_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_apns_voip_channel_request** | [**UpdateApnsVoipChannelRequest**](UpdateApnsVoipChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateApnsVoipChannelResponse**](UpdateApnsVoipChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_apns_voip_sandbox_channel**
> UpdateApnsVoipSandboxChannelResponse update_apns_voip_sandbox_channel(application_id, update_apns_voip_sandbox_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the APNs VoIP sandbox channel for an application or updates the status and settings of the APNs VoIP sandbox channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_apns_voip_sandbox_channel_request import UpdateApnsVoipSandboxChannelRequest
from openapi_client.models.update_apns_voip_sandbox_channel_response import UpdateApnsVoipSandboxChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_apns_voip_sandbox_channel_request = openapi_client.UpdateApnsVoipSandboxChannelRequest() # UpdateApnsVoipSandboxChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_apns_voip_sandbox_channel(application_id, update_apns_voip_sandbox_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_apns_voip_sandbox_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_apns_voip_sandbox_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_apns_voip_sandbox_channel_request** | [**UpdateApnsVoipSandboxChannelRequest**](UpdateApnsVoipSandboxChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateApnsVoipSandboxChannelResponse**](UpdateApnsVoipSandboxChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_application_settings**
> UpdateApplicationSettingsResponse update_application_settings(application_id, update_application_settings_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates the settings for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_application_settings_request import UpdateApplicationSettingsRequest
from openapi_client.models.update_application_settings_response import UpdateApplicationSettingsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_application_settings_request = openapi_client.UpdateApplicationSettingsRequest() # UpdateApplicationSettingsRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_application_settings(application_id, update_application_settings_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_application_settings:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_application_settings: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_application_settings_request** | [**UpdateApplicationSettingsRequest**](UpdateApplicationSettingsRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateApplicationSettingsResponse**](UpdateApplicationSettingsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_baidu_channel**
> UpdateBaiduChannelResponse update_baidu_channel(application_id, update_baidu_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the Baidu channel for an application or updates the status and settings of the Baidu channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_baidu_channel_request import UpdateBaiduChannelRequest
from openapi_client.models.update_baidu_channel_response import UpdateBaiduChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_baidu_channel_request = openapi_client.UpdateBaiduChannelRequest() # UpdateBaiduChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_baidu_channel(application_id, update_baidu_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_baidu_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_baidu_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_baidu_channel_request** | [**UpdateBaiduChannelRequest**](UpdateBaiduChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateBaiduChannelResponse**](UpdateBaiduChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_campaign**
> UpdateCampaignResponse update_campaign(application_id, campaign_id, create_campaign_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates the configuration and other settings for a campaign.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_campaign_request import CreateCampaignRequest
from openapi_client.models.update_campaign_response import UpdateCampaignResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    campaign_id = 'campaign_id_example' # str | The unique identifier for the campaign.
    create_campaign_request = openapi_client.CreateCampaignRequest() # CreateCampaignRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_campaign(application_id, campaign_id, create_campaign_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_campaign:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_campaign: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **campaign_id** | **str**| The unique identifier for the campaign. | 
 **create_campaign_request** | [**CreateCampaignRequest**](CreateCampaignRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateCampaignResponse**](UpdateCampaignResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_email_channel**
> UpdateEmailChannelResponse update_email_channel(application_id, update_email_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the email channel for an application or updates the status and settings of the email channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_email_channel_request import UpdateEmailChannelRequest
from openapi_client.models.update_email_channel_response import UpdateEmailChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_email_channel_request = openapi_client.UpdateEmailChannelRequest() # UpdateEmailChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_email_channel(application_id, update_email_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_email_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_email_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_email_channel_request** | [**UpdateEmailChannelRequest**](UpdateEmailChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateEmailChannelResponse**](UpdateEmailChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_email_template**
> UpdateEmailTemplateResponse update_email_template(template_name, update_email_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)



Updates an existing message template for messages that are sent through the email channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_email_template_request import UpdateEmailTemplateRequest
from openapi_client.models.update_email_template_response import UpdateEmailTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_email_template_request = openapi_client.UpdateEmailTemplateRequest() # UpdateEmailTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    create_new_version = True # bool | <p>Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.</p> (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.update_email_template(template_name, update_email_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)
        print("The response of DefaultApi->update_email_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_email_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_email_template_request** | [**UpdateEmailTemplateRequest**](UpdateEmailTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **create_new_version** | **bool**| &lt;p&gt;Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don&#39;t specify a value for the version parameter. Otherwise, an error will occur.&lt;/p&gt; | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**UpdateEmailTemplateResponse**](UpdateEmailTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_endpoint**
> UpdateEndpointResponse update_endpoint(application_id, endpoint_id, update_endpoint_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new endpoint for an application or updates the settings and attributes of an existing endpoint for an application. You can also use this operation to define custom attributes for an endpoint. If an update includes one or more values for a custom attribute, Amazon Pinpoint replaces (overwrites) any existing values with the new values.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_endpoint_request import UpdateEndpointRequest
from openapi_client.models.update_endpoint_response import UpdateEndpointResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    endpoint_id = 'endpoint_id_example' # str | The unique identifier for the endpoint.
    update_endpoint_request = openapi_client.UpdateEndpointRequest() # UpdateEndpointRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_endpoint(application_id, endpoint_id, update_endpoint_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_endpoint:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_endpoint: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **endpoint_id** | **str**| The unique identifier for the endpoint. | 
 **update_endpoint_request** | [**UpdateEndpointRequest**](UpdateEndpointRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateEndpointResponse**](UpdateEndpointResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_endpoints_batch**
> UpdateEndpointsBatchResponse update_endpoints_batch(application_id, update_endpoints_batch_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new batch of endpoints for an application or updates the settings and attributes of a batch of existing endpoints for an application. You can also use this operation to define custom attributes for a batch of endpoints. If an update includes one or more values for a custom attribute, Amazon Pinpoint replaces (overwrites) any existing values with the new values.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_endpoints_batch_request import UpdateEndpointsBatchRequest
from openapi_client.models.update_endpoints_batch_response import UpdateEndpointsBatchResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_endpoints_batch_request = openapi_client.UpdateEndpointsBatchRequest() # UpdateEndpointsBatchRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_endpoints_batch(application_id, update_endpoints_batch_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_endpoints_batch:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_endpoints_batch: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_endpoints_batch_request** | [**UpdateEndpointsBatchRequest**](UpdateEndpointsBatchRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateEndpointsBatchResponse**](UpdateEndpointsBatchResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_gcm_channel**
> UpdateGcmChannelResponse update_gcm_channel(application_id, update_gcm_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the GCM channel for an application or updates the status and settings of the GCM channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_gcm_channel_request import UpdateGcmChannelRequest
from openapi_client.models.update_gcm_channel_response import UpdateGcmChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_gcm_channel_request = openapi_client.UpdateGcmChannelRequest() # UpdateGcmChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_gcm_channel(application_id, update_gcm_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_gcm_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_gcm_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_gcm_channel_request** | [**UpdateGcmChannelRequest**](UpdateGcmChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateGcmChannelResponse**](UpdateGcmChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_in_app_template**
> UpdateInAppTemplateResponse update_in_app_template(template_name, update_in_app_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)



Updates an existing message template for messages sent through the in-app message channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_in_app_template_request import UpdateInAppTemplateRequest
from openapi_client.models.update_in_app_template_response import UpdateInAppTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_in_app_template_request = openapi_client.UpdateInAppTemplateRequest() # UpdateInAppTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    create_new_version = True # bool | <p>Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.</p> (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.update_in_app_template(template_name, update_in_app_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)
        print("The response of DefaultApi->update_in_app_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_in_app_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_in_app_template_request** | [**UpdateInAppTemplateRequest**](UpdateInAppTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **create_new_version** | **bool**| &lt;p&gt;Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don&#39;t specify a value for the version parameter. Otherwise, an error will occur.&lt;/p&gt; | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**UpdateInAppTemplateResponse**](UpdateInAppTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_journey**
> UpdateJourneyResponse update_journey(application_id, journey_id, create_journey_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates the configuration and other settings for a journey.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_journey_request import CreateJourneyRequest
from openapi_client.models.update_journey_response import UpdateJourneyResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    journey_id = 'journey_id_example' # str | The unique identifier for the journey.
    create_journey_request = openapi_client.CreateJourneyRequest() # CreateJourneyRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_journey(application_id, journey_id, create_journey_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_journey:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_journey: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **journey_id** | **str**| The unique identifier for the journey. | 
 **create_journey_request** | [**CreateJourneyRequest**](CreateJourneyRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateJourneyResponse**](UpdateJourneyResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |
**487** | ConflictException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_journey_state**
> UpdateJourneyStateResponse update_journey_state(application_id, journey_id, update_journey_state_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Cancels (stops) an active journey.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_journey_state_request import UpdateJourneyStateRequest
from openapi_client.models.update_journey_state_response import UpdateJourneyStateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    journey_id = 'journey_id_example' # str | The unique identifier for the journey.
    update_journey_state_request = openapi_client.UpdateJourneyStateRequest() # UpdateJourneyStateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_journey_state(application_id, journey_id, update_journey_state_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_journey_state:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_journey_state: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **journey_id** | **str**| The unique identifier for the journey. | 
 **update_journey_state_request** | [**UpdateJourneyStateRequest**](UpdateJourneyStateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateJourneyStateResponse**](UpdateJourneyStateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_push_template**
> UpdatePushTemplateResponse update_push_template(template_name, update_push_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)



Updates an existing message template for messages that are sent through a push notification channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_push_template_request import UpdatePushTemplateRequest
from openapi_client.models.update_push_template_response import UpdatePushTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_push_template_request = openapi_client.UpdatePushTemplateRequest() # UpdatePushTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    create_new_version = True # bool | <p>Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.</p> (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.update_push_template(template_name, update_push_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)
        print("The response of DefaultApi->update_push_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_push_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_push_template_request** | [**UpdatePushTemplateRequest**](UpdatePushTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **create_new_version** | **bool**| &lt;p&gt;Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don&#39;t specify a value for the version parameter. Otherwise, an error will occur.&lt;/p&gt; | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**UpdatePushTemplateResponse**](UpdatePushTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_recommender_configuration**
> UpdateRecommenderConfigurationResponse update_recommender_configuration(recommender_id, update_recommender_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates an Amazon Pinpoint configuration for a recommender model.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_recommender_configuration_request import UpdateRecommenderConfigurationRequest
from openapi_client.models.update_recommender_configuration_response import UpdateRecommenderConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    recommender_id = 'recommender_id_example' # str | The unique identifier for the recommender model configuration. This identifier is displayed as the <b>Recommender ID</b> on the Amazon Pinpoint console.
    update_recommender_configuration_request = openapi_client.UpdateRecommenderConfigurationRequest() # UpdateRecommenderConfigurationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_recommender_configuration(recommender_id, update_recommender_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_recommender_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_recommender_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recommender_id** | **str**| The unique identifier for the recommender model configuration. This identifier is displayed as the &lt;b&gt;Recommender ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_recommender_configuration_request** | [**UpdateRecommenderConfigurationRequest**](UpdateRecommenderConfigurationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateRecommenderConfigurationResponse**](UpdateRecommenderConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_segment**
> UpdateSegmentResponse update_segment(application_id, segment_id, create_segment_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new segment for an application or updates the configuration, dimension, and other settings for an existing segment that's associated with an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_segment_request import CreateSegmentRequest
from openapi_client.models.update_segment_response import UpdateSegmentResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    segment_id = 'segment_id_example' # str | The unique identifier for the segment.
    create_segment_request = openapi_client.CreateSegmentRequest() # CreateSegmentRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_segment(application_id, segment_id, create_segment_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_segment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_segment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **segment_id** | **str**| The unique identifier for the segment. | 
 **create_segment_request** | [**CreateSegmentRequest**](CreateSegmentRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateSegmentResponse**](UpdateSegmentResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_sms_channel**
> UpdateSmsChannelResponse update_sms_channel(application_id, update_sms_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the SMS channel for an application or updates the status and settings of the SMS channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_sms_channel_request import UpdateSmsChannelRequest
from openapi_client.models.update_sms_channel_response import UpdateSmsChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_sms_channel_request = openapi_client.UpdateSmsChannelRequest() # UpdateSmsChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_sms_channel(application_id, update_sms_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_sms_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_sms_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_sms_channel_request** | [**UpdateSmsChannelRequest**](UpdateSmsChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateSmsChannelResponse**](UpdateSmsChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_sms_template**
> UpdateSmsTemplateResponse update_sms_template(template_name, update_sms_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)



Updates an existing message template for messages that are sent through the SMS channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_sms_template_request import UpdateSmsTemplateRequest
from openapi_client.models.update_sms_template_response import UpdateSmsTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_sms_template_request = openapi_client.UpdateSmsTemplateRequest() # UpdateSmsTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    create_new_version = True # bool | <p>Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.</p> (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.update_sms_template(template_name, update_sms_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)
        print("The response of DefaultApi->update_sms_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_sms_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_sms_template_request** | [**UpdateSmsTemplateRequest**](UpdateSmsTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **create_new_version** | **bool**| &lt;p&gt;Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don&#39;t specify a value for the version parameter. Otherwise, an error will occur.&lt;/p&gt; | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**UpdateSmsTemplateResponse**](UpdateSmsTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_template_active_version**
> UpdateTemplateActiveVersionResponse update_template_active_version(template_name, template_type, update_template_active_version_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Changes the status of a specific version of a message template to <i>active</i>.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_template_active_version_request import UpdateTemplateActiveVersionRequest
from openapi_client.models.update_template_active_version_response import UpdateTemplateActiveVersionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    template_type = 'template_type_example' # str | The type of channel that the message template is designed for. Valid values are: EMAIL, PUSH, SMS, and VOICE.
    update_template_active_version_request = openapi_client.UpdateTemplateActiveVersionRequest() # UpdateTemplateActiveVersionRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_template_active_version(template_name, template_type, update_template_active_version_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_template_active_version:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_template_active_version: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **template_type** | **str**| The type of channel that the message template is designed for. Valid values are: EMAIL, PUSH, SMS, and VOICE. | 
 **update_template_active_version_request** | [**UpdateTemplateActiveVersionRequest**](UpdateTemplateActiveVersionRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateTemplateActiveVersionResponse**](UpdateTemplateActiveVersionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_voice_channel**
> UpdateVoiceChannelResponse update_voice_channel(application_id, update_voice_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Enables the voice channel for an application or updates the status and settings of the voice channel for an application.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_voice_channel_request import UpdateVoiceChannelRequest
from openapi_client.models.update_voice_channel_response import UpdateVoiceChannelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon Pinpoint console.
    update_voice_channel_request = openapi_client.UpdateVoiceChannelRequest() # UpdateVoiceChannelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_voice_channel(application_id, update_voice_channel_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_voice_channel:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_voice_channel: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique identifier for the application. This identifier is displayed as the &lt;b&gt;Project ID&lt;/b&gt; on the Amazon Pinpoint console. | 
 **update_voice_channel_request** | [**UpdateVoiceChannelRequest**](UpdateVoiceChannelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**UpdateVoiceChannelResponse**](UpdateVoiceChannelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_voice_template**
> UpdateVoiceTemplateResponse update_voice_template(template_name, update_voice_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)



Updates an existing message template for messages that are sent through the voice channel.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_voice_template_request import UpdateVoiceTemplateRequest
from openapi_client.models.update_voice_template_response import UpdateVoiceTemplateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    template_name = 'template_name_example' # str | The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive.
    update_voice_template_request = openapi_client.UpdateVoiceTemplateRequest() # UpdateVoiceTemplateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    create_new_version = True # bool | <p>Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don't specify a value for the version parameter. Otherwise, an error will occur.</p> (optional)
    version = 'version_example' # str | <p>The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the <link  linkend=\"templates-template-name-template-type-versions\">Template Versions</link> resource.</p> <p>If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don't occur.</p> <p>If you don't specify a value for this parameter, Amazon Pinpoint does the following:</p> <ul><li><p>For a get operation, retrieves information about the active version of the template.</p></li> <li><p>For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn't used or is set to false.</p></li> <li><p>For a delete operation, deletes the template, including all versions of the template.</p></li></ul> (optional)

    try:
        api_response = api_instance.update_voice_template(template_name, update_voice_template_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, create_new_version=create_new_version, version=version)
        print("The response of DefaultApi->update_voice_template:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_voice_template: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **template_name** | **str**| The name of the message template. A template name must start with an alphanumeric character and can contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-). Template names are case sensitive. | 
 **update_voice_template_request** | [**UpdateVoiceTemplateRequest**](UpdateVoiceTemplateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **create_new_version** | **bool**| &lt;p&gt;Specifies whether to save the updates as a new version of the message template. Valid values are: true, save the updates as a new version; and, false, save the updates to (overwrite) the latest existing version of the template.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint saves the updates to (overwrites) the latest existing version of the template. If you specify a value of true for this parameter, don&#39;t specify a value for the version parameter. Otherwise, an error will occur.&lt;/p&gt; | [optional] 
 **version** | **str**| &lt;p&gt;The unique identifier for the version of the message template to update, retrieve information about, or delete. To retrieve identifiers and other information for all the versions of a template, use the &lt;link  linkend&#x3D;\&quot;templates-template-name-template-type-versions\&quot;&gt;Template Versions&lt;/link&gt; resource.&lt;/p&gt; &lt;p&gt;If specified, this value must match the identifier for an existing template version. If specified for an update operation, this value must match the identifier for the latest existing version of the template. This restriction helps ensure that race conditions don&#39;t occur.&lt;/p&gt; &lt;p&gt;If you don&#39;t specify a value for this parameter, Amazon Pinpoint does the following:&lt;/p&gt; &lt;ul&gt;&lt;li&gt;&lt;p&gt;For a get operation, retrieves information about the active version of the template.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For an update operation, saves the updates to (overwrites) the latest existing version of the template, if the create-new-version parameter isn&#39;t used or is set to false.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;For a delete operation, deletes the template, including all versions of the template.&lt;/p&gt;&lt;/li&gt;&lt;/ul&gt; | [optional] 

### Return type

[**UpdateVoiceTemplateResponse**](UpdateVoiceTemplateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_otp_message**
> VerifyOTPMessageResponse verify_otp_message(application_id, verify_otp_message_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Verify an OTP

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.verify_otp_message_request import VerifyOTPMessageRequest
from openapi_client.models.verify_otp_message_response import VerifyOTPMessageResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://pinpoint.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://pinpoint.us-east-1.amazonaws.com"
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
    application_id = 'application_id_example' # str | The unique ID of your Amazon Pinpoint application.
    verify_otp_message_request = openapi_client.VerifyOTPMessageRequest() # VerifyOTPMessageRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.verify_otp_message(application_id, verify_otp_message_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->verify_otp_message:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->verify_otp_message: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application_id** | **str**| The unique ID of your Amazon Pinpoint application. | 
 **verify_otp_message_request** | [**VerifyOTPMessageRequest**](VerifyOTPMessageRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**VerifyOTPMessageResponse**](VerifyOTPMessageResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | BadRequestException |  -  |
**481** | InternalServerErrorException |  -  |
**482** | PayloadTooLargeException |  -  |
**483** | ForbiddenException |  -  |
**484** | NotFoundException |  -  |
**485** | MethodNotAllowedException |  -  |
**486** | TooManyRequestsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

