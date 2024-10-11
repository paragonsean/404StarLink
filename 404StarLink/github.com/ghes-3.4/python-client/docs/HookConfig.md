# HookConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** | The media type used to serialize the payloads. Supported values include &#x60;json&#x60; and &#x60;form&#x60;. The default is &#x60;form&#x60;. | [optional] 
**digest** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**insecure_ssl** | [**WebhookConfigInsecureSsl**](WebhookConfigInsecureSsl.md) |  | [optional] 
**password** | **str** |  | [optional] 
**room** | **str** |  | [optional] 
**secret** | **str** | If provided, the &#x60;secret&#x60; will be used as the &#x60;key&#x60; to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads/#delivery-headers). | [optional] 
**subdomain** | **str** |  | [optional] 
**token** | **str** |  | [optional] 
**url** | **str** | The URL to which the payloads will be delivered. | [optional] 

## Example

```python
from openapi_client.models.hook_config import HookConfig

# TODO update the JSON string below
json = "{}"
# create an instance of HookConfig from a JSON string
hook_config_instance = HookConfig.from_json(json)
# print the JSON string representation of the object
print(HookConfig.to_json())

# convert the object into a dict
hook_config_dict = hook_config_instance.to_dict()
# create an instance of HookConfig from a dict
hook_config_from_dict = HookConfig.from_dict(hook_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


