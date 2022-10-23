# WebhookConfig

WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger's webhook URL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secret** | **str** | Required. Resource name for the secret required as a URL parameter. | [optional] 
**state** | **str** | Potential issues with the underlying Pub/Sub subscription configuration. Only populated on get requests. | [optional] 

## Example

```python
from openapi_client.models.webhook_config import WebhookConfig

# TODO update the JSON string below
json = "{}"
# create an instance of WebhookConfig from a JSON string
webhook_config_instance = WebhookConfig.from_json(json)
# print the JSON string representation of the object
print(WebhookConfig.to_json())

# convert the object into a dict
webhook_config_dict = webhook_config_instance.to_dict()
# create an instance of WebhookConfig from a dict
webhook_config_from_dict = WebhookConfig.from_dict(webhook_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


