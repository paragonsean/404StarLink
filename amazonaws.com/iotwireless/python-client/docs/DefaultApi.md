# openapi_client.DefaultApi

All URIs are relative to *http://api.iotwireless.us-east-1.amazonaws.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associate_aws_account_with_partner_account**](DefaultApi.md#associate_aws_account_with_partner_account) | **POST** /partner-accounts | 
[**associate_multicast_group_with_fuota_task**](DefaultApi.md#associate_multicast_group_with_fuota_task) | **PUT** /fuota-tasks/{Id}/multicast-group | 
[**associate_wireless_device_with_fuota_task**](DefaultApi.md#associate_wireless_device_with_fuota_task) | **PUT** /fuota-tasks/{Id}/wireless-device | 
[**associate_wireless_device_with_multicast_group**](DefaultApi.md#associate_wireless_device_with_multicast_group) | **PUT** /multicast-groups/{Id}/wireless-device | 
[**associate_wireless_device_with_thing**](DefaultApi.md#associate_wireless_device_with_thing) | **PUT** /wireless-devices/{Id}/thing | 
[**associate_wireless_gateway_with_certificate**](DefaultApi.md#associate_wireless_gateway_with_certificate) | **PUT** /wireless-gateways/{Id}/certificate | 
[**associate_wireless_gateway_with_thing**](DefaultApi.md#associate_wireless_gateway_with_thing) | **PUT** /wireless-gateways/{Id}/thing | 
[**cancel_multicast_group_session**](DefaultApi.md#cancel_multicast_group_session) | **DELETE** /multicast-groups/{Id}/session | 
[**create_destination**](DefaultApi.md#create_destination) | **POST** /destinations | 
[**create_device_profile**](DefaultApi.md#create_device_profile) | **POST** /device-profiles | 
[**create_fuota_task**](DefaultApi.md#create_fuota_task) | **POST** /fuota-tasks | 
[**create_multicast_group**](DefaultApi.md#create_multicast_group) | **POST** /multicast-groups | 
[**create_network_analyzer_configuration**](DefaultApi.md#create_network_analyzer_configuration) | **POST** /network-analyzer-configurations | 
[**create_service_profile**](DefaultApi.md#create_service_profile) | **POST** /service-profiles | 
[**create_wireless_device**](DefaultApi.md#create_wireless_device) | **POST** /wireless-devices | 
[**create_wireless_gateway**](DefaultApi.md#create_wireless_gateway) | **POST** /wireless-gateways | 
[**create_wireless_gateway_task**](DefaultApi.md#create_wireless_gateway_task) | **POST** /wireless-gateways/{Id}/tasks | 
[**create_wireless_gateway_task_definition**](DefaultApi.md#create_wireless_gateway_task_definition) | **POST** /wireless-gateway-task-definitions | 
[**delete_destination**](DefaultApi.md#delete_destination) | **DELETE** /destinations/{Name} | 
[**delete_device_profile**](DefaultApi.md#delete_device_profile) | **DELETE** /device-profiles/{Id} | 
[**delete_fuota_task**](DefaultApi.md#delete_fuota_task) | **DELETE** /fuota-tasks/{Id} | 
[**delete_multicast_group**](DefaultApi.md#delete_multicast_group) | **DELETE** /multicast-groups/{Id} | 
[**delete_network_analyzer_configuration**](DefaultApi.md#delete_network_analyzer_configuration) | **DELETE** /network-analyzer-configurations/{ConfigurationName} | 
[**delete_queued_messages**](DefaultApi.md#delete_queued_messages) | **DELETE** /wireless-devices/{Id}/data#messageId | 
[**delete_service_profile**](DefaultApi.md#delete_service_profile) | **DELETE** /service-profiles/{Id} | 
[**delete_wireless_device**](DefaultApi.md#delete_wireless_device) | **DELETE** /wireless-devices/{Id} | 
[**delete_wireless_device_import_task**](DefaultApi.md#delete_wireless_device_import_task) | **DELETE** /wireless_device_import_task/{Id} | 
[**delete_wireless_gateway**](DefaultApi.md#delete_wireless_gateway) | **DELETE** /wireless-gateways/{Id} | 
[**delete_wireless_gateway_task**](DefaultApi.md#delete_wireless_gateway_task) | **DELETE** /wireless-gateways/{Id}/tasks | 
[**delete_wireless_gateway_task_definition**](DefaultApi.md#delete_wireless_gateway_task_definition) | **DELETE** /wireless-gateway-task-definitions/{Id} | 
[**deregister_wireless_device**](DefaultApi.md#deregister_wireless_device) | **PATCH** /wireless-devices/{Identifier}/deregister | 
[**disassociate_aws_account_from_partner_account**](DefaultApi.md#disassociate_aws_account_from_partner_account) | **DELETE** /partner-accounts/{PartnerAccountId}#partnerType | 
[**disassociate_multicast_group_from_fuota_task**](DefaultApi.md#disassociate_multicast_group_from_fuota_task) | **DELETE** /fuota-tasks/{Id}/multicast-groups/{MulticastGroupId} | 
[**disassociate_wireless_device_from_fuota_task**](DefaultApi.md#disassociate_wireless_device_from_fuota_task) | **DELETE** /fuota-tasks/{Id}/wireless-devices/{WirelessDeviceId} | 
[**disassociate_wireless_device_from_multicast_group**](DefaultApi.md#disassociate_wireless_device_from_multicast_group) | **DELETE** /multicast-groups/{Id}/wireless-devices/{WirelessDeviceId} | 
[**disassociate_wireless_device_from_thing**](DefaultApi.md#disassociate_wireless_device_from_thing) | **DELETE** /wireless-devices/{Id}/thing | 
[**disassociate_wireless_gateway_from_certificate**](DefaultApi.md#disassociate_wireless_gateway_from_certificate) | **DELETE** /wireless-gateways/{Id}/certificate | 
[**disassociate_wireless_gateway_from_thing**](DefaultApi.md#disassociate_wireless_gateway_from_thing) | **DELETE** /wireless-gateways/{Id}/thing | 
[**get_destination**](DefaultApi.md#get_destination) | **GET** /destinations/{Name} | 
[**get_device_profile**](DefaultApi.md#get_device_profile) | **GET** /device-profiles/{Id} | 
[**get_event_configuration_by_resource_types**](DefaultApi.md#get_event_configuration_by_resource_types) | **GET** /event-configurations-resource-types | 
[**get_fuota_task**](DefaultApi.md#get_fuota_task) | **GET** /fuota-tasks/{Id} | 
[**get_log_levels_by_resource_types**](DefaultApi.md#get_log_levels_by_resource_types) | **GET** /log-levels | 
[**get_multicast_group**](DefaultApi.md#get_multicast_group) | **GET** /multicast-groups/{Id} | 
[**get_multicast_group_session**](DefaultApi.md#get_multicast_group_session) | **GET** /multicast-groups/{Id}/session | 
[**get_network_analyzer_configuration**](DefaultApi.md#get_network_analyzer_configuration) | **GET** /network-analyzer-configurations/{ConfigurationName} | 
[**get_partner_account**](DefaultApi.md#get_partner_account) | **GET** /partner-accounts/{PartnerAccountId}#partnerType | 
[**get_position**](DefaultApi.md#get_position) | **GET** /positions/{ResourceIdentifier}#resourceType | 
[**get_position_configuration**](DefaultApi.md#get_position_configuration) | **GET** /position-configurations/{ResourceIdentifier}#resourceType | 
[**get_position_estimate**](DefaultApi.md#get_position_estimate) | **POST** /position-estimate | 
[**get_resource_event_configuration**](DefaultApi.md#get_resource_event_configuration) | **GET** /event-configurations/{Identifier}#identifierType | 
[**get_resource_log_level**](DefaultApi.md#get_resource_log_level) | **GET** /log-levels/{ResourceIdentifier}#resourceType | 
[**get_resource_position**](DefaultApi.md#get_resource_position) | **GET** /resource-positions/{ResourceIdentifier}#resourceType | 
[**get_service_endpoint**](DefaultApi.md#get_service_endpoint) | **GET** /service-endpoint | 
[**get_service_profile**](DefaultApi.md#get_service_profile) | **GET** /service-profiles/{Id} | 
[**get_wireless_device**](DefaultApi.md#get_wireless_device) | **GET** /wireless-devices/{Identifier}#identifierType | 
[**get_wireless_device_import_task**](DefaultApi.md#get_wireless_device_import_task) | **GET** /wireless_device_import_task/{Id} | 
[**get_wireless_device_statistics**](DefaultApi.md#get_wireless_device_statistics) | **GET** /wireless-devices/{Id}/statistics | 
[**get_wireless_gateway**](DefaultApi.md#get_wireless_gateway) | **GET** /wireless-gateways/{Identifier}#identifierType | 
[**get_wireless_gateway_certificate**](DefaultApi.md#get_wireless_gateway_certificate) | **GET** /wireless-gateways/{Id}/certificate | 
[**get_wireless_gateway_firmware_information**](DefaultApi.md#get_wireless_gateway_firmware_information) | **GET** /wireless-gateways/{Id}/firmware-information | 
[**get_wireless_gateway_statistics**](DefaultApi.md#get_wireless_gateway_statistics) | **GET** /wireless-gateways/{Id}/statistics | 
[**get_wireless_gateway_task**](DefaultApi.md#get_wireless_gateway_task) | **GET** /wireless-gateways/{Id}/tasks | 
[**get_wireless_gateway_task_definition**](DefaultApi.md#get_wireless_gateway_task_definition) | **GET** /wireless-gateway-task-definitions/{Id} | 
[**list_destinations**](DefaultApi.md#list_destinations) | **GET** /destinations | 
[**list_device_profiles**](DefaultApi.md#list_device_profiles) | **GET** /device-profiles | 
[**list_devices_for_wireless_device_import_task**](DefaultApi.md#list_devices_for_wireless_device_import_task) | **GET** /wireless_device_import_task#id | 
[**list_event_configurations**](DefaultApi.md#list_event_configurations) | **GET** /event-configurations#resourceType | 
[**list_fuota_tasks**](DefaultApi.md#list_fuota_tasks) | **GET** /fuota-tasks | 
[**list_multicast_groups**](DefaultApi.md#list_multicast_groups) | **GET** /multicast-groups | 
[**list_multicast_groups_by_fuota_task**](DefaultApi.md#list_multicast_groups_by_fuota_task) | **GET** /fuota-tasks/{Id}/multicast-groups | 
[**list_network_analyzer_configurations**](DefaultApi.md#list_network_analyzer_configurations) | **GET** /network-analyzer-configurations | 
[**list_partner_accounts**](DefaultApi.md#list_partner_accounts) | **GET** /partner-accounts | 
[**list_position_configurations**](DefaultApi.md#list_position_configurations) | **GET** /position-configurations | 
[**list_queued_messages**](DefaultApi.md#list_queued_messages) | **GET** /wireless-devices/{Id}/data | 
[**list_service_profiles**](DefaultApi.md#list_service_profiles) | **GET** /service-profiles | 
[**list_tags_for_resource**](DefaultApi.md#list_tags_for_resource) | **GET** /tags#resourceArn | 
[**list_wireless_device_import_tasks**](DefaultApi.md#list_wireless_device_import_tasks) | **GET** /wireless_device_import_tasks | 
[**list_wireless_devices**](DefaultApi.md#list_wireless_devices) | **GET** /wireless-devices | 
[**list_wireless_gateway_task_definitions**](DefaultApi.md#list_wireless_gateway_task_definitions) | **GET** /wireless-gateway-task-definitions | 
[**list_wireless_gateways**](DefaultApi.md#list_wireless_gateways) | **GET** /wireless-gateways | 
[**put_position_configuration**](DefaultApi.md#put_position_configuration) | **PUT** /position-configurations/{ResourceIdentifier}#resourceType | 
[**put_resource_log_level**](DefaultApi.md#put_resource_log_level) | **PUT** /log-levels/{ResourceIdentifier}#resourceType | 
[**reset_all_resource_log_levels**](DefaultApi.md#reset_all_resource_log_levels) | **DELETE** /log-levels | 
[**reset_resource_log_level**](DefaultApi.md#reset_resource_log_level) | **DELETE** /log-levels/{ResourceIdentifier}#resourceType | 
[**send_data_to_multicast_group**](DefaultApi.md#send_data_to_multicast_group) | **POST** /multicast-groups/{Id}/data | 
[**send_data_to_wireless_device**](DefaultApi.md#send_data_to_wireless_device) | **POST** /wireless-devices/{Id}/data | 
[**start_bulk_associate_wireless_device_with_multicast_group**](DefaultApi.md#start_bulk_associate_wireless_device_with_multicast_group) | **PATCH** /multicast-groups/{Id}/bulk | 
[**start_bulk_disassociate_wireless_device_from_multicast_group**](DefaultApi.md#start_bulk_disassociate_wireless_device_from_multicast_group) | **POST** /multicast-groups/{Id}/bulk | 
[**start_fuota_task**](DefaultApi.md#start_fuota_task) | **PUT** /fuota-tasks/{Id} | 
[**start_multicast_group_session**](DefaultApi.md#start_multicast_group_session) | **PUT** /multicast-groups/{Id}/session | 
[**start_single_wireless_device_import_task**](DefaultApi.md#start_single_wireless_device_import_task) | **POST** /wireless_single_device_import_task | 
[**start_wireless_device_import_task**](DefaultApi.md#start_wireless_device_import_task) | **POST** /wireless_device_import_task | 
[**tag_resource**](DefaultApi.md#tag_resource) | **POST** /tags#resourceArn | 
[**test_wireless_device**](DefaultApi.md#test_wireless_device) | **POST** /wireless-devices/{Id}/test | 
[**untag_resource**](DefaultApi.md#untag_resource) | **DELETE** /tags#resourceArn&amp;tagKeys | 
[**update_destination**](DefaultApi.md#update_destination) | **PATCH** /destinations/{Name} | 
[**update_event_configuration_by_resource_types**](DefaultApi.md#update_event_configuration_by_resource_types) | **PATCH** /event-configurations-resource-types | 
[**update_fuota_task**](DefaultApi.md#update_fuota_task) | **PATCH** /fuota-tasks/{Id} | 
[**update_log_levels_by_resource_types**](DefaultApi.md#update_log_levels_by_resource_types) | **POST** /log-levels | 
[**update_multicast_group**](DefaultApi.md#update_multicast_group) | **PATCH** /multicast-groups/{Id} | 
[**update_network_analyzer_configuration**](DefaultApi.md#update_network_analyzer_configuration) | **PATCH** /network-analyzer-configurations/{ConfigurationName} | 
[**update_partner_account**](DefaultApi.md#update_partner_account) | **PATCH** /partner-accounts/{PartnerAccountId}#partnerType | 
[**update_position**](DefaultApi.md#update_position) | **PATCH** /positions/{ResourceIdentifier}#resourceType | 
[**update_resource_event_configuration**](DefaultApi.md#update_resource_event_configuration) | **PATCH** /event-configurations/{Identifier}#identifierType | 
[**update_resource_position**](DefaultApi.md#update_resource_position) | **PATCH** /resource-positions/{ResourceIdentifier}#resourceType | 
[**update_wireless_device**](DefaultApi.md#update_wireless_device) | **PATCH** /wireless-devices/{Id} | 
[**update_wireless_device_import_task**](DefaultApi.md#update_wireless_device_import_task) | **PATCH** /wireless_device_import_task/{Id} | 
[**update_wireless_gateway**](DefaultApi.md#update_wireless_gateway) | **PATCH** /wireless-gateways/{Id} | 


# **associate_aws_account_with_partner_account**
> AssociateAwsAccountWithPartnerAccountResponse associate_aws_account_with_partner_account(associate_aws_account_with_partner_account_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associates a partner account with your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_aws_account_with_partner_account_request import AssociateAwsAccountWithPartnerAccountRequest
from openapi_client.models.associate_aws_account_with_partner_account_response import AssociateAwsAccountWithPartnerAccountResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    associate_aws_account_with_partner_account_request = openapi_client.AssociateAwsAccountWithPartnerAccountRequest() # AssociateAwsAccountWithPartnerAccountRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_aws_account_with_partner_account(associate_aws_account_with_partner_account_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_aws_account_with_partner_account:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_aws_account_with_partner_account: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associate_aws_account_with_partner_account_request** | [**AssociateAwsAccountWithPartnerAccountRequest**](AssociateAwsAccountWithPartnerAccountRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**AssociateAwsAccountWithPartnerAccountResponse**](AssociateAwsAccountWithPartnerAccountResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |
**484** | ConflictException |  -  |
**485** | AccessDeniedException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **associate_multicast_group_with_fuota_task**
> object associate_multicast_group_with_fuota_task(id, associate_multicast_group_with_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associate a multicast group with a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_multicast_group_with_fuota_task_request import AssociateMulticastGroupWithFuotaTaskRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    associate_multicast_group_with_fuota_task_request = openapi_client.AssociateMulticastGroupWithFuotaTaskRequest() # AssociateMulticastGroupWithFuotaTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_multicast_group_with_fuota_task(id, associate_multicast_group_with_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_multicast_group_with_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_multicast_group_with_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **associate_multicast_group_with_fuota_task_request** | [**AssociateMulticastGroupWithFuotaTaskRequest**](AssociateMulticastGroupWithFuotaTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **associate_wireless_device_with_fuota_task**
> object associate_wireless_device_with_fuota_task(id, associate_wireless_device_with_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associate a wireless device with a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_wireless_device_with_fuota_task_request import AssociateWirelessDeviceWithFuotaTaskRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    associate_wireless_device_with_fuota_task_request = openapi_client.AssociateWirelessDeviceWithFuotaTaskRequest() # AssociateWirelessDeviceWithFuotaTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_wireless_device_with_fuota_task(id, associate_wireless_device_with_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_wireless_device_with_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_wireless_device_with_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **associate_wireless_device_with_fuota_task_request** | [**AssociateWirelessDeviceWithFuotaTaskRequest**](AssociateWirelessDeviceWithFuotaTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **associate_wireless_device_with_multicast_group**
> object associate_wireless_device_with_multicast_group(id, associate_wireless_device_with_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associates a wireless device with a multicast group.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_wireless_device_with_fuota_task_request import AssociateWirelessDeviceWithFuotaTaskRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    associate_wireless_device_with_fuota_task_request = openapi_client.AssociateWirelessDeviceWithFuotaTaskRequest() # AssociateWirelessDeviceWithFuotaTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_wireless_device_with_multicast_group(id, associate_wireless_device_with_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_wireless_device_with_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_wireless_device_with_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **associate_wireless_device_with_fuota_task_request** | [**AssociateWirelessDeviceWithFuotaTaskRequest**](AssociateWirelessDeviceWithFuotaTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **associate_wireless_device_with_thing**
> object associate_wireless_device_with_thing(id, associate_wireless_device_with_thing_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associates a wireless device with a thing.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_wireless_device_with_thing_request import AssociateWirelessDeviceWithThingRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    associate_wireless_device_with_thing_request = openapi_client.AssociateWirelessDeviceWithThingRequest() # AssociateWirelessDeviceWithThingRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_wireless_device_with_thing(id, associate_wireless_device_with_thing_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_wireless_device_with_thing:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_wireless_device_with_thing: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **associate_wireless_device_with_thing_request** | [**AssociateWirelessDeviceWithThingRequest**](AssociateWirelessDeviceWithThingRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **associate_wireless_gateway_with_certificate**
> AssociateWirelessGatewayWithCertificateResponse associate_wireless_gateway_with_certificate(id, associate_wireless_gateway_with_certificate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associates a wireless gateway with a certificate.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_wireless_gateway_with_certificate_request import AssociateWirelessGatewayWithCertificateRequest
from openapi_client.models.associate_wireless_gateway_with_certificate_response import AssociateWirelessGatewayWithCertificateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    associate_wireless_gateway_with_certificate_request = openapi_client.AssociateWirelessGatewayWithCertificateRequest() # AssociateWirelessGatewayWithCertificateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_wireless_gateway_with_certificate(id, associate_wireless_gateway_with_certificate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_wireless_gateway_with_certificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_wireless_gateway_with_certificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **associate_wireless_gateway_with_certificate_request** | [**AssociateWirelessGatewayWithCertificateRequest**](AssociateWirelessGatewayWithCertificateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**AssociateWirelessGatewayWithCertificateResponse**](AssociateWirelessGatewayWithCertificateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **associate_wireless_gateway_with_thing**
> object associate_wireless_gateway_with_thing(id, associate_wireless_gateway_with_thing_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Associates a wireless gateway with a thing.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.associate_wireless_gateway_with_thing_request import AssociateWirelessGatewayWithThingRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    associate_wireless_gateway_with_thing_request = openapi_client.AssociateWirelessGatewayWithThingRequest() # AssociateWirelessGatewayWithThingRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.associate_wireless_gateway_with_thing(id, associate_wireless_gateway_with_thing_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->associate_wireless_gateway_with_thing:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->associate_wireless_gateway_with_thing: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **associate_wireless_gateway_with_thing_request** | [**AssociateWirelessGatewayWithThingRequest**](AssociateWirelessGatewayWithThingRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_multicast_group_session**
> object cancel_multicast_group_session(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Cancels an existing multicast group session.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.cancel_multicast_group_session(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->cancel_multicast_group_session:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->cancel_multicast_group_session: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_destination**
> CreateDestinationResponse create_destination(create_destination_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new destination that maps a device message to an AWS IoT rule.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_destination_request import CreateDestinationRequest
from openapi_client.models.create_destination_response import CreateDestinationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_destination_request = openapi_client.CreateDestinationRequest() # CreateDestinationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_destination(create_destination_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_destination:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_destination: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_destination_request** | [**CreateDestinationRequest**](CreateDestinationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateDestinationResponse**](CreateDestinationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_device_profile**
> CreateDeviceProfileResponse create_device_profile(create_device_profile_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new device profile.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_device_profile_request import CreateDeviceProfileRequest
from openapi_client.models.create_device_profile_response import CreateDeviceProfileResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_device_profile_request = openapi_client.CreateDeviceProfileRequest() # CreateDeviceProfileRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_device_profile(create_device_profile_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_device_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_device_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_device_profile_request** | [**CreateDeviceProfileRequest**](CreateDeviceProfileRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateDeviceProfileResponse**](CreateDeviceProfileResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ConflictException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_fuota_task**
> CreateFuotaTaskResponse create_fuota_task(create_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_fuota_task_request import CreateFuotaTaskRequest
from openapi_client.models.create_fuota_task_response import CreateFuotaTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_fuota_task_request = openapi_client.CreateFuotaTaskRequest() # CreateFuotaTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_fuota_task(create_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_fuota_task_request** | [**CreateFuotaTaskRequest**](CreateFuotaTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateFuotaTaskResponse**](CreateFuotaTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_multicast_group**
> CreateMulticastGroupResponse create_multicast_group(create_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a multicast group.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_multicast_group_request import CreateMulticastGroupRequest
from openapi_client.models.create_multicast_group_response import CreateMulticastGroupResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_multicast_group_request = openapi_client.CreateMulticastGroupRequest() # CreateMulticastGroupRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_multicast_group(create_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_multicast_group_request** | [**CreateMulticastGroupRequest**](CreateMulticastGroupRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateMulticastGroupResponse**](CreateMulticastGroupResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_network_analyzer_configuration**
> CreateNetworkAnalyzerConfigurationResponse create_network_analyzer_configuration(create_network_analyzer_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new network analyzer configuration.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_network_analyzer_configuration_request import CreateNetworkAnalyzerConfigurationRequest
from openapi_client.models.create_network_analyzer_configuration_response import CreateNetworkAnalyzerConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_network_analyzer_configuration_request = openapi_client.CreateNetworkAnalyzerConfigurationRequest() # CreateNetworkAnalyzerConfigurationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_network_analyzer_configuration(create_network_analyzer_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_network_analyzer_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_network_analyzer_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_network_analyzer_configuration_request** | [**CreateNetworkAnalyzerConfigurationRequest**](CreateNetworkAnalyzerConfigurationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateNetworkAnalyzerConfigurationResponse**](CreateNetworkAnalyzerConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_service_profile**
> CreateServiceProfileResponse create_service_profile(create_service_profile_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a new service profile.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_service_profile_request import CreateServiceProfileRequest
from openapi_client.models.create_service_profile_response import CreateServiceProfileResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_service_profile_request = openapi_client.CreateServiceProfileRequest() # CreateServiceProfileRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_service_profile(create_service_profile_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_service_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_service_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_service_profile_request** | [**CreateServiceProfileRequest**](CreateServiceProfileRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateServiceProfileResponse**](CreateServiceProfileResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ConflictException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_wireless_device**
> CreateWirelessDeviceResponse create_wireless_device(create_wireless_device_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Provisions a wireless device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_wireless_device_request import CreateWirelessDeviceRequest
from openapi_client.models.create_wireless_device_response import CreateWirelessDeviceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_wireless_device_request = openapi_client.CreateWirelessDeviceRequest() # CreateWirelessDeviceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_wireless_device(create_wireless_device_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_wireless_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_wireless_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_wireless_device_request** | [**CreateWirelessDeviceRequest**](CreateWirelessDeviceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateWirelessDeviceResponse**](CreateWirelessDeviceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_wireless_gateway**
> CreateWirelessGatewayResponse create_wireless_gateway(create_wireless_gateway_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Provisions a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_wireless_gateway_request import CreateWirelessGatewayRequest
from openapi_client.models.create_wireless_gateway_response import CreateWirelessGatewayResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_wireless_gateway_request = openapi_client.CreateWirelessGatewayRequest() # CreateWirelessGatewayRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_wireless_gateway(create_wireless_gateway_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_wireless_gateway:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_wireless_gateway: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_wireless_gateway_request** | [**CreateWirelessGatewayRequest**](CreateWirelessGatewayRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateWirelessGatewayResponse**](CreateWirelessGatewayResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ConflictException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_wireless_gateway_task**
> CreateWirelessGatewayTaskResponse create_wireless_gateway_task(id, create_wireless_gateway_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a task for a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_wireless_gateway_task_request import CreateWirelessGatewayTaskRequest
from openapi_client.models.create_wireless_gateway_task_response import CreateWirelessGatewayTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    create_wireless_gateway_task_request = openapi_client.CreateWirelessGatewayTaskRequest() # CreateWirelessGatewayTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_wireless_gateway_task(id, create_wireless_gateway_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_wireless_gateway_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_wireless_gateway_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **create_wireless_gateway_task_request** | [**CreateWirelessGatewayTaskRequest**](CreateWirelessGatewayTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateWirelessGatewayTaskResponse**](CreateWirelessGatewayTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_wireless_gateway_task_definition**
> CreateWirelessGatewayTaskDefinitionResponse create_wireless_gateway_task_definition(create_wireless_gateway_task_definition_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Creates a gateway task definition.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.create_wireless_gateway_task_definition_request import CreateWirelessGatewayTaskDefinitionRequest
from openapi_client.models.create_wireless_gateway_task_definition_response import CreateWirelessGatewayTaskDefinitionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    create_wireless_gateway_task_definition_request = openapi_client.CreateWirelessGatewayTaskDefinitionRequest() # CreateWirelessGatewayTaskDefinitionRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.create_wireless_gateway_task_definition(create_wireless_gateway_task_definition_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->create_wireless_gateway_task_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->create_wireless_gateway_task_definition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_wireless_gateway_task_definition_request** | [**CreateWirelessGatewayTaskDefinitionRequest**](CreateWirelessGatewayTaskDefinitionRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**CreateWirelessGatewayTaskDefinitionResponse**](CreateWirelessGatewayTaskDefinitionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_destination**
> object delete_destination(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a destination.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the resource to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_destination(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_destination:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_destination: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the resource to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_device_profile**
> object delete_device_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a device profile.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_device_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_device_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_device_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_fuota_task**
> object delete_fuota_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_fuota_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_multicast_group**
> object delete_multicast_group(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a multicast group if it is not in use by a fuota task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_multicast_group(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_network_analyzer_configuration**
> object delete_network_analyzer_configuration(configuration_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a network analyzer configuration.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    configuration_name = 'configuration_name_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_network_analyzer_configuration(configuration_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_network_analyzer_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_network_analyzer_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configuration_name** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_queued_messages**
> object delete_queued_messages(id, message_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, wireless_device_type=wireless_device_type)



Remove queued messages from the downlink queue.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of a given wireless device for which downlink messages will be deleted.
    message_id = 'message_id_example' # str | If message ID is <code>\"*\"</code>, it cleares the entire downlink queue for a given device, specified by the wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    wireless_device_type = 'wireless_device_type_example' # str | The wireless device type, which can be either Sidewalk or LoRaWAN. (optional)

    try:
        api_response = api_instance.delete_queued_messages(id, message_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, wireless_device_type=wireless_device_type)
        print("The response of DefaultApi->delete_queued_messages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_queued_messages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of a given wireless device for which downlink messages will be deleted. | 
 **message_id** | **str**| If message ID is &lt;code&gt;\&quot;*\&quot;&lt;/code&gt;, it cleares the entire downlink queue for a given device, specified by the wireless device ID. Otherwise, the downlink message with the specified message ID will be deleted. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **wireless_device_type** | **str**| The wireless device type, which can be either Sidewalk or LoRaWAN. | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | ThrottlingException |  -  |
**483** | InternalServerException |  -  |
**484** | AccessDeniedException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_service_profile**
> object delete_service_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a service profile.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_service_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_service_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_service_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_wireless_device**
> object delete_wireless_device(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a wireless device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_wireless_device(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_wireless_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_wireless_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_wireless_device_import_task**
> object delete_wireless_device_import_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Delete an import task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The unique identifier of the import task to be deleted.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_wireless_device_import_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_wireless_device_import_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_wireless_device_import_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The unique identifier of the import task to be deleted. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_wireless_gateway**
> object delete_wireless_gateway(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_wireless_gateway(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_wireless_gateway:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_wireless_gateway: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_wireless_gateway_task**
> object delete_wireless_gateway_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a wireless gateway task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_wireless_gateway_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_wireless_gateway_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_wireless_gateway_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_wireless_gateway_task_definition**
> object delete_wireless_gateway_task_definition(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Deletes a wireless gateway task definition. Deleting this task definition does not affect tasks that are currently in progress.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to delete.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.delete_wireless_gateway_task_definition(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->delete_wireless_gateway_task_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->delete_wireless_gateway_task_definition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to delete. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deregister_wireless_device**
> object deregister_wireless_device(identifier, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, wireless_device_type=wireless_device_type)



Deregister a wireless device from AWS IoT Wireless.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    identifier = 'identifier_example' # str | The identifier of the wireless device to deregister from AWS IoT Wireless.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    wireless_device_type = 'wireless_device_type_example' # str | The type of wireless device to deregister from AWS IoT Wireless, which can be <code>LoRaWAN</code> or <code>Sidewalk</code>. (optional)

    try:
        api_response = api_instance.deregister_wireless_device(identifier, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, wireless_device_type=wireless_device_type)
        print("The response of DefaultApi->deregister_wireless_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->deregister_wireless_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| The identifier of the wireless device to deregister from AWS IoT Wireless. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **wireless_device_type** | **str**| The type of wireless device to deregister from AWS IoT Wireless, which can be &lt;code&gt;LoRaWAN&lt;/code&gt; or &lt;code&gt;Sidewalk&lt;/code&gt;. | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_aws_account_from_partner_account**
> object disassociate_aws_account_from_partner_account(partner_account_id, partner_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates your AWS account from a partner account. If <code>PartnerAccountId</code> and <code>PartnerType</code> are <code>null</code>, disassociates your AWS account from all partner accounts.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    partner_account_id = 'partner_account_id_example' # str | The partner account ID to disassociate from the AWS account.
    partner_type = 'partner_type_example' # str | The partner type.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_aws_account_from_partner_account(partner_account_id, partner_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_aws_account_from_partner_account:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_aws_account_from_partner_account: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partner_account_id** | **str**| The partner account ID to disassociate from the AWS account. | 
 **partner_type** | **str**| The partner type. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_multicast_group_from_fuota_task**
> object disassociate_multicast_group_from_fuota_task(id, multicast_group_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates a multicast group from a fuota task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    multicast_group_id = 'multicast_group_id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_multicast_group_from_fuota_task(id, multicast_group_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_multicast_group_from_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_multicast_group_from_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **multicast_group_id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_wireless_device_from_fuota_task**
> object disassociate_wireless_device_from_fuota_task(id, wireless_device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates a wireless device from a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    wireless_device_id = 'wireless_device_id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_wireless_device_from_fuota_task(id, wireless_device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_wireless_device_from_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_wireless_device_from_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **wireless_device_id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_wireless_device_from_multicast_group**
> object disassociate_wireless_device_from_multicast_group(id, wireless_device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates a wireless device from a multicast group.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    wireless_device_id = 'wireless_device_id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_wireless_device_from_multicast_group(id, wireless_device_id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_wireless_device_from_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_wireless_device_from_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **wireless_device_id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_wireless_device_from_thing**
> object disassociate_wireless_device_from_thing(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates a wireless device from its currently associated thing.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_wireless_device_from_thing(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_wireless_device_from_thing:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_wireless_device_from_thing: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_wireless_gateway_from_certificate**
> object disassociate_wireless_gateway_from_certificate(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates a wireless gateway from its currently associated certificate.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_wireless_gateway_from_certificate(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_wireless_gateway_from_certificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_wireless_gateway_from_certificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **disassociate_wireless_gateway_from_thing**
> object disassociate_wireless_gateway_from_thing(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Disassociates a wireless gateway from its currently associated thing.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.disassociate_wireless_gateway_from_thing(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->disassociate_wireless_gateway_from_thing:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->disassociate_wireless_gateway_from_thing: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_destination**
> GetDestinationResponse get_destination(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a destination.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_destination_response import GetDestinationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The name of the resource to get.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_destination(name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_destination:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_destination: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The name of the resource to get. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetDestinationResponse**](GetDestinationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_device_profile**
> GetDeviceProfileResponse get_device_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a device profile.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_device_profile_response import GetDeviceProfileResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to get.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_device_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_device_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_device_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to get. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetDeviceProfileResponse**](GetDeviceProfileResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_event_configuration_by_resource_types**
> GetEventConfigurationByResourceTypesResponse get_event_configuration_by_resource_types(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Get the event configuration based on resource types.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_event_configuration_by_resource_types_response import GetEventConfigurationByResourceTypesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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

    try:
        api_response = api_instance.get_event_configuration_by_resource_types(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_event_configuration_by_resource_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_event_configuration_by_resource_types: %s\n" % e)
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

### Return type

[**GetEventConfigurationByResourceTypesResponse**](GetEventConfigurationByResourceTypesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | AccessDeniedException |  -  |
**481** | ThrottlingException |  -  |
**482** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fuota_task**
> GetFuotaTaskResponse get_fuota_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_fuota_task_response import GetFuotaTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_fuota_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetFuotaTaskResponse**](GetFuotaTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_log_levels_by_resource_types**
> GetLogLevelsByResourceTypesResponse get_log_levels_by_resource_types(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Returns current default log levels or log levels by resource types. Based on resource types, log levels can be for wireless device log options or wireless gateway log options.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_log_levels_by_resource_types_response import GetLogLevelsByResourceTypesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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

    try:
        api_response = api_instance.get_log_levels_by_resource_types(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_log_levels_by_resource_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_log_levels_by_resource_types: %s\n" % e)
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

### Return type

[**GetLogLevelsByResourceTypesResponse**](GetLogLevelsByResourceTypesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | AccessDeniedException |  -  |
**481** | InternalServerException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | ValidationException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_multicast_group**
> GetMulticastGroupResponse get_multicast_group(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a multicast group.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_multicast_group_response import GetMulticastGroupResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_multicast_group(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetMulticastGroupResponse**](GetMulticastGroupResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_multicast_group_session**
> GetMulticastGroupSessionResponse get_multicast_group_session(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a multicast group session.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_multicast_group_session_response import GetMulticastGroupSessionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_multicast_group_session(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_multicast_group_session:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_multicast_group_session: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetMulticastGroupSessionResponse**](GetMulticastGroupSessionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_network_analyzer_configuration**
> GetNetworkAnalyzerConfigurationResponse get_network_analyzer_configuration(configuration_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Get network analyzer configuration.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_network_analyzer_configuration_response import GetNetworkAnalyzerConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    configuration_name = 'configuration_name_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_network_analyzer_configuration(configuration_name, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_network_analyzer_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_network_analyzer_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configuration_name** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetNetworkAnalyzerConfigurationResponse**](GetNetworkAnalyzerConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_partner_account**
> GetPartnerAccountResponse get_partner_account(partner_account_id, partner_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a partner account. If <code>PartnerAccountId</code> and <code>PartnerType</code> are <code>null</code>, returns all partner accounts.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_partner_account_response import GetPartnerAccountResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    partner_account_id = 'partner_account_id_example' # str | The partner account ID to disassociate from the AWS account.
    partner_type = 'partner_type_example' # str | The partner type.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_partner_account(partner_account_id, partner_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_partner_account:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_partner_account: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partner_account_id** | **str**| The partner account ID to disassociate from the AWS account. | 
 **partner_type** | **str**| The partner type. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetPartnerAccountResponse**](GetPartnerAccountResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_position**
> GetPositionResponse get_position(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Get the position information for a given resource.</p> <important> <p>This action is no longer supported. Calls to retrieve the position information should use the <a href=\"https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html\">GetResourcePosition</a> API operation instead.</p> </important>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_position_response import GetPositionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | Resource identifier used to retrieve the position information.
    resource_type = 'resource_type_example' # str | Resource type of the resource for which position information is retrieved.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_position(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_position:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_position: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**| Resource identifier used to retrieve the position information. | 
 **resource_type** | **str**| Resource type of the resource for which position information is retrieved. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetPositionResponse**](GetPositionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_position_configuration**
> GetPositionConfigurationResponse get_position_configuration(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Get position configuration for a given resource.</p> <important> <p>This action is no longer supported. Calls to retrieve the position configuration should use the <a href=\"https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html\">GetResourcePosition</a> API operation instead.</p> </important>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_position_configuration_response import GetPositionConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | Resource identifier used in a position configuration.
    resource_type = 'resource_type_example' # str | Resource type of the resource for which position configuration is retrieved.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_position_configuration(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_position_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_position_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**| Resource identifier used in a position configuration. | 
 **resource_type** | **str**| Resource type of the resource for which position configuration is retrieved. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetPositionConfigurationResponse**](GetPositionConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_position_estimate**
> GetPositionEstimateResponse get_position_estimate(get_position_estimate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Get estimated position information as a payload in GeoJSON format. The payload measurement data is resolved using solvers that are provided by third-party vendors.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_position_estimate_request import GetPositionEstimateRequest
from openapi_client.models.get_position_estimate_response import GetPositionEstimateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    get_position_estimate_request = openapi_client.GetPositionEstimateRequest() # GetPositionEstimateRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_position_estimate(get_position_estimate_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_position_estimate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_position_estimate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_position_estimate_request** | [**GetPositionEstimateRequest**](GetPositionEstimateRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetPositionEstimateResponse**](GetPositionEstimateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_event_configuration**
> GetResourceEventConfigurationResponse get_resource_event_configuration(identifier, identifier_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, partner_type=partner_type)



Get the event configuration for a particular resource identifier.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_resource_event_configuration_response import GetResourceEventConfigurationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    identifier = 'identifier_example' # str | Resource identifier to opt in for event messaging.
    identifier_type = 'identifier_type_example' # str | Identifier type of the particular resource identifier for event configuration.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    partner_type = 'partner_type_example' # str | Partner type of the resource if the identifier type is <code>PartnerAccountId</code>. (optional)

    try:
        api_response = api_instance.get_resource_event_configuration(identifier, identifier_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, partner_type=partner_type)
        print("The response of DefaultApi->get_resource_event_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_resource_event_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Resource identifier to opt in for event messaging. | 
 **identifier_type** | **str**| Identifier type of the particular resource identifier for event configuration. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **partner_type** | **str**| Partner type of the resource if the identifier type is &lt;code&gt;PartnerAccountId&lt;/code&gt;. | [optional] 

### Return type

[**GetResourceEventConfigurationResponse**](GetResourceEventConfigurationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ThrottlingException |  -  |
**483** | ResourceNotFoundException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_log_level**
> GetResourceLogLevelResponse get_resource_log_level(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Fetches the log-level override, if any, for a given resource-ID and resource-type. It can be used for a wireless device or a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_resource_log_level_response import GetResourceLogLevelResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | 
    resource_type = 'resource_type_example' # str | The type of the resource, which can be <code>WirelessDevice</code> or <code>WirelessGateway</code>.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_resource_log_level(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_resource_log_level:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_resource_log_level: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**|  | 
 **resource_type** | **str**| The type of the resource, which can be &lt;code&gt;WirelessDevice&lt;/code&gt; or &lt;code&gt;WirelessGateway&lt;/code&gt;. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetResourceLogLevelResponse**](GetResourceLogLevelResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | AccessDeniedException |  -  |
**481** | InternalServerException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | ValidationException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_position**
> GetResourcePositionResponse get_resource_position(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Get the position information for a given wireless device or a wireless gateway resource. The position information uses the <a href=\"https://gisgeography.com/wgs84-world-geodetic-system/\"> World Geodetic System (WGS84)</a>.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_resource_position_response import GetResourcePositionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | The identifier of the resource for which position information is retrieved. It can be the wireless device ID or the wireless gateway ID, depending on the resource type.
    resource_type = 'resource_type_example' # str | The type of resource for which position information is retrieved, which can be a wireless device or a wireless gateway.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_resource_position(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_resource_position:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_resource_position: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**| The identifier of the resource for which position information is retrieved. It can be the wireless device ID or the wireless gateway ID, depending on the resource type. | 
 **resource_type** | **str**| The type of resource for which position information is retrieved, which can be a wireless device or a wireless gateway. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetResourcePositionResponse**](GetResourcePositionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_service_endpoint**
> GetServiceEndpointResponse get_service_endpoint(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, service_type=service_type)



Gets the account-specific endpoint for Configuration and Update Server (CUPS) protocol or LoRaWAN Network Server (LNS) connections.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_service_endpoint_response import GetServiceEndpointResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    service_type = 'service_type_example' # str | The service type for which to get endpoint information about. Can be <code>CUPS</code> for the Configuration and Update Server endpoint, or <code>LNS</code> for the LoRaWAN Network Server endpoint or <code>CLAIM</code> for the global endpoint. (optional)

    try:
        api_response = api_instance.get_service_endpoint(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, service_type=service_type)
        print("The response of DefaultApi->get_service_endpoint:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_service_endpoint: %s\n" % e)
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
 **service_type** | **str**| The service type for which to get endpoint information about. Can be &lt;code&gt;CUPS&lt;/code&gt; for the Configuration and Update Server endpoint, or &lt;code&gt;LNS&lt;/code&gt; for the LoRaWAN Network Server endpoint or &lt;code&gt;CLAIM&lt;/code&gt; for the global endpoint. | [optional] 

### Return type

[**GetServiceEndpointResponse**](GetServiceEndpointResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_service_profile**
> GetServiceProfileResponse get_service_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a service profile.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_service_profile_response import GetServiceProfileResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to get.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_service_profile(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_service_profile:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_service_profile: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to get. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetServiceProfileResponse**](GetServiceProfileResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_device**
> GetWirelessDeviceResponse get_wireless_device(identifier, identifier_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a wireless device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_device_response import GetWirelessDeviceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    identifier = 'identifier_example' # str | The identifier of the wireless device to get.
    identifier_type = 'identifier_type_example' # str | The type of identifier used in <code>identifier</code>.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_device(identifier, identifier_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| The identifier of the wireless device to get. | 
 **identifier_type** | **str**| The type of identifier used in &lt;code&gt;identifier&lt;/code&gt;. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessDeviceResponse**](GetWirelessDeviceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_device_import_task**
> GetWirelessDeviceImportTaskResponse get_wireless_device_import_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Get information about an import task and count of device onboarding summary information for the import task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_device_import_task_response import GetWirelessDeviceImportTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The identifier of the import task for which information is requested.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_device_import_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_device_import_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_device_import_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The identifier of the import task for which information is requested. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessDeviceImportTaskResponse**](GetWirelessDeviceImportTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_device_statistics**
> GetWirelessDeviceStatisticsResponse get_wireless_device_statistics(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets operating information about a wireless device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_device_statistics_response import GetWirelessDeviceStatisticsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the wireless device for which to get the data.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_device_statistics(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_device_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_device_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the wireless device for which to get the data. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessDeviceStatisticsResponse**](GetWirelessDeviceStatisticsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_gateway**
> GetWirelessGatewayResponse get_wireless_gateway(identifier, identifier_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_gateway_response import GetWirelessGatewayResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    identifier = 'identifier_example' # str | The identifier of the wireless gateway to get.
    identifier_type = 'identifier_type_example' # str | The type of identifier used in <code>identifier</code>.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_gateway(identifier, identifier_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_gateway:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_gateway: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| The identifier of the wireless gateway to get. | 
 **identifier_type** | **str**| The type of identifier used in &lt;code&gt;identifier&lt;/code&gt;. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessGatewayResponse**](GetWirelessGatewayResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_gateway_certificate**
> GetWirelessGatewayCertificateResponse get_wireless_gateway_certificate(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets the ID of the certificate that is currently associated with a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_gateway_certificate_response import GetWirelessGatewayCertificateResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to get.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_gateway_certificate(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_gateway_certificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_gateway_certificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to get. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessGatewayCertificateResponse**](GetWirelessGatewayCertificateResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_gateway_firmware_information**
> GetWirelessGatewayFirmwareInformationResponse get_wireless_gateway_firmware_information(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets the firmware version and other information about a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_gateway_firmware_information_response import GetWirelessGatewayFirmwareInformationResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to get.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_gateway_firmware_information(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_gateway_firmware_information:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_gateway_firmware_information: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to get. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessGatewayFirmwareInformationResponse**](GetWirelessGatewayFirmwareInformationResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_gateway_statistics**
> GetWirelessGatewayStatisticsResponse get_wireless_gateway_statistics(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets operating information about a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_gateway_statistics_response import GetWirelessGatewayStatisticsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the wireless gateway for which to get the data.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_gateway_statistics(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_gateway_statistics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_gateway_statistics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the wireless gateway for which to get the data. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessGatewayStatisticsResponse**](GetWirelessGatewayStatisticsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_gateway_task**
> GetWirelessGatewayTaskResponse get_wireless_gateway_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a wireless gateway task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_gateway_task_response import GetWirelessGatewayTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to get.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_gateway_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_gateway_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_gateway_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to get. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessGatewayTaskResponse**](GetWirelessGatewayTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_wireless_gateway_task_definition**
> GetWirelessGatewayTaskDefinitionResponse get_wireless_gateway_task_definition(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Gets information about a wireless gateway task definition.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.get_wireless_gateway_task_definition_response import GetWirelessGatewayTaskDefinitionResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to get.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.get_wireless_gateway_task_definition(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->get_wireless_gateway_task_definition:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_wireless_gateway_task_definition: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to get. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**GetWirelessGatewayTaskDefinitionResponse**](GetWirelessGatewayTaskDefinitionResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_destinations**
> ListDestinationsResponse list_destinations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, max_results2=max_results2, next_token2=next_token2)



Lists the destinations registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_destinations_response import ListDestinationsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_destinations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_destinations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_destinations: %s\n" % e)
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
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListDestinationsResponse**](ListDestinationsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_device_profiles**
> ListDeviceProfilesResponse list_device_profiles(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, device_profile_type=device_profile_type, max_results2=max_results2, next_token2=next_token2)



Lists the device profiles registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_device_profiles_response import ListDeviceProfilesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)
    device_profile_type = 'device_profile_type_example' # str | A filter to list only device profiles that use this type, which can be <code>LoRaWAN</code> or <code>Sidewalk</code>. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_device_profiles(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, device_profile_type=device_profile_type, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_device_profiles:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_device_profiles: %s\n" % e)
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
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 
 **device_profile_type** | **str**| A filter to list only device profiles that use this type, which can be &lt;code&gt;LoRaWAN&lt;/code&gt; or &lt;code&gt;Sidewalk&lt;/code&gt;. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListDeviceProfilesResponse**](ListDeviceProfilesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_devices_for_wireless_device_import_task**
> ListDevicesForWirelessDeviceImportTaskResponse list_devices_for_wireless_device_import_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, status=status)



List the Sidewalk devices in an import task and their onboarding status.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_devices_for_wireless_device_import_task_response import ListDevicesForWirelessDeviceImportTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The identifier of the import task for which wireless devices are listed.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 56 # int |  (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <code>null</code> to receive the first set of results. (optional)
    status = 'status_example' # str | The status of the devices in the import task. (optional)

    try:
        api_response = api_instance.list_devices_for_wireless_device_import_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, status=status)
        print("The response of DefaultApi->list_devices_for_wireless_device_import_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_devices_for_wireless_device_import_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The identifier of the import task for which wireless devices are listed. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **int**|  | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;code&gt;null&lt;/code&gt; to receive the first set of results. | [optional] 
 **status** | **str**| The status of the devices in the import task. | [optional] 

### Return type

[**ListDevicesForWirelessDeviceImportTaskResponse**](ListDevicesForWirelessDeviceImportTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_event_configurations**
> ListEventConfigurationsResponse list_event_configurations(resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



List event configurations where at least one event topic has been enabled.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_event_configurations_response import ListEventConfigurationsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_type = 'resource_type_example' # str | Resource type to filter event configurations.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    max_results = 56 # int |  (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)

    try:
        api_response = api_instance.list_event_configurations(resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->list_event_configurations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_event_configurations: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_type** | **str**| Resource type to filter event configurations. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **max_results** | **int**|  | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 

### Return type

[**ListEventConfigurationsResponse**](ListEventConfigurationsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ThrottlingException |  -  |
**483** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_fuota_tasks**
> ListFuotaTasksResponse list_fuota_tasks(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)



Lists the FUOTA tasks registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_fuota_tasks_response import ListFuotaTasksResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int |  (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_fuota_tasks(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_fuota_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_fuota_tasks: %s\n" % e)
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
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**|  | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListFuotaTasksResponse**](ListFuotaTasksResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_multicast_groups**
> ListMulticastGroupsResponse list_multicast_groups(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)



Lists the multicast groups registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_multicast_groups_response import ListMulticastGroupsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int |  (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_multicast_groups(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_multicast_groups:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_multicast_groups: %s\n" % e)
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
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**|  | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListMulticastGroupsResponse**](ListMulticastGroupsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_multicast_groups_by_fuota_task**
> ListMulticastGroupsByFuotaTaskResponse list_multicast_groups_by_fuota_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)



List all multicast groups associated with a fuota task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_multicast_groups_by_fuota_task_response import ListMulticastGroupsByFuotaTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int |  (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_multicast_groups_by_fuota_task(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_multicast_groups_by_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_multicast_groups_by_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**|  | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListMulticastGroupsByFuotaTaskResponse**](ListMulticastGroupsByFuotaTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ResourceNotFoundException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_network_analyzer_configurations**
> ListNetworkAnalyzerConfigurationsResponse list_network_analyzer_configurations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, max_results2=max_results2, next_token2=next_token2)



Lists the network analyzer configurations.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_network_analyzer_configurations_response import ListNetworkAnalyzerConfigurationsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    max_results = 56 # int |  (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_network_analyzer_configurations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_network_analyzer_configurations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_network_analyzer_configurations: %s\n" % e)
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
 **max_results** | **int**|  | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListNetworkAnalyzerConfigurationsResponse**](ListNetworkAnalyzerConfigurationsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_partner_accounts**
> ListPartnerAccountsResponse list_partner_accounts(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results)



Lists the partner accounts associated with your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_partner_accounts_response import ListPartnerAccountsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)

    try:
        api_response = api_instance.list_partner_accounts(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results)
        print("The response of DefaultApi->list_partner_accounts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_partner_accounts: %s\n" % e)
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
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 

### Return type

[**ListPartnerAccountsResponse**](ListPartnerAccountsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_position_configurations**
> ListPositionConfigurationsResponse list_position_configurations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, resource_type=resource_type, max_results=max_results, next_token=next_token, max_results2=max_results2, next_token2=next_token2)



<p>List position configurations for a given resource, such as positioning solvers.</p> <important> <p>This action is no longer supported. Calls to retrieve position information should use the <a href=\"https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_GetResourcePosition.html\">GetResourcePosition</a> API operation instead.</p> </important>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_position_configurations_response import ListPositionConfigurationsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_type = 'resource_type_example' # str | Resource type for which position configurations are listed. (optional)
    max_results = 56 # int |  (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_position_configurations(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, resource_type=resource_type, max_results=max_results, next_token=next_token, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_position_configurations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_position_configurations: %s\n" % e)
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
 **resource_type** | **str**| Resource type for which position configurations are listed. | [optional] 
 **max_results** | **int**|  | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListPositionConfigurationsResponse**](ListPositionConfigurationsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ThrottlingException |  -  |
**483** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_queued_messages**
> ListQueuedMessagesResponse list_queued_messages(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, wireless_device_type=wireless_device_type, max_results2=max_results2, next_token2=next_token2)



List queued messages in the downlink queue.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_queued_messages_response import ListQueuedMessagesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of a given wireless device which the downlink message packets are being sent.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)
    wireless_device_type = 'wireless_device_type_example' # str | The wireless device type, whic can be either Sidewalk or LoRaWAN. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_queued_messages(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, wireless_device_type=wireless_device_type, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_queued_messages:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_queued_messages: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of a given wireless device which the downlink message packets are being sent. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 
 **wireless_device_type** | **str**| The wireless device type, whic can be either Sidewalk or LoRaWAN. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListQueuedMessagesResponse**](ListQueuedMessagesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |
**484** | AccessDeniedException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_service_profiles**
> ListServiceProfilesResponse list_service_profiles(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)



Lists the service profiles registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_service_profiles_response import ListServiceProfilesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_service_profiles(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_service_profiles:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_service_profiles: %s\n" % e)
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
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListServiceProfilesResponse**](ListServiceProfilesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_tags_for_resource**
> ListTagsForResourceResponse list_tags_for_resource(resource_arn, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Lists the tags (metadata) you have assigned to the resource.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_tags_for_resource_response import ListTagsForResourceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_arn = 'resource_arn_example' # str | The ARN of the resource for which you want to list tags.
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
 **resource_arn** | **str**| The ARN of the resource for which you want to list tags. | 
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
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | ConflictException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_wireless_device_import_tasks**
> ListWirelessDeviceImportTasksResponse list_wireless_device_import_tasks(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)



List wireless devices that have been added to an import task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_wireless_device_import_tasks_response import ListWirelessDeviceImportTasksResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    max_results = 56 # int |  (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <code>null</code> to receive the first set of results. (optional)

    try:
        api_response = api_instance.list_wireless_device_import_tasks(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token)
        print("The response of DefaultApi->list_wireless_device_import_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_wireless_device_import_tasks: %s\n" % e)
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
 **max_results** | **int**|  | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;code&gt;null&lt;/code&gt; to receive the first set of results. | [optional] 

### Return type

[**ListWirelessDeviceImportTasksResponse**](ListWirelessDeviceImportTasksResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_wireless_devices**
> ListWirelessDevicesResponse list_wireless_devices(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, destination_name=destination_name, device_profile_id=device_profile_id, service_profile_id=service_profile_id, wireless_device_type=wireless_device_type, fuota_task_id=fuota_task_id, multicast_group_id=multicast_group_id, max_results2=max_results2, next_token2=next_token2)



Lists the wireless devices registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_wireless_devices_response import ListWirelessDevicesResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    destination_name = 'destination_name_example' # str | A filter to list only the wireless devices that use this destination. (optional)
    device_profile_id = 'device_profile_id_example' # str | A filter to list only the wireless devices that use this device profile. (optional)
    service_profile_id = 'service_profile_id_example' # str | A filter to list only the wireless devices that use this service profile. (optional)
    wireless_device_type = 'wireless_device_type_example' # str | A filter to list only the wireless devices that use this wireless device type. (optional)
    fuota_task_id = 'fuota_task_id_example' # str |  (optional)
    multicast_group_id = 'multicast_group_id_example' # str |  (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_wireless_devices(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, destination_name=destination_name, device_profile_id=device_profile_id, service_profile_id=service_profile_id, wireless_device_type=wireless_device_type, fuota_task_id=fuota_task_id, multicast_group_id=multicast_group_id, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_wireless_devices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_wireless_devices: %s\n" % e)
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
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **destination_name** | **str**| A filter to list only the wireless devices that use this destination. | [optional] 
 **device_profile_id** | **str**| A filter to list only the wireless devices that use this device profile. | [optional] 
 **service_profile_id** | **str**| A filter to list only the wireless devices that use this service profile. | [optional] 
 **wireless_device_type** | **str**| A filter to list only the wireless devices that use this wireless device type. | [optional] 
 **fuota_task_id** | **str**|  | [optional] 
 **multicast_group_id** | **str**|  | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListWirelessDevicesResponse**](ListWirelessDevicesResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | InternalServerException |  -  |
**482** | ThrottlingException |  -  |
**483** | AccessDeniedException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_wireless_gateway_task_definitions**
> ListWirelessGatewayTaskDefinitionsResponse list_wireless_gateway_task_definitions(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, task_definition_type=task_definition_type)



List the wireless gateway tasks definitions registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_wireless_gateway_task_definitions_response import ListWirelessGatewayTaskDefinitionsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    task_definition_type = 'task_definition_type_example' # str | A filter to list only the wireless gateway task definitions that use this task definition type. (optional)

    try:
        api_response = api_instance.list_wireless_gateway_task_definitions(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, max_results=max_results, next_token=next_token, task_definition_type=task_definition_type)
        print("The response of DefaultApi->list_wireless_gateway_task_definitions:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_wireless_gateway_task_definitions: %s\n" % e)
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
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **task_definition_type** | **str**| A filter to list only the wireless gateway task definitions that use this task definition type. | [optional] 

### Return type

[**ListWirelessGatewayTaskDefinitionsResponse**](ListWirelessGatewayTaskDefinitionsResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_wireless_gateways**
> ListWirelessGatewaysResponse list_wireless_gateways(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)



Lists the wireless gateways registered to your AWS account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.list_wireless_gateways_response import ListWirelessGatewaysResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    next_token = 'next_token_example' # str | To retrieve the next set of results, the <code>nextToken</code> value from a previous response; otherwise <b>null</b> to receive the first set of results. (optional)
    max_results = 56 # int | The maximum number of results to return in this operation. (optional)
    max_results2 = 'max_results_example' # str | Pagination limit (optional)
    next_token2 = 'next_token_example' # str | Pagination token (optional)

    try:
        api_response = api_instance.list_wireless_gateways(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, next_token=next_token, max_results=max_results, max_results2=max_results2, next_token2=next_token2)
        print("The response of DefaultApi->list_wireless_gateways:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->list_wireless_gateways: %s\n" % e)
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
 **next_token** | **str**| To retrieve the next set of results, the &lt;code&gt;nextToken&lt;/code&gt; value from a previous response; otherwise &lt;b&gt;null&lt;/b&gt; to receive the first set of results. | [optional] 
 **max_results** | **int**| The maximum number of results to return in this operation. | [optional] 
 **max_results2** | **str**| Pagination limit | [optional] 
 **next_token2** | **str**| Pagination token | [optional] 

### Return type

[**ListWirelessGatewaysResponse**](ListWirelessGatewaysResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | InternalServerException |  -  |
**482** | ThrottlingException |  -  |
**483** | AccessDeniedException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_position_configuration**
> object put_position_configuration(resource_identifier, resource_type, put_position_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Put position configuration for a given resource.</p> <important> <p>This action is no longer supported. Calls to update the position configuration should use the <a href=\"https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_UpdateResourcePosition.html\">UpdateResourcePosition</a> API operation instead.</p> </important>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.put_position_configuration_request import PutPositionConfigurationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | Resource identifier used to update the position configuration.
    resource_type = 'resource_type_example' # str | Resource type of the resource for which you want to update the position configuration.
    put_position_configuration_request = openapi_client.PutPositionConfigurationRequest() # PutPositionConfigurationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.put_position_configuration(resource_identifier, resource_type, put_position_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->put_position_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->put_position_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**| Resource identifier used to update the position configuration. | 
 **resource_type** | **str**| Resource type of the resource for which you want to update the position configuration. | 
 **put_position_configuration_request** | [**PutPositionConfigurationRequest**](PutPositionConfigurationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_resource_log_level**
> object put_resource_log_level(resource_identifier, resource_type, put_resource_log_level_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Sets the log-level override for a resource-ID and resource-type. This option can be specified for a wireless gateway or a wireless device. A limit of 200 log level override can be set per account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.put_resource_log_level_request import PutResourceLogLevelRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | 
    resource_type = 'resource_type_example' # str | The type of the resource, which can be <code>WirelessDevice</code> or <code>WirelessGateway</code>.
    put_resource_log_level_request = openapi_client.PutResourceLogLevelRequest() # PutResourceLogLevelRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.put_resource_log_level(resource_identifier, resource_type, put_resource_log_level_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->put_resource_log_level:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->put_resource_log_level: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**|  | 
 **resource_type** | **str**| The type of the resource, which can be &lt;code&gt;WirelessDevice&lt;/code&gt; or &lt;code&gt;WirelessGateway&lt;/code&gt;. | 
 **put_resource_log_level_request** | [**PutResourceLogLevelRequest**](PutResourceLogLevelRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | AccessDeniedException |  -  |
**481** | InternalServerException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | ValidationException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_all_resource_log_levels**
> object reset_all_resource_log_levels(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Removes the log-level overrides for all resources; both wireless devices and wireless gateways.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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

    try:
        api_response = api_instance.reset_all_resource_log_levels(x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->reset_all_resource_log_levels:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->reset_all_resource_log_levels: %s\n" % e)
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

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | AccessDeniedException |  -  |
**481** | InternalServerException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | ValidationException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_resource_log_level**
> object reset_resource_log_level(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Removes the log-level override, if any, for a specific resource-ID and resource-type. It can be used for a wireless device or a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | 
    resource_type = 'resource_type_example' # str | The type of the resource, which can be <code>WirelessDevice</code> or <code>WirelessGateway</code>.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.reset_resource_log_level(resource_identifier, resource_type, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->reset_resource_log_level:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->reset_resource_log_level: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**|  | 
 **resource_type** | **str**| The type of the resource, which can be &lt;code&gt;WirelessDevice&lt;/code&gt; or &lt;code&gt;WirelessGateway&lt;/code&gt;. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | AccessDeniedException |  -  |
**481** | InternalServerException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | ValidationException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_data_to_multicast_group**
> SendDataToMulticastGroupResponse send_data_to_multicast_group(id, send_data_to_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Sends the specified data to a multicast group.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.send_data_to_multicast_group_request import SendDataToMulticastGroupRequest
from openapi_client.models.send_data_to_multicast_group_response import SendDataToMulticastGroupResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    send_data_to_multicast_group_request = openapi_client.SendDataToMulticastGroupRequest() # SendDataToMulticastGroupRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.send_data_to_multicast_group(id, send_data_to_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->send_data_to_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->send_data_to_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **send_data_to_multicast_group_request** | [**SendDataToMulticastGroupRequest**](SendDataToMulticastGroupRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**SendDataToMulticastGroupResponse**](SendDataToMulticastGroupResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_data_to_wireless_device**
> SendDataToWirelessDeviceResponse send_data_to_wireless_device(id, send_data_to_wireless_device_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Sends a decrypted application data frame to a device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.send_data_to_wireless_device_request import SendDataToWirelessDeviceRequest
from openapi_client.models.send_data_to_wireless_device_response import SendDataToWirelessDeviceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the wireless device to receive the data.
    send_data_to_wireless_device_request = openapi_client.SendDataToWirelessDeviceRequest() # SendDataToWirelessDeviceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.send_data_to_wireless_device(id, send_data_to_wireless_device_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->send_data_to_wireless_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->send_data_to_wireless_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the wireless device to receive the data. | 
 **send_data_to_wireless_device_request** | [**SendDataToWirelessDeviceRequest**](SendDataToWirelessDeviceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**SendDataToWirelessDeviceResponse**](SendDataToWirelessDeviceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | ThrottlingException |  -  |
**483** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_bulk_associate_wireless_device_with_multicast_group**
> object start_bulk_associate_wireless_device_with_multicast_group(id, start_bulk_disassociate_wireless_device_from_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Starts a bulk association of all qualifying wireless devices with a multicast group.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_bulk_disassociate_wireless_device_from_multicast_group_request import StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    start_bulk_disassociate_wireless_device_from_multicast_group_request = openapi_client.StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest() # StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_bulk_associate_wireless_device_with_multicast_group(id, start_bulk_disassociate_wireless_device_from_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_bulk_associate_wireless_device_with_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_bulk_associate_wireless_device_with_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **start_bulk_disassociate_wireless_device_from_multicast_group_request** | [**StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest**](StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_bulk_disassociate_wireless_device_from_multicast_group**
> object start_bulk_disassociate_wireless_device_from_multicast_group(id, start_bulk_disassociate_wireless_device_from_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Starts a bulk disassociatin of all qualifying wireless devices from a multicast group.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_bulk_disassociate_wireless_device_from_multicast_group_request import StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    start_bulk_disassociate_wireless_device_from_multicast_group_request = openapi_client.StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest() # StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_bulk_disassociate_wireless_device_from_multicast_group(id, start_bulk_disassociate_wireless_device_from_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_bulk_disassociate_wireless_device_from_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_bulk_disassociate_wireless_device_from_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **start_bulk_disassociate_wireless_device_from_multicast_group_request** | [**StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest**](StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_fuota_task**
> object start_fuota_task(id, start_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Starts a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_fuota_task_request import StartFuotaTaskRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    start_fuota_task_request = openapi_client.StartFuotaTaskRequest() # StartFuotaTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_fuota_task(id, start_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **start_fuota_task_request** | [**StartFuotaTaskRequest**](StartFuotaTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ConflictException |  -  |
**484** | ThrottlingException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_multicast_group_session**
> object start_multicast_group_session(id, start_multicast_group_session_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Starts a multicast group session.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_multicast_group_session_request import StartMulticastGroupSessionRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    start_multicast_group_session_request = openapi_client.StartMulticastGroupSessionRequest() # StartMulticastGroupSessionRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_multicast_group_session(id, start_multicast_group_session_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_multicast_group_session:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_multicast_group_session: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **start_multicast_group_session_request** | [**StartMulticastGroupSessionRequest**](StartMulticastGroupSessionRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_single_wireless_device_import_task**
> StartSingleWirelessDeviceImportTaskResponse start_single_wireless_device_import_task(start_single_wireless_device_import_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Start import task for a single wireless device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_single_wireless_device_import_task_request import StartSingleWirelessDeviceImportTaskRequest
from openapi_client.models.start_single_wireless_device_import_task_response import StartSingleWirelessDeviceImportTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    start_single_wireless_device_import_task_request = openapi_client.StartSingleWirelessDeviceImportTaskRequest() # StartSingleWirelessDeviceImportTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_single_wireless_device_import_task(start_single_wireless_device_import_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_single_wireless_device_import_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_single_wireless_device_import_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_single_wireless_device_import_task_request** | [**StartSingleWirelessDeviceImportTaskRequest**](StartSingleWirelessDeviceImportTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**StartSingleWirelessDeviceImportTaskResponse**](StartSingleWirelessDeviceImportTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_wireless_device_import_task**
> StartWirelessDeviceImportTaskResponse start_wireless_device_import_task(start_wireless_device_import_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Start import task for provisioning Sidewalk devices in bulk using an S3 CSV file.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.start_wireless_device_import_task_request import StartWirelessDeviceImportTaskRequest
from openapi_client.models.start_wireless_device_import_task_response import StartWirelessDeviceImportTaskResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    start_wireless_device_import_task_request = openapi_client.StartWirelessDeviceImportTaskRequest() # StartWirelessDeviceImportTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.start_wireless_device_import_task(start_wireless_device_import_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->start_wireless_device_import_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->start_wireless_device_import_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_wireless_device_import_task_request** | [**StartWirelessDeviceImportTaskRequest**](StartWirelessDeviceImportTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**StartWirelessDeviceImportTaskResponse**](StartWirelessDeviceImportTaskResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **tag_resource**
> object tag_resource(resource_arn, tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Adds a tag to a resource.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.tag_resource_request import TagResourceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_arn = 'resource_arn_example' # str | The ARN of the resource to add tags to.
    tag_resource_request = openapi_client.TagResourceRequest() # TagResourceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.tag_resource(resource_arn, tag_resource_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->tag_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->tag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The ARN of the resource to add tags to. | 
 **tag_resource_request** | [**TagResourceRequest**](TagResourceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | ConflictException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |
**485** | TooManyTagsException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **test_wireless_device**
> TestWirelessDeviceResponse test_wireless_device(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Simulates a provisioned device by sending an uplink data payload of <code>Hello</code>.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.test_wireless_device_response import TestWirelessDeviceResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the wireless device to test.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.test_wireless_device(id, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->test_wireless_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->test_wireless_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the wireless device to test. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

[**TestWirelessDeviceResponse**](TestWirelessDeviceResponse.md)

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | ThrottlingException |  -  |
**483** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **untag_resource**
> object untag_resource(resource_arn, tag_keys, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Removes one or more tags from a resource.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_arn = 'resource_arn_example' # str | The ARN of the resource to remove tags from.
    tag_keys = ['tag_keys_example'] # List[str] | A list of the keys of the tags to remove from the resource.
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.untag_resource(resource_arn, tag_keys, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->untag_resource:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->untag_resource: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_arn** | **str**| The ARN of the resource to remove tags from. | 
 **tag_keys** | [**List[str]**](str.md)| A list of the keys of the tags to remove from the resource. | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | ConflictException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_destination**
> object update_destination(name, update_destination_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates properties of a destination.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_destination_request import UpdateDestinationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    name = 'name_example' # str | The new name of the resource.
    update_destination_request = openapi_client.UpdateDestinationRequest() # UpdateDestinationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_destination(name, update_destination_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_destination:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_destination: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **str**| The new name of the resource. | 
 **update_destination_request** | [**UpdateDestinationRequest**](UpdateDestinationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_event_configuration_by_resource_types**
> object update_event_configuration_by_resource_types(update_event_configuration_by_resource_types_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Update the event configuration based on resource types.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_event_configuration_by_resource_types_request import UpdateEventConfigurationByResourceTypesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    update_event_configuration_by_resource_types_request = openapi_client.UpdateEventConfigurationByResourceTypesRequest() # UpdateEventConfigurationByResourceTypesRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_event_configuration_by_resource_types(update_event_configuration_by_resource_types_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_event_configuration_by_resource_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_event_configuration_by_resource_types: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_event_configuration_by_resource_types_request** | [**UpdateEventConfigurationByResourceTypesRequest**](UpdateEventConfigurationByResourceTypesRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ThrottlingException |  -  |
**483** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_fuota_task**
> object update_fuota_task(id, update_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates properties of a FUOTA task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_fuota_task_request import UpdateFuotaTaskRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    update_fuota_task_request = openapi_client.UpdateFuotaTaskRequest() # UpdateFuotaTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_fuota_task(id, update_fuota_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_fuota_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_fuota_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **update_fuota_task_request** | [**UpdateFuotaTaskRequest**](UpdateFuotaTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_log_levels_by_resource_types**
> object update_log_levels_by_resource_types(update_log_levels_by_resource_types_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Set default log level, or log levels by resource types. This can be for wireless device log options or wireless gateways log options and is used to control the log messages that'll be displayed in CloudWatch.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_log_levels_by_resource_types_request import UpdateLogLevelsByResourceTypesRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    update_log_levels_by_resource_types_request = openapi_client.UpdateLogLevelsByResourceTypesRequest() # UpdateLogLevelsByResourceTypesRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_log_levels_by_resource_types(update_log_levels_by_resource_types_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_log_levels_by_resource_types:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_log_levels_by_resource_types: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **update_log_levels_by_resource_types_request** | [**UpdateLogLevelsByResourceTypesRequest**](UpdateLogLevelsByResourceTypesRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**480** | AccessDeniedException |  -  |
**481** | ConflictException |  -  |
**482** | InternalServerException |  -  |
**483** | ResourceNotFoundException |  -  |
**484** | ThrottlingException |  -  |
**485** | ValidationException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_multicast_group**
> object update_multicast_group(id, update_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates properties of a multicast group session.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_multicast_group_request import UpdateMulticastGroupRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | 
    update_multicast_group_request = openapi_client.UpdateMulticastGroupRequest() # UpdateMulticastGroupRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_multicast_group(id, update_multicast_group_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_multicast_group:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_multicast_group: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **update_multicast_group_request** | [**UpdateMulticastGroupRequest**](UpdateMulticastGroupRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | ConflictException |  -  |
**484** | InternalServerException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_network_analyzer_configuration**
> object update_network_analyzer_configuration(configuration_name, update_network_analyzer_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Update network analyzer configuration.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_network_analyzer_configuration_request import UpdateNetworkAnalyzerConfigurationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    configuration_name = 'configuration_name_example' # str | 
    update_network_analyzer_configuration_request = openapi_client.UpdateNetworkAnalyzerConfigurationRequest() # UpdateNetworkAnalyzerConfigurationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_network_analyzer_configuration(configuration_name, update_network_analyzer_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_network_analyzer_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_network_analyzer_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configuration_name** | **str**|  | 
 **update_network_analyzer_configuration_request** | [**UpdateNetworkAnalyzerConfigurationRequest**](UpdateNetworkAnalyzerConfigurationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_partner_account**
> object update_partner_account(partner_account_id, partner_type, update_partner_account_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates properties of a partner account.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_partner_account_request import UpdatePartnerAccountRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    partner_account_id = 'partner_account_id_example' # str | The ID of the partner account to update.
    partner_type = 'partner_type_example' # str | The partner type.
    update_partner_account_request = openapi_client.UpdatePartnerAccountRequest() # UpdatePartnerAccountRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_partner_account(partner_account_id, partner_type, update_partner_account_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_partner_account:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_partner_account: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **partner_account_id** | **str**| The ID of the partner account to update. | 
 **partner_type** | **str**| The partner type. | 
 **update_partner_account_request** | [**UpdatePartnerAccountRequest**](UpdatePartnerAccountRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | InternalServerException |  -  |
**483** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_position**
> object update_position(resource_identifier, resource_type, update_position_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



<p>Update the position information of a resource.</p> <important> <p>This action is no longer supported. Calls to update the position information should use the <a href=\"https://docs.aws.amazon.com/iot-wireless/2020-11-22/apireference/API_UpdateResourcePosition.html\">UpdateResourcePosition</a> API operation instead.</p> </important>

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_position_request import UpdatePositionRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | Resource identifier of the resource for which position is updated.
    resource_type = 'resource_type_example' # str | Resource type of the resource for which position is updated.
    update_position_request = openapi_client.UpdatePositionRequest() # UpdatePositionRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_position(resource_identifier, resource_type, update_position_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_position:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_position: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**| Resource identifier of the resource for which position is updated. | 
 **resource_type** | **str**| Resource type of the resource for which position is updated. | 
 **update_position_request** | [**UpdatePositionRequest**](UpdatePositionRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_resource_event_configuration**
> object update_resource_event_configuration(identifier, identifier_type, update_resource_event_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, partner_type=partner_type)



Update the event configuration for a particular resource identifier.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_resource_event_configuration_request import UpdateResourceEventConfigurationRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    identifier = 'identifier_example' # str | Resource identifier to opt in for event messaging.
    identifier_type = 'identifier_type_example' # str | Identifier type of the particular resource identifier for event configuration.
    update_resource_event_configuration_request = openapi_client.UpdateResourceEventConfigurationRequest() # UpdateResourceEventConfigurationRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)
    partner_type = 'partner_type_example' # str | Partner type of the resource if the identifier type is <code>PartnerAccountId</code>  (optional)

    try:
        api_response = api_instance.update_resource_event_configuration(identifier, identifier_type, update_resource_event_configuration_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers, partner_type=partner_type)
        print("The response of DefaultApi->update_resource_event_configuration:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_resource_event_configuration: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Resource identifier to opt in for event messaging. | 
 **identifier_type** | **str**| Identifier type of the particular resource identifier for event configuration. | 
 **update_resource_event_configuration_request** | [**UpdateResourceEventConfigurationRequest**](UpdateResourceEventConfigurationRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 
 **partner_type** | **str**| Partner type of the resource if the identifier type is &lt;code&gt;PartnerAccountId&lt;/code&gt;  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ConflictException |  -  |
**483** | ThrottlingException |  -  |
**484** | ResourceNotFoundException |  -  |
**485** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_resource_position**
> object update_resource_position(resource_identifier, resource_type, update_resource_position_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Update the position information of a given wireless device or a wireless gateway resource. The position coordinates are based on the <a href=\"https://gisgeography.com/wgs84-world-geodetic-system/\"> World Geodetic System (WGS84)</a>.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_resource_position_request import UpdateResourcePositionRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    resource_identifier = 'resource_identifier_example' # str | The identifier of the resource for which position information is updated. It can be the wireless device ID or the wireless gateway ID, depending on the resource type.
    resource_type = 'resource_type_example' # str | The type of resource for which position information is updated, which can be a wireless device or a wireless gateway.
    update_resource_position_request = openapi_client.UpdateResourcePositionRequest() # UpdateResourcePositionRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_resource_position(resource_identifier, resource_type, update_resource_position_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_resource_position:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_resource_position: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resource_identifier** | **str**| The identifier of the resource for which position information is updated. It can be the wireless device ID or the wireless gateway ID, depending on the resource type. | 
 **resource_type** | **str**| The type of resource for which position information is updated, which can be a wireless device or a wireless gateway. | 
 **update_resource_position_request** | [**UpdateResourcePositionRequest**](UpdateResourcePositionRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | ThrottlingException |  -  |
**484** | InternalServerException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_wireless_device**
> object update_wireless_device(id, update_wireless_device_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates properties of a wireless device.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_wireless_device_request import UpdateWirelessDeviceRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    update_wireless_device_request = openapi_client.UpdateWirelessDeviceRequest() # UpdateWirelessDeviceRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_wireless_device(id, update_wireless_device_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_wireless_device:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_wireless_device: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **update_wireless_device_request** | [**UpdateWirelessDeviceRequest**](UpdateWirelessDeviceRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_wireless_device_import_task**
> object update_wireless_device_import_task(id, update_wireless_device_import_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Update an import task to add more devices to the task.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_wireless_device_import_task_request import UpdateWirelessDeviceImportTaskRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The identifier of the import task to be updated.
    update_wireless_device_import_task_request = openapi_client.UpdateWirelessDeviceImportTaskRequest() # UpdateWirelessDeviceImportTaskRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_wireless_device_import_task(id, update_wireless_device_import_task_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_wireless_device_import_task:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_wireless_device_import_task: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The identifier of the import task to be updated. | 
 **update_wireless_device_import_task_request** | [**UpdateWirelessDeviceImportTaskRequest**](UpdateWirelessDeviceImportTaskRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | AccessDeniedException |  -  |
**482** | ResourceNotFoundException |  -  |
**483** | InternalServerException |  -  |
**484** | ConflictException |  -  |
**485** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_wireless_gateway**
> object update_wireless_gateway(id, update_wireless_gateway_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)



Updates properties of a wireless gateway.

### Example

* Api Key Authentication (hmac):

```python
import openapi_client
from openapi_client.models.update_wireless_gateway_request import UpdateWirelessGatewayRequest
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://api.iotwireless.us-east-1.amazonaws.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://api.iotwireless.us-east-1.amazonaws.com"
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
    id = 'id_example' # str | The ID of the resource to update.
    update_wireless_gateway_request = openapi_client.UpdateWirelessGatewayRequest() # UpdateWirelessGatewayRequest | 
    x_amz_content_sha256 = 'x_amz_content_sha256_example' # str |  (optional)
    x_amz_date = 'x_amz_date_example' # str |  (optional)
    x_amz_algorithm = 'x_amz_algorithm_example' # str |  (optional)
    x_amz_credential = 'x_amz_credential_example' # str |  (optional)
    x_amz_security_token = 'x_amz_security_token_example' # str |  (optional)
    x_amz_signature = 'x_amz_signature_example' # str |  (optional)
    x_amz_signed_headers = 'x_amz_signed_headers_example' # str |  (optional)

    try:
        api_response = api_instance.update_wireless_gateway(id, update_wireless_gateway_request, x_amz_content_sha256=x_amz_content_sha256, x_amz_date=x_amz_date, x_amz_algorithm=x_amz_algorithm, x_amz_credential=x_amz_credential, x_amz_security_token=x_amz_security_token, x_amz_signature=x_amz_signature, x_amz_signed_headers=x_amz_signed_headers)
        print("The response of DefaultApi->update_wireless_gateway:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->update_wireless_gateway: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the resource to update. | 
 **update_wireless_gateway_request** | [**UpdateWirelessGatewayRequest**](UpdateWirelessGatewayRequest.md)|  | 
 **x_amz_content_sha256** | **str**|  | [optional] 
 **x_amz_date** | **str**|  | [optional] 
 **x_amz_algorithm** | **str**|  | [optional] 
 **x_amz_credential** | **str**|  | [optional] 
 **x_amz_security_token** | **str**|  | [optional] 
 **x_amz_signature** | **str**|  | [optional] 
 **x_amz_signed_headers** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[hmac](../README.md#hmac)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Success |  -  |
**480** | ValidationException |  -  |
**481** | ResourceNotFoundException |  -  |
**482** | AccessDeniedException |  -  |
**483** | InternalServerException |  -  |
**484** | ThrottlingException |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

