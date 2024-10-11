# EnterpriseAdminCreateGlobalWebhookRequestConfig

Key/value pairs to provide settings for this webhook.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | **str** | The media type used to serialize the payloads. Supported values include &#x60;json&#x60; and &#x60;form&#x60;. The default is &#x60;form&#x60;. | [optional] 
**insecure_ssl** | **str** | Determines whether the SSL certificate of the host for &#x60;url&#x60; will be verified when delivering payloads. Supported values include &#x60;0&#x60; (verification is performed) and &#x60;1&#x60; (verification is not performed). The default is &#x60;0&#x60;. **We strongly recommend not setting this to &#x60;1&#x60; as you are subject to man-in-the-middle and other attacks.** | [optional] 
**secret** | **str** | If provided, the &#x60;secret&#x60; will be used as the &#x60;key&#x60; to generate the HMAC hex digest value in the [&#x60;X-Hub-Signature&#x60;](https://docs.github.com/enterprise-server@3.4/webhooks/event-payloads/#delivery-headers) header. | [optional] 
**url** | **str** | The URL to which the payloads will be delivered. | 

## Example

```python
from openapi_client.models.enterprise_admin_create_global_webhook_request_config import EnterpriseAdminCreateGlobalWebhookRequestConfig

# TODO update the JSON string below
json = "{}"
# create an instance of EnterpriseAdminCreateGlobalWebhookRequestConfig from a JSON string
enterprise_admin_create_global_webhook_request_config_instance = EnterpriseAdminCreateGlobalWebhookRequestConfig.from_json(json)
# print the JSON string representation of the object
print(EnterpriseAdminCreateGlobalWebhookRequestConfig.to_json())

# convert the object into a dict
enterprise_admin_create_global_webhook_request_config_dict = enterprise_admin_create_global_webhook_request_config_instance.to_dict()
# create an instance of EnterpriseAdminCreateGlobalWebhookRequestConfig from a dict
enterprise_admin_create_global_webhook_request_config_from_dict = EnterpriseAdminCreateGlobalWebhookRequestConfig.from_dict(enterprise_admin_create_global_webhook_request_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


