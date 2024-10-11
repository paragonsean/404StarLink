# ReposUpdateWebhookRequestConfig

Key/value pairs to provide settings for this webhook. [These are defined below](https://docs.github.com/enterprise-server@3.4/rest/reference/repos#create-hook-config-params).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** |  | [optional] 
**content_type** | **str** | The media type used to serialize the payloads. Supported values include &#x60;json&#x60; and &#x60;form&#x60;. The default is &#x60;form&#x60;. | [optional] 
**insecure_ssl** | [**WebhookConfigInsecureSsl**](WebhookConfigInsecureSsl.md) |  | [optional] 
**room** | **str** |  | [optional] 
**secret** | **str** | If provided, the &#x60;secret&#x60; will be used as the &#x60;key&#x60; to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads/#delivery-headers). | [optional] 
**url** | **str** | The URL to which the payloads will be delivered. | 

## Example

```python
from openapi_client.models.repos_update_webhook_request_config import ReposUpdateWebhookRequestConfig

# TODO update the JSON string below
json = "{}"
# create an instance of ReposUpdateWebhookRequestConfig from a JSON string
repos_update_webhook_request_config_instance = ReposUpdateWebhookRequestConfig.from_json(json)
# print the JSON string representation of the object
print(ReposUpdateWebhookRequestConfig.to_json())

# convert the object into a dict
repos_update_webhook_request_config_dict = repos_update_webhook_request_config_instance.to_dict()
# create an instance of ReposUpdateWebhookRequestConfig from a dict
repos_update_webhook_request_config_from_dict = ReposUpdateWebhookRequestConfig.from_dict(repos_update_webhook_request_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


